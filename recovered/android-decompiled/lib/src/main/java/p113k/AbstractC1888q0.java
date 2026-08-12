package p113k;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: k.q0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1888q0 {

    /* JADX INFO: renamed from: a */
    public static final Field f8245a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        }
        f8245a = declaredField;
    }
}
