package p068X0;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import p000A.C0041i;
import p018G0.C0218h;
import p045P0.AbstractC0462h;
import p045P0.C0455a;
import p045P0.C0464j;
import p045P0.InterfaceC0458d;
import p045P0.InterfaceC0465k;
import p055T.C0544G;
import p061V.C0613a;
import p061V.C0614b;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p064W.InterfaceC0636d;
import p145s0.C2237j;

/* JADX INFO: renamed from: X0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0688a implements InterfaceC0465k {

    /* JADX INFO: renamed from: g */
    public final C0651s f2641g;

    public C0688a(int i3) {
        switch (i3) {
            case 1:
                this.f2641g = new C0651s(10);
                break;
            default:
                this.f2641g = new C0651s();
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public C0544G m1810a(C2237j c2237j, C0041i c0041i) throws EOFException, InterruptedIOException {
        C0651s c0651s = this.f2641g;
        C0544G c0544gM712y = null;
        int i3 = 0;
        while (true) {
            try {
                c2237j.mo338i(c0651s.f2520a, 0, 10, false);
                c0651s.m1665G(0);
                if (c0651s.m1690x() != 4801587) {
                    break;
                }
                c0651s.m1666H(3);
                int iM1686t = c0651s.m1686t();
                int i4 = iM1686t + 10;
                if (c0544gM712y == null) {
                    byte[] bArr = new byte[i4];
                    System.arraycopy(c0651s.f2520a, 0, bArr, 0, 10);
                    c2237j.mo338i(bArr, 10, iM1686t, false);
                    c0544gM712y = new C0218h(c0041i).m712y(bArr, i4);
                } else {
                    c2237j.m4831b(iM1686t, false);
                }
                i3 += i4;
            } catch (EOFException unused) {
            }
        }
        c2237j.f9631l = 0;
        c2237j.m4831b(i3, false);
        return c0544gM712y;
    }

    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo514b() {
    }

    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: h */
    public void mo520h(byte[] bArr, int i3, int i4, C0464j c0464j, InterfaceC0636d interfaceC0636d) {
        C0614b c0614bM1535a;
        C0651s c0651s = this.f2641g;
        c0651s.m1663E(bArr, i3 + i4);
        c0651s.m1665G(i3);
        ArrayList arrayList = new ArrayList();
        while (c0651s.m1667a() > 0) {
            AbstractC0646n.m1624b("Incomplete Mp4Webvtt Top Level box header found.", c0651s.m1667a() >= 8);
            int iM1673g = c0651s.m1673g();
            if (c0651s.m1673g() == 1987343459) {
                int i5 = iM1673g - 8;
                CharSequence charSequenceM1821f = null;
                C0613a c0613aM1815a = null;
                while (i5 > 0) {
                    AbstractC0646n.m1624b("Incomplete vtt cue box header found.", i5 >= 8);
                    int iM1673g2 = c0651s.m1673g();
                    int iM1673g3 = c0651s.m1673g();
                    int i6 = iM1673g2 - 8;
                    byte[] bArr2 = c0651s.f2520a;
                    int i7 = c0651s.f2521b;
                    int i8 = AbstractC0632A.f2454a;
                    String str = new String(bArr2, i7, i6, StandardCharsets.UTF_8);
                    c0651s.m1666H(i6);
                    i5 = (i5 - 8) - i6;
                    if (iM1673g3 == 1937011815) {
                        C0695h c0695h = new C0695h();
                        AbstractC0696i.m1820e(str, c0695h);
                        c0613aM1815a = c0695h.m1815a();
                    } else if (iM1673g3 == 1885436268) {
                        charSequenceM1821f = AbstractC0696i.m1821f(null, str.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceM1821f == null) {
                    charSequenceM1821f = "";
                }
                if (c0613aM1815a != null) {
                    c0613aM1815a.f2319a = charSequenceM1821f;
                    c0614bM1535a = c0613aM1815a.m1535a();
                } else {
                    Pattern pattern = AbstractC0696i.f2686a;
                    C0695h c0695h2 = new C0695h();
                    c0695h2.f2677c = charSequenceM1821f;
                    c0614bM1535a = c0695h2.m1815a().m1535a();
                }
                arrayList.add(c0614bM1535a);
            } else {
                c0651s.m1666H(iM1673g - 8);
            }
        }
        interfaceC0636d.mo545b(new C0455a(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: k */
    public /* synthetic */ InterfaceC0458d mo523k(byte[] bArr, int i3, int i4) {
        return AbstractC0462h.m1161a(this, bArr, i4);
    }
}
