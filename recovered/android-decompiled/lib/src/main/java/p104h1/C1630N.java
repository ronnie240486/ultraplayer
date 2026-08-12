package p104h1;

import android.os.Parcel;
import android.os.Parcelable;
import p020H.AbstractC0252c;
import p020H.C0251b;

/* JADX INFO: renamed from: h1.N */
/* JADX INFO: loaded from: classes.dex */
public final class C1630N extends AbstractC0252c {
    public static final Parcelable.Creator<C1630N> CREATOR = new C0251b(1);

    /* JADX INFO: renamed from: i */
    public Parcelable f7384i;

    public C1630N(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7384i = parcel.readParcelable(classLoader == null ? AbstractC1621E.class.getClassLoader() : classLoader);
    }

    @Override // p020H.AbstractC0252c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeParcelable(this.f7384i, 0);
    }
}
