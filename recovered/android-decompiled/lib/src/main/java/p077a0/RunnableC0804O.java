package p077a0;

import android.util.Pair;
import android.view.AttachedSurfaceControl;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;
import androidx.activity.RunnableC0892b;
import androidx.emoji2.text.C0920j;
import androidx.emoji2.text.C0926p;
import androidx.emoji2.text.C0927q;
import androidx.emoji2.text.InterfaceC0918h;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;
import p000A.AbstractC0034e0;
import p000A.C0031d;
import p019G1.AbstractC0230e;
import p046P1.C0475c;
import p055T.C0556T;
import p060U1.AbstractC0610a;
import p060U1.C0611b;
import p064W.AbstractC0646n;
import p082b0.C1063d;
import p082b0.C1064e;
import p083b1.AbstractC1116z;
import p083b1.RunnableC1075D;
import p088d0.C1387k;
import p105h2.AbstractC1676G;
import p105h2.C1673D;
import p105h2.C1692X;
import p114k0.C1907A;
import p114k0.C1911E;
import p130o1.C2080b;
import p138q1.C2172h;
import p138q1.C2174j;
import p142r1.InterfaceC2202g;
import p158w1.C2318a;
import p166y1.C2383h;

/* JADX INFO: renamed from: a0.O */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0804O implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3363g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f3364h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f3365i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f3366j;

    public /* synthetic */ RunnableC0804O(Object obj, Object obj2, Object obj3, int i3) {
        this.f3363g = i3;
        this.f3364h = obj;
        this.f3365i = obj2;
        this.f3366j = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [d0.l, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3363g) {
            case 0:
                C0805P c0805p = (C0805P) this.f3364h;
                c0805p.getClass();
                C1692X c1692xM4112f = ((C1673D) this.f3365i).m4112f();
                C1064e c1064e = c0805p.f3369c;
                C0792C c0792c = c1064e.f4832m;
                c0792c.getClass();
                C0475c c0475c = c1064e.f4829j;
                c0475c.getClass();
                c0475c.f1569b = AbstractC1676G.m4117n(c1692xM4112f);
                if (!c1692xM4112f.isEmpty()) {
                    c0475c.f1572e = (C1907A) c1692xM4112f.get(0);
                    C1907A c1907a = (C1907A) this.f3366j;
                    c1907a.getClass();
                    c0475c.f1573f = c1907a;
                }
                if (((C1907A) c0475c.f1571d) == null) {
                    c0475c.f1571d = C0475c.m1188f(c0792c, (AbstractC1676G) c0475c.f1569b, (C1907A) c0475c.f1572e, (C0556T) c0475c.f1568a);
                }
                c0475c.m1196k(c0792c.mo1324w());
                return;
            case 1:
                C1064e c1064e2 = ((C0812X) this.f3364h).f3403h.f3422h;
                Pair pair = (Pair) this.f3365i;
                c1064e2.mo2036L(((Integer) pair.first).intValue(), (C1907A) pair.second, (Exception) this.f3366j);
                return;
            case 2:
                C0611b c0611b = (C0611b) this.f3364h;
                AbstractC0610a abstractC0610a = (AbstractC0610a) this.f3365i;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f3366j;
                c0611b.getClass();
                try {
                    C0927q c0927qM733k = AbstractC0230e.m733k(c0611b.f2316a);
                    if (c0927qM733k == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C0926p c0926p = (C0926p) ((InterfaceC0918h) c0927qM733k.f4001b);
                    synchronized (c0926p.f4026d) {
                        c0926p.f4028f = threadPoolExecutor;
                        break;
                    }
                    ((InterfaceC0918h) c0927qM733k.f4001b).mo1532a(new C0920j(abstractC0610a, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC0610a.mo1524A(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                C0031d c0031d = (C0031d) this.f3364h;
                c0031d.getClass();
                AttachedSurfaceControl rootSurfaceControl = ((SurfaceView) this.f3365i).getRootSurfaceControl();
                if (rootSurfaceControl == null) {
                    return;
                }
                SurfaceSyncGroup surfaceSyncGroupM2973a = AbstractC1116z.m2973a();
                c0031d.f38h = surfaceSyncGroupM2973a;
                AbstractC0646n.m1630h(surfaceSyncGroupM2973a.add(rootSurfaceControl, new RunnableC1075D(0)));
                ((RunnableC0892b) this.f3366j).run();
                rootSurfaceControl.applyTransactionOnDraw(AbstractC0034e0.m191e());
                return;
            case 4:
                C1387k c1387k = (C1387k) this.f3364h;
                this.f3365i.mo2036L(c1387k.f6182a, c1387k.f6183b, (Exception) this.f3366j);
                return;
            default:
                C2174j c2174j = (C2174j) this.f3365i;
                String str = c2174j.f9391a;
                C2172h c2172h = (C2172h) this.f3366j;
                C2318a c2318a = (C2318a) this.f3364h;
                c2318a.getClass();
                Logger logger = C2318a.f9838f;
                try {
                    InterfaceC2202g interfaceC2202gM4777a = c2318a.f9841c.m4777a(str);
                    if (interfaceC2202gM4777a == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        new IllegalArgumentException(str2);
                    } else {
                        ((C2383h) c2318a.f9843e).m4973e(new C1911E(c2318a, c2174j, ((C2080b) interfaceC2202gM4777a).m4644a(c2172h), 1));
                    }
                    return;
                } catch (Exception e3) {
                    logger.warning("Error scheduling event " + e3.getMessage());
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC0804O(C2318a c2318a, C2174j c2174j, C1063d c1063d, C2172h c2172h) {
        this.f3363g = 5;
        this.f3364h = c2318a;
        this.f3365i = c2174j;
        this.f3366j = c2172h;
    }
}
