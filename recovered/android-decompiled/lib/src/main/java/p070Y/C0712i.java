package p070Y;

import java.io.IOException;

/* JADX INFO: renamed from: Y.i */
/* JADX INFO: loaded from: classes.dex */
public class C0712i extends IOException {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f2720h = 0;

    /* JADX INFO: renamed from: g */
    public final int f2721g;

    public C0712i(int i3) {
        this.f2721g = i3;
    }

    public C0712i(Exception exc, int i3) {
        super(exc);
        this.f2721g = i3;
    }

    public C0712i(int i3, String str) {
        super(str);
        this.f2721g = i3;
    }

    public C0712i(String str, Exception exc, int i3) {
        super(str, exc);
        this.f2721g = i3;
    }
}
