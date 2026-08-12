package p107i0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import p004B0.C0098a;
import p009D0.C0106b;
import p011E.C0111d;
import p045P0.AbstractC0462h;
import p055T.C0541D;
import p055T.C0542E;
import p055T.C0544G;
import p055T.C0583o;
import p055T.InterfaceC0543F;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0645m;
import p077a0.AbstractC0827g;
import p077a0.C0792C;
import p077a0.SurfaceHolderCallbackC0850z;
import p114k0.C1907A;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: i0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1747b extends AbstractC0827g implements Handler.Callback {

    /* JADX INFO: renamed from: A */
    public final C0098a f7791A;

    /* JADX INFO: renamed from: B */
    public AbstractC2003a f7792B;

    /* JADX INFO: renamed from: C */
    public boolean f7793C;

    /* JADX INFO: renamed from: D */
    public boolean f7794D;

    /* JADX INFO: renamed from: E */
    public long f7795E;

    /* JADX INFO: renamed from: F */
    public C0544G f7796F;

    /* JADX INFO: renamed from: G */
    public long f7797G;

    /* JADX INFO: renamed from: x */
    public final C1746a f7798x;

    /* JADX INFO: renamed from: y */
    public final SurfaceHolderCallbackC0850z f7799y;

    /* JADX INFO: renamed from: z */
    public final Handler f7800z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1747b(SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z, Looper looper) {
        super(5);
        C1746a c1746a = C1746a.f7790a;
        this.f7799y = surfaceHolderCallbackC0850z;
        this.f7800z = looper == null ? null : new Handler(looper, this);
        this.f7798x = c1746a;
        this.f7791A = new C0098a(1);
        this.f7797G = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX INFO: renamed from: B */
    public final void m4201B(C0544G c0544g, ArrayList arrayList) {
        int i3 = 0;
        while (true) {
            InterfaceC0543F[] interfaceC0543FArr = c0544g.f1940g;
            if (i3 >= interfaceC0543FArr.length) {
                return;
            }
            C0583o c0583oMo498b = interfaceC0543FArr[i3].mo498b();
            if (c0583oMo498b != null) {
                C1746a c1746a = this.f7798x;
                if (c1746a.m4200b(c0583oMo498b)) {
                    AbstractC2003a abstractC2003aM4199a = c1746a.m4199a(c0583oMo498b);
                    byte[] bArrMo497a = interfaceC0543FArr[i3].mo497a();
                    bArrMo497a.getClass();
                    C0098a c0098a = this.f7791A;
                    c0098a.mo1883e();
                    c0098a.m1885h(bArrMo497a.length);
                    c0098a.f3144k.put(bArrMo497a);
                    c0098a.m1886i();
                    C0544G c0544gM4552h = abstractC2003aM4199a.m4552h(c0098a);
                    if (c0544gM4552h != null) {
                        m4201B(c0544gM4552h, arrayList);
                    }
                } else {
                    arrayList.add(interfaceC0543FArr[i3]);
                }
            } else {
                arrayList.add(interfaceC0543FArr[i3]);
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: C */
    public final long m4202C(long j3) {
        AbstractC0646n.m1630h(j3 != -9223372036854775807L);
        AbstractC0646n.m1630h(this.f7797G != -9223372036854775807L);
        return j3 - this.f7797G;
    }

    /* JADX INFO: renamed from: D */
    public final void m4203D(C0544G c0544g) {
        SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z = this.f7799y;
        C0792C c0792c = surfaceHolderCallbackC0850z.f3610g;
        C0541D c0541dM1350a = c0792c.f3241e0.m1350a();
        int i3 = 0;
        while (true) {
            InterfaceC0543F[] interfaceC0543FArr = c0544g.f1940g;
            if (i3 >= interfaceC0543FArr.length) {
                break;
            }
            interfaceC0543FArr[i3].mo499c(c0541dM1350a);
            i3++;
        }
        c0792c.f3241e0 = new C0542E(c0541dM1350a);
        C0542E c0542eM1908b0 = c0792c.m1908b0();
        boolean zEquals = c0542eM1908b0.equals(c0792c.f3219M);
        C0645m c0645m = c0792c.f3251l;
        if (!zEquals) {
            c0792c.f3219M = c0542eM1908b0;
            c0645m.m1618c(14, new C0111d(9, surfaceHolderCallbackC0850z));
        }
        c0645m.m1618c(28, new C0111d(10, c0544g));
        c0645m.m1617b();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        m4203D((C0544G) message.obj);
        return true;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: i */
    public final String mo2082i() {
        return "MetadataRenderer";
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: k */
    public final boolean mo2084k() {
        return this.f7794D;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: l */
    public final boolean mo2085l() {
        return true;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: m */
    public final void mo2086m() {
        this.f7796F = null;
        this.f7792B = null;
        this.f7797G = -9223372036854775807L;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: o */
    public final void mo2088o(long j3, boolean z3) {
        this.f7796F = null;
        this.f7793C = false;
        this.f7794D = false;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: t */
    public final void mo2093t(C0583o[] c0583oArr, long j3, long j4, C1907A c1907a) {
        this.f7792B = this.f7798x.m4199a(c0583oArr[0]);
        C0544G c0544g = this.f7796F;
        if (c0544g != null) {
            long j5 = this.f7797G;
            long j6 = c0544g.f1941h;
            long j7 = (j5 + j6) - j4;
            if (j6 != j7) {
                c0544g = new C0544G(j7, c0544g.f1940g);
            }
            this.f7796F = c0544g;
        }
        this.f7797G = j4;
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: v */
    public final void mo2095v(long j3, long j4) {
        boolean z3 = true;
        while (z3) {
            if (!this.f7793C && this.f7796F == null) {
                C0098a c0098a = this.f7791A;
                c0098a.mo1883e();
                C0106b c0106b = this.f3479i;
                c0106b.m526n();
                int iM2094u = m2094u(c0106b, c0098a, 0);
                if (iM2094u == -4) {
                    if (c0098a.m1787c(4)) {
                        this.f7793C = true;
                    } else if (c0098a.f3146m >= this.f3488r) {
                        c0098a.f124p = this.f7795E;
                        c0098a.m1886i();
                        AbstractC2003a abstractC2003a = this.f7792B;
                        int i3 = AbstractC0632A.f2454a;
                        C0544G c0544gM4552h = abstractC2003a.m4552h(c0098a);
                        if (c0544gM4552h != null) {
                            ArrayList arrayList = new ArrayList(c0544gM4552h.f1940g.length);
                            m4201B(c0544gM4552h, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f7796F = new C0544G(m4202C(c0098a.f3146m), (InterfaceC0543F[]) arrayList.toArray(new InterfaceC0543F[0]));
                            }
                        }
                    }
                } else if (iM2094u == -5) {
                    C0583o c0583o = (C0583o) c0106b.f141i;
                    c0583o.getClass();
                    this.f7795E = c0583o.f2159s;
                }
            }
            C0544G c0544g = this.f7796F;
            if (c0544g == null || c0544g.f1941h > m4202C(j3)) {
                z3 = false;
            } else {
                C0544G c0544g2 = this.f7796F;
                Handler handler = this.f7800z;
                if (handler != null) {
                    handler.obtainMessage(1, c0544g2).sendToTarget();
                } else {
                    m4203D(c0544g2);
                }
                this.f7796F = null;
                z3 = true;
            }
            if (this.f7793C && this.f7796F == null) {
                this.f7794D = true;
            }
        }
    }

    @Override // p077a0.AbstractC0827g
    /* JADX INFO: renamed from: z */
    public final int mo2099z(C0583o c0583o) {
        if (this.f7798x.m4200b(c0583o)) {
            return AbstractC0462h.m1162b(c0583o.f2139L == 0 ? 4 : 2, 0, 0, 0);
        }
        return AbstractC0462h.m1162b(0, 0, 0, 0);
    }
}
