package p070Y;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import p055T.C0546I;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: Y.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0709f extends AbstractC0706c {

    /* JADX INFO: renamed from: k */
    public C0715l f2716k;

    /* JADX INFO: renamed from: l */
    public byte[] f2717l;

    /* JADX INFO: renamed from: m */
    public int f2718m;

    /* JADX INFO: renamed from: n */
    public int f2719n;

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: a */
    public final long mo1827a(C0715l c0715l) throws C0712i, C0546I {
        m1832l();
        this.f2716k = c0715l;
        Uri uriNormalizeScheme = c0715l.f2735a.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        AbstractC0646n.m1624b("Unsupported scheme: " + scheme, "data".equals(scheme));
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i3 = AbstractC0632A.f2454a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new C0546I("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f2717l = Base64.decode(str, 0);
            } catch (IllegalArgumentException e3) {
                throw new C0546I("Error while parsing Base64 encoded string: " + str, e3, true, 0);
            }
        } else {
            this.f2717l = URLDecoder.decode(str, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        byte[] bArr = this.f2717l;
        long length = bArr.length;
        long j3 = c0715l.f2739e;
        if (j3 > length) {
            this.f2717l = null;
            throw new C0712i(2008);
        }
        int i4 = (int) j3;
        this.f2718m = i4;
        int length2 = bArr.length - i4;
        this.f2719n = length2;
        long j4 = c0715l.f2740f;
        if (j4 != -1) {
            this.f2719n = (int) Math.min(length2, j4);
        }
        m1834p(c0715l);
        return j4 != -1 ? j4 : this.f2719n;
    }

    @Override // p070Y.InterfaceC0711h
    public final void close() {
        if (this.f2717l != null) {
            this.f2717l = null;
            m1831k();
        }
        this.f2716k = null;
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: h */
    public final Uri mo1828h() {
        C0715l c0715l = this.f2716k;
        if (c0715l != null) {
            return c0715l.f2735a;
        }
        return null;
    }

    @Override // p055T.InterfaceC0575g
    /* JADX INFO: renamed from: q */
    public final int mo345q(byte[] bArr, int i3, int i4) {
        if (i4 == 0) {
            return 0;
        }
        int i5 = this.f2719n;
        if (i5 == 0) {
            return -1;
        }
        int iMin = Math.min(i4, i5);
        byte[] bArr2 = this.f2717l;
        int i6 = AbstractC0632A.f2454a;
        System.arraycopy(bArr2, this.f2718m, bArr, i3, iMin);
        this.f2718m += iMin;
        this.f2719n -= iMin;
        m1829b(iMin);
        return iMin;
    }
}
