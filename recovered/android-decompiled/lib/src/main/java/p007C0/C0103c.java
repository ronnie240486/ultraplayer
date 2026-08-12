package p007C0;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import p004B0.C0098a;
import p009D0.C0105a;
import p048Q0.C0508g;
import p055T.C0544G;
import p064W.C0651s;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: C0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0103c extends AbstractC2003a {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f130f;

    /* JADX INFO: renamed from: y */
    public static C0105a m500y(C0651s c0651s) {
        String strM1682p = c0651s.m1682p();
        strM1682p.getClass();
        String strM1682p2 = c0651s.m1682p();
        strM1682p2.getClass();
        return new C0105a(strM1682p, strM1682p2, c0651s.m1681o(), c0651s.m1681o(), Arrays.copyOfRange(c0651s.f2520a, c0651s.f2521b, c0651s.f2522c));
    }

    @Override // p122m1.AbstractC2003a
    /* JADX INFO: renamed from: i */
    public final C0544G mo501i(C0098a c0098a, ByteBuffer byteBuffer) {
        switch (this.f130f) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                C0508g c0508g = new C0508g(byteBuffer.array(), byteBuffer.limit());
                int i3 = 12;
                c0508g.m1263t(12);
                int iM1249f = (c0508g.m1249f() + c0508g.m1252i(12)) - 4;
                c0508g.m1263t(44);
                c0508g.m1264u(c0508g.m1252i(12));
                c0508g.m1263t(16);
                ArrayList arrayList = new ArrayList();
                while (c0508g.m1249f() < iM1249f) {
                    c0508g.m1263t(48);
                    int iM1252i = c0508g.m1252i(8);
                    c0508g.m1263t(4);
                    int iM1249f2 = c0508g.m1249f() + c0508g.m1252i(i3);
                    String str = null;
                    String str2 = null;
                    while (c0508g.m1249f() < iM1249f2) {
                        int iM1252i2 = c0508g.m1252i(8);
                        int iM1252i3 = c0508g.m1252i(8);
                        int iM1249f3 = c0508g.m1249f() + iM1252i3;
                        if (iM1252i2 == 2) {
                            int iM1252i4 = c0508g.m1252i(16);
                            c0508g.m1263t(8);
                            if (iM1252i4 == 3) {
                                while (c0508g.m1249f() < iM1249f3) {
                                    int iM1252i5 = c0508g.m1252i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[iM1252i5];
                                    c0508g.m1255l(bArr, iM1252i5);
                                    String str3 = new String(bArr, charset);
                                    int iM1252i6 = c0508g.m1252i(8);
                                    for (int i4 = 0; i4 < iM1252i6; i4++) {
                                        c0508g.m1264u(c0508g.m1252i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (iM1252i2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[iM1252i3];
                            c0508g.m1255l(bArr2, iM1252i3);
                            str2 = new String(bArr2, charset2);
                        }
                        c0508g.m1260q(iM1249f3 * 8);
                    }
                    c0508g.m1260q(iM1249f2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new C0102b(iM1252i, str.concat(str2)));
                    }
                    i3 = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new C0544G(arrayList);
            default:
                return new C0544G(m500y(new C0651s(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
