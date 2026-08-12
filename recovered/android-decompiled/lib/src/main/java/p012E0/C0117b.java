package p012E0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import p007C0.C0101a;
import p055T.C0541D;
import p055T.C0583o;
import p055T.InterfaceC0543F;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: E0.b */
/* JADX INFO: loaded from: classes.dex */
public class C0117b implements InterfaceC0543F {
    public static final Parcelable.Creator<C0117b> CREATOR = new C0101a(4);

    /* JADX INFO: renamed from: g */
    public final String f160g;

    /* JADX INFO: renamed from: h */
    public final String f161h;

    public C0117b(String str, String str2) {
        this.f160g = AbstractC1303m.m3289L(str);
        this.f161h = str2;
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
        String str = this.f160g;
        str.getClass();
        String str2 = this.f161h;
        switch (str) {
            case "TOTALTRACKS":
                Integer numM3290M = AbstractC1303m.m3290M(str2);
                if (numM3290M != null) {
                    c0541d.f1894k = numM3290M;
                    break;
                }
                break;
            case "TOTALDISCS":
                Integer numM3290M2 = AbstractC1303m.m3290M(str2);
                if (numM3290M2 != null) {
                    c0541d.f1907x = numM3290M2;
                    break;
                }
                break;
            case "TRACKNUMBER":
                Integer numM3290M3 = AbstractC1303m.m3290M(str2);
                if (numM3290M3 != null) {
                    c0541d.f1893j = numM3290M3;
                    break;
                }
                break;
            case "ALBUM":
                c0541d.f1886c = str2;
                break;
            case "GENRE":
                c0541d.f1908y = str2;
                break;
            case "TITLE":
                c0541d.f1884a = str2;
                break;
            case "DESCRIPTION":
                c0541d.f1889f = str2;
                break;
            case "DISCNUMBER":
                Integer numM3290M4 = AbstractC1303m.m3290M(str2);
                if (numM3290M4 != null) {
                    c0541d.f1906w = numM3290M4;
                    break;
                }
                break;
            case "ALBUMARTIST":
                c0541d.f1887d = str2;
                break;
            case "ARTIST":
                c0541d.f1885b = str2;
                break;
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
        if (obj != null && getClass() == obj.getClass()) {
            C0117b c0117b = (C0117b) obj;
            if (this.f160g.equals(c0117b.f160g) && this.f161h.equals(c0117b.f161h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f161h.hashCode() + ((this.f160g.hashCode() + 527) * 31);
    }

    public final String toString() {
        return "VC: " + this.f160g + "=" + this.f161h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f160g);
        parcel.writeString(this.f161h);
    }

    public C0117b(Parcel parcel) {
        String string = parcel.readString();
        int i3 = AbstractC0632A.f2454a;
        this.f160g = string;
        this.f161h = parcel.readString();
    }
}
