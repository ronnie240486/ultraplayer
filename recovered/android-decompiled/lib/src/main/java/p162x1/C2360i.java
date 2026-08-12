package p162x1;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.media.session.C0858A;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p011E.C0111d;
import p019G1.AbstractC0230e;
import p034L1.C0352g;
import p046P1.C0475c;
import p082b0.C1061b;
import p099g0.C1577g;
import p113k.C1866h1;
import p126n1.C2047b;
import p130o1.C2079a;
import p130o1.C2080b;
import p134p1.C2095h;
import p134p1.C2096i;
import p134p1.C2097j;
import p134p1.C2098k;
import p134p1.C2099l;
import p134p1.C2101n;
import p134p1.EnumC2107t;
import p134p1.EnumC2108u;
import p134p1.EnumC2110w;
import p138q1.AbstractC2178n;
import p138q1.C2172h;
import p138q1.C2174j;
import p138q1.C2176l;
import p142r1.C2196a;
import p142r1.C2201f;
import p142r1.InterfaceC2202g;
import p154u1.C2297a;
import p154u1.EnumC2299c;
import p166y1.C2377b;
import p166y1.C2380e;
import p166y1.C2383h;
import p166y1.InterfaceC2378c;
import p166y1.InterfaceC2379d;
import p169z1.InterfaceC2390b;
import p169z1.InterfaceC2391c;

