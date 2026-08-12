package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.support.v4.media.MediaMetadataCompat;
import p044P.C0449a;

/* JADX INFO: renamed from: android.support.v4.media.session.u */
/* JADX INFO: loaded from: classes.dex */
public class C0885u {

    /* JADX INFO: renamed from: a */
    public final MediaSession f3702a;

    /* JADX INFO: renamed from: b */
    public final BinderC0884t f3703b;

    /* JADX INFO: renamed from: c */
    public final MediaSessionCompat$Token f3704c;

    /* JADX INFO: renamed from: d */
    public final Object f3705d = new Object();

    /* JADX INFO: renamed from: e */
    public final RemoteCallbackList f3706e = new RemoteCallbackList();

    /* JADX INFO: renamed from: f */
    public PlaybackStateCompat f3707f;

    /* JADX INFO: renamed from: g */
    public MediaMetadataCompat f3708g;

    /* JADX INFO: renamed from: h */
    public AbstractC0883s f3709h;

    /* JADX INFO: renamed from: i */
    public C0449a f3710i;

    public C0885u(Context context) {
        MediaSession mediaSessionMo2279a = mo2279a(context);
        this.f3702a = mediaSessionMo2279a;
        BinderC0884t binderC0884t = new BinderC0884t(this);
        this.f3703b = binderC0884t;
        this.f3704c = new MediaSessionCompat$Token(mediaSessionMo2279a.getSessionToken(), binderC0884t);
        mediaSessionMo2279a.setFlags(3);
    }

    /* JADX INFO: renamed from: a */
    public MediaSession mo2279a(Context context) {
        return new MediaSession(context, "CastMediaSession");
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC0883s m2280b() {
        AbstractC0883s abstractC0883s;
        synchronized (this.f3705d) {
            abstractC0883s = this.f3709h;
        }
        return abstractC0883s;
    }

    /* JADX INFO: renamed from: c */
    public C0449a mo2281c() {
        C0449a c0449a;
        synchronized (this.f3705d) {
            c0449a = this.f3710i;
        }
        return c0449a;
    }

    /* JADX INFO: renamed from: d */
    public final PlaybackStateCompat m2282d() {
        return this.f3707f;
    }

    /* JADX INFO: renamed from: e */
    public final void m2283e(AbstractC0883s abstractC0883s, Handler handler) {
        synchronized (this.f3705d) {
            try {
                this.f3709h = abstractC0883s;
                this.f3702a.setCallback(abstractC0883s == null ? null : abstractC0883s.f3696b, handler);
                if (abstractC0883s != null) {
                    abstractC0883s.m2278i(this, handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo2284f(C0449a c0449a) {
        synchronized (this.f3705d) {
            this.f3710i = c0449a;
        }
    }
}
