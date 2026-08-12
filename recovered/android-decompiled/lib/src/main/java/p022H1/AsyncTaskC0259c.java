package p022H1;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.AbstractC1267d;
import com.google.android.gms.internal.cast.AbstractC1339v;
import com.google.android.gms.internal.cast.C1275f;
import p016F1.BinderC0176B;
import p016F1.C0188e;
import p028J1.C0296b;
import p063V1.BinderC0630b;

/* JADX INFO: renamed from: H1.c */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC0259c extends AsyncTask {

    /* JADX INFO: renamed from: c */
    public static final C0296b f668c = new C0296b("FetchBitmapTask", null);

    /* JADX INFO: renamed from: a */
    public final InterfaceC0262f f669a;

    /* JADX INFO: renamed from: b */
    public final C0258b f670b;

    public AsyncTaskC0259c(Context context, int i3, int i4, C0258b c0258b) {
        InterfaceC0262f interfaceC0262fM3249A0;
        this.f670b = c0258b;
        Context applicationContext = context.getApplicationContext();
        BinderC0176B binderC0176B = new BinderC0176B(this);
        C0296b c0296b = AbstractC1267d.f5825a;
        try {
            C1275f c1275fM3244b = AbstractC1267d.m3244b(applicationContext.getApplicationContext());
            BinderC0630b binderC0630b = new BinderC0630b(applicationContext.getApplicationContext());
            Parcel parcelM1895q0 = c1275fM3244b.m1895q0(c1275fM3244b.m1894e0(), 8);
            int i5 = parcelM1895q0.readInt();
            parcelM1895q0.recycle();
            interfaceC0262fM3249A0 = i5 >= 233700000 ? c1275fM3244b.m3249A0(binderC0630b, new BinderC0630b(this), binderC0176B, i3, i4) : c1275fM3244b.m3253z0(new BinderC0630b(this), binderC0176B, i3, i4);
        } catch (C0188e | RemoteException e3) {
            AbstractC1267d.f5825a.m830a(e3, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", C1275f.class.getSimpleName());
            interfaceC0262fM3249A0 = null;
        }
        this.f669a = interfaceC0262fM3249A0;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        InterfaceC0262f interfaceC0262f;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length != 1 || (uri = uriArr[0]) == null || (interfaceC0262f = this.f669a) == null) {
            return null;
        }
        try {
            C0260d c0260d = (C0260d) interfaceC0262f;
            Parcel parcelM1894e0 = c0260d.m1894e0();
            AbstractC1339v.m3421c(parcelM1894e0, uri);
            Parcel parcelM1895q0 = c0260d.m1895q0(parcelM1894e0, 1);
            Bitmap bitmap = (Bitmap) AbstractC1339v.m3419a(parcelM1895q0, Bitmap.CREATOR);
            parcelM1895q0.recycle();
            return bitmap;
        } catch (RemoteException e3) {
            f668c.m830a(e3, "Unable to call %s on %s.", "doFetch", InterfaceC0262f.class.getSimpleName());
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C0258b c0258b = this.f670b;
        if (c0258b != null) {
            InterfaceC0257a interfaceC0257a = (InterfaceC0257a) c0258b.f667l;
            if (interfaceC0257a != null) {
                interfaceC0257a.mo521i(bitmap);
            }
            c0258b.f666k = null;
        }
    }
}
