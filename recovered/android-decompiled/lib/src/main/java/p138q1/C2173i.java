package p138q1;

import android.content.Context;
import p022H1.C0258b;
import p034L1.C0352g;
import p053S0.C0536b;
import p095f0.C1528a;
import p113k.C1866h1;
import p126n1.EnumC2048c;
import p139q2.InterfaceC2180a;
import p150t1.C2277c;
import p150t1.InterfaceC2276b;
import p158w1.InterfaceC2319b;
import p162x1.C2352a;
import p162x1.C2354c;
import p162x1.C2360i;
import p162x1.C2361j;
import p166y1.InterfaceC2379d;

/* JADX INFO: renamed from: q1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2173i implements InterfaceC2276b {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f9387g;

    /* JADX INFO: renamed from: h */
    public Object f9388h;

    /* JADX INFO: renamed from: i */
    public Object f9389i;

    /* JADX INFO: renamed from: j */
    public Object f9390j;

    public /* synthetic */ C2173i() {
        this.f9387g = 0;
    }

    /* JADX INFO: renamed from: a */
    public C2174j m4759a() {
        String strConcat = ((String) this.f9388h) == null ? " backendName" : "";
        if (((EnumC2048c) this.f9390j) == null) {
            strConcat = strConcat.concat(" priority");
        }
        if (strConcat.isEmpty()) {
            return new C2174j((String) this.f9388h, (byte[]) this.f9389i, (EnumC2048c) this.f9390j);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    /* JADX INFO: renamed from: b */
    public void m4760b(String str) {
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f9388h = str;
    }

    @Override // p139q2.InterfaceC2180a
    public Object get() {
        switch (this.f9387g) {
            case 2:
                return new C2179o(new C0352g(2), new C0352g(1), (InterfaceC2319b) ((C0258b) this.f9388h).get(), (C2360i) ((C1866h1) this.f9389i).get(), (C2361j) ((C0536b) this.f9390j).get());
            default:
                return new C2354c((Context) ((C2277c) this.f9388h).f9746g, (InterfaceC2379d) ((InterfaceC2180a) this.f9389i).get(), (C2352a) ((C1528a) this.f9390j).get());
        }
    }

    public /* synthetic */ C2173i(Object obj, Object obj2, Object obj3, int i3) {
        this.f9387g = i3;
        this.f9388h = obj;
        this.f9389i = obj2;
        this.f9390j = obj3;
    }
}
