package p095f0;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p036M0.C0380q;
import p055T.AbstractC0545H;
import p055T.C0546I;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p070Y.C0712i;
import p070Y.C0722s;
import p074Z0.C0778e;
import p082b0.C1063d;
import p089d1.C1447t;
import p092e0.C1507l;
import p114k0.C1958r;
import p129o0.C2073m;
import p129o0.C2074n;
import p129o0.C2076p;
import p129o0.InterfaceC2069i;
import p129o0.InterfaceC2071k;

/* JADX INFO: renamed from: f0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1531d implements InterfaceC2069i {

    /* JADX INFO: renamed from: u */
    public static final C1063d f6902u = new C1063d(11);

    /* JADX INFO: renamed from: g */
    public final C1447t f6903g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC1544q f6904h;

    /* JADX INFO: renamed from: i */
    public final C1528a f6905i;

    /* JADX INFO: renamed from: l */
    public C0380q f6908l;

    /* JADX INFO: renamed from: m */
    public C2074n f6909m;

    /* JADX INFO: renamed from: n */
    public Handler f6910n;

    /* JADX INFO: renamed from: o */
    public C1507l f6911o;

    /* JADX INFO: renamed from: p */
    public C1540m f6912p;

    /* JADX INFO: renamed from: q */
    public Uri f6913q;

    /* JADX INFO: renamed from: r */
    public C1537j f6914r;

    /* JADX INFO: renamed from: s */
    public boolean f6915s;

    /* JADX INFO: renamed from: k */
    public final CopyOnWriteArrayList f6907k = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j */
    public final HashMap f6906j = new HashMap();

    /* JADX INFO: renamed from: t */
    public long f6916t = -9223372036854775807L;

    public C1531d(C1447t c1447t, C1528a c1528a, InterfaceC1544q interfaceC1544q) {
        this.f6903g = c1447t;
        this.f6904h = interfaceC1544q;
        this.f6905i = c1528a;
    }

    /* JADX INFO: renamed from: a */
    public final C1537j m3831a(Uri uri, boolean z3) {
        HashMap map = this.f6906j;
        C1537j c1537j = ((C1530c) map.get(uri)).f6893j;
        if (c1537j != null && z3) {
            if (!uri.equals(this.f6913q)) {
                List list = this.f6912p.f6970e;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    if (uri.equals(((C1539l) list.get(i3)).f6962a)) {
                        C1537j c1537j2 = this.f6914r;
                        if (c1537j2 != null && c1537j2.f6951o) {
                            break;
                        }
                        this.f6913q = uri;
                        C1530c c1530c = (C1530c) map.get(uri);
                        C1537j c1537j3 = c1530c.f6893j;
                        if (c1537j3 != null && c1537j3.f6951o) {
                            this.f6914r = c1537j3;
                            this.f6911o.m3783t(c1537j3);
                            break;
                        }
                        c1530c.m3829e(m3832b(uri));
                        break;
                    }
                }
            }
            C1530c c1530c2 = (C1530c) map.get(uri);
            C1537j c1537j4 = c1530c2.f6893j;
            if (!c1530c2.f6900q) {
                c1530c2.f6900q = true;
                if (c1537j4 != null && !c1537j4.f6951o) {
                    c1530c2.m3827c(true);
                }
            }
        }
        return c1537j;
    }

    /* JADX INFO: renamed from: b */
    public final Uri m3832b(Uri uri) {
        C1533f c1533f;
        C1537j c1537j = this.f6914r;
        if (c1537j == null || !c1537j.f6958v.f6939e || (c1533f = (C1533f) c1537j.f6956t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c1533f.f6920b));
        int i3 = c1533f.f6921c;
        if (i3 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i3));
        }
        return builderBuildUpon.build();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3833c(Uri uri) {
        int i3;
        C1530c c1530c = (C1530c) this.f6906j.get(uri);
        if (c1530c.f6893j == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, AbstractC0632A.m1581V(c1530c.f6893j.f6957u));
        C1537j c1537j = c1530c.f6893j;
        return c1537j.f6951o || (i3 = c1537j.f6940d) == 2 || i3 == 1 || c1530c.f6894k + jMax > jElapsedRealtime;
    }

    @Override // p129o0.InterfaceC2069i
    /* JADX INFO: renamed from: k */
    public final C0778e mo3803k(InterfaceC2071k interfaceC2071k, long j3, long j4, IOException iOException, int i3) {
        long jMin;
        C2076p c2076p = (C2076p) interfaceC2071k;
        long j5 = c2076p.f9012a;
        Uri uri = c2076p.f9015d.f2785i;
        C1958r c1958r = new C1958r(j4);
        this.f6905i.getClass();
        if (!(iOException instanceof C0546I) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof C0722s) && !(iOException instanceof C2073m)) {
            int i4 = C0712i.f2720h;
            Throwable cause = iOException;
            while (true) {
                if (cause == null) {
                    jMin = Math.min((i3 - 1) * 1000, 5000);
                    break;
                }
                if ((cause instanceof C0712i) && ((C0712i) cause).f2721g == 2008) {
                    jMin = -9223372036854775807L;
                    break;
                }
                cause = cause.getCause();
            }
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        boolean z3 = jMin == -9223372036854775807L;
        long j6 = jMin;
        this.f6908l.m1049k(c1958r, c2076p.f9014c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z3);
        return z3 ? C2074n.f9008f : new C0778e(0, j6, false);
    }

    @Override // p129o0.InterfaceC2069i
    /* JADX INFO: renamed from: m */
    public final void mo3804m(InterfaceC2071k interfaceC2071k, long j3, long j4, boolean z3) {
        C2076p c2076p = (C2076p) interfaceC2071k;
        long j5 = c2076p.f9012a;
        Uri uri = c2076p.f9015d.f2785i;
        C1958r c1958r = new C1958r(j4);
        this.f6905i.getClass();
        this.f6908l.m1047h(c1958r, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // p129o0.InterfaceC2069i
    /* JADX INFO: renamed from: t */
    public final void mo3805t(InterfaceC2071k interfaceC2071k, long j3, long j4) {
        C1540m c1540m;
        C2076p c2076p = (C2076p) interfaceC2071k;
        AbstractC1541n abstractC1541n = (AbstractC1541n) c2076p.f9017f;
        boolean z3 = abstractC1541n instanceof C1537j;
        if (z3) {
            String str = abstractC1541n.f6977a;
            C1540m c1540m2 = C1540m.f6968l;
            Uri uri = Uri.parse(str);
            C0582n c0582n = new C0582n();
            c0582n.f2102a = "0";
            c0582n.f2113l = AbstractC0545H.m1364l("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new C1539l(uri, new C0583o(c0582n), null, null, null, null));
            List list = Collections.EMPTY_LIST;
            c1540m = new C1540m("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            c1540m = (C1540m) abstractC1541n;
        }
        this.f6912p = c1540m;
        this.f6913q = ((C1539l) c1540m.f6970e.get(0)).f6962a;
        this.f6907k.add(new C1529b(this));
        List list2 = c1540m.f6969d;
        int size = list2.size();
        for (int i3 = 0; i3 < size; i3++) {
            Uri uri2 = (Uri) list2.get(i3);
            this.f6906j.put(uri2, new C1530c(this, uri2));
        }
        Uri uri3 = c2076p.f9015d.f2785i;
        C1958r c1958r = new C1958r(j4);
        C1530c c1530c = (C1530c) this.f6906j.get(this.f6913q);
        if (z3) {
            c1530c.m3830f((C1537j) abstractC1541n, c1958r);
        } else {
            c1530c.m3827c(false);
        }
        this.f6905i.getClass();
        this.f6908l.m1048i(c1958r, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
