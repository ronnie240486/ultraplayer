package android.support.v4.media.session;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import androidx.mediarouter.app.C1048q;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p066W1.AbstractC0664e;

/* JADX INFO: renamed from: android.support.v4.media.session.g */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0871g extends Binder implements InterfaceC0866b {

    /* JADX INFO: renamed from: b */
    public final WeakReference f3685b;

    public BinderC0871g(C1048q c1048q) {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.f3685b = new WeakReference(c1048q);
    }

    @Override // android.support.v4.media.session.InterfaceC0866b
    /* JADX INFO: renamed from: i0 */
    public final void mo2218i0(Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0866b
    /* JADX INFO: renamed from: j */
    public final void mo2223j(CharSequence charSequence) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0866b
    /* JADX INFO: renamed from: k0 */
    public final void mo2219k0(PlaybackStateCompat playbackStateCompat) {
        C1048q c1048q = (C1048q) this.f3685b.get();
        if (c1048q != null) {
            c1048q.m2650e(2, playbackStateCompat, null);
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0866b
    /* JADX INFO: renamed from: o0 */
    public final void mo2224o0(ArrayList arrayList) {
        throw new AssertionError();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i3 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        WeakReference weakReference = this.f3685b;
        switch (i3) {
            case 1:
                String string = parcel.readString();
                Bundle bundle = (Bundle) AbstractC0664e.m1739a(parcel, Bundle.CREATOR);
                C1048q c1048q = (C1048q) weakReference.get();
                if (c1048q != null) {
                    c1048q.m2650e(1, string, bundle);
                }
                return true;
            case 2:
                mo2221t();
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                mo2219k0((PlaybackStateCompat) AbstractC0664e.m1739a(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                mo2222x((MediaMetadataCompat) AbstractC0664e.m1739a(parcel, MediaMetadataCompat.CREATOR));
                return true;
            case 5:
                mo2224o0(parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR));
                return true;
            case 6:
                mo2223j((CharSequence) AbstractC0664e.m1739a(parcel, TextUtils.CHAR_SEQUENCE_CREATOR));
                return true;
            case 7:
                mo2218i0((Bundle) AbstractC0664e.m1739a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                mo2220s0((ParcelableVolumeInfo) AbstractC0664e.m1739a(parcel, ParcelableVolumeInfo.CREATOR));
                return true;
            case 9:
                int i5 = parcel.readInt();
                C1048q c1048q2 = (C1048q) weakReference.get();
                if (c1048q2 != null) {
                    c1048q2.m2650e(9, Integer.valueOf(i5), null);
                    return true;
                }
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                boolean z3 = parcel.readInt() != 0;
                C1048q c1048q3 = (C1048q) weakReference.get();
                if (c1048q3 != null) {
                    c1048q3.m2650e(11, Boolean.valueOf(z3), null);
                    return true;
                }
                return true;
            case 12:
                int i6 = parcel.readInt();
                C1048q c1048q4 = (C1048q) weakReference.get();
                if (c1048q4 != null) {
                    c1048q4.m2650e(12, Integer.valueOf(i6), null);
                    return true;
                }
                return true;
            case 13:
                C1048q c1048q5 = (C1048q) weakReference.get();
                if (c1048q5 != null) {
                    c1048q5.m2650e(13, null, null);
                    return true;
                }
                return true;
            default:
                return super.onTransact(i3, parcel, parcel2, i4);
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0866b
    /* JADX INFO: renamed from: s0 */
    public final void mo2220s0(ParcelableVolumeInfo parcelableVolumeInfo) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0866b
    /* JADX INFO: renamed from: t */
    public final void mo2221t() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0866b
    /* JADX INFO: renamed from: x */
    public final void mo2222x(MediaMetadataCompat mediaMetadataCompat) {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
