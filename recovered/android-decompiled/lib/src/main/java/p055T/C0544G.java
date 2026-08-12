package p055T;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import p024I0.C0271a;
import p064W.AbstractC0632A;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: T.G */
/* JADX INFO: loaded from: classes.dex */
public final class C0544G implements Parcelable {
    public static final Parcelable.Creator<C0544G> CREATOR = new C0271a(25);

    /* JADX INFO: renamed from: g */
    public final InterfaceC0543F[] f1940g;

    /* JADX INFO: renamed from: h */
    public final long f1941h;

    public C0544G(InterfaceC0543F... interfaceC0543FArr) {
        this(-9223372036854775807L, interfaceC0543FArr);
    }

    /* JADX INFO: renamed from: d */
    public final C0544G m1351d(InterfaceC0543F... interfaceC0543FArr) {
        if (interfaceC0543FArr.length == 0) {
            return this;
        }
        int i3 = AbstractC0632A.f2454a;
        InterfaceC0543F[] interfaceC0543FArr2 = this.f1940g;
        Object[] objArrCopyOf = Arrays.copyOf(interfaceC0543FArr2, interfaceC0543FArr2.length + interfaceC0543FArr.length);
        System.arraycopy(interfaceC0543FArr, 0, objArrCopyOf, interfaceC0543FArr2.length, interfaceC0543FArr.length);
        return new C0544G(this.f1941h, (InterfaceC0543F[]) objArrCopyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final C0544G m1352e(C0544G c0544g) {
        return c0544g == null ? this : m1351d(c0544g.f1940g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0544G.class == obj.getClass()) {
            C0544G c0544g = (C0544G) obj;
            if (Arrays.equals(this.f1940g, c0544g.f1940g) && this.f1941h == c0544g.f1941h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC2003a.m4542o(this.f1941h) + (Arrays.hashCode(this.f1940g) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f1940g));
        long j3 = this.f1941h;
        if (j3 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j3;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        InterfaceC0543F[] interfaceC0543FArr = this.f1940g;
        parcel.writeInt(interfaceC0543FArr.length);
        for (InterfaceC0543F interfaceC0543F : interfaceC0543FArr) {
            parcel.writeParcelable(interfaceC0543F, 0);
        }
        parcel.writeLong(this.f1941h);
    }

    public C0544G(long j3, InterfaceC0543F... interfaceC0543FArr) {
        this.f1941h = j3;
        this.f1940g = interfaceC0543FArr;
    }

    public C0544G(List list) {
        this((InterfaceC0543F[]) list.toArray(new InterfaceC0543F[0]));
    }

    public C0544G(Parcel parcel) {
        this.f1940g = new InterfaceC0543F[parcel.readInt()];
        int i3 = 0;
        while (true) {
            InterfaceC0543F[] interfaceC0543FArr = this.f1940g;
            if (i3 < interfaceC0543FArr.length) {
                interfaceC0543FArr[i3] = (InterfaceC0543F) parcel.readParcelable(InterfaceC0543F.class.getClassLoader());
                i3++;
            } else {
                this.f1941h = parcel.readLong();
                return;
            }
        }
    }
}
