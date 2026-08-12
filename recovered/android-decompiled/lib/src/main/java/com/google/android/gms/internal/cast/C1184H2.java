package com.google.android.gms.internal.cast;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.H2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1184H2 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1230T1 f5635a;

    /* JADX INFO: renamed from: b */
    public final String f5636b;

    /* JADX INFO: renamed from: c */
    public final Object[] f5637c;

    /* JADX INFO: renamed from: d */
    public final int f5638d;

    public C1184H2(AbstractC1230T1 abstractC1230T1, String str, Object[] objArr) {
        this.f5635a = abstractC1230T1;
        this.f5636b = str;
        this.f5637c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f5638d = cCharAt;
            return;
        }
        int i3 = cCharAt & 8191;
        int i4 = 13;
        int i5 = 1;
        while (true) {
            int i6 = i5 + 1;
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 < 55296) {
                this.f5638d = i3 | (cCharAt2 << i4);
                return;
            } else {
                i3 |= (cCharAt2 & 8191) << i4;
                i4 += 13;
                i5 = i6;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m3145a() {
        int i3 = this.f5638d;
        if ((i3 & 1) != 0) {
            return 1;
        }
        return (i3 & 4) == 4 ? 3 : 2;
    }
}
