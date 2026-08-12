package p064W;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: renamed from: W.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0654v {

    /* JADX INFO: renamed from: a */
    public Message f2527a;

    /* JADX INFO: renamed from: a */
    public final void m1694a() {
        this.f2527a = null;
        ArrayList arrayList = C0655w.f2528b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1695b() {
        Message message = this.f2527a;
        message.getClass();
        message.sendToTarget();
        m1694a();
    }
}
