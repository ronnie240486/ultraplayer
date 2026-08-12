package p026J;

import android.support.v4.media.session.C0858A;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import p034L1.C0352g;

/* JADX INFO: renamed from: J.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0288e implements KeyListener {

    /* JADX INFO: renamed from: a */
    public final KeyListener f775a;

    /* JADX INFO: renamed from: b */
    public final C0352g f776b;

    public C0288e(KeyListener keyListener) {
        C0352g c0352g = new C0352g(5);
        this.f775a = keyListener;
        this.f776b = c0352g;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i3) {
        this.f775a.clearMetaKeyState(view, editable, i3);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f775a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i3, KeyEvent keyEvent) {
        boolean zM2151u;
        boolean z3;
        this.f776b.getClass();
        if (i3 != 67) {
            zM2151u = i3 != 112 ? false : C0858A.m2151u(editable, keyEvent, true);
        } else {
            zM2151u = C0858A.m2151u(editable, keyEvent, false);
        }
        if (zM2151u) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z3 = true;
        } else {
            z3 = false;
        }
        return z3 || this.f775a.onKeyDown(view, editable, i3, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f775a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i3, KeyEvent keyEvent) {
        return this.f775a.onKeyUp(view, editable, i3, keyEvent);
    }
}
