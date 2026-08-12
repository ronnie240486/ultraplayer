package p089d1;

import android.os.Bundle;

/* JADX INFO: renamed from: d1.Y */
/* JADX INFO: loaded from: classes.dex */
public final class C1424Y extends AbstractC1448u implements InterfaceC1420U {

    /* JADX INFO: renamed from: a */
    public final String f6291a;

    /* JADX INFO: renamed from: b */
    public final String f6292b;

    /* JADX INFO: renamed from: c */
    public boolean f6293c;

    /* JADX INFO: renamed from: d */
    public int f6294d = -1;

    /* JADX INFO: renamed from: e */
    public int f6295e;

    /* JADX INFO: renamed from: f */
    public C1419T f6296f;

    /* JADX INFO: renamed from: g */
    public int f6297g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ServiceConnectionC1425Z f6298h;

    public C1424Y(ServiceConnectionC1425Z serviceConnectionC1425Z, String str, String str2) {
        this.f6298h = serviceConnectionC1425Z;
        this.f6291a = str;
        this.f6292b = str2;
    }

    @Override // p089d1.InterfaceC1420U
    /* JADX INFO: renamed from: a */
    public final int mo3546a() {
        return this.f6297g;
    }

    @Override // p089d1.InterfaceC1420U
    /* JADX INFO: renamed from: b */
    public final void mo3547b(C1419T c1419t) {
        this.f6296f = c1419t;
        int i3 = c1419t.f6274e;
        c1419t.f6274e = i3 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f6291a);
        bundle.putString("routeGroupId", this.f6292b);
        int i4 = c1419t.f6273d;
        c1419t.f6273d = i4 + 1;
        c1419t.m3543b(3, i4, i3, null, bundle);
        this.f6297g = i3;
        if (this.f6293c) {
            c1419t.m3542a(i3);
            int i5 = this.f6294d;
            if (i5 >= 0) {
                c1419t.m3544c(this.f6297g, i5);
                this.f6294d = -1;
            }
            int i6 = this.f6295e;
            if (i6 != 0) {
                c1419t.m3545d(this.f6297g, i6);
                this.f6295e = 0;
            }
        }
    }

    @Override // p089d1.InterfaceC1420U
    /* JADX INFO: renamed from: c */
    public final void mo3548c() {
        C1419T c1419t = this.f6296f;
        if (c1419t != null) {
            int i3 = this.f6297g;
            int i4 = c1419t.f6273d;
            c1419t.f6273d = i4 + 1;
            c1419t.m3543b(4, i4, i3, null, null);
            this.f6296f = null;
            this.f6297g = 0;
        }
    }

    @Override // p089d1.AbstractC1448u
    /* JADX INFO: renamed from: d */
    public final void mo3551d() {
        ServiceConnectionC1425Z serviceConnectionC1425Z = this.f6298h;
        serviceConnectionC1425Z.f6302k.remove(this);
        mo3548c();
        serviceConnectionC1425Z.m3566m();
    }

    @Override // p089d1.AbstractC1448u
    /* JADX INFO: renamed from: e */
    public final void mo3552e() {
        this.f6293c = true;
        C1419T c1419t = this.f6296f;
        if (c1419t != null) {
            c1419t.m3542a(this.f6297g);
        }
    }

    @Override // p089d1.AbstractC1448u
    /* JADX INFO: renamed from: f */
    public final void mo3523f(int i3) {
        C1419T c1419t = this.f6296f;
        if (c1419t != null) {
            c1419t.m3544c(this.f6297g, i3);
        } else {
            this.f6294d = i3;
            this.f6295e = 0;
        }
    }

    @Override // p089d1.AbstractC1448u
    /* JADX INFO: renamed from: g */
    public final void mo3553g() {
        mo3554h(0);
    }

    @Override // p089d1.AbstractC1448u
    /* JADX INFO: renamed from: h */
    public final void mo3554h(int i3) {
        this.f6293c = false;
        C1419T c1419t = this.f6296f;
        if (c1419t != null) {
            int i4 = this.f6297g;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i3);
            int i5 = c1419t.f6273d;
            c1419t.f6273d = i5 + 1;
            c1419t.m3543b(6, i5, i4, null, bundle);
        }
    }

    @Override // p089d1.AbstractC1448u
    /* JADX INFO: renamed from: i */
    public final void mo3524i(int i3) {
        C1419T c1419t = this.f6296f;
        if (c1419t != null) {
            c1419t.m3545d(this.f6297g, i3);
        } else {
            this.f6295e += i3;
        }
    }
}
