package p082b0;

import p055T.AbstractC0558V;
import p055T.C0557U;
import p114k0.C1907A;

/* JADX INFO: renamed from: b0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1065f {

    /* JADX INFO: renamed from: a */
    public final String f4835a;

    /* JADX INFO: renamed from: b */
    public int f4836b;

    /* JADX INFO: renamed from: c */
    public long f4837c;

    /* JADX INFO: renamed from: d */
    public final C1907A f4838d;

    /* JADX INFO: renamed from: e */
    public boolean f4839e;

    /* JADX INFO: renamed from: f */
    public boolean f4840f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1066g f4841g;

    public C1065f(C1066g c1066g, String str, int i3, C1907A c1907a) {
        this.f4841g = c1066g;
        this.f4835a = str;
        this.f4836b = i3;
        this.f4837c = c1907a == null ? -1L : c1907a.f8314d;
        if (c1907a == null || !c1907a.m4422b()) {
            return;
        }
        this.f4838d = c1907a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2838a(C1060a c1060a) {
        C1907A c1907a = c1060a.f4814d;
        if (c1907a == null) {
            return this.f4836b != c1060a.f4813c;
        }
        long j3 = this.f4837c;
        if (j3 == -1) {
            return false;
        }
        if (c1907a.f8314d > j3) {
            return true;
        }
        C1907A c1907a2 = this.f4838d;
        if (c1907a2 == null) {
            return false;
        }
        AbstractC0558V abstractC0558V = c1060a.f4812b;
        int iMo1328b = abstractC0558V.mo1328b(c1907a.f8311a);
        int iMo1328b2 = abstractC0558V.mo1328b(c1907a2.f8311a);
        if (c1907a.f8314d < c1907a2.f8314d || iMo1328b < iMo1328b2) {
            return false;
        }
        if (iMo1328b > iMo1328b2) {
            return true;
        }
        boolean zM4422b = c1907a.m4422b();
        int i3 = c1907a2.f8312b;
        if (!zM4422b) {
            int i4 = c1907a.f8315e;
            return i4 == -1 || i4 > i3;
        }
        int i5 = c1907a.f8312b;
        if (i5 > i3) {
            return true;
        }
        if (i5 == i3) {
            return c1907a.f8313c > c1907a2.f8313c;
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2839b(AbstractC0558V abstractC0558V, AbstractC0558V abstractC0558V2) {
        C1907A c1907a;
        int i3 = this.f4836b;
        if (i3 < abstractC0558V.mo1333o()) {
            C1066g c1066g = this.f4841g;
            abstractC0558V.m1414n(i3, c1066g.f4844a);
            C0557U c0557u = c1066g.f4844a;
            int i4 = c0557u.f1988n;
            while (true) {
                if (i4 > c0557u.f1989o) {
                    i3 = -1;
                    break;
                }
                int iMo1328b = abstractC0558V2.mo1328b(abstractC0558V.mo1331l(i4));
                if (iMo1328b != -1) {
                    i3 = abstractC0558V2.mo1329f(iMo1328b, c1066g.f4845b, false).f1968c;
                    break;
                }
                i4++;
            }
        } else if (i3 >= abstractC0558V2.mo1333o()) {
            i3 = -1;
            break;
        }
        this.f4836b = i3;
        return i3 != -1 && ((c1907a = this.f4838d) == null || abstractC0558V2.mo1328b(c1907a.f8311a) != -1);
    }
}
