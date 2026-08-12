package p066W1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.media.MediaCodecInfo;
import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.StrictMode;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.PopupWindow;
import com.google.android.gms.internal.cast.AbstractC1179G1;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.R;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.Inflater;
import p000A.AbstractC0034e0;
import p000A.AbstractC0050m0;
import p014F.AbstractC0164m;
import p036M0.C0368e;
import p045P0.AbstractC0462h;
import p048Q0.C0508g;
import p049Q1.C0513b;
import p055T.AbstractC0545H;
import p055T.C0582n;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p089d1.AbstractC1404D;
import p089d1.C1441n;
import p089d1.C1442o;
import p095f0.C1528a;
import p103h0.AbstractC1616y;
import p103h0.C1601j;
import p103h0.C1606o;
import p103h0.C1613v;
import p105h2.C1692X;
import p113k.C1905z;
import p128o.AbstractC2056g;
import p128o.C2052c;
import p128o.C2055f;
import p141r0.C2188e;
import p144s.C2212f;
import p160x.C2348g;

/* JADX INFO: renamed from: W1.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0664e {

    /* JADX INFO: renamed from: a */
    public static ClassLoader f2555a;

    /* JADX INFO: renamed from: b */
    public static Thread f2556b;

    /* JADX INFO: renamed from: c */
    public static Method f2557c;

    /* JADX INFO: renamed from: d */
    public static boolean f2558d;

    /* JADX INFO: renamed from: e */
    public static Field f2559e;

    /* JADX INFO: renamed from: f */
    public static boolean f2560f;

    /* JADX INFO: renamed from: g */
    public static long f2561g;

    /* JADX INFO: renamed from: h */
    public static Method f2562h;

    public AbstractC0664e() {
        new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: A */
    public static Set m1718A() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX INFO: renamed from: B */
    public static ArrayList m1719B(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoM265c = AbstractC0050m0.m265c(it.next());
            if (mediaRoute2InfoM265c != null) {
                arrayList.add(mediaRoute2InfoM265c.getId());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: C */
    public static boolean m1720C() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX INFO: renamed from: D */
    public static boolean m1721D() {
        try {
            if (f2562h == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f2562h == null) {
                f2561g = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f2562h = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f2562h.invoke(null, Long.valueOf(f2561g))).booleanValue();
        } catch (Exception e3) {
            if (!(e3 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e3);
                return false;
            }
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX INFO: renamed from: E */
    public static ArrayList m1722E(C0651s c0651s) {
        ArrayList arrayList;
        int i3;
        Object c2188e;
        C0651s c0651s2 = c0651s;
        ArrayList arrayList2 = null;
        arrayList2 = null;
        arrayList2 = null;
        if (c0651s2.m1687u() == 0) {
            c0651s2.m1666H(7);
            int iM1673g = c0651s2.m1673g();
            if (iM1673g == 1684433976) {
                C0651s c0651s3 = new C0651s();
                Inflater inflater = new Inflater(true);
                try {
                    if (!AbstractC0632A.m1565F(c0651s2, c0651s3, inflater)) {
                        inflater.end();
                        return null;
                    }
                    inflater.end();
                    c0651s2 = c0651s3;
                } catch (Throwable th) {
                    inflater.end();
                    throw th;
                }
            } else if (iM1673g == 1918990112) {
            }
            ArrayList arrayList3 = new ArrayList();
            int i4 = c0651s2.f2521b;
            int i5 = c0651s2.f2522c;
            while (i4 < i5) {
                int iM1673g2 = c0651s2.m1673g() + i4;
                if (iM1673g2 > i4 && iM1673g2 <= i5) {
                    if (c0651s2.m1673g() == 1835365224) {
                        int iM1673g3 = c0651s2.m1673g();
                        if (iM1673g3 > 10000) {
                            ArrayList arrayList4 = arrayList2;
                            arrayList = arrayList4;
                            i3 = i5;
                            c2188e = arrayList4;
                        } else {
                            float[] fArr = new float[iM1673g3];
                            for (int i6 = 0; i6 < iM1673g3; i6++) {
                                fArr[i6] = Float.intBitsToFloat(c0651s2.m1673g());
                            }
                            int iM1673g4 = c0651s2.m1673g();
                            if (iM1673g4 > 32000) {
                                ArrayList arrayList5 = arrayList2;
                                arrayList = arrayList5;
                                i3 = i5;
                                c2188e = arrayList5;
                            } else {
                                double dLog = Math.log(2.0d);
                                ArrayList arrayList6 = arrayList2;
                                int iCeil = (int) Math.ceil(Math.log(((double) iM1673g3) * 2.0d) / dLog);
                                byte[] bArr = c0651s2.f2520a;
                                C0508g c0508g = new C0508g(bArr, bArr.length);
                                c0508g.m1260q(c0651s2.f2521b * 8);
                                float[] fArr2 = new float[iM1673g4 * 5];
                                int i7 = 5;
                                int[] iArr = new int[5];
                                ArrayList arrayList7 = arrayList6;
                                int i8 = 0;
                                int i9 = 0;
                                while (true) {
                                    if (i8 < iM1673g4) {
                                        int i10 = 0;
                                        while (true) {
                                            if (i10 < i7) {
                                                int i11 = iArr[i10];
                                                int iM1252i = c0508g.m1252i(iCeil);
                                                int i12 = ((iM1252i >> 1) ^ (-(iM1252i & 1))) + i11;
                                                if (i12 < iM1673g3 && i12 >= 0) {
                                                    fArr2[i9] = fArr[i12];
                                                    iArr[i10] = i12;
                                                    i10++;
                                                    i9++;
                                                    i7 = 5;
                                                }
                                            } else {
                                                i8++;
                                                i7 = 5;
                                            }
                                        }
                                    } else {
                                        c0508g.m1260q((c0508g.m1250g() + 7) & (-8));
                                        int i13 = 32;
                                        int iM1252i2 = c0508g.m1252i(32);
                                        C0368e[] c0368eArr = new C0368e[iM1252i2];
                                        int i14 = 0;
                                        while (true) {
                                            if (i14 < iM1252i2) {
                                                int iM1252i3 = c0508g.m1252i(8);
                                                int iM1252i4 = c0508g.m1252i(8);
                                                int iM1252i5 = c0508g.m1252i(i13);
                                                if (iM1252i5 <= 128000) {
                                                    int i15 = iM1252i2;
                                                    float[] fArr3 = fArr2;
                                                    int iCeil2 = (int) Math.ceil(Math.log(((double) iM1673g4) * 2.0d) / dLog);
                                                    float[] fArr4 = new float[iM1252i5 * 3];
                                                    float[] fArr5 = new float[iM1252i5 * 2];
                                                    i3 = i5;
                                                    int i16 = 0;
                                                    int i17 = 0;
                                                    while (true) {
                                                        if (i16 < iM1252i5) {
                                                            int iM1252i6 = c0508g.m1252i(iCeil2);
                                                            C0508g c0508g2 = c0508g;
                                                            int i18 = ((iM1252i6 >> 1) ^ (-(iM1252i6 & 1))) + i17;
                                                            if (i18 >= 0 && i18 < iM1673g4) {
                                                                int i19 = i16 * 3;
                                                                int i20 = i18 * 5;
                                                                fArr4[i19] = fArr3[i20];
                                                                fArr4[i19 + 1] = fArr3[i20 + 1];
                                                                fArr4[i19 + 2] = fArr3[i20 + 2];
                                                                int i21 = i16 * 2;
                                                                fArr5[i21] = fArr3[i20 + 3];
                                                                fArr5[i21 + 1] = fArr3[i20 + 4];
                                                                i16++;
                                                                i17 = i18;
                                                                c0508g = c0508g2;
                                                            }
                                                        } else {
                                                            c0368eArr[i14] = new C0368e(iM1252i3, fArr4, fArr5, iM1252i4);
                                                            i14++;
                                                            iM1252i2 = i15;
                                                            fArr2 = fArr3;
                                                            i5 = i3;
                                                            c0508g = c0508g;
                                                            i13 = 32;
                                                        }
                                                    }
                                                }
                                                c2188e = arrayList7;
                                                arrayList = arrayList7;
                                            } else {
                                                i3 = i5;
                                                c2188e = new C2188e(c0368eArr);
                                                arrayList = arrayList7;
                                            }
                                        }
                                    }
                                    i3 = i5;
                                    c2188e = arrayList7;
                                    arrayList = arrayList7;
                                }
                            }
                        }
                        if (c2188e == null) {
                            return arrayList;
                        }
                        arrayList3.add(c2188e);
                    } else {
                        arrayList = arrayList2;
                        i3 = i5;
                    }
                    c0651s2.m1665G(iM1673g2);
                    i4 = iM1673g2;
                    arrayList2 = arrayList;
                    i5 = i3;
                }
            }
            return arrayList3;
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: H */
    public static boolean m1723H(Parcel parcel, int i3) {
        m1746e0(parcel, i3, 4);
        return parcel.readInt() != 0;
    }

    /* JADX INFO: renamed from: I */
    public static Boolean m1724I(Parcel parcel, int i3) {
        int iM1730O = m1730O(parcel, i3);
        if (iM1730O == 0) {
            return null;
        }
        m1742b0(parcel, iM1730O);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* JADX INFO: renamed from: J */
    public static double m1725J(Parcel parcel, int i3) {
        m1746e0(parcel, i3, 8);
        return parcel.readDouble();
    }

    /* JADX INFO: renamed from: K */
    public static int m1726K(C0508g c0508g, int i3, int i4, int i5) {
        AbstractC0646n.m1625c(Math.max(Math.max(i3, i4), i5) <= 31);
        int i6 = (1 << i3) - 1;
        int i7 = (1 << i4) - 1;
        m1748i(m1748i(i6, i7), 1 << i5);
        if (c0508g.m1245b() < i3) {
            return -1;
        }
        int iM1252i = c0508g.m1252i(i3);
        if (iM1252i == i6) {
            if (c0508g.m1245b() < i4) {
                return -1;
            }
            int iM1252i2 = c0508g.m1252i(i4);
            iM1252i += iM1252i2;
            if (iM1252i2 == i7) {
                if (c0508g.m1245b() < i5) {
                    return -1;
                }
                return c0508g.m1252i(i5) + iM1252i;
            }
        }
        return iM1252i;
    }

    /* JADX INFO: renamed from: L */
    public static IBinder m1727L(Parcel parcel, int i3) {
        int iM1730O = m1730O(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (iM1730O == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iM1730O);
        return strongBinder;
    }

    /* JADX INFO: renamed from: M */
    public static int m1728M(Parcel parcel, int i3) {
        m1746e0(parcel, i3, 4);
        return parcel.readInt();
    }

    /* JADX INFO: renamed from: N */
    public static long m1729N(Parcel parcel, int i3) {
        m1746e0(parcel, i3, 8);
        return parcel.readLong();
    }

    /* JADX INFO: renamed from: O */
    public static int m1730O(Parcel parcel, int i3) {
        return (i3 & (-65536)) != -65536 ? (char) (i3 >> 16) : parcel.readInt();
    }

    /* JADX INFO: renamed from: Q */
    public static void m1731Q(C1905z c1905z, boolean z3) {
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC0164m.m630c(c1905z, z3);
            return;
        }
        if (!f2560f) {
            try {
                Field declaredField = PopupWindow.class.getDeclaredField("mOverlapAnchor");
                f2559e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.i("PopupWindowCompatApi21", "Could not fetch mOverlapAnchor field from PopupWindow", e3);
            }
            f2560f = true;
        }
        Field field = f2559e;
        if (field != null) {
            try {
                field.set(c1905z, Boolean.valueOf(z3));
            } catch (IllegalAccessException e4) {
                Log.i("PopupWindowCompatApi21", "Could not set overlap anchor field in PopupWindow", e4);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m1732R(PopupWindow popupWindow, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC0164m.m631d(popupWindow, i3);
            return;
        }
        if (!f2558d) {
            try {
                Method declaredMethod = PopupWindow.class.getDeclaredMethod("setWindowLayoutType", Integer.TYPE);
                f2557c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Exception unused) {
            }
            f2558d = true;
        }
        Method method = f2557c;
        if (method != null) {
            try {
                method.invoke(popupWindow, Integer.valueOf(i3));
            } catch (Exception unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m1733S(C0508g c0508g) {
        c0508g.m1263t(3);
        c0508g.m1263t(8);
        boolean zM1251h = c0508g.m1251h();
        boolean zM1251h2 = c0508g.m1251h();
        if (zM1251h) {
            c0508g.m1263t(5);
        }
        if (zM1251h2) {
            c0508g.m1263t(6);
        }
    }

    /* JADX INFO: renamed from: T */
    public static void m1734T(C0508g c0508g) {
        int iM1252i;
        int iM1252i2 = c0508g.m1252i(2);
        if (iM1252i2 == 0) {
            c0508g.m1263t(6);
            return;
        }
        int iM1726K = m1726K(c0508g, 5, 8, 16) + 1;
        if (iM1252i2 == 1) {
            c0508g.m1263t(iM1726K * 7);
            return;
        }
        if (iM1252i2 == 2) {
            boolean zM1251h = c0508g.m1251h();
            int i3 = zM1251h ? 1 : 5;
            int i4 = zM1251h ? 7 : 5;
            int i5 = zM1251h ? 8 : 6;
            int i6 = 0;
            while (i6 < iM1726K) {
                if (c0508g.m1251h()) {
                    c0508g.m1263t(7);
                    iM1252i = 0;
                } else {
                    if (c0508g.m1252i(2) == 3 && c0508g.m1252i(i4) * i3 != 0) {
                        c0508g.m1262s();
                    }
                    iM1252i = c0508g.m1252i(i5) * i3;
                    if (iM1252i != 0 && iM1252i != 180) {
                        c0508g.m1262s();
                    }
                    c0508g.m1262s();
                }
                if (iM1252i != 0 && iM1252i != 180 && c0508g.m1251h()) {
                    i6++;
                }
                i6++;
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public static void m1735U(Parcel parcel, int i3) {
        parcel.setDataPosition(parcel.dataPosition() + m1730O(parcel, i3));
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d7  */
    /* JADX INFO: renamed from: X */
    public static C1442o m1736X(MediaRoute2Info mediaRoute2Info) {
        int i3;
        if (mediaRoute2Info != null) {
            C1441n c1441n = new C1441n(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
            int connectionState = mediaRoute2Info.getConnectionState();
            Bundle bundle = c1441n.f6383a;
            bundle.putInt("connectionState", connectionState);
            bundle.putInt("volumeHandling", mediaRoute2Info.getVolumeHandling());
            bundle.putInt("volumeMax", mediaRoute2Info.getVolumeMax());
            bundle.putInt("volume", mediaRoute2Info.getVolume());
            Bundle extras = mediaRoute2Info.getExtras();
            if (extras == null) {
                bundle.putBundle("extras", null);
            } else {
                bundle.putBundle("extras", new Bundle(extras));
            }
            bundle.putBoolean("enabled", true);
            bundle.putBoolean("canDisconnect", false);
            if (Build.VERSION.SDK_INT >= 34) {
                bundle.putStringArrayList("deduplicationIds", new ArrayList<>(AbstractC1404D.m3506b(mediaRoute2Info)));
                int iM3507c = AbstractC1404D.m3507c(mediaRoute2Info);
                i3 = 2;
                if (iM3507c == 2) {
                    i3 = 12;
                } else if (iM3507c == 3) {
                    i3 = 13;
                } else if (iM3507c == 4) {
                    i3 = 14;
                } else if (iM3507c == 22) {
                    i3 = 20;
                } else if (iM3507c == 23) {
                    i3 = 21;
                } else if (iM3507c == 26) {
                    i3 = 22;
                } else if (iM3507c == 29) {
                    i3 = 24;
                } else if (iM3507c != 2000) {
                    switch (iM3507c) {
                        case 8:
                            i3 = 3;
                            break;
                        case 9:
                            i3 = 16;
                            break;
                        case 10:
                            i3 = 23;
                            break;
                        case 11:
                            i3 = 17;
                            break;
                        case 12:
                            i3 = 18;
                            break;
                        case 13:
                            i3 = 19;
                            break;
                        default:
                            switch (iM3507c) {
                                case 1001:
                                    i3 = 1;
                                    break;
                                case 1002:
                                    break;
                                case 1003:
                                    i3 = 4;
                                    break;
                                case 1004:
                                    i3 = 5;
                                    break;
                                case 1005:
                                    i3 = 6;
                                    break;
                                case 1006:
                                    i3 = 7;
                                    break;
                                case 1007:
                                    i3 = 8;
                                    break;
                                case 1008:
                                    i3 = 9;
                                    break;
                                case 1009:
                                    i3 = 10;
                                    break;
                                case 1010:
                                    i3 = 11;
                                    break;
                                default:
                                    i3 = 0;
                                    break;
                            }
                            break;
                    }
                } else {
                    i3 = 1000;
                }
            } else {
                i3 = 0;
            }
            CharSequence description = mediaRoute2Info.getDescription();
            if (description != null) {
                bundle.putString("status", description.toString());
            }
            Uri iconUri = mediaRoute2Info.getIconUri();
            if (iconUri != null) {
                bundle.putString("iconUri", iconUri.toString());
            }
            Bundle extras2 = mediaRoute2Info.getExtras();
            if (extras2 != null && extras2.containsKey("androidx.mediarouter.media.KEY_EXTRAS") && extras2.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") && extras2.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
                Bundle bundle2 = extras2.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
                if (bundle2 == null) {
                    bundle.putBundle("extras", null);
                } else {
                    bundle.putBundle("extras", new Bundle(bundle2));
                }
                if (i3 == 0) {
                    i3 = extras2.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0);
                }
                bundle.putInt("deviceType", i3);
                bundle.putInt("playbackType", extras2.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
                ArrayList parcelableArrayList = extras2.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
                if (parcelableArrayList != null) {
                    c1441n.m3605a(parcelableArrayList);
                }
                return c1441n.m3606b();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Y */
    public static int m1737Y(Parcel parcel) {
        int i3 = parcel.readInt();
        int iM1730O = m1730O(parcel, i3);
        char c = (char) i3;
        int iDataPosition = parcel.dataPosition();
        if (c != 20293) {
            throw new C0513b("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i3))), parcel);
        }
        int i4 = iM1730O + iDataPosition;
        if (i4 >= iDataPosition && i4 <= parcel.dataSize()) {
            return i4;
        }
        throw new C0513b("Size read is invalid start=" + iDataPosition + " end=" + i4, parcel);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ab A[Catch: all -> 0x00a7, PHI: r1
      0x00ab: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v15 java.lang.Thread) binds: [B:7:0x000a, B:47:0x00a4] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:46:0x00a2, B:61:0x00d1, B:12:0x001f, B:52:0x00aa, B:53:0x00ab, B:64:0x00d5, B:65:0x00d6, B:54:0x00ac, B:60:0x00d0, B:59:0x00b6, B:13:0x0020, B:15:0x002d, B:25:0x0047, B:26:0x004e, B:28:0x0059, B:34:0x006e, B:35:0x0075, B:43:0x0086, B:44:0x00a0, B:18:0x003c), top: B:77:0x0003, inners: #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: Z */
    public static synchronized ClassLoader m1738Z() {
        SecurityException e3;
        Thread thread;
        ThreadGroup threadGroup;
        if (f2555a == null) {
            Thread thread2 = f2556b;
            ClassLoader contextClassLoader = null;
            if (thread2 != null) {
                synchronized (thread2) {
                    try {
                        contextClassLoader = f2556b.getContextClassLoader();
                    } catch (SecurityException e4) {
                        Log.w("DynamiteLoaderV2CL", "Failed to get thread context classloader " + e4.getMessage());
                    }
                }
                f2555a = contextClassLoader;
            } else {
                ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
                if (threadGroup2 == null) {
                    thread2 = null;
                } else {
                    synchronized (Void.class) {
                        try {
                            try {
                                int iActiveGroupCount = threadGroup2.activeGroupCount();
                                ThreadGroup[] threadGroupArr = new ThreadGroup[iActiveGroupCount];
                                threadGroup2.enumerate(threadGroupArr);
                                int i3 = 0;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= iActiveGroupCount) {
                                        threadGroup = null;
                                        break;
                                    }
                                    threadGroup = threadGroupArr[i4];
                                    if ("dynamiteLoader".equals(threadGroup.getName())) {
                                        break;
                                    }
                                    i4++;
                                }
                                if (threadGroup == null) {
                                    threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                                }
                                int iActiveCount = threadGroup.activeCount();
                                Thread[] threadArr = new Thread[iActiveCount];
                                threadGroup.enumerate(threadArr);
                                while (true) {
                                    if (i3 >= iActiveCount) {
                                        thread = null;
                                        break;
                                    }
                                    thread = threadArr[i3];
                                    if ("GmsDynamite".equals(thread.getName())) {
                                        break;
                                    }
                                    i3++;
                                }
                                if (thread == null) {
                                    try {
                                        C0663d c0663d = new C0663d(threadGroup, "GmsDynamite");
                                        try {
                                            c0663d.setContextClassLoader(null);
                                            c0663d.start();
                                            thread = c0663d;
                                        } catch (SecurityException e5) {
                                            e3 = e5;
                                            thread = c0663d;
                                            Log.w("DynamiteLoaderV2CL", "Failed to enumerate thread/threadgroup " + e3.getMessage());
                                        }
                                    } catch (SecurityException e6) {
                                        e3 = e6;
                                    }
                                }
                            } catch (SecurityException e7) {
                                e3 = e7;
                                thread = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    thread2 = thread;
                }
                f2556b = thread2;
                if (thread2 != null) {
                    synchronized (thread2) {
                        contextClassLoader = f2556b.getContextClassLoader();
                    }
                }
                f2555a = contextClassLoader;
            }
        }
        return f2555a;
    }

    /* JADX INFO: renamed from: a */
    public static Object m1739a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX INFO: renamed from: a0 */
    public static Object m1740a0(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            return callable.call();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m1741b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m1742b0(Parcel parcel, int i3) {
        if (i3 == 4) {
            return;
        }
        throw new C0513b("Expected size 4 got " + i3 + " (0x" + Integer.toHexString(i3) + ")", parcel);
    }

    /* JADX INFO: renamed from: c */
    public static String m1743c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b3 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b3)));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ boolean m1744c0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AbstractC1179G1 abstractC1179G1, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(abstractC1179G1, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(abstractC1179G1) != obj && atomicReferenceFieldUpdater.get(abstractC1179G1) != obj) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d0 */
    public static String m1745d0(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = objArr.length;
            if (i4 >= length) {
                break;
            }
            Object obj = objArr[i4];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e3) {
                    String str2 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e3);
                    string = "<" + str2 + " threw " + e3.getClass().getName() + ">";
                }
            }
            objArr[i4] = string;
            i4++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i5 = 0;
        while (true) {
            length2 = objArr.length;
            if (i3 >= length2 || (iIndexOf = str.indexOf("%s", i5)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i5, iIndexOf);
            sb.append(objArr[i3]);
            i3++;
            i5 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i5, str.length());
        if (i3 < length2) {
            sb.append(" [");
            sb.append(objArr[i3]);
            for (int i6 = i3 + 1; i6 < objArr.length; i6++) {
                sb.append(", ");
                sb.append(objArr[i6]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m1746e0(Parcel parcel, int i3, int i4) {
        int iM1730O = m1730O(parcel, i3);
        if (iM1730O == i4) {
            return;
        }
        throw new C0513b("Expected size " + i4 + " got " + iM1730O + " (0x" + Integer.toHexString(iM1730O) + ")", parcel);
    }

    /* JADX INFO: renamed from: h */
    public static void m1747h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m1748i(int i3, int i4) {
        long j3 = ((long) i3) + ((long) i4);
        int i5 = (int) j3;
        if (j3 == ((long) i5)) {
            return i5;
        }
        throw new ArithmeticException("overflow: checkedAdd(" + i3 + ", " + i4 + ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static long[] m1749j(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i3 = 0; i3 < iArr.length; i3++) {
            jArr[i3] = iArr[i3];
        }
        return jArr;
    }

    /* JADX INFO: renamed from: k */
    public static Bundle m1750k(Parcel parcel, int i3) {
        int iM1730O = m1730O(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (iM1730O == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iM1730O);
        return bundle;
    }

    /* JADX INFO: renamed from: p */
    public static int[] m1751p(Parcel parcel, int i3) {
        int iM1730O = m1730O(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (iM1730O == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iM1730O);
        return iArrCreateIntArray;
    }

    /* JADX INFO: renamed from: q */
    public static long[] m1752q(Parcel parcel, int i3) {
        int iM1730O = m1730O(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (iM1730O == 0) {
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(iDataPosition + iM1730O);
        return jArrCreateLongArray;
    }

    /* JADX INFO: renamed from: r */
    public static Parcelable m1753r(Parcel parcel, int i3, Parcelable.Creator creator) {
        int iM1730O = m1730O(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (iM1730O == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iM1730O);
        return parcelable;
    }

    /* JADX INFO: renamed from: s */
    public static String m1754s(Parcel parcel, int i3) {
        int iM1730O = m1730O(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (iM1730O == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iM1730O);
        return string;
    }

    /* JADX INFO: renamed from: t */
    public static ArrayList m1755t(Parcel parcel, int i3) {
        int iM1730O = m1730O(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (iM1730O == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iM1730O);
        return arrayListCreateStringArrayList;
    }

    /* JADX INFO: renamed from: u */
    public static Object[] m1756u(Parcel parcel, int i3, Parcelable.Creator creator) {
        int iM1730O = m1730O(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (iM1730O == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iM1730O);
        return objArrCreateTypedArray;
    }

    /* JADX INFO: renamed from: v */
    public static ArrayList m1757v(Parcel parcel, int i3, Parcelable.Creator creator) {
        int iM1730O = m1730O(parcel, i3);
        int iDataPosition = parcel.dataPosition();
        if (iM1730O == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iM1730O);
        return arrayListCreateTypedArrayList;
    }

    /* JADX INFO: renamed from: w */
    public static void m1758w(Parcel parcel, int i3) {
        if (parcel.dataPosition() != i3) {
            throw new C0513b(AbstractC0462h.m1165e(i3, "Overread allowed size end="), parcel);
        }
    }

    /* JADX INFO: renamed from: x */
    public static int m1759x(boolean z3) {
        List supportedPerformancePoints;
        try {
            C0582n c0582n = new C0582n();
            c0582n.f2114m = AbstractC0545H.m1364l("video/avc");
            C0583o c0583o = new C0583o(c0582n);
            if (c0583o.f2154n != null) {
                C1692X c1692xM3987g = AbstractC1616y.m3987g(C1601j.f7250h, c0583o, z3, false);
                for (int i3 = 0; i3 < c1692xM3987g.f7631j; i3++) {
                    if (((C1606o) c1692xM3987g.get(i3)).f7255d != null && ((C1606o) c1692xM3987g.get(i3)).f7255d.getVideoCapabilities() != null && (supportedPerformancePoints = ((C1606o) c1692xM3987g.get(i3)).f7255d.getVideoCapabilities().getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                        AbstractC0034e0.m198l();
                        MediaCodecInfo.VideoCapabilities.PerformancePoint performancePointM187a = AbstractC0034e0.m187a();
                        for (int i4 = 0; i4 < supportedPerformancePoints.size(); i4++) {
                            if (AbstractC0034e0.m189c(supportedPerformancePoints.get(i4)).covers(performancePointM187a)) {
                                return 2;
                            }
                        }
                        return 1;
                    }
                }
            }
        } catch (C1613v unused) {
        }
        return 0;
    }

    /* JADX INFO: renamed from: z */
    public static int m1760z(Context context) {
        float fraction;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(z3 ? R.dimen.mr_dialog_fixed_width_minor : R.dimen.mr_dialog_fixed_width_major, typedValue, true);
        int i3 = typedValue.type;
        if (i3 == 5) {
            fraction = typedValue.getDimension(displayMetrics);
        } else {
            if (i3 != 6) {
                return -2;
            }
            int i4 = displayMetrics.widthPixels;
            fraction = typedValue.getFraction(i4, i4);
        }
        return (int) fraction;
    }

    /* JADX INFO: renamed from: F */
    public abstract void mo1761F(C2055f c2055f, C2055f c2055f2);

    /* JADX INFO: renamed from: G */
    public abstract void mo1762G(C2055f c2055f, Thread thread);

    /* JADX INFO: renamed from: V */
    public abstract void mo1764V();

    /* JADX INFO: renamed from: W */
    public abstract void mo1765W();

    /* JADX INFO: renamed from: d */
    public boolean mo1766d() {
        return false;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo1767e(AbstractC2056g abstractC2056g, C2052c c2052c, C2052c c2052c2);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo1768f(AbstractC2056g abstractC2056g, Object obj, Object obj2);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo1769g(AbstractC2056g abstractC2056g, C2055f c2055f, C2055f c2055f2);

    /* JADX INFO: renamed from: l */
    public abstract Typeface mo1770l(Context context, C2212f c2212f, Resources resources, int i3);

    /* JADX INFO: renamed from: m */
    public abstract Typeface mo1771m(Context context, C2348g[] c2348gArr, int i3);

    /* JADX INFO: renamed from: n */
    public Typeface mo1772n(Context context, InputStream inputStream) {
        File fileM3325r = AbstractC1303m.m3325r(context);
        if (fileM3325r == null) {
            return null;
        }
        try {
            if (AbstractC1303m.m3315h(fileM3325r, inputStream)) {
                return Typeface.createFromFile(fileM3325r.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM3325r.delete();
        }
    }

    /* JADX INFO: renamed from: o */
    public Typeface mo1773o(Context context, Resources resources, int i3, String str, int i4) {
        File fileM3325r = AbstractC1303m.m3325r(context);
        if (fileM3325r == null) {
            return null;
        }
        try {
            if (AbstractC1303m.m3314g(fileM3325r, resources, i3)) {
                return Typeface.createFromFile(fileM3325r.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM3325r.delete();
        }
    }

    /* JADX INFO: renamed from: y */
    public C2348g mo1774y(C2348g[] c2348gArr, int i3) {
        new C1528a(18);
        int i4 = (i3 & 1) == 0 ? 400 : 700;
        boolean z3 = (i3 & 2) != 0;
        C2348g c2348g = null;
        int i5 = Integer.MAX_VALUE;
        for (C2348g c2348g2 : c2348gArr) {
            int iAbs = (Math.abs(c2348g2.f9862c - i4) * 2) + (c2348g2.f9863d == z3 ? 0 : 1);
            if (c2348g == null || i5 > iAbs) {
                c2348g = c2348g2;
                i5 = iAbs;
            }
        }
        return c2348g;
    }

    /* JADX INFO: renamed from: P */
    public void mo1763P() {
    }
}
