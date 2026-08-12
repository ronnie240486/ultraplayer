package p113k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.C0858A;
import android.util.AttributeSet;
import com.zuxoplayer.app.R;
import p000A.AbstractC0016Q;
import p087d.AbstractC1376a;
import p122m1.AbstractC2003a;
import p152u.AbstractC2279a;

/* JADX INFO: renamed from: k.G */
/* JADX INFO: loaded from: classes.dex */
public final class C1804G extends C1794B {

    /* JADX INFO: renamed from: e */
    public final C1802F f8026e;

    /* JADX INFO: renamed from: f */
    public Drawable f8027f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f8028g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f8029h;

    /* JADX INFO: renamed from: i */
    public boolean f8030i;

    /* JADX INFO: renamed from: j */
    public boolean f8031j;

    public C1804G(C1802F c1802f) {
        super(c1802f);
        this.f8028g = null;
        this.f8029h = null;
        this.f8030i = false;
        this.f8031j = false;
        this.f8026e = c1802f;
    }

    @Override // p113k.C1794B
    /* JADX INFO: renamed from: b */
    public final void mo4284b(AttributeSet attributeSet, int i3) {
        super.mo4284b(attributeSet, R.attr.seekBarStyle);
        C1802F c1802f = this.f8026e;
        Context context = c1802f.getContext();
        int[] iArr = AbstractC1376a.f6101g;
        C0858A c0858aM2148Q = C0858A.m2148Q(context, attributeSet, iArr, R.attr.seekBarStyle);
        AbstractC0016Q.m85g(c1802f, c1802f.getContext(), iArr, attributeSet, (TypedArray) c0858aM2148Q.f3640i, R.attr.seekBarStyle);
        Drawable drawableM2159G = c0858aM2148Q.m2159G(0);
        if (drawableM2159G != null) {
            c1802f.setThumb(drawableM2159G);
        }
        Drawable drawableM2158F = c0858aM2148Q.m2158F(1);
        Drawable drawable = this.f8027f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f8027f = drawableM2158F;
        if (drawableM2158F != null) {
            drawableM2158F.setCallback(c1802f);
            AbstractC2003a.m4545r(drawableM2158F, c1802f.getLayoutDirection());
            if (drawableM2158F.isStateful()) {
                drawableM2158F.setState(c1802f.getDrawableState());
            }
            m4299f();
        }
        c1802f.invalidate();
        TypedArray typedArray = (TypedArray) c0858aM2148Q.f3640i;
        if (typedArray.hasValue(3)) {
            this.f8029h = AbstractC1877l0.m4397b(typedArray.getInt(3, -1), this.f8029h);
            this.f8031j = true;
        }
        if (typedArray.hasValue(2)) {
            this.f8028g = c0858aM2148Q.m2156D(2);
            this.f8030i = true;
        }
        c0858aM2148Q.m2170S();
        m4299f();
    }

    /* JADX INFO: renamed from: f */
    public final void m4299f() {
        Drawable drawable = this.f8027f;
        if (drawable != null) {
            if (this.f8030i || this.f8031j) {
                Drawable drawableM4548u = AbstractC2003a.m4548u(drawable.mutate());
                this.f8027f = drawableM4548u;
                if (this.f8030i) {
                    AbstractC2279a.m4892h(drawableM4548u, this.f8028g);
                }
                if (this.f8031j) {
                    AbstractC2279a.m4893i(this.f8027f, this.f8029h);
                }
                if (this.f8027f.isStateful()) {
                    this.f8027f.setState(this.f8026e.getDrawableState());
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4300g(Canvas canvas) {
        if (this.f8027f != null) {
            C1802F c1802f = this.f8026e;
            int max = c1802f.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f8027f.getIntrinsicWidth();
                int intrinsicHeight = this.f8027f.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i4 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f8027f.setBounds(-i3, -i4, i3, i4);
                float width = ((c1802f.getWidth() - c1802f.getPaddingLeft()) - c1802f.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(c1802f.getPaddingLeft(), c1802f.getHeight() / 2);
                for (int i5 = 0; i5 <= max; i5++) {
                    this.f8027f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
