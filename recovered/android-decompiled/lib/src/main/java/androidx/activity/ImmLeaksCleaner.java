package androidx.activity;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0999l;
import androidx.lifecycle.InterfaceC1003p;
import androidx.lifecycle.InterfaceC1005r;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC1003p {

    /* JADX INFO: renamed from: b */
    public static int f3715b;

    /* JADX INFO: renamed from: c */
    public static Field f3716c;

    /* JADX INFO: renamed from: d */
    public static Field f3717d;

    /* JADX INFO: renamed from: e */
    public static Field f3718e;

    /* JADX INFO: renamed from: a */
    public AbstractActivityC0900j f3719a;

    @Override // androidx.lifecycle.InterfaceC1003p
    /* JADX INFO: renamed from: b */
    public final void mo2288b(InterfaceC1005r interfaceC1005r, EnumC0999l enumC0999l) {
        if (enumC0999l != EnumC0999l.ON_DESTROY) {
            return;
        }
        if (f3715b == 0) {
            try {
                f3715b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f3717d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f3718e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f3716c = declaredField3;
                declaredField3.setAccessible(true);
                f3715b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f3715b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f3719a.getSystemService("input_method");
            try {
                Object obj = f3716c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f3717d.get(inputMethodManager);
                            if (view != null) {
                                if (!view.isAttachedToWindow()) {
                                    try {
                                        f3718e.set(inputMethodManager, null);
                                        inputMethodManager.isActive();
                                    } catch (IllegalAccessException unused2) {
                                    }
                                }
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
