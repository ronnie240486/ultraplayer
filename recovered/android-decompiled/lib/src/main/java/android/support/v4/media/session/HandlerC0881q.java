package android.support.v4.media.session;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.mediarouter.app.DialogC1015B;
import androidx.mediarouter.app.DialogC1028O;
import androidx.mediarouter.app.DialogC1037f;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.C1323r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p044P.C0449a;
import p046P1.C0471D;
import p064W.AbstractC0632A;
import p082b0.C1063d;
import p088d0.C1378b;
import p088d0.C1382f;
import p089d1.AbstractC1449v;
import p089d1.C1402B;
import p089d1.C1422W;
import p089d1.C1428b;
import p089d1.C1433f;
import p089d1.C1436i;
import p103h0.C1596e;
import p103h0.C1597f;
import p105h2.AbstractC1676G;
import p105h2.C1674E;

/* JADX INFO: renamed from: android.support.v4.media.session.q */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC0881q extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3692a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3693b;

    public /* synthetic */ HandlerC0881q(int i3, Object obj) {
        this.f3692a = i3;
        this.f3693b = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m2274a(Message message) {
        C0885u c0885u;
        AbstractC0883s abstractC0883s;
        HandlerC0881q handlerC0881q;
        if (message.what == 1) {
            synchronized (((AbstractC0883s) this.f3693b).f3695a) {
                c0885u = (C0885u) ((AbstractC0883s) this.f3693b).f3698d.get();
                abstractC0883s = (AbstractC0883s) this.f3693b;
                handlerC0881q = abstractC0883s.f3699e;
            }
            if (c0885u == null || abstractC0883s != c0885u.m2280b() || handlerC0881q == null) {
                return;
            }
            c0885u.mo2284f((C0449a) message.obj);
            ((AbstractC0883s) this.f3693b).m2277a(c0885u, handlerC0881q);
            c0885u.mo2284f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1596e c1596e;
        c1596e = null;
        c1596e = null;
        c1596e = null;
        c1596e = null;
        c1596e = null;
        C1596e c1596e2 = null;
        switch (this.f3692a) {
            case 0:
                m2274a(message);
                break;
            case 1:
                int i3 = message.what;
                DialogC1037f dialogC1037f = (DialogC1037f) this.f3693b;
                if (i3 == 1) {
                    dialogC1037f.m2635h((List) message.obj);
                } else {
                    HandlerC0881q handlerC0881q = dialogC1037f.f4558C;
                    if (i3 == 2) {
                        if (dialogC1037f.f4562o.isEmpty()) {
                            dialogC1037f.m2638k(2);
                            handlerC0881q.removeMessages(2);
                            handlerC0881q.removeMessages(3);
                            handlerC0881q.sendMessageDelayed(handlerC0881q.obtainMessage(3), 15000L);
                        }
                    } else if (i3 == 3 && dialogC1037f.f4562o.isEmpty()) {
                        dialogC1037f.m2638k(3);
                        handlerC0881q.removeMessages(2);
                        handlerC0881q.removeMessages(3);
                        handlerC0881q.removeMessages(1);
                        dialogC1037f.f4559l.m3518h(dialogC1037f.f4560m);
                    }
                }
                break;
            case 2:
                if (message.what == 1) {
                    List list = (List) message.obj;
                    DialogC1015B dialogC1015B = (DialogC1015B) this.f3693b;
                    dialogC1015B.getClass();
                    dialogC1015B.f4409v = SystemClock.uptimeMillis();
                    dialogC1015B.f4403p.clear();
                    dialogC1015B.f4403p.addAll(list);
                    dialogC1015B.f4404q.m2595f();
                    break;
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                int i4 = message.what;
                DialogC1028O dialogC1028O = (DialogC1028O) this.f3693b;
                if (i4 == 1) {
                    dialogC1028O.m2627o();
                } else if (i4 == 2 && dialogC1028O.f4473C != null) {
                    dialogC1028O.f4473C = null;
                    dialogC1028O.m2628p();
                }
                break;
            case 4:
                Pair pair = (Pair) message.obj;
                Object obj = pair.first;
                Object obj2 = pair.second;
                int i5 = message.what;
                if (i5 == 1) {
                    C1378b c1378b = (C1378b) this.f3693b;
                    if (obj == c1378b.f6148x) {
                        if (c1378b.f6139o == 2 || c1378b.m3470k()) {
                            c1378b.f6148x = null;
                            boolean z3 = obj2 instanceof Exception;
                            C1323r c1323r = c1378b.f6127c;
                            if (z3) {
                                c1323r.m3361I((Exception) obj2, false);
                            } else {
                                try {
                                    c1378b.f6126b.mo977f((byte[]) obj2);
                                    c1323r.f5962i = null;
                                    HashSet hashSet = (HashSet) c1323r.f5961h;
                                    AbstractC1676G abstractC1676GM4117n = AbstractC1676G.m4117n(hashSet);
                                    hashSet.clear();
                                    C1674E c1674eListIterator = abstractC1676GM4117n.listIterator(0);
                                    while (c1674eListIterator.hasNext()) {
                                        C1378b c1378b2 = (C1378b) c1674eListIterator.next();
                                        if (c1378b2.m3473n()) {
                                            c1378b2.m3469j(true);
                                        }
                                    }
                                } catch (Exception e3) {
                                    c1323r.m3361I(e3, true);
                                    return;
                                }
                            }
                        }
                    }
                    break;
                } else if (i5 == 2) {
                    C1378b c1378b3 = (C1378b) this.f3693b;
                    if (obj == c1378b3.f6147w && c1378b3.m3470k()) {
                        c1378b3.f6147w = null;
                        if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                            c1378b3.m3472m((Throwable) obj2, false);
                        } else {
                            try {
                                byte[] bArrMo994w = c1378b3.f6126b.mo994w(c1378b3.f6145u, (byte[]) obj2);
                                if (c1378b3.f6146v != null && bArrMo994w != null && bArrMo994w.length != 0) {
                                    c1378b3.f6146v = bArrMo994w;
                                }
                                c1378b3.f6139o = 4;
                                c1378b3.m3468i(new C1063d(7));
                            } catch (Exception e4) {
                                e = e4;
                                c1378b3.m3472m(e, true);
                                return;
                            } catch (NoSuchMethodError e5) {
                                e = e5;
                                c1378b3.m3472m(e, true);
                                return;
                            }
                        }
                        break;
                    }
                }
                break;
            case 5:
                byte[] bArr = (byte[]) message.obj;
                if (bArr != null) {
                    ArrayList arrayList = ((C1382f) this.f3693b).f6164m;
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj3 = arrayList.get(i6);
                        i6++;
                        C1378b c1378b4 = (C1378b) obj3;
                        c1378b4.m3475p();
                        if (Arrays.equals(c1378b4.f6145u, bArr)) {
                            if (message.what == 2 && c1378b4.f6139o == 4) {
                                int i7 = AbstractC0632A.f2454a;
                                c1378b4.m3469j(false);
                            }
                            break;
                        }
                    }
                    break;
                }
                break;
            case 6:
                int i8 = message.what;
                int i9 = message.arg1;
                Object obj4 = message.obj;
                Bundle bundlePeekData = message.peekData();
                C1436i c1436i = (C1436i) this.f3693b;
                C1422W c1422w = (C1422W) c1436i.f6361j.get(i9);
                if (c1422w == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    break;
                } else {
                    c1436i.f6361j.remove(i9);
                    if (i8 == 3) {
                        c1422w.m3550b((Bundle) obj4);
                        break;
                    } else if (i8 == 4) {
                        C1422W.m3549a(bundlePeekData != null ? bundlePeekData.getString("error") : null, (Bundle) obj4);
                        break;
                    }
                }
                break;
            case 7:
                int i10 = message.what;
                AbstractC1449v abstractC1449v = (AbstractC1449v) this.f3693b;
                if (i10 == 1) {
                    abstractC1449v.f6414h = false;
                    C1428b c1428b = abstractC1449v.f6410d;
                    if (c1428b != null) {
                        C0471D c0471d = abstractC1449v.f6413g;
                        C1433f c1433f = c1428b.f6316a;
                        C1402B c1402bM3576d = c1433f.m3576d(abstractC1449v);
                        if (c1402bM3576d != null) {
                            c1433f.m3585m(c1402bM3576d, c0471d);
                        }
                    }
                    break;
                } else if (i10 == 2) {
                    abstractC1449v.f6412f = false;
                    abstractC1449v.mo3527f(abstractC1449v.f6411e);
                    break;
                }
                break;
            default:
                C1597f c1597f = (C1597f) this.f3693b;
                c1597f.getClass();
                int i11 = message.what;
                if (i11 != 1) {
                    if (i11 == 2) {
                        c1596e = (C1596e) message.obj;
                        int i12 = c1596e.f7217a;
                        MediaCodec.CryptoInfo cryptoInfo = c1596e.f7219c;
                        long j3 = c1596e.f7220d;
                        int i13 = c1596e.f7221e;
                        try {
                            synchronized (C1597f.f7223h) {
                                try {
                                    c1597f.f7224a.queueSecureInputBuffer(i12, 0, cryptoInfo, j3, i13);
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                        } catch (RuntimeException e6) {
                            AtomicReference atomicReference = c1597f.f7227d;
                            while (!atomicReference.compareAndSet(null, e6) && atomicReference.get() == null) {
                            }
                        }
                    } else if (i11 == 3) {
                        c1597f.f7228e.m1613c();
                    } else if (i11 != 4) {
                        AtomicReference atomicReference2 = c1597f.f7227d;
                        IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                        while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                        }
                    } else {
                        try {
                            c1597f.f7224a.setParameters((Bundle) message.obj);
                            break;
                        } catch (RuntimeException e7) {
                            AtomicReference atomicReference3 = c1597f.f7227d;
                            while (!atomicReference3.compareAndSet(null, e7) && atomicReference3.get() == null) {
                            }
                        }
                    }
                    if (c1596e2 != null) {
                        C1597f.m3927f(c1596e2);
                    }
                    break;
                } else {
                    c1596e = (C1596e) message.obj;
                    try {
                        c1597f.f7224a.queueInputBuffer(c1596e.f7217a, 0, c1596e.f7218b, c1596e.f7220d, c1596e.f7221e);
                        break;
                    } catch (RuntimeException e8) {
                        AtomicReference atomicReference4 = c1597f.f7227d;
                        while (!atomicReference4.compareAndSet(null, e8) && atomicReference4.get() == null) {
                        }
                    }
                }
                c1596e2 = c1596e;
                if (c1596e2 != null) {
                    C1597f.m3927f(c1596e2);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC0881q(Object obj, Looper looper, int i3) {
        super(looper);
        this.f3692a = i3;
        this.f3693b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0881q(C1436i c1436i) {
        super(Looper.getMainLooper());
        this.f3692a = 6;
        this.f3693b = c1436i;
    }
}
