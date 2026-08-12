package p082b0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import p055T.AbstractC0558V;
import p055T.C0556T;
import p055T.C0557U;
import p064W.AbstractC0632A;
import p077a0.C0841q;
import p114k0.C1907A;

/* JADX INFO: renamed from: b0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1066g {

    /* JADX INFO: renamed from: h */
    public static final C0841q f4842h = new C0841q(1);

    /* JADX INFO: renamed from: i */
    public static final Random f4843i = new Random();

    /* JADX INFO: renamed from: d */
    public C1069j f4847d;

    /* JADX INFO: renamed from: f */
    public String f4849f;

    /* JADX INFO: renamed from: a */
    public final C0557U f4844a = new C0557U();

    /* JADX INFO: renamed from: b */
    public final C0556T f4845b = new C0556T();

    /* JADX INFO: renamed from: c */
    public final HashMap f4846c = new HashMap();

    /* JADX INFO: renamed from: e */
    public AbstractC0558V f4848e = AbstractC0558V.f1991a;

    /* JADX INFO: renamed from: g */
    public long f4850g = -1;

    /* JADX INFO: renamed from: a */
    public final void m2840a(C1065f c1065f) {
        long j3 = c1065f.f4837c;
        if (j3 != -1) {
            this.f4850g = j3;
        }
        this.f4849f = null;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m2841b(C1060a c1060a) {
        C1069j c1069j;
        try {
            String str = this.f4849f;
            if (str != null) {
                C1065f c1065f = (C1065f) this.f4846c.get(str);
                c1065f.getClass();
                m2840a(c1065f);
            }
            Iterator it = this.f4846c.values().iterator();
            while (it.hasNext()) {
                C1065f c1065f2 = (C1065f) it.next();
                it.remove();
                if (c1065f2.f4839e && (c1069j = this.f4847d) != null) {
                    c1069j.m2903d(c1060a, c1065f2.f4835a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    /* JADX WARN: Code duplicated, block: B:39:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public final C1065f m2842c(int i3, C1907A c1907a) {
        long j3;
        long j4;
        HashMap map = this.f4846c;
        C1065f c1065f = null;
        long j5 = Long.MAX_VALUE;
        for (C1065f c1065f2 : map.values()) {
            if (c1065f2.f4837c == -1 && i3 == c1065f2.f4836b && c1907a != null) {
                C1066g c1066g = c1065f2.f4841g;
                C1065f c1065f3 = (C1065f) c1066g.f4846c.get(c1066g.f4849f);
                if (c1065f3 != null) {
                    j4 = c1065f3.f4837c;
                    if (j4 == -1) {
                        j4 = 1 + c1066g.f4850g;
                    }
                } else {
                    j4 = 1 + c1066g.f4850g;
                }
                long j6 = c1907a.f8314d;
                if (j6 >= j4) {
                    c1065f2.f4837c = j6;
                }
            }
            C1907A c1907a2 = c1065f2.f4838d;
            if (c1907a != null) {
                long j7 = c1907a.f8314d;
                if (c1907a2 == null) {
                    if (!c1907a.m4422b() && j7 == c1065f2.f4837c) {
                        j3 = c1065f2.f4837c;
                        if (j3 != -1) {
                        }
                        c1065f = c1065f2;
                        j5 = j3;
                    }
                } else if (j7 == c1907a2.f8314d && c1907a.f8312b == c1907a2.f8312b && c1907a.f8313c == c1907a2.f8313c) {
                    j3 = c1065f2.f4837c;
                    if (j3 != -1) {
                    }
                    c1065f = c1065f2;
                    j5 = j3;
                }
            } else if (i3 == c1065f2.f4836b) {
                j3 = c1065f2.f4837c;
                if (j3 != -1 || j3 < j5) {
                    c1065f = c1065f2;
                    j5 = j3;
                } else if (j3 == j5) {
                    int i4 = AbstractC0632A.f2454a;
                    if (c1065f.f4838d != null && c1907a2 != null) {
                        c1065f = c1065f2;
                    }
                }
            }
        }
        if (c1065f != null) {
            return c1065f;
        }
        String str = (String) f4842h.get();
        C1065f c1065f4 = new C1065f(this, str, i3, c1907a);
        map.put(str, c1065f4);
        return c1065f4;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized String m2843d(AbstractC0558V abstractC0558V, C1907A c1907a) {
        return m2842c(abstractC0558V.mo1410g(c1907a.f8311a, this.f4845b).f1968c, c1907a).f4835a;
    }

    /* JADX INFO: renamed from: e */
    public final void m2844e(C1060a c1060a) {
        C1907A c1907a;
        boolean zM1415p = c1060a.f4812b.m1415p();
        HashMap map = this.f4846c;
        if (zM1415p) {
            String str = this.f4849f;
            if (str != null) {
                C1065f c1065f = (C1065f) map.get(str);
                c1065f.getClass();
                m2840a(c1065f);
                return;
            }
            return;
        }
        C1065f c1065f2 = (C1065f) map.get(this.f4849f);
        int i3 = c1060a.f4813c;
        C1907A c1907a2 = c1060a.f4814d;
        this.f4849f = m2842c(i3, c1907a2).f4835a;
        m2845f(c1060a);
        if (c1907a2 == null || !c1907a2.m4422b()) {
            return;
        }
        long j3 = c1907a2.f8314d;
        if (c1065f2 != null && c1065f2.f4837c == j3 && (c1907a = c1065f2.f4838d) != null && c1907a.f8312b == c1907a2.f8312b && c1907a.f8313c == c1907a2.f8313c) {
            return;
        }
        m2842c(i3, new C1907A(j3, c1907a2.f8311a));
        this.f4847d.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b2, B:42:0x00b6, B:43:0x00bd, B:45:0x00c7, B:47:0x00cb, B:49:0x00d8, B:52:0x00df), top: B:57:0x0001 }] */
    /* JADX INFO: renamed from: f */
    public final synchronized void m2845f(C1060a c1060a) {
        long j3;
        this.f4847d.getClass();
        if (c1060a.f4812b.m1415p()) {
            return;
        }
        C1907A c1907a = c1060a.f4814d;
        if (c1907a != null) {
            long j4 = c1907a.f8314d;
            C1065f c1065f = (C1065f) this.f4846c.get(this.f4849f);
            if (c1065f != null) {
                j3 = c1065f.f4837c;
                if (j3 == -1) {
                    j3 = this.f4850g + 1;
                }
            } else {
                j3 = this.f4850g + 1;
            }
            if (j4 < j3) {
                return;
            }
            C1065f c1065f2 = (C1065f) this.f4846c.get(this.f4849f);
            if (c1065f2 != null && c1065f2.f4837c == -1 && c1065f2.f4836b != c1060a.f4813c) {
                return;
            }
        }
        C1065f c1065fM2842c = m2842c(c1060a.f4813c, c1060a.f4814d);
        if (this.f4849f == null) {
            this.f4849f = c1065fM2842c.f4835a;
        }
        C1907A c1907a2 = c1060a.f4814d;
        if (c1907a2 != null && c1907a2.m4422b()) {
            C1907A c1907a3 = c1060a.f4814d;
            Object obj = c1907a3.f8311a;
            C1065f c1065fM2842c2 = m2842c(c1060a.f4813c, new C1907A(c1907a3.f8312b, c1907a3.f8314d, obj));
            if (!c1065fM2842c2.f4839e) {
                c1065fM2842c2.f4839e = true;
                c1060a.f4812b.mo1410g(c1060a.f4814d.f8311a, this.f4845b);
                this.f4845b.m1399d(c1060a.f4814d.f8312b);
                Math.max(0L, AbstractC0632A.m1581V(0L) + AbstractC0632A.m1581V(this.f4845b.f1970e));
                this.f4847d.getClass();
            }
        }
        if (!c1065fM2842c.f4839e) {
            c1065fM2842c.f4839e = true;
            this.f4847d.getClass();
        }
        if (c1065fM2842c.f4835a.equals(this.f4849f) && !c1065fM2842c.f4840f) {
            c1065fM2842c.f4840f = true;
            C1069j c1069j = this.f4847d;
            String str = c1065fM2842c.f4835a;
            c1069j.getClass();
            C1907A c1907a4 = c1060a.f4814d;
            if (c1907a4 == null || !c1907a4.m4422b()) {
                c1069j.m2901b();
                c1069j.f4860i = str;
                c1069j.f4861j = AbstractC1068i.m2882f().setPlayerName("AndroidXMedia3").setPlayerVersion("1.5.1");
                c1069j.m2902c(c1060a.f4812b, c1060a.f4814d);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m2846g(C1060a c1060a, int i3) {
        try {
            this.f4847d.getClass();
            boolean z3 = i3 == 0;
            Iterator it = this.f4846c.values().iterator();
            while (it.hasNext()) {
                C1065f c1065f = (C1065f) it.next();
                if (c1065f.m2838a(c1060a)) {
                    it.remove();
                    if (c1065f.f4839e) {
                        boolean zEquals = c1065f.f4835a.equals(this.f4849f);
                        if (z3 && zEquals) {
                            boolean z4 = c1065f.f4840f;
                        }
                        if (zEquals) {
                            m2840a(c1065f);
                        }
                        this.f4847d.m2903d(c1060a, c1065f.f4835a);
                    }
                }
            }
            m2844e(c1060a);
        } catch (Throwable th) {
            throw th;
        }
    }
}
