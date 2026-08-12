package p077a0;

import p000A.C0041i;
import p045P0.AbstractC0462h;
import p082b0.C1064e;

/* JADX INFO: renamed from: a0.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0821d implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3453g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f3454h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f3455i;

    public /* synthetic */ RunnableC0821d(C0823e c0823e, int i3) {
        this.f3455i = c0823e;
        this.f3454h = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3453g) {
            case 0:
                C0825f c0825f = ((C0823e) this.f3455i).f3457b;
                c0825f.getClass();
                int i3 = this.f3454h;
                if (i3 == -3 || i3 == -2) {
                    if (i3 == -2) {
                        SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z = c0825f.f3469c;
                        if (surfaceHolderCallbackC0850z != null) {
                            C0792C c0792c = surfaceHolderCallbackC0850z.f3610g;
                            c0792c.m1928w0(0, 1, c0792c.mo1322t());
                        }
                        c0825f.m2076c(3);
                    } else {
                        c0825f.m2076c(4);
                    }
                } else if (i3 == -1) {
                    SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z2 = c0825f.f3469c;
                    if (surfaceHolderCallbackC0850z2 != null) {
                        C0792C c0792c2 = surfaceHolderCallbackC0850z2.f3610g;
                        c0792c2.m1928w0(-1, 2, c0792c2.mo1322t());
                    }
                    c0825f.m2074a();
                    c0825f.m2076c(1);
                } else if (i3 == 1) {
                    c0825f.m2076c(2);
                    SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z3 = c0825f.f3469c;
                    if (surfaceHolderCallbackC0850z3 != null) {
                        C0792C c0792c3 = surfaceHolderCallbackC0850z3.f3610g;
                        c0792c3.m1928w0(1, 1, c0792c3.mo1322t());
                    }
                } else {
                    AbstractC0462h.m1170j("Unknown focus change type: ", "AudioFocusManager", i3);
                }
                break;
            default:
                C0797H c0797h = (C0797H) this.f3455i;
                int i4 = c0797h.f3309g[this.f3454h].f3478h;
                C1064e c1064e = c0797h.f3284D;
                c1064e.m2836R(c1064e.m2835Q(), 1033, new C0041i(29));
                break;
        }
    }

    public /* synthetic */ RunnableC0821d(C0797H c0797h, int i3, boolean z3) {
        this.f3455i = c0797h;
        this.f3454h = i3;
    }
}
