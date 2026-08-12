package p019G1;

import android.os.Looper;
import android.os.SystemClock;
import android.support.v4.media.session.C0858A;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000A.C0031d;
import p013E1.C0119B;
import p013E1.C0125H;
import p013E1.C0140o;
import p013E1.C0142q;
import p013E1.InterfaceC0131f;
import p028J1.AbstractC0295a;
import p028J1.C0296b;
import p028J1.C0307m;
import p028J1.C0309o;
import p040N1.C0431l;
import p046P1.AbstractC0491s;
import p052S.C0531g;
import p075Z1.HandlerC0784e;
import p097f2.C1560d;

/* JADX INFO: renamed from: G1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0233h implements InterfaceC0131f {

    /* JADX INFO: renamed from: l */
    public static final C0296b f601l = new C0296b("RemoteMediaClient", null);

    /* JADX INFO: renamed from: c */
    public final C0307m f604c;

    /* JADX INFO: renamed from: d */
    public final C0858A f605d;

    /* JADX INFO: renamed from: e */
    public final C0228c f606e;

    /* JADX INFO: renamed from: f */
    public C0125H f607f;

    /* JADX INFO: renamed from: g */
    public C1560d f608g;

    /* JADX INFO: renamed from: h */
    public final CopyOnWriteArrayList f609h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i */
    public final CopyOnWriteArrayList f610i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f611j = new ConcurrentHashMap();

    /* JADX INFO: renamed from: k */
    public final ConcurrentHashMap f612k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final Object f602a = new Object();

    /* JADX INFO: renamed from: b */
    public final HandlerC0784e f603b = new HandlerC0784e(Looper.getMainLooper(), 3);

    static {
        String str = C0307m.f803x;
    }

    public C0233h(C0307m c0307m) {
        C0858A c0858a = new C0858A(this);
        this.f605d = c0858a;
        this.f604c = c0307m;
        c0307m.f807h = new C0031d(8, this);
        c0307m.f834c = c0858a;
        this.f606e = new C0228c(this);
    }

    /* JADX INFO: renamed from: r */
    public static C0243r m749r() {
        C0243r c0243r = new C0243r();
        c0243r.m3082I(new C0242q(new Status(17, null, null, null), 0));
        return c0243r;
    }

    /* JADX INFO: renamed from: x */
    public static final void m750x(AbstractC0244s abstractC0244s) {
        try {
            abstractC0244s.m777O();
        } catch (IllegalArgumentException e3) {
            throw e3;
        } catch (Throwable unused) {
            abstractC0244s.m3082I(new C0242q(new Status(2100, null, null, null), 1));
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m751a() {
        long jM847o;
        synchronized (this.f602a) {
            AbstractC0491s.m1210b();
            jM847o = this.f604c.m847o();
        }
        return jM847o;
    }

    /* JADX INFO: renamed from: b */
    public final C0140o m752b() {
        AbstractC0491s.m1210b();
        C0142q c0142qM754d = m754d();
        if (c0142qM754d == null) {
            return null;
        }
        return c0142qM754d.m599e(c0142qM754d.f315r);
    }

    /* JADX INFO: renamed from: c */
    public final MediaInfo m753c() {
        MediaInfo mediaInfo;
        synchronized (this.f602a) {
            AbstractC0491s.m1210b();
            C0142q c0142q = this.f604c.f805f;
            mediaInfo = c0142q == null ? null : c0142q.f304g;
        }
        return mediaInfo;
    }

    /* JADX INFO: renamed from: d */
    public final C0142q m754d() {
        C0142q c0142q;
        synchronized (this.f602a) {
            AbstractC0491s.m1210b();
            c0142q = this.f604c.f805f;
        }
        return c0142q;
    }

    /* JADX INFO: renamed from: e */
    public final int m755e() {
        int i3;
        synchronized (this.f602a) {
            AbstractC0491s.m1210b();
            C0142q c0142qM754d = m754d();
            i3 = c0142qM754d != null ? c0142qM754d.f308k : 1;
        }
        return i3;
    }

    /* JADX INFO: renamed from: f */
    public final long m756f() {
        long j3;
        synchronized (this.f602a) {
            AbstractC0491s.m1210b();
            C0142q c0142q = this.f604c.f805f;
            MediaInfo mediaInfo = c0142q == null ? null : c0142q.f304g;
            j3 = mediaInfo != null ? mediaInfo.f5448k : 0L;
        }
        return j3;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m757g() {
        AbstractC0491s.m1210b();
        return m758h() || m770u() || m762l() || m761k() || m760j();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m758h() {
        AbstractC0491s.m1210b();
        C0142q c0142qM754d = m754d();
        return c0142qM754d != null && c0142qM754d.f308k == 4;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m759i() {
        AbstractC0491s.m1210b();
        MediaInfo mediaInfoM753c = m753c();
        return mediaInfoM753c != null && mediaInfoM753c.f5445h == 2;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m760j() {
        AbstractC0491s.m1210b();
        C0142q c0142qM754d = m754d();
        return (c0142qM754d == null || c0142qM754d.f315r == 0) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m761k() {
        int i3;
        AbstractC0491s.m1210b();
        C0142q c0142qM754d = m754d();
        if (c0142qM754d != null) {
            if (c0142qM754d.f308k == 3) {
                return true;
            }
            if (m759i()) {
                synchronized (this.f602a) {
                    AbstractC0491s.m1210b();
                    C0142q c0142qM754d2 = m754d();
                    i3 = c0142qM754d2 != null ? c0142qM754d2.f309l : 0;
                }
                if (i3 == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m762l() {
        AbstractC0491s.m1210b();
        C0142q c0142qM754d = m754d();
        return c0142qM754d != null && c0142qM754d.f308k == 2;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m763m() {
        AbstractC0491s.m1210b();
        C0142q c0142qM754d = m754d();
        return c0142qM754d != null && c0142qM754d.f321x;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0097  */
    /* JADX WARN: Code duplicated, block: B:69:0x0149  */
    /* JADX INFO: renamed from: n */
    public final void m764n(String str) {
        byte b3;
        int i3;
        int iM600f;
        C0142q c0142q;
        int[] iArrM837m;
        byte b4;
        C0307m c0307m = this.f604c;
        C0309o c0309o = c0307m.f815p;
        C0309o c0309o2 = c0307m.f814o;
        C0296b c0296b = c0307m.f832a;
        c0296b.m831b("message received: %s", str);
        String str2 = c0296b.f788a;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("type");
            long jOptLong = jSONObject.optLong("requestId", -1L);
            switch (string) {
                case "LOAD_CANCELLED":
                    b3 = 3;
                    break;
                case "QUEUE_ITEMS":
                    b3 = 8;
                    break;
                case "INVALID_REQUEST":
                    b3 = 4;
                    break;
                case "LOAD_FAILED":
                    b3 = 2;
                    break;
                case "ERROR":
                    b3 = 5;
                    break;
                case "QUEUE_CHANGE":
                    b3 = 7;
                    break;
                case "INVALID_PLAYER_STATE":
                    b3 = 1;
                    break;
                case "MEDIA_STATUS":
                    b3 = 0;
                    break;
                case "QUEUE_ITEM_IDS":
                    b3 = 6;
                    break;
                default:
                    b3 = -1;
                    break;
            }
            C0309o c0309o3 = c0307m.f809j;
            List list = c0307m.f835d;
            switch (b3) {
                case 0:
                    JSONArray jSONArray = jSONObject.getJSONArray("status");
                    if (jSONArray.length() > 0) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                        boolean zM851c = c0309o3.m851c(jOptLong);
                        if (!c0309o2.m852d() || c0309o2.m851c(jOptLong)) {
                            i3 = (!c0309o.m852d() || c0309o.m851c(jOptLong)) ? 0 : 1;
                        }
                        if (zM851c || (c0142q = c0307m.f805f) == null) {
                            C0142q c0142q2 = new C0142q(null, 0L, 0, 0.0d, 0, 0, 0L, 0L, 0.0d, false, null, 0, 0, null, 0, null, false, null, null, null, null);
                            c0142q2.m600f(jSONObject2, 0);
                            c0307m.f805f = c0142q2;
                            c0307m.f804e = SystemClock.elapsedRealtime();
                            iM600f = 127;
                        } else {
                            iM600f = c0142q.m600f(jSONObject2, i3);
                        }
                        if ((iM600f & 1) != 0) {
                            c0307m.f804e = SystemClock.elapsedRealtime();
                            c0307m.f808i = -1;
                            c0307m.m845l();
                        }
                        if ((iM600f & 2) != 0) {
                            c0307m.f804e = SystemClock.elapsedRealtime();
                            c0307m.m845l();
                        }
                        if ((iM600f & 128) != 0) {
                            c0307m.f804e = SystemClock.elapsedRealtime();
                        }
                        if ((iM600f & 4) != 0) {
                            c0307m.m842i();
                        }
                        if ((iM600f & 8) != 0) {
                            c0307m.m844k();
                        }
                        if ((iM600f & 16) != 0) {
                            c0307m.m843j();
                        }
                        if ((iM600f & 32) != 0) {
                            c0307m.f804e = SystemClock.elapsedRealtime();
                            C0031d c0031d = c0307m.f807h;
                            if (c0031d != null) {
                                c0031d.m152B();
                            }
                        }
                        if ((iM600f & 64) != 0) {
                            c0307m.f804e = SystemClock.elapsedRealtime();
                            c0307m.m845l();
                        }
                    } else {
                        c0307m.f805f = null;
                        c0307m.m845l();
                        c0307m.m842i();
                        c0307m.m844k();
                        c0307m.m843j();
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C0309o) it.next()).m850b(jOptLong, 0, null);
                    }
                    break;
                case 1:
                    Log.w(str2, c0296b.m833d("received unexpected error: Invalid Player State.", new Object[0]));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((C0309o) it2.next()).m850b(jOptLong, 2100, C0307m.m836f(jSONObject));
                    }
                    break;
                case 2:
                    c0309o3.m850b(jOptLong, 2100, C0307m.m836f(jSONObject));
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    c0309o3.m850b(jOptLong, 2101, C0307m.m836f(jSONObject));
                    break;
                case 4:
                    Log.w(str2, c0296b.m833d("received unexpected error: Invalid Request.", new Object[0]));
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        ((C0309o) it3.next()).m850b(jOptLong, 2001, C0307m.m836f(jSONObject));
                    }
                    break;
                case 5:
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        ((C0309o) it4.next()).m850b(jOptLong, 2100, C0307m.m836f(jSONObject));
                    }
                    if (c0307m.f807h != null) {
                        MediaError.m3073e(jSONObject);
                        Iterator it5 = ((C0233h) c0307m.f807h.f38h).f610i.iterator();
                        while (it5.hasNext()) {
                            ((AbstractC0232g) it5.next()).getClass();
                        }
                    }
                    break;
                case 6:
                    c0307m.f819t.m850b(jOptLong, 0, null);
                    c0307m.m841h(jSONObject, "QUEUE_ITEM_IDS");
                    if (c0307m.f807h != null && (iArrM837m = C0307m.m837m(jSONObject.getJSONArray("itemIds"))) != null) {
                        Iterator it6 = ((C0233h) c0307m.f807h.f38h).f610i.iterator();
                        while (it6.hasNext()) {
                            ((AbstractC0232g) it6.next()).mo656p(iArrM837m);
                        }
                        break;
                    }
                    break;
                case 7:
                    c0307m.f821v.m850b(jOptLong, 0, null);
                    c0307m.m841h(jSONObject, "QUEUE_CHANGE");
                    if (c0307m.f807h != null) {
                        String string2 = jSONObject.getString("changeType");
                        int[] iArrM837m2 = C0307m.m837m(jSONObject.getJSONArray("itemIds"));
                        int iOptInt = jSONObject.optInt("insertBefore", 0);
                        if (iArrM837m2 != null) {
                            switch (string2) {
                                case "INSERT":
                                    b4 = 0;
                                    break;
                                case "REMOVE":
                                    b4 = 2;
                                    break;
                                case "UPDATE":
                                    b4 = 3;
                                    break;
                                case "ITEMS_CHANGE":
                                    b4 = 1;
                                    break;
                                default:
                                    b4 = -1;
                                    break;
                            }
                            if (b4 == 0) {
                                Iterator it7 = ((C0233h) c0307m.f807h.f38h).f610i.iterator();
                                while (it7.hasNext()) {
                                    ((AbstractC0232g) it7.next()).mo657q(iArrM837m2, iOptInt);
                                }
                                break;
                            } else if (b4 == 1) {
                                Iterator it8 = ((C0233h) c0307m.f807h.f38h).f610i.iterator();
                                while (it8.hasNext()) {
                                    ((AbstractC0232g) it8.next()).mo661u(iArrM837m2);
                                }
                                break;
                            } else if (b4 == 2) {
                                Iterator it9 = ((C0233h) c0307m.f807h.f38h).f610i.iterator();
                                while (it9.hasNext()) {
                                    ((AbstractC0232g) it9.next()).mo659s(iArrM837m2);
                                }
                                break;
                            } else if (b4 == 3) {
                                int[] iArrM837m3 = C0307m.m837m(jSONObject.getJSONArray("itemIds"));
                                AbstractC0491s.m1214f(iArrM837m3, "A list of item IDs is expected in a QUEUE UPDATE message.");
                                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("reorderItemIds");
                                if (jSONArrayOptJSONArray != null) {
                                    ArrayList arrayListM827d = AbstractC0295a.m827d(iArrM837m3);
                                    int iOptInt2 = jSONObject.optInt("insertBefore", 0);
                                    int[] iArrM837m4 = C0307m.m837m(jSONArrayOptJSONArray);
                                    AbstractC0491s.m1213e(iArrM837m4);
                                    ArrayList arrayListM827d2 = AbstractC0295a.m827d(iArrM837m4);
                                    Iterator it10 = ((C0233h) c0307m.f807h.f38h).f610i.iterator();
                                    while (it10.hasNext()) {
                                        ((AbstractC0232g) it10.next()).mo660t(arrayListM827d, arrayListM827d2, iOptInt2);
                                    }
                                } else {
                                    Iterator it11 = ((C0233h) c0307m.f807h.f38h).f610i.iterator();
                                    while (it11.hasNext()) {
                                        ((AbstractC0232g) it11.next()).mo656p(iArrM837m3);
                                    }
                                }
                                break;
                            }
                        }
                    }
                    break;
                case 8:
                    c0307m.f820u.m850b(jOptLong, 0, null);
                    c0307m.m841h(jSONObject, "QUEUE_ITEMS");
                    if (c0307m.f807h != null) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("items");
                        C0140o[] c0140oArr = new C0140o[jSONArray2.length()];
                        for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                            c0140oArr[i4] = new C0031d(jSONArray2.getJSONObject(i4)).m170r();
                        }
                        Iterator it12 = ((C0233h) c0307m.f807h.f38h).f610i.iterator();
                        while (it12.hasNext()) {
                            ((AbstractC0232g) it12.next()).mo658r(c0140oArr);
                        }
                    }
                    break;
            }
        } catch (JSONException e3) {
            Log.w(str2, c0296b.m833d("Message is malformed (%s); ignoring: %s", e3.getMessage(), str));
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m765o(AbstractC0232g abstractC0232g) {
        AbstractC0491s.m1210b();
        if (abstractC0232g != null) {
            this.f610i.add(abstractC0232g);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m766p() {
        AbstractC0491s.m1210b();
        int iM755e = m755e();
        if (iM755e == 4 || iM755e == 2) {
            AbstractC0491s.m1210b();
            if (m772w()) {
                m750x(new C0234i(this, 4));
                return;
            } else {
                m749r();
                return;
            }
        }
        AbstractC0491s.m1210b();
        if (m772w()) {
            m750x(new C0234i(this, 6));
        } else {
            m749r();
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m767q() {
        C0140o c0140oM752b;
        if (m753c() != null && m757g()) {
            if (m758h()) {
                return 6;
            }
            if (m762l()) {
                return 3;
            }
            if (m761k()) {
                return 2;
            }
            if (m760j() && (c0140oM752b = m752b()) != null && c0140oM752b.f290g != null) {
                return 6;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: s */
    public final void m768s() {
        C0125H c0125h = this.f607f;
        if (c0125h == null) {
            return;
        }
        AbstractC0491s.m1210b();
        String str = this.f604c.f833b;
        AbstractC0295a.m826c(str);
        synchronized (c0125h.f184B) {
            c0125h.f184B.put(str, this);
        }
        C0431l c0431lM1132b = C0431l.m1132b();
        c0431lM1132b.f1464d = new C0119B(c0125h, str, this);
        c0431lM1132b.f1463c = 8413;
        c0125h.m1079c(1, c0431lM1132b.m1133a());
        AbstractC0491s.m1210b();
        if (m772w()) {
            m750x(new C0234i(this, 0));
        } else {
            m749r();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m769t(C0125H c0125h) {
        InterfaceC0131f interfaceC0131f;
        C0125H c0125h2 = this.f607f;
        if (c0125h2 == c0125h) {
            return;
        }
        if (c0125h2 != null) {
            this.f604c.m846n();
            this.f606e.m718c();
            AbstractC0491s.m1210b();
            String str = this.f604c.f833b;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Channel namespace cannot be null or empty");
            }
            synchronized (c0125h2.f184B) {
                interfaceC0131f = (InterfaceC0131f) c0125h2.f184B.remove(str);
            }
            C0431l c0431lM1132b = C0431l.m1132b();
            c0431lM1132b.f1464d = new C0858A(c0125h2, interfaceC0131f, str, 5);
            c0431lM1132b.f1463c = 8414;
            c0125h2.m1079c(1, c0431lM1132b.m1133a());
            this.f605d.f3639h = null;
            this.f603b.removeCallbacksAndMessages(null);
        }
        this.f607f = c0125h;
        if (c0125h != null) {
            this.f605d.f3639h = c0125h;
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m770u() {
        AbstractC0491s.m1210b();
        C0142q c0142qM754d = m754d();
        return c0142qM754d != null && c0142qM754d.f308k == 5;
    }

    /* JADX INFO: renamed from: v */
    public final void m771v(HashSet hashSet) {
        HashSet<C0531g> hashSet2 = new HashSet(hashSet);
        if (m762l() || m761k() || m758h() || m770u()) {
            for (C0531g c0531g : hashSet2) {
                long jM751a = m751a();
                m756f();
                c0531g.f1816g.f1840v = jM751a;
            }
            return;
        }
        if (!m760j()) {
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                ((C0531g) it.next()).f1816g.f1840v = 0L;
            }
            return;
        }
        C0140o c0140oM752b = m752b();
        if (c0140oM752b == null || c0140oM752b.f290g == null) {
            return;
        }
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            ((C0531g) it2.next()).f1816g.f1840v = 0L;
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m772w() {
        return this.f607f != null;
    }
}
