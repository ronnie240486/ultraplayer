package androidx.mediarouter.app;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.zuxoplayer.app.R;
import p038N.AbstractC0402b;
import p055T.InterfaceC0553P;
import p083b1.C1097g;
import p083b1.C1103m;
import p083b1.C1109s;
import p083b1.C1114x;
import p104h1.AbstractC1667x;

/* JADX INFO: renamed from: androidx.mediarouter.app.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1034c implements View.OnClickListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4545g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f4546h;

    public /* synthetic */ ViewOnClickListenerC1034c(int i3, Object obj) {
        this.f4545g = i3;
        this.f4546h = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RecyclerView recyclerView;
        AbstractC1667x adapter;
        int iM2750D;
        switch (this.f4545g) {
            case 0:
                ((DialogC1037f) this.f4546h).dismiss();
                break;
            case 1:
                C1109s c1109s = (C1109s) this.f4546h;
                c1109s.m2952k(!c1109s.f5120r0);
                break;
            case 2:
                C1109s c1109s2 = ((C1097g) this.f4546h).f5036f;
                InterfaceC0553P interfaceC0553P = c1109s2.f5116p0;
                if (interfaceC0553P != null && ((AbstractC0402b) interfaceC0553P).m1089U(29)) {
                    c1109s2.f5116p0.mo1316m(c1109s2.f5116p0.mo1284D().mo1429a().mo1419b(1).mo1426i(1).mo1418a());
                    c1109s2.f5107l.f5049d[1] = c1109s2.getResources().getString(R.string.exo_track_selection_auto);
                    c1109s2.f5117q.dismiss();
                    break;
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                C1103m c1103m = (C1103m) this.f4546h;
                int i3 = -1;
                if (c1103m.f7423r != null && (recyclerView = c1103m.f7422q) != null && (adapter = recyclerView.getAdapter()) != null && (iM2750D = c1103m.f7422q.m2750D(c1103m)) != -1 && c1103m.f7423r == adapter) {
                    i3 = iM2750D;
                }
                C1109s c1109s3 = c1103m.f5047w;
                View view2 = c1109s3.f5072F;
                if (i3 == 0) {
                    view2.getClass();
                    c1109s3.m2945d(c1109s3.f5109m, view2);
                } else if (i3 != 1) {
                    c1109s3.f5117q.dismiss();
                } else {
                    view2.getClass();
                    c1109s3.m2945d(c1109s3.f5113o, view2);
                }
                break;
            case 4:
                C1109s c1109s4 = ((C1097g) this.f4546h).f5036f;
                InterfaceC0553P interfaceC0553P2 = c1109s4.f5116p0;
                if (interfaceC0553P2 != null && ((AbstractC0402b) interfaceC0553P2).m1089U(29)) {
                    c1109s4.f5116p0.mo1316m(c1109s4.f5116p0.mo1284D().mo1429a().mo1419b(3).mo1421d().mo1423f().mo1425h().mo1418a());
                    c1109s4.f5117q.dismiss();
                    break;
                }
                break;
            default:
                C1114x c1114x = (C1114x) this.f4546h;
                c1114x.m2969g();
                if (view.getId() == R.id.exo_overflow_show) {
                    c1114x.f5165q.start();
                } else if (view.getId() == R.id.exo_overflow_hide) {
                    c1114x.f5166r.start();
                }
                break;
        }
    }
}
