package p043O1;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import p024I0.C0271a;
import p046P1.AbstractC0491s;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: O1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0448a extends AbstractC0512a {
    public static final Parcelable.Creator<C0448a> CREATOR = new C0271a(13);

    /* JADX INFO: renamed from: g */
    public final int f1510g;

    /* JADX INFO: renamed from: h */
    public final Uri f1511h;

    /* JADX INFO: renamed from: i */
    public final int f1512i;

    /* JADX INFO: renamed from: j */
    public final int f1513j;

    public C0448a(int i3, Uri uri, int i4, int i5) {
        this.f1510g = i3;
        this.f1511h = uri;
        this.f1512i = i4;
        this.f1513j = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C0448a)) {
            C0448a c0448a = (C0448a) obj;
            if (AbstractC0491s.m1216h(this.f1511h, c0448a.f1511h) && this.f1512i == c0448a.f1512i && this.f1513j == c0448a.f1513j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1511h, Integer.valueOf(this.f1512i), Integer.valueOf(this.f1513j)});
    }

    public final String toString() {
        Locale locale = Locale.US;
        return "Image " + this.f1512i + "x" + this.f1513j + " " + this.f1511h.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 1, 4);
        parcel.writeInt(this.f1510g);
        AbstractC1303m.m3298U(parcel, 2, this.f1511h, i3);
        AbstractC1303m.m3311d0(parcel, 3, 4);
        parcel.writeInt(this.f1512i);
        AbstractC1303m.m3311d0(parcel, 4, 4);
        parcel.writeInt(this.f1513j);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }

    public C0448a(Uri uri, int i3, int i4) {
        this(1, uri, i3, i4);
        if (uri == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if (i3 < 0 || i4 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0448a(JSONObject jSONObject) {
        Uri uri = Uri.EMPTY;
        if (jSONObject.has("url")) {
            try {
                uri = Uri.parse(jSONObject.getString("url"));
            } catch (JSONException unused) {
            }
        }
        this(uri, jSONObject.optInt("width", 0), jSONObject.optInt("height", 0));
    }
}
