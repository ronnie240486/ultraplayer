package p098g;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import p014F.RunnableC0153b;
import p122m1.AbstractC2003a;
import p152u.AbstractC2279a;

/* JADX INFO: renamed from: g.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1570g extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: s */
    public static final /* synthetic */ int f7128s = 0;

    /* JADX INFO: renamed from: g */
    public C1565b f7129g;

    /* JADX INFO: renamed from: h */
    public Rect f7130h;

    /* JADX INFO: renamed from: i */
    public Drawable f7131i;

    /* JADX INFO: renamed from: j */
    public Drawable f7132j;

    /* JADX INFO: renamed from: k */
    public int f7133k;

    /* JADX INFO: renamed from: l */
    public boolean f7134l;

    /* JADX INFO: renamed from: m */
    public int f7135m;

    /* JADX INFO: renamed from: n */
    public boolean f7136n;

    /* JADX INFO: renamed from: o */
    public RunnableC0153b f7137o;

    /* JADX INFO: renamed from: p */
    public long f7138p;

    /* JADX INFO: renamed from: q */
    public long f7139q;

    /* JADX INFO: renamed from: r */
    public C1569f f7140r;

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final void m3901a(boolean z3) {
        boolean z4;
        Drawable drawable;
        long j3;
        boolean z5 = true;
        this.f7134l = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f7131i;
        if (drawable2 != null) {
            long j4 = this.f7138p;
            if (j4 != 0) {
                if (j4 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f7133k);
                    this.f7138p = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j4 - jUptimeMillis) * 255)) / this.f7129g.f7112y)) * this.f7133k) / 255);
                    z4 = true;
                }
            }
            drawable = this.f7132j;
            if (drawable != null) {
                j3 = this.f7139q;
                if (j3 == 0) {
                    if (j3 <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f7132j = null;
                        this.f7139q = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j3 - jUptimeMillis) * 255)) / this.f7129g.f7113z) * this.f7133k) / 255);
                    }
                }
                if (z3 || !z5) {
                }
                scheduleSelf(this.f7137o, jUptimeMillis + 16);
                return;
            }
            this.f7139q = 0L;
            z5 = z4;
            if (z3) {
            }
        }
        this.f7138p = 0L;
        z4 = false;
        drawable = this.f7132j;
        if (drawable != null) {
            j3 = this.f7139q;
            if (j3 == 0) {
                if (j3 <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f7132j = null;
                    this.f7139q = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j3 - jUptimeMillis) * 255)) / this.f7129g.f7113z) * this.f7133k) / 255);
                }
            }
            if (z3) {
            }
        }
        this.f7139q = 0L;
        z5 = z4;
        if (z3) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        C1565b c1565b = this.f7129g;
        if (theme == null) {
            c1565b.getClass();
            return;
        }
        c1565b.m3894c();
        int i3 = c1565b.f7095h;
        Drawable[] drawableArr = c1565b.f7094g;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null && AbstractC2279a.m4886b(drawable)) {
                AbstractC2279a.m4885a(drawableArr[i4], theme);
                c1565b.f7092e |= drawableArr[i4].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            c1565b.f7089b = resources;
            int i5 = resources.getDisplayMetrics().densityDpi;
            if (i5 == 0) {
                i5 = 160;
            }
            int i6 = c1565b.f7090c;
            c1565b.f7090c = i5;
            if (i6 != i5) {
                c1565b.f7100m = false;
                c1565b.f7097j = false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3902b(Drawable drawable) {
        if (this.f7140r == null) {
            this.f7140r = new C1569f();
        }
        C1569f c1569f = this.f7140r;
        c1569f.f7127h = drawable.getCallback();
        drawable.setCallback(c1569f);
        try {
            if (this.f7129g.f7112y <= 0 && this.f7134l) {
                drawable.setAlpha(this.f7133k);
            }
            C1565b c1565b = this.f7129g;
            if (c1565b.f7080C) {
                drawable.setColorFilter(c1565b.f7079B);
            } else {
                if (c1565b.f7083F) {
                    AbstractC2279a.m4892h(drawable, c1565b.f7081D);
                }
                C1565b c1565b2 = this.f7129g;
                if (c1565b2.f7084G) {
                    AbstractC2279a.m4893i(drawable, c1565b2.f7082E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f7129g.f7110w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                AbstractC2003a.m4545r(drawable, AbstractC2003a.m4540m(this));
            }
            drawable.setAutoMirrored(this.f7129g.f7078A);
            Rect rect = this.f7130h;
            if (rect != null) {
                AbstractC2279a.m4890f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C1569f c1569f2 = this.f7140r;
            Drawable.Callback callback = (Drawable.Callback) c1569f2.f7127h;
            c1569f2.f7127h = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX INFO: renamed from: c */
    public final boolean m3903c(int i3) {
        if (i3 == this.f7135m) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f7129g.f7113z > 0) {
            Drawable drawable = this.f7132j;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f7131i;
            if (drawable2 != null) {
                this.f7132j = drawable2;
                this.f7139q = ((long) this.f7129g.f7113z) + jUptimeMillis;
            } else {
                this.f7132j = null;
                this.f7139q = 0L;
            }
        } else {
            Drawable drawable3 = this.f7131i;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i3 >= 0) {
            C1565b c1565b = this.f7129g;
            if (i3 < c1565b.f7095h) {
                Drawable drawableM3895d = c1565b.m3895d(i3);
                this.f7131i = drawableM3895d;
                this.f7135m = i3;
                if (drawableM3895d != null) {
                    int i4 = this.f7129g.f7112y;
                    if (i4 > 0) {
                        this.f7138p = jUptimeMillis + ((long) i4);
                    }
                    m3902b(drawableM3895d);
                }
            } else {
                this.f7131i = null;
                this.f7135m = -1;
            }
        } else {
            this.f7131i = null;
            this.f7135m = -1;
        }
        if (this.f7138p != 0 || this.f7139q != 0) {
            RunnableC0153b runnableC0153b = this.f7137o;
            if (runnableC0153b == null) {
                this.f7137o = new RunnableC0153b(13, (C1568e) this);
            } else {
                unscheduleSelf(runnableC0153b);
            }
            m3901a(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f7129g.canApplyTheme();
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo3898d(C1565b c1565b);

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f7131i;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f7132j;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f7133k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f7129g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z3;
        C1565b c1565b = this.f7129g;
        if (!c1565b.f7108u) {
            c1565b.m3894c();
            c1565b.f7108u = true;
            int i3 = c1565b.f7095h;
            Drawable[] drawableArr = c1565b.f7094g;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    c1565b.f7109v = true;
                    z3 = true;
                    break;
                }
                if (drawableArr[i4].getConstantState() == null) {
                    c1565b.f7109v = false;
                    z3 = false;
                    break;
                }
                i4++;
            }
        } else {
            z3 = c1565b.f7109v;
        }
        if (!z3) {
            return null;
        }
        this.f7129g.f7091d = getChangingConfigurations();
        return this.f7129g;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f7131i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f7130h;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C1565b c1565b = this.f7129g;
        if (c1565b.f7099l) {
            if (!c1565b.f7100m) {
                c1565b.m3893b();
            }
            return c1565b.f7102o;
        }
        Drawable drawable = this.f7131i;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C1565b c1565b = this.f7129g;
        if (c1565b.f7099l) {
            if (!c1565b.f7100m) {
                c1565b.m3893b();
            }
            return c1565b.f7101n;
        }
        Drawable drawable = this.f7131i;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        C1565b c1565b = this.f7129g;
        if (c1565b.f7099l) {
            if (!c1565b.f7100m) {
                c1565b.m3893b();
            }
            return c1565b.f7104q;
        }
        Drawable drawable = this.f7131i;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        C1565b c1565b = this.f7129g;
        if (c1565b.f7099l) {
            if (!c1565b.f7100m) {
                c1565b.m3893b();
            }
            return c1565b.f7103p;
        }
        Drawable drawable = this.f7131i;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f7131i;
        int opacity = -2;
        if (drawable != null && drawable.isVisible()) {
            C1565b c1565b = this.f7129g;
            if (c1565b.f7105r) {
                return c1565b.f7106s;
            }
            c1565b.m3894c();
            int i3 = c1565b.f7095h;
            Drawable[] drawableArr = c1565b.f7094g;
            opacity = i3 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i4 = 1; i4 < i3; i4++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i4].getOpacity());
            }
            c1565b.f7106s = opacity;
            c1565b.f7105r = true;
        }
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f7131i;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C1565b c1565b = this.f7129g;
        boolean padding = false;
        Rect rect2 = null;
        if (!c1565b.f7096i) {
            Rect rect3 = c1565b.f7098k;
            if (rect3 != null || c1565b.f7097j) {
                rect2 = rect3;
            } else {
                c1565b.m3894c();
                Rect rect4 = new Rect();
                int i3 = c1565b.f7095h;
                Drawable[] drawableArr = c1565b.f7094g;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (drawableArr[i4].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i5 = rect4.left;
                        if (i5 > rect2.left) {
                            rect2.left = i5;
                        }
                        int i6 = rect4.top;
                        if (i6 > rect2.top) {
                            rect2.top = i6;
                        }
                        int i7 = rect4.right;
                        if (i7 > rect2.right) {
                            rect2.right = i7;
                        }
                        int i8 = rect4.bottom;
                        if (i8 > rect2.bottom) {
                            rect2.bottom = i8;
                        }
                    }
                }
                c1565b.f7097j = true;
                c1565b.f7098k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f7131i;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f7129g.f7078A && AbstractC2003a.m4540m(this) == 1) {
            int i9 = rect.left;
            rect.left = rect.right;
            rect.right = i9;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C1565b c1565b = this.f7129g;
        if (c1565b != null) {
            c1565b.f7105r = false;
            c1565b.f7107t = false;
        }
        if (drawable != this.f7131i || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f7129g.f7078A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z3;
        Drawable drawable = this.f7132j;
        boolean z4 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f7132j = null;
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable2 = this.f7131i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f7134l) {
                this.f7131i.setAlpha(this.f7133k);
            }
        }
        if (this.f7139q != 0) {
            this.f7139q = 0L;
            z3 = true;
        }
        if (this.f7138p != 0) {
            this.f7138p = 0L;
        } else {
            z4 = z3;
        }
        if (z4) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f7136n && super.mutate() == this) {
            C1568e c1568e = (C1568e) this;
            C1565b c1565b = new C1565b(c1568e.f7121v, c1568e, null);
            c1565b.f7086I = c1565b.f7086I.clone();
            c1565b.f7087J = c1565b.f7087J.clone();
            mo3898d(c1565b);
            this.f7136n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7132j;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f7131i;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i3) {
        C1565b c1565b = this.f7129g;
        int i4 = this.f7135m;
        int i5 = c1565b.f7095h;
        Drawable[] drawableArr = c1565b.f7094g;
        boolean z3 = false;
        for (int i6 = 0; i6 < i5; i6++) {
            Drawable drawable = drawableArr[i6];
            if (drawable != null) {
                boolean zM4545r = Build.VERSION.SDK_INT >= 23 ? AbstractC2003a.m4545r(drawable, i3) : false;
                if (i6 == i4) {
                    z3 = zM4545r;
                }
            }
        }
        c1565b.f7111x = i3;
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i3) {
        Drawable drawable = this.f7132j;
        if (drawable != null) {
            return drawable.setLevel(i3);
        }
        Drawable drawable2 = this.f7131i;
        if (drawable2 != null) {
            return drawable2.setLevel(i3);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        if (drawable != this.f7131i || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i3) {
        if (this.f7134l && this.f7133k == i3) {
            return;
        }
        this.f7134l = true;
        this.f7133k = i3;
        Drawable drawable = this.f7131i;
        if (drawable != null) {
            if (this.f7138p == 0) {
                drawable.setAlpha(i3);
            } else {
                m3901a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        C1565b c1565b = this.f7129g;
        if (c1565b.f7078A != z3) {
            c1565b.f7078A = z3;
            Drawable drawable = this.f7131i;
            if (drawable != null) {
                drawable.setAutoMirrored(z3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C1565b c1565b = this.f7129g;
        c1565b.f7080C = true;
        if (c1565b.f7079B != colorFilter) {
            c1565b.f7079B = colorFilter;
            Drawable drawable = this.f7131i;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z3) {
        C1565b c1565b = this.f7129g;
        if (c1565b.f7110w != z3) {
            c1565b.f7110w = z3;
            Drawable drawable = this.f7131i;
            if (drawable != null) {
                drawable.setDither(z3);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f3) {
        Drawable drawable = this.f7131i;
        if (drawable != null) {
            AbstractC2279a.m4889e(drawable, f, f3);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i3, int i4, int i5, int i6) {
        Rect rect = this.f7130h;
        if (rect == null) {
            this.f7130h = new Rect(i3, i4, i5, i6);
        } else {
            rect.set(i3, i4, i5, i6);
        }
        Drawable drawable = this.f7131i;
        if (drawable != null) {
            AbstractC2279a.m4890f(drawable, i3, i4, i5, i6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i3) {
        setTintList(ColorStateList.valueOf(i3));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        C1565b c1565b = this.f7129g;
        c1565b.f7083F = true;
        if (c1565b.f7081D != colorStateList) {
            c1565b.f7081D = colorStateList;
            AbstractC2279a.m4892h(this.f7131i, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C1565b c1565b = this.f7129g;
        c1565b.f7084G = true;
        if (c1565b.f7082E != mode) {
            c1565b.f7082E = mode;
            AbstractC2279a.m4893i(this.f7131i, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        Drawable drawable = this.f7132j;
        if (drawable != null) {
            drawable.setVisible(z3, z4);
        }
        Drawable drawable2 = this.f7131i;
        if (drawable2 != null) {
            drawable2.setVisible(z3, z4);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f7131i || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
