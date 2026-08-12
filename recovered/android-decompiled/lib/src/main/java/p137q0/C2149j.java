package p137q0;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import androidx.activity.RunnableC0892b;
import com.google.android.gms.internal.cast.C1323r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p036M0.C0368e;
import p036M0.C0380q;
import p055T.C0570d0;
import p055T.C0573f;
import p055T.C0574f0;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0652t;
import p064W.C0655w;
import p077a0.C0839o;
import p103h0.InterfaceC1603l;
import p104h1.C1656m;
import p105h2.C1692X;

/* JADX INFO: renamed from: q0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2149j {

    /* JADX INFO: renamed from: a */
    public final ArrayList f9277a;

    /* JADX INFO: renamed from: b */
    public final C2155p f9278b;

    /* JADX INFO: renamed from: c */
    public C0583o f9279c;

    /* JADX INFO: renamed from: d */
    public long f9280d;

    /* JADX INFO: renamed from: e */
    public long f9281e;

    /* JADX INFO: renamed from: f */
    public long f9282f;

    /* JADX INFO: renamed from: g */
    public long f9283g;

    /* JADX INFO: renamed from: h */
    public long f9284h;

    /* JADX INFO: renamed from: i */
    public boolean f9285i;

    /* JADX INFO: renamed from: j */
    public boolean f9286j;

    /* JADX INFO: renamed from: k */
    public long f9287k;

    /* JADX INFO: renamed from: l */
    public InterfaceC2163x f9288l;

    /* JADX INFO: renamed from: m */
    public Executor f9289m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C2152m f9290n;

    public C2149j(C2152m c2152m, Context context) {
        this.f9290n = c2152m;
        AbstractC0632A.m1568I(context);
        this.f9277a = new ArrayList();
        this.f9278b = new C2155p();
        this.f9284h = -9223372036854775807L;
        this.f9288l = InterfaceC2163x.f9359e;
        this.f9289m = C2152m.f9292o;
    }

    /* JADX INFO: renamed from: a */
    public final void m4731a(boolean z3) {
        this.f9285i = false;
        this.f9284h = -9223372036854775807L;
        C2152m c2152m = this.f9290n;
        if (c2152m.f9306n == 1) {
            c2152m.f9305m++;
            C1323r c1323r = c2152m.f9298f;
            if (z3) {
                C2156q c2156q = (C2156q) c1323r.f5961h;
                C2159t c2159t = c2156q.f9310b;
                c2159t.f9339m = 0L;
                c2159t.f9342p = -1L;
                c2159t.f9340n = -1L;
                c2156q.f9315g = -9223372036854775807L;
                c2156q.f9313e = -9223372036854775807L;
                c2156q.m4747d(1);
                c2156q.f9316h = -9223372036854775807L;
            }
            C2160u c2160u = (C2160u) c1323r.f5962i;
            C1656m c1656m = c2160u.f9349f;
            c1656m.f7541b = 0;
            c1656m.f7542c = 0;
            c2160u.f9353j = -9223372036854775807L;
            C0368e c0368e = c2160u.f9348e;
            if (c0368e.m1018j() > 0) {
                AbstractC0646n.m1625c(c0368e.m1018j() > 0);
                while (c0368e.m1018j() > 1) {
                    c0368e.m1015g();
                }
                Object objM1015g = c0368e.m1015g();
                objM1015g.getClass();
                c0368e.m1009a(0L, (Long) objM1015g);
            }
            C0574f0 c0574f0 = c2160u.f9350g;
            C0368e c0368e2 = c2160u.f9347d;
            if (c0574f0 != null) {
                c0368e2.m1011c();
            } else if (c0368e2.m1018j() > 0) {
                AbstractC0646n.m1625c(c0368e2.m1018j() > 0);
                while (c0368e2.m1018j() > 1) {
                    c0368e2.m1015g();
                }
                Object objM1015g2 = c0368e2.m1015g();
                objM1015g2.getClass();
                c2160u.f9350g = (C0574f0) objM1015g2;
            }
            C0655w c0655w = c2152m.f9303k;
            AbstractC0646n.m1631i(c0655w);
            c0655w.m1698c(new RunnableC0892b(19, c2152m));
        }
        this.f9287k = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r8 >= r4) goto L23;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4732b(long j3, boolean z3, long j4, long j5, C0380q c0380q) throws C2164y {
        C2152m c2152m = this.f9290n;
        AbstractC0646n.m1630h(false);
        long j6 = j3 - this.f9282f;
        try {
            if (c2152m.f9294b.m4744a(j6, j4, j5, this.f9280d, z3, this.f9278b) == 4) {
                return false;
            }
            if (j6 < this.f9283g && !z3) {
                ((C2144e) c0380q.f1293j).m4724E0((InterfaceC1603l) c0380q.f1292i, c0380q.f1291h);
                return true;
            }
            m4736f(j4, j5);
            if (this.f9286j) {
                long j7 = this.f9287k;
                if (j7 != -9223372036854775807L) {
                    if (c2152m.f9305m == 0) {
                        long j8 = c2152m.f9295c.f9353j;
                        if (j8 != -9223372036854775807L) {
                        }
                    }
                    return false;
                }
                m4735e();
                this.f9286j = false;
                this.f9287k = -9223372036854775807L;
            }
            AbstractC0646n.m1631i(null);
            throw null;
        } catch (C0839o e3) {
            C0583o c0583o = this.f9279c;
            AbstractC0646n.m1631i(c0583o);
            throw new C2164y(e3, c0583o);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4733c(C0583o c0583o) {
        C2152m c2152m = this.f9290n;
        AbstractC0646n.m1630h(c2152m.f9306n == 0);
        C0573f c0573f = c0583o.f2129B;
        if (c0573f == null || !c0573f.m1441d()) {
            c0573f = C0573f.f2062h;
        }
        if (c0573f.f2065c != 7 || AbstractC0632A.f2454a < 34) {
        }
        Looper looperMyLooper = Looper.myLooper();
        AbstractC0646n.m1631i(looperMyLooper);
        c2152m.f9303k = c2152m.f9299g.m1693a(looperMyLooper, null);
        try {
            C2151l c2151l = c2152m.f9296d;
            C1692X c1692x = C1692X.f7629k;
            c2151l.m4742a();
            Pair pair = c2152m.f9304l;
            if (pair == null) {
                throw null;
            }
            int i3 = ((C0652t) pair.second).f2524a;
            throw null;
        } catch (C0570d0 e3) {
            throw new C2164y(e3, c0583o);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m4734d(boolean z3) {
        ((C2156q) this.f9290n.f9298f.f5961h).m4746c(z3);
    }

    /* JADX INFO: renamed from: e */
    public final void m4735e() {
        if (this.f9279c == null) {
            return;
        }
        new ArrayList(this.f9277a);
        C0583o c0583o = this.f9279c;
        c0583o.getClass();
        AbstractC0646n.m1631i(null);
        C0573f c0573f = c0583o.f2129B;
        if (c0573f == null || !c0573f.m1441d()) {
            C0573f c0573f2 = C0573f.f2062h;
        }
        int i3 = c0583o.f2161u;
        AbstractC0646n.m1624b("width must be positive, but is: " + i3, i3 > 0);
        int i4 = c0583o.f2162v;
        AbstractC0646n.m1624b("height must be positive, but is: " + i4, i4 > 0);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public final void m4736f(long j3, long j4) {
        try {
            C2152m.m4743a(this.f9290n, j3, j4);
        } catch (C0839o e3) {
            C0583o c0583o = this.f9279c;
            if (c0583o == null) {
                c0583o = new C0583o(new C0582n());
            }
            throw new C2164y(e3, c0583o);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4737g(int i3) {
        C2159t c2159t = ((C2156q) this.f9290n.f9298f.f5961h).f9310b;
        if (c2159t.f9336j == i3) {
            return;
        }
        c2159t.f9336j = i3;
        c2159t.m4755d(true);
    }

    /* JADX INFO: renamed from: h */
    public final void m4738h(Surface surface, C0652t c0652t) {
        C2152m c2152m = this.f9290n;
        Pair pair = c2152m.f9304l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C0652t) c2152m.f9304l.second).equals(c0652t)) {
            return;
        }
        c2152m.f9304l = Pair.create(surface, c0652t);
        int i3 = c0652t.f2524a;
    }

    /* JADX INFO: renamed from: i */
    public final void m4739i(float f) {
        ((C2156q) this.f9290n.f9298f.f5961h).m4751h(f);
    }

    /* JADX INFO: renamed from: j */
    public final void m4740j(long j3, long j4, long j5, long j6) {
        if (this.f9281e == j4) {
            int i3 = (this.f9282f > j5 ? 1 : (this.f9282f == j5 ? 0 : -1));
        }
        this.f9280d = j3;
        this.f9281e = j4;
        this.f9282f = j5;
        this.f9283g = j6;
    }

    /* JADX INFO: renamed from: k */
    public final void m4741k(List list) {
        ArrayList arrayList = this.f9277a;
        if (arrayList.equals(list)) {
            return;
        }
        arrayList.clear();
        arrayList.addAll(list);
        arrayList.addAll(this.f9290n.f9297e);
        m4735e();
    }
}
