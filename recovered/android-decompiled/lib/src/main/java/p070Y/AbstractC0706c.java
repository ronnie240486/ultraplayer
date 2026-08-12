package p070Y;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p105h2.C1692X;
import p129o0.C2068h;

/* JADX INFO: renamed from: Y.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0706c implements InterfaceC0711h {

    /* JADX INFO: renamed from: g */
    public final boolean f2706g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f2707h = new ArrayList(1);

    /* JADX INFO: renamed from: i */
    public int f2708i;

    /* JADX INFO: renamed from: j */
    public C0715l f2709j;

    public AbstractC0706c(boolean z3) {
        this.f2706g = z3;
    }

    /* JADX INFO: renamed from: b */
    public final void m1829b(int i3) {
        C0715l c0715l = this.f2709j;
        int i4 = AbstractC0632A.f2454a;
        for (int i5 = 0; i5 < this.f2708i; i5++) {
            InterfaceC0701A interfaceC0701A = (InterfaceC0701A) this.f2707h.get(i5);
            boolean z3 = this.f2706g;
            C2068h c2068h = (C2068h) interfaceC0701A;
            synchronized (c2068h) {
                C1692X c1692x = C2068h.f8976n;
                if (z3 && (c0715l.f2741g & 8) != 8) {
                    c2068h.f8990h += (long) i3;
                }
            }
        }
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: e */
    public final void mo1830e(InterfaceC0701A interfaceC0701A) {
        interfaceC0701A.getClass();
        ArrayList arrayList = this.f2707h;
        if (arrayList.contains(interfaceC0701A)) {
            return;
        }
        arrayList.add(interfaceC0701A);
        this.f2708i++;
    }

    /* JADX INFO: renamed from: k */
    public final void m1831k() {
        C0715l c0715l = this.f2709j;
        int i3 = AbstractC0632A.f2454a;
        for (int i4 = 0; i4 < this.f2708i; i4++) {
            InterfaceC0701A interfaceC0701A = (InterfaceC0701A) this.f2707h.get(i4);
            boolean z3 = this.f2706g;
            C2068h c2068h = (C2068h) interfaceC0701A;
            synchronized (c2068h) {
                try {
                    C1692X c1692x = C2068h.f8976n;
                    if (z3 && (c0715l.f2741g & 8) != 8) {
                        AbstractC0646n.m1630h(c2068h.f8988f > 0);
                        c2068h.f8985c.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int i5 = (int) (jElapsedRealtime - c2068h.f8989g);
                        c2068h.f8991i += (long) i5;
                        long j3 = c2068h.f8992j;
                        long j4 = c2068h.f8990h;
                        c2068h.f8992j = j3 + j4;
                        if (i5 > 0) {
                            c2068h.f8987e.m4640a((int) Math.sqrt(j4), (j4 * 8000.0f) / i5);
                            if (c2068h.f8991i >= 2000 || c2068h.f8992j >= 524288) {
                                c2068h.f8993k = (long) c2068h.f8987e.m4641b();
                            }
                            c2068h.m4633b(i5, c2068h.f8990h, c2068h.f8993k);
                            c2068h.f8989g = jElapsedRealtime;
                            c2068h.f8990h = 0L;
                        }
                        c2068h.f8988f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.f2709j = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m1832l() {
        for (int i3 = 0; i3 < this.f2708i; i3++) {
            ((InterfaceC0701A) this.f2707h.get(i3)).getClass();
        }
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: m */
    public Map mo1833m() {
        return Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: p */
    public final void m1834p(C0715l c0715l) {
        this.f2709j = c0715l;
        for (int i3 = 0; i3 < this.f2708i; i3++) {
            InterfaceC0701A interfaceC0701A = (InterfaceC0701A) this.f2707h.get(i3);
            boolean z3 = this.f2706g;
            C2068h c2068h = (C2068h) interfaceC0701A;
            synchronized (c2068h) {
                try {
                    C1692X c1692x = C2068h.f8976n;
                    if (z3 && (c0715l.f2741g & 8) != 8) {
                        if (c2068h.f8988f == 0) {
                            c2068h.f8985c.getClass();
                            c2068h.f8989g = SystemClock.elapsedRealtime();
                        }
                        c2068h.f8988f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
