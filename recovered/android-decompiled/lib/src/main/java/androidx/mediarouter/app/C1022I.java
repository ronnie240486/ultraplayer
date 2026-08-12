package androidx.mediarouter.app;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.zuxoplayer.app.R;

/* JADX INFO: renamed from: androidx.mediarouter.app.I */
/* JADX INFO: loaded from: classes.dex */
public final class C1022I extends AbstractC1019F {

    /* JADX INFO: renamed from: x */
    public final TextView f4432x;

    /* JADX INFO: renamed from: y */
    public final int f4433y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C1026M f4434z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1022I(C1026M c1026m, View view) {
        super(c1026m.f4457l, view, (ImageButton) view.findViewById(R.id.mr_cast_mute_button), (MediaRouteVolumeSlider) view.findViewById(R.id.mr_cast_volume_slider));
        this.f4434z = c1026m;
        this.f4432x = (TextView) view.findViewById(R.id.mr_group_volume_route_name);
        Resources resources = c1026m.f4457l.f4504t.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.mr_dynamic_volume_group_list_item_height, typedValue, true);
        this.f4433y = (int) typedValue.getDimension(displayMetrics);
    }
}
