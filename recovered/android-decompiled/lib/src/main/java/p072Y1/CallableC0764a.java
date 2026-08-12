package p072Y1;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: Y1.a */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0764a implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3127a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SharedPreferences f3128b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f3129c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f3130d;

    public /* synthetic */ CallableC0764a(SharedPreferences sharedPreferences, String str, Object obj, int i3) {
        this.f3127a = i3;
        this.f3128b = sharedPreferences;
        this.f3129c = str;
        this.f3130d = obj;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.f3127a) {
            case 0:
                return Boolean.valueOf(this.f3128b.getBoolean(this.f3129c, ((Boolean) this.f3130d).booleanValue()));
            case 1:
                return Integer.valueOf(this.f3128b.getInt(this.f3129c, ((Integer) this.f3130d).intValue()));
            case 2:
                return Long.valueOf(this.f3128b.getLong(this.f3129c, ((Long) this.f3130d).longValue()));
            default:
                return this.f3128b.getString(this.f3129c, (String) this.f3130d);
        }
    }
}
