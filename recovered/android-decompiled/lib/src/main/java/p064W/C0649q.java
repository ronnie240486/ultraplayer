package p064W;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.mediarouter.app.DialogC1037f;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import p085c0.C1126b;
import p085c0.C1129e;
import p089d1.C1427a0;
import p091e.AbstractC1495z;

/* JADX INFO: renamed from: W.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0649q extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2510a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2511b;

    public /* synthetic */ C0649q(int i3, Object obj) {
        this.f2510a = i3;
        this.f2511b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0072  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x007b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0081  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:44:0x008c  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i3;
        switch (this.f2510a) {
            case 0:
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    i3 = 0;
                } else {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        i3 = 1;
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type == 0) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i3 = 3;
                                        break;
                                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i3 = 4;
                                        break;
                                    case 13:
                                        i3 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i3 = 6;
                                        break;
                                    case 18:
                                        i3 = 2;
                                        break;
                                    case 20:
                                        if (AbstractC0632A.f2454a >= 29) {
                                            i3 = 0;
                                        } else {
                                            i3 = 9;
                                        }
                                        break;
                                }
                            } else if (type == 1) {
                                i3 = 2;
                            } else if (type == 4 || type == 5) {
                                switch (activeNetworkInfo.getSubtype()) {
                                    case 1:
                                    case 2:
                                        i3 = 3;
                                        break;
                                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 14:
                                    case 15:
                                    case 17:
                                        i3 = 4;
                                        break;
                                    case 13:
                                        i3 = 5;
                                        break;
                                    case 16:
                                    case 19:
                                    default:
                                        i3 = 6;
                                        break;
                                    case 18:
                                        i3 = 2;
                                        break;
                                    case 20:
                                        if (AbstractC0632A.f2454a >= 29) {
                                            i3 = 0;
                                        } else {
                                            i3 = 9;
                                        }
                                        break;
                                }
                            } else if (type != 6) {
                                i3 = type != 9 ? 8 : 7;
                            } else {
                                i3 = 5;
                            }
                        }
                    } catch (SecurityException unused) {
                    }
                }
                int i4 = AbstractC0632A.f2454a;
                C0650r c0650r = (C0650r) this.f2511b;
                if (i4 < 31 || i3 != 5) {
                    C0650r.m1651a(i3, c0650r);
                } else {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        telephonyManager.getClass();
                        C0648p c0648p = new C0648p(c0650r);
                        telephonyManager.registerTelephonyCallback(context.getMainExecutor(), c0648p);
                        telephonyManager.unregisterTelephonyCallback(c0648p);
                    } catch (RuntimeException unused2) {
                        C0650r.m1651a(5, c0650r);
                        return;
                    }
                }
                break;
            case 1:
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((DialogC1037f) this.f2511b).dismiss();
                }
                break;
            case 2:
                if (!isInitialStickyBroadcast()) {
                    C1129e c1129e = (C1129e) this.f2511b;
                    c1129e.m3009a(C1126b.m3006c(context, intent, c1129e.f5241i, c1129e.f5240h));
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                ((C1427a0) this.f2511b).m3569c();
                break;
            default:
                ((AbstractC1495z) this.f2511b).mo3736g();
                break;
        }
    }
}
