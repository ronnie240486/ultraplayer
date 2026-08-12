package p007C0;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.ArrayList;
import p009D0.C0105a;
import p012E0.C0116a;
import p012E0.C0117b;
import p013E1.C0134i;
import p014F.C0163l;
import p015F0.C0173b;
import p015F0.C0174c;
import p016F1.C0179E;
import p016F1.C0180F;
import p016F1.C0186c;
import p018G0.C0211a;
import p018G0.C0212b;
import p018G0.C0213c;
import p018G0.C0214d;
import p018G0.C0215e;
import p018G0.C0216f;
import p018G0.C0221k;
import p018G0.C0222l;
import p018G0.C0223m;
import p018G0.C0224n;
import p018G0.C0225o;
import p019G1.C0226a;
import p019G1.C0227b;
import p019G1.C0229d;
import p019G1.C0231f;
import p021H0.C0253a;
import p021H0.C0254b;
import p021H0.C0255c;
import p021H0.C0256d;
import p066W1.AbstractC0664e;
import p105h2.AbstractC1676G;

/* JADX INFO: renamed from: C0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0101a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f127a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f127a) {
            case 0:
                String string = parcel.readString();
                string.getClass();
                return new C0102b(parcel.readInt(), string);
            case 1:
                int iM1737Y = AbstractC0664e.m1737Y(parcel);
                String strM1754s = null;
                String strM1754s2 = null;
                String strM1754s3 = null;
                String strM1754s4 = null;
                Uri uri = null;
                String strM1754s5 = null;
                String strM1754s6 = null;
                ArrayList arrayListM1757v = null;
                String strM1754s7 = null;
                String strM1754s8 = null;
                long jM1729N = 0;
                int iM1728M = 0;
                while (parcel.dataPosition() < iM1737Y) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 1:
                            iM1728M = AbstractC0664e.m1728M(parcel, i3);
                            break;
                        case 2:
                            strM1754s = AbstractC0664e.m1754s(parcel, i3);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            strM1754s2 = AbstractC0664e.m1754s(parcel, i3);
                            break;
                        case 4:
                            strM1754s3 = AbstractC0664e.m1754s(parcel, i3);
                            break;
                        case 5:
                            strM1754s4 = AbstractC0664e.m1754s(parcel, i3);
                            break;
                        case 6:
                            uri = (Uri) AbstractC0664e.m1753r(parcel, i3, Uri.CREATOR);
                            break;
                        case 7:
                            strM1754s5 = AbstractC0664e.m1754s(parcel, i3);
                            break;
                        case '\b':
                            jM1729N = AbstractC0664e.m1729N(parcel, i3);
                            break;
                        case '\t':
                            strM1754s6 = AbstractC0664e.m1754s(parcel, i3);
                            break;
                        case '\n':
                            arrayListM1757v = AbstractC0664e.m1757v(parcel, i3, Scope.CREATOR);
                            break;
                        case 11:
                            strM1754s7 = AbstractC0664e.m1754s(parcel, i3);
                            break;
                        case '\f':
                            strM1754s8 = AbstractC0664e.m1754s(parcel, i3);
                            break;
                        default:
                            AbstractC0664e.m1735U(parcel, i3);
                            break;
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y);
                return new GoogleSignInAccount(iM1728M, strM1754s, strM1754s2, strM1754s3, strM1754s4, uri, strM1754s5, jM1729N, strM1754s6, arrayListM1757v, strM1754s7, strM1754s8);
            case 2:
                return new C0105a(parcel);
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C0116a(parcel);
            case 4:
                return new C0117b(parcel);
            case 5:
                C0163l c0163l = new C0163l(parcel);
                c0163l.f389g = parcel.readInt();
                return c0163l;
            case 6:
                return new C0173b(parcel);
            case 7:
                return new C0174c(parcel);
            case 8:
                int iM1737Y2 = AbstractC0664e.m1737Y(parcel);
                boolean zM1723H = false;
                while (parcel.dataPosition() < iM1737Y2) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 2) {
                        AbstractC0664e.m1735U(parcel, i4);
                    } else {
                        zM1723H = AbstractC0664e.m1723H(parcel, i4);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y2);
                return new C0179E(zM1723H);
            case 9:
                int iM1737Y3 = AbstractC0664e.m1737Y(parcel);
                int iM1728M2 = 0;
                while (parcel.dataPosition() < iM1737Y3) {
                    int i5 = parcel.readInt();
                    if (((char) i5) != 2) {
                        AbstractC0664e.m1735U(parcel, i5);
                    } else {
                        iM1728M2 = AbstractC0664e.m1728M(parcel, i5);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y3);
                return new C0180F(iM1728M2);
            case 10:
                int iM1737Y4 = AbstractC0664e.m1737Y(parcel);
                String strM1754s9 = null;
                ArrayList arrayListM1755t = null;
                C0134i c0134i = null;
                C0226a c0226a = null;
                ArrayList arrayListM1755t2 = null;
                C0179E c0179e = null;
                C0180F c0180f = null;
                double dM1725J = 0.0d;
                boolean zM1723H2 = false;
                boolean zM1723H3 = false;
                boolean zM1723H4 = false;
                boolean zM1723H5 = false;
                boolean zM1723H6 = false;
                boolean zM1723H7 = false;
                boolean zM1723H8 = false;
                boolean zM1723H9 = false;
                while (parcel.dataPosition() < iM1737Y4) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 2:
                            strM1754s9 = AbstractC0664e.m1754s(parcel, i6);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            arrayListM1755t = AbstractC0664e.m1755t(parcel, i6);
                            break;
                        case 4:
                            zM1723H2 = AbstractC0664e.m1723H(parcel, i6);
                            break;
                        case 5:
                            c0134i = (C0134i) AbstractC0664e.m1753r(parcel, i6, C0134i.CREATOR);
                            break;
                        case 6:
                            zM1723H3 = AbstractC0664e.m1723H(parcel, i6);
                            break;
                        case 7:
                            c0226a = (C0226a) AbstractC0664e.m1753r(parcel, i6, C0226a.CREATOR);
                            break;
                        case '\b':
                            zM1723H4 = AbstractC0664e.m1723H(parcel, i6);
                            break;
                        case '\t':
                            dM1725J = AbstractC0664e.m1725J(parcel, i6);
                            break;
                        case '\n':
                            zM1723H5 = AbstractC0664e.m1723H(parcel, i6);
                            break;
                        case 11:
                            zM1723H6 = AbstractC0664e.m1723H(parcel, i6);
                            break;
                        case '\f':
                            zM1723H7 = AbstractC0664e.m1723H(parcel, i6);
                            break;
                        case '\r':
                            arrayListM1755t2 = AbstractC0664e.m1755t(parcel, i6);
                            break;
                        case 14:
                            zM1723H8 = AbstractC0664e.m1723H(parcel, i6);
                            break;
                        case 15:
                            AbstractC0664e.m1728M(parcel, i6);
                            break;
                        case 16:
                            zM1723H9 = AbstractC0664e.m1723H(parcel, i6);
                            break;
                        case 17:
                            c0179e = (C0179E) AbstractC0664e.m1753r(parcel, i6, C0179E.CREATOR);
                            break;
                        case 18:
                            c0180f = (C0180F) AbstractC0664e.m1753r(parcel, i6, C0180F.CREATOR);
                            break;
                        default:
                            AbstractC0664e.m1735U(parcel, i6);
                            break;
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y4);
                return new C0186c(strM1754s9, arrayListM1755t, zM1723H2, c0134i, zM1723H3, c0226a, zM1723H4, dM1725J, zM1723H5, zM1723H6, zM1723H7, arrayListM1755t2, zM1723H8, zM1723H9, c0179e, c0180f);
            case 11:
                return new C0211a(parcel);
            case 12:
                return new C0212b(parcel);
            case 13:
                return new C0213c(parcel);
            case 14:
                return new C0214d(parcel);
            case 15:
                return new C0215e(parcel);
            case 16:
                return new C0216f(parcel);
            case 17:
                return new C0221k(parcel);
            case 18:
                return new C0222l(parcel);
            case 19:
                return new C0223m(parcel);
            case 20:
                String string2 = parcel.readString();
                string2.getClass();
                String string3 = parcel.readString();
                String[] strArrCreateStringArray = parcel.createStringArray();
                strArrCreateStringArray.getClass();
                return new C0224n(string2, string3, AbstractC1676G.m4118o(strArrCreateStringArray));
            case 21:
                return new C0225o(parcel);
            case 22:
                int iM1737Y5 = AbstractC0664e.m1737Y(parcel);
                String strM1754s10 = null;
                String strM1754s11 = null;
                IBinder iBinderM1727L = null;
                C0231f c0231f = null;
                boolean zM1723H10 = false;
                boolean zM1723H11 = false;
                while (parcel.dataPosition() < iM1737Y5) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 2:
                            strM1754s10 = AbstractC0664e.m1754s(parcel, i7);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            strM1754s11 = AbstractC0664e.m1754s(parcel, i7);
                            break;
                        case 4:
                            iBinderM1727L = AbstractC0664e.m1727L(parcel, i7);
                            break;
                        case 5:
                            c0231f = (C0231f) AbstractC0664e.m1753r(parcel, i7, C0231f.CREATOR);
                            break;
                        case 6:
                            zM1723H10 = AbstractC0664e.m1723H(parcel, i7);
                            break;
                        case 7:
                            zM1723H11 = AbstractC0664e.m1723H(parcel, i7);
                            break;
                        default:
                            AbstractC0664e.m1735U(parcel, i7);
                            break;
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y5);
                return new C0226a(strM1754s10, strM1754s11, iBinderM1727L, c0231f, zM1723H10, zM1723H11);
            case 23:
                int iM1737Y6 = AbstractC0664e.m1737Y(parcel);
                ArrayList arrayListM1755t3 = null;
                int[] iArrM1751p = null;
                String strM1754s12 = null;
                IBinder iBinderM1727L2 = null;
                long jM1729N2 = 0;
                int iM1728M3 = 0;
                int iM1728M4 = 0;
                int iM1728M5 = 0;
                int iM1728M6 = 0;
                int iM1728M7 = 0;
                int iM1728M8 = 0;
                int iM1728M9 = 0;
                int iM1728M10 = 0;
                int iM1728M11 = 0;
                int iM1728M12 = 0;
                int iM1728M13 = 0;
                int iM1728M14 = 0;
                int iM1728M15 = 0;
                int iM1728M16 = 0;
                int iM1728M17 = 0;
                int iM1728M18 = 0;
                int iM1728M19 = 0;
                int iM1728M20 = 0;
                int iM1728M21 = 0;
                int iM1728M22 = 0;
                int iM1728M23 = 0;
                int iM1728M24 = 0;
                int iM1728M25 = 0;
                int iM1728M26 = 0;
                int iM1728M27 = 0;
                int iM1728M28 = 0;
                int iM1728M29 = 0;
                boolean zM1723H12 = false;
                boolean zM1723H13 = false;
                while (parcel.dataPosition() < iM1737Y6) {
                    int i8 = parcel.readInt();
                    switch ((char) i8) {
                        case 2:
                            arrayListM1755t3 = AbstractC0664e.m1755t(parcel, i8);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            iArrM1751p = AbstractC0664e.m1751p(parcel, i8);
                            break;
                        case 4:
                            jM1729N2 = AbstractC0664e.m1729N(parcel, i8);
                            break;
                        case 5:
                            strM1754s12 = AbstractC0664e.m1754s(parcel, i8);
                            break;
                        case 6:
                            iM1728M3 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 7:
                            iM1728M4 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case '\b':
                            iM1728M5 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case '\t':
                            iM1728M6 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case '\n':
                            iM1728M7 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 11:
                            iM1728M8 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case '\f':
                            iM1728M9 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case '\r':
                            iM1728M10 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 14:
                            iM1728M11 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 15:
                            iM1728M12 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 16:
                            iM1728M13 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 17:
                            iM1728M14 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 18:
                            iM1728M15 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 19:
                            iM1728M16 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 20:
                            iM1728M17 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 21:
                            iM1728M18 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 22:
                            iM1728M19 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 23:
                            iM1728M20 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 24:
                            iM1728M21 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 25:
                            iM1728M22 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 26:
                            iM1728M23 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 27:
                            iM1728M24 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 28:
                            iM1728M25 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 29:
                            iM1728M26 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 30:
                            iM1728M27 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case 31:
                            iM1728M28 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case ' ':
                            iM1728M29 = AbstractC0664e.m1728M(parcel, i8);
                            break;
                        case '!':
                            iBinderM1727L2 = AbstractC0664e.m1727L(parcel, i8);
                            break;
                        case '\"':
                            zM1723H12 = AbstractC0664e.m1723H(parcel, i8);
                            break;
                        case '#':
                            zM1723H13 = AbstractC0664e.m1723H(parcel, i8);
                            break;
                        default:
                            AbstractC0664e.m1735U(parcel, i8);
                            break;
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y6);
                return new C0231f(arrayListM1755t3, iArrM1751p, jM1729N2, strM1754s12, iM1728M3, iM1728M4, iM1728M5, iM1728M6, iM1728M7, iM1728M8, iM1728M9, iM1728M10, iM1728M11, iM1728M12, iM1728M13, iM1728M14, iM1728M15, iM1728M16, iM1728M17, iM1728M18, iM1728M19, iM1728M20, iM1728M21, iM1728M22, iM1728M23, iM1728M24, iM1728M25, iM1728M26, iM1728M27, iM1728M28, iM1728M29, iBinderM1727L2, zM1723H12, zM1723H13);
            case 24:
                int iM1737Y7 = AbstractC0664e.m1737Y(parcel);
                int iM1728M30 = 0;
                int iM1728M31 = 0;
                int iM1728M32 = 0;
                while (parcel.dataPosition() < iM1737Y7) {
                    int i9 = parcel.readInt();
                    char c = (char) i9;
                    if (c == 2) {
                        iM1728M30 = AbstractC0664e.m1728M(parcel, i9);
                    } else if (c == 3) {
                        iM1728M31 = AbstractC0664e.m1728M(parcel, i9);
                    } else if (c != 4) {
                        AbstractC0664e.m1735U(parcel, i9);
                    } else {
                        iM1728M32 = AbstractC0664e.m1728M(parcel, i9);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y7);
                return new C0227b(iM1728M30, iM1728M31, iM1728M32);
            case 25:
                int iM1737Y8 = AbstractC0664e.m1737Y(parcel);
                String strM1754s13 = null;
                String strM1754s14 = null;
                int iM1728M33 = 0;
                while (parcel.dataPosition() < iM1737Y8) {
                    int i10 = parcel.readInt();
                    char c2 = (char) i10;
                    if (c2 == 2) {
                        strM1754s13 = AbstractC0664e.m1754s(parcel, i10);
                    } else if (c2 == 3) {
                        iM1728M33 = AbstractC0664e.m1728M(parcel, i10);
                    } else if (c2 != 4) {
                        AbstractC0664e.m1735U(parcel, i10);
                    } else {
                        strM1754s14 = AbstractC0664e.m1754s(parcel, i10);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y8);
                return new C0229d(strM1754s13, strM1754s14, iM1728M33);
            case 26:
                return new C0253a(parcel);
            case 27:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, C0254b.class.getClassLoader());
                return new C0255c(arrayList);
            case 28:
                return new C0254b(parcel.readInt(), parcel.readLong(), parcel.readLong());
            default:
                return new C0256d(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f127a) {
            case 0:
                return new C0102b[i3];
            case 1:
                return new GoogleSignInAccount[i3];
            case 2:
                return new C0105a[i3];
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C0116a[i3];
            case 4:
                return new C0117b[i3];
            case 5:
                return new C0163l[i3];
            case 6:
                return new C0173b[i3];
            case 7:
                return new C0174c[i3];
            case 8:
                return new C0179E[i3];
            case 9:
                return new C0180F[i3];
            case 10:
                return new C0186c[i3];
            case 11:
                return new C0211a[i3];
            case 12:
                return new C0212b[i3];
            case 13:
                return new C0213c[i3];
            case 14:
                return new C0214d[i3];
            case 15:
                return new C0215e[i3];
            case 16:
                return new C0216f[i3];
            case 17:
                return new C0221k[i3];
            case 18:
                return new C0222l[i3];
            case 19:
                return new C0223m[i3];
            case 20:
                return new C0224n[i3];
            case 21:
                return new C0225o[i3];
            case 22:
                return new C0226a[i3];
            case 23:
                return new C0231f[i3];
            case 24:
                return new C0227b[i3];
            case 25:
                return new C0229d[i3];
            case 26:
                return new C0253a[i3];
            case 27:
                return new C0255c[i3];
            case 28:
                return new C0254b[i3];
            default:
                return new C0256d[i3];
        }
    }
}
