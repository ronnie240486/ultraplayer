package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import org.json.JSONObject;
import p013E1.C0147v;
import p028J1.AbstractC0295a;
import p049Q1.AbstractC0512a;

/* JADX INFO: loaded from: classes.dex */
public class MediaError extends AbstractC0512a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaError> CREATOR = new C0147v(6);

    /* JADX INFO: renamed from: g */
    public final String f5438g;

    /* JADX INFO: renamed from: h */
    public final long f5439h;

    /* JADX INFO: renamed from: i */
    public final Integer f5440i;

    /* JADX INFO: renamed from: j */
    public final String f5441j;

    /* JADX INFO: renamed from: k */
    public String f5442k;

    /* JADX INFO: renamed from: l */
    public final JSONObject f5443l;

    public MediaError(String str, long j3, Integer num, String str2, JSONObject jSONObject) {
        this.f5438g = str;
        this.f5439h = j3;
        this.f5440i = num;
        this.f5441j = str2;
        this.f5443l = jSONObject;
    }

    /* JADX INFO: renamed from: e */
    public static MediaError m3073e(JSONObject jSONObject) {
        return new MediaError(jSONObject.optString("type", "ERROR"), jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, AbstractC0295a.m825b(jSONObject, "reason"), jSONObject.has("customData") ? jSONObject.optJSONObject("customData") : null);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        JSONObject jSONObject = this.f5443l;
        this.f5442k = jSONObject == null ? null : jSONObject.toString();
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3299V(parcel, 2, this.f5438g);
        AbstractC1303m.m3311d0(parcel, 3, 8);
        parcel.writeLong(this.f5439h);
        Integer num = this.f5440i;
        if (num != null) {
            AbstractC1303m.m3311d0(parcel, 4, 4);
            parcel.writeInt(num.intValue());
        }
        AbstractC1303m.m3299V(parcel, 5, this.f5441j);
        AbstractC1303m.m3299V(parcel, 6, this.f5442k);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
