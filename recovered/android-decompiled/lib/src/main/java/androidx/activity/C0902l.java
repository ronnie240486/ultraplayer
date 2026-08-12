package androidx.activity;

import androidx.lifecycle.AbstractC0984I;
import androidx.lifecycle.C0983H;
import androidx.lifecycle.C0985J;
import androidx.lifecycle.C0986K;
import androidx.lifecycle.InterfaceC0987L;
import androidx.lifecycle.InterfaceC0995h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import p038N.AbstractC0402b;
import p038N.C0401a;
import p038N.C0404d;
import p143r2.C2206d;
import p159w2.InterfaceC2320a;
import p163x2.AbstractC2364c;
import p163x2.AbstractC2365d;

/* JADX INFO: renamed from: androidx.activity.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0902l implements InterfaceC2320a, Serializable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3763g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f3764h;

    public C0902l(int i3, Object obj) {
        this.f3763g = i3;
        this.f3764h = obj;
    }

    @Override // p159w2.InterfaceC2320a
    /* JADX INFO: renamed from: a */
    public final Object mo2290a() {
        switch (this.f3763g) {
            case 0:
                ((C0906p) this.f3764h).m2310c();
                return C2206d.f9498c;
            case 1:
                ((C0906p) this.f3764h).m2309b();
                return C2206d.f9498c;
            default:
                InterfaceC0987L interfaceC0987L = (InterfaceC0987L) this.f3764h;
                ArrayList arrayList = new ArrayList();
                AbstractC2365d.f9921a.getClass();
                arrayList.add(new C0404d());
                C0404d[] c0404dArr = (C0404d[]) arrayList.toArray(new C0404d[0]);
                C0404d[] c0404dArr2 = (C0404d[]) Arrays.copyOf(c0404dArr, c0404dArr.length);
                AbstractC2364c.m4954e(c0404dArr2, "initializers");
                C0986K c0986kMo2299d = interfaceC0987L.mo2299d();
                AbstractC0402b abstractC0402bMo2297a = interfaceC0987L instanceof InterfaceC0995h ? ((InterfaceC0995h) interfaceC0987L).mo2297a() : C0401a.f1359b;
                AbstractC2364c.m4954e(c0986kMo2299d, "store");
                AbstractC2364c.m4954e(abstractC0402bMo2297a, "defaultCreationExtras");
                LinkedHashMap linkedHashMap = c0986kMo2299d.f4299a;
                AbstractC0984I c0983h = (AbstractC0984I) linkedHashMap.get("androidx.lifecycle.internal.SavedStateHandlesVM");
                if (C0983H.class.isInstance(c0983h)) {
                    AbstractC2364c.m4952c(c0983h, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
                } else {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.putAll((LinkedHashMap) abstractC0402bMo2297a.f1360a);
                    linkedHashMap2.put(C0985J.f4298b, "androidx.lifecycle.internal.SavedStateHandlesVM");
                    try {
                        c0983h = null;
                        for (C0404d c0404d : c0404dArr2) {
                            c0404d.getClass();
                            if (C0983H.class.equals(C0983H.class)) {
                                c0983h = new C0983H();
                            }
                        }
                        if (c0983h == null) {
                            throw new IllegalArgumentException("No initializer set for given class ".concat(C0983H.class.getName()));
                        }
                        AbstractC0984I abstractC0984I = (AbstractC0984I) linkedHashMap.put("androidx.lifecycle.internal.SavedStateHandlesVM", c0983h);
                        if (abstractC0984I != null) {
                            abstractC0984I.mo1154a();
                        }
                    } catch (AbstractMethodError unused) {
                        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
                    }
                }
                return (C0983H) c0983h;
        }
    }

    public final String toString() {
        AbstractC2365d.f9921a.getClass();
        String string = getClass().getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        AbstractC2364c.m4953d(string, "renderLambdaToString(this)");
        return string;
    }
}
