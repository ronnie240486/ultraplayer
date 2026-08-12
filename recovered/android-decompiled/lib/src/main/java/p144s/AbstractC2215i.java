package p144s;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: s.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2215i {
    /* JADX INFO: renamed from: a */
    public static Drawable m4796a(Resources resources, int i3, Resources.Theme theme) {
        return resources.getDrawable(i3, theme);
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m4797b(Resources resources, int i3, int i4, Resources.Theme theme) {
        return resources.getDrawableForDensity(i3, i4, theme);
    }
}
