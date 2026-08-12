package p013E1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p028J1.AbstractC0295a;
import p049Q1.AbstractC0512a;
import p057T1.AbstractC0600a;

/* JADX INFO: renamed from: E1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0140o extends AbstractC0512a {
    public static final Parcelable.Creator<C0140o> CREATOR = new C0147v(14);

    /* JADX INFO: renamed from: g */
    public MediaInfo f290g;

    /* JADX INFO: renamed from: h */
    public int f291h;

    /* JADX INFO: renamed from: i */
    public boolean f292i;

    /* JADX INFO: renamed from: j */
    public double f293j;

    /* JADX INFO: renamed from: k */
    public double f294k;

    /* JADX INFO: renamed from: l */
    public double f295l;

    /* JADX INFO: renamed from: m */
    public long[] f296m;

    /* JADX INFO: renamed from: n */
    public String f297n;

    /* JADX INFO: renamed from: o */
    public JSONObject f298o;

    public C0140o(MediaInfo mediaInfo, int i3, boolean z3, double d3, double d4, double d5, long[] jArr, String str) {
        this.f290g = mediaInfo;
        this.f291h = i3;
        this.f292i = z3;
        this.f293j = d3;
        this.f294k = d4;
        this.f295l = d5;
        this.f296m = jArr;
        this.f297n = str;
        if (str == null) {
            this.f298o = null;
            return;
        }
        try {
            this.f298o = new JSONObject(this.f297n);
        } catch (JSONException unused) {
            this.f298o = null;
            this.f297n = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m597e(JSONObject jSONObject) throws JSONException {
        boolean z3;
        long[] jArr;
        boolean z4;
        int i3;
        boolean z5 = false;
        if (jSONObject.has("media")) {
            this.f290g = new MediaInfo(jSONObject.getJSONObject("media"));
            z3 = true;
        } else {
            z3 = false;
        }
        if (jSONObject.has("itemId") && this.f291h != (i3 = jSONObject.getInt("itemId"))) {
            this.f291h = i3;
            z3 = true;
        }
        if (jSONObject.has("autoplay") && this.f292i != (z4 = jSONObject.getBoolean("autoplay"))) {
            this.f292i = z4;
            z3 = true;
        }
        double dOptDouble = jSONObject.optDouble("startTime");
        if (Double.isNaN(dOptDouble) != Double.isNaN(this.f293j) || (!Double.isNaN(dOptDouble) && Math.abs(dOptDouble - this.f293j) > 1.0E-7d)) {
            this.f293j = dOptDouble;
            z3 = true;
        }
        if (jSONObject.has("playbackDuration")) {
            double d3 = jSONObject.getDouble("playbackDuration");
            if (Math.abs(d3 - this.f294k) > 1.0E-7d) {
                this.f294k = d3;
                z3 = true;
            }
        }
        if (jSONObject.has("preloadTime")) {
            double d4 = jSONObject.getDouble("preloadTime");
            if (Math.abs(d4 - this.f295l) > 1.0E-7d) {
                this.f295l = d4;
                z3 = true;
            }
        }
        if (jSONObject.has("activeTrackIds")) {
            JSONArray jSONArray = jSONObject.getJSONArray("activeTrackIds");
            int length = jSONArray.length();
            jArr = new long[length];
            for (int i4 = 0; i4 < length; i4++) {
                jArr[i4] = jSONArray.getLong(i4);
            }
            long[] jArr2 = this.f296m;
            if (jArr2 == null || jArr2.length != length) {
                z5 = true;
                break;
            }
            for (int i5 = 0; i5 < length; i5++) {
                if (this.f296m[i5] != jArr[i5]) {
                    z5 = true;
                    break;
                }
            }
        } else {
            jArr = null;
        }
        if (z5) {
            this.f296m = jArr;
            z3 = true;
        }
        if (!jSONObject.has("customData")) {
            return z3;
        }
        this.f298o = jSONObject.getJSONObject("customData");
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0140o)) {
            return false;
        }
        C0140o c0140o = (C0140o) obj;
        JSONObject jSONObject = this.f298o;
        boolean z3 = jSONObject == null;
        JSONObject jSONObject2 = c0140o.f298o;
        if (z3 != (jSONObject2 == null)) {
            return false;
        }
        return (jSONObject == null || jSONObject2 == null || AbstractC0600a.m1464a(jSONObject, jSONObject2)) && AbstractC0295a.m828e(this.f290g, c0140o.f290g) && this.f291h == c0140o.f291h && this.f292i == c0140o.f292i && ((Double.isNaN(this.f293j) && Double.isNaN(c0140o.f293j)) || this.f293j == c0140o.f293j) && this.f294k == c0140o.f294k && this.f295l == c0140o.f295l && Arrays.equals(this.f296m, c0140o.f296m);
    }

    /* JADX INFO: renamed from: f */
    public final JSONObject m598f() {
        JSONObject jSONObject = new JSONObject();
        try {
            MediaInfo mediaInfo = this.f290g;
            if (mediaInfo != null) {
                jSONObject.put("media", mediaInfo.m3074e());
            }
            int i3 = this.f291h;
            if (i3 != 0) {
                jSONObject.put("itemId", i3);
            }
            jSONObject.put("autoplay", this.f292i);
            if (!Double.isNaN(this.f293j)) {
                jSONObject.put("startTime", this.f293j);
            }
            double d3 = this.f294k;
            if (d3 != Double.POSITIVE_INFINITY) {
                jSONObject.put("playbackDuration", d3);
            }
            jSONObject.put("preloadTime", this.f295l);
            if (this.f296m != null) {
                JSONArray jSONArray = new JSONArray();
                for (long j3 : this.f296m) {
                    jSONArray.put(j3);
                }
                jSONObject.put("activeTrackIds", jSONArray);
            }
            JSONObject jSONObject2 = this.f298o;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f290g, Integer.valueOf(this.f291h), Boolean.valueOf(this.f292i), Double.valueOf(this.f293j), Double.valueOf(this.f294k), Double.valueOf(this.f295l), Integer.valueOf(Arrays.hashCode(this.f296m)), String.valueOf(this.f298o)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        JSONObject jSONObject = this.f298o;
        this.f297n = jSONObject == null ? null : jSONObject.toString();
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3298U(parcel, 2, this.f290g, i3);
        int i4 = this.f291h;
        AbstractC1303m.m3311d0(parcel, 3, 4);
        parcel.writeInt(i4);
        boolean z3 = this.f292i;
        AbstractC1303m.m3311d0(parcel, 4, 4);
        parcel.writeInt(z3 ? 1 : 0);
        double d3 = this.f293j;
        AbstractC1303m.m3311d0(parcel, 5, 8);
        parcel.writeDouble(d3);
        double d4 = this.f294k;
        AbstractC1303m.m3311d0(parcel, 6, 8);
        parcel.writeDouble(d4);
        double d5 = this.f295l;
        AbstractC1303m.m3311d0(parcel, 7, 8);
        parcel.writeDouble(d5);
        AbstractC1303m.m3297T(parcel, 8, this.f296m);
        AbstractC1303m.m3299V(parcel, 9, this.f297n);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }

    public C0140o(JSONObject jSONObject) throws JSONException {
        this(null, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        m597e(jSONObject);
    }
}
