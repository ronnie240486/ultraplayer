package p135p2;

import java.io.OutputStream;

/* JADX INFO: renamed from: p2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2112b extends OutputStream {

    /* JADX INFO: renamed from: g */
    public long f9142g;

    @Override // java.io.OutputStream
    public final void write(int i3) {
        this.f9142g++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f9142g += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i4) {
        int i5;
        if (i3 >= 0 && i3 <= bArr.length && i4 >= 0 && (i5 = i3 + i4) <= bArr.length && i5 >= 0) {
            this.f9142g += (long) i4;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
