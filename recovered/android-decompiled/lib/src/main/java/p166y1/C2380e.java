package p166y1;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import p005B1.AbstractC0099a;
import p126n1.EnumC2048c;
import p138q1.C2174j;

/* JADX INFO: renamed from: y1.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2380e implements InterfaceC2381f {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f9965g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2174j f9966h;

    public /* synthetic */ C2380e(long j3, C2174j c2174j) {
        this.f9965g = j3;
        this.f9966h = c2174j;
    }

    @Override // p166y1.InterfaceC2381f
    public final Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f9965g));
        C2174j c2174j = this.f9966h;
        String str = c2174j.f9391a;
        EnumC2048c enumC2048c = c2174j.f9393c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC0099a.m495a(enumC2048c))}) < 1) {
            contentValues.put("backend_name", c2174j.f9391a);
            contentValues.put("priority", Integer.valueOf(AbstractC0099a.m495a(enumC2048c)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }
}
