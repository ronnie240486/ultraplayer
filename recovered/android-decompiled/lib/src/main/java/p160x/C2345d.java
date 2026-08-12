package p160x;

import com.google.android.gms.internal.cast.C1323r;
import java.util.ArrayList;
import p124n.C2022i;
import p168z.InterfaceC2387a;

/* JADX INFO: renamed from: x.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2345d implements InterfaceC2387a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9852a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9853b;

    public /* synthetic */ C2345d(int i3, Object obj) {
        this.f9852a = i3;
        this.f9853b = obj;
    }

    @Override // p168z.InterfaceC2387a
    /* JADX INFO: renamed from: b */
    public final void mo2543b(Object obj) {
        switch (this.f9852a) {
            case 0:
                C2346e c2346e = (C2346e) obj;
                if (c2346e == null) {
                    c2346e = new C2346e(-3);
                }
                ((C1323r) this.f9853b).m3362J(c2346e);
                return;
            default:
                C2346e c2346e2 = (C2346e) obj;
                synchronized (AbstractC2347f.f9858c) {
                    try {
                        C2022i c2022i = AbstractC2347f.f9859d;
                        ArrayList arrayList = (ArrayList) c2022i.getOrDefault((String) this.f9853b, null);
                        if (arrayList == null) {
                            return;
                        }
                        c2022i.remove((String) this.f9853b);
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            ((InterfaceC2387a) arrayList.get(i3)).mo2543b(c2346e2);
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
