package p040N1;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import p037M1.InterfaceC0398k;
import p037M1.InterfaceC0399l;
import p045P0.AbstractC0462h;
import p075Z1.HandlerC0784e;

/* JADX INFO: renamed from: N1.d */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC0423d extends HandlerC0784e {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i3 = message.what;
        if (i3 != 1) {
            if (i3 != 2) {
                Log.wtf("BasePendingResult", AbstractC0462h.m1165e(i3, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).m3079F(Status.f5495l);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        try {
            ((InterfaceC0399l) pair.first).mo778a((InterfaceC0398k) pair.second);
        } catch (RuntimeException e3) {
            int i4 = BasePendingResult.f5501E;
            throw e3;
        }
    }
}
