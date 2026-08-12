package p009D0;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.media.session.BinderC0871g;
import android.support.v4.media.session.C0858A;
import android.support.v4.media.session.C0872h;
import android.support.v4.media.session.C0873i;
import android.support.v4.media.session.C0876l;
import android.support.v4.media.session.C0877m;
import android.support.v4.media.session.C0878n;
import android.support.v4.media.session.C0879o;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.widget.EditText;
import androidx.emoji2.text.C0931u;
import androidx.emoji2.text.C0932v;
import androidx.emoji2.text.C0934x;
import androidx.emoji2.text.InterfaceC0923m;
import androidx.fragment.app.AbstractC0937C;
import androidx.fragment.app.AbstractComponentCallbacksC0963n;
import androidx.lifecycle.AbstractC0984I;
import androidx.lifecycle.C0985J;
import androidx.lifecycle.C0986K;
import androidx.lifecycle.InterfaceC1005r;
import androidx.mediarouter.app.C1048q;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.google.android.gms.internal.cast.BinderC1319q;
import com.google.android.gms.internal.cast.C1166D0;
import com.google.android.gms.internal.cast.C1311o;
import com.google.android.gms.internal.cast.C1335u;
import com.google.android.gms.internal.cast.EnumC1272e0;
import com.zuxoplayer.app.PlayerActivity;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p003B.AbstractC0080b;
import p014F.RunnableC0153b;
import p016F1.C0186c;
import p022H1.C0264h;
import p022H1.InterfaceC0257a;
import p026J.C0284a;
import p026J.C0292i;
import p028J1.AbstractC0295a;
import p028J1.C0296b;
import p034L1.C0349d;
import p034L1.C0352g;
import p036M0.C0367d;
import p037M1.C0391d;
import p038N.C0401a;
import p039N0.C0409e;
import p039N0.C0414j;
import p041O.C0446a;
import p043O1.C0448a;
import p045P0.AbstractC0462h;
import p045P0.C0464j;
import p045P0.InterfaceC0458d;
import p045P0.InterfaceC0465k;
import p046P1.AbstractC0491s;
import p048Q0.C0508g;
import p052S.C0533i;
import p055T.AbstractC0545H;
import p055T.C0539B;
import p055T.C0546I;
import p055T.C0582n;
import p055T.C0583o;
import p060U1.AbstractC0610a;
import p064W.AbstractC0632A;
import p064W.AbstractC0634b;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p064W.C0656x;
import p064W.InterfaceC0636d;
import p068X0.AbstractC0696i;
import p068X0.AbstractC0697j;
import p068X0.C0689b;
import p068X0.C0690c;
import p068X0.C0691d;
import p070Y.C0716m;
import p070Y.InterfaceC0710g;
import p070Y.InterfaceC0711h;
import p071Y0.C0733D;
import p071Y0.C0734E;
import p071Y0.C0736G;
import p071Y0.InterfaceC0732C;
import p089d1.C1402B;
import p089d1.C1405E;
import p089d1.C1406F;
import p089d1.C1427a0;
import p089d1.C1428b;
import p089d1.C1433f;
import p089d1.C1440m;
import p089d1.HandlerC1430c;
import p091e.AbstractActivityC1479j;
import p097f2.C1560d;
import p097f2.C1563g;
import p097f2.InterfaceC1557a;
import p124n.C2023j;
import p145s0.AbstractC2229b;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2235h;
import p145s0.InterfaceC2242o;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: D0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0106b implements InterfaceC0257a, InterfaceC1557a, InterfaceC0465k, InterfaceC0710g, InterfaceC2235h, InterfaceC0732C, InterfaceC0923m {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f139g;

    /* JADX INFO: renamed from: h */
    public Object f140h;

    /* JADX INFO: renamed from: i */
    public Object f141i;

    public /* synthetic */ C0106b(int i3, Object obj) {
        this.f139g = i3;
        this.f140h = obj;
    }

    /* JADX INFO: renamed from: K */
    public static String m502K(C0106b c0106b) {
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) c0106b.f140h;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
            sb.append("/");
            sb.append(upperCase);
        }
        List<String> list = (List) c0106b.f141i;
        if (list != null) {
            if (list.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (str == null) {
                sb.append("/");
            }
            sb.append("/");
            boolean z3 = true;
            for (String string : list) {
                AbstractC0295a.m826c(string);
                if (!z3) {
                    sb.append(",");
                }
                if (!AbstractC0295a.f786a.matcher(string).matches()) {
                    StringBuilder sb2 = new StringBuilder(string.length());
                    for (int i3 = 0; i3 < string.length(); i3++) {
                        char cCharAt = string.charAt(i3);
                        if ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '_' || cCharAt == '-' || cCharAt == '.' || cCharAt == ':'))) {
                            sb2.append(String.format("%%%04x", Integer.valueOf(cCharAt)));
                        } else {
                            sb2.append(cCharAt);
                        }
                    }
                    string = sb2.toString();
                }
                sb.append(string);
                z3 = false;
            }
        }
        if (str == null && list == null) {
            sb.append("/");
        }
        if (list == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }

    /* JADX INFO: renamed from: A */
    public void m503A(boolean z3) {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = ((AbstractC0937C) this.f141i).f4085v;
        if (abstractComponentCallbacksC0963n != null) {
            abstractComponentCallbacksC0963n.m2536j().f4075l.m503A(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f140h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: B */
    public void m504B(boolean z3) {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = ((AbstractC0937C) this.f141i).f4085v;
        if (abstractComponentCallbacksC0963n != null) {
            abstractComponentCallbacksC0963n.m2536j().f4075l.m504B(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f140h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: C */
    public void m505C(boolean z3) {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = ((AbstractC0937C) this.f141i).f4085v;
        if (abstractComponentCallbacksC0963n != null) {
            abstractComponentCallbacksC0963n.m2536j().f4075l.m505C(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f140h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: D */
    public void m506D(String str, PrintWriter printWriter) {
        C2023j c2023j = ((C0446a) this.f141i).f1507c;
        if (c2023j.f8795i > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (c2023j.f8795i <= 0) {
                return;
            }
            if (c2023j.f8794h[0] != null) {
                throw new ClassCastException();
            }
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c2023j.f8793g[0]);
            printWriter.print(": ");
            throw null;
        }
    }

    /* JADX INFO: renamed from: E */
    public synchronized Map m507E() {
        try {
            if (((Map) this.f141i) == null) {
                this.f141i = Collections.unmodifiableMap(new HashMap((HashMap) this.f140h));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f141i;
    }

    /* JADX INFO: renamed from: F */
    public C0876l m508F() {
        MediaController.TransportControls transportControls = ((C0872h) this.f140h).f3686a.getTransportControls();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            return new C0879o(transportControls);
        }
        if (i3 >= 24) {
            return new C0878n(transportControls);
        }
        return i3 >= 23 ? new C0877m(transportControls) : new C0876l(transportControls);
    }

    /* JADX INFO: renamed from: G */
    public void m509G(C1048q c1048q) {
        if (c1048q == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.f141i).add(c1048q)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        c1048q.m2651f(handler);
        C0872h c0872h = (C0872h) this.f140h;
        c0872h.f3686a.registerCallback(c1048q.f4598a, handler);
        synchronized (c0872h.f3687b) {
            if (c0872h.f3690e.m2214d() != null) {
                BinderC0871g binderC0871g = new BinderC0871g(c1048q);
                c0872h.f3689d.put(c1048q, binderC0871g);
                c1048q.f4600c = binderC0871g;
                try {
                    c0872h.f3690e.m2214d().mo2229p(binderC0871g);
                    c1048q.m2650e(13, null, null);
                } catch (RemoteException e3) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e3);
                }
            } else {
                c1048q.f4600c = null;
                c0872h.f3688c.add(c1048q);
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public void m510H(C1048q c1048q) {
        if (c1048q == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.f141i).remove(c1048q)) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            ((C0872h) this.f140h).m2273b(c1048q);
        } finally {
            c1048q.m2651f(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    /* JADX INFO: renamed from: I */
    public void m511I(int i3, C0539B c0539b, MediaInfo mediaInfo, String str, long j3) {
        long jM1571L;
        boolean z3;
        C0539B c0539b2;
        String str2;
        SparseArray sparseArray = (SparseArray) this.f140h;
        C0533i c0533i = (C0533i) sparseArray.get(i3, C0533i.f1845f);
        if (mediaInfo == null) {
            jM1571L = -9223372036854775807L;
        } else {
            long j4 = mediaInfo.f5448k;
            if (j4 != -1) {
                jM1571L = AbstractC0632A.m1571L(j4);
            } else {
                jM1571L = -9223372036854775807L;
            }
        }
        if (jM1571L == -9223372036854775807L) {
            jM1571L = c0533i.f1846a;
        }
        long j5 = jM1571L;
        if (mediaInfo == null) {
            z3 = c0533i.f1848c;
        } else {
            z3 = mediaInfo.f5445h == 2;
        }
        long j6 = j3 == -9223372036854775807L ? c0533i.f1847b : j3;
        if (j5 == c0533i.f1846a && j6 == c0533i.f1847b && z3 == c0533i.f1848c) {
            str2 = str;
            if (str2.equals(c0533i.f1850e)) {
                c0539b2 = c0539b;
                if (!c0539b2.equals(c0533i.f1849d)) {
                }
                sparseArray.put(i3, c0533i);
            }
            c0539b2 = c0539b;
        } else {
            c0539b2 = c0539b;
            str2 = str;
        }
        c0533i = new C0533i(j5, j6, z3, c0539b2, str2);
        sparseArray.put(i3, c0533i);
    }

    /* JADX INFO: renamed from: J */
    public void m512J(boolean z3, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (((Map) this.f140h)) {
            map = new HashMap((Map) this.f140h);
        }
        synchronized (((Map) this.f141i)) {
            map2 = new HashMap((Map) this.f141i);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z3 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m3079F(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z3 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C1560d) entry2.getKey()).m3880c(new C0391d(status));
            }
        }
    }

    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo514b() {
    }

    @Override // p071Y0.InterfaceC0732C
    /* JADX INFO: renamed from: c */
    public void mo515c(C0651s c0651s) {
        C0734E c0734e;
        if (c0651s.m1687u() == 0 && (c0651s.m1687u() & 128) != 0) {
            c0651s.m1666H(6);
            int iM1667a = c0651s.m1667a() / 4;
            int i3 = 0;
            while (true) {
                c0734e = (C0734E) this.f141i;
                if (i3 >= iM1667a) {
                    break;
                }
                C0508g c0508g = (C0508g) this.f140h;
                c0651s.m1671e(c0508g.f1731b, 0, 4);
                c0508g.m1260q(0);
                int iM1252i = c0508g.m1252i(16);
                c0508g.m1263t(3);
                if (iM1252i == 0) {
                    c0508g.m1263t(13);
                } else {
                    int iM1252i2 = c0508g.m1252i(13);
                    if (c0734e.f2817h.get(iM1252i2) == null) {
                        SparseArray sparseArray = c0734e.f2817h;
                        C0414j c0414j = new C0414j();
                        c0414j.f1411k = c0734e;
                        c0414j.f1408h = new C0508g(new byte[5], 5);
                        c0414j.f1409i = new SparseArray();
                        c0414j.f1410j = new SparseIntArray();
                        c0414j.f1407g = iM1252i2;
                        sparseArray.put(iM1252i2, new C0733D(c0414j));
                        c0734e.f2823n++;
                    }
                }
                i3++;
            }
            if (c0734e.f2810a != 2) {
                c0734e.f2817h.remove(0);
            }
        }
    }

    @Override // androidx.emoji2.text.InterfaceC0923m
    /* JADX INFO: renamed from: d */
    public Object mo516d() {
        return (C0934x) this.f140h;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:39:0x00e3
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // p145s0.InterfaceC2235h
    /* JADX INFO: renamed from: e */
    public p145s0.C2234g mo517e(p145s0.C2237j r17, long r18) {
        /*
            Method dump skipped, instruction units count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p009D0.C0106b.mo517e(s0.j, long):s0.g");
    }

    @Override // p070Y.InterfaceC0710g
    /* JADX INFO: renamed from: f */
    public InterfaceC0711h mo518f() {
        return new C0716m((Context) this.f140h, ((C0409e) this.f141i).mo518f());
    }

    @Override // androidx.emoji2.text.InterfaceC0923m
    /* JADX INFO: renamed from: g */
    public boolean mo519g(CharSequence charSequence, int i3, int i4, C0931u c0931u) {
        if ((c0931u.f4041c & 4) > 0) {
            return true;
        }
        if (((C0934x) this.f140h) == null) {
            this.f140h = new C0934x(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C0352g) this.f141i).getClass();
        ((C0934x) this.f140h).setSpan(new C0932v(c0931u), i3, i4, 33);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0251  */
    /* JADX WARN: Code duplicated, block: B:129:0x025c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0265  */
    /* JADX WARN: Code duplicated, block: B:132:0x026f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0277  */
    /* JADX WARN: Code duplicated, block: B:136:0x027f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0283  */
    /* JADX WARN: Code duplicated, block: B:139:0x028b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0290  */
    /* JADX WARN: Code duplicated, block: B:142:0x0298  */
    /* JADX WARN: Code duplicated, block: B:148:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:150:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:154:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:155:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:157:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:158:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:160:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:163:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:165:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:167:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:169:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:171:0x0306  */
    /* JADX WARN: Code duplicated, block: B:173:0x0316  */
    /* JADX WARN: Code duplicated, block: B:174:0x032f  */
    /* JADX WARN: Code duplicated, block: B:177:0x0340  */
    /* JADX WARN: Code duplicated, block: B:180:0x0349  */
    /* JADX WARN: Code duplicated, block: B:181:0x034b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0354  */
    /* JADX WARN: Code duplicated, block: B:185:0x0356  */
    /* JADX WARN: Code duplicated, block: B:188:0x035f  */
    /* JADX WARN: Code duplicated, block: B:192:0x0369  */
    /* JADX WARN: Code duplicated, block: B:193:0x036e  */
    /* JADX WARN: Code duplicated, block: B:194:0x0373  */
    /* JADX WARN: Code duplicated, block: B:196:0x0386  */
    /* JADX WARN: Code duplicated, block: B:237:0x0363 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ae  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Instruction removed from duplicated block: B:173:0x0316, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: h */
    public void mo520h(byte[] bArr, int i3, int i4, C0464j c0464j, InterfaceC0636d interfaceC0636d) {
        C0691d c0691dM1819d;
        String strTrim;
        String str;
        String string;
        Matcher matcher;
        String strGroup;
        byte b3;
        int i5;
        boolean z3;
        String strSubstring;
        C0106b c0106b = this;
        int i6 = 2;
        boolean z4 = false;
        int i7 = -1;
        int i8 = 1;
        C0651s c0651s = (C0651s) c0106b.f140h;
        c0651s.m1663E(bArr, i3 + i4);
        c0651s.m1665G(i3);
        ArrayList arrayList = new ArrayList();
        try {
            AbstractC0697j.m1826d(c0651s);
            while (!TextUtils.isEmpty(c0651s.m1674h(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int i9 = -1;
                int i10 = 0;
                while (i9 == i7) {
                    i10 = c0651s.f2521b;
                    String strM1674h = c0651s.m1674h(StandardCharsets.UTF_8);
                    if (strM1674h == null) {
                        i9 = 0;
                    } else if ("STYLE".equals(strM1674h)) {
                        i9 = 2;
                    } else {
                        i9 = strM1674h.startsWith("NOTE") ? 1 : 3;
                    }
                }
                c0651s.m1665G(i10);
                if (i9 == 0) {
                    AbstractC0610a.m1497K(new C0858A(arrayList2), c0464j, interfaceC0636d);
                    return;
                }
                if (i9 == i8) {
                    while (!TextUtils.isEmpty(c0651s.m1674h(StandardCharsets.UTF_8))) {
                    }
                } else {
                    String str2 = null;
                    if (i9 == i6) {
                        if (!arrayList2.isEmpty()) {
                            throw new IllegalArgumentException("A style block was found after the first cue.");
                        }
                        c0651s.m1674h(StandardCharsets.UTF_8);
                        C0689b c0689b = (C0689b) c0106b.f141i;
                        StringBuilder sb = c0689b.f2645b;
                        sb.setLength(z4 ? 1 : 0);
                        int i11 = c0651s.f2521b;
                        while (!TextUtils.isEmpty(c0651s.m1674h(StandardCharsets.UTF_8))) {
                        }
                        byte[] bArr2 = c0651s.f2520a;
                        int i12 = c0651s.f2521b;
                        C0651s c0651s2 = c0689b.f2644a;
                        c0651s2.m1663E(bArr2, i12);
                        c0651s2.m1665G(i11);
                        ArrayList arrayList3 = new ArrayList();
                        ?? r3 = z4;
                        while (true) {
                            C0689b.m1813c(c0651s2);
                            if (c0651s2.m1667a() >= 5 && "::cue".equals(c0651s2.m1685s(5, StandardCharsets.UTF_8))) {
                                int i13 = c0651s2.f2521b;
                                String strM1812b = C0689b.m1812b(c0651s2, sb);
                                if (strM1812b == null) {
                                    str = str2;
                                } else if ("{".equals(strM1812b)) {
                                    c0651s2.m1665G(i13);
                                    str = "";
                                } else {
                                    if ("(".equals(strM1812b)) {
                                        int i14 = c0651s2.f2521b;
                                        int i15 = c0651s2.f2522c;
                                        boolean z5 = false;
                                        while (i14 < i15 && !z5) {
                                            int i16 = i14 + 1;
                                            z5 = ((char) c0651s2.f2520a[i14]) == ')';
                                            i14 = i16;
                                        }
                                        strTrim = c0651s2.m1685s((i14 + i7) - c0651s2.f2521b, StandardCharsets.UTF_8).trim();
                                    } else {
                                        strTrim = str2;
                                    }
                                    str = strTrim;
                                    if (!")".equals(C0689b.m1812b(c0651s2, sb))) {
                                        str = str2;
                                    }
                                }
                            } else {
                                str = str2;
                            }
                            if (str != 0 && "{".equals(C0689b.m1812b(c0651s2, sb))) {
                                C0690c c0690c = new C0690c();
                                c0690c.f2646a = "";
                                c0690c.f2647b = "";
                                c0690c.f2648c = Collections.EMPTY_SET;
                                c0690c.f2649d = "";
                                c0690c.f2650e = str2;
                                c0690c.f2652g = r3;
                                c0690c.f2654i = r3;
                                c0690c.f2655j = i7;
                                c0690c.f2656k = i7;
                                c0690c.f2657l = i7;
                                c0690c.f2658m = i7;
                                c0690c.f2659n = i7;
                                c0690c.f2661p = i7;
                                c0690c.f2662q = r3;
                                if (!"".equals(str)) {
                                    int iIndexOf = str.indexOf(91);
                                    if (iIndexOf != i7) {
                                        Matcher matcher2 = C0689b.f2642c.matcher(str.substring(iIndexOf));
                                        if (matcher2.matches()) {
                                            strSubstring = str;
                                            String strGroup2 = matcher2.group(i8);
                                            strGroup2.getClass();
                                            c0690c.f2649d = strGroup2;
                                        }
                                        strSubstring = str;
                                        strSubstring = str.substring(r3, iIndexOf);
                                    }
                                    strSubstring = str;
                                    int i17 = AbstractC0632A.f2454a;
                                    String[] strArrSplit = strSubstring.split("\\.", i7);
                                    String str3 = strArrSplit[r3];
                                    int iIndexOf2 = str3.indexOf(35);
                                    if (iIndexOf2 != i7) {
                                        c0690c.f2647b = str3.substring(r3, iIndexOf2);
                                        c0690c.f2646a = str3.substring(iIndexOf2 + i8);
                                    } else {
                                        c0690c.f2647b = str3;
                                    }
                                    if (strArrSplit.length > i8) {
                                        int length = strArrSplit.length;
                                        AbstractC0646n.m1625c(length <= strArrSplit.length);
                                        c0690c.f2648c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, i8, length)));
                                    }
                                }
                                boolean z6 = false;
                                String strM1812b2 = null;
                                while (!z6) {
                                    int i18 = c0651s2.f2521b;
                                    strM1812b2 = C0689b.m1812b(c0651s2, sb);
                                    boolean z7 = strM1812b2 == null || "}".equals(strM1812b2);
                                    if (!z7) {
                                        c0651s2.m1665G(i18);
                                        C0689b.m1813c(c0651s2);
                                        String strM1811a = C0689b.m1811a(c0651s2, sb);
                                        if (!"".equals(strM1811a) && ":".equals(C0689b.m1812b(c0651s2, sb))) {
                                            C0689b.m1813c(c0651s2);
                                            StringBuilder sb2 = new StringBuilder();
                                            boolean z8 = false;
                                            while (true) {
                                                if (z8) {
                                                    string = sb2.toString();
                                                } else {
                                                    int i19 = c0651s2.f2521b;
                                                    boolean z9 = z8;
                                                    String strM1812b3 = C0689b.m1812b(c0651s2, sb);
                                                    if (strM1812b3 == null) {
                                                        string = null;
                                                    } else if ("}".equals(strM1812b3) || ";".equals(strM1812b3)) {
                                                        c0651s2.m1665G(i19);
                                                        z8 = true;
                                                    } else {
                                                        sb2.append(strM1812b3);
                                                        z8 = z9;
                                                    }
                                                }
                                            }
                                            if (string != null && !"".equals(string)) {
                                                int i20 = c0651s2.f2521b;
                                                String strM1812b4 = C0689b.m1812b(c0651s2, sb);
                                                if (";".equals(strM1812b4)) {
                                                    if ("color".equals(strM1811a)) {
                                                        c0690c.f2651f = AbstractC0634b.m1610a(string, true);
                                                        c0690c.f2652g = true;
                                                    } else if ("background-color".equals(strM1811a)) {
                                                        c0690c.f2653h = AbstractC0634b.m1610a(string, true);
                                                        c0690c.f2654i = true;
                                                    } else if ("ruby-position".equals(strM1811a)) {
                                                        if ("over".equals(string)) {
                                                            c0690c.f2661p = 1;
                                                        } else if ("under".equals(string)) {
                                                            c0690c.f2661p = 2;
                                                        }
                                                    } else if ("text-combine-upright".equals(strM1811a)) {
                                                        if ("all".equals(string)) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        c0690c.f2662q = z3;
                                                    } else if ("text-decoration".equals(strM1811a)) {
                                                        if ("underline".equals(string)) {
                                                            c0690c.f2656k = 1;
                                                        }
                                                    } else if ("font-family".equals(strM1811a)) {
                                                        c0690c.f2650e = AbstractC1303m.m3288K(string);
                                                    } else if ("font-weight".equals(strM1811a)) {
                                                        if ("bold".equals(string)) {
                                                            c0690c.f2657l = 1;
                                                        }
                                                    } else if ("font-style".equals(strM1811a)) {
                                                        if ("italic".equals(string)) {
                                                            c0690c.f2658m = 1;
                                                        }
                                                    } else if ("font-size".equals(strM1811a)) {
                                                        matcher = C0689b.f2643d.matcher(AbstractC1303m.m3288K(string));
                                                        if (matcher.matches()) {
                                                            strGroup = matcher.group(2);
                                                            strGroup.getClass();
                                                            switch (strGroup.hashCode()) {
                                                                case 37:
                                                                    if (!strGroup.equals("%")) {
                                                                        b3 = 0;
                                                                    }
                                                                    switch (b3) {
                                                                        case 0:
                                                                            i5 = 1;
                                                                            c0690c.f2659n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i5 = 1;
                                                                            c0690c.f2659n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i5 = 1;
                                                                            c0690c.f2659n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup3 = matcher.group(i5);
                                                                    strGroup3.getClass();
                                                                    c0690c.f2660o = Float.parseFloat(strGroup3);
                                                                    break;
                                                                case 3240:
                                                                    if (!strGroup.equals("em")) {
                                                                        b3 = 1;
                                                                    }
                                                                    switch (b3) {
                                                                        case 0:
                                                                            i5 = 1;
                                                                            c0690c.f2659n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i5 = 1;
                                                                            c0690c.f2659n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i5 = 1;
                                                                            c0690c.f2659n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup4 = matcher.group(i5);
                                                                    strGroup4.getClass();
                                                                    c0690c.f2660o = Float.parseFloat(strGroup4);
                                                                    break;
                                                                case 3592:
                                                                    if (!strGroup.equals("px")) {
                                                                        b3 = 2;
                                                                    }
                                                                    switch (b3) {
                                                                        case 0:
                                                                            i5 = 1;
                                                                            c0690c.f2659n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i5 = 1;
                                                                            c0690c.f2659n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i5 = 1;
                                                                            c0690c.f2659n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup5 = matcher.group(i5);
                                                                    strGroup5.getClass();
                                                                    c0690c.f2660o = Float.parseFloat(strGroup5);
                                                                    break;
                                                            }
                                                            b3 = -1;
                                                            switch (b3) {
                                                                case 0:
                                                                    i5 = 1;
                                                                    c0690c.f2659n = 3;
                                                                    break;
                                                                case 1:
                                                                    i5 = 1;
                                                                    c0690c.f2659n = 2;
                                                                    break;
                                                                case 2:
                                                                    i5 = 1;
                                                                    c0690c.f2659n = 1;
                                                                    break;
                                                                default:
                                                                    throw new IllegalStateException();
                                                            }
                                                            String strGroup6 = matcher.group(i5);
                                                            strGroup6.getClass();
                                                            c0690c.f2660o = Float.parseFloat(strGroup6);
                                                        } else {
                                                            AbstractC0646n.m1647y("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                        }
                                                    }
                                                } else if ("}".equals(strM1812b4)) {
                                                    c0651s2.m1665G(i20);
                                                    if ("color".equals(strM1811a)) {
                                                        c0690c.f2651f = AbstractC0634b.m1610a(string, true);
                                                        c0690c.f2652g = true;
                                                    } else if ("background-color".equals(strM1811a)) {
                                                        c0690c.f2653h = AbstractC0634b.m1610a(string, true);
                                                        c0690c.f2654i = true;
                                                    } else if ("ruby-position".equals(strM1811a)) {
                                                        if ("over".equals(string)) {
                                                            c0690c.f2661p = 1;
                                                        } else if ("under".equals(string)) {
                                                            c0690c.f2661p = 2;
                                                        }
                                                    } else if ("text-combine-upright".equals(strM1811a)) {
                                                        if ("all".equals(string) || string.startsWith("digits")) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                        c0690c.f2662q = z3;
                                                    } else if ("text-decoration".equals(strM1811a)) {
                                                        if ("underline".equals(string)) {
                                                            c0690c.f2656k = 1;
                                                        }
                                                    } else if ("font-family".equals(strM1811a)) {
                                                        c0690c.f2650e = AbstractC1303m.m3288K(string);
                                                    } else if ("font-weight".equals(strM1811a)) {
                                                        if ("bold".equals(string)) {
                                                            c0690c.f2657l = 1;
                                                        }
                                                    } else if ("font-style".equals(strM1811a)) {
                                                        if ("italic".equals(string)) {
                                                            c0690c.f2658m = 1;
                                                        }
                                                    } else if ("font-size".equals(strM1811a)) {
                                                        matcher = C0689b.f2643d.matcher(AbstractC1303m.m3288K(string));
                                                        if (matcher.matches()) {
                                                            AbstractC0646n.m1647y("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                        } else {
                                                            strGroup = matcher.group(2);
                                                            strGroup.getClass();
                                                            switch (strGroup.hashCode()) {
                                                                case 37:
                                                                    if (!strGroup.equals("%")) {
                                                                        b3 = 0;
                                                                    }
                                                                    switch (b3) {
                                                                        case 0:
                                                                            i5 = 1;
                                                                            c0690c.f2659n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i5 = 1;
                                                                            c0690c.f2659n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i5 = 1;
                                                                            c0690c.f2659n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup7 = matcher.group(i5);
                                                                    strGroup7.getClass();
                                                                    c0690c.f2660o = Float.parseFloat(strGroup7);
                                                                    break;
                                                                case 3240:
                                                                    if (!strGroup.equals("em")) {
                                                                        b3 = 1;
                                                                    }
                                                                    switch (b3) {
                                                                        case 0:
                                                                            i5 = 1;
                                                                            c0690c.f2659n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i5 = 1;
                                                                            c0690c.f2659n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i5 = 1;
                                                                            c0690c.f2659n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup8 = matcher.group(i5);
                                                                    strGroup8.getClass();
                                                                    c0690c.f2660o = Float.parseFloat(strGroup8);
                                                                    break;
                                                                case 3592:
                                                                    if (!strGroup.equals("px")) {
                                                                        b3 = 2;
                                                                    }
                                                                    switch (b3) {
                                                                        case 0:
                                                                            i5 = 1;
                                                                            c0690c.f2659n = 3;
                                                                            break;
                                                                        case 1:
                                                                            i5 = 1;
                                                                            c0690c.f2659n = 2;
                                                                            break;
                                                                        case 2:
                                                                            i5 = 1;
                                                                            c0690c.f2659n = 1;
                                                                            break;
                                                                        default:
                                                                            throw new IllegalStateException();
                                                                    }
                                                                    String strGroup9 = matcher.group(i5);
                                                                    strGroup9.getClass();
                                                                    c0690c.f2660o = Float.parseFloat(strGroup9);
                                                                    break;
                                                            }
                                                            b3 = -1;
                                                            switch (b3) {
                                                                case 0:
                                                                    i5 = 1;
                                                                    c0690c.f2659n = 3;
                                                                    break;
                                                                case 1:
                                                                    i5 = 1;
                                                                    c0690c.f2659n = 2;
                                                                    break;
                                                                case 2:
                                                                    i5 = 1;
                                                                    c0690c.f2659n = 1;
                                                                    break;
                                                                default:
                                                                    throw new IllegalStateException();
                                                            }
                                                            String strGroup10 = matcher.group(i5);
                                                            strGroup10.getClass();
                                                            c0690c.f2660o = Float.parseFloat(strGroup10);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    z6 = z7;
                                }
                                if ("}".equals(strM1812b2)) {
                                    arrayList3.add(c0690c);
                                }
                                r3 = 0;
                                i7 = -1;
                                i8 = 1;
                                str2 = null;
                            }
                        }
                        arrayList.addAll(arrayList3);
                    } else if (i9 == 3) {
                        Pattern pattern = AbstractC0696i.f2686a;
                        Charset charset = StandardCharsets.UTF_8;
                        String strM1674h2 = c0651s.m1674h(charset);
                        if (strM1674h2 == null) {
                            c0691dM1819d = null;
                        } else {
                            Pattern pattern2 = AbstractC0696i.f2686a;
                            Matcher matcher3 = pattern2.matcher(strM1674h2);
                            if (matcher3.matches()) {
                                c0691dM1819d = AbstractC0696i.m1819d(null, matcher3, c0651s, arrayList);
                            } else {
                                c0691dM1819d = null;
                                String strM1674h3 = c0651s.m1674h(charset);
                                if (strM1674h3 != null) {
                                    Matcher matcher4 = pattern2.matcher(strM1674h3);
                                    if (matcher4.matches()) {
                                        c0691dM1819d = AbstractC0696i.m1819d(strM1674h2.trim(), matcher4, c0651s, arrayList);
                                    }
                                }
                            }
                        }
                        if (c0691dM1819d != null) {
                            arrayList2.add(c0691dM1819d);
                        }
                    }
                    c0106b = this;
                    i6 = 2;
                    z4 = false;
                    i7 = -1;
                    i8 = 1;
                }
            }
        } catch (C0546I e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    @Override // p022H1.InterfaceC0257a
    /* JADX INFO: renamed from: i */
    public void mo521i(Bitmap bitmap) {
        C0106b c0106b = (C0106b) this.f140h;
        c0106b.f141i = bitmap;
        C0264h c0264h = (C0264h) this.f141i;
        c0264h.f691l = c0106b;
        c0264h.m796b();
    }

    @Override // p145s0.InterfaceC2235h
    /* JADX INFO: renamed from: j */
    public void mo522j() {
        byte[] bArr = AbstractC0632A.f2459f;
        C0651s c0651s = (C0651s) this.f141i;
        c0651s.getClass();
        c0651s.m1663E(bArr, bArr.length);
    }

    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: k */
    public /* synthetic */ InterfaceC0458d mo523k(byte[] bArr, int i3, int i4) {
        return AbstractC0462h.m1161a(this, bArr, i4);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0041  */
    @Override // p097f2.InterfaceC1557a
    /* JADX INFO: renamed from: l */
    public void mo524l(C1563g c1563g) {
        boolean z3;
        C0186c c0186c;
        switch (this.f139g) {
            case 7:
                ((Map) ((C0106b) this.f141i).f141i).remove((C1560d) this.f140h);
                break;
            default:
                BinderC1319q binderC1319q = (BinderC1319q) this.f140h;
                binderC1319q.getClass();
                boolean zM3888e = c1563g.m3888e();
                C0296b c0296b = BinderC1319q.f5953i;
                if (zM3888e) {
                    Bundle bundle = (Bundle) c1563g.m3887d();
                    boolean z4 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                    c0296b.m831b("The module-to-client output switcher flag %s", true != z4 ? "not existed" : "existed");
                    if (z4) {
                        z3 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                    } else {
                        z3 = true;
                    }
                } else {
                    z3 = true;
                }
                Boolean boolValueOf = Boolean.valueOf(z3);
                C0186c c0186c2 = (C0186c) this.f141i;
                Log.i(c0296b.f788a, c0296b.m833d("Set up output switcher flags: %b (from module), %b (from CastOptions)", boolValueOf, Boolean.valueOf(c0186c2.f451s)));
                boolean z5 = z3 && c0186c2.f451s;
                if (binderC1319q.f5954d != null && (c0186c = binderC1319q.f5955e) != null) {
                    C0367d c0367d = new C0367d();
                    int i3 = Build.VERSION.SDK_INT;
                    c0367d.f1175a = i3 >= 30;
                    if (i3 >= 30) {
                        c0367d.f1175a = z5;
                    }
                    boolean z6 = c0186c.f449q;
                    if (i3 >= 30) {
                        c0367d.f1177c = z6;
                    }
                    boolean z7 = c0186c.f448p;
                    if (i3 >= 30) {
                        c0367d.f1176b = z7;
                    }
                    C1406F c1406f = new C1406F(c0367d);
                    C1405E.m3510b();
                    C1433f c1433fM3511c = C1405E.m3511c();
                    C1406F c1406f2 = c1433fM3511c.f6350u;
                    c1433fM3511c.f6350u = c1406f;
                    boolean zM3578f = c1433fM3511c.m3578f();
                    HandlerC1430c handlerC1430c = c1433fM3511c.f6330a;
                    if (zM3578f) {
                        if (c1433fM3511c.f6347r == null) {
                            C1440m c1440m = new C1440m(c1433fM3511c.f6337h, new C1428b(c1433fM3511c));
                            c1433fM3511c.f6347r = c1440m;
                            c1433fM3511c.m3573a(c1440m, true);
                            c1433fM3511c.m3583k();
                            C1427a0 c1427a0 = c1433fM3511c.f6332c;
                            ((Handler) c1427a0.f6311d).post((RunnableC0153b) c1427a0.f6315h);
                        }
                        if ((c1406f2 != null && c1406f2.f6244c) != c1406f.f6244c) {
                            C1440m c1440m2 = c1433fM3511c.f6347r;
                            c1440m2.f6411e = c1433fM3511c.f6325A;
                            if (!c1440m2.f6412f) {
                                c1440m2.f6412f = true;
                                c1440m2.f6409c.sendEmptyMessage(2);
                            }
                        }
                    } else {
                        C1440m c1440m3 = c1433fM3511c.f6347r;
                        if (c1440m3 != null) {
                            C1402B c1402bM3576d = c1433fM3511c.m3576d(c1440m3);
                            if (c1402bM3576d != null) {
                                C1405E.m3510b();
                                c1440m3.f6410d = null;
                                c1440m3.m3631h(null);
                                c1433fM3511c.m3585m(c1402bM3576d, null);
                                handlerC1430c.m3572b(514, c1402bM3576d);
                                c1433fM3511c.f6341l.remove(c1402bM3576d);
                            }
                            c1433fM3511c.f6347r = null;
                            C1427a0 c1427a1 = c1433fM3511c.f6332c;
                            ((Handler) c1427a1.f6311d).post((RunnableC0153b) c1427a1.f6315h);
                        }
                    }
                    handlerC1430c.m3572b(769, c1406f);
                    Log.i(c0296b.f788a, c0296b.m833d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(binderC1319q.f5958h), Boolean.valueOf(z5), Boolean.valueOf(z6), Boolean.valueOf(z7)));
                    if (z6) {
                        C1335u c1335u = binderC1319q.f5957g;
                        AbstractC0491s.m1213e(c1335u);
                        C1311o c1311o = new C1311o(c1335u);
                        C1405E.m3510b();
                        C1405E.m3511c().f6335f = c1311o;
                        C1166D0.m3123a(EnumC1272e0.CAST_TRANSFER_TO_LOCAL_ENABLED);
                    }
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m525m(Object obj, String str) {
        ((ArrayList) this.f140h).add(str + "=" + String.valueOf(obj));
    }

    /* JADX INFO: renamed from: n */
    public void m526n() {
        this.f140h = null;
        this.f141i = null;
    }

    /* JADX INFO: renamed from: o */
    public void m527o(long j3, C0651s c0651s) {
        if (c0651s.m1667a() < 9) {
            return;
        }
        int iM1673g = c0651s.m1673g();
        int iM1673g2 = c0651s.m1673g();
        int iM1687u = c0651s.m1687u();
        if (iM1673g == 434 && iM1673g2 == 1195456820 && iM1687u == 3) {
            AbstractC2229b.m4810e(j3, c0651s, (InterfaceC2226E[]) this.f141i);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m528p(InterfaceC2242o interfaceC2242o, C0736G c0736g) {
        int i3 = 0;
        while (true) {
            InterfaceC2226E[] interfaceC2226EArr = (InterfaceC2226E[]) this.f141i;
            if (i3 >= interfaceC2226EArr.length) {
                return;
            }
            c0736g.m1848a();
            c0736g.m1849b();
            InterfaceC2226E interfaceC2226EMo344p = interfaceC2242o.mo344p(c0736g.f2835d, 3);
            C0583o c0583o = (C0583o) ((List) this.f140h).get(i3);
            String str = c0583o.f2154n;
            AbstractC0646n.m1624b("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            C0582n c0582n = new C0582n();
            c0736g.m1849b();
            c0582n.f2102a = c0736g.f2836e;
            c0582n.f2114m = AbstractC0545H.m1364l(str);
            c0582n.f2106e = c0583o.f2145e;
            c0582n.f2105d = c0583o.f2144d;
            c0582n.f2097G = c0583o.f2135H;
            c0582n.f2117p = c0583o.f2157q;
            interfaceC2226EMo344p.mo1176e(new C0583o(c0582n));
            interfaceC2226EArr[i3] = interfaceC2226EMo344p;
            i3++;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m529q(boolean z3) {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = ((AbstractC0937C) this.f141i).f4085v;
        if (abstractComponentCallbacksC0963n != null) {
            abstractComponentCallbacksC0963n.m2536j().f4075l.m529q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f140h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: r */
    public void m530r(boolean z3) {
        AbstractC0937C abstractC0937C = (AbstractC0937C) this.f141i;
        AbstractActivityC1479j abstractActivityC1479j = abstractC0937C.f4083t.f4249v;
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = abstractC0937C.f4085v;
        if (abstractComponentCallbacksC0963n != null) {
            abstractComponentCallbacksC0963n.m2536j().f4075l.m530r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f140h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m531s(boolean z3) {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = ((AbstractC0937C) this.f141i).f4085v;
        if (abstractComponentCallbacksC0963n != null) {
            abstractComponentCallbacksC0963n.m2536j().f4075l.m531s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f140h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m532t(boolean z3) {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = ((AbstractC0937C) this.f141i).f4085v;
        if (abstractComponentCallbacksC0963n != null) {
            abstractComponentCallbacksC0963n.m2536j().f4075l.m532t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f140h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public String toString() {
        int iLastIndexOf;
        switch (this.f139g) {
            case 10:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                InterfaceC1005r interfaceC1005r = (InterfaceC1005r) this.f140h;
                if (interfaceC1005r == null) {
                    sb.append("null");
                } else {
                    String simpleName = interfaceC1005r.getClass().getSimpleName();
                    if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = interfaceC1005r.getClass().getName()).lastIndexOf(46)) > 0) {
                        simpleName = simpleName.substring(iLastIndexOf + 1);
                    }
                    sb.append(simpleName);
                    sb.append('{');
                    sb.append(Integer.toHexString(System.identityHashCode(interfaceC1005r)));
                }
                sb.append("}}");
                return sb.toString();
            case 11:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.f141i.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.f140h;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    sb2.append((String) arrayList.get(i3));
                    if (i3 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m533u(boolean z3) {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = ((AbstractC0937C) this.f141i).f4085v;
        if (abstractComponentCallbacksC0963n != null) {
            abstractComponentCallbacksC0963n.m2536j().f4075l.m533u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f140h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: v */
    public void m534v(boolean z3) {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = ((AbstractC0937C) this.f141i).f4085v;
        if (abstractComponentCallbacksC0963n != null) {
            abstractComponentCallbacksC0963n.m2536j().f4075l.m534v(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f140h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: w */
    public void m535w(boolean z3) {
        AbstractC0937C abstractC0937C = (AbstractC0937C) this.f141i;
        AbstractActivityC1479j abstractActivityC1479j = abstractC0937C.f4083t.f4249v;
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = abstractC0937C.f4085v;
        if (abstractComponentCallbacksC0963n != null) {
            abstractComponentCallbacksC0963n.m2536j().f4075l.m535w(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f140h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m536x(boolean z3) {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = ((AbstractC0937C) this.f141i).f4085v;
        if (abstractComponentCallbacksC0963n != null) {
            abstractComponentCallbacksC0963n.m2536j().f4075l.m536x(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f140h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m537y(boolean z3) {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = ((AbstractC0937C) this.f141i).f4085v;
        if (abstractComponentCallbacksC0963n != null) {
            abstractComponentCallbacksC0963n.m2536j().f4075l.m537y(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f140h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX INFO: renamed from: z */
    public void m538z(boolean z3) {
        AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = ((AbstractC0937C) this.f141i).f4085v;
        if (abstractComponentCallbacksC0963n != null) {
            abstractComponentCallbacksC0963n.m2536j().f4075l.m538z(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f140h).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z3) {
                throw null;
            }
            throw null;
        }
    }

    public /* synthetic */ C0106b(int i3, boolean z3) {
        this.f139g = i3;
    }

    public /* synthetic */ C0106b(Object obj, int i3, Object obj2) {
        this.f139g = i3;
        this.f140h = obj;
        this.f141i = obj2;
    }

    public /* synthetic */ C0106b(Object obj, Object obj2, int i3, boolean z3) {
        this.f139g = i3;
        this.f141i = obj;
        this.f140h = obj2;
    }

    public /* synthetic */ C0106b(Object obj, Object obj2, Object obj3, int i3) {
        this.f139g = i3;
        this.f141i = obj;
        this.f140h = obj2;
    }

    public C0106b(C0448a c0448a) {
        this.f139g = 3;
        this.f140h = c0448a == null ? null : c0448a.f1511h;
    }

    public /* synthetic */ C0106b(Object obj) {
        this.f139g = 11;
        this.f141i = obj;
        this.f140h = new ArrayList();
    }

    public C0106b(int i3) {
        this.f139g = i3;
        switch (i3) {
            case 8:
                this.f140h = Collections.synchronizedMap(new WeakHashMap());
                this.f141i = Collections.synchronizedMap(new WeakHashMap());
                break;
            case 12:
                C0349d c0349d = C0349d.f1132d;
                this.f140h = new SparseIntArray();
                this.f141i = c0349d;
                break;
            case 15:
                this.f140h = new C0651s();
                this.f141i = new C0689b();
                break;
            case 17:
                this.f140h = new HashMap();
                break;
            default:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f140h = byteArrayOutputStream;
                this.f141i = new DataOutputStream(byteArrayOutputStream);
                break;
        }
    }

    public C0106b(List list) {
        this.f139g = 20;
        this.f140h = list;
        this.f141i = new InterfaceC2226E[list.size()];
    }

    public C0106b(InterfaceC1005r interfaceC1005r, C0986K c0986k) {
        C0446a c0446a;
        this.f139g = 10;
        this.f140h = interfaceC1005r;
        AbstractC2364c.m4954e(c0986k, "store");
        C0401a c0401a = C0401a.f1359b;
        AbstractC2364c.m4954e(c0401a, "defaultCreationExtras");
        String canonicalName = C0446a.class.getCanonicalName();
        if (canonicalName != null) {
            String strConcat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            AbstractC2364c.m4954e(strConcat, "key");
            LinkedHashMap linkedHashMap = c0986k.f4299a;
            AbstractC0984I abstractC0984I = (AbstractC0984I) linkedHashMap.get(strConcat);
            if (C0446a.class.isInstance(abstractC0984I)) {
                AbstractC2364c.m4952c(abstractC0984I, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll((LinkedHashMap) c0401a.f1360a);
                linkedHashMap2.put(C0985J.f4298b, strConcat);
                try {
                    c0446a = new C0446a();
                } catch (AbstractMethodError unused) {
                    c0446a = new C0446a();
                }
                abstractC0984I = c0446a;
                AbstractC0984I abstractC0984I2 = (AbstractC0984I) linkedHashMap.put(strConcat, abstractC0984I);
                if (abstractC0984I2 != null) {
                    abstractC0984I2.mo1154a();
                }
            }
            this.f141i = (C0446a) abstractC0984I;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C0106b(C0352g c0352g) {
        this.f139g = 14;
        this.f140h = new SparseArray();
        this.f141i = new HashMap();
    }

    public C0106b(AbstractC0937C abstractC0937C) {
        this.f139g = 26;
        this.f140h = new CopyOnWriteArrayList();
        this.f141i = abstractC0937C;
    }

    public C0106b(C0656x c0656x) {
        this.f139g = 18;
        this.f140h = c0656x;
        this.f141i = new C0651s();
    }

    public C0106b(PlayerActivity playerActivity, C0409e c0409e) {
        this.f139g = 16;
        this.f140h = playerActivity.getApplicationContext();
        this.f141i = c0409e;
    }

    public C0106b(MediaCodec.CryptoInfo cryptoInfo) {
        this.f139g = 21;
        this.f140h = cryptoInfo;
        this.f141i = AbstractC0080b.m366d();
    }

    public C0106b(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f139g = 23;
        if (mediaSessionCompat$Token != null) {
            this.f141i = Collections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f140h = new C0873i(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f140h = new C0872h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public C0106b(EditText editText) {
        this.f139g = 4;
        this.f140h = editText;
        C0292i c0292i = new C0292i(editText);
        this.f141i = c0292i;
        editText.addTextChangedListener(c0292i);
        if (C0284a.f767b == null) {
            synchronized (C0284a.f766a) {
                try {
                    if (C0284a.f767b == null) {
                        C0284a c0284a = new C0284a();
                        try {
                            C0284a.f768c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0284a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C0284a.f767b = c0284a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(C0284a.f767b);
    }

    public C0106b(C0734E c0734e) {
        this.f139g = 19;
        this.f141i = c0734e;
        this.f140h = new C0508g(new byte[4], 4);
    }

    @Override // p071Y0.InterfaceC0732C
    /* JADX INFO: renamed from: a */
    public void mo513a(C0656x c0656x, InterfaceC2242o interfaceC2242o, C0736G c0736g) {
    }
}
