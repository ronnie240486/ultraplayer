package p047Q;

import android.app.Notification;
import android.os.Build;
import android.support.v4.media.session.C0858A;
import android.support.v4.media.session.MediaSessionCompat$Token;
import p038N.AbstractC0402b;

/* JADX INFO: renamed from: Q.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0501c extends AbstractC0402b {

    /* JADX INFO: renamed from: b */
    public int[] f1656b;

    /* JADX INFO: renamed from: c */
    public MediaSessionCompat$Token f1657c;

    @Override // p038N.AbstractC0402b
    /* JADX INFO: renamed from: a */
    public final void mo1095a(C0858A c0858a) {
        int i3 = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) c0858a.f3639h;
        if (i3 >= 34) {
            AbstractC0499a.m1221d(builder, AbstractC0499a.m1219b(AbstractC0500b.m1223a(AbstractC0499a.m1218a(), null, 0, null, Boolean.FALSE), this.f1656b, this.f1657c));
        } else {
            AbstractC0499a.m1221d(builder, AbstractC0499a.m1219b(AbstractC0499a.m1218a(), this.f1656b, this.f1657c));
        }
    }
}
