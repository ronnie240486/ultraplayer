package p128o;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: o.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2050a {

    /* JADX INFO: renamed from: b */
    public static final C2050a f8925b;

    /* JADX INFO: renamed from: c */
    public static final C2050a f8926c;

    /* JADX INFO: renamed from: a */
    public final CancellationException f8927a;

    static {
        if (AbstractC2056g.f8941j) {
            f8926c = null;
            f8925b = null;
        } else {
            f8926c = new C2050a(false, null);
            f8925b = new C2050a(true, null);
        }
    }

    public C2050a(boolean z3, CancellationException cancellationException) {
        this.f8927a = cancellationException;
    }
}
