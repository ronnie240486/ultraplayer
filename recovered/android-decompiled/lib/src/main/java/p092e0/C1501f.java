package p092e0;

import java.util.List;
import java.util.NoSuchElementException;
import p095f0.AbstractC1535h;
import p117l0.InterfaceC1974c;

/* JADX INFO: renamed from: e0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1501f implements InterfaceC1974c {

    /* JADX INFO: renamed from: g */
    public final long f6661g;

    /* JADX INFO: renamed from: h */
    public long f6662h = -1;

    /* JADX INFO: renamed from: i */
    public final List f6663i;

    /* JADX INFO: renamed from: j */
    public final long f6664j;

    public C1501f(long j3, List list) {
        this.f6661g = list.size() - 1;
        this.f6664j = j3;
        this.f6663i = list;
    }

    @Override // p117l0.InterfaceC1974c
    /* JADX INFO: renamed from: g */
    public final long mo3744g() {
        long j3 = this.f6662h;
        if (j3 < 0 || j3 > this.f6661g) {
            throw new NoSuchElementException();
        }
        AbstractC1535h abstractC1535h = (AbstractC1535h) this.f6663i.get((int) j3);
        return this.f6664j + abstractC1535h.f6928k + abstractC1535h.f6926i;
    }

    @Override // p117l0.InterfaceC1974c
    public final boolean next() {
        long j3 = this.f6662h + 1;
        this.f6662h = j3;
        return !(j3 > this.f6661g);
    }

    @Override // p117l0.InterfaceC1974c
    /* JADX INFO: renamed from: o */
    public final long mo3745o() {
        long j3 = this.f6662h;
        if (j3 < 0 || j3 > this.f6661g) {
            throw new NoSuchElementException();
        }
        return this.f6664j + ((AbstractC1535h) this.f6663i.get((int) j3)).f6928k;
    }
}
