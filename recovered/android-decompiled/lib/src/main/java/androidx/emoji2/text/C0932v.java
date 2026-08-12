package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;
import p023I.C0269a;
import p053S0.C0536b;
import p066W1.AbstractC0664e;

/* JADX INFO: renamed from: androidx.emoji2.text.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0932v extends ReplacementSpan {

    /* JADX INFO: renamed from: b */
    public final C0931u f4043b;

    /* JADX INFO: renamed from: e */
    public TextPaint f4046e;

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt f4042a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c */
    public short f4044c = -1;

    /* JADX INFO: renamed from: d */
    public float f4045d = 1.0f;

    public C0932v(C0931u c0931u) {
        AbstractC0664e.m1747h(c0931u, "rasterizer cannot be null");
        this.f4043b = c0931u;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    /* JADX WARN: Code duplicated, block: B:21:0x0046  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i3, int i4, float f, int i5, int i6, int i7, Paint paint) {
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i3, i4, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.f4046e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.f4046e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                } else if (paint instanceof TextPaint) {
                    textPaint = (TextPaint) paint;
                }
            } else if (paint instanceof TextPaint) {
                textPaint = (TextPaint) paint;
            }
        } else if (paint instanceof TextPaint) {
            textPaint = (TextPaint) paint;
        }
        TextPaint textPaint3 = textPaint;
        if (textPaint3 != null && textPaint3.bgColor != 0) {
            int color = textPaint3.getColor();
            Paint.Style style = textPaint3.getStyle();
            textPaint3.setColor(textPaint3.bgColor);
            textPaint3.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i5, f + this.f4044c, i7, textPaint3);
            textPaint3.setStyle(style);
            textPaint3.setColor(color);
        }
        C0919i.m2404a().getClass();
        float f3 = i6;
        Paint paint2 = textPaint3;
        if (textPaint3 == null) {
            paint2 = paint;
        }
        C0931u c0931u = this.f4043b;
        C0536b c0536b = c0931u.f4040b;
        Typeface typeface = (Typeface) c0536b.f1870j;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) c0536b.f1868h, c0931u.f4039a * 2, 2, f, f3, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f4042a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        C0931u c0931u = this.f4043b;
        C0269a c0269aM2427b = c0931u.m2427b();
        int iM3a = c0269aM2427b.m3a(14);
        this.f4045d = fAbs / (iM3a != 0 ? ((ByteBuffer) c0269aM2427b.f5d).getShort(iM3a + c0269aM2427b.f2a) : (short) 0);
        C0269a c0269aM2427b2 = c0931u.m2427b();
        int iM3a2 = c0269aM2427b2.m3a(14);
        if (iM3a2 != 0) {
            ((ByteBuffer) c0269aM2427b2.f5d).getShort(iM3a2 + c0269aM2427b2.f2a);
        }
        C0269a c0269aM2427b3 = c0931u.m2427b();
        int iM3a3 = c0269aM2427b3.m3a(12);
        short s3 = (short) ((iM3a3 != 0 ? ((ByteBuffer) c0269aM2427b3.f5d).getShort(iM3a3 + c0269aM2427b3.f2a) : (short) 0) * this.f4045d);
        this.f4044c = s3;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }
}
