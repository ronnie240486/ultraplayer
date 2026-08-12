package p030K0;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.support.v4.media.session.C0858A;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p009D0.C0106b;
import p034L1.C0346a;
import p046P1.AbstractC0491s;
import p055T.AbstractC0545H;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0633a;
import p064W.C0650r;
import p064W.C0651s;
import p071Y0.C0733D;
import p071Y0.C0739b;
import p071Y0.C0742e;
import p071Y0.C0743f;
import p071Y0.C0744g;
import p071Y0.C0747j;
import p071Y0.C0750m;
import p071Y0.C0753p;
import p071Y0.C0755r;
import p071Y0.C0756s;
import p071Y0.C0757t;
import p071Y0.C0758u;
import p071Y0.C0761x;
import p071Y0.InterfaceC0737H;
import p103h0.InterfaceC1614w;
import p145s0.C2237j;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: K0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0334e implements InterfaceC1614w {

    /* JADX INFO: renamed from: g */
    public int f1062g;

    /* JADX INFO: renamed from: h */
    public Object f1063h;

    public /* synthetic */ C0334e(int i3, Object obj) {
        this.f1062g = i3;
        this.f1063h = obj;
    }

    /* JADX INFO: renamed from: a */
    public Object m921a() {
        int i3 = this.f1062g;
        if (i3 <= 0) {
            return null;
        }
        int i4 = i3 - 1;
        Object[] objArr = (Object[]) this.f1063h;
        Object obj = objArr[i4];
        AbstractC2364c.m4952c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i4] = null;
        this.f1062g--;
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public void m922b(long j3) {
        int i3 = this.f1062g;
        long[] jArr = (long[]) this.f1063h;
        if (i3 == jArr.length) {
            this.f1063h = Arrays.copyOf(jArr, i3 * 2);
        }
        long[] jArr2 = (long[]) this.f1063h;
        int i4 = this.f1062g;
        this.f1062g = i4 + 1;
        jArr2[i4] = j3;
    }

    /* JADX INFO: renamed from: c */
    public void m923c(long[] jArr) {
        int length = this.f1062g + jArr.length;
        long[] jArr2 = (long[]) this.f1063h;
        if (length > jArr2.length) {
            this.f1063h = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, (long[]) this.f1063h, this.f1062g, jArr.length);
        this.f1062g = length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x005d  */
    /* JADX INFO: renamed from: d */
    public InterfaceC0737H m924d(int i3, C0650r c0650r) {
        if (i3 != 2) {
            String str = (String) c0650r.f2514h;
            if (i3 == 3 || i3 == 4) {
                return new C0761x(new C0757t(c0650r.m1655e(), str));
            }
            if (i3 == 21) {
                return new C0761x(new C0744g());
            }
            if (i3 == 27) {
                if (m929i(4)) {
                    return null;
                }
                return new C0761x(new C0753p(new C0858A(m928h(c0650r)), m929i(1), m929i(8)));
            }
            if (i3 == 36) {
                return new C0761x(new C0755r(new C0858A(m928h(c0650r))));
            }
            if (i3 == 45) {
                return new C0761x(new C0758u());
            }
            if (i3 == 89) {
                return new C0761x(new C0744g((List) c0650r.f2515i));
            }
            if (i3 == 172) {
                return new C0761x(new C0739b(str, c0650r.m1655e(), 1));
            }
            if (i3 == 257) {
                return new C0733D(new C0858A("application/vnd.dvb.ait"));
            }
            if (i3 != 138) {
                if (i3 == 139) {
                    return new C0761x(new C0743f(str, c0650r.m1655e(), 5408));
                }
                switch (i3) {
                    case 15:
                        if (m929i(2)) {
                            return null;
                        }
                        return new C0761x(new C0742e(str, false, c0650r.m1655e()));
                    case 16:
                        return new C0761x(new C0750m(new C0106b(m928h(c0650r))));
                    case 17:
                        if (m929i(2)) {
                            return null;
                        }
                        return new C0761x(new C0756s(c0650r.m1655e(), str));
                    default:
                        switch (i3) {
                            case 128:
                                break;
                            case 129:
                                return new C0761x(new C0739b(str, c0650r.m1655e(), 0));
                            case 130:
                                if (!m929i(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i3) {
                                    case 134:
                                        if (m929i(16)) {
                                            return null;
                                        }
                                        return new C0733D(new C0858A("application/x-scte35"));
                                    case 135:
                                        return new C0761x(new C0739b(str, c0650r.m1655e(), 0));
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new C0761x(new C0743f(str, c0650r.m1655e(), 4096));
        }
        return new C0761x(new C0747j(new C0106b(m928h(c0650r))));
    }

    @Override // p103h0.InterfaceC1614w
    /* JADX INFO: renamed from: e */
    public boolean mo925e(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // p103h0.InterfaceC1614w
    /* JADX INFO: renamed from: f */
    public int mo926f() {
        if (((MediaCodecInfo[]) this.f1063h) == null) {
            this.f1063h = new MediaCodecList(this.f1062g).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f1063h).length;
    }

    /* JADX INFO: renamed from: g */
    public long m927g(int i3) {
        if (i3 >= 0 && i3 < this.f1062g) {
            return ((long[]) this.f1063h)[i3];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i3 + ", size is " + this.f1062g);
    }

    /* JADX INFO: renamed from: h */
    public List m928h(C0650r c0650r) {
        String str;
        int i3;
        List listSingletonList;
        boolean zM929i = m929i(32);
        List list = (List) this.f1063h;
        if (zM929i) {
            return list;
        }
        C0651s c0651s = new C0651s((byte[]) c0650r.f2516j);
        while (c0651s.m1667a() > 0) {
            int iM1687u = c0651s.m1687u();
            int iM1687u2 = c0651s.f2521b + c0651s.m1687u();
            if (iM1687u == 134) {
                ArrayList arrayList = new ArrayList();
                int iM1687u3 = c0651s.m1687u() & 31;
                for (int i4 = 0; i4 < iM1687u3; i4++) {
                    String strM1685s = c0651s.m1685s(3, StandardCharsets.UTF_8);
                    int iM1687u4 = c0651s.m1687u();
                    boolean z3 = (iM1687u4 & 128) != 0;
                    if (z3) {
                        i3 = iM1687u4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i3 = 1;
                    }
                    byte bM1687u = (byte) c0651s.m1687u();
                    c0651s.m1666H(1);
                    if (z3) {
                        boolean z4 = (bM1687u & 64) != 0;
                        byte[] bArr = AbstractC0633a.f2468a;
                        listSingletonList = Collections.singletonList(z4 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    C0582n c0582n = new C0582n();
                    c0582n.f2114m = AbstractC0545H.m1364l(str);
                    c0582n.f2105d = strM1685s;
                    c0582n.f2097G = i3;
                    c0582n.f2117p = listSingletonList;
                    arrayList.add(new C0583o(c0582n));
                }
                list = arrayList;
            }
            c0651s.m1665G(iM1687u2);
        }
        return list;
    }

    /* JADX INFO: renamed from: i */
    public boolean m929i(int i3) {
        return (i3 & this.f1062g) != 0;
    }

    @Override // p103h0.InterfaceC1614w
    /* JADX INFO: renamed from: j */
    public MediaCodecInfo mo930j(int i3) {
        if (((MediaCodecInfo[]) this.f1063h) == null) {
            this.f1063h = new MediaCodecList(this.f1062g).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f1063h)[i3];
    }

    /* JADX INFO: renamed from: k */
    public long m931k(C2237j c2237j) {
        C0651s c0651s = (C0651s) this.f1063h;
        int i3 = 0;
        c2237j.mo338i(c0651s.f2520a, 0, 1, false);
        int i4 = c0651s.f2520a[0] & 255;
        if (i4 == 0) {
            return Long.MIN_VALUE;
        }
        int i5 = 128;
        int i6 = 0;
        while ((i4 & i5) == 0) {
            i5 >>= 1;
            i6++;
        }
        int i7 = i4 & (~i5);
        c2237j.mo338i(c0651s.f2520a, 1, i6, false);
        while (i3 < i6) {
            i3++;
            i7 = (c0651s.f2520a[i3] & 255) + (i7 << 8);
        }
        this.f1062g = i6 + 1 + this.f1062g;
        return i7;
    }

    /* JADX INFO: renamed from: l */
    public void m932l(Object obj) {
        AbstractC2364c.m4954e(obj, "instance");
        int i3 = this.f1062g;
        int i4 = 0;
        while (true) {
            Object[] objArr = (Object[]) this.f1063h;
            if (i4 >= i3) {
                int i5 = this.f1062g;
                if (i5 < objArr.length) {
                    objArr[i5] = obj;
                    this.f1062g = i5 + 1;
                    return;
                }
                return;
            }
            if (objArr[i4] == obj) {
                throw new IllegalStateException("Already in the pool!");
            }
            i4++;
        }
    }

    @Override // p103h0.InterfaceC1614w
    /* JADX INFO: renamed from: t */
    public boolean mo933t(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // p103h0.InterfaceC1614w
    /* JADX INFO: renamed from: x */
    public boolean mo934x() {
        return true;
    }

    public C0334e(C0346a c0346a, int i3) {
        AbstractC0491s.m1213e(c0346a);
        this.f1063h = c0346a;
        this.f1062g = i3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0334e(int i3, byte b3) {
        this(32, 2);
        switch (i3) {
            case 2:
                break;
            default:
                this.f1063h = new C0651s(8);
                break;
        }
    }

    public C0334e(int i3, int i4) {
        switch (i4) {
            case 7:
                if (i3 > 0) {
                    this.f1063h = new Object[i3];
                    return;
                }
                throw new IllegalArgumentException("The max pool size must be > 0");
            default:
                this.f1063h = new long[i3];
                return;
        }
    }

    public C0334e(IOException iOException, int i3) {
        this.f1063h = iOException;
        this.f1062g = i3;
    }
}
