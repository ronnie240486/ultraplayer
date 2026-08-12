package androidx.media3.p080ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p083b1.AbstractC1077F;
import p083b1.InterfaceC1091a;
import p083b1.RunnableC1092b;

/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f4367j = 0;

    /* JADX INFO: renamed from: g */
    public final RunnableC1092b f4368g;

    /* JADX INFO: renamed from: h */
    public float f4369h;

    /* JADX INFO: renamed from: i */
    public int f4370i;

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4370i = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC1077F.f4919a, 0, 0);
            try {
                this.f4370i = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f4368g = new RunnableC1092b(this);
    }

    public int getResizeMode() {
        return this.f4370i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        float f;
        float f3;
        super.onMeasure(i3, i4);
        if (this.f4369h <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f4 = measuredWidth;
        float f5 = measuredHeight;
        float f6 = (this.f4369h / (f4 / f5)) - 1.0f;
        float fAbs = Math.abs(f6);
        RunnableC1092b runnableC1092b = this.f4368g;
        if (fAbs <= 0.01f) {
            if (runnableC1092b.f4976g) {
                return;
            }
            runnableC1092b.f4976g = true;
            runnableC1092b.f4977h.post(runnableC1092b);
            return;
        }
        int i5 = this.f4370i;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    f = this.f4369h;
                } else if (i5 == 4) {
                    if (f6 > 0.0f) {
                        f = this.f4369h;
                    } else {
                        f3 = this.f4369h;
                    }
                }
                measuredWidth = (int) (f5 * f);
            } else {
                f3 = this.f4369h;
            }
            measuredHeight = (int) (f4 / f3);
        } else if (f6 > 0.0f) {
            f3 = this.f4369h;
            measuredHeight = (int) (f4 / f3);
        } else {
            f = this.f4369h;
            measuredWidth = (int) (f5 * f);
        }
        if (!runnableC1092b.f4976g) {
            runnableC1092b.f4976g = true;
            runnableC1092b.f4977h.post(runnableC1092b);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f4369h != f) {
            this.f4369h = f;
            requestLayout();
        }
    }

    public void setResizeMode(int i3) {
        if (this.f4370i != i3) {
            this.f4370i = i3;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC1091a interfaceC1091a) {
    }
}
