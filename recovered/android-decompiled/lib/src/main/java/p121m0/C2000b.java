package p121m0;

import java.util.ArrayList;
import p045P0.C0455a;
import p064W.AbstractC0646n;
import p082b0.C1063d;
import p105h2.AbstractC1676G;
import p105h2.C1673D;
import p105h2.C1674E;
import p105h2.C1690V;
import p105h2.C1692X;
import p105h2.C1722p;
import p105h2.C1732z;

/* JADX INFO: renamed from: m0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2000b implements InterfaceC1999a {

    /* JADX INFO: renamed from: b */
    public static final C1732z f8714b = new C1732z(new C1722p(new C1063d(17), C1690V.f7626h), new C1722p(new C1063d(18), C1690V.f7627i));

    /* JADX INFO: renamed from: a */
    public final ArrayList f8715a = new ArrayList();

    @Override // p121m0.InterfaceC1999a
    /* JADX INFO: renamed from: a */
    public final AbstractC1676G mo3632a(long j3) {
        ArrayList arrayList = this.f8715a;
        if (!arrayList.isEmpty()) {
            if (j3 >= ((C0455a) arrayList.get(0)).f1521b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    C0455a c0455a = (C0455a) arrayList.get(i3);
                    if (j3 >= c0455a.f1521b && j3 < c0455a.f1523d) {
                        arrayList2.add(c0455a);
                    }
                    if (j3 < c0455a.f1521b) {
                        break;
                    }
                }
                C1692X c1692xM4122t = AbstractC1676G.m4122t(f8714b, arrayList2);
                C1673D c1673dM4116m = AbstractC1676G.m4116m();
                for (int i4 = 0; i4 < c1692xM4122t.f7631j; i4++) {
                    c1673dM4116m.m4104c(((C0455a) c1692xM4122t.get(i4)).f1520a);
                }
                return c1673dM4116m.m4112f();
            }
        }
        C1674E c1674e = AbstractC1676G.f7601h;
        return C1692X.f7629k;
    }

    @Override // p121m0.InterfaceC1999a
    /* JADX INFO: renamed from: b */
    public final long mo3633b(long j3) {
        ArrayList arrayList = this.f8715a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j3 < ((C0455a) arrayList.get(0)).f1521b) {
            return -9223372036854775807L;
        }
        long jMax = ((C0455a) arrayList.get(0)).f1521b;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            long j4 = ((C0455a) arrayList.get(i3)).f1521b;
            long j5 = ((C0455a) arrayList.get(i3)).f1523d;
            if (j5 > j3) {
                if (j4 > j3) {
                    break;
                }
                jMax = Math.max(jMax, j4);
            } else {
                jMax = Math.max(jMax, j5);
            }
        }
        return jMax;
    }

    @Override // p121m0.InterfaceC1999a
    /* JADX INFO: renamed from: c */
    public final long mo3634c(long j3) {
        int i3 = 0;
        long jMin = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.f8715a;
            if (i3 >= arrayList.size()) {
                break;
            }
            long j4 = ((C0455a) arrayList.get(i3)).f1521b;
            long j5 = ((C0455a) arrayList.get(i3)).f1523d;
            if (j3 < j4) {
                if (jMin != -9223372036854775807L) {
                    jMin = Math.min(jMin, j4);
                    break;
                }
                jMin = j4;
                break;
            }
            if (j3 < j5) {
                jMin = jMin == -9223372036854775807L ? j5 : Math.min(jMin, j5);
            }
            i3++;
        }
        if (jMin != -9223372036854775807L) {
            return jMin;
        }
        return Long.MIN_VALUE;
    }

    @Override // p121m0.InterfaceC1999a
    public final void clear() {
        this.f8715a.clear();
    }

    @Override // p121m0.InterfaceC1999a
    /* JADX INFO: renamed from: d */
    public final boolean mo3635d(C0455a c0455a, long j3) {
        long j4 = c0455a.f1521b;
        AbstractC0646n.m1625c(j4 != -9223372036854775807L);
        AbstractC0646n.m1625c(c0455a.f1522c != -9223372036854775807L);
        boolean z3 = j4 <= j3 && j3 < c0455a.f1523d;
        ArrayList arrayList = this.f8715a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j4 >= ((C0455a) arrayList.get(size)).f1521b) {
                arrayList.add(size + 1, c0455a);
                return z3;
            }
        }
        arrayList.add(0, c0455a);
        return z3;
    }

    @Override // p121m0.InterfaceC1999a
    /* JADX INFO: renamed from: e */
    public final void mo3636e(long j3) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f8715a;
            if (i3 >= arrayList.size()) {
                return;
            }
            long j4 = ((C0455a) arrayList.get(i3)).f1521b;
            if (j3 > j4 && j3 > ((C0455a) arrayList.get(i3)).f1523d) {
                arrayList.remove(i3);
                i3--;
            } else if (j3 < j4) {
                return;
            }
            i3++;
        }
    }
}
