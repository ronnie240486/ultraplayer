package p021H0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import p007C0.C0101a;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: H0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0254b implements Parcelable {
    public static final Parcelable.Creator<C0254b> CREATOR = new C0101a(28);

    /* JADX INFO: renamed from: g */
    public final long f656g;

    /* JADX INFO: renamed from: h */
    public final long f657h;

    /* JADX INFO: renamed from: i */
    public final int f658i;

    public C0254b(int i3, long j3, long j4) {
        AbstractC0646n.m1625c(j3 < j4);
        this.f656g = j3;
        this.f657h = j4;
        this.f658i = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0254b.class == obj.getClass()) {
            C0254b c0254b = (C0254b) obj;
            if (this.f656g == c0254b.f656g && this.f657h == c0254b.f657h && this.f658i == c0254b.f658i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f656g), Long.valueOf(this.f657h), Integer.valueOf(this.f658i)});
    }

    public final String toString() {
        int i3 = AbstractC0632A.f2454a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f656g + ", endTimeMs=" + this.f657h + ", speedDivisor=" + this.f658i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f656g);
        parcel.writeLong(this.f657h);
        parcel.writeInt(this.f658i);
    }
}
