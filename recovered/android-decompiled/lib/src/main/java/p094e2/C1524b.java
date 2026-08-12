package p094e2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.AbstractC1303m;
import p037M1.InterfaceC0398k;
import p049Q1.AbstractC0512a;
import p076a.C0787c;

/* JADX INFO: renamed from: e2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1524b extends AbstractC0512a implements InterfaceC0398k {
    public static final Parcelable.Creator<C1524b> CREATOR = new C0787c(13);

    /* JADX INFO: renamed from: g */
    public final int f6880g;

    /* JADX INFO: renamed from: h */
    public final int f6881h;

    /* JADX INFO: renamed from: i */
    public final Intent f6882i;

    public C1524b(int i3, int i4, Intent intent) {
        this.f6880g = i3;
        this.f6881h = i4;
        this.f6882i = intent;
    }

    @Override // p037M1.InterfaceC0398k
    /* JADX INFO: renamed from: d */
    public final Status mo774d() {
        return this.f6881h == 0 ? Status.f5494k : Status.f5496m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 1, 4);
        parcel.writeInt(this.f6880g);
        AbstractC1303m.m3311d0(parcel, 2, 4);
        parcel.writeInt(this.f6881h);
        AbstractC1303m.m3298U(parcel, 3, this.f6882i, i3);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
