package p110j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import p060U1.AbstractC0610a;
import p089d1.C1447t;
import p122m1.AbstractC2003a;
import p152u.AbstractC2279a;
import p156v.InterfaceMenuItemC2306a;

/* JADX INFO: renamed from: j.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1774o implements InterfaceMenuItemC2306a {

    /* JADX INFO: renamed from: A */
    public ActionProviderVisibilityListenerC1775p f7922A;

    /* JADX INFO: renamed from: B */
    public MenuItem.OnActionExpandListener f7923B;

    /* JADX INFO: renamed from: a */
    public final int f7925a;

    /* JADX INFO: renamed from: b */
    public final int f7926b;

    /* JADX INFO: renamed from: c */
    public final int f7927c;

    /* JADX INFO: renamed from: d */
    public final int f7928d;

    /* JADX INFO: renamed from: e */
    public CharSequence f7929e;

    /* JADX INFO: renamed from: f */
    public CharSequence f7930f;

    /* JADX INFO: renamed from: g */
    public Intent f7931g;

    /* JADX INFO: renamed from: h */
    public char f7932h;

    /* JADX INFO: renamed from: j */
    public char f7934j;

    /* JADX INFO: renamed from: l */
    public Drawable f7936l;

    /* JADX INFO: renamed from: n */
    public final MenuC1772m f7938n;

    /* JADX INFO: renamed from: o */
    public SubMenuC1759E f7939o;

    /* JADX INFO: renamed from: p */
    public MenuItem.OnMenuItemClickListener f7940p;

    /* JADX INFO: renamed from: q */
    public CharSequence f7941q;

    /* JADX INFO: renamed from: r */
    public CharSequence f7942r;

    /* JADX INFO: renamed from: y */
    public int f7949y;

    /* JADX INFO: renamed from: z */
    public View f7950z;

    /* JADX INFO: renamed from: i */
    public int f7933i = 4096;

    /* JADX INFO: renamed from: k */
    public int f7935k = 4096;

    /* JADX INFO: renamed from: m */
    public int f7937m = 0;

    /* JADX INFO: renamed from: s */
    public ColorStateList f7943s = null;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f7944t = null;

    /* JADX INFO: renamed from: u */
    public boolean f7945u = false;

    /* JADX INFO: renamed from: v */
    public boolean f7946v = false;

    /* JADX INFO: renamed from: w */
    public boolean f7947w = false;

    /* JADX INFO: renamed from: x */
    public int f7948x = 16;

    /* JADX INFO: renamed from: C */
    public boolean f7924C = false;

    public C1774o(MenuC1772m menuC1772m, int i3, int i4, int i5, int i6, CharSequence charSequence, int i7) {
        this.f7938n = menuC1772m;
        this.f7925a = i4;
        this.f7926b = i3;
        this.f7927c = i5;
        this.f7928d = i6;
        this.f7929e = charSequence;
        this.f7949y = i7;
    }

    /* JADX INFO: renamed from: c */
    public static void m4266c(StringBuilder sb, int i3, int i4, String str) {
        if ((i3 & i4) == i4) {
            sb.append(str);
        }
    }

    @Override // p156v.InterfaceMenuItemC2306a
    /* JADX INFO: renamed from: a */
    public final InterfaceMenuItemC2306a mo4235a(ActionProviderVisibilityListenerC1775p actionProviderVisibilityListenerC1775p) {
        this.f7950z = null;
        this.f7922A = actionProviderVisibilityListenerC1775p;
        this.f7938n.m4258p(true);
        ActionProviderVisibilityListenerC1775p actionProviderVisibilityListenerC1775p2 = this.f7922A;
        if (actionProviderVisibilityListenerC1775p2 != null) {
            actionProviderVisibilityListenerC1775p2.f7951a = new C1447t(13, this);
            actionProviderVisibilityListenerC1775p2.f7952b.setVisibilityListener(actionProviderVisibilityListenerC1775p2);
        }
        return this;
    }

    @Override // p156v.InterfaceMenuItemC2306a
    /* JADX INFO: renamed from: b */
    public final ActionProviderVisibilityListenerC1775p mo4236b() {
        return this.f7922A;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f7949y & 8) == 0) {
            return false;
        }
        if (this.f7950z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f7923B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f7938n.mo4227d(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m4267d(Drawable drawable) {
        if (drawable != null && this.f7947w && (this.f7945u || this.f7946v)) {
            drawable = AbstractC2003a.m4548u(drawable).mutate();
            if (this.f7945u) {
                AbstractC2279a.m4892h(drawable, this.f7943s);
            }
            if (this.f7946v) {
                AbstractC2279a.m4893i(drawable, this.f7944t);
            }
            this.f7947w = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4268e() {
        ActionProviderVisibilityListenerC1775p actionProviderVisibilityListenerC1775p;
        if ((this.f7949y & 8) != 0) {
            if (this.f7950z == null && (actionProviderVisibilityListenerC1775p = this.f7922A) != null) {
                this.f7950z = actionProviderVisibilityListenerC1775p.f7952b.onCreateActionView(this);
            }
            if (this.f7950z != null) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!m4268e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f7923B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f7938n.mo4229f(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m4269f(boolean z3) {
        if (z3) {
            this.f7948x |= 32;
        } else {
            this.f7948x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f7950z;
        if (view != null) {
            return view;
        }
        ActionProviderVisibilityListenerC1775p actionProviderVisibilityListenerC1775p = this.f7922A;
        if (actionProviderVisibilityListenerC1775p == null) {
            return null;
        }
        View viewOnCreateActionView = actionProviderVisibilityListenerC1775p.f7952b.onCreateActionView(this);
        this.f7950z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f7935k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f7934j;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f7941q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f7926b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f7936l;
        if (drawable != null) {
            return m4267d(drawable);
        }
        int i3 = this.f7937m;
        if (i3 == 0) {
            return null;
        }
        Drawable drawableM1512n = AbstractC0610a.m1512n(this.f7938n.f7895a, i3);
        this.f7937m = 0;
        this.f7936l = drawableM1512n;
        return m4267d(drawableM1512n);
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f7943s;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f7944t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f7931g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f7925a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f7933i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f7932h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f7927c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f7939o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f7929e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f7930f;
        return charSequence != null ? charSequence : this.f7929e;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f7942r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f7939o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f7924C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f7948x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f7948x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f7948x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        ActionProviderVisibilityListenerC1775p actionProviderVisibilityListenerC1775p = this.f7922A;
        if (actionProviderVisibilityListenerC1775p == null || !actionProviderVisibilityListenerC1775p.f7952b.overridesItemVisibility()) {
            return (this.f7948x & 8) == 0;
        }
        return (this.f7948x & 8) == 0 && this.f7922A.f7952b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i3;
        this.f7950z = view;
        this.f7922A = null;
        if (view != null && view.getId() == -1 && (i3 = this.f7925a) > 0) {
            view.setId(i3);
        }
        MenuC1772m menuC1772m = this.f7938n;
        menuC1772m.f7905k = true;
        menuC1772m.m4258p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.f7934j == c) {
            return this;
        }
        this.f7934j = Character.toLowerCase(c);
        this.f7938n.m4258p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z3) {
        int i3 = this.f7948x;
        int i4 = (z3 ? 1 : 0) | (i3 & (-2));
        this.f7948x = i4;
        if (i3 != i4) {
            this.f7938n.m4258p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z3) {
        int i3 = this.f7948x;
        if ((i3 & 4) == 0) {
            int i4 = (i3 & (-3)) | (z3 ? 2 : 0);
            this.f7948x = i4;
            if (i3 != i4) {
                this.f7938n.m4258p(false);
            }
            return this;
        }
        MenuC1772m menuC1772m = this.f7938n;
        menuC1772m.getClass();
        ArrayList arrayList = menuC1772m.f7900f;
        int size = arrayList.size();
        menuC1772m.m4265w();
        for (int i5 = 0; i5 < size; i5++) {
            C1774o c1774o = (C1774o) arrayList.get(i5);
            if (c1774o.f7926b == this.f7926b && (c1774o.f7948x & 4) != 0 && c1774o.isCheckable()) {
                boolean z4 = c1774o == this;
                int i6 = c1774o.f7948x;
                int i7 = (z4 ? 2 : 0) | (i6 & (-3));
                c1774o.f7948x = i7;
                if (i6 != i7) {
                    c1774o.f7938n.m4258p(false);
                }
            }
        }
        menuC1772m.m4264v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.f7948x |= 16;
        } else {
            this.f7948x &= -17;
        }
        this.f7938n.m4258p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f7937m = 0;
        this.f7936l = drawable;
        this.f7947w = true;
        this.f7938n.m4258p(false);
        return this;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f7943s = colorStateList;
        this.f7945u = true;
        this.f7947w = true;
        this.f7938n.m4258p(false);
        return this;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f7944t = mode;
        this.f7946v = true;
        this.f7947w = true;
        this.f7938n.m4258p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f7931g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.f7932h == c) {
            return this;
        }
        this.f7932h = c;
        this.f7938n.m4258p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f7923B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f7940p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f7932h = c;
        this.f7934j = Character.toLowerCase(c2);
        this.f7938n.m4258p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i3) {
        int i4 = i3 & 3;
        if (i4 != 0 && i4 != 1 && i4 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f7949y = i3;
        MenuC1772m menuC1772m = this.f7938n;
        menuC1772m.f7905k = true;
        menuC1772m.m4258p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i3) {
        setShowAsAction(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f7929e = charSequence;
        this.f7938n.m4258p(false);
        SubMenuC1759E subMenuC1759E = this.f7939o;
        if (subMenuC1759E != null) {
            subMenuC1759E.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f7930f = charSequence;
        this.f7938n.m4258p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z3) {
        int i3 = this.f7948x;
        int i4 = (z3 ? 0 : 8) | (i3 & (-9));
        this.f7948x = i4;
        if (i3 != i4) {
            MenuC1772m menuC1772m = this.f7938n;
            menuC1772m.f7902h = true;
            menuC1772m.m4258p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f7929e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final InterfaceMenuItemC2306a setContentDescription(CharSequence charSequence) {
        this.f7941q = charSequence;
        this.f7938n.m4258p(false);
        return this;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final InterfaceMenuItemC2306a setTooltipText(CharSequence charSequence) {
        this.f7942r = charSequence;
        this.f7938n.m4258p(false);
        return this;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i3) {
        if (this.f7934j == c && this.f7935k == i3) {
            return this;
        }
        this.f7934j = Character.toLowerCase(c);
        this.f7935k = KeyEvent.normalizeMetaState(i3);
        this.f7938n.m4258p(false);
        return this;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i3) {
        if (this.f7932h == c && this.f7933i == i3) {
            return this;
        }
        this.f7932h = c;
        this.f7933i = KeyEvent.normalizeMetaState(i3);
        this.f7938n.m4258p(false);
        return this;
    }

    @Override // p156v.InterfaceMenuItemC2306a, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i3, int i4) {
        this.f7932h = c;
        this.f7933i = KeyEvent.normalizeMetaState(i3);
        this.f7934j = Character.toLowerCase(c2);
        this.f7935k = KeyEvent.normalizeMetaState(i4);
        this.f7938n.m4258p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i3) {
        this.f7936l = null;
        this.f7937m = i3;
        this.f7947w = true;
        this.f7938n.m4258p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i3) {
        setTitle(this.f7938n.f7895a.getString(i3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i3) {
        int i4;
        Context context = this.f7938n.f7895a;
        View viewInflate = LayoutInflater.from(context).inflate(i3, (ViewGroup) new LinearLayout(context), false);
        this.f7950z = viewInflate;
        this.f7922A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i4 = this.f7925a) > 0) {
            viewInflate.setId(i4);
        }
        MenuC1772m menuC1772m = this.f7938n;
        menuC1772m.f7905k = true;
        menuC1772m.m4258p(true);
        return this;
    }
}
