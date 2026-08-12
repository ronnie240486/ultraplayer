package p036M0;

import p064W.AbstractC0632A;
import p064W.C0651s;
import p145s0.InterfaceC2226E;

/* JADX INFO: renamed from: M0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0375l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2226E f1200a;

    /* JADX INFO: renamed from: d */
    public C0387x f1203d;

    /* JADX INFO: renamed from: e */
    public C0372i f1204e;

    /* JADX INFO: renamed from: f */
    public int f1205f;

    /* JADX INFO: renamed from: g */
    public int f1206g;

    /* JADX INFO: renamed from: h */
    public int f1207h;

    /* JADX INFO: renamed from: i */
    public int f1208i;

    /* JADX INFO: renamed from: l */
    public boolean f1211l;

    /* JADX INFO: renamed from: b */
    public final C0386w f1201b = new C0386w();

    /* JADX INFO: renamed from: c */
    public final C0651s f1202c = new C0651s();

    /* JADX INFO: renamed from: j */
    public final C0651s f1209j = new C0651s(1);

    /* JADX INFO: renamed from: k */
    public final C0651s f1210k = new C0651s();

    public C0375l(InterfaceC2226E interfaceC2226E, C0387x c0387x, C0372i c0372i) {
        this.f1200a = interfaceC2226E;
        this.f1203d = c0387x;
        this.f1204e = c0372i;
        this.f1203d = c0387x;
        this.f1204e = c0372i;
        interfaceC2226E.mo1176e(c0387x.f1336a.f1308g);
        m1035e();
    }

    /* JADX INFO: renamed from: a */
    public final int m1031a() {
        int i3;
        if (this.f1211l) {
            i3 = this.f1201b.f1328j[this.f1205f] ? 1 : 0;
        } else {
            i3 = this.f1203d.f1342g[this.f1205f];
        }
        return m1032b() != null ? i3 | 1073741824 : i3;
    }

    /* JADX INFO: renamed from: b */
    public final C0385v m1032b() {
        if (!this.f1211l) {
            return null;
        }
        C0386w c0386w = this.f1201b;
        C0372i c0372i = c0386w.f1319a;
        int i3 = AbstractC0632A.f2454a;
        int i4 = c0372i.f1192a;
        C0385v c0385v = c0386w.f1331m;
        if (c0385v == null) {
            c0385v = this.f1203d.f1336a.f1313l[i4];
        }
        if (c0385v == null || !c0385v.f1314a) {
            return null;
        }
        return c0385v;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1033c() {
        this.f1205f++;
        if (!this.f1211l) {
            return false;
        }
        int i3 = this.f1206g + 1;
        this.f1206g = i3;
        int[] iArr = this.f1201b.f1325g;
        int i4 = this.f1207h;
        if (i3 != iArr[i4]) {
            return true;
        }
        this.f1207h = i4 + 1;
        this.f1206g = 0;
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final int m1034d(int i3, int i4) {
        C0651s c0651s;
        C0385v c0385vM1032b = m1032b();
        if (c0385vM1032b == null) {
            return 0;
        }
        C0386w c0386w = this.f1201b;
        int length = c0385vM1032b.f1317d;
        if (length != 0) {
            c0651s = c0386w.f1332n;
        } else {
            int i5 = AbstractC0632A.f2454a;
            byte[] bArr = c0385vM1032b.f1318e;
            int length2 = bArr.length;
            C0651s c0651s2 = this.f1210k;
            c0651s2.m1663E(bArr, length2);
            length = bArr.length;
            c0651s = c0651s2;
        }
        boolean z3 = c0386w.f1329k && c0386w.f1330l[this.f1205f];
        boolean z4 = z3 || i4 != 0;
        C0651s c0651s3 = this.f1209j;
        c0651s3.f2520a[0] = (byte) ((z4 ? 128 : 0) | length);
        c0651s3.m1665G(0);
        InterfaceC2226E interfaceC2226E = this.f1200a;
        interfaceC2226E.mo1175d(c0651s3, 1, 1);
        interfaceC2226E.mo1175d(c0651s, length, 1);
        if (!z4) {
            return length + 1;
        }
        C0651s c0651s4 = this.f1202c;
        if (!z3) {
            c0651s4.m1662D(8);
            byte[] bArr2 = c0651s4.f2520a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i4 & 255);
            bArr2[4] = (byte) ((i3 >> 24) & 255);
            bArr2[5] = (byte) ((i3 >> 16) & 255);
            bArr2[6] = (byte) ((i3 >> 8) & 255);
            bArr2[7] = (byte) (i3 & 255);
            interfaceC2226E.mo1175d(c0651s4, 8, 1);
            return length + 9;
        }
        C0651s c0651s5 = c0386w.f1332n;
        int iM1659A = c0651s5.m1659A();
        c0651s5.m1666H(-2);
        int i6 = (iM1659A * 6) + 2;
        if (i4 != 0) {
            c0651s4.m1662D(i6);
            byte[] bArr3 = c0651s4.f2520a;
            c0651s5.m1671e(bArr3, 0, i6);
            int i7 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i4;
            bArr3[2] = (byte) ((i7 >> 8) & 255);
            bArr3[3] = (byte) (i7 & 255);
        } else {
            c0651s4 = c0651s5;
        }
        interfaceC2226E.mo1175d(c0651s4, i6, 1);
        return length + 1 + i6;
    }

    /* JADX INFO: renamed from: e */
    public final void m1035e() {
        C0386w c0386w = this.f1201b;
        c0386w.f1322d = 0;
        c0386w.f1334p = 0L;
        c0386w.f1335q = false;
        c0386w.f1329k = false;
        c0386w.f1333o = false;
        c0386w.f1331m = null;
        this.f1205f = 0;
        this.f1207h = 0;
        this.f1206g = 0;
        this.f1208i = 0;
        this.f1211l = false;
    }
}
