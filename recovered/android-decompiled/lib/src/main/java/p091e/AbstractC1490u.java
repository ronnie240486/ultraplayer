package p091e;

import android.os.PowerManager;
import java.util.Locale;

/* JADX INFO: renamed from: e.u */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1490u {
    /* JADX INFO: renamed from: a */
    public static boolean m3720a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    /* JADX INFO: renamed from: b */
    public static String m3721b(Locale locale) {
        return locale.toLanguageTag();
    }
}
