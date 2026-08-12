package p106i;

import p060U1.AbstractC0610a;
import p113k.C1854d1;

/* JADX INFO: renamed from: i.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1741i extends AbstractC0610a {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f7780n;

    /* JADX INFO: renamed from: o */
    public boolean f7781o;

    /* JADX INFO: renamed from: p */
    public int f7782p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f7783q;

    public C1741i(C1742j c1742j) {
        this.f7780n = 0;
        this.f7783q = c1742j;
        this.f7781o = false;
        this.f7782p = 0;
    }

    @Override // p000A.InterfaceC0028b0
    /* JADX INFO: renamed from: a */
    public final void mo118a() {
        switch (this.f7780n) {
            case 0:
                int i3 = this.f7782p + 1;
                this.f7782p = i3;
                C1742j c1742j = (C1742j) this.f7783q;
                if (i3 == c1742j.f7784a.size()) {
                    AbstractC0610a abstractC0610a = c1742j.f7787d;
                    if (abstractC0610a != null) {
                        abstractC0610a.mo118a();
                    }
                    this.f7782p = 0;
                    this.f7781o = false;
                    c1742j.f7788e = false;
                }
                break;
            default:
                if (!this.f7781o) {
                    ((C1854d1) this.f7783q).f8135a.setVisibility(this.f7782p);
                }
                break;
        }
    }

    @Override // p060U1.AbstractC0610a, p000A.InterfaceC0028b0
    /* JADX INFO: renamed from: b */
    public void mo119b() {
        switch (this.f7780n) {
            case 1:
                this.f7781o = true;
                break;
        }
    }

    @Override // p060U1.AbstractC0610a, p000A.InterfaceC0028b0
    /* JADX INFO: renamed from: c */
    public final void mo120c() {
        switch (this.f7780n) {
            case 0:
                if (!this.f7781o) {
                    this.f7781o = true;
                    AbstractC0610a abstractC0610a = ((C1742j) this.f7783q).f7787d;
                    if (abstractC0610a != null) {
                        abstractC0610a.mo120c();
                    }
                    break;
                }
                break;
            default:
                ((C1854d1) this.f7783q).f8135a.setVisibility(0);
                break;
        }
    }

    public C1741i(C1854d1 c1854d1, int i3) {
        this.f7780n = 1;
        this.f7783q = c1854d1;
        this.f7782p = i3;
        this.f7781o = false;
    }
}
