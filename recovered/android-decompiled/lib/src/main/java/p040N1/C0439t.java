package p040N1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import p009D0.C0106b;

/* JADX INFO: renamed from: N1.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0439t extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public Context f1489a;

    /* JADX INFO: renamed from: b */
    public final C0106b f1490b;

    public C0439t(C0106b c0106b) {
        this.f1490b = c0106b;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            Object obj = this.f1490b.f141i;
            throw null;
        }
    }
}
