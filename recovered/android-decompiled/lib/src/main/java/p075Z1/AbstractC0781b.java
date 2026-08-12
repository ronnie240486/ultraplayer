package p075Z1;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import p045P0.AbstractC0462h;

/* JADX INFO: renamed from: Z1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0781b {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f3191a = 0;

    static {
        AbstractC0781b.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m1898a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m1899b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC0462h.m1165e(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
