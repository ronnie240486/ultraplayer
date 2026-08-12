package p028J1;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000A.C0031d;
import p013E1.C0135j;
import p013E1.C0142q;
import p019G1.AbstractC0232g;
import p019G1.C0233h;
import p019G1.C0245t;
import p019G1.C0246u;
import p034L1.C0352g;
import p075Z1.HandlerC0784e;

/* JADX INFO: renamed from: J1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0307m extends AbstractC0310p {

    /* JADX INFO: renamed from: x */
    public static final String f803x;

    /* JADX INFO: renamed from: e */
    public long f804e;

    /* JADX INFO: renamed from: f */
    public C0142q f805f;

    /* JADX INFO: renamed from: g */
    public Long f806g;

    /* JADX INFO: renamed from: h */
    public C0031d f807h;

    /* JADX INFO: renamed from: i */
    public int f808i;

    /* JADX INFO: renamed from: j */
    public final C0309o f809j;

    /* JADX INFO: renamed from: k */
    public final C0309o f810k;

    /* JADX INFO: renamed from: l */
    public final C0309o f811l;

    /* JADX INFO: renamed from: m */
    public final C0309o f812m;

    /* JADX INFO: renamed from: n */
    public final C0309o f813n;

    /* JADX INFO: renamed from: o */
    public final C0309o f814o;

    /* JADX INFO: renamed from: p */
    public final C0309o f815p;

    /* JADX INFO: renamed from: q */
    public final C0309o f816q;

    /* JADX INFO: renamed from: r */
    public final C0309o f817r;

    /* JADX INFO: renamed from: s */
    public final C0309o f818s;

    /* JADX INFO: renamed from: t */
    public final C0309o f819t;

    /* JADX INFO: renamed from: u */
    public final C0309o f820u;

    /* JADX INFO: renamed from: v */
    public final C0309o f821v;

    /* JADX INFO: renamed from: w */
    public final C0309o f822w;

    static {
        Pattern pattern = AbstractC0295a.f786a;
        f803x = "urn:x-cast:com.google.cast.media";
    }

    public C0307m() {
        super(f803x);
        this.f808i = -1;
        C0309o c0309o = new C0309o(86400000L, "load");
        this.f809j = c0309o;
        C0309o c0309o2 = new C0309o(86400000L, "pause");
        this.f810k = c0309o2;
        C0309o c0309o3 = new C0309o(86400000L, "play");
        this.f811l = c0309o3;
        C0309o c0309o4 = new C0309o(86400000L, "stop");
        this.f812m = c0309o4;
        C0309o c0309o5 = new C0309o(10000L, "seek");
        this.f813n = c0309o5;
        C0309o c0309o6 = new C0309o(86400000L, "volume");
        this.f814o = c0309o6;
        C0309o c0309o7 = new C0309o(86400000L, "mute");
        this.f815p = c0309o7;
        C0309o c0309o8 = new C0309o(86400000L, "status");
        this.f816q = c0309o8;
        C0309o c0309o9 = new C0309o(86400000L, "activeTracks");
        C0309o c0309o10 = new C0309o(86400000L, "trackStyle");
        C0309o c0309o11 = new C0309o(86400000L, "queueInsert");
        C0309o c0309o12 = new C0309o(86400000L, "queueUpdate");
        this.f817r = c0309o12;
        C0309o c0309o13 = new C0309o(86400000L, "queueRemove");
        this.f818s = c0309o13;
        C0309o c0309o14 = new C0309o(86400000L, "queueReorder");
        C0309o c0309o15 = new C0309o(86400000L, "queueFetchItemIds");
        this.f819t = c0309o15;
        C0309o c0309o16 = new C0309o(86400000L, "queueFetchItemRange");
        this.f821v = c0309o16;
        this.f820u = new C0309o(86400000L, "queueFetchItems");
        C0309o c0309o17 = new C0309o(86400000L, "setPlaybackRate");
        this.f822w = c0309o17;
        C0309o c0309o18 = new C0309o(86400000L, "skipAd");
        m855a(c0309o);
        m855a(c0309o2);
        m855a(c0309o3);
        m855a(c0309o4);
        m855a(c0309o5);
        m855a(c0309o6);
        m855a(c0309o7);
        m855a(c0309o8);
        m855a(c0309o9);
        m855a(c0309o10);
        m855a(c0309o11);
        m855a(c0309o12);
        m855a(c0309o13);
        m855a(c0309o14);
        m855a(c0309o15);
        m855a(c0309o16);
        m855a(c0309o16);
        m855a(c0309o17);
        m855a(c0309o18);
        m840g();
    }

    /* JADX INFO: renamed from: f */
    public static C0352g m836f(JSONObject jSONObject) {
        MediaError.m3073e(jSONObject);
        C0352g c0352g = new C0352g(6);
        Pattern pattern = AbstractC0295a.f786a;
        if (jSONObject.has("customData")) {
            jSONObject.optJSONObject("customData");
        }
        return c0352g;
    }

    /* JADX INFO: renamed from: m */
    public static int[] m837m(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            iArr[i3] = jSONArray.getInt(i3);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public final void m838d(InterfaceC0308n interfaceC0308n, int i3, long j3, int i4, Integer num) {
        int i5 = 1;
        if (j3 != -1 && j3 < 0) {
            throw new IllegalArgumentException("playPosition cannot be negative: " + j3);
        }
        JSONObject jSONObject = new JSONObject();
        long jM856b = m856b();
        try {
            jSONObject.put("requestId", jM856b);
            jSONObject.put("type", "QUEUE_UPDATE");
            jSONObject.put("mediaSessionId", m848p());
            if (i3 != 0) {
                jSONObject.put("currentItemId", i3);
            }
            if (i4 != 0) {
                jSONObject.put("jump", i4);
            }
            String strM3307b0 = AbstractC1303m.m3307b0(num);
            if (strM3307b0 != null) {
                jSONObject.put("repeatMode", strM3307b0);
            }
            if (j3 != -1) {
                Pattern pattern = AbstractC0295a.f786a;
                jSONObject.put("currentTime", j3 / 1000.0d);
            }
            int i6 = this.f808i;
            if (i6 != -1) {
                jSONObject.put("sequenceNumber", i6);
            }
        } catch (JSONException unused) {
        }
        m857c(jM856b, jSONObject.toString());
        this.f817r.m849a(jM856b, new C0305k(this, interfaceC0308n, i5));
    }

    /* JADX INFO: renamed from: e */
    public final long m839e(double d3, long j3, long j4) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f804e;
        if (jElapsedRealtime < 0) {
            jElapsedRealtime = 0;
        }
        if (jElapsedRealtime == 0) {
            return j3;
        }
        long j5 = j3 + ((long) (jElapsedRealtime * d3));
        if (j4 > 0 && j5 > j4) {
            return j4;
        }
        if (j5 >= 0) {
            return j5;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: g */
    public final void m840g() {
        this.f804e = 0L;
        this.f805f = null;
        Iterator it = this.f835d.iterator();
        while (it.hasNext()) {
            ((C0309o) it.next()).m854f(2002);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m841h(JSONObject jSONObject, String str) {
        if (jSONObject.has("sequenceNumber")) {
            this.f808i = jSONObject.optInt("sequenceNumber", -1);
        } else {
            C0296b c0296b = this.f832a;
            Log.w(c0296b.f788a, c0296b.m833d(str.concat(" message is missing a sequence number."), new Object[0]));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m842i() {
        C0031d c0031d = this.f807h;
        if (c0031d != null) {
            C0233h c0233h = (C0233h) c0031d.f38h;
            c0233h.getClass();
            Iterator it = c0233h.f609h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            Iterator it2 = c0233h.f610i.iterator();
            while (it2.hasNext()) {
                ((AbstractC0232g) it2.next()).mo651k();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m843j() {
        C0031d c0031d = this.f807h;
        if (c0031d != null) {
            C0233h c0233h = (C0233h) c0031d.f38h;
            Iterator it = c0233h.f609h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            Iterator it2 = c0233h.f610i.iterator();
            while (it2.hasNext()) {
                ((AbstractC0232g) it2.next()).mo652l();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m844k() {
        C0031d c0031d = this.f807h;
        if (c0031d != null) {
            C0233h c0233h = (C0233h) c0031d.f38h;
            Iterator it = c0233h.f609h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            Iterator it2 = c0233h.f610i.iterator();
            while (it2.hasNext()) {
                ((AbstractC0232g) it2.next()).mo653m();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m845l() {
        C0031d c0031d = this.f807h;
        if (c0031d != null) {
            C0233h c0233h = (C0233h) c0031d.f38h;
            c0233h.getClass();
            for (C0246u c0246u : c0233h.f612k.values()) {
                if (c0233h.m757g() && !c0246u.f643d) {
                    C0233h c0233h2 = c0246u.f644e;
                    HandlerC0784e handlerC0784e = c0233h2.f603b;
                    C0245t c0245t = c0246u.f642c;
                    handlerC0784e.removeCallbacks(c0245t);
                    c0246u.f643d = true;
                    c0233h2.f603b.postDelayed(c0245t, c0246u.f641b);
                } else if (!c0233h.m757g() && c0246u.f643d) {
                    c0246u.f644e.f603b.removeCallbacks(c0246u.f642c);
                    c0246u.f643d = false;
                }
                if (c0246u.f643d && (c0233h.m758h() || c0233h.m770u() || c0233h.m761k() || c0233h.m760j())) {
                    c0233h.m771v(c0246u.f640a);
                }
            }
            Iterator it = c0233h.f609h.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            Iterator it2 = c0233h.f610i.iterator();
            while (it2.hasNext()) {
                ((AbstractC0232g) it2.next()).mo654n();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m846n() {
        synchronized (this.f835d) {
            try {
                Iterator it = this.f835d.iterator();
                while (it.hasNext()) {
                    ((C0309o) it.next()).m854f(2002);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        m840g();
    }

    /* JADX INFO: renamed from: o */
    public final long m847o() {
        C0135j c0135j;
        C0142q c0142q = this.f805f;
        MediaInfo mediaInfo = c0142q == null ? null : c0142q.f304g;
        long jM839e = 0;
        if (mediaInfo != null && c0142q != null) {
            Long l3 = this.f806g;
            if (l3 != null) {
                if (l3.equals(4294967296000L)) {
                    C0142q c0142q2 = this.f805f;
                    if (c0142q2.f300A != null) {
                        long jLongValue = l3.longValue();
                        C0142q c0142q3 = this.f805f;
                        if (c0142q3 != null && (c0135j = c0142q3.f300A) != null) {
                            boolean z3 = c0135j.f255j;
                            long j3 = c0135j.f253h;
                            jM839e = !z3 ? m839e(1.0d, j3, -1L) : j3;
                        }
                        return Math.min(jLongValue, jM839e);
                    }
                    MediaInfo mediaInfo2 = c0142q2 == null ? null : c0142q2.f304g;
                    if ((mediaInfo2 != null ? mediaInfo2.f5448k : 0L) >= 0) {
                        long jLongValue2 = l3.longValue();
                        C0142q c0142q4 = this.f805f;
                        MediaInfo mediaInfo3 = c0142q4 != null ? c0142q4.f304g : null;
                        return Math.min(jLongValue2, mediaInfo3 != null ? mediaInfo3.f5448k : 0L);
                    }
                }
                return l3.longValue();
            }
            if (this.f804e != 0) {
                double d3 = c0142q.f307j;
                long j4 = c0142q.f310m;
                return (d3 == 0.0d || c0142q.f308k != 2) ? j4 : m839e(d3, j4, mediaInfo.f5448k);
            }
        }
        return 0L;
    }

    /* JADX INFO: renamed from: p */
    public final long m848p() throws C0306l {
        C0142q c0142q = this.f805f;
        if (c0142q != null) {
            return c0142q.f305h;
        }
        throw new C0306l();
    }
}
