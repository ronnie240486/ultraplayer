package p125n0;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import p055T.C0559W;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0653u;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1723q;
import p105h2.C1673D;
import p117l0.AbstractC1973b;
import p117l0.InterfaceC1974c;
import p129o0.C2068h;
import p129o0.InterfaceC2064d;

/* JADX INFO: renamed from: n0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2025b extends AbstractC2026c {

    /* JADX INFO: renamed from: g */
    public final InterfaceC2064d f8798g;

    /* JADX INFO: renamed from: h */
    public final long f8799h;

    /* JADX INFO: renamed from: i */
    public final long f8800i;

    /* JADX INFO: renamed from: j */
    public final long f8801j;

    /* JADX INFO: renamed from: k */
    public final int f8802k;

    /* JADX INFO: renamed from: l */
    public final int f8803l;

    /* JADX INFO: renamed from: m */
    public final float f8804m;

    /* JADX INFO: renamed from: n */
    public final float f8805n;

    /* JADX INFO: renamed from: o */
    public final AbstractC1676G f8806o;

    /* JADX INFO: renamed from: p */
    public final C0653u f8807p;

    /* JADX INFO: renamed from: q */
    public float f8808q;

    /* JADX INFO: renamed from: r */
    public int f8809r;

    /* JADX INFO: renamed from: s */
    public int f8810s;

    /* JADX INFO: renamed from: t */
    public long f8811t;

    /* JADX INFO: renamed from: u */
    public AbstractC1973b f8812u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2025b(C0559W c0559w, int[] iArr, InterfaceC2064d interfaceC2064d, long j3, long j4, long j5, AbstractC1676G abstractC1676G) {
        super(c0559w, iArr);
        C0653u c0653u = C0653u.f2526a;
        if (j5 < j3) {
            AbstractC0646n.m1647y("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j5 = j3;
        }
        this.f8798g = interfaceC2064d;
        this.f8799h = j3 * 1000;
        this.f8800i = j4 * 1000;
        this.f8801j = j5 * 1000;
        this.f8802k = 1279;
        this.f8803l = 719;
        this.f8804m = 0.7f;
        this.f8805n = 0.75f;
        this.f8806o = AbstractC1676G.m4117n(abstractC1676G);
        this.f8807p = c0653u;
        this.f8808q = 1.0f;
        this.f8810s = 0;
        this.f8811t = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: u */
    public static void m4597u(ArrayList arrayList, long[] jArr) {
        long j3 = 0;
        for (long j4 : jArr) {
            j3 += j4;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C1673D c1673d = (C1673D) arrayList.get(i3);
            if (c1673d != null) {
                c1673d.m4102a(new C2024a(j3, jArr[i3]));
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public static long m4598w(List list) {
        if (!list.isEmpty()) {
            AbstractC1973b abstractC1973b = (AbstractC1973b) AbstractC1723q.m4158g(list);
            long j3 = abstractC1973b.f8607g;
            if (j3 != -9223372036854775807L) {
                long j4 = abstractC1973b.f8608h;
                if (j4 != -9223372036854775807L) {
                    return j4 - j3;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: c */
    public final void mo3746c(long j3, long j4, long j5, List list, InterfaceC1974c[] interfaceC1974cArr) {
        long jM4598w;
        this.f8807p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i3 = this.f8809r;
        int i4 = 0;
        if (i3 >= interfaceC1974cArr.length || !interfaceC1974cArr[i3].next()) {
            int length = interfaceC1974cArr.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    jM4598w = m4598w(list);
                    break;
                }
                InterfaceC1974c interfaceC1974c = interfaceC1974cArr[i5];
                if (interfaceC1974c.next()) {
                    jM4598w = interfaceC1974c.mo3744g() - interfaceC1974c.mo3745o();
                    break;
                }
                i5++;
            }
        } else {
            InterfaceC1974c interfaceC1974c2 = interfaceC1974cArr[this.f8809r];
            jM4598w = interfaceC1974c2.mo3744g() - interfaceC1974c2.mo3745o();
        }
        int i6 = this.f8810s;
        if (i6 == 0) {
            this.f8810s = 1;
            this.f8809r = m4599v(jElapsedRealtime);
            return;
        }
        int i7 = this.f8809r;
        boolean zIsEmpty = list.isEmpty();
        C0583o[] c0583oArr = this.f8816d;
        if (!zIsEmpty) {
            C0583o c0583o = ((AbstractC1973b) AbstractC1723q.m4158g(list)).f8604d;
            while (true) {
                if (i4 >= this.f8814b) {
                    i4 = -1;
                    break;
                } else if (c0583oArr[i4] == c0583o) {
                    break;
                } else {
                    i4++;
                }
            }
        } else {
            i4 = -1;
            break;
        }
        if (i4 != -1) {
            i6 = ((AbstractC1973b) AbstractC1723q.m4158g(list)).f8605e;
            i7 = i4;
        }
        int iM4599v = m4599v(jElapsedRealtime);
        if (iM4599v != i7 && !mo4427f(i7, jElapsedRealtime)) {
            C0583o c0583o2 = c0583oArr[i7];
            C0583o c0583o3 = c0583oArr[iM4599v];
            long jMin = this.f8799h;
            if (j5 != -9223372036854775807L) {
                jMin = Math.min((long) ((jM4598w != -9223372036854775807L ? j5 - jM4598w : j5) * this.f8805n), jMin);
            }
            int i8 = c0583o3.f2150j;
            int i9 = c0583o2.f2150j;
            if ((i8 > i9 && j4 < jMin) || (i8 < i9 && j4 >= this.f8800i)) {
                iM4599v = i7;
            }
        }
        if (iM4599v != i7) {
            i6 = 3;
        }
        this.f8810s = i6;
        this.f8809r = iM4599v;
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: g */
    public final int mo3747g() {
        return this.f8810s;
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: h */
    public final int mo3748h() {
        return this.f8809r;
    }

    @Override // p125n0.AbstractC2026c, p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: k */
    public final void mo4430k() {
        this.f8811t = -9223372036854775807L;
        this.f8812u = null;
    }

    @Override // p125n0.AbstractC2026c, p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: l */
    public final void mo4431l(float f) {
        this.f8808q = f;
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: n */
    public final Object mo3749n() {
        return null;
    }

    @Override // p125n0.AbstractC2026c, p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: p */
    public final int mo4434p(long j3, List list) {
        int i3;
        int i4;
        this.f8807p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = this.f8811t;
        if (j4 != -9223372036854775807L && jElapsedRealtime - j4 < 1000 && (list.isEmpty() || ((AbstractC1973b) AbstractC1723q.m4158g(list)).equals(this.f8812u))) {
            return list.size();
        }
        this.f8811t = jElapsedRealtime;
        this.f8812u = list.isEmpty() ? null : (AbstractC1973b) AbstractC1723q.m4158g(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jM1607z = AbstractC0632A.m1607z(((AbstractC1973b) list.get(size - 1)).f8607g - j3, this.f8808q);
        long j5 = this.f8801j;
        if (jM1607z >= j5) {
            m4598w(list);
            C0583o c0583o = this.f8816d[m4599v(jElapsedRealtime)];
            for (int i5 = 0; i5 < size; i5++) {
                AbstractC1973b abstractC1973b = (AbstractC1973b) list.get(i5);
                C0583o c0583o2 = abstractC1973b.f8604d;
                if (AbstractC0632A.m1607z(abstractC1973b.f8607g - j3, this.f8808q) >= j5 && c0583o2.f2150j < c0583o.f2150j && (i3 = c0583o2.f2162v) != -1 && i3 <= this.f8803l && (i4 = c0583o2.f2161u) != -1 && i4 <= this.f8802k && i3 < c0583o.f2162v) {
                    return i5;
                }
            }
        }
        return size;
    }

    @Override // p125n0.AbstractC2026c, p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: q */
    public final void mo4435q() {
        this.f8812u = null;
    }

    /* JADX INFO: renamed from: v */
    public final int m4599v(long j3) {
        long j4;
        C2068h c2068h = (C2068h) this.f8798g;
        synchronized (c2068h) {
            j4 = c2068h.f8993k;
        }
        long j5 = (long) (j4 * this.f8804m);
        this.f8798g.getClass();
        long j6 = (long) (j5 / this.f8808q);
        if (!this.f8806o.isEmpty()) {
            int i3 = 1;
            while (i3 < this.f8806o.size() - 1 && ((C2024a) this.f8806o.get(i3)).f8796a < j6) {
                i3++;
            }
            C2024a c2024a = (C2024a) this.f8806o.get(i3 - 1);
            C2024a c2024a2 = (C2024a) this.f8806o.get(i3);
            long j7 = c2024a.f8796a;
            float f = (j6 - j7) / (c2024a2.f8796a - j7);
            long j8 = c2024a.f8797b;
            j6 = j8 + ((long) (f * (c2024a2.f8797b - j8)));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f8814b; i5++) {
            if (j3 == Long.MIN_VALUE || !mo4427f(i5, j3)) {
                if (this.f8816d[i5].f2150j <= j6) {
                    return i5;
                }
                i4 = i5;
            }
        }
        return i4;
    }
}
