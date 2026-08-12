package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p034L1.C0352g;

/* JADX INFO: renamed from: androidx.emoji2.text.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0934x implements Spannable {

    /* JADX INFO: renamed from: g */
    public boolean f4047g = false;

    /* JADX INFO: renamed from: h */
    public Spannable f4048h;

    public C0934x(Spannable spannable) {
        this.f4048h = spannable;
    }

    /* JADX INFO: renamed from: a */
    public final void m2428a() {
        Spannable spannable = this.f4048h;
        if (!this.f4047g) {
            if ((Build.VERSION.SDK_INT < 28 ? new C0352g(24) : new C0933w(24)).mo970F(spannable)) {
                this.f4048h = new SpannableString(spannable);
            }
        }
        this.f4047g = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i3) {
        return this.f4048h.charAt(i3);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f4048h.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f4048h.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f4048h.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f4048h.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f4048h.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i3, int i4, Class cls) {
        return this.f4048h.getSpans(i3, i4, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f4048h.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i3, int i4, Class cls) {
        return this.f4048h.nextSpanTransition(i3, i4, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m2428a();
        this.f4048h.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i3, int i4, int i5) {
        m2428a();
        this.f4048h.setSpan(obj, i3, i4, i5);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i3, int i4) {
        return this.f4048h.subSequence(i3, i4);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f4048h.toString();
    }
}
