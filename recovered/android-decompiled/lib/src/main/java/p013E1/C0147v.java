package p013E1;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.ArrayList;
import p028J1.AbstractC0295a;
import p028J1.C0320z;
import p043O1.C0448a;
import p066W1.AbstractC0664e;

/* JADX INFO: renamed from: E1.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0147v implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f346a;

    public /* synthetic */ C0147v(int i3) {
        this.f346a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f346a) {
            case 0:
                int iM1737Y = AbstractC0664e.m1737Y(parcel);
                String strM1754s = null;
                String strM1754s2 = null;
                String strM1754s3 = null;
                String strM1754s4 = null;
                String strM1754s5 = null;
                String strM1754s6 = null;
                String strM1754s7 = null;
                String strM1754s8 = null;
                String strM1754s9 = null;
                C0145t c0145t = null;
                long jM1729N = 0;
                long jM1729N2 = 0;
                while (parcel.dataPosition() < iM1737Y) {
                    int i3 = parcel.readInt();
                    switch ((char) i3) {
                        case 2:
                            strM1754s = AbstractC0664e.m1754s(parcel, i3);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            strM1754s2 = AbstractC0664e.m1754s(parcel, i3);
                            break;
                        case 4:
                            jM1729N = AbstractC0664e.m1729N(parcel, i3);
                            break;
                        case 5:
                            strM1754s3 = AbstractC0664e.m1754s(parcel, i3);
                            break;
                        case 6:
                            strM1754s4 = AbstractC0664e.m1754s(parcel, i3);
                            break;
                        case 7:
                            strM1754s5 = AbstractC0664e.m1754s(parcel, i3);
                            break;
                        case '\b':
                            strM1754s6 = AbstractC0664e.m1754s(parcel, i3);
                            break;
                        case '\t':
                            strM1754s7 = AbstractC0664e.m1754s(parcel, i3);
                            break;
                        case '\n':
                            strM1754s8 = AbstractC0664e.m1754s(parcel, i3);
                            break;
                        case 11:
                            jM1729N2 = AbstractC0664e.m1729N(parcel, i3);
                            break;
                        case '\f':
                            strM1754s9 = AbstractC0664e.m1754s(parcel, i3);
                            break;
                        case '\r':
                            c0145t = (C0145t) AbstractC0664e.m1753r(parcel, i3, C0145t.CREATOR);
                            break;
                        default:
                            AbstractC0664e.m1735U(parcel, i3);
                            break;
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y);
                return new C0126a(strM1754s, strM1754s2, jM1729N, strM1754s3, strM1754s4, strM1754s5, strM1754s6, strM1754s7, strM1754s8, jM1729N2, strM1754s9, c0145t);
            case 1:
                int iM1737Y2 = AbstractC0664e.m1737Y(parcel);
                String strM1754s10 = null;
                String strM1754s11 = null;
                while (parcel.dataPosition() < iM1737Y2) {
                    int i4 = parcel.readInt();
                    char c = (char) i4;
                    if (c == 1) {
                        strM1754s10 = AbstractC0664e.m1754s(parcel, i4);
                    } else if (c != 2) {
                        AbstractC0664e.m1735U(parcel, i4);
                    } else {
                        strM1754s11 = AbstractC0664e.m1754s(parcel, i4);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y2);
                return new C0133h(strM1754s10, strM1754s11);
            case 2:
                int iM1737Y3 = AbstractC0664e.m1737Y(parcel);
                float f = 0.0f;
                float f3 = 0.0f;
                float f4 = 0.0f;
                while (parcel.dataPosition() < iM1737Y3) {
                    int i5 = parcel.readInt();
                    char c2 = (char) i5;
                    if (c2 == 2) {
                        AbstractC0664e.m1746e0(parcel, i5, 4);
                        f = parcel.readFloat();
                    } else if (c2 == 3) {
                        AbstractC0664e.m1746e0(parcel, i5, 4);
                        f3 = parcel.readFloat();
                    } else if (c2 != 4) {
                        AbstractC0664e.m1735U(parcel, i5);
                    } else {
                        AbstractC0664e.m1746e0(parcel, i5, 4);
                        f4 = parcel.readFloat();
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y3);
                return new C0148w(f, f3, f4);
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                int iM1737Y4 = AbstractC0664e.m1737Y(parcel);
                C0148w c0148w = null;
                C0148w c0148w2 = null;
                while (parcel.dataPosition() < iM1737Y4) {
                    int i6 = parcel.readInt();
                    char c3 = (char) i6;
                    if (c3 == 2) {
                        c0148w = (C0148w) AbstractC0664e.m1753r(parcel, i6, C0148w.CREATOR);
                    } else if (c3 != 3) {
                        AbstractC0664e.m1735U(parcel, i6);
                    } else {
                        c0148w2 = (C0148w) AbstractC0664e.m1753r(parcel, i6, C0148w.CREATOR);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y4);
                return new C0149x(c0148w, c0148w2);
            case 4:
                int iM1737Y5 = AbstractC0664e.m1737Y(parcel);
                String strM1754s12 = null;
                String[] strArr = null;
                long jM1729N3 = 0;
                long jM1729N4 = 0;
                boolean zM1723H = false;
                boolean zM1723H2 = false;
                boolean zM1723H3 = false;
                while (parcel.dataPosition() < iM1737Y5) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 2:
                            jM1729N3 = AbstractC0664e.m1729N(parcel, i7);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            strM1754s12 = AbstractC0664e.m1754s(parcel, i7);
                            break;
                        case 4:
                            jM1729N4 = AbstractC0664e.m1729N(parcel, i7);
                            break;
                        case 5:
                            zM1723H = AbstractC0664e.m1723H(parcel, i7);
                            break;
                        case 6:
                            int iM1730O = AbstractC0664e.m1730O(parcel, i7);
                            int iDataPosition = parcel.dataPosition();
                            if (iM1730O != 0) {
                                String[] strArrCreateStringArray = parcel.createStringArray();
                                parcel.setDataPosition(iDataPosition + iM1730O);
                                strArr = strArrCreateStringArray;
                            } else {
                                strArr = null;
                            }
                            break;
                        case 7:
                            zM1723H2 = AbstractC0664e.m1723H(parcel, i7);
                            break;
                        case '\b':
                            zM1723H3 = AbstractC0664e.m1723H(parcel, i7);
                            break;
                        default:
                            AbstractC0664e.m1735U(parcel, i7);
                            break;
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y5);
                return new C0127b(jM1729N3, strM1754s12, jM1729N4, zM1723H, strArr, zM1723H2, zM1723H3);
            case 5:
                int iM1737Y6 = AbstractC0664e.m1737Y(parcel);
                String strM1754s13 = null;
                C0133h c0133h = null;
                boolean zM1723H4 = false;
                boolean zM1723H5 = false;
                while (parcel.dataPosition() < iM1737Y6) {
                    int i8 = parcel.readInt();
                    char c4 = (char) i8;
                    if (c4 == 2) {
                        zM1723H4 = AbstractC0664e.m1723H(parcel, i8);
                    } else if (c4 == 3) {
                        strM1754s13 = AbstractC0664e.m1754s(parcel, i8);
                    } else if (c4 == 4) {
                        zM1723H5 = AbstractC0664e.m1723H(parcel, i8);
                    } else if (c4 != 5) {
                        AbstractC0664e.m1735U(parcel, i8);
                    } else {
                        c0133h = (C0133h) AbstractC0664e.m1753r(parcel, i8, C0133h.CREATOR);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y6);
                return new C0134i(zM1723H4, strM1754s13, zM1723H5, c0133h);
            case 6:
                int iM1737Y7 = AbstractC0664e.m1737Y(parcel);
                String strM1754s14 = null;
                Integer numValueOf = null;
                String strM1754s15 = null;
                long jM1729N5 = 0;
                String strM1754s16 = null;
                while (parcel.dataPosition() < iM1737Y7) {
                    int i9 = parcel.readInt();
                    char c5 = (char) i9;
                    if (c5 == 2) {
                        strM1754s14 = AbstractC0664e.m1754s(parcel, i9);
                    } else if (c5 == 3) {
                        jM1729N5 = AbstractC0664e.m1729N(parcel, i9);
                    } else if (c5 == 4) {
                        int iM1730O2 = AbstractC0664e.m1730O(parcel, i9);
                        if (iM1730O2 == 0) {
                            numValueOf = null;
                        } else {
                            AbstractC0664e.m1742b0(parcel, iM1730O2);
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    } else if (c5 == 5) {
                        strM1754s15 = AbstractC0664e.m1754s(parcel, i9);
                    } else if (c5 != 6) {
                        AbstractC0664e.m1735U(parcel, i9);
                    } else {
                        strM1754s16 = AbstractC0664e.m1754s(parcel, i9);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y7);
                return new MediaError(strM1754s14, jM1729N5, numValueOf, strM1754s15, AbstractC0295a.m824a(strM1754s16));
            case 7:
                int iM1737Y8 = AbstractC0664e.m1737Y(parcel);
                String strM1754s17 = null;
                String strM1754s18 = null;
                C0137l c0137l = null;
                ArrayList arrayListM1757v = null;
                C0144s c0144s = null;
                String strM1754s19 = null;
                ArrayList arrayListM1757v2 = null;
                ArrayList arrayListM1757v3 = null;
                String strM1754s20 = null;
                C0145t c0145t2 = null;
                String strM1754s21 = null;
                String strM1754s22 = null;
                String strM1754s23 = null;
                String strM1754s24 = null;
                long jM1729N6 = 0;
                long jM1729N7 = 0;
                int iM1728M = 0;
                while (parcel.dataPosition() < iM1737Y8) {
                    int i10 = parcel.readInt();
                    switch ((char) i10) {
                        case 2:
                            strM1754s17 = AbstractC0664e.m1754s(parcel, i10);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            iM1728M = AbstractC0664e.m1728M(parcel, i10);
                            break;
                        case 4:
                            strM1754s18 = AbstractC0664e.m1754s(parcel, i10);
                            break;
                        case 5:
                            c0137l = (C0137l) AbstractC0664e.m1753r(parcel, i10, C0137l.CREATOR);
                            break;
                        case 6:
                            jM1729N6 = AbstractC0664e.m1729N(parcel, i10);
                            break;
                        case 7:
                            arrayListM1757v = AbstractC0664e.m1757v(parcel, i10, MediaTrack.CREATOR);
                            break;
                        case '\b':
                            c0144s = (C0144s) AbstractC0664e.m1753r(parcel, i10, C0144s.CREATOR);
                            break;
                        case '\t':
                            strM1754s19 = AbstractC0664e.m1754s(parcel, i10);
                            break;
                        case '\n':
                            arrayListM1757v2 = AbstractC0664e.m1757v(parcel, i10, C0127b.CREATOR);
                            break;
                        case 11:
                            arrayListM1757v3 = AbstractC0664e.m1757v(parcel, i10, C0126a.CREATOR);
                            break;
                        case '\f':
                            strM1754s20 = AbstractC0664e.m1754s(parcel, i10);
                            break;
                        case '\r':
                            c0145t2 = (C0145t) AbstractC0664e.m1753r(parcel, i10, C0145t.CREATOR);
                            break;
                        case 14:
                            jM1729N7 = AbstractC0664e.m1729N(parcel, i10);
                            break;
                        case 15:
                            strM1754s21 = AbstractC0664e.m1754s(parcel, i10);
                            break;
                        case 16:
                            strM1754s22 = AbstractC0664e.m1754s(parcel, i10);
                            break;
                        case 17:
                            strM1754s23 = AbstractC0664e.m1754s(parcel, i10);
                            break;
                        case 18:
                            strM1754s24 = AbstractC0664e.m1754s(parcel, i10);
                            break;
                        default:
                            AbstractC0664e.m1735U(parcel, i10);
                            break;
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y8);
                return new MediaInfo(strM1754s17, iM1728M, strM1754s18, c0137l, jM1729N6, arrayListM1757v, c0144s, strM1754s19, arrayListM1757v2, arrayListM1757v3, strM1754s20, c0145t2, jM1729N7, strM1754s21, strM1754s22, strM1754s23, strM1754s24);
            case 8:
                int iM1737Y9 = AbstractC0664e.m1737Y(parcel);
                long jM1729N8 = 0;
                long jM1729N9 = 0;
                boolean zM1723H6 = false;
                boolean zM1723H7 = false;
                while (parcel.dataPosition() < iM1737Y9) {
                    int i11 = parcel.readInt();
                    char c6 = (char) i11;
                    if (c6 == 2) {
                        jM1729N8 = AbstractC0664e.m1729N(parcel, i11);
                    } else if (c6 == 3) {
                        jM1729N9 = AbstractC0664e.m1729N(parcel, i11);
                    } else if (c6 == 4) {
                        zM1723H6 = AbstractC0664e.m1723H(parcel, i11);
                    } else if (c6 != 5) {
                        AbstractC0664e.m1735U(parcel, i11);
                    } else {
                        zM1723H7 = AbstractC0664e.m1723H(parcel, i11);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y9);
                return new C0135j(jM1729N8, jM1729N9, zM1723H6, zM1723H7);
            case 9:
                int iM1737Y10 = AbstractC0664e.m1737Y(parcel);
                long jM1729N10 = 0;
                long jM1729N11 = 0;
                long jM1729N12 = 0;
                String strM1754s25 = null;
                String strM1754s26 = null;
                while (parcel.dataPosition() < iM1737Y10) {
                    int i12 = parcel.readInt();
                    char c7 = (char) i12;
                    if (c7 == 2) {
                        jM1729N10 = AbstractC0664e.m1729N(parcel, i12);
                    } else if (c7 == 3) {
                        jM1729N11 = AbstractC0664e.m1729N(parcel, i12);
                    } else if (c7 == 4) {
                        strM1754s25 = AbstractC0664e.m1754s(parcel, i12);
                    } else if (c7 == 5) {
                        strM1754s26 = AbstractC0664e.m1754s(parcel, i12);
                    } else if (c7 != 6) {
                        AbstractC0664e.m1735U(parcel, i12);
                    } else {
                        jM1729N12 = AbstractC0664e.m1729N(parcel, i12);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y10);
                return new C0128c(jM1729N10, jM1729N11, strM1754s25, strM1754s26, jM1729N12);
            case 10:
                int iM1737Y11 = AbstractC0664e.m1737Y(parcel);
                String strM1754s27 = null;
                long jM1729N13 = 0;
                long jM1729N14 = 0;
                MediaInfo mediaInfo = null;
                C0139n c0139n = null;
                Boolean boolM1724I = null;
                long[] jArrM1752q = null;
                String strM1754s28 = null;
                String strM1754s29 = null;
                String strM1754s30 = null;
                String strM1754s31 = null;
                double dM1725J = 0.0d;
                while (parcel.dataPosition() < iM1737Y11) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 2:
                            mediaInfo = (MediaInfo) AbstractC0664e.m1753r(parcel, i13, MediaInfo.CREATOR);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            c0139n = (C0139n) AbstractC0664e.m1753r(parcel, i13, C0139n.CREATOR);
                            break;
                        case 4:
                            boolM1724I = AbstractC0664e.m1724I(parcel, i13);
                            break;
                        case 5:
                            jM1729N13 = AbstractC0664e.m1729N(parcel, i13);
                            break;
                        case 6:
                            dM1725J = AbstractC0664e.m1725J(parcel, i13);
                            break;
                        case 7:
                            jArrM1752q = AbstractC0664e.m1752q(parcel, i13);
                            break;
                        case '\b':
                            strM1754s27 = AbstractC0664e.m1754s(parcel, i13);
                            break;
                        case '\t':
                            strM1754s28 = AbstractC0664e.m1754s(parcel, i13);
                            break;
                        case '\n':
                            strM1754s29 = AbstractC0664e.m1754s(parcel, i13);
                            break;
                        case 11:
                            strM1754s30 = AbstractC0664e.m1754s(parcel, i13);
                            break;
                        case '\f':
                            strM1754s31 = AbstractC0664e.m1754s(parcel, i13);
                            break;
                        case '\r':
                            jM1729N14 = AbstractC0664e.m1729N(parcel, i13);
                            break;
                        default:
                            AbstractC0664e.m1735U(parcel, i13);
                            break;
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y11);
                return new C0136k(mediaInfo, c0139n, boolM1724I, jM1729N13, dM1725J, jArrM1752q, AbstractC0295a.m824a(strM1754s27), strM1754s28, strM1754s29, strM1754s30, strM1754s31, jM1729N14);
            case 11:
                int iM1737Y12 = AbstractC0664e.m1737Y(parcel);
                int iM1728M2 = 0;
                ArrayList arrayListM1757v4 = null;
                Bundle bundleM1750k = null;
                while (parcel.dataPosition() < iM1737Y12) {
                    int i14 = parcel.readInt();
                    char c8 = (char) i14;
                    if (c8 == 2) {
                        arrayListM1757v4 = AbstractC0664e.m1757v(parcel, i14, C0448a.CREATOR);
                    } else if (c8 == 3) {
                        bundleM1750k = AbstractC0664e.m1750k(parcel, i14);
                    } else if (c8 != 4) {
                        AbstractC0664e.m1735U(parcel, i14);
                    } else {
                        iM1728M2 = AbstractC0664e.m1728M(parcel, i14);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y12);
                return new C0137l(arrayListM1757v4, bundleM1750k, iM1728M2);
            case 12:
                int iM1737Y13 = AbstractC0664e.m1737Y(parcel);
                double dM1725J2 = 0.0d;
                String strM1754s32 = null;
                ArrayList arrayListM1757v5 = null;
                ArrayList arrayListM1757v6 = null;
                int iM1728M3 = 0;
                while (parcel.dataPosition() < iM1737Y13) {
                    int i15 = parcel.readInt();
                    char c9 = (char) i15;
                    if (c9 == 2) {
                        iM1728M3 = AbstractC0664e.m1728M(parcel, i15);
                    } else if (c9 == 3) {
                        strM1754s32 = AbstractC0664e.m1754s(parcel, i15);
                    } else if (c9 == 4) {
                        arrayListM1757v5 = AbstractC0664e.m1757v(parcel, i15, C0137l.CREATOR);
                    } else if (c9 == 5) {
                        arrayListM1757v6 = AbstractC0664e.m1757v(parcel, i15, C0448a.CREATOR);
                    } else if (c9 != 6) {
                        AbstractC0664e.m1735U(parcel, i15);
                    } else {
                        dM1725J2 = AbstractC0664e.m1725J(parcel, i15);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y13);
                C0138m c0138m = new C0138m();
                c0138m.f275g = iM1728M3;
                c0138m.f276h = strM1754s32;
                c0138m.f277i = arrayListM1757v5;
                c0138m.f278j = arrayListM1757v6;
                c0138m.f279k = dM1725J2;
                return c0138m;
            case 13:
                int iM1737Y14 = AbstractC0664e.m1737Y(parcel);
                int iM1728M4 = 0;
                long jM1729N15 = 0;
                String strM1754s33 = null;
                String strM1754s34 = null;
                String strM1754s35 = null;
                C0138m c0138m2 = null;
                ArrayList arrayListM1757v7 = null;
                int iM1728M5 = 0;
                int iM1728M6 = 0;
                boolean zM1723H8 = false;
                while (parcel.dataPosition() < iM1737Y14) {
                    int i16 = parcel.readInt();
                    switch ((char) i16) {
                        case 2:
                            strM1754s33 = AbstractC0664e.m1754s(parcel, i16);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            strM1754s34 = AbstractC0664e.m1754s(parcel, i16);
                            break;
                        case 4:
                            iM1728M4 = AbstractC0664e.m1728M(parcel, i16);
                            break;
                        case 5:
                            strM1754s35 = AbstractC0664e.m1754s(parcel, i16);
                            break;
                        case 6:
                            c0138m2 = (C0138m) AbstractC0664e.m1753r(parcel, i16, C0138m.CREATOR);
                            break;
                        case 7:
                            iM1728M5 = AbstractC0664e.m1728M(parcel, i16);
                            break;
                        case '\b':
                            arrayListM1757v7 = AbstractC0664e.m1757v(parcel, i16, C0140o.CREATOR);
                            break;
                        case '\t':
                            iM1728M6 = AbstractC0664e.m1728M(parcel, i16);
                            break;
                        case '\n':
                            jM1729N15 = AbstractC0664e.m1729N(parcel, i16);
                            break;
                        case 11:
                            zM1723H8 = AbstractC0664e.m1723H(parcel, i16);
                            break;
                        default:
                            AbstractC0664e.m1735U(parcel, i16);
                            break;
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y14);
                C0139n c0139n2 = new C0139n();
                c0139n2.f280g = strM1754s33;
                c0139n2.f281h = strM1754s34;
                c0139n2.f282i = iM1728M4;
                c0139n2.f283j = strM1754s35;
                c0139n2.f284k = c0138m2;
                c0139n2.f285l = iM1728M5;
                c0139n2.f286m = arrayListM1757v7;
                c0139n2.f287n = iM1728M6;
                c0139n2.f288o = jM1729N15;
                c0139n2.f289p = zM1723H8;
                return c0139n2;
            case 14:
                int iM1737Y15 = AbstractC0664e.m1737Y(parcel);
                MediaInfo mediaInfo2 = null;
                long[] jArrM1752q2 = null;
                String strM1754s36 = null;
                double dM1725J3 = 0.0d;
                double dM1725J4 = 0.0d;
                double dM1725J5 = 0.0d;
                int iM1728M7 = 0;
                boolean zM1723H9 = false;
                while (parcel.dataPosition() < iM1737Y15) {
                    int i17 = parcel.readInt();
                    switch ((char) i17) {
                        case 2:
                            mediaInfo2 = (MediaInfo) AbstractC0664e.m1753r(parcel, i17, MediaInfo.CREATOR);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            iM1728M7 = AbstractC0664e.m1728M(parcel, i17);
                            break;
                        case 4:
                            zM1723H9 = AbstractC0664e.m1723H(parcel, i17);
                            break;
                        case 5:
                            dM1725J3 = AbstractC0664e.m1725J(parcel, i17);
                            break;
                        case 6:
                            dM1725J4 = AbstractC0664e.m1725J(parcel, i17);
                            break;
                        case 7:
                            dM1725J5 = AbstractC0664e.m1725J(parcel, i17);
                            break;
                        case '\b':
                            jArrM1752q2 = AbstractC0664e.m1752q(parcel, i17);
                            break;
                        case '\t':
                            strM1754s36 = AbstractC0664e.m1754s(parcel, i17);
                            break;
                        default:
                            AbstractC0664e.m1735U(parcel, i17);
                            break;
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y15);
                return new C0140o(mediaInfo2, iM1728M7, zM1723H9, dM1725J3, dM1725J4, dM1725J5, jArrM1752q2, strM1754s36);
            case 15:
                int iM1737Y16 = AbstractC0664e.m1737Y(parcel);
                MediaInfo mediaInfo3 = null;
                long[] jArrM1752q3 = null;
                String strM1754s37 = null;
                ArrayList arrayListM1757v8 = null;
                C0128c c0128c = null;
                C0146u c0146u = null;
                C0135j c0135j = null;
                C0139n c0139n3 = null;
                double dM1725J6 = 0.0d;
                double dM1725J7 = 0.0d;
                long jM1729N16 = 0;
                long jM1729N17 = 0;
                long jM1729N18 = 0;
                int iM1728M8 = 0;
                int iM1728M9 = 0;
                int iM1728M10 = 0;
                boolean zM1723H10 = false;
                int iM1728M11 = 0;
                int iM1728M12 = 0;
                int iM1728M13 = 0;
                boolean zM1723H11 = false;
                while (parcel.dataPosition() < iM1737Y16) {
                    int i18 = parcel.readInt();
                    switch ((char) i18) {
                        case 2:
                            mediaInfo3 = (MediaInfo) AbstractC0664e.m1753r(parcel, i18, MediaInfo.CREATOR);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            jM1729N16 = AbstractC0664e.m1729N(parcel, i18);
                            break;
                        case 4:
                            iM1728M8 = AbstractC0664e.m1728M(parcel, i18);
                            break;
                        case 5:
                            dM1725J6 = AbstractC0664e.m1725J(parcel, i18);
                            break;
                        case 6:
                            iM1728M9 = AbstractC0664e.m1728M(parcel, i18);
                            break;
                        case 7:
                            iM1728M10 = AbstractC0664e.m1728M(parcel, i18);
                            break;
                        case '\b':
                            jM1729N17 = AbstractC0664e.m1729N(parcel, i18);
                            break;
                        case '\t':
                            jM1729N18 = AbstractC0664e.m1729N(parcel, i18);
                            break;
                        case '\n':
                            dM1725J7 = AbstractC0664e.m1725J(parcel, i18);
                            break;
                        case 11:
                            zM1723H10 = AbstractC0664e.m1723H(parcel, i18);
                            break;
                        case '\f':
                            jArrM1752q3 = AbstractC0664e.m1752q(parcel, i18);
                            break;
                        case '\r':
                            iM1728M11 = AbstractC0664e.m1728M(parcel, i18);
                            break;
                        case 14:
                            iM1728M12 = AbstractC0664e.m1728M(parcel, i18);
                            break;
                        case 15:
                            strM1754s37 = AbstractC0664e.m1754s(parcel, i18);
                            break;
                        case 16:
                            iM1728M13 = AbstractC0664e.m1728M(parcel, i18);
                            break;
                        case 17:
                            arrayListM1757v8 = AbstractC0664e.m1757v(parcel, i18, C0140o.CREATOR);
                            break;
                        case 18:
                            zM1723H11 = AbstractC0664e.m1723H(parcel, i18);
                            break;
                        case 19:
                            c0128c = (C0128c) AbstractC0664e.m1753r(parcel, i18, C0128c.CREATOR);
                            break;
                        case 20:
                            c0146u = (C0146u) AbstractC0664e.m1753r(parcel, i18, C0146u.CREATOR);
                            break;
                        case 21:
                            c0135j = (C0135j) AbstractC0664e.m1753r(parcel, i18, C0135j.CREATOR);
                            break;
                        case 22:
                            c0139n3 = (C0139n) AbstractC0664e.m1753r(parcel, i18, C0139n.CREATOR);
                            break;
                        default:
                            AbstractC0664e.m1735U(parcel, i18);
                            break;
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y16);
                return new C0142q(mediaInfo3, jM1729N16, iM1728M8, dM1725J6, iM1728M9, iM1728M10, jM1729N17, jM1729N18, dM1725J7, zM1723H10, jArrM1752q3, iM1728M11, iM1728M12, strM1754s37, iM1728M13, arrayListM1757v8, zM1723H11, c0128c, c0146u, c0135j, c0139n3);
            case 16:
                int iM1737Y17 = AbstractC0664e.m1737Y(parcel);
                String strM1754s38 = null;
                String strM1754s39 = null;
                String strM1754s40 = null;
                String strM1754s41 = null;
                String strM1754s42 = null;
                ArrayList arrayListM1755t = null;
                long jM1729N19 = 0;
                int iM1728M14 = 0;
                int iM1728M15 = 0;
                while (parcel.dataPosition() < iM1737Y17) {
                    int i19 = parcel.readInt();
                    switch ((char) i19) {
                        case 2:
                            jM1729N19 = AbstractC0664e.m1729N(parcel, i19);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            iM1728M14 = AbstractC0664e.m1728M(parcel, i19);
                            break;
                        case 4:
                            strM1754s39 = AbstractC0664e.m1754s(parcel, i19);
                            break;
                        case 5:
                            strM1754s40 = AbstractC0664e.m1754s(parcel, i19);
                            break;
                        case 6:
                            strM1754s41 = AbstractC0664e.m1754s(parcel, i19);
                            break;
                        case 7:
                            strM1754s42 = AbstractC0664e.m1754s(parcel, i19);
                            break;
                        case '\b':
                            iM1728M15 = AbstractC0664e.m1728M(parcel, i19);
                            break;
                        case '\t':
                            arrayListM1755t = AbstractC0664e.m1755t(parcel, i19);
                            break;
                        case '\n':
                            strM1754s38 = AbstractC0664e.m1754s(parcel, i19);
                            break;
                        default:
                            AbstractC0664e.m1735U(parcel, i19);
                            break;
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y17);
                return new MediaTrack(jM1729N19, iM1728M14, strM1754s39, strM1754s40, strM1754s41, strM1754s42, iM1728M15, arrayListM1755t, AbstractC0295a.m824a(strM1754s38));
            case 17:
                int iM1737Y18 = AbstractC0664e.m1737Y(parcel);
                String strM1754s43 = null;
                String strM1754s44 = null;
                ArrayList arrayListM1755t2 = null;
                String strM1754s45 = null;
                Uri uri = null;
                String strM1754s46 = null;
                String strM1754s47 = null;
                Boolean boolM1724I2 = null;
                Boolean boolM1724I3 = null;
                while (parcel.dataPosition() < iM1737Y18) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 2:
                            strM1754s43 = AbstractC0664e.m1754s(parcel, i20);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            strM1754s44 = AbstractC0664e.m1754s(parcel, i20);
                            break;
                        case 4:
                            AbstractC0664e.m1757v(parcel, i20, C0448a.CREATOR);
                            break;
                        case 5:
                            arrayListM1755t2 = AbstractC0664e.m1755t(parcel, i20);
                            break;
                        case 6:
                            strM1754s45 = AbstractC0664e.m1754s(parcel, i20);
                            break;
                        case 7:
                            uri = (Uri) AbstractC0664e.m1753r(parcel, i20, Uri.CREATOR);
                            break;
                        case '\b':
                            strM1754s46 = AbstractC0664e.m1754s(parcel, i20);
                            break;
                        case '\t':
                            strM1754s47 = AbstractC0664e.m1754s(parcel, i20);
                            break;
                        case '\n':
                            boolM1724I2 = AbstractC0664e.m1724I(parcel, i20);
                            break;
                        case 11:
                            boolM1724I3 = AbstractC0664e.m1724I(parcel, i20);
                            break;
                        default:
                            AbstractC0664e.m1735U(parcel, i20);
                            break;
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y18);
                return new C0129d(strM1754s43, strM1754s44, arrayListM1755t2, strM1754s45, uri, strM1754s46, strM1754s47, boolM1724I2, boolM1724I3);
            case 18:
                int iM1737Y19 = AbstractC0664e.m1737Y(parcel);
                C0136k c0136k = null;
                String strM1754s48 = null;
                while (parcel.dataPosition() < iM1737Y19) {
                    int i21 = parcel.readInt();
                    char c10 = (char) i21;
                    if (c10 == 2) {
                        c0136k = (C0136k) AbstractC0664e.m1753r(parcel, i21, C0136k.CREATOR);
                    } else if (c10 != 3) {
                        AbstractC0664e.m1735U(parcel, i21);
                    } else {
                        strM1754s48 = AbstractC0664e.m1754s(parcel, i21);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y19);
                return new C0143r(c0136k, AbstractC0295a.m824a(strM1754s48));
            case 19:
                int iM1737Y20 = AbstractC0664e.m1737Y(parcel);
                String strM1754s49 = null;
                String strM1754s50 = null;
                float f5 = 0.0f;
                int iM1728M16 = 0;
                int iM1728M17 = 0;
                int iM1728M18 = 0;
                int iM1728M19 = 0;
                int iM1728M20 = 0;
                int iM1728M21 = 0;
                int iM1728M22 = 0;
                int iM1728M23 = 0;
                int iM1728M24 = 0;
                while (parcel.dataPosition() < iM1737Y20) {
                    int i22 = parcel.readInt();
                    switch ((char) i22) {
                        case 2:
                            AbstractC0664e.m1746e0(parcel, i22, 4);
                            f5 = parcel.readFloat();
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            iM1728M16 = AbstractC0664e.m1728M(parcel, i22);
                            break;
                        case 4:
                            iM1728M17 = AbstractC0664e.m1728M(parcel, i22);
                            break;
                        case 5:
                            iM1728M18 = AbstractC0664e.m1728M(parcel, i22);
                            break;
                        case 6:
                            iM1728M19 = AbstractC0664e.m1728M(parcel, i22);
                            break;
                        case 7:
                            iM1728M20 = AbstractC0664e.m1728M(parcel, i22);
                            break;
                        case '\b':
                            iM1728M21 = AbstractC0664e.m1728M(parcel, i22);
                            break;
                        case '\t':
                            iM1728M22 = AbstractC0664e.m1728M(parcel, i22);
                            break;
                        case '\n':
                            strM1754s49 = AbstractC0664e.m1754s(parcel, i22);
                            break;
                        case 11:
                            iM1728M23 = AbstractC0664e.m1728M(parcel, i22);
                            break;
                        case '\f':
                            iM1728M24 = AbstractC0664e.m1728M(parcel, i22);
                            break;
                        case '\r':
                            strM1754s50 = AbstractC0664e.m1754s(parcel, i22);
                            break;
                        default:
                            AbstractC0664e.m1735U(parcel, i22);
                            break;
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y20);
                return new C0144s(f5, iM1728M16, iM1728M17, iM1728M18, iM1728M19, iM1728M20, iM1728M21, iM1728M22, strM1754s49, iM1728M23, iM1728M24, strM1754s50);
            case 20:
                int iM1737Y21 = AbstractC0664e.m1737Y(parcel);
                String strM1754s51 = null;
                String strM1754s52 = null;
                while (parcel.dataPosition() < iM1737Y21) {
                    int i23 = parcel.readInt();
                    char c11 = (char) i23;
                    if (c11 == 2) {
                        strM1754s51 = AbstractC0664e.m1754s(parcel, i23);
                    } else if (c11 != 3) {
                        AbstractC0664e.m1735U(parcel, i23);
                    } else {
                        strM1754s52 = AbstractC0664e.m1754s(parcel, i23);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y21);
                return new C0145t(strM1754s51, strM1754s52);
            case 21:
                int iM1737Y22 = AbstractC0664e.m1737Y(parcel);
                int iM1728M25 = 0;
                int iM1728M26 = 0;
                int iM1728M27 = 0;
                while (parcel.dataPosition() < iM1737Y22) {
                    int i24 = parcel.readInt();
                    char c12 = (char) i24;
                    if (c12 == 2) {
                        iM1728M25 = AbstractC0664e.m1728M(parcel, i24);
                    } else if (c12 == 3) {
                        iM1728M26 = AbstractC0664e.m1728M(parcel, i24);
                    } else if (c12 != 4) {
                        AbstractC0664e.m1735U(parcel, i24);
                    } else {
                        iM1728M27 = AbstractC0664e.m1728M(parcel, i24);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y22);
                return new C0146u(iM1728M25, iM1728M26, iM1728M27);
            default:
                int iM1737Y23 = AbstractC0664e.m1737Y(parcel);
                String strM1754s53 = null;
                String strM1754s54 = null;
                String strM1754s55 = null;
                String strM1754s56 = null;
                String strM1754s57 = null;
                ArrayList arrayListM1757v9 = null;
                String strM1754s58 = null;
                String strM1754s59 = null;
                String strM1754s60 = null;
                byte[] bArr = null;
                String strM1754s61 = null;
                C0320z c0320z = null;
                Integer numValueOf2 = null;
                int iM1728M28 = 0;
                int iM1728M29 = 0;
                int iM1728M30 = -1;
                int iM1728M31 = 0;
                boolean zM1723H12 = false;
                while (parcel.dataPosition() < iM1737Y23) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 2:
                            strM1754s53 = AbstractC0664e.m1754s(parcel, i25);
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 3 */:
                            strM1754s54 = AbstractC0664e.m1754s(parcel, i25);
                            break;
                        case 4:
                            strM1754s55 = AbstractC0664e.m1754s(parcel, i25);
                            break;
                        case 5:
                            strM1754s56 = AbstractC0664e.m1754s(parcel, i25);
                            break;
                        case 6:
                            strM1754s57 = AbstractC0664e.m1754s(parcel, i25);
                            break;
                        case 7:
                            iM1728M28 = AbstractC0664e.m1728M(parcel, i25);
                            break;
                        case '\b':
                            arrayListM1757v9 = AbstractC0664e.m1757v(parcel, i25, C0448a.CREATOR);
                            break;
                        case '\t':
                            iM1728M29 = AbstractC0664e.m1728M(parcel, i25);
                            break;
                        case '\n':
                            iM1728M30 = AbstractC0664e.m1728M(parcel, i25);
                            break;
                        case 11:
                            strM1754s58 = AbstractC0664e.m1754s(parcel, i25);
                            break;
                        case '\f':
                            strM1754s59 = AbstractC0664e.m1754s(parcel, i25);
                            break;
                        case '\r':
                            iM1728M31 = AbstractC0664e.m1728M(parcel, i25);
                            break;
                        case 14:
                            strM1754s60 = AbstractC0664e.m1754s(parcel, i25);
                            break;
                        case 15:
                            int iM1730O3 = AbstractC0664e.m1730O(parcel, i25);
                            int iDataPosition2 = parcel.dataPosition();
                            if (iM1730O3 != 0) {
                                byte[] bArrCreateByteArray = parcel.createByteArray();
                                parcel.setDataPosition(iDataPosition2 + iM1730O3);
                                bArr = bArrCreateByteArray;
                            } else {
                                bArr = null;
                            }
                            break;
                        case 16:
                            strM1754s61 = AbstractC0664e.m1754s(parcel, i25);
                            break;
                        case 17:
                            zM1723H12 = AbstractC0664e.m1723H(parcel, i25);
                            break;
                        case 18:
                            c0320z = (C0320z) AbstractC0664e.m1753r(parcel, i25, C0320z.CREATOR);
                            break;
                        case 19:
                            int iM1730O4 = AbstractC0664e.m1730O(parcel, i25);
                            if (iM1730O4 != 0) {
                                AbstractC0664e.m1742b0(parcel, iM1730O4);
                                numValueOf2 = Integer.valueOf(parcel.readInt());
                            } else {
                                numValueOf2 = null;
                            }
                            break;
                        default:
                            AbstractC0664e.m1735U(parcel, i25);
                            break;
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y23);
                return new CastDevice(strM1754s53, strM1754s54, strM1754s55, strM1754s56, strM1754s57, iM1728M28, arrayListM1757v9, iM1728M29, iM1728M30, strM1754s58, strM1754s59, iM1728M31, strM1754s60, bArr, strM1754s61, zM1723H12, c0320z, numValueOf2);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i3) {
        switch (this.f346a) {
            case 0:
                return new C0126a[i3];
            case 1:
                return new C0133h[i3];
            case 2:
                return new C0148w[i3];
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new C0149x[i3];
            case 4:
                return new C0127b[i3];
            case 5:
                return new C0134i[i3];
            case 6:
                return new MediaError[i3];
            case 7:
                return new MediaInfo[i3];
            case 8:
                return new C0135j[i3];
            case 9:
                return new C0128c[i3];
            case 10:
                return new C0136k[i3];
            case 11:
                return new C0137l[i3];
            case 12:
                return new C0138m[i3];
            case 13:
                return new C0139n[i3];
            case 14:
                return new C0140o[i3];
            case 15:
                return new C0142q[i3];
            case 16:
                return new MediaTrack[i3];
            case 17:
                return new C0129d[i3];
            case 18:
                return new C0143r[i3];
            case 19:
                return new C0144s[i3];
            case 20:
                return new C0145t[i3];
            case 21:
                return new C0146u[i3];
            default:
                return new CastDevice[i3];
        }
    }
}
