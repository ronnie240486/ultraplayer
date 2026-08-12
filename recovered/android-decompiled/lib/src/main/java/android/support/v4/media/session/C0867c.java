package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import com.google.android.gms.internal.cast.AbstractC1303m;

/* JADX INFO: renamed from: android.support.v4.media.session.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0867c implements InterfaceC0868d {

    /* JADX INFO: renamed from: b */
    public IBinder f3680b;

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: T */
    public final PendingIntent mo2225T() {
        throw null;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3680b;
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: g */
    public final PlaybackStateCompat mo2226g() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.f3680b.transact(28, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (PlaybackStateCompat) AbstractC1303m.m3304a(parcelObtain2, PlaybackStateCompat.CREATOR);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: l0 */
    public final void mo2227l0() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.f3680b.transact(13, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: o */
    public final void mo2228o() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.f3680b.transact(18, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: p */
    public final void mo2229p(InterfaceC0866b interfaceC0866b) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC0866b);
            this.f3680b.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: r */
    public final MediaMetadataCompat mo2230r() {
        throw null;
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    public final void stop() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            this.f3680b.transact(19, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: v */
    public final void mo2231v(InterfaceC0866b interfaceC0866b) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
            parcelObtain.writeStrongInterface(interfaceC0866b);
            this.f3680b.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
