package p013E1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import p028J1.AbstractC0295a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: E1.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0149x extends AbstractC0512a {
    public static final Parcelable.Creator<C0149x> CREATOR = new C0147v(3);

    /* JADX INFO: renamed from: g */
    public final C0148w f350g;

    /* JADX INFO: renamed from: h */
    public final C0148w f351h;

    public C0149x(C0148w c0148w, C0148w c0148w2) {
        this.f350g = c0148w;
        this.f351h = c0148w2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0149x)) {
            return false;
        }
        C0149x c0149x = (C0149x) obj;
        return AbstractC0295a.m828e(this.f350g, c0149x.f350g) && AbstractC0295a.m828e(this.f351h, c0149x.f351h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f350g, this.f351h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3298U(parcel, 2, this.f350g, i3);
        AbstractC1303m.m3298U(parcel, 3, this.f351h, i3);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
