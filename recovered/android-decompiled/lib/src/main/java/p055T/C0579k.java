package p055T;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;
import p024I0.C0271a;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: T.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0579k implements Comparator, Parcelable {
    public static final Parcelable.Creator<C0579k> CREATOR = new C0271a(23);

    /* JADX INFO: renamed from: g */
    public final C0578j[] f2086g;

    /* JADX INFO: renamed from: h */
    public int f2087h;

    /* JADX INFO: renamed from: i */
    public final String f2088i;

    /* JADX INFO: renamed from: j */
    public final int f2089j;

    public C0579k(String str, boolean z3, C0578j... c0578jArr) {
        this.f2088i = str;
        c0578jArr = z3 ? (C0578j[]) c0578jArr.clone() : c0578jArr;
        this.f2086g = c0578jArr;
        this.f2089j = c0578jArr.length;
        Arrays.sort(c0578jArr, this);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C0578j c0578j = (C0578j) obj;
        C0578j c0578j2 = (C0578j) obj2;
        UUID uuid = AbstractC0571e.f2057a;
        if (uuid.equals(c0578j.f2082h)) {
            return uuid.equals(c0578j2.f2082h) ? 0 : 1;
        }
        return c0578j.f2082h.compareTo(c0578j2.f2082h);
    }

    /* JADX INFO: renamed from: d */
    public final C0579k m1444d(String str) {
        int i3 = AbstractC0632A.f2454a;
        return Objects.equals(this.f2088i, str) ? this : new C0579k(str, false, this.f2086g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0579k.class == obj.getClass()) {
            C0579k c0579k = (C0579k) obj;
            int i3 = AbstractC0632A.f2454a;
            if (Objects.equals(this.f2088i, c0579k.f2088i) && Arrays.equals(this.f2086g, c0579k.f2086g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f2087h == 0) {
            String str = this.f2088i;
            this.f2087h = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f2086g);
        }
        return this.f2087h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f2088i);
        parcel.writeTypedArray(this.f2086g, 0);
    }

    public C0579k(Parcel parcel) {
        this.f2088i = parcel.readString();
        C0578j[] c0578jArr = (C0578j[]) parcel.createTypedArray(C0578j.CREATOR);
        int i3 = AbstractC0632A.f2454a;
        this.f2086g = c0578jArr;
        this.f2089j = c0578jArr.length;
    }
}
