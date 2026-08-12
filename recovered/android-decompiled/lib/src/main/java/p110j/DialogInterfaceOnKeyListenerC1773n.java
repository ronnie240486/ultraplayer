package p110j;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p091e.DialogInterfaceC1476g;

/* JADX INFO: renamed from: j.n */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC1773n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC1783x {

    /* JADX INFO: renamed from: g */
    public SubMenuC1759E f7919g;

    /* JADX INFO: renamed from: h */
    public DialogInterfaceC1476g f7920h;

    /* JADX INFO: renamed from: i */
    public C1768i f7921i;

    @Override // p110j.InterfaceC1783x
    /* JADX INFO: renamed from: a */
    public final void mo3615a(MenuC1772m menuC1772m, boolean z3) {
        DialogInterfaceC1476g dialogInterfaceC1476g;
        if ((z3 || menuC1772m == this.f7919g) && (dialogInterfaceC1476g = this.f7920h) != null) {
            dialogInterfaceC1476g.dismiss();
        }
    }

    @Override // p110j.InterfaceC1783x
    /* JADX INFO: renamed from: c */
    public final boolean mo3617c(MenuC1772m menuC1772m) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        C1768i c1768i = this.f7921i;
        if (c1768i.f7887l == null) {
            c1768i.f7887l = new C1767h(c1768i);
        }
        this.f7919g.m4259q(c1768i.f7887l.getItem(i3), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f7921i.mo4214a(this.f7919g, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC1759E subMenuC1759E = this.f7919g;
        if (i3 == 82 || i3 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f7920h.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f7920h.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC1759E.m4253c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC1759E.performShortcut(i3, keyEvent, 0);
    }
}
