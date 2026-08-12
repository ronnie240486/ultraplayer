package p094e2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayList;
import p037M1.InterfaceC0398k;
import p049Q1.AbstractC0512a;
import p076a.C0787c;

/* JADX INFO: renamed from: e2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1526d extends AbstractC0512a implements InterfaceC0398k {
    public static final Parcelable.Creator<C1526d> CREATOR = new C0787c(14);

    /* JADX INFO: renamed from: g */
    public final ArrayList f6883g;

    /* JADX INFO: renamed from: h */
    public final String f6884h;

    public C1526d(String str, ArrayList arrayList) {
        this.f6883g = arrayList;
        this.f6884h = str;
    }

    @Override // p037M1.InterfaceC0398k
    /* JADX INFO: renamed from: d */
    public final Status mo774d() {
        return this.f6884h != null ? Status.f5494k : Status.f5496m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3300W(parcel, 1, this.f6883g);
        AbstractC1303m.m3299V(parcel, 2, this.f6884h);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
