package p019G1;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import org.json.JSONException;
import org.json.JSONObject;
import p013E1.C0142q;
import p028J1.C0307m;
import p028J1.InterfaceC0308n;

/* JADX INFO: renamed from: G1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0234i extends AbstractC0244s {

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f613I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C0233h f614J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0234i(C0233h c0233h, int i3) {
        super(c0233h, false);
        this.f613I = i3;
        this.f614J = c0233h;
    }

    @Override // p019G1.AbstractC0244s
    /* JADX INFO: renamed from: M */
    public final void mo773M() {
        switch (this.f613I) {
            case 0:
                C0307m c0307m = this.f614J.f604c;
                InterfaceC0308n interfaceC0308nM776N = m776N();
                c0307m.getClass();
                JSONObject jSONObject = new JSONObject();
                long jM856b = c0307m.m856b();
                try {
                    jSONObject.put("requestId", jM856b);
                    jSONObject.put("type", "GET_STATUS");
                    C0142q c0142q = c0307m.f805f;
                    if (c0142q != null) {
                        jSONObject.put("mediaSessionId", c0142q.f305h);
                    }
                    break;
                } catch (JSONException unused) {
                }
                c0307m.m857c(jM856b, jSONObject.toString());
                c0307m.f816q.m849a(jM856b, interfaceC0308nM776N);
                break;
            case 1:
                this.f614J.f604c.m838d(m776N(), 0, -1L, -1, null);
                break;
            case 2:
                this.f614J.f604c.m838d(m776N(), 0, -1L, 1, null);
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                C0307m c0307m2 = this.f614J.f604c;
                InterfaceC0308n interfaceC0308nM776N2 = m776N();
                c0307m2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long jM856b2 = c0307m2.m856b();
                try {
                    jSONObject2.put("requestId", jM856b2);
                    jSONObject2.put("type", "QUEUE_GET_ITEM_IDS");
                    jSONObject2.put("mediaSessionId", c0307m2.m848p());
                    break;
                } catch (JSONException unused2) {
                }
                c0307m2.m857c(jM856b2, jSONObject2.toString());
                c0307m2.f819t.m849a(jM856b2, interfaceC0308nM776N2);
                break;
            case 4:
                C0307m c0307m3 = this.f614J.f604c;
                InterfaceC0308n interfaceC0308nM776N3 = m776N();
                c0307m3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long jM856b3 = c0307m3.m856b();
                try {
                    jSONObject3.put("requestId", jM856b3);
                    jSONObject3.put("type", "PAUSE");
                    jSONObject3.put("mediaSessionId", c0307m3.m848p());
                    break;
                } catch (JSONException unused3) {
                }
                c0307m3.m857c(jM856b3, jSONObject3.toString());
                c0307m3.f810k.m849a(jM856b3, interfaceC0308nM776N3);
                break;
            case 5:
                C0307m c0307m4 = this.f614J.f604c;
                InterfaceC0308n interfaceC0308nM776N4 = m776N();
                c0307m4.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long jM856b4 = c0307m4.m856b();
                try {
                    jSONObject4.put("requestId", jM856b4);
                    jSONObject4.put("type", "STOP");
                    jSONObject4.put("mediaSessionId", c0307m4.m848p());
                    break;
                } catch (JSONException unused4) {
                }
                c0307m4.m857c(jM856b4, jSONObject4.toString());
                c0307m4.f812m.m849a(jM856b4, interfaceC0308nM776N4);
                break;
            default:
                C0307m c0307m5 = this.f614J.f604c;
                InterfaceC0308n interfaceC0308nM776N5 = m776N();
                c0307m5.getClass();
                JSONObject jSONObject5 = new JSONObject();
                long jM856b5 = c0307m5.m856b();
                try {
                    jSONObject5.put("requestId", jM856b5);
                    jSONObject5.put("type", "PLAY");
                    jSONObject5.put("mediaSessionId", c0307m5.m848p());
                    break;
                } catch (JSONException unused5) {
                }
                c0307m5.m857c(jM856b5, jSONObject5.toString());
                c0307m5.f811l.m849a(jM856b5, interfaceC0308nM776N5);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0234i(C0233h c0233h) {
        super(c0233h, true);
        this.f613I = 3;
        this.f614J = c0233h;
    }
}
