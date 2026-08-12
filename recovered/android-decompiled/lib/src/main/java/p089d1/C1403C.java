package p089d1;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;
import p124n.C2018e;
import p168z.C2388b;

/* JADX INFO: renamed from: d1.C */
/* JADX INFO: loaded from: classes.dex */
public final class C1403C {

    /* JADX INFO: renamed from: a */
    public final C1402B f6216a;

    /* JADX INFO: renamed from: b */
    public final String f6217b;

    /* JADX INFO: renamed from: c */
    public final String f6218c;

    /* JADX INFO: renamed from: d */
    public String f6219d;

    /* JADX INFO: renamed from: e */
    public String f6220e;

    /* JADX INFO: renamed from: f */
    public Uri f6221f;

    /* JADX INFO: renamed from: g */
    public boolean f6222g;

    /* JADX INFO: renamed from: h */
    public final boolean f6223h;

    /* JADX INFO: renamed from: i */
    public int f6224i;

    /* JADX INFO: renamed from: j */
    public boolean f6225j;

    /* JADX INFO: renamed from: l */
    public int f6227l;

    /* JADX INFO: renamed from: m */
    public int f6228m;

    /* JADX INFO: renamed from: n */
    public int f6229n;

    /* JADX INFO: renamed from: o */
    public int f6230o;

    /* JADX INFO: renamed from: p */
    public int f6231p;

    /* JADX INFO: renamed from: q */
    public int f6232q;

    /* JADX INFO: renamed from: s */
    public Bundle f6234s;

    /* JADX INFO: renamed from: t */
    public IntentSender f6235t;

    /* JADX INFO: renamed from: u */
    public C1442o f6236u;

    /* JADX INFO: renamed from: w */
    public C2018e f6238w;

    /* JADX INFO: renamed from: k */
    public final ArrayList f6226k = new ArrayList();

    /* JADX INFO: renamed from: r */
    public int f6233r = -1;

    /* JADX INFO: renamed from: v */
    public ArrayList f6237v = new ArrayList();

