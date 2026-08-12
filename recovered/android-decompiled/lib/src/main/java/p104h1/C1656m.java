package p104h1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: h1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1656m {

    /* JADX INFO: renamed from: a */
    public Object f7540a;

    /* JADX INFO: renamed from: b */
    public int f7541b;

    /* JADX INFO: renamed from: c */
    public int f7542c;

    /* JADX INFO: renamed from: d */
    public int f7543d;

    public C1656m() {
        int iHighestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f7543d = iHighestOneBit - 1;
        this.f7540a = new int[iHighestOneBit];
    }

    /* JADX INFO: renamed from: a */
    public void m4083a(int i3) {
        int[] iArr = (int[]) this.f7540a;
        int i4 = this.f7542c;
        iArr[i4] = i3;
        int i5 = this.f7543d & (i4 + 1);
        this.f7542c = i5;
        int i6 = this.f7541b;
        if (i5 == i6) {
            int length = iArr.length;
            int i7 = length - i6;
            int i8 = length << 1;
            if (i8 < 0) {
                throw new RuntimeException("Max array capacity exceeded");
            }
            int[] iArr2 = new int[i8];
            System.arraycopy(iArr, i6, iArr2, 0, i7);
            System.arraycopy((int[]) this.f7540a, 0, iArr2, i7, this.f7541b);
            this.f7540a = iArr2;
            this.f7541b = 0;
            this.f7542c = length;
            this.f7543d = i8 - 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m4084b(int i3, int i4) {
        if (i3 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i5 = this.f7543d;
        int i6 = i5 * 2;
        int[] iArr = (int[]) this.f7540a;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f7540a = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i6 >= iArr.length) {
            int[] iArr3 = new int[i5 * 4];
            this.f7540a = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f7540a;
        iArr4[i6] = i3;
        iArr4[i6 + 1] = i4;
        this.f7543d++;
    }

    /* JADX INFO: renamed from: c */
    public void m4085c(RecyclerView recyclerView, boolean z3) {
        this.f7543d = 0;
        int[] iArr = (int[]) this.f7540a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC1621E abstractC1621E = recyclerView.f4768s;
        if (recyclerView.f4766r == null || abstractC1621E == null || !abstractC1621E.f7357h) {
            return;
        }
        if (z3) {
            if (!recyclerView.f4752k.m785h()) {
                abstractC1621E.mo2729h(recyclerView.f4766r.mo2591a(), this);
            }
        } else if (!recyclerView.m2753H()) {
            abstractC1621E.mo2728g(this.f7541b, this.f7542c, recyclerView.f4751j0, this);
        }
        int i3 = this.f7543d;
        if (i3 > abstractC1621E.f7358i) {
            abstractC1621E.f7358i = i3;
            abstractC1621E.f7359j = z3;
            recyclerView.f4748i.m4043m();
        }
    }

    /* JADX INFO: renamed from: d */
    public long m4086d() {
        int i3 = this.f7542c;
        if (i3 == 0) {
            throw new NoSuchElementException();
        }
        int i4 = this.f7541b;
        long j3 = ((long[]) this.f7540a)[i4];
        this.f7541b = (i4 + 1) & this.f7543d;
        this.f7542c = i3 - 1;
        return j3;
    }
}
