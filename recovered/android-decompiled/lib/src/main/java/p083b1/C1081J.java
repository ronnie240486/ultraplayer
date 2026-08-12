package p083b1;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* JADX INFO: renamed from: b1.J */
/* JADX INFO: loaded from: classes.dex */
public final class C1081J {

    /* JADX INFO: renamed from: A */
    public int f4929A;

    /* JADX INFO: renamed from: B */
    public int f4930B;

    /* JADX INFO: renamed from: C */
    public int f4931C;

    /* JADX INFO: renamed from: D */
    public int f4932D;

    /* JADX INFO: renamed from: E */
    public StaticLayout f4933E;

    /* JADX INFO: renamed from: F */
    public StaticLayout f4934F;

    /* JADX INFO: renamed from: G */
    public int f4935G;

    /* JADX INFO: renamed from: H */
    public int f4936H;

    /* JADX INFO: renamed from: I */
    public int f4937I;

    /* JADX INFO: renamed from: J */
    public Rect f4938J;

    /* JADX INFO: renamed from: a */
    public final float f4939a;

    /* JADX INFO: renamed from: b */
    public final float f4940b;

    /* JADX INFO: renamed from: c */
    public final float f4941c;

    /* JADX INFO: renamed from: d */
    public final float f4942d;

    /* JADX INFO: renamed from: e */
    public final float f4943e;

    /* JADX INFO: renamed from: f */
    public final TextPaint f4944f;

    /* JADX INFO: renamed from: g */
    public final Paint f4945g;

    /* JADX INFO: renamed from: h */
    public final Paint f4946h;

    /* JADX INFO: renamed from: i */
    public CharSequence f4947i;

    /* JADX INFO: renamed from: j */
    public Layout.Alignment f4948j;

    /* JADX INFO: renamed from: k */
    public Bitmap f4949k;

    /* JADX INFO: renamed from: l */
    public float f4950l;

    /* JADX INFO: renamed from: m */
    public int f4951m;

    /* JADX INFO: renamed from: n */
    public int f4952n;

    /* JADX INFO: renamed from: o */
    public float f4953o;

    /* JADX INFO: renamed from: p */
    public int f4954p;

    /* JADX INFO: renamed from: q */
    public float f4955q;

    /* JADX INFO: renamed from: r */
    public float f4956r;

    /* JADX INFO: renamed from: s */
    public int f4957s;

    /* JADX INFO: renamed from: t */
    public int f4958t;

    /* JADX INFO: renamed from: u */
    public int f4959u;

    /* JADX INFO: renamed from: v */
    public int f4960v;

    /* JADX INFO: renamed from: w */
    public int f4961w;

    /* JADX INFO: renamed from: x */
    public float f4962x;

    /* JADX INFO: renamed from: y */
    public float f4963y;

    /* JADX INFO: renamed from: z */
    public float f4964z;

    public C1081J(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f4943e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f4942d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f4939a = fRound;
        this.f4940b = fRound;
        this.f4941c = fRound;
        TextPaint textPaint = new TextPaint();
        this.f4944f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f4945g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f4946h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m2923a(Canvas canvas, boolean z3) {
        Canvas canvas2;
        if (!z3) {
            this.f4938J.getClass();
            this.f4949k.getClass();
            canvas.drawBitmap(this.f4949k, (Rect) null, this.f4938J, this.f4946h);
            return;
        }
        StaticLayout staticLayout = this.f4933E;
        StaticLayout staticLayout2 = this.f4934F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f4935G, this.f4936H);
        if (Color.alpha(this.f4959u) > 0) {
            Paint paint = this.f4945g;
            paint.setColor(this.f4959u);
            canvas2 = canvas;
            canvas2.drawRect(-this.f4937I, 0.0f, staticLayout.getWidth() + this.f4937I, staticLayout.getHeight(), paint);
        } else {
            canvas2 = canvas;
        }
        int i3 = this.f4961w;
        TextPaint textPaint = this.f4944f;
        if (i3 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f4939a);
            textPaint.setColor(this.f4960v);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas2);
        } else {
            float f = this.f4940b;
            if (i3 == 2) {
                float f3 = this.f4941c;
                textPaint.setShadowLayer(f, f3, f3, this.f4960v);
            } else if (i3 == 3 || i3 == 4) {
                boolean z4 = i3 == 3;
                int i4 = z4 ? -1 : this.f4960v;
                int i5 = z4 ? this.f4960v : -1;
                float f4 = f / 2.0f;
                textPaint.setColor(this.f4957s);
                textPaint.setStyle(Paint.Style.FILL);
                float f5 = -f4;
                textPaint.setShadowLayer(f, f5, f5, i4);
                staticLayout2.draw(canvas2);
                textPaint.setShadowLayer(f, f4, f4, i5);
            }
        }
        textPaint.setColor(this.f4957s);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas2);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas2.restoreToCount(iSave);
    }
}
