package p160x;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import java.util.concurrent.ExecutorService;
import p157w.AbstractC2315i;

/* JADX INFO: renamed from: x.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2342a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9844a;

    /* JADX INFO: renamed from: b */
    public final ContentProviderClient f9845b;

    public C2342a(Context context, Uri uri, int i3) {
        this.f9844a = i3;
        switch (i3) {
            case 1:
                this.f9845b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
            default:
                this.f9845b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m4944a() throws Exception {
        switch (this.f9844a) {
            case 0:
                ContentProviderClient contentProviderClient = this.f9845b;
                if (contentProviderClient != null) {
                    contentProviderClient.release();
                }
                break;
            default:
                ContentProviderClient contentProviderClient2 = this.f9845b;
                if (contentProviderClient2 != 0) {
                    if (contentProviderClient2 instanceof AutoCloseable) {
                        contentProviderClient2.close();
                    } else if (!(contentProviderClient2 instanceof ExecutorService)) {
                        contentProviderClient2.release();
                    } else {
                        AbstractC2315i.m4942f((ExecutorService) contentProviderClient2);
                    }
                }
                break;
        }
    }
}
