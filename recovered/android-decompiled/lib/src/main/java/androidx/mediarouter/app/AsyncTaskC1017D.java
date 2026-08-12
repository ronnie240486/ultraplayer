package androidx.mediarouter.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import androidx.emoji2.text.C0925o;
import com.zuxoplayer.app.R;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import p093e1.C1520e;

/* JADX INFO: renamed from: androidx.mediarouter.app.D */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC1017D extends AsyncTask {

    /* JADX INFO: renamed from: a */
    public final Bitmap f4413a;

    /* JADX INFO: renamed from: b */
    public final Uri f4414b;

    /* JADX INFO: renamed from: c */
    public int f4415c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ DialogC1028O f4416d;

    public AsyncTaskC1017D(DialogC1028O dialogC1028O) {
        this.f4416d = dialogC1028O;
        MediaDescriptionCompat mediaDescriptionCompat = dialogC1028O.f4488R;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.f3622k;
        if (bitmap != null && bitmap.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            bitmap = null;
        }
        this.f4413a = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = dialogC1028O.f4488R;
        this.f4414b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f3623l : null;
    }

    /* JADX INFO: renamed from: a */
    public final BufferedInputStream m2598a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            inputStreamOpenInputStream = this.f4416d.f4504t.getContentResolver().openInputStream(uri);
        } else {
            URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(30000);
            uRLConnectionOpenConnection.setReadTimeout(30000);
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
        BufferedInputStream bufferedInputStreamM2598a;
        InputStream inputStream2 = null;
        Bitmap bitmapDecodeStream = this.f4413a;
        if (bitmapDecodeStream == null) {
            Uri uri = this.f4414b;
            try {
                if (uri != null) {
                    try {
                        bufferedInputStreamM2598a = m2598a(uri);
                        try {
                            try {
                                if (bufferedInputStreamM2598a == null) {
                                    Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri);
                                    if (bufferedInputStreamM2598a == null) {
                                        return null;
                                    }
                                } else {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    BitmapFactory.decodeStream(bufferedInputStreamM2598a, null, options);
                                    if (options.outWidth != 0 && options.outHeight != 0) {
                                        try {
                                            bufferedInputStreamM2598a.reset();
                                        } catch (IOException unused) {
                                            bufferedInputStreamM2598a.close();
                                            bufferedInputStreamM2598a = m2598a(uri);
                                            if (bufferedInputStreamM2598a == null) {
                                                Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri);
                                                if (bufferedInputStreamM2598a == null) {
                                                    return null;
                                                }
                                            }
                                            bufferedInputStreamM2598a.close();
                                            return null;
                                        }
                                        options.inJustDecodeBounds = false;
                                        options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / this.f4416d.f4504t.getResources().getDimensionPixelSize(R.dimen.mr_cast_meta_art_size)));
                                        if (isCancelled()) {
                                            bufferedInputStreamM2598a.close();
                                            return null;
                                        }
                                        bitmapDecodeStream = BitmapFactory.decodeStream(bufferedInputStreamM2598a, null, options);
                                        try {
                                            bufferedInputStreamM2598a.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                }
                                bufferedInputStreamM2598a.close();
                                return null;
                            } catch (IOException unused3) {
                                return null;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri, e);
                            if (bufferedInputStreamM2598a != null) {
                                try {
                                    bufferedInputStreamM2598a.close();
                                } catch (IOException unused4) {
                                }
                            }
                            bitmapDecodeStream = null;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        bufferedInputStreamM2598a = null;
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
            this.f4415c = Collections.unmodifiableList(arrayList).isEmpty() ? 0 : ((C1520e) Collections.unmodifiableList(arrayList).get(0)).f6856d;
        }
        return bitmapDecodeStream;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        DialogC1028O dialogC1028O = this.f4416d;
        dialogC1028O.f4489S = null;
        Bitmap bitmap2 = dialogC1028O.f4490T;
        Bitmap bitmap3 = this.f4413a;
        boolean zEquals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.f4414b;
        if (zEquals && Objects.equals(dialogC1028O.f4491U, uri)) {
            return;
        }
        dialogC1028O.f4490T = bitmap3;
        dialogC1028O.f4493W = bitmap;
        dialogC1028O.f4491U = uri;
        dialogC1028O.f4494X = this.f4415c;
        dialogC1028O.f4492V = true;
        dialogC1028O.m2625m();
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        DialogC1028O dialogC1028O = this.f4416d;
        dialogC1028O.f4492V = false;
        dialogC1028O.f4493W = null;
        dialogC1028O.f4494X = 0;
    }
}
