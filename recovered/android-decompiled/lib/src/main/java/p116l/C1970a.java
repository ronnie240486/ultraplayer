package p116l;

import java.util.concurrent.Executors;
import p019G1.AbstractC0230e;

/* JADX INFO: renamed from: l.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1970a extends AbstractC0230e {

    /* JADX INFO: renamed from: v */
    public static volatile C1970a f8598v;

    /* JADX INFO: renamed from: u */
    public final Object f8599u;

    public C1970a(int i3) {
        switch (i3) {
            case 1:
                this.f8599u = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC1971b());
                break;
            default:
                this.f8599u = new C1970a(1);
                break;
        }
    }

    /* JADX INFO: renamed from: D */
    public static C1970a m4512D() {
        if (f8598v != null) {
            return f8598v;
        }
        synchronized (C1970a.class) {
            try {
                if (f8598v == null) {
                    f8598v = new C1970a(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8598v;
    }
}
