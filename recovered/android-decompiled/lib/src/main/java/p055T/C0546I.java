package p055T;

import java.io.IOException;

/* JADX INFO: renamed from: T.I */
/* JADX INFO: loaded from: classes.dex */
public class C0546I extends IOException {

    /* JADX INFO: renamed from: g */
    public final boolean f1944g;

    /* JADX INFO: renamed from: h */
    public final int f1945h;

    public C0546I(String str, RuntimeException runtimeException, boolean z3, int i3) {
        super(str, runtimeException);
        this.f1944g = z3;
        this.f1945h = i3;
    }

    /* JADX INFO: renamed from: a */
    public static C0546I m1365a(RuntimeException runtimeException, String str) {
        return new C0546I(str, runtimeException, true, 1);
    }

    /* JADX INFO: renamed from: b */
    public static C0546I m1366b(String str) {
        return new C0546I(str, null, true, 4);
    }

    /* JADX INFO: renamed from: c */
    public static C0546I m1367c(String str) {
        return new C0546I(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage() + " {contentIsMalformed=" + this.f1944g + ", dataType=" + this.f1945h + "}";
    }
}
