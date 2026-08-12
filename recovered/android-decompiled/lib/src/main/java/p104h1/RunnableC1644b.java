package p104h1;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* JADX INFO: renamed from: h1.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1644b implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7459g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ArrayList f7460h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1651h f7461i;

    public /* synthetic */ RunnableC1644b(C1651h c1651h, ArrayList arrayList, int i3) {
        this.f7459g = i3;
        this.f7461i = c1651h;
        this.f7460h = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7459g) {
            case 0:
                ArrayList arrayList = this.f7460h;
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    C1651h c1651h = this.f7461i;
                    if (i3 >= size) {
                        arrayList.clear();
                        c1651h.f7500m.remove(arrayList);
                    } else {
                        Object obj = arrayList.get(i3);
                        i3++;
                        C1650g c1650g = (C1650g) obj;
                        AbstractC1635T abstractC1635T = c1650g.f7488a;
                        c1651h.getClass();
                        View view = abstractC1635T.f7406a;
                        int i4 = c1650g.f7491d - c1650g.f7489b;
                        int i5 = c1650g.f7492e - c1650g.f7490c;
                        if (i4 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i5 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c1651h.f7503p.add(abstractC1635T);
                        viewPropertyAnimatorAnimate.setDuration(c1651h.f7342e).setListener(new C1647d(c1651h, abstractC1635T, i4, view, i5, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.f7460h;
                int size2 = arrayList2.size();
                int i6 = 0;
                while (true) {
                    C1651h c1651h2 = this.f7461i;
                    if (i6 >= size2) {
                        arrayList2.clear();
                        c1651h2.f7501n.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i6);
                        i6++;
                        C1649f c1649f = (C1649f) obj2;
                        c1651h2.getClass();
                        AbstractC1635T abstractC1635T2 = c1649f.f7482a;
                        View view2 = abstractC1635T2 == null ? null : abstractC1635T2.f7406a;
                        AbstractC1635T abstractC1635T3 = c1649f.f7483b;
                        View view3 = abstractC1635T3 != null ? abstractC1635T3.f7406a : null;
                        ArrayList arrayList3 = c1651h2.f7505r;
                        long j3 = c1651h2.f7343f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j3);
                            arrayList3.add(c1649f.f7482a);
                            duration.translationX(c1649f.f7486e - c1649f.f7484c);
                            duration.translationY(c1649f.f7487f - c1649f.f7485d);
                            duration.alpha(0.0f).setListener(new C1648e(c1651h2, c1649f, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c1649f.f7483b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j3).alpha(1.0f).setListener(new C1648e(c1651h2, c1649f, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.f7460h;
                int size3 = arrayList4.size();
                int i7 = 0;
                while (true) {
                    C1651h c1651h3 = this.f7461i;
                    if (i7 >= size3) {
                        arrayList4.clear();
                        c1651h3.f7499l.remove(arrayList4);
                    } else {
                        Object obj3 = arrayList4.get(i7);
                        i7++;
                        AbstractC1635T abstractC1635T4 = (AbstractC1635T) obj3;
                        c1651h3.getClass();
                        View view4 = abstractC1635T4.f7406a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c1651h3.f7502o.add(abstractC1635T4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c1651h3.f7340c).setListener(new C1646c(c1651h3, abstractC1635T4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
