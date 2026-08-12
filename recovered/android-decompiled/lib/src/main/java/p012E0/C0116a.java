package p012E0;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p007C0.C0101a;
import p055T.AbstractC0545H;
import p055T.C0541D;
import p055T.C0583o;
import p055T.InterfaceC0543F;
import p064W.AbstractC0632A;
import p064W.C0651s;

/* JADX INFO: renamed from: E0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0116a implements InterfaceC0543F {
    public static final Parcelable.Creator<C0116a> CREATOR = new C0101a(3);

    /* JADX INFO: renamed from: g */
    public final int f152g;

    /* JADX INFO: renamed from: h */
    public final String f153h;

    /* JADX INFO: renamed from: i */
    public final String f154i;

    /* JADX INFO: renamed from: j */
    public final int f155j;

    /* JADX INFO: renamed from: k */
    public final int f156k;

    /* JADX INFO: renamed from: l */
    public final int f157l;

    /* JADX INFO: renamed from: m */
    public final int f158m;

    /* JADX INFO: renamed from: n */
    public final byte[] f159n;

    public C0116a(int i3, String str, String str2, int i4, int i5, int i6, int i7, byte[] bArr) {
        this.f152g = i3;
        this.f153h = str;
        this.f154i = str2;
        this.f155j = i4;
        this.f156k = i5;
        this.f157l = i6;
        this.f158m = i7;
        this.f159n = bArr;
    }

    /* JADX INFO: renamed from: d */
    public static C0116a m557d(C0651s c0651s) {
        int iM1673g = c0651s.m1673g();
        String strM1364l = AbstractC0545H.m1364l(c0651s.m1685s(c0651s.m1673g(), StandardCharsets.US_ASCII));
        String strM1685s = c0651s.m1685s(c0651s.m1673g(), StandardCharsets.UTF_8);
        int iM1673g2 = c0651s.m1673g();
        int iM1673g3 = c0651s.m1673g();
        int iM1673g4 = c0651s.m1673g();
        int iM1673g5 = c0651s.m1673g();
        int iM1673g6 = c0651s.m1673g();
        byte[] bArr = new byte[iM1673g6];
        c0651s.m1671e(bArr, 0, iM1673g6);
        return new C0116a(iM1673g, strM1364l, strM1685s, iM1673g2, iM1673g3, iM1673g4, iM1673g5, bArr);
    }

    @Override // p055T.InterfaceC0543F
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte[] mo497a() {
        return null;
    }

    @Override // p055T.InterfaceC0543F
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0583o mo498b() {
        return null;
    }

    @Override // p055T.InterfaceC0543F
    /* JADX INFO: renamed from: c */
    public final void mo499c(C0541D c0541d) {
        c0541d.m1349a(this.f159n, this.f152g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0116a.class == obj.getClass()) {
            C0116a c0116a = (C0116a) obj;
            if (this.f152g == c0116a.f152g && this.f153h.equals(c0116a.f153h) && this.f154i.equals(c0116a.f154i) && this.f155j == c0116a.f155j && this.f156k == c0116a.f156k && this.f157l == c0116a.f157l && this.f158m == c0116a.f158m && Arrays.equals(this.f159n, c0116a.f159n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f159n) + ((((((((((this.f154i.hashCode() + ((this.f153h.hashCode() + ((527 + this.f152g) * 31)) * 31)) * 31) + this.f155j) * 31) + this.f156k) * 31) + this.f157l) * 31) + this.f158m) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f153h + ", description=" + this.f154i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f152g);
        parcel.writeString(this.f153h);
        parcel.writeString(this.f154i);
        parcel.writeInt(this.f155j);
        parcel.writeInt(this.f156k);
        parcel.writeInt(this.f157l);
        parcel.writeInt(this.f158m);
        parcel.writeByteArray(this.f159n);
    }

    public C0116a(Parcel parcel) {
        this.f152g = parcel.readInt();
        String string = parcel.readString();
        int i3 = AbstractC0632A.f2454a;
        this.f153h = string;
        this.f154i = parcel.readString();
        this.f155j = parcel.readInt();
        this.f156k = parcel.readInt();
        this.f157l = parcel.readInt();
        this.f158m = parcel.readInt();
        this.f159n = parcel.createByteArray();
    }
}
