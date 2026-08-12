package p036M0;

import p085c0.C1130f;

/* JADX INFO: renamed from: M0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0367d {

    /* JADX INFO: renamed from: a */
    public boolean f1175a;

    /* JADX INFO: renamed from: b */
    public boolean f1176b;

    /* JADX INFO: renamed from: c */
    public boolean f1177c;

    /* JADX INFO: renamed from: a */
    public C1130f m1008a() {
        if (this.f1175a || !(this.f1176b || this.f1177c)) {
            return new C1130f(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
