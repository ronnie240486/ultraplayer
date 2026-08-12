package p152u;

import android.graphics.drawable.Icon;
import android.net.Uri;

/* JADX INFO: renamed from: u.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2283e {
    /* JADX INFO: renamed from: a */
    public static int m4901a(Object obj) {
        return ((Icon) obj).getResId();
    }

    /* JADX INFO: renamed from: b */
    public static String m4902b(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    /* JADX INFO: renamed from: c */
    public static int m4903c(Object obj) {
        return ((Icon) obj).getType();
    }

    /* JADX INFO: renamed from: d */
    public static Uri m4904d(Object obj) {
        return ((Icon) obj).getUri();
    }
}
