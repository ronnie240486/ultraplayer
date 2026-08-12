package p128o;

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
import p066W1.AbstractC0664e;
import p085c0.ExecutorC1148x;
import p119l2.InterfaceFutureC1992b;

/* JADX INFO: renamed from: o.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2056g implements InterfaceFutureC1992b {

    /* JADX INFO: renamed from: j */
    public static final boolean f8941j = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: k */
    public static final Logger f8942k = Logger.getLogger(AbstractC2056g.class.getName());

    /* JADX INFO: renamed from: l */
    public static final AbstractC0664e f8943l;

    /* JADX INFO: renamed from: m */
    public static final Object f8944m;

    /* JADX INFO: renamed from: g */
    public volatile Object f8945g;

    /* JADX INFO: renamed from: h */
    public volatile C2052c f8946h;

    /* JADX INFO: renamed from: i */
    public volatile C2055f f8947i;

    static {
        AbstractC0664e c2054e;
        try {
            c2054e = new C2053d(AtomicReferenceFieldUpdater.newUpdater(C2055f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C2055f.class, C2055f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2056g.class, C2055f.class, "i"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2056g.class, C2052c.class, "h"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2056g.class, Object.class, "g"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c2054e = new C2054e();
        }
        f8943l = c2054e;
        if (th != null) {
            f8942k.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f8944m = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static void m4620b(AbstractC2056g abstractC2056g) {
        C2055f c2055f;
        C2052c c2052c;
        C2052c c2052c2;
        C2052c c2052c3;
        do {
            c2055f = abstractC2056g.f8947i;
        } while (!f8943l.mo1769g(abstractC2056g, c2055f, C2055f.f8938c));
        while (true) {
            c2052c = null;
            if (c2055f == null) {
                break;
            }
            Thread thread = c2055f.f8939a;
            if (thread != null) {
                c2055f.f8939a = null;
                LockSupport.unpark(thread);
            }
            c2055f = c2055f.f8940b;
        }
        do {
            c2052c2 = abstractC2056g.f8946h;
        } while (!f8943l.mo1767e(abstractC2056g, c2052c2, C2052c.f8929d));
        while (true) {
            c2052c3 = c2052c;
            c2052c = c2052c2;
            if (c2052c == null) {
                break;
            }
            c2052c2 = c2052c.f8932c;
            c2052c.f8932c = c2052c3;
        }
        while (c2052c3 != null) {
            C2052c c2052c4 = c2052c3.f8932c;
            m4621c(c2052c3.f8930a, c2052c3.f8931b);
            c2052c3 = c2052c4;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m4621c(Runnable runnable, ExecutorC1148x executorC1148x) {
        try {
            executorC1148x.execute(runnable);
        } catch (RuntimeException e3) {
            f8942k.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executorC1148x, (Throwable) e3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static Object m4622d(Object obj) throws ExecutionException {
        if (obj instanceof C2050a) {
            CancellationException cancellationException = ((C2050a) obj).f8927a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof C2051b) {
            throw new ExecutionException(((C2051b) obj).f8928a);
        }
        if (obj == f8944m) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: e */
    public static Object m4623e(AbstractC2056g abstractC2056g) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = abstractC2056g.get();
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

    /* JADX INFO: renamed from: a */
    public final void m4624a(StringBuilder sb) {
        try {
            Object objM4623e = m4623e(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM4623e == this ? "this future" : String.valueOf(objM4623e));
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
    public final boolean cancel(boolean z3) {
        C2050a c2050a;
        Object obj = this.f8945g;
        if (obj != null) {
            return false;
        }
        if (f8941j) {
            c2050a = new C2050a(z3, new CancellationException("Future.cancel() was called."));
        } else {
            c2050a = z3 ? C2050a.f8925b : C2050a.f8926c;
        }
        if (!f8943l.mo1768f(this, obj, c2050a)) {
            return false;
        }
        m4620b(this);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public String mo4625f() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* JADX INFO: renamed from: g */
    public final void m4626g(C2055f c2055f) {
        c2055f.f8939a = null;
        while (true) {
            C2055f c2055f2 = this.f8947i;
            if (c2055f2 == C2055f.f8938c) {
                return;
            }
            C2055f c2055f3 = null;
            while (c2055f2 != null) {
                C2055f c2055f4 = c2055f2.f8940b;
                if (c2055f2.f8939a != null) {
                    c2055f3 = c2055f2;
                } else if (c2055f3 != null) {
                    c2055f3.f8940b = c2055f4;
                    if (c2055f3.f8939a == null) {
                    }
                } else if (!f8943l.mo1769g(this, c2055f2, c2055f4)) {
                }
                c2055f2 = c2055f4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j3);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f8945g;
        if (obj != null) {
            return m4622d(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C2055f c2055f = this.f8947i;
            C2055f c2055f2 = C2055f.f8938c;
            if (c2055f != c2055f2) {
                C2055f c2055f3 = new C2055f();
                while (true) {
                    AbstractC0664e abstractC0664e = f8943l;
                    abstractC0664e.mo1761F(c2055f3, c2055f);
                    if (abstractC0664e.mo1769g(this, c2055f, c2055f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m4626g(c2055f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f8945g;
                            if (obj2 != null) {
                                return m4622d(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m4626g(c2055f3);
                        break;
                    }
                    c2055f = this.f8947i;
                    if (c2055f == c2055f2) {
                    }
                }
            }
            return m4622d(this.f8945g);
        }
        while (nanos > 0) {
            Object obj3 = this.f8945g;
            if (obj3 != null) {
                return m4622d(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j4 = -nanos;
            long jConvert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
            long nanos2 = j4 - timeUnit.toNanos(jConvert);
            boolean z3 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z3) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z3) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8945g instanceof C2050a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8945g != null;
    }

    public final String toString() {
        String strMo4625f;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f8945g instanceof C2050a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m4624a(sb);
        } else {
            try {
                strMo4625f = mo4625f();
            } catch (RuntimeException e3) {
                strMo4625f = "Exception thrown from implementation: " + e3.getClass();
            }
            if (strMo4625f != null && !strMo4625f.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strMo4625f);
                sb.append("]");
            } else if (isDone()) {
                m4624a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f8945g;
            if (obj2 != null) {
                return m4622d(obj2);
            }
            C2055f c2055f = this.f8947i;
            C2055f c2055f2 = C2055f.f8938c;
            if (c2055f != c2055f2) {
                C2055f c2055f3 = new C2055f();
                do {
                    AbstractC0664e abstractC0664e = f8943l;
                    abstractC0664e.mo1761F(c2055f3, c2055f);
                    if (abstractC0664e.mo1769g(this, c2055f, c2055f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f8945g;
                            } else {
                                m4626g(c2055f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m4622d(obj);
                    }
                    c2055f = this.f8947i;
                } while (c2055f != c2055f2);
            }
            return m4622d(this.f8945g);
        }
        throw new InterruptedException();
    }
}
