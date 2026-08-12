package p085c0;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: renamed from: c0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1128d extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final ContentResolver f5230a;

    /* JADX INFO: renamed from: b */
    public final Uri f5231b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1129e f5232c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1128d(C1129e c1129e, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f5232c = c1129e;
        this.f5230a = contentResolver;
        this.f5231b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        C1129e c1129e = this.f5232c;
        c1129e.m3009a(C1126b.m3005b(c1129e.f5233a, c1129e.f5241i, c1129e.f5240h));
    }
}
