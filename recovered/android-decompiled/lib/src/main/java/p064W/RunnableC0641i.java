package p064W;

import android.util.Pair;
import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArraySet;
import p077a0.C0812X;
import p082b0.C1064e;
import p088d0.C1387k;
import p089d1.C1427a0;
import p096f1.InterfaceC1548c;
import p114k0.C1907A;

/* JADX INFO: renamed from: W.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0641i implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2488g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2489h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2490i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f2491j;

    public /* synthetic */ RunnableC0641i(Object obj, int i3, Object obj2, int i4) {
        this.f2488g = i4;
        this.f2490i = obj;
        this.f2489h = i3;
        this.f2491j = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [d0.l, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2488g) {
            case 0:
                for (C0644l c0644l : (CopyOnWriteArraySet) this.f2490i) {
                    if (!c0644l.f2495d) {
                        int i3 = this.f2489h;
                        if (i3 != -1) {
                            c0644l.f2493b.m1184a(i3);
                        }
                        c0644l.f2494c = true;
                        ((InterfaceC0642j) this.f2491j).mo214g(c0644l.f2492a);
                    }
                }
                break;
            case 1:
                C1064e c1064e = ((C0812X) this.f2490i).f3403h.f3422h;
                Pair pair = (Pair) this.f2491j;
                c1064e.mo2038d(((Integer) pair.first).intValue(), (C1907A) pair.second, this.f2489h);
                break;
            case 2:
                C1387k c1387k = (C1387k) this.f2490i;
                int i4 = c1387k.f6182a;
                this.f2491j.mo2038d(i4, c1387k.f6183b, this.f2489h);
                break;
            default:
                ((InterfaceC1548c) ((C1427a0) this.f2490i).f6310c).mo3623k(this.f2489h, (Serializable) this.f2491j);
                break;
        }
    }

    public /* synthetic */ RunnableC0641i(Object obj, Object obj2, int i3, int i4) {
        this.f2488g = i4;
        this.f2490i = obj;
        this.f2491j = obj2;
        this.f2489h = i3;
    }
}
