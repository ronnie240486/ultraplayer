package p022H1;

import android.content.Intent;
import android.support.v4.media.session.AbstractC0883s;
import android.view.KeyEvent;
import p013E1.C0141p;
import p016F1.C0192i;
import p019G1.C0233h;
import p019G1.C0234i;
import p019G1.C0239n;
import p046P1.AbstractC0491s;

/* JADX INFO: renamed from: H1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0266j extends AbstractC0883s {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0267k f702f;

    public C0266j(C0267k c0267k) {
        this.f702f = c0267k;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    @Override // android.support.v4.media.session.AbstractC0883s
    /* JADX INFO: renamed from: b */
    public final void mo797b(String str) {
        byte b3;
        C0267k.f703v.m831b("onCustomAction with action = %s", str);
        switch (str) {
            case "com.google.android.gms.cast.framework.action.REWIND":
                b3 = 1;
                break;
            case "com.google.android.gms.cast.framework.action.STOP_CASTING":
                b3 = 2;
                break;
            case "com.google.android.gms.cast.framework.action.DISCONNECT":
                b3 = 3;
                break;
            case "com.google.android.gms.cast.framework.action.FORWARD":
                b3 = 0;
                break;
            default:
                b3 = -1;
                break;
        }
        C0267k c0267k = this.f702f;
        if (b3 == 0) {
            long j3 = c0267k.f708e.f583i;
            C0233h c0233h = c0267k.f717n;
            if (c0233h == null) {
                return;
            }
            long jMin = Math.min(c0233h.m756f(), Math.max(0L, c0233h.m751a() + j3));
            C0233h c0233h2 = c0267k.f717n;
            if (c0233h2 == null) {
                return;
            }
            C0141p c0141p = new C0141p(jMin);
            AbstractC0491s.m1210b();
            if (c0233h2.m772w()) {
                C0233h.m750x(new C0239n(c0233h2, c0141p, 1));
                return;
            } else {
                C0233h.m749r();
                return;
            }
        }
        if (b3 == 1) {
            long j4 = -c0267k.f708e.f583i;
            C0233h c0233h3 = c0267k.f717n;
            if (c0233h3 == null) {
                return;
            }
            long jMin2 = Math.min(c0233h3.m756f(), Math.max(0L, c0233h3.m751a() + j4));
            C0233h c0233h4 = c0267k.f717n;
            if (c0233h4 == null) {
                return;
            }
            C0141p c0141p2 = new C0141p(jMin2);
            AbstractC0491s.m1210b();
            if (c0233h4.m772w()) {
                C0233h.m750x(new C0239n(c0233h4, c0141p2, 1));
                return;
            } else {
                C0233h.m749r();
                return;
            }
        }
        if (b3 == 2) {
            C0192i c0192i = c0267k.f707d;
            if (c0192i != null) {
                c0192i.m679b(true);
                return;
            }
            return;
        }
        if (b3 != 3) {
            Intent intent = new Intent(str);
            intent.setComponent(c0267k.f710g);
            c0267k.f704a.sendBroadcast(intent);
        } else {
            C0192i c0192i2 = c0267k.f707d;
            if (c0192i2 != null) {
                c0192i2.m679b(false);
            }
        }
    }

    @Override // android.support.v4.media.session.AbstractC0883s
    /* JADX INFO: renamed from: c */
    public final boolean mo798c(Intent intent) {
        C0233h c0233h;
        C0267k.f703v.m831b("onMediaButtonEvent", new Object[0]);
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if ((keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) || (c0233h = this.f702f.f717n) == null) {
            return true;
        }
        c0233h.m766p();
        return true;
    }

    @Override // android.support.v4.media.session.AbstractC0883s
    /* JADX INFO: renamed from: d */
    public final void mo799d() {
        C0267k.f703v.m831b("onPause", new Object[0]);
        C0233h c0233h = this.f702f.f717n;
        if (c0233h != null) {
            c0233h.m766p();
        }
    }

    @Override // android.support.v4.media.session.AbstractC0883s
    /* JADX INFO: renamed from: e */
    public final void mo800e() {
        C0267k.f703v.m831b("onPlay", new Object[0]);
        C0233h c0233h = this.f702f.f717n;
        if (c0233h != null) {
            c0233h.m766p();
        }
    }

    @Override // android.support.v4.media.session.AbstractC0883s
    /* JADX INFO: renamed from: f */
    public final void mo801f(long j3) {
        C0267k.f703v.m831b("onSeekTo %d", Long.valueOf(j3));
        C0233h c0233h = this.f702f.f717n;
        if (c0233h == null) {
            return;
        }
        C0141p c0141p = new C0141p(j3);
        AbstractC0491s.m1210b();
        if (c0233h.m772w()) {
            C0233h.m750x(new C0239n(c0233h, c0141p, 1));
        } else {
            C0233h.m749r();
        }
    }

    @Override // android.support.v4.media.session.AbstractC0883s
    /* JADX INFO: renamed from: g */
    public final void mo802g() {
        C0267k.f703v.m831b("onSkipToNext", new Object[0]);
        C0233h c0233h = this.f702f.f717n;
        if (c0233h != null) {
            AbstractC0491s.m1210b();
            if (c0233h.m772w()) {
                C0233h.m750x(new C0234i(c0233h, 2));
            } else {
                C0233h.m749r();
            }
        }
    }

    @Override // android.support.v4.media.session.AbstractC0883s
    /* JADX INFO: renamed from: h */
    public final void mo803h() {
        C0267k.f703v.m831b("onSkipToPrevious", new Object[0]);
        C0233h c0233h = this.f702f.f717n;
        if (c0233h != null) {
            AbstractC0491s.m1210b();
            if (c0233h.m772w()) {
                C0233h.m750x(new C0234i(c0233h, 1));
            } else {
                C0233h.m749r();
            }
        }
    }
}
