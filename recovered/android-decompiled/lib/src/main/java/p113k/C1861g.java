package p113k;

import android.content.Context;
import android.view.View;
import com.zuxoplayer.app.R;
import p089d1.C1447t;
import p110j.AbstractC1780u;
import p110j.C1782w;
import p110j.MenuC1772m;
import p110j.SubMenuC1759E;

/* JADX INFO: renamed from: k.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1861g extends C1782w {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f8152l = 0;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C1873k f8153m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1861g(C1873k c1873k, Context context, MenuC1772m menuC1772m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC1772m, true);
        this.f8153m = c1873k;
        this.f7968f = 8388613;
        C1447t c1447t = c1873k.f8196C;
        this.f7970h = c1447t;
        AbstractC1780u abstractC1780u = this.f7971i;
        if (abstractC1780u != null) {
            abstractC1780u.mo4217i(c1447t);
        }
    }

    @Override // p110j.C1782w
    /* JADX INFO: renamed from: c */
    public final void mo4274c() {
        switch (this.f8152l) {
            case 0:
                C1873k c1873k = this.f8153m;
                c1873k.f8216z = null;
                c1873k.getClass();
                super.mo4274c();
                break;
            default:
                C1873k c1873k2 = this.f8153m;
                MenuC1772m menuC1772m = c1873k2.f8199i;
                if (menuC1772m != null) {
                    menuC1772m.m4253c(true);
                }
                c1873k2.f8215y = null;
                super.mo4274c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1861g(C1873k c1873k, Context context, SubMenuC1759E subMenuC1759E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC1759E, false);
        this.f8153m = c1873k;
        if ((subMenuC1759E.f7828A.f7948x & 32) != 32) {
            View view2 = c1873k.f8205o;
            this.f7967e = view2 == null ? (View) c1873k.f8204n : view2;
        }
        C1447t c1447t = c1873k.f8196C;
        this.f7970h = c1447t;
        AbstractC1780u abstractC1780u = this.f7971i;
        if (abstractC1780u != null) {
            abstractC1780u.mo4217i(c1447t);
        }
    }
}
