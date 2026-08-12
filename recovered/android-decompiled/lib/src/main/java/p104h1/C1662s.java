package p104h1;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: h1.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1662s {

    /* JADX INFO: renamed from: a */
    public boolean f7570a;

    /* JADX INFO: renamed from: b */
    public int f7571b;

    /* JADX INFO: renamed from: c */
    public int f7572c;

    /* JADX INFO: renamed from: d */
    public int f7573d;

    /* JADX INFO: renamed from: e */
    public int f7574e;

    /* JADX INFO: renamed from: f */
    public int f7575f;

    /* JADX INFO: renamed from: g */
    public int f7576g;

    /* JADX INFO: renamed from: h */
    public int f7577h;

    /* JADX INFO: renamed from: i */
    public int f7578i;

    /* JADX INFO: renamed from: j */
    public int f7579j;

    /* JADX INFO: renamed from: k */
    public List f7580k;

    /* JADX INFO: renamed from: l */
    public boolean f7581l;

    /* JADX INFO: renamed from: a */
    public final void m4090a(View view) {
        int iM4048b;
        int size = this.f7580k.size();
        View view2 = null;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < size; i4++) {
            View view3 = ((AbstractC1635T) this.f7580k.get(i4)).f7406a;
            C1622F c1622f = (C1622F) view3.getLayoutParams();
            if (view3 != view && !c1622f.f7364a.m4053g() && (iM4048b = (c1622f.f7364a.m4048b() - this.f7573d) * this.f7574e) >= 0 && iM4048b < i3) {
                view2 = view3;
                if (iM4048b == 0) {
                    break;
                } else {
                    i3 = iM4048b;
                }
            }
        }
        if (view2 == null) {
            this.f7573d = -1;
        } else {
            this.f7573d = ((C1622F) view2.getLayoutParams()).f7364a.m4048b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final View m4091b(C1627K c1627k) {
        List list = this.f7580k;
        if (list == null) {
            View view = c1627k.m4041k(this.f7573d, Long.MAX_VALUE).f7406a;
            this.f7573d += this.f7574e;
            return view;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = ((AbstractC1635T) this.f7580k.get(i3)).f7406a;
            C1622F c1622f = (C1622F) view2.getLayoutParams();
            if (!c1622f.f7364a.m4053g() && this.f7573d == c1622f.f7364a.m4048b()) {
                m4090a(view2);
                return view2;
            }
        }
        return null;
    }
}
