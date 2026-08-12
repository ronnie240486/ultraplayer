package p113k;

import androidx.appcompat.widget.ActionBarContextView;
import p000A.InterfaceC0028b0;

/* JADX INFO: renamed from: k.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1843a implements InterfaceC0028b0 {

    /* JADX INFO: renamed from: a */
    public boolean f8117a = false;

    /* JADX INFO: renamed from: b */
    public int f8118b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ActionBarContextView f8119c;

    public C1843a(ActionBarContextView actionBarContextView) {
        this.f8119c = actionBarContextView;
    }

    @Override // p000A.InterfaceC0028b0
    /* JADX INFO: renamed from: a */
    public final void mo118a() {
        if (this.f8117a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f8119c;
        actionBarContextView.f3826l = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f8118b);
    }

    @Override // p000A.InterfaceC0028b0
    /* JADX INFO: renamed from: b */
    public final void mo119b() {
        this.f8117a = true;
    }

    @Override // p000A.InterfaceC0028b0
    /* JADX INFO: renamed from: c */
    public final void mo120c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f8117a = false;
    }
}
