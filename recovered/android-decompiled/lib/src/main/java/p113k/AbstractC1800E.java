package p113k;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p000A.AbstractC0016Q;
import p000A.C0031d;
import p000A.C0035f;
import p000A.InterfaceC0033e;

/* JADX INFO: renamed from: k.E */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1800E {
    /* JADX INFO: renamed from: a */
    public static boolean m4288a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0033e c0031d;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0031d = new C0031d(clipData, 3);
            } else {
                C0035f c0035f = new C0035f();
                c0035f.f46h = clipData;
                c0035f.f47i = 3;
                c0031d = c0035f;
            }
            AbstractC0016Q.m84f(textView, c0031d.mo157e());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4289b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0033e c0031d;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0031d = new C0031d(clipData, 3);
        } else {
            C0035f c0035f = new C0035f();
            c0035f.f46h = clipData;
            c0035f.f47i = 3;
            c0031d = c0035f;
        }
        AbstractC0016Q.m84f(view, c0031d.mo157e());
        return true;
    }
}
