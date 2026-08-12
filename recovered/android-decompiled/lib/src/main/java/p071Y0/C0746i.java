package p071Y0;

import java.util.Arrays;

/* JADX INFO: renamed from: Y0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0746i {

    /* JADX INFO: renamed from: e */
    public static final byte[] f2912e = {0, 0, 1};

    /* JADX INFO: renamed from: a */
    public boolean f2913a;

    /* JADX INFO: renamed from: b */
    public int f2914b;

    /* JADX INFO: renamed from: c */
    public int f2915c;

    /* JADX INFO: renamed from: d */
    public byte[] f2916d;

    /* JADX INFO: renamed from: a */
    public final void m1859a(byte[] bArr, int i3, int i4) {
        if (this.f2913a) {
            int i5 = i4 - i3;
            byte[] bArr2 = this.f2916d;
            int length = bArr2.length;
            int i6 = this.f2914b + i5;
            if (length < i6) {
                this.f2916d = Arrays.copyOf(bArr2, i6 * 2);
            }
            System.arraycopy(bArr, i3, this.f2916d, this.f2914b, i5);
            this.f2914b += i5;
        }
    }
}
