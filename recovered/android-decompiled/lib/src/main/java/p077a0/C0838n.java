package p077a0;

import android.os.Handler;
import android.support.v4.media.session.C0858A;
import com.zuxoplayer.app.C1375o;
import com.zuxoplayer.app.PlayerActivity;
import java.util.ArrayList;
import p009D0.C0106b;
import p040N1.C0437r;
import p058U.InterfaceC0604d;
import p064W.AbstractC0646n;
import p085c0.C1119A;
import p085c0.C1120B;
import p085c0.C1126b;
import p085c0.C1150z;
import p099g0.C1578h;
import p099g0.InterfaceC1573c;
import p107i0.C1747b;
import p121m0.C2002d;
import p137q0.C2144e;
import p141r0.C2185b;

/* JADX INFO: renamed from: a0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0838n {

    /* JADX INFO: renamed from: a */
    public final PlayerActivity f3563a;

    /* JADX INFO: renamed from: b */
    public final C1375o f3564b;

    public C0838n(PlayerActivity playerActivity) {
        this.f3563a = playerActivity;
        this.f3564b = new C1375o(playerActivity);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC0827g[] m2110a(Handler handler, SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z, SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z2, SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z3, SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z4) {
        ArrayList arrayList = new ArrayList();
        C1375o c1375o = this.f3564b;
        PlayerActivity playerActivity = this.f3563a;
        arrayList.add(new C2144e(playerActivity, c1375o, handler, surfaceHolderCallbackC0850z));
        C0437r c0437r = new C0437r();
        c0437r.f1484b = playerActivity;
        C1126b c1126b = C1126b.f5224c;
        c0437r.f1486d = C1119A.f5177a;
        c0437r.f1487e = C1119A.f5178b;
        AbstractC0646n.m1630h(!c0437r.f1483a);
        c0437r.f1483a = true;
        if (((C0858A) c0437r.f1485c) == null) {
            c0437r.f1485c = new C0858A(new InterfaceC0604d[0]);
        }
        if (((C0106b) c0437r.f1488f) == null) {
            c0437r.f1488f = new C0106b(28, playerActivity);
        }
        arrayList.add(new C1120B(playerActivity, c1375o, handler, surfaceHolderCallbackC0850z2, new C1150z(c0437r)));
        arrayList.add(new C2002d(surfaceHolderCallbackC0850z3, handler.getLooper()));
        arrayList.add(new C1747b(surfaceHolderCallbackC0850z4, handler.getLooper()));
        arrayList.add(new C2185b());
        arrayList.add(new C1578h(InterfaceC1573c.f7158b));
        return (AbstractC0827g[]) arrayList.toArray(new AbstractC0827g[0]);
    }
}
