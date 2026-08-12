package p019G1;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.TimerTask;
import p028J1.AbstractC0295a;
import p028J1.C0296b;
import p046P1.AbstractC0491s;

/* JADX INFO: renamed from: G1.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0245t extends TimerTask {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f638g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f639h;

    public /* synthetic */ C0245t(int i3, Object obj) {
        this.f638g = i3;
        this.f639h = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        BasePendingResult basePendingResultM749r;
        int i3 = 1;
        Object obj = this.f639h;
        switch (this.f638g) {
            case 0:
                C0246u c0246u = (C0246u) obj;
                C0233h c0233h = c0246u.f644e;
                HashSet hashSet = c0246u.f640a;
                C0296b c0296b = C0233h.f601l;
                c0233h.m771v(hashSet);
                c0246u.f644e.f603b.postDelayed(this, c0246u.f641b);
                break;
            default:
                C0228c c0228c = (C0228c) obj;
                if (!c0228c.f542h.isEmpty() && c0228c.f545k == null && c0228c.f536b != 0) {
                    ArrayDeque arrayDeque = c0228c.f542h;
                    int[] iArrM829f = AbstractC0295a.m829f(arrayDeque);
                    C0233h c0233h2 = c0228c.f537c;
                    c0233h2.getClass();
                    AbstractC0491s.m1210b();
                    if (c0233h2.m772w()) {
                        C0236k c0236k = new C0236k(c0233h2, iArrM829f, 1);
                        C0233h.m750x(c0236k);
                        basePendingResultM749r = c0236k;
                    } else {
                        basePendingResultM749r = C0233h.m749r();
                    }
                    c0228c.f545k = basePendingResultM749r;
                    basePendingResultM749r.m3083J(new C0248w(c0228c, i3));
                    arrayDeque.clear();
                }
                break;
        }
    }
}
