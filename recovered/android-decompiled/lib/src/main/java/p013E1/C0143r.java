package p013E1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import org.json.JSONObject;
import p046P1.AbstractC0491s;
import p049Q1.AbstractC0512a;
import p057T1.AbstractC0600a;

/* JADX INFO: renamed from: E1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0143r extends AbstractC0512a {
    public static final Parcelable.Creator<C0143r> CREATOR = new C0147v(18);

    /* JADX INFO: renamed from: g */
    public final C0136k f324g;

    /* JADX INFO: renamed from: h */
    public String f325h;

    /* JADX INFO: renamed from: i */
    public final JSONObject f326i;

    public C0143r(C0136k c0136k, JSONObject jSONObject) {
        this.f324g = c0136k;
        this.f326i = jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0143r)) {
            return false;
        }
        C0143r c0143r = (C0143r) obj;
        if (AbstractC0600a.m1464a(this.f326i, c0143r.f326i)) {
            return AbstractC0491s.m1216h(this.f324g, c0143r.f324g);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f324g, String.valueOf(this.f326i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        JSONObject jSONObject = this.f326i;
        this.f325h = jSONObject == null ? null : jSONObject.toString();
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3298U(parcel, 2, this.f324g, i3);
        AbstractC1303m.m3299V(parcel, 3, this.f325h);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
