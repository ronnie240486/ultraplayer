package p026J;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.AbstractC0917g;
import androidx.emoji2.text.C0919i;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: J.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0286c extends AbstractC0917g {

    /* JADX INFO: renamed from: a */
    public final WeakReference f771a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f772b;

    public C0286c(TextView textView, C0287d c0287d) {
        this.f771a = new WeakReference(textView);
        this.f772b = new WeakReference(c0287d);
    }

    @Override // androidx.emoji2.text.AbstractC0917g
    /* JADX INFO: renamed from: a */
    public final void mo818a() throws Throwable {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f771a.get();
        InputFilter inputFilter = (InputFilter) this.f772b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C0919i c0919iM2404a = C0919i.m2404a();
                    if (text == null) {
                        length = 0;
                    } else {
                        c0919iM2404a.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM2408e = c0919iM2404a.m2408e(text, 0, length);
                    if (text == charSequenceM2408e) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM2408e);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM2408e);
                    textView.setText(charSequenceM2408e);
                    if (charSequenceM2408e instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM2408e;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
