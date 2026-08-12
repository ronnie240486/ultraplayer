package p013E1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import p028J1.C0296b;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: E1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0135j extends AbstractC0512a {

    /* JADX INFO: renamed from: g */
    public final long f252g;

    /* JADX INFO: renamed from: h */
    public final long f253h;

    /* JADX INFO: renamed from: i */
    public final boolean f254i;

    /* JADX INFO: renamed from: j */
    public final boolean f255j;

    /* JADX INFO: renamed from: k */
    public static final C0296b f251k = new C0296b("MediaLiveSeekableRange", null);
    public static final Parcelable.Creator<C0135j> CREATOR = new C0147v(8);

    public C0135j(long j3, long j4, boolean z3, boolean z4) {
        this.f252g = Math.max(j3, 0L);
        this.f253h = Math.max(j4, 0L);
        this.f254i = z3;
        this.f255j = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0135j)) {
            return false;
        }
        C0135j c0135j = (C0135j) obj;
        return this.f252g == c0135j.f252g && this.f253h == c0135j.f253h && this.f254i == c0135j.f254i && this.f255j == c0135j.f255j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f252g), Long.valueOf(this.f253h), Boolean.valueOf(this.f254i), Boolean.valueOf(this.f255j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 2, 8);
        parcel.writeLong(this.f252g);
        AbstractC1303m.m3311d0(parcel, 3, 8);
        parcel.writeLong(this.f253h);
        AbstractC1303m.m3311d0(parcel, 4, 4);
        parcel.writeInt(this.f254i ? 1 : 0);
        AbstractC1303m.m3311d0(parcel, 5, 4);
        parcel.writeInt(this.f255j ? 1 : 0);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
