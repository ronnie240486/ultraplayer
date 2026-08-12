package p000A;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.zuxoplayer.app.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p003B.C0085g;
import p003B.C0090l;

/* JADX INFO: renamed from: A.b */
/* JADX INFO: loaded from: classes.dex */
public class C0027b {

    /* JADX INFO: renamed from: c */
    public static final View.AccessibilityDelegate f30c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    public final View.AccessibilityDelegate f31a;

    /* JADX INFO: renamed from: b */
    public final C0025a f32b;

    public C0027b() {
        this(f30c);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo109a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f31a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: b */
    public C0031d mo110b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f31a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0031d(2, accessibilityNodeProvider);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void mo111c(View view, AccessibilityEvent accessibilityEvent) {
        this.f31a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: d */
    public void mo112d(View view, C0090l c0090l) {
        this.f31a.onInitializeAccessibilityNodeInfo(view, c0090l.f123a);
    }

    /* JADX INFO: renamed from: e */
    public void mo113e(View view, AccessibilityEvent accessibilityEvent) {
        this.f31a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo114f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f31a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX INFO: renamed from: g */
    public boolean mo115g(View view, int i3, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i4 = 0; i4 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((C0085g) list.get(i4)).f120a).getId() != i3; i4++) {
        }
        boolean zPerformAccessibilityAction = this.f31a.performAccessibilityAction(view, i3, bundle);
        if (zPerformAccessibilityAction || i3 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i5 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i5)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i6 = 0; clickableSpanArr != null && i6 < clickableSpanArr.length; i6++) {
                if (clickableSpan.equals(clickableSpanArr[i6])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void mo116h(View view, int i3) {
        this.f31a.sendAccessibilityEvent(view, i3);
    }

    /* JADX INFO: renamed from: i */
    public void mo117i(View view, AccessibilityEvent accessibilityEvent) {
        this.f31a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0027b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f31a = accessibilityDelegate;
        this.f32b = new C0025a(this);
    }
}
