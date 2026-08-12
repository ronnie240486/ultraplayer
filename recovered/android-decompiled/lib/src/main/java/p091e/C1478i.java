package p091e;

import com.zuxoplayer.app.PlayerActivity;
import p081b.InterfaceC1059b;
import p108i1.C1751d;

/* JADX INFO: renamed from: e.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1478i implements InterfaceC1059b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PlayerActivity f6607a;

    public C1478i(PlayerActivity playerActivity) {
        this.f6607a = playerActivity;
    }

    @Override // p081b.InterfaceC1059b
    /* JADX INFO: renamed from: a */
    public final void mo2292a() {
        PlayerActivity playerActivity = this.f6607a;
        AbstractC1486q abstractC1486qM3706i = playerActivity.m3706i();
        abstractC1486qM3706i.mo3655a();
        ((C1751d) playerActivity.f3747k.f3429c).m4206c("androidx:appcompat");
        abstractC1486qM3706i.mo3656d();
    }
}
