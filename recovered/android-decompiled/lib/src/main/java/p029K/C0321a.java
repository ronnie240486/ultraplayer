package p029K;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: K.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0321a extends MediaDataSource implements AutoCloseable {

    /* JADX INFO: renamed from: g */
    public long f881g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0326f f882h;

    public C0321a(C0326f c0326f) {
        this.f882h = c0326f;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j3, byte[] bArr, int i3, int i4) {
        if (i4 == 0) {
            return 0;
        }
        if (j3 < 0) {
            return -1;
        }
        try {
            long j4 = this.f881g;
            if (j4 != j3) {
                if (j4 >= 0 && j3 >= j4 + ((long) this.f882h.f885g.available())) {
                    return -1;
                }
                this.f882h.m881b(j3);
                this.f881g = j3;
            }
            if (i4 > this.f882h.f885g.available()) {
                i4 = this.f882h.f885g.available();
            }
            int i5 = this.f882h.read(bArr, i3, i4);
            if (i5 >= 0) {
                this.f881g += (long) i5;
                return i5;
            }
        } catch (IOException unused) {
        }
        this.f881g = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
