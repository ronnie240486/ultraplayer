package p125n0;

import java.util.Objects;
import p055T.C0568c0;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p067X.C0687s;
import p077a0.C0830h0;

/* JADX INFO: renamed from: n0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2045v {

    /* JADX INFO: renamed from: a */
    public final int f8912a;

    /* JADX INFO: renamed from: b */
    public final C0830h0[] f8913b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2042s[] f8914c;

    /* JADX INFO: renamed from: d */
    public final C0568c0 f8915d;

    /* JADX INFO: renamed from: e */
    public final C0687s f8916e;

    public C2045v(C0830h0[] c0830h0Arr, InterfaceC2042s[] interfaceC2042sArr, C0568c0 c0568c0, C0687s c0687s) {
        AbstractC0646n.m1625c(c0830h0Arr.length == interfaceC2042sArr.length);
        this.f8913b = c0830h0Arr;
        this.f8914c = (InterfaceC2042s[]) interfaceC2042sArr.clone();
        this.f8915d = c0568c0;
        this.f8916e = c0687s;
        this.f8912a = c0830h0Arr.length;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4618a(C2045v c2045v, int i3) {
        if (c2045v == null) {
            return false;
        }
        C0830h0 c0830h0 = this.f8913b[i3];
        C0830h0 c0830h1 = c2045v.f8913b[i3];
        int i4 = AbstractC0632A.f2454a;
        return Objects.equals(c0830h0, c0830h1) && Objects.equals(this.f8914c[i3], c2045v.f8914c[i3]);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4619b(int i3) {
        return this.f8913b[i3] != null;
    }
}
