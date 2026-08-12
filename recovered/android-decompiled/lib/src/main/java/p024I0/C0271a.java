package p024I0;

import android.accounts.Account;
import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayList;
import p013E1.C0129d;
import p013E1.C0149x;
import p027J0.C0294a;
import p028J1.C0297c;
import p028J1.C0298d;
import p028J1.C0320z;
import p034L1.C0346a;
import p034L1.C0348c;
import p043O1.C0448a;
import p046P1.C0476d;
import p046P1.C0477e;
import p046P1.C0479g;
import p046P1.C0481i;
import p046P1.C0482j;
import p046P1.C0486n;
import p046P1.C0487o;
import p046P1.C0497y;
import p055T.C0544G;
import p055T.C0554Q;
import p055T.C0578j;
import p055T.C0579k;
import p066W1.AbstractC0664e;
import p067X.C0669a;
import p067X.C0673e;
import p067X.C0674f;

/* JADX INFO: renamed from: I0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0271a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f726a;

    public /* synthetic */ C0271a(int i3) {
        this.f726a = i3;
    }

    /* JADX INFO: renamed from: a */
    public static void m816a(C0477e c0477e, Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 1, 4);
        parcel.writeInt(c0477e.f1582g);
        AbstractC1303m.m3311d0(parcel, 2, 4);
        parcel.writeInt(c0477e.f1583h);
        AbstractC1303m.m3311d0(parcel, 3, 4);
        parcel.writeInt(c0477e.f1584i);
        AbstractC1303m.m3299V(parcel, 4, c0477e.f1585j);
        AbstractC1303m.m3295R(parcel, 5, c0477e.f1586k);
        AbstractC1303m.m3301X(parcel, 6, c0477e.f1587l, i3);
        AbstractC1303m.m3294Q(parcel, 7, c0477e.f1588m);
        AbstractC1303m.m3298U(parcel, 8, c0477e.f1589n, i3);
        AbstractC1303m.m3301X(parcel, 10, c0477e.f1590o, i3);
        AbstractC1303m.m3301X(parcel, 11, c0477e.f1591p, i3);
        AbstractC1303m.m3311d0(parcel, 12, 4);
        parcel.writeInt(c0477e.f1592q ? 1 : 0);
        AbstractC1303m.m3311d0(parcel, 13, 4);
        parcel.writeInt(c0477e.f1593r);
        boolean z3 = c0477e.f1594s;
        AbstractC1303m.m3311d0(parcel, 14, 4);
        parcel.writeInt(z3 ? 1 : 0);
        AbstractC1303m.m3299V(parcel, 15, c0477e.f1595t);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f726a) {
            case 0:
                return new C0272b(parcel);
            case 1:
                return new C0276f(parcel);
            case 2:
                return new C0277g();
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C0280j(parcel);
            case 4:
                return new C0281k(parcel.readLong(), parcel.readLong());
            case 5:
                return new C0294a(parcel);
            case 6:
                int iM1737Y = AbstractC0664e.m1737Y(parcel);
                int iM1728M = 0;
                boolean zM1723H = false;
                boolean zM1723H2 = false;
                while (parcel.dataPosition() < iM1737Y) {
                    int i3 = parcel.readInt();
                    char c = (char) i3;
                    if (c == 2) {
                        iM1728M = AbstractC0664e.m1728M(parcel, i3);
                    } else if (c == 3) {
                        zM1723H = AbstractC0664e.m1723H(parcel, i3);
                    } else if (c != 4) {
                        AbstractC0664e.m1735U(parcel, i3);
                    } else {
                        zM1723H2 = AbstractC0664e.m1723H(parcel, i3);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y);
                return new C0320z(iM1728M, zM1723H, zM1723H2);
            case 7:
                int iM1737Y2 = AbstractC0664e.m1737Y(parcel);
                double dM1725J = 0.0d;
                C0129d c0129d = null;
                C0149x c0149x = null;
                boolean zM1723H3 = false;
                int iM1728M2 = 0;
                int iM1728M3 = 0;
                double dM1725J2 = 0.0d;
                while (parcel.dataPosition() < iM1737Y2) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 2:
                            dM1725J = AbstractC0664e.m1725J(parcel, i4);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            zM1723H3 = AbstractC0664e.m1723H(parcel, i4);
                            break;
                        case 4:
                            iM1728M2 = AbstractC0664e.m1728M(parcel, i4);
                            break;
                        case 5:
                            c0129d = (C0129d) AbstractC0664e.m1753r(parcel, i4, C0129d.CREATOR);
                            break;
                        case 6:
                            iM1728M3 = AbstractC0664e.m1728M(parcel, i4);
                            break;
                        case 7:
                            c0149x = (C0149x) AbstractC0664e.m1753r(parcel, i4, C0149x.CREATOR);
                            break;
                        case '\b':
                            dM1725J2 = AbstractC0664e.m1725J(parcel, i4);
                            break;
                        default:
                            AbstractC0664e.m1735U(parcel, i4);
                            break;
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y2);
                C0298d c0298d = new C0298d();
                c0298d.f792g = dM1725J;
                c0298d.f793h = zM1723H3;
                c0298d.f794i = iM1728M2;
                c0298d.f795j = c0129d;
                c0298d.f796k = iM1728M3;
                c0298d.f797l = c0149x;
                c0298d.f798m = dM1725J2;
                return c0298d;
            case 8:
                int iM1737Y3 = AbstractC0664e.m1737Y(parcel);
                String strM1754s = null;
                while (parcel.dataPosition() < iM1737Y3) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 2) {
                        AbstractC0664e.m1735U(parcel, i5);
                    } else {
                        strM1754s = AbstractC0664e.m1754s(parcel, i5);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y3);
                return new C0297c(strM1754s);
            case 9:
                int iM1737Y4 = AbstractC0664e.m1737Y(parcel);
                PendingIntent pendingIntent = null;
                String strM1754s2 = null;
                int iM1728M4 = 0;
                int iM1728M5 = 0;
                while (parcel.dataPosition() < iM1737Y4) {
                    int i6 = parcel.readInt();
                    char c2 = (char) i6;
                    if (c2 == 1) {
                        iM1728M4 = AbstractC0664e.m1728M(parcel, i6);
                    } else if (c2 == 2) {
                        iM1728M5 = AbstractC0664e.m1728M(parcel, i6);
                    } else if (c2 == 3) {
                        pendingIntent = (PendingIntent) AbstractC0664e.m1753r(parcel, i6, PendingIntent.CREATOR);
                    } else if (c2 != 4) {
                        AbstractC0664e.m1735U(parcel, i6);
                    } else {
                        strM1754s2 = AbstractC0664e.m1754s(parcel, i6);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y4);
                return new C0346a(iM1728M4, iM1728M5, pendingIntent, strM1754s2);
            case 10:
                int iM1737Y5 = AbstractC0664e.m1737Y(parcel);
                long jM1729N = -1;
                int iM1728M6 = 0;
                String strM1754s3 = null;
                while (parcel.dataPosition() < iM1737Y5) {
                    int i7 = parcel.readInt();
                    char c3 = (char) i7;
                    if (c3 == 1) {
                        strM1754s3 = AbstractC0664e.m1754s(parcel, i7);
                    } else if (c3 == 2) {
                        iM1728M6 = AbstractC0664e.m1728M(parcel, i7);
                    } else if (c3 != 3) {
                        AbstractC0664e.m1735U(parcel, i7);
                    } else {
                        jM1729N = AbstractC0664e.m1729N(parcel, i7);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y5);
                return new C0348c(strM1754s3, jM1729N, iM1728M6);
            case 11:
                int iM1737Y6 = AbstractC0664e.m1737Y(parcel);
                String strM1754s4 = null;
                int iM1728M7 = 0;
                while (parcel.dataPosition() < iM1737Y6) {
                    int i8 = parcel.readInt();
                    char c4 = (char) i8;
                    if (c4 == 1) {
                        iM1728M7 = AbstractC0664e.m1728M(parcel, i8);
                    } else if (c4 != 2) {
                        AbstractC0664e.m1735U(parcel, i8);
                    } else {
                        strM1754s4 = AbstractC0664e.m1754s(parcel, i8);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y6);
                return new Scope(iM1728M7, strM1754s4);
            case 12:
                int iM1737Y7 = AbstractC0664e.m1737Y(parcel);
                String strM1754s5 = null;
                PendingIntent pendingIntent2 = null;
                C0346a c0346a = null;
                int iM1728M8 = 0;
                while (parcel.dataPosition() < iM1737Y7) {
                    int i9 = parcel.readInt();
                    char c5 = (char) i9;
                    if (c5 == 1) {
                        iM1728M8 = AbstractC0664e.m1728M(parcel, i9);
                    } else if (c5 == 2) {
                        strM1754s5 = AbstractC0664e.m1754s(parcel, i9);
                    } else if (c5 == 3) {
                        pendingIntent2 = (PendingIntent) AbstractC0664e.m1753r(parcel, i9, PendingIntent.CREATOR);
                    } else if (c5 != 4) {
                        AbstractC0664e.m1735U(parcel, i9);
                    } else {
                        c0346a = (C0346a) AbstractC0664e.m1753r(parcel, i9, C0346a.CREATOR);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y7);
                return new Status(iM1728M8, strM1754s5, pendingIntent2, c0346a);
            case 13:
                int iM1737Y8 = AbstractC0664e.m1737Y(parcel);
                int iM1728M9 = 0;
                Uri uri = null;
                int iM1728M10 = 0;
                int iM1728M11 = 0;
                while (parcel.dataPosition() < iM1737Y8) {
                    int i10 = parcel.readInt();
                    char c6 = (char) i10;
                    if (c6 == 1) {
                        iM1728M9 = AbstractC0664e.m1728M(parcel, i10);
                    } else if (c6 == 2) {
                        uri = (Uri) AbstractC0664e.m1753r(parcel, i10, Uri.CREATOR);
                    } else if (c6 == 3) {
                        iM1728M10 = AbstractC0664e.m1728M(parcel, i10);
                    } else if (c6 != 4) {
                        AbstractC0664e.m1735U(parcel, i10);
                    } else {
                        iM1728M11 = AbstractC0664e.m1728M(parcel, i10);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y8);
                return new C0448a(iM1728M9, uri, iM1728M10, iM1728M11);
            case 14:
                int iM1737Y9 = AbstractC0664e.m1737Y(parcel);
                ArrayList arrayListM1757v = null;
                int iM1728M12 = 0;
                while (parcel.dataPosition() < iM1737Y9) {
                    int i11 = parcel.readInt();
                    char c7 = (char) i11;
                    if (c7 == 1) {
                        iM1728M12 = AbstractC0664e.m1728M(parcel, i11);
                    } else if (c7 != 2) {
                        AbstractC0664e.m1735U(parcel, i11);
                    } else {
                        arrayListM1757v = AbstractC0664e.m1757v(parcel, i11, C0479g.CREATOR);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y9);
                return new C0482j(iM1728M12, arrayListM1757v);
            case 15:
                int iM1737Y10 = AbstractC0664e.m1737Y(parcel);
                String strM1754s6 = null;
                String strM1754s7 = null;
                long jM1729N2 = 0;
                long jM1729N3 = 0;
                int iM1728M13 = 0;
                int iM1728M14 = 0;
                int iM1728M15 = 0;
                int iM1728M16 = 0;
                int iM1728M17 = -1;
                while (parcel.dataPosition() < iM1737Y10) {
                    int i12 = parcel.readInt();
                    switch ((char) i12) {
                        case 1:
                            iM1728M13 = AbstractC0664e.m1728M(parcel, i12);
                            break;
                        case 2:
                            iM1728M14 = AbstractC0664e.m1728M(parcel, i12);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            iM1728M15 = AbstractC0664e.m1728M(parcel, i12);
                            break;
                        case 4:
                            jM1729N2 = AbstractC0664e.m1729N(parcel, i12);
                            break;
                        case 5:
                            jM1729N3 = AbstractC0664e.m1729N(parcel, i12);
                            break;
                        case 6:
                            strM1754s6 = AbstractC0664e.m1754s(parcel, i12);
                            break;
                        case 7:
                            strM1754s7 = AbstractC0664e.m1754s(parcel, i12);
                            break;
                        case '\b':
                            iM1728M16 = AbstractC0664e.m1728M(parcel, i12);
                            break;
                        case '\t':
                            iM1728M17 = AbstractC0664e.m1728M(parcel, i12);
                            break;
                        default:
                            AbstractC0664e.m1735U(parcel, i12);
                            break;
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y10);
                return new C0479g(iM1728M13, iM1728M14, iM1728M15, jM1729N2, jM1729N3, strM1754s6, strM1754s7, iM1728M16, iM1728M17);
            case 16:
                int iM1737Y11 = AbstractC0664e.m1737Y(parcel);
                Account account = null;
                GoogleSignInAccount googleSignInAccount = null;
                int iM1728M18 = 0;
                int iM1728M19 = 0;
                while (parcel.dataPosition() < iM1737Y11) {
                    int i13 = parcel.readInt();
                    char c8 = (char) i13;
                    if (c8 == 1) {
                        iM1728M18 = AbstractC0664e.m1728M(parcel, i13);
                    } else if (c8 == 2) {
                        account = (Account) AbstractC0664e.m1753r(parcel, i13, Account.CREATOR);
                    } else if (c8 == 3) {
                        iM1728M19 = AbstractC0664e.m1728M(parcel, i13);
                    } else if (c8 != 4) {
                        AbstractC0664e.m1735U(parcel, i13);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC0664e.m1753r(parcel, i13, GoogleSignInAccount.CREATOR);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y11);
                return new C0486n(iM1728M18, account, iM1728M19, googleSignInAccount);
            case 17:
                int iM1737Y12 = AbstractC0664e.m1737Y(parcel);
                IBinder iBinderM1727L = null;
                C0346a c0346a2 = null;
                int iM1728M20 = 0;
                boolean zM1723H4 = false;
                boolean zM1723H5 = false;
                while (parcel.dataPosition() < iM1737Y12) {
                    int i14 = parcel.readInt();
                    char c9 = (char) i14;
                    if (c9 == 1) {
                        iM1728M20 = AbstractC0664e.m1728M(parcel, i14);
                    } else if (c9 == 2) {
                        iBinderM1727L = AbstractC0664e.m1727L(parcel, i14);
                    } else if (c9 == 3) {
                        c0346a2 = (C0346a) AbstractC0664e.m1753r(parcel, i14, C0346a.CREATOR);
                    } else if (c9 == 4) {
                        zM1723H4 = AbstractC0664e.m1723H(parcel, i14);
                    } else if (c9 != 5) {
                        AbstractC0664e.m1735U(parcel, i14);
                    } else {
                        zM1723H5 = AbstractC0664e.m1723H(parcel, i14);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y12);
                return new C0487o(iM1728M20, iBinderM1727L, c0346a2, zM1723H4, zM1723H5);
            case 18:
                int iM1737Y13 = AbstractC0664e.m1737Y(parcel);
                int iM1728M21 = 0;
                boolean zM1723H6 = false;
                boolean zM1723H7 = false;
                int iM1728M22 = 0;
                int iM1728M23 = 0;
                while (parcel.dataPosition() < iM1737Y13) {
                    int i15 = parcel.readInt();
                    char c10 = (char) i15;
                    if (c10 == 1) {
                        iM1728M21 = AbstractC0664e.m1728M(parcel, i15);
                    } else if (c10 == 2) {
                        zM1723H6 = AbstractC0664e.m1723H(parcel, i15);
                    } else if (c10 == 3) {
                        zM1723H7 = AbstractC0664e.m1723H(parcel, i15);
                    } else if (c10 == 4) {
                        iM1728M22 = AbstractC0664e.m1728M(parcel, i15);
                    } else if (c10 != 5) {
                        AbstractC0664e.m1735U(parcel, i15);
                    } else {
                        iM1728M23 = AbstractC0664e.m1728M(parcel, i15);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y13);
                return new C0481i(iM1728M21, zM1723H6, zM1723H7, iM1728M22, iM1728M23);
            case 19:
                return new BinderWrapper(parcel);
            case 20:
                int iM1737Y14 = AbstractC0664e.m1737Y(parcel);
                Bundle bundleM1750k = null;
                C0348c[] c0348cArr = null;
                C0476d c0476d = null;
                int iM1728M24 = 0;
                while (parcel.dataPosition() < iM1737Y14) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 1) {
                        bundleM1750k = AbstractC0664e.m1750k(parcel, i16);
                    } else if (c11 == 2) {
                        c0348cArr = (C0348c[]) AbstractC0664e.m1756u(parcel, i16, C0348c.CREATOR);
                    } else if (c11 == 3) {
                        iM1728M24 = AbstractC0664e.m1728M(parcel, i16);
                    } else if (c11 != 4) {
                        AbstractC0664e.m1735U(parcel, i16);
                    } else {
                        c0476d = (C0476d) AbstractC0664e.m1753r(parcel, i16, C0476d.CREATOR);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y14);
                C0497y c0497y = new C0497y();
                c0497y.f1648g = bundleM1750k;
                c0497y.f1649h = c0348cArr;
                c0497y.f1650i = iM1728M24;
                c0497y.f1651j = c0476d;
                return c0497y;
            case 21:
                int iM1737Y15 = AbstractC0664e.m1737Y(parcel);
                C0481i c0481i = null;
                int[] iArrM1751p = null;
                int[] iArrM1751p2 = null;
                boolean zM1723H8 = false;
                boolean zM1723H9 = false;
                int iM1728M25 = 0;
                while (parcel.dataPosition() < iM1737Y15) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 1:
                            c0481i = (C0481i) AbstractC0664e.m1753r(parcel, i17, C0481i.CREATOR);
                            break;
                        case 2:
                            zM1723H8 = AbstractC0664e.m1723H(parcel, i17);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            zM1723H9 = AbstractC0664e.m1723H(parcel, i17);
                            break;
                        case 4:
                            iArrM1751p = AbstractC0664e.m1751p(parcel, i17);
                            break;
                        case 5:
                            iM1728M25 = AbstractC0664e.m1728M(parcel, i17);
                            break;
                        case 6:
                            iArrM1751p2 = AbstractC0664e.m1751p(parcel, i17);
                            break;
                        default:
                            AbstractC0664e.m1735U(parcel, i17);
                            break;
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y15);
                return new C0476d(c0481i, zM1723H8, zM1723H9, iArrM1751p, iM1728M25, iArrM1751p2);
            case 22:
                int iM1737Y16 = AbstractC0664e.m1737Y(parcel);
                Scope[] scopeArr = C0477e.f1580u;
                Bundle bundle = new Bundle();
                C0348c[] c0348cArr2 = C0477e.f1581v;
                C0348c[] c0348cArr3 = c0348cArr2;
                String strM1754s8 = null;
                IBinder iBinderM1727L2 = null;
                Account account2 = null;
                String strM1754s9 = null;
                int iM1728M26 = 0;
                int iM1728M27 = 0;
                int iM1728M28 = 0;
                boolean zM1723H10 = false;
                int iM1728M29 = 0;
                boolean zM1723H11 = false;
                while (parcel.dataPosition() < iM1737Y16) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 1:
                            iM1728M26 = AbstractC0664e.m1728M(parcel, i18);
                            break;
                        case 2:
                            iM1728M27 = AbstractC0664e.m1728M(parcel, i18);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            iM1728M28 = AbstractC0664e.m1728M(parcel, i18);
                            break;
                        case 4:
                            strM1754s8 = AbstractC0664e.m1754s(parcel, i18);
                            break;
                        case 5:
                            iBinderM1727L2 = AbstractC0664e.m1727L(parcel, i18);
                            break;
                        case 6:
                            scopeArr = (Scope[]) AbstractC0664e.m1756u(parcel, i18, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = AbstractC0664e.m1750k(parcel, i18);
                            break;
                        case '\b':
                            account2 = (Account) AbstractC0664e.m1753r(parcel, i18, Account.CREATOR);
                            break;
                        case '\t':
                        default:
                            AbstractC0664e.m1735U(parcel, i18);
                            break;
                        case '\n':
                            c0348cArr2 = (C0348c[]) AbstractC0664e.m1756u(parcel, i18, C0348c.CREATOR);
                            break;
                        case 11:
                            c0348cArr3 = (C0348c[]) AbstractC0664e.m1756u(parcel, i18, C0348c.CREATOR);
                            break;
                        case '\f':
                            zM1723H10 = AbstractC0664e.m1723H(parcel, i18);
                            break;
                        case '\r':
                            iM1728M29 = AbstractC0664e.m1728M(parcel, i18);
                            break;
                        case 14:
                            zM1723H11 = AbstractC0664e.m1723H(parcel, i18);
                            break;
                        case 15:
                            strM1754s9 = AbstractC0664e.m1754s(parcel, i18);
                            break;
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y16);
                return new C0477e(iM1728M26, iM1728M27, iM1728M28, strM1754s8, iBinderM1727L2, scopeArr, bundle, account2, c0348cArr2, c0348cArr3, zM1723H10, iM1728M29, zM1723H11, strM1754s9);
            case 23:
                return new C0579k(parcel);
            case 24:
                return new C0578j(parcel);
            case 25:
                return new C0544G(parcel);
            case 26:
                return new C0554Q(parcel);
            case 27:
                return new C0669a(parcel);
            case 28:
                return new C0673e(parcel);
            default:
                return new C0674f(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f726a) {
            case 0:
                return new C0272b[i3];
            case 1:
                return new C0276f[i3];
            case 2:
                return new C0277g[i3];
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C0280j[i3];
            case 4:
                return new C0281k[i3];
            case 5:
                return new C0294a[i3];
            case 6:
                return new C0320z[i3];
            case 7:
                return new C0298d[i3];
            case 8:
                return new C0297c[i3];
            case 9:
                return new C0346a[i3];
            case 10:
                return new C0348c[i3];
            case 11:
                return new Scope[i3];
            case 12:
                return new Status[i3];
            case 13:
                return new C0448a[i3];
            case 14:
                return new C0482j[i3];
            case 15:
                return new C0479g[i3];
            case 16:
                return new C0486n[i3];
            case 17:
                return new C0487o[i3];
            case 18:
                return new C0481i[i3];
            case 19:
                return new BinderWrapper[i3];
            case 20:
                return new C0497y[i3];
            case 21:
                return new C0476d[i3];
            case 22:
                return new C0477e[i3];
            case 23:
                return new C0579k[i3];
            case 24:
                return new C0578j[i3];
            case 25:
                return new C0544G[i3];
            case 26:
                return new C0554Q[i3];
            case 27:
                return new C0669a[i3];
            case 28:
                return new C0673e[i3];
            default:
                return new C0674f[i3];
        }
    }
}
