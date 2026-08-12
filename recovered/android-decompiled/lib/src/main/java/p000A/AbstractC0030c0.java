package p000A;

import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: A.c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0030c0 {

    /* JADX INFO: renamed from: a */
    public static final Field f33a;

    /* JADX INFO: renamed from: b */
    public static final Field f34b;

    /* JADX INFO: renamed from: c */
    public static final Field f35c;

    /* JADX INFO: renamed from: d */
    public static final boolean f36d;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mAttachInfo");
            f33a = declaredField;
            declaredField.setAccessible(true);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            Field declaredField2 = cls.getDeclaredField("mStableInsets");
            f34b = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = cls.getDeclaredField("mContentInsets");
            f35c = declaredField3;
            declaredField3.setAccessible(true);
            f36d = true;
        } catch (ReflectiveOperationException e3) {
            Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e3.getMessage(), e3);
        }
    }
}
