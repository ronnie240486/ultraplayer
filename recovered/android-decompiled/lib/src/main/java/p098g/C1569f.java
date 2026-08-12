package p098g;

import android.graphics.drawable.Drawable;
import p118l1.C1978d;

/* JADX INFO: renamed from: g.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1569f implements Drawable.Callback {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7126g = 0;

    /* JADX INFO: renamed from: h */
    public Object f7127h;

    public /* synthetic */ C1569f() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f7126g) {
            case 0:
                break;
            default:
                ((C1978d) this.f7127h).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        switch (this.f7126g) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f7127h;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j3);
                }
                break;
            default:
                ((C1978d) this.f7127h).scheduleSelf(runnable, j3);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f7126g) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f7127h;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
            default:
                ((C1978d) this.f7127h).unscheduleSelf(runnable);
                break;
        }
    }

    public C1569f(C1978d c1978d) {
        this.f7127h = c1978d;
    }

    /* JADX INFO: renamed from: a */
    private final void m3900a(Drawable drawable) {
    }
}
