package p145s0;

import android.net.Uri;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.C1323r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p019G1.AbstractC0230e;
import p030K0.C0333d;
import p030K0.C0334e;
import p033L0.C0341d;
import p034L1.C0352g;
import p036M0.C0376m;
import p036M0.C0379p;
import p039N0.C0408d;
import p042O0.C0447a;
import p064W.C0656x;
import p071Y0.C0731B;
import p071Y0.C0734E;
import p071Y0.C0738a;
import p071Y0.C0740c;
import p071Y0.C0741d;
import p074Z0.C0777d;
import p078a1.C0851a;
import p082b0.C1063d;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p149t0.C2274a;
import p153u0.C2290b;
import p161x0.C2351a;
import p165y0.C2373b;

/* JADX INFO: renamed from: s0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2238k implements InterfaceC2243p {

    /* JADX INFO: renamed from: e */
    public static final int[] f9633e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* JADX INFO: renamed from: f */
    public static final C1323r f9634f = new C1323r(new C1063d(21));

    /* JADX INFO: renamed from: g */
    public static final C1323r f9635g = new C1323r(new C1063d(22));

    /* JADX INFO: renamed from: a */
    public C1692X f9636a;

    /* JADX INFO: renamed from: d */
    public int f9639d;

    /* JADX INFO: renamed from: c */
    public C0352g f9638c = new C0352g(12);

    /* JADX INFO: renamed from: b */
    public boolean f9637b = true;

    @Override // p145s0.InterfaceC2243p
    /* JADX INFO: renamed from: a */
    public final synchronized InterfaceC2240m[] mo4836a(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = f9633e;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            int iM740r = AbstractC0230e.m740r((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iM740r != -1) {
                m4837b(iM740r, arrayList);
            }
            int iM741s = AbstractC0230e.m741s(uri);
            if (iM741s != -1 && iM741s != iM740r) {
                m4837b(iM741s, arrayList);
            }
            for (int i3 = 0; i3 < 21; i3++) {
                int i4 = iArr[i3];
                if (i4 != iM740r && i4 != iM741s) {
                    m4837b(i4, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (InterfaceC2240m[]) arrayList.toArray(new InterfaceC2240m[arrayList.size()]);
    }

    /* JADX INFO: renamed from: b */
    public final void m4837b(int i3, ArrayList arrayList) {
        switch (i3) {
            case 0:
                arrayList.add(new C0738a());
                break;
            case 1:
                arrayList.add(new C0740c());
                break;
            case 2:
                arrayList.add(new C0741d());
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                arrayList.add(new C2274a());
                break;
            case 4:
                InterfaceC2240m interfaceC2240mM3354A = f9634f.m3354A(0);
                if (interfaceC2240mM3354A == null) {
                    arrayList.add(new C2351a());
                } else {
                    arrayList.add(interfaceC2240mM3354A);
                }
                break;
            case 5:
                arrayList.add(new C2373b());
                break;
            case 6:
                arrayList.add(new C0333d(this.f9638c, this.f9637b ? 0 : 2));
                break;
            case 7:
                arrayList.add(new C0341d());
                break;
            case 8:
                C0352g c0352g = this.f9638c;
                int i4 = this.f9637b ? 0 : 32;
                C1674E c1674e = AbstractC1676G.f7601h;
                arrayList.add(new C0376m(c0352g, i4, null, C1692X.f7629k));
                arrayList.add(new C0379p(this.f9638c, this.f9637b ? 0 : 16));
                break;
            case 9:
                arrayList.add(new C0408d());
                break;
            case 10:
                arrayList.add(new C0731B());
                break;
            case 11:
                if (this.f9636a == null) {
                    C1674E c1674e2 = AbstractC1676G.f7601h;
                    this.f9636a = C1692X.f7629k;
                }
                arrayList.add(new C0734E(1, !this.f9637b ? 1 : 0, this.f9638c, new C0656x(0L), new C0334e(0, this.f9636a)));
                break;
            case 12:
                C0777d c0777d = new C0777d();
                c0777d.f3176c = 0;
                c0777d.f3177d = -1L;
                c0777d.f3179f = -1;
                c0777d.f3180g = -1L;
                arrayList.add(c0777d);
                break;
            case 14:
                arrayList.add(new C0447a(this.f9639d));
                break;
            case 15:
                InterfaceC2240m interfaceC2240mM3354A2 = f9635g.m3354A(new Object[0]);
                if (interfaceC2240mM3354A2 != null) {
                    arrayList.add(interfaceC2240mM3354A2);
                }
                break;
            case 16:
                arrayList.add(new C2290b(!this.f9637b ? 1 : 0, this.f9638c));
                break;
            case 17:
                arrayList.add(new C0447a(0, (byte) 0));
                break;
            case 18:
                arrayList.add(new C0851a(0));
                break;
            case 19:
                arrayList.add(new C0447a(1, (byte) 0));
                break;
            case 20:
                arrayList.add(new C0851a(2));
                break;
            case 21:
                arrayList.add(new C0851a(1));
                break;
        }
    }
}
