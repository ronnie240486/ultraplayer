package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC0984I;
import androidx.lifecycle.C0986K;
import androidx.lifecycle.C0996i;
import androidx.lifecycle.C1007t;
import androidx.lifecycle.EnumC0999l;
import androidx.lifecycle.InterfaceC0987L;
import androidx.lifecycle.InterfaceC1003p;
import androidx.lifecycle.InterfaceC1005r;
import androidx.lifecycle.SavedStateHandleController;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import p045P0.AbstractC0462h;
import p091e.C1477h;
import p108i1.C1751d;
import p108i1.InterfaceC1749b;
import p108i1.InterfaceC1752e;
import p163x2.AbstractC2364c;

/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements InterfaceC1003p {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1752e f4806a;

    public Recreator(InterfaceC1752e interfaceC1752e) {
        this.f4806a = interfaceC1752e;
    }

    @Override // androidx.lifecycle.InterfaceC1003p
    /* JADX INFO: renamed from: b */
    public final void mo2288b(InterfaceC1005r interfaceC1005r, EnumC0999l enumC0999l) {
        Object obj;
        boolean z3;
        if (enumC0999l != EnumC0999l.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        interfaceC1005r.mo2300e().m2570f(this);
        Bundle bundleM4206c = this.f4806a.mo2298b().m4206c("androidx.savedstate.Restarter");
        if (bundleM4206c == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM4206c.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i3 = 0;
        while (i3 < size) {
            String str = stringArrayList.get(i3);
            i3++;
            String str2 = str;
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC1749b.class);
                AbstractC2364c.m4953d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        AbstractC2364c.m4953d(objNewInstance, "{\n                constr…wInstance()\n            }");
                        InterfaceC1752e interfaceC1752e = this.f4806a;
                        if (!(interfaceC1752e instanceof InterfaceC0987L)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        C0986K c0986kMo2299d = ((InterfaceC0987L) interfaceC1752e).mo2299d();
                        C1751d c1751dMo2298b = interfaceC1752e.mo2298b();
                        c0986kMo2299d.getClass();
                        for (String str3 : new HashSet(c0986kMo2299d.f4299a.keySet())) {
                            AbstractC2364c.m4954e(str3, "key");
                            AbstractC0984I abstractC0984I = (AbstractC0984I) c0986kMo2299d.f4299a.get(str3);
                            AbstractC2364c.m4951b(abstractC0984I);
                            C1007t c1007tMo2300e = interfaceC1752e.mo2300e();
                            AbstractC2364c.m4954e(c1751dMo2298b, "registry");
                            AbstractC2364c.m4954e(c1007tMo2300e, "lifecycle");
                            HashMap map = abstractC0984I.f4295a;
                            if (map == null) {
                                obj = null;
                            } else {
                                synchronized (map) {
                                    obj = abstractC0984I.f4295a.get("androidx.lifecycle.savedstate.vm.tag");
                                }
                            }
                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                            if (savedStateHandleController != null && !(z3 = savedStateHandleController.f4303a)) {
                                if (z3) {
                                    throw new IllegalStateException("Already attached to lifecycleOwner");
                                }
                                savedStateHandleController.f4303a = true;
                                c1007tMo2300e.m2565a(savedStateHandleController);
                                throw null;
                            }
                        }
                        if (!new HashSet(c0986kMo2299d.f4299a.keySet()).isEmpty()) {
                            if (!c1751dMo2298b.f7804c) {
                                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                            }
                            C1477h c1477h = (C1477h) c1751dMo2298b.f7807f;
                            if (c1477h == null) {
                                c1477h = new C1477h(c1751dMo2298b);
                            }
                            c1751dMo2298b.f7807f = c1477h;
                            try {
                                C0996i.class.getDeclaredConstructor(null);
                                C1477h c1477h2 = (C1477h) c1751dMo2298b.f7807f;
                                if (c1477h2 != null) {
                                    ((LinkedHashSet) c1477h2.f6606b).add(C0996i.class.getName());
                                }
                            } catch (NoSuchMethodException e3) {
                                throw new IllegalArgumentException("Class " + C0996i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                            }
                        }
                    } catch (Exception e4) {
                        throw new RuntimeException("Failed to instantiate " + str2, e4);
                    }
                } catch (NoSuchMethodException e5) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e5);
                }
            } catch (ClassNotFoundException e6) {
                throw new RuntimeException(AbstractC0462h.m1166f("Class ", str2, " wasn't found"), e6);
            }
        }
    }
}
