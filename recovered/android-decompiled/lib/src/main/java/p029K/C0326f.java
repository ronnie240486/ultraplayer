package p029K;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: K.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0326f extends C0322b {
    public C0326f(byte[] bArr) {
        super(bArr);
        this.f885g.mark(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: b */
    public final void m881b(long j3) throws IOException {
        int i3 = this.f887i;
        if (i3 > j3) {
            this.f887i = 0;
            this.f885g.reset();
        } else {
            j3 -= (long) i3;
        }
        m873a((int) j3);
    }

    public C0326f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f885g.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
