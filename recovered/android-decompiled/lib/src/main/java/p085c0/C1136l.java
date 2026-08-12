package p085c0;

import p055T.C0583o;

/* JADX INFO: renamed from: c0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1136l extends Exception {

    /* JADX INFO: renamed from: g */
    public final int f5261g;

    /* JADX INFO: renamed from: h */
    public final boolean f5262h;

    public C1136l(int i3, int i4, int i5, int i6, C0583o c0583o, boolean z3, RuntimeException runtimeException) {
        StringBuilder sb = new StringBuilder("AudioTrack init failed ");
        sb.append(i3);
        sb.append(" Config(");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append(", ");
        sb.append(i6);
        sb.append(") ");
        sb.append(c0583o);
        sb.append(z3 ? " (recoverable)" : "");
        super(sb.toString(), runtimeException);
        this.f5261g = i3;
        this.f5262h = z3;
    }
}
