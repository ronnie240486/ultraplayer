package p034L1;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p046P1.InterfaceC0489q;
import p063V1.BinderC0630b;
import p079a2.AbstractBinderC0852a;
import p079a2.AbstractC0853b;

/* JADX INFO: renamed from: L1.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0356k extends AbstractBinderC0852a implements InterfaceC0489q {

    /* JADX INFO: renamed from: c */
    public final int f1149c;

    public AbstractBinderC0356k(byte[] bArr) {
        super(0, "com.google.android.gms.common.internal.ICertData");
        if (bArr.length != 25) {
            throw new IllegalArgumentException();
        }
        this.f1149c = Arrays.hashCode(bArr);
    }

    /* JADX INFO: renamed from: v0 */
    public static byte[] m999v0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e3) {
            throw new AssertionError(e3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof InterfaceC0489q)) {
            try {
                InterfaceC0489q interfaceC0489q = (InterfaceC0489q) obj;
                if (((AbstractBinderC0356k) interfaceC0489q).f1149c == this.f1149c) {
                    return Arrays.equals(mo998w0(), (byte[]) BinderC0630b.m1559w0(new BinderC0630b(((AbstractBinderC0356k) interfaceC0489q).mo998w0())));
                }
            } catch (RemoteException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1149c;
    }

    @Override // p079a2.AbstractBinderC0852a
    /* JADX INFO: renamed from: u0 */
    public final boolean mo648u0(int i3, Parcel parcel, Parcel parcel2) {
        if (i3 == 1) {
            BinderC0630b binderC0630b = new BinderC0630b(mo998w0());
            parcel2.writeNoException();
            AbstractC0853b.m2116c(parcel2, binderC0630b);
            return true;
        }
        if (i3 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f1149c);
        return true;
    }

    /* JADX INFO: renamed from: w0 */
    public abstract byte[] mo998w0();
}
