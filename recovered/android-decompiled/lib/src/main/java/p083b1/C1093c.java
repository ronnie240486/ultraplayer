package p083b1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p060U1.AbstractC0610a;
import p061V.C0613a;
import p061V.C0614b;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: b1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1093c extends View implements InterfaceC1082K {

    /* JADX INFO: renamed from: g */
    public final ArrayList f4978g;

    /* JADX INFO: renamed from: h */
    public List f4979h;

    /* JADX INFO: renamed from: i */
    public float f4980i;

    /* JADX INFO: renamed from: j */
    public C1094d f4981j;

    /* JADX INFO: renamed from: k */
    public float f4982k;

    public C1093c(Context context) {
        super(context, null);
        this.f4978g = new ArrayList();
        this.f4979h = Collections.EMPTY_LIST;
        this.f4980i = 0.0533f;
        this.f4981j = C1094d.f4983g;
        this.f4982k = 0.08f;
    }

    @Override // p083b1.InterfaceC1082K
    /* JADX INFO: renamed from: a */
    public final void mo2924a(List list, C1094d c1094d, float f, float f3) {
        this.f4979h = list;
        this.f4981j = c1094d;
        this.f4980i = f;
        this.f4982k = f3;
        while (true) {
            ArrayList arrayList = this.f4978g;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new C1081J(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:193:0x047e  */
    /* JADX WARN: Code duplicated, block: B:195:0x0481  */
    /* JADX WARN: Code duplicated, block: B:197:0x0484  */
    /* JADX WARN: Code duplicated, block: B:53:0x0117  */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f;
        int i3;
        int i4;
        int i5;
        float f3;
        int i6;
        int iRound;
        float f4;
        int i7;
        float f5;
        int i8;
        int iMax;
        int iMin;
        int iRound2;
        C1093c c1093c = this;
        List list = c1093c.f4979h;
        if (list.isEmpty()) {
            return;
        }
        int height = c1093c.getHeight();
        int paddingLeft = c1093c.getPaddingLeft();
        int paddingTop = c1093c.getPaddingTop();
        int width = c1093c.getWidth() - c1093c.getPaddingRight();
        int paddingBottom = height - c1093c.getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i9 = paddingBottom - paddingTop;
        float fM1495G = AbstractC0610a.m1495G(0, c1093c.f4980i, height, i9);
        if (fM1495G <= 0.0f) {
            return;
        }
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            C0614b c0614bM1535a = (C0614b) list.get(i10);
            if (c0614bM1535a.f2370p != Integer.MIN_VALUE) {
                C0613a c0613aM1536a = c0614bM1535a.m1536a();
                c0613aM1536a.f2326h = -3.4028235E38f;
                c0613aM1536a.f2327i = Integer.MIN_VALUE;
                c0613aM1536a.f2321c = null;
                int i11 = c0614bM1535a.f2360f;
                f = -3.4028235E38f;
                float f6 = c0614bM1535a.f2359e;
                if (i11 == 0) {
                    c0613aM1536a.f2323e = 1.0f - f6;
                    c0613aM1536a.f2324f = 0;
                } else {
                    c0613aM1536a.f2323e = (-f6) - 1.0f;
                    c0613aM1536a.f2324f = 1;
                }
                int i12 = c0614bM1535a.f2361g;
                if (i12 == 0) {
                    c0613aM1536a.f2325g = 2;
                } else if (i12 == 2) {
                    c0613aM1536a.f2325g = 0;
                }
                c0614bM1535a = c0613aM1536a.m1535a();
            } else {
                f = -3.4028235E38f;
            }
            float fM1495G2 = AbstractC0610a.m1495G(c0614bM1535a.f2368n, c0614bM1535a.f2369o, height, i9);
            C1081J c1081j = (C1081J) c1093c.f4978g.get(i10);
            C1094d c1094d = c1093c.f4981j;
            List list2 = list;
            float f7 = c1093c.f4982k;
            c1081j.getClass();
            Bitmap bitmap = c0614bM1535a.f2358d;
            int i13 = height;
            boolean z3 = bitmap == null;
            int i14 = i9;
            CharSequence charSequence = c0614bM1535a.f2355a;
            if (z3) {
                if (TextUtils.isEmpty(charSequence)) {
                    f3 = fM1495G;
                    i3 = size;
                    i5 = i10;
                } else {
                    i3 = size;
                    i4 = c0614bM1535a.f2366l ? c0614bM1535a.f2367m : c1094d.f4986c;
                }
                i10 = i5 + 1;
                list = list2;
                height = i13;
                i9 = i14;
                size = i3;
                fM1495G = f3;
                paddingLeft = paddingLeft;
                paddingTop = paddingTop;
                c1093c = this;
            } else {
                i3 = size;
                i4 = -16777216;
            }
            i5 = i10;
            CharSequence charSequence2 = c1081j.f4947i;
            TextPaint textPaint = c1081j.f4944f;
            float f8 = c0614bM1535a.f2365k;
            f3 = fM1495G;
            float f9 = c0614bM1535a.f2364j;
            int i15 = c0614bM1535a.f2363i;
            float f10 = c0614bM1535a.f2362h;
            int i16 = c0614bM1535a.f2361g;
            int i17 = c0614bM1535a.f2360f;
            float f11 = c0614bM1535a.f2359e;
            Layout.Alignment alignment = c0614bM1535a.f2356b;
            if (charSequence2 == charSequence || (charSequence2 != null && charSequence2.equals(charSequence))) {
                Layout.Alignment alignment2 = c1081j.f4948j;
                int i18 = AbstractC0632A.f2454a;
                if (Objects.equals(alignment2, alignment) && c1081j.f4949k == bitmap && c1081j.f4950l == f11 && c1081j.f4951m == i17) {
                    i6 = i16;
                    if (Integer.valueOf(c1081j.f4952n).equals(Integer.valueOf(i6)) && c1081j.f4953o == f10 && Integer.valueOf(c1081j.f4954p).equals(Integer.valueOf(i15)) && c1081j.f4955q == f9 && c1081j.f4956r == f8 && c1081j.f4957s == c1094d.f4984a && c1081j.f4958t == c1094d.f4985b && c1081j.f4959u == i4 && c1081j.f4961w == c1094d.f4987d && c1081j.f4960v == c1094d.f4988e && Objects.equals(textPaint.getTypeface(), c1094d.f4989f) && c1081j.f4962x == f3 && c1081j.f4963y == fM1495G2 && c1081j.f4964z == f7 && c1081j.f4929A == paddingLeft && c1081j.f4930B == paddingTop && c1081j.f4931C == width && c1081j.f4932D == paddingBottom) {
                        c1081j.m2923a(canvas, z3);
                    }
                    i10 = i5 + 1;
                    list = list2;
                    height = i13;
                    i9 = i14;
                    size = i3;
                    fM1495G = f3;
                    paddingLeft = paddingLeft;
                    paddingTop = paddingTop;
                    c1093c = this;
                } else {
                    i6 = i16;
                }
            } else {
                i6 = i16;
            }
            c1081j.f4947i = charSequence;
            c1081j.f4948j = alignment;
            c1081j.f4949k = bitmap;
            c1081j.f4950l = f11;
            c1081j.f4951m = i17;
            c1081j.f4952n = i6;
            c1081j.f4953o = f10;
            c1081j.f4954p = i15;
            c1081j.f4955q = f9;
            c1081j.f4956r = f8;
            c1081j.f4957s = c1094d.f4984a;
            c1081j.f4958t = c1094d.f4985b;
            c1081j.f4959u = i4;
            c1081j.f4961w = c1094d.f4987d;
            c1081j.f4960v = c1094d.f4988e;
            textPaint.setTypeface(c1094d.f4989f);
            c1081j.f4962x = f3;
            c1081j.f4963y = fM1495G2;
            c1081j.f4964z = f7;
            c1081j.f4929A = paddingLeft;
            c1081j.f4930B = paddingTop;
            c1081j.f4931C = width;
            c1081j.f4932D = paddingBottom;
            if (z3) {
                c1081j.f4947i.getClass();
                CharSequence charSequence3 = c1081j.f4947i;
                SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(c1081j.f4947i);
                int i19 = c1081j.f4931C - c1081j.f4929A;
                int i20 = c1081j.f4932D - c1081j.f4930B;
                textPaint.setTextSize(c1081j.f4962x);
                int i21 = (int) ((c1081j.f4962x * 0.125f) + 0.5f);
                int i22 = i21 * 2;
                int i23 = i19 - i22;
                float f12 = c1081j.f4955q;
                if (f12 != f) {
                    i23 = (int) (i23 * f12);
                }
                int i24 = i23;
                if (i24 <= 0) {
                    AbstractC0646n.m1647y("SubtitlePainter", "Skipped drawing subtitle cue (insufficient space)");
                    f3 = f3;
                    paddingLeft = paddingLeft;
                    paddingTop = paddingTop;
                } else {
                    if (c1081j.f4963y > 0.0f) {
                        f3 = f3;
                        i8 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) c1081j.f4963y), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        f3 = f3;
                        i8 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (c1081j.f4961w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i8, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i25 = 0;
                        for (int length = foregroundColorSpanArr.length; i25 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i25]);
                            i25++;
                        }
                    }
                    if (Color.alpha(c1081j.f4958t) > 0) {
                        int i26 = c1081j.f4961w;
                        if (i26 == 0 || i26 == 2) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(c1081j.f4958t), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(c1081j.f4958t), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment3 = c1081j.f4948j;
                    if (alignment3 == null) {
                        alignment3 = Layout.Alignment.ALIGN_CENTER;
                    }
                    Layout.Alignment alignment4 = alignment3;
                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder3, r2, i24, alignment4, c1081j.f4942d, c1081j.f4943e, true);
                    c1081j.f4933E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int lineCount = c1081j.f4933E.getLineCount();
                    int i27 = 0;
                    int iMax2 = 0;
                    while (i27 < lineCount) {
                        iMax2 = Math.max((int) Math.ceil(c1081j.f4933E.getLineWidth(i27)), iMax2);
                        i27++;
                        lineCount = lineCount;
                        spannableStringBuilder2 = spannableStringBuilder2;
                    }
                    SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder2;
                    int i28 = ((c1081j.f4955q == f || iMax2 >= i24) ? iMax2 : i24) + i22;
                    float f13 = c1081j.f4953o;
                    if (f13 != f) {
                        int iRound3 = Math.round(i19 * f13);
                        int i29 = c1081j.f4929A;
                        int i30 = iRound3 + i29;
                        int i31 = c1081j.f4954p;
                        if (i31 == 1) {
                            i30 = ((i30 * 2) - i28) / 2;
                        } else if (i31 == 2) {
                            i30 -= i28;
                        }
                        iMax = Math.max(i30, i29);
                        iMin = Math.min(iMax + i28, c1081j.f4931C);
                    } else {
                        iMax = c1081j.f4929A + ((i19 - i28) / 2);
                        iMin = iMax + i28;
                    }
                    int i32 = iMin - iMax;
                    if (i32 <= 0) {
                        AbstractC0646n.m1647y("SubtitlePainter", "Skipped drawing subtitle cue (invalid horizontal positioning)");
                    } else {
                        float f14 = c1081j.f4950l;
                        if (f14 != f) {
                            if (c1081j.f4951m == 0) {
                                iRound2 = Math.round(i20 * f14) + c1081j.f4930B;
                                int i33 = c1081j.f4952n;
                                if (i33 == 2) {
                                    iRound2 -= height2;
                                } else if (i33 == 1) {
                                    iRound2 = ((iRound2 * 2) - height2) / 2;
                                }
                            } else {
                                int lineBottom = c1081j.f4933E.getLineBottom(0) - c1081j.f4933E.getLineTop(0);
                                float f15 = c1081j.f4950l;
                                iRound2 = f15 >= 0.0f ? Math.round(f15 * lineBottom) + c1081j.f4930B : (Math.round((f15 + 1.0f) * lineBottom) + c1081j.f4932D) - height2;
                            }
                            int i34 = iRound2 + height2;
                            int i35 = c1081j.f4932D;
                            if (i34 > i35) {
                                iRound2 = i35 - height2;
                            } else {
                                int i36 = c1081j.f4930B;
                                if (iRound2 < i36) {
                                    iRound2 = i36;
                                }
                            }
                        } else {
                            iRound2 = (c1081j.f4932D - height2) - ((int) (i20 * c1081j.f4964z));
                        }
                        c1081j.f4933E = new StaticLayout(spannableStringBuilder3, r2, i32, alignment4, c1081j.f4942d, c1081j.f4943e, true);
                        c1081j.f4934F = new StaticLayout(spannableStringBuilder4, textPaint, i32, alignment4, c1081j.f4942d, c1081j.f4943e, true);
                        c1081j.f4935G = iMax;
                        c1081j.f4936H = iRound2;
                        c1081j.f4937I = i21;
                    }
                }
            } else {
                paddingLeft = paddingLeft;
                paddingTop = paddingTop;
                c1081j.f4949k.getClass();
                Bitmap bitmap2 = c1081j.f4949k;
                int i37 = c1081j.f4931C;
                int i38 = c1081j.f4929A;
                int i39 = c1081j.f4932D;
                int i40 = c1081j.f4930B;
                float f16 = i37 - i38;
                float f17 = (c1081j.f4953o * f16) + i38;
                float f18 = i39 - i40;
                float f19 = (c1081j.f4950l * f18) + i40;
                int iRound4 = Math.round(f16 * c1081j.f4955q);
                float f20 = c1081j.f4956r;
                if (f20 != f) {
                    f3 = f3;
                    iRound = Math.round(f18 * f20);
                } else {
                    f3 = f3;
                    iRound = Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * iRound4);
                }
                int i41 = c1081j.f4954p;
                if (i41 == 2) {
                    f4 = iRound4;
                } else {
                    if (i41 == 1) {
                        f4 = iRound4 / 2;
                    }
                    int iRound5 = Math.round(f17);
                    i7 = c1081j.f4952n;
                    if (i7 == 2) {
                        f5 = iRound;
                    } else {
                        if (i7 == 1) {
                            f5 = iRound / 2;
                        }
                        int iRound6 = Math.round(f19);
                        c1081j.f4938J = new Rect(iRound5, iRound6, iRound4 + iRound5, iRound + iRound6);
                    }
                    f19 -= f5;
                    int iRound7 = Math.round(f19);
                    c1081j.f4938J = new Rect(iRound5, iRound7, iRound4 + iRound5, iRound + iRound7);
                }
                f17 -= f4;
                int iRound8 = Math.round(f17);
                i7 = c1081j.f4952n;
                if (i7 == 2) {
                    f5 = iRound;
                } else {
                    if (i7 == 1) {
                        f5 = iRound / 2;
                    }
                    int iRound9 = Math.round(f19);
                    c1081j.f4938J = new Rect(iRound8, iRound9, iRound4 + iRound8, iRound + iRound9);
                }
                f19 -= f5;
                int iRound10 = Math.round(f19);
                c1081j.f4938J = new Rect(iRound8, iRound10, iRound4 + iRound8, iRound + iRound10);
            }
            c1081j.m2923a(canvas, z3);
            i10 = i5 + 1;
            list = list2;
            height = i13;
            i9 = i14;
            size = i3;
            fM1495G = f3;
            paddingLeft = paddingLeft;
            paddingTop = paddingTop;
            c1093c = this;
        }
    }
}
