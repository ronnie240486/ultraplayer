package p122m1;

import android.os.Parcel;
import android.util.SparseIntArray;
import p124n.C2018e;

/* JADX INFO: renamed from: m1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2005c extends AbstractC2004b {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f8745d;

    /* JADX INFO: renamed from: e */
    public final Parcel f8746e;

    /* JADX INFO: renamed from: f */
    public final int f8747f;

    /* JADX INFO: renamed from: g */
    public final int f8748g;

    /* JADX INFO: renamed from: h */
    public final String f8749h;

    /* JADX INFO: renamed from: i */
    public int f8750i;

    /* JADX INFO: renamed from: j */
    public int f8751j;

    /* JADX INFO: renamed from: k */
    public int f8752k;

    public C2005c(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C2018e(), new C2018e(), new C2018e());
    }

    @Override // p122m1.AbstractC2004b
    /* JADX INFO: renamed from: a */
    public final C2005c mo4553a() {
        Parcel parcel = this.f8746e;
        int iDataPosition = parcel.dataPosition();
        int i3 = this.f8751j;
        if (i3 == this.f8747f) {
            i3 = this.f8748g;
        }
        return new C2005c(parcel, iDataPosition, i3, this.f8749h + "  ", this.f8742a, this.f8743b, this.f8744c);
    }

    @Override // p122m1.AbstractC2004b
    /* JADX INFO: renamed from: e */
    public final boolean mo4557e(int i3) {
        while (this.f8751j < this.f8748g) {
            int i4 = this.f8752k;
            if (i4 == i3) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i3)) > 0) {
                return false;
            }
            int i5 = this.f8751j;
            Parcel parcel = this.f8746e;
            parcel.setDataPosition(i5);
            int i6 = parcel.readInt();
            this.f8752k = parcel.readInt();
            this.f8751j += i6;
        }
        return this.f8752k == i3;
    }

    @Override // p122m1.AbstractC2004b
    /* JADX INFO: renamed from: i */
    public final void mo4561i(int i3) {
        int i4 = this.f8750i;
        SparseIntArray sparseIntArray = this.f8745d;
        Parcel parcel = this.f8746e;
        if (i4 >= 0) {
            int i5 = sparseIntArray.get(i4);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i5);
            parcel.writeInt(iDataPosition - i5);
            parcel.setDataPosition(iDataPosition);
        }
        this.f8750i = i3;
        sparseIntArray.put(i3, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i3);
    }

    public C2005c(Parcel parcel, int i3, int i4, String str, C2018e c2018e, C2018e c2018e2, C2018e c2018e3) {
        super(c2018e, c2018e2, c2018e3);
        this.f8745d = new SparseIntArray();
        this.f8750i = -1;
        this.f8752k = -1;
        this.f8746e = parcel;
        this.f8747f = i3;
        this.f8748g = i4;
        this.f8751j = i3;
        this.f8749h = str;
    }
}
