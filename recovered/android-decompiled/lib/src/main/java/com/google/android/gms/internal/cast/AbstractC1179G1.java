package com.google.android.gms.internal.cast;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p060U1.AbstractC0610a;
import p085c0.ExecutorC1148x;
import p119l2.InterfaceFutureC1992b;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.G1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1179G1 extends AbstractC1303m implements InterfaceFutureC1992b {

    /* JADX INFO: renamed from: l */
    public static final boolean f5624l;

    /* JADX INFO: renamed from: m */
    public static final Logger f5625m;

    /* JADX INFO: renamed from: n */
    public static final AbstractC0610a f5626n;

    /* JADX INFO: renamed from: o */
    public static final Object f5627o;

    /* JADX INFO: renamed from: i */
    public volatile Object f5628i;

    /* JADX INFO: renamed from: j */
    public volatile C1155A1 f5629j;

    /* JADX INFO: renamed from: k */
    public volatile C1175F1 f5630k;

    static {
        boolean z3;
        AbstractC0610a c1163c1;
        Throwable th;
        Throwable th2;
        try {
            z3 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z3 = false;
        }
        f5624l = z3;
        f5625m = Logger.getLogger(AbstractC1179G1.class.getName());
        try {
            c1163c1 = new C1171E1();
            th = null;
            th2 = null;
        } catch (Error | RuntimeException e3) {
            try {
                th = null;
                th2 = e3;
                c1163c1 = new C1159B1(AtomicReferenceFieldUpdater.newUpdater(C1175F1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C1175F1.class, C1175F1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1179G1.class, C1175F1.class, "k"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1179G1.class, C1155A1.class, "j"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1179G1.class, Object.class, "i"));
            } catch (Error | RuntimeException e4) {
                c1163c1 = new C1163C1();
                th = e4;
                th2 = e3;
            }
        }
        f5626n = c1163c1;
        if (th != null) {
            Logger logger = f5625m;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f5627o = new Object();
    }

    /* JADX INFO: renamed from: g0 */
    public static Object m3133g0(AbstractC1179G1 abstractC1179G1) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = abstractC1179G1.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* JADX INFO: renamed from: i0 */
    public static void m3134i0(AbstractC1179G1 abstractC1179G1) {
        for (C1175F1 c1175f1Mo1527N = f5626n.mo1527N(abstractC1179G1); c1175f1Mo1527N != null; c1175f1Mo1527N = c1175f1Mo1527N.f5617b) {
            Thread thread = c1175f1Mo1527N.f5616a;
            if (thread != null) {
                c1175f1Mo1527N.f5616a = null;
                LockSupport.unpark(thread);
            }
        }
        abstractC1179G1.mo3137f0();
        C1155A1 c1155a1Mo1526L = f5626n.mo1526L(abstractC1179G1);
        C1155A1 c1155a1 = null;
        while (c1155a1Mo1526L != null) {
            C1155A1 c1155a2 = c1155a1Mo1526L.f5544c;
            c1155a1Mo1526L.f5544c = c1155a1;
            c1155a1 = c1155a1Mo1526L;
            c1155a1Mo1526L = c1155a2;
        }
        while (c1155a1 != null) {
            Runnable runnable = c1155a1.f5542a;
            C1155A1 c1155a3 = c1155a1.f5544c;
            runnable.getClass();
            ExecutorC1148x executorC1148x = c1155a1.f5543b;
            executorC1148x.getClass();
            try {
                executorC1148x.execute(runnable);
            } catch (RuntimeException e3) {
                f5625m.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executorC1148x), (Throwable) e3);
            }
            c1155a1 = c1155a3;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static final Object m3135k0(Object obj) throws ExecutionException {
        if (obj instanceof C1349x1) {
            RuntimeException runtimeException = ((C1349x1) obj).f5989b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof C1357z1) {
            throw new ExecutionException(((C1357z1) obj).f6004a);
        }
        if (obj == f5627o) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        C1349x1 c1349x1;
        Object obj = this.f5628i;
        if (obj != null) {
            return false;
        }
        if (f5624l) {
            c1349x1 = new C1349x1(z3, new CancellationException("Future.cancel() was called."));
        } else {
            c1349x1 = z3 ? C1349x1.f5986c : C1349x1.f5987d;
            c1349x1.getClass();
        }
        if (!f5626n.mo1530T(this, obj, c1349x1)) {
            return false;
        }
        m3134i0(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public String mo3136e0() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: f0 */
    public void mo3137f0() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f5628i;
        if (obj2 != null) {
            return m3135k0(obj2);
        }
        C1175F1 c1175f1 = this.f5630k;
        C1175F1 c1175f2 = C1175F1.f5615c;
        if (c1175f1 != c1175f2) {
            C1175F1 c1175f3 = new C1175F1();
            do {
                AbstractC0610a abstractC0610a = f5626n;
                abstractC0610a.mo1528P(c1175f3, c1175f1);
                if (abstractC0610a.mo1531U(this, c1175f1, c1175f3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m3139j0(c1175f3);
                            throw new InterruptedException();
                        }
                        obj = this.f5628i;
                    } while (obj == null);
                    return m3135k0(obj);
                }
                c1175f1 = this.f5630k;
            } while (c1175f1 != c1175f2);
        }
        Object obj3 = this.f5628i;
        obj3.getClass();
        return m3135k0(obj3);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m3138h0(StringBuilder sb) {
        try {
            Object objM3133g0 = m3133g0(this);
            sb.append("SUCCESS, result=[");
            if (objM3133g0 == null) {
                sb.append("null");
            } else if (objM3133g0 == this) {
                sb.append("this future");
            } else {
                sb.append(objM3133g0.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objM3133g0)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5628i instanceof C1349x1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5628i != null;
    }

    /* JADX INFO: renamed from: j0 */
    public final void m3139j0(C1175F1 c1175f1) {
        c1175f1.f5616a = null;
        while (true) {
            C1175F1 c1175f2 = this.f5630k;
            if (c1175f2 != C1175F1.f5615c) {
                C1175F1 c1175f3 = null;
                while (c1175f2 != null) {
                    C1175F1 c1175f4 = c1175f2.f5617b;
                    if (c1175f2.f5616a != null) {
                        c1175f3 = c1175f2;
                    } else if (c1175f3 != null) {
                        c1175f3.f5617b = c1175f4;
                        if (c1175f3.f5616a == null) {
                        }
                    } else if (!f5626n.mo1531U(this, c1175f2, c1175f4)) {
                    }
                    c1175f2 = c1175f4;
                }
                return;
            }
            return;
        }
    }

    @Override // com.google.android.gms.internal.cast.AbstractC1303m
    public final String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.f5628i instanceof C1349x1) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m3138h0(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            try {
                strConcat = mo3136e0();
                int i3 = AbstractC1157B.f5554a;
                if (strConcat == null || strConcat.isEmpty()) {
                    strConcat = null;
                }
            } catch (RuntimeException | StackOverflowError e3) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e3.getClass()));
            }
            if (strConcat != null) {
                sb.append(", info=[");
                sb.append(strConcat);
                sb.append("]");
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                m3138h0(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f5628i;
            if (obj != null) {
                return m3135k0(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C1175F1 c1175f1 = this.f5630k;
                C1175F1 c1175f2 = C1175F1.f5615c;
                if (c1175f1 != c1175f2) {
                    C1175F1 c1175f3 = new C1175F1();
                    while (true) {
                        AbstractC0610a abstractC0610a = f5626n;
                        abstractC0610a.mo1528P(c1175f3, c1175f1);
                        if (abstractC0610a.mo1531U(this, c1175f1, c1175f3)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f5628i;
                                    if (obj2 != null) {
                                        return m3135k0(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    m3139j0(c1175f3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m3139j0(c1175f3);
                            break;
                        }
                        c1175f1 = this.f5630k;
                        if (c1175f1 == c1175f2) {
                        }
                    }
                }
                Object obj3 = this.f5628i;
                obj3.getClass();
                return m3135k0(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f5628i;
                if (obj4 != null) {
                    return m3135k0(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j4 = -nanos;
                long jConvert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit.toNanos(jConvert);
                boolean z3 = true;
                if (jConvert != 0 && nanos2 <= 1000) {
                    z3 = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z3) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z3) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(strConcat + " for " + string);
        }
        throw new InterruptedException();
    }
}
