package p034L1;

import java.util.Arrays;

/* JADX INFO: renamed from: L1.l */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0357l extends AbstractBinderC0356k {

    /* JADX INFO: renamed from: d */
    public final byte[] f1150d;

    public BinderC0357l(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f1150d = bArr;
    }

    @Override // p034L1.AbstractBinderC0356k
    /* JADX INFO: renamed from: w0 */
    public final byte[] mo998w0() {
        return this.f1150d;
    }
}
