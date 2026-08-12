package com.google.android.gms.internal.cast;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v4.media.session.C0858A;
import android.support.v4.media.session.HandlerC0870f;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p000A.AbstractC0003D;
import p000A.AbstractC0016Q;
import p000A.C0026a0;
import p000A.C0058r;
import p013E1.RunnableC0121D;
import p014F.RunnableC0153b;
import p034L1.C0352g;
import p046P1.C0475c;
import p053S0.C0536b;
import p055T.C0582n;
import p055T.C0583o;
import p056T0.C0595a;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p070Y.C0713j;
import p073Z.C0767b;
import p082b0.C1063d;
import p088d0.C1377a;
import p088d0.C1378b;
import p088d0.C1393q;
import p089d1.C1447t;
import p091e.C1489t;
import p091e.LayoutInflaterFactory2C1458C;
import p095f0.AbstractC1541n;
import p095f0.C1528a;
import p095f0.C1537j;
import p095f0.C1540m;
import p095f0.C1543p;
import p095f0.InterfaceC1544q;
import p103h0.C1593b;
import p103h0.C1594c;
import p103h0.C1595d;
import p103h0.C1597f;
import p103h0.C1606o;
import p103h0.InterfaceC1602k;
import p103h0.InterfaceC1603l;
import p104h1.AbstractC1635T;
import p104h1.C1619C;
import p104h1.C1640Y;
import p104h1.C1645b0;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p106i.AbstractC1733a;
import p106i.C1737e;
import p110j.MenuC1756B;
import p110j.MenuC1772m;
import p114k0.C1958r;
import p124n.C2021h;
import p124n.C2022i;
import p129o0.InterfaceC2075o;
import p137q0.C2143d;
import p137q0.C2156q;
import p137q0.C2160u;
import p142r1.C2199d;
import p142r1.C2200e;
import p142r1.C2201f;
import p145s0.InterfaceC2240m;
import p146s1.InterfaceC2254a;
import p150t1.C2275a;
import p150t1.C2277c;
import p150t1.InterfaceC2276b;
import p160x.C2346e;
import p166y1.C2376a;
import p166y1.C2383h;
import p166y1.C2385j;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1323r implements InterfaceC1544q, InterfaceC1602k, InterfaceC1603l, InterfaceC2075o, InterfaceC2276b {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5960g;

    /* JADX INFO: renamed from: h */
    public Object f5961h;

    /* JADX INFO: renamed from: i */
    public Object f5962i;

    public C1323r(Context context, int i3) {
        this.f5960g = i3;
        switch (i3) {
            case 12:
                this.f5962i = null;
                this.f5961h = context;
                break;
            default:
                this.f5961h = context;
                break;
        }
    }

    /* JADX INFO: renamed from: B */
    public static int m3353B(int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < i3; i7++) {
            i5++;
            if (i5 == i4) {
                i6++;
                i5 = 0;
            } else if (i5 > i4) {
                i6++;
                i5 = 1;
            }
        }
        return i5 + 1 > i4 ? i6 + 1 : i6;
    }

    /* JADX INFO: renamed from: A */
    public InterfaceC2240m m3354A(Object... objArr) {
        Constructor constructorM2830d;
        synchronized (((AtomicBoolean) this.f5962i)) {
            try {
                if (!((AtomicBoolean) this.f5962i).get()) {
                    try {
                        constructorM2830d = ((C1063d) this.f5961h).m2830d();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.f5962i).set(true);
                        constructorM2830d = null;
                    } catch (Exception e3) {
                        throw new RuntimeException("Error instantiating extension", e3);
                    }
                }
                constructorM2830d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (constructorM2830d == null) {
            return null;
        }
        try {
            return (InterfaceC2240m) constructorM2830d.newInstance(objArr);
        } catch (Exception e4) {
            throw new IllegalStateException("Unexpected error creating extractor", e4);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m3355C() {
        ((SparseIntArray) this.f5961h).clear();
    }

    /* JADX INFO: renamed from: D */
    public boolean m3356D(View view) {
        C1619C c1619c = (C1619C) this.f5961h;
        int iM3999d = c1619c.m3999d();
        int iM3998c = c1619c.m3998c();
        int iM3997b = c1619c.m3997b(view);
        int iM3996a = c1619c.m3996a(view);
        C0595a c0595a = (C0595a) this.f5962i;
        c0595a.f2207b = iM3999d;
        c0595a.f2208c = iM3998c;
        c0595a.f2209d = iM3997b;
        c0595a.f2210e = iM3996a;
        c0595a.f2206a = 24579;
        return c0595a.m1456a();
    }

    /* JADX INFO: renamed from: E */
    public void m3357E(int i3, int i4) {
        int[] iArr = (int[]) this.f5961h;
        if (iArr == null || i3 >= iArr.length) {
            return;
        }
        int i5 = i3 + i4;
        m3390x(i5);
        int[] iArr2 = (int[]) this.f5961h;
        System.arraycopy(iArr2, i3, iArr2, i5, (iArr2.length - i3) - i4);
        Arrays.fill((int[]) this.f5961h, i3, i5, -1);
        ArrayList arrayList = (ArrayList) this.f5962i;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1640Y c1640y = (C1640Y) ((ArrayList) this.f5962i).get(size);
            int i6 = c1640y.f7436g;
            if (i6 >= i3) {
                c1640y.f7436g = i6 + i4;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void m3358F(int i3, int i4) {
        int[] iArr = (int[]) this.f5961h;
        if (iArr == null || i3 >= iArr.length) {
            return;
        }
        int i5 = i3 + i4;
        m3390x(i5);
        int[] iArr2 = (int[]) this.f5961h;
        System.arraycopy(iArr2, i5, iArr2, i3, (iArr2.length - i3) - i4);
        int[] iArr3 = (int[]) this.f5961h;
        Arrays.fill(iArr3, iArr3.length - i4, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f5962i;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1640Y c1640y = (C1640Y) ((ArrayList) this.f5962i).get(size);
            int i6 = c1640y.f7436g;
            if (i6 >= i3) {
                if (i6 < i5) {
                    ((ArrayList) this.f5962i).remove(size);
                } else {
                    c1640y.f7436g = i6 - i4;
                }
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public void m3359G(AbstractC1733a abstractC1733a) {
        C0536b c0536b = (C0536b) this.f5961h;
        ((ActionMode.Callback) c0536b.f1867g).onDestroyActionMode(c0536b.m1337e(abstractC1733a));
        LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = (LayoutInflaterFactory2C1458C) this.f5962i;
        if (layoutInflaterFactory2C1458C.f6448C != null) {
            layoutInflaterFactory2C1458C.f6488r.getDecorView().removeCallbacks(layoutInflaterFactory2C1458C.f6449D);
        }
        if (layoutInflaterFactory2C1458C.f6447B != null) {
            C0026a0 c0026a0 = layoutInflaterFactory2C1458C.f6450E;
            if (c0026a0 != null) {
                c0026a0.m105b();
            }
            C0026a0 c0026a0M79a = AbstractC0016Q.m79a(layoutInflaterFactory2C1458C.f6447B);
            c0026a0M79a.m104a(0.0f);
            layoutInflaterFactory2C1458C.f6450E = c0026a0M79a;
            c0026a0M79a.m107d(new C1489t(2, this));
        }
        layoutInflaterFactory2C1458C.f6446A = null;
        ViewGroup viewGroup = layoutInflaterFactory2C1458C.f6453H;
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        AbstractC0003D.m7c(viewGroup);
        layoutInflaterFactory2C1458C.m3654I();
    }

    /* JADX INFO: renamed from: H */
    public boolean m3360H(AbstractC1733a abstractC1733a, MenuC1772m menuC1772m) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C1458C) this.f5962i).f6453H;
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        AbstractC0003D.m7c(viewGroup);
        C0536b c0536b = (C0536b) this.f5961h;
        C1737e c1737eM1337e = c0536b.m1337e(abstractC1733a);
        C2022i c2022i = (C2022i) c0536b.f1870j;
        Menu menuC1756B = (Menu) c2022i.getOrDefault(menuC1772m, null);
        if (menuC1756B == null) {
            menuC1756B = new MenuC1756B((Context) c0536b.f1868h, menuC1772m);
            c2022i.put(menuC1772m, menuC1756B);
        }
        return ((ActionMode.Callback) c0536b.f1867g).onPrepareActionMode(c1737eM1337e, menuC1756B);
    }

    /* JADX INFO: renamed from: I */
    public void m3361I(Exception exc, boolean z3) {
        this.f5962i = null;
        HashSet hashSet = (HashSet) this.f5961h;
        AbstractC1676G abstractC1676GM4117n = AbstractC1676G.m4117n(hashSet);
        hashSet.clear();
        C1674E c1674eListIterator = abstractC1676GM4117n.listIterator(0);
        while (c1674eListIterator.hasNext()) {
            C1378b c1378b = (C1378b) c1674eListIterator.next();
            c1378b.getClass();
            c1378b.m3471l(exc, z3 ? 1 : 3);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m3362J(C2346e c2346e) {
        int i3 = c2346e.f9855b;
        Handler handler = (Handler) this.f5962i;
        C1447t c1447t = (C1447t) this.f5961h;
        if (i3 != 0) {
            handler.post(new RunnableC0153b(c1447t, i3));
        } else {
            handler.post(new RunnableC0121D(c1447t, 14, c2346e.f9854a));
        }
    }

    /* JADX INFO: renamed from: K */
    public C0058r m3363K(AbstractC1635T abstractC1635T, int i3) {
        C1645b0 c1645b0;
        C0058r c0058r;
        C2022i c2022i = (C2022i) this.f5961h;
        int iM4587d = c2022i.m4587d(abstractC1635T);
        if (iM4587d >= 0 && (c1645b0 = (C1645b0) c2022i.m4592i(iM4587d)) != null) {
            int i4 = c1645b0.f7463a;
            if ((i4 & i3) != 0) {
                int i5 = i4 & (~i3);
                c1645b0.f7463a = i5;
                if (i3 == 4) {
                    c0058r = c1645b0.f7464b;
                } else {
                    if (i3 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0058r = c1645b0.f7465c;
                }
                if ((i5 & 12) == 0) {
                    c2022i.m4591h(iM4587d);
                    c1645b0.f7463a = 0;
                    c1645b0.f7464b = null;
                    c1645b0.f7465c = null;
                    C1645b0.f7462d.m932l(c1645b0);
                }
                return c0058r;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public void m3364L(C1378b c1378b) {
        ((HashSet) this.f5961h).add(c1378b);
        if (((C1378b) this.f5962i) != null) {
            return;
        }
        this.f5962i = c1378b;
        C1393q c1393qMo975d = c1378b.f6126b.mo975d();
        c1378b.f6148x = c1393qMo975d;
        HandlerC0870f handlerC0870f = c1378b.f6142r;
        int i3 = AbstractC0632A.f2454a;
        c1393qMo975d.getClass();
        handlerC0870f.getClass();
        handlerC0870f.obtainMessage(1, new C1377a(C1958r.f8563b.getAndIncrement(), true, SystemClock.elapsedRealtime(), c1393qMo975d)).sendToTarget();
    }

    /* JADX INFO: renamed from: M */
    public void m3365M(AbstractC1635T abstractC1635T) {
        C1645b0 c1645b0 = (C1645b0) ((C2022i) this.f5961h).getOrDefault(abstractC1635T, null);
        if (c1645b0 == null) {
            return;
        }
        c1645b0.f7463a &= -2;
    }

    /* JADX INFO: renamed from: N */
    public void m3366N(AbstractC1635T abstractC1635T) {
        C2021h c2021h = (C2021h) this.f5962i;
        if (c2021h.f8781g) {
            c2021h.m4581c();
        }
        for (int i3 = c2021h.f8784j - 1; i3 >= 0; i3--) {
            if (c2021h.f8781g) {
                c2021h.m4581c();
            }
            Object[] objArr = c2021h.f8783i;
            Object obj = objArr[i3];
            if (abstractC1635T == obj) {
                Object obj2 = C2021h.f8780k;
                if (obj == obj2) {
                    break;
                }
                objArr[i3] = obj2;
                c2021h.f8781g = true;
                break;
            }
        }
        C1645b0 c1645b0 = (C1645b0) ((C2022i) this.f5961h).remove(abstractC1635T);
        if (c1645b0 != null) {
            c1645b0.f7463a = 0;
            c1645b0.f7464b = null;
            c1645b0.f7465c = null;
            C1645b0.f7462d.m932l(c1645b0);
        }
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: a */
    public void mo3367a() {
        C0858A c0858a = (C0858A) this.f5962i;
        MediaCodec mediaCodec = (MediaCodec) this.f5961h;
        try {
            int i3 = AbstractC0632A.f2454a;
            if (i3 >= 30 && i3 < 33) {
                mediaCodec.stop();
            }
        } finally {
            if (AbstractC0632A.f2454a >= 35 && c0858a != null) {
                c0858a.m2171T(mediaCodec);
            }
            mediaCodec.release();
        }
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: b */
    public void mo3368b(int i3, C0767b c0767b, long j3, int i4) {
        ((MediaCodec) this.f5961h).queueSecureInputBuffer(i3, 0, c0767b.f3140i, j3, i4);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: c */
    public void mo3369c(Bundle bundle) {
        ((MediaCodec) this.f5961h).setParameters(bundle);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: d */
    public void mo3370d(int i3, int i4, long j3, int i5) {
        ((MediaCodec) this.f5961h).queueInputBuffer(i3, 0, i4, j3, i5);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: e */
    public int mo3371e(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.f5961h).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: f */
    public void mo3372f() {
        ((MediaCodec) this.f5961h).detachOutputSurface();
    }

    @Override // p103h0.InterfaceC1603l
    public void flush() {
        ((MediaCodec) this.f5961h).flush();
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: g */
    public ByteBuffer mo3373g(int i3) {
        return ((MediaCodec) this.f5961h).getInputBuffer(i3);
    }

    @Override // p139q2.InterfaceC2180a
    public Object get() {
        switch (this.f5960g) {
            case 13:
                return new C2201f((Context) ((C2277c) this.f5961h).f9746g, (C2199d) ((C2200e) this.f5962i).get());
            default:
                C0352g c0352g = new C0352g(2);
                C0352g c0352g2 = new C0352g(1);
                C2376a c2376a = C2376a.f9956f;
                Object obj = ((C2200e) this.f5961h).get();
                InterfaceC2276b interfaceC2276b = (C2200e) this.f5962i;
                return new C2383h(c0352g, c0352g2, c2376a, (C2385j) obj, interfaceC2276b instanceof InterfaceC2254a ? (InterfaceC2254a) interfaceC2276b : new C2275a(interfaceC2276b));
        }
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: h */
    public void mo3374h(Surface surface) {
        ((MediaCodec) this.f5961h).setOutputSurface(surface);
    }

    @Override // p095f0.InterfaceC1544q
    /* JADX INFO: renamed from: i */
    public InterfaceC2075o mo3375i(C1540m c1540m, C1537j c1537j) {
        ((C1528a) this.f5961h).getClass();
        return new C1323r(new C1543p(c1540m, c1537j), 10, (List) this.f5962i);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: j */
    public void mo3376j(int i3) {
        ((MediaCodec) this.f5961h).releaseOutputBuffer(i3, false);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: k */
    public ByteBuffer mo3377k(int i3) {
        return ((MediaCodec) this.f5961h).getOutputBuffer(i3);
    }

    @Override // p129o0.InterfaceC2075o
    /* JADX INFO: renamed from: l */
    public AbstractC1541n mo3378l(Uri uri, C0713j c0713j) {
        AbstractC1541n abstractC1541nMo3378l = ((InterfaceC2075o) this.f5961h).mo3378l(uri, c0713j);
        List list = (List) this.f5962i;
        return (list == null || list.isEmpty()) ? abstractC1541nMo3378l : (AbstractC1541n) abstractC1541nMo3378l.mo3834a(list);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: m */
    public void mo3379m(int i3, long j3) {
        ((MediaCodec) this.f5961h).releaseOutputBuffer(i3, j3);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: n */
    public int mo3380n() {
        return ((MediaCodec) this.f5961h).dequeueInputBuffer(0L);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: o */
    public void mo3381o(int i3) {
        ((MediaCodec) this.f5961h).setVideoScalingMode(i3);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: p */
    public void mo3382p(C2143d c2143d, Handler handler) {
        ((MediaCodec) this.f5961h).setOnFrameRenderedListener(new C1593b(this, c2143d, 1), handler);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: q */
    public /* synthetic */ boolean mo3383q(C1447t c1447t) {
        return false;
    }

    @Override // p095f0.InterfaceC1544q
    /* JADX INFO: renamed from: r */
    public InterfaceC2075o mo3384r() {
        return new C1323r(((C1528a) this.f5961h).mo3384r(), 10, (List) this.f5962i);
    }

    @Override // p103h0.InterfaceC1603l
    /* JADX INFO: renamed from: s */
    public MediaFormat mo3385s() {
        return ((MediaCodec) this.f5961h).getOutputFormat();
    }

    /* JADX INFO: renamed from: t */
    public void m3386t(AbstractC1635T abstractC1635T, C0058r c0058r) {
        C2022i c2022i = (C2022i) this.f5961h;
        C1645b0 c1645b0M4071a = (C1645b0) c2022i.getOrDefault(abstractC1635T, null);
        if (c1645b0M4071a == null) {
            c1645b0M4071a = C1645b0.m4071a();
            c2022i.put(abstractC1635T, c1645b0M4071a);
        }
        c1645b0M4071a.f7465c = c0058r;
        c1645b0M4071a.f7463a |= 8;
    }

    /* JADX INFO: renamed from: u */
    public void m3387u() {
        int[] iArr = (int[]) this.f5961h;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f5962i = null;
    }

    @Override // p103h0.InterfaceC1602k
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public C1595d mo3389w(C0475c c0475c) throws Exception {
        MediaCodec mediaCodecCreateByCodecName;
        String str = ((C1606o) c0475c.f1568a).f7252a;
        C1595d c1595d = null;
        try {
            Trace.beginSection("createCodec:" + str);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            try {
                C1595d c1595d2 = new C1595d(mediaCodecCreateByCodecName, (HandlerThread) ((C1594c) this.f5961h).get(), new C1597f(mediaCodecCreateByCodecName, (HandlerThread) ((C1594c) this.f5962i).get()), (C0858A) c0475c.f1573f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) c0475c.f1571d;
                    C1595d.m3924i(c1595d2, (MediaFormat) c0475c.f1569b, surface, (MediaCrypto) c0475c.f1572e, (surface == null && ((C1606o) c0475c.f1568a).f7259h && AbstractC0632A.f2454a >= 35) ? 8 : 0);
                    return c1595d2;
                } catch (Exception e3) {
                    e = e3;
                    c1595d = c1595d2;
                    if (c1595d != null) {
                        c1595d.mo3367a();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Exception e5) {
            e = e5;
            mediaCodecCreateByCodecName = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m3390x(int i3) {
        int[] iArr = (int[]) this.f5961h;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i3, 10) + 1];
            this.f5961h = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i3 >= iArr.length) {
            int length = iArr.length;
            while (length <= i3) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f5961h = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f5961h;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* JADX INFO: renamed from: y */
    public View m3391y(int i3, int i4, int i5, int i6) {
        View viewM4025t;
        C1619C c1619c = (C1619C) this.f5961h;
        int iM3999d = c1619c.m3999d();
        int iM3998c = c1619c.m3998c();
        int i7 = i4 > i3 ? 1 : -1;
        View view = null;
        while (i3 != i4) {
            switch (c1619c.f7344a) {
                case 0:
                    viewM4025t = c1619c.f7345b.m4025t(i3);
                    break;
                default:
                    viewM4025t = c1619c.f7345b.m4025t(i3);
                    break;
            }
            int iM3997b = c1619c.m3997b(viewM4025t);
            int iM3996a = c1619c.m3996a(viewM4025t);
            C0595a c0595a = (C0595a) this.f5962i;
            c0595a.f2207b = iM3999d;
            c0595a.f2208c = iM3998c;
            c0595a.f2209d = iM3997b;
            c0595a.f2210e = iM3996a;
            if (i5 != 0) {
                c0595a.f2206a = i5;
                if (c0595a.m1456a()) {
                    return viewM4025t;
                }
            }
            if (i6 != 0) {
                c0595a.f2206a = i6;
                if (c0595a.m1456a()) {
                    view = viewM4025t;
                }
            }
            i3 += i7;
        }
        return view;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX INFO: renamed from: z */
    public CctBackendFactory m3392z(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.f5962i) == null) {
            Context context = (Context) this.f5961h;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.f5962i = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.f5962i = map;
        }
        String str4 = (String) ((Map) this.f5962i).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e3) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e3);
            return null;
        } catch (IllegalAccessException e4) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e4);
            return null;
        } catch (InstantiationException e5) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e5);
            return null;
        } catch (NoSuchMethodException e6) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e6);
            return null;
        } catch (InvocationTargetException e7) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e7);
            return null;
        }
    }

    public /* synthetic */ C1323r(Object obj, int i3, Object obj2) {
        this.f5960g = i3;
        this.f5961h = obj;
        this.f5962i = obj2;
    }

    public C1323r(C2156q c2156q, C2160u c2160u) {
        this.f5960g = 11;
        this.f5961h = c2156q;
        this.f5962i = c2160u;
        new C0583o(new C0582n());
    }

    public C1323r(int i3) {
        this.f5960g = 4;
        C1594c c1594c = new C1594c(i3, 0);
        C1594c c1594c2 = new C1594c(i3, 1);
        this.f5961h = c1594c;
        this.f5962i = c1594c2;
    }

    public C1323r(MediaCodec mediaCodec, C0858A c0858a) {
        this.f5960g = 5;
        this.f5961h = mediaCodec;
        this.f5962i = c0858a;
        if (AbstractC0632A.f2454a < 35 || c0858a == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) c0858a.f3641j;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            AbstractC0646n.m1630h(((HashSet) c0858a.f3639h).add(mediaCodec));
        }
    }

    public C1323r(C1619C c1619c) {
        this.f5960g = 8;
        this.f5961h = c1619c;
        C0595a c0595a = new C0595a();
        c0595a.f2206a = 0;
        this.f5962i = c0595a;
    }

    public C1323r(ArrayList arrayList, ArrayList arrayList2) {
        this.f5960g = 14;
        int size = arrayList.size();
        this.f5961h = new int[size];
        this.f5962i = new float[size];
        for (int i3 = 0; i3 < size; i3++) {
            ((int[]) this.f5961h)[i3] = ((Integer) arrayList.get(i3)).intValue();
            ((float[]) this.f5962i)[i3] = ((Float) arrayList2.get(i3)).floatValue();
        }
    }

    public C1323r(int i3, int i4) {
        this.f5960g = 14;
        this.f5961h = new int[]{i3, i4};
        this.f5962i = new float[]{0.0f, 1.0f};
    }

    public C1323r(int i3, int i4, int i5) {
        this.f5960g = 14;
        this.f5961h = new int[]{i3, i4, i5};
        this.f5962i = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C1323r(C1063d c1063d) {
        this.f5960g = 15;
        this.f5961h = c1063d;
        this.f5962i = new AtomicBoolean(false);
    }

    public C1323r(int i3, byte b3) {
        this.f5960g = i3;
        switch (i3) {
            case 6:
                this.f5961h = new SparseIntArray();
                this.f5962i = new SparseIntArray();
                break;
            case 7:
                break;
            case 8:
            default:
                this.f5961h = new HashSet();
                break;
            case 9:
                this.f5961h = new C2022i();
                this.f5962i = new C2021h();
                break;
        }
    }

    public C1323r(LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C, C0536b c0536b) {
        this.f5960g = 2;
        this.f5962i = layoutInflaterFactory2C1458C;
        this.f5961h = c0536b;
    }
}
