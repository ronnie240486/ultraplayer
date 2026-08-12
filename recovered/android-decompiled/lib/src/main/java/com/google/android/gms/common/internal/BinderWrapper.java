package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p024I0.C0271a;
import p028J1.BinderC0317w;

/* JADX INFO: loaded from: classes.dex */
public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new C0271a(19);

    /* JADX INFO: renamed from: g */
    public final IBinder f5512g;

    public BinderWrapper(BinderC0317w binderC0317w) {
        this.f5512g = binderC0317w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeStrongBinder(this.f5512g);
    }

    public /* synthetic */ BinderWrapper(Parcel parcel) {
        this.f5512g = parcel.readStrongBinder();
    }
}
