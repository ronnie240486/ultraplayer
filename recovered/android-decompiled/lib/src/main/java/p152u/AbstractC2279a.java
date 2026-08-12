package p152u;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: u.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2279a {
    /* JADX INFO: renamed from: a */
    public static void m4885a(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4886b(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    /* JADX INFO: renamed from: c */
    public static ColorFilter m4887c(Drawable drawable) {
        return drawable.getColorFilter();
    }

    /* JADX INFO: renamed from: d */
    public static void m4888d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX INFO: renamed from: e */
    public static void m4889e(Drawable drawable, float f, float f3) {
        drawable.setHotspot(f, f3);
    }

    /* JADX INFO: renamed from: f */
    public static void m4890f(Drawable drawable, int i3, int i4, int i5, int i6) {
        drawable.setHotspotBounds(i3, i4, i5, i6);
    }

    /* JADX INFO: renamed from: g */
    public static void m4891g(Drawable drawable, int i3) {
        drawable.setTint(i3);
    }

    /* JADX INFO: renamed from: h */
    public static void m4892h(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    /* JADX INFO: renamed from: i */
    public static void m4893i(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }
}
