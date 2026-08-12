package androidx.lifecycle;

import android.view.View;
import com.zuxoplayer.app.R;
import java.util.Iterator;
import java.util.Map;
import p108i1.C1751d;
import p108i1.InterfaceC1750c;
import p108i1.InterfaceC1752e;
import p120m.C1994b;
import p120m.C1998f;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: androidx.lifecycle.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0981F {

    /* JADX INFO: renamed from: a */
    public static final C0985J f4287a = new C0985J();

    /* JADX INFO: renamed from: b */
    public static final C0985J f4288b = new C0985J();

    /* JADX INFO: renamed from: c */
    public static final C0985J f4289c = new C0985J();

    /* JADX INFO: renamed from: a */
    public static final void m2554a(InterfaceC1752e interfaceC1752e) {
        InterfaceC1750c interfaceC1750c;
        String str;
        EnumC1000m enumC1000m = interfaceC1752e.mo2300e().f4324c;
        if (enumC1000m != EnumC1000m.f4314h && enumC1000m != EnumC1000m.f4315i) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C1751d c1751dMo2298b = interfaceC1752e.mo2298b();
        c1751dMo2298b.getClass();
        Iterator it = ((C1998f) c1751dMo2298b.f7805d).iterator();
        do {
            C1994b c1994b = (C1994b) it;
            if (!c1994b.hasNext()) {
                interfaceC1750c = null;
                break;
            }
            Map.Entry entry = (Map.Entry) c1994b.next();
            AbstractC2364c.m4953d(entry, "components");
            str = (String) entry.getKey();
            interfaceC1750c = (InterfaceC1750c) entry.getValue();
        } while (!AbstractC2364c.m4950a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        if (interfaceC1750c == null) {
            C0982G c0982g = new C0982G(interfaceC1752e.mo2298b(), (InterfaceC0987L) interfaceC1752e);
            interfaceC1752e.mo2298b().m4208e("androidx.lifecycle.internal.SavedStateHandlesProvider", c0982g);
            interfaceC1752e.mo2300e().m2565a(new SavedStateHandleAttacher(c0982g));
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m2555b(View view, InterfaceC1005r interfaceC1005r) {
        AbstractC2364c.m4954e(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC1005r);
    }
}
