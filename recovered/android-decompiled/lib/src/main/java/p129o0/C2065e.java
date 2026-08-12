package p129o0;

import java.util.Arrays;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: o0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2065e {

    /* JADX INFO: renamed from: c */
    public int f8966c;

    /* JADX INFO: renamed from: d */
    public int f8967d;

    /* JADX INFO: renamed from: a */
    public final boolean f8964a = true;

    /* JADX INFO: renamed from: b */
    public final int f8965b = 65536;

    /* JADX INFO: renamed from: e */
    public int f8968e = 0;

    /* JADX INFO: renamed from: f */
    public C2061a[] f8969f = new C2061a[100];

    /* JADX INFO: renamed from: a */
    public final synchronized void m4629a(int i3) {
        boolean z3 = i3 < this.f8966c;
        this.f8966c = i3;
        if (z3) {
            m4630b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4630b() {
        int iMax = Math.max(0, AbstractC0632A.m1587f(this.f8966c, this.f8965b) - this.f8967d);
        int i3 = this.f8968e;
        if (iMax >= i3) {
            return;
        }
        Arrays.fill(this.f8969f, iMax, i3, (Object) null);
        this.f8968e = iMax;
    }
}
