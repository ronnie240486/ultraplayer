package androidx.lifecycle;

import p000A.C0031d;

/* JADX INFO: renamed from: androidx.lifecycle.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1010w {

    /* JADX INFO: renamed from: a */
    public final C0031d f4332a;

    /* JADX INFO: renamed from: b */
    public boolean f4333b;

    /* JADX INFO: renamed from: c */
    public int f4334c = -1;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1011x f4335d;

    public AbstractC1010w(C1011x c1011x, C0031d c0031d) {
        this.f4335d = c1011x;
        this.f4332a = c0031d;
    }

    /* JADX INFO: renamed from: c */
    public final void m2576c(boolean z3) {
        if (z3 == this.f4333b) {
            return;
        }
        this.f4333b = z3;
        int i3 = z3 ? 1 : -1;
        C1011x c1011x = this.f4335d;
        int i4 = c1011x.f4339c;
        c1011x.f4339c = i3 + i4;
        if (!c1011x.f4340d) {
            c1011x.f4340d = true;
            while (true) {
                try {
                    int i5 = c1011x.f4339c;
                    if (i4 == i5) {
                        break;
                    } else {
                        i4 = i5;
                    }
                } catch (Throwable th) {
                    c1011x.f4340d = false;
                    throw th;
                }
            }
            c1011x.f4340d = false;
        }
        if (this.f4333b) {
            c1011x.m2579c(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo2558d() {
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo2559e();
}
