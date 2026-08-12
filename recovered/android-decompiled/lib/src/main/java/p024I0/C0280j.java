package p024I0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: I0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0280j extends AbstractC0273c {
    public static final Parcelable.Creator<C0280j> CREATOR = new C0271a(3);

    /* JADX INFO: renamed from: g */
    public final List f762g;

    public C0280j(Parcel parcel) {
        int i3 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(new C0279i(parcel));
        }
        this.f762g = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        List list = this.f762g;
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            C0279i c0279i = (C0279i) list.get(i4);
            parcel.writeLong(c0279i.f751a);
            parcel.writeByte(c0279i.f752b ? (byte) 1 : (byte) 0);
            parcel.writeByte(c0279i.f753c ? (byte) 1 : (byte) 0);
            parcel.writeByte(c0279i.f754d ? (byte) 1 : (byte) 0);
            List list2 = c0279i.f756f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i5 = 0; i5 < size2; i5++) {
                C0278h c0278h = (C0278h) list2.get(i5);
                parcel.writeInt(c0278h.f749a);
                parcel.writeLong(c0278h.f750b);
            }
            parcel.writeLong(c0279i.f755e);
            parcel.writeByte(c0279i.f757g ? (byte) 1 : (byte) 0);
            parcel.writeLong(c0279i.f758h);
            parcel.writeInt(c0279i.f759i);
            parcel.writeInt(c0279i.f760j);
            parcel.writeInt(c0279i.f761k);
        }
    }

    public C0280j(ArrayList arrayList) {
        this.f762g = Collections.unmodifiableList(arrayList);
    }
}
