package p013E1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import org.json.JSONObject;
import p028J1.C0296b;
import p046P1.AbstractC0491s;
import p049Q1.AbstractC0512a;
import p057T1.AbstractC0600a;

/* JADX INFO: renamed from: E1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0136k extends AbstractC0512a {

    /* JADX INFO: renamed from: g */
    public final MediaInfo f257g;

    /* JADX INFO: renamed from: h */
    public final C0139n f258h;

    /* JADX INFO: renamed from: i */
    public final Boolean f259i;

    /* JADX INFO: renamed from: j */
    public final long f260j;

    /* JADX INFO: renamed from: k */
    public final double f261k;

    /* JADX INFO: renamed from: l */
    public final long[] f262l;

    /* JADX INFO: renamed from: m */
    public String f263m;

    /* JADX INFO: renamed from: n */
    public final JSONObject f264n;

    /* JADX INFO: renamed from: o */
    public final String f265o;

    /* JADX INFO: renamed from: p */
    public final String f266p;

    /* JADX INFO: renamed from: q */
    public final String f267q;

    /* JADX INFO: renamed from: r */
    public final String f268r;

    /* JADX INFO: renamed from: s */
    public final long f269s;

    /* JADX INFO: renamed from: t */
    public static final C0296b f256t = new C0296b("MediaLoadRequestData", null);
    public static final Parcelable.Creator<C0136k> CREATOR = new C0147v(10);

    public C0136k(MediaInfo mediaInfo, C0139n c0139n, Boolean bool, long j3, double d3, long[] jArr, JSONObject jSONObject, String str, String str2, String str3, String str4, long j4) {
        this.f257g = mediaInfo;
        this.f258h = c0139n;
        this.f259i = bool;
        this.f260j = j3;
        this.f261k = d3;
        this.f262l = jArr;
        this.f264n = jSONObject;
        this.f265o = str;
        this.f266p = str2;
        this.f267q = str3;
        this.f268r = str4;
        this.f269s = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0136k)) {
            return false;
        }
        C0136k c0136k = (C0136k) obj;
        return AbstractC0600a.m1464a(this.f264n, c0136k.f264n) && AbstractC0491s.m1216h(this.f257g, c0136k.f257g) && AbstractC0491s.m1216h(this.f258h, c0136k.f258h) && AbstractC0491s.m1216h(this.f259i, c0136k.f259i) && this.f260j == c0136k.f260j && this.f261k == c0136k.f261k && Arrays.equals(this.f262l, c0136k.f262l) && AbstractC0491s.m1216h(this.f265o, c0136k.f265o) && AbstractC0491s.m1216h(this.f266p, c0136k.f266p) && AbstractC0491s.m1216h(this.f267q, c0136k.f267q) && AbstractC0491s.m1216h(this.f268r, c0136k.f268r) && this.f269s == c0136k.f269s;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f257g, this.f258h, this.f259i, Long.valueOf(this.f260j), Double.valueOf(this.f261k), this.f262l, String.valueOf(this.f264n), this.f265o, this.f266p, this.f267q, this.f268r, Long.valueOf(this.f269s)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        JSONObject jSONObject = this.f264n;
        this.f263m = jSONObject == null ? null : jSONObject.toString();
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3298U(parcel, 2, this.f257g, i3);
        AbstractC1303m.m3298U(parcel, 3, this.f258h, i3);
        AbstractC1303m.m3293P(parcel, 4, this.f259i);
        AbstractC1303m.m3311d0(parcel, 5, 8);
        parcel.writeLong(this.f260j);
        AbstractC1303m.m3311d0(parcel, 6, 8);
        parcel.writeDouble(this.f261k);
        AbstractC1303m.m3297T(parcel, 7, this.f262l);
        AbstractC1303m.m3299V(parcel, 8, this.f263m);
        AbstractC1303m.m3299V(parcel, 9, this.f265o);
        AbstractC1303m.m3299V(parcel, 10, this.f266p);
        AbstractC1303m.m3299V(parcel, 11, this.f267q);
        AbstractC1303m.m3299V(parcel, 12, this.f268r);
        AbstractC1303m.m3311d0(parcel, 13, 8);
        parcel.writeLong(this.f269s);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
