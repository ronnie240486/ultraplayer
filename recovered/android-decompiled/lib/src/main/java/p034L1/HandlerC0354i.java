package p034L1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import p075Z1.HandlerC0784e;
import p079a2.AbstractC0854c;

/* JADX INFO: renamed from: L1.i */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC0354i extends HandlerC0784e {

    /* JADX INFO: renamed from: a */
    public final Context f1144a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0349d f1145b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0354i(C0349d c0349d, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 0);
        this.f1145b = c0349d;
        this.f1144a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i3);
            return;
        }
        int i4 = C0350e.f1133a;
        C0349d c0349d = this.f1145b;
        Context context = this.f1144a;
        int iM958b = c0349d.m958b(context, i4);
        AtomicBoolean atomicBoolean = AbstractC0351f.f1135a;
        if (iM958b == 1 || iM958b == 2 || iM958b == 3 || iM958b == 9) {
            Intent intentM957a = c0349d.m957a(iM958b, context, "n");
            c0349d.m955f(context, iM958b, intentM957a == null ? null : PendingIntent.getActivity(context, 0, intentM957a, AbstractC0854c.f3615a | 134217728));
        }
    }
}
