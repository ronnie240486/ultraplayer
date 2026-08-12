package com.google.android.gms.internal.cast;

import android.graphics.Typeface;
import android.widget.TextView;
import java.io.IOException;
import java.util.HashMap;
import p045P0.AbstractC0462h;
import p046P1.AbstractC0491s;
import p046P1.C0475c;
import p077a0.RunnableC0804O;
import p082b0.C1063d;
import p089d1.C1451x;
import p126n1.C2046a;
import p126n1.C2047b;
import p126n1.EnumC2048c;
import p138q1.C2172h;
import p138q1.C2173i;
import p138q1.C2174j;
import p138q1.C2176l;
import p138q1.C2179o;
import p158w1.C2318a;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1315p implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5949g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5950h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f5951i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f5952j;

    public /* synthetic */ RunnableC1315p(Object obj, Object obj2, int i3, int i4) {
        this.f5949g = i4;
        this.f5951i = obj;
        this.f5952j = obj2;
        this.f5950h = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5949g) {
            case 0:
                BinderC1319q binderC1319q = (BinderC1319q) this.f5951i;
                C1451x c1451x = (C1451x) this.f5952j;
                int i3 = this.f5950h;
                synchronized (binderC1319q.f5956f) {
                    binderC1319q.m3349w0(c1451x, i3);
                    break;
                }
                return;
            case 1:
                C1209O c1209o = (C1209O) this.f5951i;
                c1209o.getClass();
                C1324r0 c1324r0M3396n = C1328s0.m3396n((C1328s0) this.f5952j);
                c1324r0M3396n.m3256c();
                C1328s0 c1328s0 = (C1328s0) c1324r0M3396n.f5902h;
                String str = c1209o.f5672d;
                C1328s0.m3404v(c1328s0, str);
                c1324r0M3396n.m3256c();
                C1328s0.m3405w((C1328s0) c1324r0M3396n.f5902h, str);
                Long l3 = c1209o.f5673e;
                if (l3 != null) {
                    int iLongValue = (int) l3.longValue();
                    c1324r0M3396n.m3256c();
                    C1328s0.m3406x((C1328s0) c1324r0M3396n.f5902h, iLongValue);
                }
                C1328s0 c1328s1 = (C1328s0) c1324r0M3396n.m3254a();
                int i4 = c1209o.f5676h;
                int i5 = i4 - 1;
                C2046a c2046a = null;
                if (i4 == 0) {
                    throw null;
                }
                int i6 = this.f5950h;
                if (i5 == 0) {
                    c2046a = new C2046a(Integer.valueOf(i6 - 1), c1328s1, EnumC2048c.f8922h);
                } else if (i5 == 1) {
                    c2046a = new C2046a(Integer.valueOf(i6 - 1), c1328s1, EnumC2048c.f8921g);
                }
                C1209O.f5667i.m831b("analytics event: %s", c2046a);
                AbstractC0491s.m1213e(c2046a);
                C2173i c2173i = c1209o.f5675g;
                if (c2173i != null) {
                    C1063d c1063d = new C1063d(20);
                    C2174j c2174j = (C2174j) c2173i.f9388h;
                    C2047b c2047b = (C2047b) c2173i.f9389i;
                    C2179o c2179o = (C2179o) c2173i.f9390j;
                    C2173i c2173iM4761a = C2174j.m4761a();
                    c2173iM4761a.m4760b(c2174j.f9391a);
                    c2173iM4761a.f9390j = c2046a.f8919c;
                    c2173iM4761a.f9389i = c2174j.f9392b;
                    C2174j c2174jM4759a = c2173iM4761a.m4759a();
                    C0475c c0475c = new C0475c();
                    c0475c.f1572e = new HashMap();
                    c0475c.f1569b = Long.valueOf(c2179o.f9404a.m969D());
                    c0475c.f1571d = Long.valueOf(c2179o.f9405b.m969D());
                    c0475c.f1570c = "CAST_SENDER_SDK";
                    C1328s0 c1328s2 = c2046a.f8918b;
                    try {
                        int iM3264i = c1328s2.m3264i();
                        byte[] bArr = new byte[iM3264i];
                        C1254Z1 c1254z1 = new C1254Z1(bArr, iM3264i);
                        InterfaceC1188I2 interfaceC1188I2M3131a = C1176F2.f5618c.m3131a(C1328s0.class);
                        C1342v2 c1342v2 = c1254z1.f5755f;
                        if (c1342v2 == null) {
                            c1342v2 = new C1342v2(c1254z1);
                        }
                        interfaceC1188I2M3131a.mo3108f(c1328s2, c1342v2);
                        if (iM3264i - c1254z1.f5758i != 0) {
                            throw new IllegalStateException("Did not write as much data as expected.");
                        }
                        c0475c.f1568a = new C2176l(c2047b, bArr);
                        c0475c.f1573f = c2046a.f8917a;
                        C2172h c2172hM1194d = c0475c.m1194d();
                        C2318a c2318a = (C2318a) c2179o.f9406c;
                        c2318a.getClass();
                        c2318a.f9840b.execute(new RunnableC0804O(c2318a, c2174jM4759a, c1063d, c2172hM1194d));
                        return;
                    } catch (IOException e3) {
                        throw new RuntimeException(AbstractC0462h.m1166f("Serializing ", C1328s0.class.getName(), " to a byte array threw an IOException (should never happen)."), e3);
                    }
                }
                return;
            default:
                ((TextView) this.f5951i).setTypeface((Typeface) this.f5952j, this.f5950h);
                return;
        }
    }
}
