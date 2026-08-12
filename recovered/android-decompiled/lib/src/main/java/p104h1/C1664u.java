package p104h1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.AbstractC0916f;

/* JADX INFO: renamed from: h1.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1664u extends AbstractC0916f {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1664u(AbstractC1621E abstractC1621E, int i3) {
        super(abstractC1621E);
        this.f7585d = i3;
    }

    @Override // androidx.emoji2.text.AbstractC0916f
    /* JADX INFO: renamed from: b */
    public final int mo2390b(View view) {
        switch (this.f7585d) {
            case 0:
                C1622F c1622f = (C1622F) view.getLayoutParams();
                ((AbstractC1621E) this.f4001b).getClass();
                return view.getRight() + ((C1622F) view.getLayoutParams()).f7365b.right + ((ViewGroup.MarginLayoutParams) c1622f).rightMargin;
            default:
                C1622F c1622f2 = (C1622F) view.getLayoutParams();
                ((AbstractC1621E) this.f4001b).getClass();
                return view.getBottom() + ((C1622F) view.getLayoutParams()).f7365b.bottom + ((ViewGroup.MarginLayoutParams) c1622f2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0916f
    /* JADX INFO: renamed from: c */
    public final int mo2391c(View view) {
        switch (this.f7585d) {
            case 0:
                C1622F c1622f = (C1622F) view.getLayoutParams();
                ((AbstractC1621E) this.f4001b).getClass();
                Rect rect = ((C1622F) view.getLayoutParams()).f7365b;
                return view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1622f).leftMargin + ((ViewGroup.MarginLayoutParams) c1622f).rightMargin;
            default:
                C1622F c1622f2 = (C1622F) view.getLayoutParams();
                ((AbstractC1621E) this.f4001b).getClass();
                Rect rect2 = ((C1622F) view.getLayoutParams()).f7365b;
                return view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c1622f2).topMargin + ((ViewGroup.MarginLayoutParams) c1622f2).bottomMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0916f
    /* JADX INFO: renamed from: d */
    public final int mo2392d(View view) {
        switch (this.f7585d) {
            case 0:
                C1622F c1622f = (C1622F) view.getLayoutParams();
                ((AbstractC1621E) this.f4001b).getClass();
                Rect rect = ((C1622F) view.getLayoutParams()).f7365b;
                return view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1622f).topMargin + ((ViewGroup.MarginLayoutParams) c1622f).bottomMargin;
            default:
                C1622F c1622f2 = (C1622F) view.getLayoutParams();
                ((AbstractC1621E) this.f4001b).getClass();
                Rect rect2 = ((C1622F) view.getLayoutParams()).f7365b;
                return view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c1622f2).leftMargin + ((ViewGroup.MarginLayoutParams) c1622f2).rightMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0916f
    /* JADX INFO: renamed from: e */
    public final int mo2393e(View view) {
        switch (this.f7585d) {
            case 0:
                C1622F c1622f = (C1622F) view.getLayoutParams();
                ((AbstractC1621E) this.f4001b).getClass();
                return (view.getLeft() - ((C1622F) view.getLayoutParams()).f7365b.left) - ((ViewGroup.MarginLayoutParams) c1622f).leftMargin;
            default:
                C1622F c1622f2 = (C1622F) view.getLayoutParams();
                ((AbstractC1621E) this.f4001b).getClass();
                return (view.getTop() - ((C1622F) view.getLayoutParams()).f7365b.top) - ((ViewGroup.MarginLayoutParams) c1622f2).topMargin;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0916f
    /* JADX INFO: renamed from: f */
    public final int mo2394f() {
        switch (this.f7585d) {
            case 0:
                return ((AbstractC1621E) this.f4001b).f7362m;
            default:
                return ((AbstractC1621E) this.f4001b).f7363n;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0916f
    /* JADX INFO: renamed from: g */
    public final int mo2395g() {
        switch (this.f7585d) {
            case 0:
                AbstractC1621E abstractC1621E = (AbstractC1621E) this.f4001b;
                return abstractC1621E.f7362m - abstractC1621E.m4007A();
            default:
                AbstractC1621E abstractC1621E2 = (AbstractC1621E) this.f4001b;
                return abstractC1621E2.f7363n - abstractC1621E2.m4027y();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0916f
    /* JADX INFO: renamed from: h */
    public final int mo2396h() {
        switch (this.f7585d) {
            case 0:
                return ((AbstractC1621E) this.f4001b).m4007A();
            default:
                return ((AbstractC1621E) this.f4001b).m4027y();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0916f
    /* JADX INFO: renamed from: i */
    public final int mo2397i() {
        switch (this.f7585d) {
            case 0:
                return ((AbstractC1621E) this.f4001b).f7360k;
            default:
                return ((AbstractC1621E) this.f4001b).f7361l;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0916f
    /* JADX INFO: renamed from: j */
    public final int mo2398j() {
        switch (this.f7585d) {
            case 0:
                return ((AbstractC1621E) this.f4001b).f7361l;
            default:
                return ((AbstractC1621E) this.f4001b).f7360k;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0916f
    /* JADX INFO: renamed from: k */
    public final int mo2399k() {
        switch (this.f7585d) {
            case 0:
                return ((AbstractC1621E) this.f4001b).m4028z();
            default:
                return ((AbstractC1621E) this.f4001b).m4008B();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0916f
    /* JADX INFO: renamed from: l */
    public final int mo2400l() {
        switch (this.f7585d) {
            case 0:
                AbstractC1621E abstractC1621E = (AbstractC1621E) this.f4001b;
                return (abstractC1621E.f7362m - abstractC1621E.m4028z()) - abstractC1621E.m4007A();
            default:
                AbstractC1621E abstractC1621E2 = (AbstractC1621E) this.f4001b;
                return (abstractC1621E2.f7363n - abstractC1621E2.m4008B()) - abstractC1621E2.m4027y();
        }
    }

    @Override // androidx.emoji2.text.AbstractC0916f
    /* JADX INFO: renamed from: m */
    public final int mo2401m(View view) {
        switch (this.f7585d) {
            case 0:
                AbstractC1621E abstractC1621E = (AbstractC1621E) this.f4001b;
                Rect rect = (Rect) this.f4002c;
                abstractC1621E.m4009F(view, rect);
                return rect.right;
            default:
                AbstractC1621E abstractC1621E2 = (AbstractC1621E) this.f4001b;
                Rect rect2 = (Rect) this.f4002c;
                abstractC1621E2.m4009F(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0916f
    /* JADX INFO: renamed from: n */
    public final int mo2402n(View view) {
        switch (this.f7585d) {
            case 0:
                AbstractC1621E abstractC1621E = (AbstractC1621E) this.f4001b;
                Rect rect = (Rect) this.f4002c;
                abstractC1621E.m4009F(view, rect);
                return rect.left;
            default:
                AbstractC1621E abstractC1621E2 = (AbstractC1621E) this.f4001b;
                Rect rect2 = (Rect) this.f4002c;
                abstractC1621E2.m4009F(view, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.emoji2.text.AbstractC0916f
    /* JADX INFO: renamed from: o */
    public final void mo2403o(int i3) {
        switch (this.f7585d) {
            case 0:
                ((AbstractC1621E) this.f4001b).mo2804J(i3);
                break;
            default:
                ((AbstractC1621E) this.f4001b).mo2806K(i3);
                break;
        }
    }
}
