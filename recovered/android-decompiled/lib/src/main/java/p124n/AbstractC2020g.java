package p124n;

/* JADX INFO: renamed from: n.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2020g {

    /* JADX INFO: renamed from: a */
    public static final int[] f8778a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final Object[] f8779b = new Object[0];

    /* JADX INFO: renamed from: a */
    public static int m4577a(int i3, int i4, int[] iArr) {
        int i5 = i3 - 1;
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) >>> 1;
            int i8 = iArr[i7];
            if (i8 < i4) {
                i6 = i7 + 1;
            } else {
                if (i8 <= i4) {
                    return i7;
                }
                i5 = i7 - 1;
            }
        }
        return ~i6;
    }

    /* JADX INFO: renamed from: b */
    public static int m4578b(long[] jArr, int i3, long j3) {
        int i4 = i3 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            long j4 = jArr[i6];
            if (j4 < j3) {
                i5 = i6 + 1;
            } else {
                if (j4 <= j3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }
}
