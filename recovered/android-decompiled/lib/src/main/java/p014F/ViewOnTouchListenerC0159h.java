package p014F;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;
import p000A.AbstractC0016Q;
import p113k.C1890r0;

/* JADX INFO: renamed from: F.h */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC0159h implements View.OnTouchListener {

    /* JADX INFO: renamed from: x */
    public static final int f371x = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: g */
    public final C0152a f372g;

    /* JADX INFO: renamed from: h */
    public final AccelerateInterpolator f373h;

    /* JADX INFO: renamed from: i */
    public final ListView f374i;

    /* JADX INFO: renamed from: j */
    public RunnableC0153b f375j;

    /* JADX INFO: renamed from: k */
    public final float[] f376k;

    /* JADX INFO: renamed from: l */
    public final float[] f377l;

    /* JADX INFO: renamed from: m */
    public final int f378m;

    /* JADX INFO: renamed from: n */
    public final int f379n;

    /* JADX INFO: renamed from: o */
    public final float[] f380o;

    /* JADX INFO: renamed from: p */
    public final float[] f381p;

    /* JADX INFO: renamed from: q */
    public final float[] f382q;

    /* JADX INFO: renamed from: r */
    public boolean f383r;

    /* JADX INFO: renamed from: s */
    public boolean f384s;

    /* JADX INFO: renamed from: t */
    public boolean f385t;

    /* JADX INFO: renamed from: u */
    public boolean f386u;

    /* JADX INFO: renamed from: v */
    public boolean f387v;

    /* JADX INFO: renamed from: w */
    public final C1890r0 f388w;

    public ViewOnTouchListenerC0159h(C1890r0 c1890r0) {
        C0152a c0152a = new C0152a();
        c0152a.f364e = Long.MIN_VALUE;
        c0152a.f366g = -1L;
        c0152a.f365f = 0L;
        this.f372g = c0152a;
        this.f373h = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f376k = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f377l = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f380o = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f381p = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f382q = fArr5;
        this.f374i = c1890r0;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f378m = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f379n = f371x;
        c0152a.f360a = 500;
        c0152a.f361b = 500;
        this.f388w = c1890r0;
    }

    /* JADX INFO: renamed from: b */
    public static float m622b(float f, float f3, float f4) {
        if (f > f4) {
            return f4;
        }
        return f < f3 ? f3 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX INFO: renamed from: a */
    public final float m623a(int i3, float f, float f3, float f4) {
        float fM622b;
        float interpolation;
        float fM622b2 = m622b(this.f376k[i3] * f3, 0.0f, this.f377l[i3]);
        float fM624c = m624c(f3 - f, fM622b2) - m624c(f, fM622b2);
        AccelerateInterpolator accelerateInterpolator = this.f373h;
        if (fM624c >= 0.0f) {
            if (fM624c > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fM624c);
            } else {
                fM622b = 0.0f;
            }
            if (fM622b == 0.0f) {
                return 0.0f;
            }
            float f5 = this.f380o[i3];
            float f6 = this.f381p[i3];
            float f7 = this.f382q[i3];
            float f8 = f5 * f4;
            return fM622b > 0.0f ? m622b(fM622b * f8, f6, f7) : -m622b((-fM622b) * f8, f6, f7);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fM624c);
        fM622b = m622b(interpolation, -1.0f, 1.0f);
        if (fM622b == 0.0f) {
            return 0.0f;
        }
        float f9 = this.f380o[i3];
        float f10 = this.f381p[i3];
        float f11 = this.f382q[i3];
        float f12 = f9 * f4;
        if (fM622b > 0.0f) {
        }
    }

    /* JADX INFO: renamed from: c */
    public final float m624c(float f, float f3) {
        if (f3 != 0.0f) {
            int i3 = this.f378m;
            if (i3 == 0 || i3 == 1) {
                if (f < f3) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f3);
                    }
                    if (this.f386u && i3 == 1) {
                        return 1.0f;
                    }
                }
            } else if (i3 == 2 && f < 0.0f) {
                return f / (-f3);
            }
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public final void m625d() {
        int i3 = 0;
        if (this.f384s) {
            this.f386u = false;
            return;
        }
        C0152a c0152a = this.f372g;
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i4 = (int) (jCurrentAnimationTimeMillis - c0152a.f364e);
        int i5 = c0152a.f361b;
        if (i4 > i5) {
            i3 = i5;
        } else if (i4 >= 0) {
            i3 = i4;
        }
        c0152a.f368i = i3;
        c0152a.f367h = c0152a.m608a(jCurrentAnimationTimeMillis);
        c0152a.f366g = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m626e() {
        C1890r0 c1890r0;
        int count;
        C0152a c0152a = this.f372g;
        float f = c0152a.f363d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c0152a.f362c);
        if (iAbs != 0 && (count = (c1890r0 = this.f388w).getCount()) != 0) {
            int childCount = c1890r0.getChildCount();
            int firstVisiblePosition = c1890r0.getFirstVisiblePosition();
            int i3 = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c1890r0.getChildAt(0).getTop() >= 0)) : !(i3 >= count && c1890r0.getChildAt(childCount - 1).getBottom() <= c1890r0.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i3;
        int i4 = 0;
        if (this.f387v) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                m625d();
                return false;
            }
            this.f385t = true;
            this.f383r = false;
            float x3 = motionEvent.getX();
            float width = view.getWidth();
            ListView listView = this.f374i;
            float fM623a = m623a(0, x3, width, listView.getWidth());
            float fM623a2 = m623a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
            C0152a c0152a = this.f372g;
            c0152a.f362c = fM623a;
            c0152a.f363d = fM623a2;
            if (!this.f386u && m626e()) {
                if (this.f375j == null) {
                    this.f375j = new RunnableC0153b(i4, this);
                }
                this.f386u = true;
                this.f384s = true;
                if (this.f383r || (i3 = this.f379n) <= 0) {
                    this.f375j.run();
                } else {
                    RunnableC0153b runnableC0153b = this.f375j;
                    long j3 = i3;
                    WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                    listView.postOnAnimationDelayed(runnableC0153b, j3);
                }
                this.f383r = true;
            }
        }
        return false;
    }
}
