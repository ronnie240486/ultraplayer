package p164y;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;
import p000A.AbstractC0045k;

/* JADX INFO: renamed from: y.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2370d {

    /* JADX INFO: renamed from: a */
    public final TextPaint f9923a;

    /* JADX INFO: renamed from: b */
    public final TextDirectionHeuristic f9924b;

    /* JADX INFO: renamed from: c */
    public final int f9925c;

    /* JADX INFO: renamed from: d */
    public final int f9926d;

    public C2370d(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0045k.m238i(textPaint).setBreakStrategy(i3).setHyphenationFrequency(i4).setTextDirection(textDirectionHeuristic).build();
        }
        this.f9923a = textPaint;
        this.f9924b = textDirectionHeuristic;
        this.f9925c = i3;
        this.f9926d = i4;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0024  */
    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b7  */
    public final boolean equals(Object obj) {
        TextPaint textPaint;
        float textScaleX;
        TextPaint textPaint2;
        boolean z3;
        if (obj != this) {
            if (obj instanceof C2370d) {
                C2370d c2370d = (C2370d) obj;
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 23) {
                    if (this.f9925c == c2370d.f9925c && this.f9926d == c2370d.f9926d) {
                        textPaint = this.f9923a;
                        if (textPaint.getTextSize() != c2370d.f9923a.getTextSize()) {
                            z3 = false;
                        } else {
                            textScaleX = textPaint.getTextScaleX();
                            textPaint2 = c2370d.f9923a;
                            if (textScaleX != textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && (i3 < 24 ? textPaint.getTextLocale().equals(textPaint2.getTextLocale()) : textPaint.getTextLocales().equals(textPaint2.getTextLocales())) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                    } else {
                        z3 = false;
                    }
                } else {
                    textPaint = this.f9923a;
                    if (textPaint.getTextSize() != c2370d.f9923a.getTextSize()) {
                        z3 = false;
                    } else {
                        textScaleX = textPaint.getTextScaleX();
                        textPaint2 = c2370d.f9923a;
                        if (textScaleX != textPaint2.getTextScaleX()) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                    }
                }
                if (z3 && this.f9924b == c2370d.f9924b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        TextDirectionHeuristic textDirectionHeuristic = this.f9924b;
        int i3 = Build.VERSION.SDK_INT;
        int i4 = this.f9926d;
        int i5 = this.f9925c;
        TextPaint textPaint = this.f9923a;
        return i3 >= 24 ? Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i5), Integer.valueOf(i4)) : Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i5), Integer.valueOf(i4));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f9923a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i3 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i3 >= 24) {
            sb.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i3 >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f9924b);
        sb.append(", breakStrategy=" + this.f9925c);
        sb.append(", hyphenationFrequency=" + this.f9926d);
        sb.append("}");
        return sb.toString();
    }

    public C2370d(PrecomputedText.Params params) {
        this.f9923a = params.getTextPaint();
        this.f9924b = params.getTextDirection();
        this.f9925c = params.getBreakStrategy();
        this.f9926d = params.getHyphenationFrequency();
    }
}
