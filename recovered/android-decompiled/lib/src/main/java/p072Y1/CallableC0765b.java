package p072Y1;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: Y1.b */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0765b implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f3131a;

    public CallableC0765b(Context context) {
        this.f3131a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return this.f3131a.getSharedPreferences("google_sdk_flags", 0);
    }
}
