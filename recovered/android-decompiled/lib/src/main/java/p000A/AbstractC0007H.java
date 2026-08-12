package p000A;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

/* JADX INFO: renamed from: A.H */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0007H {
    /* JADX INFO: renamed from: a */
    public static void m38a(View view, Collection<View> collection, int i3) {
        view.addKeyboardNavigationClusters(collection, i3);
    }

    /* JADX INFO: renamed from: b */
    public static AutofillId m39b(View view) {
        return view.getAutofillId();
    }

    /* JADX INFO: renamed from: c */
    public static int m40c(View view) {
        return view.getImportantForAutofill();
    }

    /* JADX INFO: renamed from: d */
    public static int m41d(View view) {
        return view.getNextClusterForwardId();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m42e(View view) {
        return view.hasExplicitFocusable();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m43f(View view) {
        return view.isFocusedByDefault();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m44g(View view) {
        return view.isImportantForAutofill();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m45h(View view) {
        return view.isKeyboardNavigationCluster();
    }

    /* JADX INFO: renamed from: i */
    public static View m46i(View view, View view2, int i3) {
        return view.keyboardNavigationClusterSearch(view2, i3);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m47j(View view) {
        return view.restoreDefaultFocus();
    }

    /* JADX INFO: renamed from: k */
    public static void m48k(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    /* JADX INFO: renamed from: l */
    public static void m49l(View view, boolean z3) {
        view.setFocusedByDefault(z3);
    }

    /* JADX INFO: renamed from: m */
    public static void m50m(View view, int i3) {
        view.setImportantForAutofill(i3);
    }

    /* JADX INFO: renamed from: n */
    public static void m51n(View view, boolean z3) {
        view.setKeyboardNavigationCluster(z3);
    }

    /* JADX INFO: renamed from: o */
    public static void m52o(View view, int i3) {
        view.setNextClusterForwardId(i3);
    }

    /* JADX INFO: renamed from: p */
    public static void m53p(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}
