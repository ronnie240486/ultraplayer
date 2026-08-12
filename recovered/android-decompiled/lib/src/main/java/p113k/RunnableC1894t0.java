package p113k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: k.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1894t0 implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8266g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractViewOnTouchListenerC1896u0 f8267h;

    public /* synthetic */ RunnableC1894t0(AbstractViewOnTouchListenerC1896u0 abstractViewOnTouchListenerC1896u0, int i3) {
        this.f8266g = i3;
        this.f8267h = abstractViewOnTouchListenerC1896u0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8266g) {
            case 0:
                ViewParent parent = this.f8267h.f8277j.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                AbstractViewOnTouchListenerC1896u0 abstractViewOnTouchListenerC1896u0 = this.f8267h;
                abstractViewOnTouchListenerC1896u0.m4411a();
                View view = abstractViewOnTouchListenerC1896u0.f8277j;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC1896u0.mo4239c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC1896u0.f8280m = true;
                    break;
                }
                break;
        }
    }
}
