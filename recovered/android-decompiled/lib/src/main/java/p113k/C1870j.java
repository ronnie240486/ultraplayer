package p113k;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.zuxoplayer.app.R;
import p060U1.AbstractC0610a;
import p110j.C1761b;
import p152u.AbstractC2279a;

/* JADX INFO: renamed from: k.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1870j extends C1901x implements InterfaceC1876l {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1873k f8193j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1870j(C1873k c1873k, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f8193j = c1873k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0610a.m1496J(this, getContentDescription());
        setOnTouchListener(new C1761b(this, this));
    }

    @Override // p113k.InterfaceC1876l
    /* JADX INFO: renamed from: a */
    public final boolean mo2311a() {
        return false;
    }

    @Override // p113k.InterfaceC1876l
    /* JADX INFO: renamed from: b */
    public final boolean mo2312b() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f8193j.m4394l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i3, int i4, int i5, int i6) {
        boolean frame = super.setFrame(i3, i4, i5, i6);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            AbstractC2279a.m4890f(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
