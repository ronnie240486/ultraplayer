package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.zuxoplayer.app.R;
import p087d.AbstractC1376a;
import p113k.AbstractC1823P0;
import p113k.C1846b;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: g */
    public boolean f3812g;

    /* JADX INFO: renamed from: h */
    public View f3813h;

    /* JADX INFO: renamed from: i */
    public View f3814i;

    /* JADX INFO: renamed from: j */
    public Drawable f3815j;

    /* JADX INFO: renamed from: k */
    public Drawable f3816k;

    /* JADX INFO: renamed from: l */
    public Drawable f3817l;

    /* JADX INFO: renamed from: m */
    public final boolean f3818m;

    /* JADX INFO: renamed from: n */
    public boolean f3819n;

    /* JADX INFO: renamed from: o */
    public final int f3820o;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1846b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1376a.f6095a);
        boolean z3 = false;
        this.f3815j = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f3816k = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f3820o = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f3818m = true;
            this.f3817l = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f3818m ? !(this.f3815j != null || this.f3816k != null) : this.f3817l == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3815j;
        if (drawable != null && drawable.isStateful()) {
            this.f3815j.setState(getDrawableState());
        }
        Drawable drawable2 = this.f3816k;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f3816k.setState(getDrawableState());
        }
        Drawable drawable3 = this.f3817l;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f3817l.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3815j;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3816k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f3817l;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3813h = findViewById(R.id.action_bar);
        this.f3814i = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f3812g || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        boolean z4 = true;
        if (this.f3818m) {
            Drawable drawable = this.f3817l;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z4 = false;
            }
        } else {
            if (this.f3815j == null) {
                z4 = false;
            } else if (this.f3813h.getVisibility() == 0) {
                this.f3815j.setBounds(this.f3813h.getLeft(), this.f3813h.getTop(), this.f3813h.getRight(), this.f3813h.getBottom());
            } else {
                View view = this.f3814i;
                if (view == null || view.getVisibility() != 0) {
                    this.f3815j.setBounds(0, 0, 0, 0);
                } else {
                    this.f3815j.setBounds(this.f3814i.getLeft(), this.f3814i.getTop(), this.f3814i.getRight(), this.f3814i.getBottom());
                }
            }
            this.f3819n = false;
        }
        if (z4) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        int i5;
        if (this.f3813h == null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE && (i5 = this.f3820o) >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i4)), Integer.MIN_VALUE);
        }
        super.onMeasure(i3, i4);
        if (this.f3813h == null) {
            return;
        }
        View.MeasureSpec.getMode(i4);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f3815j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3815j);
        }
        this.f3815j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f3813h;
            if (view != null) {
                this.f3815j.setBounds(view.getLeft(), this.f3813h.getTop(), this.f3813h.getRight(), this.f3813h.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f3818m ? !(this.f3815j != null || this.f3816k != null) : this.f3817l == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f3817l;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f3817l);
        }
        this.f3817l = drawable;
        boolean z3 = this.f3818m;
        boolean z4 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z3 && (drawable2 = this.f3817l) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z3 ? !(this.f3815j != null || this.f3816k != null) : this.f3817l == null) {
            z4 = true;
        }
        setWillNotDraw(z4);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f3816k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f3816k);
        }
        this.f3816k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f3819n && this.f3816k != null) {
                throw null;
            }
        }
        boolean z3 = false;
        if (!this.f3818m ? !(this.f3815j != null || this.f3816k != null) : this.f3817l == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTransitioning(boolean z3) {
        this.f3812g = z3;
        setDescendantFocusability(z3 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z3 = i3 == 0;
        Drawable drawable = this.f3815j;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f3816k;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f3817l;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3815j;
        boolean z3 = this.f3818m;
        if (drawable == drawable2 && !z3) {
            return true;
        }
        if (drawable == this.f3816k && this.f3819n) {
            return true;
        }
        return (drawable == this.f3817l && z3) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i3) {
        if (i3 != 0) {
            return super.startActionModeForChild(view, callback, i3);
        }
        return null;
    }

    public void setTabContainer(AbstractC1823P0 abstractC1823P0) {
    }
}
