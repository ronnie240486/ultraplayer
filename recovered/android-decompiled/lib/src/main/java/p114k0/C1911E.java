package p114k0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005B1.AbstractC0099a;
import p019G1.AbstractC0230e;
import p036M0.C0380q;
import p046P1.C0475c;
import p053S0.C0536b;
import p064W.InterfaceC0636d;
import p126n1.C2047b;
import p138q1.C2172h;
import p138q1.C2174j;
import p138q1.C2176l;
import p154u1.C2297a;
import p154u1.C2298b;
import p154u1.C2300d;
import p154u1.C2301e;
import p154u1.C2302f;
import p154u1.C2303g;
import p154u1.EnumC2299c;
import p158w1.C2318a;
import p166y1.C2376a;
import p166y1.C2377b;
import p166y1.C2383h;
import p166y1.InterfaceC2381f;
import p169z1.InterfaceC2390b;

/* JADX INFO: renamed from: k0.E */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1911E implements InterfaceC0636d, InterfaceC2390b, InterfaceC2381f {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8325g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f8326h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f8327i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f8328j;

    public /* synthetic */ C1911E(Object obj, Object obj2, Object obj3, int i3) {
        this.f8325g = i3;
        this.f8326h = obj;
        this.f8327i = obj2;
        this.f8328j = obj3;
    }

    @Override // p166y1.InterfaceC2381f
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        EnumC2299c enumC2299c;
        EnumC2299c enumC2299c2;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        EnumC2299c enumC2299c3 = EnumC2299c.CACHE_FULL;
        int i6 = 2;
        Object obj2 = this.f8328j;
        int i7 = 0;
        Object obj3 = this.f8327i;
        Object obj4 = this.f8326h;
        int i8 = 1;
        switch (this.f8325g) {
            case 2:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                C2383h c2383h = (C2383h) obj4;
                long jSimpleQueryForLong = c2383h.m4970a().compileStatement("PRAGMA page_size").simpleQueryForLong() * c2383h.m4970a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C2376a c2376a = c2383h.f9973j;
                long j3 = c2376a.f9957a;
                C2172h c2172h = (C2172h) obj3;
                String str = c2172h.f9381a;
                if (jSimpleQueryForLong >= j3) {
                    c2383h.m4972d(1L, enumC2299c3, str);
                    return -1L;
                }
                C2174j c2174j = (C2174j) obj2;
                Long lM4967b = C2383h.m4967b(sQLiteDatabase, c2174j);
                if (lM4967b != null) {
                    jInsert = lM4967b.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", c2174j.f9391a);
                    contentValues.put("priority", Integer.valueOf(AbstractC0099a.m495a(c2174j.f9393c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = c2174j.f9392b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                C2176l c2176l = c2172h.f9383c;
                byte[] bArr2 = c2176l.f9400b;
                int length = bArr2.length;
                int i9 = c2376a.f9961e;
                boolean z3 = length <= i9;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(c2172h.f9384d));
                contentValues2.put("uptime_ms", Long.valueOf(c2172h.f9385e));
                contentValues2.put("payload_encoding", c2176l.f9399a.f8920a);
                contentValues2.put("code", c2172h.f9382b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z3));
                contentValues2.put("payload", z3 ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z3) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i9));
                    for (int i10 = 1; i10 <= iCeil; i10++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i10 - 1) * i9, Math.min(i10 * i9, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i10));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(c2172h.f9386f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                Cursor cursor2 = (Cursor) obj;
                C2383h c2383h2 = (C2383h) obj4;
                c2383h2.getClass();
                while (cursor2.moveToNext()) {
                    long j4 = cursor2.getLong(0);
                    boolean z4 = cursor2.getInt(7) != 0;
                    C0475c c0475c = new C0475c();
                    c0475c.f1572e = new HashMap();
                    String string = cursor2.getString(i8);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    c0475c.f1570c = string;
                    c0475c.f1569b = Long.valueOf(cursor2.getLong(i6));
                    c0475c.f1571d = Long.valueOf(cursor2.getLong(3));
                    if (z4) {
                        String string2 = cursor2.getString(4);
                        c0475c.f1568a = new C2176l(string2 == null ? C2383h.f9969l : new C2047b(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        C2047b c2047b = string3 == null ? C2383h.f9969l : new C2047b(string3);
                        Cursor cursorQuery = c2383h2.m4970a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j4)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList = new ArrayList();
                            int length2 = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList.add(blob);
                                length2 += blob.length;
                            }
                            byte[] bArr3 = new byte[length2];
                            int i11 = 0;
                            int length3 = 0;
                            while (i11 < arrayList.size()) {
                                byte[] bArr4 = (byte[]) arrayList.get(i11);
                                cursor = cursorQuery;
                                try {
                                    ArrayList arrayList2 = arrayList;
                                    System.arraycopy(bArr4, 0, bArr3, length3, bArr4.length);
                                    length3 += bArr4.length;
                                    i11++;
                                    cursorQuery = cursor;
                                    arrayList = arrayList2;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            cursorQuery.close();
                            c0475c.f1568a = new C2176l(c2047b, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        c0475c.f1573f = Integer.valueOf(cursor2.getInt(6));
                    }
                    ((ArrayList) obj3).add(new C2377b(j4, (C2174j) obj2, c0475c.m1194d()));
                    i6 = 2;
                    i8 = 1;
                }
                return null;
            default:
                Cursor cursor3 = (Cursor) obj;
                C2383h c2383h3 = (C2383h) obj4;
                c2383h3.getClass();
                while (true) {
                    HashMap map = (HashMap) obj3;
                    if (cursor3.moveToNext()) {
                        String string4 = cursor3.getString(i7);
                        int i12 = cursor3.getInt(1);
                        EnumC2299c enumC2299c4 = EnumC2299c.REASON_UNKNOWN;
                        if (i12 != 0) {
                            if (i12 == 1) {
                                enumC2299c4 = EnumC2299c.MESSAGE_TOO_OLD;
                            } else if (i12 == 2) {
                                enumC2299c = enumC2299c3;
                                enumC2299c2 = enumC2299c;
                            } else if (i12 == i5) {
                                enumC2299c4 = EnumC2299c.PAYLOAD_TOO_BIG;
                            } else if (i12 == i4) {
                                enumC2299c4 = EnumC2299c.MAX_RETRIES_REACHED;
                            } else if (i12 == i3) {
                                enumC2299c4 = EnumC2299c.INVALID_PAYLOD;
                            } else if (i12 == 6) {
                                enumC2299c4 = EnumC2299c.SERVER_ERROR;
                            } else {
                                AbstractC0230e.m734l("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i12));
                            }
                            enumC2299c2 = enumC2299c3;
                            enumC2299c = enumC2299c4;
                        } else {
                            enumC2299c2 = enumC2299c3;
                            enumC2299c = enumC2299c4;
                        }
                        long j5 = cursor3.getLong(2);
                        if (!map.containsKey(string4)) {
                            map.put(string4, new ArrayList());
                        }
                        ((List) map.get(string4)).add(new C2300d(j5, enumC2299c));
                        enumC2299c3 = enumC2299c2;
                        i3 = 5;
                        i4 = 4;
                        i5 = 3;
                        i7 = 0;
                    } else {
                        Iterator it = map.entrySet().iterator();
                        while (true) {
                            C0536b c0536b = (C0536b) obj2;
                            if (!it.hasNext()) {
                                long jM969D = c2383h3.f9971h.m969D();
                                SQLiteDatabase sQLiteDatabaseM4970a = c2383h3.m4970a();
                                sQLiteDatabaseM4970a.beginTransaction();
                                try {
                                    Cursor cursorRawQuery = sQLiteDatabaseM4970a.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                                    try {
                                        cursorRawQuery.moveToNext();
                                        C2303g c2303g = new C2303g(cursorRawQuery.getLong(0), jM969D);
                                        cursorRawQuery.close();
                                        sQLiteDatabaseM4970a.setTransactionSuccessful();
                                        sQLiteDatabaseM4970a.endTransaction();
                                        c0536b.f1867g = c2303g;
                                        c0536b.f1869i = new C2298b(new C2302f(c2383h3.m4970a().compileStatement("PRAGMA page_size").simpleQueryForLong() * c2383h3.m4970a().compileStatement("PRAGMA page_count").simpleQueryForLong(), C2376a.f9956f.f9957a));
                                        c0536b.f1870j = (String) c2383h3.f9974k.get();
                                        return new C2297a((C2303g) c0536b.f1867g, Collections.unmodifiableList((ArrayList) c0536b.f1868h), (C2298b) c0536b.f1869i, (String) c0536b.f1870j);
                                    } catch (Throwable th3) {
                                        cursorRawQuery.close();
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    sQLiteDatabaseM4970a.endTransaction();
                                    throw th4;
                                }
                            }
                            Map.Entry entry2 = (Map.Entry) it.next();
                            int i13 = C2301e.f9819c;
                            new ArrayList();
                            ((ArrayList) c0536b.f1868h).add(new C2301e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                        }
                    }
                }
                break;
        }
    }

    @Override // p064W.InterfaceC0636d
    /* JADX INFO: renamed from: b */
    public void mo545b(Object obj) {
        ((InterfaceC1913G) obj).mo2044x(((C0380q) this.f8326h).f1291h, (C1907A) this.f8327i, (C1963w) this.f8328j);
    }

    @Override // p169z1.InterfaceC2390b
    /* JADX INFO: renamed from: e */
    public Object mo548e() {
        C2318a c2318a = (C2318a) this.f8326h;
        C2383h c2383h = (C2383h) c2318a.f9842d;
        c2383h.getClass();
        C2174j c2174j = (C2174j) this.f8327i;
        C2172h c2172h = (C2172h) this.f8328j;
        Log.d("TransportRuntime.".concat("SQLiteEventStore"), "Storing event with priority=" + c2174j.f9393c + ", name=" + c2172h.f9381a + " for destination " + c2174j.f9391a);
        ((Long) c2383h.m4971c(new C1911E(c2383h, c2172h, c2174j, 2))).getClass();
        c2318a.f9839a.m4948a(c2174j, 1, false);
        return null;
    }
}
