package p089d1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p011E.C0111d;
import p014F.RunnableC0153b;
import p064W.C0649q;
import p064W.RunnableC0641i;
import p096f1.AbstractC1549d;
import p096f1.InterfaceC1548c;

/* JADX INFO: renamed from: d1.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1427a0 {

    /* JADX INFO: renamed from: a */
    public boolean f6308a;

    /* JADX INFO: renamed from: b */
    public final Object f6309b;

    /* JADX INFO: renamed from: c */
    public final Object f6310c;

    /* JADX INFO: renamed from: d */
    public final Object f6311d;

    /* JADX INFO: renamed from: e */
    public final Object f6312e;

    /* JADX INFO: renamed from: f */
    public final Serializable f6313f;

    /* JADX INFO: renamed from: g */
    public Object f6314g;

    /* JADX INFO: renamed from: h */
    public Object f6315h;

    public C1427a0(Context context, C1433f c1433f) {
        this.f6313f = new ArrayList();
        this.f6314g = new C0649q(3, this);
        this.f6315h = new RunnableC0153b(12, this);
        this.f6309b = context;
        this.f6310c = c1433f;
        this.f6311d = new Handler();
        this.f6312e = context.getPackageManager();
    }

    /* JADX INFO: renamed from: a */
    public FileInputStream m3567a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e3) {
            String message = e3.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((InterfaceC1548c) this.f6310c).mo3625m();
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3568b(int i3, Serializable serializable) {
        ((Executor) this.f6309b).execute(new RunnableC0641i(this, i3, serializable, 3));
    }

    /* JADX INFO: renamed from: c */
    public void m3569c() {
        ArrayList arrayList;
        C1433f c1433f;
        int i3;
        if (this.f6308a) {
            ArrayList arrayList2 = new ArrayList();
            int i4 = Build.VERSION.SDK_INT;
            PackageManager packageManager = (PackageManager) this.f6312e;
            if (i4 >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next().serviceInfo);
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i5 = 0;
            while (true) {
                boolean zHasNext = it2.hasNext();
                arrayList = (ArrayList) this.f6313f;
                boolean z3 = true;
                c1433f = (C1433f) this.f6310c;
                if (!zHasNext) {
                    break;
                }
                ServiceInfo serviceInfo = it2.next().serviceInfo;
                if (serviceInfo != null) {
                    if ((C1405E.f6239c == null ? false : C1405E.m3511c().m3578f()) && !arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 < size) {
                                Object obj = arrayList2.get(i6);
                                i6++;
                                ServiceInfo serviceInfo2 = (ServiceInfo) obj;
                                if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                                }
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size2 = arrayList.size();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= size2) {
                            i7 = -1;
                            break;
                        }
                        ComponentName componentName = ((ServiceConnectionC1425Z) arrayList.get(i7)).f6300i;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (i7 < 0) {
                        ServiceConnectionC1425Z serviceConnectionC1425Z = new ServiceConnectionC1425Z((Context) this.f6309b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        serviceConnectionC1425Z.f6307p = new C0111d(this, serviceConnectionC1425Z);
                        if (!serviceConnectionC1425Z.f6303l) {
                            serviceConnectionC1425Z.f6303l = true;
                            serviceConnectionC1425Z.m3566m();
                        }
                        i3 = i5 + 1;
                        arrayList.add(i5, serviceConnectionC1425Z);
                        c1433f.m3573a(serviceConnectionC1425Z, false);
                    } else if (i7 >= i5) {
                        ServiceConnectionC1425Z serviceConnectionC1425Z2 = (ServiceConnectionC1425Z) arrayList.get(i7);
                        if (!serviceConnectionC1425Z2.f6303l) {
                            serviceConnectionC1425Z2.f6303l = true;
                            serviceConnectionC1425Z2.m3566m();
                        }
                        if (serviceConnectionC1425Z2.f6305n == null) {
                            if (!serviceConnectionC1425Z2.f6303l || (serviceConnectionC1425Z2.f6411e == null && serviceConnectionC1425Z2.f6302k.isEmpty())) {
                                z3 = false;
                            }
                            if (z3) {
                                serviceConnectionC1425Z2.m3565l();
                                serviceConnectionC1425Z2.m3562i();
                            }
                        }
                        i3 = i5 + 1;
                        Collections.swap(arrayList, i7, i5);
                    }
                    i5 = i3;
                }
            }
            if (i5 < arrayList.size()) {
                for (int size3 = arrayList.size() - 1; size3 >= i5; size3--) {
                    ServiceConnectionC1425Z serviceConnectionC1425Z3 = (ServiceConnectionC1425Z) arrayList.get(size3);
                    C1402B c1402bM3576d = c1433f.m3576d(serviceConnectionC1425Z3);
                    if (c1402bM3576d != null) {
                        serviceConnectionC1425Z3.getClass();
                        C1405E.m3510b();
                        serviceConnectionC1425Z3.f6410d = null;
                        serviceConnectionC1425Z3.m3631h(null);
                        c1433f.m3585m(c1402bM3576d, null);
                        c1433f.f6330a.m3572b(514, c1402bM3576d);
                        c1433f.f6341l.remove(c1402bM3576d);
                    }
                    arrayList.remove(serviceConnectionC1425Z3);
                    serviceConnectionC1425Z3.f6307p = null;
                    if (serviceConnectionC1425Z3.f6303l) {
                        serviceConnectionC1425Z3.f6303l = false;
                        serviceConnectionC1425Z3.m3566m();
                    }
                }
            }
        }
    }

    public C1427a0(AssetManager assetManager, Executor executor, InterfaceC1548c interfaceC1548c, String str, File file) {
        this.f6308a = false;
        this.f6309b = executor;
        this.f6310c = interfaceC1548c;
        this.f6313f = str;
        this.f6312e = file;
        int i3 = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i3 >= 24 && i3 <= 34) {
            switch (i3) {
                case 24:
                case 25:
                    bArr = AbstractC1549d.f7051h;
                    break;
                case 26:
                    bArr = AbstractC1549d.f7050g;
                    break;
                case 27:
                    bArr = AbstractC1549d.f7049f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC1549d.f7048e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC1549d.f7047d;
                    break;
            }
        }
        this.f6311d = bArr;
    }
}
