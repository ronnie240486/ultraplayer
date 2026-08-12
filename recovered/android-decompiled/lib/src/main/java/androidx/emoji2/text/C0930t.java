package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import p066W1.AbstractC0664e;

/* JADX INFO: renamed from: androidx.emoji2.text.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0930t extends SpannableStringBuilder {

    /* JADX INFO: renamed from: g */
    public final Class f4036g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f4037h;

    public C0930t(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f4037h = new ArrayList();
        AbstractC0664e.m1747h(cls, "watcherClass cannot be null");
        this.f4036g = cls;
    }

    /* JADX INFO: renamed from: a */
    public final void m2421a() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f4037h;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((C0929s) arrayList.get(i3)).f4035h.incrementAndGet();
            i3++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m2422b() {
        m2425e();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f4037h;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((C0929s) arrayList.get(i3)).onTextChanged(this, 0, length(), length());
            i3++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0929s m2423c(Object obj) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f4037h;
            if (i3 >= arrayList.size()) {
                return null;
            }
            C0929s c0929s = (C0929s) arrayList.get(i3);
            if (c0929s.f4034g == obj) {
                return c0929s;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2424d(Object obj) {
        if (obj != null) {
            return this.f4036g == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i3, int i4) {
        super.delete(i3, i4);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m2425e() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f4037h;
            if (i3 >= arrayList.size()) {
                return;
            }
            ((C0929s) arrayList.get(i3)).f4035h.decrementAndGet();
            i3++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C0929s c0929sM2423c;
        if (m2424d(obj) && (c0929sM2423c = m2423c(obj)) != null) {
            obj = c0929sM2423c;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C0929s c0929sM2423c;
        if (m2424d(obj) && (c0929sM2423c = m2423c(obj)) != null) {
            obj = c0929sM2423c;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C0929s c0929sM2423c;
        if (m2424d(obj) && (c0929sM2423c = m2423c(obj)) != null) {
            obj = c0929sM2423c;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i3, int i4, Class cls) {
        if (this.f4036g != cls) {
            return super.getSpans(i3, i4, cls);
        }
        C0929s[] c0929sArr = (C0929s[]) super.getSpans(i3, i4, C0929s.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, c0929sArr.length);
        for (int i5 = 0; i5 < c0929sArr.length; i5++) {
            objArr[i5] = c0929sArr[i5].f4034g;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i3, CharSequence charSequence) {
        super.insert(i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i3, int i4, Class cls) {
        if (cls == null || this.f4036g == cls) {
            cls = C0929s.class;
        }
        return super.nextSpanTransition(i3, i4, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C0929s c0929sM2423c;
        if (m2424d(obj)) {
            c0929sM2423c = m2423c(obj);
            if (c0929sM2423c != null) {
                obj = c0929sM2423c;
            }
        } else {
            c0929sM2423c = null;
        }
        super.removeSpan(obj);
        if (c0929sM2423c != null) {
            this.f4037h.remove(c0929sM2423c);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i3, int i4, CharSequence charSequence) {
        replace(i3, i4, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i3, int i4, int i5) {
        if (m2424d(obj)) {
            C0929s c0929s = new C0929s(obj);
            this.f4037h.add(c0929s);
            obj = c0929s;
        }
        super.setSpan(obj, i3, i4, i5);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i3, int i4) {
        return new C0930t(this.f4036g, this, i3, i4);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i3, int i4) {
        super.delete(i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i3, CharSequence charSequence) {
        super.insert(i3, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i3, int i4, CharSequence charSequence, int i5, int i6) {
        replace(i3, i4, charSequence, i5, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i3, CharSequence charSequence, int i4, int i5) {
        super.insert(i3, charSequence, i4, i5);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i3, int i4, CharSequence charSequence) {
        m2421a();
        super.replace(i3, i4, charSequence);
        m2425e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i3, CharSequence charSequence, int i4, int i5) {
        super.insert(i3, charSequence, i4, i5);
        return this;
    }

    public C0930t(Class cls, C0930t c0930t, int i3, int i4) {
        super(c0930t, i3, i4);
        this.f4037h = new ArrayList();
        AbstractC0664e.m1747h(cls, "watcherClass cannot be null");
        this.f4036g = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i3, int i4, CharSequence charSequence, int i5, int i6) {
        m2421a();
        super.replace(i3, i4, charSequence, i5, i6);
        m2425e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i3, int i4) {
        super.append(charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i3, int i4) {
        super.append(charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i3, int i4) {
        super.append(charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i3) {
        super.append(charSequence, obj, i3);
        return this;
    }
}
