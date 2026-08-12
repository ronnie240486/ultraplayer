package p067X;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.emoji2.text.C0924n;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayList;
import java.util.Arrays;
import p024I0.C0271a;
import p055T.C0541D;
import p055T.C0583o;
import p055T.InterfaceC0543F;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;

/* JADX INFO: renamed from: X.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0669a implements InterfaceC0543F {
    public static final Parcelable.Creator<C0669a> CREATOR = new C0271a(27);

    /* JADX INFO: renamed from: g */
    public final String f2564g;

    /* JADX INFO: renamed from: h */
    public final byte[] f2565h;

    /* JADX INFO: renamed from: i */
    public final int f2566i;

    /* JADX INFO: renamed from: j */
    public final int f2567j;

    public C0669a(String str, byte[] bArr, int i3, int i4) {
        m1781e(str, bArr, i4);
        this.f2564g = str;
        this.f2565h = bArr;
        this.f2566i = i3;
        this.f2567j = i4;
    }

    /* JADX INFO: renamed from: e */
    public static void m1781e(String str, byte[] bArr, int i3) {
        byte b3;
        str.getClass();
        boolean z3 = false;
        switch (str) {
            case "com.android.capture.fps":
                if (i3 == 23 && bArr.length == 4) {
                    z3 = true;
                }
                AbstractC0646n.m1625c(z3);
                break;
            case "editable.tracks.samples.location":
                if (i3 == 75 && bArr.length == 1 && ((b3 = bArr[0]) == 0 || b3 == 1)) {
                    z3 = true;
                }
                AbstractC0646n.m1625c(z3);
                break;
            case "editable.tracks.length":
            case "editable.tracks.offset":
                if (i3 == 78 && bArr.length == 8) {
                    z3 = true;
                }
                AbstractC0646n.m1625c(z3);
                break;
            case "editable.tracks.map":
                AbstractC0646n.m1625c(i3 == 0);
                break;
        }
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
    public final /* synthetic */ void mo499c(C0541D c0541d) {
    }

    /* JADX INFO: renamed from: d */
    public final ArrayList m1782d() {
        AbstractC0646n.m1629g("Metadata is not an editable tracks map", this.f2564g.equals("editable.tracks.map"));
        byte[] bArr = this.f2565h;
        byte b3 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < b3; i3++) {
            arrayList.add(Integer.valueOf(bArr[i3 + 2]));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0669a.class == obj.getClass()) {
            C0669a c0669a = (C0669a) obj;
            if (this.f2564g.equals(c0669a.f2564g) && Arrays.equals(this.f2565h, c0669a.f2565h) && this.f2566i == c0669a.f2566i && this.f2567j == c0669a.f2567j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f2565h) + ((this.f2564g.hashCode() + 527) * 31)) * 31) + this.f2566i) * 31) + this.f2567j;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Code duplicated, block: B:25:0x008b A[LOOP:0: B:23:0x0088->B:25:0x008b, LOOP_END] */
    public final String toString() {
        String string;
        StringBuilder sb;
        String str = this.f2564g;
        byte[] bArr = this.f2565h;
        int i3 = this.f2567j;
        if (i3 != 0) {
            if (i3 == 1) {
                string = AbstractC0632A.m1595n(bArr);
            } else if (i3 == 23) {
                string = String.valueOf(Float.intBitsToFloat(AbstractC1303m.m3319l(bArr)));
            } else if (i3 == 67) {
                string = String.valueOf(AbstractC1303m.m3319l(bArr));
            } else if (i3 == 75) {
                string = String.valueOf(bArr[0] & 255);
            } else if (i3 != 78) {
                int i4 = AbstractC0632A.f2454a;
                sb = new StringBuilder(bArr.length * 2);
                for (int i5 = 0; i5 < bArr.length; i5++) {
                    sb.append(Character.forDigit((bArr[i5] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i5] & 15, 16));
                }
                string = sb.toString();
            } else {
                string = String.valueOf(new C0651s(bArr).m1692z());
            }
        } else if (str.equals("editable.tracks.map")) {
            ArrayList arrayListM1782d = m1782d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("track types = ");
            new C0924n(String.valueOf(',')).m2412a(sb2, arrayListM1782d.iterator());
            string = sb2.toString();
        } else {
            int i6 = AbstractC0632A.f2454a;
            sb = new StringBuilder(bArr.length * 2);
            while (i5 < bArr.length) {
                sb.append(Character.forDigit((bArr[i5] >> 4) & 15, 16));
                sb.append(Character.forDigit(bArr[i5] & 15, 16));
            }
            string = sb.toString();
        }
        return "mdta: key=" + str + ", value=" + string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f2564g);
        parcel.writeByteArray(this.f2565h);
        parcel.writeInt(this.f2566i);
        parcel.writeInt(this.f2567j);
    }

    public C0669a(Parcel parcel) {
        String string = parcel.readString();
        int i3 = AbstractC0632A.f2454a;
        this.f2564g = string;
        byte[] bArrCreateByteArray = parcel.createByteArray();
        this.f2565h = bArrCreateByteArray;
        this.f2566i = parcel.readInt();
        int i4 = parcel.readInt();
        this.f2567j = i4;
        m1781e(string, bArrCreateByteArray, i4);
    }
}