    public C1403C(C1402B c1402b, String str, String str2, boolean z3) {
        this.f6216a = c1402b;
        this.f6217b = str;
        this.f6218c = str2;
        this.f6223h = z3;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC1446s m3491a() {
        C1405E.m3510b();
        AbstractC1448u abstractC1448u = C1405E.m3511c().f6334e;
        if (abstractC1448u instanceof AbstractC1446s) {
            return (AbstractC1446s) abstractC1448u;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final C1447t m3492b(C1403C c1403c) {
        if (c1403c == null) {
            throw new NullPointerException("route must not be null");
        }
        C2018e c2018e = this.f6238w;
        if (c2018e != null) {
            String str = c1403c.f6218c;
            if (c2018e.containsKey(str)) {
                return new C1447t(1, (C1445r) this.f6238w.getOrDefault(str, null));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC1449v m3493c() {
        C1402B c1402b = this.f6216a;
        c1402b.getClass();
        C1405E.m3510b();
        return c1402b.f6211a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3494d() {
        C1405E.m3510b();
        C1403C c1403c = C1405E.m3511c().f6351v;
        if (c1403c == null) {
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }
        if (c1403c == this || this.f6229n == 3) {
            return true;
        }
        return TextUtils.equals(((ComponentName) m3493c().f6408b.f6406h).getPackageName(), "android") && m3503m("android.media.intent.category.LIVE_AUDIO") && !m3503m("android.media.intent.category.LIVE_VIDEO");
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3495e() {
        return Collections.unmodifiableList(this.f6237v).size() >= 1;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3496f() {
        return this.f6236u != null && this.f6222g;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3497g() {
        C1405E.m3510b();
        return C1405E.m3511c().m3577e() == this;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3498h(C1451x c1451x) {
        if (c1451x == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        C1405E.m3510b();
        ArrayList arrayList = this.f6226k;
        if (arrayList != null) {
            c1451x.m3640a();
            if (!c1451x.f6418b.isEmpty()) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    IntentFilter intentFilter = (IntentFilter) obj;
                    if (intentFilter != null) {
                        Iterator it = c1451x.f6418b.iterator();
                        while (it.hasNext()) {
                            if (intentFilter.hasCategory((String) it.next())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final int m3499i(C1442o c1442o) {
        int i3;
        C1403C c1403c;
        int iCountActions;
        if (this.f6236u == c1442o) {
            return 0;
        }
        this.f6236u = c1442o;
        if (c1442o == null) {
            return 0;
        }
        String str = this.f6219d;
        Bundle bundle = c1442o.f6387a;
        if (Objects.equals(str, bundle.getString("name"))) {
            i3 = 0;
        } else {
            this.f6219d = bundle.getString("name");
            i3 = 1;
        }
        if (!Objects.equals(this.f6220e, bundle.getString("status"))) {
            this.f6220e = bundle.getString("status");
            i3 = 1;
        }
        Uri uri = this.f6221f;
        String string = bundle.getString("iconUri");
        if (!Objects.equals(uri, string == null ? null : Uri.parse(string))) {
            String string2 = bundle.getString("iconUri");
            this.f6221f = string2 == null ? null : Uri.parse(string2);
            i3 = 1;
        }
        if (this.f6222g != bundle.getBoolean("enabled", true)) {
            this.f6222g = bundle.getBoolean("enabled", true);
            i3 = 1;
        }
        if (this.f6224i != bundle.getInt("connectionState", 0)) {
            this.f6224i = bundle.getInt("connectionState", 0);
            i3 = 1;
        }
        ArrayList arrayList = this.f6226k;
        ArrayList arrayListM3608b = c1442o.m3608b();
        if (arrayList != arrayListM3608b) {
            if (arrayList != null) {
                ListIterator listIterator = arrayList.listIterator();
                ListIterator listIterator2 = arrayListM3608b.listIterator();
                while (true) {
                    if (listIterator.hasNext() && listIterator2.hasNext()) {
                        IntentFilter intentFilter = (IntentFilter) listIterator.next();
                        IntentFilter intentFilter2 = (IntentFilter) listIterator2.next();
                        if (intentFilter != intentFilter2) {
                            if (intentFilter != null && intentFilter2 != null && (iCountActions = intentFilter.countActions()) == intentFilter2.countActions()) {
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= iCountActions) {
                                        int iCountCategories = intentFilter.countCategories();
                                        if (iCountCategories == intentFilter2.countCategories()) {
                                            int i5 = 0;
                                            while (true) {
                                                if (i5 >= iCountCategories) {
                                                    continue;
                                                } else if (intentFilter.getCategory(i5).equals(intentFilter2.getCategory(i5))) {
                                                    i5++;
                                                }
                                            }
                                        }
                                    } else if (intentFilter.getAction(i4).equals(intentFilter2.getAction(i4))) {
                                        i4++;
                                    }
                                }
                            }
                        }
                    } else if (listIterator.hasNext() || listIterator2.hasNext()) {
                    }
                    arrayList.clear();
                    arrayList.addAll(c1442o.m3608b());
                    i3 = 1;
                }
            } else {
                arrayList.clear();
                arrayList.addAll(c1442o.m3608b());
                i3 = 1;
            }
        }
        if (this.f6227l != bundle.getInt("playbackType", 1)) {
            this.f6227l = bundle.getInt("playbackType", 1);
            i3 = 1;
        }
        if (this.f6228m != bundle.getInt("playbackStream", -1)) {
            this.f6228m = bundle.getInt("playbackStream", -1);
            i3 = 1;
        }
        if (this.f6229n != bundle.getInt("deviceType")) {
            this.f6229n = bundle.getInt("deviceType");
            i3 = 1;
        }
        int i6 = 3;
        if (this.f6230o != bundle.getInt("volumeHandling", 0)) {
            this.f6230o = bundle.getInt("volumeHandling", 0);
            i3 = 3;
        }
        if (this.f6231p != bundle.getInt("volume")) {
            this.f6231p = bundle.getInt("volume");
            i3 = 3;
        }
        if (this.f6232q != bundle.getInt("volumeMax")) {
            this.f6232q = bundle.getInt("volumeMax");
        } else {
            i6 = i3;
        }
        if (this.f6233r != bundle.getInt("presentationDisplayId", -1)) {
            this.f6233r = bundle.getInt("presentationDisplayId", -1);
            i6 |= 5;
        }
        if (!Objects.equals(this.f6234s, bundle.getBundle("extras"))) {
            this.f6234s = bundle.getBundle("extras");
            i6 |= 1;
        }
        if (!Objects.equals(this.f6235t, (IntentSender) bundle.getParcelable("settingsIntent"))) {
            this.f6235t = (IntentSender) bundle.getParcelable("settingsIntent");
            i6 |= 1;
        }
        if (this.f6225j != bundle.getBoolean("canDisconnect", false)) {
            this.f6225j = bundle.getBoolean("canDisconnect", false);
            i6 |= 5;
        }
        ArrayList arrayListM3609c = c1442o.m3609c();
        ArrayList arrayList2 = new ArrayList();
        boolean z3 = arrayListM3609c.size() != this.f6237v.size();
        if (!arrayListM3609c.isEmpty()) {
            C1433f c1433fM3511c = C1405E.m3511c();
            int size = arrayListM3609c.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayListM3609c.get(i7);
                i7++;
                c1433fM3511c.getClass();
                String str2 = (String) c1433fM3511c.f6340k.get(new C2388b(((ComponentName) this.f6216a.f6214d.f6406h).flattenToShortString(), (String) obj));
                ArrayList arrayList3 = c1433fM3511c.f6339j;
                int size2 = arrayList3.size();
                int i8 = 0;
                do {
                    if (i8 >= size2) {
                        c1403c = null;
                        break;
                    }
                    Object obj2 = arrayList3.get(i8);
                    i8++;
                    c1403c = (C1403C) obj2;
                } while (!c1403c.f6218c.equals(str2));
                if (c1403c != null) {
                    arrayList2.add(c1403c);
                    if (!z3 && !this.f6237v.contains(c1403c)) {
                        z3 = true;
                    }
                }
            }
        }
        if (!z3) {
            return i6;
        }
        this.f6237v = arrayList2;
        return i6 | 1;
    }

    /* JADX INFO: renamed from: j */
    public final void m3500j(int i3) {
        AbstractC1448u abstractC1448u;
        AbstractC1448u abstractC1448u2;
        C1405E.m3510b();
        C1433f c1433fM3511c = C1405E.m3511c();
        int iMin = Math.min(this.f6232q, Math.max(0, i3));
        if (this == c1433fM3511c.f6333d && (abstractC1448u2 = c1433fM3511c.f6334e) != null) {
            abstractC1448u2.mo3523f(iMin);
            return;
        }
        HashMap map = c1433fM3511c.f6331b;
        if (map.isEmpty() || (abstractC1448u = (AbstractC1448u) map.get(this.f6218c)) == null) {
            return;
        }
        abstractC1448u.mo3523f(iMin);
    }

    /* JADX INFO: renamed from: k */
    public final void m3501k(int i3) {
        AbstractC1448u abstractC1448u;
        AbstractC1448u abstractC1448u2;
        C1405E.m3510b();
        if (i3 != 0) {
            C1433f c1433fM3511c = C1405E.m3511c();
            if (this == c1433fM3511c.f6333d && (abstractC1448u2 = c1433fM3511c.f6334e) != null) {
                abstractC1448u2.mo3524i(i3);
                return;
            }
            HashMap map = c1433fM3511c.f6331b;
            if (map.isEmpty() || (abstractC1448u = (AbstractC1448u) map.get(this.f6218c)) == null) {
                return;
            }
            abstractC1448u.mo3524i(i3);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3502l() {
        C1405E.m3510b();
        C1405E.m3511c().m3581i(this, 3);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m3503m(String str) {
        C1405E.m3510b();
        ArrayList arrayList = this.f6226k;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            if (((IntentFilter) obj).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final void m3504n(ArrayList arrayList) {
        this.f6237v.clear();
        if (this.f6238w == null) {
            this.f6238w = new C2018e();
        }
        this.f6238w.clear();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            C1445r c1445r = (C1445r) obj;
            C1403C c1403cM3490a = this.f6216a.m3490a(c1445r.f6395a.m3610d());
            if (c1403cM3490a != null) {
                this.f6238w.put(c1403cM3490a.f6218c, c1445r);
                int i4 = c1445r.f6396b;
                if (i4 == 2 || i4 == 3) {
                    this.f6237v.add(c1403cM3490a);
                }
            }
        }
        C1405E.m3511c().f6330a.m3572b(259, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.f6218c);
        sb.append(", name=");
        sb.append(this.f6219d);
        sb.append(", description=");
        sb.append(this.f6220e);
        sb.append(", iconUri=");
        sb.append(this.f6221f);
        sb.append(", enabled=");
        sb.append(this.f6222g);
        sb.append(", isSystemRoute=");
        sb.append(this.f6223h);
        sb.append(", connectionState=");
        sb.append(this.f6224i);
        sb.append(", canDisconnect=");
        sb.append(this.f6225j);
        sb.append(", playbackType=");
        sb.append(this.f6227l);
        sb.append(", playbackStream=");
        sb.append(this.f6228m);
        sb.append(", deviceType=");
        sb.append(this.f6229n);
        sb.append(", volumeHandling=");
        sb.append(this.f6230o);
        sb.append(", volume=");
        sb.append(this.f6231p);
        sb.append(", volumeMax=");
        sb.append(this.f6232q);
        sb.append(", presentationDisplayId=");
        sb.append(this.f6233r);
        sb.append(", extras=");
        sb.append(this.f6234s);
        sb.append(", settingsIntent=");
        sb.append(this.f6235t);
        sb.append(", providerPackageName=");
        sb.append(((ComponentName) this.f6216a.f6214d.f6406h).getPackageName());
        if (m3495e()) {
            sb.append(", members=[");
            int size = this.f6237v.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                if (this.f6237v.get(i3) != this) {
                    sb.append(((C1403C) this.f6237v.get(i3)).f6218c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
