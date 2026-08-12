package p028J1;

import com.google.android.gms.common.api.Status;
import p013E1.C0129d;
import p037M1.InterfaceC0398k;

/* JADX INFO: renamed from: J1.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0315u implements InterfaceC0398k {

    /* JADX INFO: renamed from: g */
    public final Status f841g;

    /* JADX INFO: renamed from: h */
    public final C0129d f842h;

    /* JADX INFO: renamed from: i */
    public final String f843i;

    /* JADX INFO: renamed from: j */
    public final String f844j;

    /* JADX INFO: renamed from: k */
    public final boolean f845k;

    public C0315u(Status status, C0129d c0129d, String str, String str2, boolean z3) {
        this.f841g = status;
        this.f842h = c0129d;
        this.f843i = str;
        this.f844j = str2;
        this.f845k = z3;
    }

    @Override // p037M1.InterfaceC0398k
    /* JADX INFO: renamed from: d */
    public final Status mo774d() {
        return this.f841g;
    }
}
