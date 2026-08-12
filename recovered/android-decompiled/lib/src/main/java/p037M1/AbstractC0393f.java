package p037M1;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.support.v4.media.session.C0858A;
import java.util.Collections;
import java.util.Set;
import p009D0.C0106b;
import p028J1.InterfaceC0302h;
import p040N1.C0418C;
import p040N1.C0420a;
import p040N1.C0421b;
import p040N1.C0424e;
import p040N1.C0427h;
import p040N1.C0428i;
import p040N1.C0431l;
import p040N1.C0443x;
import p046P1.AbstractC0491s;
import p075Z1.HandlerC0784e;
import p097f2.C1560d;
import p097f2.C1563g;
import p124n.C2019f;

/* JADX INFO: renamed from: M1.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0393f {

    /* JADX INFO: renamed from: a */
    public final Context f1349a;

    /* JADX INFO: renamed from: b */
    public final String f1350b;

    /* JADX INFO: renamed from: c */
    public final C0106b f1351c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0389b f1352d;

    /* JADX INFO: renamed from: e */
    public final C0421b f1353e;

    /* JADX INFO: renamed from: f */
    public final Looper f1354f;

    /* JADX INFO: renamed from: g */
    public final int f1355g;

    /* JADX INFO: renamed from: h */
    public final C0420a f1356h;

    /* JADX INFO: renamed from: i */
    public final C0424e f1357i;

    public AbstractC0393f(Context context, C0106b c0106b, InterfaceC0389b interfaceC0389b, C0392e c0392e) {
        AbstractC0491s.m1214f(context, "Null context is not permitted.");
        AbstractC0491s.m1214f(c0106b, "Api must not be null.");
        AbstractC0491s.m1214f(c0392e, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        AbstractC0491s.m1214f(applicationContext, "The provided context did not have an application context.");
        this.f1349a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f1350b = attributionTag;
        this.f1351c = c0106b;
        this.f1352d = interfaceC0389b;
        this.f1354f = c0392e.f1348b;
        this.f1353e = new C0421b(c0106b, interfaceC0389b, attributionTag);
        C0424e c0424eM1124f = C0424e.m1124f(applicationContext);
        this.f1357i = c0424eM1124f;
        this.f1355g = c0424eM1124f.f1452n.getAndIncrement();
        this.f1356h = c0392e.f1347a;
        HandlerC0784e handlerC0784e = c0424eM1124f.f1457s;
        handlerC0784e.sendMessage(handlerC0784e.obtainMessage(7, this));
    }

    /* JADX INFO: renamed from: a */
    public final C0858A m1077a() {
        C0858A c0858a = new C0858A(10);
        Set set = Collections.EMPTY_SET;
        if (((C2019f) c0858a.f3639h) == null) {
            c0858a.f3639h = new C2019f(0);
        }
        ((C2019f) c0858a.f3639h).addAll(set);
        Context context = this.f1349a;
        c0858a.f3641j = context.getClass().getName();
        c0858a.f3640i = context.getPackageName();
        return c0858a;
    }

    /* JADX INFO: renamed from: b */
    public final C0428i m1078b(InterfaceC0302h interfaceC0302h) {
        Looper looper = this.f1354f;
        AbstractC0491s.m1214f(interfaceC0302h, "Listener must not be null");
        AbstractC0491s.m1214f(looper, "Looper must not be null");
        C0428i c0428i = new C0428i();
        new HandlerC0784e(looper, 1);
        AbstractC0491s.m1211c("castDeviceControllerListenerKey");
        c0428i.f1460a = new C0427h(interfaceC0302h);
        return c0428i;
    }

    /* JADX INFO: renamed from: c */
    public final C1563g m1079c(int i3, C0431l c0431l) {
        C1560d c1560d = new C1560d();
        C0424e c0424e = this.f1357i;
        c0424e.getClass();
        c0424e.m1128e(c1560d, c0431l.f1463c, this);
        C0443x c0443x = new C0443x(new C0418C(i3, c0431l, c1560d, this.f1356h), c0424e.f1453o.get(), this);
        HandlerC0784e handlerC0784e = c0424e.f1457s;
        handlerC0784e.sendMessage(handlerC0784e.obtainMessage(4, c0443x));
        return c1560d.f7065a;
    }
}
