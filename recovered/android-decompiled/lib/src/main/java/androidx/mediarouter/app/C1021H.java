package androidx.mediarouter.app;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.R;
import p089d1.C1403C;
import p104h1.AbstractC1635T;

/* JADX INFO: renamed from: androidx.mediarouter.app.H */
/* JADX INFO: loaded from: classes.dex */
public final class C1021H extends AbstractC1635T {

    /* JADX INFO: renamed from: t */
    public final View f4425t;

    /* JADX INFO: renamed from: u */
    public final ImageView f4426u;

    /* JADX INFO: renamed from: v */
    public final ProgressBar f4427v;

    /* JADX INFO: renamed from: w */
    public final TextView f4428w;

    /* JADX INFO: renamed from: x */
    public final float f4429x;

    /* JADX INFO: renamed from: y */
    public C1403C f4430y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C1026M f4431z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1021H(C1026M c1026m, View view) {
        super(view);
        this.f4431z = c1026m;
        this.f4425t = view;
        this.f4426u = (ImageView) view.findViewById(R.id.mr_cast_group_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_cast_group_progress_bar);
        this.f4427v = progressBar;
        this.f4428w = (TextView) view.findViewById(R.id.mr_cast_group_name);
        this.f4429x = AbstractC1303m.m3322o(c1026m.f4457l.f4504t);
        AbstractC1303m.m3284G(c1026m.f4457l.f4504t, progressBar);
    }
}
