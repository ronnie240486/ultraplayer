package p092e0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p055T.C0541D;
import p055T.C0583o;
import p055T.InterfaceC0543F;
import p076a.C0787c;

/* JADX INFO: renamed from: e0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1514s implements InterfaceC0543F {
    public static final Parcelable.Creator<C1514s> CREATOR = new C0787c(11);

    /* JADX INFO: renamed from: g */
    public final String f6823g;

    /* JADX INFO: renamed from: h */
    public final String f6824h;

    /* JADX INFO: renamed from: i */
    public final List f6825i;

    public C1514s(String str, String str2, List list) {
        this.f6823g = str;
        this.f6824h = str2;
        this.f6825i = Collections.unmodifiableList(new ArrayList(list));
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

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1514s.class == obj.getClass()) {
            C1514s c1514s = (C1514s) obj;
            if (TextUtils.equals(this.f6823g, c1514s.f6823g) && TextUtils.equals(this.f6824h, c1514s.f6824h) && this.f6825i.equals(c1514s.f6825i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6823g;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f6824h;
        return this.f6825i.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f6823g;
        if (str2 != null) {
            str = " [" + str2 + ", " + this.f6824h + "]";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeString(this.f6823g);
        parcel.writeString(this.f6824h);
        List list = this.f6825i;
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeParcelable((Parcelable) list.get(i4), 0);
        }
    }

    public C1514s(Parcel parcel) {
        this.f6823g = parcel.readString();
        this.f6824h = parcel.readString();
        int i3 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add((C1513r) parcel.readParcelable(C1513r.class.getClassLoader()));
        }
        this.f6825i = Collections.unmodifiableList(arrayList);
    }
}
