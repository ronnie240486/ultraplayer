package p070Y;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: Y.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0708e extends AbstractC0706c {

    /* JADX INFO: renamed from: k */
    public final ContentResolver f2710k;

    /* JADX INFO: renamed from: l */
    public Uri f2711l;

    /* JADX INFO: renamed from: m */
    public AssetFileDescriptor f2712m;

    /* JADX INFO: renamed from: n */
    public FileInputStream f2713n;

    /* JADX INFO: renamed from: o */
    public long f2714o;

    /* JADX INFO: renamed from: p */
    public boolean f2715p;

    public C0708e(Context context) {
        super(false);
        this.f2710k = context.getContentResolver();
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: a */
    public final long mo1827a(C0715l c0715l) throws C0707d {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = c0715l.f2735a.normalizeScheme();
            this.f2711l = uriNormalizeScheme;
            m1832l();
            boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
            ContentResolver contentResolver = this.f2710k;
            if (zEquals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.f2712m = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new C0707d(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.f2713n = fileInputStream;
            long j3 = c0715l.f2739e;
            if (length != -1 && j3 > length) {
                throw new C0707d(null, 2008);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(startOffset + j3) - startOffset;
            if (jSkip != j3) {
                throw new C0707d(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.f2714o = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.f2714o = jPosition;
                    if (jPosition < 0) {
                        throw new C0707d(null, 2008);
                    }
                }
            } else {
                long j4 = length - jSkip;
                this.f2714o = j4;
                if (j4 < 0) {
                    throw new C0707d(null, 2008);
                }
            }
            long j5 = c0715l.f2740f;
            if (j5 != -1) {
                long j6 = this.f2714o;
                this.f2714o = j6 == -1 ? j5 : Math.min(j6, j5);
            }
            this.f2715p = true;
            m1834p(c0715l);
            return j5 != -1 ? j5 : this.f2714o;
        } catch (C0707d e3) {
            throw e3;
        } catch (IOException e4) {
            throw new C0707d(e4, e4 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // p070Y.InterfaceC0711h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        this.f2711l = null;
        try {
            FileInputStream fileInputStream = this.f2713n;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f2713n = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f2712m;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f2712m = null;
                    if (this.f2715p) {
                        this.f2715p = false;
                        m1831k();
                    }
                } catch (IOException e3) {
                    throw new C0707d(e3, 2000);
                }
            } catch (Throwable th) {
                this.f2712m = null;
                if (this.f2715p) {
                    this.f2715p = false;
                    m1831k();
                }
                throw th;
            }
        } catch (IOException e4) {
            throw new C0707d(e4, 2000);
        }
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: h */
    public final Uri mo1828h() {
        return this.f2711l;
    }

    @Override // p055T.InterfaceC0575g
    /* JADX INFO: renamed from: q */
    public final int mo345q(byte[] bArr, int i3, int i4) throws C0707d {
        if (i4 == 0) {
            return 0;
        }
        long j3 = this.f2714o;
        if (j3 != 0) {
            if (j3 != -1) {
                try {
                    i4 = (int) Math.min(j3, i4);
                } catch (IOException e3) {
                    throw new C0707d(e3, 2000);
                }
            }
            FileInputStream fileInputStream = this.f2713n;
            int i5 = AbstractC0632A.f2454a;
            int i6 = fileInputStream.read(bArr, i3, i4);
            if (i6 != -1) {
                long j4 = this.f2714o;
                if (j4 != -1) {
                    this.f2714o = j4 - ((long) i6);
                }
                m1829b(i6);
                return i6;
            }
        }
        return -1;
    }
}
