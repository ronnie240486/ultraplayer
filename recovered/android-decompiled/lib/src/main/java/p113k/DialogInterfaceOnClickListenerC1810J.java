package p113k;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import p091e.C1472c;
import p091e.C1475f;
import p091e.DialogInterfaceC1476g;

/* JADX INFO: renamed from: k.J */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1810J implements InterfaceC1822P, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: g */
    public DialogInterfaceC1476g f8038g;

    /* JADX INFO: renamed from: h */
    public C1812K f8039h;

    /* JADX INFO: renamed from: i */
    public CharSequence f8040i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C1824Q f8041j;

    public DialogInterfaceOnClickListenerC1810J(C1824Q c1824q) {
        this.f8041j = c1824q;
    }

    @Override // p113k.InterfaceC1822P
    /* JADX INFO: renamed from: a */
    public final void mo4305a(int i3) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p113k.InterfaceC1822P
    /* JADX INFO: renamed from: b */
    public final boolean mo4306b() {
        DialogInterfaceC1476g dialogInterfaceC1476g = this.f8038g;
        if (dialogInterfaceC1476g != null) {
            return dialogInterfaceC1476g.isShowing();
        }
        return false;
    }

    @Override // p113k.InterfaceC1822P
    /* JADX INFO: renamed from: c */
    public final int mo4307c() {
        return 0;
    }

    @Override // p113k.InterfaceC1822P
    public final void dismiss() {
        DialogInterfaceC1476g dialogInterfaceC1476g = this.f8038g;
        if (dialogInterfaceC1476g != null) {
            dialogInterfaceC1476g.dismiss();
            this.f8038g = null;
        }
    }

    @Override // p113k.InterfaceC1822P
    /* JADX INFO: renamed from: e */
    public final void mo4308e(int i3, int i4) {
        if (this.f8039h == null) {
            return;
        }
        C1824Q c1824q = this.f8041j;
        C1475f c1475f = new C1475f(c1824q.getPopupContext());
        CharSequence charSequence = this.f8040i;
        if (charSequence != null) {
            c1475f.setTitle(charSequence);
        }
        C1812K c1812k = this.f8039h;
        int selectedItemPosition = c1824q.getSelectedItemPosition();
        C1472c c1472c = c1475f.f6602a;
        c1472c.f6566k = c1812k;
        c1472c.f6567l = this;
        c1472c.f6570o = selectedItemPosition;
        c1472c.f6569n = true;
        DialogInterfaceC1476g dialogInterfaceC1476gCreate = c1475f.create();
        this.f8038g = dialogInterfaceC1476gCreate;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC1476gCreate.f6604l.f6580e;
        alertController$RecycleListView.setTextDirection(i3);
        alertController$RecycleListView.setTextAlignment(i4);
        this.f8038g.show();
    }

    @Override // p113k.InterfaceC1822P
    /* JADX INFO: renamed from: g */
    public final int mo4309g() {
        return 0;
    }

    @Override // p113k.InterfaceC1822P
    /* JADX INFO: renamed from: h */
    public final Drawable mo4310h() {
        return null;
    }

    @Override // p113k.InterfaceC1822P
    /* JADX INFO: renamed from: i */
    public final CharSequence mo4311i() {
        return this.f8040i;
    }

    @Override // p113k.InterfaceC1822P
    /* JADX INFO: renamed from: k */
    public final void mo4312k(CharSequence charSequence) {
        this.f8040i = charSequence;
    }

    @Override // p113k.InterfaceC1822P
    /* JADX INFO: renamed from: m */
    public final void mo4313m(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p113k.InterfaceC1822P
    /* JADX INFO: renamed from: n */
    public final void mo4314n(int i3) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p113k.InterfaceC1822P
    /* JADX INFO: renamed from: o */
    public final void mo4296o(ListAdapter listAdapter) {
        this.f8039h = (C1812K) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        C1824Q c1824q = this.f8041j;
        c1824q.setSelection(i3);
        if (c1824q.getOnItemClickListener() != null) {
            c1824q.performItemClick(null, i3, this.f8039h.getItemId(i3));
        }
        dismiss();
    }

    @Override // p113k.InterfaceC1822P
    /* JADX INFO: renamed from: p */
    public final void mo4315p(int i3) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
