package p034L1;

import android.content.Context;
import android.util.Log;

/* JADX INFO: renamed from: L1.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0359n {

    /* JADX INFO: renamed from: a */
    public static final BinderC0355j f1152a;

    /* JADX INFO: renamed from: b */
    public static final BinderC0355j f1153b;

    /* JADX INFO: renamed from: c */
    public static Context f1154c;

    static {
        new BinderC0355j(AbstractBinderC0356k.m999v0("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 0);
        new BinderC0355j(AbstractBinderC0356k.m999v0("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 1);
        f1152a = new BinderC0355j(AbstractBinderC0356k.m999v0("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 2);
        f1153b = new BinderC0355j(AbstractBinderC0356k.m999v0("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 3);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m1000a(Context context) {
        if (f1154c != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f1154c = context.getApplicationContext();
        }
    }
}
