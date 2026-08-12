package p013E1;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p019G1.C0233h;
import p028J1.C0300f;
import p028J1.C0319y;
import p037M1.C0391d;
import p040N1.InterfaceC0430k;
import p046P1.AbstractC0491s;
import p097f2.C1560d;

/* JADX INFO: renamed from: E1.B */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0119B implements InterfaceC0430k {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f166g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0125H f167h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f168i;

    public /* synthetic */ C0119B(C0125H c0125h, String str) {
        this.f167h = c0125h;
        this.f168i = str;
    }

    @Override // p040N1.InterfaceC0430k
    /* JADX INFO: renamed from: m */
    public final void mo165m(Object obj, Object obj2) {
        switch (this.f166g) {
            case 0:
                C0319y c0319y = (C0319y) obj;
                C1560d c1560d = (C1560d) obj2;
                AbstractC0491s.m1215g("Not active connection", this.f167h.f187E != 1);
                C0300f c0300f = (C0300f) c0319y.m3090r();
                String str = this.f168i;
                Parcel parcelM1894e0 = c0300f.m1894e0();
                parcelM1894e0.writeString(str);
                c0300f.m1897v0(parcelM1894e0, 12);
                C0300f c0300f2 = (C0300f) c0319y.m3090r();
                Parcel parcelM1894e1 = c0300f2.m1894e0();
                parcelM1894e1.writeString(str);
                c0300f2.m1897v0(parcelM1894e1, 11);
                c1560d.m3879b(null);
                return;
            default:
                C0125H c0125h = this.f167h;
                String str2 = this.f168i;
                C0319y c0319y2 = (C0319y) obj;
                C1560d c1560d2 = (C1560d) obj2;
                AbstractC0491s.m1215g("Not connected to device", c0125h.f187E == 2);
                C0300f c0300f3 = (C0300f) c0319y2.m3090r();
                Parcel parcelM1894e2 = c0300f3.m1894e0();
                parcelM1894e2.writeString(str2);
                c0300f3.m1897v0(parcelM1894e2, 5);
                synchronized (c0125h.f196r) {
                    try {
                        if (c0125h.f193o != null) {
                            c1560d2.m3878a(new C0391d(new Status(2001, null, null, null)));
                            return;
                        } else {
                            c0125h.f193o = c1560d2;
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }

    public /* synthetic */ C0119B(C0125H c0125h, String str, C0233h c0233h) {
        this.f167h = c0125h;
        this.f168i = str;
    }
}
