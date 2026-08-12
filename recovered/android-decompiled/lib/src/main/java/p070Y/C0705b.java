package p070Y;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: Y.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0705b extends AbstractC0706c {

    /* JADX INFO: renamed from: k */
    public final AssetManager f2701k;

    /* JADX INFO: renamed from: l */
    public Uri f2702l;

    /* JADX INFO: renamed from: m */
    public InputStream f2703m;

    /* JADX INFO: renamed from: n */
    public long f2704n;

    /* JADX INFO: renamed from: o */
    public boolean f2705o;

    public C0705b(Context context) {
        super(false);
        this.f2701k = context.getAssets();
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: a */
    public final long mo1827a(C0715l c0715l) throws C0704a {
        try {
            Uri uri = c0715l.f2735a;
            long j3 = c0715l.f2739e;
            this.f2702l = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            m1832l();
            InputStream inputStreamOpen = this.f2701k.open(path, 1);
            this.f2703m = inputStreamOpen;
            if (inputStreamOpen.skip(j3) < j3) {
                throw new C0704a(null, 2008);
            }
            long j4 = c0715l.f2740f;
            if (j4 != -1) {
                this.f2704n = j4;
            } else {
                long jAvailable = this.f2703m.available();
                this.f2704n = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f2704n = -1L;
                }
            }
            this.f2705o = true;
            m1834p(c0715l);
            return this.f2704n;
        } catch (C0704a e3) {
            throw e3;
        } catch (IOException e4) {
            throw new C0704a(e4, e4 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // p070Y.InterfaceC0711h
    public final void close() {
        this.f2702l = null;
        try {
            try {
                InputStream inputStream = this.f2703m;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f2703m = null;
                if (this.f2705o) {
                    this.f2705o = false;
                    m1831k();
                }
            } catch (IOException e3) {
                throw new C0704a(e3, 2000);
            }
        } catch (Throwable th) {
            this.f2703m = null;
            if (this.f2705o) {
                this.f2705o = false;
                m1831k();
            }
            throw th;
        }
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: h */
    public final Uri mo1828h() {
        return this.f2702l;
    }

    @Override // p055T.InterfaceC0575g
    /* JADX INFO: renamed from: q */
    public final int mo345q(byte[] bArr, int i3, int i4) throws C0704a {
        if (i4 == 0) {
            return 0;
        }
        long j3 = this.f2704n;
        if (j3 != 0) {
            if (j3 != -1) {
                try {
                    i4 = (int) Math.min(j3, i4);
                } catch (IOException e3) {
                    throw new C0704a(e3, 2000);
                }
            }
            InputStream inputStream = this.f2703m;
            int i5 = AbstractC0632A.f2454a;
            int i6 = inputStream.read(bArr, i3, i4);
            if (i6 != -1) {
                long j4 = this.f2704n;
                if (j4 != -1) {
                    this.f2704n = j4 - ((long) i6);
                }
                m1829b(i6);
                return i6;
            }
        }
        return -1;
    }
}
