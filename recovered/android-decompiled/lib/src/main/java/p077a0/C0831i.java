package p077a0;

import android.text.TextUtils;
import p055T.C0583o;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: a0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0831i {

    /* JADX INFO: renamed from: a */
    public final String f3519a;

    /* JADX INFO: renamed from: b */
    public final C0583o f3520b;

    /* JADX INFO: renamed from: c */
    public final C0583o f3521c;

    /* JADX INFO: renamed from: d */
    public final int f3522d;

    /* JADX INFO: renamed from: e */
    public final int f3523e;

    public C0831i(String str, C0583o c0583o, C0583o c0583o2, int i3, int i4) {
        AbstractC0646n.m1625c(i3 == 0 || i4 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f3519a = str;
        c0583o.getClass();
        this.f3520b = c0583o;
        c0583o2.getClass();
        this.f3521c = c0583o2;
        this.f3522d = i3;
        this.f3523e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0831i.class == obj.getClass()) {
            C0831i c0831i = (C0831i) obj;
            if (this.f3522d == c0831i.f3522d && this.f3523e == c0831i.f3523e && this.f3519a.equals(c0831i.f3519a) && this.f3520b.equals(c0831i.f3520b) && this.f3521c.equals(c0831i.f3521c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3521c.hashCode() + ((this.f3520b.hashCode() + ((this.f3519a.hashCode() + ((((527 + this.f3522d) * 31) + this.f3523e) * 31)) * 31)) * 31);
    }
}
