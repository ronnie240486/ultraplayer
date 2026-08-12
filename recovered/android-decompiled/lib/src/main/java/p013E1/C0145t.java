package p013E1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import p028J1.AbstractC0295a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: E1.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0145t extends AbstractC0512a {
    public static final Parcelable.Creator<C0145t> CREATOR = new C0147v(20);

    /* JADX INFO: renamed from: g */
    public final String f340g;

    /* JADX INFO: renamed from: h */
    public final String f341h;

    public C0145t(String str, String str2) {
        this.f340g = str;
        this.f341h = str2;
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m605e() {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = this.f340g;
            if (str != null) {
                jSONObject.put("adTagUrl", str);
            }
            String str2 = this.f341h;
            if (str2 != null) {
                jSONObject.put("adsResponse", str2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0145t)) {
            return false;
        }
        C0145t c0145t = (C0145t) obj;
        return AbstractC0295a.m828e(this.f340g, c0145t.f340g) && AbstractC0295a.m828e(this.f341h, c0145t.f341h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f340g, this.f341h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3299V(parcel, 2, this.f340g);
        AbstractC1303m.m3299V(parcel, 3, this.f341h);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
