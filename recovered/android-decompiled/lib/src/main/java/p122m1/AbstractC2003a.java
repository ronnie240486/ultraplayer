package p122m1;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Display;
import android.view.View;
import androidx.activity.InterfaceC0907q;
import androidx.emoji2.text.AbstractC0916f;
import com.google.android.gms.internal.cast.C1224S;
import com.zuxoplayer.app.R;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import p000A.C0022X;
import p004B0.C0098a;
import p013E1.AbstractC0150y;
import p014F.InterfaceC0162k;
import p017G.C0210a;
import p037M1.InterfaceC0390c;
import p037M1.InterfaceC0394g;
import p037M1.InterfaceC0395h;
import p040N1.C0435p;
import p045P0.AbstractC0462h;
import p046P1.C0475c;
import p055T.C0544G;
import p062V0.C0628g;
import p064W.AbstractC0646n;
import p066W1.AbstractC0664e;
import p072Y1.CallableC0765b;
import p104h1.AbstractC1621E;
import p104h1.C1631O;
import p152u.AbstractC2279a;
import p152u.AbstractC2280b;
import p152u.C2287i;
import p152u.InterfaceC2285g;
import p163x2.AbstractC2364c;
import p170z2.C2392a;

/* JADX INFO: renamed from: m1.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2003a implements InterfaceC0162k {

    /* JADX INFO: renamed from: a */
    public static SharedPreferences f8737a;

    /* JADX INFO: renamed from: b */
    public static Method f8738b;

    /* JADX INFO: renamed from: c */
    public static boolean f8739c;

    /* JADX INFO: renamed from: d */
    public static Method f8740d;

    /* JADX INFO: renamed from: e */
    public static boolean f8741e;

    /* JADX INFO: renamed from: c */
    public static final void m4532c(View view) {
        AbstractC2364c.m4954e(view, "<this>");
        C2392a c2392a = new C2392a();
        C0022X c0022x = new C0022X(view, c2392a);
        c0022x.f24i = c2392a;
        c2392a.f9986j = c0022x;
        while (c2392a.hasNext()) {
            View view2 = (View) c2392a.next();
            C0210a c0210a = (C0210a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (c0210a == null) {
                c0210a = new C0210a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, c0210a);
            }
            ArrayList arrayList = c0210a.f480a;
            int iM4539l = m4539l(arrayList);
            if (-1 < iM4539l) {
                arrayList.get(iM4539l).getClass();
                throw new ClassCastException();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m4533d(long j3, String str) {
        if (j3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j3 + ") must be >= 0");
    }

    /* JADX INFO: renamed from: e */
    public static int m4534e(C1631O c1631o, AbstractC0916f abstractC0916f, View view, View view2, AbstractC1621E abstractC1621E, boolean z3) {
        if (abstractC1621E.m4026u() == 0 || c1631o.m4045b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return Math.abs(AbstractC1621E.m4000C(view) - AbstractC1621E.m4000C(view2)) + 1;
        }
        return Math.min(abstractC0916f.mo2400l(), abstractC0916f.mo2390b(view2) - abstractC0916f.mo2393e(view));
    }

    /* JADX INFO: renamed from: f */
    public static int m4535f(C1631O c1631o, AbstractC0916f abstractC0916f, View view, View view2, AbstractC1621E abstractC1621E, boolean z3, boolean z4) {
        if (abstractC1621E.m4026u() == 0 || c1631o.m4045b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z4 ? Math.max(0, (c1631o.m4045b() - Math.max(AbstractC1621E.m4000C(view), AbstractC1621E.m4000C(view2))) - 1) : Math.max(0, Math.min(AbstractC1621E.m4000C(view), AbstractC1621E.m4000C(view2)));
        if (z3) {
            return Math.round((iMax * (Math.abs(abstractC0916f.mo2390b(view2) - abstractC0916f.mo2393e(view)) / (Math.abs(AbstractC1621E.m4000C(view) - AbstractC1621E.m4000C(view2)) + 1))) + (abstractC0916f.mo2399k() - abstractC0916f.mo2393e(view)));
        }
        return iMax;
    }

    /* JADX INFO: renamed from: g */
    public static int m4536g(C1631O c1631o, AbstractC0916f abstractC0916f, View view, View view2, AbstractC1621E abstractC1621E, boolean z3) {
        if (abstractC1621E.m4026u() == 0 || c1631o.m4045b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return c1631o.m4045b();
        }
        return (int) (((abstractC0916f.mo2390b(view2) - abstractC0916f.mo2393e(view)) / (Math.abs(AbstractC1621E.m4000C(view) - AbstractC1621E.m4000C(view2)) + 1)) * c1631o.m4045b());
    }

    /* JADX INFO: renamed from: j */
    public static boolean m4537j(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i3 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i3 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m4538k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static int m4539l(AbstractList abstractList) {
        AbstractC2364c.m4954e(abstractList, "<this>");
        return abstractList.size() - 1;
    }

    /* JADX INFO: renamed from: m */
    public static int m4540m(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC2280b.m4894a(drawable);
        }
        if (!f8741e) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", null);
                f8740d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e3) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e3);
            }
            f8741e = true;
        }
        Method method = f8740d;
        if (method == null) {
            return 0;
        }
        try {
            return ((Integer) method.invoke(drawable, null)).intValue();
        } catch (Exception e4) {
            Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e4);
            f8740d = null;
            return 0;
        }
    }

    /* JADX INFO: renamed from: n */
    public static String m4541n(int i3) {
        if (i3 == 0) {
            return "Success.";
        }
        if (i3 == 2100) {
            return "The in-progress request failed.";
        }
        if (i3 == 2103) {
            return "The request's progress is no longer being tracked because another request of the same type has been made before the first request completed.";
        }
        if (i3 == 7) {
            return "Network I/O error.";
        }
        if (i3 == 8) {
            return "An internal error has occurred.";
        }
        if (i3 == 2200) {
            return "The Cast Remote Display service could not be created.";
        }
        if (i3 == 2201) {
            return "The Cast Remote Display service was disconnected.";
        }
        switch (i3) {
            case 13:
                return "An unknown, unexpected error has occurred.";
            case 14:
                return "A blocking call was interrupted while waiting and did not run to completion.";
            case 15:
                return "An operation has timed out.";
            default:
                switch (i3) {
                    case 2000:
                        return "Authentication failure.";
                    case 2001:
                        return "An invalid request was made.";
                    case 2002:
                        return "An in-progress request has been canceled, most likely because another action has preempted it.";
                    case 2003:
                        return "The request was disallowed and could not be completed.";
                    case 2004:
                        return "A requested application could not be found.";
                    case 2005:
                        return "A requested application is not currently running.";
                    case 2006:
                        return "A message could not be sent because it is too large.";
                    case 2007:
                        return "A message could not be sent because there is not enough room in the send buffer at this time.";
                    default:
                        if (i3 >= -999 && i3 <= 999) {
                            if (i3 == 0) {
                                return "SUCCESS";
                            }
                            if (i3 == 7) {
                                return "NETWORK_ERROR";
                            }
                            if (i3 != 14) {
                                return i3 != 15 ? AbstractC0150y.m607b(i3) : "TIMEOUT";
                            }
                            return "INTERRUPTED";
                        }
                        if (i3 >= 2000 && i3 <= 2049) {
                            if (i3 == 2015) {
                                return "TCP_PROBER_FAIL_TO_VERIFY_DEVICE";
                            }
                            switch (i3) {
                                case 2000:
                                    return "AUTHENTICATION_FAILED";
                                case 2001:
                                    return "INVALID_REQUEST";
                                case 2002:
                                    return "CANCELED";
                                case 2003:
                                    return "NOT_ALLOWED";
                                case 2004:
                                    return "APPLICATION_NOT_FOUND";
                                case 2005:
                                    return "APPLICATION_NOT_RUNNING";
                                case 2006:
                                    return "MESSAGE_TOO_LARGE";
                                case 2007:
                                    return "MESSAGE_SEND_BUFFER_TOO_FULL";
                                default:
                                    Locale locale = Locale.ROOT;
                                    return AbstractC0462h.m1165e(i3, "Common cast status code ");
                            }
                        }
                        if (i3 >= 2050 && i3 <= 2059) {
                            Locale locale2 = Locale.ROOT;
                            return AbstractC0462h.m1165e(i3, "Cast controller status code ");
                        }
                        if (i3 >= 2100 && i3 <= 2109) {
                            Locale locale3 = Locale.ROOT;
                            return AbstractC0462h.m1165e(i3, "Media control channel status code ");
                        }
                        if (i3 >= 2150 && i3 <= 2169) {
                            Locale locale4 = Locale.ROOT;
                            return AbstractC0462h.m1165e(i3, "Cast session status code ");
                        }
                        if (i3 >= 2200 && i3 <= 2219) {
                            Locale locale5 = Locale.ROOT;
                            return AbstractC0462h.m1165e(i3, "Cast remote display status code ");
                        }
                        if (i3 >= 2250 && i3 <= 2299) {
                            Locale locale6 = Locale.ROOT;
                            return AbstractC0462h.m1165e(i3, "Cast socket status code ");
                        }
                        if (i3 >= 2300 && i3 <= 2309) {
                            Locale locale7 = Locale.ROOT;
                            return AbstractC0462h.m1165e(i3, "Cast service status code ");
                        }
                        if (i3 >= 2310 && i3 <= 2319) {
                            Locale locale8 = Locale.ROOT;
                            return AbstractC0462h.m1165e(i3, "Endpoint switch status code ");
                        }
                        if (i3 >= 2350 && i3 <= 2359) {
                            Locale locale9 = Locale.ROOT;
                            return AbstractC0462h.m1165e(i3, "Cast multizone device status code ");
                        }
                        if (i3 >= 2400 && i3 <= 2419) {
                            Locale locale10 = Locale.ROOT;
                            return AbstractC0462h.m1165e(i3, "Cast relay casting status code ");
                        }
                        if (i3 >= 2450 && i3 <= 2469) {
                            Locale locale11 = Locale.ROOT;
                            return AbstractC0462h.m1165e(i3, "Cast nearby casting status code ");
                        }
                        if (i3 >= 2470 && i3 <= 2479) {
                            Locale locale12 = Locale.ROOT;
                            return AbstractC0462h.m1165e(i3, "Cast application status code ");
                        }
                        if (i3 < 2490 || i3 > 2499) {
                            Locale locale13 = Locale.ROOT;
                            return AbstractC0462h.m1165e(i3, "Unknown cast status code ");
                        }
                        Locale locale14 = Locale.ROOT;
                        return AbstractC0462h.m1165e(i3, "Cast media loading status code ");
                }
        }
    }

    /* JADX INFO: renamed from: o */
    public static int m4542o(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }

    /* JADX INFO: renamed from: p */
    public static C0628g m4543p(C0628g c0628g, String[] strArr, Map map) {
        int i3 = 0;
        if (c0628g == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (C0628g) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C0628g c0628g2 = new C0628g();
                int length = strArr.length;
                while (i3 < length) {
                    c0628g2.m1557a((C0628g) map.get(strArr[i3]));
                    i3++;
                }
                return c0628g2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                c0628g.m1557a((C0628g) map.get(strArr[0]));
                return c0628g;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i3 < length2) {
                    c0628g.m1557a((C0628g) map.get(strArr[i3]));
                    i3++;
                }
            }
        }
        return c0628g;
    }

    /* JADX INFO: renamed from: q */
    public static final void m4544q(View view, InterfaceC0907q interfaceC0907q) {
        AbstractC2364c.m4954e(view, "<this>");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, interfaceC0907q);
    }

    /* JADX INFO: renamed from: r */
    public static boolean m4545r(Drawable drawable, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC2280b.m4895b(drawable, i3);
        }
        if (!f8739c) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                f8738b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e3) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e3);
            }
            f8739c = true;
        }
        Method method = f8738b;
        if (method != null) {
            try {
                method.invoke(drawable, Integer.valueOf(i3));
                return true;
            } catch (Exception e4) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e4);
                f8738b = null;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public static void m4546s(Drawable drawable, int i3) {
        AbstractC2279a.m4891g(drawable, i3);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m4547t(Context context) {
        ApplicationInfo applicationInfo;
        Intent intentPutExtra = new Intent().addFlags(268435456).setAction("com.android.settings.panel.action.MEDIA_OUTPUT").putExtra("com.android.settings.panel.extra.PACKAGE_NAME", context.getPackageName());
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intentPutExtra, 0).iterator();
        while (it.hasNext()) {
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && (applicationInfo = activityInfo.applicationInfo) != null && (applicationInfo.flags & 129) != 0) {
                context.startActivity(intentPutExtra);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public static Drawable m4548u(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 || (drawable instanceof InterfaceC2285g)) {
            return drawable;
        }
        C2287i c2287i = new C2287i();
        c2287i.f9754j = c2287i.m4908c();
        c2287i.m4913h(drawable);
        C2287i.m4906a();
        return c2287i;
    }

    /* JADX INFO: renamed from: v */
    public static int m4549v(int i3) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i3) * (-862048943)), 15)) * 461845907);
    }

    /* JADX INFO: renamed from: w */
    public static SharedPreferences m4550w(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (f8737a == null) {
                    f8737a = (SharedPreferences) AbstractC0664e.m1740a0(new CallableC0765b(context));
                }
                sharedPreferences = f8737a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }

    /* JADX INFO: renamed from: x */
    public static Map m4551x(String str, Bundle bundle) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return C1224S.f5691m;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                map2.put((Integer) entry.getKey(), (Integer) entry.getValue());
            }
        }
        return Collections.unmodifiableMap(map2);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0390c mo558a(Context context, Looper looper, C0475c c0475c, Object obj, InterfaceC0394g interfaceC0394g, InterfaceC0395h interfaceC0395h) {
        return mo559b(context, looper, c0475c, obj, (C0435p) interfaceC0394g, (C0435p) interfaceC0395h);
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC0390c mo559b(Context context, Looper looper, C0475c c0475c, Object obj, C0435p c0435p, C0435p c0435p2) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    /* JADX INFO: renamed from: h */
    public C0544G m4552h(C0098a c0098a) {
        ByteBuffer byteBuffer = c0098a.f3144k;
        byteBuffer.getClass();
        AbstractC0646n.m1625c(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return mo501i(c0098a, byteBuffer);
    }

    /* JADX INFO: renamed from: i */
    public abstract C0544G mo501i(C0098a c0098a, ByteBuffer byteBuffer);
}
