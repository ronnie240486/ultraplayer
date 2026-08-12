package p024I0;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: I0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0279i {

    /* JADX INFO: renamed from: a */
    public final long f751a;

    /* JADX INFO: renamed from: b */
    public final boolean f752b;

    /* JADX INFO: renamed from: c */
    public final boolean f753c;

    /* JADX INFO: renamed from: d */
    public final boolean f754d;

    /* JADX INFO: renamed from: e */
    public final long f755e;

    /* JADX INFO: renamed from: f */
    public final List f756f;

    /* JADX INFO: renamed from: g */
    public final boolean f757g;

    /* JADX INFO: renamed from: h */
    public final long f758h;

    /* JADX INFO: renamed from: i */
    public final int f759i;

    /* JADX INFO: renamed from: j */
    public final int f760j;

    /* JADX INFO: renamed from: k */
    public final int f761k;

    public C0279i(long j3, boolean z3, boolean z4, boolean z5, ArrayList arrayList, long j4, boolean z6, long j5, int i3, int i4, int i5) {
        this.f751a = j3;
        this.f752b = z3;
        this.f753c = z4;
        this.f754d = z5;
        this.f756f = Collections.unmodifiableList(arrayList);
        this.f755e = j4;
        this.f757g = z6;
        this.f758h = j5;
        this.f759i = i3;
        this.f760j = i4;
        this.f761k = i5;
    }

    public C0279i(Parcel parcel) {
        this.f751a = parcel.readLong();
        this.f752b = parcel.readByte() == 1;
        this.f753c = parcel.readByte() == 1;
        this.f754d = parcel.readByte() == 1;
        int i3 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(new C0278h(parcel.readInt(), parcel.readLong()));
        }
        this.f756f = Collections.unmodifiableList(arrayList);
        this.f755e = parcel.readLong();
        this.f757g = parcel.readByte() == 1;
        this.f758h = parcel.readLong();
        this.f759i = parcel.readInt();
        this.f760j = parcel.readInt();
        this.f761k = parcel.readInt();
    }
}
