package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Pair;
import androidx.mediarouter.app.C1048q;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.C1258a2;
import java.io.FileNotFoundException;
import java.io.IOException;
import p055T.C0546I;
import p064W.AbstractC0646n;
import p070Y.C0712i;
import p070Y.C0722s;
import p088d0.C1377a;
import p088d0.C1378b;
import p088d0.C1392p;
import p088d0.C1393q;
import p088d0.C1399w;
import p095f0.C1528a;
import p129o0.C2073m;

/* JADX INFO: renamed from: android.support.v4.media.session.f */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC0870f extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3682a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f3683b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f3684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0870f(C1378b c1378b, Looper looper) {
        super(looper);
        this.f3684c = c1378b;
    }

    /* JADX INFO: renamed from: a */
    public boolean m2271a(Message message, C1399w c1399w) {
        long jMin;
        C1377a c1377a = (C1377a) message.obj;
        if (c1377a.f6122b) {
            int i3 = c1377a.f6124d + 1;
            c1377a.f6124d = i3;
            ((C1378b) this.f3684c).f6133i.getClass();
            if (i3 <= 3) {
                SystemClock.elapsedRealtime();
                SystemClock.elapsedRealtime();
                Throwable c1258a2 = c1399w.getCause() instanceof IOException ? (IOException) c1399w.getCause() : new C1258a2(c1399w.getCause());
                C1528a c1528a = ((C1378b) this.f3684c).f6133i;
                int i4 = c1377a.f6124d;
                c1528a.getClass();
                if (!(c1258a2 instanceof C0546I) && !(c1258a2 instanceof FileNotFoundException) && !(c1258a2 instanceof C0722s) && !(c1258a2 instanceof C2073m)) {
                    int i5 = C0712i.f2720h;
                    while (true) {
                        if (c1258a2 == null) {
                            jMin = Math.min((i4 - 1) * 1000, 5000);
                            break;
                        }
                        if ((c1258a2 instanceof C0712i) && ((C0712i) c1258a2).f2721g == 2008) {
                            jMin = -9223372036854775807L;
                            break;
                        }
                        c1258a2 = c1258a2.getCause();
                    }
                } else {
                    jMin = -9223372036854775807L;
                    break;
                }
                if (jMin != -9223372036854775807L) {
                    synchronized (this) {
                        try {
                            if (this.f3683b) {
                                return false;
                            }
                            sendMessageDelayed(Message.obtain(message), jMin);
                            return true;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object objM2184z;
        switch (this.f3682a) {
            case 0:
                if (this.f3683b) {
                    int i3 = message.what;
                    C1048q c1048q = (C1048q) this.f3684c;
                    switch (i3) {
                        case 1:
                            C0858A.m2152x(message.getData());
                            c1048q.getClass();
                            return;
                        case 2:
                            c1048q.m2647b((PlaybackStateCompat) message.obj);
                            return;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            c1048q.m2646a((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            c1048q.getClass();
                            return;
                        case 5:
                            c1048q.getClass();
                            return;
                        case 6:
                            c1048q.getClass();
                            return;
                        case 7:
                            C0858A.m2152x((Bundle) message.obj);
                            c1048q.getClass();
                            return;
                        case 8:
                            c1048q.m2649d();
                            return;
                        case 9:
                            ((Integer) message.obj).getClass();
                            c1048q.getClass();
                            return;
                        case 10:
                        default:
                            return;
                        case 11:
                            ((Boolean) message.obj).getClass();
                            c1048q.getClass();
                            return;
                        case 12:
                            ((Integer) message.obj).getClass();
                            c1048q.getClass();
                            return;
                        case 13:
                            c1048q.getClass();
                            return;
                    }
                }
                return;
            default:
                C1377a c1377a = (C1377a) message.obj;
                try {
                    int i4 = message.what;
                    if (i4 == 1) {
                        objM2184z = ((C1378b) this.f3684c).f6135k.m2184z((C1393q) c1377a.f6123c);
                    } else {
                        if (i4 != 2) {
                            throw new RuntimeException();
                        }
                        C1378b c1378b = (C1378b) this.f3684c;
                        objM2184z = c1378b.f6135k.m2183y(c1378b.f6136l, (C1392p) c1377a.f6123c);
                    }
                } catch (C1399w e3) {
                    boolean zM2271a = m2271a(message, e3);
                    objM2184z = e3;
                    if (zM2271a) {
                        return;
                    }
                } catch (Exception e4) {
                    AbstractC0646n.m1648z("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e4);
                    objM2184z = e4;
                }
                C1528a c1528a = ((C1378b) this.f3684c).f6133i;
                long j3 = c1377a.f6121a;
                c1528a.getClass();
                synchronized (this) {
                    try {
                        if (!this.f3683b) {
                            ((C1378b) this.f3684c).f6138n.obtainMessage(message.what, Pair.create(c1377a.f6123c, objM2184z)).sendToTarget();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0870f(C1048q c1048q, Looper looper) {
        super(looper);
        this.f3684c = c1048q;
        this.f3683b = false;
    }
}
