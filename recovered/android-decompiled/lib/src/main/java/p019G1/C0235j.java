package p019G1;

import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013E1.C0140o;
import p028J1.AbstractC0295a;
import p028J1.C0307m;
import p028J1.InterfaceC0308n;
import p045P0.AbstractC0462h;

/* JADX INFO: renamed from: G1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0235j extends AbstractC0244s {

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C0140o[] f615I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ int f616J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ int f617K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ long f618L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ C0233h f619M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0235j(C0233h c0233h, C0140o[] c0140oArr, int i3, int i4, long j3) {
        super(c0233h, false);
        this.f619M = c0233h;
        this.f615I = c0140oArr;
        this.f616J = i3;
        this.f617K = i4;
        this.f618L = j3;
    }

    @Override // p019G1.AbstractC0244s
    /* JADX INFO: renamed from: M */
    public final void mo773M() {
        boolean z3 = true;
        C0307m c0307m = this.f619M.f604c;
        InterfaceC0308n interfaceC0308nM776N = m776N();
        int i3 = this.f617K;
        c0307m.getClass();
        C0140o[] c0140oArr = this.f615I;
        int length = c0140oArr.length;
        if (length == 0) {
            throw new IllegalArgumentException("items must not be null or empty.");
        }
        int i4 = this.f616J;
        if (i4 < 0 || i4 >= length) {
            throw new IllegalArgumentException(AbstractC0462h.m1165e(i4, "Invalid startIndex: "));
        }
        long j3 = this.f618L;
        if (j3 != -1 && j3 < 0) {
            throw new IllegalArgumentException("playPosition can not be negative: " + j3);
        }
        JSONObject jSONObject = new JSONObject();
        long jM856b = c0307m.m856b();
        c0307m.f809j.m849a(jM856b, interfaceC0308nM776N);
        try {
            jSONObject.put("requestId", jM856b);
            jSONObject.put("type", "QUEUE_LOAD");
            JSONArray jSONArray = new JSONArray();
            for (int i5 = 0; i5 < c0140oArr.length; i5++) {
                jSONArray.put(i5, c0140oArr[i5].m598f());
            }
            jSONObject.put("items", jSONArray);
            String strM3307b0 = AbstractC1303m.m3307b0(Integer.valueOf(i3));
            if (strM3307b0 == null) {
                throw new IllegalArgumentException("Invalid repeat mode: " + i3);
            }
            jSONObject.put("repeatMode", strM3307b0);
            jSONObject.put("startIndex", i4);
            if (j3 != -1) {
                Pattern pattern = AbstractC0295a.f786a;
                jSONObject.put("currentTime", j3 / 1000.0d);
            }
            int i6 = c0307m.f808i;
            if (i6 == -1) {
                z3 = false;
            }
            if (z3) {
                jSONObject.put("sequenceNumber", i6);
            }
            c0307m.m857c(jM856b, jSONObject.toString());
        } catch (JSONException unused) {
        }
    }
}
