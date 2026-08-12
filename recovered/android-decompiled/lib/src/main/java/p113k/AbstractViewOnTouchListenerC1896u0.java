package p113k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import p110j.InterfaceC1757C;

/* JADX INFO: renamed from: k.u0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC1896u0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: g */
    public final float f8274g;

    /* JADX INFO: renamed from: h */
    public final int f8275h;

    /* JADX INFO: renamed from: i */
    public final int f8276i;

    /* JADX INFO: renamed from: j */
    public final View f8277j;

    /* JADX INFO: renamed from: k */
    public RunnableC1894t0 f8278k;

    /* JADX INFO: renamed from: l */
    public RunnableC1894t0 f8279l;

    /* JADX INFO: renamed from: m */
    public boolean f8280m;

    /* JADX INFO: renamed from: n */
    public int f8281n;

    /* JADX INFO: renamed from: o */
    public final int[] f8282o = new int[2];

    public AbstractViewOnTouchListenerC1896u0(View view) {
        this.f8277j = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f8274g = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f8275h = tapTimeout;
        this.f8276i = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m4411a() {
        RunnableC1894t0 runnableC1894t0 = this.f8279l;
        View view = this.f8277j;
        if (runnableC1894t0 != null) {
            view.removeCallbacks(runnableC1894t0);
        }
        RunnableC1894t0 runnableC1894t1 = this.f8278k;
        if (runnableC1894t1 != null) {
            view.removeCallbacks(runnableC1894t1);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceC1757C mo4238b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo4239c();

    /* JADX INFO: renamed from: d */
    public boolean mo4240d() {
        InterfaceC1757C interfaceC1757CMo4238b = mo4238b();
        if (interfaceC1757CMo4238b == null || !interfaceC1757CMo4238b.mo4211b()) {
            return true;
        }
        interfaceC1757CMo4238b.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z3;
        C1890r0 c1890r0Mo4213j;
        boolean z4 = this.f8280m;
        View view2 = this.f8277j;
        if (z4) {
            InterfaceC1757C interfaceC1757CMo4238b = mo4238b();
            if (interfaceC1757CMo4238b != null && interfaceC1757CMo4238b.mo4211b() && (c1890r0Mo4213j = interfaceC1757CMo4238b.mo4213j()) != null && c1890r0Mo4213j.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f8282o;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c1890r0Mo4213j.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM4406b = c1890r0Mo4213j.m4406b(motionEventObtainNoHistory, this.f8281n);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z5 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zM4406b && z5) {
                    z3 = true;
                } else if (mo4240d()) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else if (mo4240d()) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f8281n = motionEvent.getPointerId(0);
                    if (this.f8278k == null) {
                        this.f8278k = new RunnableC1894t0(this, 0);
                    }
                    view2.postDelayed(this.f8278k, this.f8275h);
                    if (this.f8279l == null) {
                        this.f8279l = new RunnableC1894t0(this, 1);
                    }
                    view2.postDelayed(this.f8279l, this.f8276i);
                } else if (actionMasked2 == 1) {
                    m4411a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f8281n);
                    if (iFindPointerIndex >= 0) {
                        float x3 = motionEvent.getX(iFindPointerIndex);
                        float y3 = motionEvent.getY(iFindPointerIndex);
                        float f = this.f8274g;
                        float f3 = -f;
                        if (x3 < f3 || y3 < f3 || x3 >= (view2.getRight() - view2.getLeft()) + f || y3 >= (view2.getBottom() - view2.getTop()) + f) {
                            m4411a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z3 = mo4239c();
                        }
                    }
                } else if (actionMasked2 == 3) {
                    m4411a();
                }
            }
            if (z3) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f8280m = z3;
        return z3 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f8280m = false;
        this.f8281n = -1;
        RunnableC1894t0 runnableC1894t0 = this.f8278k;
        if (runnableC1894t0 != null) {
            this.f8277j.removeCallbacks(runnableC1894t0);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
