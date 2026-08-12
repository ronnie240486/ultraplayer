package p118l1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1977c extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable.ConstantState f8627a;

    public C1977c(Drawable.ConstantState constantState) {
        this.f8627a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f8627a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f8627a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C1978d c1978d = new C1978d(null);
        Drawable drawableNewDrawable = this.f8627a.newDrawable();
        c1978d.f8633g = drawableNewDrawable;
        drawableNewDrawable.setCallback(c1978d.f8630j);
        return c1978d;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C1978d c1978d = new C1978d(null);
        Drawable drawableNewDrawable = this.f8627a.newDrawable(resources);
        c1978d.f8633g = drawableNewDrawable;
        drawableNewDrawable.setCallback(c1978d.f8630j);
        return c1978d;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1978d c1978d = new C1978d(null);
        Drawable drawableNewDrawable = this.f8627a.newDrawable(resources, theme);
        c1978d.f8633g = drawableNewDrawable;
        drawableNewDrawable.setCallback(c1978d.f8630j);
        return c1978d;
    }
}
