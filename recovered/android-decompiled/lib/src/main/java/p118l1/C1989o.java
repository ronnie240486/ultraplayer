package p118l1;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: renamed from: l1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1989o extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public final Drawable.ConstantState f8687a;

    public C1989o(Drawable.ConstantState constantState) {
        this.f8687a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f8687a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f8687a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C1990p c1990p = new C1990p();
        c1990p.f8633g = (VectorDrawable) this.f8687a.newDrawable();
        return c1990p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C1990p c1990p = new C1990p();
        c1990p.f8633g = (VectorDrawable) this.f8687a.newDrawable(resources);
        return c1990p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1990p c1990p = new C1990p();
        c1990p.f8633g = (VectorDrawable) this.f8687a.newDrawable(resources, theme);
        return c1990p;
    }
}
