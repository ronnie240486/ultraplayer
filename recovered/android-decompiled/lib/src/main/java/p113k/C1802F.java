package p113k;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.zuxoplayer.app.R;

/* JADX INFO: renamed from: k.F */
/* JADX INFO: loaded from: classes.dex */
public class C1802F extends SeekBar {

    /* JADX INFO: renamed from: g */
    public final C1804G f8025g;

    public C1802F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC1826R0.m4334a(this, getContext());
        C1804G c1804g = new C1804G(this);
        this.f8025g = c1804g;
        c1804g.mo4284b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1804G c1804g = this.f8025g;
        Drawable drawable = c1804g.f8027f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C1802F c1802f = c1804g.f8026e;
        if (drawable.setState(c1802f.getDrawableState())) {
            c1802f.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8025g.f8027f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f8025g.m4300g(canvas);
    }
}
