package p103h0;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import p009D0.C0106b;
import p019G1.AbstractC0230e;
import p036M0.C0368e;
import p046P1.C0475c;
import p055T.AbstractC0571e;
import p055T.C0582n;
import p055T.C0583o;
import p058U.InterfaceC0604d;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p073Z.C0767b;
import p073Z.C0770e;
import p073Z.C0771f;
import p073Z.InterfaceC0766a;
import p077a0.AbstractC0827g;
import p077a0.C0793D;
import p077a0.C0829h;
import p077a0.C0831i;
import p077a0.C0839o;
import p082b0.C1070k;
import p082b0.C1071l;
import p085c0.C1121C;
import p088d0.C1383g;
import p088d0.C1395s;
import p088d0.InterfaceC1384h;
import p089d1.C1447t;
import p114k0.C1907A;
import p114k0.InterfaceC1931Z;
import p145s0.AbstractC2229b;

/* JADX INFO: renamed from: h0.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1609r extends AbstractC0827g {

    /* JADX INFO: renamed from: H0 */
    public static final byte[] f7270H0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: A */
    public final C0771f f7271A;

    /* JADX INFO: renamed from: A0 */
    public boolean f7272A0;

    /* JADX INFO: renamed from: B */
    public final C0771f f7273B;

    /* JADX INFO: renamed from: B0 */
    public boolean f7274B0;

    /* JADX INFO: renamed from: C */
    public final C0771f f7275C;

    /* JADX INFO: renamed from: C0 */
    public C0839o f7276C0;

    /* JADX INFO: renamed from: D */
    public final C1599h f7277D;

    /* JADX INFO: renamed from: D0 */
    public C0829h f7278D0;

    /* JADX INFO: renamed from: E */
    public final MediaCodec.BufferInfo f7279E;

    /* JADX INFO: renamed from: E0 */
    public C1608q f7280E0;

    /* JADX INFO: renamed from: F */
    public final ArrayDeque f7281F;

    /* JADX INFO: renamed from: F0 */
    public long f7282F0;

    /* JADX INFO: renamed from: G */
    public final C1121C f7283G;

    /* JADX INFO: renamed from: G0 */
    public boolean f7284G0;

    /* JADX INFO: renamed from: H */
    public C0583o f7285H;

    /* JADX INFO: renamed from: I */
    public C0583o f7286I;

    /* JADX INFO: renamed from: J */
    public InterfaceC1384h f7287J;

    /* JADX INFO: renamed from: K */
    public InterfaceC1384h f7288K;

    /* JADX INFO: renamed from: L */
    public C0793D f7289L;

    /* JADX INFO: renamed from: M */
    public MediaCrypto f7290M;

    /* JADX INFO: renamed from: N */
    public final long f7291N;

    /* JADX INFO: renamed from: O */
    public float f7292O;

    /* JADX INFO: renamed from: P */
    public float f7293P;

    /* JADX INFO: renamed from: Q */
    public InterfaceC1603l f7294Q;

    /* JADX INFO: renamed from: R */
    public C0583o f7295R;

    /* JADX INFO: renamed from: S */
    public MediaFormat f7296S;

    /* JADX INFO: renamed from: T */
    public boolean f7297T;

    /* JADX INFO: renamed from: U */
    public float f7298U;

    /* JADX INFO: renamed from: V */
    public ArrayDeque f7299V;

    /* JADX INFO: renamed from: W */
    public C1607p f7300W;

    /* JADX INFO: renamed from: X */
    public C1606o f7301X;

    /* JADX INFO: renamed from: Y */
    public int f7302Y;

    /* JADX INFO: renamed from: Z */
    public boolean f7303Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f7304a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f7305b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f7306c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f7307d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f7308e0;

    /* JADX INFO: renamed from: f0 */
    public long f7309f0;

    /* JADX INFO: renamed from: g0 */
    public long f7310g0;

    /* JADX INFO: renamed from: h0 */
    public int f7311h0;

    /* JADX INFO: renamed from: i0 */
    public int f7312i0;

    /* JADX INFO: renamed from: j0 */
    public ByteBuffer f7313j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f7314k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f7315l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f7316m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f7317n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f7318o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f7319p0;

    /* JADX INFO: renamed from: q0 */
    public int f7320q0;

    /* JADX INFO: renamed from: r0 */
    public int f7321r0;

    /* JADX INFO: renamed from: s0 */
    public int f7322s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f7323t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f7324u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f7325v0;

    /* JADX INFO: renamed from: w0 */
    public long f7326w0;

    /* JADX INFO: renamed from: x */
    public final InterfaceC1602k f7327x;

    /* JADX INFO: renamed from: x0 */
    public long f7328x0;

    /* JADX INFO: renamed from: y */
    public final C1601j f7329y;

    /* JADX INFO: renamed from: y0 */
    public boolean f7330y0;

    /* JADX INFO: renamed from: z */
    public final float f7331z;

    /* JADX INFO: renamed from: z0 */
    public boolean f7332z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1609r(int i3, InterfaceC1602k interfaceC1602k, float f) {
        super(i3);
        C1601j c1601j = C1601j.f7250h;
        this.f7327x = interfaceC1602k;
        this.f7329y = c1601j;
        this.f7331z = f;
        this.f7271A = new C0771f(0);
        this.f7273B = new C0771f(0);
        this.f7275C = new C0771f(2);
        C1599h c1599h = new C1599h(2);
        c1599h.f7247r = 32;
        this.f7277D = c1599h;
        this.f7279E = new MediaCodec.BufferInfo();
        this.f7292O = 1.0f;
        this.f7293P = 1.0f;
        this.f7291N = -9223372036854775807L;
        this.f7281F = new ArrayDeque();
        this.f7280E0 = C1608q.f7265e;
        c1599h.m1885h(0);
        c1599h.f3144k.order(ByteOrder.nativeOrder());
        C1121C c1121c = new C1121C();
        c1121c.f5195a = InterfaceC0604d.f2252a;
        c1121c.f5197c = 0;
        c1121c.f5196b = 2;
        this.f7283G = c1121c;
        this.f7298U = -1.0f;
        this.f7302Y = 0;
        this.f7320q0 = 0;
        this.f7311h0 = -1;
        this.f7312i0 = -1;
        this.f7310g0 = -9223372036854775807L;
        this.f7326w0 = -9223372036854775807L;
        this.f7328x0 = -9223372036854775807L;
        this.f7282F0 = -9223372036854775807L;
        this.f7309f0 = -9223372036854775807L;
        this.f7321r0 = 0;
        this.f7322s0 = 0;
        this.f7278D0 = new C0829h();
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: A */
    public final int mo2078A() {
        return 8;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0310  */
    /* JADX WARN: Code duplicated, block: B:122:0x0318 A[LOOP:0: B:25:0x008c->B:122:0x0318, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x0316 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX INFO: renamed from: B */
    public final boolean m3944B(long j3, long j4) {
        C1599h c1599h;
        int length;
        AbstractC0646n.m1630h(!this.f7332z0);
        C1599h c1599h2 = this.f7277D;
        if (c1599h2.m3935l()) {
            ByteBuffer byteBuffer = c1599h2.f3144k;
            int i3 = this.f7312i0;
            int i4 = c1599h2.f7246q;
            long j5 = c1599h2.f3146m;
            boolean zM3956S = m3956S(this.f3488r, c1599h2.f7245p);
            boolean zM1787c = c1599h2.m1787c(4);
            C0583o c0583o = this.f7286I;
            c0583o.getClass();
            c1599h = c1599h2;
            if (!mo2992g0(j3, j4, null, byteBuffer, i3, 0, i4, j5, zM3956S, zM1787c, c0583o)) {
                return false;
            }
            mo3959b0(c1599h.f7245p);
            c1599h.mo1883e();
        } else {
            c1599h = c1599h2;
        }
        if (this.f7330y0) {
            this.f7332z0 = true;
            return false;
        }
        ?? r3 = 0;
        boolean z3 = this.f7317n0;
        C0771f c0771f = this.f7275C;
        if (z3) {
            AbstractC0646n.m1630h(c1599h.m3934j(c0771f));
            this.f7317n0 = false;
        }
        if (this.f7318o0) {
            if (c1599h.m3935l()) {
                return true;
            }
            m3946E();
            this.f7318o0 = false;
            m3957T();
            if (!this.f7316m0) {
                return false;
            }
        }
        AbstractC0646n.m1630h(!this.f7330y0);
        C0106b c0106b = this.f3479i;
        c0106b.m526n();
        c0771f.mo1883e();
        while (true) {
            c0771f.mo1883e();
            int iM2094u = m2094u(c0106b, c0771f, r3);
            if (iM2094u == -5) {
                mo2988Y(c0106b);
            } else if (iM2094u != -4) {
                if (iM2094u != -3) {
                    throw new IllegalStateException();
                }
                if (m2083j()) {
                    this.f7328x0 = this.f7326w0;
                }
            } else if (c0771f.m1787c(4)) {
                this.f7330y0 = true;
                this.f7328x0 = this.f7326w0;
            } else {
                this.f7326w0 = Math.max(this.f7326w0, c0771f.f3146m);
                if (m2083j() || this.f7273B.m1787c(536870912)) {
                    this.f7328x0 = this.f7326w0;
                }
                byte[] bArr = null;
                if (this.f7272A0) {
                    C0583o c0583o2 = this.f7285H;
                    c0583o2.getClass();
                    this.f7286I = c0583o2;
                    if (Objects.equals(c0583o2.f2154n, "audio/opus") && !this.f7286I.f2157q.isEmpty()) {
                        byte[] bArr2 = (byte[]) this.f7286I.f2157q.get(r3);
                        int i5 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                        C0583o c0583o3 = this.f7286I;
                        c0583o3.getClass();
                        C0582n c0582nM1447a = c0583o3.m1447a();
                        c0582nM1447a.f2095E = i5;
                        this.f7286I = new C0583o(c0582nM1447a);
                    }
                    mo2989Z(this.f7286I, null);
                    this.f7272A0 = r3;
                }
                c0771f.m1886i();
                C0583o c0583o4 = this.f7286I;
                if (c0583o4 != null && Objects.equals(c0583o4.f2154n, "audio/opus")) {
                    if (c0771f.m1787c(268435456)) {
                        c0771f.f3142i = this.f7286I;
                        mo2984Q(c0771f);
                    }
                    if (this.f3488r - c0771f.f3146m <= 80000) {
                        C0583o c0583o5 = this.f7286I;
                        c0583o5.getClass();
                        C1121C c1121c = this.f7283G;
                        c1121c.getClass();
                        c0771f.f3144k.getClass();
                        if (c0771f.f3144k.limit() - c0771f.f3144k.position() != 0) {
                            if (c1121c.f5196b == 2) {
                                List list = c0583o5.f2157q;
                                if (list.size() == 1 || list.size() == 3) {
                                    bArr = (byte[]) list.get(r3);
                                }
                            }
                            ByteBuffer byteBuffer2 = c0771f.f3144k;
                            int iPosition = byteBuffer2.position();
                            int iLimit = byteBuffer2.limit();
                            int i6 = iLimit - iPosition;
                            int i7 = (i6 + 255) / 255;
                            int i8 = i7 + 27 + i6;
                            if (c1121c.f5196b == 2) {
                                length = bArr != null ? bArr.length + 28 : 47;
                                i8 = length + 44 + i8;
                            } else {
                                length = 0;
                            }
                            int i9 = i8;
                            if (c1121c.f5195a.capacity() < i9) {
                                c1121c.f5195a = ByteBuffer.allocate(i9).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                c1121c.f5195a.clear();
                            }
                            ByteBuffer byteBuffer3 = c1121c.f5195a;
                            if (c1121c.f5196b == 2) {
                                if (bArr != null) {
                                    C1121C.m2999a(byteBuffer3, 0L, 0, 1, true);
                                    long length2 = bArr.length;
                                    AbstractC0230e.m728f((length2 >> 8) == 0, "out of range: %s", length2);
                                    byteBuffer3.put((byte) length2);
                                    byteBuffer3.put(bArr);
                                    byteBuffer3.putInt(22, AbstractC0632A.m1593l(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    byteBuffer3.put(C1121C.f5193d);
                                }
                                byteBuffer3.put(C1121C.f5194e);
                            } else {
                                iLimit = iLimit;
                            }
                            int iM4815j = c1121c.f5197c + ((int) ((AbstractC2229b.m4815j(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                            c1121c.f5197c = iM4815j;
                            C1121C.m2999a(byteBuffer3, iM4815j, c1121c.f5196b, i7, false);
                            for (int i10 = 0; i10 < i7; i10++) {
                                if (i6 >= 255) {
                                    byteBuffer3.put((byte) -1);
                                    i6 -= 255;
                                } else {
                                    byteBuffer3.put((byte) i6);
                                    i6 = 0;
                                }
                            }
                            int i11 = iLimit;
                            while (iPosition < i11) {
                                byteBuffer3.put(byteBuffer2.get(iPosition));
                                iPosition++;
                            }
                            byteBuffer2.position(byteBuffer2.limit());
                            byteBuffer3.flip();
                            if (c1121c.f5196b == 2) {
                                byteBuffer3.putInt(length + 66, AbstractC0632A.m1593l(byteBuffer3.arrayOffset() + length + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            } else {
                                byteBuffer3.putInt(22, AbstractC0632A.m1593l(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            }
                            c1121c.f5196b++;
                            c1121c.f5195a = byteBuffer3;
                            c0771f.mo1883e();
                            c0771f.m1885h(c1121c.f5195a.remaining());
                            c0771f.f3144k.put(c1121c.f5195a);
                            c0771f.m1886i();
                        }
                    }
                }
                if (c1599h.m3935l()) {
                    long j6 = this.f3488r;
                    if (m3956S(j6, c1599h.f7245p) == m3956S(j6, c0771f.f3146m)) {
                        if (!c1599h.m3934j(c0771f)) {
                            r3 = 0;
                        }
                    }
                } else if (!c1599h.m3934j(c0771f)) {
                    r3 = 0;
                }
                this.f7317n0 = true;
            }
            if (c1599h.m3935l()) {
                c1599h.m1886i();
            }
            return c1599h.m3935l() || this.f7330y0 || this.f7318o0;
        }
    }

    /* JADX INFO: renamed from: C */
    public abstract C0831i mo2980C(C1606o c1606o, C0583o c0583o, C0583o c0583o2);

    /* JADX INFO: renamed from: D */
    public C1605n mo3945D(IllegalStateException illegalStateException, C1606o c1606o) {
        return new C1605n(illegalStateException, c1606o);
    }

    /* JADX INFO: renamed from: E */
    public final void m3946E() {
        this.f7318o0 = false;
        this.f7277D.mo1883e();
        this.f7275C.mo1883e();
        this.f7317n0 = false;
        this.f7316m0 = false;
        C1121C c1121c = this.f7283G;
        c1121c.getClass();
        c1121c.f5195a = InterfaceC0604d.f2252a;
        c1121c.f5197c = 0;
        c1121c.f5196b = 2;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m3947F() throws C0839o {
        if (!this.f7323t0) {
            m3972t0();
            return true;
        }
        this.f7321r0 = 1;
        if (this.f7304a0) {
            this.f7322s0 = 3;
            return false;
        }
        this.f7322s0 = 2;
        return true;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m3948G(long j3, long j4) throws C0839o {
        MediaCodec.BufferInfo bufferInfo;
        boolean z3;
        boolean z4;
        boolean zMo2992g0;
        int iMo3371e;
        InterfaceC1603l interfaceC1603l = this.f7294Q;
        interfaceC1603l.getClass();
        boolean z5 = this.f7312i0 >= 0;
        MediaCodec.BufferInfo bufferInfo2 = this.f7279E;
        if (!z5) {
            if (this.f7305b0 && this.f7324u0) {
                try {
                    iMo3371e = interfaceC1603l.mo3371e(bufferInfo2);
                } catch (IllegalStateException unused) {
                    m3962f0();
                    if (this.f7332z0) {
                        m3964i0();
                    }
                }
            } else {
                iMo3371e = interfaceC1603l.mo3371e(bufferInfo2);
            }
            if (iMo3371e < 0) {
                if (iMo3371e == -2) {
                    this.f7325v0 = true;
                    InterfaceC1603l interfaceC1603l2 = this.f7294Q;
                    interfaceC1603l2.getClass();
                    MediaFormat mediaFormatMo3385s = interfaceC1603l2.mo3385s();
                    if (this.f7302Y != 0 && mediaFormatMo3385s.getInteger("width") == 32 && mediaFormatMo3385s.getInteger("height") == 32) {
                        this.f7307d0 = true;
                        return true;
                    }
                    this.f7296S = mediaFormatMo3385s;
                    this.f7297T = true;
                    return true;
                }
                if (this.f7308e0 && (this.f7330y0 || this.f7321r0 == 2)) {
                    m3962f0();
                }
                long j5 = this.f7309f0;
                if (j5 != -9223372036854775807L) {
                    long j6 = j5 + 100;
                    this.f3483m.getClass();
                    if (j6 < System.currentTimeMillis()) {
                        m3962f0();
                        return false;
                    }
                }
                return false;
            }
            if (this.f7307d0) {
                this.f7307d0 = false;
                interfaceC1603l.mo3376j(iMo3371e);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                m3962f0();
                return false;
            }
            this.f7312i0 = iMo3371e;
            ByteBuffer byteBufferMo3377k = interfaceC1603l.mo3377k(iMo3371e);
            this.f7313j0 = byteBufferMo3377k;
            if (byteBufferMo3377k != null) {
                byteBufferMo3377k.position(bufferInfo2.offset);
                this.f7313j0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j7 = bufferInfo2.presentationTimeUs;
            this.f7314k0 = j7 < this.f3488r;
            long j8 = this.f7328x0;
            this.f7315l0 = j8 != -9223372036854775807L && j8 <= j7;
            m3973u0(j7);
        }
        if (this.f7305b0 && this.f7324u0) {
            try {
                ByteBuffer byteBuffer = this.f7313j0;
                int i3 = this.f7312i0;
                int i4 = bufferInfo2.flags;
                long j9 = bufferInfo2.presentationTimeUs;
                boolean z6 = this.f7314k0;
                boolean z7 = this.f7315l0;
                C0583o c0583o = this.f7286I;
                c0583o.getClass();
                bufferInfo = bufferInfo2;
                z3 = true;
                z4 = false;
                try {
                    zMo2992g0 = mo2992g0(j3, j4, interfaceC1603l, byteBuffer, i3, i4, 1, j9, z6, z7, c0583o);
                } catch (IllegalStateException unused2) {
                    m3962f0();
                    if (!this.f7332z0) {
                        return z4;
                    }
                    m3964i0();
                    return z4;
                }
            } catch (IllegalStateException unused3) {
                z4 = false;
            }
        } else {
            bufferInfo = bufferInfo2;
            z3 = true;
            z4 = false;
            ByteBuffer byteBuffer2 = this.f7313j0;
            int i5 = this.f7312i0;
            int i6 = bufferInfo.flags;
            long j10 = bufferInfo.presentationTimeUs;
            boolean z8 = this.f7314k0;
            boolean z9 = this.f7315l0;
            C0583o c0583o2 = this.f7286I;
            c0583o2.getClass();
            zMo2992g0 = mo2992g0(j3, j4, interfaceC1603l, byteBuffer2, i5, i6, 1, j10, z8, z9, c0583o2);
        }
        if (!zMo2992g0) {
            return z4;
        }
        mo3959b0(bufferInfo.presentationTimeUs);
        boolean z10 = (bufferInfo.flags & 4) != 0;
        if (!z10 && this.f7324u0 && this.f7315l0) {
            this.f3483m.getClass();
            this.f7309f0 = System.currentTimeMillis();
        }
        this.f7312i0 = -1;
        this.f7313j0 = null;
        if (!z10) {
            return z3;
        }
        m3962f0();
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x019b  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:111:0x008f A[EDGE_INSN: B:111:0x008f->B:33:0x008f BREAK  A[LOOP:0: B:30:0x006d->B:32:0x007a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a A[LOOP:0: B:30:0x006d->B:32:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:73:0x010f  */
    /* JADX WARN: Code duplicated, block: B:75:0x011a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0122  */
    /* JADX WARN: Code duplicated, block: B:79:0x0126  */
    /* JADX WARN: Code duplicated, block: B:80:0x012a  */
    /* JADX WARN: Code duplicated, block: B:82:0x012e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0143  */
    /* JADX WARN: Code duplicated, block: B:88:0x014b  */
    /* JADX WARN: Code duplicated, block: B:89:0x015c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0180  */
    /* JADX WARN: Code duplicated, block: B:98:0x018f  */
    /* JADX INFO: renamed from: H */
    public final boolean m3949H() throws C0839o {
        int iPosition;
        C0106b c0106b;
        int iM2094u;
        boolean zM1787c;
        long j3;
        int iMo3953L;
        ArrayDeque arrayDeque;
        C0767b c0767b;
        int i3;
        C0583o c0583o;
        InterfaceC1603l interfaceC1603l = this.f7294Q;
        if (interfaceC1603l != null && this.f7321r0 != 2 && !this.f7330y0) {
            int i4 = this.f7311h0;
            C0771f c0771f = this.f7273B;
            if (i4 < 0) {
                int iMo3380n = interfaceC1603l.mo3380n();
                this.f7311h0 = iMo3380n;
                if (iMo3380n >= 0) {
                    c0771f.f3144k = interfaceC1603l.mo3373g(iMo3380n);
                    c0771f.mo1883e();
                    if (this.f7321r0 == 1) {
                        if (!this.f7308e0) {
                            this.f7324u0 = true;
                            interfaceC1603l.mo3370d(this.f7311h0, 0, 0L, 4);
                            this.f7311h0 = -1;
                            c0771f.f3144k = null;
                        }
                        this.f7321r0 = 2;
                        return false;
                    }
                    if (this.f7306c0) {
                        this.f7306c0 = false;
                        ByteBuffer byteBuffer = c0771f.f3144k;
                        byteBuffer.getClass();
                        byteBuffer.put(f7270H0);
                        interfaceC1603l.mo3370d(this.f7311h0, 38, 0L, 0);
                        this.f7311h0 = -1;
                        c0771f.f3144k = null;
                        this.f7323t0 = true;
                        return true;
                    }
                    if (this.f7320q0 == 1) {
                        i3 = 0;
                        while (true) {
                            c0583o = this.f7295R;
                            c0583o.getClass();
                            if (i3 < c0583o.f2157q.size()) {
                                break;
                            }
                            byte[] bArr = (byte[]) this.f7295R.f2157q.get(i3);
                            ByteBuffer byteBuffer2 = c0771f.f3144k;
                            byteBuffer2.getClass();
                            byteBuffer2.put(bArr);
                            i3++;
                        }
                        this.f7320q0 = 2;
                    }
                    ByteBuffer byteBuffer3 = c0771f.f3144k;
                    byteBuffer3.getClass();
                    iPosition = byteBuffer3.position();
                    c0106b = this.f3479i;
                    c0106b.m526n();
                    try {
                        iM2094u = m2094u(c0106b, c0771f, 0);
                        if (iM2094u == -3) {
                            if (m2083j()) {
                                this.f7328x0 = this.f7326w0;
                                return false;
                            }
                        } else {
                            if (iM2094u == -5) {
                                if (this.f7320q0 == 2) {
                                    c0771f.mo1883e();
                                    this.f7320q0 = 1;
                                }
                                mo2988Y(c0106b);
                                return true;
                            }
                            if (c0771f.m1787c(4)) {
                                if (this.f7323t0 && !c0771f.m1787c(1)) {
                                    c0771f.mo1883e();
                                    if (this.f7320q0 == 2) {
                                        this.f7320q0 = 1;
                                    }
                                    return true;
                                }
                                if (mo3970p0(c0771f)) {
                                    c0771f.mo1883e();
                                    this.f7278D0.f3507d++;
                                    return true;
                                }
                                zM1787c = c0771f.m1787c(1073741824);
                                if (zM1787c) {
                                    c0767b = c0771f.f3143j;
                                    if (iPosition == 0) {
                                        c0767b.getClass();
                                    } else {
                                        if (c0767b.f3135d == null) {
                                            int[] iArr = new int[1];
                                            c0767b.f3135d = iArr;
                                            c0767b.f3140i.numBytesOfClearData = iArr;
                                        }
                                        int[] iArr2 = c0767b.f3135d;
                                        iArr2[0] = iArr2[0] + iPosition;
                                    }
                                }
                                j3 = c0771f.f3146m;
                                if (this.f7272A0) {
                                    arrayDeque = this.f7281F;
                                    if (arrayDeque.isEmpty()) {
                                        C0368e c0368e = this.f7280E0.f7269d;
                                        C0583o c0583o2 = this.f7285H;
                                        c0583o2.getClass();
                                        c0368e.m1009a(j3, c0583o2);
                                    } else {
                                        C0368e c0368e2 = ((C1608q) arrayDeque.peekLast()).f7269d;
                                        C0583o c0583o3 = this.f7285H;
                                        c0583o3.getClass();
                                        c0368e2.m1009a(j3, c0583o3);
                                    }
                                    this.f7272A0 = false;
                                }
                                this.f7326w0 = Math.max(this.f7326w0, j3);
                                if (m2083j() || c0771f.m1787c(536870912)) {
                                    this.f7328x0 = this.f7326w0;
                                }
                                c0771f.m1886i();
                                if (c0771f.m1787c(268435456)) {
                                    mo2984Q(c0771f);
                                }
                                mo3960d0(c0771f);
                                iMo3953L = mo3953L(c0771f);
                                if (zM1787c) {
                                    interfaceC1603l.mo3368b(this.f7311h0, c0771f.f3143j, j3, iMo3953L);
                                } else {
                                    int i5 = this.f7311h0;
                                    ByteBuffer byteBuffer4 = c0771f.f3144k;
                                    byteBuffer4.getClass();
                                    interfaceC1603l.mo3370d(i5, byteBuffer4.limit(), j3, iMo3953L);
                                }
                                this.f7311h0 = -1;
                                c0771f.f3144k = null;
                                this.f7323t0 = true;
                                this.f7320q0 = 0;
                                this.f7278D0.f3506c++;
                                return true;
                            }
                            this.f7328x0 = this.f7326w0;
                            if (this.f7320q0 == 2) {
                                c0771f.mo1883e();
                                this.f7320q0 = 1;
                            }
                            this.f7330y0 = true;
                            if (!this.f7323t0) {
                                m3962f0();
                                return false;
                            }
                            if (!this.f7308e0) {
                                this.f7324u0 = true;
                                interfaceC1603l.mo3370d(this.f7311h0, 0, 0L, 4);
                                this.f7311h0 = -1;
                                c0771f.f3144k = null;
                                return false;
                            }
                        }
                    } catch (C0770e e3) {
                        mo2985V(e3);
                        m3963h0(0);
                        m3950I();
                        return true;
                    }
                }
            } else {
                if (this.f7321r0 == 1) {
                    if (!this.f7308e0) {
                        this.f7324u0 = true;
                        interfaceC1603l.mo3370d(this.f7311h0, 0, 0L, 4);
                        this.f7311h0 = -1;
                        c0771f.f3144k = null;
                    }
                    this.f7321r0 = 2;
                    return false;
                }
                if (this.f7306c0) {
                    this.f7306c0 = false;
                    ByteBuffer byteBuffer5 = c0771f.f3144k;
                    byteBuffer5.getClass();
                    byteBuffer5.put(f7270H0);
                    interfaceC1603l.mo3370d(this.f7311h0, 38, 0L, 0);
                    this.f7311h0 = -1;
                    c0771f.f3144k = null;
                    this.f7323t0 = true;
                    return true;
                }
                if (this.f7320q0 == 1) {
                    i3 = 0;
                    while (true) {
                        c0583o = this.f7295R;
                        c0583o.getClass();
                        if (i3 < c0583o.f2157q.size()) {
                            break;
                            break;
                        }
                        byte[] bArr2 = (byte[]) this.f7295R.f2157q.get(i3);
                        ByteBuffer byteBuffer6 = c0771f.f3144k;
                        byteBuffer6.getClass();
                        byteBuffer6.put(bArr2);
                        i3++;
                    }
                    this.f7320q0 = 2;
                }
                ByteBuffer byteBuffer7 = c0771f.f3144k;
                byteBuffer7.getClass();
                iPosition = byteBuffer7.position();
                c0106b = this.f3479i;
                c0106b.m526n();
                iM2094u = m2094u(c0106b, c0771f, 0);
                if (iM2094u == -3) {
                    if (m2083j()) {
                        this.f7328x0 = this.f7326w0;
                        return false;
                    }
                } else {
                    if (iM2094u == -5) {
                        if (this.f7320q0 == 2) {
                            c0771f.mo1883e();
                            this.f7320q0 = 1;
                        }
                        mo2988Y(c0106b);
                        return true;
                    }
                    if (c0771f.m1787c(4)) {
                        if (this.f7323t0) {
                        }
                        if (mo3970p0(c0771f)) {
                            c0771f.mo1883e();
                            this.f7278D0.f3507d++;
                            return true;
                        }
                        zM1787c = c0771f.m1787c(1073741824);
                        if (zM1787c) {
                            c0767b = c0771f.f3143j;
                            if (iPosition == 0) {
                                c0767b.getClass();
                            } else {
                                if (c0767b.f3135d == null) {
                                    int[] iArr3 = new int[1];
                                    c0767b.f3135d = iArr3;
                                    c0767b.f3140i.numBytesOfClearData = iArr3;
                                }
                                int[] iArr4 = c0767b.f3135d;
                                iArr4[0] = iArr4[0] + iPosition;
                            }
                        }
                        j3 = c0771f.f3146m;
                        if (this.f7272A0) {
                            arrayDeque = this.f7281F;
                            if (arrayDeque.isEmpty()) {
                                C0368e c0368e3 = ((C1608q) arrayDeque.peekLast()).f7269d;
                                C0583o c0583o4 = this.f7285H;
                                c0583o4.getClass();
                                c0368e3.m1009a(j3, c0583o4);
                            } else {
                                C0368e c0368e4 = this.f7280E0.f7269d;
                                C0583o c0583o5 = this.f7285H;
                                c0583o5.getClass();
                                c0368e4.m1009a(j3, c0583o5);
                            }
                            this.f7272A0 = false;
                        }
                        this.f7326w0 = Math.max(this.f7326w0, j3);
                        if (m2083j()) {
                            this.f7328x0 = this.f7326w0;
                        } else {
                            this.f7328x0 = this.f7326w0;
                        }
                        c0771f.m1886i();
                        if (c0771f.m1787c(268435456)) {
                            mo2984Q(c0771f);
                        }
                        mo3960d0(c0771f);
                        iMo3953L = mo3953L(c0771f);
                        if (zM1787c) {
                            interfaceC1603l.mo3368b(this.f7311h0, c0771f.f3143j, j3, iMo3953L);
                        } else {
                            int i6 = this.f7311h0;
                            ByteBuffer byteBuffer8 = c0771f.f3144k;
                            byteBuffer8.getClass();
                            interfaceC1603l.mo3370d(i6, byteBuffer8.limit(), j3, iMo3953L);
                        }
                        this.f7311h0 = -1;
                        c0771f.f3144k = null;
                        this.f7323t0 = true;
                        this.f7320q0 = 0;
                        this.f7278D0.f3506c++;
                        return true;
                    }
                    this.f7328x0 = this.f7326w0;
                    if (this.f7320q0 == 2) {
                        c0771f.mo1883e();
                        this.f7320q0 = 1;
                    }
                    this.f7330y0 = true;
                    if (!this.f7323t0) {
                        m3962f0();
                        return false;
                    }
                    if (!this.f7308e0) {
                        this.f7324u0 = true;
                        interfaceC1603l.mo3370d(this.f7311h0, 0, 0L, 4);
                        this.f7311h0 = -1;
                        c0771f.f3144k = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public final void m3950I() {
        try {
            InterfaceC1603l interfaceC1603l = this.f7294Q;
            AbstractC0646n.m1631i(interfaceC1603l);
            interfaceC1603l.flush();
        } finally {
            mo3965k0();
        }
    }

    /* JADX INFO: renamed from: J */
    public final boolean m3951J() {
        if (this.f7294Q == null) {
            return false;
        }
        int i3 = this.f7322s0;
        if (i3 == 3 || ((this.f7303Z && !this.f7325v0) || (this.f7304a0 && this.f7324u0))) {
            m3964i0();
            return true;
        }
        if (i3 == 2) {
            int i4 = AbstractC0632A.f2454a;
            AbstractC0646n.m1630h(i4 >= 23);
            if (i4 >= 23) {
                try {
                    m3972t0();
                } catch (C0839o e3) {
                    AbstractC0646n.m1648z("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e3);
                    m3964i0();
                    return true;
                }
            }
        }
        m3950I();
        return false;
    }

    /* JADX INFO: renamed from: K */
    public final List m3952K(boolean z3) {
        C0583o c0583o = this.f7285H;
        c0583o.getClass();
        C1601j c1601j = this.f7329y;
        ArrayList arrayListMo2982O = mo2982O(c1601j, c0583o, z3);
        if (!arrayListMo2982O.isEmpty() || !z3) {
            return arrayListMo2982O;
        }
        ArrayList arrayListMo2982O2 = mo2982O(c1601j, c0583o, false);
        if (!arrayListMo2982O2.isEmpty()) {
            AbstractC0646n.m1647y("MediaCodecRenderer", "Drm session requires secure decoder for " + c0583o.f2154n + ", but no secure decoder available. Trying to proceed with " + arrayListMo2982O2 + ".");
        }
        return arrayListMo2982O2;
    }

    /* JADX INFO: renamed from: L */
    public int mo3953L(C0771f c0771f) {
        return 0;
    }

    /* JADX INFO: renamed from: M */
    public boolean mo3954M() {
        return false;
    }

    /* JADX INFO: renamed from: N */
    public abstract float mo2981N(float f, C0583o[] c0583oArr);

    /* JADX INFO: renamed from: O */
    public abstract ArrayList mo2982O(C1601j c1601j, C0583o c0583o, boolean z3);

    /* JADX INFO: renamed from: P */
    public abstract C0475c mo2983P(C1606o c1606o, C0583o c0583o, MediaCrypto mediaCrypto, float f);

    /* JADX INFO: renamed from: Q */
    public abstract void mo2984Q(C0771f c0771f);

    /* JADX WARN: Code duplicated, block: B:32:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:47:0x012a  */
    /* JADX INFO: renamed from: R */
    public final void m3955R(C1606o c1606o, MediaCrypto mediaCrypto) {
        float fMo2981N;
        int i3;
        C0583o c0583o = this.f7285H;
        c0583o.getClass();
        String str = c1606o.f7252a;
        int i4 = AbstractC0632A.f2454a;
        if (i4 < 23) {
            fMo2981N = -1.0f;
        } else {
            float f = this.f7293P;
            C0583o[] c0583oArr = this.f3486p;
            c0583oArr.getClass();
            fMo2981N = mo2981N(f, c0583oArr);
        }
        float f3 = fMo2981N > this.f7331z ? fMo2981N : -1.0f;
        mo3961e0(c0583o);
        this.f3483m.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C0475c c0475cMo2983P = mo2983P(c1606o, c0583o, mediaCrypto, f3);
        if (i4 >= 31) {
            C1071l c1071l = this.f3482l;
            c1071l.getClass();
            C1070k c1070k = c1071l.f4881b;
            c1070k.getClass();
            LogSessionId logSessionId = c1070k.f4879a;
            LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
            if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                ((MediaFormat) c0475cMo2983P.f1569b).setString("log-session-id", logSessionId.getStringId());
            }
        }
        try {
            Trace.beginSection("createCodec:" + str);
            InterfaceC1603l interfaceC1603lMo3389w = this.f7327x.mo3389w(c0475cMo2983P);
            this.f7294Q = interfaceC1603lMo3389w;
            interfaceC1603lMo3389w.mo3383q(new C1447t(10, this));
            Trace.endSection();
            this.f3483m.getClass();
            float f4 = f3;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!c1606o.m3940d(c0583o)) {
                String strM1446c = C0583o.m1446c(c0583o);
                Locale locale = Locale.US;
                AbstractC0646n.m1647y("MediaCodecRenderer", "Format exceeds selected codec's capabilities [" + strM1446c + ", " + str + "]");
            }
            this.f7301X = c1606o;
            this.f7298U = f4;
            this.f7295R = c0583o;
            if (i4 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = AbstractC0632A.f2457d;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i3 = 2;
                } else if (i4 < 24) {
                    i3 = 0;
                } else {
                    i3 = 0;
                }
            } else if (i4 < 24 || !("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                i3 = 0;
            } else {
                String str3 = AbstractC0632A.f2455b;
                if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
            }
            this.f7302Y = i3;
            this.f7303Z = i4 == 29 && "c2.android.aac.decoder".equals(str);
            this.f7304a0 = i4 <= 23 && "OMX.google.vorbis.decoder".equals(str);
            this.f7305b0 = i4 == 21 && "OMX.google.aac.decoder".equals(str);
            String str4 = c1606o.f7252a;
            this.f7308e0 = (i4 <= 25 && "OMX.rk.video_decoder.avc".equals(str4)) || (i4 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str4) || "OMX.bcm.vdec.avc.tunnel".equals(str4) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str4) || "OMX.bcm.vdec.hevc.tunnel".equals(str4) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) || (("Amazon".equals(AbstractC0632A.f2456c) && "AFTS".equals(AbstractC0632A.f2457d) && c1606o.f7257f) || mo3954M());
            this.f7294Q.getClass();
            if (this.f3484n == 2) {
                this.f3483m.getClass();
                this.f7310g0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f7278D0.f3504a++;
            mo2986W(jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime, str);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: S */
    public final boolean m3956S(long j3, long j4) {
        if (j4 >= j3) {
            return false;
        }
        C0583o c0583o = this.f7286I;
        return c0583o == null || !Objects.equals(c0583o.f2154n, "audio/opus") || j3 - j4 > 80000;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b2 A[Catch: p -> 0x00c2, TryCatch #0 {p -> 0x00c2, blocks: (B:55:0x00ae, B:57:0x00b2, B:59:0x00b9, B:64:0x00c4, B:68:0x00d1), top: B:78:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00d0  */
    /* JADX INFO: renamed from: T */
    public final void m3957T() {
        C0583o c0583o;
        InterfaceC1384h interfaceC1384h;
        if (this.f7294Q != null || this.f7316m0 || (c0583o = this.f7285H) == null) {
            return;
        }
        boolean z3 = true;
        boolean z4 = this.f7288K == null && mo2994q0(c0583o);
        String str = c0583o.f2154n;
        if (z4) {
            m3946E();
            boolean zEquals = "audio/mp4a-latm".equals(str);
            C1599h c1599h = this.f7277D;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                c1599h.getClass();
                c1599h.f7247r = 32;
            } else {
                c1599h.getClass();
                c1599h.f7247r = 1;
            }
            this.f7316m0 = true;
            return;
        }
        m3967m0(this.f7288K);
        if (this.f7287J == null) {
            try {
                interfaceC1384h = this.f7287J;
                if (interfaceC1384h == null && (interfaceC1384h.mo3460a() == 3 || this.f7287J.mo3460a() == 4)) {
                    InterfaceC1384h interfaceC1384h2 = this.f7287J;
                    AbstractC0646n.m1631i(str);
                    if (!interfaceC1384h2.mo3465f(str)) {
                        z3 = false;
                    }
                } else {
                    z3 = false;
                }
                m3958U(this.f7290M, z3);
            } catch (C1607p e3) {
                throw m2079e(e3, c0583o, false, 4001);
            }
        } else {
            AbstractC0646n.m1630h(this.f7290M == null);
            InterfaceC1384h interfaceC1384h3 = this.f7287J;
            InterfaceC0766a interfaceC0766aMo3467h = interfaceC1384h3.mo3467h();
            if (C1395s.f6192c && (interfaceC0766aMo3467h instanceof C1395s)) {
                int iMo3460a = interfaceC1384h3.mo3460a();
                if (iMo3460a == 1) {
                    C1383g c1383gMo3466g = interfaceC1384h3.mo3466g();
                    c1383gMo3466g.getClass();
                    throw m2079e(c1383gMo3466g, this.f7285H, false, c1383gMo3466g.f6176g);
                }
                if (iMo3460a == 4) {
                    if (interfaceC0766aMo3467h == null) {
                        if (interfaceC1384h3.mo3466g() != null) {
                        }
                    } else if (interfaceC0766aMo3467h instanceof C1395s) {
                        C1395s c1395s = (C1395s) interfaceC0766aMo3467h;
                        this.f7290M = new MediaCrypto(c1395s.f6193a, c1395s.f6194b);
                    }
                    interfaceC1384h = this.f7287J;
                    if (interfaceC1384h == null) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    m3958U(this.f7290M, z3);
                }
            } else {
                if (interfaceC0766aMo3467h == null) {
                    if (interfaceC1384h3.mo3466g() != null) {
                    }
                } else if (interfaceC0766aMo3467h instanceof C1395s) {
                    C1395s c1395s2 = (C1395s) interfaceC0766aMo3467h;
                    try {
                        this.f7290M = new MediaCrypto(c1395s2.f6193a, c1395s2.f6194b);
                    } catch (MediaCryptoException e4) {
                        throw m2079e(e4, this.f7285H, false, 6006);
                    }
                }
                interfaceC1384h = this.f7287J;
                if (interfaceC1384h == null) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                m3958U(this.f7290M, z3);
            }
        }
        MediaCrypto mediaCrypto = this.f7290M;
        if (mediaCrypto == null || this.f7294Q != null) {
            return;
        }
        mediaCrypto.release();
        this.f7290M = null;
    }

    /* JADX INFO: renamed from: U */
    public final void m3958U(MediaCrypto mediaCrypto, boolean z3) throws C1607p {
        C0583o c0583o = this.f7285H;
        c0583o.getClass();
        if (this.f7299V == null) {
            try {
                List listM3952K = m3952K(z3);
                this.f7299V = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listM3952K;
                if (!arrayList.isEmpty()) {
                    this.f7299V.add((C1606o) arrayList.get(0));
                }
                this.f7300W = null;
            } catch (C1613v e3) {
                throw new C1607p(c0583o, e3, z3, -49998);
            }
        }
        if (this.f7299V.isEmpty()) {
            throw new C1607p(c0583o, null, z3, -49999);
        }
        ArrayDeque arrayDeque = this.f7299V;
        arrayDeque.getClass();
        while (this.f7294Q == null) {
            C1606o c1606o = (C1606o) arrayDeque.peekFirst();
            c1606o.getClass();
            if (!mo3969o0(c1606o)) {
                return;
            }
            try {
                m3955R(c1606o, mediaCrypto);
            } catch (Exception e4) {
                AbstractC0646n.m1648z("MediaCodecRenderer", "Failed to initialize decoder: " + c1606o, e4);
                arrayDeque.removeFirst();
                C1607p c1607p = new C1607p("Decoder init failed: " + c1606o.f7252a + ", " + c0583o, e4, c0583o.f2154n, z3, c1606o, e4 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e4).getDiagnosticInfo() : null);
                mo2985V(c1607p);
                C1607p c1607p2 = this.f7300W;
                if (c1607p2 == null) {
                    this.f7300W = c1607p;
                } else {
                    this.f7300W = new C1607p(c1607p2.getMessage(), c1607p2.getCause(), c1607p2.f7261g, c1607p2.f7262h, c1607p2.f7263i, c1607p2.f7264j);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.f7300W;
                }
            }
        }
        this.f7299V = null;
    }

    /* JADX INFO: renamed from: V */
    public abstract void mo2985V(Exception exc);

    /* JADX INFO: renamed from: W */
    public abstract void mo2986W(long j3, long j4, String str);

    /* JADX INFO: renamed from: X */
    public abstract void mo2987X(String str);

    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e3, code lost:
    
        if (r4.mo3465f(r3) != false) goto L134;
     */
    /* JADX INFO: renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0831i mo2988Y(C0106b c0106b) {
        C0583o c0583o;
        int i3;
        InterfaceC0766a interfaceC0766aMo3467h;
        InterfaceC0766a interfaceC0766aMo3467h2;
        boolean z3 = true;
        this.f7272A0 = true;
        C0583o c0583o2 = (C0583o) c0106b.f141i;
        c0583o2.getClass();
        String str = c0583o2.f2154n;
        if (str == null) {
            throw m2079e(new IllegalArgumentException("Sample MIME type is null."), c0583o2, false, 4005);
        }
        if (!str.equals("video/av01") || c0583o2.f2157q.isEmpty()) {
            c0583o = c0583o2;
        } else {
            C0582n c0582nM1447a = c0583o2.m1447a();
            c0582nM1447a.f2117p = null;
            c0583o = new C0583o(c0582nM1447a);
        }
        InterfaceC1384h interfaceC1384h = (InterfaceC1384h) c0106b.f140h;
        InterfaceC1384h interfaceC1384h2 = this.f7288K;
        if (interfaceC1384h2 != interfaceC1384h) {
            if (interfaceC1384h != null) {
                interfaceC1384h.mo3462c(null);
            }
            if (interfaceC1384h2 != null) {
                interfaceC1384h2.mo3463d(null);
            }
        }
        this.f7288K = interfaceC1384h;
        this.f7285H = c0583o;
        if (this.f7316m0) {
            this.f7318o0 = true;
            return null;
        }
        InterfaceC1603l interfaceC1603l = this.f7294Q;
        if (interfaceC1603l == null) {
            this.f7299V = null;
            m3957T();
            return null;
        }
        C1606o c1606o = this.f7301X;
        c1606o.getClass();
        C0583o c0583o3 = this.f7295R;
        c0583o3.getClass();
        InterfaceC1384h interfaceC1384h3 = this.f7287J;
        InterfaceC1384h interfaceC1384h4 = this.f7288K;
        if (interfaceC1384h3 != interfaceC1384h4) {
            if (interfaceC1384h4 != null && interfaceC1384h3 != null && (interfaceC0766aMo3467h = interfaceC1384h4.mo3467h()) != null && (interfaceC0766aMo3467h2 = interfaceC1384h3.mo3467h()) != null && interfaceC0766aMo3467h.getClass().equals(interfaceC0766aMo3467h2.getClass())) {
                if (interfaceC0766aMo3467h instanceof C1395s) {
                    if (interfaceC1384h4.mo3464e().equals(interfaceC1384h3.mo3464e()) && AbstractC0632A.f2454a >= 23) {
                        UUID uuid = AbstractC0571e.f2061e;
                        if (!uuid.equals(interfaceC1384h3.mo3464e()) && !uuid.equals(interfaceC1384h4.mo3464e())) {
                            if (!c1606o.f7257f) {
                                if (interfaceC1384h4.mo3460a() != 2) {
                                    if (interfaceC1384h4.mo3460a() == 3 || interfaceC1384h4.mo3460a() == 4) {
                                        String str2 = c0583o.f2154n;
                                        str2.getClass();
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (this.f7323t0) {
                this.f7321r0 = 1;
                this.f7322s0 = 3;
            } else {
                m3964i0();
                m3957T();
            }
            return new C0831i(c1606o.f7252a, c0583o3, c0583o, 0, 128);
        }
        boolean z4 = this.f7288K != this.f7287J;
        AbstractC0646n.m1630h(!z4 || AbstractC0632A.f2454a >= 23);
        C0831i c0831iMo2980C = mo2980C(c1606o, c0583o3, c0583o);
        int i4 = c0831iMo2980C.f3522d;
        if (i4 != 0) {
            i3 = 16;
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new IllegalStateException();
                    }
                    if (m3971s0(c0583o)) {
                        this.f7295R = c0583o;
                        if (z4 && !m3947F()) {
                            i3 = 2;
                        }
                    }
                } else if (m3971s0(c0583o)) {
                    this.f7319p0 = true;
                    this.f7320q0 = 1;
                    int i5 = this.f7302Y;
                    if (i5 != 2 && (i5 != 1 || c0583o.f2161u != c0583o3.f2161u || c0583o.f2162v != c0583o3.f2162v)) {
                        z3 = false;
                    }
                    this.f7306c0 = z3;
                    this.f7295R = c0583o;
                    if (z4 && !m3947F()) {
                        i3 = 2;
                    }
                }
            } else if (m3971s0(c0583o)) {
                this.f7295R = c0583o;
                if (z4) {
                    if (!m3947F()) {
                        i3 = 2;
                    }
                } else if (this.f7323t0) {
                    this.f7321r0 = 1;
                    if (this.f7304a0) {
                        this.f7322s0 = 3;
                        i3 = 2;
                    } else {
                        this.f7322s0 = 1;
                    }
                }
            }
            return (i4 != 0 || (this.f7294Q == interfaceC1603l && this.f7322s0 != 3)) ? c0831iMo2980C : new C0831i(c1606o.f7252a, c0583o3, c0583o, 0, i3);
        }
        if (this.f7323t0) {
            this.f7321r0 = 1;
            this.f7322s0 = 3;
        } else {
            m3964i0();
            m3957T();
        }
        i3 = 0;
        if (i4 != 0) {
        }
    }

    /* JADX INFO: renamed from: Z */
    public abstract void mo2989Z(C0583o c0583o, MediaFormat mediaFormat);

    /* JADX INFO: renamed from: b0 */
    public void mo3959b0(long j3) {
        this.f7282F0 = j3;
        while (true) {
            ArrayDeque arrayDeque = this.f7281F;
            if (arrayDeque.isEmpty() || j3 < ((C1608q) arrayDeque.peek()).f7266a) {
                return;
            }
            C1608q c1608q = (C1608q) arrayDeque.poll();
            c1608q.getClass();
            m3968n0(c1608q);
            mo2991c0();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public abstract void mo2991c0();

    /* JADX INFO: renamed from: f0 */
    public final void m3962f0() throws C0839o {
        int i3 = this.f7322s0;
        if (i3 == 1) {
            m3950I();
            return;
        }
        if (i3 == 2) {
            m3950I();
            m3972t0();
        } else if (i3 != 3) {
            this.f7332z0 = true;
            mo2993j0();
        } else {
            m3964i0();
            m3957T();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public abstract boolean mo2992g0(long j3, long j4, InterfaceC1603l interfaceC1603l, ByteBuffer byteBuffer, int i3, int i4, int i5, long j5, boolean z3, boolean z4, C0583o c0583o);

    /* JADX INFO: renamed from: h0 */
    public final boolean m3963h0(int i3) throws C0839o {
        C0106b c0106b = this.f3479i;
        c0106b.m526n();
        C0771f c0771f = this.f7271A;
        c0771f.mo1883e();
        int iM2094u = m2094u(c0106b, c0771f, i3 | 4);
        if (iM2094u == -5) {
            mo2988Y(c0106b);
            return true;
        }
        if (iM2094u != -4 || !c0771f.m1787c(4)) {
            return false;
        }
        this.f7330y0 = true;
        m3962f0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public final void m3964i0() {
        try {
            InterfaceC1603l interfaceC1603l = this.f7294Q;
            if (interfaceC1603l != null) {
                interfaceC1603l.mo3367a();
                this.f7278D0.f3505b++;
                C1606o c1606o = this.f7301X;
                c1606o.getClass();
                mo2987X(c1606o.f7252a);
            }
            this.f7294Q = null;
            try {
                MediaCrypto mediaCrypto = this.f7290M;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f7290M = null;
                m3967m0(null);
                m3966l0();
            }
        } catch (Throwable th) {
            this.f7294Q = null;
            try {
                MediaCrypto mediaCrypto2 = this.f7290M;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.f7290M = null;
                m3967m0(null);
                m3966l0();
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void mo3965k0() {
        this.f7311h0 = -1;
        this.f7273B.f3144k = null;
        this.f7312i0 = -1;
        this.f7313j0 = null;
        this.f7310g0 = -9223372036854775807L;
        this.f7324u0 = false;
        this.f7309f0 = -9223372036854775807L;
        this.f7323t0 = false;
        this.f7306c0 = false;
        this.f7307d0 = false;
        this.f7314k0 = false;
        this.f7315l0 = false;
        this.f7326w0 = -9223372036854775807L;
        this.f7328x0 = -9223372036854775807L;
        this.f7282F0 = -9223372036854775807L;
        this.f7321r0 = 0;
        this.f7322s0 = 0;
        this.f7320q0 = this.f7319p0 ? 1 : 0;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: l */
    public boolean mo2085l() {
        boolean zMo3786h;
        if (this.f7285H != null) {
            if (m2083j()) {
                zMo3786h = this.f3490t;
            } else {
                InterfaceC1931Z interfaceC1931Z = this.f3485o;
                interfaceC1931Z.getClass();
                zMo3786h = interfaceC1931Z.mo3786h();
            }
            if (!zMo3786h) {
                if (!(this.f7312i0 >= 0)) {
                    if (this.f7310g0 != -9223372036854775807L) {
                        this.f3483m.getClass();
                        if (SystemClock.elapsedRealtime() < this.f7310g0) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m3966l0() {
        mo3965k0();
        this.f7276C0 = null;
        this.f7299V = null;
        this.f7301X = null;
        this.f7295R = null;
        this.f7296S = null;
        this.f7297T = false;
        this.f7325v0 = false;
        this.f7298U = -1.0f;
        this.f7302Y = 0;
        this.f7303Z = false;
        this.f7304a0 = false;
        this.f7305b0 = false;
        this.f7308e0 = false;
        this.f7319p0 = false;
        this.f7320q0 = 0;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: m */
    public void mo2086m() {
        this.f7285H = null;
        m3968n0(C1608q.f7265e);
        this.f7281F.clear();
        m3951J();
    }

    /* JADX INFO: renamed from: m0 */
    public final void m3967m0(InterfaceC1384h interfaceC1384h) {
        InterfaceC1384h interfaceC1384h2 = this.f7287J;
        if (interfaceC1384h2 != interfaceC1384h) {
            if (interfaceC1384h != null) {
                interfaceC1384h.mo3462c(null);
            }
            if (interfaceC1384h2 != null) {
                interfaceC1384h2.mo3463d(null);
            }
        }
        this.f7287J = interfaceC1384h;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m3968n0(C1608q c1608q) {
        this.f7280E0 = c1608q;
        if (c1608q.f7268c != -9223372036854775807L) {
            this.f7284G0 = true;
            mo2990a0();
        }
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: o */
    public void mo2088o(long j3, boolean z3) {
        this.f7330y0 = false;
        this.f7332z0 = false;
        this.f7274B0 = false;
        if (this.f7316m0) {
            this.f7277D.mo1883e();
            this.f7275C.mo1883e();
            this.f7317n0 = false;
            C1121C c1121c = this.f7283G;
            c1121c.getClass();
            c1121c.f5195a = InterfaceC0604d.f2252a;
            c1121c.f5197c = 0;
            c1121c.f5196b = 2;
        } else if (m3951J()) {
            m3957T();
        }
        if (this.f7280E0.f7269d.m1018j() > 0) {
            this.f7272A0 = true;
        }
        this.f7280E0.f7269d.m1011c();
        this.f7281F.clear();
    }

    /* JADX INFO: renamed from: o0 */
    public boolean mo3969o0(C1606o c1606o) {
        return true;
    }

    /* JADX INFO: renamed from: p0 */
    public boolean mo3970p0(C0771f c0771f) {
        return false;
    }

    /* JADX INFO: renamed from: q0 */
    public boolean mo2994q0(C0583o c0583o) {
        return false;
    }

    /* JADX INFO: renamed from: r0 */
    public abstract int mo2995r0(C1601j c1601j, C0583o c0583o);

    /* JADX INFO: renamed from: s0 */
    public final boolean m3971s0(C0583o c0583o) {
        if (AbstractC0632A.f2454a >= 23 && this.f7294Q != null && this.f7322s0 != 3 && this.f3484n != 0) {
            float f = this.f7293P;
            c0583o.getClass();
            C0583o[] c0583oArr = this.f3486p;
            c0583oArr.getClass();
            float fMo2981N = mo2981N(f, c0583oArr);
            float f3 = this.f7298U;
            if (f3 != fMo2981N) {
                if (fMo2981N == -1.0f) {
                    if (this.f7323t0) {
                        this.f7321r0 = 1;
                        this.f7322s0 = 3;
                        return false;
                    }
                    m3964i0();
                    m3957T();
                    return false;
                }
                if (f3 != -1.0f || fMo2981N > this.f7331z) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fMo2981N);
                    InterfaceC1603l interfaceC1603l = this.f7294Q;
                    interfaceC1603l.getClass();
                    interfaceC1603l.mo3369c(bundle);
                    this.f7298U = fMo2981N;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo2093t(C0583o[] c0583oArr, long j3, long j4, C1907A c1907a) {
        if (this.f7280E0.f7268c == -9223372036854775807L) {
            m3968n0(new C1608q(-9223372036854775807L, j3, j4));
            return;
        }
        ArrayDeque arrayDeque = this.f7281F;
        if (arrayDeque.isEmpty()) {
            long j5 = this.f7326w0;
            if (j5 != -9223372036854775807L) {
                long j6 = this.f7282F0;
                if (j6 != -9223372036854775807L) {
                }
            }
            m3968n0(new C1608q(-9223372036854775807L, j3, j4));
            if (this.f7280E0.f7268c != -9223372036854775807L) {
                mo2991c0();
                return;
            }
            return;
        }
        arrayDeque.add(new C1608q(this.f7326w0, j3, j4));
    }

    /* JADX INFO: renamed from: t0 */
    public final void m3972t0() throws C0839o {
        InterfaceC1384h interfaceC1384h = this.f7288K;
        interfaceC1384h.getClass();
        InterfaceC0766a interfaceC0766aMo3467h = interfaceC1384h.mo3467h();
        if (interfaceC0766aMo3467h instanceof C1395s) {
            try {
                MediaCrypto mediaCrypto = this.f7290M;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((C1395s) interfaceC0766aMo3467h).f6194b);
            } catch (MediaCryptoException e3) {
                throw m2079e(e3, this.f7285H, false, 6006);
            }
        }
        m3967m0(this.f7288K);
        this.f7321r0 = 0;
        this.f7322s0 = 0;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m3973u0(long j3) {
        C0583o c0583o = (C0583o) this.f7280E0.f7269d.m1016h(j3);
        if (c0583o == null && this.f7284G0 && this.f7296S != null) {
            c0583o = (C0583o) this.f7280E0.f7269d.m1015g();
        }
        if (c0583o != null) {
            this.f7286I = c0583o;
        } else if (!this.f7297T || this.f7286I == null) {
            return;
        }
        C0583o c0583o2 = this.f7286I;
        c0583o2.getClass();
        mo2989Z(c0583o2, this.f7296S);
        this.f7297T = false;
        this.f7284G0 = false;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: v */
    public void mo2095v(long j3, long j4) {
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (this.f7274B0) {
            this.f7274B0 = false;
            m3962f0();
        }
        C0839o c0839o = this.f7276C0;
        if (c0839o != null) {
            this.f7276C0 = null;
            throw c0839o;
        }
        try {
            if (this.f7332z0) {
                mo2993j0();
                return;
            }
            if (this.f7285H != null || m3963h0(2)) {
                m3957T();
                if (this.f7316m0) {
                    Trace.beginSection("bypassRender");
                    while (m3944B(j3, j4)) {
                    }
                    Trace.endSection();
                } else if (this.f7294Q != null) {
                    this.f3483m.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (m3948G(j3, j4)) {
                        long j5 = this.f7291N;
                        if (j5 != -9223372036854775807L) {
                            this.f3483m.getClass();
                            z4 = SystemClock.elapsedRealtime() - jElapsedRealtime < j5;
                        }
                        if (!z4) {
                            break;
                        }
                    }
                    while (m3949H()) {
                        long j6 = this.f7291N;
                        if (j6 != -9223372036854775807L) {
                            this.f3483m.getClass();
                            z3 = SystemClock.elapsedRealtime() - jElapsedRealtime < j6;
                        }
                        if (!z3) {
                            break;
                        }
                    }
                    Trace.endSection();
                } else {
                    C0829h c0829h = this.f7278D0;
                    int i3 = c0829h.f3507d;
                    InterfaceC1931Z interfaceC1931Z = this.f3485o;
                    interfaceC1931Z.getClass();
                    c0829h.f3507d = i3 + interfaceC1931Z.mo3789v(j3 - this.f3487q);
                    m3963h0(1);
                }
                synchronized (this.f7278D0) {
                }
            }
        } catch (MediaCodec.CryptoException e3) {
            throw m2079e(e3, this.f7285H, false, AbstractC0632A.m1602u(e3.getErrorCode()));
        } catch (IllegalStateException e4) {
            boolean z6 = e4 instanceof MediaCodec.CodecException;
            if (!z6) {
                StackTraceElement[] stackTrace = e4.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e4;
                }
            }
            mo2985V(e4);
            if (z6 && ((MediaCodec.CodecException) e4).isRecoverable()) {
                z5 = true;
            }
            if (z5) {
                m3964i0();
            }
            C1605n c1605nMo3945D = mo3945D(e4, this.f7301X);
            throw m2079e(c1605nMo3945D, this.f7285H, z5, c1605nMo3945D.f7251g == 1101 ? 4006 : 4003);
        }
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: y */
    public void mo2098y(float f, float f3) {
        this.f7292O = f;
        this.f7293P = f3;
        m3971s0(this.f7295R);
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: z */
    public final int mo2099z(C0583o c0583o) throws C0839o {
        try {
            return mo2995r0(this.f7329y, c0583o);
        } catch (C1613v e3) {
            throw m2079e(e3, c0583o, false, 4002);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void mo2990a0() {
    }

    /* JADX INFO: renamed from: j0 */
    public void mo2993j0() {
    }

    /* JADX INFO: renamed from: d0 */
    public void mo3960d0(C0771f c0771f) {
    }

    /* JADX INFO: renamed from: e0 */
    public void mo3961e0(C0583o c0583o) {
    }
}
