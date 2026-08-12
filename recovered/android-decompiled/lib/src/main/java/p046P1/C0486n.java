package p046P1;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.cast.AbstractC1303m;
import p024I0.C0271a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: P1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0486n extends AbstractC0512a {
    public static final Parcelable.Creator<C0486n> CREATOR = new C0271a(16);

    /* JADX INFO: renamed from: g */
    public final int f1621g;

    /* JADX INFO: renamed from: h */
    public final Account f1622h;

    /* JADX INFO: renamed from: i */
    public final int f1623i;

    /* JADX INFO: renamed from: j */
    public final GoogleSignInAccount f1624j;

    public C0486n(int i3, Account account, int i4, GoogleSignInAccount googleSignInAccount) {
        this.f1621g = i3;
        this.f1622h = account;
        this.f1623i = i4;
        this.f1624j = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 1, 4);
        parcel.writeInt(this.f1621g);
        AbstractC1303m.m3298U(parcel, 2, this.f1622h, i3);
        AbstractC1303m.m3311d0(parcel, 3, 4);
        parcel.writeInt(this.f1623i);
        AbstractC1303m.m3298U(parcel, 4, this.f1624j, i3);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
