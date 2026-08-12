package p052S;

import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.zuxoplayer.app.C1375o;
import com.zuxoplayer.app.PlayerActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p000A.C0031d;
import p000A.C0041i;
import p009D0.C0106b;
import p011E.C0111d;
import p013E1.C0137l;
import p013E1.C0140o;
import p013E1.C0141p;
import p013E1.C0142q;
import p016F1.AbstractC0191h;
import p016F1.C0185b;
import p016F1.C0187d;
import p016F1.C0192i;
import p019G1.C0228c;
import p019G1.C0233h;
import p019G1.C0234i;
import p019G1.C0235j;
import p019G1.C0236k;
import p019G1.C0237l;
import p019G1.C0238m;
import p019G1.C0239n;
import p019G1.C0241p;
import p019G1.C0245t;
import p019G1.C0246u;
import p028J1.AbstractC0295a;
import p034L1.C0352g;
import p037M1.InterfaceC0399l;
import p038N.AbstractC0402b;
import p043O1.C0448a;
import p046P1.AbstractC0491s;
import p055T.AbstractC0540C;
import p055T.AbstractC0545H;
import p055T.AbstractC0547J;
import p055T.AbstractC0558V;
import p055T.C0539B;
import p055T.C0541D;
import p055T.C0542E;
import p055T.C0548K;
import p055T.C0549L;
import p055T.C0552O;
import p055T.C0556T;
import p055T.C0557U;
import p055T.C0559W;
import p055T.C0564a0;
import p055T.C0566b0;
import p055T.C0568c0;
import p055T.C0574f0;
import p055T.C0576h;
import p055T.C0581m;
import p055T.C0582n;
import p055T.C0583o;
import p055T.C0586r;
import p055T.C0593y;
import p055T.InterfaceC0551N;
import p061V.C0615c;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0645m;
import p064W.C0653u;
import p064W.InterfaceC0642j;
import p075Z1.HandlerC0784e;
import p105h2.AbstractC1676G;
import p105h2.C1692X;

