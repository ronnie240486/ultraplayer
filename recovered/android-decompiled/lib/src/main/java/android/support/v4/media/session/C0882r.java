package android.support.v4.media.session;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.AbstractC0857c;
import android.support.v4.media.RatingCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import p044P.C0449a;
import p122m1.InterfaceC2006d;

/* JADX INFO: renamed from: android.support.v4.media.session.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0882r extends MediaSession.Callback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC0883s f3694a;

    public C0882r(AbstractC0883s abstractC0883s) {
        this.f3694a = abstractC0883s;
    }

    /* JADX INFO: renamed from: b */
    public static void m2275b(C0885u c0885u) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            return;
        }
        MediaSession mediaSession = c0885u.f3702a;
        String str = null;
        if (i3 >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e3) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e3);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        c0885u.mo2284f(new C0449a(str, -1, -1));
    }

    /* JADX INFO: renamed from: a */
    public final C0885u m2276a() {
        C0885u c0885u;
        synchronized (this.f3694a.f3695a) {
            c0885u = (C0885u) this.f3694a.f3698d.get();
        }
        if (c0885u == null || this.f3694a != c0885u.m2280b()) {
            return null;
        }
        return c0885u;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        InterfaceC2006d interfaceC2006d;
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        C0858A.m2152x(bundle);
        m2275b(c0885uM2276a);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                Bundle bundle2 = new Bundle();
                MediaSessionCompat$Token mediaSessionCompat$Token = c0885uM2276a.f3704c;
                InterfaceC0868d interfaceC0868dM2214d = mediaSessionCompat$Token.m2214d();
                bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", interfaceC0868dM2214d == null ? null : interfaceC0868dM2214d.asBinder());
                synchronized (mediaSessionCompat$Token.f3653g) {
                    interfaceC2006d = mediaSessionCompat$Token.f3656j;
                }
                if (interfaceC2006d != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putParcelable("a", new ParcelImpl(interfaceC2006d));
                    bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                }
                resultReceiver.send(0, bundle2);
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                AbstractC0883s abstractC0883s = this.f3694a;
                abstractC0883s.getClass();
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                AbstractC0883s abstractC0883s2 = this.f3694a;
                bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                abstractC0883s2.getClass();
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                AbstractC0883s abstractC0883s3 = this.f3694a;
                abstractC0883s3.getClass();
            } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                this.f3694a.getClass();
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        c0885uM2276a.mo2284f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        C0858A.m2152x(bundle);
        m2275b(c0885uM2276a);
        try {
            boolean zEquals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            AbstractC0883s abstractC0883s = this.f3694a;
            if (zEquals) {
                C0858A.m2152x(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                abstractC0883s.getClass();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                abstractC0883s.getClass();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                C0858A.m2152x(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                abstractC0883s.getClass();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                C0858A.m2152x(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                abstractC0883s.getClass();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                C0858A.m2152x(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                abstractC0883s.getClass();
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                abstractC0883s.getClass();
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                abstractC0883s.getClass();
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                abstractC0883s.getClass();
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                C0858A.m2152x(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                abstractC0883s.getClass();
            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f);
                abstractC0883s.getClass();
            } else {
                abstractC0883s.mo797b(str);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        c0885uM2276a.mo2284f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        m2275b(c0885uM2276a);
        this.f3694a.getClass();
        c0885uM2276a.mo2284f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return false;
        }
        m2275b(c0885uM2276a);
        boolean zMo798c = this.f3694a.mo798c(intent);
        c0885uM2276a.mo2284f(null);
        return zMo798c || super.onMediaButtonEvent(intent);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        m2275b(c0885uM2276a);
        this.f3694a.mo799d();
        c0885uM2276a.mo2284f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        m2275b(c0885uM2276a);
        this.f3694a.mo800e();
        c0885uM2276a.mo2284f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        C0858A.m2152x(bundle);
        m2275b(c0885uM2276a);
        this.f3694a.getClass();
        c0885uM2276a.mo2284f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        C0858A.m2152x(bundle);
        m2275b(c0885uM2276a);
        this.f3694a.getClass();
        c0885uM2276a.mo2284f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        C0858A.m2152x(bundle);
        m2275b(c0885uM2276a);
        this.f3694a.getClass();
        c0885uM2276a.mo2284f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        m2275b(c0885uM2276a);
        this.f3694a.getClass();
        c0885uM2276a.mo2284f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        C0858A.m2152x(bundle);
        m2275b(c0885uM2276a);
        this.f3694a.getClass();
        c0885uM2276a.mo2284f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        C0858A.m2152x(bundle);
        m2275b(c0885uM2276a);
        this.f3694a.getClass();
        c0885uM2276a.mo2284f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        C0858A.m2152x(bundle);
        m2275b(c0885uM2276a);
        this.f3694a.getClass();
        c0885uM2276a.mo2284f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        m2275b(c0885uM2276a);
        this.f3694a.getClass();
        c0885uM2276a.mo2284f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j3) {
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        m2275b(c0885uM2276a);
        this.f3694a.mo801f(j3);
        c0885uM2276a.mo2284f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f) {
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        m2275b(c0885uM2276a);
        this.f3694a.getClass();
        c0885uM2276a.mo2284f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        float f;
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        m2275b(c0885uM2276a);
        RatingCompat ratingCompat = null;
        if (rating != null) {
            int iM2138b = AbstractC0857c.m2138b(rating);
            if (AbstractC0857c.m2141e(rating)) {
                switch (iM2138b) {
                    case 1:
                        ratingCompat = new RatingCompat(1, AbstractC0857c.m2140d(rating) ? 1.0f : 0.0f);
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, AbstractC0857c.m2142f(rating) ? 1.0f : 0.0f);
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    case 4:
                    case 5:
                        float fM2139c = AbstractC0857c.m2139c(rating);
                        if (iM2138b == 3) {
                            f = 3.0f;
                        } else if (iM2138b == 4) {
                            f = 4.0f;
                        } else if (iM2138b != 5) {
                            Log.e("Rating", "Invalid rating style (" + iM2138b + ") for a star rating");
                        } else {
                            f = 5.0f;
                        }
                        if (fM2139c >= 0.0f && fM2139c <= f) {
                            ratingCompat = new RatingCompat(iM2138b, fM2139c);
                        } else {
                            Log.e("Rating", "Trying to set out of range star-based rating");
                        }
                        break;
                    case 6:
                        float fM2137a = AbstractC0857c.m2137a(rating);
                        if (fM2137a >= 0.0f && fM2137a <= 100.0f) {
                            ratingCompat = new RatingCompat(6, fM2137a);
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                        }
                        break;
                }
            } else {
                switch (iM2138b) {
                    case 1:
                    case 2:
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat = new RatingCompat(iM2138b, -1.0f);
                        break;
                }
            }
            ratingCompat.getClass();
        }
        this.f3694a.getClass();
        c0885uM2276a.mo2284f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        m2275b(c0885uM2276a);
        this.f3694a.mo802g();
        c0885uM2276a.mo2284f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        m2275b(c0885uM2276a);
        this.f3694a.mo803h();
        c0885uM2276a.mo2284f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j3) {
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        m2275b(c0885uM2276a);
        this.f3694a.getClass();
        c0885uM2276a.mo2284f(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        C0885u c0885uM2276a = m2276a();
        if (c0885uM2276a == null) {
            return;
        }
        m2275b(c0885uM2276a);
        this.f3694a.getClass();
        c0885uM2276a.mo2284f(null);
    }
}
