package p110j;

import android.view.ActionProvider;
import p089d1.C1447t;

/* JADX INFO: renamed from: j.p */
/* JADX INFO: loaded from: classes.dex */
public final class ActionProviderVisibilityListenerC1775p implements ActionProvider.VisibilityListener {

    /* JADX INFO: renamed from: a */
    public C1447t f7951a;

    /* JADX INFO: renamed from: b */
    public final ActionProvider f7952b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MenuItemC1779t f7953c;

    public ActionProviderVisibilityListenerC1775p(MenuItemC1779t menuItemC1779t, ActionProvider actionProvider) {
        this.f7953c = menuItemC1779t;
        this.f7952b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z3) {
        C1447t c1447t = this.f7951a;
        if (c1447t != null) {
            MenuC1772m menuC1772m = ((C1774o) c1447t.f6406h).f7938n;
            menuC1772m.f7902h = true;
            menuC1772m.m4258p(true);
        }
    }
}
