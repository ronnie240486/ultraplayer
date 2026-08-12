package p019G1;

import org.json.JSONException;
import org.json.JSONObject;
import p028J1.C0306l;
import p028J1.C0307m;
import p028J1.InterfaceC0308n;
import p046P1.AbstractC0491s;

/* JADX INFO: renamed from: G1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0241p extends AbstractC0244s {

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ double f631I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C0233h f632J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0241p(C0233h c0233h, double d3) {
        super(c0233h, false);
        this.f632J = c0233h;
        this.f631I = d3;
    }

    @Override // p019G1.AbstractC0244s
    /* JADX INFO: renamed from: M */
    public final void mo773M() throws C0306l {
        C0307m c0307m = this.f632J.f604c;
        InterfaceC0308n interfaceC0308nM776N = m776N();
        double d3 = this.f631I;
        if (c0307m.f805f == null) {
            throw new C0306l();
        }
        JSONObject jSONObject = new JSONObject();
        long jM856b = c0307m.m856b();
        try {
            jSONObject.put("requestId", jM856b);
            jSONObject.put("type", "SET_PLAYBACK_RATE");
            jSONObject.put("playbackRate", d3);
            AbstractC0491s.m1214f(c0307m.f805f, "mediaStatus should not be null");
            jSONObject.put("mediaSessionId", c0307m.f805f.f305h);
        } catch (JSONException unused) {
        }
        c0307m.m857c(jM856b, jSONObject.toString());
        c0307m.f822w.m849a(jM856b, interfaceC0308nM776N);
    }
}
