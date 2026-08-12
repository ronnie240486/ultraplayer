package com.zuxoplayer.app;

import android.util.Log;
import android.widget.TextView;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import p038N.AbstractC0402b;
import p055T.C0539B;
import p055T.InterfaceC0553P;
import p083b1.C1095e;
import p105h2.AbstractC1676G;

/* JADX INFO: renamed from: com.zuxoplayer.app.m */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1373m implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6091g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ PlayerActivity f6092h;

    public /* synthetic */ RunnableC1373m(PlayerActivity playerActivity, int i3) {
        this.f6091g = i3;
        this.f6092h = playerActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView;
        boolean z3;
        TextView textView2;
        PlayerActivity playerActivity = this.f6092h;
        switch (this.f6091g) {
            case 0:
                if (playerActivity.f6054k0 == 0 && (textView = playerActivity.f6057n0) != null) {
                    textView.setVisibility(8);
                    break;
                }
                break;
            case 1:
                TextView textView3 = playerActivity.f6052i0;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                break;
            case 2:
                InterfaceC0553P interfaceC0553P = playerActivity.f6021D;
                if (interfaceC0553P != null && !playerActivity.f6055l0) {
                    try {
                        long jMo1291M = interfaceC0553P.mo1291M();
                        C0539B c0539bM1347a = playerActivity.f6021D == playerActivity.f6023F ? playerActivity.f6028K : playerActivity.f6027J;
                        if (c0539bM1347a == null) {
                            c0539bM1347a = C0539B.m1347a(playerActivity.f6056m0);
                        }
                        if ("live".equals(playerActivity.f6032O) || jMo1291M <= 0) {
                            AbstractC0402b abstractC0402b = (AbstractC0402b) playerActivity.f6021D;
                            abstractC0402b.getClass();
                            abstractC0402b.mo1290L(AbstractC1676G.m4120r(c0539bM1347a));
                        } else {
                            AbstractC0402b abstractC0402b2 = (AbstractC0402b) playerActivity.f6021D;
                            abstractC0402b2.getClass();
                            abstractC0402b2.mo1293O(AbstractC1676G.m4120r(c0539bM1347a), 0, jMo1291M);
                        }
                        playerActivity.f6021D.mo1295b();
                        ((AbstractC0402b) playerActivity.f6021D).mo1308i(true);
                    } catch (Throwable th) {
                        Log.e("HDXNativePlayer", "re-tentativa falhou: " + th);
                        return;
                    }
                    break;
                }
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                playerActivity.finish();
                break;
            case 4:
                int i3 = PlayerActivity.f6018C0;
                playerActivity.m3455v(false);
                break;
            case 5:
                InterfaceC0553P interfaceC0553P2 = playerActivity.f6021D;
                if (interfaceC0553P2 != null) {
                    long jMo1099u = interfaceC0553P2.mo1099u();
                    long jMo1291M2 = playerActivity.f6021D.mo1291M();
                    long jMo1098s = playerActivity.f6021D.mo1098s();
                    z3 = jMo1099u != -9223372036854775807L && jMo1099u > 0;
                    C1095e c1095e = playerActivity.f6064u0;
                    if (c1095e != null) {
                        c1095e.setDuration(z3 ? jMo1099u : 0L);
                        if (!playerActivity.f6066w0) {
                            playerActivity.f6064u0.setPosition(Math.max(0L, jMo1291M2));
                        }
                        playerActivity.f6064u0.setBufferedPosition(Math.max(0L, jMo1098s));
                    }
                    if (!playerActivity.f6066w0 && (textView2 = playerActivity.f6062s0) != null) {
                        textView2.setText(PlayerActivity.m3451s(jMo1291M2 / 1000));
                    }
                    TextView textView4 = playerActivity.f6063t0;
                    if (textView4 != null) {
                        textView4.setText(z3 ? PlayerActivity.m3451s(jMo1099u / 1000) : "--:--");
                    }
                    playerActivity.m3459z();
                }
                playerActivity.f6046c0.postDelayed(this, 500L);
                break;
            case 6:
                int i4 = PlayerActivity.f6018C0;
                playerActivity.m3454u(false);
                playerActivity.f6046c0.postDelayed(this, 10000L);
                break;
            default:
                InterfaceC0553P interfaceC0553P3 = playerActivity.f6021D;
                if (interfaceC0553P3 != null && playerActivity.f6031N != null) {
                    long jMo1099u2 = interfaceC0553P3.mo1099u();
                    long jMo1291M3 = jMo1099u2 - playerActivity.f6021D.mo1291M();
                    z3 = jMo1099u2 != -9223372036854775807L && jMo1099u2 > 0 && jMo1291M3 <= 60000 && jMo1291M3 > 1500;
                    if (z3 && playerActivity.f6031N.getVisibility() != 0) {
                        playerActivity.f6031N.setVisibility(0);
                        if (playerActivity.f6048e0) {
                            playerActivity.f6031N.requestFocus();
                        }
                    } else if (!z3 && playerActivity.f6031N.getVisibility() == 0) {
                        playerActivity.f6031N.setVisibility(8);
                    }
                }
                playerActivity.f6046c0.postDelayed(this, 1000L);
                break;
        }
    }
}
