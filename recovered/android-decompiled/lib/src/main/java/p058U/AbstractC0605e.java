package p058U;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: U.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0605e implements InterfaceC0604d {

    /* JADX INFO: renamed from: b */
    public C0602b f2253b;

    /* JADX INFO: renamed from: c */
    public C0602b f2254c;

    /* JADX INFO: renamed from: d */
    public C0602b f2255d;

    /* JADX INFO: renamed from: e */
    public C0602b f2256e;

    /* JADX INFO: renamed from: f */
    public ByteBuffer f2257f;

    /* JADX INFO: renamed from: g */
    public ByteBuffer f2258g;

    /* JADX INFO: renamed from: h */
    public boolean f2259h;

    public AbstractC0605e() {
        ByteBuffer byteBuffer = InterfaceC0604d.f2252a;
        this.f2257f = byteBuffer;
        this.f2258g = byteBuffer;
        C0602b c0602b = C0602b.f2247e;
        this.f2255d = c0602b;
        this.f2256e = c0602b;
        this.f2253b = c0602b;
        this.f2254c = c0602b;
    }

    @Override // p058U.InterfaceC0604d
    /* JADX INFO: renamed from: a */
    public ByteBuffer mo1471a() {
        ByteBuffer byteBuffer = this.f2258g;
        this.f2258g = InterfaceC0604d.f2252a;
        return byteBuffer;
    }

    @Override // p058U.InterfaceC0604d
    /* JADX INFO: renamed from: b */
    public final void mo1472b() {
        flush();
        this.f2257f = InterfaceC0604d.f2252a;
        C0602b c0602b = C0602b.f2247e;
        this.f2255d = c0602b;
        this.f2256e = c0602b;
        this.f2253b = c0602b;
        this.f2254c = c0602b;
        mo1481k();
    }

    @Override // p058U.InterfaceC0604d
    /* JADX INFO: renamed from: c */
    public final void mo1473c() {
        this.f2259h = true;
        mo1480j();
    }

    @Override // p058U.InterfaceC0604d
    /* JADX INFO: renamed from: d */
    public boolean mo1474d() {
        return this.f2259h && this.f2258g == InterfaceC0604d.f2252a;
    }

    @Override // p058U.InterfaceC0604d
    /* JADX INFO: renamed from: e */
    public boolean mo1475e() {
        return this.f2256e != C0602b.f2247e;
    }

    @Override // p058U.InterfaceC0604d
    public final void flush() {
        this.f2258g = InterfaceC0604d.f2252a;
        this.f2259h = false;
        this.f2253b = this.f2255d;
        this.f2254c = this.f2256e;
        mo1479i();
    }

    @Override // p058U.InterfaceC0604d
    /* JADX INFO: renamed from: g */
    public final C0602b mo1477g(C0602b c0602b) {
        this.f2255d = c0602b;
        this.f2256e = mo1478h(c0602b);
        return mo1475e() ? this.f2256e : C0602b.f2247e;
    }

    /* JADX INFO: renamed from: h */
    public abstract C0602b mo1478h(C0602b c0602b);

    /* JADX INFO: renamed from: l */
    public final ByteBuffer m1482l(int i3) {
        if (this.f2257f.capacity() < i3) {
            this.f2257f = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
        } else {
            this.f2257f.clear();
        }
        ByteBuffer byteBuffer = this.f2257f;
        this.f2258g = byteBuffer;
        return byteBuffer;
    }

    /* JADX INFO: renamed from: i */
    public void mo1479i() {
    }

    /* JADX INFO: renamed from: j */
    public void mo1480j() {
    }

    /* JADX INFO: renamed from: k */
    public void mo1481k() {
    }
}
