package p045P0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000A.C0041i;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1690V;
import p105h2.C1692X;
import p105h2.C1722p;

/* JADX INFO: renamed from: P0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0456b implements InterfaceC0458d {

    /* JADX INFO: renamed from: i */
    public static final C1722p f1524i = new C1722p(new C0041i(7), C1690V.f7626h);

    /* JADX INFO: renamed from: g */
    public final AbstractC1676G f1525g;

    /* JADX INFO: renamed from: h */
    public final long[] f1526h;

    /* JADX WARN: Code duplicated, block: B:43:0x00f3  */
    public C0456b(C1692X c1692x) {
        int i3 = 0;
        int i4 = c1692x.f7631j;
        if (i4 == 1) {
            C1674E c1674eListIterator = c1692x.listIterator(0);
            Object next = c1674eListIterator.next();
            if (c1674eListIterator.hasNext()) {
                StringBuilder sb = new StringBuilder("expected one element but was: <");
                sb.append(next);
                while (i3 < 4 && c1674eListIterator.hasNext()) {
                    sb.append(", ");
                    sb.append(c1674eListIterator.next());
                    i3++;
                }
                if (c1674eListIterator.hasNext()) {
                    sb.append(", ...");
                }
                sb.append('>');
                throw new IllegalArgumentException(sb.toString());
            }
            C0455a c0455a = (C0455a) next;
            long j3 = c0455a.f1521b;
            long j4 = j3 == -9223372036854775807L ? 0L : j3;
            AbstractC1676G abstractC1676G = c0455a.f1520a;
            long j5 = c0455a.f1522c;
            if (j5 == -9223372036854775807L) {
                this.f1525g = AbstractC1676G.m4120r(abstractC1676G);
                this.f1526h = new long[]{j4};
                return;
            } else {
                C1674E c1674e = AbstractC1676G.f7601h;
                this.f1525g = AbstractC1676G.m4121s(abstractC1676G, C1692X.f7629k);
                this.f1526h = new long[]{j4, j5 + j4};
                return;
            }
        }
        long[] jArr = new long[i4 * 2];
        this.f1526h = jArr;
        Arrays.fill(jArr, Long.MAX_VALUE);
        ArrayList arrayList = new ArrayList();
        C1692X c1692xM4122t = AbstractC1676G.m4122t(f1524i, c1692x);
        int i5 = 0;
        while (i3 < c1692xM4122t.f7631j) {
            C0455a c0455a2 = (C0455a) c1692xM4122t.get(i3);
            long j6 = c0455a2.f1521b;
            j6 = j6 == -9223372036854775807L ? 0L : j6;
            long j7 = c0455a2.f1522c;
            long j8 = j6 + j7;
            AbstractC1676G abstractC1676G2 = c0455a2.f1520a;
            if (i5 != 0) {
                int i6 = i5 - 1;
                long j9 = this.f1526h[i6];
                if (j9 < j6) {
                    this.f1526h[i5] = j6;
                    arrayList.add(abstractC1676G2);
                    i5++;
                } else if (j9 == j6 && ((AbstractC1676G) arrayList.get(i6)).isEmpty()) {
                    arrayList.set(i6, abstractC1676G2);
                } else {
                    AbstractC0646n.m1647y("CuesWithTimingSubtitle", "Truncating unsupported overlapping cues.");
                    this.f1526h[i6] = j6;
                    arrayList.set(i6, abstractC1676G2);
                }
            } else {
                this.f1526h[i5] = j6;
                arrayList.add(abstractC1676G2);
                i5++;
            }
            if (j7 != -9223372036854775807L) {
                this.f1526h[i5] = j8;
                arrayList.add(C1692X.f7629k);
                i5++;
            }
            i3++;
        }
        this.f1525g = AbstractC1676G.m4117n(arrayList);
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: d */
    public final int mo156d(long j3) {
        int iM1582a = AbstractC0632A.m1582a(this.f1526h, j3, false);
        if (iM1582a < this.f1525g.size()) {
            return iM1582a;
        }
        return -1;
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: g */
    public final List mo159g(long j3) {
        int iM1586e = AbstractC0632A.m1586e(this.f1526h, j3, false);
        if (iM1586e != -1) {
            return (AbstractC1676G) this.f1525g.get(iM1586e);
        }
        C1674E c1674e = AbstractC1676G.f7601h;
        return C1692X.f7629k;
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: k */
    public final long mo163k(int i3) {
        AbstractC0646n.m1625c(i3 < this.f1525g.size());
        return this.f1526h[i3];
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: n */
    public final int mo166n() {
        return this.f1525g.size();
    }
}
