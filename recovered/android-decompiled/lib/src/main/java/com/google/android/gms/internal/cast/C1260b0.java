package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import p016F1.C0185b;
import p016F1.C0187d;
import p028J1.C0296b;
import p046P1.AbstractC0491s;
import p075Z1.HandlerC0784e;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1260b0 {

    /* JADX INFO: renamed from: j */
    public static final C0296b f5797j = new C0296b("ApplicationAnalytics", null);

    /* JADX INFO: renamed from: a */
    public final C1209O f5798a;

    /* JADX INFO: renamed from: b */
    public final BinderC1263c f5799b;

    /* JADX INFO: renamed from: c */
    public final C1268d0 f5800c;

    /* JADX INFO: renamed from: f */
    public final SharedPreferences f5803f;

    /* JADX INFO: renamed from: g */
    public C1264c0 f5804g;

    /* JADX INFO: renamed from: h */
    public C0187d f5805h;

    /* JADX INFO: renamed from: i */
    public boolean f5806i;

    /* JADX INFO: renamed from: e */
    public final HandlerC0784e f5802e = new HandlerC0784e(Looper.getMainLooper(), 3);

    /* JADX INFO: renamed from: d */
    public final RunnableC1347x f5801d = new RunnableC1347x(1, this);

    public C1260b0(SharedPreferences sharedPreferences, C1209O c1209o, BinderC1263c binderC1263c, Bundle bundle, String str) {
        this.f5803f = sharedPreferences;
        this.f5798a = c1209o;
        this.f5799b = binderC1263c;
        this.f5800c = new C1268d0(str, bundle);
    }

    /* JADX INFO: renamed from: a */
    public static void m3236a(C1260b0 c1260b0, int i3) {
        f5797j.m831b("log session ended with error = %d", Integer.valueOf(i3));
        c1260b0.m3238c();
        c1260b0.f5798a.m3180a(c1260b0.f5800c.m3245a(c1260b0.f5804g, i3), 228);
        c1260b0.f5802e.removeCallbacks(c1260b0.f5801d);
        if (c1260b0.f5806i) {
            return;
        }
        c1260b0.f5804g = null;
    }

    /* JADX INFO: renamed from: b */
    public static void m3237b(C1260b0 c1260b0) {
        C1264c0 c1264c0 = c1260b0.f5804g;
        c1264c0.getClass();
        SharedPreferences sharedPreferences = c1260b0.f5803f;
        if (sharedPreferences == null) {
            return;
        }
        C1264c0.f5811k.m831b("Save the ApplicationAnalyticsSession to SharedPreferences %s", sharedPreferences);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putString("application_id", c1264c0.f5814b);
        editorEdit.putString("receiver_metrics_id", c1264c0.f5815c);
        editorEdit.putLong("analytics_session_id", c1264c0.f5816d);
        editorEdit.putInt("event_sequence_number", c1264c0.f5817e);
        editorEdit.putString("receiver_session_id", c1264c0.f5818f);
        editorEdit.putInt("device_capabilities", c1264c0.f5819g);
        editorEdit.putString("device_model_name", c1264c0.f5820h);
        editorEdit.putInt("analytics_session_start_type", c1264c0.f5822j);
        editorEdit.putBoolean("is_output_switcher_enabled", c1264c0.f5821i);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: c */
    public final void m3238c() {
        CastDevice castDevice;
        C1264c0 c1264c0;
        if (!m3241f()) {
            C0296b c0296b = f5797j;
            Log.w(c0296b.f788a, c0296b.m833d("The analyticsSession should not be null for logging. Create a dummy one.", new Object[0]));
            m3239d();
            return;
        }
        C0187d c0187d = this.f5805h;
        if (c0187d != null) {
            AbstractC0491s.m1210b();
            castDevice = c0187d.f464k;
        } else {
            castDevice = null;
        }
        if (castDevice != null) {
            String str = this.f5804g.f5815c;
            String str2 = castDevice.f5430r;
            if (!TextUtils.equals(str, str2) && (c1264c0 = this.f5804g) != null) {
                c1264c0.f5815c = str2;
                c1264c0.f5819g = castDevice.f5427o;
                c1264c0.f5820h = castDevice.f5423k;
            }
        }
        AbstractC0491s.m1213e(this.f5804g);
    }

    /* JADX INFO: renamed from: d */
    public final void m3239d() {
        CastDevice castDevice;
        C1264c0 c1264c0;
        f5797j.m831b("Create a new ApplicationAnalyticsSession based on CastSession", new Object[0]);
        C1264c0 c1264c1 = new C1264c0(this.f5799b);
        C1264c0.f5812l++;
        this.f5804g = c1264c1;
        C0187d c0187d = this.f5805h;
        c1264c1.f5821i = c0187d != null && c0187d.f460g.f5958h;
        C0296b c0296b = C0185b.f423k;
        AbstractC0491s.m1210b();
        C0185b c0185b = C0185b.f425m;
        AbstractC0491s.m1213e(c0185b);
        AbstractC0491s.m1210b();
        c1264c1.f5814b = c0185b.f430e.f439g;
        C0187d c0187d2 = this.f5805h;
        if (c0187d2 == null) {
            castDevice = null;
        } else {
            AbstractC0491s.m1210b();
            castDevice = c0187d2.f464k;
        }
        if (castDevice != null && (c1264c0 = this.f5804g) != null) {
            c1264c0.f5815c = castDevice.f5430r;
            c1264c0.f5819g = castDevice.f5427o;
            c1264c0.f5820h = castDevice.f5423k;
        }
        C1264c0 c1264c2 = this.f5804g;
        AbstractC0491s.m1213e(c1264c2);
        C0187d c0187d3 = this.f5805h;
        c1264c2.f5822j = c0187d3 != null ? c0187d3.m676b() : 0;
        AbstractC0491s.m1213e(this.f5804g);
    }

    /* JADX INFO: renamed from: e */
    public final void m3240e() {
        HandlerC0784e handlerC0784e = this.f5802e;
        AbstractC0491s.m1213e(handlerC0784e);
        RunnableC1347x runnableC1347x = this.f5801d;
        AbstractC0491s.m1213e(runnableC1347x);
        handlerC0784e.postDelayed(runnableC1347x, 300000L);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f */
    public final boolean m3241f() {
        String str;
        C1264c0 c1264c0 = this.f5804g;
        C0296b c0296b = f5797j;
        if (c1264c0 == null) {
            c0296b.m831b("The analytics session is null when matching with application ID.", new Object[0]);
            return false;
        }
        C0296b c0296b2 = C0185b.f423k;
        AbstractC0491s.m1210b();
        C0185b c0185b = C0185b.f425m;
        AbstractC0491s.m1213e(c0185b);
        AbstractC0491s.m1210b();
        String str2 = c0185b.f430e.f439g;
        if (str2 == null || (str = this.f5804g.f5814b) == null || !TextUtils.equals(str, str2)) {
            c0296b.m831b("The analytics session doesn't match the application ID %s", str2);
            return false;
        }
        AbstractC0491s.m1213e(this.f5804g);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3242g(String str) {
        String str2;
        if (!m3241f()) {
            return false;
        }
        AbstractC0491s.m1213e(this.f5804g);
        if (str != null && (str2 = this.f5804g.f5818f) != null && TextUtils.equals(str2, str)) {
            return true;
        }
        f5797j.m831b("The analytics session doesn't match the receiver session ID %s.", str);
        return false;
    }
}
