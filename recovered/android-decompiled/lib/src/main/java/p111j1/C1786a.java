package p111j1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.zuxoplayer.app.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p049Q1.C0513b;
import p066W1.AbstractC0664e;

/* JADX INFO: renamed from: j1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1786a {

    /* JADX INFO: renamed from: d */
    public static volatile C1786a f7974d;

    /* JADX INFO: renamed from: e */
    public static final Object f7975e = new Object();

    /* JADX INFO: renamed from: c */
    public final Context f7978c;

    /* JADX INFO: renamed from: b */
    public final HashSet f7977b = new HashSet();

    /* JADX INFO: renamed from: a */
    public final HashMap f7976a = new HashMap();

    public C1786a(Context context) {
        this.f7978c = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: c */
    public static C1786a m4276c(Context context) {
        if (f7974d == null) {
            synchronized (f7975e) {
                try {
                    if (f7974d == null) {
                        f7974d = new C1786a(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f7974d;
    }

    /* JADX INFO: renamed from: a */
    public final void m4277a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f7978c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f7977b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC1787b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m4278b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e3) {
                throw new C0513b(e3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m4278b(Class cls, HashSet hashSet) {
        Object objMo2385b;
        if (AbstractC0664e.m1721D()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f7976a;
        if (map.containsKey(cls)) {
            objMo2385b = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC1787b interfaceC1787b = (InterfaceC1787b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listMo2384a = interfaceC1787b.mo2384a();
                if (!listMo2384a.isEmpty()) {
                    for (Class cls2 : listMo2384a) {
                        if (!map.containsKey(cls2)) {
                            m4278b(cls2, hashSet);
                        }
                    }
                }
                objMo2385b = interfaceC1787b.mo2385b(this.f7978c);
                hashSet.remove(cls);
                map.put(cls, objMo2385b);
            } catch (Throwable th2) {
                throw new C0513b(th2);
            }
        }
        Trace.endSection();
        return objMo2385b;
    }
}
