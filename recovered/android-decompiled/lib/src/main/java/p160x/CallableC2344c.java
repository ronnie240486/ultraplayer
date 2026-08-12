package p160x;

import android.content.Context;
import java.util.concurrent.Callable;
import p022H1.C0258b;

/* JADX INFO: renamed from: x.c */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2344c implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9847a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f9848b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f9849c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0258b f9850d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f9851e;

    public /* synthetic */ CallableC2344c(String str, Context context, C0258b c0258b, int i3, int i4) {
        this.f9847a = i4;
        this.f9848b = str;
        this.f9849c = context;
        this.f9850d = c0258b;
        this.f9851e = i3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f9847a) {
            case 0:
                return AbstractC2347f.m4946a(this.f9848b, this.f9849c, this.f9850d, this.f9851e);
            default:
                try {
                    return AbstractC2347f.m4946a(this.f9848b, this.f9849c, this.f9850d, this.f9851e);
                } catch (Throwable unused) {
                    return new C2346e(-3);
                }
        }
    }
}
