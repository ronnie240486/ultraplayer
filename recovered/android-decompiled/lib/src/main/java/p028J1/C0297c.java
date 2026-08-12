package p028J1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import p024I0.C0271a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: J1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0297c extends AbstractC0512a {
    public static final Parcelable.Creator<C0297c> CREATOR = new C0271a(8);

    /* JADX INFO: renamed from: g */
    public final String f791g;

    public C0297c(String str) {
        this.f791g = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0297c) {
            return AbstractC0295a.m828e(this.f791g, ((C0297c) obj).f791g);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f791g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3299V(parcel, 2, this.f791g);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
