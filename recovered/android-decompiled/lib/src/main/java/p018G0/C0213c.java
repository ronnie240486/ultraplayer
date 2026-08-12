package p018G0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p007C0.C0101a;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: G0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0213c extends AbstractC0219i {
    public static final Parcelable.Creator<C0213c> CREATOR = new C0101a(13);

    /* JADX INFO: renamed from: h */
    public final String f486h;

    /* JADX INFO: renamed from: i */
    public final int f487i;

    /* JADX INFO: renamed from: j */
    public final int f488j;

    /* JADX INFO: renamed from: k */
    public final long f489k;

    /* JADX INFO: renamed from: l */
    public final long f490l;

    /* JADX INFO: renamed from: m */
    public final AbstractC0219i[] f491m;

    public C0213c(String str, int i3, int i4, long j3, long j4, AbstractC0219i[] abstractC0219iArr) {
        super("CHAP");
        this.f486h = str;
        this.f487i = i3;
        this.f488j = i4;
        this.f489k = j3;
        this.f490l = j4;
        this.f491m = abstractC0219iArr;
    }

    @Override // p018G0.AbstractC0219i, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0213c.class == obj.getClass()) {
            C0213c c0213c = (C0213c) obj;
            if (this.f487i == c0213c.f487i && this.f488j == c0213c.f488j && this.f489k == c0213c.f489k && this.f490l == c0213c.f490l) {
                int i3 = AbstractC0632A.f2454a;
                if (Objects.equals(this.f486h, c0213c.f486h) && Arrays.equals(this.f491m, c0213c.f491m)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = (((((((527 + this.f487i) * 31) + this.f488j) * 31) + ((int) this.f489k)) * 31) + ((int) this.f490l)) * 31;
        String str = this.f486h;
        return i3 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f486h);
        parcel.writeInt(this.f487i);
        parcel.writeInt(this.f488j);
        parcel.writeLong(this.f489k);
        parcel.writeLong(this.f490l);
        AbstractC0219i[] abstractC0219iArr = this.f491m;
        parcel.writeInt(abstractC0219iArr.length);
        for (AbstractC0219i abstractC0219i : abstractC0219iArr) {
            parcel.writeParcelable(abstractC0219i, 0);
        }
    }

    public C0213c(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i3 = AbstractC0632A.f2454a;
        this.f486h = string;
        this.f487i = parcel.readInt();
        this.f488j = parcel.readInt();
        this.f489k = parcel.readLong();
        this.f490l = parcel.readLong();
        int i4 = parcel.readInt();
        this.f491m = new AbstractC0219i[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            this.f491m[i5] = (AbstractC0219i) parcel.readParcelable(AbstractC0219i.class.getClassLoader());
        }
    }
}
