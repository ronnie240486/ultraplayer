package p013E1;

import android.os.Handler;
import android.view.View;
import com.google.android.gms.cast.CastDevice;
import java.util.HashMap;
import p019G1.C0233h;
import p028J1.C0318x;
import p091e.C1474e;
import p160x.C2345d;
import p160x.CallableC2344c;

/* JADX INFO: renamed from: E1.F */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0123F implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f176g;

    /* JADX INFO: renamed from: h */
    public Object f177h;

    /* JADX INFO: renamed from: i */
    public Object f178i;

    /* JADX INFO: renamed from: j */
    public Object f179j;

    public /* synthetic */ RunnableC0123F() {
        this.f176g = 3;
    }

    /* JADX INFO: renamed from: a */
    private final void m564a() {
        InterfaceC0131f interfaceC0131f;
        synchronized (((C0318x) this.f179j).f856C) {
            interfaceC0131f = (InterfaceC0131f) ((C0318x) this.f179j).f856C.get((String) this.f177h);
        }
        if (interfaceC0131f != null) {
            ((C0233h) interfaceC0131f).m764n((String) this.f178i);
        } else {
            C0318x.f851S.m831b("Discarded message for unknown namespace '%s'", (String) this.f177h);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall;
        InterfaceC0131f interfaceC0131f;
        switch (this.f176g) {
            case 0:
                BinderC0124G binderC0124G = (BinderC0124G) this.f179j;
                HashMap map = binderC0124G.f180c.f184B;
                String str = (String) this.f177h;
                synchronized (map) {
                    interfaceC0131f = (InterfaceC0131f) binderC0124G.f180c.f184B.get(str);
                    break;
                }
                if (interfaceC0131f == null) {
                    C0125H.f181F.m831b("Discarded message for unknown namespace '%s'", str);
                    return;
                }
                String str2 = (String) this.f178i;
                CastDevice castDevice = binderC0124G.f180c.f204z;
                ((C0233h) interfaceC0131f).m764n(str2);
                return;
            case 1:
                m564a();
                return;
            case 2:
                C1474e.m3701b(((C1474e) this.f178i).f6580e, (View) this.f179j, (View) this.f177h);
                return;
            default:
                try {
                    objCall = ((CallableC2344c) this.f179j).call();
                    break;
                } catch (Exception unused) {
                    objCall = null;
                }
                ((Handler) this.f178i).post(new RunnableC0121D((C2345d) this.f177h, 15, objCall));
                return;
        }
    }

    public /* synthetic */ RunnableC0123F(Object obj, String str, String str2, int i3) {
        this.f176g = i3;
        this.f179j = obj;
        this.f177h = str;
        this.f178i = str2;
    }

    public RunnableC0123F(C1474e c1474e, View view, View view2) {
        this.f176g = 2;
        this.f178i = c1474e;
        this.f179j = view;
        this.f177h = view2;
    }
}
