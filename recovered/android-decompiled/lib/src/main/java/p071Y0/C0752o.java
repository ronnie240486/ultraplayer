package p071Y0;

import android.util.SparseArray;
import p048Q0.C0508g;
import p145s0.InterfaceC2226E;

/* JADX INFO: renamed from: Y0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0752o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2226E f2976a;

    /* JADX INFO: renamed from: b */
    public final boolean f2977b;

    /* JADX INFO: renamed from: c */
    public final boolean f2978c;

    /* JADX INFO: renamed from: f */
    public final C0508g f2981f;

    /* JADX INFO: renamed from: g */
    public byte[] f2982g;

    /* JADX INFO: renamed from: h */
    public int f2983h;

    /* JADX INFO: renamed from: i */
    public int f2984i;

    /* JADX INFO: renamed from: j */
    public long f2985j;

    /* JADX INFO: renamed from: l */
    public long f2987l;

    /* JADX INFO: renamed from: p */
    public long f2991p;

    /* JADX INFO: renamed from: q */
    public long f2992q;

    /* JADX INFO: renamed from: r */
    public boolean f2993r;

    /* JADX INFO: renamed from: s */
    public boolean f2994s;

    /* JADX INFO: renamed from: d */
    public final SparseArray f2979d = new SparseArray();

    /* JADX INFO: renamed from: e */
    public final SparseArray f2980e = new SparseArray();

    /* JADX INFO: renamed from: m */
    public C0751n f2988m = new C0751n();

    /* JADX INFO: renamed from: n */
    public C0751n f2989n = new C0751n();

    /* JADX INFO: renamed from: k */
    public boolean f2986k = false;

    /* JADX INFO: renamed from: o */
    public boolean f2990o = false;

    public C0752o(InterfaceC2226E interfaceC2226E, boolean z3, boolean z4) {
        this.f2976a = interfaceC2226E;
        this.f2977b = z3;
        this.f2978c = z4;
        byte[] bArr = new byte[128];
        this.f2982g = bArr;
        this.f2981f = new C0508g(bArr, 0, 0);
        C0751n c0751n = this.f2989n;
        c0751n.f2961b = false;
        c0751n.f2960a = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m1863a() {
        boolean z3;
        int i3;
        boolean z4 = false;
        if (this.f2977b) {
            C0751n c0751n = this.f2989n;
            z3 = c0751n.f2961b && ((i3 = c0751n.f2964e) == 7 || i3 == 2);
        } else {
            z3 = this.f2994s;
        }
        boolean z5 = this.f2993r;
        int i4 = this.f2984i;
        if (i4 == 5 || (z3 && i4 == 1)) {
            z4 = true;
        }
        this.f2993r = z5 | z4;
    }
}
