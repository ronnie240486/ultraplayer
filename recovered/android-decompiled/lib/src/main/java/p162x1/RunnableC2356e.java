package p162x1;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;
import p011E.C0111d;
import p077a0.C0848x;
import p138q1.C2174j;
import p166y1.C2383h;
import p166y1.InterfaceC2379d;
import p169z1.C2389a;
import p169z1.InterfaceC2391c;

/* JADX INFO: renamed from: x1.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2356e implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2360i f9892g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2174j f9893h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f9894i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Runnable f9895j;

    public /* synthetic */ RunnableC2356e(C2360i c2360i, C2174j c2174j, int i3, Runnable runnable) {
        this.f9892g = c2360i;
        this.f9893h = c2174j;
        this.f9894i = i3;
        this.f9895j = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2174j c2174j = this.f9893h;
        int i3 = this.f9894i;
        Runnable runnable = this.f9895j;
        C2360i c2360i = this.f9892g;
        InterfaceC2391c interfaceC2391c = c2360i.f9911f;
        try {
            InterfaceC2379d interfaceC2379d = c2360i.f9908c;
            Objects.requireNonNull(interfaceC2379d);
            ((C2383h) interfaceC2391c).m4973e(new C0111d(25, interfaceC2379d));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) c2360i.f9906a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                ((C2383h) interfaceC2391c).m4973e(new C0848x(c2360i, c2174j, i3));
            } else {
                c2360i.m4949a(c2174j, i3);
            }
        } catch (C2389a unused) {
            c2360i.f9909d.m4948a(c2174j, i3 + 1, false);
        } finally {
            runnable.run();
        }
    }
}
