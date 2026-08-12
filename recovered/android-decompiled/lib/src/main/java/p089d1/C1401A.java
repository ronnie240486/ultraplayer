package p089d1;

import android.os.Message;
import androidx.activity.RunnableC0892b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import p128o.C2059j;
import p168z.C2388b;

/* JADX INFO: renamed from: d1.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1401A {

    /* JADX INFO: renamed from: a */
    public final AbstractC1448u f6201a;

    /* JADX INFO: renamed from: b */
    public final int f6202b;

    /* JADX INFO: renamed from: c */
    public final C1403C f6203c;

    /* JADX INFO: renamed from: d */
    public final C1403C f6204d;

    /* JADX INFO: renamed from: e */
    public final C1403C f6205e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f6206f;

    /* JADX INFO: renamed from: g */
    public final WeakReference f6207g;

    /* JADX INFO: renamed from: h */
    public C2059j f6208h = null;

    /* JADX INFO: renamed from: i */
    public boolean f6209i = false;

    /* JADX INFO: renamed from: j */
    public boolean f6210j = false;

    public C1401A(C1433f c1433f, C1403C c1403c, AbstractC1448u abstractC1448u, int i3, C1403C c1403c2, ArrayList arrayList) {
        this.f6207g = new WeakReference(c1433f);
        this.f6204d = c1403c;
        this.f6201a = abstractC1448u;
        this.f6202b = i3;
        this.f6203c = c1433f.f6333d;
        this.f6205e = c1403c2;
        this.f6206f = arrayList != null ? new ArrayList(arrayList) : null;
        c1433f.f6330a.postDelayed(new RunnableC0892b(15, this), 15000L);
    }

    /* JADX INFO: renamed from: a */
    public final void m3488a() {
        if (this.f6209i || this.f6210j) {
            return;
        }
        this.f6210j = true;
        AbstractC1448u abstractC1448u = this.f6201a;
        if (abstractC1448u != null) {
            abstractC1448u.mo3554h(0);
            abstractC1448u.mo3551d();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3489b() {
        C2059j c2059j;
        C1405E.m3510b();
        if (this.f6209i || this.f6210j) {
            return;
        }
        WeakReference weakReference = this.f6207g;
        C1433f c1433f = (C1433f) weakReference.get();
        if (c1433f == null || c1433f.f6336g != this || ((c2059j = this.f6208h) != null && c2059j.isCancelled())) {
            m3488a();
            return;
        }
        this.f6209i = true;
        c1433f.f6336g = null;
        C1433f c1433f2 = (C1433f) weakReference.get();
        int i3 = this.f6202b;
        C1403C c1403c = this.f6203c;
        if (c1433f2 != null && c1433f2.f6333d == c1403c) {
            Message messageObtainMessage = c1433f2.f6330a.obtainMessage(263, c1403c);
            messageObtainMessage.arg1 = i3;
            messageObtainMessage.sendToTarget();
            AbstractC1448u abstractC1448u = c1433f2.f6334e;
            if (abstractC1448u != null) {
                abstractC1448u.mo3554h(i3);
                c1433f2.f6334e.mo3551d();
            }
            HashMap map = c1433f2.f6331b;
            if (!map.isEmpty()) {
                for (AbstractC1448u abstractC1448u2 : map.values()) {
                    abstractC1448u2.mo3554h(i3);
                    abstractC1448u2.mo3551d();
                }
                map.clear();
            }
            c1433f2.f6334e = null;
        }
        C1433f c1433f3 = (C1433f) weakReference.get();
        if (c1433f3 == null) {
            return;
        }
        C1403C c1403c2 = this.f6204d;
        c1433f3.f6333d = c1403c2;
        c1433f3.f6334e = this.f6201a;
        HandlerC1430c handlerC1430c = c1433f3.f6330a;
        C1403C c1403c3 = this.f6205e;
        if (c1403c3 == null) {
            Message messageObtainMessage2 = handlerC1430c.obtainMessage(262, new C2388b(c1403c, c1403c2));
            messageObtainMessage2.arg1 = i3;
            messageObtainMessage2.sendToTarget();
        } else {
            Message messageObtainMessage3 = handlerC1430c.obtainMessage(264, new C2388b(c1403c3, c1403c2));
            messageObtainMessage3.arg1 = i3;
            messageObtainMessage3.sendToTarget();
        }
        c1433f3.f6331b.clear();
        c1433f3.m3579g();
        c1433f3.m3584l();
        ArrayList arrayList = this.f6206f;
        if (arrayList != null) {
            c1433f3.f6333d.m3504n(arrayList);
        }
    }
}
