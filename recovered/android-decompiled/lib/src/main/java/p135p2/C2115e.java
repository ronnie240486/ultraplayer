package p135p2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p123m2.C2008b;
import p123m2.C2009c;
import p123m2.InterfaceC2010d;
import p123m2.InterfaceC2011e;
import p123m2.InterfaceC2012f;
import p131o2.C2081a;
import p154u1.EnumC2299c;

/* JADX INFO: renamed from: p2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2115e implements InterfaceC2011e {

    /* JADX INFO: renamed from: f */
    public static final Charset f9145f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final C2009c f9146g;

    /* JADX INFO: renamed from: h */
    public static final C2009c f9147h;

    /* JADX INFO: renamed from: i */
    public static final C2081a f9148i;

    /* JADX INFO: renamed from: a */
    public OutputStream f9149a;

    /* JADX INFO: renamed from: b */
    public final HashMap f9150b;

    /* JADX INFO: renamed from: c */
    public final HashMap f9151c;

    /* JADX INFO: renamed from: d */
    public final C2081a f9152d;

    /* JADX INFO: renamed from: e */
    public final C2117g f9153e = new C2117g(this);

    static {
        C2111a c2111a = new C2111a(1);
        HashMap map = new HashMap();
        map.put(InterfaceC2114d.class, c2111a);
        f9146g = new C2009c("key", Collections.unmodifiableMap(new HashMap(map)));
        C2111a c2111a2 = new C2111a(2);
        HashMap map2 = new HashMap();
        map2.put(InterfaceC2114d.class, c2111a2);
        f9147h = new C2009c("value", Collections.unmodifiableMap(new HashMap(map2)));
        f9148i = new C2081a(1);
    }

    public C2115e(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, C2081a c2081a) {
        this.f9149a = byteArrayOutputStream;
        this.f9150b = map;
        this.f9151c = map2;
        this.f9152d = c2081a;
    }

    /* JADX INFO: renamed from: f */
    public static int m4650f(C2009c c2009c) {
        InterfaceC2114d interfaceC2114d = (InterfaceC2114d) ((Annotation) c2009c.f8754b.get(InterfaceC2114d.class));
        if (interfaceC2114d != null) {
            return ((C2111a) interfaceC2114d).f9141a;
        }
        throw new C2008b("Field has no @Protobuf config");
    }

    /* JADX INFO: renamed from: a */
    public final void m4651a(C2009c c2009c, int i3, boolean z3) {
        if (z3 && i3 == 0) {
            return;
        }
        InterfaceC2114d interfaceC2114d = (InterfaceC2114d) ((Annotation) c2009c.f8754b.get(InterfaceC2114d.class));
        if (interfaceC2114d == null) {
            throw new C2008b("Field has no @Protobuf config");
        }
        m4654g(((C2111a) interfaceC2114d).f9141a << 3);
        m4654g(i3);
    }

    /* JADX INFO: renamed from: b */
    public final void m4652b(C2009c c2009c, Object obj, boolean z3) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z3 && charSequence.length() == 0) {
                return;
            }
            m4654g((m4650f(c2009c) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f9145f);
            m4654g(bytes.length);
            this.f9149a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m4652b(c2009c, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m4653e(f9148i, c2009c, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z3 && dDoubleValue == 0.0d) {
                return;
            }
            m4654g((m4650f(c2009c) << 3) | 1);
            this.f9149a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z3 && fFloatValue == 0.0f) {
                return;
            }
            m4654g((m4650f(c2009c) << 3) | 5);
            this.f9149a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z3 && jLongValue == 0) {
                return;
            }
            InterfaceC2114d interfaceC2114d = (InterfaceC2114d) ((Annotation) c2009c.f8754b.get(InterfaceC2114d.class));
            if (interfaceC2114d == null) {
                throw new C2008b("Field has no @Protobuf config");
            }
            m4654g(((C2111a) interfaceC2114d).f9141a << 3);
            m4655h(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            m4651a(c2009c, ((Boolean) obj).booleanValue() ? 1 : 0, z3);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z3 && bArr.length == 0) {
                return;
            }
            m4654g((m4650f(c2009c) << 3) | 2);
            m4654g(bArr.length);
            this.f9149a.write(bArr);
            return;
        }
        InterfaceC2010d interfaceC2010d = (InterfaceC2010d) this.f9150b.get(obj.getClass());
        if (interfaceC2010d != null) {
            m4653e(interfaceC2010d, c2009c, obj, z3);
            return;
        }
        InterfaceC2012f interfaceC2012f = (InterfaceC2012f) this.f9151c.get(obj.getClass());
        if (interfaceC2012f != null) {
            C2117g c2117g = this.f9153e;
            c2117g.f9155a = false;
            c2117g.f9157c = c2009c;
            c2117g.f9156b = z3;
            interfaceC2012f.mo4565a(obj, c2117g);
            return;
        }
        if (obj instanceof EnumC2299c) {
            m4651a(c2009c, ((EnumC2299c) obj).f9816g, true);
        } else if (obj instanceof Enum) {
            m4651a(c2009c, ((Enum) obj).ordinal(), true);
        } else {
            m4653e(this.f9152d, c2009c, obj, z3);
        }
    }

    @Override // p123m2.InterfaceC2011e
    /* JADX INFO: renamed from: c */
    public final InterfaceC2011e mo4567c(C2009c c2009c, long j3) throws IOException {
        if (j3 == 0) {
            return this;
        }
        InterfaceC2114d interfaceC2114d = (InterfaceC2114d) ((Annotation) c2009c.f8754b.get(InterfaceC2114d.class));
        if (interfaceC2114d == null) {
            throw new C2008b("Field has no @Protobuf config");
        }
        m4654g(((C2111a) interfaceC2114d).f9141a << 3);
        m4655h(j3);
        return this;
    }

    @Override // p123m2.InterfaceC2011e
    /* JADX INFO: renamed from: d */
    public final InterfaceC2011e mo4568d(C2009c c2009c, Object obj) {
        m4652b(c2009c, obj, true);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m4653e(InterfaceC2010d interfaceC2010d, C2009c c2009c, Object obj, boolean z3) throws IOException {
        C2112b c2112b = new C2112b();
        c2112b.f9142g = 0L;
        try {
            OutputStream outputStream = this.f9149a;
            this.f9149a = c2112b;
            try {
                interfaceC2010d.mo4565a(obj, this);
                this.f9149a = outputStream;
                long j3 = c2112b.f9142g;
                c2112b.close();
                if (z3 && j3 == 0) {
                    return;
                }
                m4654g((m4650f(c2009c) << 3) | 2);
                m4655h(j3);
                interfaceC2010d.mo4565a(obj, this);
            } catch (Throwable th) {
                this.f9149a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c2112b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m4654g(int i3) throws IOException {
        while ((i3 & (-128)) != 0) {
            this.f9149a.write((i3 & 127) | 128);
            i3 >>>= 7;
        }
        this.f9149a.write(i3 & 127);
    }

    /* JADX INFO: renamed from: h */
    public final void m4655h(long j3) throws IOException {
        while (((-128) & j3) != 0) {
            this.f9149a.write((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        this.f9149a.write(((int) j3) & 127);
    }
}
