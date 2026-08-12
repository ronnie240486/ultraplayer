package p113k;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: k.n0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1882n0 {

    /* JADX INFO: renamed from: a */
    public static final Method f8228a;

    /* JADX INFO: renamed from: b */
    public static final Method f8229b;

    /* JADX INFO: renamed from: c */
    public static final Method f8230c;

    /* JADX INFO: renamed from: d */
    public static final boolean f8231d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f8228a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f8229b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f8230c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            f8231d = true;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
        }
    }
}
