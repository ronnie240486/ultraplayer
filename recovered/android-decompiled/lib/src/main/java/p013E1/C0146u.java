package p013E1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import p028J1.C0296b;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: E1.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0146u extends AbstractC0512a {

    /* JADX INFO: renamed from: g */
    public final int f343g;

    /* JADX INFO: renamed from: h */
    public final int f344h;

    /* JADX INFO: renamed from: i */
    public final int f345i;

    /* JADX INFO: renamed from: j */
    public static final C0296b f342j = new C0296b("VideoInfo", null);
    public static final Parcelable.Creator<C0146u> CREATOR = new C0147v(21);

    public C0146u(int i3, int i4, int i5) {
        this.f343g = i3;
        this.f344h = i4;
        this.f345i = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0146u)) {
            return false;
        }
        C0146u c0146u = (C0146u) obj;
        return this.f344h == c0146u.f344h && this.f343g == c0146u.f343g && this.f345i == c0146u.f345i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f344h), Integer.valueOf(this.f343g), Integer.valueOf(this.f345i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 2, 4);
        parcel.writeInt(this.f343g);
        AbstractC1303m.m3311d0(parcel, 3, 4);
        parcel.writeInt(this.f344h);
        AbstractC1303m.m3311d0(parcel, 4, 4);
        parcel.writeInt(this.f345i);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
