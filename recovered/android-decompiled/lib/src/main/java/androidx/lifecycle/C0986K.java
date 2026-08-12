package androidx.lifecycle;

import androidx.fragment.app.AbstractC0948N;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: androidx.lifecycle.K */
/* JADX INFO: loaded from: classes.dex */
public final class C0986K {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f4299a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m2557a() {
        for (AbstractC0984I abstractC0984I : this.f4299a.values()) {
            HashMap map = abstractC0984I.f4295a;
            if (map != null) {
                synchronized (map) {
                    try {
                        for (Object obj : abstractC0984I.f4295a.values()) {
                            if (obj instanceof Closeable) {
                                try {
                                    ((Closeable) obj).close();
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            LinkedHashSet linkedHashSet = abstractC0984I.f4296b;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        for (Closeable closeable : abstractC0984I.f4296b) {
                            if (AbstractC0948N.m2506a(closeable)) {
                                try {
                                    closeable.close();
                                } catch (IOException e4) {
                                    throw new RuntimeException(e4);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            abstractC0984I.mo1154a();
        }
        this.f4299a.clear();
    }
}
