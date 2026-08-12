package p014F;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractC0937C;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0959j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.C1351y;
import com.zuxoplayer.app.C1366f;
import com.zuxoplayer.app.MainActivity;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p000A.AbstractC0016Q;
import p000A.C0031d;
import p022H1.C0267k;
import p028J1.C0309o;
import p030K0.C0334e;
import p034L1.C0346a;
import p037M1.InterfaceC0390c;
import p040N1.AbstractDialogInterfaceOnCancelListenerC0432m;
import p040N1.BinderC0416A;
import p040N1.C0435p;
import p089d1.C1427a0;
import p089d1.C1447t;
import p098g.C1568e;
import p104h1.AbstractC1618B;
import p104h1.AbstractC1635T;
import p104h1.C1646c;
import p104h1.C1649f;
import p104h1.C1650g;
import p104h1.C1651h;
import p104h1.C1655l;
import p104h1.RunnableC1644b;
import p113k.C1873k;
import p113k.C1890r0;

/* JADX INFO: renamed from: F.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0153b implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f369g;

    /* JADX INFO: renamed from: h */
    public final Object f370h;

    public /* synthetic */ RunnableC0153b(int i3, Object obj) {
        this.f369g = i3;
        this.f370h = obj;
    }

    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, o0.l] */
    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        C1873k c1873k;
        switch (this.f369g) {
            case 0:
                ViewOnTouchListenerC0159h viewOnTouchListenerC0159h = (ViewOnTouchListenerC0159h) this.f370h;
                if (viewOnTouchListenerC0159h.f386u) {
                    boolean z3 = viewOnTouchListenerC0159h.f384s;
                    C0152a c0152a = viewOnTouchListenerC0159h.f372g;
                    if (z3) {
                        viewOnTouchListenerC0159h.f384s = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c0152a.f364e = jCurrentAnimationTimeMillis;
                        c0152a.f366g = -1L;
                        c0152a.f365f = jCurrentAnimationTimeMillis;
                        c0152a.f367h = 0.5f;
                    }
                    if ((c0152a.f366g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0152a.f366g + ((long) c0152a.f368i)) || !viewOnTouchListenerC0159h.m626e()) {
                        viewOnTouchListenerC0159h.f386u = false;
                        return;
                    }
                    boolean z4 = viewOnTouchListenerC0159h.f385t;
                    ListView listView = viewOnTouchListenerC0159h.f374i;
                    if (z4) {
                        viewOnTouchListenerC0159h.f385t = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (c0152a.f365f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fM608a = c0152a.m608a(jCurrentAnimationTimeMillis2);
                    long j3 = jCurrentAnimationTimeMillis2 - c0152a.f365f;
                    c0152a.f365f = jCurrentAnimationTimeMillis2;
                    viewOnTouchListenerC0159h.f388w.scrollListBy((int) (j3 * ((fM608a * 4.0f) + ((-4.0f) * fM608a * fM608a)) * c0152a.f363d));
                    WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 1:
                ((C0267k) this.f370h).m810g(false);
                return;
            case 2:
                C0309o c0309o = (C0309o) this.f370h;
                synchronized (C0309o.f823i) {
                    try {
                        if (c0309o.m852d()) {
                            c0309o.m854f(15);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                ((C0435p) this.f370h).m1139f();
                return;
            case 4:
                InterfaceC0390c interfaceC0390c = ((C0435p) ((C0031d) this.f370h).f38h).f1469c;
                interfaceC0390c.mo1074j(interfaceC0390c.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 5:
                ((BinderC0416A) this.f370h).f1424i.m1151c(new C0346a(4));
                return;
            case 6:
                throw null;
            case 7:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e3) {
                    if (!TextUtils.equals(e3.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e3;
                    }
                    return;
                }
            case 8:
                DialogInterfaceOnCancelListenerC0959j dialogInterfaceOnCancelListenerC0959j = (DialogInterfaceOnCancelListenerC0959j) this.f370h;
                dialogInterfaceOnCancelListenerC0959j.f4179Y.onDismiss(dialogInterfaceOnCancelListenerC0959j.f4187g0);
                return;
            case 9:
                ((AbstractC0937C) this.f370h).m2480x(true);
                return;
            case 10:
                MainActivity mainActivity = (MainActivity) ((C1351y) this.f370h).f5992b;
                if (mainActivity.f6009h) {
                    mainActivity.f6009h = false;
                    mainActivity.f6008g.loadUrl("file:///android_asset/webui/index.html");
                    return;
                }
                return;
            case 11:
                C1366f c1366f = (C1366f) this.f370h;
                if (c1366f.f6080j) {
                    c1366f.f6079i = (c1366f.f6079i + 9.0f) % 360.0f;
                    c1366f.invalidate();
                    c1366f.postOnAnimation(this);
                    return;
                }
                return;
            case 12:
                ((C1427a0) this.f370h).m3569c();
                return;
            case 13:
                C1568e c1568e = (C1568e) this.f370h;
                c1568e.m3901a(true);
                c1568e.invalidateSelf();
                return;
            case 14:
                C1655l c1655l = (C1655l) this.f370h;
                int i4 = c1655l.f7512A;
                ValueAnimator valueAnimator = c1655l.f7539z;
                if (i4 != 1) {
                    i3 = 2;
                    if (i4 != 2) {
                        return;
                    }
                } else {
                    i3 = 2;
                    valueAnimator.cancel();
                }
                c1655l.f7512A = 3;
                float[] fArr = new float[i3];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 15:
                RecyclerView recyclerView = (RecyclerView) this.f370h;
                AbstractC1618B abstractC1618B = recyclerView.f4730P;
                if (abstractC1618B != null) {
                    C1651h c1651h = (C1651h) abstractC1618B;
                    ArrayList arrayList = c1651h.f7495h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c1651h.f7497j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c1651h.f7498k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c1651h.f7496i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                        int size = arrayList.size();
                        int i5 = 0;
                        while (true) {
                            long j4 = c1651h.f7341d;
                            if (i5 < size) {
                                AbstractC1635T abstractC1635T = (AbstractC1635T) arrayList.get(i5);
                                View view = abstractC1635T.f7406a;
                                int i6 = size;
                                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                                c1651h.f7504q.add(abstractC1635T);
                                viewPropertyAnimatorAnimate.setDuration(j4).alpha(0.0f).setListener(new C1646c(c1651h, abstractC1635T, viewPropertyAnimatorAnimate, view)).start();
                                size = i6;
                                i5++;
                            } else {
                                arrayList.clear();
                                if (!zIsEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c1651h.f7500m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC1644b runnableC1644b = new RunnableC1644b(c1651h, arrayList5, 0);
                                    if (zIsEmpty) {
                                        runnableC1644b.run();
                                    } else {
                                        View view2 = ((C1650g) arrayList5.get(0)).f7488a.f7406a;
                                        WeakHashMap weakHashMap2 = AbstractC0016Q.f14a;
                                        view2.postOnAnimationDelayed(runnableC1644b, j4);
                                    }
                                }
                                if (!zIsEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c1651h.f7501n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC1644b runnableC1644b2 = new RunnableC1644b(c1651h, arrayList6, 1);
                                    if (zIsEmpty) {
                                        runnableC1644b2.run();
                                    } else {
                                        View view3 = ((C1649f) arrayList6.get(0)).f7482a.f7406a;
                                        WeakHashMap weakHashMap3 = AbstractC0016Q.f14a;
                                        view3.postOnAnimationDelayed(runnableC1644b2, j4);
                                    }
                                }
                                if (!zIsEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c1651h.f7499l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC1644b runnableC1644b3 = new RunnableC1644b(c1651h, arrayList7, 2);
                                    if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
                                        runnableC1644b3.run();
                                    } else {
                                        if (zIsEmpty) {
                                            j4 = 0;
                                        }
                                        long jMax = Math.max(!zIsEmpty2 ? c1651h.f7342e : 0L, !zIsEmpty3 ? c1651h.f7343f : 0L) + j4;
                                        View view4 = ((AbstractC1635T) arrayList7.get(0)).f7406a;
                                        WeakHashMap weakHashMap4 = AbstractC0016Q.f14a;
                                        view4.postOnAnimationDelayed(runnableC1644b3, jMax);
                                    }
                                }
                            }
                        }
                    }
                }
                recyclerView.f4763p0 = false;
                return;
            case 16:
                ((StaggeredGridLayoutManager) this.f370h).m2820t0();
                return;
            case 17:
                C1890r0 c1890r0 = (C1890r0) this.f370h;
                c1890r0.f8261r = null;
                c1890r0.drawableStateChanged();
                return;
            case 18:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f370h;
                if (searchView$SearchAutoComplete.f3896l) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f3896l = false;
                    return;
                }
                return;
            case 19:
                ActionMenuView actionMenuView = ((Toolbar) this.f370h).f3921g;
                if (actionMenuView == null || (c1873k = actionMenuView.f3882z) == null) {
                    return;
                }
                c1873k.m4394l();
                return;
            case 20:
                this.f370h.mo3801e();
                return;
            case 21:
                try {
                    ((Runnable) this.f370h).run();
                    return;
                } catch (Exception e4) {
                    Log.e("TransportRuntime.".concat("Executor"), "Background execution failure.", e4);
                    return;
                }
            default:
                Object obj = ((C1447t) this.f370h).f6406h;
                return;
        }
    }

    public RunnableC0153b(AbstractDialogInterfaceOnCancelListenerC0432m abstractDialogInterfaceOnCancelListenerC0432m, C0334e c0334e) {
        this.f369g = 6;
        this.f370h = c0334e;
    }

    public RunnableC0153b(C1447t c1447t, int i3) {
        this.f369g = 22;
        this.f370h = c1447t;
    }
}
