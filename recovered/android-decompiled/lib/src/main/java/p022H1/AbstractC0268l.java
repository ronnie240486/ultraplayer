package p022H1;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import p019G1.C0229d;
import p019G1.C0247v;
import p028J1.C0296b;

/* JADX INFO: renamed from: H1.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0268l {

    /* JADX INFO: renamed from: a */
    public static final C0296b f725a = new C0296b("MediaSessionUtils", null);

    /* JADX INFO: renamed from: a */
    public static ArrayList m814a(C0247v c0247v) {
        try {
            Parcel parcelM1895q0 = c0247v.m1895q0(c0247v.m1894e0(), 3);
            ArrayList arrayListCreateTypedArrayList = parcelM1895q0.createTypedArrayList(C0229d.CREATOR);
            parcelM1895q0.recycle();
            return arrayListCreateTypedArrayList;
        } catch (RemoteException e3) {
            Object[] objArr = {"getNotificationActions", C0247v.class.getSimpleName()};
            C0296b c0296b = f725a;
            Log.e(c0296b.f788a, c0296b.m833d("Unable to call %s on %s.", objArr), e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int[] m815b(C0247v c0247v) {
        try {
            Parcel parcelM1895q0 = c0247v.m1895q0(c0247v.m1894e0(), 4);
            int[] iArrCreateIntArray = parcelM1895q0.createIntArray();
            parcelM1895q0.recycle();
            return iArrCreateIntArray;
        } catch (RemoteException e3) {
            Object[] objArr = {"getCompactViewActionIndices", C0247v.class.getSimpleName()};
            C0296b c0296b = f725a;
            Log.e(c0296b.f788a, c0296b.m833d("Unable to call %s on %s.", objArr), e3);
            return null;
        }
    }
}
