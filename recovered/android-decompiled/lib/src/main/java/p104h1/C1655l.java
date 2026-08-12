package p104h1;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000A.AbstractC0016Q;
import p014F.RunnableC0153b;

/* JADX INFO: renamed from: h1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1655l {

    /* JADX INFO: renamed from: C */
    public static final int[] f7510C = {R.attr.state_pressed};

    /* JADX INFO: renamed from: D */
    public static final int[] f7511D = new int[0];

    /* JADX INFO: renamed from: A */
    public int f7512A;

    /* JADX INFO: renamed from: B */
    public final RunnableC0153b f7513B;

    /* JADX INFO: renamed from: a */
    public final int f7514a;

    /* JADX INFO: renamed from: b */
    public final int f7515b;

    /* JADX INFO: renamed from: c */
    public final StateListDrawable f7516c;

    /* JADX INFO: renamed from: d */
    public final Drawable f7517d;

    /* JADX INFO: renamed from: e */
    public final int f7518e;

    /* JADX INFO: renamed from: f */
    public final int f7519f;

    /* JADX INFO: renamed from: g */
    public final StateListDrawable f7520g;

    /* JADX INFO: renamed from: h */
    public final Drawable f7521h;

    /* JADX INFO: renamed from: i */
    public final int f7522i;

    /* JADX INFO: renamed from: j */
    public final int f7523j;

    /* JADX INFO: renamed from: k */
    public int f7524k;

    /* JADX INFO: renamed from: l */
    public int f7525l;

    /* JADX INFO: renamed from: m */
    public float f7526m;

    /* JADX INFO: renamed from: n */
    public int f7527n;

    /* JADX INFO: renamed from: o */
    public int f7528o;

    /* JADX INFO: renamed from: p */
    public float f7529p;

    /* JADX INFO: renamed from: s */
    public final RecyclerView f7532s;

    /* JADX INFO: renamed from: z */
    public final ValueAnimator f7539z;

    /* JADX INFO: renamed from: q */
    public int f7530q = 0;

    /* JADX INFO: renamed from: r */
    public int f7531r = 0;

    /* JADX INFO: renamed from: t */
    public boolean f7533t = false;

    /* JADX INFO: renamed from: u */
    public boolean f7534u = false;

    /* JADX INFO: renamed from: v */
    public int f7535v = 0;

    /* JADX INFO: renamed from: w */
    public int f7536w = 0;

    /* JADX INFO: renamed from: x */
    public final int[] f7537x = new int[2];

    /* JADX INFO: renamed from: y */
    public final int[] f7538y = new int[2];

    public C1655l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i3, int i4, int i5) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f7539z = valueAnimatorOfFloat;
        this.f7512A = 0;
        RunnableC0153b runnableC0153b = new RunnableC0153b(14, this);
        this.f7513B = runnableC0153b;
        C1652i c1652i = new C1652i(this);
        this.f7516c = stateListDrawable;
        this.f7517d = drawable;
        this.f7520g = stateListDrawable2;
        this.f7521h = drawable2;
        this.f7518e = Math.max(i3, stateListDrawable.getIntrinsicWidth());
        this.f7519f = Math.max(i3, drawable.getIntrinsicWidth());
        this.f7522i = Math.max(i3, stateListDrawable2.getIntrinsicWidth());
        this.f7523j = Math.max(i3, drawable2.getIntrinsicWidth());
        this.f7514a = i4;
        this.f7515b = i5;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C1653j(this));
        valueAnimatorOfFloat.addUpdateListener(new C1654k(this));
        RecyclerView recyclerView2 = this.f7532s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC1621E abstractC1621E = recyclerView2.f4768s;
            if (abstractC1621E != null) {
                abstractC1621E.mo2725b("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f4772u;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m2755J();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f7532s;
            recyclerView3.f4774v.remove(this);
            if (recyclerView3.f4776w == this) {
                recyclerView3.f4776w = null;
            }
            ArrayList arrayList2 = this.f7532s.f4755l0;
            if (arrayList2 != null) {
                arrayList2.remove(c1652i);
            }
            this.f7532s.removeCallbacks(runnableC0153b);
        }
        this.f7532s = recyclerView;
        AbstractC1621E abstractC1621E2 = recyclerView.f4768s;
        if (abstractC1621E2 != null) {
            abstractC1621E2.mo2725b("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList3 = recyclerView.f4772u;
        if (arrayList3.isEmpty()) {
            recyclerView.setWillNotDraw(false);
        }
        arrayList3.add(this);
        recyclerView.m2755J();
        recyclerView.requestLayout();
        this.f7532s.f4774v.add(this);
        RecyclerView recyclerView4 = this.f7532s;
        if (recyclerView4.f4755l0 == null) {
            recyclerView4.f4755l0 = new ArrayList();
        }
        recyclerView4.f4755l0.add(c1652i);
    }

    /* JADX INFO: renamed from: c */
    public static int m4078c(float f, float f3, int[] iArr, int i3, int i4, int i5) {
        int i6 = iArr[1] - iArr[0];
        if (i6 != 0) {
            int i7 = i3 - i5;
            int i8 = (int) (((f3 - f) / i6) * i7);
            int i9 = i4 + i8;
            if (i9 < i7 && i9 >= 0) {
                return i8;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4079a(float f, float f3) {
        if (f3 < this.f7531r - this.f7522i) {
            return false;
        }
        int i3 = this.f7528o;
        int i4 = this.f7527n;
        return f >= ((float) (i3 - (i4 / 2))) && f <= ((float) ((i4 / 2) + i3));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4080b(float f, float f3) {
        RecyclerView recyclerView = this.f7532s;
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        boolean z3 = recyclerView.getLayoutDirection() == 1;
        int i3 = this.f7518e;
        if (!z3 ? f >= this.f7530q - i3 : f <= i3) {
            int i4 = this.f7525l;
            int i5 = this.f7524k / 2;
            if (f3 >= i4 - i5 && f3 <= i5 + i4) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final void m4081d(int i3) {
        RunnableC0153b runnableC0153b = this.f7513B;
        StateListDrawable stateListDrawable = this.f7516c;
        if (i3 == 2 && this.f7535v != 2) {
            stateListDrawable.setState(f7510C);
            this.f7532s.removeCallbacks(runnableC0153b);
        }
        if (i3 == 0) {
            this.f7532s.invalidate();
        } else {
            m4082e();
        }
        if (this.f7535v == 2 && i3 != 2) {
            stateListDrawable.setState(f7511D);
            this.f7532s.removeCallbacks(runnableC0153b);
            this.f7532s.postDelayed(runnableC0153b, 1200);
        } else if (i3 == 1) {
            this.f7532s.removeCallbacks(runnableC0153b);
            this.f7532s.postDelayed(runnableC0153b, 1500);
        }
        this.f7535v = i3;
    }

    /* JADX INFO: renamed from: e */
    public final void m4082e() {
        int i3 = this.f7512A;
        ValueAnimator valueAnimator = this.f7539z;
        if (i3 != 0) {
            if (i3 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f7512A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
