package p131o2;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p123m2.C2008b;
import p123m2.C2009c;
import p123m2.InterfaceC2010d;
import p123m2.InterfaceC2011e;
import p123m2.InterfaceC2012f;
import p123m2.InterfaceC2013g;

/* JADX INFO: renamed from: o2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2085e implements InterfaceC2011e, InterfaceC2013g {

    /* JADX INFO: renamed from: a */
    public final boolean f9053a = true;

    /* JADX INFO: renamed from: b */
    public final JsonWriter f9054b;

    /* JADX INFO: renamed from: c */
    public final HashMap f9055c;

    /* JADX INFO: renamed from: d */
    public final HashMap f9056d;

    /* JADX INFO: renamed from: e */
    public final C2081a f9057e;

    /* JADX INFO: renamed from: f */
    public final boolean f9058f;

    public C2085e(BufferedWriter bufferedWriter, HashMap map, HashMap map2, C2081a c2081a, boolean z3) {
        this.f9054b = new JsonWriter(bufferedWriter);
        this.f9055c = map;
        this.f9056d = map2;
        this.f9057e = c2081a;
        this.f9058f = z3;
    }

    @Override // p123m2.InterfaceC2013g
    /* JADX INFO: renamed from: a */
    public final InterfaceC2013g mo4569a(String str) throws IOException {
        m4648g();
        this.f9054b.value(str);
        return this;
    }

    @Override // p123m2.InterfaceC2013g
    /* JADX INFO: renamed from: b */
    public final InterfaceC2013g mo4570b(boolean z3) throws IOException {
        m4648g();
        this.f9054b.value(z3);
        return this;
    }

    @Override // p123m2.InterfaceC2011e
    /* JADX INFO: renamed from: c */
    public final InterfaceC2011e mo4567c(C2009c c2009c, long j3) throws IOException {
        String str = c2009c.f8753a;
        m4648g();
        JsonWriter jsonWriter = this.f9054b;
        jsonWriter.name(str);
        m4648g();
        jsonWriter.value(j3);
        return this;
    }

    @Override // p123m2.InterfaceC2011e
    /* JADX INFO: renamed from: d */
    public final InterfaceC2011e mo4568d(C2009c c2009c, Object obj) throws IOException {
        m4647f(obj, c2009c.f8753a);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final C2085e m4646e(Object obj) throws IOException {
        int i3 = 0;
        JsonWriter jsonWriter = this.f9054b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    m4646e(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        m4647f(entry.getValue(), (String) key);
                    } catch (ClassCastException e3) {
                        throw new C2008b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e3);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            InterfaceC2010d interfaceC2010d = (InterfaceC2010d) this.f9055c.get(obj.getClass());
            if (interfaceC2010d != null) {
                jsonWriter.beginObject();
                interfaceC2010d.mo4565a(obj, this);
                jsonWriter.endObject();
                return this;
            }
            InterfaceC2012f interfaceC2012f = (InterfaceC2012f) this.f9056d.get(obj.getClass());
            if (interfaceC2012f != null) {
                interfaceC2012f.mo4565a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                jsonWriter.beginObject();
                this.f9057e.mo4565a(obj, this);
                throw null;
            }
            String strName = ((Enum) obj).name();
            m4648g();
            jsonWriter.value(strName);
            return this;
        }
        if (obj instanceof byte[]) {
            m4648g();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i3 < length) {
                jsonWriter.value(iArr[i3]);
                i3++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i3 < length2) {
                long j3 = jArr[i3];
                m4648g();
                jsonWriter.value(j3);
                i3++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i3 < length3) {
                jsonWriter.value(dArr[i3]);
                i3++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i3 < length4) {
                jsonWriter.value(zArr[i3]);
                i3++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i3 < length5) {
                m4646e(numberArr[i3]);
                i3++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i3 < length6) {
                m4646e(objArr[i3]);
                i3++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final C2085e m4647f(Object obj, String str) throws IOException {
        boolean z3 = this.f9058f;
        JsonWriter jsonWriter = this.f9054b;
        if (z3) {
            if (obj == null) {
                return this;
            }
            m4648g();
            jsonWriter.name(str);
            m4646e(obj);
            return this;
        }
        m4648g();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        m4646e(obj);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final void m4648g() {
        if (!this.f9053a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
