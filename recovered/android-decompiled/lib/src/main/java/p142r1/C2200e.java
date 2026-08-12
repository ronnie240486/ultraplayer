package p142r1;

import android.content.Context;
import p034L1.C0352g;
import p150t1.C2277c;
import p150t1.InterfaceC2276b;
import p166y1.C2385j;

/* JADX INFO: renamed from: r1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2200e implements InterfaceC2276b {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9486g;

    /* JADX INFO: renamed from: h */
    public final C2277c f9487h;

    public /* synthetic */ C2200e(C2277c c2277c, int i3) {
        this.f9486g = i3;
        this.f9487h = c2277c;
    }

    @Override // p139q2.InterfaceC2180a
    public final Object get() {
        switch (this.f9486g) {
            case 0:
                return new C2199d((Context) this.f9487h.f9746g, new C0352g(2), new C0352g(1));
            case 1:
                String packageName = ((Context) this.f9487h.f9746g).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new C2385j(Integer.valueOf(C2385j.f9977j).intValue(), (Context) this.f9487h.f9746g, "com.google.android.datatransport.events");
        }
    }
}
