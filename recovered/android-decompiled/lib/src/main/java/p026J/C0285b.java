package p026J;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.C0915e;
import androidx.emoji2.text.C0919i;
import java.nio.ByteBuffer;
import p023I.C0270b;
import p034L1.C0352g;

/* JADX INFO: renamed from: J.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0285b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final EditText f769a;

    /* JADX INFO: renamed from: b */
    public final C0352g f770b;

    public C0285b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C0352g c0352g = new C0352g(4);
        super(inputConnection, false);
        this.f769a = editText;
        this.f770b = c0352g;
        if (C0919i.f4004k != null) {
            C0919i c0919iM2404a = C0919i.m2404a();
            if (c0919iM2404a.m2405b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C0915e c0915e = c0919iM2404a.f4009e;
            c0915e.getClass();
            Bundle bundle = editorInfo.extras;
            C0270b c0270b = (C0270b) c0915e.f3999c.f1867g;
            int iM3a = c0270b.m3a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM3a != 0 ? ((ByteBuffer) c0270b.f5d).getInt(iM3a + c0270b.f2a) : 0);
            Bundle bundle2 = editorInfo.extras;
            c0915e.f3997a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i3, int i4) {
        Editable editableText = this.f769a.getEditableText();
        this.f770b.getClass();
        return C0352g.m961E(this, editableText, i3, i4, false) || super.deleteSurroundingText(i3, i4);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i3, int i4) {
        Editable editableText = this.f769a.getEditableText();
        this.f770b.getClass();
        return C0352g.m961E(this, editableText, i3, i4, true) || super.deleteSurroundingTextInCodePoints(i3, i4);
    }
}
