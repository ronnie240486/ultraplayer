package p110j;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import p091e.C1472c;
import p091e.C1475f;
import p091e.DialogInterfaceC1476g;

/* JADX INFO: renamed from: j.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1768i implements InterfaceC1784y, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: g */
    public Context f7882g;

    /* JADX INFO: renamed from: h */
    public LayoutInflater f7883h;

    /* JADX INFO: renamed from: i */
    public MenuC1772m f7884i;

    /* JADX INFO: renamed from: j */
    public ExpandedMenuView f7885j;

    /* JADX INFO: renamed from: k */
    public InterfaceC1783x f7886k;

    /* JADX INFO: renamed from: l */
    public C1767h f7887l;

    public C1768i(Context context) {
        this.f7882g = context;
        this.f7883h = LayoutInflater.from(context);
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: a */
    public final void mo4214a(MenuC1772m menuC1772m, boolean z3) {
        InterfaceC1783x interfaceC1783x = this.f7886k;
        if (interfaceC1783x != null) {
            interfaceC1783x.mo3615a(menuC1772m, z3);
        }
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: c */
    public final void mo4246c(Context context, MenuC1772m menuC1772m) {
        if (this.f7882g != null) {
            this.f7882g = context;
            if (this.f7883h == null) {
                this.f7883h = LayoutInflater.from(context);
            }
        }
        this.f7884i = menuC1772m;
        C1767h c1767h = this.f7887l;
        if (c1767h != null) {
            c1767h.notifyDataSetChanged();
        }
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: d */
    public final boolean mo4215d() {
        return false;
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: e */
    public final boolean mo4247e(C1774o c1774o) {
        return false;
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: g */
    public final void mo4216g() {
        C1767h c1767h = this.f7887l;
        if (c1767h != null) {
            c1767h.notifyDataSetChanged();
        }
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: h */
    public final boolean mo4248h(C1774o c1774o) {
        return false;
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: i */
    public final void mo4217i(InterfaceC1783x interfaceC1783x) {
        throw null;
    }

    @Override // p110j.InterfaceC1784y
    /* JADX INFO: renamed from: k */
    public final boolean mo4218k(SubMenuC1759E subMenuC1759E) {
        if (!subMenuC1759E.hasVisibleItems()) {
            return false;
        }
        DialogInterfaceOnKeyListenerC1773n dialogInterfaceOnKeyListenerC1773n = new DialogInterfaceOnKeyListenerC1773n();
        dialogInterfaceOnKeyListenerC1773n.f7919g = subMenuC1759E;
        Context context = subMenuC1759E.f7895a;
        C1475f c1475f = new C1475f(context);
        C1768i c1768i = new C1768i(c1475f.getContext());
        dialogInterfaceOnKeyListenerC1773n.f7921i = c1768i;
        c1768i.f7886k = dialogInterfaceOnKeyListenerC1773n;
        subMenuC1759E.m4252b(c1768i, context);
        C1768i c1768i2 = dialogInterfaceOnKeyListenerC1773n.f7921i;
        if (c1768i2.f7887l == null) {
            c1768i2.f7887l = new C1767h(c1768i2);
        }
        C1767h c1767h = c1768i2.f7887l;
        C1472c c1472c = c1475f.f6602a;
        c1472c.f6566k = c1767h;
        c1472c.f6567l = dialogInterfaceOnKeyListenerC1773n;
        View view = subMenuC1759E.f7909o;
        if (view != null) {
            c1472c.f6560e = view;
        } else {
            c1472c.f6558c = subMenuC1759E.f7908n;
            c1475f.setTitle(subMenuC1759E.f7907m);
        }
        c1472c.f6565j = dialogInterfaceOnKeyListenerC1773n;
        DialogInterfaceC1476g dialogInterfaceC1476gCreate = c1475f.create();
        dialogInterfaceOnKeyListenerC1773n.f7920h = dialogInterfaceC1476gCreate;
        dialogInterfaceC1476gCreate.setOnDismissListener(dialogInterfaceOnKeyListenerC1773n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC1773n.f7920h.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC1773n.f7920h.show();
        InterfaceC1783x interfaceC1783x = this.f7886k;
        if (interfaceC1783x == null) {
            return true;
        }
        interfaceC1783x.mo3617c(subMenuC1759E);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i3, long j3) {
        this.f7884i.m4259q(this.f7887l.getItem(i3), this, 0);
    }
}
