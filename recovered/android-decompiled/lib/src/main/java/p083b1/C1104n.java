package p083b1;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.zuxoplayer.app.R;
import p038N.AbstractC0402b;
import p055T.InterfaceC0553P;
import p104h1.AbstractC1635T;
import p104h1.AbstractC1667x;
import p104h1.C1622F;

/* JADX INFO: renamed from: b1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1104n extends AbstractC1667x {

    /* JADX INFO: renamed from: c */
    public final String[] f5048c;

    /* JADX INFO: renamed from: d */
    public final String[] f5049d;

    /* JADX INFO: renamed from: e */
    public final Drawable[] f5050e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1109s f5051f;

    public C1104n(C1109s c1109s, String[] strArr, Drawable[] drawableArr) {
        this.f5051f = c1109s;
        this.f5048c = strArr;
        this.f5049d = new String[strArr.length];
        this.f5050e = drawableArr;
    }

    @Override // p104h1.AbstractC1667x
    /* JADX INFO: renamed from: a */
    public final int mo2591a() {
        return this.f5048c.length;
    }

    @Override // p104h1.AbstractC1667x
    /* JADX INFO: renamed from: c */
    public final void mo2593c(AbstractC1635T abstractC1635T, int i3) {
        C1103m c1103m = (C1103m) abstractC1635T;
        boolean zM2941f = m2941f(i3);
        View view = c1103m.f7406a;
        if (zM2941f) {
            view.setLayoutParams(new C1622F(-1, -2));
        } else {
            view.setLayoutParams(new C1622F(0, 0));
        }
        c1103m.f5044t.setText(this.f5048c[i3]);
        String str = this.f5049d[i3];
        TextView textView = c1103m.f5045u;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        Drawable drawable = this.f5050e[i3];
        ImageView imageView = c1103m.f5046v;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // p104h1.AbstractC1667x
    /* JADX INFO: renamed from: d */
    public final AbstractC1635T mo2594d(ViewGroup viewGroup, int i3) {
        C1109s c1109s = this.f5051f;
        return new C1103m(c1109s, LayoutInflater.from(c1109s.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2941f(int i3) {
        C1109s c1109s = this.f5051f;
        InterfaceC0553P interfaceC0553P = c1109s.f5116p0;
        if (interfaceC0553P == null) {
            return false;
        }
        if (i3 == 0) {
            return ((AbstractC0402b) interfaceC0553P).m1089U(13);
        }
        if (i3 != 1) {
            return true;
        }
        return ((AbstractC0402b) interfaceC0553P).m1089U(30) && ((AbstractC0402b) c1109s.f5116p0).m1089U(29);
    }
}
