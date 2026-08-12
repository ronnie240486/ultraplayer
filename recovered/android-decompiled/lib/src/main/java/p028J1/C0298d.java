package p028J1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import java.util.Locale;
import p013E1.C0129d;
import p013E1.C0149x;
import p024I0.C0271a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: J1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0298d extends AbstractC0512a {
    public static final Parcelable.Creator<C0298d> CREATOR = new C0271a(7);

    /* JADX INFO: renamed from: g */
    public double f792g;

    /* JADX INFO: renamed from: h */
    public boolean f793h;

    /* JADX INFO: renamed from: i */
    public int f794i;

    /* JADX INFO: renamed from: j */
    public C0129d f795j;

    /* JADX INFO: renamed from: k */
    public int f796k;

    /* JADX INFO: renamed from: l */
    public C0149x f797l;

    /* JADX INFO: renamed from: m */
    public double f798m;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0298d)) {
            return false;
        }
        C0298d c0298d = (C0298d) obj;
        if (this.f792g == c0298d.f792g && this.f793h == c0298d.f793h && this.f794i == c0298d.f794i && AbstractC0295a.m828e(this.f795j, c0298d.f795j) && this.f796k == c0298d.f796k) {
            C0149x c0149x = this.f797l;
            if (AbstractC0295a.m828e(c0149x, c0149x) && this.f798m == c0298d.f798m) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f792g), Boolean.valueOf(this.f793h), Integer.valueOf(this.f794i), this.f795j, Integer.valueOf(this.f796k), this.f797l, Double.valueOf(this.f798m)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.f792g));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 2, 8);
        parcel.writeDouble(this.f792g);
        AbstractC1303m.m3311d0(parcel, 3, 4);
        parcel.writeInt(this.f793h ? 1 : 0);
        AbstractC1303m.m3311d0(parcel, 4, 4);
        parcel.writeInt(this.f794i);
        AbstractC1303m.m3298U(parcel, 5, this.f795j, i3);
        AbstractC1303m.m3311d0(parcel, 6, 4);
        parcel.writeInt(this.f796k);
        AbstractC1303m.m3298U(parcel, 7, this.f797l, i3);
        AbstractC1303m.m3311d0(parcel, 8, 8);
        parcel.writeDouble(this.f798m);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
