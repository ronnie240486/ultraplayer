package p077a0;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.zuxoplayer.app.PlayerActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import p011E.C0111d;
import p034L1.C0352g;
import p038N.AbstractC0402b;
import p046P1.C0471D;
import p049Q1.C0513b;
import p052S.C0527c;
import p052S.C0529e;
import p055T.AbstractC0540C;
import p055T.AbstractC0547J;
import p055T.AbstractC0558V;
import p055T.C0539B;
import p055T.C0541D;
import p055T.C0542E;
import p055T.C0544G;
import p055T.C0548K;
import p055T.C0549L;
import p055T.C0552O;
import p055T.C0556T;
import p055T.C0557U;
import p055T.C0564a0;
import p055T.C0567c;
import p055T.C0568c0;
import p055T.C0574f0;
import p055T.C0576h;
import p055T.C0581m;
import p055T.C0584p;
import p055T.InterfaceC0543F;
import p055T.InterfaceC0551N;
import p060U1.AbstractC0610a;
import p061V.C0615c;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0635c;
import p064W.C0645m;
import p064W.C0652t;
import p064W.C0653u;
import p064W.C0654v;
import p064W.C0655w;
import p064W.InterfaceC0642j;
import p064W.RunnableC0647o;
import p067X.C0687s;
import p071Y0.C0760w;
import p082b0.C1060a;
import p082b0.C1062c;
import p082b0.C1064e;
import p082b0.C1071l;
import p089d1.C1447t;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;
import p114k0.AbstractC1932a;
import p114k0.C1907A;
import p114k0.C1937c0;
import p114k0.C1945g0;
import p114k0.InterfaceC1966z;
import p125n0.AbstractC2044u;
import p125n0.C2032i;
import p125n0.C2033j;
import p125n0.C2040q;
import p125n0.C2045v;
import p125n0.InterfaceC2042s;
import p129o0.C2063c;
import p129o0.C2068h;
import p129o0.InterfaceC2064d;
import p137q0.InterfaceC2153n;
import p141r0.C2194k;

