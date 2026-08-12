package p109i2;

import java.io.OutputStream;
import p019G1.AbstractC0230e;

/* JADX INFO: renamed from: i2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1753a extends OutputStream {
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i3) {
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        bArr.getClass();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i3, int i4) {
        bArr.getClass();
        AbstractC0230e.m732j(i3, i4 + i3, bArr.length);
    }
}
