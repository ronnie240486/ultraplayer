package p145s0;

import java.util.ArrayList;
import p055T.C0546I;
import p064W.AbstractC0633a;
import p064W.C0651s;
import p067X.AbstractC0684p;
import p067X.C0683o;

/* JADX INFO: renamed from: s0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2230c {

    /* JADX INFO: renamed from: a */
    public final ArrayList f9590a;

    /* JADX INFO: renamed from: b */
    public final int f9591b;

    /* JADX INFO: renamed from: c */
    public final int f9592c;

    /* JADX INFO: renamed from: d */
    public final int f9593d;

    /* JADX INFO: renamed from: e */
    public final int f9594e;

    /* JADX INFO: renamed from: f */
    public final int f9595f;

    /* JADX INFO: renamed from: g */
    public final int f9596g;

    /* JADX INFO: renamed from: h */
    public final int f9597h;

    /* JADX INFO: renamed from: i */
    public final int f9598i;

    /* JADX INFO: renamed from: j */
    public final int f9599j;

    /* JADX INFO: renamed from: k */
    public final float f9600k;

    /* JADX INFO: renamed from: l */
    public final String f9601l;

    public C2230c(ArrayList arrayList, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, float f, String str) {
        this.f9590a = arrayList;
        this.f9591b = i3;
        this.f9592c = i4;
        this.f9593d = i5;
        this.f9594e = i6;
        this.f9595f = i7;
        this.f9596g = i8;
        this.f9597h = i9;
        this.f9598i = i10;
        this.f9599j = i11;
        this.f9600k = f;
        this.f9601l = str;
    }

    /* JADX INFO: renamed from: a */
    public static C2230c m4829a(C0651s c0651s) throws C0546I {
        String str;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        float f;
        try {
            c0651s.m1666H(4);
            int iM1687u = (c0651s.m1687u() & 3) + 1;
            if (iM1687u == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM1687u2 = c0651s.m1687u() & 31;
            for (int i11 = 0; i11 < iM1687u2; i11++) {
                int iM1659A = c0651s.m1659A();
                int i12 = c0651s.f2521b;
                c0651s.m1666H(iM1659A);
                byte[] bArr = c0651s.f2520a;
                byte[] bArr2 = AbstractC0633a.f2468a;
                byte[] bArr3 = new byte[iM1659A + 4];
                System.arraycopy(AbstractC0633a.f2468a, 0, bArr3, 0, 4);
                System.arraycopy(bArr, i12, bArr3, 4, iM1659A);
                arrayList.add(bArr3);
            }
            int iM1687u3 = c0651s.m1687u();
            for (int i13 = 0; i13 < iM1687u3; i13++) {
                int iM1659A2 = c0651s.m1659A();
                int i14 = c0651s.f2521b;
                c0651s.m1666H(iM1659A2);
                byte[] bArr4 = c0651s.f2520a;
                byte[] bArr5 = AbstractC0633a.f2468a;
                byte[] bArr6 = new byte[iM1659A2 + 4];
                System.arraycopy(AbstractC0633a.f2468a, 0, bArr6, 0, 4);
                System.arraycopy(bArr4, i14, bArr6, 4, iM1659A2);
                arrayList.add(bArr6);
            }
            if (iM1687u2 > 0) {
                C0683o c0683oM1796i = AbstractC0684p.m1796i((byte[]) arrayList.get(0), iM1687u, ((byte[]) arrayList.get(0)).length);
                int i15 = c0683oM1796i.f2614e;
                int i16 = c0683oM1796i.f2615f;
                int i17 = c0683oM1796i.f2617h + 8;
                int i18 = c0683oM1796i.f2618i + 8;
                int i19 = c0683oM1796i.f2625p;
                int i20 = c0683oM1796i.f2626q;
                int i21 = c0683oM1796i.f2627r;
                int i22 = c0683oM1796i.f2628s;
                float f3 = c0683oM1796i.f2616g;
                int i23 = c0683oM1796i.f2610a;
                int i24 = c0683oM1796i.f2611b;
                int i25 = c0683oM1796i.f2612c;
                byte[] bArr7 = AbstractC0633a.f2468a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i23), Integer.valueOf(i24), Integer.valueOf(i25));
                i9 = i21;
                i10 = i22;
                f = f3;
                i6 = i18;
                i7 = i19;
                i8 = i20;
                i3 = i15;
                i4 = i16;
                i5 = i17;
            } else {
                str = null;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = -1;
                i7 = -1;
                i8 = -1;
                i9 = -1;
                i10 = 16;
                f = 1.0f;
            }
            return new C2230c(arrayList, iM1687u, i3, i4, i5, i6, i7, i8, i9, i10, f, str);
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw C0546I.m1365a(e3, "Error parsing AVC config");
        }
    }
}
