package p034L1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Arrays;
import p009D0.C0106b;
import p024I0.C0271a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: L1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0348c extends AbstractC0512a {
    public static final Parcelable.Creator<C0348c> CREATOR = new C0271a(10);

    /* JADX INFO: renamed from: g */
    public final String f1128g;

    /* JADX INFO: renamed from: h */
    public final int f1129h;

    /* JADX INFO: renamed from: i */
    public final long f1130i;

    public C0348c(String str) {
        this.f1128g = str;
        this.f1130i = 1L;
        this.f1129h = -1;
    }

    /* JADX INFO: renamed from: e */
    public final long m951e() {
        long j3 = this.f1130i;
        return j3 == -1 ? this.f1129h : j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0348c) {
            C0348c c0348c = (C0348c) obj;
            String str = this.f1128g;
            if (((str != null && str.equals(c0348c.f1128g)) || (str == null && c0348c.f1128g == null)) && m951e() == c0348c.m951e()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1128g, Long.valueOf(m951e())});
    }

    public final String toString() {
        C0106b c0106b = new C0106b(this);
        c0106b.m525m(this.f1128g, "name");
        c0106b.m525m(Long.valueOf(m951e()), "version");
        return c0106b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3299V(parcel, 1, this.f1128g);
        AbstractC1303m.m3311d0(parcel, 2, 4);
        parcel.writeInt(this.f1129h);
        long jM951e = m951e();
        AbstractC1303m.m3311d0(parcel, 3, 8);
        parcel.writeLong(jM951e);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }

    public C0348c(String str, long j3, int i3) {
        this.f1128g = str;
        this.f1129h = i3;
        this.f1130i = j3;
    }
}
