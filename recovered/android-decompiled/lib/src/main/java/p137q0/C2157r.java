package p137q0;

import android.hardware.display.DisplayManager;

/* JADX INFO: renamed from: q0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2157r implements DisplayManager.DisplayListener {

    /* JADX INFO: renamed from: a */
    public final DisplayManager f9320a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2159t f9321b;

    public C2157r(C2159t c2159t, DisplayManager displayManager) {
        this.f9321b = c2159t;
        this.f9320a = displayManager;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i3) {
        if (i3 == 0) {
            C2159t.m4752a(this.f9321b, this.f9320a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i3) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i3) {
    }
}
