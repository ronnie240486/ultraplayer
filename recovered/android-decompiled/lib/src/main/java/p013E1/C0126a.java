package p013E1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p028J1.AbstractC0295a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: E1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0126a extends AbstractC0512a {
    public static final Parcelable.Creator<C0126a> CREATOR = new C0147v(0);

    /* JADX INFO: renamed from: g */
    public final String f205g;

    /* JADX INFO: renamed from: h */
    public final String f206h;

    /* JADX INFO: renamed from: i */
    public final long f207i;

    /* JADX INFO: renamed from: j */
    public final String f208j;

    /* JADX INFO: renamed from: k */
    public final String f209k;

    /* JADX INFO: renamed from: l */
    public final String f210l;

    /* JADX INFO: renamed from: m */
    public final String f211m;

    /* JADX INFO: renamed from: n */
    public final String f212n;

    /* JADX INFO: renamed from: o */
    public final String f213o;

    /* JADX INFO: renamed from: p */
    public final long f214p;

    /* JADX INFO: renamed from: q */
    public final String f215q;

    /* JADX INFO: renamed from: r */
    public final C0145t f216r;

    /* JADX INFO: renamed from: s */
    public final JSONObject f217s;

    public C0126a(String str, String str2, long j3, String str3, String str4, String str5, String str6, String str7, String str8, long j4, String str9, C0145t c0145t) {
        this.f205g = str;
        this.f206h = str2;
        this.f207i = j3;
        this.f208j = str3;
        this.f209k = str4;
        this.f210l = str5;
        this.f211m = str6;
        this.f212n = str7;
        this.f213o = str8;
        this.f214p = j4;
        this.f215q = str9;
        this.f216r = c0145t;
        if (TextUtils.isEmpty(str6)) {
            this.f217s = new JSONObject();
            return;
        }
        try {
            this.f217s = new JSONObject(str6);
        } catch (JSONException e3) {
            Locale locale = Locale.ROOT;
            Log.w("AdBreakClipInfo", "Error creating AdBreakClipInfo: " + e3.getMessage());
            this.f211m = null;
            this.f217s = new JSONObject();
        }
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m587e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f205g);
            long j3 = this.f207i;
            Pattern pattern = AbstractC0295a.f786a;
            jSONObject.put("duration", j3 / 1000.0d);
            long j4 = this.f214p;
            if (j4 != -1) {
                jSONObject.put("whenSkippable", j4 / 1000.0d);
            }
            String str = this.f212n;
            if (str != null) {
                jSONObject.put("contentId", str);
            }
            String str2 = this.f209k;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            String str3 = this.f206h;
            if (str3 != null) {
                jSONObject.put("title", str3);
            }
            String str4 = this.f208j;
            if (str4 != null) {
                jSONObject.put("contentUrl", str4);
            }
            String str5 = this.f210l;
            if (str5 != null) {
                jSONObject.put("clickThroughUrl", str5);
            }
            JSONObject jSONObject2 = this.f217s;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str6 = this.f213o;
            if (str6 != null) {
                jSONObject.put("posterUrl", str6);
            }
            String str7 = this.f215q;
            if (str7 != null) {
                jSONObject.put("hlsSegmentFormat", str7);
            }
            C0145t c0145t = this.f216r;
            if (c0145t != null) {
                jSONObject.put("vastAdsRequest", c0145t.m605e());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0126a)) {
            return false;
        }
        C0126a c0126a = (C0126a) obj;
        return AbstractC0295a.m828e(this.f205g, c0126a.f205g) && AbstractC0295a.m828e(this.f206h, c0126a.f206h) && this.f207i == c0126a.f207i && AbstractC0295a.m828e(this.f208j, c0126a.f208j) && AbstractC0295a.m828e(this.f209k, c0126a.f209k) && AbstractC0295a.m828e(this.f210l, c0126a.f210l) && AbstractC0295a.m828e(this.f211m, c0126a.f211m) && AbstractC0295a.m828e(this.f212n, c0126a.f212n) && AbstractC0295a.m828e(this.f213o, c0126a.f213o) && this.f214p == c0126a.f214p && AbstractC0295a.m828e(this.f215q, c0126a.f215q) && AbstractC0295a.m828e(this.f216r, c0126a.f216r);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f205g, this.f206h, Long.valueOf(this.f207i), this.f208j, this.f209k, this.f210l, this.f211m, this.f212n, this.f213o, Long.valueOf(this.f214p), this.f215q, this.f216r});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3299V(parcel, 2, this.f205g);
        AbstractC1303m.m3299V(parcel, 3, this.f206h);
        AbstractC1303m.m3311d0(parcel, 4, 8);
        parcel.writeLong(this.f207i);
        AbstractC1303m.m3299V(parcel, 5, this.f208j);
        AbstractC1303m.m3299V(parcel, 6, this.f209k);
        AbstractC1303m.m3299V(parcel, 7, this.f210l);
        AbstractC1303m.m3299V(parcel, 8, this.f211m);
        AbstractC1303m.m3299V(parcel, 9, this.f212n);
        AbstractC1303m.m3299V(parcel, 10, this.f213o);
        AbstractC1303m.m3311d0(parcel, 11, 8);
        parcel.writeLong(this.f214p);
        AbstractC1303m.m3299V(parcel, 12, this.f215q);
        AbstractC1303m.m3298U(parcel, 13, this.f216r, i3);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
