package android.support.v4.media.session;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;
import p044P.C0449a;
import p044P.C0450b;

/* JADX INFO: renamed from: android.support.v4.media.session.w */
/* JADX INFO: loaded from: classes.dex */
public class C0887w extends C0886v {
    @Override // android.support.v4.media.session.C0885u
    /* JADX INFO: renamed from: c */
    public final C0449a mo2281c() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.f3702a.getCurrentControllerInfo();
        C0449a c0449a = new C0449a();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        c0449a.f1514a = new C0450b(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return c0449a;
    }

    @Override // android.support.v4.media.session.C0885u
    /* JADX INFO: renamed from: f */
    public final void mo2284f(C0449a c0449a) {
    }
}
