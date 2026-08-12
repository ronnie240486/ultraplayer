package p028J1;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import p045P0.AbstractC0462h;
import p046P1.AbstractC0491s;

/* JADX INFO: renamed from: J1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0296b {

    /* JADX INFO: renamed from: a */
    public final String f788a;

    /* JADX INFO: renamed from: b */
    public final boolean f789b;

    /* JADX INFO: renamed from: c */
    public final String f790c;

    public C0296b(String str, String str2) {
        AbstractC0491s.m1212d(str, "The log tag cannot be null or empty.");
        this.f788a = str;
        this.f789b = str.length() <= 23;
        this.f790c = TextUtils.isEmpty(str2) ? null : AbstractC0462h.m1166f("[", str2, "] ");
    }

    /* JADX INFO: renamed from: a */
    public final void m830a(Exception exc, String str, Object... objArr) {
        if (Build.TYPE.equals("user") || !this.f789b) {
            return;
        }
        String str2 = this.f788a;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, m833d(str, objArr), exc);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m831b(String str, Object... objArr) {
        if (Build.TYPE.equals("user") || !this.f789b) {
            return;
        }
        String str2 = this.f788a;
        if (Log.isLoggable(str2, 3)) {
            Log.d(str2, m833d(str, objArr));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m832c(Object... objArr) {
        Log.e(this.f788a, m833d("Bundle is null", objArr));
    }

    /* JADX INFO: renamed from: d */
    public final String m833d(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(Locale.ROOT, str, objArr);
        }
        String str2 = this.f790c;
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return String.valueOf(str2).concat(String.valueOf(str));
    }
}
