package p166y1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import p005B1.AbstractC0099a;
import p034L1.C0352g;
import p126n1.C2047b;
import p138q1.C2174j;
import p146s1.InterfaceC2254a;
import p154u1.EnumC2299c;
import p162x1.C2359h;
import p169z1.C2389a;
import p169z1.InterfaceC2390b;
import p169z1.InterfaceC2391c;

/* JADX INFO: renamed from: y1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2383h implements InterfaceC2379d, InterfaceC2391c, InterfaceC2378c, AutoCloseable {

    /* JADX INFO: renamed from: l */
    public static final C2047b f9969l = new C2047b("proto");

    /* JADX INFO: renamed from: g */
    public final C2385j f9970g;

    /* JADX INFO: renamed from: h */
    public final C0352g f9971h;

    /* JADX INFO: renamed from: i */
    public final C0352g f9972i;

    /* JADX INFO: renamed from: j */
    public final C2376a f9973j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC2254a f9974k;

    public C2383h(C0352g c0352g, C0352g c0352g2, C2376a c2376a, C2385j c2385j, InterfaceC2254a interfaceC2254a) {
        this.f9970g = c2385j;
        this.f9971h = c0352g;
        this.f9972i = c0352g2;
        this.f9973j = c2376a;
        this.f9974k = interfaceC2254a;
    }

    /* JADX INFO: renamed from: b */
    public static Long m4967b(SQLiteDatabase sQLiteDatabase, C2174j c2174j) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(c2174j.f9391a, String.valueOf(AbstractC0099a.m495a(c2174j.f9393c))));
        byte[] bArr = c2174j.f9392b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m4968f(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C2377b) it.next()).f9962a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static Object m4969g(Cursor cursor, InterfaceC2381f interfaceC2381f) {
        try {
            return interfaceC2381f.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: renamed from: a */
    public final SQLiteDatabase m4970a() {
        C2385j c2385j = this.f9970g;
        Objects.requireNonNull(c2385j);
        C0352g c0352g = this.f9972i;
        long jM969D = c0352g.m969D();
        while (true) {
            try {
                return c2385j.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e3) {
                if (c0352g.m969D() >= ((long) this.f9973j.f9959c) + jM969D) {
                    throw new C2389a("Timed out while trying to open db.", e3);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final Object m4971c(InterfaceC2381f interfaceC2381f) {
        SQLiteDatabase sQLiteDatabaseM4970a = m4970a();
        sQLiteDatabaseM4970a.beginTransaction();
        try {
            Object objApply = interfaceC2381f.apply(sQLiteDatabaseM4970a);
            sQLiteDatabaseM4970a.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseM4970a.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f9970g.close();
    }

    /* JADX INFO: renamed from: d */
    public final void m4972d(long j3, EnumC2299c enumC2299c, String str) {
        m4971c(new C2359h(j3, str, enumC2299c));
    }

    /* JADX INFO: renamed from: e */
    public final Object m4973e(InterfaceC2390b interfaceC2390b) {
        SQLiteDatabase sQLiteDatabaseM4970a = m4970a();
        C0352g c0352g = this.f9972i;
        long jM969D = c0352g.m969D();
        while (true) {
            try {
                sQLiteDatabaseM4970a.beginTransaction();
                try {
                    Object objMo548e = interfaceC2390b.mo548e();
                    sQLiteDatabaseM4970a.setTransactionSuccessful();
                    return objMo548e;
                } finally {
                    sQLiteDatabaseM4970a.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e3) {
                if (c0352g.m969D() >= ((long) this.f9973j.f9959c) + jM969D) {
                    throw new C2389a("Timed out while trying to acquire the lock.", e3);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
