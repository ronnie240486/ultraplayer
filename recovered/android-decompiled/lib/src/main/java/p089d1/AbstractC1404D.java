package p089d1;

import android.media.MediaRoute2Info;
import java.util.Set;

/* JADX INFO: renamed from: d1.D */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1404D {
    /* JADX INFO: renamed from: a */
    public static void m3505a(MediaRoute2Info.Builder builder, C1442o c1442o) {
        if (c1442o.f6387a.getBoolean("isVisibilityPublic", true)) {
            builder.setVisibilityPublic();
        } else {
            builder.setVisibilityRestricted(c1442o.m3607a());
        }
    }

    /* JADX INFO: renamed from: b */
    public static Set<String> m3506b(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getDeduplicationIds();
    }

    /* JADX INFO: renamed from: c */
    public static int m3507c(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getType();
    }

    /* JADX INFO: renamed from: d */
    public static void m3508d(MediaRoute2Info.Builder builder, Set<String> set) {
        builder.setDeduplicationIds(set);
    }

    /* JADX INFO: renamed from: e */
    public static void m3509e(MediaRoute2Info.Builder builder, int i3) {
        builder.setType(i3);
    }
}
