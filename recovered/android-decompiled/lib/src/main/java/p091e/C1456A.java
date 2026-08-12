package p091e;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import p060U1.AbstractC0610a;
import p106i.C1735c;

/* JADX INFO: renamed from: e.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1456A extends ContentFrameLayout {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ LayoutInflaterFactory2C1458C f6426o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1456A(LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C, C1735c c1735c) {
        super(c1735c, null);
        this.f6426o = layoutInflaterFactory2C1458C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f6426o.m3668t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (x3 < -5 || y3 < -5 || x3 > getWidth() + 5 || y3 > getHeight() + 5) {
                LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = this.f6426o;
                layoutInflaterFactory2C1458C.m3667r(layoutInflaterFactory2C1458C.m3673z(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i3) {
        setBackgroundDrawable(AbstractC0610a.m1512n(getContext(), i3));
    }
}
