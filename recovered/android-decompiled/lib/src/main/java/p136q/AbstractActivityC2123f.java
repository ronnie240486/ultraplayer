package p136q;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC0978C;
import androidx.lifecycle.C1007t;
import androidx.lifecycle.FragmentC0980E;
import androidx.lifecycle.InterfaceC1005r;
import p000A.InterfaceC0049m;
import p019G1.AbstractC0230e;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: q.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC2123f extends Activity implements InterfaceC1005r, InterfaceC0049m {

    /* JADX INFO: renamed from: g */
    public final C1007t f9173g = new C1007t(this);

    @Override // p000A.InterfaceC0049m
    /* JADX INFO: renamed from: c */
    public final boolean mo258c(KeyEvent keyEvent) {
        AbstractC2364c.m4954e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC2364c.m4954e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC2364c.m4953d(decorView, "window.decorView");
        if (AbstractC0230e.m736n(decorView, keyEvent)) {
            return true;
        }
        return AbstractC0230e.m737o(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC2364c.m4954e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC2364c.m4953d(decorView, "window.decorView");
        if (AbstractC0230e.m736n(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i3 = FragmentC0980E.f4285h;
        AbstractC0978C.m2552b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC2364c.m4954e(bundle, "outState");
        this.f9173g.m2571g();
        super.onSaveInstanceState(bundle);
    }
}
