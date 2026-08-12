package p096f1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: f1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1554i {

    /* JADX INFO: renamed from: a */
    public final int f7055a;

    /* JADX INFO: renamed from: b */
    public final int f7056b;

    /* JADX INFO: renamed from: c */
    public final long f7057c;

    /* JADX INFO: renamed from: d */
    public final long f7058d;

    public C1554i(int i3, int i4, long j3, long j4) {
        this.f7055a = i3;
        this.f7056b = i4;
        this.f7057c = j3;
        this.f7058d = j4;
    }

    /* JADX INFO: renamed from: a */
    public static C1554i m3873a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C1554i c1554i = new C1554i(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c1554i;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3874b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f7055a);
            dataOutputStream.writeInt(this.f7056b);
            dataOutputStream.writeLong(this.f7057c);
            dataOutputStream.writeLong(this.f7058d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C1554i)) {
            C1554i c1554i = (C1554i) obj;
            if (this.f7056b == c1554i.f7056b && this.f7057c == c1554i.f7057c && this.f7055a == c1554i.f7055a && this.f7058d == c1554i.f7058d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f7056b), Long.valueOf(this.f7057c), Integer.valueOf(this.f7055a), Long.valueOf(this.f7058d));
    }
}
