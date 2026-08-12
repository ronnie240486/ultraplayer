package p000A;

import android.view.View;
import com.zuxoplayer.app.R;
import java.util.Objects;
import p006C.AbstractC0100a;
import p124n.C2022i;

/* JADX INFO: renamed from: A.J */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0009J {
    /* JADX INFO: renamed from: a */
    public static void m54a(View view, InterfaceC0014O interfaceC0014O) {
        C2022i c2022i = (C2022i) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c2022i == null) {
            c2022i = new C2022i();
            view.setTag(R.id.tag_unhandled_key_listeners, c2022i);
        }
        Objects.requireNonNull(interfaceC0014O);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0008I = new ViewOnUnhandledKeyEventListenerC0008I();
        c2022i.put(interfaceC0014O, viewOnUnhandledKeyEventListenerC0008I);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0008I);
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m55b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m56c(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m57d(View view) {
        return view.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: e */
    public static void m58e(View view, InterfaceC0014O interfaceC0014O) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C2022i c2022i = (C2022i) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c2022i == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c2022i.getOrDefault(interfaceC0014O, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* JADX INFO: renamed from: f */
    public static <T> T m59f(View view, int i3) {
        return (T) view.requireViewById(i3);
    }

    /* JADX INFO: renamed from: g */
    public static void m60g(View view, boolean z3) {
        view.setAccessibilityHeading(z3);
    }

    /* JADX INFO: renamed from: h */
    public static void m61h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* JADX INFO: renamed from: i */
    public static void m62i(View view, AbstractC0100a abstractC0100a) {
        view.setAutofillId(null);
    }

    /* JADX INFO: renamed from: j */
    public static void m63j(View view, boolean z3) {
        view.setScreenReaderFocusable(z3);
    }
}
