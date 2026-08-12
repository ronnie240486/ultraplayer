package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.zuxoplayer.app.R;
import java.util.ArrayList;
import p016F1.AbstractC0190g;
import p025I1.C0282a;
import p025I1.C0283b;

/* JADX INFO: loaded from: classes.dex */
public class CastSeekBar extends View {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ int f5480p = 0;

    /* JADX INFO: renamed from: g */
    public final C0282a f5481g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f5482h;

    /* JADX INFO: renamed from: i */
    public final float f5483i;

    /* JADX INFO: renamed from: j */
    public final float f5484j;

    /* JADX INFO: renamed from: k */
    public final float f5485k;

    /* JADX INFO: renamed from: l */
    public final Paint f5486l;

    /* JADX INFO: renamed from: m */
    public final int f5487m;

    /* JADX INFO: renamed from: n */
    public final int f5488n;

    /* JADX INFO: renamed from: o */
    public final int f5489o;

    public CastSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5482h = new ArrayList();
        setAccessibilityDelegate(new C0283b(this));
        Paint paint = new Paint(1);
        this.f5486l = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f5483i = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_width);
        this.f5484j = context.getResources().getDimension(R.dimen.cast_seek_bar_minimum_height);
        this.f5485k = context.getResources().getDimension(R.dimen.cast_seek_bar_progress_height) / 2.0f;
        context.getResources().getDimension(R.dimen.cast_seek_bar_thumb_size);
        context.getResources().getDimension(R.dimen.cast_seek_bar_ad_break_minimum_width);
        this.f5481g = new C0282a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0190g.f466a, R.attr.castExpandedControllerStyle, R.style.CastExpandedController);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(18, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(23, 0);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f5487m = context.getResources().getColor(resourceId);
        context.getResources().getColor(resourceId2);
        this.f5488n = context.getResources().getColor(resourceId3);
        this.f5489o = context.getResources().getColor(resourceId4);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m3077a(Canvas canvas, int i3, int i4, int i5, int i6) {
        Paint paint = this.f5486l;
        paint.setColor(i6);
        float f = 1;
        float f3 = i5;
        float f4 = this.f5485k;
        canvas.drawRect((i3 / f) * f3, -f4, (i4 / f) * f3, f4, paint);
    }

    public int getMaxProgress() {
        this.f5481g.getClass();
        return 1;
    }

    public int getProgress() {
        this.f5481g.getClass();
        return 0;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        CastSeekBar castSeekBar;
        Canvas canvas2;
        int i3;
        int i4;
        int iSave = canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int progress = getProgress();
        int iSave2 = canvas.save();
        canvas.translate(0.0f, measuredHeight / 2);
        this.f5481g.getClass();
        int i5 = 0;
        int iMax = Math.max(0, 0);
        if (iMax > 0) {
            i3 = iMax;
            castSeekBar = this;
            canvas2 = canvas;
            castSeekBar.m3077a(canvas2, 0, i3, measuredWidth, this.f5488n);
        } else {
            castSeekBar = this;
            canvas2 = canvas;
            i3 = iMax;
        }
        if (progress > i3) {
            castSeekBar.m3077a(canvas2, i3, progress, measuredWidth, castSeekBar.f5487m);
            i4 = progress;
        } else {
            i4 = progress;
        }
        if (1 > i4) {
            castSeekBar.m3077a(canvas2, i4, 1, measuredWidth, castSeekBar.f5488n);
        }
        canvas2.restoreToCount(iSave2);
        ArrayList arrayList = castSeekBar.f5482h;
        if (arrayList != null && !arrayList.isEmpty()) {
            castSeekBar.f5486l.setColor(castSeekBar.f5489o);
            getMeasuredWidth();
            getPaddingLeft();
            getPaddingRight();
            int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            int iSave3 = canvas2.save();
            canvas2.translate(0.0f, measuredHeight2 / 2);
            int size = arrayList.size();
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                if (obj != null) {
                    throw new ClassCastException();
                }
            }
            canvas2.restoreToCount(iSave3);
        }
        isEnabled();
        canvas2.restoreToCount(iSave);
    }

    @Override // android.view.View
    public final synchronized void onMeasure(int i3, int i4) {
        float paddingLeft = getPaddingLeft();
        setMeasuredDimension(View.resolveSizeAndState((int) (this.f5483i + paddingLeft + getPaddingRight()), i3, 0), View.resolveSizeAndState((int) (this.f5484j + getPaddingTop() + getPaddingBottom()), i4, 0));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        this.f5481g.getClass();
        return false;
    }
}
