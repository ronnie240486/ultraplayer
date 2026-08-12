package p071Y0;

import p064W.AbstractC0632A;
import p064W.C0651s;
import p064W.C0656x;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: Y0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0733D implements InterfaceC0737H {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0732C f2804a;

    /* JADX INFO: renamed from: b */
    public final C0651s f2805b = new C0651s(32);

    /* JADX INFO: renamed from: c */
    public int f2806c;

    /* JADX INFO: renamed from: d */
    public int f2807d;

    /* JADX INFO: renamed from: e */
    public boolean f2808e;

    /* JADX INFO: renamed from: f */
    public boolean f2809f;

    public C0733D(InterfaceC0732C interfaceC0732C) {
        this.f2804a = interfaceC0732C;
    }

    @Override // p071Y0.InterfaceC0737H
    /* JADX INFO: renamed from: a */
    public final void mo1845a(C0656x c0656x, InterfaceC2242o interfaceC2242o, C0736G c0736g) {
        this.f2804a.mo513a(c0656x, interfaceC2242o, c0736g);
        this.f2809f = true;
    }

    @Override // p071Y0.InterfaceC0737H
    /* JADX INFO: renamed from: b */
    public final void mo1846b() {
        this.f2809f = true;
    }

    @Override // p071Y0.InterfaceC0737H
    /* JADX INFO: renamed from: c */
    public final void mo1847c(int i3, C0651s c0651s) {
        int iM1687u;
        boolean z3 = (i3 & 1) != 0;
        if (z3) {
            iM1687u = c0651s.f2521b + c0651s.m1687u();
        } else {
            iM1687u = -1;
        }
        if (this.f2809f) {
            if (!z3) {
                return;
            }
            this.f2809f = false;
            c0651s.m1665G(iM1687u);
            this.f2807d = 0;
        }
        while (c0651s.m1667a() > 0) {
            int i4 = this.f2807d;
            C0651s c0651s2 = this.f2805b;
            if (i4 < 3) {
                if (i4 == 0) {
                    int iM1687u2 = c0651s.m1687u();
                    c0651s.m1665G(c0651s.f2521b - 1);
                    if (iM1687u2 == 255) {
                        this.f2809f = true;
                        return;
                    }
                }
                int iMin = Math.min(c0651s.m1667a(), 3 - this.f2807d);
                c0651s.m1671e(c0651s2.f2520a, this.f2807d, iMin);
                int i5 = this.f2807d + iMin;
                this.f2807d = i5;
                if (i5 == 3) {
                    c0651s2.m1665G(0);
                    c0651s2.m1664F(3);
                    c0651s2.m1666H(1);
                    int iM1687u3 = c0651s2.m1687u();
                    int iM1687u4 = c0651s2.m1687u();
                    this.f2808e = (iM1687u3 & 128) != 0;
                    int i6 = (((iM1687u3 & 15) << 8) | iM1687u4) + 3;
                    this.f2806c = i6;
                    byte[] bArr = c0651s2.f2520a;
                    if (bArr.length < i6) {
                        c0651s2.m1668b(Math.min(4098, Math.max(i6, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(c0651s.m1667a(), this.f2806c - this.f2807d);
                c0651s.m1671e(c0651s2.f2520a, this.f2807d, iMin2);
                int i7 = this.f2807d + iMin2;
                this.f2807d = i7;
                int i8 = this.f2806c;
                if (i7 != i8) {
                    continue;
                } else {
                    if (!this.f2808e) {
                        c0651s2.m1664F(i8);
                    } else {
                        if (AbstractC0632A.m1593l(0, i8, -1, c0651s2.f2520a) != 0) {
                            this.f2809f = true;
                            return;
                        }
                        c0651s2.m1664F(this.f2806c - 4);
                    }
                    c0651s2.m1665G(0);
                    this.f2804a.mo515c(c0651s2);
                    this.f2807d = 0;
                }
            }
        }
    }
}
