package p000A;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import p091e.C1488s;

/* JADX INFO: renamed from: A.E */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0004E implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a */
    public C0056p0 f6a = null;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f7b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC0059s f8c;

    public ViewOnApplyWindowInsetsListenerC0004E(View view, InterfaceC0059s interfaceC0059s) {
        this.f7b = view;
        this.f8c = interfaceC0059s;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0056p0 c0056p0M316c = C0056p0.m316c(windowInsets, view);
        int i3 = Build.VERSION.SDK_INT;
        InterfaceC0059s interfaceC0059s = this.f8c;
        if (i3 < 30) {
            AbstractC0005F.m8a(windowInsets, this.f7b);
            if (c0056p0M316c.equals(this.f6a)) {
                return ((C1488s) interfaceC0059s).m3719b(view, c0056p0M316c).m317b();
            }
        }
        this.f6a = c0056p0M316c;
        C0056p0 c0056p0M3719b = ((C1488s) interfaceC0059s).m3719b(view, c0056p0M316c);
        if (i3 >= 30) {
            return c0056p0M3719b.m317b();
        }
        AbstractC0003D.m7c(view);
        return c0056p0M3719b.m317b();
    }
}
