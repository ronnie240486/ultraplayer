package p000A;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import p008D.AbstractC0104a;

/* JADX INFO: renamed from: A.K */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0010K {
    /* JADX INFO: renamed from: a */
    public static View.AccessibilityDelegate m64a(View view) {
        return view.getAccessibilityDelegate();
    }

    /* JADX INFO: renamed from: b */
    public static ContentCaptureSession m65b(View view) {
        return view.getContentCaptureSession();
    }

    /* JADX INFO: renamed from: c */
    public static List<Rect> m66c(View view) {
        return view.getSystemGestureExclusionRects();
    }

    /* JADX INFO: renamed from: d */
    public static void m67d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i3, int i4) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i3, i4);
    }

    /* JADX INFO: renamed from: e */
    public static void m68e(View view, AbstractC0104a abstractC0104a) {
        view.setContentCaptureSession(null);
    }

    /* JADX INFO: renamed from: f */
    public static void m69f(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }
}
