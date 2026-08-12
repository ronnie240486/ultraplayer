package p113k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import com.zuxoplayer.app.R;
import p046P1.C0475c;

/* JADX INFO: renamed from: k.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1891s {

    /* JADX INFO: renamed from: b */
    public static final PorterDuff.Mode f8262b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public static C1891s f8263c;

    /* JADX INFO: renamed from: a */
    public C1817M0 f8264a;

    /* JADX INFO: renamed from: a */
    public static synchronized C1891s m4407a() {
        try {
            if (f8263c == null) {
                m4408c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f8263c;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m4408c() {
        if (f8263c == null) {
            C1891s c1891s = new C1891s();
            f8263c = c1891s;
            c1891s.f8264a = C1817M0.m4317d();
            C1817M0 c1817m0 = f8263c.f8264a;
            C0475c c0475c = new C0475c();
            c0475c.f1568a = new int[]{2131230796, 2131230794, 2131230720};
            c0475c.f1569b = new int[]{2131230744, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            c0475c.f1570c = new int[]{2131230793, 2131230795, 2131230737, R.drawable.abc_text_cursor_material, 2131230790, 2131230791, 2131230792};
            c0475c.f1571d = new int[]{2131230769, R.drawable.abc_cab_background_internal_bg, 2131230768};
            c0475c.f1572e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            c0475c.f1573f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            c1817m0.m4329m(c0475c);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m4409d(Drawable drawable, C1830T0 c1830t0, int[] iArr) {
        PorterDuff.Mode mode = C1817M0.f8050h;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z3 = c1830t0.f8094d;
        if (z3 || c1830t0.f8093c) {
            PorterDuffColorFilter porterDuffColorFilterM4318h = null;
            ColorStateList colorStateList = z3 ? c1830t0.f8091a : null;
            PorterDuff.Mode mode2 = c1830t0.f8093c ? c1830t0.f8092b : C1817M0.f8050h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterM4318h = C1817M0.m4318h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterM4318h);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized Drawable m4410b(Context context, int i3) {
        return this.f8264a.m4324f(context, i3);
    }
}
