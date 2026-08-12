package p070Y;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: Y.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0728y extends AbstractC0706c {

    /* JADX INFO: renamed from: k */
    public final Context f2777k;

    /* JADX INFO: renamed from: l */
    public C0715l f2778l;

    /* JADX INFO: renamed from: m */
    public AssetFileDescriptor f2779m;

    /* JADX INFO: renamed from: n */
    public FileInputStream f2780n;

    /* JADX INFO: renamed from: o */
    public long f2781o;

    /* JADX INFO: renamed from: p */
    public boolean f2782p;

    public C0728y(Context context) {
        super(false);
        this.f2777k = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i3) {
        return Uri.parse("rawresource:///" + i3);
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: a */
    public final long mo1827a(C0715l c0715l) throws C0727x {
        Resources resourcesForApplication;
        int identifier;
        int i3;
        Resources resources;
        this.f2778l = c0715l;
        m1832l();
        Uri uriNormalizeScheme = c0715l.f2735a.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f2777k;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new C0727x("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i3 = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new C0727x("Resource identifier must be an integer.", null, 1004);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new C0727x("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, 1004);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e3) {
                    throw new C0727x("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e3, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new C0727x("Resource identifier must be an integer.", null, 1004);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(packageName + ":" + path, "raw", null);
                if (identifier == 0) {
                    throw new C0727x("Resource not found.", null, 2005);
                }
            }
            i3 = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i3);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new C0727x("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.f2779m = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f2779m.getFileDescriptor());
            this.f2780n = fileInputStream;
            long j3 = c0715l.f2739e;
            try {
                if (length != -1 && j3 > length) {
                    throw new C0727x(null, null, 2008);
                }
                long startOffset = this.f2779m.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j3) - startOffset;
                if (jSkip != j3) {
                    throw new C0727x(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f2781o = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f2781o = size;
                        if (size < 0) {
                            throw new C0727x(null, null, 2008);
                        }
                    }
                } else {
                    long j4 = length - jSkip;
                    this.f2781o = j4;
                    if (j4 < 0) {
                        throw new C0712i(2008);
                    }
                }
                long j5 = c0715l.f2740f;
                if (j5 != -1) {
                    long j6 = this.f2781o;
                    this.f2781o = j6 == -1 ? j5 : Math.min(j6, j5);
                }
                this.f2782p = true;
                m1834p(c0715l);
                return j5 != -1 ? j5 : this.f2781o;
            } catch (C0727x e4) {
                throw e4;
            } catch (IOException e5) {
                throw new C0727x(null, e5, 2000);
            }
        } catch (Resources.NotFoundException e6) {
            throw new C0727x(null, e6, 2005);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // p070Y.InterfaceC0711h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        this.f2778l = null;
        try {
            FileInputStream fileInputStream = this.f2780n;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f2780n = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor = this.f2779m;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.f2779m = null;
                    if (this.f2782p) {
                        this.f2782p = false;
                        m1831k();
                    }
                } catch (IOException e3) {
                    throw new C0727x(null, e3, 2000);
                }
            } catch (Throwable th) {
                this.f2779m = null;
                if (this.f2782p) {
                    this.f2782p = false;
                    m1831k();
                }
                throw th;
            }
        } catch (IOException e4) {
            throw new C0727x(null, e4, 2000);
        }
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: h */
    public final Uri mo1828h() {
        C0715l c0715l = this.f2778l;
        if (c0715l != null) {
            return c0715l.f2735a;
        }
        return null;
    }

    @Override // p055T.InterfaceC0575g
    /* JADX INFO: renamed from: q */
    public final int mo345q(byte[] bArr, int i3, int i4) throws C0727x {
        if (i4 == 0) {
            return 0;
        }
        long j3 = this.f2781o;
        if (j3 != 0) {
            if (j3 != -1) {
                try {
                    i4 = (int) Math.min(j3, i4);
                } catch (IOException e3) {
                    throw new C0727x(null, e3, 2000);
                }
            }
            FileInputStream fileInputStream = this.f2780n;
            int i5 = AbstractC0632A.f2454a;
            int i6 = fileInputStream.read(bArr, i3, i4);
            if (i6 != -1) {
                long j4 = this.f2781o;
                if (j4 != -1) {
                    this.f2781o = j4 - ((long) i6);
                }
                m1829b(i6);
                return i6;
            }
            if (this.f2781o != -1) {
                throw new C0727x("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}
