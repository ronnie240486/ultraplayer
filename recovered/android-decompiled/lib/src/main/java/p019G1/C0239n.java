package p019G1;

import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013E1.C0136k;
import p013E1.C0139n;
import p013E1.C0141p;
import p028J1.AbstractC0295a;
import p028J1.C0296b;
import p028J1.C0305k;
import p028J1.C0307m;
import p028J1.InterfaceC0308n;

/* JADX INFO: renamed from: G1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0239n extends AbstractC0244s {

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f628I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C0233h f629J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Object f630K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0239n(C0233h c0233h, Object obj, int i3) {
        super(c0233h, false);
        this.f628I = i3;
        this.f629J = c0233h;
        this.f630K = obj;
    }

    @Override // p019G1.AbstractC0244s
    /* JADX INFO: renamed from: M */
    public final void mo773M() {
        Object obj = this.f630K;
        C0233h c0233h = this.f629J;
        int i3 = 0;
        switch (this.f628I) {
            case 0:
                InterfaceC0308n interfaceC0308nM776N = m776N();
                C0307m c0307m = c0233h.f604c;
                c0307m.getClass();
                C0136k c0136k = (C0136k) obj;
                MediaInfo mediaInfo = c0136k.f257g;
                C0139n c0139n = c0136k.f258h;
                if (mediaInfo == null && c0139n == null) {
                    throw new IllegalArgumentException("MediaInfo and MediaQueueData should not be both null");
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    MediaInfo mediaInfo2 = c0136k.f257g;
                    if (mediaInfo2 != null) {
                        jSONObject.put("media", mediaInfo2.m3074e());
                    }
                    if (c0139n != null) {
                        jSONObject.put("queueData", c0139n.m596e());
                    }
                    jSONObject.putOpt("autoplay", c0136k.f259i);
                    long j3 = c0136k.f260j;
                    if (j3 != -1) {
                        Pattern pattern = AbstractC0295a.f786a;
                        jSONObject.put("currentTime", j3 / 1000.0d);
                    }
                    jSONObject.put("playbackRate", c0136k.f261k);
                    jSONObject.putOpt("credentials", c0136k.f265o);
                    jSONObject.putOpt("credentialsType", c0136k.f266p);
                    jSONObject.putOpt("atvCredentials", c0136k.f267q);
                    jSONObject.putOpt("atvCredentialsType", c0136k.f268r);
                    long[] jArr = c0136k.f262l;
                    if (jArr != null) {
                        JSONArray jSONArray = new JSONArray();
                        for (int i4 = 0; i4 < jArr.length; i4++) {
                            jSONArray.put(i4, jArr[i4]);
                        }
                        jSONObject.put("activeTrackIds", jSONArray);
                    }
                    jSONObject.putOpt("customData", c0136k.f264n);
                    jSONObject.put("requestId", c0136k.f269s);
                    break;
                } catch (JSONException e3) {
                    Object[] objArr = {e3};
                    C0296b c0296b = C0136k.f256t;
                    Log.e(c0296b.f788a, c0296b.m833d("Error transforming MediaLoadRequestData into JSONObject", objArr));
                    jSONObject = new JSONObject();
                }
                long jM856b = c0307m.m856b();
                try {
                    jSONObject.put("requestId", jM856b);
                    jSONObject.put("type", "LOAD");
                    break;
                } catch (JSONException unused) {
                }
                c0307m.m857c(jM856b, jSONObject.toString());
                c0307m.f809j.m849a(jM856b, interfaceC0308nM776N);
                return;
            default:
                C0307m c0307m2 = c0233h.f604c;
                InterfaceC0308n interfaceC0308nM776N2 = m776N();
                c0307m2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long jM856b2 = c0307m2.m856b();
                long j4 = ((C0141p) obj).f299a;
                try {
                    jSONObject2.put("requestId", jM856b2);
                    jSONObject2.put("type", "SEEK");
                    jSONObject2.put("mediaSessionId", c0307m2.m848p());
                    Pattern pattern2 = AbstractC0295a.f786a;
                    jSONObject2.put("currentTime", j4 / 1000.0d);
                    break;
                } catch (JSONException unused2) {
                }
                c0307m2.m857c(jM856b2, jSONObject2.toString());
                c0307m2.f806g = Long.valueOf(j4);
                c0307m2.f813n.m849a(jM856b2, new C0305k(c0307m2, interfaceC0308nM776N2, i3));
                return;
        }
    }
}
