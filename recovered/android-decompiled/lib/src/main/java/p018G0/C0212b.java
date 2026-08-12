package p018G0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007C0.C0101a;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: G0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0212b extends AbstractC0219i {
    public static final Parcelable.Creator<C0212b> CREATOR = new C0101a(12);

    /* JADX INFO: renamed from: h */
    public final byte[] f485h;

    public C0212b(String str, byte[] bArr) {
        super(str);
        this.f485h = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0212b.class == obj.getClass()) {
            C0212b c0212b = (C0212b) obj;
            if (this.f509g.equals(c0212b.f509g) && Arrays.equals(this.f485h, c0212b.f485h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f485h) + ((this.f509g.hashCode() + 527) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f509g);
        parcel.writeByteArray(this.f485h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0212b(Parcel parcel) {
        String string = parcel.readString();
        int i3 = AbstractC0632A.f2454a;
        super(string);
        this.f485h = parcel.createByteArray();
    }
}
