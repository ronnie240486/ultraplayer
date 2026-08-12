package p058U;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import p064W.AbstractC0646n;
import p105h2.C1692X;

/* JADX INFO: renamed from: U.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0601a {

    /* JADX INFO: renamed from: a */
    public final C1692X f2243a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f2244b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public ByteBuffer[] f2245c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d */
    public boolean f2246d;

    public C0601a(C1692X c1692x) {
        this.f2243a = c1692x;
        C0602b c0602b = C0602b.f2247e;
        this.f2246d = false;
    }

    /* JADX INFO: renamed from: a */
    public final C0602b m1465a(C0602b c0602b) throws C0603c {
        if (c0602b.equals(C0602b.f2247e)) {
            throw new C0603c(c0602b);
        }
        int i3 = 0;
        while (true) {
            C1692X c1692x = this.f2243a;
            if (i3 >= c1692x.f7631j) {
                return c0602b;
            }
            InterfaceC0604d interfaceC0604d = (InterfaceC0604d) c1692x.get(i3);
            C0602b c0602bMo1477g = interfaceC0604d.mo1477g(c0602b);
            if (interfaceC0604d.mo1475e()) {
                AbstractC0646n.m1630h(!c0602bMo1477g.equals(C0602b.f2247e));
                c0602b = c0602bMo1477g;
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1466b() {
        ArrayList arrayList = this.f2244b;
        arrayList.clear();
        this.f2246d = false;
        int i3 = 0;
        while (true) {
            C1692X c1692x = this.f2243a;
            if (i3 >= c1692x.f7631j) {
                break;
            }
            InterfaceC0604d interfaceC0604d = (InterfaceC0604d) c1692x.get(i3);
            interfaceC0604d.flush();
            if (interfaceC0604d.mo1475e()) {
                arrayList.add(interfaceC0604d);
            }
            i3++;
        }
        this.f2245c = new ByteBuffer[arrayList.size()];
        for (int i4 = 0; i4 <= m1467c(); i4++) {
            this.f2245c[i4] = ((InterfaceC0604d) arrayList.get(i4)).mo1471a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m1467c() {
        return this.f2245c.length - 1;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1468d() {
        return this.f2246d && ((InterfaceC0604d) this.f2244b.get(m1467c())).mo1474d() && !this.f2245c[m1467c()].hasRemaining();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1469e() {
        return !this.f2244b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0601a) {
            C0601a c0601a = (C0601a) obj;
            C1692X c1692x = this.f2243a;
            if (c1692x.f7631j == c0601a.f2243a.f7631j) {
                for (int i3 = 0; i3 < c1692x.f7631j; i3++) {
                    if (c1692x.get(i3) == c0601a.f2243a.get(i3)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m1470f(ByteBuffer byteBuffer) {
        boolean z3;
        for (boolean z4 = true; z4; z4 = z3) {
            z3 = false;
            for (int i3 = 0; i3 <= m1467c(); i3++) {
                if (!this.f2245c[i3].hasRemaining()) {
                    ArrayList arrayList = this.f2244b;
                    InterfaceC0604d interfaceC0604d = (InterfaceC0604d) arrayList.get(i3);
                    if (!interfaceC0604d.mo1474d()) {
                        ByteBuffer byteBuffer2 = i3 > 0 ? this.f2245c[i3 - 1] : byteBuffer.hasRemaining() ? byteBuffer : InterfaceC0604d.f2252a;
                        long jRemaining = byteBuffer2.remaining();
                        interfaceC0604d.mo1476f(byteBuffer2);
                        this.f2245c[i3] = interfaceC0604d.mo1471a();
                        z3 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f2245c[i3].hasRemaining();
                    } else if (!this.f2245c[i3].hasRemaining() && i3 < m1467c()) {
                        ((InterfaceC0604d) arrayList.get(i3 + 1)).mo1473c();
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return this.f2243a.hashCode();
    }
}
