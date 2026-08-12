package p044P;

import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: P.c */
/* JADX INFO: loaded from: classes.dex */
public class C0451c {

    /* JADX INFO: renamed from: a */
    public final String f1515a;

    /* JADX INFO: renamed from: b */
    public final int f1516b;

    /* JADX INFO: renamed from: c */
    public final int f1517c;

    public C0451c(String str, int i3, int i4) {
        this.f1515a = str;
        this.f1516b = i3;
        this.f1517c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0451c)) {
            return false;
        }
        C0451c c0451c = (C0451c) obj;
        int i3 = this.f1517c;
        String str = this.f1515a;
        int i4 = this.f1516b;
        if (i4 < 0 || c0451c.f1516b < 0) {
            return TextUtils.equals(str, c0451c.f1515a) && i3 == c0451c.f1517c;
        }
        return TextUtils.equals(str, c0451c.f1515a) && i4 == c0451c.f1516b && i3 == c0451c.f1517c;
    }

    public final int hashCode() {
        return Objects.hash(this.f1515a, Integer.valueOf(this.f1517c));
    }
}
