package p114k0;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: renamed from: k0.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1937c0 {

    /* JADX INFO: renamed from: a */
    public final Random f8485a;

    /* JADX INFO: renamed from: b */
    public final int[] f8486b;

    /* JADX INFO: renamed from: c */
    public final int[] f8487c;

    public C1937c0() {
        this(new Random());
    }

    /* JADX INFO: renamed from: a */
    public final C1937c0 m4495a(int i3) {
        Random random;
        int[] iArr;
        int[] iArr2 = new int[i3];
        int[] iArr3 = new int[i3];
        int i4 = 0;
        while (true) {
            random = this.f8485a;
            iArr = this.f8486b;
            if (i4 >= i3) {
                break;
            }
            iArr2[i4] = random.nextInt(iArr.length + 1);
            int i5 = i4 + 1;
            int iNextInt = random.nextInt(i5);
            iArr3[i4] = iArr3[iNextInt];
            iArr3[iNextInt] = i4;
            i4 = i5;
        }
        Arrays.sort(iArr2);
        int[] iArr4 = new int[iArr.length + i3];
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < iArr.length + i3; i8++) {
            if (i6 >= i3 || i7 != iArr2[i6]) {
                int i9 = i7 + 1;
                int i10 = iArr[i7];
                iArr4[i8] = i10;
                if (i10 >= 0) {
                    iArr4[i8] = i10 + i3;
                }
                i7 = i9;
            } else {
                iArr4[i8] = iArr3[i6];
                i6++;
            }
        }
        return new C1937c0(iArr4, new Random(random.nextLong()));
    }

    public C1937c0(int[] iArr, Random random) {
        this.f8486b = iArr;
        this.f8485a = random;
        this.f8487c = new int[iArr.length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            this.f8487c[iArr[i3]] = i3;
        }
    }

    public C1937c0(Random random) {
        this(new int[0], random);
    }
}
