package androidx.mediarouter.app;

import p089d1.C1403C;

/* JADX INFO: renamed from: androidx.mediarouter.app.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1055x {

    /* JADX INFO: renamed from: a */
    public final Object f4674a;

    /* JADX INFO: renamed from: b */
    public final int f4675b;

    public C1055x(Object obj) {
        this.f4674a = obj;
        if (obj instanceof String) {
            this.f4675b = 1;
        } else {
            if (!(obj instanceof C1403C)) {
                throw new IllegalArgumentException();
            }
            this.f4675b = 2;
        }
    }
}
