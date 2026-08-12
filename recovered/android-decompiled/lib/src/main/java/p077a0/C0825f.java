package p077a0;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import com.zuxoplayer.app.PlayerActivity;
import java.io.Serializable;
import java.util.Objects;
import p003B.AbstractC0084f;
import p055T.C0567c;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p101g2.C1588i;
import p101g2.C1589j;
import p101g2.InterfaceC1587h;

/* JADX INFO: renamed from: a0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0825f {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1587h f3467a;

    /* JADX INFO: renamed from: b */
    public final C0823e f3468b;

    /* JADX INFO: renamed from: c */
    public SurfaceHolderCallbackC0850z f3469c;

    /* JADX INFO: renamed from: d */
    public C0567c f3470d;

    /* JADX INFO: renamed from: e */
    public int f3471e;

    /* JADX INFO: renamed from: f */
    public int f3472f;

    /* JADX INFO: renamed from: g */
    public float f3473g = 1.0f;

    /* JADX INFO: renamed from: h */
    public AudioFocusRequest f3474h;

    public C0825f(PlayerActivity playerActivity, Handler handler, SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z) {
        C0819c c0819c = new C0819c(playerActivity, 0);
        this.f3467a = c0819c instanceof Serializable ? new C1588i(c0819c) : new C1589j(c0819c);
        this.f3469c = surfaceHolderCallbackC0850z;
        this.f3468b = new C0823e(this, handler);
        this.f3471e = 0;
    }

    /* JADX INFO: renamed from: a */
    public final void m2074a() {
        int i3 = this.f3471e;
        if (i3 == 1 || i3 == 0) {
            return;
        }
        int i4 = AbstractC0632A.f2454a;
        InterfaceC1587h interfaceC1587h = this.f3467a;
        if (i4 < 26) {
            ((AudioManager) interfaceC1587h.get()).abandonAudioFocus(this.f3468b);
        } else if (this.f3474h != null) {
            ((AudioManager) interfaceC1587h.get()).abandonAudioFocusRequest(this.f3474h);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2075b(C0567c c0567c) {
        C0567c c0567c2 = this.f3470d;
        int i3 = AbstractC0632A.f2454a;
        if (Objects.equals(c0567c2, c0567c)) {
            return;
        }
        this.f3470d = c0567c;
        int i4 = c0567c == null ? 0 : 1;
        this.f3472f = i4;
        AbstractC0646n.m1624b("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i4 == 1 || i4 == 0);
    }

    /* JADX INFO: renamed from: c */
    public final void m2076c(int i3) {
        if (this.f3471e == i3) {
            return;
        }
        this.f3471e = i3;
        float f = i3 == 4 ? 0.2f : 1.0f;
        if (this.f3473g == f) {
            return;
        }
        this.f3473g = f;
        SurfaceHolderCallbackC0850z surfaceHolderCallbackC0850z = this.f3469c;
        if (surfaceHolderCallbackC0850z != null) {
            C0792C c0792c = surfaceHolderCallbackC0850z.f3610g;
            c0792c.m1922q0(1, 2, Float.valueOf(c0792c.f3229W * c0792c.f3208B.f3473g));
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m2077d(int i3, boolean z3) {
        int iRequestAudioFocus;
        AudioFocusRequest.Builder builderM453m;
        if (i3 == 1 || this.f3472f != 1) {
            m2074a();
            m2076c(0);
            return 1;
        }
        if (!z3) {
            int i4 = this.f3471e;
            if (i4 == 1) {
                return -1;
            }
            if (i4 == 3) {
                return 0;
            }
        } else if (this.f3471e != 2) {
            int i5 = AbstractC0632A.f2454a;
            InterfaceC1587h interfaceC1587h = this.f3467a;
            C0823e c0823e = this.f3468b;
            if (i5 >= 26) {
                AudioFocusRequest audioFocusRequest = this.f3474h;
                if (audioFocusRequest == null) {
                    if (audioFocusRequest == null) {
                        AbstractC0084f.m458r();
                        builderM453m = AbstractC0084f.m449i(this.f3472f);
                    } else {
                        AbstractC0084f.m458r();
                        builderM453m = AbstractC0084f.m453m(this.f3474h);
                    }
                    C0567c c0567c = this.f3470d;
                    c0567c.getClass();
                    this.f3474h = builderM453m.setAudioAttributes((AudioAttributes) c0567c.m1433a().f38h).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(c0823e).build();
                }
                iRequestAudioFocus = ((AudioManager) interfaceC1587h.get()).requestAudioFocus(this.f3474h);
            } else {
                AudioManager audioManager = (AudioManager) interfaceC1587h.get();
                this.f3470d.getClass();
                iRequestAudioFocus = audioManager.requestAudioFocus(c0823e, 3, this.f3472f);
            }
            if (iRequestAudioFocus == 1) {
                m2076c(2);
                return 1;
            }
            m2076c(1);
            return -1;
        }
        return 1;
    }
}
