package p162x1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import p138q1.C2174j;
import p154u1.EnumC2299c;
import p166y1.C2380e;
import p166y1.C2383h;
import p166y1.InterfaceC2381f;
import p169z1.InterfaceC2390b;

/* JADX INFO: renamed from: x1.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2359h implements InterfaceC2390b, InterfaceC2381f {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f9903g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f9904h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f9905i;

    public /* synthetic */ C2359h(long j3, Object obj, Object obj2) {
        this.f9904h = obj;
        this.f9905i = obj2;
        this.f9903g = j3;
    }

    @Override // p166y1.InterfaceC2381f
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i3 = ((EnumC2299c) this.f9905i).f9816g;
        String string = Integer.toString(i3);
        String str = (String) this.f9904h;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, string});
        try {
            boolean z3 = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j3 = this.f9903g;
            if (z3) {
                sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j3 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i3)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i3));
            contentValues.put("events_dropped_count", Long.valueOf(j3));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // p169z1.InterfaceC2390b
    /* JADX INFO: renamed from: e */
    public Object mo548e() {
        C2360i c2360i = (C2360i) this.f9904h;
        long jM969D = c2360i.f9912g.m969D() + this.f9903g;
        C2383h c2383h = (C2383h) c2360i.f9908c;
        C2174j c2174j = (C2174j) this.f9905i;
        c2383h.getClass();
        c2383h.m4971c(new C2380e(jM969D, c2174j));
        return null;
    }
}
