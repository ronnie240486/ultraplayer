package p029K;

import android.system.ErrnoException;
import android.system.Os;
import java.io.FileDescriptor;

/* JADX INFO: renamed from: K.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0328h {
    /* JADX INFO: renamed from: a */
    public static void m906a(FileDescriptor fileDescriptor) throws ErrnoException {
        Os.close(fileDescriptor);
    }

    /* JADX INFO: renamed from: b */
    public static FileDescriptor m907b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    /* JADX INFO: renamed from: c */
    public static long m908c(FileDescriptor fileDescriptor, long j3, int i3) {
        return Os.lseek(fileDescriptor, j3, i3);
    }
}
