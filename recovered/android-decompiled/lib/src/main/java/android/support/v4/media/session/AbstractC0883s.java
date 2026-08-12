package android.support.v4.media.session;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import p044P.C0449a;

/* JADX INFO: renamed from: android.support.v4.media.session.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0883s {

    /* JADX INFO: renamed from: c */
    public boolean f3697c;

    /* JADX INFO: renamed from: e */
    public HandlerC0881q f3699e;

    /* JADX INFO: renamed from: a */
    public final Object f3695a = new Object();

    /* JADX INFO: renamed from: b */
    public final C0882r f3696b = new C0882r(this);

    /* JADX INFO: renamed from: d */
    public WeakReference f3698d = new WeakReference(null);

    /* JADX INFO: renamed from: a */
    public final void m2277a(C0885u c0885u, Handler handler) {
        if (this.f3697c) {
            this.f3697c = false;
            handler.removeMessages(1);
            PlaybackStateCompat playbackStateCompatM2282d = c0885u.m2282d();
            long j3 = playbackStateCompatM2282d == null ? 0L : playbackStateCompatM2282d.f3666k;
            boolean z3 = playbackStateCompatM2282d != null && playbackStateCompatM2282d.f3662g == 3;
            boolean z4 = (516 & j3) != 0;
            boolean z5 = (j3 & 514) != 0;
            if (z3 && z5) {
                mo799d();
            } else {
                if (z3 || !z4) {
                    return;
                }
                mo800e();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean mo798c(Intent intent) {
        C0885u c0885u;
        HandlerC0881q handlerC0881q;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.f3695a) {
                c0885u = (C0885u) this.f3698d.get();
                handlerC0881q = this.f3699e;
            }
            if (c0885u != null && handlerC0881q != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                C0449a c0449aMo2281c = c0885u.mo2281c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    m2277a(c0885u, handlerC0881q);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    m2277a(c0885u, handlerC0881q);
                    return true;
                }
                if (!this.f3697c) {
                    this.f3697c = true;
                    handlerC0881q.sendMessageDelayed(handlerC0881q.obtainMessage(1, c0449aMo2281c), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                handlerC0881q.removeMessages(1);
                this.f3697c = false;
                PlaybackStateCompat playbackStateCompatM2282d = c0885u.m2282d();
                if (((playbackStateCompatM2282d == null ? 0L : playbackStateCompatM2282d.f3666k) & 32) != 0) {
                    mo802g();
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void mo799d() {
    }

    /* JADX INFO: renamed from: e */
    public void mo800e() {
    }

    /* JADX INFO: renamed from: f */
    public void mo801f(long j3) {
    }

    /* JADX INFO: renamed from: g */
    public void mo802g() {
    }

    /* JADX INFO: renamed from: h */
    public void mo803h() {
    }

    /* JADX INFO: renamed from: i */
    public final void m2278i(C0885u c0885u, Handler handler) {
        synchronized (this.f3695a) {
            try {
                this.f3698d = new WeakReference(c0885u);
                HandlerC0881q handlerC0881q = this.f3699e;
                HandlerC0881q handlerC0881q2 = null;
                if (handlerC0881q != null) {
                    handlerC0881q.removeCallbacksAndMessages(null);
                }
                if (c0885u != null && handler != null) {
                    handlerC0881q2 = new HandlerC0881q(this, handler.getLooper(), 0);
                }
                this.f3699e = handlerC0881q2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo797b(String str) {
    }
}
