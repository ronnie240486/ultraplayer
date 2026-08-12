package p083b1;

import android.view.View;
import android.widget.TextView;
import com.zuxoplayer.app.R;
import p064W.AbstractC0632A;
import p104h1.AbstractC1635T;

/* JADX INFO: renamed from: b1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1105o extends AbstractC1635T {

    /* JADX INFO: renamed from: t */
    public final TextView f5052t;

    /* JADX INFO: renamed from: u */
    public final View f5053u;

    public C1105o(View view) {
        super(view);
        if (AbstractC0632A.f2454a < 26) {
            view.setFocusable(true);
        }
        this.f5052t = (TextView) view.findViewById(R.id.exo_text);
        this.f5053u = view.findViewById(R.id.exo_check);
    }
}
