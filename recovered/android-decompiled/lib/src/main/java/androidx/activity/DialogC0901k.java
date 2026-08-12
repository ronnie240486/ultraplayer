package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0981F;
import androidx.lifecycle.C1007t;
import androidx.lifecycle.EnumC0999l;
import androidx.lifecycle.InterfaceC1005r;
import p019G1.AbstractC0230e;
import p077a0.C0817b;
import p108i1.C1751d;
import p108i1.InterfaceC1752e;
import p122m1.AbstractC2003a;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: androidx.activity.k */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0901k extends Dialog implements InterfaceC1005r, InterfaceC0907q, InterfaceC1752e {

    /* JADX INFO: renamed from: g */
    public C1007t f3760g;

    /* JADX INFO: renamed from: h */
    public final C0817b f3761h;

    /* JADX INFO: renamed from: i */
    public final C0906p f3762i;

    public DialogC0901k(Context context, int i3) {
        super(context, i3);
        this.f3761h = new C0817b(this);
        this.f3762i = new C0906p(new RunnableC0892b(2, this));
    }

    /* JADX INFO: renamed from: a */
    public static void m2303a(DialogC0901k dialogC0901k) {
        AbstractC2364c.m4954e(dialogC0901k, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC2364c.m4954e(view, "view");
        m2304c();
        super.addContentView(view, layoutParams);
    }

    @Override // p108i1.InterfaceC1752e
    /* JADX INFO: renamed from: b */
    public final C1751d mo2298b() {
        return (C1751d) this.f3761h.f3429c;
    }

    /* JADX INFO: renamed from: c */
    public final void m2304c() {
        Window window = getWindow();
        AbstractC2364c.m4951b(window);
        View decorView = window.getDecorView();
        AbstractC2364c.m4953d(decorView, "window!!.decorView");
        AbstractC0981F.m2555b(decorView, this);
        Window window2 = getWindow();
        AbstractC2364c.m4951b(window2);
        View decorView2 = window2.getDecorView();
        AbstractC2364c.m4953d(decorView2, "window!!.decorView");
        AbstractC2003a.m4544q(decorView2, this);
        Window window3 = getWindow();
        AbstractC2364c.m4951b(window3);
        View decorView3 = window3.getDecorView();
        AbstractC2364c.m4953d(decorView3, "window!!.decorView");
        AbstractC0230e.m743w(decorView3, this);
    }

    @Override // androidx.lifecycle.InterfaceC1005r
    /* JADX INFO: renamed from: e */
    public final C1007t mo2300e() {
        C1007t c1007t = this.f3760g;
        if (c1007t != null) {
            return c1007t;
        }
        C1007t c1007t2 = new C1007t(this);
        this.f3760g = c1007t2;
        return c1007t2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f3762i.m2309b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC2364c.m4953d(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C0906p c0906p = this.f3762i;
            c0906p.getClass();
            c0906p.f3774e = onBackInvokedDispatcher;
            c0906p.m2310c();
        }
        this.f3761h.m2055b(bundle);
        C1007t c1007t = this.f3760g;
        if (c1007t == null) {
            c1007t = new C1007t(this);
            this.f3760g = c1007t;
        }
        c1007t.m2568d(EnumC0999l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC2364c.m4953d(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f3761h.m2056c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C1007t c1007t = this.f3760g;
        if (c1007t == null) {
            c1007t = new C1007t(this);
            this.f3760g = c1007t;
        }
        c1007t.m2568d(EnumC0999l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        C1007t c1007t = this.f3760g;
        if (c1007t == null) {
            c1007t = new C1007t(this);
            this.f3760g = c1007t;
        }
        c1007t.m2568d(EnumC0999l.ON_DESTROY);
        this.f3760g = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i3) {
        m2304c();
        super.setContentView(i3);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC2364c.m4954e(view, "view");
        m2304c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC2364c.m4954e(view, "view");
        m2304c();
        super.setContentView(view, layoutParams);
    }
}
