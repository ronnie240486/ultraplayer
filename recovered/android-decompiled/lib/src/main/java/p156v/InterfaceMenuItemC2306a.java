package p156v;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import p110j.ActionProviderVisibilityListenerC1775p;

/* JADX INFO: renamed from: v.a */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceMenuItemC2306a extends MenuItem {
    /* JADX INFO: renamed from: a */
    InterfaceMenuItemC2306a mo4235a(ActionProviderVisibilityListenerC1775p actionProviderVisibilityListenerC1775p);

    /* JADX INFO: renamed from: b */
    ActionProviderVisibilityListenerC1775p mo4236b();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c, int i3);

    @Override // android.view.MenuItem
    InterfaceMenuItemC2306a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c, int i3);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c, char c2, int i3, int i4);

    @Override // android.view.MenuItem
    InterfaceMenuItemC2306a setTooltipText(CharSequence charSequence);
}
