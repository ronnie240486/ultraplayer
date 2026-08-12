package p115k2;

import java.util.Arrays;

/* JADX INFO: renamed from: k2.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1969c {

    /* JADX INFO: renamed from: a */
    public static final byte[] f8597a;

    static {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i3 = 0; i3 < 10; i3++) {
            bArr[i3 + 48] = (byte) i3;
        }
        for (int i4 = 0; i4 < 26; i4++) {
            byte b3 = (byte) (i4 + 10);
            bArr[i4 + 65] = b3;
            bArr[i4 + 97] = b3;
        }
        f8597a = bArr;
    }
}
