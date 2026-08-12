package p081b;

import com.google.android.gms.internal.cast.C1165D;
import com.google.android.gms.internal.cast.InterfaceC1161C;
import java.util.concurrent.CopyOnWriteArraySet;
import p045P0.AbstractC0462h;

/* JADX INFO: renamed from: b.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1058a implements InterfaceC1161C {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4808a;

    /* JADX INFO: renamed from: b */
    public volatile Object f4809b;

    /* JADX INFO: renamed from: c */
    public Object f4810c;

    public C1058a(int i3) {
        this.f4808a = i3;
        switch (i3) {
            case 1:
                break;
            default:
                this.f4810c = new CopyOnWriteArraySet();
                break;
        }
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1161C
    /* JADX INFO: renamed from: a */
    public Object mo2827a() {
        InterfaceC1161C interfaceC1161C = (InterfaceC1161C) this.f4809b;
        C1165D c1165d = C1165D.f5567a;
        if (interfaceC1161C != c1165d) {
            synchronized (this) {
                try {
                    if (((InterfaceC1161C) this.f4809b) != c1165d) {
                        Object objMo2827a = ((InterfaceC1161C) this.f4809b).mo2827a();
                        this.f4810c = objMo2827a;
                        this.f4809b = c1165d;
                        return objMo2827a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f4810c;
    }

    public String toString() {
        switch (this.f4808a) {
            case 1:
                Object objM1166f = (InterfaceC1161C) this.f4809b;
                if (objM1166f == C1165D.f5567a) {
                    objM1166f = AbstractC0462h.m1166f("<supplier that returned ", String.valueOf(this.f4810c), ">");
                }
                return AbstractC0462h.m1166f("Suppliers.memoize(", String.valueOf(objM1166f), ")");
            default:
                return super.toString();
        }
    }
}
