package android.support.v4.media.session;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioAttributes;
import android.media.AudioRouting;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.C0858A;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.graphics.drawable.IconCompat;
import androidx.emoji2.text.C0913c;
import androidx.emoji2.text.C0924n;
import androidx.emoji2.text.C0925o;
import androidx.emoji2.text.C0928r;
import androidx.emoji2.text.C0931u;
import androidx.emoji2.text.C0932v;
import androidx.emoji2.text.InterfaceC0923m;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.google.android.gms.internal.cast.AbstractC1339v;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import p000A.AbstractC0016Q;
import p001A0.C0069c;
import p009D0.C0106b;
import p011E.C0111d;
import p011E.InterfaceC0115h;
import p013E1.C0125H;
import p013E1.C0134i;
import p013E1.InterfaceC0131f;
import p016F1.C0183I;
import p019G1.C0233h;
import p023I.C0269a;
import p028J1.AbstractC0295a;
import p028J1.C0300f;
import p028J1.C0319y;
import p034L1.C0348c;
import p034L1.C0352g;
import p036M0.C0368e;
import p039N0.C0409e;
import p039N0.C0414j;
import p040N1.C0428i;
import p040N1.InterfaceC0430k;
import p045P0.C0467m;
import p045P0.InterfaceC0458d;
import p045P0.InterfaceC0463i;
import p046P1.AbstractC0491s;
import p048Q0.C0505d;
import p053S0.C0536b;
import p055T.AbstractC0545H;
import p055T.AbstractC0571e;
import p055T.C0539B;
import p055T.C0582n;
import p055T.C0583o;
import p055T.C0590v;
import p058U.C0602b;
import p058U.C0607g;
import p058U.InterfaceC0604d;
import p060U1.AbstractC0610a;
import p061V.C0613a;
import p061V.C0614b;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p064W.C0656x;
import p067X.C0687s;
import p068X0.C0691d;
import p070Y.C0715l;
import p070Y.InterfaceC0711h;
import p071Y0.C0736G;
import p071Y0.InterfaceC0732C;
import p082b0.C1063d;
import p085c0.C1122D;
import p085c0.C1129e;
import p085c0.C1146v;
import p085c0.C1149y;
import p085c0.C1150z;
import p088d0.C1382f;
import p088d0.C1392p;
import p088d0.C1393q;
import p088d0.C1399w;
import p088d0.InterfaceC1390n;
import p089d1.AbstractC1411K;
import p089d1.AbstractC1426a;
import p089d1.C1433f;
import p091e.C1466K;
import p095f0.C1528a;
import p097f2.C1560d;
import p103h0.C1601j;
import p104h1.AbstractC1635T;
import p104h1.C1666w;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1718l0;
import p105h2.AbstractC1723q;
import p105h2.C1673D;
import p105h2.C1674E;
import p105h2.C1692X;
import p105h2.C1700c0;
import p113k.C1891s;
import p114k0.C1923Q;
import p114k0.C1947h0;
import p123m2.C2008b;
import p123m2.InterfaceC2010d;
import p124n.C2019f;
import p131o2.C2081a;
import p135p2.C2115e;
import p136q.AbstractC2128k;
import p136q.AbstractC2129l;
import p136q.AbstractC2130m;
import p136q.AbstractC2131n;
import p136q.AbstractC2132o;
import p136q.AbstractC2133p;
import p136q.AbstractC2134q;
import p136q.AbstractC2135r;
import p136q.AbstractC2139v;
import p136q.C2125h;
import p136q.C2127j;
import p144s.AbstractC2220n;
import p145s0.C2237j;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2240m;
import p145s0.InterfaceC2242o;
import p145s0.InterfaceC2243p;
import p145s0.InterfaceC2252y;
import p148t.AbstractC2265d;
import p148t.AbstractC2266e;
import p154u1.C2297a;
import p168z.C2388b;

