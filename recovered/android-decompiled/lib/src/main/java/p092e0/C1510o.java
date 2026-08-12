package p092e0;

import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;
import p007C0.C0103c;
import p009D0.C0105a;
import p045P0.AbstractC0462h;
import p055T.AbstractC0545H;
import p055T.C0582n;
import p055T.C0583o;
import p055T.InterfaceC0575g;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p145s0.C2225D;
import p145s0.InterfaceC2226E;

/* JADX INFO: renamed from: e0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1510o implements InterfaceC2226E {

    /* JADX INFO: renamed from: f */
    public static final C0583o f6757f;

    /* JADX INFO: renamed from: g */
    public static final C0583o f6758g;

    /* JADX INFO: renamed from: a */
    public final InterfaceC2226E f6759a;

    /* JADX INFO: renamed from: b */
    public final C0583o f6760b;

    /* JADX INFO: renamed from: c */
    public C0583o f6761c;

    /* JADX INFO: renamed from: d */
    public byte[] f6762d;

    /* JADX INFO: renamed from: e */
    public int f6763e;

    static {
        C0582n c0582n = new C0582n();
        c0582n.f2114m = AbstractC0545H.m1364l("application/id3");
        f6757f = new C0583o(c0582n);
        C0582n c0582n2 = new C0582n();
        c0582n2.f2114m = AbstractC0545H.m1364l("application/x-emsg");
        f6758g = new C0583o(c0582n2);
    }

    public C1510o(InterfaceC2226E interfaceC2226E, int i3) {
        this.f6759a = interfaceC2226E;
        if (i3 == 1) {
            this.f6760b = f6757f;
        } else {
            if (i3 != 3) {
                throw new IllegalArgumentException(AbstractC0462h.m1165e(i3, "Unknown metadataType: "));
            }
            this.f6760b = f6758g;
        }
        this.f6762d = new byte[0];
        this.f6763e = 0;
    }

    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: a */
    public final void mo1172a(long j3, int i3, int i4, int i5, C2225D c2225d) {
        this.f6761c.getClass();
        int i6 = this.f6763e - i5;
        C0651s c0651s = new C0651s(Arrays.copyOfRange(this.f6762d, i6 - i4, i6));
        byte[] bArr = this.f6762d;
        System.arraycopy(bArr, i6, bArr, 0, i5);
        this.f6763e = i5;
        String str = this.f6761c.f2154n;
        C0583o c0583o = this.f6760b;
        if (!Objects.equals(str, c0583o.f2154n)) {
            if (!"application/x-emsg".equals(this.f6761c.f2154n)) {
                AbstractC0646n.m1647y("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.f6761c.f2154n);
                return;
            }
            C0105a c0105aM500y = C0103c.m500y(c0651s);
            C0583o c0583oMo498b = c0105aM500y.mo498b();
            String str2 = c0583o.f2154n;
            if (c0583oMo498b == null || !Objects.equals(str2, c0583oMo498b.f2154n)) {
                AbstractC0646n.m1647y("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + c0105aM500y.mo498b());
                return;
            }
            byte[] bArrMo497a = c0105aM500y.mo497a();
            bArrMo497a.getClass();
            c0651s = new C0651s(bArrMo497a);
        }
        int iM1667a = c0651s.m1667a();
        InterfaceC2226E interfaceC2226E = this.f6759a;
        interfaceC2226E.mo1173b(iM1667a, c0651s);
        interfaceC2226E.mo1172a(j3, i3, iM1667a, 0, c2225d);
    }

    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: b */
    public final void mo1173b(int i3, C0651s c0651s) {
        mo1175d(c0651s, i3, 0);
    }

    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: c */
    public final int mo1174c(InterfaceC0575g interfaceC0575g, int i3, boolean z3) {
        return mo1177f(interfaceC0575g, i3, z3);
    }

    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: d */
    public final void mo1175d(C0651s c0651s, int i3, int i4) {
        int i5 = this.f6763e + i3;
        byte[] bArr = this.f6762d;
        if (bArr.length < i5) {
            this.f6762d = Arrays.copyOf(bArr, (i5 / 2) + i5);
        }
        c0651s.m1671e(this.f6762d, this.f6763e, i3);
        this.f6763e += i3;
    }

    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: e */
    public final void mo1176e(C0583o c0583o) {
        this.f6761c = c0583o;
        this.f6759a.mo1176e(this.f6760b);
    }

    @Override // p145s0.InterfaceC2226E
    /* JADX INFO: renamed from: f */
    public final int mo1177f(InterfaceC0575g interfaceC0575g, int i3, boolean z3) throws EOFException {
        int i4 = this.f6763e + i3;
        byte[] bArr = this.f6762d;
        if (bArr.length < i4) {
            this.f6762d = Arrays.copyOf(bArr, (i4 / 2) + i4);
        }
        int iMo345q = interfaceC0575g.mo345q(this.f6762d, this.f6763e, i3);
        if (iMo345q != -1) {
            this.f6763e += iMo345q;
            return iMo345q;
        }
        if (z3) {
            return -1;
        }
        throw new EOFException();
    }
}
