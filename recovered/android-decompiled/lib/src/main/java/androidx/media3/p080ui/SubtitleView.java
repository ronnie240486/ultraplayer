package androidx.media3.p080ui;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p060U1.AbstractC0610a;
import p061V.C0613a;
import p061V.C0614b;
import p061V.InterfaceC0618f;
import p083b1.C1090T;
import p083b1.C1093c;
import p083b1.C1094d;
import p083b1.InterfaceC1082K;

/* JADX INFO: loaded from: classes.dex */
public final class SubtitleView extends FrameLayout {

    /* JADX INFO: renamed from: g */
    public List f4371g;

    /* JADX INFO: renamed from: h */
    public C1094d f4372h;

    /* JADX INFO: renamed from: i */
    public float f4373i;

    /* JADX INFO: renamed from: j */
    public float f4374j;

    /* JADX INFO: renamed from: k */
    public boolean f4375k;

    /* JADX INFO: renamed from: l */
    public boolean f4376l;

    /* JADX INFO: renamed from: m */
    public int f4377m;

    /* JADX INFO: renamed from: n */
    public InterfaceC1082K f4378n;

    /* JADX INFO: renamed from: o */
    public View f4379o;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4371g = Collections.EMPTY_LIST;
        this.f4372h = C1094d.f4983g;
        this.f4373i = 0.0533f;
        this.f4374j = 0.08f;
        this.f4375k = true;
        this.f4376l = true;
        C1093c c1093c = new C1093c(context);
        this.f4378n = c1093c;
        this.f4379o = c1093c;
        addView(c1093c);
        this.f4377m = 1;
    }

    private List<C0614b> getCuesWithStylingPreferencesApplied() {
        if (this.f4375k && this.f4376l) {
            return this.f4371g;
        }
        ArrayList arrayList = new ArrayList(this.f4371g.size());
        for (int i3 = 0; i3 < this.f4371g.size(); i3++) {
            C0613a c0613aM1536a = ((C0614b) this.f4371g.get(i3)).m1536a();
            if (!this.f4375k) {
                c0613aM1536a.f2332n = false;
                CharSequence charSequence = c0613aM1536a.f2319a;
                if (charSequence instanceof Spanned) {
                    if (!(charSequence instanceof Spannable)) {
                        c0613aM1536a.f2319a = SpannableString.valueOf(charSequence);
                    }
                    CharSequence charSequence2 = c0613aM1536a.f2319a;
                    charSequence2.getClass();
                    Spannable spannable = (Spannable) charSequence2;
                    for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                        if (!(obj instanceof InterfaceC0618f)) {
                            spannable.removeSpan(obj);
                        }
                    }
                }
                AbstractC0610a.m1494F(c0613aM1536a);
            } else if (!this.f4376l) {
                AbstractC0610a.m1494F(c0613aM1536a);
            }
            arrayList.add(c0613aM1536a.m1535a());
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C1094d getUserCaptionStyle() {
        boolean zIsInEditMode = isInEditMode();
        C1094d c1094d = C1094d.f4983g;
        if (zIsInEditMode) {
            return c1094d;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        if (captioningManager != null && captioningManager.isEnabled()) {
            CaptioningManager.CaptionStyle userStyle = captioningManager.getUserStyle();
            c1094d = new C1094d(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return c1094d;
    }

    private <T extends View & InterfaceC1082K> void setView(T t3) {
        removeView(this.f4379o);
        View view = this.f4379o;
        if (view instanceof C1090T) {
            ((C1090T) view).f4971h.destroy();
        }
        this.f4379o = t3;
        this.f4378n = t3;
        addView(t3);
    }

    /* JADX INFO: renamed from: a */
    public final void m2586a() {
        setStyle(getUserCaptionStyle());
    }

    /* JADX INFO: renamed from: b */
    public final void m2587b() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    /* JADX INFO: renamed from: c */
    public final void m2588c() {
        this.f4378n.mo2924a(getCuesWithStylingPreferencesApplied(), this.f4372h, this.f4373i, this.f4374j);
    }

    public void setApplyEmbeddedFontSizes(boolean z3) {
        this.f4376l = z3;
        m2588c();
    }

    public void setApplyEmbeddedStyles(boolean z3) {
        this.f4375k = z3;
        m2588c();
    }

    public void setBottomPaddingFraction(float f) {
        this.f4374j = f;
        m2588c();
    }

    public void setCues(List<C0614b> list) {
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f4371g = list;
        m2588c();
    }

    public void setFractionalTextSize(float f) {
        this.f4373i = f;
        m2588c();
    }

    public void setStyle(C1094d c1094d) {
        this.f4372h = c1094d;
        m2588c();
    }

    public void setViewType(int i3) {
        if (this.f4377m == i3) {
            return;
        }
        if (i3 == 1) {
            setView(new C1093c(getContext()));
        } else {
            if (i3 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new C1090T(getContext()));
        }
        this.f4377m = i3;
    }
}
