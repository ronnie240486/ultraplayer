package p070Y;

import java.io.InputStream;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: Y.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0713j extends InputStream implements AutoCloseable {

    /* JADX INFO: renamed from: g */
    public final InterfaceC0711h f2722g;

    /* JADX INFO: renamed from: h */
    public final C0715l f2723h;

    /* JADX INFO: renamed from: j */
    public boolean f2725j = false;

    /* JADX INFO: renamed from: k */
    public boolean f2726k = false;

    /* JADX INFO: renamed from: i */
    public final byte[] f2724i = new byte[1];

    public C0713j(InterfaceC0711h interfaceC0711h, C0715l c0715l) {
        this.f2722g = interfaceC0711h;
        this.f2723h = c0715l;
    }

    /* JADX INFO: renamed from: a */
    public final void m1835a() {
        if (this.f2725j) {
            return;
        }
        this.f2722g.mo1827a(this.f2723h);
        this.f2725j = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2726k) {
            return;
        }
        this.f2722g.close();
        this.f2726k = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f2724i;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i4) {
        AbstractC0646n.m1630h(!this.f2726k);
        m1835a();
        int iMo345q = this.f2722g.mo345q(bArr, i3, i4);
        if (iMo345q == -1) {
            return -1;
        }
        return iMo345q;
    }
}
