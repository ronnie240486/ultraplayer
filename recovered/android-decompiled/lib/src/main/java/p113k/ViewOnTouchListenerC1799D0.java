package p113k;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: k.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC1799D0 implements View.OnTouchListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC1801E0 f7996g;

    public ViewOnTouchListenerC1799D0(AbstractC1801E0 abstractC1801E0) {
        this.f7996g = abstractC1801E0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1905z c1905z;
        int action = motionEvent.getAction();
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        AbstractC1801E0 abstractC1801E0 = this.f7996g;
        if (action == 0 && (c1905z = abstractC1801E0.f8004E) != null && c1905z.isShowing() && x3 >= 0 && x3 < abstractC1801E0.f8004E.getWidth() && y3 >= 0 && y3 < abstractC1801E0.f8004E.getHeight()) {
            abstractC1801E0.f8000A.postDelayed(abstractC1801E0.f8021w, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        abstractC1801E0.f8000A.removeCallbacks(abstractC1801E0.f8021w);
        return false;
    }
}
