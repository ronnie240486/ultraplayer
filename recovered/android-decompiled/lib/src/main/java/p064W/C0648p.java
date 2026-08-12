package p064W;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: renamed from: W.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0648p extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: a */
    public final C0650r f2509a;

    public C0648p(C0650r c0650r) {
        this.f2509a = c0650r;
    }

    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        boolean z3 = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        C0650r.m1651a(z3 ? 10 : 5, this.f2509a);
    }
}
