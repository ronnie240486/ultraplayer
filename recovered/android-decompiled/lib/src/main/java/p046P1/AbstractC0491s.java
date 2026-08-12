package p046P1;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* JADX INFO: renamed from: P1.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0491s {

    /* JADX INFO: renamed from: a */
    public static final Object f1637a = new Object();

    /* JADX INFO: renamed from: b */
    public static boolean f1638b;

    /* JADX INFO: renamed from: c */
    public static int f1639c;

    /* JADX INFO: renamed from: a */
    public static void m1209a(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1210b() {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1211c(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m1212d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m1213e(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m1214f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m1215g(String str, boolean z3) {
        if (!z3) {
            throw new IllegalStateException(str);
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m1216h(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
