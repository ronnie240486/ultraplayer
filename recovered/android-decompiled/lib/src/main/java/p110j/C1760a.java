package p110j;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p122m1.AbstractC2003a;
import p140r.AbstractC2181a;
import p152u.AbstractC2279a;
import p156v.InterfaceMenuItemC2306a;

/* JADX INFO: renamed from: j.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1760a implements InterfaceMenuItemC2306a {

    /* JADX INFO: renamed from: a */
    public CharSequence f7830a;

    /* JADX INFO: renamed from: b */
    public CharSequence f7831b;

    /* JADX INFO: renamed from: c */
    public Intent f7832c;

    /* JADX INFO: renamed from: d */
    public char f7833d;

    /* JADX INFO: renamed from: e */
    public int f7834e;

    /* JADX INFO: renamed from: f */
    public char f7835f;

    /* JADX INFO: renamed from: g */
    public int f7836g;

    /* JADX INFO: renamed from: h */
    public Drawable f7837h;

    /* JADX INFO: renamed from: i */
    public Context f7838i;

    /* JADX INFO: renamed from: j */
    public CharSequence f7839j;

    /* JADX INFO: renamed from: k */
    public CharSequence f7840k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f7841l;

    /* JADX INFO: renamed from: m */
    public PorterDuff.Mode f7842m;

    /* JADX INFO: renamed from: n */
    public boolean f7843n;

    /* JADX INFO: renamed from: o */
    public boolean f7844o;

    /* JADX INFO: renamed from: p */
    public int f7845p;

    @Override // p156v.InterfaceMenuItemC2306a
    /* JADX INFO: renamed from: a */
    public final InterfaceMenuItemC2306a mo4235a(ActionProviderVisibilityListenerC1775p actionProviderVisibilityListenerC1775p) {
        throw new UnsupportedOperationException();
    }

    @Override // p156v.InterfaceMenuItemC2306a
    /* JADX INFO: renamed from: b */
    public final ActionProviderVisibilityListenerC1775p mo4236b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m4237c() {
        Drawable drawable = this.f7837h;
        if (drawable != null) {
            if (this.f7843n || this.f7844o) {
                Drawable drawableM4548u = AbstractC2003a.m4548u(drawable);
                this.f7837h = drawableM4548u;
                Drawable drawableMutate = drawableM4548u.mutate();
                this.f7837h = drawableMutate;
                if (this.f7843n) {
                    AbstractC2279a.m4892h(drawableMutate, this.f7841l);
                }
                if (this.f7844o) {
                    AbstractC2279a.m4893i(this.f7837h, this.f7842m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f7836g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f7835f;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f7839j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f7837h;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f7841l;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f7842m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f7832c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f7834e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f7833d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f7830a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f7831b;
        return charSequence != null ? charSequence : this.f7830a;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f7840k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f7845p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f7845p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f7845p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f7845p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f7835f = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        this.f7845p = (z3 ? 1 : 0) | (this.f7845p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        this.f7845p = (z3 ? 2 : 0) | (this.f7845p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f7839j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        this.f7845p = (z3 ? 16 : 0) | (this.f7845p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f7837h = drawable;
        m4237c();
        return this;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f7841l = colorStateList;
        this.f7843n = true;
        m4237c();
        return this;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f7842m = mode;
        this.f7844o = true;
        m4237c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f7832c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f7833d = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f7833d = c;
        this.f7835f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f7830a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f7831b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f7840k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        this.f7845p = (this.f7845p & 8) | (z3 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i3) {
        throw new UnsupportedOperationException();
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i3) {
        this.f7835f = Character.toLowerCase(c);
        this.f7836g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final InterfaceMenuItemC2306a setContentDescription(CharSequence charSequence) {
        this.f7839j = charSequence;
        return this;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i3) {
        this.f7833d = c;
        this.f7834e = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i3) {
        this.f7830a = this.f7838i.getResources().getString(i3);
        return this;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final InterfaceMenuItemC2306a setTooltipText(CharSequence charSequence) {
        this.f7840k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i3) {
        this.f7837h = AbstractC2181a.m4765b(this.f7838i, i3);
        m4237c();
        return this;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i3, int i4) {
        this.f7833d = c;
        this.f7834e = KeyEvent.normalizeMetaState(i3);
        this.f7835f = Character.toLowerCase(c2);
        this.f7836g = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i3) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i3) {
        return this;
    }
}
