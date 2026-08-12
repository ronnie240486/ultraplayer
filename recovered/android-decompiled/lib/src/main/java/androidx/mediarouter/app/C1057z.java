package androidx.mediarouter.app;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.R;
import p104h1.AbstractC1635T;

/* JADX INFO: renamed from: androidx.mediarouter.app.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1057z extends AbstractC1635T {

    /* JADX INFO: renamed from: t */
    public final View f4678t;

    /* JADX INFO: renamed from: u */
    public final ImageView f4679u;

    /* JADX INFO: renamed from: v */
    public final ProgressBar f4680v;

    /* JADX INFO: renamed from: w */
    public final TextView f4681w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C1014A f4682x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1057z(C1014A c1014a, View view) {
        super(view);
        this.f4682x = c1014a;
        this.f4678t = view;
        this.f4679u = (ImageView) view.findViewById(R.id.mr_picker_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.mr_picker_route_progress_bar);
        this.f4680v = progressBar;
        this.f4681w = (TextView) view.findViewById(R.id.mr_picker_route_name);
        AbstractC1303m.m3284G(c1014a.f4398i.f4401n, progressBar);
    }
}
