package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1266c2 {

    /* JADX INFO: renamed from: a */
    public static final C1262b2 f5823a = new C1262b2();

    /* JADX INFO: renamed from: b */
    public static final C1262b2 f5824b;

    static {
        C1262b2 c1262b2 = null;
        try {
            c1262b2 = (C1262b2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f5824b = c1262b2;
    }
}
