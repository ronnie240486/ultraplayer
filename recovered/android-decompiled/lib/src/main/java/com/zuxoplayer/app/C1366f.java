package com.zuxoplayer.app;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import p014F.RunnableC0153b;

/* JADX INFO: renamed from: com.zuxoplayer.app.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1366f extends View {

    /* JADX INFO: renamed from: g */
    public final Paint f6077g;

    /* JADX INFO: renamed from: h */
    public final RectF f6078h;

    /* JADX INFO: renamed from: i */
    public float f6079i;

    /* JADX INFO: renamed from: j */
    public boolean f6080j;

    /* JADX INFO: renamed from: k */
    public final RunnableC0153b f6081k;

    public C1366f(MainActivity mainActivity) {
        super(mainActivity);
        Paint paint = new Paint(1);
        this.f6077g = paint;
        this.f6078h = new RectF();
        this.f6079i = 0.0f;
        this.f6080j = false;
        this.f6081k = new RunnableC0153b(11, this);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-15681151);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6080j = true;
        postOnAnimation(this.f6081k);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.f6080j = false;
        removeCallbacks(this.f6081k);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float fMax = Math.max(3.0f, getWidth() / 10.0f);
        Paint paint = this.f6077g;
        paint.setStrokeWidth(fMax);
        RectF rectF = this.f6078h;
        rectF.set(fMax, fMax, getWidth() - fMax, getHeight() - fMax);
        canvas.drawArc(rectF, this.f6079i, 270.0f, false, paint);
    }
}
