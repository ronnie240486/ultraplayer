package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.R;
import p019G1.AbstractC0230e;
import p060U1.AbstractC0610a;
import p089d1.C1403C;
import p089d1.C1445r;
import p089d1.C1447t;
import p122m1.AbstractC2003a;
import p152u.AbstractC2279a;

/* JADX INFO: renamed from: androidx.mediarouter.app.L */
/* JADX INFO: loaded from: classes.dex */
public final class C1025L extends AbstractC1019F {

    /* JADX INFO: renamed from: A */
    public final TextView f4438A;

    /* JADX INFO: renamed from: B */
    public final RelativeLayout f4439B;

    /* JADX INFO: renamed from: C */
    public final CheckBox f4440C;

    /* JADX INFO: renamed from: D */
    public final float f4441D;

    /* JADX INFO: renamed from: E */
    public final int f4442E;

    /* JADX INFO: renamed from: F */
    public final ViewOnClickListenerC1018E f4443F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C1026M f4444G;

    /* JADX INFO: renamed from: x */
    public final View f4445x;

    /* JADX INFO: renamed from: y */
    public final ImageView f4446y;

    /* JADX INFO: renamed from: z */
    public final ProgressBar f4447z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1025L(C1026M c1026m, View view) {
        super(c1026m.f4457l, view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
        this.f4444G = c1026m;
        this.f4443F = new ViewOnClickListenerC1018E(4, this);
        this.f4445x = view;
        this.f4446y = (ImageView) view.findViewById(R.id.mr_cast_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_route_progress_bar);
        this.f4447z = progressBar;
        this.f4438A = (TextView) view.findViewById(R.id.mr_cast_route_name);
        this.f4439B = (RelativeLayout) view.findViewById(R.id.mr_cast_volume_layout);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.mr_cast_checkbox);
        this.f4440C = checkBox;
        DialogC1028O dialogC1028O = c1026m.f4457l;
        Context context = dialogC1028O.f4504t;
        Drawable drawableM4548u = AbstractC2003a.m4548u(AbstractC0610a.m1512n(context, R.drawable.mr_cast_checkbox));
        if (AbstractC1303m.m3330w(context)) {
            AbstractC2279a.m4891g(drawableM4548u, AbstractC0230e.m739q(context, R.color.mr_dynamic_dialog_icon_light));
        }
        checkBox.setButtonDrawable(drawableM4548u);
        AbstractC1303m.m3284G(dialogC1028O.f4504t, progressBar);
        this.f4441D = AbstractC1303m.m3322o(dialogC1028O.f4504t);
        Resources resources = dialogC1028O.f4504t.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.mr_dynamic_dialog_row_height, typedValue, true);
        this.f4442E = (int) typedValue.getDimension(displayMetrics);
    }

    /* JADX INFO: renamed from: r */
    public final boolean m2611r(C1403C c1403c) {
        if (c1403c.m3497g()) {
            return true;
        }
        C1447t c1447tM3492b = this.f4444G.f4457l.f4499o.m3492b(c1403c);
        if (c1447tM3492b == null) {
            return false;
        }
        C1445r c1445r = (C1445r) c1447tM3492b.f6406h;
        return (c1445r != null ? c1445r.f6396b : 1) == 3;
    }

    /* JADX INFO: renamed from: s */
    public final void m2612s(boolean z3, boolean z4) {
        CheckBox checkBox = this.f4440C;
        checkBox.setEnabled(false);
        this.f4445x.setEnabled(false);
        checkBox.setChecked(z3);
        if (z3) {
            this.f4446y.setVisibility(4);
            this.f4447z.setVisibility(0);
        }
        if (z4) {
            this.f4444G.m2614f(this.f4439B, z3 ? this.f4442E : 0);
        }
    }
}
