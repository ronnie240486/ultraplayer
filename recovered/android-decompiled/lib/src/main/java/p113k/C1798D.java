package p113k;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.zuxoplayer.app.R;

/* JADX INFO: renamed from: k.D */
/* JADX INFO: loaded from: classes.dex */
public final class C1798D extends RatingBar {

    /* JADX INFO: renamed from: g */
    public final C1794B f7995g;

    public C1798D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        AbstractC1826R0.m4334a(this, getContext());
        C1794B c1794b = new C1794B(this);
        this.f7995g = c1794b;
        c1794b.mo4284b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        Bitmap bitmap = (Bitmap) this.f7995g.f7988c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i3, 0), getMeasuredHeight());
        }
    }
}
