package p039N0;

import p009D0.C0106b;
import p064W.C0651s;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2242o;

/* JADX INFO: renamed from: N0.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0413i {

    /* JADX INFO: renamed from: b */
    public InterfaceC2226E f1395b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2242o f1396c;

    /* JADX INFO: renamed from: d */
    public InterfaceC0411g f1397d;

    /* JADX INFO: renamed from: e */
    public long f1398e;

    /* JADX INFO: renamed from: f */
    public long f1399f;

    /* JADX INFO: renamed from: g */
    public long f1400g;

    /* JADX INFO: renamed from: h */
    public int f1401h;

    /* JADX INFO: renamed from: i */
    public int f1402i;

    /* JADX INFO: renamed from: k */
    public long f1404k;

    /* JADX INFO: renamed from: l */
    public boolean f1405l;

    /* JADX INFO: renamed from: m */
    public boolean f1406m;

    /* JADX INFO: renamed from: a */
    public final C0409e f1394a = new C0409e(0);

    /* JADX INFO: renamed from: j */
    public C0106b f1403j = new C0106b(6, false);

    /* JADX INFO: renamed from: a */
    public void mo1109a(long j3) {
        this.f1400g = j3;
    }

    /* JADX INFO: renamed from: b */
    public abstract long mo1100b(C0651s c0651s);

    /* JADX INFO: renamed from: c */
    public abstract boolean mo1101c(C0651s c0651s, long j3, C0106b c0106b);

    /* JADX INFO: renamed from: d */
    public void mo1102d(boolean z3) {
        if (z3) {
            this.f1403j = new C0106b(6, false);
            this.f1399f = 0L;
            this.f1401h = 0;
        } else {
            this.f1401h = 1;
        }
        this.f1398e = -1L;
        this.f1400g = 0L;
    }
}
