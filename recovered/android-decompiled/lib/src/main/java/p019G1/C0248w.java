package p019G1;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import p028J1.C0296b;
import p037M1.InterfaceC0398k;
import p037M1.InterfaceC0399l;
import p075Z1.HandlerC0784e;

/* JADX INFO: renamed from: G1.w */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0248w implements InterfaceC0399l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f645a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0228c f646b;

    public /* synthetic */ C0248w(C0228c c0228c, int i3) {
        this.f645a = i3;
        this.f646b = c0228c;
    }

    @Override // p037M1.InterfaceC0399l
    /* JADX INFO: renamed from: a */
    public final void mo778a(InterfaceC0398k interfaceC0398k) {
        C0242q c0242q = (C0242q) interfaceC0398k;
        switch (this.f645a) {
            case 0:
                C0228c c0228c = this.f646b;
                c0228c.getClass();
                Status statusMo774d = c0242q.mo774d();
                int i3 = statusMo774d.f5497g;
                if (i3 != 0) {
                    C0296b c0296b = c0228c.f535a;
                    Log.w(c0296b.f788a, c0296b.m833d("Error fetching queue item ids, statusCode=" + i3 + ", statusMessage=" + statusMo774d.f5498h, new Object[0]));
                }
                c0228c.f546l = null;
                if (!c0228c.f542h.isEmpty()) {
                    HandlerC0784e handlerC0784e = c0228c.f543i;
                    C0245t c0245t = c0228c.f544j;
                    handlerC0784e.removeCallbacks(c0245t);
                    handlerC0784e.postDelayed(c0245t, 500L);
                }
                break;
            default:
                C0228c c0228c2 = this.f646b;
                c0228c2.getClass();
                Status statusMo774d2 = c0242q.mo774d();
                int i4 = statusMo774d2.f5497g;
                if (i4 != 0) {
                    C0296b c0296b2 = c0228c2.f535a;
                    Log.w(c0296b2.f788a, c0296b2.m833d("Error fetching queue items, statusCode=" + i4 + ", statusMessage=" + statusMo774d2.f5498h, new Object[0]));
                }
                c0228c2.f545k = null;
                if (!c0228c2.f542h.isEmpty()) {
                    HandlerC0784e handlerC0784e2 = c0228c2.f543i;
                    C0245t c0245t2 = c0228c2.f544j;
                    handlerC0784e2.removeCallbacks(c0245t2);
                    handlerC0784e2.postDelayed(c0245t2, 500L);
                }
                break;
        }
    }
}