/* JADX INFO: renamed from: x1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2360i {

    /* JADX INFO: renamed from: a */
    public final Context f9906a;

    /* JADX INFO: renamed from: b */
    public final C2201f f9907b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2379d f9908c;

    /* JADX INFO: renamed from: d */
    public final C2354c f9909d;

    /* JADX INFO: renamed from: e */
    public final Executor f9910e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2391c f9911f;

    /* JADX INFO: renamed from: g */
    public final C0352g f9912g;

    /* JADX INFO: renamed from: h */
    public final C0352g f9913h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2378c f9914i;

    public C2360i(Context context, C2201f c2201f, InterfaceC2379d interfaceC2379d, C2354c c2354c, Executor executor, InterfaceC2391c interfaceC2391c, C0352g c0352g, C0352g c0352g2, InterfaceC2378c interfaceC2378c) {
        this.f9906a = context;
        this.f9907b = c2201f;
        this.f9908c = interfaceC2379d;
        this.f9909d = c2354c;
        this.f9910e = executor;
        this.f9911f = interfaceC2391c;
        this.f9912g = c0352g;
        this.f9913h = c0352g2;
        this.f9914i = interfaceC2378c;
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0424  */
    /* JADX WARN: Code duplicated, block: B:129:0x0437  */
    /* JADX WARN: Code duplicated, block: B:131:0x043f  */
    /* JADX WARN: Code duplicated, block: B:133:0x044c  */
    /* JADX WARN: Code duplicated, block: B:135:0x044f  */
    /* JADX WARN: Code duplicated, block: B:138:0x045e  */
    /* JADX WARN: Code duplicated, block: B:162:0x040c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x0478 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x046e A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final void m4949a(final C2174j c2174j, int i3) {
        InterfaceC2202g interfaceC2202g;
        long j3;
        C2196a c2196a;
        String str;
        int i4;
        C1577g c1577gM550h;
        C2196a c2196a2;
        String str2;
        Integer numValueOf;
        C2097j c2097j;
        C1866h1 c1866h1;
        int i5;
        HashMap map;
        Iterator it;
        String str3;
        final C2360i c2360i = this;
        final C2174j c2174j2 = c2174j;
        final int i6 = 0;
        final int i7 = 1;
        InterfaceC2202g interfaceC2202gM4777a = c2360i.f9907b.m4777a(c2174j2.f9391a);
        long jMax = 0;
        while (true) {
            InterfaceC2390b interfaceC2390b = new InterfaceC2390b(c2360i) { // from class: x1.f

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C2360i f9897h;

                {
                    this.f9897h = c2360i;
                }

                @Override // p169z1.InterfaceC2390b
                /* JADX INFO: renamed from: e */
                public final Object mo548e() {
                    Boolean bool;
                    switch (i6) {
                        case 0:
                            C2174j c2174j3 = c2174j2;
                            C2383h c2383h = (C2383h) this.f9897h.f9908c;
                            SQLiteDatabase sQLiteDatabaseM4970a = c2383h.m4970a();
                            sQLiteDatabaseM4970a.beginTransaction();
                            try {
                                Long lM4967b = C2383h.m4967b(sQLiteDatabaseM4970a, c2174j3);
                                if (lM4967b == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = c2383h.m4970a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM4967b.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseM4970a.setTransactionSuccessful();
                                sQLiteDatabaseM4970a.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseM4970a.endTransaction();
                                throw th2;
                            }
                        default:
                            C2383h c2383h2 = (C2383h) this.f9897h.f9908c;
                            c2383h2.getClass();
                            return (Iterable) c2383h2.m4971c(new C1061b(c2383h2, 7, c2174j2));
                    }
                }
            };
            C2383h c2383h = (C2383h) c2360i.f9911f;
            if (!((Boolean) c2383h.m4973e(interfaceC2390b)).booleanValue()) {
                c2383h.m4973e(new C2359h(jMax, c2360i, c2174j2));
                return;
            }
            final Iterable iterable = (Iterable) c2383h.m4973e(new InterfaceC2390b(c2360i) { // from class: x1.f

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ C2360i f9897h;

                {
                    this.f9897h = c2360i;
                }

                @Override // p169z1.InterfaceC2390b
                /* JADX INFO: renamed from: e */
                public final Object mo548e() {
                    Boolean bool;
                    switch (i7) {
                        case 0:
                            C2174j c2174j3 = c2174j2;
                            C2383h c2383h2 = (C2383h) this.f9897h.f9908c;
                            SQLiteDatabase sQLiteDatabaseM4970a = c2383h2.m4970a();
                            sQLiteDatabaseM4970a.beginTransaction();
                            try {
                                Long lM4967b = C2383h.m4967b(sQLiteDatabaseM4970a, c2174j3);
                                if (lM4967b == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = c2383h2.m4970a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lM4967b.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseM4970a.setTransactionSuccessful();
                                sQLiteDatabaseM4970a.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseM4970a.endTransaction();
                                throw th2;
                            }
                        default:
                            C2383h c2383h3 = (C2383h) this.f9897h.f9908c;
                            c2383h3.getClass();
                            return (Iterable) c2383h3.m4971c(new C1061b(c2383h3, 7, c2174j2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            byte[] bArr = c2174j2.f9392b;
            if (interfaceC2202gM4777a == null) {
                AbstractC0230e.m734l("Uploader", "Unknown backend for %s, deleting event batch for it...", c2174j2);
                c2196a = new C2196a(3, -1L);
                interfaceC2202g = interfaceC2202gM4777a;
                j3 = jMax;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C2377b) it2.next()).f9964c);
                }
                if (bArr != null) {
                    InterfaceC2378c interfaceC2378c = c2360i.f9914i;
                    Objects.requireNonNull(interfaceC2378c);
                    C2297a c2297a = (C2297a) c2383h.m4973e(new C0111d(24, interfaceC2378c));
                    C0475c c0475c = new C0475c();
                    c0475c.f1572e = new HashMap();
                    c0475c.f1569b = Long.valueOf(c2360i.f9912g.m969D());
                    c0475c.f1571d = Long.valueOf(c2360i.f9913h.m969D());
                    c0475c.f1570c = "GDT_CLIENT_METRICS";
                    C2047b c2047b = new C2047b("proto");
                    c2297a.getClass();
                    C0858A c0858a = AbstractC2178n.f9402a;
                    c0858a.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        c0858a.m2182w(c2297a, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    c0475c.f1568a = new C2176l(c2047b, byteArrayOutputStream.toByteArray());
                    arrayList.add(((C2080b) interfaceC2202gM4777a).m4644a(c0475c.m1194d()));
                }
                C2080b c2080b = (C2080b) interfaceC2202gM4777a;
                HashMap map2 = new HashMap();
                int size = arrayList.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList.get(i8);
                    i8++;
                    C2172h c2172h = (C2172h) obj;
                    String str4 = c2172h.f9381a;
                    if (map2.containsKey(str4)) {
                        ((List) map2.get(str4)).add(c2172h);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(c2172h);
                        map2.put(str4, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = map2.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    C2172h c2172h2 = (C2172h) ((List) entry.getValue()).get(0);
                    EnumC2110w enumC2110w = EnumC2110w.f9139g;
                    long jM969D = c2080b.f9040f.m969D();
                    long jM969D2 = c2080b.f9039e.m969D();
                    C2097j c2097j2 = new C2097j(new C2095h(Integer.valueOf(c2172h2.m4757b("sdk-version")), c2172h2.m4756a("model"), c2172h2.m4756a("hardware"), c2172h2.m4756a("device"), c2172h2.m4756a("product"), c2172h2.m4756a("os-uild"), c2172h2.m4756a("manufacturer"), c2172h2.m4756a("fingerprint"), c2172h2.m4756a("locale"), c2172h2.m4756a("country"), c2172h2.m4756a("mcc_mnc"), c2172h2.m4756a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = ((List) entry.getValue()).iterator();
                    while (it4.hasNext()) {
                        Iterator it5 = it3;
                        C2172h c2172h3 = (C2172h) it4.next();
                        C2176l c2176l = c2172h3.f9383c;
                        Iterator it6 = it4;
                        C2047b c2047b2 = c2176l.f9399a;
                        InterfaceC2202g interfaceC2202g2 = interfaceC2202gM4777a;
                        boolean zEquals = c2047b2.equals(new C2047b("proto"));
                        byte[] bArr2 = c2176l.f9400b;
                        if (zEquals) {
                            c1866h1 = new C1866h1();
                            c1866h1.f8186j = bArr2;
                            c2097j = c2097j2;
                        } else {
                            c2097j = c2097j2;
                            if (c2047b2.equals(new C2047b("json"))) {
                                String str5 = new String(bArr2, Charset.forName("UTF-8"));
                                C1866h1 c1866h2 = new C1866h1();
                                c1866h2.f8187k = str5;
                                c1866h1 = c1866h2;
                            } else {
                                Log.w("TransportRuntime.".concat("CctTransportBackend"), "Received event of unsupported encoding " + c2047b2 + ". Skipping...");
                            }
                            it4 = it6;
                            c2097j2 = c2097j;
                            it3 = it5;
                            interfaceC2202gM4777a = interfaceC2202g2;
                            jMax = jMax;
                        }
                        c1866h1.f8183g = Long.valueOf(c2172h3.f9384d);
                        c1866h1.f8185i = Long.valueOf(c2172h3.f9385e);
                        String str6 = (String) c2172h3.f9386f.get("tz-offset");
                        c1866h1.f8188l = Long.valueOf(str6 == null ? 0L : Long.valueOf(str6).longValue());
                        c1866h1.f8189m = new C2101n((EnumC2108u) EnumC2108u.f9137g.get(c2172h3.m4757b("net-type")), (EnumC2107t) EnumC2107t.f9135g.get(c2172h3.m4757b("mobile-subtype")));
                        Integer num = c2172h3.f9382b;
                        if (num != null) {
                            c1866h1.f8184h = num;
                        }
                        String strConcat = ((Long) c1866h1.f8183g) == null ? " eventTimeMs" : "";
                        if (((Long) c1866h1.f8185i) == null) {
                            strConcat = strConcat.concat(" eventUptimeMs");
                        }
                        if (((Long) c1866h1.f8188l) == null) {
                            strConcat = strConcat + " timezoneOffsetSeconds";
                        }
                        if (!strConcat.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strConcat));
                        }
                        arrayList4.add(new C2098k(((Long) c1866h1.f8183g).longValue(), (Integer) c1866h1.f8184h, ((Long) c1866h1.f8185i).longValue(), (byte[]) c1866h1.f8186j, (String) c1866h1.f8187k, ((Long) c1866h1.f8188l).longValue(), (C2101n) c1866h1.f8189m));
                        it4 = it6;
                        c2097j2 = c2097j;
                        it3 = it5;
                        interfaceC2202gM4777a = interfaceC2202g2;
                        jMax = jMax;
                    }
                    arrayList3.add(new C2099l(jM969D, jM969D2, c2097j2, numValueOf, str2, arrayList4));
                    it3 = it3;
                    interfaceC2202gM4777a = interfaceC2202gM4777a;
                    jMax = jMax;
                }
                interfaceC2202g = interfaceC2202gM4777a;
                j3 = jMax;
                C2096i c2096i = new C2096i(arrayList3);
                URL urlM4643b = c2080b.f9038d;
                if (bArr != null) {
                    try {
                        C2079a c2079aM4642a = C2079a.m4642a(bArr);
                        str = c2079aM4642a.f9034b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = c2079aM4642a.f9033a;
                        if (str7 != null) {
                            urlM4643b = C2080b.m4643b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        c2196a = new C2196a(3, -1L);
                        i4 = 2;
                    }
                } else {
                    str = null;
                }
                try {
                    C0858A c0858a2 = new C0858A(urlM4643b, c2096i, str, 27);
                    C0111d c0111d = new C0111d(22, c2080b);
                    int i9 = 5;
                    do {
                        c1577gM550h = c0111d.m550h(c0858a2);
                        URL url = (URL) c1577gM550h.f7164c;
                        if (url != null) {
                            AbstractC0230e.m734l("CctTransportBackend", "Following redirect to: %s", url);
                            try {
                                c0858a2 = new C0858A(url, (C2096i) c0858a2.f3640i, (String) c0858a2.f3641j, 27);
                            } catch (IOException e3) {
                                e = e3;
                                Log.e("TransportRuntime.".concat("CctTransportBackend"), "Could not make request to the backend", e);
                                i4 = 2;
                                c2196a = new C2196a(2, -1L);
                                i5 = c2196a.f9477a;
                                if (i5 == i4) {
                                    final long j4 = j3;
                                    c2383h.m4973e(new InterfaceC2390b() { // from class: x1.g
                                        @Override // p169z1.InterfaceC2390b
                                        /* JADX INFO: renamed from: e */
                                        public final Object mo548e() {
                                            C2360i c2360i2 = this.f9899g;
                                            C2383h c2383h2 = (C2383h) c2360i2.f9908c;
                                            c2383h2.getClass();
                                            Iterable iterable2 = iterable;
                                            if (iterable2.iterator().hasNext()) {
                                                String str8 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + C2383h.m4968f(iterable2);
                                                SQLiteDatabase sQLiteDatabaseM4970a = c2383h2.m4970a();
                                                sQLiteDatabaseM4970a.beginTransaction();
                                                try {
                                                    sQLiteDatabaseM4970a.compileStatement(str8).execute();
                                                    Cursor cursorRawQuery = sQLiteDatabaseM4970a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                                                    while (cursorRawQuery.moveToNext()) {
                                                        try {
                                                            c2383h2.m4972d(cursorRawQuery.getInt(0), EnumC2299c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                                                        } catch (Throwable th) {
                                                            cursorRawQuery.close();
                                                            throw th;
                                                        }
                                                    }
                                                    cursorRawQuery.close();
                                                    sQLiteDatabaseM4970a.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                                                    sQLiteDatabaseM4970a.setTransactionSuccessful();
                                                    sQLiteDatabaseM4970a.endTransaction();
                                                } catch (Throwable th2) {
                                                    sQLiteDatabaseM4970a.endTransaction();
                                                    throw th2;
                                                }
                                            }
                                            c2383h2.m4971c(new C2380e(c2360i2.f9912g.m969D() + j4, c2174j));
                                            return null;
                                        }
                                    });
                                    this.f9909d.m4948a(c2174j, i3 + 1, true);
                                    return;
                                }
                                c2360i = this;
                                c2174j2 = c2174j;
                                jMax = j3;
                                c2383h.m4973e(new C1061b(c2360i, 5, iterable));
                                if (i5 == 1) {
                                    jMax = Math.max(jMax, c2196a.f9478b);
                                    if (bArr != null) {
                                        c2383h.m4973e(new C0111d(26, c2360i));
                                    }
                                } else {
                                    if (i5 == 4) {
                                        map = new HashMap();
                                        it = iterable.iterator();
                                        while (it.hasNext()) {
                                            str3 = ((C2377b) it.next()).f9964c.f9381a;
                                            if (map.containsKey(str3)) {
                                                map.put(str3, Integer.valueOf(((Integer) map.get(str3)).intValue() + 1));
                                            } else {
                                                map.put(str3, 1);
                                            }
                                        }
                                        c2383h.m4973e(new C1061b(c2360i, 6, map));
                                    }
                                    interfaceC2202gM4777a = interfaceC2202g;
                                    i6 = 0;
                                    i7 = 1;
                                }
                                interfaceC2202gM4777a = interfaceC2202g;
                                i6 = 0;
                                i7 = 1;
                            }
                        } else {
                            c0858a2 = null;
                        }
                        if (c0858a2 == null) {
                            break;
                        } else {
                            i9--;
                        }
                    } while (i9 >= 1);
                    int i10 = c1577gM550h.f7162a;
                    if (i10 == 200) {
                        c2196a = new C2196a(1, c1577gM550h.f7163b);
                    } else {
                        if (i10 >= 500 || i10 == 404) {
                            c2196a2 = new C2196a(2, -1L);
                        } else if (i10 == 400) {
                            try {
                                c2196a2 = new C2196a(4, -1L);
                            } catch (IOException e4) {
                                e = e4;
                                Log.e("TransportRuntime.".concat("CctTransportBackend"), "Could not make request to the backend", e);
                                i4 = 2;
                                c2196a = new C2196a(2, -1L);
                            }
                        } else {
                            c2196a2 = new C2196a(3, -1L);
                        }
                        c2196a = c2196a2;
                    }
                    i4 = 2;
                } catch (IOException e5) {
                    e = e5;
                }
                i5 = c2196a.f9477a;
                if (i5 == i4) {
                    final long j5 = j3;
                    c2383h.m4973e(new InterfaceC2390b() { // from class: x1.g
                        @Override // p169z1.InterfaceC2390b
                        /* JADX INFO: renamed from: e */
                        public final Object mo548e() {
                            C2360i c2360i2 = this.f9899g;
                            C2383h c2383h2 = (C2383h) c2360i2.f9908c;
                            c2383h2.getClass();
                            Iterable iterable2 = iterable;
                            if (iterable2.iterator().hasNext()) {
                                String str8 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + C2383h.m4968f(iterable2);
                                SQLiteDatabase sQLiteDatabaseM4970a = c2383h2.m4970a();
                                sQLiteDatabaseM4970a.beginTransaction();
                                try {
                                    sQLiteDatabaseM4970a.compileStatement(str8).execute();
                                    Cursor cursorRawQuery = sQLiteDatabaseM4970a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                                    while (cursorRawQuery.moveToNext()) {
                                        try {
                                            c2383h2.m4972d(cursorRawQuery.getInt(0), EnumC2299c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                                        } catch (Throwable th) {
                                            cursorRawQuery.close();
                                            throw th;
                                        }
                                    }
                                    cursorRawQuery.close();
                                    sQLiteDatabaseM4970a.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                                    sQLiteDatabaseM4970a.setTransactionSuccessful();
                                    sQLiteDatabaseM4970a.endTransaction();
                                } catch (Throwable th2) {
                                    sQLiteDatabaseM4970a.endTransaction();
                                    throw th2;
                                }
                            }
                            c2383h2.m4971c(new C2380e(c2360i2.f9912g.m969D() + j5, c2174j));
                            return null;
                        }
                    });
                    this.f9909d.m4948a(c2174j, i3 + 1, true);
                    return;
                }
                c2360i = this;
                c2174j2 = c2174j;
                jMax = j3;
                c2383h.m4973e(new C1061b(c2360i, 5, iterable));
                if (i5 == 1) {
                    jMax = Math.max(jMax, c2196a.f9478b);
                    if (bArr != null) {
                        c2383h.m4973e(new C0111d(26, c2360i));
                    }
                } else {
                    if (i5 == 4) {
                        map = new HashMap();
                        it = iterable.iterator();
                        while (it.hasNext()) {
                            str3 = ((C2377b) it.next()).f9964c.f9381a;
                            if (map.containsKey(str3)) {
                                map.put(str3, 1);
                            } else {
                                map.put(str3, Integer.valueOf(((Integer) map.get(str3)).intValue() + 1));
                            }
                        }
                        c2383h.m4973e(new C1061b(c2360i, 6, map));
                    }
                    interfaceC2202gM4777a = interfaceC2202g;
                    i6 = 0;
                    i7 = 1;
                }
                interfaceC2202gM4777a = interfaceC2202g;
                i6 = 0;
                i7 = 1;
            }
            i4 = 2;
            i5 = c2196a.f9477a;
            if (i5 == i4) {
                final long j6 = j3;
                c2383h.m4973e(new InterfaceC2390b() { // from class: x1.g
                    @Override // p169z1.InterfaceC2390b
                    /* JADX INFO: renamed from: e */
                    public final Object mo548e() {
                        C2360i c2360i2 = this.f9899g;
                        C2383h c2383h2 = (C2383h) c2360i2.f9908c;
                        c2383h2.getClass();
                        Iterable iterable2 = iterable;
                        if (iterable2.iterator().hasNext()) {
                            String str8 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + C2383h.m4968f(iterable2);
                            SQLiteDatabase sQLiteDatabaseM4970a = c2383h2.m4970a();
                            sQLiteDatabaseM4970a.beginTransaction();
                            try {
                                sQLiteDatabaseM4970a.compileStatement(str8).execute();
                                Cursor cursorRawQuery = sQLiteDatabaseM4970a.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                                while (cursorRawQuery.moveToNext()) {
                                    try {
                                        c2383h2.m4972d(cursorRawQuery.getInt(0), EnumC2299c.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                cursorRawQuery.close();
                                sQLiteDatabaseM4970a.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                                sQLiteDatabaseM4970a.setTransactionSuccessful();
                                sQLiteDatabaseM4970a.endTransaction();
                            } catch (Throwable th2) {
                                sQLiteDatabaseM4970a.endTransaction();
                                throw th2;
                            }
                        }
                        c2383h2.m4971c(new C2380e(c2360i2.f9912g.m969D() + j6, c2174j));
                        return null;
                    }
                });
                this.f9909d.m4948a(c2174j, i3 + 1, true);
                return;
            }
            c2360i = this;
            c2174j2 = c2174j;
            jMax = j3;
            c2383h.m4973e(new C1061b(c2360i, 5, iterable));
            if (i5 == 1) {
                jMax = Math.max(jMax, c2196a.f9478b);
                if (bArr != null) {
                    c2383h.m4973e(new C0111d(26, c2360i));
                }
            } else {
                if (i5 == 4) {
                    map = new HashMap();
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        str3 = ((C2377b) it.next()).f9964c.f9381a;
                        if (map.containsKey(str3)) {
                            map.put(str3, 1);
                        } else {
                            map.put(str3, Integer.valueOf(((Integer) map.get(str3)).intValue() + 1));
                        }
                    }
                    c2383h.m4973e(new C1061b(c2360i, 6, map));
                }
                interfaceC2202gM4777a = interfaceC2202g;
                i6 = 0;
                i7 = 1;
            }
            interfaceC2202gM4777a = interfaceC2202g;
            i6 = 0;
            i7 = 1;
        }
    }
}
