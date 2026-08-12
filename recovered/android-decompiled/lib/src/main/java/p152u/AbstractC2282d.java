package p152u;

import android.graphics.Bitmap;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;

/* JADX INFO: renamed from: u.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2282d {
    /* JADX INFO: renamed from: a */
    public static Drawable m4899a(Drawable drawable, Drawable drawable2) {
        return new AdaptiveIconDrawable(drawable, drawable2);
    }

    /* JADX INFO: renamed from: b */
    public static Icon m4900b(Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }
}
