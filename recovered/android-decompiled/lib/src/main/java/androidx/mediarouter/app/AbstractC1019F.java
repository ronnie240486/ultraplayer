package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.R;
import p019G1.AbstractC0230e;
import p060U1.AbstractC0610a;
import p089d1.C1403C;
import p104h1.AbstractC1635T;
import p122m1.AbstractC2003a;
import p152u.AbstractC2279a;

/* JADX INFO: renamed from: androidx.mediarouter.app.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1019F extends AbstractC1635T {

    /* JADX INFO: renamed from: t */
    public C1403C f4419t;

    /* JADX INFO: renamed from: u */
    public final ImageButton f4420u;

    /* JADX INFO: renamed from: v */
    public final MediaRouteVolumeSlider f4421v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ DialogC1028O f4422w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1019F(DialogC1028O dialogC1028O, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        int iM739q;
        int iM739q2;
        super(view);
        this.f4422w = dialogC1028O;
        this.f4420u = imageButton;
        this.f4421v = mediaRouteVolumeSlider;
        Context context = dialogC1028O.f4504t;
        Drawable drawableM4548u = AbstractC2003a.m4548u(AbstractC0610a.m1512n(context, R.drawable.mr_cast_mute_button));
        if (AbstractC1303m.m3330w(context)) {
            AbstractC2279a.m4891g(drawableM4548u, AbstractC0230e.m739q(context, R.color.mr_dynamic_dialog_icon_light));
        }
        imageButton.setImageDrawable(drawableM4548u);
        Context context2 = dialogC1028O.f4504t;
        if (AbstractC1303m.m3330w(context2)) {
            iM739q = AbstractC0230e.m739q(context2, R.color.mr_cast_progressbar_progress_and_thumb_light);
            iM739q2 = AbstractC0230e.m739q(context2, R.color.mr_cast_progressbar_background_light);
        } else {
            iM739q = AbstractC0230e.m739q(context2, R.color.mr_cast_progressbar_progress_and_thumb_dark);
            iM739q2 = AbstractC0230e.m739q(context2, R.color.mr_cast_progressbar_background_dark);
        }
        mediaRouteVolumeSlider.m2618a(iM739q, iM739q2);
    }

    /* JADX INFO: renamed from: p */
    public final void m2599p(C1403C c1403c) {
        this.f4419t = c1403c;
        int i3 = c1403c.f6231p;
        boolean z3 = i3 == 0;
        ImageButton imageButton = this.f4420u;
        imageButton.setActivated(z3);
        imageButton.setOnClickListener(new ViewOnClickListenerC1018E(0, this));
        C1403C c1403c2 = this.f4419t;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.f4421v;
        mediaRouteVolumeSlider.setTag(c1403c2);
        mediaRouteVolumeSlider.setMax(c1403c.f6232q);
        mediaRouteVolumeSlider.setProgress(i3);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.f4422w.f4471A);
    }

    /* JADX INFO: renamed from: q */
    public final void m2600q(boolean z3) {
        ImageButton imageButton = this.f4420u;
        if (imageButton.isActivated() == z3) {
            return;
        }
        imageButton.setActivated(z3);
        DialogC1028O dialogC1028O = this.f4422w;
        if (z3) {
            dialogC1028O.f4474D.put(this.f4419t.f6218c, Integer.valueOf(this.f4421v.getProgress()));
        } else {
            dialogC1028O.f4474D.remove(this.f4419t.f6218c);
        }
    }
}
