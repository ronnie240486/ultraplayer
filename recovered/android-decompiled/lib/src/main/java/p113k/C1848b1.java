package p113k;

import android.os.Parcel;
import android.os.Parcelable;
import p020H.AbstractC0252c;
import p020H.C0251b;

/* JADX INFO: renamed from: k.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1848b1 extends AbstractC0252c {
    public static final Parcelable.Creator<C1848b1> CREATOR = new C0251b(2);

    /* JADX INFO: renamed from: i */
    public int f8129i;

    /* JADX INFO: renamed from: j */
    public boolean f8130j;

    public C1848b1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f8129i = parcel.readInt();
        this.f8130j = parcel.readInt() != 0;
    }

    @Override // p020H.AbstractC0252c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f8129i);
        parcel.writeInt(this.f8130j ? 1 : 0);
    }
}
