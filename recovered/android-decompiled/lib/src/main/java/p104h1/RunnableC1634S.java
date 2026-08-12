package p104h1;

import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import p000A.AbstractC0016Q;

/* JADX INFO: renamed from: h1.S */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1634S implements Runnable {

    /* JADX INFO: renamed from: g */
    public int f7398g;

    /* JADX INFO: renamed from: h */
    public int f7399h;

    /* JADX INFO: renamed from: i */
    public OverScroller f7400i;

    /* JADX INFO: renamed from: j */
    public Interpolator f7401j;

    /* JADX INFO: renamed from: k */
    public boolean f7402k;

    /* JADX INFO: renamed from: l */
    public boolean f7403l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ RecyclerView f7404m;

    public RunnableC1634S(RecyclerView recyclerView) {
        this.f7404m = recyclerView;
        InterpolatorC1665v interpolatorC1665v = RecyclerView.f4711H0;
        this.f7401j = interpolatorC1665v;
        this.f7402k = false;
        this.f7403l = false;
        this.f7400i = new OverScroller(recyclerView.getContext(), interpolatorC1665v);
    }

    /* JADX INFO: renamed from: a */
    public final void m4046a(int i3, int i4) {
        RecyclerView recyclerView = this.f7404m;
        recyclerView.setScrollState(2);
        this.f7399h = 0;
        this.f7398g = 0;
        Interpolator interpolator = this.f7401j;
        InterpolatorC1665v interpolatorC1665v = RecyclerView.f4711H0;
        if (interpolator != interpolatorC1665v) {
            this.f7401j = interpolatorC1665v;
            this.f7400i = new OverScroller(recyclerView.getContext(), interpolatorC1665v);
        }
        this.f7400i.fling(0, 0, i3, i4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f7402k) {
            this.f7403l = true;
            return;
        }
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        recyclerView.postOnAnimation(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        RecyclerView recyclerView = this.f7404m;
        if (recyclerView.f4768s == null) {
            recyclerView.removeCallbacks(this);
            this.f7400i.abortAnimation();
            return;
        }
        this.f7403l = false;
        this.f7402k = true;
        recyclerView.m2778k();
        OverScroller overScroller = this.f7400i;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i8 = currX - this.f7398g;
            int i9 = currY - this.f7399h;
            this.f7398g = currX;
            this.f7399h = currY;
            int iM2747j = RecyclerView.m2747j(i8, recyclerView.f4726L, recyclerView.f4728N, recyclerView.getWidth());
            int iM2747j2 = RecyclerView.m2747j(i9, recyclerView.f4727M, recyclerView.f4729O, recyclerView.getHeight());
            int[] iArr = recyclerView.f4775v0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zM2783p = recyclerView.m2783p(iM2747j, iM2747j2, 1, iArr, null);
            int[] iArr2 = recyclerView.f4775v0;
            if (zM2783p) {
                iM2747j -= iArr2[0];
                iM2747j2 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m2777i(iM2747j, iM2747j2);
            }
            if (recyclerView.f4766r != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.m2768W(iM2747j, iM2747j2, iArr2);
                int i10 = iArr2[0];
                int i11 = iArr2[1];
                recyclerView.f4768s.getClass();
                i3 = iM2747j - i10;
                i5 = i10;
                i4 = iM2747j2 - i11;
                i6 = i11;
            } else {
                i3 = iM2747j;
                i4 = iM2747j2;
                i5 = 0;
                i6 = 0;
            }
            if (!recyclerView.f4772u.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f4775v0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.m2784q(i5, i6, i3, i4, null, 1, iArr3);
            int i12 = i3 - iArr2[0];
            int i13 = i4 - iArr2[1];
            if (i5 != 0 || i6 != 0) {
                recyclerView.m2785r(i5, i6);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z3 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            recyclerView.f4768s.getClass();
            if (z3) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i12 < 0) {
                        i7 = -currVelocity;
                    } else {
                        i7 = i12 > 0 ? currVelocity : 0;
                    }
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i7 < 0) {
                        recyclerView.m2787t();
                        if (recyclerView.f4726L.isFinished()) {
                            recyclerView.f4726L.onAbsorb(-i7);
                        }
                    } else if (i7 > 0) {
                        recyclerView.m2788u();
                        if (recyclerView.f4728N.isFinished()) {
                            recyclerView.f4728N.onAbsorb(i7);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m2789v();
                        if (recyclerView.f4727M.isFinished()) {
                            recyclerView.f4727M.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m2786s();
                        if (recyclerView.f4729O.isFinished()) {
                            recyclerView.f4729O.onAbsorb(currVelocity);
                        }
                    }
                    if (i7 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f4709F0) {
                    C1656m c1656m = recyclerView.f4749i0;
                    int[] iArr4 = (int[]) c1656m.f7540a;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c1656m.f7543d = 0;
                }
            } else {
                if (this.f7402k) {
                    this.f7403l = true;
                } else {
                    recyclerView.removeCallbacks(this);
                    WeakHashMap weakHashMap2 = AbstractC0016Q.f14a;
                    recyclerView.postOnAnimation(this);
                }
                RunnableC1658o runnableC1658o = recyclerView.f4747h0;
                if (runnableC1658o != null) {
                    runnableC1658o.m4088a(recyclerView, i5, i6);
                }
            }
        }
        recyclerView.f4768s.getClass();
        this.f7402k = false;
        if (!this.f7403l) {
            recyclerView.setScrollState(0);
            recyclerView.m2773b0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap3 = AbstractC0016Q.f14a;
            recyclerView.postOnAnimation(this);
        }
    }
}
