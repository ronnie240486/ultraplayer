package p036M0;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import p064W.C0651s;
import p067X.C0671c;

/* JADX INFO: renamed from: M0.g */
/* JADX INFO: loaded from: classes.dex */
public class C0370g implements InterfaceC0366c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1185a = 2;

    /* JADX INFO: renamed from: b */
    public int f1186b;

    /* JADX INFO: renamed from: c */
    public int f1187c;

    /* JADX INFO: renamed from: d */
    public int f1188d;

    /* JADX INFO: renamed from: e */
    public int f1189e;

    /* JADX INFO: renamed from: f */
    public Object f1190f;

    public /* synthetic */ C0370g() {
    }

    /* JADX INFO: renamed from: f */
    private final synchronized String m1019f() {
        int i3;
        int i4;
        int i5;
        try {
            i3 = this.f1188d;
            i4 = this.f1189e;
            int i6 = i3 + i4;
            i5 = i6 != 0 ? (i3 * 100) / i6 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f1187c + ",hits=" + i3 + ",misses=" + i4 + ",hitRate=" + i5 + "%]";
    }

    @Override // p036M0.InterfaceC0366c
    /* JADX INFO: renamed from: a */
    public int mo1005a() {
        return -1;
    }

    @Override // p036M0.InterfaceC0366c
    /* JADX INFO: renamed from: b */
    public int mo1006b() {
        return this.f1186b;
    }

    @Override // p036M0.InterfaceC0366c
    /* JADX INFO: renamed from: c */
    public int mo1007c() {
        C0651s c0651s = (C0651s) this.f1190f;
        int i3 = this.f1187c;
        if (i3 == 8) {
            return c0651s.m1687u();
        }
        if (i3 == 16) {
            return c0651s.m1659A();
        }
        int i4 = this.f1188d;
        this.f1188d = i4 + 1;
        if (i4 % 2 != 0) {
            return this.f1189e & 15;
        }
        int iM1687u = c0651s.m1687u();
        this.f1189e = iM1687u;
        return (iM1687u & 240) >> 4;
    }

    /* JADX INFO: renamed from: d */
    public Object m1020d(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = ((LinkedHashMap) this.f1190f).get(obj);
                if (obj2 != null) {
                    this.f1188d++;
                    return obj2;
                }
                this.f1189e++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public Object m1021e(Object obj, Object obj2) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f1186b++;
                objPut = ((LinkedHashMap) this.f1190f).put(obj, obj2);
                if (objPut != null) {
                    this.f1186b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m1022g(this.f1187c);
        return objPut;
    }

    /* JADX INFO: renamed from: g */
    public void m1022g(int i3) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.f1186b < 0 || (((LinkedHashMap) this.f1190f).isEmpty() && this.f1186b != 0)) {
                        break;
                    }
                    if (this.f1186b > i3 && !((LinkedHashMap) this.f1190f).isEmpty()) {
                        Map.Entry entry = (Map.Entry) ((LinkedHashMap) this.f1190f).entrySet().iterator().next();
                        Object key = entry.getKey();
                        entry.getValue();
                        ((LinkedHashMap) this.f1190f).remove(key);
                        this.f1186b--;
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public synchronized String toString() {
        switch (this.f1185a) {
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return m1019f();
            default:
                return super.toString();
        }
    }

    public C0370g(int i3) {
        if (i3 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1187c = i3;
        this.f1190f = new LinkedHashMap(0, 0.75f, true);
    }

    public C0370g(int i3, int i4, int i5, int i6, int i7, byte[] bArr) {
        this.f1186b = i4;
        this.f1187c = i5;
        this.f1188d = i6;
        this.f1189e = i7;
        this.f1190f = bArr;
    }

    public C0370g(C0671c c0671c) {
        C0651s c0651s = c0671c.f2571i;
        this.f1190f = c0651s;
        c0651s.m1665G(12);
        this.f1187c = c0651s.m1691y() & 255;
        this.f1186b = c0651s.m1691y();
    }
}
