package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013E1.C0147v;
import p028J1.AbstractC0295a;
import p049Q1.AbstractC0512a;
import p057T1.AbstractC0600a;

/* JADX INFO: loaded from: classes.dex */
public final class MediaTrack extends AbstractC0512a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaTrack> CREATOR = new C0147v(16);

    /* JADX INFO: renamed from: g */
    public final long f5462g;

    /* JADX INFO: renamed from: h */
    public final int f5463h;

    /* JADX INFO: renamed from: i */
    public final String f5464i;

    /* JADX INFO: renamed from: j */
    public final String f5465j;

    /* JADX INFO: renamed from: k */
    public final String f5466k;

    /* JADX INFO: renamed from: l */
    public final String f5467l;

    /* JADX INFO: renamed from: m */
    public final int f5468m;

    /* JADX INFO: renamed from: n */
    public final AbstractCollection f5469n;

    /* JADX INFO: renamed from: o */
    public String f5470o;

    /* JADX INFO: renamed from: p */
    public final JSONObject f5471p;

    /* JADX WARN: Multi-variable type inference failed */
    public MediaTrack(long j3, int i3, String str, String str2, String str3, String str4, int i4, List list, JSONObject jSONObject) {
        this.f5462g = j3;
        this.f5463h = i3;
        this.f5464i = str;
        this.f5465j = str2;
        this.f5466k = str3;
        this.f5467l = str4;
        this.f5468m = i4;
        this.f5469n = (AbstractCollection) list;
        this.f5471p = jSONObject;
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m3076e() {
        String str = this.f5467l;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackId", this.f5462g);
            int i3 = this.f5463h;
            if (i3 == 1) {
                jSONObject.put("type", "TEXT");
            } else if (i3 == 2) {
                jSONObject.put("type", "AUDIO");
            } else if (i3 == 3) {
                jSONObject.put("type", "VIDEO");
            }
            String str2 = this.f5464i;
            if (str2 != null) {
                jSONObject.put("trackContentId", str2);
            }
            String str3 = this.f5465j;
            if (str3 != null) {
                jSONObject.put("trackContentType", str3);
            }
            String str4 = this.f5466k;
            if (str4 != null) {
                jSONObject.put("name", str4);
            }
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("language", str);
            }
            int i4 = this.f5468m;
            if (i4 == 1) {
                jSONObject.put("subtype", "SUBTITLES");
            } else if (i4 == 2) {
                jSONObject.put("subtype", "CAPTIONS");
            } else if (i4 == 3) {
                jSONObject.put("subtype", "DESCRIPTIONS");
            } else if (i4 == 4) {
                jSONObject.put("subtype", "CHAPTERS");
            } else if (i4 == 5) {
                jSONObject.put("subtype", "METADATA");
            }
            AbstractCollection abstractCollection = this.f5469n;
            if (abstractCollection != null) {
                jSONObject.put("roles", new JSONArray((Collection) abstractCollection));
            }
            JSONObject jSONObject2 = this.f5471p;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaTrack) {
                MediaTrack mediaTrack = (MediaTrack) obj;
                JSONObject jSONObject = this.f5471p;
                boolean z3 = jSONObject == null;
                JSONObject jSONObject2 = mediaTrack.f5471p;
                if (z3 == (jSONObject2 == null) && ((jSONObject == null || jSONObject2 == null || AbstractC0600a.m1464a(jSONObject, jSONObject2)) && this.f5462g == mediaTrack.f5462g && this.f5463h == mediaTrack.f5463h && AbstractC0295a.m828e(this.f5464i, mediaTrack.f5464i) && AbstractC0295a.m828e(this.f5465j, mediaTrack.f5465j) && AbstractC0295a.m828e(this.f5466k, mediaTrack.f5466k) && AbstractC0295a.m828e(this.f5467l, mediaTrack.f5467l) && this.f5468m == mediaTrack.f5468m && AbstractC0295a.m828e(this.f5469n, mediaTrack.f5469n))) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Long lValueOf = Long.valueOf(this.f5462g);
        Integer numValueOf = Integer.valueOf(this.f5463h);
        Integer numValueOf2 = Integer.valueOf(this.f5468m);
        String strValueOf = String.valueOf(this.f5471p);
        return Arrays.hashCode(new Object[]{lValueOf, numValueOf, this.f5464i, this.f5465j, this.f5466k, this.f5467l, numValueOf2, this.f5469n, strValueOf});
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.AbstractCollection, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        JSONObject jSONObject = this.f5471p;
        this.f5470o = jSONObject == null ? null : jSONObject.toString();
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 2, 8);
        parcel.writeLong(this.f5462g);
        AbstractC1303m.m3311d0(parcel, 3, 4);
        parcel.writeInt(this.f5463h);
        AbstractC1303m.m3299V(parcel, 4, this.f5464i);
        AbstractC1303m.m3299V(parcel, 5, this.f5465j);
        AbstractC1303m.m3299V(parcel, 6, this.f5466k);
        AbstractC1303m.m3299V(parcel, 7, this.f5467l);
        AbstractC1303m.m3311d0(parcel, 8, 4);
        parcel.writeInt(this.f5468m);
        AbstractC1303m.m3300W(parcel, 9, this.f5469n);
        AbstractC1303m.m3299V(parcel, 10, this.f5470o);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
