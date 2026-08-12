package p009D0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p007C0.C0101a;
import p055T.AbstractC0545H;
import p055T.C0541D;
import p055T.C0582n;
import p055T.C0583o;
import p055T.InterfaceC0543F;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: D0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0105a implements InterfaceC0543F {
    public static final Parcelable.Creator<C0105a> CREATOR;

    /* JADX INFO: renamed from: m */
    public static final C0583o f131m;

    /* JADX INFO: renamed from: n */
    public static final C0583o f132n;

    /* JADX INFO: renamed from: g */
    public final String f133g;

    /* JADX INFO: renamed from: h */
    public final String f134h;

    /* JADX INFO: renamed from: i */
    public final long f135i;

    /* JADX INFO: renamed from: j */
    public final long f136j;

    /* JADX INFO: renamed from: k */
    public final byte[] f137k;

    /* JADX INFO: renamed from: l */
    public int f138l;

    static {
        C0582n c0582n = new C0582n();
        c0582n.f2114m = AbstractC0545H.m1364l("application/id3");
        f131m = new C0583o(c0582n);
        C0582n c0582n2 = new C0582n();
        c0582n2.f2114m = AbstractC0545H.m1364l("application/x-scte35");
        f132n = new C0583o(c0582n2);
        CREATOR = new C0101a(2);
    }

    public C0105a(String str, String str2, long j3, long j4, byte[] bArr) {
        this.f133g = str;
        this.f134h = str2;
        this.f135i = j3;
        this.f136j = j4;
        this.f137k = bArr;
    }

    @Override // p055T.InterfaceC0543F
    /* JADX INFO: renamed from: a */
    public final byte[] mo497a() {
        if (mo498b() != null) {
            return this.f137k;
        }
        return null;
    }

    @Override // p055T.InterfaceC0543F
    /* JADX INFO: renamed from: b */
    public final C0583o mo498b() {
        String str = this.f133g;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f132n;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f131m;
            default:
                return null;
        }
    }

    @Override // p055T.InterfaceC0543F
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void mo499c(C0541D c0541d) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0105a.class == obj.getClass()) {
            C0105a c0105a = (C0105a) obj;
            if (this.f135i == c0105a.f135i && this.f136j == c0105a.f136j) {
                int i3 = AbstractC0632A.f2454a;
                if (Objects.equals(this.f133g, c0105a.f133g) && Objects.equals(this.f134h, c0105a.f134h) && Arrays.equals(this.f137k, c0105a.f137k)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f138l == 0) {
            String str = this.f133g;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f134h;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j3 = this.f135i;
            int i3 = (iHashCode2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.f136j;
            this.f138l = Arrays.hashCode(this.f137k) + ((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31);
        }
        return this.f138l;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f133g + ", id=" + this.f136j + ", durationMs=" + this.f135i + ", value=" + this.f134h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f133g);
        parcel.writeString(this.f134h);
        parcel.writeLong(this.f135i);
        parcel.writeLong(this.f136j);
        parcel.writeByteArray(this.f137k);
    }

    public C0105a(Parcel parcel) {
        String string = parcel.readString();
        int i3 = AbstractC0632A.f2454a;
        this.f133g = string;
        this.f134h = parcel.readString();
        this.f135i = parcel.readLong();
        this.f136j = parcel.readLong();
        this.f137k = parcel.createByteArray();
    }
}
