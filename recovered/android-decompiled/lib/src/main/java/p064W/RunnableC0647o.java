package p064W;

import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.webkit.CookieManager;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.zuxoplayer.app.PlayerActivity;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import p000A.C0031d;
import p011E.C0111d;
import p036M0.C0368e;
import p055T.AbstractC0558V;
import p055T.C0556T;
import p055T.C0574f0;
import p055T.C0583o;
import p071Y0.C0760w;
import p077a0.C0791B;
import p077a0.C0792C;
import p077a0.C0797H;
import p077a0.C0818b0;
import p077a0.C0824e0;
import p077a0.C0828g0;
import p077a0.C0829h;
import p077a0.C0839o;
import p077a0.C0849y;
import p077a0.SurfaceHolderCallbackC0850z;
import p082b0.C1060a;
import p082b0.C1062c;
import p082b0.C1064e;
import p083b1.C1076E;
import p085c0.C1120B;
import p085c0.C1133i;
import p085c0.C1134j;
import p085c0.RunnableC1131g;
import p088d0.C1381e;
import p088d0.C1382f;
import p091e.ExecutorC1484o;
import p091e.RunnableC1481l;
import p092e0.C1505j;
import p092e0.C1506k;
import p092e0.C1512q;
import p095f0.C1530c;
import p096f1.AbstractC1552g;
import p114k0.C1907A;
import p114k0.C1923Q;
import p129o0.C2066f;
import p141r0.C2194k;
import p145s0.InterfaceC2252y;

