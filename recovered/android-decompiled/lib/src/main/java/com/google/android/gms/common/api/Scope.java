package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import p024I0.C0271a;
import p046P1.AbstractC0491s;
import p049Q1.AbstractC0512a;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractC0512a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C0271a(11);

    /* JADX INFO: renamed from: g */
    public final int f5492g;

    /* JADX INFO: renamed from: h */
    public final String f5493h;

    public Scope(int i3, String str) {
        AbstractC0491s.m1212d(str, "scopeUri must not be null or empty");
        this.f5492g = i3;
        this.f5493h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f5493h.equals(((Scope) obj).f5493h);
    }

    public final int hashCode() {
        return this.f5493h.hashCode();
    }

    public final String toString() {
        return this.f5493h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 1, 4);
        parcel.writeInt(this.f5492g);
        AbstractC1303m.m3299V(parcel, 2, this.f5493h);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
