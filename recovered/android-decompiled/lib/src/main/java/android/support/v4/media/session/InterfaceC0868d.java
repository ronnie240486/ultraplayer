package android.support.v4.media.session;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IInterface;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.view.KeyEvent;

/* JADX INFO: renamed from: android.support.v4.media.session.d */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0868d extends IInterface {
    /* JADX INFO: renamed from: A */
    void mo2232A(boolean z3);

    /* JADX INFO: renamed from: B */
    void mo2233B(RatingCompat ratingCompat);

    /* JADX INFO: renamed from: C */
    void mo2234C(String str, Bundle bundle);

    /* JADX INFO: renamed from: E */
    void mo2235E(Uri uri, Bundle bundle);

    /* JADX INFO: renamed from: G */
    void mo2236G(long j3);

    /* JADX INFO: renamed from: H */
    void mo2237H(String str, Bundle bundle);

    /* JADX INFO: renamed from: I */
    void mo2238I(int i3, int i4);

    /* JADX INFO: renamed from: J */
    ParcelableVolumeInfo mo2239J();

    /* JADX INFO: renamed from: L */
    void mo2240L();

    /* JADX INFO: renamed from: M */
    Bundle mo2241M();

    /* JADX INFO: renamed from: N */
    void mo2242N(Uri uri, Bundle bundle);

    /* JADX INFO: renamed from: O */
    void mo2243O(MediaDescriptionCompat mediaDescriptionCompat);

    /* JADX INFO: renamed from: Q */
    boolean mo2244Q();

    /* JADX INFO: renamed from: R */
    void mo2245R(MediaDescriptionCompat mediaDescriptionCompat);

    /* JADX INFO: renamed from: T */
    PendingIntent mo2225T();

    /* JADX INFO: renamed from: V */
    int mo2246V();

    /* JADX INFO: renamed from: W */
    void mo2247W(long j3);

    /* JADX INFO: renamed from: Y */
    void mo2248Y(int i3);

    /* JADX INFO: renamed from: Z */
    void mo2249Z(int i3);

    /* JADX INFO: renamed from: a */
    long mo2250a();

    /* JADX INFO: renamed from: b */
    void mo2251b();

    /* JADX INFO: renamed from: b0 */
    void mo2252b0();

    /* JADX INFO: renamed from: c */
    void mo2253c(int i3);

    /* JADX INFO: renamed from: c0 */
    void mo2254c0(String str, Bundle bundle);

    /* JADX INFO: renamed from: e */
    int mo2255e();

    /* JADX INFO: renamed from: f0 */
    void mo2256f0();

    /* JADX INFO: renamed from: g */
    PlaybackStateCompat mo2226g();

    /* JADX INFO: renamed from: g0 */
    String mo2257g0();

    /* JADX INFO: renamed from: h */
    void mo2258h();

    /* JADX INFO: renamed from: l */
    CharSequence mo2259l();

    /* JADX INFO: renamed from: l0 */
    void mo2227l0();

    /* JADX INFO: renamed from: m0 */
    void mo2260m0(float f);

    /* JADX INFO: renamed from: n */
    void mo2261n(String str, Bundle bundle);

    /* JADX INFO: renamed from: n0 */
    void mo2262n0(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper);

    void next();

    /* JADX INFO: renamed from: o */
    void mo2228o();

    /* JADX INFO: renamed from: p */
    void mo2229p(InterfaceC0866b interfaceC0866b);

    /* JADX INFO: renamed from: p0 */
    void mo2263p0();

    void previous();

    /* JADX INFO: renamed from: q */
    void mo2264q(RatingCompat ratingCompat, Bundle bundle);

    /* JADX INFO: renamed from: r */
    MediaMetadataCompat mo2230r();

    /* JADX INFO: renamed from: r0 */
    void mo2265r0(int i3, int i4);

    /* JADX INFO: renamed from: s */
    void mo2266s(String str, Bundle bundle);

    void stop();

    /* JADX INFO: renamed from: t0 */
    boolean mo2267t0(KeyEvent keyEvent);

    /* JADX INFO: renamed from: u */
    Bundle mo2268u();

    /* JADX INFO: renamed from: v */
    void mo2231v(InterfaceC0866b interfaceC0866b);

    /* JADX INFO: renamed from: w */
    void mo2269w(MediaDescriptionCompat mediaDescriptionCompat, int i3);

    /* JADX INFO: renamed from: z */
    String mo2270z();
}
