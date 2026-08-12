package p095f0;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import p030K0.C0334e;
import p064W.AbstractC0632A;
import p070Y.C0725v;
import p074Z0.C0778e;

/* JADX INFO: renamed from: f0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1529b implements InterfaceC1545r {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1531d f6889g;

    public C1529b(C1531d c1531d) {
        this.f6889g = c1531d;
    }

    @Override // p095f0.InterfaceC1545r
    /* JADX INFO: renamed from: b */
    public final void mo3760b() {
        this.f6889g.f6907k.remove(this);
    }

    @Override // p095f0.InterfaceC1545r
    /* JADX INFO: renamed from: e */
    public final boolean mo3763e(Uri uri, C0334e c0334e, boolean z3) {
        HashMap map;
        C1530c c1530c;
        int i3;
        C1531d c1531d = this.f6889g;
        if (c1531d.f6914r == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C1540m c1540m = c1531d.f6912p;
            int i4 = AbstractC0632A.f2454a;
            List list = c1540m.f6970e;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int size = list.size();
                map = c1531d.f6906j;
                if (i5 >= size) {
                    break;
                }
                C1530c c1530c2 = (C1530c) map.get(((C1539l) list.get(i5)).f6962a);
                if (c1530c2 != null && jElapsedRealtime < c1530c2.f6897n) {
                    i6++;
                }
                i5++;
            }
            int size2 = c1531d.f6912p.f6970e.size();
            c1531d.f6905i.getClass();
            IOException iOException = (IOException) c0334e.f1063h;
            C0778e c0778e = ((iOException instanceof C0725v) && ((i3 = ((C0725v) iOException).f2773j) == 403 || i3 == 404 || i3 == 410 || i3 == 416 || i3 == 500 || i3 == 503) && size2 - i6 > 1) ? new C0778e(2, 60000L) : null;
            if (c0778e != null && c0778e.f3181a == 2 && (c1530c = (C1530c) map.get(uri)) != null) {
                C1530c.m3825a(c1530c, c0778e.f3182b);
            }
        }
        return false;
    }
}
