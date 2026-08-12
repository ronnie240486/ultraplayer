package p010D1;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: D1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0107a {

    /* JADX INFO: renamed from: c */
    public static final ReentrantLock f142c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public static C0107a f143d;

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f144a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f145b;

    public C0107a(Context context) {
        this.f145b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* JADX INFO: renamed from: a */
    public final String m539a(String str) {
        ReentrantLock reentrantLock = this.f144a;
        reentrantLock.lock();
        try {
            return this.f145b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
