package p076a;

import android.content.Intent;
import android.media.MediaDescription;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import androidx.activity.result.C0908a;
import androidx.fragment.app.C0939E;
import androidx.fragment.app.C0942H;
import androidx.fragment.app.C0951b;
import androidx.fragment.app.C0952c;
import androidx.fragment.app.C0975z;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.ArrayList;
import p034L1.C0346a;
import p046P1.C0487o;
import p066W1.AbstractC0664e;
import p076a.C0787c;
import p092e0.C1513r;
import p092e0.C1514s;
import p094e2.C1524b;
import p094e2.C1526d;
import p094e2.C1527e;
import p104h1.C1640Y;
import p104h1.C1641Z;
import p104h1.C1663t;
import p113k.C1820O;

/* JADX INFO: renamed from: a.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0787c implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3197a;

    public /* synthetic */ C0787c(int i3) {
        this.f3197a = i3;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        InterfaceC0786b interfaceC0786b = null;
        C0346a c0346a = null;
        ArrayList arrayListM1755t = null;
        Intent intent = null;
        int iM1728M = 0;
        switch (this.f3197a) {
            case 0:
                C0789e c0789e = new C0789e();
                IBinder strongBinder = parcel.readStrongBinder();
                int i3 = BinderC0788d.f3198c;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC0786b.f3196a);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0786b)) {
                        C0785a c0785a = new C0785a();
                        c0785a.f3195b = strongBinder;
                        interfaceC0786b = c0785a;
                    } else {
                        interfaceC0786b = (InterfaceC0786b) iInterfaceQueryLocalInterface;
                    }
                }
                c0789e.f3200g = interfaceC0786b;
                return c0789e;
            case 1:
                return new Parcelable(parcel) { // from class: android.support.v4.media.MediaBrowserCompat$MediaItem
                    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new C0787c(1);

                    /* JADX INFO: renamed from: g */
                    public final int f3616g;

                    /* JADX INFO: renamed from: h */
                    public final MediaDescriptionCompat f3617h;

                    {
                        this.f3616g = parcel.readInt();
                        this.f3617h = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaItem{mFlags=" + this.f3616g + ", mDescription=" + this.f3617h + '}';
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i4) {
                        parcel2.writeInt(this.f3616g);
                        this.f3617h.writeToParcel(parcel2, i4);
                    }
                };
            case 2:
                return MediaDescriptionCompat.m2117d(MediaDescription.CREATOR.createFromParcel(parcel));
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new MediaMetadataCompat(parcel);
            case 4:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 5:
                return new C0908a(parcel);
            case 6:
                return new C0951b(parcel);
            case 7:
                return new C0952c(parcel);
            case 8:
                C0975z c0975z = new C0975z();
                c0975z.f4271g = parcel.readString();
                c0975z.f4272h = parcel.readInt();
                return c0975z;
            case 9:
                C0939E c0939e = new C0939E();
                c0939e.f4094k = null;
                c0939e.f4095l = new ArrayList();
                c0939e.f4096m = new ArrayList();
                c0939e.f4090g = parcel.createStringArrayList();
                c0939e.f4091h = parcel.createStringArrayList();
                c0939e.f4092i = (C0951b[]) parcel.createTypedArray(C0951b.CREATOR);
                c0939e.f4093j = parcel.readInt();
                c0939e.f4094k = parcel.readString();
                c0939e.f4095l = parcel.createStringArrayList();
                c0939e.f4096m = parcel.createTypedArrayList(C0952c.CREATOR);
                c0939e.f4097n = parcel.createTypedArrayList(C0975z.CREATOR);
                return c0939e;
            case 10:
                return new C0942H(parcel);
            case 11:
                return new C1514s(parcel);
            case 12:
                return new C1513r(parcel);
            case 13:
                int iM1737Y = AbstractC0664e.m1737Y(parcel);
                int iM1728M2 = 0;
                while (parcel.dataPosition() < iM1737Y) {
                    int i4 = parcel.readInt();
                    char c = (char) i4;
                    if (c == 1) {
                        iM1728M = AbstractC0664e.m1728M(parcel, i4);
                    } else if (c == 2) {
                        iM1728M2 = AbstractC0664e.m1728M(parcel, i4);
                    } else if (c != 3) {
                        AbstractC0664e.m1735U(parcel, i4);
                    } else {
                        intent = (Intent) AbstractC0664e.m1753r(parcel, i4, Intent.CREATOR);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y);
                return new C1524b(iM1728M, iM1728M2, intent);
            case 14:
                int iM1737Y2 = AbstractC0664e.m1737Y(parcel);
                String strM1754s = null;
                while (parcel.dataPosition() < iM1737Y2) {
                    int i5 = parcel.readInt();
                    char c2 = (char) i5;
                    if (c2 == 1) {
                        arrayListM1755t = AbstractC0664e.m1755t(parcel, i5);
                    } else if (c2 != 2) {
                        AbstractC0664e.m1735U(parcel, i5);
                    } else {
                        strM1754s = AbstractC0664e.m1754s(parcel, i5);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y2);
                return new C1526d(strM1754s, arrayListM1755t);
            case 15:
                int iM1737Y3 = AbstractC0664e.m1737Y(parcel);
                C0487o c0487o = null;
                int iM1728M3 = 0;
                while (parcel.dataPosition() < iM1737Y3) {
                    int i6 = parcel.readInt();
                    char c3 = (char) i6;
                    if (c3 == 1) {
                        iM1728M3 = AbstractC0664e.m1728M(parcel, i6);
                    } else if (c3 == 2) {
                        c0346a = (C0346a) AbstractC0664e.m1753r(parcel, i6, C0346a.CREATOR);
                    } else if (c3 != 3) {
                        AbstractC0664e.m1735U(parcel, i6);
                    } else {
                        c0487o = (C0487o) AbstractC0664e.m1753r(parcel, i6, C0487o.CREATOR);
                    }
                }
                AbstractC0664e.m1758w(parcel, iM1737Y3);
                return new C1527e(iM1728M3, c0346a, c0487o);
            case 16:
                C1663t c1663t = new C1663t();
                c1663t.f7582g = parcel.readInt();
                c1663t.f7583h = parcel.readInt();
                c1663t.f7584i = parcel.readInt() == 1;
                return c1663t;
            case 17:
                C1640Y c1640y = new C1640Y();
                c1640y.f7436g = parcel.readInt();
                c1640y.f7437h = parcel.readInt();
                c1640y.f7439j = parcel.readInt() == 1;
                int i7 = parcel.readInt();
                if (i7 > 0) {
                    int[] iArr = new int[i7];
                    c1640y.f7438i = iArr;
                    parcel.readIntArray(iArr);
                }
                return c1640y;
            case 18:
                C1641Z c1641z = new C1641Z();
                c1641z.f7440g = parcel.readInt();
                c1641z.f7441h = parcel.readInt();
                int i8 = parcel.readInt();
                c1641z.f7442i = i8;
                if (i8 > 0) {
                    int[] iArr2 = new int[i8];
                    c1641z.f7443j = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i9 = parcel.readInt();
                c1641z.f7444k = i9;
                if (i9 > 0) {
                    int[] iArr3 = new int[i9];
                    c1641z.f7445l = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c1641z.f7447n = parcel.readInt() == 1;
                c1641z.f7448o = parcel.readInt() == 1;
                c1641z.f7449p = parcel.readInt() == 1;
                c1641z.f7446m = parcel.readArrayList(C1640Y.class.getClassLoader());
                return c1641z;
            case 19:
                C1820O c1820o = new C1820O(parcel);
                c1820o.f8065g = parcel.readByte() != 0;
                return c1820o;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f3197a) {
            case 0:
                return new C0789e[i3];
            case 1:
                return new MediaBrowserCompat$MediaItem[i3];
            case 2:
                return new MediaDescriptionCompat[i3];
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                return new MediaMetadataCompat[i3];
            case 4:
                return new RatingCompat[i3];
            case 5:
                return new C0908a[i3];
            case 6:
                return new C0951b[i3];
            case 7:
                return new C0952c[i3];
            case 8:
                return new C0975z[i3];
            case 9:
                return new C0939E[i3];
            case 10:
                return new C0942H[i3];
            case 11:
                return new C1514s[i3];
            case 12:
                return new C1513r[i3];
            case 13:
                return new C1524b[i3];
            case 14:
                return new C1526d[i3];
            case 15:
                return new C1527e[i3];
            case 16:
                return new C1663t[i3];
            case 17:
                return new C1640Y[i3];
            case 18:
                return new C1641Z[i3];
            case 19:
                return new C1820O[i3];
            default:
                return new ParcelImpl[i3];
        }
    }
}
