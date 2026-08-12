package p018G0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p007C0.C0101a;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: G0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0214d extends AbstractC0219i {
    public static final Parcelable.Creator<C0214d> CREATOR = new C0101a(14);

    /* JADX INFO: renamed from: h */
    public final String f492h;

    /* JADX INFO: renamed from: i */
    public final boolean f493i;

    /* JADX INFO: renamed from: j */
    public final boolean f494j;

    /* JADX INFO: renamed from: k */
    public final String[] f495k;

    /* JADX INFO: renamed from: l */
    public final AbstractC0219i[] f496l;

    public C0214d(String str, boolean z3, boolean z4, String[] strArr, AbstractC0219i[] abstractC0219iArr) {
        super("CTOC");
        this.f492h = str;
        this.f493i = z3;
        this.f494j = z4;
        this.f495k = strArr;
        this.f496l = abstractC0219iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0214d.class == obj.getClass()) {
            C0214d c0214d = (C0214d) obj;
            if (this.f493i == c0214d.f493i && this.f494j == c0214d.f494j) {
                int i3 = AbstractC0632A.f2454a;
                if (Objects.equals(this.f492h, c0214d.f492h) && Arrays.equals(this.f495k, c0214d.f495k) && Arrays.equals(this.f496l, c0214d.f496l)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = (((527 + (this.f493i ? 1 : 0)) * 31) + (this.f494j ? 1 : 0)) * 31;
        String str = this.f492h;
        return i3 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f492h);
        parcel.writeByte(this.f493i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f494j ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f495k);
        AbstractC0219i[] abstractC0219iArr = this.f496l;
        parcel.writeInt(abstractC0219iArr.length);
        for (AbstractC0219i abstractC0219i : abstractC0219iArr) {
            parcel.writeParcelable(abstractC0219i, 0);
        }
    }

    public C0214d(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i3 = AbstractC0632A.f2454a;
        this.f492h = string;
        this.f493i = parcel.readByte() != 0;
        this.f494j = parcel.readByte() != 0;
        this.f495k = parcel.createStringArray();
        int i4 = parcel.readInt();
        this.f496l = new AbstractC0219i[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            this.f496l[i5] = (AbstractC0219i) parcel.readParcelable(AbstractC0219i.class.getClassLoader());
        }
    }
}
