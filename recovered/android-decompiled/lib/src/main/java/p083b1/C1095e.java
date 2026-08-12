package p083b1;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.activity.RunnableC0892b;
import com.zuxoplayer.app.PlayerActivity;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: b1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1095e extends View implements InterfaceC1084M {

    /* JADX INFO: renamed from: A */
    public final StringBuilder f4990A;

    /* JADX INFO: renamed from: B */
    public final Formatter f4991B;

    /* JADX INFO: renamed from: C */
    public final RunnableC0892b f4992C;

    /* JADX INFO: renamed from: D */
    public final CopyOnWriteArraySet f4993D;

    /* JADX INFO: renamed from: E */
    public final Point f4994E;

    /* JADX INFO: renamed from: F */
    public final float f4995F;

    /* JADX INFO: renamed from: G */
    public int f4996G;

    /* JADX INFO: renamed from: H */
    public long f4997H;

    /* JADX INFO: renamed from: I */
    public int f4998I;

    /* JADX INFO: renamed from: J */
    public Rect f4999J;

    /* JADX INFO: renamed from: K */
    public final ValueAnimator f5000K;

    /* JADX INFO: renamed from: L */
    public float f5001L;

    /* JADX INFO: renamed from: M */
    public boolean f5002M;

    /* JADX INFO: renamed from: N */
    public boolean f5003N;

    /* JADX INFO: renamed from: O */
    public long f5004O;

    /* JADX INFO: renamed from: P */
    public long f5005P;

    /* JADX INFO: renamed from: Q */
    public long f5006Q;

    /* JADX INFO: renamed from: R */
    public long f5007R;

    /* JADX INFO: renamed from: S */
    public int f5008S;

    /* JADX INFO: renamed from: T */
    public long[] f5009T;

    /* JADX INFO: renamed from: U */
    public boolean[] f5010U;

    /* JADX INFO: renamed from: g */
    public final Rect f5011g;

    /* JADX INFO: renamed from: h */
    public final Rect f5012h;

    /* JADX INFO: renamed from: i */
    public final Rect f5013i;

    /* JADX INFO: renamed from: j */
    public final Rect f5014j;

    /* JADX INFO: renamed from: k */
    public final Paint f5015k;

    /* JADX INFO: renamed from: l */
    public final Paint f5016l;

    /* JADX INFO: renamed from: m */
    public final Paint f5017m;

    /* JADX INFO: renamed from: n */
    public final Paint f5018n;

    /* JADX INFO: renamed from: o */
    public final Paint f5019o;

    /* JADX INFO: renamed from: p */
    public final Paint f5020p;

    /* JADX INFO: renamed from: q */
    public final Drawable f5021q;

    /* JADX INFO: renamed from: r */
    public final int f5022r;

    /* JADX INFO: renamed from: s */
    public final int f5023s;

    /* JADX INFO: renamed from: t */
    public final int f5024t;

    /* JADX INFO: renamed from: u */
    public final int f5025u;

    /* JADX INFO: renamed from: v */
    public final int f5026v;

    /* JADX INFO: renamed from: w */
    public final int f5027w;

    /* JADX INFO: renamed from: x */
    public final int f5028x;

    /* JADX INFO: renamed from: y */
    public final int f5029y;

    /* JADX INFO: renamed from: z */
    public final int f5030z;

    public C1095e(PlayerActivity playerActivity, int i3) {
        super(playerActivity, null, 0);
        this.f5011g = new Rect();
        this.f5012h = new Rect();
        this.f5013i = new Rect();
        this.f5014j = new Rect();
        Paint paint = new Paint();
        this.f5015k = paint;
        Paint paint2 = new Paint();
        this.f5016l = paint2;
        Paint paint3 = new Paint();
        this.f5017m = paint3;
        Paint paint4 = new Paint();
        this.f5018n = paint4;
        Paint paint5 = new Paint();
        this.f5019o = paint5;
        Paint paint6 = new Paint();
        this.f5020p = paint6;
        paint6.setAntiAlias(true);
        this.f4993D = new CopyOnWriteArraySet();
        this.f4994E = new Point();
        float f = playerActivity.getResources().getDisplayMetrics().density;
        this.f4995F = f;
        this.f5030z = m2930a(-50, f);
        int iM2930a = m2930a(4, f);
        int iM2930a2 = m2930a(26, f);
        int iM2930a3 = m2930a(4, f);
        int iM2930a4 = m2930a(12, f);
        int iM2930a5 = m2930a(0, f);
        int iM2930a6 = m2930a(16, f);
        this.f5022r = iM2930a;
        this.f5023s = iM2930a2;
        this.f5024t = 0;
        this.f5025u = iM2930a3;
        this.f5026v = iM2930a4;
        this.f5027w = iM2930a5;
        this.f5028x = iM2930a6;
        paint.setColor(-1);
        paint6.setColor(-1);
        paint2.setColor(-855638017);
        paint3.setColor(872415231);
        paint4.setColor(-1291845888);
        paint5.setColor(872414976);
        this.f5021q = null;
        StringBuilder sb = new StringBuilder();
        this.f4990A = sb;
        this.f4991B = new Formatter(sb, Locale.getDefault());
        this.f4992C = new RunnableC0892b(6, this);
        this.f5029y = (Math.max(iM2930a5, Math.max(iM2930a4, iM2930a6)) + 1) / 2;
        this.f5001L = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f5000K = valueAnimator;
        valueAnimator.addUpdateListener(new C1111u(4, this));
        this.f5005P = -9223372036854775807L;
        this.f4997H = -9223372036854775807L;
        this.f4996G = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m2930a(int i3, float f) {
        return (int) ((i3 * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j3 = this.f4997H;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        long j4 = this.f5005P;
        if (j4 == -9223372036854775807L) {
            return 0L;
        }
        return j4 / ((long) this.f4996G);
    }

    private String getProgressText() {
        return AbstractC0632A.m1560A(this.f4990A, this.f4991B, this.f5006Q);
    }

    private long getScrubberPosition() {
        Rect rect = this.f5012h;
        if (rect.width() <= 0 || this.f5005P == -9223372036854775807L) {
            return 0L;
        }
        return (((long) this.f5014j.width()) * this.f5005P) / ((long) rect.width());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2931b(long j3) {
        long j4 = this.f5005P;
        if (j4 <= 0) {
            return false;
        }
        long j5 = this.f5003N ? this.f5004O : this.f5006Q;
        long jM1591j = AbstractC0632A.m1591j(j5 + j3, 0L, j4);
        if (jM1591j == j5) {
            return false;
        }
        if (this.f5003N) {
            m2935f(jM1591j);
        } else {
            m2932c(jM1591j);
        }
        m2934e();
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final void m2932c(long j3) {
        this.f5004O = j3;
        this.f5003N = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f4993D.iterator();
        while (it.hasNext()) {
            ((InterfaceC1083L) it.next()).mo2926g(j3);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2933d(boolean z3) {
        removeCallbacks(this.f4992C);
        this.f5003N = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f4993D.iterator();
        while (it.hasNext()) {
            ((InterfaceC1083L) it.next()).mo2927l(this.f5004O, z3);
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5021q;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2934e() {
        Rect rect = this.f5013i;
        Rect rect2 = this.f5012h;
        rect.set(rect2);
        Rect rect3 = this.f5014j;
        rect3.set(rect2);
        long j3 = this.f5003N ? this.f5004O : this.f5006Q;
        if (this.f5005P > 0) {
            rect.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * this.f5007R) / this.f5005P)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((((long) rect2.width()) * j3) / this.f5005P)), rect2.right);
        } else {
            int i3 = rect2.left;
            rect.right = i3;
            rect3.right = i3;
        }
        invalidate(this.f5011g);
    }

    /* JADX INFO: renamed from: f */
    public final void m2935f(long j3) {
        if (this.f5004O == j3) {
            return;
        }
        this.f5004O = j3;
        Iterator it = this.f4993D.iterator();
        while (it.hasNext()) {
            ((InterfaceC1083L) it.next()).mo2925d(j3);
        }
    }

    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f5012h.width() / this.f4995F);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j3 = this.f5005P;
        if (j3 == 0 || j3 == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j3 / ((long) iWidth);
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5021q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i3;
        canvas.save();
        Rect rect = this.f5012h;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i4 = iCenterY + iHeight;
        long j3 = this.f5005P;
        Paint paint = this.f5017m;
        Rect rect2 = this.f5014j;
        if (j3 <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i4, paint);
        } else {
            Rect rect3 = this.f5013i;
            int i5 = rect3.left;
            int i6 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i6), rect2.right);
            int i7 = rect.right;
            if (iMax < i7) {
                canvas.drawRect(iMax, iCenterY, i7, i4, paint);
            }
            int iMax2 = Math.max(i5, rect2.right);
            if (i6 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i6, i4, this.f5016l);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i4, this.f5015k);
            }
            if (this.f5008S != 0) {
                long[] jArr = this.f5009T;
                jArr.getClass();
                boolean[] zArr = this.f5010U;
                zArr.getClass();
                int i8 = this.f5025u;
                int i9 = i8 / 2;
                int i10 = 0;
                int i11 = 0;
                while (i11 < this.f5008S) {
                    int iMin = Math.min(rect.width() - i8, Math.max(i10, ((int) ((((long) rect.width()) * AbstractC0632A.m1591j(jArr[i11], 0L, this.f5005P)) / this.f5005P)) - i9)) + rect.left;
                    int i12 = i11;
                    canvas.drawRect(iMin, iCenterY, iMin + i8, i4, zArr[i11] ? this.f5019o : this.f5018n);
                    i11 = i12 + 1;
                    i10 = 0;
                }
            }
            canvas2 = canvas;
        }
        if (this.f5005P > 0) {
            int iM1590i = AbstractC0632A.m1590i(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f5021q;
            if (drawable == null) {
                if (this.f5003N || isFocused()) {
                    i3 = this.f5028x;
                } else {
                    i3 = isEnabled() ? this.f5026v : this.f5027w;
                }
                canvas2.drawCircle(iM1590i, iCenterY2, (int) ((i3 * this.f5001L) / 2.0f), this.f5020p);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f5001L)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f5001L)) / 2;
                drawable.setBounds(iM1590i - intrinsicWidth, iCenterY2 - intrinsicHeight, iM1590i + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z3, int i3, Rect rect) {
        super.onFocusChanged(z3, i3, rect);
        if (!this.f5003N || z3) {
            return;
        }
        m2933d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f5005P <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x001a  */
    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i3 != 66) {
                switch (i3) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (m2931b(positionIncrement)) {
                            RunnableC0892b runnableC0892b = this.f4992C;
                            removeCallbacks(runnableC0892b);
                            postDelayed(runnableC0892b, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (m2931b(positionIncrement)) {
                            RunnableC0892b runnableC0892b2 = this.f4992C;
                            removeCallbacks(runnableC0892b2);
                            postDelayed(runnableC0892b2, 1000L);
                            return true;
                        }
                        break;
                    case 23:
                        if (this.f5003N) {
                            m2933d(false);
                            return true;
                        }
                        break;
                }
            } else if (this.f5003N) {
                m2933d(false);
                return true;
            }
        }
        return super.onKeyDown(i3, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i7 = i5 - i3;
        int i8 = i6 - i4;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i7 - getPaddingRight();
        int i9 = this.f5002M ? 0 : this.f5029y;
        int i10 = this.f5024t;
        int i11 = this.f5022r;
        int i12 = this.f5023s;
        if (i10 == 1) {
            paddingBottom = (i8 - getPaddingBottom()) - i12;
            paddingBottom2 = ((i8 - getPaddingBottom()) - i11) - Math.max(i9 - (i11 / 2), 0);
        } else {
            paddingBottom = (i8 - i12) / 2;
            paddingBottom2 = (i8 - i11) / 2;
        }
        Rect rect2 = this.f5011g;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i12 + paddingBottom);
        this.f5012h.set(rect2.left + i9, paddingBottom2, rect2.right - i9, i11 + paddingBottom2);
        if (AbstractC0632A.f2454a >= 29 && ((rect = this.f4999J) == null || rect.width() != i7 || this.f4999J.height() != i8)) {
            Rect rect3 = new Rect(0, 0, i7, i8);
            this.f4999J = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        m2934e();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int i5 = this.f5023s;
        if (mode == 0) {
            size = i5;
        } else if (mode != 1073741824) {
            size = Math.min(i5, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i3), size);
        Drawable drawable = this.f5021q;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i3) {
        Drawable drawable = this.f5021q;
        if (drawable == null || AbstractC0632A.f2454a < 23 || !drawable.setLayoutDirection(i3)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f5005P > 0) {
            Point point = this.f4994E;
            point.set((int) motionEvent.getX(), (int) motionEvent.getY());
            int i3 = point.x;
            int i4 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f5014j;
            Rect rect2 = this.f5012h;
            if (action == 0) {
                int i5 = i3;
                if (this.f5011g.contains(i5, i4)) {
                    rect.right = AbstractC0632A.m1590i(i5, rect2.left, rect2.right);
                    m2932c(getScrubberPosition());
                    m2934e();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f5003N) {
                    m2933d(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                    if (this.f5003N) {
                        m2933d(motionEvent.getAction() == 3);
                        return true;
                    }
                }
            } else if (this.f5003N) {
                if (i4 < this.f5030z) {
                    int i6 = this.f4998I;
                    rect.right = AbstractC0632A.m1590i(((i3 - i6) / 3) + i6, rect2.left, rect2.right);
                } else {
                    this.f4998I = i3;
                    rect.right = AbstractC0632A.m1590i(i3, rect2.left, rect2.right);
                }
                m2935f(getScrubberPosition());
                m2934e();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i3, Bundle bundle) {
        if (super.performAccessibilityAction(i3, bundle)) {
            return true;
        }
        if (this.f5005P <= 0) {
            return false;
        }
        if (i3 == 8192) {
            if (m2931b(-getPositionIncrement())) {
                m2933d(false);
            }
        } else {
            if (i3 != 4096) {
                return false;
            }
            if (m2931b(getPositionIncrement())) {
                m2933d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i3) {
        this.f5018n.setColor(i3);
        invalidate(this.f5011g);
    }

    public void setBufferedColor(int i3) {
        this.f5016l.setColor(i3);
        invalidate(this.f5011g);
    }

    public void setBufferedPosition(long j3) {
        if (this.f5007R == j3) {
            return;
        }
        this.f5007R = j3;
        m2934e();
    }

    public void setDuration(long j3) {
        if (this.f5005P == j3) {
            return;
        }
        this.f5005P = j3;
        if (this.f5003N && j3 == -9223372036854775807L) {
            m2933d(true);
        }
        m2934e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        if (!this.f5003N || z3) {
            return;
        }
        m2933d(true);
    }

    public void setKeyCountIncrement(int i3) {
        AbstractC0646n.m1625c(i3 > 0);
        this.f4996G = i3;
        this.f4997H = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j3) {
        AbstractC0646n.m1625c(j3 > 0);
        this.f4996G = -1;
        this.f4997H = j3;
    }

    public void setPlayedAdMarkerColor(int i3) {
        this.f5019o.setColor(i3);
        invalidate(this.f5011g);
    }

    public void setPlayedColor(int i3) {
        this.f5015k.setColor(i3);
        invalidate(this.f5011g);
    }

    public void setPosition(long j3) {
        if (this.f5006Q == j3) {
            return;
        }
        this.f5006Q = j3;
        setContentDescription(getProgressText());
        m2934e();
    }

    public void setScrubberColor(int i3) {
        this.f5020p.setColor(i3);
        invalidate(this.f5011g);
    }

    public void setUnplayedColor(int i3) {
        this.f5017m.setColor(i3);
        invalidate(this.f5011g);
    }
}
