package p092e0;

import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayList;
import p034L1.C0352g;
import p055T.AbstractC0545H;
import p055T.C0582n;
import p055T.C0583o;

/* JADX INFO: renamed from: e0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1498c {

    /* JADX INFO: renamed from: c */
    public static final int[] f6655c = {8, 13, 11, 2, 0, 1, 7};

    /* JADX INFO: renamed from: a */
    public C0352g f6656a;

    /* JADX INFO: renamed from: b */
    public boolean f6657b;

    /* JADX INFO: renamed from: a */
    public static void m3740a(int i3, ArrayList arrayList) {
        if (AbstractC1303m.m3329v(i3, 0, 7, f6655c) == -1 || arrayList.contains(Integer.valueOf(i3))) {
            return;
        }
        arrayList.add(Integer.valueOf(i3));
    }

    /* JADX INFO: renamed from: b */
    public final C0583o m3741b(C0583o c0583o) {
        if (!this.f6657b || !this.f6656a.mo996y(c0583o)) {
            return c0583o;
        }
        C0582n c0582nM1447a = c0583o.m1447a();
        c0582nM1447a.f2114m = AbstractC0545H.m1364l("application/x-media3-cues");
        c0582nM1447a.f2098H = this.f6656a.mo978g(c0583o);
        StringBuilder sb = new StringBuilder();
        sb.append(c0583o.f2154n);
        String str = c0583o.f2151k;
        sb.append(str != null ? " ".concat(str) : "");
        c0582nM1447a.f2111j = sb.toString();
        c0582nM1447a.f2119r = Long.MAX_VALUE;
        return new C0583o(c0582nM1447a);
    }
}