/* JADX INFO: renamed from: android.support.v4.media.session.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0858A implements InterfaceC0115h, InterfaceC0430k, InterfaceC2242o, InterfaceC0458d, InterfaceC0732C {

    /* JADX INFO: renamed from: k */
    public static int f3636k;

    /* JADX INFO: renamed from: l */
    public static C0858A f3637l;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3638g;

    /* JADX INFO: renamed from: h */
    public Object f3639h;

    /* JADX INFO: renamed from: i */
    public Object f3640i;

    /* JADX INFO: renamed from: j */
    public Object f3641j;

    public C0858A(C0414j c0414j, C0428i c0428i, C0348c[] c0348cArr, int i3) {
        this.f3638g = 8;
        this.f3641j = c0414j;
        this.f3639h = c0428i;
        this.f3640i = c0348cArr;
    }

    /* JADX INFO: renamed from: Q */
    public static C0858A m2148Q(Context context, AttributeSet attributeSet, int[] iArr, int i3) {
        return new C0858A(context, context.obtainStyledAttributes(attributeSet, iArr, i3, 0));
    }

    /* JADX INFO: renamed from: Y */
    public static Bundle m2149Y(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m2152x(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static C1382f m2150s(C0590v c0590v) {
        C0409e c0409e = new C0409e(1);
        c0409e.f1383k = null;
        Uri uri = c0590v.f2184b;
        C0858A c0858a = new C0858A(uri == null ? null : uri.toString(), c0409e);
        AbstractC1718l0 it = c0590v.f2185c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((HashMap) c0858a.f3641j)) {
                ((HashMap) c0858a.f3641j).put(str, str2);
            }
        }
        HashMap map = new HashMap();
        UUID uuid = AbstractC0571e.f2057a;
        C1528a c1528a = new C1528a(12);
        UUID uuid2 = c0590v.f2183a;
        uuid2.getClass();
        boolean z3 = c0590v.f2186d;
        int[] iArrM3287J = AbstractC1303m.m3287J(c0590v.f2187e);
        int length = iArrM3287J.length;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArrM3287J[i3];
            AbstractC0646n.m1625c(i4 == 2 || i4 == 1);
        }
        C1382f c1382f = new C1382f(uuid2, c0858a, map, (int[]) iArrM3287J.clone(), z3, c1528a);
        byte[] bArr = c0590v.f2188f;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        AbstractC0646n.m1630h(c1382f.f6164m.isEmpty());
        c1382f.f6173v = bArrCopyOf;
        return c1382f;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m2151u(Editable editable, KeyEvent keyEvent, boolean z3) {
        C0932v[] c0932vArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c0932vArr = (C0932v[]) editable.getSpans(selectionStart, selectionEnd, C0932v.class)) != null && c0932vArr.length > 0) {
                for (C0932v c0932v : c0932vArr) {
                    int spanStart = editable.getSpanStart(c0932v);
                    int spanEnd = editable.getSpanEnd(c0932v);
                    if ((z3 && spanStart == selectionStart) || ((!z3 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public static void m2152x(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(C0858A.class.getClassLoader());
        }
    }

    /* JADX INFO: renamed from: A */
    public InterfaceC1390n m2153A(C0539B c0539b) {
        C1382f c1382f;
        c0539b.f1875b.getClass();
        C0590v c0590v = c0539b.f1875b.f2201c;
        if (c0590v == null) {
            return InterfaceC1390n.f6186b;
        }
        synchronized (this.f3639h) {
            try {
                if (!c0590v.equals((C0590v) this.f3640i)) {
                    this.f3640i = c0590v;
                    this.f3641j = m2150s(c0590v);
                }
                c1382f = (C1382f) this.f3641j;
                c1382f.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1382f;
    }

    /* JADX INFO: renamed from: B */
    public View m2154B(int i3) {
        return ((C1666w) this.f3639h).f7586a.getChildAt(m2161I(i3));
    }

    /* JADX INFO: renamed from: C */
    public int m2155C() {
        return ((C1666w) this.f3639h).f7586a.getChildCount() - ((ArrayList) this.f3641j).size();
    }

    /* JADX INFO: renamed from: D */
    public ColorStateList m2156D(int i3) {
        int resourceId;
        ColorStateList colorStateListM1510l;
        TypedArray typedArray = (TypedArray) this.f3640i;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0 || (colorStateListM1510l = AbstractC0610a.m1510l((Context) this.f3639h, resourceId)) == null) ? typedArray.getColorStateList(i3) : colorStateListM1510l;
    }

    /* JADX INFO: renamed from: E */
    public long m2157E() {
        C2237j c2237j = (C2237j) this.f3641j;
        if (c2237j != null) {
            return c2237j.f9629j;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: F */
    public Drawable m2158F(int i3) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f3640i;
        return (!typedArray.hasValue(i3) || (resourceId = typedArray.getResourceId(i3, 0)) == 0) ? typedArray.getDrawable(i3) : AbstractC0610a.m1512n((Context) this.f3639h, resourceId);
    }

    /* JADX INFO: renamed from: G */
    public Drawable m2159G(int i3) {
        int resourceId;
        Drawable drawableM4325g;
        if (!((TypedArray) this.f3640i).hasValue(i3) || (resourceId = ((TypedArray) this.f3640i).getResourceId(i3, 0)) == 0) {
            return null;
        }
        C1891s c1891sM4407a = C1891s.m4407a();
        Context context = (Context) this.f3639h;
        synchronized (c1891sM4407a) {
            drawableM4325g = c1891sM4407a.f8264a.m4325g(context, resourceId, true);
        }
        return drawableM4325g;
    }

    /* JADX INFO: renamed from: H */
    public Typeface m2160H(int i3, int i4, C0368e c0368e) {
        int resourceId = ((TypedArray) this.f3640i).getResourceId(i3, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f3641j) == null) {
            this.f3641j = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f3641j;
        ThreadLocal threadLocal = AbstractC2220n.f9530a;
        Context context = (Context) this.f3639h;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC2220n.m4802b(context, resourceId, typedValue, i4, c0368e, true);
    }

    /* JADX INFO: renamed from: I */
    public int m2161I(int i3) {
        if (i3 < 0) {
            return -1;
        }
        int childCount = ((C1666w) this.f3639h).f7586a.getChildCount();
        int i4 = i3;
        while (i4 < childCount) {
            C0069c c0069c = (C0069c) this.f3640i;
            int iM348t = i3 - (i4 - c0069c.m348t(i4));
            if (iM348t == 0) {
                while (c0069c.m350v(i4)) {
                    i4++;
                }
                return i4;
            }
            i4 += iM348t;
        }
        return -1;
    }

    /* JADX INFO: renamed from: J */
    public View m2162J(int i3) {
        return ((C1666w) this.f3639h).f7586a.getChildAt(i3);
    }

    /* JADX INFO: renamed from: K */
    public int m2163K() {
        return ((C1666w) this.f3639h).f7586a.getChildCount();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX INFO: renamed from: L */
    public boolean m2164L(CharSequence charSequence, int i3, int i4, C0931u c0931u) {
        boolean zM4864a;
        if ((c0931u.f4041c & 3) == 0) {
            C0913c c0913c = (C0913c) this.f3641j;
            C0269a c0269aM2427b = c0931u.m2427b();
            int iM3a = c0269aM2427b.m3a(8);
            short s3 = iM3a != 0 ? ((ByteBuffer) c0269aM2427b.f5d).getShort(iM3a + c0269aM2427b.f2a) : (short) 0;
            c0913c.getClass();
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 23 || s3 <= i5) {
                ThreadLocal threadLocal = C0913c.f3994b;
                if (threadLocal.get() == null) {
                    threadLocal.set(new StringBuilder());
                }
                StringBuilder sb = (StringBuilder) threadLocal.get();
                sb.setLength(0);
                while (i3 < i4) {
                    sb.append(charSequence.charAt(i3));
                    i3++;
                }
                TextPaint textPaint = c0913c.f3995a;
                String string = sb.toString();
                ThreadLocal threadLocal2 = AbstractC2266e.f9702a;
                if (Build.VERSION.SDK_INT >= 23) {
                    zM4864a = AbstractC2265d.m4864a(textPaint, string);
                } else {
                    int length = string.length();
                    if (length == 1 && Character.isWhitespace(string.charAt(0))) {
                        zM4864a = true;
                    } else {
                        float fMeasureText = textPaint.measureText("\udfffd");
                        float fMeasureText2 = textPaint.measureText("m");
                        float fMeasureText3 = textPaint.measureText(string);
                        float fMeasureText4 = 0.0f;
                        if (fMeasureText3 != 0.0f) {
                            if (string.codePointCount(0, string.length()) > 1) {
                                if (fMeasureText3 <= fMeasureText2 * 2.0f) {
                                    int i6 = 0;
                                    while (i6 < length) {
                                        int iCharCount = Character.charCount(string.codePointAt(i6)) + i6;
                                        fMeasureText4 += textPaint.measureText(string, i6, iCharCount);
                                        i6 = iCharCount;
                                    }
                                    if (fMeasureText3 >= fMeasureText4) {
                                    }
                                }
                                zM4864a = false;
                            }
                            if (fMeasureText3 != fMeasureText) {
                                zM4864a = true;
                            } else {
                                ThreadLocal threadLocal3 = AbstractC2266e.f9702a;
                                C2388b c2388b = (C2388b) threadLocal3.get();
                                if (c2388b == null) {
                                    c2388b = new C2388b(new Rect(), new Rect());
                                    threadLocal3.set(c2388b);
                                } else {
                                    ((Rect) c2388b.f9981a).setEmpty();
                                    ((Rect) c2388b.f9982b).setEmpty();
                                }
                                Rect rect = (Rect) c2388b.f9981a;
                                textPaint.getTextBounds("\udfffd", 0, 2, rect);
                                Object obj = c2388b.f9982b;
                                textPaint.getTextBounds(string, 0, length, (Rect) obj);
                                zM4864a = !rect.equals(obj);
                            }
                        } else {
                            zM4864a = false;
                        }
                    }
                }
            } else {
                zM4864a = false;
            }
            int i7 = c0931u.f4041c & 4;
            c0931u.f4041c = zM4864a ? i7 | 2 : i7 | 1;
        }
        return (c0931u.f4041c & 3) == 2;
    }

    /* JADX INFO: renamed from: M */
    public boolean m2165M() throws IOException {
        String strTrim;
        if (((String) this.f3641j) == null) {
            ArrayDeque arrayDeque = (ArrayDeque) this.f3640i;
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f3641j = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.f3639h).readLine();
                this.f3641j = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f3641j = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    /* JADX INFO: renamed from: N */
    public void m2166N(View view) {
        ((ArrayList) this.f3641j).add(view);
        C1666w c1666w = (C1666w) this.f3639h;
        AbstractC1635T abstractC1635TM2741F = RecyclerView.m2741F(view);
        if (abstractC1635TM2741F != null) {
            int i3 = abstractC1635TM2741F.f7421p;
            View view2 = abstractC1635TM2741F.f7406a;
            if (i3 != -1) {
                abstractC1635TM2741F.f7420o = i3;
            } else {
                WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                abstractC1635TM2741F.f7420o = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c1666w.f7586a;
            if (recyclerView.m2754I()) {
                abstractC1635TM2741F.f7421p = 4;
                recyclerView.f4777w0.add(abstractC1635TM2741F);
            } else {
                WeakHashMap weakHashMap2 = AbstractC0016Q.f14a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public void m2167O(InterfaceC0711h interfaceC0711h, Uri uri, Map map, long j3, long j4, C1923Q c1923q) throws C1947h0 {
        boolean z3;
        boolean z4 = true;
        C2237j c2237j = new C2237j(interfaceC0711h, j3, j4);
        this.f3641j = c2237j;
        if (((InterfaceC2240m) this.f3640i) != null) {
            return;
        }
        InterfaceC2240m[] interfaceC2240mArrMo4836a = ((InterfaceC2243p) this.f3639h).mo4836a(uri, map);
        int length = interfaceC2240mArrMo4836a.length;
        C1674E c1674e = AbstractC1676G.f7601h;
        AbstractC1723q.m4153b(length, "expectedSize");
        C1673D c1673d = new C1673D(length);
        if (interfaceC2240mArrMo4836a.length == 1) {
            this.f3640i = interfaceC2240mArrMo4836a[0];
        } else {
            for (InterfaceC2240m interfaceC2240m : interfaceC2240mArrMo4836a) {
                try {
                    if (interfaceC2240m.mo329f(c2237j)) {
                        this.f3640i = interfaceC2240m;
                        c2237j.f9631l = 0;
                        break;
                    } else {
                        c1673d.m4104c(interfaceC2240m.mo332m());
                        z3 = ((InterfaceC2240m) this.f3640i) != null || c2237j.f9629j == j3;
                    }
                } catch (EOFException unused) {
                    z3 = ((InterfaceC2240m) this.f3640i) != null || c2237j.f9629j == j3;
                } catch (Throwable th) {
                    if (((InterfaceC2240m) this.f3640i) == null && c2237j.f9629j != j3) {
                        z4 = false;
                    }
                    AbstractC0646n.m1630h(z4);
                    c2237j.f9631l = 0;
                    throw th;
                }
                AbstractC0646n.m1630h(z3);
                c2237j.f9631l = 0;
            }
            if (((InterfaceC2240m) this.f3640i) == null) {
                StringBuilder sb = new StringBuilder("None of the available extractors (");
                C0924n c0924n = new C0924n(", ");
                Iterator it = AbstractC1723q.m4168q(AbstractC1676G.m4118o(interfaceC2240mArrMo4836a), new C1063d(13)).iterator();
                StringBuilder sb2 = new StringBuilder();
                c0924n.m2412a(sb2, it);
                sb.append(sb2.toString());
                sb.append(") could read the stream.");
                String string = sb.toString();
                uri.getClass();
                C1692X c1692xM4112f = c1673d.m4112f();
                C1947h0 c1947h0 = new C1947h0(string, null, false, 1);
                AbstractC1676G.m4117n(c1692xM4112f);
                throw c1947h0;
            }
        }
        ((InterfaceC2240m) this.f3640i).mo330h(c1923q);
    }

    /* JADX INFO: renamed from: P */
    public String m2168P() {
        if (!m2165M()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f3641j;
        this.f3641j = null;
        return str;
    }

    /* JADX INFO: renamed from: R */
    public Object m2169R(CharSequence charSequence, int i3, int i4, int i5, boolean z3, InterfaceC0923m interfaceC0923m) {
        char c;
        C0925o c0925o = new C0925o((C0928r) ((C0536b) this.f3640i).f1869i);
        int i6 = i3;
        int iCodePointAt = Character.codePointAt(charSequence, i3);
        int i7 = 0;
        boolean zMo519g = true;
        int iCharCount = i6;
        while (iCharCount < i4 && i7 < i5 && zMo519g) {
            SparseArray sparseArray = ((C0928r) c0925o.f4021e).f4032a;
            C0928r c0928r = sparseArray == null ? null : (C0928r) sparseArray.get(iCodePointAt);
            if (c0925o.f4017a == 2) {
                if (c0928r != null) {
                    c0925o.f4021e = c0928r;
                    c0925o.f4019c++;
                } else {
                    if (iCodePointAt == 65038) {
                        c0925o.m2415c();
                    } else if (iCodePointAt != 65039) {
                        C0928r c0928r2 = (C0928r) c0925o.f4021e;
                        if (c0928r2.f4033b != null) {
                            if (c0925o.f4019c != 1) {
                                c0925o.f4022f = c0928r2;
                                c0925o.m2415c();
                            } else if (c0925o.m2416d()) {
                                c0925o.f4022f = (C0928r) c0925o.f4021e;
                                c0925o.m2415c();
                            } else {
                                c0925o.m2415c();
                            }
                            c = 3;
                        } else {
                            c0925o.m2415c();
                        }
                    }
                    c = 1;
                }
                c = 2;
            } else if (c0928r == null) {
                c0925o.m2415c();
                c = 1;
            } else {
                c0925o.f4017a = 2;
                c0925o.f4021e = c0928r;
                c0925o.f4019c = 1;
                c = 2;
            }
            c0925o.f4018b = iCodePointAt;
            if (c == 1) {
                iCharCount = Character.charCount(Character.codePointAt(charSequence, i6)) + i6;
                if (iCharCount < i4) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                }
            } else if (c == 2) {
                int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                if (iCharCount2 < i4) {
                    iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                }
                iCharCount = iCharCount2;
            } else if (c == 3) {
                if (z3 || !m2164L(charSequence, i6, iCharCount, ((C0928r) c0925o.f4022f).f4033b)) {
                    zMo519g = interfaceC0923m.mo519g(charSequence, i6, iCharCount, ((C0928r) c0925o.f4022f).f4033b);
                    i7++;
                }
            }
            i6 = iCharCount;
        }
        if (c0925o.f4017a == 2 && ((C0928r) c0925o.f4021e).f4033b != null && ((c0925o.f4019c > 1 || c0925o.m2416d()) && i7 < i5 && zMo519g && (z3 || !m2164L(charSequence, i6, iCharCount, ((C0928r) c0925o.f4021e).f4033b)))) {
            interfaceC0923m.mo519g(charSequence, i6, iCharCount, ((C0928r) c0925o.f4021e).f4033b);
        }
        return interfaceC0923m.mo516d();
    }

    /* JADX INFO: renamed from: S */
    public void m2170S() {
        ((TypedArray) this.f3640i).recycle();
    }

    /* JADX INFO: renamed from: T */
    public void m2171T(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f3639h).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f3641j) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    /* JADX INFO: renamed from: U */
    public void m2172U(boolean z3) {
        ((C0885u) this.f3639h).f3702a.setActive(z3);
        ArrayList arrayList = (ArrayList) this.f3641j;
        if (arrayList.size() <= 0) {
            return;
        }
        ((AbstractC1426a) arrayList.get(0)).getClass();
        throw null;
    }

    /* JADX INFO: renamed from: V */
    public void m2173V(AbstractC0883s abstractC0883s, Handler handler) {
        C0885u c0885u = (C0885u) this.f3639h;
        if (abstractC0883s == null) {
            c0885u.m2283e(null, null);
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        c0885u.m2283e(abstractC0883s, handler);
    }

    /* JADX INFO: renamed from: W */
    public void m2174W(MediaMetadataCompat mediaMetadataCompat) {
        C0885u c0885u = (C0885u) this.f3639h;
        c0885u.f3708g = mediaMetadataCompat;
        if (mediaMetadataCompat.f3632h == null) {
            Parcel parcelObtain = Parcel.obtain();
            mediaMetadataCompat.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            mediaMetadataCompat.f3632h = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
        }
        c0885u.f3702a.setMetadata(mediaMetadataCompat.f3632h);
    }

    /* JADX INFO: renamed from: X */
    public void m2175X(View view) {
        if (((ArrayList) this.f3641j).remove(view)) {
            C1666w c1666w = (C1666w) this.f3639h;
            AbstractC1635T abstractC1635TM2741F = RecyclerView.m2741F(view);
            if (abstractC1635TM2741F != null) {
                int i3 = abstractC1635TM2741F.f7420o;
                RecyclerView recyclerView = c1666w.f7586a;
                if (recyclerView.m2754I()) {
                    abstractC1635TM2741F.f7421p = i3;
                    recyclerView.f4777w0.add(abstractC1635TM2741F);
                } else {
                    WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                    abstractC1635TM2741F.f7406a.setImportantForAccessibility(i3);
                }
                abstractC1635TM2741F.f7420o = 0;
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public void m2176Z(String str, String str2, int i3) {
        ((HashMap) this.f3639h).put(str, str2);
        ((HashMap) this.f3640i).put(str2, str);
        ((HashMap) this.f3641j).put(str, Integer.valueOf(i3));
    }

    @Override // p071Y0.InterfaceC0732C
    /* JADX INFO: renamed from: a */
    public void mo513a(C0656x c0656x, InterfaceC2242o interfaceC2242o, C0736G c0736g) {
        this.f3640i = c0656x;
        c0736g.m1848a();
        c0736g.m1849b();
        InterfaceC2226E interfaceC2226EMo344p = interfaceC2242o.mo344p(c0736g.f2835d, 5);
        this.f3641j = interfaceC2226EMo344p;
        interfaceC2226EMo344p.mo1176e((C0583o) this.f3639h);
    }

    @Override // p145s0.InterfaceC2242o
    /* JADX INFO: renamed from: b */
    public void mo333b(InterfaceC2252y interfaceC2252y) {
        ((InterfaceC2242o) this.f3639h).mo333b(interfaceC2252y);
    }

    @Override // p071Y0.InterfaceC0732C
    /* JADX INFO: renamed from: c */
    public void mo515c(C0651s c0651s) {
        long jM1704d;
        AbstractC0646n.m1631i((C0656x) this.f3640i);
        int i3 = AbstractC0632A.f2454a;
        C0656x c0656x = (C0656x) this.f3640i;
        synchronized (c0656x) {
            try {
                long j3 = c0656x.f2532c;
                jM1704d = j3 != -9223372036854775807L ? j3 + c0656x.f2531b : c0656x.m1704d();
            } catch (Throwable th) {
                throw th;
            }
        }
        long jM1705e = ((C0656x) this.f3640i).m1705e();
        if (jM1704d == -9223372036854775807L || jM1705e == -9223372036854775807L) {
            return;
        }
        C0583o c0583o = (C0583o) this.f3639h;
        if (jM1705e != c0583o.f2159s) {
            C0582n c0582nM1447a = c0583o.m1447a();
            c0582nM1447a.f2119r = jM1705e;
            C0583o c0583o2 = new C0583o(c0582nM1447a);
            this.f3639h = c0583o2;
            ((InterfaceC2226E) this.f3641j).mo1176e(c0583o2);
        }
        int iM1667a = c0651s.m1667a();
        ((InterfaceC2226E) this.f3641j).mo1173b(iM1667a, c0651s);
        ((InterfaceC2226E) this.f3641j).mo1172a(jM1704d, 1, iM1667a, 0, null);
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: d */
    public int mo156d(long j3) {
        long[] jArr = (long[]) this.f3641j;
        int iM1582a = AbstractC0632A.m1582a(jArr, j3, false);
        if (iM1582a < jArr.length) {
            return iM1582a;
        }
        return -1;
    }

    @Override // p011E.InterfaceC0115h
    /* JADX INFO: renamed from: f */
    public Uri mo553f() {
        return (Uri) this.f3641j;
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: g */
    public List mo159g(long j3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (true) {
            List list = (List) this.f3639h;
            if (i3 >= list.size()) {
                break;
            }
            int i4 = i3 * 2;
            long[] jArr = (long[]) this.f3640i;
            if (jArr[i4] <= j3 && j3 < jArr[i4 + 1]) {
                C0691d c0691d = (C0691d) list.get(i3);
                C0614b c0614b = c0691d.f2663a;
                if (c0614b.f2359e == -3.4028235E38f) {
                    arrayList2.add(c0691d);
                } else {
                    arrayList.add(c0614b);
                }
            }
            i3++;
        }
        Collections.sort(arrayList2, new C0505d(2));
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            C0613a c0613aM1536a = ((C0691d) arrayList2.get(i5)).f2663a.m1536a();
            c0613aM1536a.f2323e = (-1) - i5;
            c0613aM1536a.f2324f = 1;
            arrayList.add(c0613aM1536a.m1535a());
        }
        return arrayList;
    }

    @Override // p011E.InterfaceC0115h
    /* JADX INFO: renamed from: h */
    public ClipDescription mo554h() {
        return (ClipDescription) this.f3640i;
    }

    @Override // p011E.InterfaceC0115h
    /* JADX INFO: renamed from: i */
    public Object mo555i() {
        return null;
    }

    @Override // p011E.InterfaceC0115h
    /* JADX INFO: renamed from: j */
    public Uri mo556j() {
        return (Uri) this.f3639h;
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: k */
    public long mo163k(int i3) {
        AbstractC0646n.m1625c(i3 >= 0);
        long[] jArr = (long[]) this.f3641j;
        AbstractC0646n.m1625c(i3 < jArr.length);
        return jArr[i3];
    }

    @Override // p145s0.InterfaceC2242o
    /* JADX INFO: renamed from: l */
    public void mo341l() {
        ((InterfaceC2242o) this.f3639h).mo341l();
    }

    @Override // p040N1.InterfaceC0430k
    /* JADX INFO: renamed from: m */
    public void mo165m(Object obj, Object obj2) {
        C0319y c0319y = (C0319y) obj;
        C1560d c1560d = (C1560d) obj2;
        switch (this.f3638g) {
            case 4:
                C0125H c0125h = (C0125H) this.f3639h;
                AbstractC0491s.m1215g("Not connected to device", c0125h.f187E == 2);
                C0300f c0300f = (C0300f) c0319y.m3090r();
                Parcel parcelM1894e0 = c0300f.m1894e0();
                parcelM1894e0.writeString((String) this.f3640i);
                AbstractC1339v.m3421c(parcelM1894e0, (C0134i) this.f3641j);
                c0300f.m1897v0(parcelM1894e0, 13);
                synchronized (c0125h.f195q) {
                    try {
                        if (c0125h.f192n != null) {
                            c0125h.m585h(2477);
                        }
                        c0125h.f192n = c1560d;
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                AbstractC0491s.m1215g("Not active connection", ((C0125H) this.f3639h).f187E != 1);
                if (((InterfaceC0131f) this.f3640i) != null) {
                    C0300f c0300f2 = (C0300f) c0319y.m3090r();
                    Parcel parcelM1894e1 = c0300f2.m1894e0();
                    parcelM1894e1.writeString((String) this.f3641j);
                    c0300f2.m1897v0(parcelM1894e1, 12);
                }
                c1560d.m3879b(null);
                return;
        }
    }

    @Override // p045P0.InterfaceC0458d
    /* JADX INFO: renamed from: n */
    public int mo166n() {
        return ((long[]) this.f3641j).length;
    }

    /* JADX INFO: renamed from: o */
    public void m2177o(View view, int i3, boolean z3) {
        RecyclerView recyclerView = ((C1666w) this.f3639h).f7586a;
        int childCount = i3 < 0 ? recyclerView.getChildCount() : m2161I(i3);
        ((C0069c) this.f3640i).m351w(childCount, z3);
        if (z3) {
            m2166N(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.m2741F(view);
    }

    @Override // p145s0.InterfaceC2242o
    /* JADX INFO: renamed from: p */
    public InterfaceC2226E mo344p(int i3, int i4) {
        InterfaceC2242o interfaceC2242o = (InterfaceC2242o) this.f3639h;
        if (i4 != 3) {
            return interfaceC2242o.mo344p(i3, i4);
        }
        SparseArray sparseArray = (SparseArray) this.f3641j;
        C0467m c0467m = (C0467m) sparseArray.get(i3);
        if (c0467m != null) {
            return c0467m;
        }
        C0467m c0467m2 = new C0467m(interfaceC2242o.mo344p(i3, i4), (InterfaceC0463i) this.f3640i);
        sparseArray.put(i3, c0467m2);
        return c0467m2;
    }

    /* JADX INFO: renamed from: q */
    public void m2178q(View view, int i3, ViewGroup.LayoutParams layoutParams, boolean z3) {
        RecyclerView recyclerView = ((C1666w) this.f3639h).f7586a;
        int childCount = i3 < 0 ? recyclerView.getChildCount() : m2161I(i3);
        ((C0069c) this.f3640i).m351w(childCount, z3);
        if (z3) {
            m2166N(view);
        }
        AbstractC1635T abstractC1635TM2741F = RecyclerView.m2741F(view);
        if (abstractC1635TM2741F != null) {
            if (!abstractC1635TM2741F.m4055i() && !abstractC1635TM2741F.m4060n()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + abstractC1635TM2741F + recyclerView.m2790w());
            }
            abstractC1635TM2741F.f7414i &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* JADX INFO: renamed from: r */
    public void m2179r() {
        C0858A c0858a = (C0858A) this.f3639h;
        if (c0858a != null) {
            int i3 = ((C1433f) this.f3641j).f6343n.f1189e;
            C0885u c0885u = (C0885u) c0858a.f3639h;
            c0885u.getClass();
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i3);
            c0885u.f3702a.setPlaybackToLocal(builder.build());
            this.f3640i = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m2180t(InterfaceC2242o interfaceC2242o, C0736G c0736g) {
        int i3 = 0;
        while (true) {
            InterfaceC2226E[] interfaceC2226EArr = (InterfaceC2226E[]) this.f3640i;
            if (i3 >= interfaceC2226EArr.length) {
                return;
            }
            c0736g.m1848a();
            c0736g.m1849b();
            InterfaceC2226E interfaceC2226EMo344p = interfaceC2242o.mo344p(c0736g.f2835d, 3);
            C0583o c0583o = (C0583o) ((List) this.f3639h).get(i3);
            String str = c0583o.f2154n;
            AbstractC0646n.m1624b("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = c0583o.f2141a;
            if (str2 == null) {
                c0736g.m1849b();
                str2 = c0736g.f2836e;
            }
            C0582n c0582n = new C0582n();
            c0582n.f2102a = str2;
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

    public String toString() {
        switch (this.f3638g) {
            case 24:
                return ((C0069c) this.f3640i).toString() + ", hidden list:" + ((ArrayList) this.f3641j).size();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: v */
    public void m2181v(int i3) {
        AbstractC1635T abstractC1635TM2741F;
        int iM2161I = m2161I(i3);
        ((C0069c) this.f3640i).m352x(iM2161I);
        RecyclerView recyclerView = ((C1666w) this.f3639h).f7586a;
        View childAt = recyclerView.getChildAt(iM2161I);
        if (childAt != null && (abstractC1635TM2741F = RecyclerView.m2741F(childAt)) != null) {
            if (abstractC1635TM2741F.m4055i() && !abstractC1635TM2741F.m4060n()) {
                throw new IllegalArgumentException("called detach on an already detached child " + abstractC1635TM2741F + recyclerView.m2790w());
            }
            abstractC1635TM2741F.m4047a(256);
        }
        recyclerView.detachViewFromParent(iM2161I);
    }

    /* JADX INFO: renamed from: w */
    public void m2182w(C2297a c2297a, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f3640i;
        HashMap map2 = (HashMap) this.f3639h;
        C2115e c2115e = new C2115e(byteArrayOutputStream, map2, map, (C2081a) this.f3641j);
        InterfaceC2010d interfaceC2010d = (InterfaceC2010d) map2.get(C2297a.class);
        if (interfaceC2010d != null) {
            interfaceC2010d.mo4565a(c2297a, c2115e);
        } else {
            throw new C2008b("No encoder for " + C2297a.class);
        }
    }

    /* JADX INFO: renamed from: y */
    public byte[] m2183y(UUID uuid, C1392p c1392p) throws C1399w {
        String str;
        String str2 = c1392p.f6189b;
        if (TextUtils.isEmpty(str2)) {
            str2 = (String) this.f3640i;
        }
        if (TextUtils.isEmpty(str2)) {
            Map map = Collections.EMPTY_MAP;
            Uri uri = Uri.EMPTY;
            AbstractC0646n.m1632j(uri, "The uri must be set.");
            throw new C1399w(new C0715l(uri, 1, null, map, 0L, -1L, 0), uri, C1700c0.f7651m, 0L, new IllegalStateException("No license URL"));
        }
        HashMap map2 = new HashMap();
        UUID uuid2 = AbstractC0571e.f2061e;
        if (uuid2.equals(uuid)) {
            str = "text/xml";
        } else {
            str = AbstractC0571e.f2059c.equals(uuid) ? "application/json" : "application/octet-stream";
        }
        map2.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map2.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (((HashMap) this.f3641j)) {
            map2.putAll((HashMap) this.f3641j);
        }
        return AbstractC0610a.m1509k(((C0409e) this.f3639h).mo518f(), str2, c1392p.f6188a, map2);
    }

    /* JADX INFO: renamed from: z */
    public byte[] m2184z(C1393q c1393q) {
        return AbstractC0610a.m1509k(((C0409e) this.f3639h).mo518f(), c1393q.f6191b + "&signedRequest=" + AbstractC0632A.m1595n(c1393q.f6190a), null, Collections.EMPTY_MAP);
    }

    public /* synthetic */ C0858A(Object obj, Object obj2, Object obj3, int i3) {
        this.f3638g = i3;
        this.f3639h = obj;
        this.f3640i = obj2;
        this.f3641j = obj3;
    }

    public C0858A(int i3) {
        this.f3638g = i3;
        switch (i3) {
            case 10:
                break;
            case 18:
                this.f3639h = new Object();
                break;
            case 23:
                C1601j c1601j = C1601j.f7249g;
                this.f3639h = new HashSet();
                this.f3640i = c1601j;
                break;
            default:
                this.f3639h = new HashMap();
                this.f3640i = new HashMap();
                this.f3641j = new HashMap();
                break;
        }
    }

    public C0858A(C0233h c0233h) {
        this.f3638g = 7;
        this.f3641j = c0233h;
        this.f3640i = new AtomicLong((AbstractC0295a.f787b.nextLong() & 65535) * 10000);
    }

    public C0858A(CastDevice castDevice, C0183I c0183i) {
        this.f3638g = 3;
        AbstractC0491s.m1214f(castDevice, "CastDevice parameter cannot be null");
        this.f3639h = castDevice;
        this.f3640i = c0183i;
    }

    public C0858A(ArrayList arrayList) {
        this.f3638g = 11;
        this.f3639h = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f3640i = new long[arrayList.size() * 2];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0691d c0691d = (C0691d) arrayList.get(i3);
            int i4 = i3 * 2;
            long[] jArr = (long[]) this.f3640i;
            jArr[i4] = c0691d.f2664b;
            jArr[i4 + 1] = c0691d.f2665c;
        }
        long[] jArr2 = (long[]) this.f3640i;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f3641j = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    public C0858A(List list) {
        this.f3638g = 13;
        this.f3639h = list;
        this.f3640i = new InterfaceC2226E[list.size()];
        this.f3641j = new C0687s(new C0111d(5, this));
    }

    public C0858A(String str) {
        this.f3638g = 12;
        C0582n c0582n = new C0582n();
        c0582n.f2114m = AbstractC0545H.m1364l(str);
        this.f3639h = new C0583o(c0582n);
    }

    public C0858A(C1666w c1666w) {
        this.f3638g = 24;
        this.f3639h = c1666w;
        this.f3640i = new C0069c();
        this.f3641j = new ArrayList();
    }

    public C0858A(InterfaceC2242o interfaceC2242o, InterfaceC0463i interfaceC0463i) {
        this.f3638g = 9;
        this.f3639h = interfaceC2242o;
        this.f3640i = interfaceC0463i;
        this.f3641j = new SparseArray();
    }

    public C0858A(InterfaceC2243p interfaceC2243p) {
        this.f3638g = 26;
        this.f3639h = interfaceC2243p;
    }

    public C0858A(Runnable runnable) {
        this.f3638g = 1;
        this.f3640i = new CopyOnWriteArrayList();
        this.f3641j = new HashMap();
        this.f3639h = runnable;
    }

    public C0858A(Context context, TypedArray typedArray) {
        this.f3638g = 25;
        this.f3639h = context;
        this.f3640i = typedArray;
    }

    public C0858A(Context context, LocationManager locationManager) {
        this.f3638g = 21;
        this.f3641j = new C1466K();
        this.f3639h = context;
        this.f3640i = locationManager;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00cf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v21, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r2v23, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r3v55, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r3v73 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.CharSequence[]] */
    /* JADX WARN: Type inference failed for: r6v25, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r7v30, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r9v13, types: [android.os.Bundle[]] */
    /* JADX WARN: Type inference failed for: r9v15, types: [android.os.Parcelable[]] */
    /* JADX WARN: Type inference failed for: r9v17 */
    public C0858A(C2127j c2127j) {
        ?? r16;
        ?? r5;
        Bundle bundle;
        ?? r9;
        int i3;
        ArrayList arrayList;
        Notification.Action.Builder builderM4675e;
        Bundle bundle2;
        int i4;
        Bitmap bitmapM2361a;
        this.f3638g = 29;
        new ArrayList();
        this.f3641j = new Bundle();
        this.f3640i = c2127j;
        Context context = c2127j.f9184a;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            this.f3639h = AbstractC2132o.m4695a(context, c2127j.f9198o);
        } else {
            this.f3639h = new Notification.Builder(c2127j.f9184a);
        }
        Notification notification = c2127j.f9200q;
        ?? r8 = 0;
        ((Notification.Builder) this.f3639h).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(c2127j.f9188e).setContentText(c2127j.f9189f).setContentInfo(null).setContentIntent(c2127j.f9190g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        int i6 = 23;
        if (i5 < 23) {
            Notification.Builder builder = (Notification.Builder) this.f3639h;
            IconCompat iconCompat = c2127j.f9191h;
            if (iconCompat != null) {
                int i7 = iconCompat.f3952a;
                if (i7 == -1 && i5 >= 23) {
                    Object obj = iconCompat.f3953b;
                    if (obj instanceof Bitmap) {
                        bitmapM2361a = (Bitmap) obj;
                    } else {
                        bitmapM2361a = null;
                    }
                } else if (i7 == 1) {
                    bitmapM2361a = (Bitmap) iconCompat.f3953b;
                } else if (i7 == 5) {
                    bitmapM2361a = IconCompat.m2361a((Bitmap) iconCompat.f3953b, true);
                } else {
                    throw new IllegalStateException("called getBitmap() on " + iconCompat);
                }
            } else {
                bitmapM2361a = null;
            }
            builder.setLargeIcon(bitmapM2361a);
        } else {
            Notification.Builder builder2 = (Notification.Builder) this.f3639h;
            IconCompat iconCompat2 = c2127j.f9191h;
            AbstractC2130m.m4688b(builder2, iconCompat2 == null ? null : iconCompat2.m2365e(context));
        }
        ((Notification.Builder) this.f3639h).setSubText(null).setUsesChronometer(false).setPriority(c2127j.f9192i);
        ArrayList arrayList2 = c2127j.f9185b;
        int size = arrayList2.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj2 = arrayList2.get(i8);
            i8++;
            C2125h c2125h = (C2125h) obj2;
            int i9 = Build.VERSION.SDK_INT;
            if (c2125h.f9176b == null && (i4 = c2125h.f9180f) != 0) {
                c2125h.f9176b = IconCompat.m2362b(null, "", i4);
            }
            IconCompat iconCompat3 = c2125h.f9176b;
            PendingIntent pendingIntent = c2125h.f9182h;
            CharSequence charSequence = c2125h.f9181g;
            if (i9 >= i6) {
                builderM4675e = AbstractC2130m.m4687a(iconCompat3 != null ? iconCompat3.m2365e(null) : null, charSequence, pendingIntent);
            } else {
                builderM4675e = AbstractC2128k.m4675e(iconCompat3 != null ? iconCompat3.m2363c() : 0, charSequence, pendingIntent);
            }
            AbstractC2139v[] abstractC2139vArr = c2125h.f9177c;
            if (abstractC2139vArr != null) {
                int length = abstractC2139vArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                if (abstractC2139vArr.length > 0) {
                    AbstractC2139v abstractC2139v = abstractC2139vArr[0];
                    throw null;
                }
                for (int i10 = 0; i10 < length; i10++) {
                    AbstractC2128k.m4673c(builderM4675e, remoteInputArr[i10]);
                }
            }
            Bundle bundle3 = c2125h.f9175a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            boolean z3 = c2125h.f9178d;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z3);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 24) {
                AbstractC2131n.m4690a(builderM4675e, z3);
            }
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i11 >= 28) {
                AbstractC2133p.m4703b(builderM4675e, 0);
            }
            if (i11 >= 29) {
                AbstractC2134q.m4706c(builderM4675e, false);
            }
            if (i11 >= 31) {
                AbstractC2135r.m4708a(builderM4675e, false);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", c2125h.f9179e);
            AbstractC2128k.m4672b(builderM4675e, bundle2);
            AbstractC2128k.m4671a((Notification.Builder) this.f3639h, AbstractC2128k.m4674d(builderM4675e));
            i6 = 23;
        }
        Bundle bundle4 = c2127j.f9196m;
        if (bundle4 != null) {
            ((Bundle) this.f3641j).putAll(bundle4);
        }
        int i12 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f3639h).setShowWhen(c2127j.f9193j);
        AbstractC2128k.m4679i((Notification.Builder) this.f3639h, c2127j.f9195l);
        AbstractC2128k.m4677g((Notification.Builder) this.f3639h, null);
        AbstractC2128k.m4680j((Notification.Builder) this.f3639h, null);
        AbstractC2128k.m4678h((Notification.Builder) this.f3639h, false);
        AbstractC2129l.m4682b((Notification.Builder) this.f3639h, null);
        AbstractC2129l.m4683c((Notification.Builder) this.f3639h, 0);
        AbstractC2129l.m4686f((Notification.Builder) this.f3639h, c2127j.f9197n);
        AbstractC2129l.m4684d((Notification.Builder) this.f3639h, null);
        AbstractC2129l.m4685e((Notification.Builder) this.f3639h, notification.sound, notification.audioAttributes);
        ArrayList arrayList3 = c2127j.f9201r;
        ArrayList arrayList4 = c2127j.f9186c;
        if (i12 < 28) {
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    C2019f c2019f = new C2019f(arrayList3.size() + arrayList.size());
                    c2019f.addAll(arrayList);
                    c2019f.addAll(arrayList3);
                    arrayList3 = new ArrayList(c2019f);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj3 = arrayList3.get(i13);
                i13++;
                AbstractC2129l.m4681a((Notification.Builder) this.f3639h, (String) obj3);
            }
        }
        ArrayList arrayList5 = c2127j.f9187d;
        if (arrayList5.size() > 0) {
            if (c2127j.f9196m == null) {
                c2127j.f9196m = new Bundle();
            }
            Bundle bundle5 = c2127j.f9196m.getBundle("android.car.EXTENSIONS");
            ?? bundle6 = bundle5 == null ? new Bundle() : bundle5;
            ?? bundle7 = new Bundle((Bundle) bundle6);
            ?? bundle8 = new Bundle();
            int i14 = 0;
            while (i14 < arrayList5.size()) {
                String string = Integer.toString(i14);
                C2125h c2125h2 = (C2125h) arrayList5.get(i14);
                ?? bundle9 = new Bundle();
                if (c2125h2.f9176b == null && (i3 = c2125h2.f9180f) != 0) {
                    c2125h2.f9176b = IconCompat.m2362b(r8, "", i3);
                }
                IconCompat iconCompat4 = c2125h2.f9176b;
                ?? r17 = r8;
                bundle9.putInt("icon", iconCompat4 != null ? iconCompat4.m2363c() : 0);
                bundle9.putCharSequence("title", c2125h2.f9181g);
                bundle9.putParcelable("actionIntent", c2125h2.f9182h);
                Bundle bundle10 = c2125h2.f9175a;
                if (bundle10 != null) {
                    bundle = new Bundle(bundle10);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", c2125h2.f9178d);
                bundle9.putBundle("extras", bundle);
                AbstractC2139v[] abstractC2139vArr2 = c2125h2.f9177c;
                if (abstractC2139vArr2 == null) {
                    r9 = r17;
                } else {
                    r9 = new Bundle[abstractC2139vArr2.length];
                    if (abstractC2139vArr2.length > 0) {
                        AbstractC2139v abstractC2139v2 = abstractC2139vArr2[0];
                        new Bundle();
                        throw r17;
                    }
                }
                bundle9.putParcelableArray("remoteInputs", r9);
                bundle9.putBoolean("showsUserInterface", c2125h2.f9179e);
                bundle9.putInt("semanticAction", 0);
                bundle8.putBundle(string, bundle9);
                i14++;
                r8 = r17;
                arrayList5 = arrayList5;
            }
            r16 = r8;
            bundle6.putBundle("invisible_actions", bundle8);
            bundle7.putBundle("invisible_actions", bundle8);
            if (c2127j.f9196m == null) {
                c2127j.f9196m = new Bundle();
            }
            c2127j.f9196m.putBundle("android.car.EXTENSIONS", bundle6);
            ((Bundle) this.f3641j).putBundle("android.car.EXTENSIONS", bundle7);
        } else {
            r16 = 0;
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 24) {
            ((Notification.Builder) this.f3639h).setExtras(c2127j.f9196m);
            ?? r6 = r16;
            AbstractC2131n.m4694e((Notification.Builder) this.f3639h, r6);
            r5 = r6;
        } else {
            r5 = r16;
        }
        if (i15 >= 26) {
            AbstractC2132o.m4696b((Notification.Builder) this.f3639h, 0);
            AbstractC2132o.m4699e((Notification.Builder) this.f3639h, r5);
            AbstractC2132o.m4700f((Notification.Builder) this.f3639h, r5);
            AbstractC2132o.m4701g((Notification.Builder) this.f3639h, 0L);
            AbstractC2132o.m4698d((Notification.Builder) this.f3639h, 0);
            if (!TextUtils.isEmpty(c2127j.f9198o)) {
                ((Notification.Builder) this.f3639h).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i15 >= 28) {
            Iterator it2 = arrayList4.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
        }
        if (i15 >= 29) {
            AbstractC2134q.m4704a((Notification.Builder) this.f3639h, c2127j.f9199p);
            AbstractC2134q.m4705b((Notification.Builder) this.f3639h, null);
        }
    }

    @Override // p011E.InterfaceC0115h
    /* JADX INFO: renamed from: e */
    public void mo552e() {
    }

    public C0858A(String str, C0409e c0409e) {
        this.f3638g = 19;
        this.f3639h = c0409e;
        this.f3640i = str;
        this.f3641j = new HashMap();
    }

    public C0858A(C0536b c0536b, C0352g c0352g, C0913c c0913c, Set set) {
        this.f3638g = 14;
        this.f3639h = c0352g;
        this.f3640i = c0536b;
        this.f3641j = c0913c;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m2169R(str, 0, str.length(), 1, true, new C0924n(str, false));
        }
    }

    public C0858A(InterfaceC0604d[] interfaceC0604dArr) {
        this.f3638g = 15;
        C1122D c1122d = new C1122D();
        C0607g c0607g = new C0607g();
        c0607g.f2284c = 1.0f;
        c0607g.f2285d = 1.0f;
        C0602b c0602b = C0602b.f2247e;
        c0607g.f2286e = c0602b;
        c0607g.f2287f = c0602b;
        c0607g.f2288g = c0602b;
        c0607g.f2289h = c0602b;
        ByteBuffer byteBuffer = InterfaceC0604d.f2252a;
        c0607g.f2292k = byteBuffer;
        c0607g.f2293l = byteBuffer.asShortBuffer();
        c0607g.f2294m = byteBuffer;
        c0607g.f2283b = -1;
        InterfaceC0604d[] interfaceC0604dArr2 = new InterfaceC0604d[interfaceC0604dArr.length + 2];
        this.f3639h = interfaceC0604dArr2;
        System.arraycopy(interfaceC0604dArr, 0, interfaceC0604dArr2, 0, interfaceC0604dArr.length);
        this.f3640i = c1122d;
        this.f3641j = c0607g;
        interfaceC0604dArr2[interfaceC0604dArr.length] = c1122d;
        interfaceC0604dArr2[interfaceC0604dArr.length + 1] = c0607g;
    }

    public C0858A(Context context, ComponentName componentName, PendingIntent pendingIntent) {
        this.f3638g = 0;
        this.f3641j = new ArrayList();
        if (context != null) {
            if (!TextUtils.isEmpty("CastMediaSession")) {
                if (componentName == null) {
                    int i3 = AbstractC1411K.f6248a;
                    Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent.setPackage(context.getPackageName());
                    List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers.size() == 1) {
                        ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
                        componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                    } else {
                        if (listQueryBroadcastReceivers.size() > 1) {
                            Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                        }
                        componentName = null;
                    }
                    if (componentName == null) {
                        Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                    }
                }
                if (componentName != null && pendingIntent == null) {
                    Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                    intent2.setComponent(componentName);
                    pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
                }
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 29) {
                    this.f3639h = new C0888x(context);
                } else if (i4 >= 28) {
                    this.f3639h = new C0887w(context);
                } else if (i4 >= 22) {
                    this.f3639h = new C0886v(context);
                } else {
                    this.f3639h = new C0885u(context);
                }
                m2173V(new C0880p(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
                ((C0885u) this.f3639h).f3702a.setMediaButtonReceiver(pendingIntent);
                this.f3640i = new C0106b(context, ((C0885u) this.f3639h).f3704c);
                if (f3636k == 0) {
                    f3636k = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public C0858A(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f3638g = 22;
        this.f3640i = arrayDeque;
        this.f3639h = bufferedReader;
    }

    public C0858A(C1433f c1433f, C0858A c0858a) {
        this.f3638g = 20;
        this.f3641j = c1433f;
        this.f3639h = c0858a;
    }

    public C0858A(AudioTrack audioTrack, C1129e c1129e) {
        this.f3638g = 16;
        this.f3639h = audioTrack;
        this.f3640i = c1129e;
        this.f3641j = new AudioRouting.OnRoutingChangedListener() { // from class: c0.v
            @Override // android.media.AudioRouting.OnRoutingChangedListener
            public final void onRoutingChanged(AudioRouting audioRouting) {
                C0858A c0858a = this.f5332a;
                if (((C1146v) c0858a.f3641j) == null || audioRouting.getRoutedDevice() == null) {
                    return;
                }
                ((C1129e) c0858a.f3640i).m3010b(audioRouting.getRoutedDevice());
            }
        };
        audioTrack.addOnRoutingChangedListener((C1146v) this.f3641j, new Handler(Looper.myLooper()));
    }

    public C0858A(C1150z c1150z) {
        this.f3638g = 17;
        this.f3641j = c1150z;
        this.f3639h = new Handler(Looper.myLooper());
        this.f3640i = new C1149y(this);
    }
}
