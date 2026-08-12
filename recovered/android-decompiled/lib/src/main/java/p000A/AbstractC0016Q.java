package p000A;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.zuxoplayer.app.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p014F.C0170s;
import p113k.C1895u;

/* JADX INFO: renamed from: A.Q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0016Q {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap f14a = null;

    /* JADX INFO: renamed from: b */
    public static Field f15b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f16c = false;

    /* JADX INFO: renamed from: d */
    public static final C0066z f17d = new C0066z();

    /* JADX INFO: renamed from: e */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0001B f18e = new ViewTreeObserverOnGlobalLayoutListenerC0001B();

    /* JADX INFO: renamed from: a */
    public static C0026a0 m79a(View view) {
        if (f14a == null) {
            f14a = new WeakHashMap();
        }
        C0026a0 c0026a0 = (C0026a0) f14a.get(view);
        if (c0026a0 != null) {
            return c0026a0;
        }
        C0026a0 c0026a1 = new C0026a0(view);
        f14a.put(view, c0026a1);
        return c0026a1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m80b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C0015P.f10d;
        C0015P c0015p = (C0015P) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c0015p == null) {
            c0015p = new C0015P();
            c0015p.f11a = null;
            c0015p.f12b = null;
            c0015p.f13c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c0015p);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c0015p.f11a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C0015P.f10d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c0015p.f11a == null) {
                            c0015p.f11a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C0015P.f10d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c0015p.f11a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c0015p.f11a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        View viewM78a = c0015p.m78a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM78a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c0015p.f12b == null) {
                    c0015p.f12b = new SparseArray();
                }
                c0015p.f12b.put(keyCode, new WeakReference(viewM78a));
            }
        }
        return viewM78a != null;
    }

    /* JADX INFO: renamed from: c */
    public static View.AccessibilityDelegate m81c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0010K.m64a(view);
        }
        if (f16c) {
            return null;
        }
        if (f15b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f15b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f16c = true;
                return null;
            }
        }
        try {
            Object obj = f15b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f16c = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String[] m82d(C1895u c1895u) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC0012M.m75a(c1895u) : (String[]) c1895u.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* JADX INFO: renamed from: e */
    public static void m83e(View view, int i3) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i4 = Build.VERSION.SDK_INT;
            Object objM55b = null;
            if (i4 >= 28) {
                tag = AbstractC0009J.m55b(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z3 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z3) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z3 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i3);
                if (z3) {
                    List<CharSequence> text = accessibilityEventObtain.getText();
                    if (i4 >= 28) {
                        objM55b = AbstractC0009J.m55b(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            objM55b = tag2;
                        }
                    }
                    text.add((CharSequence) objM55b);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i3 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i3);
                        return;
                    } catch (AbstractMethodError e3) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e3);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i3);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            List<CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i4 >= 28) {
                objM55b = AbstractC0009J.m55b(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    objM55b = tag3;
                }
            }
            text2.add((CharSequence) objM55b);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static C0039h m84f(View view, C0039h c0039h) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0039h + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0012M.m76b(view, c0039h);
        }
        InterfaceC0060t interfaceC0060t = (InterfaceC0060t) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0061u interfaceC0061u = f17d;
        if (interfaceC0060t == null) {
            if (view instanceof InterfaceC0061u) {
                interfaceC0061u = (InterfaceC0061u) view;
            }
            return interfaceC0061u.mo321a(c0039h);
        }
        C0039h c0039hM646a = ((C0170s) interfaceC0060t).m646a(view, c0039h);
        if (c0039hM646a == null) {
            return null;
        }
        if (view instanceof InterfaceC0061u) {
            interfaceC0061u = (InterfaceC0061u) view;
        }
        return interfaceC0061u.mo321a(c0039hM646a);
    }

    /* JADX INFO: renamed from: g */
    public static void m85g(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0010K.m67d(view, context, iArr, attributeSet, typedArray, i3, 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m86h(View view, C0027b c0027b) {
        if (c0027b == null && (m81c(view) instanceof C0025a)) {
            c0027b = new C0027b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0027b == null ? null : c0027b.f32b);
    }

    /* JADX INFO: renamed from: i */
    public static void m87i(View view, CharSequence charSequence) {
        new C0000A(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m4d(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC0001B viewTreeObserverOnGlobalLayoutListenerC0001B = f18e;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0001B.f1g.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0001B);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0001B);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0001B.f1g.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0001B);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0001B);
            }
        }
    }
}
