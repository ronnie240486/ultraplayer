package p026J;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0919i;

/* JADX INFO: renamed from: J.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0292i implements TextWatcher {

    /* JADX INFO: renamed from: g */
    public final EditText f782g;

    /* JADX INFO: renamed from: h */
    public C0291h f783h;

    /* JADX INFO: renamed from: i */
    public boolean f784i = true;

    public C0292i(EditText editText) {
        this.f782g = editText;
    }

    /* JADX INFO: renamed from: a */
    public static void m823a(EditText editText, int i3) {
        int length;
        if (i3 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0919i c0919iM2404a = C0919i.m2404a();
            if (editableText == null) {
                length = 0;
            } else {
                c0919iM2404a.getClass();
                length = editableText.length();
            }
            c0919iM2404a.m2408e(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) throws Throwable {
        EditText editText = this.f782g;
        if (editText.isInEditMode() || !this.f784i || C0919i.f4004k == null || i4 > i5 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iM2405b = C0919i.m2404a().m2405b();
        if (iM2405b != 0) {
            if (iM2405b == 1) {
                C0919i.m2404a().m2408e((Spannable) charSequence, i3, i5 + i3);
                return;
            } else if (iM2405b != 3) {
                return;
            }
        }
        C0919i c0919iM2404a = C0919i.m2404a();
        if (this.f783h == null) {
            this.f783h = new C0291h(editText);
        }
        c0919iM2404a.m2409f(this.f783h);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
    }
}
