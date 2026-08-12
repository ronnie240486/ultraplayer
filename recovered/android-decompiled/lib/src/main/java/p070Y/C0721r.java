package p070Y;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: Y.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0721r extends AbstractC0706c {

    /* JADX INFO: renamed from: k */
    public RandomAccessFile f2768k;

    /* JADX INFO: renamed from: l */
    public Uri f2769l;

    /* JADX INFO: renamed from: m */
    public long f2770m;

    /* JADX INFO: renamed from: n */
    public boolean f2771n;

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: a */
    public final long mo1827a(C0715l c0715l) throws C0720q {
        Uri uri = c0715l.f2735a;
        long j3 = c0715l.f2739e;
        this.f2769l = uri;
        m1832l();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f2768k = randomAccessFile;
            try {
                randomAccessFile.seek(j3);
                long length = c0715l.f2740f;
                if (length == -1) {
                    length = this.f2768k.length() - j3;
                }
                this.f2770m = length;
                if (length < 0) {
                    throw new C0720q(null, null, 2008);
                }
                this.f2771n = true;
                m1834p(c0715l);
                return this.f2770m;
            } catch (IOException e3) {
                throw new C0720q(e3, 2000);
            }
        } catch (FileNotFoundException e4) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C0720q(e4, ((e4.getCause() instanceof ErrnoException) && ((ErrnoException) e4.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            throw new C0720q("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e4, 1004);
        } catch (SecurityException e5) {
            throw new C0720q(e5, 2006);
        } catch (RuntimeException e6) {
            throw new C0720q(e6, 2000);
        }
    }

    @Override // p070Y.InterfaceC0711h
    public final void close() {
        this.f2769l = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f2768k;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f2768k = null;
                if (this.f2771n) {
                    this.f2771n = false;
                    m1831k();
                }
            } catch (IOException e3) {
                throw new C0720q(e3, 2000);
            }
        } catch (Throwable th) {
            this.f2768k = null;
            if (this.f2771n) {
                this.f2771n = false;
                m1831k();
            }
            throw th;
        }
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: h */
    public final Uri mo1828h() {
        return this.f2769l;
    }

    @Override // p055T.InterfaceC0575g
    /* JADX INFO: renamed from: q */
    public final int mo345q(byte[] bArr, int i3, int i4) throws C0720q {
        if (i4 == 0) {
            return 0;
        }
        long j3 = this.f2770m;
        if (j3 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f2768k;
            int i5 = AbstractC0632A.f2454a;
            int i6 = randomAccessFile.read(bArr, i3, (int) Math.min(j3, i4));
            if (i6 > 0) {
                this.f2770m -= (long) i6;
                m1829b(i6);
            }
            return i6;
        } catch (IOException e3) {
            throw new C0720q(e3, 2000);
        }
    }
}
