package p083b1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.mediarouter.app.ViewOnClickListenerC1034c;
import com.zuxoplayer.app.R;
import java.util.ArrayList;
import java.util.List;
import p038N.AbstractC0402b;
import p055T.C0559W;
import p055T.C0560X;
import p055T.C0562Z;
import p055T.C0564a0;
import p055T.InterfaceC0553P;
import p104h1.AbstractC1635T;
import p104h1.AbstractC1667x;
import p105h2.AbstractC1676G;

/* JADX INFO: renamed from: b1.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1097g extends AbstractC1667x {

    /* JADX INFO: renamed from: c */
    public List f5033c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1109s f5034d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5035e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1109s f5036f;

    public C1097g(C1109s c1109s, int i3) {
        this.f5035e = i3;
        this.f5036f = c1109s;
        this.f5034d = c1109s;
    }

    @Override // p104h1.AbstractC1667x
    /* JADX INFO: renamed from: a */
    public final int mo2591a() {
        if (this.f5033c.isEmpty()) {
            return 0;
        }
        return this.f5033c.size() + 1;
    }

    @Override // p104h1.AbstractC1667x
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ void mo2593c(AbstractC1635T abstractC1635T, int i3) {
        switch (this.f5035e) {
            case 1:
                m2939h((C1105o) abstractC1635T, i3);
                break;
            default:
                m2939h((C1105o) abstractC1635T, i3);
                break;
        }
    }

    @Override // p104h1.AbstractC1667x
    /* JADX INFO: renamed from: d */
    public final AbstractC1635T mo2594d(ViewGroup viewGroup, int i3) {
        return new C1105o(LayoutInflater.from(this.f5034d.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    /* JADX INFO: renamed from: f */
    public boolean m2937f(C0564a0 c0564a0) {
        for (int i3 = 0; i3 < this.f5033c.size(); i3++) {
            if (c0564a0.f2041q.containsKey(((C1106p) this.f5033c.get(i3)).f5054a.f2048b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m2938g(List list) {
        boolean z3 = false;
        for (int i3 = 0; i3 < list.size(); i3++) {
            C1106p c1106p = (C1106p) list.get(i3);
            if (c1106p.f5054a.f2051e[c1106p.f5055b]) {
                z3 = true;
                break;
            }
        }
        C1109s c1109s = this.f5036f;
        ImageView imageView = c1109s.f5066C;
        if (imageView != null) {
            imageView.setImageDrawable(z3 ? c1109s.f5100h0 : c1109s.f5102i0);
            c1109s.f5066C.setContentDescription(z3 ? c1109s.f5104j0 : c1109s.f5106k0);
        }
        this.f5033c = list;
    }

    /* JADX INFO: renamed from: h */
    public void m2939h(C1105o c1105o, int i3) {
        switch (this.f5035e) {
            case 1:
                m2940i(c1105o, i3);
                if (i3 > 0) {
                    C1106p c1106p = (C1106p) this.f5033c.get(i3 - 1);
                    c1105o.f5053u.setVisibility(c1106p.f5054a.f2051e[c1106p.f5055b] ? 0 : 4);
                }
                break;
            default:
                m2940i(c1105o, i3);
                break;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2940i(C1105o c1105o, int i3) {
        final InterfaceC0553P interfaceC0553P = this.f5034d.f5116p0;
        if (interfaceC0553P == null) {
        }
        if (i3 != 0) {
            final C1106p c1106p = (C1106p) this.f5033c.get(i3 - 1);
            final C0559W c0559w = c1106p.f5054a.f2048b;
            boolean z3 = interfaceC0553P.mo1284D().f2041q.get(c0559w) != null && c1106p.f5054a.f2051e[c1106p.f5055b];
            c1105o.f5052t.setText(c1106p.f5056c);
            c1105o.f5053u.setVisibility(z3 ? 0 : 4);
            c1105o.f7406a.setOnClickListener(new View.OnClickListener() { // from class: b1.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1097g c1097g = this.f5057g;
                    c1097g.getClass();
                    AbstractC0402b abstractC0402b = (AbstractC0402b) interfaceC0553P;
                    if (abstractC0402b.m1089U(29)) {
                        C0562Z c0562zMo1429a = abstractC0402b.mo1284D().mo1429a();
                        C1106p c1106p2 = c1106p;
                        abstractC0402b.mo1316m(c0562zMo1429a.mo1422e(new C0560X(c0559w, AbstractC1676G.m4120r(Integer.valueOf(c1106p2.f5055b)))).mo1426i(c1106p2.f5054a.f2048b.f1994c).mo1418a());
                        String str = c1106p2.f5056c;
                        switch (c1097g.f5035e) {
                            case 0:
                                c1097g.f5036f.f5107l.f5049d[1] = str;
                                break;
                        }
                        c1097g.f5034d.f5117q.dismiss();
                    }
                }
            });
            return;
        }
        switch (this.f5035e) {
            case 0:
                c1105o.f5052t.setText(R.string.exo_track_selection_auto);
                InterfaceC0553P interfaceC0553P2 = this.f5036f.f5116p0;
                interfaceC0553P2.getClass();
                c1105o.f5053u.setVisibility(m2937f(interfaceC0553P2.mo1284D()) ? 4 : 0);
                c1105o.f7406a.setOnClickListener(new ViewOnClickListenerC1034c(2, this));
                break;
            default:
                c1105o.f5052t.setText(R.string.exo_track_selection_none);
                int i4 = 0;
                for (int i5 = 0; i5 < this.f5033c.size(); i5++) {
                    C1106p c1106p2 = (C1106p) this.f5033c.get(i5);
                    if (c1106p2.f5054a.f2051e[c1106p2.f5055b]) {
                        i4 = 4;
                        c1105o.f5053u.setVisibility(i4);
                        c1105o.f7406a.setOnClickListener(new ViewOnClickListenerC1034c(4, this));
                    }
                    break;
                }
                c1105o.f5053u.setVisibility(i4);
                c1105o.f7406a.setOnClickListener(new ViewOnClickListenerC1034c(4, this));
                break;
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m2936j(String str) {
    }
}
