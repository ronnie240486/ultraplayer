package p026J;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C0919i;

/* JADX INFO: renamed from: J.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0287d implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final TextView f773a;

    /* JADX INFO: renamed from: b */
    public C0286c f774b;

    public C0287d(TextView textView) {
        this.f773a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i3, int i4, Spanned spanned, int i5, int i6) {
        TextView textView = this.f773a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM2405b = C0919i.m2404a().m2405b();
        if (iM2405b != 0) {
            if (iM2405b == 1) {
                if ((i6 == 0 && i5 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i3 != 0 || i4 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i3, i4);
                }
                return C0919i.m2404a().m2408e(charSequence, 0, charSequence.length());
            }
            if (iM2405b != 3) {
                return charSequence;
            }
        }
        C0919i c0919iM2404a = C0919i.m2404a();
        if (this.f774b == null) {
            this.f774b = new C0286c(textView, this);
        }
        c0919iM2404a.m2409f(this.f774b);
        return charSequence;
    }
}
