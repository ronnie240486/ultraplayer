package p075Z1;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;

/* JADX INFO: renamed from: Z1.e */
/* JADX INFO: loaded from: classes.dex */
public class HandlerC0784e extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0784e(Looper looper, int i3) {
        super(looper);
        switch (i3) {
            case 1:
                super(looper);
                Looper.getMainLooper();
                break;
            case 2:
            default:
                Looper.getMainLooper();
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                super(looper);
                Looper.getMainLooper();
                break;
        }
    }
}
