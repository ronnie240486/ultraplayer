package p140r;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: r.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2181a {
    /* JADX INFO: renamed from: a */
    public static File m4764a(Context context) {
        return context.getCodeCacheDir();
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m4765b(Context context, int i3) {
        return context.getDrawable(i3);
    }

    /* JADX INFO: renamed from: c */
    public static File m4766c(Context context) {
        return context.getNoBackupFilesDir();
    }
}
