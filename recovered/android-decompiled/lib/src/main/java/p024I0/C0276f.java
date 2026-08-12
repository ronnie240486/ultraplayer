package p024I0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: I0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0276f extends AbstractC0273c {
    public static final Parcelable.Creator<C0276f> CREATOR = new C0271a(1);

    /* JADX INFO: renamed from: g */
    public final long f736g;

    /* JADX INFO: renamed from: h */
    public final boolean f737h;

    /* JADX INFO: renamed from: i */
    public final boolean f738i;

    /* JADX INFO: renamed from: j */
    public final boolean f739j;

    /* JADX INFO: renamed from: k */
    public final boolean f740k;

    /* JADX INFO: renamed from: l */
    public final long f741l;

    /* JADX INFO: renamed from: m */
    public final long f742m;

    /* JADX INFO: renamed from: n */
    public final List f743n;

    /* JADX INFO: renamed from: o */
    public final boolean f744o;

    /* JADX INFO: renamed from: p */
    public final long f745p;

    /* JADX INFO: renamed from: q */
    public final int f746q;

    /* JADX INFO: renamed from: r */
    public final int f747r;

    /* JADX INFO: renamed from: s */
    public final int f748s;

    public C0276f(long j3, boolean z3, boolean z4, boolean z5, boolean z6, long j4, long j5, List list, boolean z7, long j6, int i3, int i4, int i5) {
        this.f736g = j3;
        this.f737h = z3;
        this.f738i = z4;
        this.f739j = z5;
        this.f740k = z6;
        this.f741l = j4;
        this.f742m = j5;
        this.f743n = Collections.unmodifiableList(list);
        this.f744o = z7;
        this.f745p = j6;
        this.f746q = i3;
        this.f747r = i4;
        this.f748s = i5;
    }

    @Override // p024I0.AbstractC0273c
    public final String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f741l + ", programSplicePlaybackPositionUs= " + this.f742m + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeLong(this.f736g);
        parcel.writeByte(this.f737h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f738i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f739j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f740k ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f741l);
        parcel.writeLong(this.f742m);
        List list = this.f743n;
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            C0275e c0275e = (C0275e) list.get(i4);
            parcel.writeInt(c0275e.f733a);
            parcel.writeLong(c0275e.f734b);
            parcel.writeLong(c0275e.f735c);
        }
        parcel.writeByte(this.f744o ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f745p);
        parcel.writeInt(this.f746q);
        parcel.writeInt(this.f747r);
        parcel.writeInt(this.f748s);
    }

    public C0276f(Parcel parcel) {
        this.f736g = parcel.readLong();
        this.f737h = parcel.readByte() == 1;
        this.f738i = parcel.readByte() == 1;
        this.f739j = parcel.readByte() == 1;
        this.f740k = parcel.readByte() == 1;
        this.f741l = parcel.readLong();
        this.f742m = parcel.readLong();
        int i3 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(new C0275e(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f743n = Collections.unmodifiableList(arrayList);
        this.f744o = parcel.readByte() == 1;
        this.f745p = parcel.readLong();
        this.f746q = parcel.readInt();
        this.f747r = parcel.readInt();
        this.f748s = parcel.readInt();
    }
}
