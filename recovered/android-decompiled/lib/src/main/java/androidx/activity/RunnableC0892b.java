package androidx.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Trace;
import android.view.Surface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.emoji2.text.C0926p;
import androidx.lifecycle.C0977B;
import androidx.lifecycle.C1007t;
import androidx.lifecycle.EnumC0999l;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.MainActivity;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.Iterator;
import p011E.C0111d;
import p013E1.RunnableC0121D;
import p034L1.C0352g;
import p036M0.C0368e;
import p053S0.C0536b;
import p060U1.AbstractC0610a;
import p077a0.SurfaceHolderCallbackC0850z;
import p082b0.C1062c;
import p082b0.C1064e;
import p083b1.C1076E;
import p083b1.C1095e;
import p083b1.C1109s;
import p085c0.C1120B;
import p085c0.C1150z;
import p088d0.C1378b;
import p088d0.C1381e;
import p088d0.InterfaceC1384h;
import p089d1.C1401A;
import p089d1.C1433f;
import p089d1.C1436i;
import p089d1.C1447t;
import p091e.AbstractActivityC1479j;
import p103h0.C1598g;
import p136q.AbstractC2119b;
import p136q.C2118a;
import p137q0.C2152m;
import p141r0.C2194k;
import p148t.AbstractC2268g;
import p157w.AbstractC2317k;
import p160x.C2348g;
import p162x1.C2361j;
import p163x2.AbstractC2364c;
import p166y1.C2383h;

