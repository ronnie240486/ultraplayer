package p140r;

import android.content.Context;

/* JADX INFO: renamed from: r.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2182b {
    /* JADX INFO: renamed from: a */
    public static int m4767a(Context context, int i3) {
        return context.getColor(i3);
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m4768b(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* JADX INFO: renamed from: c */
    public static String m4769c(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
