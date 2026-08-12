package p013E1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import p046P1.AbstractC0491s;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: E1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0133h extends AbstractC0512a {
    public static final Parcelable.Creator<C0133h> CREATOR = new C0147v(1);

    /* JADX INFO: renamed from: g */
    public final String f245g;

    /* JADX INFO: renamed from: h */
    public final String f246h;

    public C0133h(String str, String str2) {
        this.f245g = str;
        this.f246h = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0133h)) {
            return false;
        }
        C0133h c0133h = (C0133h) obj;
        return AbstractC0491s.m1216h(this.f245g, c0133h.f245g) && AbstractC0491s.m1216h(this.f246h, c0133h.f246h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f245g, this.f246h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3299V(parcel, 1, this.f245g);
        AbstractC1303m.m3299V(parcel, 2, this.f246h);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