/* JADX INFO: renamed from: W.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0647o implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2506g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f2507h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2508i;

    public /* synthetic */ RunnableC0647o(Object obj, int i3, Object obj2) {
        this.f2506g = i3;
        this.f2507h = obj;
        this.f2508i = obj2;
    }

    /* JADX INFO: renamed from: a */
    private final void m1649a() {
        C1133i c1133i = (C1133i) this.f2507h;
        C0829h c0829h = (C0829h) this.f2508i;
        c1133i.getClass();
        synchronized (c0829h) {
        }
        SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z = c1133i.f5253c;
        int i3 = AbstractC0632A.f2454a;
        C1064e c1064e = surfaceHolderCallbackC0850z.f3610g.f3257r;
        c1064e.m2836R(c1064e.m2833O((C1907A) c1064e.f4829j.f1572e), 1013, new C1062c(3));
    }

    /* JADX INFO: renamed from: b */
    private final void m1650b() {
        C1133i c1133i = (C1133i) this.f2507h;
        C0829h c0829h = (C0829h) this.f2508i;
        c1133i.getClass();
        synchronized (c0829h) {
        }
        SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z = c1133i.f5253c;
        int i3 = AbstractC0632A.f2454a;
        C1064e c1064e = surfaceHolderCallbackC0850z.f3610g.f3257r;
        C1060a c1060aM2833O = c1064e.m2833O((C1907A) c1064e.f4829j.f1572e);
        c1064e.m2836R(c1060aM2833O, 1020, new C0111d(c1060aM2833O, (Object) c0829h, 14));
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j3;
        boolean z3;
        boolean z4 = true;
        z4 = true;
        switch (this.f2506g) {
            case 0:
                ((C2066f) this.f2508i).m4631a(((C0650r) this.f2507h).m1654d());
                return;
            case 1:
                C0792C c0792c = (C0792C) this.f2507h;
                C0760w c0760w = (C0760w) this.f2508i;
                int i3 = c0792c.f3214H - c0760w.f3098c;
                c0792c.f3214H = i3;
                if (c0760w.f3099d) {
                    c0792c.f3215I = c0760w.f3100e;
                    c0792c.f3216J = true;
                }
                if (i3 == 0) {
                    AbstractC0558V abstractC0558V = ((C0818b0) c0760w.f3101f).f3431a;
                    if (!c0792c.f3243f0.f3431a.m1415p() && abstractC0558V.m1415p()) {
                        c0792c.f3245g0 = -1;
                        c0792c.f3247h0 = 0L;
                    }
                    if (!abstractC0558V.m1415p()) {
                        List listAsList = Arrays.asList(((C0828g0) abstractC0558V).f3501h);
                        AbstractC0646n.m1630h(listAsList.size() == c0792c.f3254o.size());
                        for (int i4 = 0; i4 < listAsList.size(); i4++) {
                            ((C0791B) c0792c.f3254o.get(i4)).f3206b = (AbstractC0558V) listAsList.get(i4);
                        }
                    }
                    long j4 = -9223372036854775807L;
                    if (c0792c.f3216J) {
                        if (((C0818b0) c0760w.f3101f).f3432b.equals(c0792c.f3243f0.f3432b) && ((C0818b0) c0760w.f3101f).f3434d == c0792c.f3243f0.f3449s) {
                            z4 = false;
                        }
                        if (z4) {
                            if (abstractC0558V.m1415p() || ((C0818b0) c0760w.f3101f).f3432b.m4422b()) {
                                j4 = ((C0818b0) c0760w.f3101f).f3434d;
                            } else {
                                C0818b0 c0818b0 = (C0818b0) c0760w.f3101f;
                                C1907A c1907a = c0818b0.f3432b;
                                long j5 = c0818b0.f3434d;
                                Object obj = c1907a.f8311a;
                                C0556T c0556t = c0792c.f3253n;
                                abstractC0558V.mo1410g(obj, c0556t);
                                j4 = j5 + c0556t.f1970e;
                            }
                        }
                        j3 = j4;
                        z3 = z4;
                    } else {
                        j3 = -9223372036854775807L;
                        z3 = false;
                    }
                    c0792c.f3216J = false;
                    c0792c.m1929x0((C0818b0) c0760w.f3101f, 1, z3, c0792c.f3215I, j3, -1, false);
                    return;
                }
                return;
            case 2:
                C0824e0 c0824e0 = (C0824e0) this.f2508i;
                ((C0797H) this.f2507h).getClass();
                try {
                    synchronized (c0824e0) {
                    }
                    try {
                        c0824e0.f3458a.mo1903c(c0824e0.f3461d, c0824e0.f3462e);
                        return;
                    } finally {
                        c0824e0.m2072b(true);
                    }
                } catch (C0839o e3) {
                    AbstractC0646n.m1636n("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e3);
                    throw new RuntimeException(e3);
                }
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                C1076E.m2906a((C1076E) this.f2507h, (Bitmap) this.f2508i);
                return;
            case 4:
                m1649a();
                return;
            case 5:
                C1134j c1134j = (C1134j) this.f2508i;
                C1133i c1133i = ((C1120B) ((C0031d) this.f2507h).f38h).f5180J0;
                Handler handler = c1133i.f5252b;
                if (handler != null) {
                    handler.post(new RunnableC1131g(c1133i, c1134j, 2));
                    return;
                }
                return;
            case 6:
                String str = (String) this.f2507h;
                String str2 = (String) this.f2508i;
                int i5 = PlayerActivity.f6018C0;
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setConnectTimeout(8000);
                    httpURLConnection.setReadTimeout(8000);
                    httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                    httpURLConnection.setRequestProperty("User-Agent", "ZuxoPlayer/2.7");
                    String cookie = CookieManager.getInstance().getCookie(str);
                    if (cookie != null) {
                        httpURLConnection.setRequestProperty("Cookie", cookie);
                    }
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(str2.getBytes("UTF-8"));
                    outputStream.close();
                    Log.d("HDXNativePlayer", "progresso POST " + httpURLConnection.getResponseCode() + " -> " + str);
                    httpURLConnection.disconnect();
                    return;
                } catch (Throwable th) {
                    Log.e("HDXNativePlayer", "progresso falhou: " + th);
                    return;
                }
            case 7:
                C1381e c1381e = (C1381e) this.f2507h;
                C1382f c1382f = c1381e.f6153j;
                if (c1382f.f6167p == 0 || c1381e.f6152i) {
                    return;
                }
                Looper looper = c1382f.f6171t;
                looper.getClass();
                c1381e.f6151h = c1382f.m3478c(looper, c1381e.f6150g, (C0583o) this.f2508i, false);
                c1382f.f6165n.add(c1381e);
                return;
            case 8:
                Runnable runnable = (Runnable) this.f2508i;
                ExecutorC1484o executorC1484o = (ExecutorC1484o) this.f2507h;
                executorC1484o.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC1484o.m3716a();
                }
            case 9:
                ((C1530c) ((C1506k) ((C1512q) this.f2507h).f6799i.f6406h).f6721h.f6906j.get(((C1505j) this.f2508i).f6703m)).m3827c(true);
                return;
            case 10:
                C1530c c1530c = (C1530c) this.f2507h;
                c1530c.f6898o = false;
                c1530c.m3828d((Uri) this.f2508i);
                return;
            case 11:
                ((ProfileInstallerInitializer) this.f2507h).getClass();
                (Build.VERSION.SDK_INT >= 28 ? AbstractC1552g.m3871a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC1481l((Context) this.f2508i, z4 ? 1 : 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 12:
                ((InterfaceC0636d) this.f2507h).mo545b(this.f2508i);
                return;
            case 13:
                ((C1923Q) this.f2507h).m4445D((InterfaceC2252y) this.f2508i);
                return;
            case 14:
                C1133i c1133i2 = (C1133i) this.f2507h;
                c1133i2.getClass();
                int i6 = AbstractC0632A.f2454a;
                C0792C c0792c2 = c1133i2.f5253c.f3610g;
                C0574f0 c0574f0 = (C0574f0) this.f2508i;
                c0792c2.f3239d0 = c0574f0;
                c0792c2.f3251l.m1621f(25, new C0849y(c0574f0));
                return;
            case 15:
                m1650b();
                return;
            case 16:
                C2194k c2194k = (C2194k) this.f2507h;
                SurfaceTexture surfaceTexture = c2194k.f9466m;
                Surface surface = c2194k.f9467n;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) this.f2508i;
                Surface surface2 = new Surface(surfaceTexture2);
                c2194k.f9466m = surfaceTexture2;
                c2194k.f9467n = surface2;
                Iterator it = c2194k.f9460g.iterator();
                while (it.hasNext()) {
                    ((SurfaceHolderCallbackC0850z) it.next()).f3610g.m1925t0(surface2);
                }
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 17:
                ((C0368e) this.f2507h).m1013e((Typeface) this.f2508i);
                return;
            default:
                int i7 = JobInfoSchedulerService.f5405g;
                ((JobInfoSchedulerService) this.f2507h).jobFinished((JobParameters) this.f2508i, false);
                return;
        }
    }
}
