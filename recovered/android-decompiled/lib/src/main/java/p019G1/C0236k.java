package p019G1;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p028J1.C0305k;
import p028J1.C0307m;
import p028J1.InterfaceC0308n;

/* JADX INFO: renamed from: G1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0236k extends AbstractC0244s {

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f620I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ int[] f621J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ C0233h f622K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0236k(C0233h c0233h, int[] iArr, int i3) {
        super(c0233h, false);
        this.f620I = i3;
        switch (i3) {
            case 1:
                this.f622K = c0233h;
                this.f621J = iArr;
                super(c0233h, true);
                break;
            default:
                this.f622K = c0233h;
                this.f621J = iArr;
                break;
        }
    }

    @Override // p019G1.AbstractC0244s
    /* JADX INFO: renamed from: M */
    public final void mo773M() {
        switch (this.f620I) {
            case 0:
                C0307m c0307m = this.f622K.f604c;
                InterfaceC0308n interfaceC0308nM776N = m776N();
                c0307m.getClass();
                int[] iArr = this.f621J;
                if (iArr.length == 0) {
                    throw new IllegalArgumentException("itemIdsToRemove must not be null or empty.");
                }
                JSONObject jSONObject = new JSONObject();
                long jM856b = c0307m.m856b();
                try {
                    jSONObject.put("requestId", jM856b);
                    jSONObject.put("type", "QUEUE_REMOVE");
                    jSONObject.put("mediaSessionId", c0307m.m848p());
                    JSONArray jSONArray = new JSONArray();
                    for (int i3 = 0; i3 < iArr.length; i3++) {
                        jSONArray.put(i3, iArr[i3]);
                    }
                    jSONObject.put("itemIds", jSONArray);
                    int i4 = c0307m.f808i;
                    if (i4 != -1) {
                        jSONObject.put("sequenceNumber", i4);
                    }
                    break;
                } catch (JSONException unused) {
                }
                c0307m.m857c(jM856b, jSONObject.toString());
                c0307m.f818s.m849a(jM856b, new C0305k(c0307m, interfaceC0308nM776N, 1));
                return;
            default:
                C0307m c0307m2 = this.f622K.f604c;
                InterfaceC0308n interfaceC0308nM776N2 = m776N();
                int[] iArr2 = this.f621J;
                c0307m2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long jM856b2 = c0307m2.m856b();
                try {
                    jSONObject2.put("requestId", jM856b2);
                    jSONObject2.put("type", "QUEUE_GET_ITEMS");
                    jSONObject2.put("mediaSessionId", c0307m2.m848p());
                    JSONArray jSONArray2 = new JSONArray();
                    for (int i5 : iArr2) {
                        jSONArray2.put(i5);
                    }
                    jSONObject2.put("itemIds", jSONArray2);
                    break;
                } catch (JSONException unused2) {
                }
                c0307m2.m857c(jM856b2, jSONObject2.toString());
                c0307m2.f820u.m849a(jM856b2, interfaceC0308nM776N2);
                return;
        }
    }
}
