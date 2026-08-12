package p077a0;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import p045P0.AbstractC0462h;
import p055T.AbstractC0547J;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p114k0.C1907A;

/* JADX INFO: renamed from: a0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0839o extends AbstractC0547J {

    /* JADX INFO: renamed from: i */
    public final int f3565i;

    /* JADX INFO: renamed from: j */
    public final String f3566j;

    /* JADX INFO: renamed from: k */
    public final int f3567k;

    /* JADX INFO: renamed from: l */
    public final C0583o f3568l;

    /* JADX INFO: renamed from: m */
    public final int f3569m;

    /* JADX INFO: renamed from: n */
    public final C1907A f3570n;

    /* JADX INFO: renamed from: o */
    public final boolean f3571o;

    static {
        AbstractC0462h.m1167g(1001, 1002, 1003, 1004, 1005);
        AbstractC0632A.m1566G(1006);
    }

    public C0839o(int i3, Exception exc, int i4) {
        this(i3, exc, i4, null, -1, null, 4, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0839o(String str, Throwable th, int i3, int i4, String str2, int i5, C0583o c0583o, int i6, C1907A c1907a, long j3, boolean z3) {
        super(str, th, i3, j3);
        Bundle bundle = Bundle.EMPTY;
        AbstractC0646n.m1625c(!z3 || i4 == 1);
        AbstractC0646n.m1625c(th != null || i4 == 3);
        this.f3565i = i4;
        this.f3566j = str2;
        this.f3567k = i5;
        this.f3568l = c0583o;
        this.f3569m = i6;
        this.f3570n = c1907a;
        this.f3571o = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0839o(int i3, Exception exc, int i4, String str, int i5, C0583o c0583o, int i6, boolean z3) {
        String str2;
        int i7;
        C0583o c0583o2;
        String string;
        String str3;
        if (i3 == 0) {
            str2 = str;
            i7 = i5;
            c0583o2 = c0583o;
            string = "Source error";
        } else if (i3 != 1) {
            if (i3 != 3) {
                string = "Unexpected runtime error";
            } else {
                string = "Remote error";
            }
            str2 = str;
            i7 = i5;
            c0583o2 = c0583o;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i7 = i5;
            sb.append(i7);
            sb.append(", format=");
            c0583o2 = c0583o;
            sb.append(c0583o2);
            sb.append(", format_supported=");
            int i8 = AbstractC0632A.f2454a;
            if (i6 == 0) {
                str3 = "NO";
            } else if (i6 == 1) {
                str3 = "NO_UNSUPPORTED_TYPE";
            } else if (i6 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i6 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i6 == 4) {
                str3 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb.append(str3);
            string = sb.toString();
        }
        if (!TextUtils.isEmpty(null)) {
            string = string + ": null";
        }
        this(string, exc, i4, i3, str2, i7, c0583o2, i6, null, SystemClock.elapsedRealtime(), z3);
    }
}
