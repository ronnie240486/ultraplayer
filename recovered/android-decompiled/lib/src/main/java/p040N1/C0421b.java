package p040N1;

import java.util.Arrays;
import p009D0.C0106b;
import p037M1.InterfaceC0389b;
import p046P1.AbstractC0491s;

/* JADX INFO: renamed from: N1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0421b {

    /* JADX INFO: renamed from: a */
    public final int f1432a;

    /* JADX INFO: renamed from: b */
    public final C0106b f1433b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0389b f1434c;

    /* JADX INFO: renamed from: d */
    public final String f1435d;

    public C0421b(C0106b c0106b, InterfaceC0389b interfaceC0389b, String str) {
        this.f1433b = c0106b;
        this.f1434c = interfaceC0389b;
        this.f1435d = str;
        this.f1432a = Arrays.hashCode(new Object[]{c0106b, interfaceC0389b, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0421b)) {
            return false;
        }
        C0421b c0421b = (C0421b) obj;
        return AbstractC0491s.m1216h(this.f1433b, c0421b.f1433b) && AbstractC0491s.m1216h(this.f1434c, c0421b.f1434c) && AbstractC0491s.m1216h(this.f1435d, c0421b.f1435d);
    }

    public final int hashCode() {
        return this.f1432a;
    }
}
