package p070Y;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p055T.AbstractC0540C;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: Y.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0715l {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f2734h = 0;

    /* JADX INFO: renamed from: a */
    public final Uri f2735a;

    /* JADX INFO: renamed from: b */
    public final int f2736b;

    /* JADX INFO: renamed from: c */
    public final byte[] f2737c;

    /* JADX INFO: renamed from: d */
    public final Map f2738d;

    /* JADX INFO: renamed from: e */
    public final long f2739e;

    /* JADX INFO: renamed from: f */
    public final long f2740f;

    /* JADX INFO: renamed from: g */
    public final int f2741g;

    static {
        AbstractC0540C.m1348a("media3.datasource");
    }

    public C0715l(Uri uri, int i3, byte[] bArr, Map map, long j3, long j4, int i4) {
        AbstractC0646n.m1625c(j3 >= 0);
        AbstractC0646n.m1625c(j3 >= 0);
        AbstractC0646n.m1625c(j4 > 0 || j4 == -1);
        uri.getClass();
        this.f2735a = uri;
        this.f2736b = i3;
        this.f2737c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f2738d = Collections.unmodifiableMap(new HashMap(map));
        this.f2739e = j3;
        this.f2740f = j4;
        this.f2741g = i4;
    }

    /* JADX INFO: renamed from: a */
    public final C0714k m1836a() {
        C0714k c0714k = new C0714k();
        c0714k.f2727a = this.f2735a;
        c0714k.f2728b = this.f2736b;
        c0714k.f2729c = this.f2737c;
        c0714k.f2730d = this.f2738d;
        c0714k.f2731e = this.f2739e;
        c0714k.f2732f = this.f2740f;
        c0714k.f2733g = this.f2741g;
        return c0714k;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i3 = this.f2736b;
        if (i3 == 1) {
            str = "GET";
        } else if (i3 == 2) {
            str = "POST";
        } else {
            if (i3 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f2735a);
        sb.append(", ");
        sb.append(this.f2739e);
        sb.append(", ");
        sb.append(this.f2740f);
        sb.append(", null, ");
        sb.append(this.f2741g);
        sb.append("]");
        return sb.toString();
    }
}
