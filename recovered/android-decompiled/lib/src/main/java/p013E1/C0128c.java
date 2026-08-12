package p013E1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import p028J1.AbstractC0295a;
import p028J1.C0296b;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: E1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0128c extends AbstractC0512a {

    /* JADX INFO: renamed from: g */
    public final long f226g;

    /* JADX INFO: renamed from: h */
    public final long f227h;

    /* JADX INFO: renamed from: i */
    public final String f228i;

    /* JADX INFO: renamed from: j */
    public final String f229j;

    /* JADX INFO: renamed from: k */
    public final long f230k;

    /* JADX INFO: renamed from: l */
    public static final C0296b f225l = new C0296b("AdBreakStatus", null);
    public static final Parcelable.Creator<C0128c> CREATOR = new C0147v(9);

    public C0128c(long j3, long j4, String str, String str2, long j5) {
        this.f226g = j3;
        this.f227h = j4;
        this.f228i = str;
        this.f229j = str2;
        this.f230k = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0128c)) {
            return false;
        }
        C0128c c0128c = (C0128c) obj;
        return this.f226g == c0128c.f226g && this.f227h == c0128c.f227h && AbstractC0295a.m828e(this.f228i, c0128c.f228i) && AbstractC0295a.m828e(this.f229j, c0128c.f229j) && this.f230k == c0128c.f230k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f226g), Long.valueOf(this.f227h), this.f228i, this.f229j, Long.valueOf(this.f230k)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 2, 8);
        parcel.writeLong(this.f226g);
        AbstractC1303m.m3311d0(parcel, 3, 8);
        parcel.writeLong(this.f227h);
        AbstractC1303m.m3299V(parcel, 4, this.f228i);
        AbstractC1303m.m3299V(parcel, 5, this.f229j);
        AbstractC1303m.m3311d0(parcel, 6, 8);
        parcel.writeLong(this.f230k);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
