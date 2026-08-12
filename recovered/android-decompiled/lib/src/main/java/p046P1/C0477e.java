package p046P1;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import p024I0.C0271a;
import p034L1.C0348c;
import p049Q1.AbstractC0512a;
import p079a2.AbstractC0853b;

/* JADX INFO: renamed from: P1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0477e extends AbstractC0512a {
    public static final Parcelable.Creator<C0477e> CREATOR = new C0271a(22);

    /* JADX INFO: renamed from: u */
    public static final Scope[] f1580u = new Scope[0];

    /* JADX INFO: renamed from: v */
    public static final C0348c[] f1581v = new C0348c[0];

    /* JADX INFO: renamed from: g */
    public final int f1582g;

    /* JADX INFO: renamed from: h */
    public final int f1583h;

    /* JADX INFO: renamed from: i */
    public final int f1584i;

    /* JADX INFO: renamed from: j */
    public String f1585j;

    /* JADX INFO: renamed from: k */
    public IBinder f1586k;

    /* JADX INFO: renamed from: l */
    public Scope[] f1587l;

    /* JADX INFO: renamed from: m */
    public Bundle f1588m;

    /* JADX INFO: renamed from: n */
    public Account f1589n;

    /* JADX INFO: renamed from: o */
    public C0348c[] f1590o;

    /* JADX INFO: renamed from: p */
    public C0348c[] f1591p;

    /* JADX INFO: renamed from: q */
    public final boolean f1592q;

    /* JADX INFO: renamed from: r */
    public final int f1593r;

    /* JADX INFO: renamed from: s */
    public boolean f1594s;

    /* JADX INFO: renamed from: t */
    public final String f1595t;

    public C0477e(int i3, int i4, int i5, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C0348c[] c0348cArr, C0348c[] c0348cArr2, boolean z3, int i6, boolean z4, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? f1580u : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        C0348c[] c0348cArr3 = f1581v;
        C0348c[] c0348cArr4 = c0348cArr == null ? c0348cArr3 : c0348cArr;
        c0348cArr3 = c0348cArr2 != null ? c0348cArr2 : c0348cArr3;
        this.f1582g = i3;
        this.f1583h = i4;
        this.f1584i = i5;
        if ("com.google.android.gms".equals(str)) {
            this.f1585j = "com.google.android.gms";
        } else {
            this.f1585j = str;
        }
        if (i3 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i7 = AbstractBinderC0473a.f1567c;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface c0472e = iInterfaceQueryLocalInterface instanceof InterfaceC0478f ? (InterfaceC0478f) iInterfaceQueryLocalInterface : new C0472E(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                if (c0472e != null) {
                    long jClearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            C0472E c0472e2 = (C0472E) c0472e;
                            Parcel parcelM1893P = c0472e2.m1893P(c0472e2.m1894e0(), 2);
                            Account account3 = (Account) AbstractC0853b.m2114a(parcelM1893P, Account.CREATOR);
                            parcelM1893P.recycle();
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                            account2 = account3;
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                            Binder.restoreCallingIdentity(jClearCallingIdentity);
                        }
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        throw th;
                    }
                }
            }
            this.f1589n = account2;
        } else {
            this.f1586k = iBinder;
            this.f1589n = account;
        }
        this.f1587l = scopeArr2;
        this.f1588m = bundle2;
        this.f1590o = c0348cArr4;
        this.f1591p = c0348cArr3;
        this.f1592q = z3;
        this.f1593r = i6;
        this.f1594s = z4;
        this.f1595t = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        C0271a.m816a(this, parcel, i3);
    }
}
