package p028J1;

import android.util.Log;
import java.util.Iterator;
import p019G1.AbstractC0232g;
import p019G1.C0233h;
import p034L1.C0352g;

/* JADX INFO: renamed from: J1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0305k implements InterfaceC0308n {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f800g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC0308n f801h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0307m f802i;

    public /* synthetic */ C0305k(C0307m c0307m, InterfaceC0308n interfaceC0308n, int i3) {
        this.f800g = i3;
        this.f802i = c0307m;
        this.f801h = interfaceC0308n;
    }

    @Override // p028J1.InterfaceC0308n
    /* JADX INFO: renamed from: b */
    public final void mo154b(String str, long j3, int i3, C0352g c0352g, long j4, long j5) {
        int i4;
        C0307m c0307m = this.f802i;
        switch (this.f800g) {
            case 0:
                c0307m.f806g = null;
                InterfaceC0308n interfaceC0308n = this.f801h;
                if (interfaceC0308n != null) {
                    interfaceC0308n.mo154b(str, j3, i3, c0352g, j4, j5);
                }
                break;
            default:
                if (this.f801h != null) {
                    if (i3 == 2001) {
                        Object[] objArr = {Integer.valueOf(c0307m.f808i)};
                        C0296b c0296b = c0307m.f832a;
                        Log.w(c0296b.f788a, c0296b.m833d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                        Iterator it = ((C0233h) c0307m.f807h.f38h).f610i.iterator();
                        while (it.hasNext()) {
                            ((AbstractC0232g) it.next()).mo662v();
                        }
                        i4 = 2001;
                    } else {
                        i4 = i3;
                    }
                    this.f801h.mo154b(str, j3, i4, c0352g, j4, j5);
                }
                break;
        }
    }

    @Override // p028J1.InterfaceC0308n
    /* JADX INFO: renamed from: l */
    public final void mo164l(String str, long j3, long j4, long j5) {
        switch (this.f800g) {
            case 0:
                InterfaceC0308n interfaceC0308n = this.f801h;
                if (interfaceC0308n != null) {
                    interfaceC0308n.mo164l(str, j3, j4, j5);
                }
                break;
            default:
                InterfaceC0308n interfaceC0308n2 = this.f801h;
                if (interfaceC0308n2 != null) {
                    interfaceC0308n2.mo164l(str, j3, j4, j5);
                }
                break;
        }
    }
}