/* JADX INFO: renamed from: a0.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0792C extends AbstractC0402b implements ExoPlayer {

    /* JADX INFO: renamed from: A */
    public final C0817b f3207A;

    /* JADX INFO: renamed from: B */
    public final C0825f f3208B;

    /* JADX INFO: renamed from: C */
    public final C0352g f3209C;

    /* JADX INFO: renamed from: D */
    public final C0352g f3210D;

    /* JADX INFO: renamed from: E */
    public final long f3211E;

    /* JADX INFO: renamed from: F */
    public int f3212F;

    /* JADX INFO: renamed from: G */
    public boolean f3213G;

    /* JADX INFO: renamed from: H */
    public int f3214H;

    /* JADX INFO: renamed from: I */
    public int f3215I;

    /* JADX INFO: renamed from: J */
    public boolean f3216J;

    /* JADX INFO: renamed from: K */
    public C1937c0 f3217K;

    /* JADX INFO: renamed from: L */
    public C0549L f3218L;

    /* JADX INFO: renamed from: M */
    public C0542E f3219M;

    /* JADX INFO: renamed from: N */
    public Object f3220N;

    /* JADX INFO: renamed from: O */
    public Surface f3221O;

    /* JADX INFO: renamed from: P */
    public SurfaceHolder f3222P;

    /* JADX INFO: renamed from: Q */
    public C2194k f3223Q;

    /* JADX INFO: renamed from: R */
    public boolean f3224R;

    /* JADX INFO: renamed from: S */
    public TextureView f3225S;

    /* JADX INFO: renamed from: T */
    public final int f3226T;

    /* JADX INFO: renamed from: U */
    public C0652t f3227U;

    /* JADX INFO: renamed from: V */
    public C0567c f3228V;

    /* JADX INFO: renamed from: W */
    public final float f3229W;

    /* JADX INFO: renamed from: X */
    public boolean f3230X;

    /* JADX INFO: renamed from: Y */
    public C0615c f3231Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f3232Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f3233a0;

    /* JADX INFO: renamed from: b */
    public final C2045v f3234b;

    /* JADX INFO: renamed from: b0 */
    public final int f3235b0;

    /* JADX INFO: renamed from: c */
    public final C0549L f3236c;

    /* JADX INFO: renamed from: c0 */
    public boolean f3237c0;

    /* JADX INFO: renamed from: d */
    public final C0635c f3238d;

    /* JADX INFO: renamed from: d0 */
    public C0574f0 f3239d0;

    /* JADX INFO: renamed from: e */
    public final Context f3240e;

    /* JADX INFO: renamed from: e0 */
    public C0542E f3241e0;

    /* JADX INFO: renamed from: f */
    public final C0792C f3242f;

    /* JADX INFO: renamed from: f0 */
    public C0818b0 f3243f0;

    /* JADX INFO: renamed from: g */
    public final AbstractC0827g[] f3244g;

    /* JADX INFO: renamed from: g0 */
    public int f3245g0;

    /* JADX INFO: renamed from: h */
    public final AbstractC2044u f3246h;

    /* JADX INFO: renamed from: h0 */
    public long f3247h0;

    /* JADX INFO: renamed from: i */
    public final C0655w f3248i;

    /* JADX INFO: renamed from: j */
    public final C0846v f3249j;

    /* JADX INFO: renamed from: k */
    public final C0797H f3250k;

    /* JADX INFO: renamed from: l */
    public final C0645m f3251l;

    /* JADX INFO: renamed from: m */
    public final CopyOnWriteArraySet f3252m;

    /* JADX INFO: renamed from: n */
    public final C0556T f3253n;

    /* JADX INFO: renamed from: o */
    public final ArrayList f3254o;

    /* JADX INFO: renamed from: p */
    public final boolean f3255p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC1966z f3256q;

    /* JADX INFO: renamed from: r */
    public final C1064e f3257r;

    /* JADX INFO: renamed from: s */
    public final Looper f3258s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC2064d f3259t;

    /* JADX INFO: renamed from: u */
    public final long f3260u;

    /* JADX INFO: renamed from: v */
    public final long f3261v;

    /* JADX INFO: renamed from: w */
    public final long f3262w;

    /* JADX INFO: renamed from: x */
    public final C0653u f3263x;

    /* JADX INFO: renamed from: y */
    public final SurfaceHolderCallbackC0850z f3264y;

    /* JADX INFO: renamed from: z */
    public final C0790A f3265z;

    static {
        AbstractC0540C.m1348a("media3.exoplayer");
    }

    public C0792C(C0842r c0842r) {
        super(1);
        this.f3238d = new C0635c();
        try {
            AbstractC0646n.m1639q("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.5.1] [" + AbstractC0632A.f2458e + "]");
            PlayerActivity playerActivity = c0842r.f3575a;
            Context applicationContext = playerActivity.getApplicationContext();
            this.f3240e = applicationContext;
            C0653u c0653u = c0842r.f3576b;
            C1064e c1064e = new C1064e(c0653u);
            this.f3257r = c1064e;
            this.f3235b0 = c0842r.f3582h;
            this.f3228V = c0842r.f3583i;
            this.f3226T = c0842r.f3584j;
            this.f3230X = false;
            this.f3211E = c0842r.f3592r;
            SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z = new SurfaceHolderCallbackC0850z(this);
            this.f3264y = surfaceHolderCallbackC0850z;
            this.f3265z = new C0790A();
            Handler handler = new Handler(c0842r.f3581g);
            AbstractC0827g[] abstractC0827gArrM2110a = ((C0838n) c0842r.f3577c.get()).m2110a(handler, surfaceHolderCallbackC0850z, surfaceHolderCallbackC0850z, surfaceHolderCallbackC0850z, surfaceHolderCallbackC0850z);
            this.f3244g = abstractC0827gArrM2110a;
            AbstractC0646n.m1630h(abstractC0827gArrM2110a.length > 0);
            AbstractC2044u abstractC2044u = (AbstractC2044u) c0842r.f3579e.get();
            this.f3246h = abstractC2044u;
            this.f3256q = (InterfaceC1966z) c0842r.f3578d.get();
            InterfaceC2064d interfaceC2064d = (InterfaceC2064d) c0842r.f3580f.get();
            this.f3259t = interfaceC2064d;
            this.f3255p = c0842r.f3585k;
            C0832i0 c0832i0 = c0842r.f3586l;
            this.f3260u = c0842r.f3587m;
            this.f3261v = c0842r.f3588n;
            this.f3262w = c0842r.f3589o;
            Looper looper = c0842r.f3581g;
            this.f3258s = looper;
            this.f3263x = c0653u;
            this.f3242f = this;
            this.f3251l = new C0645m(looper, c0653u, new C0846v(this));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f3252m = copyOnWriteArraySet;
            this.f3254o = new ArrayList();
            this.f3217K = new C1937c0();
            C2045v c2045v = new C2045v(new C0830h0[abstractC0827gArrM2110a.length], new InterfaceC2042s[abstractC0827gArrM2110a.length], C0568c0.f2054b, null);
            this.f3234b = c2045v;
            this.f3253n = new C0556T();
            C0471D c0471d = new C0471D();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            int i3 = 0;
            for (int i4 = 20; i3 < i4; i4 = 20) {
                c0471d.m1184a(iArr[i3]);
                i3++;
            }
            c0471d.m1184a(29);
            C0581m c0581mM1185b = c0471d.m1185b();
            this.f3236c = new C0549L(c0581mM1185b);
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int i5 = 0;
            while (i5 < c0581mM1185b.f2090a.size()) {
                int iM1445a = c0581mM1185b.m1445a(i5);
                AbstractC0646n.m1630h(!false);
                sparseBooleanArray.append(iM1445a, true);
                i5++;
                c0581mM1185b = c0581mM1185b;
            }
            AbstractC0646n.m1630h(!false);
            sparseBooleanArray.append(4, true);
            AbstractC0646n.m1630h(!false);
            sparseBooleanArray.append(10, true);
            AbstractC0646n.m1630h(!false);
            this.f3218L = new C0549L(new C0581m(sparseBooleanArray));
            this.f3248i = c0653u.m1693a(looper, null);
            C0846v c0846v = new C0846v(this);
            this.f3249j = c0846v;
            this.f3243f0 = C0818b0.m2060i(c2045v);
            c1064e.m2837S(this, looper);
            int i6 = AbstractC0632A.f2454a;
            String str = c0842r.f3595u;
            this.f3250k = new C0797H(abstractC0827gArrM2110a, abstractC2044u, c2045v, new C0836l(), interfaceC2064d, this.f3212F, this.f3213G, c1064e, c0832i0, c0842r.f3590p, c0842r.f3591q, looper, c0653u, c0846v, i6 < 31 ? new C1071l(str) : AbstractC0610a.m1493E(applicationContext, this, c0842r.f3593s, str));
            this.f3229W = 1.0f;
            this.f3212F = 0;
            C0542E c0542e = C0542E.f1910D;
            this.f3219M = c0542e;
            this.f3241e0 = c0542e;
            this.f3245g0 = -1;
            AudioManager audioManager = (AudioManager) this.f3240e.getSystemService("audio");
            int iGenerateAudioSessionId = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            this.f3231Y = C0615c.f2372b;
            this.f3232Z = true;
            mo1314l(this.f3257r);
            InterfaceC2064d interfaceC2064d2 = this.f3259t;
            Handler handler2 = new Handler(looper);
            C1064e c1064e2 = this.f3257r;
            C2068h c2068h = (C2068h) interfaceC2064d2;
            c2068h.getClass();
            c1064e2.getClass();
            C1447t c1447t = c2068h.f8984b;
            c1447t.getClass();
            CopyOnWriteArrayList<C2063c> copyOnWriteArrayList = (CopyOnWriteArrayList) c1447t.f6406h;
            for (C2063c c2063c : copyOnWriteArrayList) {
                if (c2063c.f8962b == c1064e2) {
                    c2063c.f8963c = true;
                    copyOnWriteArrayList.remove(c2063c);
                }
            }
            copyOnWriteArrayList.add(new C2063c(handler2, c1064e2));
            copyOnWriteArraySet.add(this.f3264y);
            SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z2 = this.f3264y;
            C0817b c0817b = new C0817b();
            c0817b.f3428b = playerActivity.getApplicationContext();
            c0817b.f3429c = new RunnableC0815a(c0817b, handler, surfaceHolderCallbackC0850z2);
            this.f3207A = c0817b;
            c0817b.m2057d();
            C0825f c0825f = new C0825f(playerActivity, handler, this.f3264y);
            this.f3208B = c0825f;
            c0825f.m2075b(null);
            C0352g c0352g = new C0352g(19);
            playerActivity.getApplicationContext();
            this.f3209C = c0352g;
            this.f3210D = new C0352g(playerActivity);
            C0576h c0576h = new C0576h(0);
            c0576h.f2075b = 0;
            c0576h.f2076c = 0;
            c0576h.m1442a();
            this.f3239d0 = C0574f0.f2070d;
            this.f3227U = C0652t.f2523c;
            this.f3246h.mo4613b(this.f3228V);
            m1922q0(1, 10, Integer.valueOf(iGenerateAudioSessionId));
            m1922q0(2, 10, Integer.valueOf(iGenerateAudioSessionId));
            m1922q0(1, 3, this.f3228V);
            m1922q0(2, 4, Integer.valueOf(this.f3226T));
            m1922q0(2, 5, 0);
            m1922q0(1, 9, Boolean.valueOf(this.f3230X));
            m1922q0(2, 7, this.f3265z);
            m1922q0(6, 8, this.f3265z);
            m1922q0(-1, 16, Integer.valueOf(this.f3235b0));
        } finally {
            this.f3238d.m1613c();
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static long m1907k0(C0818b0 c0818b0) {
        C0557U c0557u = new C0557U();
        C0556T c0556t = new C0556T();
        c0818b0.f3431a.mo1410g(c0818b0.f3432b.f8311a, c0556t);
        long j3 = c0818b0.f3433c;
        if (j3 != -9223372036854775807L) {
            return c0556t.f1970e + j3;
        }
        return c0818b0.f3431a.mo1332m(c0556t.f1968c, c0557u, 0L).f1986l;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: A */
    public final long mo1281A() {
        m1931z0();
        return this.f3262w;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: B */
    public final boolean mo1282B() {
        m1931z0();
        return this.f3213G;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: C */
    public final void mo1283C() {
        C0828g0 c0828g0;
        int i3;
        Pair pairM1918m0;
        m1931z0();
        ArrayList arrayList = this.f3254o;
        int size = arrayList.size();
        int iMin = Math.min(Integer.MAX_VALUE, size);
        if (size <= 0 || iMin == 0) {
            return;
        }
        C0818b0 c0818b0 = this.f3243f0;
        int iM1916j0 = m1916j0(c0818b0);
        long jM1912f0 = m1912f0(c0818b0);
        int size2 = arrayList.size();
        this.f3214H++;
        m1920o0(iMin);
        C0828g0 c0828g1 = new C0828g0(arrayList, this.f3217K);
        AbstractC0558V abstractC0558V = c0818b0.f3431a;
        if (abstractC0558V.m1415p() || c0828g1.m1415p()) {
            c0828g0 = c0828g1;
            i3 = 0;
            boolean z3 = !abstractC0558V.m1415p() && c0828g0.m1415p();
            pairM1918m0 = m1918m0(c0828g0, z3 ? -1 : iM1916j0, z3 ? -9223372036854775807L : jM1912f0);
        } else {
            pairM1918m0 = abstractC0558V.m1411i((C0557U) this.f1360a, this.f3253n, iM1916j0, AbstractC0632A.m1571L(jM1912f0));
            Object obj = pairM1918m0.first;
            if (c0828g1.mo1328b(obj) != -1) {
                c0828g0 = c0828g1;
                i3 = 0;
            } else {
                i3 = 0;
                int iM1934L = C0797H.m1934L((C0557U) this.f1360a, this.f3253n, this.f3212F, this.f3213G, obj, abstractC0558V, c0828g1);
                c0828g0 = c0828g1;
                if (iM1934L != -1) {
                    C0557U c0557u = (C0557U) this.f1360a;
                    c0828g0.mo1332m(iM1934L, c0557u, 0L);
                    pairM1918m0 = m1918m0(c0828g0, iM1934L, AbstractC0632A.m1581V(c0557u.f1986l));
                } else {
                    pairM1918m0 = m1918m0(c0828g0, -1, -9223372036854775807L);
                }
            }
        }
        C0818b0 c0818b0M1917l0 = m1917l0(c0818b0, c0828g0, pairM1918m0);
        int i4 = c0818b0M1917l0.f3435e;
        if (i4 != 1 && i4 != 4 && iMin > 0 && iMin == size2 && iM1916j0 >= c0818b0M1917l0.f3431a.mo1333o()) {
            c0818b0M1917l0 = c0818b0M1917l0.m2067g(4);
        }
        C1937c0 c1937c0 = this.f3217K;
        C0655w c0655w = this.f3250k.f3317o;
        c0655w.getClass();
        C0654v c0654vM1696b = C0655w.m1696b();
        c0654vM1696b.f2527a = c0655w.f2529a.obtainMessage(20, i3, iMin, c1937c0);
        c0654vM1696b.m1695b();
        m1929x0(c0818b0M1917l0, 0, !c0818b0M1917l0.f3432b.f8311a.equals(this.f3243f0.f3432b.f8311a), 4, m1915i0(c0818b0M1917l0), -1, false);
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: D */
    public final C0564a0 mo1284D() {
        m1931z0();
        return ((C2040q) this.f3246h).m4614e();
    }

    @Override // p038N.AbstractC0402b, p055T.InterfaceC0553P
    /* JADX INFO: renamed from: E */
    public final long mo1083E() {
        m1931z0();
        if (this.f3243f0.f3431a.m1415p()) {
            return this.f3247h0;
        }
        C0818b0 c0818b0 = this.f3243f0;
        long j3 = 0;
        if (c0818b0.f3441k.f8314d != c0818b0.f3432b.f8314d) {
            return AbstractC0632A.m1581V(c0818b0.f3431a.mo1332m(mo1292N(), (C0557U) this.f1360a, 0L).f1987m);
        }
        long j4 = c0818b0.f3447q;
        if (this.f3243f0.f3441k.m4422b()) {
            C0818b0 c0818b1 = this.f3243f0;
            c0818b1.f3431a.mo1410g(c0818b1.f3441k.f8311a, this.f3253n).m1399d(this.f3243f0.f3441k.f8312b);
        } else {
            j3 = j4;
        }
        C0818b0 c0818b2 = this.f3243f0;
        AbstractC0558V abstractC0558V = c0818b2.f3431a;
        Object obj = c0818b2.f3441k.f8311a;
        C0556T c0556t = this.f3253n;
        abstractC0558V.mo1410g(obj, c0556t);
        return AbstractC0632A.m1581V(j3 + c0556t.f1970e);
    }

    @Override // p038N.AbstractC0402b, p055T.InterfaceC0553P
    /* JADX INFO: renamed from: F */
    public final int mo1084F() {
        m1931z0();
        if (this.f3243f0.f3431a.m1415p()) {
            return 0;
        }
        C0818b0 c0818b0 = this.f3243f0;
        return c0818b0.f3431a.mo1328b(c0818b0.f3432b.f8311a);
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: G */
    public final C0615c mo1285G() {
        m1931z0();
        return this.f3231Y;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: H */
    public final void mo1286H(TextureView textureView) {
        m1931z0();
        if (textureView == null) {
            m1909c0();
            return;
        }
        m1921p0();
        this.f3225S = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            AbstractC0646n.m1647y("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f3264y);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            m1925t0(null);
            m1919n0(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            m1925t0(surface);
            this.f3221O = surface;
            m1919n0(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: I */
    public final void mo1287I(TextureView textureView) {
        m1931z0();
        if (textureView == null || textureView != this.f3225S) {
            return;
        }
        m1909c0();
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: J */
    public final C0574f0 mo1288J() {
        m1931z0();
        return this.f3239d0;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: K */
    public final C0542E mo1289K() {
        m1931z0();
        return this.f3219M;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: L */
    public final void mo1290L(C1692X c1692x) {
        m1931z0();
        ArrayList arrayListM1910d0 = m1910d0(c1692x);
        m1931z0();
        m1923r0(arrayListM1910d0, -1, -9223372036854775807L, true);
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: M */
    public final long mo1291M() {
        m1931z0();
        return AbstractC0632A.m1581V(m1915i0(this.f3243f0));
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: N */
    public final int mo1292N() {
        m1931z0();
        int iM1916j0 = m1916j0(this.f3243f0);
        if (iM1916j0 == -1) {
            return 0;
        }
        return iM1916j0;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: O */
    public final void mo1293O(C1692X c1692x, int i3, long j3) {
        m1931z0();
        ArrayList arrayListM1910d0 = m1910d0(c1692x);
        m1931z0();
        m1923r0(arrayListM1910d0, 0, j3, false);
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: P */
    public final long mo1294P() {
        m1931z0();
        return this.f3260u;
    }

    @Override // p038N.AbstractC0402b
    /* JADX INFO: renamed from: X */
    public final void mo1092X(int i3, long j3, boolean z3) {
        m1931z0();
        if (i3 == -1) {
            return;
        }
        AbstractC0646n.m1625c(i3 >= 0);
        AbstractC0558V abstractC0558V = this.f3243f0.f3431a;
        if (abstractC0558V.m1415p() || i3 < abstractC0558V.mo1333o()) {
            C1064e c1064e = this.f3257r;
            if (!c1064e.f4834o) {
                C1060a c1060aM2831M = c1064e.m2831M();
                c1064e.f4834o = true;
                c1064e.m2836R(c1060aM2831M, -1, new C1062c(6));
            }
            this.f3214H++;
            if (mo1310j()) {
                AbstractC0646n.m1647y("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C0760w c0760w = new C0760w(this.f3243f0);
                c0760w.m1872f(1);
                C0792C c0792c = this.f3249j.f3602g;
                c0792c.f3248i.m1698c(new RunnableC0647o(c0792c, 1, c0760w));
                return;
            }
            C0818b0 c0818b0M2067g = this.f3243f0;
            int i4 = c0818b0M2067g.f3435e;
            if (i4 == 3 || (i4 == 4 && !abstractC0558V.m1415p())) {
                c0818b0M2067g = this.f3243f0.m2067g(2);
            }
            int iMo1292N = mo1292N();
            C0818b0 c0818b0M1917l0 = m1917l0(c0818b0M2067g, abstractC0558V, m1918m0(abstractC0558V, i3, j3));
            this.f3250k.f3317o.m1697a(3, new C0796G(abstractC0558V, i3, AbstractC0632A.m1571L(j3))).m1695b();
            m1929x0(c0818b0M1917l0, 0, true, 1, m1915i0(c0818b0M1917l0), iMo1292N, z3);
        }
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: b */
    public final void mo1295b() {
        m1931z0();
        boolean zMo1322t = mo1322t();
        int iM2077d = this.f3208B.m2077d(2, zMo1322t);
        m1928w0(iM2077d, iM2077d == -1 ? 2 : 1, zMo1322t);
        C0818b0 c0818b0 = this.f3243f0;
        if (c0818b0.f3435e != 1) {
            return;
        }
        C0818b0 c0818b0M2065e = c0818b0.m2065e(null);
        C0818b0 c0818b0M2067g = c0818b0M2065e.m2067g(c0818b0M2065e.f3431a.m1415p() ? 4 : 2);
        this.f3214H++;
        C0655w c0655w = this.f3250k.f3317o;
        c0655w.getClass();
        C0654v c0654vM1696b = C0655w.m1696b();
        c0654vM1696b.f2527a = c0655w.f2529a.obtainMessage(29);
        c0654vM1696b.m1695b();
        m1929x0(c0818b0M2067g, 1, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: b0 */
    public final C0542E m1908b0() {
        AbstractC0558V abstractC0558VMo1324w = mo1324w();
        if (abstractC0558VMo1324w.m1415p()) {
            return this.f3241e0;
        }
        C0539B c0539b = abstractC0558VMo1324w.mo1332m(mo1292N(), (C0557U) this.f1360a, 0L).f1977c;
        C0541D c0541dM1350a = this.f3241e0.m1350a();
        C0542E c0542e = c0539b.f1877d;
        if (c0542e != null) {
            CharSequence charSequence = c0542e.f1914a;
            if (charSequence != null) {
                c0541dM1350a.f1884a = charSequence;
            }
            CharSequence charSequence2 = c0542e.f1915b;
            if (charSequence2 != null) {
                c0541dM1350a.f1885b = charSequence2;
            }
            CharSequence charSequence3 = c0542e.f1916c;
            if (charSequence3 != null) {
                c0541dM1350a.f1886c = charSequence3;
            }
            CharSequence charSequence4 = c0542e.f1917d;
            if (charSequence4 != null) {
                c0541dM1350a.f1887d = charSequence4;
            }
            String str = c0542e.f1918e;
            if (str != null) {
                c0541dM1350a.f1888e = str;
            }
            CharSequence charSequence5 = c0542e.f1919f;
            if (charSequence5 != null) {
                c0541dM1350a.f1889f = charSequence5;
            }
            byte[] bArr = c0542e.f1920g;
            Uri uri = c0542e.f1922i;
            if (uri != null || bArr != null) {
                c0541dM1350a.f1892i = uri;
                c0541dM1350a.f1890g = bArr == null ? null : (byte[]) bArr.clone();
                c0541dM1350a.f1891h = c0542e.f1921h;
            }
            Integer num = c0542e.f1923j;
            if (num != null) {
                c0541dM1350a.f1893j = num;
            }
            Integer num2 = c0542e.f1924k;
            if (num2 != null) {
                c0541dM1350a.f1894k = num2;
            }
            Integer num3 = c0542e.f1925l;
            if (num3 != null) {
                c0541dM1350a.f1895l = num3;
            }
            Boolean bool = c0542e.f1926m;
            if (bool != null) {
                c0541dM1350a.f1896m = bool;
            }
            Integer num4 = c0542e.f1927n;
            if (num4 != null) {
                c0541dM1350a.f1897n = num4;
            }
            Integer num5 = c0542e.f1928o;
            if (num5 != null) {
                c0541dM1350a.f1897n = num5;
            }
            Integer num6 = c0542e.f1929p;
            if (num6 != null) {
                c0541dM1350a.f1898o = num6;
            }
            Integer num7 = c0542e.f1930q;
            if (num7 != null) {
                c0541dM1350a.f1899p = num7;
            }
            Integer num8 = c0542e.f1931r;
            if (num8 != null) {
                c0541dM1350a.f1900q = num8;
            }
            Integer num9 = c0542e.f1932s;
            if (num9 != null) {
                c0541dM1350a.f1901r = num9;
            }
            Integer num10 = c0542e.f1933t;
            if (num10 != null) {
                c0541dM1350a.f1902s = num10;
            }
            CharSequence charSequence6 = c0542e.f1934u;
            if (charSequence6 != null) {
                c0541dM1350a.f1903t = charSequence6;
            }
            CharSequence charSequence7 = c0542e.f1935v;
            if (charSequence7 != null) {
                c0541dM1350a.f1904u = charSequence7;
            }
            CharSequence charSequence8 = c0542e.f1936w;
            if (charSequence8 != null) {
                c0541dM1350a.f1905v = charSequence8;
            }
            Integer num11 = c0542e.f1937x;
            if (num11 != null) {
                c0541dM1350a.f1906w = num11;
            }
            Integer num12 = c0542e.f1938y;
            if (num12 != null) {
                c0541dM1350a.f1907x = num12;
            }
            CharSequence charSequence9 = c0542e.f1939z;
            if (charSequence9 != null) {
                c0541dM1350a.f1908y = charSequence9;
            }
            CharSequence charSequence10 = c0542e.f1911A;
            if (charSequence10 != null) {
                c0541dM1350a.f1909z = charSequence10;
            }
            Integer num13 = c0542e.f1912B;
            if (num13 != null) {
                c0541dM1350a.f1882A = num13;
            }
            AbstractC1676G abstractC1676G = c0542e.f1913C;
            if (!abstractC1676G.isEmpty()) {
                c0541dM1350a.f1883B = AbstractC1676G.m4117n(abstractC1676G);
            }
        }
        return new C0542E(c0541dM1350a);
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: c */
    public final void mo1296c(int i3) {
        m1931z0();
        if (this.f3212F != i3) {
            this.f3212F = i3;
            C0655w c0655w = this.f3250k.f3317o;
            c0655w.getClass();
            C0654v c0654vM1696b = C0655w.m1696b();
            c0654vM1696b.f2527a = c0655w.f2529a.obtainMessage(11, i3, 0);
            c0654vM1696b.m1695b();
            C0527c c0527c = new C0527c(i3, 2);
            C0645m c0645m = this.f3251l;
            c0645m.m1618c(8, c0527c);
            m1927v0();
            c0645m.m1617b();
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m1909c0() {
        m1931z0();
        m1921p0();
        m1925t0(null);
        m1919n0(0, 0);
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: d */
    public final void mo1298d(C0548K c0548k) {
        m1931z0();
        if (this.f3243f0.f3445o.equals(c0548k)) {
            return;
        }
        C0818b0 c0818b0M2066f = this.f3243f0.m2066f(c0548k);
        this.f3214H++;
        this.f3250k.f3317o.m1697a(4, c0548k).m1695b();
        m1929x0(c0818b0M2066f, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: renamed from: d0 */
    public final ArrayList m1910d0(C1692X c1692x) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < c1692x.f7631j; i3++) {
            arrayList.add(this.f3256q.mo2584c((C0539B) c1692x.get(i3)));
        }
        return arrayList;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: e */
    public final int mo1300e() {
        m1931z0();
        return this.f3212F;
    }

    /* JADX INFO: renamed from: e0 */
    public final C0824e0 m1911e0(InterfaceC0822d0 interfaceC0822d0) {
        int iM1916j0 = m1916j0(this.f3243f0);
        AbstractC0558V abstractC0558V = this.f3243f0.f3431a;
        int i3 = iM1916j0 == -1 ? 0 : iM1916j0;
        C0797H c0797h = this.f3250k;
        return new C0824e0(c0797h, interfaceC0822d0, abstractC0558V, i3, this.f3263x, c0797h.f3319q);
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: f */
    public final C0548K mo1302f() {
        m1931z0();
        return this.f3243f0.f3445o;
    }

    /* JADX INFO: renamed from: f0 */
    public final long m1912f0(C0818b0 c0818b0) {
        if (!c0818b0.f3432b.m4422b()) {
            return AbstractC0632A.m1581V(m1915i0(c0818b0));
        }
        Object obj = c0818b0.f3432b.f8311a;
        AbstractC0558V abstractC0558V = c0818b0.f3431a;
        C0556T c0556t = this.f3253n;
        abstractC0558V.mo1410g(obj, c0556t);
        long j3 = c0818b0.f3433c;
        if (j3 == -9223372036854775807L) {
            return AbstractC0632A.m1581V(abstractC0558V.mo1332m(m1916j0(c0818b0), (C0557U) this.f1360a, 0L).f1986l);
        }
        return AbstractC0632A.m1581V(j3) + AbstractC0632A.m1581V(c0556t.f1970e);
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: g */
    public final int mo1304g() {
        m1931z0();
        return this.f3243f0.f3435e;
    }

    /* JADX INFO: renamed from: g0 */
    public final int m1913g0() {
        m1931z0();
        if (mo1310j()) {
            return this.f3243f0.f3432b.f8312b;
        }
        return -1;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: h */
    public final AbstractC0547J mo1306h() {
        m1931z0();
        return this.f3243f0.f3436f;
    }

    /* JADX INFO: renamed from: h0 */
    public final int m1914h0() {
        m1931z0();
        if (mo1310j()) {
            return this.f3243f0.f3432b.f8313c;
        }
        return -1;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: i */
    public final void mo1308i(boolean z3) {
        m1931z0();
        int iM2077d = this.f3208B.m2077d(mo1304g(), z3);
        m1928w0(iM2077d, iM2077d == -1 ? 2 : 1, z3);
    }

    /* JADX INFO: renamed from: i0 */
    public final long m1915i0(C0818b0 c0818b0) {
        if (c0818b0.f3431a.m1415p()) {
            return AbstractC0632A.m1571L(this.f3247h0);
        }
        long jM2069j = c0818b0.f3446p ? c0818b0.m2069j() : c0818b0.f3449s;
        if (c0818b0.f3432b.m4422b()) {
            return jM2069j;
        }
        AbstractC0558V abstractC0558V = c0818b0.f3431a;
        Object obj = c0818b0.f3432b.f8311a;
        C0556T c0556t = this.f3253n;
        abstractC0558V.mo1410g(obj, c0556t);
        return jM2069j + c0556t.f1970e;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: j */
    public final boolean mo1310j() {
        m1931z0();
        return this.f3243f0.f3432b.m4422b();
    }

    /* JADX INFO: renamed from: j0 */
    public final int m1916j0(C0818b0 c0818b0) {
        if (c0818b0.f3431a.m1415p()) {
            return this.f3245g0;
        }
        return c0818b0.f3431a.mo1410g(c0818b0.f3432b.f8311a, this.f3253n).f1968c;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: k */
    public final long mo1312k() {
        m1931z0();
        return this.f3261v;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: l */
    public final void mo1314l(InterfaceC0551N interfaceC0551N) {
        interfaceC0551N.getClass();
        this.f3251l.m1616a(interfaceC0551N);
    }

    /* JADX INFO: renamed from: l0 */
    public final C0818b0 m1917l0(C0818b0 c0818b0, AbstractC0558V abstractC0558V, Pair pair) {
        List list;
        AbstractC0646n.m1625c(abstractC0558V.m1415p() || pair != null);
        AbstractC0558V abstractC0558V2 = c0818b0.f3431a;
        long jM1912f0 = m1912f0(c0818b0);
        C0818b0 c0818b0M2068h = c0818b0.m2068h(abstractC0558V);
        if (abstractC0558V.m1415p()) {
            C1907A c1907a = C0818b0.f3430u;
            long jM1571L = AbstractC0632A.m1571L(this.f3247h0);
            C0818b0 c0818b0M2062b = c0818b0M2068h.m2063c(c1907a, jM1571L, jM1571L, jM1571L, 0L, C1945g0.f8525d, this.f3234b, C1692X.f7629k).m2062b(c1907a);
            c0818b0M2062b.f3447q = c0818b0M2062b.f3449s;
            return c0818b0M2062b;
        }
        Object obj = c0818b0M2068h.f3432b.f8311a;
        boolean zEquals = obj.equals(pair.first);
        C1907A c1907a2 = !zEquals ? new C1907A(pair.first) : c0818b0M2068h.f3432b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM1571L2 = AbstractC0632A.m1571L(jM1912f0);
        if (!abstractC0558V2.m1415p()) {
            jM1571L2 -= abstractC0558V2.mo1410g(obj, this.f3253n).f1970e;
        }
        if (!zEquals || jLongValue < jM1571L2) {
            C1907A c1907a3 = c1907a2;
            AbstractC0646n.m1630h(!c1907a3.m4422b());
            C1945g0 c1945g0 = !zEquals ? C1945g0.f8525d : c0818b0M2068h.f3438h;
            C2045v c2045v = !zEquals ? this.f3234b : c0818b0M2068h.f3439i;
            if (zEquals) {
                list = c0818b0M2068h.f3440j;
            } else {
                C1674E c1674e = AbstractC1676G.f7601h;
                list = C1692X.f7629k;
            }
            C0818b0 c0818b0M2062b2 = c0818b0M2068h.m2063c(c1907a3, jLongValue, jLongValue, jLongValue, 0L, c1945g0, c2045v, list).m2062b(c1907a3);
            c0818b0M2062b2.f3447q = jLongValue;
            return c0818b0M2062b2;
        }
        if (jLongValue != jM1571L2) {
            C1907A c1907a4 = c1907a2;
            AbstractC0646n.m1630h(!c1907a4.m4422b());
            long jMax = Math.max(0L, c0818b0M2068h.f3448r - (jLongValue - jM1571L2));
            long j3 = c0818b0M2068h.f3447q;
            if (c0818b0M2068h.f3441k.equals(c0818b0M2068h.f3432b)) {
                j3 = jLongValue + jMax;
            }
            C0818b0 c0818b0M2063c = c0818b0M2068h.m2063c(c1907a4, jLongValue, jLongValue, jLongValue, jMax, c0818b0M2068h.f3438h, c0818b0M2068h.f3439i, c0818b0M2068h.f3440j);
            c0818b0M2063c.f3447q = j3;
            return c0818b0M2063c;
        }
        int iMo1328b = abstractC0558V.mo1328b(c0818b0M2068h.f3441k.f8311a);
        if (iMo1328b != -1 && abstractC0558V.mo1329f(iMo1328b, this.f3253n, false).f1968c == abstractC0558V.mo1410g(c1907a2.f8311a, this.f3253n).f1968c) {
            return c0818b0M2068h;
        }
        abstractC0558V.mo1410g(c1907a2.f8311a, this.f3253n);
        long jM1396a = c1907a2.m4422b() ? this.f3253n.m1396a(c1907a2.f8312b, c1907a2.f8313c) : this.f3253n.f1969d;
        C1907A c1907a5 = c1907a2;
        C0818b0 c0818b0M2062b3 = c0818b0M2068h.m2063c(c1907a5, c0818b0M2068h.f3449s, c0818b0M2068h.f3449s, c0818b0M2068h.f3434d, jM1396a - c0818b0M2068h.f3449s, c0818b0M2068h.f3438h, c0818b0M2068h.f3439i, c0818b0M2068h.f3440j).m2062b(c1907a5);
        c0818b0M2062b3.f3447q = jM1396a;
        return c0818b0M2062b3;
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: m */
    public final void mo1316m(C0564a0 c0564a0) {
        m1931z0();
        AbstractC2044u abstractC2044u = this.f3246h;
        abstractC2044u.getClass();
        C2040q c2040q = (C2040q) abstractC2044u;
        if (c0564a0.equals(c2040q.m4614e())) {
            return;
        }
        if (c0564a0 instanceof C2033j) {
            c2040q.m4617j((C2033j) c0564a0);
        }
        C2032i c2032i = new C2032i(c2040q.m4614e());
        c2032i.m1420c(c0564a0);
        c2040q.m4617j(new C2033j(c2032i));
        this.f3251l.m1621f(19, new C0111d(7, c0564a0));
    }

    /* JADX INFO: renamed from: m0 */
    public final Pair m1918m0(AbstractC0558V abstractC0558V, int i3, long j3) {
        if (abstractC0558V.m1415p()) {
            this.f3245g0 = i3;
            if (j3 == -9223372036854775807L) {
                j3 = 0;
            }
            this.f3247h0 = j3;
            return null;
        }
        if (i3 == -1 || i3 >= abstractC0558V.mo1333o()) {
            i3 = abstractC0558V.mo1406a(this.f3213G);
            j3 = AbstractC0632A.m1581V(abstractC0558V.mo1332m(i3, (C0557U) this.f1360a, 0L).f1986l);
        }
        return abstractC0558V.m1411i((C0557U) this.f1360a, this.f3253n, i3, AbstractC0632A.m1571L(j3));
    }

    @Override // p038N.AbstractC0402b, p055T.InterfaceC0553P
    /* JADX INFO: renamed from: n */
    public final long mo1097n() {
        m1931z0();
        return m1912f0(this.f3243f0);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m1919n0(final int i3, final int i4) {
        C0652t c0652t = this.f3227U;
        if (i3 == c0652t.f2524a && i4 == c0652t.f2525b) {
            return;
        }
        this.f3227U = new C0652t(i3, i4);
        this.f3251l.m1621f(24, new InterfaceC0642j() { // from class: a0.w
            @Override // p064W.InterfaceC0642j
            /* JADX INFO: renamed from: g */
            public final void mo214g(Object obj) {
                ((InterfaceC0551N) obj).mo1394v(i3, i4);
            }
        });
        m1922q0(2, 14, new C0652t(i3, i4));
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: o */
    public final void mo1318o(SurfaceView surfaceView) {
        m1931z0();
        if (surfaceView instanceof InterfaceC2153n) {
            m1921p0();
            m1925t0(surfaceView);
            m1924s0(surfaceView.getHolder());
            return;
        }
        boolean z3 = surfaceView instanceof C2194k;
        SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z = this.f3264y;
        if (z3) {
            m1921p0();
            this.f3223Q = (C2194k) surfaceView;
            C0824e0 c0824e0M1911e0 = m1911e0(this.f3265z);
            AbstractC0646n.m1630h(!c0824e0M1911e0.f3464g);
            c0824e0M1911e0.f3461d = 10000;
            C2194k c2194k = this.f3223Q;
            AbstractC0646n.m1630h(true ^ c0824e0M1911e0.f3464g);
            c0824e0M1911e0.f3462e = c2194k;
            c0824e0M1911e0.m2073c();
            this.f3223Q.f9460g.add(surfaceHolderCallbackC0850z);
            m1925t0(this.f3223Q.getVideoSurface());
            m1924s0(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        m1931z0();
        if (holder == null) {
            m1909c0();
            return;
        }
        m1921p0();
        this.f3224R = true;
        this.f3222P = holder;
        holder.addCallback(surfaceHolderCallbackC0850z);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            m1925t0(null);
            m1919n0(0, 0);
        } else {
            m1925t0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            m1919n0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m1920o0(int i3) {
        for (int i4 = i3 - 1; i4 >= 0; i4--) {
            this.f3254o.remove(i4);
        }
        C1937c0 c1937c0 = this.f3217K;
        int[] iArr = c1937c0.f8486b;
        int[] iArr2 = new int[iArr.length - i3];
        int i5 = 0;
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 < 0 || i7 >= i3) {
                int i8 = i6 - i5;
                if (i7 >= 0) {
                    i7 -= i3;
                }
                iArr2[i8] = i7;
            } else {
                i5++;
            }
        }
        this.f3217K = new C1937c0(iArr2, new Random(c1937c0.f8485a.nextLong()));
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: p */
    public final void mo1319p(SurfaceView surfaceView) {
        m1931z0();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        m1931z0();
        if (holder == null || holder != this.f3222P) {
            return;
        }
        m1909c0();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m1921p0() {
        C2194k c2194k = this.f3223Q;
        SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z = this.f3264y;
        if (c2194k != null) {
            C0824e0 c0824e0M1911e0 = m1911e0(this.f3265z);
            AbstractC0646n.m1630h(!c0824e0M1911e0.f3464g);
            c0824e0M1911e0.f3461d = 10000;
            AbstractC0646n.m1630h(!c0824e0M1911e0.f3464g);
            c0824e0M1911e0.f3462e = null;
            c0824e0M1911e0.m2073c();
            this.f3223Q.f9460g.remove(surfaceHolderCallbackC0850z);
            this.f3223Q = null;
        }
        TextureView textureView = this.f3225S;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != surfaceHolderCallbackC0850z) {
                AbstractC0646n.m1647y("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f3225S.setSurfaceTextureListener(null);
            }
            this.f3225S = null;
        }
        SurfaceHolder surfaceHolder = this.f3222P;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(surfaceHolderCallbackC0850z);
            this.f3222P = null;
        }
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: q */
    public final C0549L mo1320q() {
        m1931z0();
        return this.f3218L;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m1922q0(int i3, int i4, Object obj) {
        for (AbstractC0827g abstractC0827g : this.f3244g) {
            if (i3 == -1 || abstractC0827g.f3478h == i3) {
                C0824e0 c0824e0M1911e0 = m1911e0(abstractC0827g);
                AbstractC0646n.m1630h(!c0824e0M1911e0.f3464g);
                c0824e0M1911e0.f3461d = i4;
                AbstractC0646n.m1630h(!c0824e0M1911e0.f3464g);
                c0824e0M1911e0.f3462e = obj;
                c0824e0M1911e0.m2073c();
            }
        }
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: r */
    public final int mo1321r() {
        m1931z0();
        return this.f3243f0.f3444n;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00dd  */
    /* JADX INFO: renamed from: r0 */
    public final void m1923r0(ArrayList arrayList, int i3, long j3, boolean z3) {
        long j4;
        int i4;
        int i5;
        C0818b0 c0818b0M2067g;
        boolean z4;
        int iMo1406a = i3;
        int iM1916j0 = m1916j0(this.f3243f0);
        long jMo1291M = mo1291M();
        this.f3214H++;
        ArrayList arrayList2 = this.f3254o;
        if (!arrayList2.isEmpty()) {
            m1920o0(arrayList2.size());
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            C0814Z c0814z = new C0814Z((AbstractC1932a) arrayList.get(i6), this.f3255p);
            arrayList3.add(c0814z);
            arrayList2.add(i6, new C0791B(c0814z.f3408b, c0814z.f3407a));
        }
        this.f3217K = this.f3217K.m4495a(arrayList3.size());
        C0828g0 c0828g0 = new C0828g0(arrayList2, this.f3217K);
        boolean zM1415p = c0828g0.m1415p();
        int i7 = c0828g0.f3497d;
        if (!zM1415p && iMo1406a >= i7) {
            throw new C0584p();
        }
        if (!z3) {
            if (iMo1406a == -1) {
                i4 = iM1916j0;
                j4 = jMo1291M;
            } else {
                j4 = j3;
            }
            C0818b0 c0818b0M1917l0 = m1917l0(this.f3243f0, c0828g0, m1918m0(c0828g0, i4, j4));
            i5 = c0818b0M1917l0.f3435e;
            if (i4 != -1 && i5 != 1) {
                if (!c0828g0.m1415p() || i4 >= i7) {
                    i5 = 4;
                } else {
                    i5 = 2;
                }
            }
            c0818b0M2067g = c0818b0M1917l0.m2067g(i5);
            this.f3250k.f3317o.m1697a(17, new C0794E(arrayList3, this.f3217K, i4, AbstractC0632A.m1571L(j4))).m1695b();
            if (!this.f3243f0.f3432b.f8311a.equals(c0818b0M2067g.f3432b.f8311a) || this.f3243f0.f3431a.m1415p()) {
                z4 = false;
            } else {
                z4 = true;
            }
            m1929x0(c0818b0M2067g, 0, z4, 4, m1915i0(c0818b0M2067g), -1, false);
        }
        iMo1406a = c0828g0.mo1406a(this.f3213G);
        j4 = -9223372036854775807L;
        i4 = iMo1406a;
        C0818b0 c0818b0M1917l1 = m1917l0(this.f3243f0, c0828g0, m1918m0(c0828g0, i4, j4));
        i5 = c0818b0M1917l1.f3435e;
        if (i4 != -1) {
            if (c0828g0.m1415p()) {
                i5 = 4;
            } else {
                i5 = 4;
            }
        }
        c0818b0M2067g = c0818b0M1917l1.m2067g(i5);
        this.f3250k.f3317o.m1697a(17, new C0794E(arrayList3, this.f3217K, i4, AbstractC0632A.m1571L(j4))).m1695b();
        if (this.f3243f0.f3432b.f8311a.equals(c0818b0M2067g.f3432b.f8311a)) {
            z4 = false;
        } else {
            z4 = false;
        }
        m1929x0(c0818b0M2067g, 0, z4, 4, m1915i0(c0818b0M2067g), -1, false);
    }

    @Override // p038N.AbstractC0402b, p055T.InterfaceC0553P
    /* JADX INFO: renamed from: s */
    public final long mo1098s() {
        m1931z0();
        if (!mo1310j()) {
            return mo1083E();
        }
        C0818b0 c0818b0 = this.f3243f0;
        return c0818b0.f3441k.equals(c0818b0.f3432b) ? AbstractC0632A.m1581V(this.f3243f0.f3447q) : mo1099u();
    }

    /* JADX INFO: renamed from: s0 */
    public final void m1924s0(SurfaceHolder surfaceHolder) {
        this.f3224R = false;
        this.f3222P = surfaceHolder;
        surfaceHolder.addCallback(this.f3264y);
        Surface surface = this.f3222P.getSurface();
        if (surface == null || !surface.isValid()) {
            m1919n0(0, 0);
        } else {
            Rect surfaceFrame = this.f3222P.getSurfaceFrame();
            m1919n0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        m1931z0();
        m1922q0(4, 15, imageOutput);
    }

    @Override // p055T.InterfaceC0553P
    public final void stop() {
        m1931z0();
        this.f3208B.m2077d(1, mo1322t());
        m1926u0(null);
        C1692X c1692x = C1692X.f7629k;
        long j3 = this.f3243f0.f3449s;
        this.f3231Y = new C0615c(c1692x);
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: t */
    public final boolean mo1322t() {
        m1931z0();
        return this.f3243f0.f3442l;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m1925t0(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        for (AbstractC0827g abstractC0827g : this.f3244g) {
            if (abstractC0827g.f3478h == 2) {
                C0824e0 c0824e0M1911e0 = m1911e0(abstractC0827g);
                AbstractC0646n.m1630h(!c0824e0M1911e0.f3464g);
                c0824e0M1911e0.f3461d = 1;
                AbstractC0646n.m1630h(true ^ c0824e0M1911e0.f3464g);
                c0824e0M1911e0.f3462e = obj;
                c0824e0M1911e0.m2073c();
                arrayList.add(c0824e0M1911e0);
            }
        }
        Object obj2 = this.f3220N;
        if (obj2 != null && obj2 != obj) {
            try {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj3 = arrayList.get(i3);
                    i3++;
                    ((C0824e0) obj3).m2071a(this.f3211E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z3 = true;
            }
            Object obj4 = this.f3220N;
            Surface surface = this.f3221O;
            if (obj4 == surface) {
                surface.release();
                this.f3221O = null;
            }
        }
        this.f3220N = obj;
        if (z3) {
            m1926u0(new C0839o(2, new C0513b("Detaching surface timed out."), 1003));
        }
    }

    @Override // p038N.AbstractC0402b, p055T.InterfaceC0553P
    /* JADX INFO: renamed from: u */
    public final long mo1099u() {
        m1931z0();
        if (!mo1310j()) {
            return m1086R();
        }
        C0818b0 c0818b0 = this.f3243f0;
        C1907A c1907a = c0818b0.f3432b;
        AbstractC0558V abstractC0558V = c0818b0.f3431a;
        Object obj = c1907a.f8311a;
        C0556T c0556t = this.f3253n;
        abstractC0558V.mo1410g(obj, c0556t);
        return AbstractC0632A.m1581V(c0556t.m1396a(c1907a.f8312b, c1907a.f8313c));
    }

    /* JADX INFO: renamed from: u0 */
    public final void m1926u0(C0839o c0839o) {
        C0818b0 c0818b0 = this.f3243f0;
        C0818b0 c0818b0M2062b = c0818b0.m2062b(c0818b0.f3432b);
        c0818b0M2062b.f3447q = c0818b0M2062b.f3449s;
        c0818b0M2062b.f3448r = 0L;
        C0818b0 c0818b0M2067g = c0818b0M2062b.m2067g(1);
        if (c0839o != null) {
            c0818b0M2067g = c0818b0M2067g.m2065e(c0839o);
        }
        C0818b0 c0818b1 = c0818b0M2067g;
        this.f3214H++;
        C0655w c0655w = this.f3250k.f3317o;
        c0655w.getClass();
        C0654v c0654vM1696b = C0655w.m1696b();
        c0654vM1696b.f2527a = c0655w.f2529a.obtainMessage(6);
        c0654vM1696b.m1695b();
        m1929x0(c0818b1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: v */
    public final void mo1323v(boolean z3) {
        m1931z0();
        if (this.f3213G != z3) {
            this.f3213G = z3;
            C0655w c0655w = this.f3250k.f3317o;
            c0655w.getClass();
            C0654v c0654vM1696b = C0655w.m1696b();
            c0654vM1696b.f2527a = c0655w.f2529a.obtainMessage(12, z3 ? 1 : 0, 0);
            c0654vM1696b.m1695b();
            C0529e c0529e = new C0529e(1, z3);
            C0645m c0645m = this.f3251l;
            c0645m.m1618c(9, c0529e);
            m1927v0();
            c0645m.m1617b();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m1927v0() {
        C0549L c0549l = this.f3218L;
        C0549L c0549lM1599r = AbstractC0632A.m1599r(this.f3242f, this.f3236c);
        this.f3218L = c0549lM1599r;
        if (c0549lM1599r.equals(c0549l)) {
            return;
        }
        this.f3251l.m1618c(13, new C0846v(this));
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: w */
    public final AbstractC0558V mo1324w() {
        m1931z0();
        return this.f3243f0.f3431a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX INFO: renamed from: w0 */
    public final void m1928w0(int i3, int i4, boolean z3) {
        ?? r14 = (!z3 || i3 == -1) ? 0 : 1;
        int i5 = i3 == 0 ? 1 : 0;
        C0818b0 c0818b0 = this.f3243f0;
        if (c0818b0.f3442l == r14 && c0818b0.f3444n == i5 && c0818b0.f3443m == i4) {
            return;
        }
        this.f3214H++;
        boolean z4 = c0818b0.f3446p;
        C0818b0 c0818b0M2061a = c0818b0;
        if (z4) {
            c0818b0M2061a = c0818b0.m2061a();
        }
        C0818b0 c0818b0M2064d = c0818b0M2061a.m2064d(i4, i5, r14);
        int i6 = (i5 << 4) | i4;
        C0655w c0655w = this.f3250k.f3317o;
        c0655w.getClass();
        C0654v c0654vM1696b = C0655w.m1696b();
        c0654vM1696b.f2527a = c0655w.f2529a.obtainMessage(1, r14, i6);
        c0654vM1696b.m1695b();
        m1929x0(c0818b0M2064d, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: x */
    public final void mo1325x(InterfaceC0551N interfaceC0551N) {
        m1931z0();
        interfaceC0551N.getClass();
        this.f3251l.m1620e(interfaceC0551N);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:104:0x02db  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:109:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:111:0x0314  */
    /* JADX WARN: Code duplicated, block: B:113:0x0325  */
    /* JADX WARN: Code duplicated, block: B:116:0x0335  */
    /* JADX WARN: Code duplicated, block: B:118:0x0343  */
    /* JADX WARN: Code duplicated, block: B:122:0x0357  */
    /* JADX WARN: Code duplicated, block: B:125:0x0369  */
    /* JADX WARN: Code duplicated, block: B:128:0x037f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0395  */
    /* JADX WARN: Code duplicated, block: B:134:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:137:0x03bc A[LOOP:0: B:135:0x03b6->B:137:0x03bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x03c8 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:39:0x0109  */
    /* JADX WARN: Code duplicated, block: B:41:0x010f  */
    /* JADX WARN: Code duplicated, block: B:45:0x011c  */
    /* JADX WARN: Code duplicated, block: B:48:0x012b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0137 A[LOOP:2: B:49:0x0132->B:51:0x0137, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0160  */
    /* JADX WARN: Code duplicated, block: B:57:0x0162  */
    /* JADX WARN: Code duplicated, block: B:60:0x0169  */
    /* JADX WARN: Code duplicated, block: B:61:0x016b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0170  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x017b  */
    /* JADX WARN: Code duplicated, block: B:70:0x017e  */
    /* JADX WARN: Code duplicated, block: B:72:0x018e  */
    /* JADX WARN: Code duplicated, block: B:74:0x019b  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:82:0x0201  */
    /* JADX WARN: Code duplicated, block: B:84:0x0209  */
    /* JADX WARN: Code duplicated, block: B:86:0x020f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0217  */
    /* JADX WARN: Code duplicated, block: B:89:0x021e  */
    /* JADX WARN: Code duplicated, block: B:92:0x024a  */
    /* JADX WARN: Code duplicated, block: B:93:0x027a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0292  */
    /* JADX WARN: Code duplicated, block: B:97:0x029f  */
    /* JADX WARN: Code duplicated, block: B:99:0x02c1  */
    /* JADX INFO: renamed from: x0 */
    public final void m1929x0(final C0818b0 c0818b0, final int i3, boolean z3, int i4, long j3, int i5, boolean z4) {
        Pair pair;
        int i6;
        boolean zBooleanValue;
        final int iIntValue;
        final C0539B c0539b;
        C0541D c0541dM1350a;
        List list;
        int i7;
        C0544G c0544g;
        int i8;
        InterfaceC0543F[] interfaceC0543FArr;
        boolean zEquals;
        boolean z5;
        boolean z6;
        boolean z7;
        C2045v c2045v;
        C2045v c2045v2;
        Iterator it;
        C0556T c0556t;
        int i9;
        Object obj;
        C0539B c0539b2;
        Object obj2;
        int i10;
        long j4;
        long j5;
        long jM1907k0;
        long jM1907k1;
        int iMo1292N;
        Object obj3;
        C0539B c0539b3;
        Object obj4;
        int i11;
        long jM1581V;
        long jM1581V2;
        C0818b0 c0818b1 = this.f3243f0;
        this.f3243f0 = c0818b0;
        boolean zEquals2 = c0818b1.f3431a.equals(c0818b0.f3431a);
        AbstractC0558V abstractC0558V = c0818b1.f3431a;
        AbstractC0558V abstractC0558V2 = c0818b0.f3431a;
        if (!abstractC0558V2.m1415p() || !abstractC0558V.m1415p()) {
            if (abstractC0558V2.m1415p() != abstractC0558V.m1415p()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else {
                C1907A c1907a = c0818b1.f3432b;
                Object obj5 = c1907a.f8311a;
                C0556T c0556t2 = this.f3253n;
                int i12 = abstractC0558V.mo1410g(obj5, c0556t2).f1968c;
                C0557U c0557u = (C0557U) this.f1360a;
                Object obj6 = abstractC0558V.mo1332m(i12, c0557u, 0L).f1975a;
                C1907A c1907a2 = c0818b0.f3432b;
                if (!obj6.equals(abstractC0558V2.mo1332m(abstractC0558V2.mo1410g(c1907a2.f8311a, c0556t2).f1968c, c0557u, 0L).f1975a)) {
                    if (z3 && i4 == 0) {
                        i6 = 1;
                    } else if (z3 && i4 == 1) {
                        i6 = 2;
                    } else {
                        if (zEquals2) {
                            throw new IllegalStateException();
                        }
                        i6 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i6));
                } else if (z3 && i4 == 0 && c1907a.f8314d < c1907a2.f8314d) {
                    pair = new Pair(Boolean.TRUE, 0);
                } else {
                    pair = (z3 && i4 == 1 && z4) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
                }
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            iIntValue = ((Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (c0818b0.f3431a.m1415p()) {
                    c0539b = null;
                } else {
                    c0539b = c0818b0.f3431a.mo1332m(c0818b0.f3431a.mo1410g(c0818b0.f3432b.f8311a, this.f3253n).f1968c, (C0557U) this.f1360a, 0L).f1977c;
                }
                this.f3241e0 = C0542E.f1910D;
            } else {
                c0539b = null;
            }
            if (zBooleanValue || !c0818b1.f3440j.equals(c0818b0.f3440j)) {
                c0541dM1350a = this.f3241e0.m1350a();
                list = c0818b0.f3440j;
                for (i7 = 0; i7 < list.size(); i7++) {
                    c0544g = (C0544G) list.get(i7);
                    i8 = 0;
                    while (true) {
                        interfaceC0543FArr = c0544g.f1940g;
                        if (i8 < interfaceC0543FArr.length) {
                            interfaceC0543FArr[i8].mo499c(c0541dM1350a);
                            i8++;
                        }
                    }
                }
                this.f3241e0 = new C0542E(c0541dM1350a);
            }
            C0542E c0542eM1908b0 = m1908b0();
            zEquals = c0542eM1908b0.equals(this.f3219M);
            this.f3219M = c0542eM1908b0;
            if (c0818b1.f3442l != c0818b0.f3442l) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (c0818b1.f3435e != c0818b0.f3435e) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6 || z5) {
                m1930y0();
            }
            if (c0818b1.f3437g != c0818b0.f3437g) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (!zEquals2) {
                final int i13 = 0;
                this.f3251l.m1618c(0, new InterfaceC0642j() { // from class: a0.t
                    @Override // p064W.InterfaceC0642j
                    /* JADX INFO: renamed from: g */
                    public final void mo214g(Object obj7) {
                        InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj7;
                        switch (i13) {
                            case 0:
                                AbstractC0558V abstractC0558V3 = ((C0818b0) c0818b0).f3431a;
                                interfaceC0551N.mo1382e(i3);
                                break;
                            default:
                                interfaceC0551N.mo1393u((C0539B) c0818b0, i3);
                                break;
                        }
                    }
                });
            }
            if (z3) {
                c0556t = new C0556T();
                if (c0818b1.f3431a.m1415p()) {
                    i9 = i5;
                    obj = null;
                    c0539b2 = null;
                    obj2 = null;
                    i10 = -1;
                } else {
                    Object obj7 = c0818b1.f3432b.f8311a;
                    c0818b1.f3431a.mo1410g(obj7, c0556t);
                    int i14 = c0556t.f1968c;
                    int iMo1328b = c0818b1.f3431a.mo1328b(obj7);
                    obj = c0818b1.f3431a.mo1332m(i14, (C0557U) this.f1360a, 0L).f1975a;
                    c0539b2 = ((C0557U) this.f1360a).f1977c;
                    obj2 = obj7;
                    i9 = i14;
                    i10 = iMo1328b;
                }
                if (i4 == 0) {
                    if (c0818b1.f3432b.m4422b()) {
                        C1907A c1907a3 = c0818b1.f3432b;
                        jM1907k0 = c0556t.m1396a(c1907a3.f8312b, c1907a3.f8313c);
                        jM1907k1 = m1907k0(c0818b1);
                    } else {
                        if (c0818b1.f3432b.f8315e != -1) {
                            jM1907k0 = m1907k0(this.f3243f0);
                        } else {
                            j4 = c0556t.f1970e;
                            j5 = c0556t.f1969d;
                            jM1907k0 = j4 + j5;
                        }
                        jM1907k1 = jM1907k0;
                    }
                } else if (c0818b1.f3432b.m4422b()) {
                    jM1907k0 = c0818b1.f3449s;
                    jM1907k1 = m1907k0(c0818b1);
                } else {
                    j4 = c0556t.f1970e;
                    j5 = c0818b1.f3449s;
                    jM1907k0 = j4 + j5;
                    jM1907k1 = jM1907k0;
                }
                long jM1581V3 = AbstractC0632A.m1581V(jM1907k0);
                long jM1581V4 = AbstractC0632A.m1581V(jM1907k1);
                C1907A c1907a4 = c0818b1.f3432b;
                C0552O c0552o = new C0552O(obj, i9, c0539b2, obj2, i10, jM1581V3, jM1581V4, c1907a4.f8312b, c1907a4.f8313c);
                iMo1292N = mo1292N();
                if (this.f3243f0.f3431a.m1415p()) {
                    obj3 = null;
                    c0539b3 = null;
                    obj4 = null;
                    i11 = -1;
                } else {
                    C0818b0 c0818b2 = this.f3243f0;
                    Object obj8 = c0818b2.f3432b.f8311a;
                    c0818b2.f3431a.mo1410g(obj8, this.f3253n);
                    int iMo1328b2 = this.f3243f0.f3431a.mo1328b(obj8);
                    AbstractC0558V abstractC0558V3 = this.f3243f0.f3431a;
                    C0557U c0557u2 = (C0557U) this.f1360a;
                    i11 = iMo1328b2;
                    obj4 = obj8;
                    obj3 = abstractC0558V3.mo1332m(iMo1292N, c0557u2, 0L).f1975a;
                    c0539b3 = c0557u2.f1977c;
                }
                jM1581V = AbstractC0632A.m1581V(j3);
                if (this.f3243f0.f3432b.m4422b()) {
                    jM1581V2 = AbstractC0632A.m1581V(m1907k0(this.f3243f0));
                } else {
                    jM1581V2 = jM1581V;
                }
                C1907A c1907a5 = this.f3243f0.f3432b;
                this.f3251l.m1618c(11, new C0848x(i4, c0552o, new C0552O(obj3, iMo1292N, c0539b3, obj4, i11, jM1581V, jM1581V2, c1907a5.f8312b, c1907a5.f8313c)));
            } else {
                zBooleanValue = zBooleanValue;
                zEquals = zEquals;
                z6 = z6;
            }
            if (zBooleanValue) {
                final int i15 = 1;
                this.f3251l.m1618c(1, new InterfaceC0642j() { // from class: a0.t
                    @Override // p064W.InterfaceC0642j
                    /* JADX INFO: renamed from: g */
                    public final void mo214g(Object obj9) {
                        InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj9;
                        switch (i15) {
                            case 0:
                                AbstractC0558V abstractC0558V4 = ((C0818b0) c0539b).f3431a;
                                interfaceC0551N.mo1382e(iIntValue);
                                break;
                            default:
                                interfaceC0551N.mo1393u((C0539B) c0539b, iIntValue);
                                break;
                        }
                    }
                });
            }
            if (c0818b1.f3436f != c0818b0.f3436f) {
                final int i16 = 7;
                this.f3251l.m1618c(10, new InterfaceC0642j() { // from class: a0.u
                    @Override // p064W.InterfaceC0642j
                    /* JADX INFO: renamed from: g */
                    public final void mo214g(Object obj9) {
                        InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj9;
                        switch (i16) {
                            case 0:
                                C0818b0 c0818b3 = c0818b0;
                                boolean z8 = c0818b3.f3437g;
                                interfaceC0551N.getClass();
                                interfaceC0551N.mo1369A(c0818b3.f3437g);
                                break;
                            case 1:
                                C0818b0 c0818b4 = c0818b0;
                                interfaceC0551N.mo1375H(c0818b4.f3435e, c0818b4.f3442l);
                                break;
                            case 2:
                                interfaceC0551N.mo1381c(c0818b0.f3435e);
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                C0818b0 c0818b5 = c0818b0;
                                interfaceC0551N.mo1376I(c0818b5.f3443m, c0818b5.f3442l);
                                break;
                            case 4:
                                interfaceC0551N.mo1379a(c0818b0.f3444n);
                                break;
                            case 5:
                                interfaceC0551N.mo1378K(c0818b0.m2070k());
                                break;
                            case 6:
                                interfaceC0551N.mo1391r(c0818b0.f3445o);
                                break;
                            case 7:
                                interfaceC0551N.mo1387k(c0818b0.f3436f);
                                break;
                            case 8:
                                interfaceC0551N.mo1371C(c0818b0.f3436f);
                                break;
                            default:
                                interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                                break;
                        }
                    }
                });
                if (c0818b0.f3436f != null) {
                    final int i17 = 8;
                    this.f3251l.m1618c(10, new InterfaceC0642j() { // from class: a0.u
                        @Override // p064W.InterfaceC0642j
                        /* JADX INFO: renamed from: g */
                        public final void mo214g(Object obj9) {
                            InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj9;
                            switch (i17) {
                                case 0:
                                    C0818b0 c0818b3 = c0818b0;
                                    boolean z8 = c0818b3.f3437g;
                                    interfaceC0551N.getClass();
                                    interfaceC0551N.mo1369A(c0818b3.f3437g);
                                    break;
                                case 1:
                                    C0818b0 c0818b4 = c0818b0;
                                    interfaceC0551N.mo1375H(c0818b4.f3435e, c0818b4.f3442l);
                                    break;
                                case 2:
                                    interfaceC0551N.mo1381c(c0818b0.f3435e);
                                    break;
                                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                    C0818b0 c0818b5 = c0818b0;
                                    interfaceC0551N.mo1376I(c0818b5.f3443m, c0818b5.f3442l);
                                    break;
                                case 4:
                                    interfaceC0551N.mo1379a(c0818b0.f3444n);
                                    break;
                                case 5:
                                    interfaceC0551N.mo1378K(c0818b0.m2070k());
                                    break;
                                case 6:
                                    interfaceC0551N.mo1391r(c0818b0.f3445o);
                                    break;
                                case 7:
                                    interfaceC0551N.mo1387k(c0818b0.f3436f);
                                    break;
                                case 8:
                                    interfaceC0551N.mo1371C(c0818b0.f3436f);
                                    break;
                                default:
                                    interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                                    break;
                            }
                        }
                    });
                }
            }
            c2045v = c0818b1.f3439i;
            c2045v2 = c0818b0.f3439i;
            if (c2045v != c2045v2) {
                AbstractC2044u abstractC2044u = this.f3246h;
                C0687s c0687s = c2045v2.f8916e;
                abstractC2044u.getClass();
                final int i18 = 9;
                this.f3251l.m1618c(2, new InterfaceC0642j() { // from class: a0.u
                    @Override // p064W.InterfaceC0642j
                    /* JADX INFO: renamed from: g */
                    public final void mo214g(Object obj9) {
                        InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj9;
                        switch (i18) {
                            case 0:
                                C0818b0 c0818b3 = c0818b0;
                                boolean z8 = c0818b3.f3437g;
                                interfaceC0551N.getClass();
                                interfaceC0551N.mo1369A(c0818b3.f3437g);
                                break;
                            case 1:
                                C0818b0 c0818b4 = c0818b0;
                                interfaceC0551N.mo1375H(c0818b4.f3435e, c0818b4.f3442l);
                                break;
                            case 2:
                                interfaceC0551N.mo1381c(c0818b0.f3435e);
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                C0818b0 c0818b5 = c0818b0;
                                interfaceC0551N.mo1376I(c0818b5.f3443m, c0818b5.f3442l);
                                break;
                            case 4:
                                interfaceC0551N.mo1379a(c0818b0.f3444n);
                                break;
                            case 5:
                                interfaceC0551N.mo1378K(c0818b0.m2070k());
                                break;
                            case 6:
                                interfaceC0551N.mo1391r(c0818b0.f3445o);
                                break;
                            case 7:
                                interfaceC0551N.mo1387k(c0818b0.f3436f);
                                break;
                            case 8:
                                interfaceC0551N.mo1371C(c0818b0.f3436f);
                                break;
                            default:
                                interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                                break;
                        }
                    }
                });
            }
            if (!zEquals) {
                this.f3251l.m1618c(14, new C0111d(6, this.f3219M));
            }
            if (z7) {
                final int i19 = 0;
                this.f3251l.m1618c(3, new InterfaceC0642j() { // from class: a0.u
                    @Override // p064W.InterfaceC0642j
                    /* JADX INFO: renamed from: g */
                    public final void mo214g(Object obj9) {
                        InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj9;
                        switch (i19) {
                            case 0:
                                C0818b0 c0818b3 = c0818b0;
                                boolean z8 = c0818b3.f3437g;
                                interfaceC0551N.getClass();
                                interfaceC0551N.mo1369A(c0818b3.f3437g);
                                break;
                            case 1:
                                C0818b0 c0818b4 = c0818b0;
                                interfaceC0551N.mo1375H(c0818b4.f3435e, c0818b4.f3442l);
                                break;
                            case 2:
                                interfaceC0551N.mo1381c(c0818b0.f3435e);
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                C0818b0 c0818b5 = c0818b0;
                                interfaceC0551N.mo1376I(c0818b5.f3443m, c0818b5.f3442l);
                                break;
                            case 4:
                                interfaceC0551N.mo1379a(c0818b0.f3444n);
                                break;
                            case 5:
                                interfaceC0551N.mo1378K(c0818b0.m2070k());
                                break;
                            case 6:
                                interfaceC0551N.mo1391r(c0818b0.f3445o);
                                break;
                            case 7:
                                interfaceC0551N.mo1387k(c0818b0.f3436f);
                                break;
                            case 8:
                                interfaceC0551N.mo1371C(c0818b0.f3436f);
                                break;
                            default:
                                interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                                break;
                        }
                    }
                });
            }
            if (z6 || z5) {
                final int i20 = 1;
                this.f3251l.m1618c(-1, new InterfaceC0642j() { // from class: a0.u
                    @Override // p064W.InterfaceC0642j
                    /* JADX INFO: renamed from: g */
                    public final void mo214g(Object obj9) {
                        InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj9;
                        switch (i20) {
                            case 0:
                                C0818b0 c0818b3 = c0818b0;
                                boolean z8 = c0818b3.f3437g;
                                interfaceC0551N.getClass();
                                interfaceC0551N.mo1369A(c0818b3.f3437g);
                                break;
                            case 1:
                                C0818b0 c0818b4 = c0818b0;
                                interfaceC0551N.mo1375H(c0818b4.f3435e, c0818b4.f3442l);
                                break;
                            case 2:
                                interfaceC0551N.mo1381c(c0818b0.f3435e);
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                C0818b0 c0818b5 = c0818b0;
                                interfaceC0551N.mo1376I(c0818b5.f3443m, c0818b5.f3442l);
                                break;
                            case 4:
                                interfaceC0551N.mo1379a(c0818b0.f3444n);
                                break;
                            case 5:
                                interfaceC0551N.mo1378K(c0818b0.m2070k());
                                break;
                            case 6:
                                interfaceC0551N.mo1391r(c0818b0.f3445o);
                                break;
                            case 7:
                                interfaceC0551N.mo1387k(c0818b0.f3436f);
                                break;
                            case 8:
                                interfaceC0551N.mo1371C(c0818b0.f3436f);
                                break;
                            default:
                                interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                                break;
                        }
                    }
                });
            }
            if (z6) {
                final int i21 = 2;
                this.f3251l.m1618c(4, new InterfaceC0642j() { // from class: a0.u
                    @Override // p064W.InterfaceC0642j
                    /* JADX INFO: renamed from: g */
                    public final void mo214g(Object obj9) {
                        InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj9;
                        switch (i21) {
                            case 0:
                                C0818b0 c0818b3 = c0818b0;
                                boolean z8 = c0818b3.f3437g;
                                interfaceC0551N.getClass();
                                interfaceC0551N.mo1369A(c0818b3.f3437g);
                                break;
                            case 1:
                                C0818b0 c0818b4 = c0818b0;
                                interfaceC0551N.mo1375H(c0818b4.f3435e, c0818b4.f3442l);
                                break;
                            case 2:
                                interfaceC0551N.mo1381c(c0818b0.f3435e);
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                C0818b0 c0818b5 = c0818b0;
                                interfaceC0551N.mo1376I(c0818b5.f3443m, c0818b5.f3442l);
                                break;
                            case 4:
                                interfaceC0551N.mo1379a(c0818b0.f3444n);
                                break;
                            case 5:
                                interfaceC0551N.mo1378K(c0818b0.m2070k());
                                break;
                            case 6:
                                interfaceC0551N.mo1391r(c0818b0.f3445o);
                                break;
                            case 7:
                                interfaceC0551N.mo1387k(c0818b0.f3436f);
                                break;
                            case 8:
                                interfaceC0551N.mo1371C(c0818b0.f3436f);
                                break;
                            default:
                                interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                                break;
                        }
                    }
                });
            }
            if (z5 || c0818b1.f3443m != c0818b0.f3443m) {
                final int i22 = 3;
                this.f3251l.m1618c(5, new InterfaceC0642j() { // from class: a0.u
                    @Override // p064W.InterfaceC0642j
                    /* JADX INFO: renamed from: g */
                    public final void mo214g(Object obj9) {
                        InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj9;
                        switch (i22) {
                            case 0:
                                C0818b0 c0818b3 = c0818b0;
                                boolean z8 = c0818b3.f3437g;
                                interfaceC0551N.getClass();
                                interfaceC0551N.mo1369A(c0818b3.f3437g);
                                break;
                            case 1:
                                C0818b0 c0818b4 = c0818b0;
                                interfaceC0551N.mo1375H(c0818b4.f3435e, c0818b4.f3442l);
                                break;
                            case 2:
                                interfaceC0551N.mo1381c(c0818b0.f3435e);
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                C0818b0 c0818b5 = c0818b0;
                                interfaceC0551N.mo1376I(c0818b5.f3443m, c0818b5.f3442l);
                                break;
                            case 4:
                                interfaceC0551N.mo1379a(c0818b0.f3444n);
                                break;
                            case 5:
                                interfaceC0551N.mo1378K(c0818b0.m2070k());
                                break;
                            case 6:
                                interfaceC0551N.mo1391r(c0818b0.f3445o);
                                break;
                            case 7:
                                interfaceC0551N.mo1387k(c0818b0.f3436f);
                                break;
                            case 8:
                                interfaceC0551N.mo1371C(c0818b0.f3436f);
                                break;
                            default:
                                interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                                break;
                        }
                    }
                });
            }
            if (c0818b1.f3444n != c0818b0.f3444n) {
                final int i23 = 4;
                this.f3251l.m1618c(6, new InterfaceC0642j() { // from class: a0.u
                    @Override // p064W.InterfaceC0642j
                    /* JADX INFO: renamed from: g */
                    public final void mo214g(Object obj9) {
                        InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj9;
                        switch (i23) {
                            case 0:
                                C0818b0 c0818b3 = c0818b0;
                                boolean z8 = c0818b3.f3437g;
                                interfaceC0551N.getClass();
                                interfaceC0551N.mo1369A(c0818b3.f3437g);
                                break;
                            case 1:
                                C0818b0 c0818b4 = c0818b0;
                                interfaceC0551N.mo1375H(c0818b4.f3435e, c0818b4.f3442l);
                                break;
                            case 2:
                                interfaceC0551N.mo1381c(c0818b0.f3435e);
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                C0818b0 c0818b5 = c0818b0;
                                interfaceC0551N.mo1376I(c0818b5.f3443m, c0818b5.f3442l);
                                break;
                            case 4:
                                interfaceC0551N.mo1379a(c0818b0.f3444n);
                                break;
                            case 5:
                                interfaceC0551N.mo1378K(c0818b0.m2070k());
                                break;
                            case 6:
                                interfaceC0551N.mo1391r(c0818b0.f3445o);
                                break;
                            case 7:
                                interfaceC0551N.mo1387k(c0818b0.f3436f);
                                break;
                            case 8:
                                interfaceC0551N.mo1371C(c0818b0.f3436f);
                                break;
                            default:
                                interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                                break;
                        }
                    }
                });
            }
            if (c0818b1.m2070k() != c0818b0.m2070k()) {
                final int i24 = 5;
                this.f3251l.m1618c(7, new InterfaceC0642j() { // from class: a0.u
                    @Override // p064W.InterfaceC0642j
                    /* JADX INFO: renamed from: g */
                    public final void mo214g(Object obj9) {
                        InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj9;
                        switch (i24) {
                            case 0:
                                C0818b0 c0818b3 = c0818b0;
                                boolean z8 = c0818b3.f3437g;
                                interfaceC0551N.getClass();
                                interfaceC0551N.mo1369A(c0818b3.f3437g);
                                break;
                            case 1:
                                C0818b0 c0818b4 = c0818b0;
                                interfaceC0551N.mo1375H(c0818b4.f3435e, c0818b4.f3442l);
                                break;
                            case 2:
                                interfaceC0551N.mo1381c(c0818b0.f3435e);
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                C0818b0 c0818b5 = c0818b0;
                                interfaceC0551N.mo1376I(c0818b5.f3443m, c0818b5.f3442l);
                                break;
                            case 4:
                                interfaceC0551N.mo1379a(c0818b0.f3444n);
                                break;
                            case 5:
                                interfaceC0551N.mo1378K(c0818b0.m2070k());
                                break;
                            case 6:
                                interfaceC0551N.mo1391r(c0818b0.f3445o);
                                break;
                            case 7:
                                interfaceC0551N.mo1387k(c0818b0.f3436f);
                                break;
                            case 8:
                                interfaceC0551N.mo1371C(c0818b0.f3436f);
                                break;
                            default:
                                interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                                break;
                        }
                    }
                });
            }
            if (!c0818b1.f3445o.equals(c0818b0.f3445o)) {
                final int i25 = 6;
                this.f3251l.m1618c(12, new InterfaceC0642j() { // from class: a0.u
                    @Override // p064W.InterfaceC0642j
                    /* JADX INFO: renamed from: g */
                    public final void mo214g(Object obj9) {
                        InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj9;
                        switch (i25) {
                            case 0:
                                C0818b0 c0818b3 = c0818b0;
                                boolean z8 = c0818b3.f3437g;
                                interfaceC0551N.getClass();
                                interfaceC0551N.mo1369A(c0818b3.f3437g);
                                break;
                            case 1:
                                C0818b0 c0818b4 = c0818b0;
                                interfaceC0551N.mo1375H(c0818b4.f3435e, c0818b4.f3442l);
                                break;
                            case 2:
                                interfaceC0551N.mo1381c(c0818b0.f3435e);
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                C0818b0 c0818b5 = c0818b0;
                                interfaceC0551N.mo1376I(c0818b5.f3443m, c0818b5.f3442l);
                                break;
                            case 4:
                                interfaceC0551N.mo1379a(c0818b0.f3444n);
                                break;
                            case 5:
                                interfaceC0551N.mo1378K(c0818b0.m2070k());
                                break;
                            case 6:
                                interfaceC0551N.mo1391r(c0818b0.f3445o);
                                break;
                            case 7:
                                interfaceC0551N.mo1387k(c0818b0.f3436f);
                                break;
                            case 8:
                                interfaceC0551N.mo1371C(c0818b0.f3436f);
                                break;
                            default:
                                interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                                break;
                        }
                    }
                });
            }
            m1927v0();
            this.f3251l.m1617b();
            if (c0818b1.f3446p != c0818b0.f3446p) {
                it = this.f3252m.iterator();
                while (it.hasNext()) {
                    ((SurfaceHolderCallbackC0850z) it.next()).f3610g.m1930y0();
                }
            }
        }
        pair = new Pair(Boolean.FALSE, -1);
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (c0818b0.f3431a.m1415p()) {
                c0539b = c0818b0.f3431a.mo1332m(c0818b0.f3431a.mo1410g(c0818b0.f3432b.f8311a, this.f3253n).f1968c, (C0557U) this.f1360a, 0L).f1977c;
            } else {
                c0539b = null;
            }
            this.f3241e0 = C0542E.f1910D;
        } else {
            c0539b = null;
        }
        if (zBooleanValue) {
            c0541dM1350a = this.f3241e0.m1350a();
            list = c0818b0.f3440j;
            while (i7 < list.size()) {
                c0544g = (C0544G) list.get(i7);
                i8 = 0;
                while (true) {
                    interfaceC0543FArr = c0544g.f1940g;
                    if (i8 < interfaceC0543FArr.length) {
                        interfaceC0543FArr[i8].mo499c(c0541dM1350a);
                        i8++;
                    }
                }
            }
            this.f3241e0 = new C0542E(c0541dM1350a);
        } else {
            c0541dM1350a = this.f3241e0.m1350a();
            list = c0818b0.f3440j;
            while (i7 < list.size()) {
                c0544g = (C0544G) list.get(i7);
                i8 = 0;
                while (true) {
                    interfaceC0543FArr = c0544g.f1940g;
                    if (i8 < interfaceC0543FArr.length) {
                        interfaceC0543FArr[i8].mo499c(c0541dM1350a);
                        i8++;
                    }
                }
            }
            this.f3241e0 = new C0542E(c0541dM1350a);
        }
        C0542E c0542eM1908b1 = m1908b0();
        zEquals = c0542eM1908b1.equals(this.f3219M);
        this.f3219M = c0542eM1908b1;
        if (c0818b1.f3442l != c0818b0.f3442l) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (c0818b1.f3435e != c0818b0.f3435e) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            m1930y0();
        } else {
            m1930y0();
        }
        if (c0818b1.f3437g != c0818b0.f3437g) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!zEquals2) {
            final int i110 = 0;
            this.f3251l.m1618c(0, new InterfaceC0642j() { // from class: a0.t
                @Override // p064W.InterfaceC0642j
                /* JADX INFO: renamed from: g */
                public final void mo214g(Object obj9) {
                    InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj9;
                    switch (i110) {
                        case 0:
                            AbstractC0558V abstractC0558V4 = ((C0818b0) c0818b0).f3431a;
                            interfaceC0551N.mo1382e(i3);
                            break;
                        default:
                            interfaceC0551N.mo1393u((C0539B) c0818b0, i3);
                            break;
                    }
                }
            });
        }
        if (z3) {
            c0556t = new C0556T();
            if (c0818b1.f3431a.m1415p()) {
                Object obj9 = c0818b1.f3432b.f8311a;
                c0818b1.f3431a.mo1410g(obj9, c0556t);
                int i111 = c0556t.f1968c;
                int iMo1328b3 = c0818b1.f3431a.mo1328b(obj9);
                obj = c0818b1.f3431a.mo1332m(i111, (C0557U) this.f1360a, 0L).f1975a;
                c0539b2 = ((C0557U) this.f1360a).f1977c;
                obj2 = obj9;
                i9 = i111;
                i10 = iMo1328b3;
            } else {
                i9 = i5;
                obj = null;
                c0539b2 = null;
                obj2 = null;
                i10 = -1;
            }
            if (i4 == 0) {
                if (c0818b1.f3432b.m4422b()) {
                    C1907A c1907a6 = c0818b1.f3432b;
                    jM1907k0 = c0556t.m1396a(c1907a6.f8312b, c1907a6.f8313c);
                    jM1907k1 = m1907k0(c0818b1);
                } else {
                    if (c0818b1.f3432b.f8315e != -1) {
                        jM1907k0 = m1907k0(this.f3243f0);
                    } else {
                        j4 = c0556t.f1970e;
                        j5 = c0556t.f1969d;
                        jM1907k0 = j4 + j5;
                    }
                    jM1907k1 = jM1907k0;
                }
            } else if (c0818b1.f3432b.m4422b()) {
                jM1907k0 = c0818b1.f3449s;
                jM1907k1 = m1907k0(c0818b1);
            } else {
                j4 = c0556t.f1970e;
                j5 = c0818b1.f3449s;
                jM1907k0 = j4 + j5;
                jM1907k1 = jM1907k0;
            }
            long jM1581V5 = AbstractC0632A.m1581V(jM1907k0);
            long jM1581V6 = AbstractC0632A.m1581V(jM1907k1);
            C1907A c1907a7 = c0818b1.f3432b;
            C0552O c0552o2 = new C0552O(obj, i9, c0539b2, obj2, i10, jM1581V5, jM1581V6, c1907a7.f8312b, c1907a7.f8313c);
            iMo1292N = mo1292N();
            if (this.f3243f0.f3431a.m1415p()) {
                C0818b0 c0818b3 = this.f3243f0;
                Object obj10 = c0818b3.f3432b.f8311a;
                c0818b3.f3431a.mo1410g(obj10, this.f3253n);
                int iMo1328b4 = this.f3243f0.f3431a.mo1328b(obj10);
                AbstractC0558V abstractC0558V4 = this.f3243f0.f3431a;
                C0557U c0557u3 = (C0557U) this.f1360a;
                i11 = iMo1328b4;
                obj4 = obj10;
                obj3 = abstractC0558V4.mo1332m(iMo1292N, c0557u3, 0L).f1975a;
                c0539b3 = c0557u3.f1977c;
            } else {
                obj3 = null;
                c0539b3 = null;
                obj4 = null;
                i11 = -1;
            }
            jM1581V = AbstractC0632A.m1581V(j3);
            if (this.f3243f0.f3432b.m4422b()) {
                jM1581V2 = AbstractC0632A.m1581V(m1907k0(this.f3243f0));
            } else {
                jM1581V2 = jM1581V;
            }
            C1907A c1907a8 = this.f3243f0.f3432b;
            this.f3251l.m1618c(11, new C0848x(i4, c0552o2, new C0552O(obj3, iMo1292N, c0539b3, obj4, i11, jM1581V, jM1581V2, c1907a8.f8312b, c1907a8.f8313c)));
        } else {
            zBooleanValue = zBooleanValue;
            zEquals = zEquals;
            z6 = z6;
        }
        if (zBooleanValue) {
            final int i112 = 1;
            this.f3251l.m1618c(1, new InterfaceC0642j() { // from class: a0.t
                @Override // p064W.InterfaceC0642j
                /* JADX INFO: renamed from: g */
                public final void mo214g(Object obj11) {
                    InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj11;
                    switch (i112) {
                        case 0:
                            AbstractC0558V abstractC0558V5 = ((C0818b0) c0539b).f3431a;
                            interfaceC0551N.mo1382e(iIntValue);
                            break;
                        default:
                            interfaceC0551N.mo1393u((C0539B) c0539b, iIntValue);
                            break;
                    }
                }
            });
        }
        if (c0818b1.f3436f != c0818b0.f3436f) {
            final int i113 = 7;
            this.f3251l.m1618c(10, new InterfaceC0642j() { // from class: a0.u
                @Override // p064W.InterfaceC0642j
                /* JADX INFO: renamed from: g */
                public final void mo214g(Object obj11) {
                    InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj11;
                    switch (i113) {
                        case 0:
                            C0818b0 c0818b4 = c0818b0;
                            boolean z8 = c0818b4.f3437g;
                            interfaceC0551N.getClass();
                            interfaceC0551N.mo1369A(c0818b4.f3437g);
                            break;
                        case 1:
                            C0818b0 c0818b5 = c0818b0;
                            interfaceC0551N.mo1375H(c0818b5.f3435e, c0818b5.f3442l);
                            break;
                        case 2:
                            interfaceC0551N.mo1381c(c0818b0.f3435e);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            C0818b0 c0818b6 = c0818b0;
                            interfaceC0551N.mo1376I(c0818b6.f3443m, c0818b6.f3442l);
                            break;
                        case 4:
                            interfaceC0551N.mo1379a(c0818b0.f3444n);
                            break;
                        case 5:
                            interfaceC0551N.mo1378K(c0818b0.m2070k());
                            break;
                        case 6:
                            interfaceC0551N.mo1391r(c0818b0.f3445o);
                            break;
                        case 7:
                            interfaceC0551N.mo1387k(c0818b0.f3436f);
                            break;
                        case 8:
                            interfaceC0551N.mo1371C(c0818b0.f3436f);
                            break;
                        default:
                            interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                            break;
                    }
                }
            });
            if (c0818b0.f3436f != null) {
                final int i114 = 8;
                this.f3251l.m1618c(10, new InterfaceC0642j() { // from class: a0.u
                    @Override // p064W.InterfaceC0642j
                    /* JADX INFO: renamed from: g */
                    public final void mo214g(Object obj11) {
                        InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj11;
                        switch (i114) {
                            case 0:
                                C0818b0 c0818b4 = c0818b0;
                                boolean z8 = c0818b4.f3437g;
                                interfaceC0551N.getClass();
                                interfaceC0551N.mo1369A(c0818b4.f3437g);
                                break;
                            case 1:
                                C0818b0 c0818b5 = c0818b0;
                                interfaceC0551N.mo1375H(c0818b5.f3435e, c0818b5.f3442l);
                                break;
                            case 2:
                                interfaceC0551N.mo1381c(c0818b0.f3435e);
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                C0818b0 c0818b6 = c0818b0;
                                interfaceC0551N.mo1376I(c0818b6.f3443m, c0818b6.f3442l);
                                break;
                            case 4:
                                interfaceC0551N.mo1379a(c0818b0.f3444n);
                                break;
                            case 5:
                                interfaceC0551N.mo1378K(c0818b0.m2070k());
                                break;
                            case 6:
                                interfaceC0551N.mo1391r(c0818b0.f3445o);
                                break;
                            case 7:
                                interfaceC0551N.mo1387k(c0818b0.f3436f);
                                break;
                            case 8:
                                interfaceC0551N.mo1371C(c0818b0.f3436f);
                                break;
                            default:
                                interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                                break;
                        }
                    }
                });
            }
        }
        c2045v = c0818b1.f3439i;
        c2045v2 = c0818b0.f3439i;
        if (c2045v != c2045v2) {
            AbstractC2044u abstractC2044u2 = this.f3246h;
            C0687s c0687s2 = c2045v2.f8916e;
            abstractC2044u2.getClass();
            final int i115 = 9;
            this.f3251l.m1618c(2, new InterfaceC0642j() { // from class: a0.u
                @Override // p064W.InterfaceC0642j
                /* JADX INFO: renamed from: g */
                public final void mo214g(Object obj11) {
                    InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj11;
                    switch (i115) {
                        case 0:
                            C0818b0 c0818b4 = c0818b0;
                            boolean z8 = c0818b4.f3437g;
                            interfaceC0551N.getClass();
                            interfaceC0551N.mo1369A(c0818b4.f3437g);
                            break;
                        case 1:
                            C0818b0 c0818b5 = c0818b0;
                            interfaceC0551N.mo1375H(c0818b5.f3435e, c0818b5.f3442l);
                            break;
                        case 2:
                            interfaceC0551N.mo1381c(c0818b0.f3435e);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            C0818b0 c0818b6 = c0818b0;
                            interfaceC0551N.mo1376I(c0818b6.f3443m, c0818b6.f3442l);
                            break;
                        case 4:
                            interfaceC0551N.mo1379a(c0818b0.f3444n);
                            break;
                        case 5:
                            interfaceC0551N.mo1378K(c0818b0.m2070k());
                            break;
                        case 6:
                            interfaceC0551N.mo1391r(c0818b0.f3445o);
                            break;
                        case 7:
                            interfaceC0551N.mo1387k(c0818b0.f3436f);
                            break;
                        case 8:
                            interfaceC0551N.mo1371C(c0818b0.f3436f);
                            break;
                        default:
                            interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                            break;
                    }
                }
            });
        }
        if (!zEquals) {
            this.f3251l.m1618c(14, new C0111d(6, this.f3219M));
        }
        if (z7) {
            final int i116 = 0;
            this.f3251l.m1618c(3, new InterfaceC0642j() { // from class: a0.u
                @Override // p064W.InterfaceC0642j
                /* JADX INFO: renamed from: g */
                public final void mo214g(Object obj11) {
                    InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj11;
                    switch (i116) {
                        case 0:
                            C0818b0 c0818b4 = c0818b0;
                            boolean z8 = c0818b4.f3437g;
                            interfaceC0551N.getClass();
                            interfaceC0551N.mo1369A(c0818b4.f3437g);
                            break;
                        case 1:
                            C0818b0 c0818b5 = c0818b0;
                            interfaceC0551N.mo1375H(c0818b5.f3435e, c0818b5.f3442l);
                            break;
                        case 2:
                            interfaceC0551N.mo1381c(c0818b0.f3435e);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            C0818b0 c0818b6 = c0818b0;
                            interfaceC0551N.mo1376I(c0818b6.f3443m, c0818b6.f3442l);
                            break;
                        case 4:
                            interfaceC0551N.mo1379a(c0818b0.f3444n);
                            break;
                        case 5:
                            interfaceC0551N.mo1378K(c0818b0.m2070k());
                            break;
                        case 6:
                            interfaceC0551N.mo1391r(c0818b0.f3445o);
                            break;
                        case 7:
                            interfaceC0551N.mo1387k(c0818b0.f3436f);
                            break;
                        case 8:
                            interfaceC0551N.mo1371C(c0818b0.f3436f);
                            break;
                        default:
                            interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                            break;
                    }
                }
            });
        }
        if (z6) {
            final int i26 = 1;
            this.f3251l.m1618c(-1, new InterfaceC0642j() { // from class: a0.u
                @Override // p064W.InterfaceC0642j
                /* JADX INFO: renamed from: g */
                public final void mo214g(Object obj11) {
                    InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj11;
                    switch (i26) {
                        case 0:
                            C0818b0 c0818b4 = c0818b0;
                            boolean z8 = c0818b4.f3437g;
                            interfaceC0551N.getClass();
                            interfaceC0551N.mo1369A(c0818b4.f3437g);
                            break;
                        case 1:
                            C0818b0 c0818b5 = c0818b0;
                            interfaceC0551N.mo1375H(c0818b5.f3435e, c0818b5.f3442l);
                            break;
                        case 2:
                            interfaceC0551N.mo1381c(c0818b0.f3435e);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            C0818b0 c0818b6 = c0818b0;
                            interfaceC0551N.mo1376I(c0818b6.f3443m, c0818b6.f3442l);
                            break;
                        case 4:
                            interfaceC0551N.mo1379a(c0818b0.f3444n);
                            break;
                        case 5:
                            interfaceC0551N.mo1378K(c0818b0.m2070k());
                            break;
                        case 6:
                            interfaceC0551N.mo1391r(c0818b0.f3445o);
                            break;
                        case 7:
                            interfaceC0551N.mo1387k(c0818b0.f3436f);
                            break;
                        case 8:
                            interfaceC0551N.mo1371C(c0818b0.f3436f);
                            break;
                        default:
                            interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                            break;
                    }
                }
            });
        } else {
            final int i27 = 1;
            this.f3251l.m1618c(-1, new InterfaceC0642j() { // from class: a0.u
                @Override // p064W.InterfaceC0642j
                /* JADX INFO: renamed from: g */
                public final void mo214g(Object obj11) {
                    InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj11;
                    switch (i27) {
                        case 0:
                            C0818b0 c0818b4 = c0818b0;
                            boolean z8 = c0818b4.f3437g;
                            interfaceC0551N.getClass();
                            interfaceC0551N.mo1369A(c0818b4.f3437g);
                            break;
                        case 1:
                            C0818b0 c0818b5 = c0818b0;
                            interfaceC0551N.mo1375H(c0818b5.f3435e, c0818b5.f3442l);
                            break;
                        case 2:
                            interfaceC0551N.mo1381c(c0818b0.f3435e);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            C0818b0 c0818b6 = c0818b0;
                            interfaceC0551N.mo1376I(c0818b6.f3443m, c0818b6.f3442l);
                            break;
                        case 4:
                            interfaceC0551N.mo1379a(c0818b0.f3444n);
                            break;
                        case 5:
                            interfaceC0551N.mo1378K(c0818b0.m2070k());
                            break;
                        case 6:
                            interfaceC0551N.mo1391r(c0818b0.f3445o);
                            break;
                        case 7:
                            interfaceC0551N.mo1387k(c0818b0.f3436f);
                            break;
                        case 8:
                            interfaceC0551N.mo1371C(c0818b0.f3436f);
                            break;
                        default:
                            interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                            break;
                    }
                }
            });
        }
        if (z6) {
            final int i28 = 2;
            this.f3251l.m1618c(4, new InterfaceC0642j() { // from class: a0.u
                @Override // p064W.InterfaceC0642j
                /* JADX INFO: renamed from: g */
                public final void mo214g(Object obj11) {
                    InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj11;
                    switch (i28) {
                        case 0:
                            C0818b0 c0818b4 = c0818b0;
                            boolean z8 = c0818b4.f3437g;
                            interfaceC0551N.getClass();
                            interfaceC0551N.mo1369A(c0818b4.f3437g);
                            break;
                        case 1:
                            C0818b0 c0818b5 = c0818b0;
                            interfaceC0551N.mo1375H(c0818b5.f3435e, c0818b5.f3442l);
                            break;
                        case 2:
                            interfaceC0551N.mo1381c(c0818b0.f3435e);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            C0818b0 c0818b6 = c0818b0;
                            interfaceC0551N.mo1376I(c0818b6.f3443m, c0818b6.f3442l);
                            break;
                        case 4:
                            interfaceC0551N.mo1379a(c0818b0.f3444n);
                            break;
                        case 5:
                            interfaceC0551N.mo1378K(c0818b0.m2070k());
                            break;
                        case 6:
                            interfaceC0551N.mo1391r(c0818b0.f3445o);
                            break;
                        case 7:
                            interfaceC0551N.mo1387k(c0818b0.f3436f);
                            break;
                        case 8:
                            interfaceC0551N.mo1371C(c0818b0.f3436f);
                            break;
                        default:
                            interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                            break;
                    }
                }
            });
        }
        if (z5) {
            final int i29 = 3;
            this.f3251l.m1618c(5, new InterfaceC0642j() { // from class: a0.u
                @Override // p064W.InterfaceC0642j
                /* JADX INFO: renamed from: g */
                public final void mo214g(Object obj11) {
                    InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj11;
                    switch (i29) {
                        case 0:
                            C0818b0 c0818b4 = c0818b0;
                            boolean z8 = c0818b4.f3437g;
                            interfaceC0551N.getClass();
                            interfaceC0551N.mo1369A(c0818b4.f3437g);
                            break;
                        case 1:
                            C0818b0 c0818b5 = c0818b0;
                            interfaceC0551N.mo1375H(c0818b5.f3435e, c0818b5.f3442l);
                            break;
                        case 2:
                            interfaceC0551N.mo1381c(c0818b0.f3435e);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            C0818b0 c0818b6 = c0818b0;
                            interfaceC0551N.mo1376I(c0818b6.f3443m, c0818b6.f3442l);
                            break;
                        case 4:
                            interfaceC0551N.mo1379a(c0818b0.f3444n);
                            break;
                        case 5:
                            interfaceC0551N.mo1378K(c0818b0.m2070k());
                            break;
                        case 6:
                            interfaceC0551N.mo1391r(c0818b0.f3445o);
                            break;
                        case 7:
                            interfaceC0551N.mo1387k(c0818b0.f3436f);
                            break;
                        case 8:
                            interfaceC0551N.mo1371C(c0818b0.f3436f);
                            break;
                        default:
                            interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                            break;
                    }
                }
            });
        } else {
            final int i210 = 3;
            this.f3251l.m1618c(5, new InterfaceC0642j() { // from class: a0.u
                @Override // p064W.InterfaceC0642j
                /* JADX INFO: renamed from: g */
                public final void mo214g(Object obj11) {
                    InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj11;
                    switch (i210) {
                        case 0:
                            C0818b0 c0818b4 = c0818b0;
                            boolean z8 = c0818b4.f3437g;
                            interfaceC0551N.getClass();
                            interfaceC0551N.mo1369A(c0818b4.f3437g);
                            break;
                        case 1:
                            C0818b0 c0818b5 = c0818b0;
                            interfaceC0551N.mo1375H(c0818b5.f3435e, c0818b5.f3442l);
                            break;
                        case 2:
                            interfaceC0551N.mo1381c(c0818b0.f3435e);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            C0818b0 c0818b6 = c0818b0;
                            interfaceC0551N.mo1376I(c0818b6.f3443m, c0818b6.f3442l);
                            break;
                        case 4:
                            interfaceC0551N.mo1379a(c0818b0.f3444n);
                            break;
                        case 5:
                            interfaceC0551N.mo1378K(c0818b0.m2070k());
                            break;
                        case 6:
                            interfaceC0551N.mo1391r(c0818b0.f3445o);
                            break;
                        case 7:
                            interfaceC0551N.mo1387k(c0818b0.f3436f);
                            break;
                        case 8:
                            interfaceC0551N.mo1371C(c0818b0.f3436f);
                            break;
                        default:
                            interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                            break;
                    }
                }
            });
        }
        if (c0818b1.f3444n != c0818b0.f3444n) {
            final int i211 = 4;
            this.f3251l.m1618c(6, new InterfaceC0642j() { // from class: a0.u
                @Override // p064W.InterfaceC0642j
                /* JADX INFO: renamed from: g */
                public final void mo214g(Object obj11) {
                    InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj11;
                    switch (i211) {
                        case 0:
                            C0818b0 c0818b4 = c0818b0;
                            boolean z8 = c0818b4.f3437g;
                            interfaceC0551N.getClass();
                            interfaceC0551N.mo1369A(c0818b4.f3437g);
                            break;
                        case 1:
                            C0818b0 c0818b5 = c0818b0;
                            interfaceC0551N.mo1375H(c0818b5.f3435e, c0818b5.f3442l);
                            break;
                        case 2:
                            interfaceC0551N.mo1381c(c0818b0.f3435e);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            C0818b0 c0818b6 = c0818b0;
                            interfaceC0551N.mo1376I(c0818b6.f3443m, c0818b6.f3442l);
                            break;
                        case 4:
                            interfaceC0551N.mo1379a(c0818b0.f3444n);
                            break;
                        case 5:
                            interfaceC0551N.mo1378K(c0818b0.m2070k());
                            break;
                        case 6:
                            interfaceC0551N.mo1391r(c0818b0.f3445o);
                            break;
                        case 7:
                            interfaceC0551N.mo1387k(c0818b0.f3436f);
                            break;
                        case 8:
                            interfaceC0551N.mo1371C(c0818b0.f3436f);
                            break;
                        default:
                            interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                            break;
                    }
                }
            });
        }
        if (c0818b1.m2070k() != c0818b0.m2070k()) {
            final int i212 = 5;
            this.f3251l.m1618c(7, new InterfaceC0642j() { // from class: a0.u
                @Override // p064W.InterfaceC0642j
                /* JADX INFO: renamed from: g */
                public final void mo214g(Object obj11) {
                    InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj11;
                    switch (i212) {
                        case 0:
                            C0818b0 c0818b4 = c0818b0;
                            boolean z8 = c0818b4.f3437g;
                            interfaceC0551N.getClass();
                            interfaceC0551N.mo1369A(c0818b4.f3437g);
                            break;
                        case 1:
                            C0818b0 c0818b5 = c0818b0;
                            interfaceC0551N.mo1375H(c0818b5.f3435e, c0818b5.f3442l);
                            break;
                        case 2:
                            interfaceC0551N.mo1381c(c0818b0.f3435e);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            C0818b0 c0818b6 = c0818b0;
                            interfaceC0551N.mo1376I(c0818b6.f3443m, c0818b6.f3442l);
                            break;
                        case 4:
                            interfaceC0551N.mo1379a(c0818b0.f3444n);
                            break;
                        case 5:
                            interfaceC0551N.mo1378K(c0818b0.m2070k());
                            break;
                        case 6:
                            interfaceC0551N.mo1391r(c0818b0.f3445o);
                            break;
                        case 7:
                            interfaceC0551N.mo1387k(c0818b0.f3436f);
                            break;
                        case 8:
                            interfaceC0551N.mo1371C(c0818b0.f3436f);
                            break;
                        default:
                            interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                            break;
                    }
                }
            });
        }
        if (!c0818b1.f3445o.equals(c0818b0.f3445o)) {
            final int i213 = 6;
            this.f3251l.m1618c(12, new InterfaceC0642j() { // from class: a0.u
                @Override // p064W.InterfaceC0642j
                /* JADX INFO: renamed from: g */
                public final void mo214g(Object obj11) {
                    InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj11;
                    switch (i213) {
                        case 0:
                            C0818b0 c0818b4 = c0818b0;
                            boolean z8 = c0818b4.f3437g;
                            interfaceC0551N.getClass();
                            interfaceC0551N.mo1369A(c0818b4.f3437g);
                            break;
                        case 1:
                            C0818b0 c0818b5 = c0818b0;
                            interfaceC0551N.mo1375H(c0818b5.f3435e, c0818b5.f3442l);
                            break;
                        case 2:
                            interfaceC0551N.mo1381c(c0818b0.f3435e);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            C0818b0 c0818b6 = c0818b0;
                            interfaceC0551N.mo1376I(c0818b6.f3443m, c0818b6.f3442l);
                            break;
                        case 4:
                            interfaceC0551N.mo1379a(c0818b0.f3444n);
                            break;
                        case 5:
                            interfaceC0551N.mo1378K(c0818b0.m2070k());
                            break;
                        case 6:
                            interfaceC0551N.mo1391r(c0818b0.f3445o);
                            break;
                        case 7:
                            interfaceC0551N.mo1387k(c0818b0.f3436f);
                            break;
                        case 8:
                            interfaceC0551N.mo1371C(c0818b0.f3436f);
                            break;
                        default:
                            interfaceC0551N.mo1389o(c0818b0.f3439i.f8915d);
                            break;
                    }
                }
            });
        }
        m1927v0();
        this.f3251l.m1617b();
        if (c0818b1.f3446p != c0818b0.f3446p) {
            it = this.f3252m.iterator();
            while (it.hasNext()) {
                ((SurfaceHolderCallbackC0850z) it.next()).f3610g.m1930y0();
            }
        }
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: y */
    public final Looper mo1326y() {
        return this.f3258s;
    }

    /* JADX INFO: renamed from: y0 */
    public final void m1930y0() {
        int iMo1304g = mo1304g();
        C0352g c0352g = this.f3210D;
        C0352g c0352g2 = this.f3209C;
        if (iMo1304g != 1) {
            if (iMo1304g == 2 || iMo1304g == 3) {
                m1931z0();
                boolean z3 = this.f3243f0.f3446p;
                mo1322t();
                c0352g2.getClass();
                mo1322t();
                c0352g.getClass();
                return;
            }
            if (iMo1304g != 4) {
                throw new IllegalStateException();
            }
        }
        c0352g2.getClass();
        c0352g.getClass();
    }

    @Override // p055T.InterfaceC0553P
    /* JADX INFO: renamed from: z */
    public final C0568c0 mo1327z() {
        m1931z0();
        return this.f3243f0.f3439i.f8915d;
    }

    /* JADX INFO: renamed from: z0 */
    public final void m1931z0() {
        C0635c c0635c = this.f3238d;
        synchronized (c0635c) {
            boolean z3 = false;
            while (!c0635c.f2475a) {
                try {
                    c0635c.wait();
                } catch (InterruptedException unused) {
                    z3 = true;
                }
            }
            if (z3) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f3258s.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f3258s.getThread().getName();
            int i3 = AbstractC0632A.f2454a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread";
            if (this.f3232Z) {
                throw new IllegalStateException(str);
            }
            AbstractC0646n.m1648z("ExoPlayerImpl", str, this.f3233a0 ? null : new IllegalStateException());
            this.f3233a0 = true;
        }
    }
}
