package androidx.mediarouter.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import androidx.emoji2.text.C0925o;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import p093e1.C1520e;

/* JADX INFO: renamed from: androidx.mediarouter.app.p */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC1047p extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public final Bitmap f4593a;

    /* JADX INFO: renamed from: b */
    public final Uri f4594b;

    /* JADX INFO: renamed from: c */
    public int f4595c;

    /* JADX INFO: renamed from: d */
    public long f4596d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ DialogC1051t f4597e;

    public AsyncTaskC1047p(DialogC1051t dialogC1051t) {
        this.f4597e = dialogC1051t;
        MediaDescriptionCompat mediaDescriptionCompat = dialogC1051t.f4635b0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.f3622k;
        if (bitmap != null && bitmap.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            bitmap = null;
        }
        this.f4593a = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = dialogC1051t.f4635b0;
        this.f4594b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f3623l : null;
    }

    /* JADX INFO: renamed from: a */
    public final BufferedInputStream m2645a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            inputStreamOpenInputStream = this.f4597e.f4652p.getContentResolver().openInputStream(uri);
        } else {
            URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
            int i3 = DialogC1051t.f4607v0;
            uRLConnectionOpenConnection.setConnectTimeout(i3);
            uRLConnectionOpenConnection.setReadTimeout(i3);
            inputStreamOpenInputStream = uRLConnectionOpenConnection.getInputStream();
        }
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        return new BufferedInputStream(inputStreamOpenInputStream);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x002f: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:48), block:B:14:0x002f */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) throws Throwable {
        InputStream inputStream;
        BufferedInputStream bufferedInputStreamM2645a;
        InputStream inputStream2 = null;
        Bitmap bitmapDecodeStream = this.f4593a;
        if (bitmapDecodeStream == null) {
            Uri uri = this.f4594b;
            try {
                if (uri != null) {
                    try {
                        bufferedInputStreamM2645a = m2645a(uri);
                        try {
                            try {
                                if (bufferedInputStreamM2645a == null) {
                                    Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri);
                                    if (bufferedInputStreamM2645a == null) {
                                        return null;
                                    }
                                } else {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    BitmapFactory.decodeStream(bufferedInputStreamM2645a, null, options);
                                    if (options.outWidth != 0 && options.outHeight != 0) {
                                        try {
                                            bufferedInputStreamM2645a.reset();
                                        } catch (IOException unused) {
                                            bufferedInputStreamM2645a.close();
                                            bufferedInputStreamM2645a = m2645a(uri);
                                            if (bufferedInputStreamM2645a == null) {
                                                Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri);
                                                if (bufferedInputStreamM2645a == null) {
                                                    return null;
                                                }
                                            }
                                            bufferedInputStreamM2645a.close();
                                            return null;
                                        }
                                        options.inJustDecodeBounds = false;
                                        options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / this.f4597e.m2657m(options.outWidth, options.outHeight)));
                                        if (isCancelled()) {
                                            bufferedInputStreamM2645a.close();
                                            return null;
                                        }
                                        bitmapDecodeStream = BitmapFactory.decodeStream(bufferedInputStreamM2645a, null, options);
                                        try {
                                            bufferedInputStreamM2645a.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                }
                                bufferedInputStreamM2645a.close();
                                return null;
                            } catch (IOException unused3) {
                                return null;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri, e);
                            if (bufferedInputStreamM2645a != null) {
                                try {
                                    bufferedInputStreamM2645a.close();
                                } catch (IOException unused4) {
                                }
                            }
                            bitmapDecodeStream = null;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        bufferedInputStreamM2645a = null;
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException unused5) {
                            }
                        }
                        throw th;
                    }
                } else {
                    bitmapDecodeStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
            }
        }
        if (bitmapDecodeStream != null && bitmapDecodeStream.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't use recycled bitmap: " + bitmapDecodeStream);
            return null;
        }
        if (bitmapDecodeStream != null && bitmapDecodeStream.getWidth() < bitmapDecodeStream.getHeight()) {
            C0925o c0925o = new C0925o(bitmapDecodeStream);
            c0925o.f4017a = 1;
            ArrayList arrayList = c0925o.m2413a().f6863a;
            this.f4595c = Collections.unmodifiableList(arrayList).isEmpty() ? 0 : ((C1520e) Collections.unmodifiableList(arrayList).get(0)).f6856d;
        }
        return bitmapDecodeStream;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        DialogC1051t dialogC1051t = this.f4597e;
        dialogC1051t.f4636c0 = null;
        Bitmap bitmap2 = dialogC1051t.f4637d0;
        Bitmap bitmap3 = this.f4593a;
        boolean zEquals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.f4594b;
        if (zEquals && Objects.equals(dialogC1051t.f4638e0, uri)) {
            return;
        }
        dialogC1051t.f4637d0 = bitmap3;
        dialogC1051t.f4640g0 = bitmap;
        dialogC1051t.f4638e0 = uri;
        dialogC1051t.f4641h0 = this.f4595c;
        dialogC1051t.f4639f0 = true;
        dialogC1051t.m2661r(SystemClock.uptimeMillis() - this.f4596d > 120);
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        this.f4596d = SystemClock.uptimeMillis();
        DialogC1051t dialogC1051t = this.f4597e;
        dialogC1051t.f4639f0 = false;
        dialogC1051t.f4640g0 = null;
        dialogC1051t.f4641h0 = 0;
    }
}
