package p055T;

import android.net.Uri;
import java.util.Objects;
import p064W.AbstractC0632A;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;

/* JADX INFO: renamed from: T.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0541D {

    /* JADX INFO: renamed from: A */
    public Integer f1882A;

    /* JADX INFO: renamed from: B */
    public AbstractC1676G f1883B;

    /* JADX INFO: renamed from: a */
    public CharSequence f1884a;

    /* JADX INFO: renamed from: b */
    public CharSequence f1885b;

    /* JADX INFO: renamed from: c */
    public CharSequence f1886c;

    /* JADX INFO: renamed from: d */
    public CharSequence f1887d;

    /* JADX INFO: renamed from: e */
    public String f1888e;

    /* JADX INFO: renamed from: f */
    public CharSequence f1889f;

    /* JADX INFO: renamed from: g */
    public byte[] f1890g;

    /* JADX INFO: renamed from: h */
    public Integer f1891h;

    /* JADX INFO: renamed from: i */
    public Uri f1892i;

    /* JADX INFO: renamed from: j */
    public Integer f1893j;

    /* JADX INFO: renamed from: k */
    public Integer f1894k;

    /* JADX INFO: renamed from: l */
    public Integer f1895l;

    /* JADX INFO: renamed from: m */
    public Boolean f1896m;

    /* JADX INFO: renamed from: n */
    public Integer f1897n;

    /* JADX INFO: renamed from: o */
    public Integer f1898o;

    /* JADX INFO: renamed from: p */
    public Integer f1899p;

    /* JADX INFO: renamed from: q */
    public Integer f1900q;

    /* JADX INFO: renamed from: r */
    public Integer f1901r;

    /* JADX INFO: renamed from: s */
    public Integer f1902s;

    /* JADX INFO: renamed from: t */
    public CharSequence f1903t;

    /* JADX INFO: renamed from: u */
    public CharSequence f1904u;

    /* JADX INFO: renamed from: v */
    public CharSequence f1905v;

    /* JADX INFO: renamed from: w */
    public Integer f1906w;

    /* JADX INFO: renamed from: x */
    public Integer f1907x;

    /* JADX INFO: renamed from: y */
    public CharSequence f1908y;

    /* JADX INFO: renamed from: z */
    public CharSequence f1909z;

    public C0541D() {
        C1674E c1674e = AbstractC1676G.f7601h;
        this.f1883B = C1692X.f7629k;
    }

    /* JADX INFO: renamed from: a */
    public final void m1349a(byte[] bArr, int i3) {
        if (this.f1890g != null) {
            Integer numValueOf = Integer.valueOf(i3);
            int i4 = AbstractC0632A.f2454a;
            if (!numValueOf.equals(3) && Objects.equals(this.f1891h, 3)) {
                return;
            }
        }
        this.f1890g = (byte[]) bArr.clone();
        this.f1891h = Integer.valueOf(i3);
    }
}
