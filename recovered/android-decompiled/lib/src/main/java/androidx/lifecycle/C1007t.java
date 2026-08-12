package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p045P0.AbstractC0462h;
import p116l.C1970a;
import p120m.C1993a;
import p120m.C1994b;
import p120m.C1995c;
import p120m.C1996d;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: androidx.lifecycle.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1007t {

    /* JADX INFO: renamed from: a */
    public final boolean f4322a;

    /* JADX INFO: renamed from: b */
    public C1993a f4323b;

    /* JADX INFO: renamed from: c */
    public EnumC1000m f4324c;

    /* JADX INFO: renamed from: d */
    public final WeakReference f4325d;

    /* JADX INFO: renamed from: e */
    public int f4326e;

    /* JADX INFO: renamed from: f */
    public boolean f4327f;

    /* JADX INFO: renamed from: g */
    public boolean f4328g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f4329h;

    public C1007t(InterfaceC1005r interfaceC1005r) {
        new AtomicReference();
        this.f4322a = true;
        this.f4323b = new C1993a();
        this.f4324c = EnumC1000m.f4314h;
        this.f4329h = new ArrayList();
        this.f4325d = new WeakReference(interfaceC1005r);
    }

    /* JADX INFO: renamed from: a */
    public final void m2565a(InterfaceC1004q interfaceC1004q) {
        InterfaceC1003p reflectiveGenericLifecycleObserver;
        Object obj;
        InterfaceC1005r interfaceC1005r;
        EnumC0999l enumC0999l;
        ArrayList arrayList = this.f4329h;
        m2567c("addObserver");
        EnumC1000m enumC1000m = this.f4324c;
        EnumC1000m enumC1000m2 = EnumC1000m.f4313g;
        if (enumC1000m != enumC1000m2) {
            enumC1000m2 = EnumC1000m.f4314h;
        }
        C1006s c1006s = new C1006s();
        HashMap map = AbstractC1008u.f4330a;
        boolean z3 = interfaceC1004q instanceof InterfaceC1003p;
        boolean z4 = interfaceC1004q instanceof InterfaceC0991d;
        if (z3 && z4) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0991d) interfaceC1004q, (InterfaceC1003p) interfaceC1004q);
        } else if (z4) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0991d) interfaceC1004q, null);
        } else if (z3) {
            reflectiveGenericLifecycleObserver = (InterfaceC1003p) interfaceC1004q;
        } else {
            Class<?> cls = interfaceC1004q.getClass();
            if (AbstractC1008u.m2575c(cls) == 2) {
                Object obj2 = AbstractC1008u.f4331b.get(cls);
                AbstractC2364c.m4951b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC1008u.m2573a((Constructor) list.get(0), interfaceC1004q);
                    throw null;
                }
                int size = list.size();
                InterfaceC0994g[] interfaceC0994gArr = new InterfaceC0994g[size];
                if (size > 0) {
                    AbstractC1008u.m2573a((Constructor) list.get(0), interfaceC1004q);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0994gArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC1004q);
            }
        }
        c1006s.f4321b = reflectiveGenericLifecycleObserver;
        c1006s.f4320a = enumC1000m2;
        C1993a c1993a = this.f4323b;
        C1995c c1995cMo4522e = c1993a.mo4522e(interfaceC1004q);
        if (c1995cMo4522e != null) {
            obj = c1995cMo4522e.f8704h;
        } else {
            HashMap map2 = c1993a.f8699k;
            C1995c c1995c = new C1995c(interfaceC1004q, c1006s);
            c1993a.f8713j++;
            C1995c c1995c2 = c1993a.f8711h;
            if (c1995c2 == null) {
                c1993a.f8710g = c1995c;
                c1993a.f8711h = c1995c;
            } else {
                c1995c2.f8705i = c1995c;
                c1995c.f8706j = c1995c2;
                c1993a.f8711h = c1995c;
            }
            map2.put(interfaceC1004q, c1995c);
            obj = null;
        }
        if (((C1006s) obj) == null && (interfaceC1005r = (InterfaceC1005r) this.f4325d.get()) != null) {
            boolean z5 = this.f4326e != 0 || this.f4327f;
            EnumC1000m enumC1000mM2566b = m2566b(interfaceC1004q);
            this.f4326e++;
            while (c1006s.f4320a.compareTo(enumC1000mM2566b) < 0 && this.f4323b.f8699k.containsKey(interfaceC1004q)) {
                arrayList.add(c1006s.f4320a);
                C0997j c0997j = EnumC0999l.Companion;
                EnumC1000m enumC1000m3 = c1006s.f4320a;
                c0997j.getClass();
                AbstractC2364c.m4954e(enumC1000m3, "state");
                int iOrdinal = enumC1000m3.ordinal();
                if (iOrdinal == 1) {
                    enumC0999l = EnumC0999l.ON_CREATE;
                } else if (iOrdinal != 2) {
                    enumC0999l = iOrdinal != 3 ? null : EnumC0999l.ON_RESUME;
                } else {
                    enumC0999l = EnumC0999l.ON_START;
                }
                if (enumC0999l == null) {
                    throw new IllegalStateException("no event up from " + c1006s.f4320a);
                }
                c1006s.m2564a(interfaceC1005r, enumC0999l);
                arrayList.remove(arrayList.size() - 1);
                enumC1000mM2566b = m2566b(interfaceC1004q);
            }
            if (!z5) {
                m2572h();
            }
            this.f4326e--;
        }
    }

    /* JADX INFO: renamed from: b */
    public final EnumC1000m m2566b(InterfaceC1004q interfaceC1004q) {
        HashMap map = this.f4323b.f8699k;
        C1995c c1995c = map.containsKey(interfaceC1004q) ? ((C1995c) map.get(interfaceC1004q)).f8706j : null;
        EnumC1000m enumC1000m = c1995c != null ? ((C1006s) c1995c.f8704h).f4320a : null;
        ArrayList arrayList = this.f4329h;
        EnumC1000m enumC1000m2 = arrayList.isEmpty() ? null : (EnumC1000m) arrayList.get(arrayList.size() - 1);
        EnumC1000m enumC1000m3 = this.f4324c;
        AbstractC2364c.m4954e(enumC1000m3, "state1");
        if (enumC1000m == null || enumC1000m.compareTo(enumC1000m3) >= 0) {
            enumC1000m = enumC1000m3;
        }
        return (enumC1000m2 == null || enumC1000m2.compareTo(enumC1000m) >= 0) ? enumC1000m : enumC1000m2;
    }

    /* JADX INFO: renamed from: c */
    public final void m2567c(String str) {
        if (this.f4322a) {
            ((C1970a) C1970a.m4512D().f8599u).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0462h.m1166f("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2568d(EnumC0999l enumC0999l) {
        AbstractC2364c.m4954e(enumC0999l, "event");
        m2567c("handleLifecycleEvent");
        m2569e(enumC0999l.m2563a());
    }

    /* JADX INFO: renamed from: e */
    public final void m2569e(EnumC1000m enumC1000m) {
        EnumC1000m enumC1000m2 = this.f4324c;
        if (enumC1000m2 == enumC1000m) {
            return;
        }
        EnumC1000m enumC1000m3 = EnumC1000m.f4314h;
        EnumC1000m enumC1000m4 = EnumC1000m.f4313g;
        if (enumC1000m2 == enumC1000m3 && enumC1000m == enumC1000m4) {
            throw new IllegalStateException(("no event down from " + this.f4324c + " in component " + this.f4325d.get()).toString());
        }
        this.f4324c = enumC1000m;
        if (this.f4327f || this.f4326e != 0) {
            this.f4328g = true;
            return;
        }
        this.f4327f = true;
        m2572h();
        this.f4327f = false;
        if (this.f4324c == enumC1000m4) {
            this.f4323b = new C1993a();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2570f(InterfaceC1004q interfaceC1004q) {
        m2567c("removeObserver");
        this.f4323b.mo4523g(interfaceC1004q);
    }

    /* JADX INFO: renamed from: g */
    public final void m2571g() {
        EnumC1000m enumC1000m = EnumC1000m.f4315i;
        m2567c("setCurrentState");
        m2569e(enumC1000m);
    }

    /* JADX INFO: renamed from: h */
    public final void m2572h() {
        EnumC0999l enumC0999l;
        EnumC0999l enumC0999l2;
        InterfaceC1005r interfaceC1005r = (InterfaceC1005r) this.f4325d.get();
        if (interfaceC1005r == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C1993a c1993a = this.f4323b;
            if (c1993a.f8713j != 0) {
                C1995c c1995c = c1993a.f8710g;
                AbstractC2364c.m4951b(c1995c);
                EnumC1000m enumC1000m = ((C1006s) c1995c.f8704h).f4320a;
                C1995c c1995c2 = this.f4323b.f8711h;
                AbstractC2364c.m4951b(c1995c2);
                EnumC1000m enumC1000m2 = ((C1006s) c1995c2.f8704h).f4320a;
                if (enumC1000m == enumC1000m2 && this.f4324c == enumC1000m2) {
                    break;
                }
                this.f4328g = false;
                EnumC1000m enumC1000m3 = this.f4324c;
                C1995c c1995c3 = this.f4323b.f8710g;
                AbstractC2364c.m4951b(c1995c3);
                if (enumC1000m3.compareTo(((C1006s) c1995c3.f8704h).f4320a) < 0) {
                    C1993a c1993a2 = this.f4323b;
                    C1994b c1994b = new C1994b(c1993a2.f8711h, c1993a2.f8710g, 1);
                    c1993a2.f8712i.put(c1994b, Boolean.FALSE);
                    while (c1994b.hasNext() && !this.f4328g) {
                        Map.Entry entry = (Map.Entry) c1994b.next();
                        AbstractC2364c.m4953d(entry, "next()");
                        InterfaceC1004q interfaceC1004q = (InterfaceC1004q) entry.getKey();
                        C1006s c1006s = (C1006s) entry.getValue();
                        while (c1006s.f4320a.compareTo(this.f4324c) > 0 && !this.f4328g && this.f4323b.f8699k.containsKey(interfaceC1004q)) {
                            C0997j c0997j = EnumC0999l.Companion;
                            EnumC1000m enumC1000m4 = c1006s.f4320a;
                            c0997j.getClass();
                            AbstractC2364c.m4954e(enumC1000m4, "state");
                            int iOrdinal = enumC1000m4.ordinal();
                            if (iOrdinal == 2) {
                                enumC0999l2 = EnumC0999l.ON_DESTROY;
                            } else if (iOrdinal != 3) {
                                enumC0999l2 = iOrdinal != 4 ? null : EnumC0999l.ON_PAUSE;
                            } else {
                                enumC0999l2 = EnumC0999l.ON_STOP;
                            }
                            if (enumC0999l2 == null) {
                                throw new IllegalStateException("no event down from " + c1006s.f4320a);
                            }
                            this.f4329h.add(enumC0999l2.m2563a());
                            c1006s.m2564a(interfaceC1005r, enumC0999l2);
                            ArrayList arrayList = this.f4329h;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C1995c c1995c4 = this.f4323b.f8711h;
                if (!this.f4328g && c1995c4 != null && this.f4324c.compareTo(((C1006s) c1995c4.f8704h).f4320a) > 0) {
                    C1993a c1993a3 = this.f4323b;
                    c1993a3.getClass();
                    C1996d c1996d = new C1996d(c1993a3);
                    c1993a3.f8712i.put(c1996d, Boolean.FALSE);
                    while (c1996d.hasNext() && !this.f4328g) {
                        Map.Entry entry2 = (Map.Entry) c1996d.next();
                        InterfaceC1004q interfaceC1004q2 = (InterfaceC1004q) entry2.getKey();
                        C1006s c1006s2 = (C1006s) entry2.getValue();
                        while (c1006s2.f4320a.compareTo(this.f4324c) < 0 && !this.f4328g && this.f4323b.f8699k.containsKey(interfaceC1004q2)) {
                            this.f4329h.add(c1006s2.f4320a);
                            C0997j c0997j2 = EnumC0999l.Companion;
                            EnumC1000m enumC1000m5 = c1006s2.f4320a;
                            c0997j2.getClass();
                            AbstractC2364c.m4954e(enumC1000m5, "state");
                            int iOrdinal2 = enumC1000m5.ordinal();
                            if (iOrdinal2 == 1) {
                                enumC0999l = EnumC0999l.ON_CREATE;
                            } else if (iOrdinal2 != 2) {
                                enumC0999l = iOrdinal2 != 3 ? null : EnumC0999l.ON_RESUME;
                            } else {
                                enumC0999l = EnumC0999l.ON_START;
                            }
                            if (enumC0999l == null) {
                                throw new IllegalStateException("no event up from " + c1006s2.f4320a);
                            }
                            c1006s2.m2564a(interfaceC1005r, enumC0999l);
                            ArrayList arrayList2 = this.f4329h;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f4328g = false;
    }
}
