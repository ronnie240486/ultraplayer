package p125n0;

import p055T.C0559W;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: n0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2041r {

    /* JADX INFO: renamed from: a */
    public final C0559W f8908a;

    /* JADX INFO: renamed from: b */
    public final int[] f8909b;

    public C2041r(C0559W c0559w, int[] iArr) {
        if (iArr.length == 0) {
            AbstractC0646n.m1636n("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f8908a = c0559w;
        this.f8909b = iArr;
    }
}
