package p152u;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: u.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2287i extends Drawable implements Drawable.Callback, InterfaceC2286h, InterfaceC2285g {

    /* JADX INFO: renamed from: m */
    public static final PorterDuff.Mode f9749m = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: n */
    public static Method f9750n;

    /* JADX INFO: renamed from: g */
    public int f9751g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f9752h;

    /* JADX INFO: renamed from: i */
    public boolean f9753i;

    /* JADX INFO: renamed from: j */
    public C2288j f9754j;

    /* JADX INFO: renamed from: k */
    public boolean f9755k;

    /* JADX INFO: renamed from: l */
    public Drawable f9756l;

    /* JADX INFO: renamed from: a */
    public static void m4906a() {
        if (f9750n == null) {
            try {
                f9750n = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception e3) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4907b() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f9756l;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    /* JADX INFO: renamed from: c */
    public final C2288j m4908c() {
        C2288j c2288j = this.f9754j;
        C2288j c2288j2 = new C2288j();
        c2288j2.f9759c = null;
        c2288j2.f9760d = f9749m;
        if (c2288j != null) {
            c2288j2.f9757a = c2288j.f9757a;
            c2288j2.f9758b = c2288j.f9758b;
            c2288j2.f9759c = c2288j.f9759c;
            c2288j2.f9760d = c2288j.f9760d;
        }
        return c2288j2;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4909d(int[] iArr) {
        return m4914i(iArr) || this.f9756l.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f9756l.draw(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m4910e(int i3) {
        setTintList(ColorStateList.valueOf(i3));
    }

    /* JADX INFO: renamed from: f */
    public final void m4911f(ColorStateList colorStateList) {
        this.f9754j.f9759c = colorStateList;
        m4914i(this.f9756l.getState());
    }

    /* JADX INFO: renamed from: g */
    public final void m4912g(PorterDuff.Mode mode) {
        this.f9754j.f9760d = mode;
        m4914i(this.f9756l.getState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C2288j c2288j = this.f9754j;
        return changingConfigurations | (c2288j != null ? c2288j.getChangingConfigurations() : 0) | this.f9756l.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        C2288j c2288j = this.f9754j;
        if (c2288j == null || c2288j.f9758b == null) {
            return null;
        }
        c2288j.f9757a = getChangingConfigurations();
        return this.f9754j;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f9756l.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.f9756l.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f9756l.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f9756l.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return AbstractC2003a.m4540m(this.f9756l);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.f9756l.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.f9756l.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f9756l.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.f9756l.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        return this.f9756l.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.f9756l.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.f9756l.getTransparentRegion();
    }

    /* JADX INFO: renamed from: h */
    public final void m4913h(Drawable drawable) {
        Drawable drawable2 = this.f9756l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f9756l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            C2288j c2288j = this.f9754j;
            if (c2288j != null) {
                c2288j.f9758b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m4914i(int[] iArr) {
        if (m4907b()) {
            C2288j c2288j = this.f9754j;
            ColorStateList colorStateList = c2288j.f9759c;
            PorterDuff.Mode mode = c2288j.f9760d;
            if (colorStateList == null || mode == null) {
                this.f9753i = false;
                clearColorFilter();
                return false;
            }
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f9753i || colorForState != this.f9751g || mode != this.f9752h) {
                setColorFilter(colorForState, mode);
                this.f9751g = colorForState;
                this.f9752h = mode;
                this.f9753i = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f9756l.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Method method;
        Drawable drawable = this.f9756l;
        if (drawable == null || (method = f9750n) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception e3) {
            Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e3);
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        C2288j c2288j;
        ColorStateList colorStateList = (!m4907b() || (c2288j = this.f9754j) == null) ? null : c2288j.f9759c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f9756l.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f9756l.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f9755k && super.mutate() == this) {
            this.f9754j = m4908c();
            Drawable drawable = this.f9756l;
            if (drawable != null) {
                drawable.mutate();
            }
            C2288j c2288j = this.f9754j;
            if (c2288j != null) {
                Drawable drawable2 = this.f9756l;
                c2288j.f9758b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f9755k = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9756l;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i3) {
        return AbstractC2003a.m4545r(this.f9756l, i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        return this.f9756l.setLevel(i3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        scheduleSelf(runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        this.f9756l.setAlpha(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        this.f9756l.setAutoMirrored(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i3) {
        this.f9756l.setChangingConfigurations(i3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9756l.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z3) {
        this.f9756l.setDither(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z3) {
        this.f9756l.setFilterBitmap(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f3) {
        this.f9756l.setHotspot(f, f3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i3, int i4, int i5, int i6) {
        this.f9756l.setHotspotBounds(i3, i4, i5, i6);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (!m4909d(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        if (m4907b()) {
            m4910e(i3);
        } else {
            this.f9756l.setTint(i3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (m4907b()) {
            m4911f(colorStateList);
        } else {
            this.f9756l.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (m4907b()) {
            m4912g(mode);
        } else {
            this.f9756l.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z4) {
        return super.setVisible(z3, z4) || this.f9756l.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
