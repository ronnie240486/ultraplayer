package p083b1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.mediarouter.app.ViewOnClickListenerC1034c;
import com.zuxoplayer.app.R;
import p064W.AbstractC0632A;
import p104h1.AbstractC1635T;

/* JADX INFO: renamed from: b1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1103m extends AbstractC1635T {

    /* JADX INFO: renamed from: t */
    public final TextView f5044t;

    /* JADX INFO: renamed from: u */
    public final TextView f5045u;

    /* JADX INFO: renamed from: v */
    public final ImageView f5046v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C1109s f5047w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1103m(C1109s c1109s, View view) {
        super(view);
        this.f5047w = c1109s;
        if (AbstractC0632A.f2454a < 26) {
            view.setFocusable(true);
        }
        this.f5044t = (TextView) view.findViewById(R.id.exo_main_text);
        this.f5045u = (TextView) view.findViewById(R.id.exo_sub_text);
        this.f5046v = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new ViewOnClickListenerC1034c(3, this));
    }
}
