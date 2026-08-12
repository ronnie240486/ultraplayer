package p000A;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* JADX INFO: renamed from: A.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0051n {
    /* JADX INFO: renamed from: a */
    public static int m289a(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    /* JADX INFO: renamed from: b */
    public static CharSequence m290b(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m291c(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    /* JADX INFO: renamed from: d */
    public static PorterDuff.Mode m292d(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    /* JADX INFO: renamed from: e */
    public static int m293e(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    /* JADX INFO: renamed from: f */
    public static CharSequence m294f(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    /* JADX INFO: renamed from: g */
    public static MenuItem m295g(MenuItem menuItem, char c, int i3) {
        return menuItem.setAlphabeticShortcut(c, i3);
    }

    /* JADX INFO: renamed from: h */
    public static MenuItem m296h(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: i */
    public static MenuItem m297i(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    /* JADX INFO: renamed from: j */
    public static MenuItem m298j(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    /* JADX INFO: renamed from: k */
    public static MenuItem m299k(MenuItem menuItem, char c, int i3) {
        return menuItem.setNumericShortcut(c, i3);
    }

    /* JADX INFO: renamed from: l */
    public static MenuItem m300l(MenuItem menuItem, char c, char c2, int i3, int i4) {
        return menuItem.setShortcut(c, c2, i3, i4);
    }

    /* JADX INFO: renamed from: m */
    public static MenuItem m301m(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }
}
