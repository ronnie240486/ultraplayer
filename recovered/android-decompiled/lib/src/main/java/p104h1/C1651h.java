package p104h1;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import p000A.C0058r;

/* JADX INFO: renamed from: h1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1651h extends AbstractC1618B {

    /* JADX INFO: renamed from: s */
    public static TimeInterpolator f7493s;

    /* JADX INFO: renamed from: g */
    public boolean f7494g;

    /* JADX INFO: renamed from: h */
    public ArrayList f7495h;

    /* JADX INFO: renamed from: i */
    public ArrayList f7496i;

    /* JADX INFO: renamed from: j */
    public ArrayList f7497j;

    /* JADX INFO: renamed from: k */
    public ArrayList f7498k;

    /* JADX INFO: renamed from: l */
    public ArrayList f7499l;

    /* JADX INFO: renamed from: m */
    public ArrayList f7500m;

    /* JADX INFO: renamed from: n */
    public ArrayList f7501n;

    /* JADX INFO: renamed from: o */
    public ArrayList f7502o;

    /* JADX INFO: renamed from: p */
    public ArrayList f7503p;

    /* JADX INFO: renamed from: q */
    public ArrayList f7504q;

    /* JADX INFO: renamed from: r */
    public ArrayList f7505r;

    /* JADX INFO: renamed from: h */
    public static void m4072h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC1635T) arrayList.get(size)).f7406a.animate().cancel();
        }
    }

    @Override // p104h1.AbstractC1618B
    /* JADX INFO: renamed from: a */
    public final boolean mo3991a(AbstractC1635T abstractC1635T, AbstractC1635T abstractC1635T2, C0058r c0058r, C0058r c0058r2) {
        int i3;
        int i4;
        int i5 = c0058r.f82a;
        int i6 = c0058r.f83b;
        if (abstractC1635T2.m4060n()) {
            int i7 = c0058r.f82a;
            i4 = c0058r.f83b;
            i3 = i7;
        } else {
            i3 = c0058r2.f82a;
            i4 = c0058r2.f83b;
        }
        if (abstractC1635T == abstractC1635T2) {
            return m4073g(abstractC1635T, i5, i6, i3, i4);
        }
        View view = abstractC1635T.f7406a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m4077l(abstractC1635T);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        m4077l(abstractC1635T2);
        float f = -((int) ((i3 - i5) - translationX));
        View view2 = abstractC1635T2.f7406a;
        view2.setTranslationX(f);
        view2.setTranslationY(-((int) ((i4 - i6) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f7498k;
        C1649f c1649f = new C1649f();
        c1649f.f7482a = abstractC1635T;
        c1649f.f7483b = abstractC1635T2;
        c1649f.f7484c = i5;
        c1649f.f7485d = i6;
        c1649f.f7486e = i3;
        c1649f.f7487f = i4;
        arrayList.add(c1649f);
        return true;
    }

    @Override // p104h1.AbstractC1618B
    /* JADX INFO: renamed from: d */
    public final void mo3993d(AbstractC1635T abstractC1635T) {
        View view = abstractC1635T.f7406a;
        view.animate().cancel();
        ArrayList arrayList = this.f7497j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C1650g) arrayList.get(size)).f7488a == abstractC1635T) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m3992c(abstractC1635T);
                arrayList.remove(size);
            }
        }
        m4075j(this.f7498k, abstractC1635T);
        if (this.f7495h.remove(abstractC1635T)) {
            view.setAlpha(1.0f);
            m3992c(abstractC1635T);
        }
        if (this.f7496i.remove(abstractC1635T)) {
            view.setAlpha(1.0f);
            m3992c(abstractC1635T);
        }
        ArrayList arrayList2 = this.f7501n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            m4075j(arrayList3, abstractC1635T);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f7500m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                if (((C1650g) arrayList5.get(size4)).f7488a == abstractC1635T) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m3992c(abstractC1635T);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.f7499l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(abstractC1635T)) {
                view.setAlpha(1.0f);
                m3992c(abstractC1635T);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f7504q.remove(abstractC1635T);
        this.f7502o.remove(abstractC1635T);
        this.f7505r.remove(abstractC1635T);
        this.f7503p.remove(abstractC1635T);
        m4074i();
    }

    @Override // p104h1.AbstractC1618B
    /* JADX INFO: renamed from: e */
    public final void mo3994e() {
        ArrayList arrayList = this.f7497j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1650g c1650g = (C1650g) arrayList.get(size);
            View view = c1650g.f7488a.f7406a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m3992c(c1650g.f7488a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f7495h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            m3992c((AbstractC1635T) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f7496i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC1635T abstractC1635T = (AbstractC1635T) arrayList3.get(size3);
            abstractC1635T.f7406a.setAlpha(1.0f);
            m3992c(abstractC1635T);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f7498k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C1649f c1649f = (C1649f) arrayList4.get(size4);
            AbstractC1635T abstractC1635T2 = c1649f.f7482a;
            if (abstractC1635T2 != null) {
                m4076k(c1649f, abstractC1635T2);
            }
            AbstractC1635T abstractC1635T3 = c1649f.f7483b;
            if (abstractC1635T3 != null) {
                m4076k(c1649f, abstractC1635T3);
            }
        }
        arrayList4.clear();
        if (mo3995f()) {
            ArrayList arrayList5 = this.f7500m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    C1650g c1650g2 = (C1650g) arrayList6.get(size6);
                    View view2 = c1650g2.f7488a.f7406a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m3992c(c1650g2.f7488a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f7499l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    AbstractC1635T abstractC1635T4 = (AbstractC1635T) arrayList8.get(size8);
                    abstractC1635T4.f7406a.setAlpha(1.0f);
                    m3992c(abstractC1635T4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f7501n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C1649f c1649f2 = (C1649f) arrayList10.get(size10);
                    AbstractC1635T abstractC1635T5 = c1649f2.f7482a;
                    if (abstractC1635T5 != null) {
                        m4076k(c1649f2, abstractC1635T5);
                    }
                    AbstractC1635T abstractC1635T6 = c1649f2.f7483b;
                    if (abstractC1635T6 != null) {
                        m4076k(c1649f2, abstractC1635T6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            m4072h(this.f7504q);
            m4072h(this.f7503p);
            m4072h(this.f7502o);
            m4072h(this.f7505r);
            ArrayList arrayList11 = this.f7339b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // p104h1.AbstractC1618B
    /* JADX INFO: renamed from: f */
    public final boolean mo3995f() {
        return (this.f7496i.isEmpty() && this.f7498k.isEmpty() && this.f7497j.isEmpty() && this.f7495h.isEmpty() && this.f7503p.isEmpty() && this.f7504q.isEmpty() && this.f7502o.isEmpty() && this.f7505r.isEmpty() && this.f7500m.isEmpty() && this.f7499l.isEmpty() && this.f7501n.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m4073g(AbstractC1635T abstractC1635T, int i3, int i4, int i5, int i6) {
        View view = abstractC1635T.f7406a;
        int translationX = i3 + ((int) view.getTranslationX());
        int translationY = i4 + ((int) abstractC1635T.f7406a.getTranslationY());
        m4077l(abstractC1635T);
        int i7 = i5 - translationX;
        int i8 = i6 - translationY;
        if (i7 == 0 && i8 == 0) {
            m3992c(abstractC1635T);
            return false;
        }
        if (i7 != 0) {
            view.setTranslationX(-i7);
        }
        if (i8 != 0) {
            view.setTranslationY(-i8);
        }
        ArrayList arrayList = this.f7497j;
        C1650g c1650g = new C1650g();
        c1650g.f7488a = abstractC1635T;
        c1650g.f7489b = translationX;
        c1650g.f7490c = translationY;
        c1650g.f7491d = i5;
        c1650g.f7492e = i6;
        arrayList.add(c1650g);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m4074i() {
        if (mo3995f()) {
            return;
        }
        ArrayList arrayList = this.f7339b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4075j(ArrayList arrayList, AbstractC1635T abstractC1635T) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1649f c1649f = (C1649f) arrayList.get(size);
            if (m4076k(c1649f, abstractC1635T) && c1649f.f7482a == null && c1649f.f7483b == null) {
                arrayList.remove(c1649f);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m4076k(C1649f c1649f, AbstractC1635T abstractC1635T) {
        if (c1649f.f7483b == abstractC1635T) {
            c1649f.f7483b = null;
        } else {
            if (c1649f.f7482a != abstractC1635T) {
                return false;
            }
            c1649f.f7482a = null;
        }
        abstractC1635T.f7406a.setAlpha(1.0f);
        View view = abstractC1635T.f7406a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        m3992c(abstractC1635T);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final void m4077l(AbstractC1635T abstractC1635T) {
        if (f7493s == null) {
            f7493s = new ValueAnimator().getInterpolator();
        }
        abstractC1635T.f7406a.animate().setInterpolator(f7493s);
        mo3993d(abstractC1635T);
    }
}
