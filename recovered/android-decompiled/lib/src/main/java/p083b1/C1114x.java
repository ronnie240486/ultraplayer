package p083b1;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.mediarouter.app.ViewOnClickListenerC1034c;
import com.zuxoplayer.app.R;
import java.util.ArrayList;

/* JADX INFO: renamed from: b1.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1114x {

    /* JADX INFO: renamed from: A */
    public boolean f5146A;

    /* JADX INFO: renamed from: B */
    public boolean f5147B;

    /* JADX INFO: renamed from: a */
    public final C1109s f5149a;

    /* JADX INFO: renamed from: b */
    public final View f5150b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f5151c;

    /* JADX INFO: renamed from: d */
    public final ViewGroup f5152d;

    /* JADX INFO: renamed from: e */
    public final ViewGroup f5153e;

    /* JADX INFO: renamed from: f */
    public final ViewGroup f5154f;

    /* JADX INFO: renamed from: g */
    public final ViewGroup f5155g;

    /* JADX INFO: renamed from: h */
    public final ViewGroup f5156h;

    /* JADX INFO: renamed from: i */
    public final ViewGroup f5157i;

    /* JADX INFO: renamed from: j */
    public final View f5158j;

    /* JADX INFO: renamed from: k */
    public final View f5159k;

    /* JADX INFO: renamed from: l */
    public final AnimatorSet f5160l;

    /* JADX INFO: renamed from: m */
    public final AnimatorSet f5161m;

    /* JADX INFO: renamed from: n */
    public final AnimatorSet f5162n;

    /* JADX INFO: renamed from: o */
    public final AnimatorSet f5163o;

    /* JADX INFO: renamed from: p */
    public final AnimatorSet f5164p;

    /* JADX INFO: renamed from: q */
    public final ValueAnimator f5165q;

    /* JADX INFO: renamed from: r */
    public final ValueAnimator f5166r;

    /* JADX INFO: renamed from: s */
    public final RunnableC1110t f5167s = new RunnableC1110t(this, 0);

    /* JADX INFO: renamed from: t */
    public final RunnableC1110t f5168t = new RunnableC1110t(this, 3);

    /* JADX INFO: renamed from: u */
    public final RunnableC1110t f5169u = new RunnableC1110t(this, 4);

    /* JADX INFO: renamed from: v */
    public final RunnableC1110t f5170v = new RunnableC1110t(this, 5);

    /* JADX INFO: renamed from: w */
    public final RunnableC1110t f5171w = new RunnableC1110t(this, 6);

    /* JADX INFO: renamed from: x */
    public final ViewOnLayoutChangeListenerC1096f f5172x = new ViewOnLayoutChangeListenerC1096f(1, this);

    /* JADX INFO: renamed from: C */
    public boolean f5148C = true;

    /* JADX INFO: renamed from: z */
    public int f5174z = 0;

    /* JADX INFO: renamed from: y */
    public final ArrayList f5173y = new ArrayList();

    public C1114x(C1109s c1109s) {
        this.f5149a = c1109s;
        int i3 = 5;
        this.f5150b = c1109s.findViewById(R.id.exo_controls_background);
        this.f5151c = (ViewGroup) c1109s.findViewById(R.id.exo_center_controls);
        this.f5153e = (ViewGroup) c1109s.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) c1109s.findViewById(R.id.exo_bottom_bar);
        this.f5152d = viewGroup;
        this.f5157i = (ViewGroup) c1109s.findViewById(R.id.exo_time);
        View viewFindViewById = c1109s.findViewById(R.id.exo_progress);
        this.f5158j = viewFindViewById;
        this.f5154f = (ViewGroup) c1109s.findViewById(R.id.exo_basic_controls);
        this.f5155g = (ViewGroup) c1109s.findViewById(R.id.exo_extra_controls);
        this.f5156h = (ViewGroup) c1109s.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = c1109s.findViewById(R.id.exo_overflow_show);
        this.f5159k = viewFindViewById2;
        View viewFindViewById3 = c1109s.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC1034c(i3, this));
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC1034c(i3, this));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new C1111u(3, this));
        valueAnimatorOfFloat.addListener(new C1112v(0, this));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new C1111u(0, this));
        valueAnimatorOfFloat2.addListener(new C1112v(1, this));
        Resources resources = c1109s.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5160l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new C1113w(this, c1109s, 0));
        animatorSet.play(valueAnimatorOfFloat).with(m2963d(viewFindViewById, 0.0f, dimension)).with(m2963d(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f5161m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new C1113w(this, c1109s, 1));
        animatorSet2.play(m2963d(viewFindViewById, dimension, dimension2)).with(m2963d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f5162n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new C1113w(this, c1109s, 2));
        animatorSet3.play(valueAnimatorOfFloat).with(m2963d(viewFindViewById, 0.0f, dimension2)).with(m2963d(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f5163o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new C1112v(2, this));
        animatorSet4.play(valueAnimatorOfFloat2).with(m2963d(viewFindViewById, dimension, 0.0f)).with(m2963d(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f5164p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new C1112v(3, this));
        animatorSet5.play(valueAnimatorOfFloat2).with(m2963d(viewFindViewById, dimension2, 0.0f)).with(m2963d(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5165q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new C1111u(1, this));
        valueAnimatorOfFloat3.addListener(new C1112v(4, this));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f5166r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new C1111u(2, this));
        valueAnimatorOfFloat4.addListener(new C1112v(5, this));
    }

    /* JADX INFO: renamed from: c */
    public static int m2962c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    /* JADX INFO: renamed from: d */
    public static ObjectAnimator m2963d(View view, float f, float f3) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f3);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2964j(View view) {
        int id = view.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    /* JADX INFO: renamed from: a */
    public final void m2965a(float f) {
        ViewGroup viewGroup = this.f5156h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f5157i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup3 = this.f5154f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2966b(View view) {
        return view != null && this.f5173y.contains(view);
    }

    /* JADX INFO: renamed from: e */
    public final void m2967e(Runnable runnable, long j3) {
        if (j3 >= 0) {
            this.f5149a.postDelayed(runnable, j3);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2968f() {
        RunnableC1110t runnableC1110t = this.f5171w;
        C1109s c1109s = this.f5149a;
        c1109s.removeCallbacks(runnableC1110t);
        c1109s.removeCallbacks(this.f5168t);
        c1109s.removeCallbacks(this.f5170v);
        c1109s.removeCallbacks(this.f5169u);
    }

    /* JADX INFO: renamed from: g */
    public final void m2969g() {
        if (this.f5174z == 3) {
            return;
        }
        m2968f();
        int showTimeoutMs = this.f5149a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f5148C) {
                m2967e(this.f5171w, showTimeoutMs);
            } else if (this.f5174z == 1) {
                m2967e(this.f5169u, 2000L);
            } else {
                m2967e(this.f5170v, showTimeoutMs);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m2970h(View view, boolean z3) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f5173y;
        if (!z3) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f5146A && m2964j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    /* JADX INFO: renamed from: i */
    public final void m2971i(int i3) {
        int i4 = this.f5174z;
        this.f5174z = i3;
        C1109s c1109s = this.f5149a;
        if (i3 == 2) {
            c1109s.setVisibility(8);
        } else if (i4 == 2) {
            c1109s.setVisibility(0);
        }
        if (i4 != i3) {
            for (InterfaceC1108r interfaceC1108r : c1109s.f5103j) {
                c1109s.getVisibility();
                ((ViewOnClickListenerC1072A) interfaceC1108r).f4885i.m2917l();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2972k() {
        if (!this.f5148C) {
            m2971i(0);
            m2969g();
            return;
        }
        int i3 = this.f5174z;
        if (i3 == 1) {
            this.f5163o.start();
        } else if (i3 == 2) {
            this.f5164p.start();
        } else if (i3 == 3) {
            this.f5147B = true;
        } else if (i3 == 4) {
            return;
        }
        m2969g();
    }
}
