package p092e0;

import android.support.v4.media.session.C0858A;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p034L1.C0352g;
import p055T.AbstractC0545H;
import p055T.C0546I;
import p055T.C0582n;
import p055T.C0583o;
import p055T.C0587s;
import p064W.AbstractC0632A;
import p064W.C0651s;
import p064W.C0656x;
import p068X0.AbstractC0696i;
import p068X0.AbstractC0697j;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p145s0.C2237j;
import p145s0.C2244q;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2240m;
import p145s0.InterfaceC2241n;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: e0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1515t implements InterfaceC2240m {

    /* JADX INFO: renamed from: i */
    public static final Pattern f6826i = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: j */
    public static final Pattern f6827j = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a */
    public final String f6828a;

    /* JADX INFO: renamed from: b */
    public final C0656x f6829b;

    /* JADX INFO: renamed from: d */
    public final C0352g f6831d;

    /* JADX INFO: renamed from: e */
    public final boolean f6832e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2242o f6833f;

    /* JADX INFO: renamed from: h */
    public int f6835h;

    /* JADX INFO: renamed from: c */
    public final C0651s f6830c = new C0651s();

    /* JADX INFO: renamed from: g */
    public byte[] f6834g = new byte[1024];

    public C1515t(String str, C0656x c0656x, C0352g c0352g, boolean z3) {
        this.f6828a = str;
        this.f6829b = c0656x;
        this.f6831d = c0352g;
        this.f6832e = z3;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC2226E m3809b(long j3) {
        InterfaceC2226E interfaceC2226EMo344p = this.f6833f.mo344p(0, 3);
        C0582n c0582n = new C0582n();
        c0582n.f2114m = AbstractC0545H.m1364l("text/vtt");
        c0582n.f2105d = this.f6828a;
        c0582n.f2119r = j3;
        interfaceC2226EMo344p.mo1176e(new C0583o(c0582n));
        this.f6833f.mo341l();
        return interfaceC2226EMo344p;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: c */
    public final InterfaceC2240m mo327c() {
        return this;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: e */
    public final int mo328e(InterfaceC2241n interfaceC2241n, C0587s c0587s) throws EOFException, InterruptedIOException, C0546I {
        String strM1674h;
        this.f6833f.getClass();
        int i3 = (int) ((C2237j) interfaceC2241n).f9628i;
        int i4 = this.f6835h;
        byte[] bArr = this.f6834g;
        if (i4 == bArr.length) {
            this.f6834g = Arrays.copyOf(bArr, ((i3 != -1 ? i3 : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f6834g;
        int i5 = this.f6835h;
        int iMo345q = ((C2237j) interfaceC2241n).mo345q(bArr2, i5, bArr2.length - i5);
        if (iMo345q != -1) {
            int i6 = this.f6835h + iMo345q;
            this.f6835h = i6;
            if (i3 == -1 || i6 != i3) {
                return 0;
            }
        }
        C0651s c0651s = new C0651s(this.f6834g);
        AbstractC0697j.m1826d(c0651s);
        String strM1674h2 = c0651s.m1674h(StandardCharsets.UTF_8);
        long jM1577R = 0;
        long jM1825c = 0;
        while (true) {
            Matcher matcher = null;
            if (TextUtils.isEmpty(strM1674h2)) {
                while (true) {
                    String strM1674h3 = c0651s.m1674h(StandardCharsets.UTF_8);
                    if (strM1674h3 == null) {
                        break;
                    }
                    if (AbstractC0697j.f2690a.matcher(strM1674h3).matches()) {
                        do {
                            strM1674h = c0651s.m1674h(StandardCharsets.UTF_8);
                            if (strM1674h == null) {
                                break;
                            }
                        } while (!strM1674h.isEmpty());
                    } else {
                        Matcher matcher2 = AbstractC0696i.f2686a.matcher(strM1674h3);
                        if (matcher2.matches()) {
                            matcher = matcher2;
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    m3809b(0L);
                    return -1;
                }
                String strGroup = matcher.group(1);
                strGroup.getClass();
                long jM1825c2 = AbstractC0697j.m1825c(strGroup);
                int i7 = AbstractC0632A.f2454a;
                long jM1702b = this.f6829b.m1702b(AbstractC0632A.m1577R((jM1577R + jM1825c2) - jM1825c, 90000L, 1000000L, RoundingMode.DOWN) % 8589934592L);
                InterfaceC2226E interfaceC2226EM3809b = m3809b(jM1702b - jM1825c2);
                byte[] bArr3 = this.f6834g;
                int i8 = this.f6835h;
                C0651s c0651s2 = this.f6830c;
                c0651s2.m1663E(bArr3, i8);
                interfaceC2226EM3809b.mo1173b(this.f6835h, c0651s2);
                interfaceC2226EM3809b.mo1172a(jM1702b, 1, this.f6835h, 0, null);
                return -1;
            }
            if (strM1674h2.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher3 = f6826i.matcher(strM1674h2);
                if (!matcher3.find()) {
                    throw C0546I.m1365a(null, "X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strM1674h2));
                }
                Matcher matcher4 = f6827j.matcher(strM1674h2);
                if (!matcher4.find()) {
                    throw C0546I.m1365a(null, "X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strM1674h2));
                }
                String strGroup2 = matcher3.group(1);
                strGroup2.getClass();
                jM1825c = AbstractC0697j.m1825c(strGroup2);
                String strGroup3 = matcher4.group(1);
                strGroup3.getClass();
                long j3 = Long.parseLong(strGroup3);
                int i9 = AbstractC0632A.f2454a;
                jM1577R = AbstractC0632A.m1577R(j3, 1000000L, 90000L, RoundingMode.DOWN);
            }
            strM1674h2 = c0651s.m1674h(StandardCharsets.UTF_8);
        }
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: f */
    public final boolean mo329f(InterfaceC2241n interfaceC2241n) {
        C2237j c2237j = (C2237j) interfaceC2241n;
        c2237j.mo338i(this.f6834g, 0, 6, false);
        byte[] bArr = this.f6834g;
        C0651s c0651s = this.f6830c;
        c0651s.m1663E(bArr, 6);
        if (AbstractC0697j.m1823a(c0651s)) {
            return true;
        }
        c2237j.mo338i(this.f6834g, 6, 3, false);
        c0651s.m1663E(this.f6834g, 9);
        return AbstractC0697j.m1823a(c0651s);
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: h */
    public final void mo330h(InterfaceC2242o interfaceC2242o) {
        if (this.f6832e) {
            interfaceC2242o = new C0858A(interfaceC2242o, this.f6831d);
        }
        this.f6833f = interfaceC2242o;
        interfaceC2242o.mo333b(new C2244q(-9223372036854775807L));
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: j */
    public final void mo331j(long j3, long j4) {
        throw new IllegalStateException();
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: m */
    public final List mo332m() {
        C1674E c1674e = AbstractC1676G.f7601h;
        return C1692X.f7629k;
    }

    @Override // p145s0.InterfaceC2240m
    /* JADX INFO: renamed from: a */
    public final void mo325a() {
    }
}
