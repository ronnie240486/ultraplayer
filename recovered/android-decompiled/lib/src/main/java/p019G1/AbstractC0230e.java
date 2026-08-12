package p019G1;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.emoji2.text.C0912b;
import androidx.emoji2.text.C0926p;
import androidx.emoji2.text.C0927q;
import com.google.android.gms.cast.framework.media.internal.ResourceProvider;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.C1250Y1;
import com.zuxoplayer.app.R;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import p000A.AbstractC0016Q;
import p000A.C0015P;
import p000A.InterfaceC0049m;
import p022H1.C0258b;
import p029K.C0323c;
import p029K.C0327g;
import p034L1.C0352g;
import p045P0.AbstractC0462h;
import p055T.AbstractC0545H;
import p055T.C0546I;
import p060U1.AbstractC0610a;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p066W1.AbstractC0664e;
import p074Z0.C0778e;
import p108i1.InterfaceC1752e;
import p140r.AbstractC2182b;
import p145s0.C2237j;
import p163x2.AbstractC2364c;

/* JADX INFO: renamed from: G1.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0230e {

    /* JADX INFO: renamed from: g */
    public static boolean f551g = false;

    /* JADX INFO: renamed from: h */
    public static Method f552h = null;

    /* JADX INFO: renamed from: i */
    public static boolean f553i = false;

    /* JADX INFO: renamed from: j */
    public static Field f554j;

    /* JADX INFO: renamed from: k */
    public static Field f555k;

    /* JADX INFO: renamed from: l */
    public static boolean f556l;

    /* JADX INFO: renamed from: m */
    public static Field f557m;

    /* JADX INFO: renamed from: n */
    public static boolean f558n;

    /* JADX INFO: renamed from: o */
    public static Class f559o;

    /* JADX INFO: renamed from: p */
    public static boolean f560p;

    /* JADX INFO: renamed from: q */
    public static Field f561q;

    /* JADX INFO: renamed from: r */
    public static boolean f562r;

    /* JADX INFO: renamed from: s */
    public static Field f563s;

    /* JADX INFO: renamed from: t */
    public static boolean f564t;

    /* JADX INFO: renamed from: A */
    public static int m724A(String str) {
        try {
            Map map = ResourceProvider.f5479a;
            Integer num = (Integer) ResourceProvider.class.getMethod("findResourceByName", String.class).invoke(null, str);
            if (num != null) {
                return num.intValue();
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return 0;
    }

    /* JADX INFO: renamed from: B */
    public static String m725B(C1250Y1 c1250y1) {
        StringBuilder sb = new StringBuilder(c1250y1.mo3215h());
        for (int i3 = 0; i3 < c1250y1.mo3215h(); i3++) {
            byte bMo3213e = c1250y1.mo3213e(i3);
            if (bMo3213e == 34) {
                sb.append("\\\"");
            } else if (bMo3213e == 39) {
                sb.append("\\'");
            } else if (bMo3213e != 92) {
                switch (bMo3213e) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bMo3213e < 32 || bMo3213e > 126) {
                            sb.append('\\');
                            sb.append((char) (((bMo3213e >>> 6) & 3) + 48));
                            sb.append((char) (((bMo3213e >>> 3) & 7) + 48));
                            sb.append((char) ((bMo3213e & 7) + 48));
                        } else {
                            sb.append((char) bMo3213e);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: C */
    public static String m726C(String str) {
        int length = str.length();
        int i3 = 0;
        while (i3 < length) {
            char cCharAt = str.charAt(i3);
            if (cCharAt >= 'a' && cCharAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i3 < length) {
                    char c = charArray[i3];
                    if (c >= 'a' && c <= 'z') {
                        charArray[i3] = (char) (c ^ ' ');
                    }
                    i3++;
                }
                return String.valueOf(charArray);
            }
            i3++;
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public static String m727c(String str, int i3, int i4) {
        if (i3 < 0) {
            return AbstractC0610a.m1523z("%s (%s) must not be negative", str, Integer.valueOf(i3));
        }
        if (i4 >= 0) {
            return AbstractC0610a.m1523z("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i3), Integer.valueOf(i4));
        }
        throw new IllegalArgumentException(AbstractC0462h.m1165e(i4, "negative size: "));
    }

    /* JADX INFO: renamed from: f */
    public static void m728f(boolean z3, String str, long j3) {
        if (!z3) {
            throw new IllegalArgumentException(AbstractC0610a.m1523z(str, Long.valueOf(j3)));
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m729g(int i3, int i4) {
        String strM1523z;
        if (i3 < 0 || i3 >= i4) {
            if (i3 < 0) {
                strM1523z = AbstractC0610a.m1523z("%s (%s) must not be negative", "index", Integer.valueOf(i3));
            } else {
                if (i4 < 0) {
                    throw new IllegalArgumentException(AbstractC0462h.m1165e(i4, "negative size: "));
                }
                strM1523z = AbstractC0610a.m1523z("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i3), Integer.valueOf(i4));
            }
            throw new IndexOutOfBoundsException(strM1523z);
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m730h(C2237j c2237j) {
        C0651s c0651s = new C0651s(8);
        int i3 = C0778e.m1891a(c2237j, c0651s).f3181a;
        if (i3 != 1380533830 && i3 != 1380333108) {
            return false;
        }
        c2237j.mo338i(c0651s.f2520a, 0, 4, false);
        c0651s.m1665G(0);
        int iM1673g = c0651s.m1673g();
        if (iM1673g == 1463899717) {
            return true;
        }
        AbstractC0646n.m1635m("WavHeaderReader", "Unsupported form type: " + iM1673g);
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static void m731i(int i3, int i4) {
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(m727c("index", i3, i4));
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m732j(int i3, int i4, int i5) {
        String strM727c;
        if (i3 < 0 || i4 < i3 || i4 > i5) {
            if (i3 < 0 || i3 > i5) {
                strM727c = m727c("start index", i3, i5);
            } else {
                strM727c = (i4 < 0 || i4 > i5) ? m727c("end index", i4, i5) : AbstractC0610a.m1523z("end index (%s) must not be less than start index (%s)", Integer.valueOf(i4), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strM727c);
        }
    }

    /* JADX INFO: renamed from: k */
    public static C0927q m733k(Context context) {
        ProviderInfo providerInfo;
        C0258b c0258b;
        ApplicationInfo applicationInfo;
        C0352g c0912b = Build.VERSION.SDK_INT >= 28 ? new C0912b(21) : new C0352g(21);
        PackageManager packageManager = context.getPackageManager();
        AbstractC0664e.m1747h(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c0258b = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrMo968C = c0912b.mo968C(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrMo968C) {
                    arrayList.add(signature.toByteArray());
                }
                c0258b = new C0258b(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e3) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e3);
                c0258b = null;
            }
        }
        if (c0258b == null) {
            return null;
        }
        return new C0927q(new C0926p(context, c0258b));
    }

    /* JADX INFO: renamed from: l */
    public static void m734l(String str, String str2, Object obj) {
        Log.d("TransportRuntime.".concat(str), String.format(str2, obj));
    }

    /* JADX INFO: renamed from: m */
    public static Bitmap m735m(byte[] bArr, int i3) throws IOException {
        int iM878e;
        int i4 = 0;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i3, null);
        if (bitmapDecodeByteArray == null) {
            throw C0546I.m1365a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            C0327g c0327g = new C0327g(byteArrayInputStream);
            byteArrayInputStream.close();
            C0323c c0323cM885c = c0327g.m885c("Orientation");
            if (c0323cM885c == null) {
                iM878e = 1;
            } else {
                try {
                    iM878e = c0323cM885c.m878e(c0327g.f933f);
                } catch (NumberFormatException unused) {
                    iM878e = 1;
                }
            }
            switch (iM878e) {
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                case 4:
                    i4 = 180;
                    break;
                case 5:
                case 8:
                    i4 = 270;
                    break;
                case 6:
                case 7:
                    i4 = 90;
                    break;
            }
            if (i4 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i4);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m736n(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C0015P.f10d;
        C0015P c0015p = (C0015P) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c0015p == null) {
            c0015p = new C0015P();
            c0015p.f11a = null;
            c0015p.f12b = null;
            c0015p.f13c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c0015p);
        }
        WeakReference weakReference2 = c0015p.f13c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c0015p.f13c = new WeakReference(keyEvent);
        if (c0015p.f12b == null) {
            c0015p.f12b = new SparseArray();
        }
        SparseArray sparseArray = c0015p.f12b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: o */
    public static boolean m737o(InterfaceC0049m interfaceC0049m, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC0049m != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return interfaceC0049m.mo258c(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window = activity.getWindow();
                if (window.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!f551g) {
                            try {
                                f552h = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            f551g = true;
                        }
                        Method method = f552h;
                        if (method != null) {
                            try {
                                Object objInvoke = method.invoke(actionBar, keyEvent);
                                if (objInvoke != null) {
                                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (zBooleanValue) {
                            return true;
                        }
                    }
                }
                if (window.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window.getDecorView();
                if (AbstractC0016Q.m80b(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!f553i) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        f554j = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    f553i = true;
                }
                Field field = f554j;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                        onKeyListener = null;
                    }
                } else {
                    onKeyListener = null;
                }
                if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                    return true;
                }
                Window window2 = dialog.getWindow();
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView2 = window2.getDecorView();
                if (AbstractC0016Q.m80b(decorView2, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
            }
            if ((view != null && AbstractC0016Q.m80b(view, keyEvent)) || interfaceC0049m.mo258c(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static void m738p(Object obj) {
        LongSparseArray longSparseArray;
        if (!f560p) {
            try {
                f559o = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e3) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e3);
            }
            f560p = true;
        }
        Class cls = f559o;
        if (cls == null) {
            return;
        }
        if (!f562r) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f561q = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e4);
            }
            f562r = true;
        }
        Field field = f561q;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e5) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e5);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    /* JADX INFO: renamed from: q */
    public static int m739q(Context context, int i3) {
        return Build.VERSION.SDK_INT >= 23 ? AbstractC2182b.m4767a(context, i3) : context.getResources().getColor(i3);
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0223 A[PHI: r23
      0x0223: PHI (r23v32 int) = 
      (r23v1 int)
      (r23v2 int)
      (r23v3 int)
      (r23v4 int)
      (r23v5 int)
      (r23v6 int)
      (r23v7 int)
      (r23v8 int)
      (r23v9 int)
      (r23v10 int)
      (r23v11 int)
      (r23v12 int)
      (r23v13 int)
      (r23v14 int)
      (r23v15 int)
      (r23v16 int)
      (r23v17 int)
      (r23v18 int)
      (r23v19 int)
      (r23v20 int)
      (r23v21 int)
      (r23v22 int)
      (r23v23 int)
      (r23v24 int)
      (r23v25 int)
      (r23v26 int)
      (r23v27 int)
      (r23v28 int)
      (r23v29 int)
      (r23v30 int)
      (r23v31 int)
      (r23v33 int)
     binds: [B:133:0x0221, B:129:0x0214, B:125:0x0207, B:121:0x01fa, B:117:0x01ed, B:113:0x01e0, B:109:0x01d3, B:105:0x01c6, B:101:0x01b6, B:97:0x01a6, B:93:0x0196, B:89:0x0186, B:85:0x0176, B:81:0x0166, B:77:0x0156, B:73:0x0146, B:69:0x0136, B:65:0x0126, B:61:0x0116, B:57:0x0106, B:53:0x00f6, B:49:0x00e6, B:45:0x00d6, B:41:0x00c6, B:37:0x00b6, B:33:0x00a6, B:29:0x0096, B:25:0x0086, B:21:0x0076, B:17:0x0066, B:13:0x0056, B:9:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: r */
    public static int m740r(String str) {
        int i3;
        byte b3;
        if (str == null) {
            return -1;
        }
        String strM1364l = AbstractC0545H.m1364l(str);
        strM1364l.getClass();
        switch (strM1364l.hashCode()) {
            case -2123537834:
                i3 = 20;
                if (!strM1364l.equals("audio/eac3-joc")) {
                    b3 = -1;
                } else {
                    b3 = 0;
                }
                break;
            case -1662384011:
                i3 = 20;
                if (!strM1364l.equals("video/mp2p")) {
                    b3 = -1;
                } else {
                    b3 = 1;
                }
                break;
            case -1662384007:
                i3 = 20;
                if (!strM1364l.equals("video/mp2t")) {
                    b3 = -1;
                } else {
                    b3 = 2;
                }
                break;
            case -1662095187:
                i3 = 20;
                if (!strM1364l.equals("video/webm")) {
                    b3 = -1;
                } else {
                    b3 = 3;
                }
                break;
            case -1606874997:
                i3 = 20;
                if (!strM1364l.equals("audio/amr-wb")) {
                    b3 = -1;
                } else {
                    b3 = 4;
                }
                break;
            case -1487656890:
                i3 = 20;
                if (!strM1364l.equals("image/avif")) {
                    b3 = -1;
                } else {
                    b3 = 5;
                }
                break;
            case -1487464693:
                i3 = 20;
                if (!strM1364l.equals("image/heic")) {
                    b3 = -1;
                } else {
                    b3 = 6;
                }
                break;
            case -1487464690:
                i3 = 20;
                if (!strM1364l.equals("image/heif")) {
                    b3 = -1;
                } else {
                    b3 = 7;
                }
                break;
            case -1487394660:
                i3 = 20;
                if (!strM1364l.equals("image/jpeg")) {
                    b3 = -1;
                } else {
                    b3 = 8;
                }
                break;
            case -1487018032:
                i3 = 20;
                if (!strM1364l.equals("image/webp")) {
                    b3 = -1;
                } else {
                    b3 = 9;
                }
                break;
            case -1248337486:
                i3 = 20;
                if (!strM1364l.equals("application/mp4")) {
                    b3 = -1;
                } else {
                    b3 = 10;
                }
                break;
            case -1079884372:
                i3 = 20;
                if (!strM1364l.equals("video/x-msvideo")) {
                    b3 = -1;
                } else {
                    b3 = 11;
                }
                break;
            case -1004728940:
                i3 = 20;
                if (!strM1364l.equals("text/vtt")) {
                    b3 = -1;
                } else {
                    b3 = 12;
                }
                break;
            case -879272239:
                i3 = 20;
                if (!strM1364l.equals("image/bmp")) {
                    b3 = -1;
                } else {
                    b3 = 13;
                }
                break;
            case -879258763:
                i3 = 20;
                if (!strM1364l.equals("image/png")) {
                    b3 = -1;
                } else {
                    b3 = 14;
                }
                break;
            case -387023398:
                i3 = 20;
                if (!strM1364l.equals("audio/x-matroska")) {
                    b3 = -1;
                } else {
                    b3 = 15;
                }
                break;
            case -43467528:
                i3 = 20;
                if (!strM1364l.equals("application/webm")) {
                    b3 = -1;
                } else {
                    b3 = 16;
                }
                break;
            case 13915911:
                i3 = 20;
                if (!strM1364l.equals("video/x-flv")) {
                    b3 = -1;
                } else {
                    b3 = 17;
                }
                break;
            case 187078296:
                i3 = 20;
                if (!strM1364l.equals("audio/ac3")) {
                    b3 = -1;
                } else {
                    b3 = 18;
                }
                break;
            case 187078297:
                i3 = 20;
                if (!strM1364l.equals("audio/ac4")) {
                    b3 = -1;
                } else {
                    b3 = 19;
                }
                break;
            case 187078669:
                i3 = 20;
                if (!strM1364l.equals("audio/amr")) {
                    b3 = -1;
                } else {
                    b3 = 20;
                }
                break;
            case 187090232:
                i3 = 20;
                if (!strM1364l.equals("audio/mp4")) {
                    b3 = -1;
                } else {
                    b3 = 21;
                }
                break;
            case 187091926:
                i3 = 20;
                if (!strM1364l.equals("audio/ogg")) {
                    b3 = -1;
                } else {
                    b3 = 22;
                }
                break;
            case 187099443:
                i3 = 20;
                if (!strM1364l.equals("audio/wav")) {
                    b3 = -1;
                } else {
                    b3 = 23;
                }
                break;
            case 1331848029:
                i3 = 20;
                if (!strM1364l.equals("video/mp4")) {
                    b3 = -1;
                } else {
                    b3 = 24;
                }
                break;
            case 1503095341:
                i3 = 20;
                if (!strM1364l.equals("audio/3gpp")) {
                    b3 = -1;
                } else {
                    b3 = 25;
                }
                break;
            case 1504578661:
                i3 = 20;
                if (!strM1364l.equals("audio/eac3")) {
                    b3 = -1;
                } else {
                    b3 = 26;
                }
                break;
            case 1504619009:
                i3 = 20;
                if (!strM1364l.equals("audio/flac")) {
                    b3 = -1;
                } else {
                    b3 = 27;
                }
                break;
            case 1504824762:
                i3 = 20;
                if (!strM1364l.equals("audio/midi")) {
                    b3 = -1;
                } else {
                    b3 = 28;
                }
                break;
            case 1504831518:
                i3 = 20;
                if (!strM1364l.equals("audio/mpeg")) {
                    b3 = -1;
                } else {
                    b3 = 29;
                }
                break;
            case 1505118770:
                i3 = 20;
                if (!strM1364l.equals("audio/webm")) {
                    b3 = -1;
                } else {
                    b3 = 30;
                }
                break;
            case 2039520277:
                i3 = 20;
                if (!strM1364l.equals("video/x-matroska")) {
                    b3 = -1;
                } else {
                    b3 = 31;
                }
                break;
            default:
                b3 = -1;
                i3 = 20;
                break;
        }
        switch (b3) {
            case 0:
            case 18:
            case 26:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
            case 15:
            case 16:
            case 30:
            case 31:
                return 6;
            case 4:
            case 20:
            case 25:
                return 3;
            case 5:
                return 21;
            case 6:
            case 7:
                return i3;
            case 8:
                return 14;
            case 9:
                return 18;
            case 10:
            case 21:
            case 24:
                return 8;
            case 11:
                return 16;
            case 12:
                return 13;
            case 13:
                return 19;
            case 14:
                return 17;
            case 17:
                return 5;
            case 19:
                return 1;
            case 22:
                return 9;
            case 23:
                return 12;
            case 27:
                return 4;
            case 28:
                return 15;
            case 29:
                return 7;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: s */
    public static int m741s(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    /* JADX INFO: renamed from: t */
    public static void m742t(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m743w(View view, InterfaceC1752e interfaceC1752e) {
        AbstractC2364c.m4954e(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, interfaceC1752e);
    }

    /* JADX INFO: renamed from: x */
    public static C0778e m744x(int i3, C2237j c2237j, C0651s c0651s) throws C0546I {
        C0778e c0778eM1891a = C0778e.m1891a(c2237j, c0651s);
        while (true) {
            int i4 = c0778eM1891a.f3181a;
            if (i4 == i3) {
                return c0778eM1891a;
            }
            AbstractC0462h.m1170j("Ignoring unknown WAV chunk: ", "WavHeaderReader", i4);
            long j3 = c0778eM1891a.f3182b;
            long j4 = 8 + j3;
            if (j3 % 2 != 0) {
                j4 = 9 + j3;
            }
            if (j4 > 2147483647L) {
                throw C0546I.m1367c("Chunk is too large (~2GB+) to skip; id: " + i4);
            }
            c2237j.mo335d((int) j4);
            c0778eM1891a = C0778e.m1891a(c2237j, c0651s);
        }
    }

    /* JADX INFO: renamed from: y */
    public static String m745y(int i3) {
        Object[] objArr = {Integer.valueOf(Color.red(i3)), Integer.valueOf(Color.green(i3)), Integer.valueOf(Color.blue(i3)), Double.valueOf(((double) Color.alpha(i3)) / 255.0d)};
        int i4 = AbstractC0632A.f2454a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    /* JADX INFO: renamed from: z */
    public static int m746z(int i3, int i4) {
        if (i4 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i5 = i3 + (i3 >> 1) + 1;
        if (i5 < i4) {
            int iHighestOneBit = Integer.highestOneBit(i4 - 1);
            i5 = iHighestOneBit + iHighestOneBit;
        }
        if (i5 < 0) {
            return Integer.MAX_VALUE;
        }
        return i5;
    }

    /* JADX INFO: renamed from: u */
    public abstract View mo747u(int i3);

    /* JADX INFO: renamed from: v */
    public abstract boolean mo748v();
}
