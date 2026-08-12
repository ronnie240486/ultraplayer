package p157w;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: renamed from: w.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2312f {

    /* JADX INFO: renamed from: b */
    public static final C2312f f9831b = m4933a(new Locale[0]);

    /* JADX INFO: renamed from: a */
    public final InterfaceC2314h f9832a;

    public C2312f(InterfaceC2314h interfaceC2314h) {
        this.f9832a = interfaceC2314h;
    }

    /* JADX INFO: renamed from: a */
    public static C2312f m4933a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new C2312f(new C2316j(AbstractC2311e.m4930a(localeArr))) : new C2312f(new C2313g(localeArr));
    }

    /* JADX INFO: renamed from: b */
    public static C2312f m4934b(String str) {
        if (str == null || str.isEmpty()) {
            return f9831b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i3 = 0; i3 < length; i3++) {
            localeArr[i3] = AbstractC2310d.m4928a(strArrSplit[i3]);
        }
        return m4933a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2312f) {
            return this.f9832a.equals(((C2312f) obj).f9832a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9832a.hashCode();
    }

    public final String toString() {
        return this.f9832a.toString();
    }
}
