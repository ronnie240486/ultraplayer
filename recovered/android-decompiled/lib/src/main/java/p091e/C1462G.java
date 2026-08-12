package p091e;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import p124n.C2022i;

/* JADX INFO: renamed from: e.G */
/* JADX INFO: loaded from: classes.dex */
public final class C1462G {

    /* JADX INFO: renamed from: b */
    public static final Class[] f6504b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c */
    public static final int[] f6505c = {R.attr.onClick};

    /* JADX INFO: renamed from: d */
    public static final int[] f6506d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e */
    public static final int[] f6507e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f */
    public static final int[] f6508f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g */
    public static final String[] f6509g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h */
    public static final C2022i f6510h = new C2022i();

    /* JADX INFO: renamed from: a */
    public final Object[] f6511a = new Object[2];

    /* JADX INFO: renamed from: a */
    public final View m3677a(Context context, String str, String str2) {
        String strConcat;
        C2022i c2022i = f6510h;
        Constructor constructor = (Constructor) c2022i.getOrDefault(str, null);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f6504b);
            c2022i.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f6511a);
    }
}
