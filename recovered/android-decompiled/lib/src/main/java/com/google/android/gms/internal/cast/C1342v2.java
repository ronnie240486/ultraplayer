package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.util.Log;
import java.nio.charset.Charset;
import p016F1.AbstractC0191h;
import p016F1.C0185b;
import p016F1.C0187d;
import p016F1.InterfaceC0193j;
import p028J1.C0296b;
import p046P1.AbstractC0491s;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.v2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1342v2 implements InterfaceC0193j {

    /* JADX INFO: renamed from: h */
    public static final C1274e2 f5982h = new C1274e2(1);

    /* JADX INFO: renamed from: g */
    public final Object f5983g;

    public C1342v2(C1260b0 c1260b0) {
        this.f5983g = c1260b0;
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: a */
    public void mo681a(AbstractC0191h abstractC0191h, int i3) {
        C1260b0.f5797j.m831b("onSessionSuspended with reason = %d", Integer.valueOf(i3));
        C1260b0 c1260b0 = (C1260b0) this.f5983g;
        c1260b0.f5805h = (C0187d) abstractC0191h;
        c1260b0.m3238c();
        AbstractC0491s.m1213e(c1260b0.f5804g);
        c1260b0.f5798a.m3180a(c1260b0.f5800c.m3245a(c1260b0.f5804g, i3), 225);
        C1260b0.m3237b(c1260b0);
        c1260b0.f5802e.removeCallbacks(c1260b0.f5801d);
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void mo682b(AbstractC0191h abstractC0191h, int i3) {
        C1260b0 c1260b0 = (C1260b0) this.f5983g;
        c1260b0.f5805h = (C0187d) abstractC0191h;
        C1260b0.m3236a(c1260b0, i3);
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ void mo683c(AbstractC0191h abstractC0191h, int i3) {
        C1260b0 c1260b0 = (C1260b0) this.f5983g;
        c1260b0.f5805h = (C0187d) abstractC0191h;
        C1260b0.m3236a(c1260b0, i3);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:23:0x00c1  */
    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: d */
    public void mo684d(AbstractC0191h abstractC0191h, String str) {
        C1264c0 c1264c0;
        C0187d c0187d;
        boolean z3 = false;
        C0296b c0296b = C1260b0.f5797j;
        c0296b.m831b("onSessionResuming with sessionId = %s", str);
        C1260b0 c1260b0 = (C1260b0) this.f5983g;
        c1260b0.f5805h = (C0187d) abstractC0191h;
        SharedPreferences sharedPreferences = c1260b0.f5803f;
        if (c1260b0.m3242g(str)) {
            c0296b.m831b("Use the existing ApplicationAnalyticsSession if it is available and valid.", new Object[0]);
            AbstractC0491s.m1213e(c1260b0.f5804g);
        } else {
            BinderC1263c binderC1263c = c1260b0.f5799b;
            if (sharedPreferences == null) {
                C0296b c0296b2 = C1264c0.f5811k;
            } else {
                c1264c0 = new C1264c0(binderC1263c);
                c1264c0.f5821i = sharedPreferences.getBoolean("is_output_switcher_enabled", false);
                if (sharedPreferences.contains("application_id")) {
                    c1264c0.f5814b = sharedPreferences.getString("application_id", "");
                    if (sharedPreferences.contains("receiver_metrics_id")) {
                        c1264c0.f5815c = sharedPreferences.getString("receiver_metrics_id", "");
                        if (sharedPreferences.contains("analytics_session_id")) {
                            c1264c0.f5816d = sharedPreferences.getLong("analytics_session_id", 0L);
                            if (sharedPreferences.contains("event_sequence_number")) {
                                c1264c0.f5817e = sharedPreferences.getInt("event_sequence_number", 0);
                                if (sharedPreferences.contains("receiver_session_id")) {
                                    c1264c0.f5818f = sharedPreferences.getString("receiver_session_id", "");
                                    c1264c0.f5819g = sharedPreferences.getInt("device_capabilities", 0);
                                    c1264c0.f5820h = sharedPreferences.getString("device_model_name", "");
                                    c1264c0.f5822j = sharedPreferences.getInt("analytics_session_start_type", 0);
                                }
                            }
                        }
                    }
                }
                c1260b0.f5804g = c1264c0;
                if (c1260b0.m3242g(str)) {
                    c0296b.m831b("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                    AbstractC0491s.m1213e(c1260b0.f5804g);
                    C1264c0.f5812l = c1260b0.f5804g.f5816d + 1;
                } else {
                    c0296b.m831b("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                    C1264c0 c1264c1 = new C1264c0(binderC1263c);
                    C1264c0.f5812l++;
                    c1260b0.f5804g = c1264c1;
                    c0187d = c1260b0.f5805h;
                    if (c0187d != null && c0187d.f460g.f5958h) {
                        z3 = true;
                    }
                    c1264c1.f5821i = z3;
                    C0296b c0296b3 = C0185b.f423k;
                    AbstractC0491s.m1210b();
                    C0185b c0185b = C0185b.f425m;
                    AbstractC0491s.m1213e(c0185b);
                    AbstractC0491s.m1210b();
                    c1264c1.f5814b = c0185b.f430e.f439g;
                    C1264c0 c1264c2 = c1260b0.f5804g;
                    AbstractC0491s.m1213e(c1264c2);
                    c1264c2.f5818f = str;
                }
            }
            c1264c0 = null;
            c1260b0.f5804g = c1264c0;
            if (c1260b0.m3242g(str)) {
                c0296b.m831b("Use the restored ApplicationAnalyticsSession if it is valid.", new Object[0]);
                AbstractC0491s.m1213e(c1260b0.f5804g);
                C1264c0.f5812l = c1260b0.f5804g.f5816d + 1;
            } else {
                c0296b.m831b("The restored ApplicationAnalyticsSession is not valid, create a new one.", new Object[0]);
                C1264c0 c1264c3 = new C1264c0(binderC1263c);
                C1264c0.f5812l++;
                c1260b0.f5804g = c1264c3;
                c0187d = c1260b0.f5805h;
                if (c0187d != null) {
                    z3 = true;
                }
                c1264c3.f5821i = z3;
                C0296b c0296b4 = C0185b.f423k;
                AbstractC0491s.m1210b();
                C0185b c0185b2 = C0185b.f425m;
                AbstractC0491s.m1213e(c0185b2);
                AbstractC0491s.m1210b();
                c1264c3.f5814b = c0185b2.f430e.f439g;
                C1264c0 c1264c4 = c1260b0.f5804g;
                AbstractC0491s.m1213e(c1264c4);
                c1264c4.f5818f = str;
            }
        }
        AbstractC0491s.m1213e(c1260b0.f5804g);
        C1324r0 c1324r0M3246b = c1260b0.f5800c.m3246b(c1260b0.f5804g);
        C1304m0 c1304m0M3335m = C1308n0.m3335m(c1324r0M3246b.m3393d());
        c1304m0M3335m.m3256c();
        C1308n0.m3340r((C1308n0) c1304m0M3335m.f5902h, 10);
        c1324r0M3246b.m3394e((C1308n0) c1304m0M3335m.m3254a());
        C1304m0 c1304m0M3335m2 = C1308n0.m3335m(c1324r0M3246b.m3393d());
        c1304m0M3335m2.m3256c();
        C1308n0.m3338p((C1308n0) c1304m0M3335m2.f5902h, true);
        c1324r0M3246b.m3256c();
        C1328s0.m3398p((C1328s0) c1324r0M3246b.f5902h, (C1308n0) c1304m0M3335m2.m3254a());
        c1260b0.f5798a.m3180a((C1328s0) c1324r0M3246b.m3254a(), 226);
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: e */
    public void mo685e(AbstractC0191h abstractC0191h, String str) {
        C1260b0.f5797j.m831b("onSessionStarted with sessionId = %s", str);
        C1260b0 c1260b0 = (C1260b0) this.f5983g;
        c1260b0.f5805h = (C0187d) abstractC0191h;
        c1260b0.m3238c();
        C1264c0 c1264c0 = c1260b0.f5804g;
        c1264c0.f5818f = str;
        c1260b0.f5798a.m3180a((C1328s0) c1260b0.f5800c.m3246b(c1264c0).m3254a(), 222);
        C1260b0.m3237b(c1260b0);
        c1260b0.m3240e();
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: f */
    public void mo686f(AbstractC0191h abstractC0191h, boolean z3) {
        C1260b0.f5797j.m831b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z3));
        C1260b0 c1260b0 = (C1260b0) this.f5983g;
        c1260b0.f5805h = (C0187d) abstractC0191h;
        c1260b0.m3238c();
        AbstractC0491s.m1213e(c1260b0.f5804g);
        C1324r0 c1324r0M3246b = c1260b0.f5800c.m3246b(c1260b0.f5804g);
        C1304m0 c1304m0M3335m = C1308n0.m3335m(c1324r0M3246b.m3393d());
        c1304m0M3335m.m3256c();
        C1308n0.m3338p((C1308n0) c1304m0M3335m.f5902h, z3);
        c1324r0M3246b.m3256c();
        C1328s0.m3398p((C1328s0) c1324r0M3246b.f5902h, (C1308n0) c1304m0M3335m.m3254a());
        c1260b0.f5798a.m3180a((C1328s0) c1324r0M3246b.m3254a(), 227);
        C1260b0.m3237b(c1260b0);
        c1260b0.m3240e();
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ void mo687g(AbstractC0191h abstractC0191h, int i3) {
        C1260b0 c1260b0 = (C1260b0) this.f5983g;
        c1260b0.f5805h = (C0187d) abstractC0191h;
        C1260b0.m3236a(c1260b0, i3);
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: h */
    public void mo688h(AbstractC0191h abstractC0191h) {
        C0296b c0296b = C1260b0.f5797j;
        c0296b.m831b("onSessionStarting", new Object[0]);
        C1260b0 c1260b0 = (C1260b0) this.f5983g;
        c1260b0.f5805h = (C0187d) abstractC0191h;
        if (c1260b0.f5804g != null) {
            Log.w(c0296b.f788a, c0296b.m833d("Start a session while there's already an active session. Create a new one.", new Object[0]));
        }
        c1260b0.m3239d();
        C1264c0 c1264c0 = c1260b0.f5804g;
        C1324r0 c1324r0M3246b = c1260b0.f5800c.m3246b(c1264c0);
        if (c1264c0.f5822j == 1) {
            C1304m0 c1304m0M3335m = C1308n0.m3335m(c1324r0M3246b.m3393d());
            c1304m0M3335m.m3256c();
            C1308n0.m3340r((C1308n0) c1304m0M3335m.f5902h, 17);
            c1324r0M3246b.m3394e((C1308n0) c1304m0M3335m.m3254a());
        }
        c1260b0.f5798a.m3180a((C1328s0) c1324r0M3246b.m3254a(), 221);
    }

    @Override // p016F1.InterfaceC0193j
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void mo689i(AbstractC0191h abstractC0191h) {
        ((C1260b0) this.f5983g).f5805h = (C0187d) abstractC0191h;
    }

    /* JADX INFO: renamed from: j */
    public void m3423j(int i3, Object obj, InterfaceC1188I2 interfaceC1188I2) throws C1258a2 {
        C1254Z1 c1254z1 = (C1254Z1) this.f5983g;
        c1254z1.m3230G(i3, 3);
        interfaceC1188I2.mo3108f((AbstractC1230T1) obj, c1254z1.f5755f);
        c1254z1.m3230G(i3, 4);
    }

    /* JADX INFO: renamed from: k */
    public void m3424k(int i3, Object obj, InterfaceC1188I2 interfaceC1188I2) throws C1258a2 {
        AbstractC1230T1 abstractC1230T1 = (AbstractC1230T1) obj;
        C1254Z1 c1254z1 = (C1254Z1) this.f5983g;
        c1254z1.m3231H((i3 << 3) | 2);
        c1254z1.m3231H(abstractC1230T1.mo3193a(interfaceC1188I2));
        interfaceC1188I2.mo3108f(abstractC1230T1, c1254z1.f5755f);
    }

    public C1342v2() {
        InterfaceC1354y2 interfaceC1354y2;
        try {
            interfaceC1354y2 = (InterfaceC1354y2) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            interfaceC1354y2 = f5982h;
        }
        C1338u2 c1338u2 = new C1338u2(C1274e2.f5899b, interfaceC1354y2);
        Charset charset = AbstractC1306m2.f5927a;
        this.f5983g = c1338u2;
    }

    public C1342v2(C1254Z1 c1254z1) {
        Charset charset = AbstractC1306m2.f5927a;
        this.f5983g = c1254z1;
        c1254z1.f5755f = this;
    }
}
