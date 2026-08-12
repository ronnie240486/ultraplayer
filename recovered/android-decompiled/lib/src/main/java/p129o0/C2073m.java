package p129o0;

import java.io.IOException;

/* JADX INFO: renamed from: o0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2073m extends IOException {
    public C2073m(Throwable th) {
        String str;
        StringBuilder sb = new StringBuilder("Unexpected ");
        sb.append(th.getClass().getSimpleName());
        if (th.getMessage() != null) {
            str = ": " + th.getMessage();
        } else {
            str = "";
        }
        sb.append(str);
        super(sb.toString(), th);
    }
}
