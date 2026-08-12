package p013E1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p031K1.AbstractC0336a;
import p046P1.AbstractC0491s;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: E1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0138m extends AbstractC0512a {
    public static final Parcelable.Creator<C0138m> CREATOR = new C0147v(12);

    /* JADX INFO: renamed from: g */
    public int f275g;

    /* JADX INFO: renamed from: h */
    public String f276h;

    /* JADX INFO: renamed from: i */
    public ArrayList f277i;

    /* JADX INFO: renamed from: j */
    public ArrayList f278j;

    /* JADX INFO: renamed from: k */
    public double f279k;

    /* JADX INFO: renamed from: e */
    public final JSONObject m595e() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i3 = this.f275g;
            if (i3 == 0) {
                jSONObject.put("containerType", "GENERIC_CONTAINER");
            } else if (i3 == 1) {
                jSONObject.put("containerType", "AUDIOBOOK_CONTAINER");
            }
            if (!TextUtils.isEmpty(this.f276h)) {
                jSONObject.put("title", this.f276h);
            }
            ArrayList arrayList = this.f277i;
            if (arrayList != null && !arrayList.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList2 = this.f277i;
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList2.get(i4);
                    i4++;
                    jSONArray.put(((C0137l) obj).m593h());
                }
                jSONObject.put("sections", jSONArray);
            }
            ArrayList arrayList3 = this.f278j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                jSONObject.put("containerImages", AbstractC0336a.m939b(this.f278j));
            }
            jSONObject.put("containerDuration", this.f279k);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0138m)) {
            return false;
        }
        C0138m c0138m = (C0138m) obj;
        return this.f275g == c0138m.f275g && TextUtils.equals(this.f276h, c0138m.f276h) && AbstractC0491s.m1216h(this.f277i, c0138m.f277i) && AbstractC0491s.m1216h(this.f278j, c0138m.f278j) && this.f279k == c0138m.f279k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f275g), this.f276h, this.f277i, this.f278j, Double.valueOf(this.f279k)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        int i4 = this.f275g;
        AbstractC1303m.m3311d0(parcel, 2, 4);
        parcel.writeInt(i4);
        AbstractC1303m.m3299V(parcel, 3, this.f276h);
        ArrayList arrayList = this.f277i;
        AbstractC1303m.m3302Y(parcel, 4, arrayList == null ? null : Collections.unmodifiableList(arrayList));
        ArrayList arrayList2 = this.f278j;
        AbstractC1303m.m3302Y(parcel, 5, arrayList2 != null ? Collections.unmodifiableList(arrayList2) : null);
        double d3 = this.f279k;
        AbstractC1303m.m3311d0(parcel, 6, 8);
        parcel.writeDouble(d3);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
