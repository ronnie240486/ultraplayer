package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.R;
import java.util.ArrayList;
import java.util.HashSet;
import p089d1.C1403C;
import p089d1.C1405E;
import p148t.AbstractC2262a;

/* JADX INFO: renamed from: androidx.mediarouter.app.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1050s extends ArrayAdapter {

    /* JADX INFO: renamed from: g */
    public final float f4605g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ DialogC1051t f4606h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1050s(DialogC1051t dialogC1051t, Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.f4606h = dialogC1051t;
        this.f4605g = AbstractC1303m.m3322o(context);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b7  */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        DialogC1051t dialogC1051t = this.f4606h;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mr_controller_volume_item, viewGroup, false);
        } else {
            DialogC1051t.m2652p((LinearLayout) view.findViewById(R.id.volume_item_container), dialogC1051t.f4628U);
            View viewFindViewById = view.findViewById(R.id.mr_volume_item_icon);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            int i4 = dialogC1051t.f4627T;
            layoutParams.width = i4;
            layoutParams.height = i4;
            viewFindViewById.setLayoutParams(layoutParams);
        }
        C1403C c1403c = (C1403C) getItem(i3);
        if (c1403c != null) {
            boolean z3 = c1403c.f6222g;
            TextView textView = (TextView) view.findViewById(R.id.mr_name);
            textView.setEnabled(z3);
            textView.setText(c1403c.f6219d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(R.id.mr_volume_slider);
            Context context = viewGroup.getContext();
            OverlayListView overlayListView = dialogC1051t.f4618K;
            int iM3321n = AbstractC1303m.m3321n(context);
            if (Color.alpha(iM3321n) != 255) {
                iM3321n = AbstractC2262a.m4858f(iM3321n, ((Integer) overlayListView.getTag()).intValue());
            }
            mediaRouteVolumeSlider.m2618a(iM3321n, iM3321n);
            mediaRouteVolumeSlider.setTag(c1403c);
            dialogC1051t.f4631X.put(c1403c, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.m2619b(!z3);
            mediaRouteVolumeSlider.setEnabled(z3);
            if (z3) {
                if (dialogC1051t.f4612E) {
                    if (((!c1403c.m3495e() || C1405E.m3515g()) ? c1403c.f6230o : 0) == 1) {
                        mediaRouteVolumeSlider.setMax(c1403c.f6232q);
                        mediaRouteVolumeSlider.setProgress(c1403c.f6231p);
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(dialogC1051t.f4625R);
                    } else {
                        mediaRouteVolumeSlider.setMax(100);
                        mediaRouteVolumeSlider.setProgress(100);
                        mediaRouteVolumeSlider.setEnabled(false);
                    }
                } else {
                    mediaRouteVolumeSlider.setMax(100);
                    mediaRouteVolumeSlider.setProgress(100);
                    mediaRouteVolumeSlider.setEnabled(false);
                }
            }
            ((ImageView) view.findViewById(R.id.mr_volume_item_icon)).setAlpha(z3 ? 255 : (int) (this.f4605g * 255.0f));
            ((LinearLayout) view.findViewById(R.id.volume_item_container)).setVisibility(dialogC1051t.f4623P.contains(c1403c) ? 4 : 0);
            HashSet hashSet = dialogC1051t.f4621N;
            if (hashSet != null && hashSet.contains(c1403c)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(0L);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                view.clearAnimation();
                view.startAnimation(alphaAnimation);
            }
        }
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i3) {
        return false;
    }
}
