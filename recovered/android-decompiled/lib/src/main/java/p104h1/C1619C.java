package p104h1;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: h1.C */
/* JADX INFO: loaded from: classes.dex */
public final class C1619C {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7344a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1621E f7345b;

    public /* synthetic */ C1619C(AbstractC1621E abstractC1621E, int i3) {
        this.f7344a = i3;
        this.f7345b = abstractC1621E;
    }

    /* JADX INFO: renamed from: a */
    public final int m3996a(View view) {
        switch (this.f7344a) {
            case 0:
                C1622F c1622f = (C1622F) view.getLayoutParams();
                this.f7345b.getClass();
                return view.getRight() + ((C1622F) view.getLayoutParams()).f7365b.right + ((ViewGroup.MarginLayoutParams) c1622f).rightMargin;
            default:
                C1622F c1622f2 = (C1622F) view.getLayoutParams();
                this.f7345b.getClass();
                return view.getBottom() + ((C1622F) view.getLayoutParams()).f7365b.bottom + ((ViewGroup.MarginLayoutParams) c1622f2).bottomMargin;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m3997b(View view) {
        switch (this.f7344a) {
            case 0:
                C1622F c1622f = (C1622F) view.getLayoutParams();
                this.f7345b.getClass();
                return (view.getLeft() - ((C1622F) view.getLayoutParams()).f7365b.left) - ((ViewGroup.MarginLayoutParams) c1622f).leftMargin;
            default:
                C1622F c1622f2 = (C1622F) view.getLayoutParams();
                this.f7345b.getClass();
                return (view.getTop() - ((C1622F) view.getLayoutParams()).f7365b.top) - ((ViewGroup.MarginLayoutParams) c1622f2).topMargin;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m3998c() {
        switch (this.f7344a) {
            case 0:
                AbstractC1621E abstractC1621E = this.f7345b;
                return abstractC1621E.f7362m - abstractC1621E.m4007A();
            default:
                AbstractC1621E abstractC1621E2 = this.f7345b;
                return abstractC1621E2.f7363n - abstractC1621E2.m4027y();
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m3999d() {
        switch (this.f7344a) {
            case 0:
                return this.f7345b.m4028z();
            default:
                return this.f7345b.m4008B();
        }
    }
}
