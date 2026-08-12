package p015F0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007C0.C0101a;
import p045P0.AbstractC0462h;
import p055T.C0541D;
import p055T.C0583o;
import p055T.InterfaceC0543F;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: F0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0173b implements InterfaceC0543F {
    public static final Parcelable.Creator<C0173b> CREATOR = new C0101a(6);

    /* JADX INFO: renamed from: g */
    public final int f399g;

    /* JADX INFO: renamed from: h */
    public final String f400h;

    /* JADX INFO: renamed from: i */
    public final String f401i;

    /* JADX INFO: renamed from: j */
    public final String f402j;

    /* JADX INFO: renamed from: k */
    public final boolean f403k;

    /* JADX INFO: renamed from: l */
    public final int f404l;

    public C0173b(int i3, String str, String str2, String str3, boolean z3, int i4) {
        AbstractC0646n.m1625c(i4 == -1 || i4 > 0);
        this.f399g = i3;
        this.f400h = str;
        this.f401i = str2;
        this.f402j = str3;
        this.f403k = z3;
        this.f404l = i4;
    }

    /* JADX INFO: renamed from: d */
    public static C0173b m647d(Map map) {
        boolean z3;
        int i3;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i4;
        int i5;
        List list = (List) map.get("icy-br");
        boolean z4 = true;
        int i6 = -1;
        if (list != null) {
            String str4 = (String) list.get(0);
            try {
                i5 = Integer.parseInt(str4) * 1000;
                if (i5 > 0) {
                    z3 = true;
                } else {
                    try {
                        AbstractC0646n.m1647y("IcyHeaders", "Invalid bitrate: " + str4);
                        z3 = false;
                        i5 = -1;
                    } catch (NumberFormatException unused) {
                        AbstractC0462h.m1171k("Invalid bitrate header: ", str4, "IcyHeaders");
                        i3 = i5;
                        z3 = false;
                    }
                }
                i3 = i5;
            } catch (NumberFormatException unused2) {
                i5 = -1;
            }
        } else {
            z3 = false;
            i3 = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z3 = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z3 = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z3 = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z3 = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            String str5 = (String) list6.get(0);
            try {
                int i7 = Integer.parseInt(str5);
                if (i7 > 0) {
                    i6 = i7;
                } else {
                    try {
                        AbstractC0646n.m1647y("IcyHeaders", "Invalid metadata interval: " + str5);
                        z4 = z3;
                    } catch (NumberFormatException unused3) {
                        i6 = i7;
                        AbstractC0462h.m1171k("Invalid metadata interval: ", str5, "IcyHeaders");
                    }
                }
                z3 = z4;
            } catch (NumberFormatException unused4) {
            }
            i4 = i6;
        } else {
            i4 = -1;
        }
        if (z3) {
            return new C0173b(i3, str, str2, str3, zEquals, i4);
        }
        return null;
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
        String str = this.f401i;
        if (str != null) {
            c0541d.f1909z = str;
        }
        String str2 = this.f400h;
        if (str2 != null) {
            c0541d.f1908y = str2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0173b.class == obj.getClass()) {
            C0173b c0173b = (C0173b) obj;
            if (this.f399g == c0173b.f399g) {
                int i3 = AbstractC0632A.f2454a;
                if (Objects.equals(this.f400h, c0173b.f400h) && Objects.equals(this.f401i, c0173b.f401i) && Objects.equals(this.f402j, c0173b.f402j) && this.f403k == c0173b.f403k && this.f404l == c0173b.f404l) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = (527 + this.f399g) * 31;
        String str = this.f400h;
        int iHashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f401i;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f402j;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f403k ? 1 : 0)) * 31) + this.f404l;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f401i + "\", genre=\"" + this.f400h + "\", bitrate=" + this.f399g + ", metadataInterval=" + this.f404l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f399g);
        parcel.writeString(this.f400h);
        parcel.writeString(this.f401i);
        parcel.writeString(this.f402j);
        int i4 = AbstractC0632A.f2454a;
        parcel.writeInt(this.f403k ? 1 : 0);
        parcel.writeInt(this.f404l);
    }

    public C0173b(Parcel parcel) {
        this.f399g = parcel.readInt();
        this.f400h = parcel.readString();
        this.f401i = parcel.readString();
        this.f402j = parcel.readString();
        int i3 = AbstractC0632A.f2454a;
        this.f403k = parcel.readInt() != 0;
        this.f404l = parcel.readInt();
    }
}
