package p039N0;

import java.io.EOFException;
import p009D0.C0106b;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p070Y.C0719p;
import p070Y.InterfaceC0710g;
import p070Y.InterfaceC0711h;
import p145s0.C2237j;

/* JADX INFO: renamed from: N0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0409e implements InterfaceC0710g {

    /* JADX INFO: renamed from: g */
    public int f1379g;

    /* JADX INFO: renamed from: h */
    public int f1380h;

    /* JADX INFO: renamed from: i */
    public boolean f1381i;

    /* JADX INFO: renamed from: j */
    public final Object f1382j;

    /* JADX INFO: renamed from: k */
    public Object f1383k;

    public C0409e(int i3) {
        switch (i3) {
            case 1:
                this.f1382j = new C0106b(17);
                this.f1379g = 8000;
                this.f1380h = 8000;
                break;
            default:
                this.f1382j = new C0410f();
                this.f1383k = new C0651s(new byte[65025], 0);
                this.f1379g = -1;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m1104a(int i3) {
        int i4;
        int i5 = 0;
        this.f1380h = 0;
        do {
            int i6 = this.f1380h;
            int i7 = i3 + i6;
            C0410f c0410f = (C0410f) this.f1382j;
            if (i7 >= c0410f.f1386c) {
                break;
            }
            int[] iArr = c0410f.f1389f;
            this.f1380h = i6 + 1;
            i4 = iArr[i6 + i3];
            i5 += i4;
        } while (i4 == 255);
        return i5;
    }

    /* JADX INFO: renamed from: b */
    public boolean m1105b(C2237j c2237j) {
        int i3;
        AbstractC0646n.m1630h(c2237j != null);
        boolean z3 = this.f1381i;
        C0651s c0651s = (C0651s) this.f1383k;
        if (z3) {
            this.f1381i = false;
            c0651s.m1662D(0);
        }
        while (!this.f1381i) {
            int i4 = this.f1379g;
            C0410f c0410f = (C0410f) this.f1382j;
            if (i4 < 0) {
                if (c0410f.m1107b(c2237j, -1L) && c0410f.m1106a(c2237j, true)) {
                    int iM1104a = c0410f.f1387d;
                    if ((c0410f.f1384a & 1) == 1 && c0651s.f2522c == 0) {
                        iM1104a += m1104a(0);
                        i3 = this.f1380h;
                    } else {
                        i3 = 0;
                    }
                    try {
                        c2237j.mo335d(iM1104a);
                        this.f1379g = i3;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iM1104a2 = m1104a(this.f1379g);
            int i5 = this.f1379g + this.f1380h;
            if (iM1104a2 > 0) {
                c0651s.m1668b(c0651s.f2522c + iM1104a2);
                c2237j.mo336f(c0651s.f2520a, c0651s.f2522c, iM1104a2, false);
                c0651s.m1664F(c0651s.f2522c + iM1104a2);
                this.f1381i = c0410f.f1389f[i5 + (-1)] != 255;
            }
            if (i5 == c0410f.f1386c) {
                i5 = -1;
            }
            this.f1379g = i5;
        }
        return true;
    }

    @Override // p070Y.InterfaceC0710g
    /* JADX INFO: renamed from: f */
    public InterfaceC0711h mo518f() {
        return new C0719p((String) this.f1383k, this.f1379g, this.f1380h, this.f1381i, (C0106b) this.f1382j);
    }
}
