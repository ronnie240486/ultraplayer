package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class InnerZoneDrawable extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f5474a;

    /* JADX INFO: renamed from: b */
    public float f5475b;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f5475b > 0.0f) {
            throw null;
        }
        canvas.drawCircle(0.0f, 0.0f, this.f5474a * 0.0f, null);
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

    public void setPulseAlpha(float f) {
        this.f5475b = f;
        invalidateSelf();
    }

    public void setPulseScale(float f) {
        invalidateSelf();
    }

    public void setScale(float f) {
        this.f5474a = f;
        invalidateSelf();
    }
}
