package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: androidx.emoji2.text.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0929s implements TextWatcher, SpanWatcher {

    /* JADX INFO: renamed from: g */
    public final Object f4034g;

    /* JADX INFO: renamed from: h */
    public final AtomicInteger f4035h = new AtomicInteger(0);

    public C0929s(Object obj) {
        this.f4034g = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f4034g).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        ((TextWatcher) this.f4034g).beforeTextChanged(charSequence, i3, i4, i5);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i3, int i4) {
        if (this.f4035h.get() <= 0 || !(obj instanceof C0932v)) {
            ((SpanWatcher) this.f4034g).onSpanAdded(spannable, obj, i3, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001c A[PHI: r11
      0x001c: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:8:0x0011, B:12:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        if (this.f4035h.get() <= 0 || !(obj instanceof C0932v)) {
            if (Build.VERSION.SDK_INT >= 28) {
                i7 = i3;
                i8 = i5;
            } else {
                if (i3 > i4) {
                    i3 = 0;
                }
                if (i5 > i6) {
                    i7 = i3;
                    i8 = 0;
                } else {
                    i7 = i3;
                    i8 = i5;
                }
            }
            ((SpanWatcher) this.f4034g).onSpanChanged(spannable, obj, i7, i4, i8, i6);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i3, int i4) {
        if (this.f4035h.get() <= 0 || !(obj instanceof C0932v)) {
            ((SpanWatcher) this.f4034g).onSpanRemoved(spannable, obj, i3, i4);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        ((TextWatcher) this.f4034g).onTextChanged(charSequence, i3, i4, i5);
    }
}
