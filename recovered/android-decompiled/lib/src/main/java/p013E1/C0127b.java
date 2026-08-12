package p013E1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p028J1.AbstractC0295a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: E1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0127b extends AbstractC0512a {
    public static final Parcelable.Creator<C0127b> CREATOR = new C0147v(4);

    /* JADX INFO: renamed from: g */
    public final long f218g;

    /* JADX INFO: renamed from: h */
    public final String f219h;

    /* JADX INFO: renamed from: i */
    public final long f220i;

    /* JADX INFO: renamed from: j */
    public final boolean f221j;

    /* JADX INFO: renamed from: k */
    public final String[] f222k;

    /* JADX INFO: renamed from: l */
    public final boolean f223l;

    /* JADX INFO: renamed from: m */
    public final boolean f224m;

    public C0127b(long j3, String str, long j4, boolean z3, String[] strArr, boolean z4, boolean z5) {
        this.f218g = j3;
        this.f219h = str;
        this.f220i = j4;
        this.f221j = z3;
        this.f222k = strArr;
        this.f223l = z4;
        this.f224m = z5;
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m588e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f219h);
            long j3 = this.f218g;
            Pattern pattern = AbstractC0295a.f786a;
            jSONObject.put("position", j3 / 1000.0d);
            jSONObject.put("isWatched", this.f221j);
            jSONObject.put("isEmbedded", this.f223l);
            jSONObject.put("duration", this.f220i / 1000.0d);
            jSONObject.put("expanded", this.f224m);
            String[] strArr = this.f222k;
            if (strArr != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : strArr) {
                    jSONArray.put(str);
                }
                jSONObject.put("breakClipIds", jSONArray);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0127b)) {
            return false;
        }
        C0127b c0127b = (C0127b) obj;
        return AbstractC0295a.m828e(this.f219h, c0127b.f219h) && this.f218g == c0127b.f218g && this.f220i == c0127b.f220i && this.f221j == c0127b.f221j && Arrays.equals(this.f222k, c0127b.f222k) && this.f223l == c0127b.f223l && this.f224m == c0127b.f224m;
    }

    public final int hashCode() {
        return this.f219h.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 2, 8);
        parcel.writeLong(this.f218g);
        AbstractC1303m.m3299V(parcel, 3, this.f219h);
        AbstractC1303m.m3311d0(parcel, 4, 8);
        parcel.writeLong(this.f220i);
        AbstractC1303m.m3311d0(parcel, 5, 4);
        parcel.writeInt(this.f221j ? 1 : 0);
        String[] strArr = this.f222k;
        if (strArr != null) {
            int iM3305a1 = AbstractC1303m.m3305a0(parcel, 6);
            parcel.writeStringArray(strArr);
            AbstractC1303m.m3309c0(parcel, iM3305a1);
        }
        AbstractC1303m.m3311d0(parcel, 7, 4);
        parcel.writeInt(this.f223l ? 1 : 0);
        AbstractC1303m.m3311d0(parcel, 8, 4);
        parcel.writeInt(this.f224m ? 1 : 0);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
