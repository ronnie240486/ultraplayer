package p066W1;

import dalvik.system.PathClassLoader;

/* JADX INFO: renamed from: W1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0665f extends PathClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z3) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z3);
    }
}
