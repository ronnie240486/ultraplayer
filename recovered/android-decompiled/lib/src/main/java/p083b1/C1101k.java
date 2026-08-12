package p083b1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zuxoplayer.app.R;
import p104h1.AbstractC1635T;
import p104h1.AbstractC1667x;

/* JADX INFO: renamed from: b1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1101k extends AbstractC1667x {

    /* JADX INFO: renamed from: c */
    public final String[] f5040c;

    /* JADX INFO: renamed from: d */
    public final float[] f5041d;

    /* JADX INFO: renamed from: e */
    public int f5042e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1109s f5043f;

    public C1101k(C1109s c1109s, String[] strArr, float[] fArr) {
        this.f5043f = c1109s;
        this.f5040c = strArr;
        this.f5041d = fArr;
    }

    @Override // p104h1.AbstractC1667x
    /* JADX INFO: renamed from: a */
    public final int mo2591a() {
        return this.f5040c.length;
    }

    @Override // p104h1.AbstractC1667x
    /* JADX INFO: renamed from: c */
    public final void mo2593c(AbstractC1635T abstractC1635T, final int i3) {
        C1105o c1105o = (C1105o) abstractC1635T;
        String[] strArr = this.f5040c;
        if (i3 < strArr.length) {
            c1105o.f5052t.setText(strArr[i3]);
        }
        int i4 = this.f5042e;
        View view = c1105o.f5053u;
        View view2 = c1105o.f7406a;
        if (i3 == i4) {
            view2.setSelected(true);
            view.setVisibility(0);
        } else {
            view2.setSelected(false);
            view.setVisibility(4);
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: b1.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                C1101k c1101k = this.f5038g;
                int i5 = c1101k.f5042e;
                int i6 = i3;
                C1109s c1109s = c1101k.f5043f;
                if (i6 != i5) {
                    c1109s.setPlaybackSpeed(c1101k.f5041d[i6]);
                }
                c1109s.f5117q.dismiss();
            }
        });
    }

    @Override // p104h1.AbstractC1667x
    /* JADX INFO: renamed from: d */
    public final AbstractC1635T mo2594d(ViewGroup viewGroup, int i3) {
        return new C1105o(LayoutInflater.from(this.f5043f.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
