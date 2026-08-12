package p141r0;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: r0.l */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC2195l extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, InterfaceC2186c {

    /* JADX INFO: renamed from: i */
    public final C2193j f9473i;

    /* JADX INFO: renamed from: k */
    public final GestureDetector f9475k;

    /* JADX INFO: renamed from: g */
    public final PointF f9471g = new PointF();

    /* JADX INFO: renamed from: h */
    public final PointF f9472h = new PointF();

    /* JADX INFO: renamed from: j */
    public final float f9474j = 25.0f;

    /* JADX INFO: renamed from: l */
    public volatile float f9476l = 3.1415927f;

    public ViewOnTouchListenerC2195l(Context context, C2193j c2193j) {
        this.f9473i = c2193j;
        this.f9475k = new GestureDetector(context, this);
    }

    @Override // p141r0.InterfaceC2186c
    /* JADX INFO: renamed from: a */
    public final void mo4771a(float[] fArr, float f) {
        this.f9476l = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f9471g.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f3) {
        float x3 = (motionEvent2.getX() - this.f9471g.x) / this.f9474j;
        float y3 = motionEvent2.getY();
        PointF pointF = this.f9471g;
        float f4 = (y3 - pointF.y) / this.f9474j;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d3 = this.f9476l;
        float fCos = (float) Math.cos(d3);
        float fSin = (float) Math.sin(d3);
        PointF pointF2 = this.f9472h;
        pointF2.x -= (fCos * x3) - (fSin * f4);
        float f5 = (fCos * f4) + (fSin * x3) + pointF2.y;
        pointF2.y = f5;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f5));
        C2193j c2193j = this.f9473i;
        PointF pointF3 = this.f9472h;
        synchronized (c2193j) {
            float f6 = pointF3.y;
            c2193j.f9455m = f6;
            Matrix.setRotateM(c2193j.f9453k, 0, -f6, (float) Math.cos(c2193j.f9456n), (float) Math.sin(c2193j.f9456n), 0.0f);
            Matrix.setRotateM(c2193j.f9454l, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f9473i.f9459q.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f9475k.onTouchEvent(motionEvent);
    }
}
