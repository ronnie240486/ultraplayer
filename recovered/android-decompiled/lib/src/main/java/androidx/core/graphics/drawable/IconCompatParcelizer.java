package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.nio.charset.Charset;
import p122m1.AbstractC2004b;
import p122m1.C2005c;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC2004b abstractC2004b) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3952a = abstractC2004b.m4558f(iconCompat.f3952a, 1);
        byte[] bArr = iconCompat.f3954c;
        if (abstractC2004b.mo4557e(2)) {
            Parcel parcel = ((C2005c) abstractC2004b).f8746e;
            int i3 = parcel.readInt();
            if (i3 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i3];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f3954c = bArr;
        iconCompat.f3955d = abstractC2004b.m4559g(iconCompat.f3955d, 3);
        iconCompat.f3956e = abstractC2004b.m4558f(iconCompat.f3956e, 4);
        iconCompat.f3957f = abstractC2004b.m4558f(iconCompat.f3957f, 5);
        iconCompat.f3958g = (ColorStateList) abstractC2004b.m4559g(iconCompat.f3958g, 6);
        String string = iconCompat.f3960i;
        if (abstractC2004b.mo4557e(7)) {
            string = ((C2005c) abstractC2004b).f8746e.readString();
        }
        iconCompat.f3960i = string;
        String string2 = iconCompat.f3961j;
        if (abstractC2004b.mo4557e(8)) {
            string2 = ((C2005c) abstractC2004b).f8746e.readString();
        }
        iconCompat.f3961j = string2;
        iconCompat.f3959h = PorterDuff.Mode.valueOf(iconCompat.f3960i);
        switch (iconCompat.f3952a) {
            case -1:
                Parcelable parcelable = iconCompat.f3955d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f3953b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f3955d;
                if (parcelable2 != null) {
                    iconCompat.f3953b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f3954c;
                iconCompat.f3953b = bArr3;
                iconCompat.f3952a = 3;
                iconCompat.f3956e = 0;
                iconCompat.f3957f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f3954c, Charset.forName("UTF-16"));
                iconCompat.f3953b = str;
                if (iconCompat.f3952a == 2 && iconCompat.f3961j == null) {
                    iconCompat.f3961j = str.split(":", -1)[0];
                }
                return iconCompat;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                iconCompat.f3953b = iconCompat.f3954c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC2004b abstractC2004b) {
        abstractC2004b.getClass();
        iconCompat.f3960i = iconCompat.f3959h.name();
        switch (iconCompat.f3952a) {
            case -1:
                iconCompat.f3955d = (Parcelable) iconCompat.f3953b;
                break;
            case 1:
            case 5:
                iconCompat.f3955d = (Parcelable) iconCompat.f3953b;
                break;
            case 2:
                iconCompat.f3954c = ((String) iconCompat.f3953b).getBytes(Charset.forName("UTF-16"));
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                iconCompat.f3954c = (byte[]) iconCompat.f3953b;
                break;
            case 4:
            case 6:
                iconCompat.f3954c = iconCompat.f3953b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i3 = iconCompat.f3952a;
        if (-1 != i3) {
            abstractC2004b.m4562j(i3, 1);
        }
        byte[] bArr = iconCompat.f3954c;
        if (bArr != null) {
            abstractC2004b.mo4561i(2);
            int length = bArr.length;
            Parcel parcel = ((C2005c) abstractC2004b).f8746e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f3955d;
        if (parcelable != null) {
            abstractC2004b.m4563k(parcelable, 3);
        }
        int i4 = iconCompat.f3956e;
        if (i4 != 0) {
            abstractC2004b.m4562j(i4, 4);
        }
        int i5 = iconCompat.f3957f;
        if (i5 != 0) {
            abstractC2004b.m4562j(i5, 5);
        }
        ColorStateList colorStateList = iconCompat.f3958g;
        if (colorStateList != null) {
            abstractC2004b.m4563k(colorStateList, 6);
        }
        String str = iconCompat.f3960i;
        if (str != null) {
            abstractC2004b.mo4561i(7);
            ((C2005c) abstractC2004b).f8746e.writeString(str);
        }
        String str2 = iconCompat.f3961j;
        if (str2 != null) {
            abstractC2004b.mo4561i(8);
            ((C2005c) abstractC2004b).f8746e.writeString(str2);
        }
    }
}
