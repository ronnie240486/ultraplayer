package p089d1;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: d1.X */
/* JADX INFO: loaded from: classes.dex */
public final class C1423X extends AbstractC1446s implements InterfaceC1420U {

    /* JADX INFO: renamed from: f */
    public final String f6282f;

    /* JADX INFO: renamed from: g */
    public String f6283g;

    /* JADX INFO: renamed from: h */
    public String f6284h;

    /* JADX INFO: renamed from: i */
    public boolean f6285i;

    /* JADX INFO: renamed from: k */
    public int f6287k;

    /* JADX INFO: renamed from: l */
    public C1419T f6288l;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ ServiceConnectionC1425Z f6290n;

    /* JADX INFO: renamed from: j */
    public int f6286j = -1;

    /* JADX INFO: renamed from: m */
    public int f6289m = -1;

    public C1423X(ServiceConnectionC1425Z serviceConnectionC1425Z, String str) {
        this.f6290n = serviceConnectionC1425Z;
        this.f6282f = str;
    }

    @Override // p089d1.InterfaceC1420U
    /* JADX INFO: renamed from: a */
    public final int mo3546a() {
        return this.f6289m;
    }

    @Override // p089d1.InterfaceC1420U
    /* JADX INFO: renamed from: b */
    public final void mo3547b(C1419T c1419t) {
        C1422W c1422w = new C1422W(this);
        this.f6288l = c1419t;
        int i3 = c1419t.f6274e;
        c1419t.f6274e = i3 + 1;
        int i4 = c1419t.f6273d;
        c1419t.f6273d = i4 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f6282f);
        c1419t.m3543b(11, i4, i3, null, bundle);
        c1419t.f6277h.put(i4, c1422w);
        this.f6289m = i3;
        if (this.f6285i) {
            c1419t.m3542a(i3);
            int i5 = this.f6286j;
            if (i5 >= 0) {
                c1419t.m3544c(this.f6289m, i5);
                this.f6286j = -1;
            }
            int i6 = this.f6287k;
            if (i6 != 0) {
                c1419t.m3545d(this.f6289m, i6);
                this.f6287k = 0;
            }
        }
    }

    @Override // p089d1.InterfaceC1420U
    /* JADX INFO: renamed from: c */
    public final void mo3548c() {
        C1419T c1419t = this.f6288l;
        if (c1419t != null) {
            int i3 = this.f6289m;
            int i4 = c1419t.f6273d;
            c1419t.f6273d = i4 + 1;
            c1419t.m3543b(4, i4, i3, null, null);
            this.f6288l = null;
            this.f6289m = 0;
        }
    }

    @Override // p089d1.AbstractC1448u
    /* JADX INFO: renamed from: d */
    public final void mo3551d() {
        ServiceConnectionC1425Z serviceConnectionC1425Z = this.f6290n;
        serviceConnectionC1425Z.f6302k.remove(this);
        mo3548c();
        serviceConnectionC1425Z.m3566m();
    }

    @Override // p089d1.AbstractC1448u
    /* JADX INFO: renamed from: e */
    public final void mo3552e() {
        this.f6285i = true;
        C1419T c1419t = this.f6288l;
        if (c1419t != null) {
            c1419t.m3542a(this.f6289m);
        }
    }

    @Override // p089d1.AbstractC1448u
    /* JADX INFO: renamed from: f */
    public final void mo3523f(int i3) {
        C1419T c1419t = this.f6288l;
        if (c1419t != null) {
            c1419t.m3544c(this.f6289m, i3);
        } else {
            this.f6286j = i3;
            this.f6287k = 0;
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
        this.f6285i = false;
        C1419T c1419t = this.f6288l;
        if (c1419t != null) {
            int i4 = this.f6289m;
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
        C1419T c1419t = this.f6288l;
        if (c1419t != null) {
            c1419t.m3545d(this.f6289m, i3);
        } else {
            this.f6287k += i3;
        }
    }

    @Override // p089d1.AbstractC1446s
    /* JADX INFO: renamed from: j */
    public final String mo3555j() {
        return this.f6283g;
    }

    @Override // p089d1.AbstractC1446s
    /* JADX INFO: renamed from: k */
    public final String mo3556k() {
        return this.f6284h;
    }

    @Override // p089d1.AbstractC1446s
    /* JADX INFO: renamed from: m */
    public final void mo3557m(String str) {
        C1419T c1419t = this.f6288l;
        if (c1419t != null) {
            int i3 = this.f6289m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i4 = c1419t.f6273d;
            c1419t.f6273d = i4 + 1;
            c1419t.m3543b(12, i4, i3, null, bundle);
        }
    }

    @Override // p089d1.AbstractC1446s
    /* JADX INFO: renamed from: n */
    public final void mo3558n(String str) {
        C1419T c1419t = this.f6288l;
        if (c1419t != null) {
            int i3 = this.f6289m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i4 = c1419t.f6273d;
            c1419t.f6273d = i4 + 1;
            c1419t.m3543b(13, i4, i3, null, bundle);
        }
    }

    @Override // p089d1.AbstractC1446s
    /* JADX INFO: renamed from: o */
    public final void mo3559o(List list) {
        C1419T c1419t = this.f6288l;
        if (c1419t != null) {
            int i3 = this.f6289m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(list));
            int i4 = c1419t.f6273d;
            c1419t.f6273d = i4 + 1;
            c1419t.m3543b(14, i4, i3, null, bundle);
        }
    }
}
