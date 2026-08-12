package p070Y;

import com.google.android.gms.internal.cast.AbstractC1303m;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: Y.t */
/* JADX INFO: loaded from: classes.dex */
public class C0723t extends C0712i {

    /* JADX INFO: renamed from: i */
    public final int f2772i;

    public C0723t() {
        super(2008);
        this.f2772i = 1;
    }

    /* JADX INFO: renamed from: a */
    public static C0723t m1844a(IOException iOException, int i3) {
        int i4;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i4 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i4 = 1004;
        } else {
            i4 = (message == null || !AbstractC1303m.m3288K(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i4 == 2007 ? new C0722s("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007) : new C0723t(iOException, i4, i3);
    }

    public C0723t(int i3, String str) {
        super(i3 == 2000 ? 2001 : i3, str);
        this.f2772i = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0723t(IOException iOException, int i3, int i4) {
        if (i3 == 2000 && i4 == 1) {
            i3 = 2001;
        }
        super(iOException, i3);
        this.f2772i = i4;
    }

    public C0723t(String str, IOException iOException, int i3) {
        super(str, iOException, i3 == 2000 ? 2001 : i3);
        this.f2772i = 1;
    }
}
