package p089d1;

import android.os.Bundle;
import java.util.ArrayList;
import p045P0.C0455a;
import p064W.AbstractC0646n;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1723q;
import p105h2.C1674E;
import p105h2.C1692X;
import p121m0.InterfaceC1999a;

/* JADX INFO: renamed from: d1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1450w implements InterfaceC1999a {

    /* JADX INFO: renamed from: a */
    public ArrayList f6415a;

    @Override // p121m0.InterfaceC1999a
    /* JADX INFO: renamed from: a */
    public AbstractC1676G mo3632a(long j3) {
        int iM3638g = m3638g(j3);
        if (iM3638g == 0) {
            C1674E c1674e = AbstractC1676G.f7601h;
            return C1692X.f7629k;
        }
        C0455a c0455a = (C0455a) this.f6415a.get(iM3638g - 1);
        long j4 = c0455a.f1523d;
        if (j4 == -9223372036854775807L || j3 < j4) {
            return c0455a.f1520a;
        }
        C1674E c1674e2 = AbstractC1676G.f7601h;
        return C1692X.f7629k;
    }

    @Override // p121m0.InterfaceC1999a
    /* JADX INFO: renamed from: b */
    public long mo3633b(long j3) {
        ArrayList arrayList = this.f6415a;
        if (arrayList.isEmpty() || j3 < ((C0455a) arrayList.get(0)).f1521b) {
            return -9223372036854775807L;
        }
        for (int i3 = 1; i3 < arrayList.size(); i3++) {
            long j4 = ((C0455a) arrayList.get(i3)).f1521b;
            if (j3 == j4) {
                return j4;
            }
            if (j3 < j4) {
                C0455a c0455a = (C0455a) arrayList.get(i3 - 1);
                long j5 = c0455a.f1523d;
                return (j5 == -9223372036854775807L || j5 > j3) ? c0455a.f1521b : j5;
            }
        }
        C0455a c0455a2 = (C0455a) AbstractC1723q.m4158g(arrayList);
        long j6 = c0455a2.f1523d;
        return (j6 == -9223372036854775807L || j3 < j6) ? c0455a2.f1521b : j6;
    }

    @Override // p121m0.InterfaceC1999a
    /* JADX INFO: renamed from: c */
    public long mo3634c(long j3) {
        ArrayList arrayList = this.f6415a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j3 < ((C0455a) arrayList.get(0)).f1521b) {
            return ((C0455a) arrayList.get(0)).f1521b;
        }
        for (int i3 = 1; i3 < arrayList.size(); i3++) {
            C0455a c0455a = (C0455a) arrayList.get(i3);
            if (j3 < c0455a.f1521b) {
                long j4 = ((C0455a) arrayList.get(i3 - 1)).f1523d;
                long j5 = c0455a.f1521b;
                return (j4 == -9223372036854775807L || j4 <= j3 || j4 >= j5) ? j5 : j4;
            }
        }
        long j6 = ((C0455a) AbstractC1723q.m4158g(arrayList)).f1523d;
        if (j6 == -9223372036854775807L || j3 >= j6) {
            return Long.MIN_VALUE;
        }
        return j6;
    }

    @Override // p121m0.InterfaceC1999a
    public void clear() {
        this.f6415a.clear();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0023  */
    @Override // p121m0.InterfaceC1999a
    /* JADX INFO: renamed from: d */
    public boolean mo3635d(C0455a c0455a, long j3) {
        boolean z3;
        long j4 = c0455a.f1521b;
        AbstractC0646n.m1625c(j4 != -9223372036854775807L);
        if (j4 <= j3) {
            long j5 = c0455a.f1523d;
            if (j5 == -9223372036854775807L || j3 < j5) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        ArrayList arrayList = this.f6415a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j4 >= ((C0455a) arrayList.get(size)).f1521b) {
                arrayList.add(size + 1, c0455a);
                return z3;
            }
            if (((C0455a) arrayList.get(size)).f1521b <= j3) {
                z3 = false;
            }
        }
        arrayList.add(0, c0455a);
        return z3;
    }

    @Override // p121m0.InterfaceC1999a
    /* JADX INFO: renamed from: e */
    public void mo3636e(long j3) {
        int iM3638g = m3638g(j3);
        if (iM3638g == 0) {
            return;
        }
        ArrayList arrayList = this.f6415a;
        long j4 = ((C0455a) arrayList.get(iM3638g - 1)).f1523d;
        if (j4 == -9223372036854775807L || j4 >= j3) {
            iM3638g--;
        }
        arrayList.subList(0, iM3638g).clear();
    }

    /* JADX INFO: renamed from: f */
    public C1451x m3637f() {
        if (this.f6415a == null) {
            return C1451x.f6416c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.f6415a);
        return new C1451x(bundle, this.f6415a);
    }

    /* JADX INFO: renamed from: g */
    public int m3638g(long j3) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f6415a;
            if (i3 >= arrayList.size()) {
                return arrayList.size();
            }
            if (j3 < ((C0455a) arrayList.get(i3)).f1521b) {
                return i3;
            }
            i3++;
        }
    }
}
