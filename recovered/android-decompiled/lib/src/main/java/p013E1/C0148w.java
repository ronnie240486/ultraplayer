package p013E1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: E1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0148w extends AbstractC0512a {
    public static final Parcelable.Creator<C0148w> CREATOR = new C0147v(2);

    /* JADX INFO: renamed from: g */
    public final float f347g;

    /* JADX INFO: renamed from: h */
    public final float f348h;

    /* JADX INFO: renamed from: i */
    public final float f349i;

    public C0148w(float f, float f3, float f4) {
        this.f347g = f;
        this.f348h = f3;
        this.f349i = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0148w)) {
            return false;
        }
        C0148w c0148w = (C0148w) obj;
        return this.f347g == c0148w.f347g && this.f348h == c0148w.f348h && this.f349i == c0148w.f349i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f347g), Float.valueOf(this.f348h), Float.valueOf(this.f349i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 2, 4);
        parcel.writeFloat(this.f347g);
        AbstractC1303m.m3311d0(parcel, 3, 4);
        parcel.writeFloat(this.f348h);
        AbstractC1303m.m3311d0(parcel, 4, 4);
        parcel.writeFloat(this.f349i);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
