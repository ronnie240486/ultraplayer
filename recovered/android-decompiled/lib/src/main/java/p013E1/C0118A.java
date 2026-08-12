package p013E1;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.AbstractC1339v;
import java.util.HashMap;
import p028J1.C0300f;
import p028J1.C0319y;
import p040N1.InterfaceC0430k;
import p046P1.AbstractC0491s;
import p097f2.C1560d;

/* JADX INFO: renamed from: E1.A */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0118A implements InterfaceC0430k {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f162g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0125H f163h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f164i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f165j;

    public /* synthetic */ C0118A(C0125H c0125h, String str, String str2, int i3) {
        this.f162g = i3;
        this.f163h = c0125h;
        this.f164i = str;
        this.f165j = str2;
    }

    @Override // p040N1.InterfaceC0430k
    /* JADX INFO: renamed from: m */
    public final void mo165m(Object obj, Object obj2) {
        switch (this.f162g) {
            case 0:
                C0319y c0319y = (C0319y) obj;
                C1560d c1560d = (C1560d) obj2;
                C0125H c0125h = this.f163h;
                AbstractC0491s.m1215g("Not connected to device", c0125h.f187E == 2);
                C0300f c0300f = (C0300f) c0319y.m3090r();
                Parcel parcelM1894e0 = c0300f.m1894e0();
                parcelM1894e0.writeString(this.f164i);
                parcelM1894e0.writeString(this.f165j);
                int i3 = AbstractC1339v.f5981a;
                parcelM1894e0.writeInt(0);
                c0300f.m1897v0(parcelM1894e0, 14);
                synchronized (c0125h.f195q) {
                    try {
                        if (c0125h.f192n != null) {
                            c0125h.m585h(2477);
                        }
                        c0125h.f192n = c1560d;
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                String str = this.f164i;
                String str2 = this.f165j;
                C0319y c0319y2 = (C0319y) obj;
                C1560d c1560d2 = (C1560d) obj2;
                C0125H c0125h2 = this.f163h;
                HashMap map = c0125h2.f183A;
                long jIncrementAndGet = c0125h2.f194p.incrementAndGet();
                AbstractC0491s.m1215g("Not connected to device", c0125h2.f187E == 2);
                try {
                    map.put(Long.valueOf(jIncrementAndGet), c1560d2);
                    C0300f c0300f2 = (C0300f) c0319y2.m3090r();
                    Parcel parcelM1894e1 = c0300f2.m1894e0();
                    parcelM1894e1.writeString(str);
                    parcelM1894e1.writeString(str2);
                    parcelM1894e1.writeLong(jIncrementAndGet);
                    c0300f2.m1897v0(parcelM1894e1, 9);
                    return;
                } catch (RemoteException e3) {
                    map.remove(Long.valueOf(jIncrementAndGet));
                    c1560d2.m3878a(e3);
                    return;
                }
        }
    }
}
