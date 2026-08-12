package p091e;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p096f1.AbstractC1549d;
import p096f1.ExecutorC1547b;
import p124n.C2014a;
import p124n.C2019f;
import p136q.AbstractC2120c;
import p157w.C2312f;
import p157w.C2316j;

/* JADX INFO: renamed from: e.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1481l implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6614g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f6615h;

    public /* synthetic */ RunnableC1481l(Context context, int i3) {
        this.f6614g = i3;
        this.f6615h = context;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    @Override // java.lang.Runnable
    public final void run() {
        C2312f c2312f;
        Object systemService;
        Context context;
        switch (this.f6614g) {
            case 0:
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 33) {
                    Context context2 = this.f6615h;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i3 >= 33) {
                            C2019f c2019f = AbstractC1486q.f6626m;
                            c2019f.getClass();
                            C2014a c2014a = new C2014a(c2019f);
                            while (true) {
                                if (c2014a.hasNext()) {
                                    AbstractC1486q abstractC1486q = (AbstractC1486q) ((WeakReference) c2014a.next()).get();
                                    if (abstractC1486q != null && (context = ((LayoutInflaterFactory2C1458C) abstractC1486q).f6487q) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                c2312f = new C2312f(new C2316j(AbstractC1483n.m3714a(systemService)));
                            } else {
                                c2312f = C2312f.f9831b;
                            }
                        } else {
                            c2312f = AbstractC1486q.f6622i;
                            if (c2312f == null) {
                                c2312f = C2312f.f9831b;
                            }
                        }
                        if (c2312f.f9832a.isEmpty()) {
                            String strM4660e = AbstractC2120c.m4660e(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                AbstractC1483n.m3715b(systemService2, AbstractC1482m.m3713a(strM4660e));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                AbstractC1486q.f6625l = true;
                break;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC1481l(this.f6615h, 2));
                break;
            default:
                AbstractC1549d.m3867s(this.f6615h, new ExecutorC1547b(0), AbstractC1549d.f7044a, false);
                break;
        }
    }
}
