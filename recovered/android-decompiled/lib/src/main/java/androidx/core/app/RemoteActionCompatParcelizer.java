package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p122m1.AbstractC2004b;
import p122m1.C2005c;
import p122m1.InterfaceC2006d;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC2004b abstractC2004b) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC2006d interfaceC2006dM4560h = remoteActionCompat.f3945a;
        boolean z3 = true;
        if (abstractC2004b.mo4557e(1)) {
            interfaceC2006dM4560h = abstractC2004b.m4560h();
        }
        remoteActionCompat.f3945a = (IconCompat) interfaceC2006dM4560h;
        CharSequence charSequence = remoteActionCompat.f3946b;
        if (abstractC2004b.mo4557e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C2005c) abstractC2004b).f8746e);
        }
        remoteActionCompat.f3946b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f3947c;
        if (abstractC2004b.mo4557e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C2005c) abstractC2004b).f8746e);
        }
        remoteActionCompat.f3947c = charSequence2;
        remoteActionCompat.f3948d = (PendingIntent) abstractC2004b.m4559g(remoteActionCompat.f3948d, 4);
        boolean z4 = remoteActionCompat.f3949e;
        if (abstractC2004b.mo4557e(5)) {
            z4 = ((C2005c) abstractC2004b).f8746e.readInt() != 0;
        }
        remoteActionCompat.f3949e = z4;
        boolean z5 = remoteActionCompat.f3950f;
        if (!abstractC2004b.mo4557e(6)) {
            z3 = z5;
        } else if (((C2005c) abstractC2004b).f8746e.readInt() == 0) {
            z3 = false;
        }
        remoteActionCompat.f3950f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC2004b abstractC2004b) {
        abstractC2004b.getClass();
        IconCompat iconCompat = remoteActionCompat.f3945a;
        abstractC2004b.mo4561i(1);
        abstractC2004b.m4564l(iconCompat);
        CharSequence charSequence = remoteActionCompat.f3946b;
        abstractC2004b.mo4561i(2);
        Parcel parcel = ((C2005c) abstractC2004b).f8746e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f3947c;
        abstractC2004b.mo4561i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        abstractC2004b.m4563k(remoteActionCompat.f3948d, 4);
        boolean z3 = remoteActionCompat.f3949e;
        abstractC2004b.mo4561i(5);
        parcel.writeInt(z3 ? 1 : 0);
        boolean z4 = remoteActionCompat.f3950f;
        abstractC2004b.mo4561i(6);
        parcel.writeInt(z4 ? 1 : 0);
    }
}
