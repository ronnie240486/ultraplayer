package p145s0;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p055T.AbstractC0540C;
import p064W.AbstractC0632A;
import p070Y.InterfaceC0711h;

/* JADX INFO: renamed from: s0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2237j implements InterfaceC2241n {

    /* JADX INFO: renamed from: h */
    public final InterfaceC0711h f9627h;

    /* JADX INFO: renamed from: i */
    public final long f9628i;

    /* JADX INFO: renamed from: j */
    public long f9629j;

    /* JADX INFO: renamed from: l */
    public int f9631l;

    /* JADX INFO: renamed from: m */
    public int f9632m;

    /* JADX INFO: renamed from: k */
    public byte[] f9630k = new byte[65536];

    /* JADX INFO: renamed from: g */
    public final byte[] f9626g = new byte[4096];

    static {
        AbstractC0540C.m1348a("media3.extractor");
    }

    public C2237j(InterfaceC0711h interfaceC0711h, long j3, long j4) {
        this.f9627h = interfaceC0711h;
        this.f9629j = j3;
        this.f9628i = j4;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4831b(int i3, boolean z3) throws EOFException, InterruptedIOException {
        m4832k(i3);
        int iM4834p = this.f9632m - this.f9631l;
        while (iM4834p < i3) {
            int i4 = i3;
            boolean z4 = z3;
            iM4834p = m4834p(this.f9630k, this.f9631l, i4, iM4834p, z4);
            if (iM4834p == -1) {
                return false;
            }
            this.f9632m = this.f9631l + iM4834p;
            i3 = i4;
            z3 = z4;
        }
        this.f9631l += i3;
        return true;
    }

    @Override // p145s0.InterfaceC2241n
    /* JADX INFO: renamed from: c */
    public final void mo334c() {
        this.f9631l = 0;
    }

    @Override // p145s0.InterfaceC2241n
    /* JADX INFO: renamed from: d */
    public final void mo335d(int i3) {
        int iMin = Math.min(this.f9632m, i3);
        m4835s(iMin);
        int iM4834p = iMin;
        while (iM4834p < i3 && iM4834p != -1) {
            byte[] bArr = this.f9626g;
            iM4834p = m4834p(bArr, -iM4834p, Math.min(i3, bArr.length + iM4834p), iM4834p, false);
        }
        if (iM4834p != -1) {
            this.f9629j += (long) iM4834p;
        }
    }

    @Override // p145s0.InterfaceC2241n
    /* JADX INFO: renamed from: f */
    public final boolean mo336f(byte[] bArr, int i3, int i4, boolean z3) {
        int iMin;
        int i5 = this.f9632m;
        if (i5 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i5, i4);
            System.arraycopy(this.f9630k, 0, bArr, i3, iMin);
            m4835s(iMin);
        }
        int iM4834p = iMin;
        while (iM4834p < i4 && iM4834p != -1) {
            iM4834p = m4834p(bArr, i3, i4, iM4834p, z3);
        }
        if (iM4834p != -1) {
            this.f9629j += (long) iM4834p;
        }
        return iM4834p != -1;
    }

    @Override // p145s0.InterfaceC2241n
    /* JADX INFO: renamed from: g */
    public final long mo337g() {
        return this.f9628i;
    }

    @Override // p145s0.InterfaceC2241n
    /* JADX INFO: renamed from: i */
    public final boolean mo338i(byte[] bArr, int i3, int i4, boolean z3) {
        if (!m4831b(i4, z3)) {
            return false;
        }
        System.arraycopy(this.f9630k, this.f9631l - i4, bArr, i3, i4);
        return true;
    }

    @Override // p145s0.InterfaceC2241n
    /* JADX INFO: renamed from: j */
    public final long mo339j() {
        return this.f9629j + ((long) this.f9631l);
    }

    /* JADX INFO: renamed from: k */
    public final void m4832k(int i3) {
        int i4 = this.f9631l + i3;
        byte[] bArr = this.f9630k;
        if (i4 > bArr.length) {
            this.f9630k = Arrays.copyOf(this.f9630k, AbstractC0632A.m1590i(bArr.length * 2, 65536 + i4, i4 + 524288));
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m4833l(byte[] bArr, int i3, int i4) throws EOFException, InterruptedIOException {
        C2237j c2237j;
        int iMin;
        m4832k(i4);
        int i5 = this.f9632m;
        int i6 = this.f9631l;
        int i7 = i5 - i6;
        if (i7 == 0) {
            c2237j = this;
            iMin = c2237j.m4834p(this.f9630k, i6, i4, 0, true);
            if (iMin == -1) {
                return -1;
            }
            c2237j.f9632m += iMin;
        } else {
            c2237j = this;
            iMin = Math.min(i4, i7);
        }
        System.arraycopy(c2237j.f9630k, c2237j.f9631l, bArr, i3, iMin);
        c2237j.f9631l += iMin;
        return iMin;
    }

    @Override // p145s0.InterfaceC2241n
    /* JADX INFO: renamed from: n */
    public final void mo342n(byte[] bArr, int i3, int i4) {
        mo338i(bArr, i3, i4, false);
    }

    @Override // p145s0.InterfaceC2241n
    /* JADX INFO: renamed from: o */
    public final void mo343o(int i3) throws EOFException, InterruptedIOException {
        m4831b(i3, false);
    }

    /* JADX INFO: renamed from: p */
    public final int m4834p(byte[] bArr, int i3, int i4, int i5, boolean z3) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iMo345q = this.f9627h.mo345q(bArr, i3 + i5, i4 - i5);
        if (iMo345q != -1) {
            return i5 + iMo345q;
        }
        if (i5 == 0 && z3) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p055T.InterfaceC0575g
    /* JADX INFO: renamed from: q */
    public final int mo345q(byte[] bArr, int i3, int i4) throws EOFException, InterruptedIOException {
        C2237j c2237j;
        int i5 = this.f9632m;
        int iM4834p = 0;
        if (i5 != 0) {
            int iMin = Math.min(i5, i4);
            System.arraycopy(this.f9630k, 0, bArr, i3, iMin);
            m4835s(iMin);
            iM4834p = iMin;
        }
        if (iM4834p == 0) {
            c2237j = this;
            iM4834p = c2237j.m4834p(bArr, i3, i4, 0, true);
        } else {
            c2237j = this;
        }
        if (iM4834p != -1) {
            c2237j.f9629j += (long) iM4834p;
        }
        return iM4834p;
    }

    @Override // p145s0.InterfaceC2241n
    /* JADX INFO: renamed from: r */
    public final long mo346r() {
        return this.f9629j;
    }

    @Override // p145s0.InterfaceC2241n
    public final void readFully(byte[] bArr, int i3, int i4) {
        mo336f(bArr, i3, i4, false);
    }

    /* JADX INFO: renamed from: s */
    public final void m4835s(int i3) {
        int i4 = this.f9632m - i3;
        this.f9632m = i4;
        this.f9631l = 0;
        byte[] bArr = this.f9630k;
        byte[] bArr2 = i4 < bArr.length - 524288 ? new byte[65536 + i4] : bArr;
        System.arraycopy(bArr, i3, bArr2, 0, i4);
        this.f9630k = bArr2;
    }
}
