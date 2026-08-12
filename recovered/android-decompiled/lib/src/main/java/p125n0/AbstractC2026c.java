package p125n0;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import p048Q0.C0505d;
import p055T.C0559W;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p117l0.AbstractC1972a;

/* JADX INFO: renamed from: n0.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2026c implements InterfaceC2042s {

    /* JADX INFO: renamed from: a */
    public final C0559W f8813a;

    /* JADX INFO: renamed from: b */
    public final int f8814b;

    /* JADX INFO: renamed from: c */
    public final int[] f8815c;

    /* JADX INFO: renamed from: d */
    public final C0583o[] f8816d;

    /* JADX INFO: renamed from: e */
    public final long[] f8817e;

    /* JADX INFO: renamed from: f */
    public int f8818f;

    public AbstractC2026c(C0559W c0559w, int[] iArr) {
        int i3 = 0;
        AbstractC0646n.m1630h(iArr.length > 0);
        c0559w.getClass();
        this.f8813a = c0559w;
        int length = iArr.length;
        this.f8814b = length;
        this.f8816d = new C0583o[length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            this.f8816d[i4] = c0559w.f1995d[iArr[i4]];
        }
        Arrays.sort(this.f8816d, new C0505d(5));
        this.f8815c = new int[this.f8814b];
        while (true) {
            int i5 = this.f8814b;
            if (i3 >= i5) {
                this.f8817e = new long[i5];
                return;
            } else {
                this.f8815c[i3] = c0559w.m1417a(this.f8816d[i3]);
                i3++;
            }
        }
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: a */
    public final int mo4423a() {
        return this.f8815c[mo3748h()];
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: b */
    public final C0559W mo4424b() {
        return this.f8813a;
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: e */
    public final C0583o mo4426e() {
        return this.f8816d[mo3748h()];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC2026c abstractC2026c = (AbstractC2026c) obj;
            if (this.f8813a.equals(abstractC2026c.f8813a) && Arrays.equals(this.f8815c, abstractC2026c.f8815c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: f */
    public final boolean mo4427f(int i3, long j3) {
        return this.f8817e[i3] > j3;
    }

    public final int hashCode() {
        if (this.f8818f == 0) {
            this.f8818f = Arrays.hashCode(this.f8815c) + (System.identityHashCode(this.f8813a) * 31);
        }
        return this.f8818f;
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: i */
    public final C0583o mo4428i(int i3) {
        return this.f8816d[i3];
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: j */
    public final boolean mo4429j(int i3, long j3) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zMo4427f = mo4427f(i3, jElapsedRealtime);
        int i4 = 0;
        while (i4 < this.f8814b && !zMo4427f) {
            zMo4427f = (i4 == i3 || mo4427f(i4, jElapsedRealtime)) ? false : true;
            i4++;
        }
        if (!zMo4427f) {
            return false;
        }
        long[] jArr = this.f8817e;
        long j4 = jArr[i3];
        int i5 = AbstractC0632A.f2454a;
        long j5 = jElapsedRealtime + j3;
        if (((j3 ^ j5) & (jElapsedRealtime ^ j5)) < 0) {
            j5 = Long.MAX_VALUE;
        }
        jArr[i3] = Math.max(j4, j5);
        return true;
    }

    @Override // p125n0.InterfaceC2042s
    public final int length() {
        return this.f8815c.length;
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: m */
    public final int mo4432m(int i3) {
        return this.f8815c[i3];
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void mo4433o() {
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: p */
    public int mo4434p(long j3, List list) {
        return list.size();
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void mo4436r() {
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: s */
    public final /* synthetic */ boolean mo4437s(long j3, AbstractC1972a abstractC1972a, List list) {
        return false;
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: t */
    public final int mo4438t(int i3) {
        for (int i4 = 0; i4 < this.f8814b; i4++) {
            if (this.f8815c[i4] == i3) {
                return i4;
            }
        }
        return -1;
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: k */
    public void mo4430k() {
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: q */
    public void mo4435q() {
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: d */
    public final void mo4425d(boolean z3) {
    }

    @Override // p125n0.InterfaceC2042s
    /* JADX INFO: renamed from: l */
    public void mo4431l(float f) {
    }
}
