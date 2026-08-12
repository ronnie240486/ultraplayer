package p152u;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: u.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2288j extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public int f9757a;

    /* JADX INFO: renamed from: b */
    public Drawable.ConstantState f9758b;

    /* JADX INFO: renamed from: c */
    public ColorStateList f9759c;

    /* JADX INFO: renamed from: d */
    public PorterDuff.Mode f9760d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        int i3 = this.f9757a;
        Drawable.ConstantState constantState = this.f9758b;
        return i3 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C2287i c2287i = new C2287i();
        c2287i.f9754j = this;
        Drawable.ConstantState constantState = this.f9758b;
        if (constantState != null) {
            c2287i.m4913h(constantState.newDrawable(resources));
        }
        C2287i.m4906a();
        return c2287i;
    }
}
