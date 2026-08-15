package com.ultraplayer.app;

import android.app.Activity;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.zip.ZipFile;

/** Download and validation layer for the user-confirmed in-app APK update. */
public final class ApkUpdateManager {
    private static final long MAX_APK_BYTES = 120L * 1024L * 1024L;

    public interface Callback {
        void onProgress(int percent);
        void onDownloaded(File apk);
        void onAlreadyLatest(String message);
        void onPermissionRequired(File apk);
        void onError(String message);
    }

    private ApkUpdateManager() { }

    public static void download(Activity activity, String rawUrl, Callback callback) {
        final String url = rawUrl == null ? "" : rawUrl.trim();
        new Thread(() -> {
            File target = null;
            HttpURLConnection connection = null;
            try {
                URL parsed = new URL(url);
                if (!"https".equalsIgnoreCase(parsed.getProtocol())) {
                    throw new IOException("O link de atualização precisa usar HTTPS.");
                }
                connection = (HttpURLConnection) parsed.openConnection();
                connection.setInstanceFollowRedirects(true);
                connection.setConnectTimeout(30_000);
                connection.setReadTimeout(90_000);
                connection.setUseCaches(false);
                connection.setRequestProperty("Accept", "application/vnd.android.package-archive");
                connection.setRequestProperty("Cache-Control", "no-cache, no-store");
                connection.setRequestProperty("Pragma", "no-cache");
                connection.setRequestProperty("User-Agent", "UltraPlayer-Updater/1.0");
                connection.connect();
                if (connection.getResponseCode() < 200 || connection.getResponseCode() >= 300) {
                    throw new IOException("O servidor respondeu HTTP " + connection.getResponseCode() + ".");
                }
                if (!"https".equalsIgnoreCase(connection.getURL().getProtocol())) {
                    throw new IOException("O redirecionamento final não usa HTTPS.");
                }
                String contentType = connection.getContentType() == null ? "" : connection.getContentType().toLowerCase(java.util.Locale.US);
                if (contentType.startsWith("text/html") || contentType.contains("text/html")) {
                    throw new IOException("O link configurado aponta para uma página HTML, não para um APK direto. Use a URL do arquivo .apk.");
                }

                File dir = activity.getExternalFilesDir(null);
                if (dir == null) throw new IOException("Diretório privado indisponível.");
                if (!dir.exists() && !dir.mkdirs()) throw new IOException("Não foi possível criar o diretório privado.");
                File part = new File(dir, "ultraplayer-update.apk.part");
                target = new File(dir, "ultraplayer-update.apk");
                if (part.exists() && !part.delete()) throw new IOException("Não foi possível limpar o download anterior.");
                if (target.exists() && !target.delete()) throw new IOException("Não foi possível substituir o download anterior.");

                long expected = connection.getContentLengthLong();
                if (expected > MAX_APK_BYTES) throw new IOException("O APK excede o limite de 120 MB.");
                try (BufferedInputStream in = new BufferedInputStream(connection.getInputStream());
                     BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(part))) {
                    byte[] buffer = new byte[16 * 1024];
                    long total = 0L;
                    int read;
                    int last = -1;
                    while ((read = in.read(buffer)) != -1) {
                        total += read;
                        if (total > MAX_APK_BYTES) throw new IOException("O APK excede o limite de 120 MB.");
                        out.write(buffer, 0, read);
                        int percent = expected > 0 ? (int) Math.min(100L, (total * 100L) / expected) : -1;
                        if (percent != last) {
                            last = percent;
                            final int progress = percent;
                            post(activity, () -> callback.onProgress(progress));
                        }
                    }
                }
                if (!part.renameTo(target)) throw new IOException("Não foi possível finalizar o APK baixado.");
                validateArchive(target);
                PackageInfo downloaded = readPackage(activity, target);
                PackageInfo installed = readInstalledPackage(activity);
                validateIdentityAndVersion(activity, downloaded, installed);
                final File finishedApk = target;
                post(activity, () -> callback.onDownloaded(finishedApk));
            } catch (AlreadyLatestException error) {
                if (target != null && target.exists()) {
                    //noinspection ResultOfMethodCallIgnored
                    target.delete();
                }
                final String message = error.getMessage() == null ? "O aplicativo já está atualizado." : error.getMessage();
                post(activity, () -> callback.onAlreadyLatest(message));
            } catch (Throwable error) {
                if (target != null && target.exists()) {
                    // Um pacote incompleto ou inválido não deve permanecer como update.apk.
                    // A remoção falhar não altera o resultado exibido ao usuário.
                    //noinspection ResultOfMethodCallIgnored
                    target.delete();
                }
                final String message = error.getMessage() == null ? "Não foi possível atualizar o aplicativo." : error.getMessage();
                post(activity, () -> callback.onError(message));
            } finally {
                if (connection != null) connection.disconnect();
            }
        }, "UltraPlayer-ApkUpdate").start();
    }

    private static void post(Activity activity, Runnable runnable) {
        if (activity != null && !activity.isFinishing()) activity.runOnUiThread(runnable);
    }

    private static void validateArchive(File apk) throws IOException {
        if (apk == null || !apk.isFile() || apk.length() < 4) throw new IOException("Arquivo APK vazio ou incompleto.");
        try (FileInputStream in = new FileInputStream(apk)) {
            int p = in.read(), k = in.read(), a = in.read(), b = in.read();
            if (p == '<' || k == '!' || a == 'D' || b == 'O') throw new IOException("O link retornou uma página HTML, não um APK direto. Use a URL do arquivo .apk.");
            if (p != 'P' || k != 'K' || a != 3 || b != 4) throw new IOException("O arquivo baixado não é um APK ZIP válido.");
        }
        try (ZipFile zip = new ZipFile(apk)) {
            if (zip.getEntry("AndroidManifest.xml") == null) throw new IOException("O APK não contém AndroidManifest.xml.");
        }
    }

    private static PackageInfo readPackage(Activity activity, File apk) throws IOException {
        PackageManager pm = activity.getPackageManager();
        int flags = Build.VERSION.SDK_INT >= 28 ? PackageManager.GET_SIGNING_CERTIFICATES : PackageManager.GET_SIGNATURES;
        PackageInfo info = pm.getPackageArchiveInfo(apk.getAbsolutePath(), flags);
        if (info == null) throw new IOException("Não foi possível ler o pacote do APK.");
        if (info.applicationInfo != null) {
            info.applicationInfo.sourceDir = apk.getAbsolutePath();
            info.applicationInfo.publicSourceDir = apk.getAbsolutePath();
        }
        return info;
    }

    private static PackageInfo readInstalledPackage(Activity activity) throws IOException {
        try {
            int flags = Build.VERSION.SDK_INT >= 28 ? PackageManager.GET_SIGNING_CERTIFICATES : PackageManager.GET_SIGNATURES;
            return activity.getPackageManager().getPackageInfo(activity.getPackageName(), flags);
        } catch (PackageManager.NameNotFoundException e) {
            throw new IOException("Não foi possível ler a versão instalada.");
        }
    }

    private static void validateIdentityAndVersion(Activity activity, PackageInfo downloaded, PackageInfo installed) throws IOException {
        if (!activity.getPackageName().equals(downloaded.packageName)) throw new IOException("O APK pertence a outro aplicativo.");
        long newCode = Build.VERSION.SDK_INT >= 28 ? downloaded.getLongVersionCode() : downloaded.versionCode;
        long oldCode = Build.VERSION.SDK_INT >= 28 ? installed.getLongVersionCode() : installed.versionCode;
        if (newCode <= oldCode) throw new AlreadyLatestException("O APK encontrado não é mais novo que a versão instalada.");
        if (!sameSignature(downloaded, installed)) throw new IOException("A assinatura do APK é diferente da instalada.");
    }

    private static boolean sameSignature(PackageInfo a, PackageInfo b) {
        Signature[] left;
        Signature[] right;
        if (Build.VERSION.SDK_INT >= 28) {
            if (a.signingInfo == null || b.signingInfo == null) return false;
            left = a.signingInfo.hasMultipleSigners() ? a.signingInfo.getApkContentsSigners() : a.signingInfo.getSigningCertificateHistory();
            right = b.signingInfo.hasMultipleSigners() ? b.signingInfo.getApkContentsSigners() : b.signingInfo.getSigningCertificateHistory();
        } else {
            left = a.signatures;
            right = b.signatures;
        }
        if (left == null || right == null || left.length == 0 || right.length == 0) return false;
        return Arrays.equals(left, right);
    }

    private static final class AlreadyLatestException extends IOException {
        AlreadyLatestException(String message) { super(message); }
    }
}
