package com.google.android.gms.internal.cast;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import p045P0.AbstractC0462h;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.v */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1339v {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f5981a = 0;

    static {
        AbstractC1339v.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m3419a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m3420b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(AbstractC0462h.m1165e(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m3421c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m3422d(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
