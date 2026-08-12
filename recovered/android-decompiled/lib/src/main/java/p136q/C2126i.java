package p136q;

import android.app.Notification;
import android.support.v4.media.session.C0858A;
import p038N.AbstractC0402b;

/* JADX INFO: renamed from: q.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2126i extends AbstractC0402b {

    /* JADX INFO: renamed from: b */
    public CharSequence f9183b;

    @Override // p038N.AbstractC0402b
    /* JADX INFO: renamed from: Q */
    public final String mo1085Q() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }

    @Override // p038N.AbstractC0402b
    /* JADX INFO: renamed from: a */
    public final void mo1095a(C0858A c0858a) {
        new Notification.BigTextStyle((Notification.Builder) c0858a.f3639h).setBigContentTitle(null).bigText(this.f9183b);
    }
}
