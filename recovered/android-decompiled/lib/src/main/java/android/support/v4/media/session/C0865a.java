package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import p066W1.AbstractC0664e;

/* JADX INFO: renamed from: android.support.v4.media.session.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0865a implements InterfaceC0866b {

    /* JADX INFO: renamed from: b */
    public IBinder f3679b;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3679b;
    }

    @Override // android.support.v4.media.session.InterfaceC0866b
    /* JADX INFO: renamed from: i0 */
    public final void mo2218i0(Bundle bundle) {
        throw null;
    }

    @Override // android.support.v4.media.session.InterfaceC0866b
    /* JADX INFO: renamed from: k0 */
    public final void mo2219k0(PlaybackStateCompat playbackStateCompat) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            AbstractC0664e.m1741b(parcelObtain, playbackStateCompat);
            this.f3679b.transact(3, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0866b
    /* JADX INFO: renamed from: s0 */
    public final void mo2220s0(ParcelableVolumeInfo parcelableVolumeInfo) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            AbstractC0664e.m1741b(parcelObtain, parcelableVolumeInfo);
            this.f3679b.transact(8, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0866b
    /* JADX INFO: renamed from: t */
    public final void mo2221t() {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            this.f3679b.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0866b
    /* JADX INFO: renamed from: x */
    public final void mo2222x(MediaMetadataCompat mediaMetadataCompat) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaControllerCallback");
            AbstractC0664e.m1741b(parcelObtain, mediaMetadataCompat);
            this.f3679b.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
