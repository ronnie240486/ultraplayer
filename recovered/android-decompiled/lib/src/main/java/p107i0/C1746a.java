package p107i0;

import p007C0.C0103c;
import p015F0.C0172a;
import p018G0.C0218h;
import p024I0.C0274d;
import p055T.C0583o;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: i0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1746a {

    /* JADX INFO: renamed from: a */
    public static final C1746a f7790a = new C1746a();

    /* JADX INFO: renamed from: a */
    public final AbstractC2003a m4199a(C0583o c0583o) {
        String str = c0583o.f2154n;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new C0103c(0);
                case "application/x-icy":
                    return new C0172a();
                case "application/id3":
                    return new C0218h(null);
                case "application/x-emsg":
                    return new C0103c(1);
                case "application/x-scte35":
                    return new C0274d();
            }
        }
        throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4200b(C0583o c0583o) {
        String str = c0583o.f2154n;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
