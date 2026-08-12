package p055T;

import java.util.HashSet;

/* JADX INFO: renamed from: T.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0540C {

    /* JADX INFO: renamed from: a */
    public static final HashSet f1880a = new HashSet();

    /* JADX INFO: renamed from: b */
    public static String f1881b = "media3.common";

    /* JADX INFO: renamed from: a */
    public static synchronized void m1348a(String str) {
        if (f1880a.add(str)) {
            f1881b += ", " + str;
        }
    }
}
