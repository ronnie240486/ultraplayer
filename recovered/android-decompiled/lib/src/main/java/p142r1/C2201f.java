package p142r1;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.gms.internal.cast.C1323r;
import java.util.HashMap;

/* JADX INFO: renamed from: r1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2201f {

    /* JADX INFO: renamed from: a */
    public final C1323r f9488a;

    /* JADX INFO: renamed from: b */
    public final C2199d f9489b;

    /* JADX INFO: renamed from: c */
    public final HashMap f9490c;

    public C2201f(Context context, C2199d c2199d) {
        C1323r c1323r = new C1323r(context, 12);
        this.f9490c = new HashMap();
        this.f9488a = c1323r;
        this.f9489b = c2199d;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized InterfaceC2202g m4777a(String str) {
        if (this.f9490c.containsKey(str)) {
            return (InterfaceC2202g) this.f9490c.get(str);
        }
        CctBackendFactory cctBackendFactoryM3392z = this.f9488a.m3392z(str);
        if (cctBackendFactoryM3392z == null) {
            return null;
        }
        C2199d c2199d = this.f9489b;
        InterfaceC2202g interfaceC2202gCreate = cctBackendFactoryM3392z.create(new C2197b(c2199d.f9483a, c2199d.f9484b, c2199d.f9485c, str));
        this.f9490c.put(str, interfaceC2202gCreate);
        return interfaceC2202gCreate;
    }
}
