package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1353y1 extends Throwable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5993g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1353y1(int i3, String str) {
        super(str);
        this.f5993g = i3;
    }

    /* JADX INFO: renamed from: a */
    private final synchronized Throwable m3438a() {
        return this;
    }

    /* JADX INFO: renamed from: b */
    private final synchronized Throwable m3439b() {
        return this;
    }

    /* JADX INFO: renamed from: c */
    private final synchronized Throwable m3440c() {
        return this;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f5993g) {
            case 0:
                m3438a();
                break;
            case 1:
                m3439b();
                break;
            default:
                m3440c();
                break;
        }
        return this;
    }
}
