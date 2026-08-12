package p018G0;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayList;
import java.util.Objects;
import p007C0.C0101a;
import p055T.C0541D;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p105h2.AbstractC1676G;
import p105h2.C1692X;

/* JADX INFO: renamed from: G0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0224n extends AbstractC0219i {
    public static final Parcelable.Creator<C0224n> CREATOR = new C0101a(20);

    /* JADX INFO: renamed from: h */
    public final String f521h;

    /* JADX INFO: renamed from: i */
    public final AbstractC1676G f522i;

    public C0224n(String str, String str2, C1692X c1692x) {
        super(str);
        AbstractC0646n.m1625c(!c1692x.isEmpty());
        this.f521h = str2;
        AbstractC1676G abstractC1676GM4117n = AbstractC1676G.m4117n(c1692x);
        this.f522i = abstractC1676GM4117n;
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m714d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x0014  */
    @Override // p018G0.AbstractC0219i, p055T.InterfaceC0543F
    /* JADX INFO: renamed from: c */
    public final void mo499c(C0541D c0541d) {
        byte b3;
        String str = this.f509g;
        str.getClass();
        AbstractC1676G abstractC1676G = this.f522i;
        switch (str) {
            case "TAL":
                b3 = 0;
                break;
            case "TCM":
                b3 = 1;
                break;
            case "TDA":
                b3 = 2;
                break;
            case "TP1":
                b3 = 3;
                break;
            case "TP2":
                b3 = 4;
                break;
            case "TP3":
                b3 = 5;
                break;
            case "TRK":
                b3 = 6;
                break;
            case "TT2":
                b3 = 7;
                break;
            case "TXT":
                b3 = 8;
                break;
            case "TYE":
                b3 = 9;
                break;
            case "TALB":
                b3 = 10;
                break;
            case "TCOM":
                b3 = 11;
                break;
            case "TCON":
                b3 = 12;
                break;
            case "TDAT":
                b3 = 13;
                break;
            case "TDRC":
                b3 = 14;
                break;
            case "TDRL":
                b3 = 15;
                break;
            case "TEXT":
                b3 = 16;
                break;
            case "TIT2":
                b3 = 17;
                break;
            case "TPE1":
                b3 = 18;
                break;
            case "TPE2":
                b3 = 19;
                break;
            case "TPE3":
                b3 = 20;
                break;
            case "TRCK":
                b3 = 21;
                break;
            case "TYER":
                b3 = 22;
                break;
            default:
                b3 = -1;
                break;
        }
        try {
            switch (b3) {
                case 0:
                case 10:
                    c0541d.f1886c = (CharSequence) abstractC1676G.get(0);
                    break;
                case 1:
                case 11:
                    c0541d.f1904u = (CharSequence) abstractC1676G.get(0);
                    break;
                case 2:
                case 13:
                    String str2 = (String) abstractC1676G.get(0);
                    int i3 = Integer.parseInt(str2.substring(2, 4));
                    int i4 = Integer.parseInt(str2.substring(0, 2));
                    c0541d.f1898o = Integer.valueOf(i3);
                    c0541d.f1899p = Integer.valueOf(i4);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                case 18:
                    c0541d.f1885b = (CharSequence) abstractC1676G.get(0);
                    break;
                case 4:
                case 19:
                    c0541d.f1887d = (CharSequence) abstractC1676G.get(0);
                    break;
                case 5:
                case 20:
                    c0541d.f1905v = (CharSequence) abstractC1676G.get(0);
                    break;
                case 6:
                case 21:
                    String str3 = (String) abstractC1676G.get(0);
                    int i5 = AbstractC0632A.f2454a;
                    String[] strArrSplit = str3.split("/", -1);
                    int i6 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    c0541d.f1893j = Integer.valueOf(i6);
                    c0541d.f1894k = numValueOf;
                    break;
                case 7:
                case 17:
                    c0541d.f1884a = (CharSequence) abstractC1676G.get(0);
                    break;
                case 8:
                case 16:
                    c0541d.f1903t = (CharSequence) abstractC1676G.get(0);
                    break;
                case 9:
                case 22:
                    c0541d.f1897n = Integer.valueOf(Integer.parseInt((String) abstractC1676G.get(0)));
                    break;
                case 12:
                    Integer numM3290M = AbstractC1303m.m3290M((String) abstractC1676G.get(0));
                    if (numM3290M != null) {
                        String strM713a = AbstractC0220j.m713a(numM3290M.intValue());
                        if (strM713a != null) {
                            c0541d.f1908y = strM713a;
                        }
                    } else {
                        c0541d.f1908y = (CharSequence) abstractC1676G.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListM714d = m714d((String) abstractC1676G.get(0));
                    int size = arrayListM714d.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                c0541d.f1899p = (Integer) arrayListM714d.get(2);
                            }
                        }
                        c0541d.f1898o = (Integer) arrayListM714d.get(1);
                    }
                    c0541d.f1897n = (Integer) arrayListM714d.get(0);
                    break;
                case 15:
                    ArrayList arrayListM714d2 = m714d((String) abstractC1676G.get(0));
                    int size2 = arrayListM714d2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                c0541d.f1902s = (Integer) arrayListM714d2.get(2);
                            }
                        }
                        c0541d.f1901r = (Integer) arrayListM714d2.get(1);
                    }
                    c0541d.f1900q = (Integer) arrayListM714d2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0224n.class == obj.getClass()) {
            C0224n c0224n = (C0224n) obj;
            int i3 = AbstractC0632A.f2454a;
            if (Objects.equals(this.f509g, c0224n.f509g) && Objects.equals(this.f521h, c0224n.f521h) && this.f522i.equals(c0224n.f522i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f509g.hashCode() + 527) * 31;
        String str = this.f521h;
        return this.f522i.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // p018G0.AbstractC0219i
    public final String toString() {
        return this.f509g + ": description=" + this.f521h + ": values=" + this.f522i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f509g);
        parcel.writeString(this.f521h);
        parcel.writeStringArray((String[]) this.f522i.toArray(new String[0]));
    }
}
