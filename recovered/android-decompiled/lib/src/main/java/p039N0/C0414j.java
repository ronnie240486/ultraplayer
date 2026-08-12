package p039N0;

import android.opengl.GLES20;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p030K0.C0334e;
import p034L1.C0352g;
import p048Q0.C0508g;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0639g;
import p064W.C0650r;
import p064W.C0651s;
import p064W.C0656x;
import p071Y0.C0734E;
import p071Y0.C0735F;
import p071Y0.C0736G;
import p071Y0.InterfaceC0732C;
import p071Y0.InterfaceC0737H;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: N0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0414j implements InterfaceC0732C {

    /* JADX INFO: renamed from: g */
    public int f1407g;

    /* JADX INFO: renamed from: h */
    public Object f1408h;

    /* JADX INFO: renamed from: i */
    public Object f1409i;

    /* JADX INFO: renamed from: j */
    public Object f1410j;

    /* JADX INFO: renamed from: k */
    public Object f1411k;

    public C0414j(String str, String str2) throws C0639g {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f1407g = iGlCreateProgram;
        AbstractC0646n.m1626d();
        m1110b(str, iGlCreateProgram, 35633);
        m1110b(str2, iGlCreateProgram, 35632);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        AbstractC0646n.m1627e("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram), iArr[0] == 1);
        GLES20.glUseProgram(iGlCreateProgram);
        this.f1410j = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f1408h = new C0352g[iArr2[0]];
        for (int i3 = 0; i3 < iArr2[0]; i3++) {
            int i4 = this.f1407g;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i4, 35722, iArr3, 0);
            int i5 = iArr3[0];
            byte[] bArr = new byte[i5];
            GLES20.glGetActiveAttrib(i4, i3, i5, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            for (int i6 = 0; i6 < i5; i6++) {
                if (bArr[i6] == 0) {
                    i5 = i6;
                    break;
                }
            }
            String str3 = new String(bArr, 0, i5);
            GLES20.glGetAttribLocation(i4, str3);
            C0352g c0352g = new C0352g(15);
            ((C0352g[]) this.f1408h)[i3] = c0352g;
            ((HashMap) this.f1410j).put(str3, c0352g);
        }
        this.f1411k = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f1407g, 35718, iArr4, 0);
        this.f1409i = new C0352g[iArr4[0]];
        for (int i7 = 0; i7 < iArr4[0]; i7++) {
            int i8 = this.f1407g;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i8, 35719, iArr5, 0);
            int i9 = iArr5[0];
            byte[] bArr2 = new byte[i9];
            GLES20.glGetActiveUniform(i8, i7, i9, new int[1], 0, new int[1], 0, new int[1], 0, bArr2, 0);
            for (int i10 = 0; i10 < i9; i10++) {
                if (bArr2[i10] == 0) {
                    i9 = i10;
                    break;
                }
            }
            String str4 = new String(bArr2, 0, i9);
            GLES20.glGetUniformLocation(i8, str4);
            C0352g c0352g2 = new C0352g(16);
            ((C0352g[]) this.f1409i)[i7] = c0352g2;
            ((HashMap) this.f1411k).put(str4, c0352g2);
        }
        AbstractC0646n.m1626d();
    }

    /* JADX INFO: renamed from: b */
    public static void m1110b(String str, int i3, int i4) throws C0639g {
        int iGlCreateShader = GLES20.glCreateShader(i4);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        AbstractC0646n.m1627e(GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str, iArr[0] == 1);
        GLES20.glAttachShader(i3, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        AbstractC0646n.m1626d();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0138  */
    @Override // p071Y0.InterfaceC0732C
    /* JADX INFO: renamed from: c */
    public void mo515c(C0651s c0651s) {
        C0656x c0656x;
        SparseBooleanArray sparseBooleanArray;
        SparseArray sparseArray;
        C0656x c0656x2;
        int i3;
        int i4;
        C0656x c0656x3;
        int i5;
        int i6;
        if (c0651s.m1687u() != 2) {
            return;
        }
        C0734E c0734e = (C0734E) this.f1411k;
        int i7 = c0734e.f2810a;
        int i8 = 0;
        List list = c0734e.f2812c;
        if (i7 == 1 || i7 == 2 || c0734e.f2823n == 1) {
            c0656x = (C0656x) list.get(0);
        } else {
            c0656x = new C0656x(((C0656x) list.get(0)).m1704d());
            list.add(c0656x);
        }
        if ((c0651s.m1687u() & 128) == 0) {
            return;
        }
        c0651s.m1666H(1);
        int iM1659A = c0651s.m1659A();
        int i9 = 3;
        c0651s.m1666H(3);
        C0508g c0508g = (C0508g) this.f1408h;
        c0651s.m1671e(c0508g.f1731b, 0, 2);
        c0508g.m1260q(0);
        c0508g.m1263t(3);
        c0734e.f2829t = c0508g.m1252i(13);
        c0651s.m1671e(c0508g.f1731b, 0, 2);
        c0508g.m1260q(0);
        c0508g.m1263t(4);
        c0651s.m1666H(c0508g.m1252i(12));
        C0334e c0334e = c0734e.f2815f;
        int i10 = c0734e.f2810a;
        if (i10 == 2 && c0734e.f2827r == null) {
            InterfaceC0737H interfaceC0737HM924d = c0334e.m924d(21, new C0650r(21, null, 0, null, AbstractC0632A.f2459f));
            c0734e.f2827r = interfaceC0737HM924d;
            if (interfaceC0737HM924d != null) {
                interfaceC0737HM924d.mo1845a(c0656x, c0734e.f2822m, new C0736G(iM1659A, 21, 8192));
            }
        }
        SparseArray sparseArray2 = (SparseArray) this.f1409i;
        sparseArray2.clear();
        SparseIntArray sparseIntArray = (SparseIntArray) this.f1410j;
        sparseIntArray.clear();
        int iM1667a = c0651s.m1667a();
        while (true) {
            sparseBooleanArray = c0734e.f2818i;
            if (iM1667a <= 0) {
                break;
            }
            c0651s.m1671e(c0508g.f1731b, i8, 5);
            c0508g.m1260q(i8);
            int iM1252i = c0508g.m1252i(8);
            c0508g.m1263t(i9);
            int iM1252i2 = c0508g.m1252i(13);
            c0508g.m1263t(4);
            int iM1252i3 = c0508g.m1252i(12);
            int i11 = c0651s.f2521b;
            int i12 = i11 + iM1252i3;
            String str = null;
            ArrayList arrayList = null;
            int i13 = -1;
            int iM1687u = 0;
            C0508g c0508g2 = c0508g;
            while (true) {
                if (c0651s.f2521b >= i12) {
                    i4 = iM1667a;
                    break;
                }
                int iM1687u2 = c0651s.m1687u();
                i4 = iM1667a;
                int iM1687u3 = c0651s.f2521b + c0651s.m1687u();
                if (iM1687u3 > i12) {
                    break;
                }
                if (iM1687u2 == 5) {
                    long jM1689w = c0651s.m1689w();
                    if (jM1689w == 1094921523) {
                        i13 = 129;
                    } else if (jM1689w == 1161904947) {
                        i13 = 135;
                    } else if (jM1689w == 1094921524) {
                        i13 = 172;
                    } else if (jM1689w == 1212503619) {
                        i13 = 36;
                    }
                    c0656x3 = c0656x;
                    i5 = iM1659A;
                    i6 = iM1687u3;
                } else if (iM1687u2 == 106) {
                    c0656x3 = c0656x;
                    i5 = iM1659A;
                    i6 = iM1687u3;
                    i13 = 129;
                } else if (iM1687u2 == 122) {
                    c0656x3 = c0656x;
                    i5 = iM1659A;
                    i6 = iM1687u3;
                    i13 = 135;
                } else {
                    if (iM1687u2 == 127) {
                        int iM1687u4 = c0651s.m1687u();
                        if (iM1687u4 == 21) {
                            i13 = 172;
                        } else if (iM1687u4 == 14) {
                            i13 = 136;
                        } else if (iM1687u4 == 33) {
                            i13 = 139;
                        }
                    } else if (iM1687u2 == 123) {
                        c0656x3 = c0656x;
                        i5 = iM1659A;
                        i6 = iM1687u3;
                        i13 = 138;
                    } else if (iM1687u2 == 10) {
                        String strTrim = c0651s.m1685s(3, StandardCharsets.UTF_8).trim();
                        iM1687u = c0651s.m1687u();
                        str = strTrim;
                    } else if (iM1687u2 == 89) {
                        ArrayList arrayList2 = new ArrayList();
                        while (c0651s.f2521b < iM1687u3) {
                            String strTrim2 = c0651s.m1685s(3, StandardCharsets.UTF_8).trim();
                            c0651s.m1687u();
                            C0656x c0656x4 = c0656x;
                            byte[] bArr = new byte[4];
                            c0651s.m1671e(bArr, 0, 4);
                            arrayList2.add(new C0735F(strTrim2, bArr));
                            c0656x = c0656x4;
                            iM1687u3 = iM1687u3;
                            iM1659A = iM1659A;
                        }
                        c0656x3 = c0656x;
                        i5 = iM1659A;
                        i6 = iM1687u3;
                        arrayList = arrayList2;
                        i13 = 89;
                    } else {
                        c0656x3 = c0656x;
                        i5 = iM1659A;
                        i6 = iM1687u3;
                        if (iM1687u2 == 111) {
                            i13 = 257;
                        }
                    }
                    c0656x3 = c0656x;
                    i5 = iM1659A;
                    i6 = iM1687u3;
                }
                c0651s.m1666H(i6 - c0651s.f2521b);
                c0656x = c0656x3;
                iM1667a = i4;
                iM1659A = i5;
            }
            C0656x c0656x5 = c0656x;
            int i14 = iM1659A;
            c0651s.m1665G(i12);
            C0650r c0650r = new C0650r(i13, str, iM1687u, arrayList, Arrays.copyOfRange(c0651s.f2520a, i11, i12));
            if (iM1252i == 6 || iM1252i == 5) {
                iM1252i = i13;
            }
            int i15 = i4 - (iM1252i3 + 5);
            int i16 = i10 == 2 ? iM1252i : iM1252i2;
            if (!sparseBooleanArray.get(i16)) {
                InterfaceC0737H interfaceC0737HM924d2 = (i10 == 2 && iM1252i == 21) ? c0734e.f2827r : c0334e.m924d(iM1252i, c0650r);
                if (i10 != 2 || iM1252i2 < sparseIntArray.get(i16, 8192)) {
                    sparseIntArray.put(i16, iM1252i2);
                    sparseArray2.put(i16, interfaceC0737HM924d2);
                }
            }
            iM1667a = i15;
            c0656x = c0656x5;
            c0508g = c0508g2;
            iM1659A = i14;
            i8 = 0;
            i9 = 3;
        }
        C0656x c0656x6 = c0656x;
        int i17 = iM1659A;
        int size = sparseIntArray.size();
        int i18 = 0;
        while (true) {
            sparseArray = c0734e.f2817h;
            if (i18 >= size) {
                break;
            }
            int iKeyAt = sparseIntArray.keyAt(i18);
            int iValueAt = sparseIntArray.valueAt(i18);
            sparseBooleanArray.put(iKeyAt, true);
            c0734e.f2819j.put(iValueAt, true);
            InterfaceC0737H interfaceC0737H = (InterfaceC0737H) sparseArray2.valueAt(i18);
            if (interfaceC0737H != null) {
                if (interfaceC0737H != c0734e.f2827r) {
                    InterfaceC2242o interfaceC2242o = c0734e.f2822m;
                    i3 = i17;
                    C0736G c0736g = new C0736G(i3, iKeyAt, 8192);
                    c0656x2 = c0656x6;
                    interfaceC0737H.mo1845a(c0656x2, interfaceC2242o, c0736g);
                } else {
                    c0656x2 = c0656x6;
                    i3 = i17;
                }
                sparseArray.put(iValueAt, interfaceC0737H);
            } else {
                c0656x2 = c0656x6;
                i3 = i17;
            }
            i18++;
            c0656x6 = c0656x2;
            i17 = i3;
        }
        if (i10 == 2) {
            if (c0734e.f2824o) {
                return;
            }
            c0734e.f2822m.mo341l();
            c0734e.f2823n = 0;
            c0734e.f2824o = true;
            return;
        }
        sparseArray.remove(this.f1407g);
        int i19 = i10 == 1 ? 0 : c0734e.f2823n - 1;
        c0734e.f2823n = i19;
        if (i19 == 0) {
            c0734e.f2822m.mo341l();
            c0734e.f2824o = true;
        }
    }

    /* JADX INFO: renamed from: d */
    public int m1111d(String str) throws C0639g {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f1407g, str);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        AbstractC0646n.m1626d();
        return iGlGetAttribLocation;
    }

    @Override // p071Y0.InterfaceC0732C
    /* JADX INFO: renamed from: a */
    public void mo513a(C0656x c0656x, InterfaceC2242o interfaceC2242o, C0736G c0736g) {
    }
}
