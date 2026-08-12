package p028J1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import p024I0.C0271a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: J1.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0320z extends AbstractC0512a {
    public static final Parcelable.Creator<C0320z> CREATOR = new C0271a(6);

    /* JADX INFO: renamed from: g */
    public final int f878g;

    /* JADX INFO: renamed from: h */
    public final boolean f879h;

    /* JADX INFO: renamed from: i */
    public final boolean f880i;

    public C0320z(int i3, boolean z3, boolean z4) {
        this.f878g = i3;
        this.f879h = z3;
        this.f880i = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0320z)) {
            return false;
        }
        C0320z c0320z = (C0320z) obj;
        return this.f878g == c0320z.f878g && this.f879h == c0320z.f879h && this.f880i == c0320z.f880i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f878g), Boolean.valueOf(this.f879h), Boolean.valueOf(this.f880i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 2, 4);
        parcel.writeInt(this.f878g);
        AbstractC1303m.m3311d0(parcel, 3, 4);
        parcel.writeInt(this.f879h ? 1 : 0);
        AbstractC1303m.m3311d0(parcel, 4, 4);
        parcel.writeInt(this.f880i ? 1 : 0);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
