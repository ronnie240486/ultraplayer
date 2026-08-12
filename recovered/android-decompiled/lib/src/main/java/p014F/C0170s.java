package p014F;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p000A.C0039h;
import p000A.InterfaceC0037g;
import p000A.InterfaceC0060t;

/* JADX INFO: renamed from: F.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0170s implements InterfaceC0060t {
    /* JADX INFO: renamed from: a */
    public final C0039h m646a(View view, C0039h c0039h) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0039h);
        }
        if (c0039h.f52a.mo162j() == 2) {
            return c0039h;
        }
        InterfaceC0037g interfaceC0037g = c0039h.f52a;
        ClipData clipDataMo155c = interfaceC0037g.mo155c();
        int iMo153a = interfaceC0037g.mo153a();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z3 = false;
        for (int i3 = 0; i3 < clipDataMo155c.getItemCount(); i3++) {
            ClipData.Item itemAt = clipDataMo155c.getItemAt(i3);
            if ((iMo153a & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z3) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iMax2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, iMax2);
                    editable.replace(iMax, iMax2, charSequenceCoerceToStyledText);
                    z3 = true;
                }
            }
        }
        return null;
    }
}
