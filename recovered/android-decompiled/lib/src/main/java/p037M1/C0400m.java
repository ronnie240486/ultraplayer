package p037M1;

import p034L1.C0348c;

/* JADX INFO: renamed from: M1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0400m extends UnsupportedOperationException {

    /* JADX INFO: renamed from: g */
    public final C0348c f1358g;

    public C0400m(C0348c c0348c) {
        this.f1358g = c0348c;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f1358g));
    }
}
