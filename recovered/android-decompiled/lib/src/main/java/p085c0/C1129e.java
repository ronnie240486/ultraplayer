package p085c0;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.zuxoplayer.app.PlayerActivity;
import java.util.Objects;
import p000A.C0031d;
import p011E.C0111d;
import p055T.C0567c;
import p064W.AbstractC0632A;
import p064W.C0649q;
import p125n0.C2040q;

/* JADX INFO: renamed from: c0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1129e {

    /* JADX INFO: renamed from: a */
    public final Context f5233a;

    /* JADX INFO: renamed from: b */
    public final C0111d f5234b;

    /* JADX INFO: renamed from: c */
    public final Handler f5235c;

    /* JADX INFO: renamed from: d */
    public final C1127c f5236d;

    /* JADX INFO: renamed from: e */
    public final C0649q f5237e;

    /* JADX INFO: renamed from: f */
    public final C1128d f5238f;

    /* JADX INFO: renamed from: g */
    public C1126b f5239g;

    /* JADX INFO: renamed from: h */
    public C0031d f5240h;

    /* JADX INFO: renamed from: i */
    public C0567c f5241i;

    /* JADX INFO: renamed from: j */
    public boolean f5242j;

    public C1129e(PlayerActivity playerActivity, C0111d c0111d, C0567c c0567c, C0031d c0031d) {
        Context applicationContext = playerActivity.getApplicationContext();
        this.f5233a = applicationContext;
        this.f5234b = c0111d;
        this.f5241i = c0567c;
        this.f5240h = c0031d;
        int i3 = AbstractC0632A.f2454a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.f5235c = handler;
        this.f5236d = AbstractC0632A.f2454a >= 23 ? new C1127c(this) : null;
        this.f5237e = new C0649q(2, this);
        C1126b c1126b = C1126b.f5224c;
        String str = AbstractC0632A.f2456c;
        Uri uriFor = ("Amazon".equals(str) || "Xiaomi".equals(str)) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f5238f = uriFor != null ? new C1128d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    /* JADX INFO: renamed from: a */
    public final void m3009a(C1126b c1126b) {
        C2040q c2040q;
        if (!this.f5242j || c1126b.equals(this.f5239g)) {
            return;
        }
        this.f5239g = c1126b;
        C1150z c1150z = (C1150z) this.f5234b.f148h;
        c1150z.getClass();
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = c1150z.f5379f0;
        if (looper != looperMyLooper) {
            String name = looper == null ? "null" : looper.getThread().getName();
            throw new IllegalStateException("Current looper (" + (looperMyLooper == null ? "null" : looperMyLooper.getThread().getName()) + ") is not the playback looper (" + name + ")");
        }
        if (c1126b.equals(c1150z.f5399w)) {
            return;
        }
        c1150z.f5399w = c1126b;
        C0031d c0031d = c1150z.f5394r;
        if (c0031d != null) {
            C1120B c1120b = (C1120B) c0031d.f38h;
            synchronized (c1120b.f3477g) {
                c2040q = c1120b.f3493w;
            }
            if (c2040q != null) {
                c2040q.m4616h();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3010b(AudioDeviceInfo audioDeviceInfo) {
        C0031d c0031d = this.f5240h;
        AudioDeviceInfo audioDeviceInfo2 = c0031d == null ? null : (AudioDeviceInfo) c0031d.f38h;
        int i3 = AbstractC0632A.f2454a;
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        C0031d c0031d2 = audioDeviceInfo != null ? new C0031d(27, audioDeviceInfo) : null;
        this.f5240h = c0031d2;
        m3009a(C1126b.m3005b(this.f5233a, this.f5241i, c0031d2));
    }
}
