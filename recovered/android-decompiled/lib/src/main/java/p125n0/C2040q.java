package p125n0;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.zuxoplayer.app.PlayerActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import p048Q0.C0505d;
import p055T.C0559W;
import p055T.C0560X;
import p055T.C0567c;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p067X.C0687s;
import p077a0.C0797H;
import p095f0.C1528a;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1691W;
import p105h2.C1692X;
import p105h2.C1728v;
import p114k0.C1945g0;

/* JADX INFO: renamed from: n0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2040q extends AbstractC2044u {

    /* JADX INFO: renamed from: j */
    public static final AbstractC1691W f8900j = new C1728v(new C0505d(6));

    /* JADX INFO: renamed from: c */
    public final Object f8901c;

    /* JADX INFO: renamed from: d */
    public final Context f8902d;

    /* JADX INFO: renamed from: e */
    public final C1528a f8903e;

    /* JADX INFO: renamed from: f */
    public final boolean f8904f;

    /* JADX INFO: renamed from: g */
    public C2033j f8905g;

    /* JADX INFO: renamed from: h */
    public final C2035l f8906h;

    /* JADX INFO: renamed from: i */
    public C0567c f8907i;

    public C2040q(PlayerActivity playerActivity) {
        C1528a c1528a = new C1528a(11);
        int i3 = C2033j.f8857C;
        C2033j c2033j = new C2033j(new C2032i(playerActivity));
        this.f8901c = new Object();
        this.f8902d = playerActivity.getApplicationContext();
        this.f8903e = c1528a;
        this.f8905g = c2033j;
        this.f8907i = C0567c.f2052b;
        boolean zM1570K = AbstractC0632A.m1570K(playerActivity);
        this.f8904f = zM1570K;
        if (!zM1570K && AbstractC0632A.f2454a >= 32) {
            AudioManager audioManager = (AudioManager) playerActivity.getSystemService("audio");
            this.f8906h = audioManager == null ? null : new C2035l(audioManager.getSpatializer());
        }
        boolean z3 = this.f8905g.f8864x;
    }

    /* JADX INFO: renamed from: c */
    public static void m4608c(C1945g0 c1945g0, C2033j c2033j, HashMap map) {
        for (int i3 = 0; i3 < c1945g0.f8526a; i3++) {
            C0560X c0560x = (C0560X) c2033j.f2041q.get(c1945g0.m4499a(i3));
            if (c0560x != null) {
                C0559W c0559w = c0560x.f1997a;
                C0560X c0560x2 = (C0560X) map.get(Integer.valueOf(c0559w.f1994c));
                if (c0560x2 == null || (c0560x2.f1998b.isEmpty() && !c0560x.f1998b.isEmpty())) {
                    map.put(Integer.valueOf(c0559w.f1994c), c0560x);
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m4609d(C0583o c0583o, String str, boolean z3) {
        if (!TextUtils.isEmpty(str) && str.equals(c0583o.f2144d)) {
            return 4;
        }
        String strM4610g = m4610g(str);
        String strM4610g2 = m4610g(c0583o.f2144d);
        if (strM4610g2 == null || strM4610g == null) {
            return (z3 && strM4610g2 == null) ? 1 : 0;
        }
        if (strM4610g2.startsWith(strM4610g) || strM4610g.startsWith(strM4610g2)) {
            return 3;
        }
        int i3 = AbstractC0632A.f2454a;
        return strM4610g2.split("-", 2)[0].equals(strM4610g.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX INFO: renamed from: g */
    public static String m4610g(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: renamed from: i */
    public static Pair m4611i(int i3, C0687s c0687s, int[][][] iArr, InterfaceC2037n interfaceC2037n, Comparator comparator) {
        RandomAccess randomAccessM4120r;
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < c0687s.f2635a; i4++) {
            if (i3 == ((int[]) c0687s.f2636b)[i4]) {
                C1945g0 c1945g0 = ((C1945g0[]) c0687s.f2637c)[i4];
                for (int i5 = 0; i5 < c1945g0.f8526a; i5++) {
                    C0559W c0559wM4499a = c1945g0.m4499a(i5);
                    C1692X c1692xMo549f = interfaceC2037n.mo549f(i4, c0559wM4499a, iArr[i4][i5]);
                    int i6 = c0559wM4499a.f1992a;
                    boolean[] zArr = new boolean[i6];
                    for (int i7 = 0; i7 < i6; i7++) {
                        AbstractC2038o abstractC2038o = (AbstractC2038o) c1692xMo549f.get(i7);
                        int iMo4600a = abstractC2038o.mo4600a();
                        if (!zArr[i7] && iMo4600a != 0) {
                            if (iMo4600a == 1) {
                                randomAccessM4120r = AbstractC1676G.m4120r(abstractC2038o);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC2038o);
                                for (int i8 = i7 + 1; i8 < i6; i8++) {
                                    AbstractC2038o abstractC2038o2 = (AbstractC2038o) c1692xMo549f.get(i8);
                                    if (abstractC2038o2.mo4600a() == 2 && abstractC2038o.mo4601b(abstractC2038o2)) {
                                        arrayList2.add(abstractC2038o2);
                                        zArr[i8] = true;
                                    }
                                }
                                randomAccessM4120r = arrayList2;
                            }
                            arrayList.add(randomAccessM4120r);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((AbstractC2038o) list.get(i9)).f8883i;
        }
        AbstractC2038o abstractC2038o3 = (AbstractC2038o) list.get(0);
        return Pair.create(new C2041r(abstractC2038o3.f8882h, iArr2), Integer.valueOf(abstractC2038o3.f8881g));
    }

    @Override // p125n0.AbstractC2044u
    /* JADX INFO: renamed from: a */
    public final void mo4612a() {
        C2035l c2035l;
        C2034k c2034k;
        synchronized (this.f8901c) {
            try {
                if (AbstractC0632A.f2454a >= 32 && (c2035l = this.f8906h) != null && (c2034k = (C2034k) c2035l.f8871d) != null && ((Handler) c2035l.f8870c) != null) {
                    ((Spatializer) c2035l.f8869b).removeOnSpatializerStateChangedListener(c2034k);
                    ((Handler) c2035l.f8870c).removeCallbacksAndMessages(null);
                    c2035l.f8870c = null;
                    c2035l.f8871d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8910a = null;
        this.f8911b = null;
    }

    @Override // p125n0.AbstractC2044u
    /* JADX INFO: renamed from: b */
    public final void mo4613b(C0567c c0567c) {
        boolean zEquals;
        synchronized (this.f8901c) {
            zEquals = this.f8907i.equals(c0567c);
            this.f8907i = c0567c;
        }
        if (zEquals) {
            return;
        }
        m4615f();
    }

    /* JADX INFO: renamed from: e */
    public final C2033j m4614e() {
        C2033j c2033j;
        synchronized (this.f8901c) {
            c2033j = this.f8905g;
        }
        return c2033j;
    }

    /* JADX INFO: renamed from: f */
    public final void m4615f() {
        boolean z3;
        C0797H c0797h;
        C2035l c2035l;
        synchronized (this.f8901c) {
            try {
                z3 = this.f8905g.f8864x && !this.f8904f && AbstractC0632A.f2454a >= 32 && (c2035l = this.f8906h) != null && c2035l.f8868a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z3 || (c0797h = this.f8910a) == null) {
            return;
        }
        c0797h.f3317o.m1700e(10);
    }

    /* JADX INFO: renamed from: h */
    public final void m4616h() {
        synchronized (this.f8901c) {
            this.f8905g.getClass();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m4617j(C2033j c2033j) {
        boolean zEquals;
        c2033j.getClass();
        synchronized (this.f8901c) {
            zEquals = this.f8905g.equals(c2033j);
            this.f8905g = c2033j;
        }
        if (zEquals) {
            return;
        }
        if (c2033j.f8864x && this.f8902d == null) {
            AbstractC0646n.m1647y("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        C0797H c0797h = this.f8910a;
        if (c0797h != null) {
            c0797h.f3317o.m1700e(10);
        }
    }
}
