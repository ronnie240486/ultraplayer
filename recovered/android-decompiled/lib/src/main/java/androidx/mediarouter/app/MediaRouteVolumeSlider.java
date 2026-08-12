package androidx.mediarouter.app;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.util.Log;
import com.google.android.gms.internal.cast.AbstractC1303m;
import p113k.C1802F;

/* JADX INFO: loaded from: classes.dex */
class MediaRouteVolumeSlider extends C1802F {

    /* JADX INFO: renamed from: h */
    public final float f4464h;

    /* JADX INFO: renamed from: i */
    public boolean f4465i;

    /* JADX INFO: renamed from: j */
    public Drawable f4466j;

    /* JADX INFO: renamed from: k */
    public int f4467k;

    /* JADX INFO: renamed from: l */
    public int f4468l;

    public MediaRouteVolumeSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4464h = AbstractC1303m.m3322o(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m2618a(int i3, int i4) {
        if (this.f4467k != i3) {
            if (Color.alpha(i3) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider progress and thumb color cannot be translucent: #" + Integer.toHexString(i3));
            }
            this.f4467k = i3;
        }
        if (this.f4468l != i4) {
            if (Color.alpha(i4) != 255) {
                Log.e("MediaRouteVolumeSlider", "Volume slider background color cannot be translucent: #" + Integer.toHexString(i4));
            }
            this.f4468l = i4;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2619b(boolean z3) {
        if (this.f4465i == z3) {
            return;
        }
        this.f4465i = z3;
        super.setThumb(z3 ? null : this.f4466j);
    }

    @Override // p113k.C1802F, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int i3 = isEnabled() ? 255 : (int) (this.f4464h * 255.0f);
        Drawable drawable = this.f4466j;
        int i4 = this.f4467k;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawable.setColorFilter(i4, mode);
        this.f4466j.setAlpha(i3);
        Drawable progressDrawable = getProgressDrawable();
        if (progressDrawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) getProgressDrawable();
            Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
            layerDrawable.findDrawableByLayerId(R.id.background).setColorFilter(this.f4468l, mode);
            progressDrawable = drawableFindDrawableByLayerId;
        }
        progressDrawable.setColorFilter(this.f4467k, mode);
        progressDrawable.setAlpha(i3);
    }

    @Override // android.widget.AbsSeekBar
    public final void setThumb(Drawable drawable) {
        this.f4466j = drawable;
        if (this.f4465i) {
            drawable = null;
        }
        super.setThumb(drawable);
    }
}