/* JADX INFO: renamed from: androidx.activity.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0892b implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3724g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f3725h;

    public /* synthetic */ RunnableC0892b(int i3, Object obj) {
        this.f3724g = i3;
        this.f3725h = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m2289a() {
        C1598g c1598g = (C1598g) this.f3725h;
        synchronized (c1598g.f7230a) {
            try {
                if (c1598g.f7242m) {
                    return;
                }
                long j3 = c1598g.f7241l - 1;
                c1598g.f7241l = j3;
                if (j3 > 0) {
                    return;
                }
                if (j3 < 0) {
                    c1598g.m3933b(new IllegalStateException());
                } else {
                    c1598g.m3932a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i3 = 12;
        int i4 = 27;
        switch (this.f3724g) {
            case 0:
                ((AbstractActivityC1479j) this.f3725h).invalidateOptionsMenu();
                return;
            case 1:
                ExecutorC0899i executorC0899i = (ExecutorC0899i) this.f3725h;
                Runnable runnable = executorC0899i.f3741h;
                if (runnable != null) {
                    runnable.run();
                    executorC0899i.f3741h = null;
                    return;
                }
                return;
            case 2:
                DialogC0901k.m2303a((DialogC0901k) this.f3725h);
                return;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                C0926p c0926p = (C0926p) this.f3725h;
                synchronized (c0926p.f4026d) {
                    try {
                        if (c0926p.f4030h == null) {
                            return;
                        }
                        try {
                            C2348g c2348gM2419d = c0926p.m2419d();
                            int i5 = c2348gM2419d.f9864e;
                            if (i5 == 2) {
                                synchronized (c0926p.f4026d) {
                                }
                            }
                            if (i5 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i5 + ")");
                            }
                            try {
                                int i6 = AbstractC2317k.f9837a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C0352g c0352g = c0926p.f4025c;
                                Context context = c0926p.f4023a;
                                c0352g.getClass();
                                Typeface typefaceMo1771m = AbstractC2268g.f9705a.mo1771m(context, new C2348g[]{c2348gM2419d}, 0);
                                MappedByteBuffer mappedByteBufferM3333z = AbstractC1303m.m3333z(c0926p.f4023a, c2348gM2419d.f9860a);
                                if (mappedByteBufferM3333z == null || typefaceMo1771m == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    C0536b c0536b = new C0536b(typefaceMo1771m, AbstractC1303m.m3279B(mappedByteBufferM3333z));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (c0926p.f4026d) {
                                        try {
                                            AbstractC0610a abstractC0610a = c0926p.f4030h;
                                            if (abstractC0610a != null) {
                                                abstractC0610a.mo1525B(c0536b);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        break;
                                    }
                                    c0926p.m2417b();
                                    return;
                                } catch (Throwable th2) {
                                    int i7 = AbstractC2317k.f9837a;
                                    Trace.endSection();
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                int i8 = AbstractC2317k.f9837a;
                                Trace.endSection();
                                throw th3;
                            }
                            break;
                        } catch (Throwable th4) {
                            synchronized (c0926p.f4026d) {
                                try {
                                    AbstractC0610a abstractC0610a2 = c0926p.f4030h;
                                    if (abstractC0610a2 != null) {
                                        abstractC0610a2.mo1524A(th4);
                                    }
                                    c0926p.m2417b();
                                    return;
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
            case 4:
                C0977B c0977b = (C0977B) this.f3725h;
                AbstractC2364c.m4954e(c0977b, "this$0");
                int i9 = c0977b.f4275h;
                C1007t c1007t = c0977b.f4279l;
                if (i9 == 0) {
                    c0977b.f4276i = true;
                    c1007t.m2568d(EnumC0999l.ON_PAUSE);
                }
                if (c0977b.f4274g == 0 && c0977b.f4276i) {
                    c1007t.m2568d(EnumC0999l.ON_STOP);
                    c0977b.f4277j = true;
                    return;
                }
                return;
            case 5:
                C1064e c1064e = (C1064e) this.f3725h;
                c1064e.m2836R(c1064e.m2831M(), 1028, new C1062c(14));
                c1064e.f4831l.m1619d();
                return;
            case 6:
                ((C1095e) this.f3725h).m2933d(false);
                return;
            case 7:
                ((C1109s) this.f3725h).m2956o();
                return;
            case 8:
                ((C1076E) this.f3725h).invalidate();
                return;
            case 9:
                C1150z c1150z = (C1150z) this.f3725h;
                if (c1150z.f5383h0 >= 300000) {
                    ((C1120B) c1150z.f5394r.f38h).f5191U0 = true;
                    c1150z.f5383h0 = 0L;
                    return;
                }
                return;
            case 10:
                FrameLayout frameLayout = (FrameLayout) this.f3725h;
                String str = MainActivity.f6006q;
                try {
                    ((ViewGroup) frameLayout.getParent()).removeView(frameLayout);
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 11:
                C1381e c1381e = (C1381e) this.f3725h;
                if (c1381e.f6152i) {
                    return;
                }
                InterfaceC1384h interfaceC1384h = c1381e.f6151h;
                if (interfaceC1384h != null) {
                    interfaceC1384h.mo3463d(c1381e.f6150g);
                }
                c1381e.f6153j.f6165n.remove(c1381e);
                c1381e.f6152i = true;
                return;
            case 12:
                ((C1378b) this.f3725h).mo3463d(null);
                return;
            case 13:
                ((C1433f) this.f3725h).m3583k();
                return;
            case 14:
                ((C1436i) this.f3725h).f6365n = -1;
                return;
            case 15:
                ((C1401A) this.f3725h).m3489b();
                return;
            case 16:
                ((C1447t) this.f3725h).m3626n();
                return;
            case 17:
                m2289a();
                return;
            case 18:
                Activity activity = (Activity) this.f3725h;
                if (activity.isFinishing()) {
                    return;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28) {
                    Class cls = AbstractC2119b.f9165a;
                    activity.recreate();
                    return;
                }
                Class cls2 = AbstractC2119b.f9165a;
                boolean z3 = i10 == 26 || i10 == 27;
                Method method = AbstractC2119b.f9170f;
                if ((!z3 || method != null) && (AbstractC2119b.f9169e != null || AbstractC2119b.f9168d != null)) {
                    try {
                        Object obj2 = AbstractC2119b.f9167c.get(activity);
                        if (obj2 != null && (obj = AbstractC2119b.f9166b.get(activity)) != null) {
                            Application application = activity.getApplication();
                            C2118a c2118a = new C2118a(activity);
                            application.registerActivityLifecycleCallbacks(c2118a);
                            Handler handler = AbstractC2119b.f9171g;
                            handler.post(new RunnableC0121D(c2118a, 11, obj2));
                            try {
                                if (i10 == 26 || i10 == 27) {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                } else {
                                    activity.recreate();
                                }
                                handler.post(new RunnableC0121D(application, i3, c2118a));
                                return;
                            } catch (Throwable th7) {
                                handler.post(new RunnableC0121D(application, i3, c2118a));
                                throw th7;
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
                activity.recreate();
                return;
            case 19:
                ((C2152m) this.f3725h).f9305m--;
                return;
            case 20:
                C2194k c2194k = (C2194k) this.f3725h;
                Surface surface = c2194k.f9467n;
                if (surface != null) {
                    Iterator it = c2194k.f9460g.iterator();
                    while (it.hasNext()) {
                        ((SurfaceHolderCallbackC0850z) it.next()).f3610g.m1925t0(null);
                    }
                }
                SurfaceTexture surfaceTexture = c2194k.f9466m;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                c2194k.f9466m = null;
                c2194k.f9467n = null;
                return;
            case 21:
                ((C0368e) this.f3725h).getClass();
                return;
            default:
                C2361j c2361j = (C2361j) this.f3725h;
                c2361j.getClass();
                ((C2383h) c2361j.f9918d).m4973e(new C0111d(i4, c2361j));
                return;
        }
    }
}
