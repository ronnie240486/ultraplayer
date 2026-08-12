package p114k0;

import java.io.IOException;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: k0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1942f extends IOException {
    public C1942f(int i3) {
        this(i3, -9223372036854775807L, -9223372036854775807L);
    }

    public C1942f(int i3, long j3, long j4) {
        String str;
        StringBuilder sb = new StringBuilder("Illegal clipping: ");
        if (i3 != 0) {
            if (i3 == 1) {
                str = "not seekable to start";
            } else if (i3 != 2) {
                str = "unknown";
            } else {
                AbstractC0646n.m1630h((j3 == -9223372036854775807L || j4 == -9223372036854775807L) ? false : true);
                str = "start exceeds end. Start time: " + j3 + ", End time: " + j4;
            }
        } else {
            str = "invalid period count";
        }
        sb.append(str);
        super(sb.toString());
    }
}
