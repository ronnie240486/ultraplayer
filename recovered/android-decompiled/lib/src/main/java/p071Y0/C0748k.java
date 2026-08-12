package p071Y0;

import java.util.Arrays;

/* JADX INFO: renamed from: Y0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0748k {

    /* JADX INFO: renamed from: f */
    public static final byte[] f2934f = {0, 0, 1};

    /* JADX INFO: renamed from: a */
    public boolean f2935a;

    /* JADX INFO: renamed from: b */
    public int f2936b;

    /* JADX INFO: renamed from: c */
    public int f2937c;

    /* JADX INFO: renamed from: d */
    public int f2938d;

    /* JADX INFO: renamed from: e */
    public byte[] f2939e;

    /* JADX INFO: renamed from: a */
    public final void m1860a(byte[] bArr, int i3, int i4) {
        if (this.f2935a) {
            int i5 = i4 - i3;
            byte[] bArr2 = this.f2939e;
            int length = bArr2.length;
            int i6 = this.f2937c + i5;
            if (length < i6) {
                this.f2939e = Arrays.copyOf(bArr2, i6 * 2);
            }
            System.arraycopy(bArr, i3, this.f2939e, this.f2937c, i5);
            this.f2937c += i5;
        }
    }
}