/* JADX INFO: renamed from: S.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0532h extends AbstractC0402b {

    /* JADX INFO: renamed from: B */
    public static final C0549L f1817B;

    /* JADX INFO: renamed from: C */
    public static final long[] f1818C;

    /* JADX INFO: renamed from: A */
    public C0542E f1819A;

    /* JADX INFO: renamed from: b */
    public final C0185b f1820b;

    /* JADX INFO: renamed from: c */
    public final C0352g f1821c;

    /* JADX INFO: renamed from: d */
    public final long f1822d;

    /* JADX INFO: renamed from: e */
    public final long f1823e;

    /* JADX INFO: renamed from: f */
    public final long f1824f;

    /* JADX INFO: renamed from: g */
    public final C0106b f1825g;

    /* JADX INFO: renamed from: h */
    public final C0556T f1826h;

    /* JADX INFO: renamed from: i */
    public final C0531g f1827i;

    /* JADX INFO: renamed from: j */
    public final C0530f f1828j;

    /* JADX INFO: renamed from: k */
    public final C0645m f1829k;

    /* JADX INFO: renamed from: l */
    public C1375o f1830l;

    /* JADX INFO: renamed from: m */
    public final C0106b f1831m;

    /* JADX INFO: renamed from: n */
    public final C0106b f1832n;

    /* JADX INFO: renamed from: o */
    public final C0106b f1833o;

    /* JADX INFO: renamed from: p */
    public C0233h f1834p;

    /* JADX INFO: renamed from: q */
    public C0534j f1835q;

    /* JADX INFO: renamed from: r */
    public C0568c0 f1836r;

    /* JADX INFO: renamed from: s */
    public C0549L f1837s;

    /* JADX INFO: renamed from: t */
    public int f1838t;

    /* JADX INFO: renamed from: u */
    public int f1839u;

    /* JADX INFO: renamed from: v */
    public long f1840v;

    /* JADX INFO: renamed from: w */
    public int f1841w;

    /* JADX INFO: renamed from: x */
    public int f1842x;

    /* JADX INFO: renamed from: y */
    public long f1843y;

    /* JADX INFO: renamed from: z */
    public C0552O f1844z;

    static {
        new C0576h(1).m1442a();
        AbstractC0540C.m1348a("media3.cast");
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = {1, 2, 3, 4, 10, 15, 13, 16, 17, 18, 19, 31, 20, 30, 32};
        for (int i3 = 0; i3 < 15; i3++) {
            int i4 = iArr[i3];
            AbstractC0646n.m1630h(!false);
            sparseBooleanArray.append(i4, true);
        }
        AbstractC0646n.m1630h(true);
        f1817B = new C0549L(new C0581m(sparseBooleanArray));
        f1818C = new long[0];
    }

    public C0532h(C0185b c0185b) {
        int i3 = 13;
        C0352g c0352g = new C0352g(14);
        super(1);
        this.f1820b = c0185b;
        this.f1821c = c0352g;
        this.f1822d = 5000L;
        this.f1823e = 15000L;
        this.f1824f = 3000L;
        this.f1825g = new C0106b(c0352g);
        this.f1826h = new C0556T();
        C0531g c0531g = new C0531g(this);
        this.f1827i = c0531g;
        this.f1828j = new C0530f(this, 3);
        this.f1829k = new C0645m(Looper.getMainLooper(), C0653u.f2526a, new C0526b(this, 6));
        this.f1831m = new C0106b(i3, Boolean.FALSE);
        this.f1832n = new C0106b(i3, (Object) 0);
        this.f1833o = new C0106b(i3, C0548K.f1948d);
        this.f1838t = 1;
        this.f1835q = C0534j.f1851h;
        this.f1819A = C0542E.f1910D;
        this.f1836r = C0568c0.f2054b;
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        C0581m c0581m = f1817B.f1952a;
        for (int i4 = 0; i4 < c0581m.f2090a.size(); i4++) {
            sparseBooleanArray.append(c0581m.m1445a(i4), true);
        }
        this.f1837s = new C0549L(new C0581m(sparseBooleanArray));
        this.f1842x = -1;
        this.f1843y = -9223372036854775807L;
        c0185b.getClass();
        AbstractC0491s.m1210b();
        C0192i c0192i = c0185b.f428c;
        c0192i.m678a(c0531g);
        AbstractC0491s.m1210b();
        AbstractC0191h abstractC0191hM680c = c0192i.m680c();
        C0233h c0233h = null;
        C0187d c0187d = (abstractC0191hM680c == null || !(abstractC0191hM680c instanceof C0187d)) ? null : (C0187d) abstractC0191hM680c;
        if (c0187d != null) {
            AbstractC0491s.m1210b();
            c0233h = c0187d.f463j;
        }
        m1303f0(c0233h);
        m1309i0();
        int i5 = AbstractC0632A.f2454a;
    }

    /* JADX INFO: renamed from: b0 */
    public static int m1280b0(C0233h c0233h, AbstractC0558V abstractC0558V) {
        if (c0233h != null) {
            AbstractC0491s.m1210b();
            C0142q c0142qM754d = c0233h.m754d();
            C0140o c0140oM599e = c0142qM754d == null ? null : c0142qM754d.m599e(c0142qM754d.f306i);
            int iMo1328b = c0140oM599e != null ? abstractC0558V.mo1328b(Integer.valueOf(c0140oM599e.f291h)) : -1;
            if (iMo1328b != -1) {
                return iMo1328b;
            }
        }
        return 0;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: A */
    public final long mo1281A() {
        return this.f1824f;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: B */
    public final boolean mo1282B() {
        return false;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: C */
    public final void mo1283C() {
        int length = this.f1835q.f1854d.length;
        int iMin = Math.min(Integer.MAX_VALUE, length);
        if (length <= 0 || iMin == 0) {
            return;
        }
        int[] iArr = new int[iMin];
        for (int i3 = 0; i3 < iMin; i3++) {
            C0534j c0534j = this.f1835q;
            C0557U c0557u = (C0557U) this.f1360a;
            c0534j.mo1332m(i3, c0557u, 0L);
            iArr[i3] = ((Integer) c0557u.f1975a).intValue();
        }
        C0233h c0233h = this.f1834p;
        if (c0233h != null) {
            if ((c0233h != null ? c0233h.m754d() : null) == null) {
                return;
            }
            C0534j c0534j2 = this.f1835q;
            if (!c0534j2.m1415p()) {
                int iMo1292N = mo1292N();
                C0556T c0556t = this.f1826h;
                c0534j2.mo1329f(iMo1292N, c0556t, true);
                Object obj = c0556t.f1967b;
                for (int i4 = 0; i4 < iMin; i4++) {
                    if (obj.equals(Integer.valueOf(iArr[i4]))) {
                        this.f1844z = m1297c0();
                        break;
                    }
                }
            }
            C0233h c0233h2 = this.f1834p;
            c0233h2.getClass();
            AbstractC0491s.m1210b();
            if (c0233h2.m772w()) {
                C0233h.m750x(new C0236k(c0233h2, iArr, 0));
            } else {
                C0233h.m749r();
            }
        }
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: D */
    public final C0564a0 mo1284D() {
        return C0564a0.f2024s;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: G */
    public final C0615c mo1285G() {
        return C0615c.f2372b;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: J */
    public final C0574f0 mo1288J() {
        return C0574f0.f2070d;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: K */
    public final C0542E mo1289K() {
        return this.f1819A;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: L */
    public final void mo1290L(C1692X c1692x) {
        mo1293O(c1692x, 0, -9223372036854775807L);
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: M */
    public final long mo1291M() {
        long j3 = this.f1843y;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        C0233h c0233h = this.f1834p;
        return c0233h != null ? c0233h.m751a() : this.f1840v;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: N */
    public final int mo1292N() {
        int i3 = this.f1842x;
        return i3 != -1 ? i3 : this.f1839u;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: O */
    public final void mo1293O(C1692X c1692x, int i3, long j3) {
        long jMo1291M;
        int iMo1292N;
        int i4;
        int i5;
        int iIntValue = ((Integer) this.f1832n.f140h).intValue();
        if (this.f1834p == null || c1692x.isEmpty()) {
            return;
        }
        long j4 = j3 == -9223372036854775807L ? 0L : j3;
        if (i3 == -1) {
            iMo1292N = mo1292N();
            jMo1291M = mo1291M();
        } else {
            jMo1291M = j4;
            iMo1292N = i3;
        }
        if (!this.f1835q.m1415p()) {
            this.f1844z = m1297c0();
        }
        int i6 = c1692x.f7631j;
        C0140o[] c0140oArr = new C0140o[i6];
        int i7 = 0;
        while (i7 < i6) {
            C0539B c0539b = (C0539B) c1692x.get(i7);
            this.f1821c.getClass();
            C0593y c0593y = c0539b.f1875b;
            c0593y.getClass();
            if (c0593y.f2200b == null) {
                throw new IllegalArgumentException("The item must specify its mimeType");
            }
            C0137l c0137l = new C0137l(AbstractC0545H.m1360h(c0593y.f2200b) ? 3 : 1);
            C0542E c0542e = c0539b.f1877d;
            CharSequence charSequence = c0542e.f1914a;
            if (charSequence != null) {
                c0137l.m592f("com.google.android.gms.cast.metadata.TITLE", charSequence.toString());
            }
            String str = c0542e.f1918e;
            if (str != null) {
                c0137l.m592f("com.google.android.gms.cast.metadata.SUBTITLE", str.toString());
            }
            CharSequence charSequence2 = c0542e.f1915b;
            if (charSequence2 != null) {
                c0137l.m592f("com.google.android.gms.cast.metadata.ARTIST", charSequence2.toString());
            }
            CharSequence charSequence3 = c0542e.f1917d;
            if (charSequence3 != null) {
                c0137l.m592f("com.google.android.gms.cast.metadata.ALBUM_ARTIST", charSequence3.toString());
            }
            CharSequence charSequence4 = c0542e.f1916c;
            if (charSequence4 != null) {
                c0137l.m592f("com.google.android.gms.cast.metadata.ALBUM_TITLE", charSequence4.toString());
            }
            Uri uri = c0542e.f1922i;
            if (uri != null) {
                c0137l.f272g.add(new C0448a(uri, 0, 0));
            }
            CharSequence charSequence5 = c0542e.f1935v;
            if (charSequence5 != null) {
                c0137l.m592f("com.google.android.gms.cast.metadata.COMPOSER", charSequence5.toString());
            }
            Bundle bundle = c0137l.f273h;
            Integer num = c0542e.f1937x;
            if (num != null) {
                int iIntValue2 = num.intValue();
                i5 = 2;
                C0137l.m589g(2, "com.google.android.gms.cast.metadata.DISC_NUMBER");
                bundle.putInt("com.google.android.gms.cast.metadata.DISC_NUMBER", iIntValue2);
            } else {
                i5 = 2;
            }
            Integer num2 = c0542e.f1923j;
            if (num2 != null) {
                int iIntValue3 = num2.intValue();
                C0137l.m589g(i5, "com.google.android.gms.cast.metadata.TRACK_NUMBER");
                bundle.putInt("com.google.android.gms.cast.metadata.TRACK_NUMBER", iIntValue3);
            }
            String string = c0593y.f2199a.toString();
            String str2 = c0539b.f1874a;
            String str3 = str2.equals("") ? string : str2;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("mediaItem", C0352g.m959A(c0539b));
                JSONObject jSONObjectM960B = C0352g.m960B(c0539b);
                if (jSONObjectM960B != null) {
                    jSONObject.put("exoPlayerConfig", jSONObjectM960B);
                }
                c0140oArr[i7] = new C0031d(new MediaInfo(str3, 1, c0593y.f2200b, c0137l, -1L, null, null, jSONObject.toString(), null, null, null, null, -1L, null, string, null, null)).m170r();
                i7++;
                c0140oArr = c0140oArr;
            } catch (JSONException e3) {
                throw new RuntimeException(e3);
            }
        }
        C0140o[] c0140oArr2 = c0140oArr;
        HashMap map = (HashMap) this.f1825g.f141i;
        map.clear();
        for (int i8 = 0; i8 < i6; i8++) {
            MediaInfo mediaInfo = c0140oArr2[i8].f290g;
            mediaInfo.getClass();
            String str4 = mediaInfo.f5444g;
            if (str4 == null) {
                str4 = "";
            }
            map.put(str4, (C0539B) c1692x.get(i8));
        }
        C0233h c0233h = this.f1834p;
        int iMin = Math.min(iMo1292N, i6 - 1);
        if (iIntValue == 0) {
            i4 = 0;
        } else if (iIntValue == 1) {
            i4 = 2;
        } else {
            if (iIntValue != 2) {
                throw new IllegalArgumentException();
            }
            i4 = 1;
        }
        c0233h.getClass();
        AbstractC0491s.m1210b();
        if (c0233h.m772w()) {
            C0233h.m750x(new C0235j(c0233h, c0140oArr2, iMin, i4, jMo1291M));
        } else {
            C0233h.m749r();
        }
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: P */
    public final long mo1294P() {
        return this.f1822d;
    }

    @Override // p038N.AbstractC0402b
    /* JADX INFO: renamed from: X */
    public final void mo1092X(int i3, long j3, boolean z3) {
        BasePendingResult basePendingResultM749r;
        BasePendingResult basePendingResultM749r2;
        if (i3 == -1) {
            return;
        }
        AbstractC0646n.m1625c(i3 >= 0);
        if (this.f1835q.m1415p() || i3 < this.f1835q.f1854d.length) {
            C0233h c0233h = this.f1834p;
            C0142q c0142qM754d = c0233h != null ? c0233h.m754d() : null;
            if (j3 == -9223372036854775807L) {
                j3 = 0;
            }
            C0645m c0645m = this.f1829k;
            if (c0142qM754d != null) {
                int iMo1292N = mo1292N();
                C0530f c0530f = this.f1828j;
                if (iMo1292N != i3) {
                    C0233h c0233h2 = this.f1834p;
                    C0534j c0534j = this.f1835q;
                    C0556T c0556t = this.f1826h;
                    c0534j.mo1329f(i3, c0556t, false);
                    int iIntValue = ((Integer) c0556t.f1967b).intValue();
                    c0233h2.getClass();
                    AbstractC0491s.m1210b();
                    if (c0233h2.m772w()) {
                        C0238m c0238m = new C0238m(c0233h2, iIntValue, j3);
                        C0233h.m750x(c0238m);
                        basePendingResultM749r2 = c0238m;
                    } else {
                        basePendingResultM749r2 = C0233h.m749r();
                    }
                    basePendingResultM749r2.m3083J(c0530f);
                } else {
                    C0233h c0233h3 = this.f1834p;
                    c0233h3.getClass();
                    C0141p c0141p = new C0141p(j3);
                    AbstractC0491s.m1210b();
                    if (c0233h3.m772w()) {
                        C0239n c0239n = new C0239n(c0233h3, c0141p, 1);
                        C0233h.m750x(c0239n);
                        basePendingResultM749r = c0239n;
                    } else {
                        basePendingResultM749r = C0233h.m749r();
                    }
                    basePendingResultM749r.m3083J(c0530f);
                }
                C0552O c0552oM1297c0 = m1297c0();
                this.f1841w++;
                this.f1842x = i3;
                this.f1843y = j3;
                C0552O c0552oM1297c1 = m1297c0();
                c0645m.m1618c(11, new C0525a(0, c0552oM1297c0, c0552oM1297c1));
                if (c0552oM1297c0.f1955b != c0552oM1297c1.f1955b) {
                    C0534j c0534j2 = this.f1835q;
                    C0557U c0557u = (C0557U) this.f1360a;
                    c0534j2.mo1332m(i3, c0557u, 0L);
                    c0645m.m1618c(1, new C0111d(4, c0557u.f1977c));
                    C0542E c0542e = this.f1819A;
                    C0539B c0539bM1087S = m1087S();
                    C0542E c0542e2 = c0539bM1087S != null ? c0539bM1087S.f1877d : C0542E.f1910D;
                    this.f1819A = c0542e2;
                    if (!c0542e.equals(c0542e2)) {
                        c0645m.m1618c(14, new C0526b(this, 5));
                    }
                }
                m1307h0();
            }
            c0645m.m1617b();
        }
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: c */
    public final void mo1296c(int i3) {
        int i4;
        BasePendingResult basePendingResultM749r;
        if (this.f1834p == null) {
            return;
        }
        m1305g0(i3);
        this.f1829k.m1617b();
        C0233h c0233h = this.f1834p;
        if (i3 != 0) {
            i4 = 2;
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalArgumentException();
                }
                i4 = 1;
            }
        } else {
            i4 = 0;
        }
        c0233h.getClass();
        AbstractC0491s.m1210b();
        if (c0233h.m772w()) {
            C0237l c0237l = new C0237l(c0233h, i4);
            C0233h.m750x(c0237l);
            basePendingResultM749r = c0237l;
        } else {
            basePendingResultM749r = C0233h.m749r();
        }
        C0530f c0530f = new C0530f(this, 2);
        this.f1832n.f141i = c0530f;
        basePendingResultM749r.m3083J(c0530f);
    }

    /* JADX INFO: renamed from: c0 */
    public final C0552O m1297c0() {
        Object obj;
        C0539B c0539b;
        Object obj2;
        C0534j c0534j = this.f1835q;
        if (c0534j.m1415p()) {
            obj = null;
            c0539b = null;
            obj2 = null;
        } else {
            int iMo1292N = mo1292N();
            C0556T c0556t = this.f1826h;
            c0534j.mo1329f(iMo1292N, c0556t, true);
            Object obj3 = c0556t.f1967b;
            int i3 = c0556t.f1968c;
            C0557U c0557u = (C0557U) this.f1360a;
            c0534j.mo1332m(i3, c0557u, 0L);
            obj = c0557u.f1975a;
            obj2 = obj3;
            c0539b = c0557u.f1977c;
        }
        return new C0552O(obj, mo1292N(), c0539b, obj2, mo1292N(), mo1291M(), mo1291M(), -1, -1);
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: d */
    public final void mo1298d(C0548K c0548k) {
        BasePendingResult basePendingResultM749r;
        if (this.f1834p == null) {
            return;
        }
        C0548K c0548k2 = new C0548K(AbstractC0632A.m1589h(c0548k.f1949a, 0.5f, 2.0f));
        m1299d0(c0548k2);
        this.f1829k.m1617b();
        C0233h c0233h = this.f1834p;
        double d3 = c0548k2.f1949a;
        c0233h.getClass();
        AbstractC0491s.m1210b();
        if (c0233h.m772w()) {
            C0241p c0241p = new C0241p(c0233h, d3);
            C0233h.m750x(c0241p);
            basePendingResultM749r = c0241p;
        } else {
            basePendingResultM749r = C0233h.m749r();
        }
        C0530f c0530f = new C0530f(this, 1);
        this.f1833o.f141i = c0530f;
        basePendingResultM749r.m3083J(c0530f);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m1299d0(C0548K c0548k) {
        C0106b c0106b = this.f1833o;
        if (((C0548K) c0106b.f140h).equals(c0548k)) {
            return;
        }
        c0106b.f140h = c0548k;
        this.f1829k.m1618c(12, new C0111d(3, c0548k));
        m1307h0();
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: e */
    public final int mo1300e() {
        return ((Integer) this.f1832n.f140h).intValue();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m1301e0(final int i3, final int i4, final boolean z3) {
        int i5 = this.f1838t;
        C0106b c0106b = this.f1831m;
        boolean z4 = false;
        boolean z5 = i5 == 3 && ((Boolean) c0106b.f140h).booleanValue();
        boolean z6 = ((Boolean) c0106b.f140h).booleanValue() != z3;
        boolean z7 = this.f1838t != i4;
        if (z6 || z7) {
            this.f1838t = i4;
            c0106b.f140h = Boolean.valueOf(z3);
            final int i6 = 0;
            InterfaceC0642j interfaceC0642j = new InterfaceC0642j() { // from class: S.d
                @Override // p064W.InterfaceC0642j
                /* JADX INFO: renamed from: g */
                public final void mo214g(Object obj) {
                    InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj;
                    switch (i6) {
                        case 0:
                            interfaceC0551N.mo1375H(i4, z3);
                            break;
                        default:
                            interfaceC0551N.mo1376I(i4, z3);
                            break;
                    }
                }
            };
            C0645m c0645m = this.f1829k;
            c0645m.m1618c(-1, interfaceC0642j);
            if (z7) {
                c0645m.m1618c(4, new C0527c(i4, 1));
            }
            if (z6) {
                final int i7 = 1;
                c0645m.m1618c(5, new InterfaceC0642j() { // from class: S.d
                    @Override // p064W.InterfaceC0642j
                    /* JADX INFO: renamed from: g */
                    public final void mo214g(Object obj) {
                        InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj;
                        switch (i7) {
                            case 0:
                                interfaceC0551N.mo1375H(i3, z3);
                                break;
                            default:
                                interfaceC0551N.mo1376I(i3, z3);
                                break;
                        }
                    }
                });
            }
            if (i4 == 3 && z3) {
                z4 = true;
            }
            if (z5 != z4) {
                c0645m.m1618c(7, new C0529e(0, z4));
            }
        }
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: f */
    public final C0548K mo1302f() {
        return (C0548K) this.f1833o.f140h;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m1303f0(C0233h c0233h) {
        C0233h c0233h2 = this.f1834p;
        if (c0233h2 == c0233h) {
            return;
        }
        C0531g c0531g = this.f1827i;
        if (c0233h2 != null) {
            AbstractC0491s.m1210b();
            if (c0531g != null) {
                c0233h2.f610i.remove(c0531g);
            }
            C0233h c0233h3 = this.f1834p;
            c0233h3.getClass();
            AbstractC0491s.m1210b();
            C0246u c0246u = (C0246u) c0233h3.f611j.remove(c0531g);
            if (c0246u != null) {
                HashSet hashSet = c0246u.f640a;
                hashSet.remove(c0531g);
                if (hashSet.isEmpty()) {
                    c0233h3.f612k.remove(Long.valueOf(c0246u.f641b));
                    c0246u.f644e.f603b.removeCallbacks(c0246u.f642c);
                    c0246u.f643d = false;
                }
            }
        }
        this.f1834p = c0233h;
        if (c0233h == null) {
            C1375o c1375o = this.f1830l;
            if (c1375o != null) {
                PlayerActivity playerActivity = c1375o.f6094g;
                playerActivity.m3456w(playerActivity.f6022E);
                return;
            }
            return;
        }
        C1375o c1375o2 = this.f1830l;
        if (c1375o2 != null) {
            PlayerActivity playerActivity2 = c1375o2.f6094g;
            playerActivity2.m3456w(playerActivity2.f6023F);
        }
        c0233h.m765o(c0531g);
        AbstractC0491s.m1210b();
        if (c0531g != null) {
            ConcurrentHashMap concurrentHashMap = c0233h.f611j;
            if (!concurrentHashMap.containsKey(c0531g)) {
                ConcurrentHashMap concurrentHashMap2 = c0233h.f612k;
                C0246u c0246u2 = (C0246u) concurrentHashMap2.get(1000L);
                if (c0246u2 == null) {
                    c0246u2 = new C0246u(c0233h);
                    concurrentHashMap2.put(1000L, c0246u2);
                }
                c0246u2.f640a.add(c0531g);
                concurrentHashMap.put(c0531g, c0246u2);
                if (c0233h.m757g()) {
                    C0233h c0233h4 = c0246u2.f644e;
                    HandlerC0784e handlerC0784e = c0233h4.f603b;
                    C0245t c0245t = c0246u2.f642c;
                    handlerC0784e.removeCallbacks(c0245t);
                    c0246u2.f643d = true;
                    c0233h4.f603b.postDelayed(c0245t, c0246u2.f641b);
                }
            }
        }
        m1309i0();
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: g */
    public final int mo1304g() {
        return this.f1838t;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m1305g0(int i3) {
        C0106b c0106b = this.f1832n;
        if (((Integer) c0106b.f140h).intValue() != i3) {
            c0106b.f140h = Integer.valueOf(i3);
            this.f1829k.m1618c(8, new C0527c(i3, 0));
            m1307h0();
        }
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: h */
    public final AbstractC0547J mo1306h() {
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m1307h0() {
        C0549L c0549l = this.f1837s;
        C0549L c0549lM1599r = AbstractC0632A.m1599r(this, f1817B);
        this.f1837s = c0549lM1599r;
        if (c0549lM1599r.equals(c0549l)) {
            return;
        }
        this.f1829k.m1618c(13, new C0526b(this, 1));
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: i */
    public final void mo1308i(boolean z3) {
        C0234i c0234i;
        BasePendingResult basePendingResultM749r;
        if (this.f1834p == null) {
            return;
        }
        m1301e0(1, this.f1838t, z3);
        this.f1829k.m1617b();
        if (z3) {
            C0233h c0233h = this.f1834p;
            c0233h.getClass();
            AbstractC0491s.m1210b();
            if (c0233h.m772w()) {
                c0234i = new C0234i(c0233h, 6);
                C0233h.m750x(c0234i);
                basePendingResultM749r = c0234i;
            } else {
                basePendingResultM749r = C0233h.m749r();
            }
        } else {
            C0233h c0233h2 = this.f1834p;
            c0233h2.getClass();
            AbstractC0491s.m1210b();
            if (c0233h2.m772w()) {
                c0234i = new C0234i(c0233h2, 4);
                C0233h.m750x(c0234i);
                basePendingResultM749r = c0234i;
            } else {
                basePendingResultM749r = C0233h.m749r();
            }
        }
        C0530f c0530f = new C0530f(this, 0);
        this.f1831m.f141i = c0530f;
        basePendingResultM749r.m3083J(c0530f);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m1309i0() {
        Object obj;
        Object obj2;
        boolean z3;
        int i3 = 4;
        int i4 = 2;
        boolean z4 = false;
        if (this.f1834p == null) {
            return;
        }
        int i5 = this.f1839u;
        C0542E c0542e = this.f1819A;
        boolean zM1415p = this.f1835q.m1415p();
        C0556T c0556t = this.f1826h;
        if (zM1415p) {
            obj = null;
        } else {
            this.f1835q.mo1329f(i5, c0556t, true);
            obj = c0556t.f1967b;
        }
        m1313k0(null);
        m1315l0(null);
        m1311j0(null);
        boolean zM1317m0 = m1317m0();
        C0534j c0534j = this.f1835q;
        this.f1839u = m1280b0(this.f1834p, c0534j);
        C0539B c0539bM1087S = m1087S();
        this.f1819A = c0539bM1087S != null ? c0539bM1087S.f1877d : C0542E.f1910D;
        if (c0534j.m1415p()) {
            obj2 = null;
        } else {
            c0534j.mo1329f(this.f1839u, c0556t, true);
            obj2 = c0556t.f1967b;
        }
        C0645m c0645m = this.f1829k;
        if (!zM1317m0 && !Objects.equals(obj, obj2) && this.f1841w == 0) {
            c0534j.mo1329f(i5, c0556t, true);
            C0557U c0557u = (C0557U) this.f1360a;
            c0534j.m1414n(i5, c0557u);
            long jM1581V = AbstractC0632A.m1581V(c0557u.f1987m);
            Object obj3 = c0557u.f1975a;
            int i6 = c0556t.f1968c;
            C0552O c0552o = new C0552O(obj3, i6, c0557u.f1977c, c0556t.f1967b, i6, jM1581V, jM1581V, -1, -1);
            c0534j.mo1329f(this.f1839u, c0556t, true);
            c0534j.m1414n(this.f1839u, c0557u);
            Object obj4 = c0557u.f1975a;
            int i7 = c0556t.f1968c;
            c0645m.m1618c(11, new C0525a(1, c0552o, new C0552O(obj4, i7, c0557u.f1977c, c0556t.f1967b, i7, AbstractC0632A.m1581V(c0557u.f1986l), AbstractC0632A.m1581V(c0557u.f1986l), -1, -1)));
            c0645m.m1618c(1, new C0526b(this, i4));
        }
        C0233h c0233h = this.f1834p;
        if (c0233h != null) {
            C0142q c0142qM754d = c0233h != null ? c0233h.m754d() : null;
            MediaInfo mediaInfo = c0142qM754d != null ? c0142qM754d.f304g : null;
            ArrayList arrayList = mediaInfo != null ? mediaInfo.f5449l : null;
            if (arrayList == null || arrayList.isEmpty()) {
                C0568c0 c0568c0 = C0568c0.f2054b;
                z4 = !c0568c0.equals(this.f1836r);
                this.f1836r = c0568c0;
            } else {
                long[] jArr = c0142qM754d.f314q;
                if (jArr == null) {
                    jArr = f1818C;
                }
                C0566b0[] c0566b0Arr = new C0566b0[arrayList.size()];
                int i8 = 0;
                while (i8 < arrayList.size()) {
                    MediaTrack mediaTrack = (MediaTrack) arrayList.get(i8);
                    String string = Integer.toString(i8);
                    C0582n c0582n = new C0582n();
                    c0582n.f2102a = mediaTrack.f5464i;
                    c0582n.f2113l = AbstractC0545H.m1364l(mediaTrack.f5465j);
                    c0582n.f2105d = mediaTrack.f5467l;
                    C0559W c0559w = new C0559W(string, new C0583o(c0582n));
                    int[] iArr = {i3};
                    int length = jArr.length;
                    int i9 = 0;
                    while (true) {
                        if (i9 >= length) {
                            z3 = false;
                            break;
                        } else {
                            if (jArr[i9] == mediaTrack.f5462g) {
                                z3 = true;
                                break;
                            }
                            i9++;
                        }
                    }
                    c0566b0Arr[i8] = new C0566b0(c0559w, false, iArr, new boolean[]{z3});
                    i8++;
                    i3 = 4;
                }
                C0568c0 c0568c1 = new C0568c0(AbstractC1676G.m4118o(c0566b0Arr));
                if (!c0568c1.equals(this.f1836r)) {
                    this.f1836r = c0568c1;
                    z4 = true;
                }
            }
        }
        if (z4) {
            c0645m.m1618c(2, new C0526b(this, 3));
        }
        if (!c0542e.equals(this.f1819A)) {
            c0645m.m1618c(14, new C0526b(this, 4));
        }
        m1307h0();
        c0645m.m1617b();
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: j */
    public final boolean mo1310j() {
        return false;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m1311j0(C0530f c0530f) {
        C0106b c0106b = this.f1833o;
        if (((InterfaceC0399l) c0106b.f141i) == c0530f) {
            C0142q c0142qM754d = this.f1834p.m754d();
            float f = c0142qM754d != null ? (float) c0142qM754d.f307j : C0548K.f1948d.f1949a;
            if (f > 0.0f) {
                m1299d0(new C0548K(f));
            }
            c0106b.f141i = null;
        }
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: k */
    public final long mo1312k() {
        return this.f1823e;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m1313k0(C0530f c0530f) {
        C0106b c0106b = this.f1831m;
        boolean zBooleanValue = ((Boolean) c0106b.f140h).booleanValue();
        int i3 = 1;
        if (((InterfaceC0399l) c0106b.f141i) == c0530f) {
            zBooleanValue = !this.f1834p.m761k();
            c0106b.f141i = null;
        }
        int i4 = zBooleanValue != ((Boolean) c0106b.f140h).booleanValue() ? 4 : 1;
        int iM755e = this.f1834p.m755e();
        if (iM755e == 2 || iM755e == 3) {
            i3 = 3;
        } else if (iM755e == 4 || iM755e == 5) {
            i3 = 2;
        }
        m1301e0(i4, i3, zBooleanValue);
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: l */
    public final void mo1314l(InterfaceC0551N interfaceC0551N) {
        this.f1829k.m1616a(interfaceC0551N);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m1315l0(C0530f c0530f) {
        int i3;
        C0106b c0106b = this.f1832n;
        if (((InterfaceC0399l) c0106b.f141i) == c0530f) {
            C0142q c0142qM754d = this.f1834p.m754d();
            int i4 = 0;
            if (c0142qM754d != null && (i3 = c0142qM754d.f319v) != 0) {
                i4 = 2;
                if (i3 != 1) {
                    if (i3 == 2) {
                        i4 = 1;
                    } else if (i3 != 3) {
                        throw new IllegalStateException();
                    }
                }
            }
            m1305g0(i4);
            c0106b.f141i = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0253  */
    /* JADX WARN: Code duplicated, block: B:82:0x01da A[Catch: JSONException -> 0x01e1, TryCatch #0 {JSONException -> 0x01e1, blocks: (B:80:0x01b0, B:82:0x01da, B:85:0x01e3, B:87:0x01e9, B:88:0x01f0), top: B:127:0x01b0 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01e9 A[Catch: JSONException -> 0x01e1, TryCatch #0 {JSONException -> 0x01e1, blocks: (B:80:0x01b0, B:82:0x01da, B:85:0x01e3, B:87:0x01e9, B:88:0x01f0), top: B:127:0x01b0 }] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: m0 */
    public final boolean m1317m0() {
        C0534j c0534j;
        boolean z3;
        C0228c c0228c;
        MediaInfo mediaInfo;
        String str;
        ArrayList arrayList;
        JSONObject jSONObject;
        C0586r c0586r;
        C0539B c0539bM1450a;
        C0534j c0534j2 = this.f1835q;
        int i3 = this.f1839u;
        C0233h c0233h = this.f1834p;
        if ((c0233h != null ? c0233h.m754d() : null) != null) {
            C0106b c0106b = this.f1825g;
            C0233h c0233h2 = this.f1834p;
            c0106b.getClass();
            synchronized (c0233h2.f602a) {
                AbstractC0491s.m1210b();
                c0228c = c0233h2.f606e;
            }
            c0228c.getClass();
            AbstractC0491s.m1210b();
            int[] iArrM829f = AbstractC0295a.m829f(c0228c.f538d);
            if (iArrM829f.length > 0) {
                HashSet hashSet = new HashSet(iArrM829f.length * 2);
                for (int i4 : iArrM829f) {
                    hashSet.add(Integer.valueOf(i4));
                }
                int i5 = 0;
                while (true) {
                    SparseArray sparseArray = (SparseArray) c0106b.f140h;
                    if (i5 >= sparseArray.size()) {
                        break;
                    }
                    if (hashSet.contains(Integer.valueOf(sparseArray.keyAt(i5)))) {
                        i5++;
                    } else {
                        ((HashMap) c0106b.f141i).remove(((C0533i) sparseArray.valueAt(i5)).f1850e);
                        sparseArray.removeAt(i5);
                    }
                }
            }
            C0142q c0142qM754d = c0233h2.m754d();
            if (c0142qM754d == null || (mediaInfo = c0142qM754d.f304g) == null) {
                c0534j = C0534j.f1851h;
            } else {
                int i6 = c0142qM754d.f306i;
                String str2 = mediaInfo.f5444g;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = str2;
                C0539B c0539b = (C0539B) ((HashMap) c0106b.f141i).get(str3);
                if (c0539b == null) {
                    c0539b = C0539B.f1873g;
                }
                c0106b.m511I(i6, c0539b, c0142qM754d.f304g, str3, -9223372036854775807L);
                ArrayList arrayList2 = c0142qM754d.f320w;
                int size = arrayList2.size();
                int i7 = 0;
                while (i7 < size) {
                    int i8 = i7 + 1;
                    C0140o c0140o = (C0140o) arrayList2.get(i7);
                    long j3 = (long) (c0140o.f293j * 1000000.0d);
                    MediaInfo mediaInfo2 = c0140o.f290g;
                    if (mediaInfo2 != null) {
                        str = mediaInfo2.f5444g;
                        if (str == null) {
                            str = "";
                        }
                    } else {
                        str = "UNKNOWN_CONTENT_ID";
                    }
                    String str4 = str;
                    C0539B c0539b2 = (C0539B) ((HashMap) c0106b.f141i).get(str4);
                    int i9 = c0140o.f291h;
                    if (c0539b2 != null) {
                        arrayList = arrayList2;
                        c0539bM1450a = c0539b2;
                    } else {
                        MediaInfo mediaInfo3 = c0140o.f290g;
                        mediaInfo3.getClass();
                        C0541D c0541d = new C0541D();
                        C0137l c0137l = mediaInfo3.f5447j;
                        try {
                            if (c0137l != null) {
                                Bundle bundle = c0137l.f273h;
                                arrayList = arrayList2;
                                if (bundle.containsKey("com.google.android.gms.cast.metadata.TITLE")) {
                                    c0541d.f1884a = c0137l.m591e("com.google.android.gms.cast.metadata.TITLE");
                                }
                                if (bundle.containsKey("com.google.android.gms.cast.metadata.SUBTITLE")) {
                                    c0541d.f1888e = c0137l.m591e("com.google.android.gms.cast.metadata.SUBTITLE");
                                }
                                if (bundle.containsKey("com.google.android.gms.cast.metadata.ARTIST")) {
                                    c0541d.f1885b = c0137l.m591e("com.google.android.gms.cast.metadata.ARTIST");
                                }
                                if (bundle.containsKey("com.google.android.gms.cast.metadata.ALBUM_ARTIST")) {
                                    c0541d.f1887d = c0137l.m591e("com.google.android.gms.cast.metadata.ALBUM_ARTIST");
                                }
                                if (bundle.containsKey("com.google.android.gms.cast.metadata.ALBUM_TITLE")) {
                                    c0541d.f1886c = c0137l.m591e("com.google.android.gms.cast.metadata.ALBUM_TITLE");
                                }
                                ArrayList arrayList3 = c0137l.f272g;
                                if (!arrayList3.isEmpty()) {
                                    c0541d.f1892i = ((C0448a) arrayList3.get(0)).f1511h;
                                }
                                if (bundle.containsKey("com.google.android.gms.cast.metadata.COMPOSER")) {
                                    c0541d.f1904u = c0137l.m591e("com.google.android.gms.cast.metadata.COMPOSER");
                                }
                                if (bundle.containsKey("com.google.android.gms.cast.metadata.DISC_NUMBER")) {
                                    C0137l.m589g(2, "com.google.android.gms.cast.metadata.DISC_NUMBER");
                                    c0541d.f1906w = Integer.valueOf(c0137l.f273h.getInt("com.google.android.gms.cast.metadata.DISC_NUMBER"));
                                }
                                if (bundle.containsKey("com.google.android.gms.cast.metadata.TRACK_NUMBER")) {
                                    C0137l.m589g(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER");
                                    c0541d.f1893j = Integer.valueOf(c0137l.f273h.getInt("com.google.android.gms.cast.metadata.TRACK_NUMBER"));
                                }
                                JSONObject jSONObject2 = mediaInfo3.f5461x;
                                jSONObject2.getClass();
                                C0542E c0542e = new C0542E(c0541d);
                                jSONObject = jSONObject2.getJSONObject("mediaItem");
                                c0586r = new C0586r();
                                c0586r.f2171b = Uri.parse(jSONObject.getString("uri"));
                                String string = jSONObject.getString("mediaId");
                                string.getClass();
                                c0586r.f2170a = string;
                                c0586r.f2178i = c0542e;
                                if (jSONObject.has("mimeType")) {
                                    c0586r.f2172c = jSONObject.getString("mimeType");
                                }
                                if (jSONObject.has("drmConfiguration")) {
                                    C0352g.m962G(jSONObject.getJSONObject("drmConfiguration"), c0586r);
                                }
                                c0539bM1450a = c0586r.m1450a();
                                c0106b = c0106b;
                            } else {
                                arrayList = arrayList2;
                                c0106b = c0106b;
                            }
                            jSONObject = jSONObject2.getJSONObject("mediaItem");
                            c0586r = new C0586r();
                            c0586r.f2171b = Uri.parse(jSONObject.getString("uri"));
                            String string2 = jSONObject.getString("mediaId");
                            string2.getClass();
                            c0586r.f2170a = string2;
                            c0586r.f2178i = c0542e;
                            if (jSONObject.has("mimeType")) {
                                c0586r.f2172c = jSONObject.getString("mimeType");
                            }
                            if (jSONObject.has("drmConfiguration")) {
                                C0352g.m962G(jSONObject.getJSONObject("drmConfiguration"), c0586r);
                            }
                            c0539bM1450a = c0586r.m1450a();
                            c0106b = c0106b;
                        } catch (JSONException e3) {
                            throw new RuntimeException(e3);
                        }
                        JSONObject jSONObject3 = mediaInfo3.f5461x;
                        jSONObject3.getClass();
                        C0542E c0542e2 = new C0542E(c0541d);
                    }
                    c0106b.m511I(i9, c0539bM1450a, mediaInfo2, str4, j3);
                    i7 = i8;
                    arrayList2 = arrayList;
                }
                c0534j = new C0534j(iArrM829f, (SparseArray) c0106b.f140h);
            }
        } else {
            c0534j = C0534j.f1851h;
        }
        this.f1835q = c0534j;
        boolean zEquals = c0534j2.equals(c0534j);
        if (!zEquals) {
            this.f1839u = m1280b0(this.f1834p, this.f1835q);
        }
        if (zEquals) {
            return false;
        }
        this.f1829k.m1618c(0, new C0041i(this.f1835q));
        C0534j c0534j3 = this.f1835q;
        if (c0534j2.m1415p()) {
            z3 = false;
        } else {
            C0556T c0556t = this.f1826h;
            c0534j2.mo1329f(i3, c0556t, true);
            if (c0534j3.mo1328b(c0556t.f1967b) == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        if (z3) {
            C0552O c0552o = this.f1844z;
            if (c0552o != null) {
                this.f1844z = null;
            } else {
                c0534j2.mo1329f(i3, this.f1826h, true);
                c0534j2.m1414n(this.f1826h.f1968c, (C0557U) this.f1360a);
                C0557U c0557u = (C0557U) this.f1360a;
                Object obj = c0557u.f1975a;
                C0556T c0556t2 = this.f1826h;
                int i10 = c0556t2.f1968c;
                c0552o = new C0552O(obj, i10, c0557u.f1977c, c0556t2.f1967b, i10, mo1291M(), mo1291M(), -1, -1);
            }
            this.f1829k.m1618c(11, new C0525a(2, c0552o, m1297c0()));
        }
        boolean z4 = c0534j3.m1415p() != c0534j2.m1415p() || z3;
        if (z4) {
            this.f1829k.m1618c(1, new C0526b(this, 0));
        }
        m1307h0();
        return z4;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: q */
    public final C0549L mo1320q() {
        return this.f1837s;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: r */
    public final int mo1321r() {
        return 0;
    }

    @Override // p055T.InterfaceC0553P
    public final void stop() {
        this.f1838t = 1;
        C0233h c0233h = this.f1834p;
        if (c0233h != null) {
            AbstractC0491s.m1210b();
            if (c0233h.m772w()) {
                C0233h.m750x(new C0234i(c0233h, 5));
            } else {
                C0233h.m749r();
            }
        }
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: t */
    public final boolean mo1322t() {
        return ((Boolean) this.f1831m.f140h).booleanValue();
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: w */
    public final AbstractC0558V mo1324w() {
        return this.f1835q;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: x */
    public final void mo1325x(InterfaceC0551N interfaceC0551N) {
        this.f1829k.m1620e(interfaceC0551N);
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: y */
    public final Looper mo1326y() {
        return Looper.getMainLooper();
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: z */
    public final C0568c0 mo1327z() {
        return this.f1836r;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: b */
    public final void mo1295b() {
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: H */
    public final void mo1286H(TextureView textureView) {
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: I */
    public final void mo1287I(TextureView textureView) {
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: m */
    public final void mo1316m(C0564a0 c0564a0) {
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: o */
    public final void mo1318o(SurfaceView surfaceView) {
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: p */
    public final void mo1319p(SurfaceView surfaceView) {
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: v */
    public final void mo1323v(boolean z3) {
    }
}
