package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.C0858A;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.zuxoplayer.app.R;
import p087d.AbstractC1376a;
import p110j.C1774o;
import p110j.InterfaceC1785z;
import p110j.MenuC1772m;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC1785z, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: g */
    public C1774o f3795g;

    /* JADX INFO: renamed from: h */
    public ImageView f3796h;

    /* JADX INFO: renamed from: i */
    public RadioButton f3797i;

    /* JADX INFO: renamed from: j */
    public TextView f3798j;

    /* JADX INFO: renamed from: k */
    public CheckBox f3799k;

    /* JADX INFO: renamed from: l */
    public TextView f3800l;

    /* JADX INFO: renamed from: m */
    public ImageView f3801m;

    /* JADX INFO: renamed from: n */
    public ImageView f3802n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f3803o;

    /* JADX INFO: renamed from: p */
    public final Drawable f3804p;

    /* JADX INFO: renamed from: q */
    public final int f3805q;

    /* JADX INFO: renamed from: r */
    public final Context f3806r;

    /* JADX INFO: renamed from: s */
    public boolean f3807s;

    /* JADX INFO: renamed from: t */
    public final Drawable f3808t;

    /* JADX INFO: renamed from: u */
    public final boolean f3809u;

    /* JADX INFO: renamed from: v */
    public LayoutInflater f3810v;

    /* JADX INFO: renamed from: w */
    public boolean f3811w;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0858A c0858aM2148Q = C0858A.m2148Q(getContext(), attributeSet, AbstractC1376a.f6112r, R.attr.listMenuViewStyle);
        this.f3804p = c0858aM2148Q.m2158F(5);
        TypedArray typedArray = (TypedArray) c0858aM2148Q.f3640i;
        this.f3805q = typedArray.getResourceId(1, -1);
        this.f3807s = typedArray.getBoolean(7, false);
        this.f3806r = context;
        this.f3808t = c0858aM2148Q.m2158F(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f3809u = typedArrayObtainStyledAttributes.hasValue(0);
        c0858aM2148Q.m2170S();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f3810v == null) {
            this.f3810v = LayoutInflater.from(getContext());
        }
        return this.f3810v;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        ImageView imageView = this.f3801m;
        if (imageView != null) {
            imageView.setVisibility(z3 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f3802n;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3802n.getLayoutParams();
        rect.top = this.f3802n.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:25:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    @Override // p110j.InterfaceC1785z
    /* JADX INFO: renamed from: c */
    public final void mo2313c(C1774o c1774o) {
        boolean z3;
        int i3;
        String string;
        boolean z4;
        this.f3795g = c1774o;
        setVisibility(c1774o.isVisible() ? 0 : 8);
        setTitle(c1774o.f7929e);
        setCheckable(c1774o.isCheckable());
        if (c1774o.f7938n.mo4234o()) {
            if ((c1774o.f7938n.mo4233n() ? c1774o.f7934j : c1774o.f7932h) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        c1774o.f7938n.mo4233n();
        if (z3) {
            C1774o c1774o2 = this.f3795g;
            if (c1774o2.f7938n.mo4234o()) {
                if ((c1774o2.f7938n.mo4233n() ? c1774o2.f7934j : c1774o2.f7932h) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            i3 = z4 ? 0 : 8;
        }
        if (i3 == 0) {
            TextView textView = this.f3800l;
            C1774o c1774o3 = this.f3795g;
            char c = c1774o3.f7938n.mo4233n() ? c1774o3.f7934j : c1774o3.f7932h;
            if (c == 0) {
                string = "";
            } else {
                MenuC1772m menuC1772m = c1774o3.f7938n;
                Resources resources = menuC1772m.f7895a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(menuC1772m.f7895a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i4 = menuC1772m.mo4233n() ? c1774o3.f7935k : c1774o3.f7933i;
                C1774o.m4266c(sb, i4, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                C1774o.m4266c(sb, i4, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                C1774o.m4266c(sb, i4, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                C1774o.m4266c(sb, i4, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                C1774o.m4266c(sb, i4, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                C1774o.m4266c(sb, i4, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c == '\b') {
                    sb.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c == '\n') {
                    sb.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c != ' ') {
                    sb.append(c);
                } else {
                    sb.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb.toString();
            }
            textView.setText(string);
        }
        if (this.f3800l.getVisibility() != i3) {
            this.f3800l.setVisibility(i3);
        }
        setIcon(c1774o.getIcon());
        setEnabled(c1774o.isEnabled());
        setSubMenuArrowVisible(c1774o.hasSubMenu());
        setContentDescription(c1774o.f7941q);
    }

    @Override // p110j.InterfaceC1785z
    public C1774o getItemData() {
        return this.f3795g;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f3804p);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f3798j = textView;
        int i3 = this.f3805q;
        if (i3 != -1) {
            textView.setTextAppearance(this.f3806r, i3);
        }
        this.f3800l = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f3801m = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f3808t);
        }
        this.f3802n = (ImageView) findViewById(R.id.group_divider);
        this.f3803o = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i4) {
        if (this.f3796h != null && this.f3807s) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f3796h.getLayoutParams();
            int i5 = layoutParams.height;
            if (i5 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i5;
            }
        }
        super.onMeasure(i3, i4);
    }

    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        View view;
        if (!z3 && this.f3797i == null && this.f3799k == null) {
            return;
        }
        if ((this.f3795g.f7948x & 4) != 0) {
            if (this.f3797i == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3797i = radioButton;
                LinearLayout linearLayout = this.f3803o;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3797i;
            view = this.f3799k;
        } else {
            if (this.f3799k == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3799k = checkBox;
                LinearLayout linearLayout2 = this.f3803o;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3799k;
            view = this.f3797i;
        }
        if (z3) {
            compoundButton.setChecked(this.f3795g.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f3799k;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f3797i;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if ((this.f3795g.f7948x & 4) != 0) {
            if (this.f3797i == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f3797i = radioButton;
                LinearLayout linearLayout = this.f3803o;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f3797i;
        } else {
            if (this.f3799k == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f3799k = checkBox;
                LinearLayout linearLayout2 = this.f3803o;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f3799k;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f3811w = z3;
        this.f3807s = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        ImageView imageView = this.f3802n;
        if (imageView != null) {
            imageView.setVisibility((this.f3809u || !z3) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f3795g.f7938n.getClass();
        boolean z3 = this.f3811w;
        if (z3 || this.f3807s) {
            ImageView imageView = this.f3796h;
            if (imageView == null && drawable == null && !this.f3807s) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f3796h = imageView2;
                LinearLayout linearLayout = this.f3803o;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f3807s) {
                this.f3796h.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f3796h;
            if (!z3) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f3796h.getVisibility() != 0) {
                this.f3796h.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f3798j.getVisibility() != 8) {
                this.f3798j.setVisibility(8);
            }
        } else {
            this.f3798j.setText(charSequence);
            if (this.f3798j.getVisibility() != 0) {
                this.f3798j.setVisibility(0);
            }
        }
    }
}
