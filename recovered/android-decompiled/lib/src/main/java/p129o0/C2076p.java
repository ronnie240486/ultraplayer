package p129o0;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p070Y.C0713j;
import p070Y.C0715l;
import p070Y.C0729z;
import p070Y.InterfaceC0711h;
import p114k0.C1958r;

/* JADX INFO: renamed from: o0.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2076p implements InterfaceC2071k {

    /* JADX INFO: renamed from: a */
    public final long f9012a;

    /* JADX INFO: renamed from: b */
    public final C0715l f9013b;

    /* JADX INFO: renamed from: c */
    public final int f9014c;

    /* JADX INFO: renamed from: d */
    public final C0729z f9015d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2075o f9016e;

    /* JADX INFO: renamed from: f */
    public volatile Object f9017f;

    public C2076p(InterfaceC0711h interfaceC0711h, Uri uri, InterfaceC2075o interfaceC2075o) {
        Map map = Collections.EMPTY_MAP;
        AbstractC0646n.m1632j(uri, "The uri must be set.");
        C0715l c0715l = new C0715l(uri, 1, null, map, 0L, -1L, 1);
        this.f9015d = new C0729z(interfaceC0711h);
        this.f9013b = c0715l;
        this.f9014c = 4;
        this.f9016e = interfaceC2075o;
        this.f9012a = C1958r.f8563b.getAndIncrement();
    }

    @Override // p129o0.InterfaceC2071k
    /* JADX INFO: renamed from: a */
    public final void mo3742a() {
        this.f9015d.f2784h = 0L;
        C0713j c0713j = new C0713j(this.f9015d, this.f9013b);
        try {
            c0713j.m1835a();
            Uri uriMo1828h = this.f9015d.f2783g.mo1828h();
            uriMo1828h.getClass();
            this.f9017f = this.f9016e.mo3378l(uriMo1828h, c0713j);
        } finally {
            AbstractC0632A.m1588g(c0713j);
        }
    }

    @Override // p129o0.InterfaceC2071k
    /* JADX INFO: renamed from: b */
    public final void mo3743b() {
    }
}
