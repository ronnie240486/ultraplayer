package p082b0;

import android.content.Context;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import p036M0.C0380q;
import p055T.AbstractC0547J;
import p055T.AbstractC0558V;
import p055T.C0556T;
import p055T.C0557U;
import p055T.C0583o;
import p055T.C0593y;
import p064W.AbstractC0632A;
import p114k0.C1907A;

/* JADX INFO: renamed from: b0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1069j {

    /* JADX INFO: renamed from: A */
    public boolean f4851A;

    /* JADX INFO: renamed from: a */
    public final Context f4852a;

    /* JADX INFO: renamed from: b */
    public final C1066g f4853b;

    /* JADX INFO: renamed from: c */
    public final PlaybackSession f4854c;

    /* JADX INFO: renamed from: i */
    public String f4860i;

    /* JADX INFO: renamed from: j */
    public PlaybackMetrics.Builder f4861j;

    /* JADX INFO: renamed from: k */
    public int f4862k;

    /* JADX INFO: renamed from: n */
    public AbstractC0547J f4865n;

    /* JADX INFO: renamed from: o */
    public C0380q f4866o;

    /* JADX INFO: renamed from: p */
    public C0380q f4867p;

    /* JADX INFO: renamed from: q */
    public C0380q f4868q;

    /* JADX INFO: renamed from: r */
    public C0583o f4869r;

    /* JADX INFO: renamed from: s */
    public C0583o f4870s;

    /* JADX INFO: renamed from: t */
    public C0583o f4871t;

    /* JADX INFO: renamed from: u */
    public boolean f4872u;

    /* JADX INFO: renamed from: v */
    public int f4873v;

    /* JADX INFO: renamed from: w */
    public boolean f4874w;

    /* JADX INFO: renamed from: x */
    public int f4875x;

    /* JADX INFO: renamed from: y */
    public int f4876y;

    /* JADX INFO: renamed from: z */
    public int f4877z;

    /* JADX INFO: renamed from: e */
    public final C0557U f4856e = new C0557U();

    /* JADX INFO: renamed from: f */
    public final C0556T f4857f = new C0556T();

    /* JADX INFO: renamed from: h */
    public final HashMap f4859h = new HashMap();

    /* JADX INFO: renamed from: g */
    public final HashMap f4858g = new HashMap();

    /* JADX INFO: renamed from: d */
    public final long f4855d = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: l */
    public int f4863l = 0;

    /* JADX INFO: renamed from: m */
    public int f4864m = 0;

    public C1069j(Context context, PlaybackSession playbackSession) {
        this.f4852a = context.getApplicationContext();
        this.f4854c = playbackSession;
        C1066g c1066g = new C1066g();
        this.f4853b = c1066g;
        c1066g.f4847d = this;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2900a(C0380q c0380q) {
        String str;
        if (c0380q == null) {
            return false;
        }
        String str2 = (String) c0380q.f1293j;
        C1066g c1066g = this.f4853b;
        synchronized (c1066g) {
            str = c1066g.f4849f;
        }
        return str2.equals(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m2901b() {
        PlaybackMetrics.Builder builder = this.f4861j;
        if (builder != null && this.f4851A) {
            builder.setAudioUnderrunCount(this.f4877z);
            this.f4861j.setVideoFramesDropped(this.f4875x);
            this.f4861j.setVideoFramesPlayed(this.f4876y);
            Long l3 = (Long) this.f4858g.get(this.f4860i);
            this.f4861j.setNetworkTransferDurationMillis(l3 == null ? 0L : l3.longValue());
            Long l4 = (Long) this.f4859h.get(this.f4860i);
            this.f4861j.setNetworkBytesRead(l4 == null ? 0L : l4.longValue());
            this.f4861j.setStreamSource((l4 == null || l4.longValue() <= 0) ? 0 : 1);
            this.f4854c.reportPlaybackMetrics(this.f4861j.build());
        }
        this.f4861j = null;
        this.f4860i = null;
        this.f4877z = 0;
        this.f4875x = 0;
        this.f4876y = 0;
        this.f4869r = null;
        this.f4870s = null;
        this.f4871t = null;
        this.f4851A = false;
    }

    /* JADX INFO: renamed from: c */
    public final void m2902c(AbstractC0558V abstractC0558V, C1907A c1907a) {
        int iMo1328b;
        PlaybackMetrics.Builder builder = this.f4861j;
        if (c1907a == null || (iMo1328b = abstractC0558V.mo1328b(c1907a.f8311a)) == -1) {
            return;
        }
        C0556T c0556t = this.f4857f;
        int i3 = 0;
        abstractC0558V.mo1329f(iMo1328b, c0556t, false);
        int i4 = c0556t.f1968c;
        C0557U c0557u = this.f4856e;
        abstractC0558V.m1414n(i4, c0557u);
        C0593y c0593y = c0557u.f1977c.f1875b;
        if (c0593y != null) {
            int iM1564E = AbstractC0632A.m1564E(c0593y.f2199a, c0593y.f2200b);
            if (iM1564E == 0) {
                i3 = 3;
            } else if (iM1564E != 1) {
                i3 = iM1564E != 2 ? 1 : 4;
            } else {
                i3 = 5;
            }
        }
        builder.setStreamType(i3);
        if (c0557u.f1987m != -9223372036854775807L && !c0557u.f1985k && !c0557u.f1983i && !c0557u.m1404a()) {
            builder.setMediaDurationMillis(AbstractC0632A.m1581V(c0557u.f1987m));
        }
        builder.setPlaybackType(c0557u.m1404a() ? 2 : 1);
        this.f4851A = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m2903d(C1060a c1060a, String str) {
        C1907A c1907a = c1060a.f4814d;
        if ((c1907a == null || !c1907a.m4422b()) && str.equals(this.f4860i)) {
            m2901b();
        }
        this.f4858g.remove(str);
        this.f4859h.remove(str);
    }

    /* JADX INFO: renamed from: e */
    public final void m2904e(int i3, long j3, C0583o c0583o, int i4) {
        int i5;
        TrackChangeEvent.Builder timeSinceCreatedMillis = AbstractC1067h.m2864n(i3).setTimeSinceCreatedMillis(j3 - this.f4855d);
        if (c0583o != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i4 != 1) {
                i5 = 3;
                if (i4 != 2) {
                    i5 = i4 != 3 ? 1 : 4;
                }
            } else {
                i5 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i5);
            String str = c0583o.f2153m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = c0583o.f2154n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = c0583o.f2151k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i6 = c0583o.f2150j;
            if (i6 != -1) {
                timeSinceCreatedMillis.setBitrate(i6);
            }
            int i7 = c0583o.f2161u;
            if (i7 != -1) {
                timeSinceCreatedMillis.setWidth(i7);
            }
            int i8 = c0583o.f2162v;
            if (i8 != -1) {
                timeSinceCreatedMillis.setHeight(i8);
            }
            int i9 = c0583o.f2130C;
            if (i9 != -1) {
                timeSinceCreatedMillis.setChannelCount(i9);
            }
            int i10 = c0583o.f2131D;
            if (i10 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i10);
            }
            String str4 = c0583o.f2144d;
            if (str4 != null) {
                int i11 = AbstractC0632A.f2454a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = c0583o.f2163w;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.f4851A = true;
        this.f4854c.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }
}
