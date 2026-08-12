package p013E1;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p028J1.AbstractC0295a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: E1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0129d extends AbstractC0512a {
    public static final Parcelable.Creator<C0129d> CREATOR = new C0147v(17);

    /* JADX INFO: renamed from: g */
    public final String f231g;

    /* JADX INFO: renamed from: h */
    public final String f232h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f233i;

    /* JADX INFO: renamed from: j */
    public final String f234j;

    /* JADX INFO: renamed from: k */
    public final Uri f235k;

    /* JADX INFO: renamed from: l */
    public final String f236l;

    /* JADX INFO: renamed from: m */
    public final String f237m;

    /* JADX INFO: renamed from: n */
    public final Boolean f238n;

    /* JADX INFO: renamed from: o */
    public final Boolean f239o;

    public C0129d(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2) {
        this.f231g = str;
        this.f232h = str2;
        this.f233i = arrayList;
        this.f234j = str3;
        this.f235k = uri;
        this.f236l = str4;
        this.f237m = str5;
        this.f238n = bool;
        this.f239o = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0129d)) {
            return false;
        }
        C0129d c0129d = (C0129d) obj;
        return AbstractC0295a.m828e(this.f231g, c0129d.f231g) && AbstractC0295a.m828e(this.f232h, c0129d.f232h) && AbstractC0295a.m828e(this.f233i, c0129d.f233i) && AbstractC0295a.m828e(this.f234j, c0129d.f234j) && AbstractC0295a.m828e(this.f235k, c0129d.f235k) && AbstractC0295a.m828e(this.f236l, c0129d.f236l) && AbstractC0295a.m828e(this.f237m, c0129d.f237m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f231g, this.f232h, this.f233i, this.f234j, this.f235k, this.f236l});
    }

    public final String toString() {
        ArrayList arrayList = this.f233i;
        return "applicationId: " + this.f231g + ", name: " + this.f232h + ", namespaces.count: " + (arrayList == null ? 0 : arrayList.size()) + ", senderAppIdentifier: " + this.f234j + ", senderAppLaunchUrl: " + String.valueOf(this.f235k) + ", iconUrl: " + this.f236l + ", type: " + this.f237m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3299V(parcel, 2, this.f231g);
        AbstractC1303m.m3299V(parcel, 3, this.f232h);
        AbstractC1303m.m3300W(parcel, 5, Collections.unmodifiableList(this.f233i));
        AbstractC1303m.m3299V(parcel, 6, this.f234j);
        AbstractC1303m.m3298U(parcel, 7, this.f235k, i3);
        AbstractC1303m.m3299V(parcel, 8, this.f236l);
        AbstractC1303m.m3299V(parcel, 9, this.f237m);
        AbstractC1303m.m3293P(parcel, 10, this.f238n);
        AbstractC1303m.m3293P(parcel, 11, this.f239o);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
