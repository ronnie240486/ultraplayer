package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class OuterHighlightDrawable extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f5476a;

    /* JADX INFO: renamed from: b */
    public float f5477b;

    /* JADX INFO: renamed from: c */
    public float f5478c;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawCircle(this.f5477b + 0.0f, this.f5478c + 0.0f, 0.0f * this.f5476a, null);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        throw null;
    }

    public void setScale(float f) {
        this.f5476a = f;
        invalidateSelf();
    }

    public void setTranslationX(float f) {
        this.f5477b = f;
        invalidateSelf();
    }

    public void setTranslationY(float f) {
        this.f5478c = f;
        invalidateSelf();
    }
}
