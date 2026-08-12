package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p044P.C0449a;

/* JADX INFO: renamed from: android.support.v4.media.session.t */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0884t extends Binder implements InterfaceC0868d {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f3700c = 0;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f3701b;

    public BinderC0884t(C0885u c0885u) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f3701b = new AtomicReference(c0885u);
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: A */
    public final void mo2232A(boolean z3) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: B */
    public final void mo2233B(RatingCompat ratingCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: C */
    public final void mo2234C(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: E */
    public final void mo2235E(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: G */
    public final void mo2236G(long j3) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: H */
    public final void mo2237H(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: I */
    public final void mo2238I(int i3, int i4) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: J */
    public final ParcelableVolumeInfo mo2239J() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: L */
    public final void mo2240L() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: M */
    public final Bundle mo2241M() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: N */
    public final void mo2242N(Uri uri, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: O */
    public final void mo2243O(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: Q */
    public final boolean mo2244Q() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: R */
    public final void mo2245R(MediaDescriptionCompat mediaDescriptionCompat) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: T */
    public final PendingIntent mo2225T() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: V */
    public final int mo2246V() {
        return ((C0885u) this.f3701b.get()) != null ? 0 : -1;
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: W */
    public final void mo2247W(long j3) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: Y */
    public final void mo2248Y(int i3) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: Z */
    public final void mo2249Z(int i3) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: a */
    public final long mo2250a() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: b */
    public final void mo2251b() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: b0 */
    public final void mo2252b0() {
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: c */
    public final void mo2253c(int i3) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: c0 */
    public final void mo2254c0(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: e */
    public final int mo2255e() {
        return ((C0885u) this.f3701b.get()) != null ? 0 : -1;
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: f0 */
    public final void mo2256f0() {
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: g */
    public final PlaybackStateCompat mo2226g() {
        long j3;
        C0885u c0885u = (C0885u) this.f3701b.get();
        if (c0885u == null) {
            return null;
        }
        PlaybackStateCompat playbackStateCompat = c0885u.f3707f;
        MediaMetadataCompat mediaMetadataCompat = c0885u.f3708g;
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j4 = -1;
        long j5 = playbackStateCompat.f3663h;
        if (j5 == -1) {
            return playbackStateCompat;
        }
        int i3 = playbackStateCompat.f3662g;
        if (i3 != 3 && i3 != 4 && i3 != 5) {
            return playbackStateCompat;
        }
        long j6 = playbackStateCompat.f3669n;
        if (j6 <= 0) {
            return playbackStateCompat;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j7 = ((long) (playbackStateCompat.f3665j * (jElapsedRealtime - j6))) + j5;
        if (mediaMetadataCompat != null) {
            Bundle bundle = mediaMetadataCompat.f3631g;
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                j4 = bundle.getLong("android.media.metadata.DURATION", 0L);
            }
        }
        if (j4 < 0 || j7 <= j4) {
            j3 = j7 < 0 ? 0L : j7;
        } else {
            j3 = j4;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = playbackStateCompat.f3670o;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return new PlaybackStateCompat(playbackStateCompat.f3662g, j3, playbackStateCompat.f3664i, playbackStateCompat.f3665j, playbackStateCompat.f3666k, playbackStateCompat.f3667l, playbackStateCompat.f3668m, jElapsedRealtime, arrayList, playbackStateCompat.f3671p, playbackStateCompat.f3672q);
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: g0 */
    public final String mo2257g0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: h */
    public final void mo2258h() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: l */
    public final CharSequence mo2259l() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: l0 */
    public final void mo2227l0() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: m0 */
    public final void mo2260m0(float f) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: n */
    public final void mo2261n(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: n0 */
    public final void mo2262n0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    public final void next() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: o */
    public final void mo2228o() {
        throw new AssertionError();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i3, Parcel parcel, Parcel parcel2, int i4) {
        if (i3 >= 1 && i3 <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        }
        if (i3 == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaSession");
            return true;
        }
        InterfaceC0866b interfaceC0866b = null;
        InterfaceC0866b interfaceC0866b2 = null;
        switch (i3) {
            case 1:
                mo2262n0(parcel.readString(), (Bundle) AbstractC1303m.m3304a(parcel, Bundle.CREATOR), (MediaSessionCompat$ResultReceiverWrapper) AbstractC1303m.m3304a(parcel, MediaSessionCompat$ResultReceiverWrapper.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                boolean zMo2267t0 = mo2267t0((KeyEvent) AbstractC1303m.m3304a(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zMo2267t0 ? 1 : 0);
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0866b)) {
                        C0865a c0865a = new C0865a();
                        c0865a.f3679b = strongBinder;
                        interfaceC0866b = c0865a;
                    } else {
                        interfaceC0866b = (InterfaceC0866b) iInterfaceQueryLocalInterface;
                    }
                }
                mo2229p(interfaceC0866b);
                parcel2.writeNoException();
                return true;
            case 4:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                    if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC0866b)) {
                        C0865a c0865a2 = new C0865a();
                        c0865a2.f3679b = strongBinder2;
                        interfaceC0866b2 = c0865a2;
                    } else {
                        interfaceC0866b2 = (InterfaceC0866b) iInterfaceQueryLocalInterface2;
                    }
                }
                mo2231v(interfaceC0866b2);
                parcel2.writeNoException();
                return true;
            case 5:
                boolean zMo2244Q = mo2244Q();
                parcel2.writeNoException();
                parcel2.writeInt(zMo2244Q ? 1 : 0);
                return true;
            case 6:
                String strMo2257g0 = mo2257g0();
                parcel2.writeNoException();
                parcel2.writeString(strMo2257g0);
                return true;
            case 7:
                String strMo2270z = mo2270z();
                parcel2.writeNoException();
                parcel2.writeString(strMo2270z);
                return true;
            case 8:
                PendingIntent pendingIntentMo2225T = mo2225T();
                parcel2.writeNoException();
                AbstractC1303m.m3303Z(parcel2, pendingIntentMo2225T);
                return true;
            case 9:
                long jMo2250a = mo2250a();
                parcel2.writeNoException();
                parcel2.writeLong(jMo2250a);
                return true;
            case 10:
                ParcelableVolumeInfo parcelableVolumeInfoMo2239J = mo2239J();
                parcel2.writeNoException();
                AbstractC1303m.m3303Z(parcel2, parcelableVolumeInfoMo2239J);
                return true;
            case 11:
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                parcel.readString();
                mo2265r0(i5, i6);
                parcel2.writeNoException();
                return true;
            case 12:
                int i7 = parcel.readInt();
                int i8 = parcel.readInt();
                parcel.readString();
                mo2238I(i7, i8);
                parcel2.writeNoException();
                return true;
            case 13:
                mo2227l0();
                parcel2.writeNoException();
                return true;
            case 14:
                mo2234C(parcel.readString(), (Bundle) AbstractC1303m.m3304a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                mo2237H(parcel.readString(), (Bundle) AbstractC1303m.m3304a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                mo2242N((Uri) AbstractC1303m.m3304a(parcel, Uri.CREATOR), (Bundle) AbstractC1303m.m3304a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                mo2236G(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 18:
                mo2228o();
                parcel2.writeNoException();
                return true;
            case 19:
                stop();
                parcel2.writeNoException();
                return true;
            case 20:
                next();
                parcel2.writeNoException();
                return true;
            case 21:
                previous();
                parcel2.writeNoException();
                return true;
            case 22:
                mo2240L();
                parcel2.writeNoException();
                return true;
            case 23:
                mo2258h();
                parcel2.writeNoException();
                return true;
            case 24:
                mo2247W(parcel.readLong());
                parcel2.writeNoException();
                return true;
            case 25:
                mo2233B((RatingCompat) AbstractC1303m.m3304a(parcel, RatingCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 26:
                mo2261n(parcel.readString(), (Bundle) AbstractC1303m.m3304a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 27:
                MediaMetadataCompat mediaMetadataCompatMo2230r = mo2230r();
                parcel2.writeNoException();
                AbstractC1303m.m3303Z(parcel2, mediaMetadataCompatMo2230r);
                return true;
            case 28:
                PlaybackStateCompat playbackStateCompatMo2226g = mo2226g();
                parcel2.writeNoException();
                AbstractC1303m.m3303Z(parcel2, playbackStateCompatMo2226g);
                return true;
            case 29:
                parcel2.writeNoException();
                parcel2.writeInt(-1);
                return true;
            case 30:
                CharSequence charSequenceMo2259l = mo2259l();
                parcel2.writeNoException();
                if (charSequenceMo2259l == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                TextUtils.writeToParcel(charSequenceMo2259l, parcel2, 1);
                return true;
            case 31:
                Bundle bundleMo2241M = mo2241M();
                parcel2.writeNoException();
                AbstractC1303m.m3303Z(parcel2, bundleMo2241M);
                return true;
            case 32:
                mo2252b0();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 33:
                mo2251b();
                parcel2.writeNoException();
                return true;
            case 34:
                mo2266s(parcel.readString(), (Bundle) AbstractC1303m.m3304a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 35:
                mo2254c0(parcel.readString(), (Bundle) AbstractC1303m.m3304a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 36:
                mo2235E((Uri) AbstractC1303m.m3304a(parcel, Uri.CREATOR), (Bundle) AbstractC1303m.m3304a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 37:
                int iMo2255e = mo2255e();
                parcel2.writeNoException();
                parcel2.writeInt(iMo2255e);
                return true;
            case 38:
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 39:
                mo2253c(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 40:
                parcel.readInt();
                parcel2.writeNoException();
                return true;
            case 41:
                mo2245R((MediaDescriptionCompat) AbstractC1303m.m3304a(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 42:
                mo2269w((MediaDescriptionCompat) AbstractC1303m.m3304a(parcel, MediaDescriptionCompat.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 43:
                mo2243O((MediaDescriptionCompat) AbstractC1303m.m3304a(parcel, MediaDescriptionCompat.CREATOR));
                parcel2.writeNoException();
                return true;
            case 44:
                mo2249Z(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 45:
                mo2256f0();
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 46:
                mo2232A(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 47:
                int iMo2246V = mo2246V();
                parcel2.writeNoException();
                parcel2.writeInt(iMo2246V);
                return true;
            case 48:
                mo2248Y(parcel.readInt());
                parcel2.writeNoException();
                return true;
            case 49:
                mo2260m0(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 50:
                Bundle bundleMo2268u = mo2268u();
                parcel2.writeNoException();
                AbstractC1303m.m3303Z(parcel2, bundleMo2268u);
                return true;
            case 51:
                mo2264q((RatingCompat) AbstractC1303m.m3304a(parcel, RatingCompat.CREATOR), (Bundle) AbstractC1303m.m3304a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            default:
                return super.onTransact(i3, parcel, parcel2, i4);
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: p */
    public final void mo2229p(InterfaceC0866b interfaceC0866b) {
        C0885u c0885u = (C0885u) this.f3701b.get();
        if (c0885u == null) {
            return;
        }
        c0885u.f3706e.register(interfaceC0866b, new C0449a("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
        synchronized (c0885u.f3705d) {
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    public final void previous() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: q */
    public final void mo2264q(RatingCompat ratingCompat, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: r */
    public final MediaMetadataCompat mo2230r() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: r0 */
    public final void mo2265r0(int i3, int i4) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: s */
    public final void mo2266s(String str, Bundle bundle) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    public final void stop() {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: t0 */
    public final boolean mo2267t0(KeyEvent keyEvent) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: u */
    public final Bundle mo2268u() {
        ((C0885u) this.f3701b.get()).getClass();
        return null;
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: v */
    public final void mo2231v(InterfaceC0866b interfaceC0866b) {
        C0885u c0885u = (C0885u) this.f3701b.get();
        if (c0885u == null) {
            return;
        }
        c0885u.f3706e.unregister(interfaceC0866b);
        Binder.getCallingPid();
        Binder.getCallingUid();
        synchronized (c0885u.f3705d) {
        }
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: w */
    public final void mo2269w(MediaDescriptionCompat mediaDescriptionCompat, int i3) {
        throw new AssertionError();
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: z */
    public final String mo2270z() {
        throw new AssertionError();
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.support.v4.media.session.InterfaceC0868d
    /* JADX INFO: renamed from: p0 */
    public final void mo2263p0() {
    }
}
