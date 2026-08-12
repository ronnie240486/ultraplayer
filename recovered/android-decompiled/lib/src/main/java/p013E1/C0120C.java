package p013E1;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import p028J1.C0314t;
import p028J1.C0318x;
import p028J1.C0319y;
import p037M1.InterfaceC0390c;
import p037M1.InterfaceC0394g;
import p037M1.InterfaceC0395h;
import p040N1.C0435p;
import p046P1.AbstractC0491s;
import p046P1.C0475c;
import p046P1.C0483k;
import p051R1.C0524c;
import p094e2.C1523a;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: E1.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0120C extends AbstractC2003a {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f169f;

    @Override // p122m1.AbstractC2003a
    /* JADX INFO: renamed from: a */
    public InterfaceC0390c mo558a(Context context, Looper looper, C0475c c0475c, Object obj, InterfaceC0394g interfaceC0394g, InterfaceC0395h interfaceC0395h) {
        switch (this.f169f) {
            case 0:
                C0130e c0130e = (C0130e) obj;
                AbstractC0491s.m1214f(c0130e, "Setting the API options is required.");
                return new C0319y(context, looper, c0475c, c0130e.f240b, 0, c0130e.f242d, c0130e.f243e, (C0435p) interfaceC0394g, (C0435p) interfaceC0395h);
            case 1:
                C0130e c0130e2 = (C0130e) obj;
                AbstractC0491s.m1214f(c0130e2, "Setting the API options is required.");
                return new C0318x(context, looper, c0475c, c0130e2.f240b, 0, c0130e2.f241c, c0130e2.f242d, (C0435p) interfaceC0394g, (C0435p) interfaceC0395h);
            case 2:
                return new C0314t(context, looper, 161, c0475c, interfaceC0394g, interfaceC0395h);
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
            default:
                return super.mo558a(context, looper, c0475c, obj, interfaceC0394g, interfaceC0395h);
            case 4:
                c0475c.getClass();
                Integer num = (Integer) c0475c.f1573f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new C1523a(context, looper, c0475c, bundle, interfaceC0394g, interfaceC0395h);
            case 5:
                obj.getClass();
                throw new ClassCastException();
        }
    }

    @Override // p122m1.AbstractC2003a
    /* JADX INFO: renamed from: b */
    public /* synthetic */ InterfaceC0390c mo559b(Context context, Looper looper, C0475c c0475c, Object obj, C0435p c0435p, C0435p c0435p2) {
        switch (this.f169f) {
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C0524c(context, looper, c0475c, (C0483k) obj, c0435p, c0435p2);
            default:
                return super.mo559b(context, looper, c0475c, obj, c0435p, c0435p2);
        }
    }
}
