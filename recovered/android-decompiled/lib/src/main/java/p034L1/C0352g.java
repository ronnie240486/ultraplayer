package p034L1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.media.MediaDrmException;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Selection;
import android.util.Log;
import androidx.emoji2.text.C0932v;
import com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader;
import com.zuxoplayer.app.PlayerActivity;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p009D0.C0106b;
import p026J.C0285b;
import p039N0.InterfaceC0411g;
import p040N1.C0437r;
import p045P0.InterfaceC0463i;
import p045P0.InterfaceC0465k;
import p046P1.AbstractC0491s;
import p050R0.C0521h;
import p053S0.C0536b;
import p055T.AbstractC0571e;
import p055T.C0539B;
import p055T.C0576h;
import p055T.C0583o;
import p055T.C0586r;
import p055T.C0590v;
import p055T.C0593y;
import p056T0.C0596b;
import p059U0.C0609a;
import p062V0.C0626e;
import p063V1.BinderC0630b;
import p065W0.C0659a;
import p066W1.AbstractC0660a;
import p066W1.AbstractC0664e;
import p066W1.C0661b;
import p066W1.C0662c;
import p066W1.C0665f;
import p066W1.C0666g;
import p066W1.C0667h;
import p068X0.C0688a;
import p073Z.InterfaceC0766a;
import p079a2.AbstractC0853b;
import p082b0.C1071l;
import p088d0.C1379c;
import p088d0.C1383g;
import p088d0.C1387k;
import p088d0.C1391o;
import p088d0.C1392p;
import p088d0.C1393q;
import p088d0.C1400x;
import p088d0.InterfaceC1384h;
import p088d0.InterfaceC1389m;
import p088d0.InterfaceC1390n;
import p088d0.InterfaceC1394r;
import p105h2.C1700c0;
import p145s0.C2237j;
import p145s0.C2244q;
import p145s0.InterfaceC2252y;

/* JADX INFO: renamed from: L1.g */
/* JADX INFO: loaded from: classes.dex */
public class C0352g implements InterfaceC0411g, InterfaceC0463i, InterfaceC1390n, InterfaceC1394r {

    /* JADX INFO: renamed from: d */
    public static C0352g f1138d;

    /* JADX INFO: renamed from: e */
    public static C0352g f1139e;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f1140c;

    public /* synthetic */ C0352g(int i3) {
        this.f1140c = i3;
    }

    /* JADX INFO: renamed from: A */
    public static JSONObject m959A(C0539B c0539b) throws JSONException {
        C0593y c0593y = c0539b.f1875b;
        c0593y.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mediaId", c0539b.f1874a);
        jSONObject.put("title", c0539b.f1877d.f1914a);
        jSONObject.put("uri", c0593y.f2199a.toString());
        jSONObject.put("mimeType", c0593y.f2200b);
        C0590v c0590v = c0593y.f2201c;
        if (c0590v != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("uuid", c0590v.f2183a);
            jSONObject2.put("licenseUri", c0590v.f2184b);
            jSONObject2.put("requestHeaders", new JSONObject(c0590v.f2185c));
            jSONObject.put("drmConfiguration", jSONObject2);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: B */
    public static JSONObject m960B(C0539B c0539b) throws JSONException {
        C0590v c0590v;
        String str;
        C0593y c0593y = c0539b.f1875b;
        if (c0593y == null || (c0590v = c0593y.f2201c) == null) {
            return null;
        }
        UUID uuid = AbstractC0571e.f2060d;
        UUID uuid2 = c0590v.f2183a;
        if (uuid.equals(uuid2)) {
            str = "widevine";
        } else {
            if (!AbstractC0571e.f2061e.equals(uuid2)) {
                return null;
            }
            str = "playready";
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("withCredentials", false);
        jSONObject.put("protectionSystem", str);
        Uri uri = c0590v.f2184b;
        if (uri != null) {
            jSONObject.put("licenseUrl", uri);
        }
        C1700c0 c1700c0 = c0590v.f2185c;
        if (!c1700c0.isEmpty()) {
            jSONObject.put("headers", new JSONObject(c1700c0));
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m961E(C0285b c0285b, Editable editable, int i3, int i4, boolean z3) {
        int iMin;
        if (editable != null && i3 >= 0 && i4 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z3) {
                    int iMax = Math.max(i3, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z4 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z4) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z4) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z4 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i4, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z5 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z5) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z5) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z5 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i3, 0);
                    iMin = Math.min(selectionEnd + i4, editable.length());
                }
                C0932v[] c0932vArr = (C0932v[]) editable.getSpans(selectionStart, iMin, C0932v.class);
                if (c0932vArr != null && c0932vArr.length > 0) {
                    for (C0932v c0932v : c0932vArr) {
                        int spanStart = editable.getSpanStart(c0932v);
                        int spanEnd = editable.getSpanEnd(c0932v);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    c0285b.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    c0285b.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public static void m962G(JSONObject jSONObject, C0586r c0586r) throws JSONException {
        UUID uuidFromString = UUID.fromString(jSONObject.getString("uuid"));
        C0437r c0437r = new C0437r();
        c0437r.f1484b = uuidFromString;
        String string = jSONObject.getString("licenseUri");
        c0437r.f1485c = string == null ? null : Uri.parse(string);
        JSONObject jSONObject2 = jSONObject.getJSONObject("requestHeaders");
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject2.getString(next));
        }
        c0437r.f1486d = C1700c0.m4138a(map);
        c0586r.f2174e = new C0590v(c0437r).m1452a();
    }

    /* JADX INFO: renamed from: H */
    private final /* synthetic */ void m963H() {
    }

    /* JADX INFO: renamed from: K */
    public static final AbstractBinderC0356k m965K(PackageInfo packageInfo, AbstractBinderC0356k... abstractBinderC0356kArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            BinderC0357l binderC0357l = new BinderC0357l(packageInfo.signatures[0].toByteArray());
            for (int i3 = 0; i3 < abstractBinderC0356kArr.length; i3++) {
                if (abstractBinderC0356kArr[i3].equals(binderC0357l)) {
                    return abstractBinderC0356kArr[i3];
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m966L(PackageInfo packageInfo) {
        PackageInfo packageInfo2;
        boolean z3;
        if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z3 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            } else {
                z3 = true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
            z3 = true;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z3 ? m965K(packageInfo2, AbstractC0358m.f1151a) : m965K(packageInfo2, AbstractC0358m.f1151a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static void m967z(Context context) {
        AbstractC0491s.m1213e(context);
        synchronized (C0352g.class) {
            try {
                if (f1138d == null) {
                    AbstractC0359n.m1000a(context);
                    C0352g c0352g = new C0352g(0);
                    context.getApplicationContext();
                    f1138d = c0352g;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public Signature[] mo968C(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    /* JADX INFO: renamed from: D */
    public long m969D() {
        switch (this.f1140c) {
            case 1:
                return SystemClock.elapsedRealtime();
            default:
                return System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: F */
    public boolean mo970F(CharSequence charSequence) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0189 A[Catch: all -> 0x00fa, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x00fa, blocks: (B:4:0x000d, B:64:0x00ee, B:66:0x00f4, B:72:0x011a, B:100:0x0189, B:108:0x019c, B:144:0x0291, B:145:0x0294, B:124:0x0216, B:71:0x00fe, B:147:0x0296, B:5:0x000e, B:8:0x0015, B:9:0x0031, B:62:0x00eb, B:22:0x0055, B:45:0x00ac, B:48:0x00b1, B:55:0x00c9, B:63:0x00ed, B:61:0x00cf), top: B:164:0x000d, inners: #9, #13 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0193 A[Catch: all -> 0x018f, RemoteException -> 0x0191, TRY_ENTER, TRY_LEAVE, TryCatch #14 {RemoteException -> 0x0191, all -> 0x018f, blocks: (B:84:0x0166, B:87:0x016d, B:89:0x0173, B:91:0x017b, B:93:0x017f, B:106:0x0193), top: B:170:0x0166 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x019c A[Catch: all -> 0x00fa, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x00fa, blocks: (B:4:0x000d, B:64:0x00ee, B:66:0x00f4, B:72:0x011a, B:100:0x0189, B:108:0x019c, B:144:0x0291, B:145:0x0294, B:124:0x0216, B:71:0x00fe, B:147:0x0296, B:5:0x000e, B:8:0x0015, B:9:0x0031, B:62:0x00eb, B:22:0x0055, B:45:0x00ac, B:48:0x00b1, B:55:0x00c9, B:63:0x00ed, B:61:0x00cf), top: B:164:0x000d, inners: #9, #13 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ae A[Catch: all -> 0x01a6, RemoteException -> 0x01a9, TRY_ENTER, TryCatch #3 {all -> 0x01a6, blocks: (B:75:0x0122, B:77:0x0135, B:79:0x013f, B:81:0x0143, B:82:0x0149, B:122:0x01fa, B:118:0x01ae, B:120:0x01d5), top: B:155:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01d5 A[Catch: all -> 0x01a6, RemoteException -> 0x01a9, TRY_LEAVE, TryCatch #3 {all -> 0x01a6, blocks: (B:75:0x0122, B:77:0x0135, B:79:0x013f, B:81:0x0143, B:82:0x0149, B:122:0x01fa, B:118:0x01ae, B:120:0x01d5), top: B:155:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:158:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bd A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:10:0x0032, B:12:0x003e, B:52:0x00c6, B:17:0x0047, B:19:0x004e, B:21:0x0054, B:26:0x005b, B:28:0x005f, B:31:0x0068, B:33:0x0070, B:36:0x0077, B:43:0x00a3, B:44:0x00ab, B:39:0x007e, B:41:0x0084, B:42:0x0095, B:47:0x00b0, B:50:0x00b3, B:51:0x00bd, B:18:0x004a), top: B:154:0x0032, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x011a A[Catch: all -> 0x00fa, TRY_LEAVE, TryCatch #14 {all -> 0x00fa, blocks: (B:4:0x000d, B:64:0x00ee, B:66:0x00f4, B:72:0x011a, B:100:0x0189, B:108:0x019c, B:144:0x0291, B:145:0x0294, B:124:0x0216, B:71:0x00fe, B:147:0x0296, B:5:0x000e, B:8:0x0015, B:9:0x0031, B:62:0x00eb, B:22:0x0055, B:45:0x00ac, B:48:0x00b1, B:55:0x00c9, B:63:0x00ed, B:61:0x00cf), top: B:164:0x000d, inners: #9, #13 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0135 A[Catch: all -> 0x01a6, RemoteException -> 0x01a9, TryCatch #3 {all -> 0x01a6, blocks: (B:75:0x0122, B:77:0x0135, B:79:0x013f, B:81:0x0143, B:82:0x0149, B:122:0x01fa, B:118:0x01ae, B:120:0x01d5), top: B:155:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:79:0x013f A[Catch: all -> 0x01a6, RemoteException -> 0x01a9, TryCatch #3 {all -> 0x01a6, blocks: (B:75:0x0122, B:77:0x0135, B:79:0x013f, B:81:0x0143, B:82:0x0149, B:122:0x01fa, B:118:0x01ae, B:120:0x01d5), top: B:155:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0149 A[Catch: all -> 0x01a6, RemoteException -> 0x01a9, TRY_LEAVE, TryCatch #3 {all -> 0x01a6, blocks: (B:75:0x0122, B:77:0x0135, B:79:0x013f, B:81:0x0143, B:82:0x0149, B:122:0x01fa, B:118:0x01ae, B:120:0x01d5), top: B:155:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:86:0x016c  */
    /* JADX WARN: Code duplicated, block: B:87:0x016d A[Catch: all -> 0x018f, RemoteException -> 0x0191, TryCatch #14 {RemoteException -> 0x0191, all -> 0x018f, blocks: (B:84:0x0166, B:87:0x016d, B:89:0x0173, B:91:0x017b, B:93:0x017f, B:106:0x0193), top: B:170:0x0166 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0173 A[Catch: all -> 0x018f, RemoteException -> 0x0191, TryCatch #14 {RemoteException -> 0x0191, all -> 0x018f, blocks: (B:84:0x0166, B:87:0x016d, B:89:0x0173, B:91:0x017b, B:93:0x017f, B:106:0x0193), top: B:170:0x0166 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x017b A[Catch: all -> 0x018f, RemoteException -> 0x0191, TryCatch #14 {RemoteException -> 0x0191, all -> 0x018f, blocks: (B:84:0x0166, B:87:0x016d, B:89:0x0173, B:91:0x017b, B:93:0x017f, B:106:0x0193), top: B:170:0x0166 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0182  */
    /* JADX WARN: Code duplicated, block: B:98:0x0186  */
    /* JADX INFO: renamed from: J */
    public C0576h m971J(Context context, C0352g c0352g) {
        int iM1714b;
        C0667h c0667hM1717e;
        int i3;
        int i4;
        ThreadLocal threadLocal;
        C0666g c0666g;
        Cursor cursor;
        int i5;
        C0666g c0666g2;
        Cursor cursor2;
        C0576h c0576h = new C0576h();
        c0352g.getClass();
        try {
            synchronized (C0662c.class) {
                Boolean bool = C0662c.f2544c;
                boolean z3 = true;
                iM1714b = 0;
                Cursor cursor3 = null;
                if (bool == null) {
                    try {
                        Field declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteModule$DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                                if (classLoader == ClassLoader.getSystemClassLoader()) {
                                    bool = Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        C0662c.m1715c(classLoader);
                                    } catch (C0661b unused) {
                                    }
                                    bool = Boolean.TRUE;
                                } else if (C0662c.m1716d(context)) {
                                    if (C0662c.f2546e) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                        bool = Boolean.FALSE;
                                    } else {
                                        Boolean bool2 = Boolean.TRUE;
                                        if (bool2.equals(null)) {
                                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                                            bool = Boolean.FALSE;
                                        } else {
                                            try {
                                                int iM1714b2 = C0662c.m1714b(context, true, true);
                                                String str = C0662c.f2545d;
                                                if (str != null && !str.isEmpty()) {
                                                    ClassLoader classLoaderM1738Z = AbstractC0664e.m1738Z();
                                                    if (classLoaderM1738Z == null) {
                                                        if (Build.VERSION.SDK_INT >= 29) {
                                                            AbstractC0660a.m1712b();
                                                            String str2 = C0662c.f2545d;
                                                            AbstractC0491s.m1213e(str2);
                                                            classLoaderM1738Z = AbstractC0660a.m1711a(ClassLoader.getSystemClassLoader(), str2);
                                                        } else {
                                                            String str3 = C0662c.f2545d;
                                                            AbstractC0491s.m1213e(str3);
                                                            classLoaderM1738Z = new C0665f(str3, ClassLoader.getSystemClassLoader());
                                                        }
                                                    }
                                                    C0662c.m1715c(classLoaderM1738Z);
                                                    declaredField.set(null, classLoaderM1738Z);
                                                    C0662c.f2544c = bool2;
                                                }
                                                iM1714b = iM1714b2;
                                            } catch (C0661b unused2) {
                                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                                bool = Boolean.FALSE;
                                                C0662c.f2544c = bool;
                                                if (bool.booleanValue()) {
                                                    try {
                                                        iM1714b = C0662c.m1714b(context, true, false);
                                                    } catch (C0661b e3) {
                                                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e3.getMessage());
                                                    }
                                                } else {
                                                    c0667hM1717e = C0662c.m1717e(context);
                                                    try {
                                                        if (c0667hM1717e != null) {
                                                            try {
                                                                Parcel parcelM1893P = c0667hM1717e.m1893P(c0667hM1717e.m1894e0(), 6);
                                                                i3 = parcelM1893P.readInt();
                                                                parcelM1893P.recycle();
                                                                if (i3 >= 3) {
                                                                    threadLocal = C0662c.f2549h;
                                                                    c0666g = (C0666g) threadLocal.get();
                                                                    if (c0666g != null) {
                                                                        cursor = (Cursor) BinderC0630b.m1559w0(c0667hM1717e.m1778z0(new BinderC0630b(context), true, ((Long) C0662c.f2550i.get()).longValue()));
                                                                        if (cursor != null) {
                                                                            try {
                                                                                if (cursor.moveToFirst()) {
                                                                                    i5 = cursor.getInt(0);
                                                                                    if (i5 > 0) {
                                                                                        c0666g2 = (C0666g) threadLocal.get();
                                                                                        if (c0666g2 == null) {
                                                                                            z3 = false;
                                                                                        } else {
                                                                                            z3 = false;
                                                                                        }
                                                                                        cursor3 = z3 ? null : cursor;
                                                                                    }
                                                                                    if (cursor3 != null) {
                                                                                        cursor3.close();
                                                                                    }
                                                                                    iM1714b = i5;
                                                                                } else {
                                                                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                                                    if (cursor != null) {
                                                                                        cursor.close();
                                                                                    }
                                                                                }
                                                                            } catch (RemoteException e4) {
                                                                                e = e4;
                                                                                cursor3 = cursor;
                                                                                Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e.getMessage());
                                                                                if (cursor3 != null) {
                                                                                    cursor3.close();
                                                                                }
                                                                            } catch (Throwable th) {
                                                                                th = th;
                                                                                cursor3 = cursor;
                                                                                if (cursor3 != null) {
                                                                                    cursor3.close();
                                                                                }
                                                                                throw th;
                                                                            }
                                                                        } else {
                                                                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                                            if (cursor != null) {
                                                                                cursor.close();
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cursor = (Cursor) BinderC0630b.m1559w0(c0667hM1717e.m1778z0(new BinderC0630b(context), true, ((Long) C0662c.f2550i.get()).longValue()));
                                                                        if (cursor != null) {
                                                                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                                            if (cursor != null) {
                                                                                cursor.close();
                                                                            }
                                                                        } else if (cursor.moveToFirst()) {
                                                                            Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                                            if (cursor != null) {
                                                                                cursor.close();
                                                                            }
                                                                        } else {
                                                                            i5 = cursor.getInt(0);
                                                                            if (i5 > 0) {
                                                                                c0666g2 = (C0666g) threadLocal.get();
                                                                                if (c0666g2 == null) {
                                                                                    z3 = false;
                                                                                } else {
                                                                                    z3 = false;
                                                                                }
                                                                                if (z3) {
                                                                                }
                                                                            }
                                                                            if (cursor3 != null) {
                                                                                cursor3.close();
                                                                            }
                                                                            iM1714b = i5;
                                                                        }
                                                                    }
                                                                } else {
                                                                    if (i3 == 2) {
                                                                        Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                                                        BinderC0630b binderC0630b = new BinderC0630b(context);
                                                                        Parcel parcelM1894e0 = c0667hM1717e.m1894e0();
                                                                        AbstractC0853b.m2116c(parcelM1894e0, binderC0630b);
                                                                        parcelM1894e0.writeString("com.google.android.gms.cast.framework.dynamite");
                                                                        parcelM1894e0.writeInt(1);
                                                                        Parcel parcelM1893P2 = c0667hM1717e.m1893P(parcelM1894e0, 5);
                                                                        i4 = parcelM1893P2.readInt();
                                                                        parcelM1893P2.recycle();
                                                                    } else {
                                                                        Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                                                        BinderC0630b binderC0630b2 = new BinderC0630b(context);
                                                                        Parcel parcelM1894e1 = c0667hM1717e.m1894e0();
                                                                        AbstractC0853b.m2116c(parcelM1894e1, binderC0630b2);
                                                                        parcelM1894e1.writeString("com.google.android.gms.cast.framework.dynamite");
                                                                        parcelM1894e1.writeInt(1);
                                                                        Parcel parcelM1893P3 = c0667hM1717e.m1893P(parcelM1894e1, 3);
                                                                        i4 = parcelM1893P3.readInt();
                                                                        parcelM1893P3.recycle();
                                                                    }
                                                                    iM1714b = i4;
                                                                }
                                                            } catch (RemoteException e5) {
                                                                e = e5;
                                                            }
                                                        }
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                C0662c.f2544c = bool;
                                if (bool.booleanValue()) {
                                    iM1714b = C0662c.m1714b(context, true, false);
                                } else {
                                    c0667hM1717e = C0662c.m1717e(context);
                                    if (c0667hM1717e != null) {
                                        Parcel parcelM1893P4 = c0667hM1717e.m1893P(c0667hM1717e.m1894e0(), 6);
                                        i3 = parcelM1893P4.readInt();
                                        parcelM1893P4.recycle();
                                        if (i3 >= 3) {
                                            threadLocal = C0662c.f2549h;
                                            c0666g = (C0666g) threadLocal.get();
                                            if (c0666g != null || (cursor2 = c0666g.f2563a) == null) {
                                                cursor = (Cursor) BinderC0630b.m1559w0(c0667hM1717e.m1778z0(new BinderC0630b(context), true, ((Long) C0662c.f2550i.get()).longValue()));
                                                if (cursor != null) {
                                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                } else if (cursor.moveToFirst()) {
                                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                } else {
                                                    i5 = cursor.getInt(0);
                                                    if (i5 > 0) {
                                                        c0666g2 = (C0666g) threadLocal.get();
                                                        if (c0666g2 == null && c0666g2.f2563a == null) {
                                                            c0666g2.f2563a = cursor;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                        if (z3) {
                                                        }
                                                    }
                                                    if (cursor3 != null) {
                                                        cursor3.close();
                                                    }
                                                    iM1714b = i5;
                                                }
                                            } else {
                                                iM1714b = cursor2.getInt(0);
                                            }
                                        } else {
                                            if (i3 == 2) {
                                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                                BinderC0630b binderC0630b3 = new BinderC0630b(context);
                                                Parcel parcelM1894e2 = c0667hM1717e.m1894e0();
                                                AbstractC0853b.m2116c(parcelM1894e2, binderC0630b3);
                                                parcelM1894e2.writeString("com.google.android.gms.cast.framework.dynamite");
                                                parcelM1894e2.writeInt(1);
                                                Parcel parcelM1893P5 = c0667hM1717e.m1893P(parcelM1894e2, 5);
                                                i4 = parcelM1893P5.readInt();
                                                parcelM1893P5.recycle();
                                            } else {
                                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                                BinderC0630b binderC0630b4 = new BinderC0630b(context);
                                                Parcel parcelM1894e3 = c0667hM1717e.m1894e0();
                                                AbstractC0853b.m2116c(parcelM1894e3, binderC0630b4);
                                                parcelM1894e3.writeString("com.google.android.gms.cast.framework.dynamite");
                                                parcelM1894e3.writeInt(1);
                                                Parcel parcelM1893P6 = c0667hM1717e.m1893P(parcelM1894e3, 3);
                                                i4 = parcelM1893P6.readInt();
                                                parcelM1893P6.recycle();
                                            }
                                            iM1714b = i4;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e6) {
                        Log.w("DynamiteModule", "Failed to load module via V2: " + e6.toString());
                        bool = Boolean.FALSE;
                    }
                } else if (bool.booleanValue()) {
                    iM1714b = C0662c.m1714b(context, true, false);
                } else {
                    c0667hM1717e = C0662c.m1717e(context);
                    if (c0667hM1717e != null) {
                        Parcel parcelM1893P7 = c0667hM1717e.m1893P(c0667hM1717e.m1894e0(), 6);
                        i3 = parcelM1893P7.readInt();
                        parcelM1893P7.recycle();
                        if (i3 >= 3) {
                            threadLocal = C0662c.f2549h;
                            c0666g = (C0666g) threadLocal.get();
                            if (c0666g != null) {
                                cursor = (Cursor) BinderC0630b.m1559w0(c0667hM1717e.m1778z0(new BinderC0630b(context), true, ((Long) C0662c.f2550i.get()).longValue()));
                                if (cursor != null) {
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                } else if (cursor.moveToFirst()) {
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                } else {
                                    i5 = cursor.getInt(0);
                                    if (i5 > 0) {
                                        c0666g2 = (C0666g) threadLocal.get();
                                        if (c0666g2 == null) {
                                            z3 = false;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                        }
                                    }
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    iM1714b = i5;
                                }
                            } else {
                                cursor = (Cursor) BinderC0630b.m1559w0(c0667hM1717e.m1778z0(new BinderC0630b(context), true, ((Long) C0662c.f2550i.get()).longValue()));
                                if (cursor != null) {
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                } else if (cursor.moveToFirst()) {
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                } else {
                                    i5 = cursor.getInt(0);
                                    if (i5 > 0) {
                                        c0666g2 = (C0666g) threadLocal.get();
                                        if (c0666g2 == null) {
                                            z3 = false;
                                        } else {
                                            z3 = false;
                                        }
                                        if (z3) {
                                        }
                                    }
                                    if (cursor3 != null) {
                                        cursor3.close();
                                    }
                                    iM1714b = i5;
                                }
                            }
                        } else {
                            if (i3 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                BinderC0630b binderC0630b5 = new BinderC0630b(context);
                                Parcel parcelM1894e4 = c0667hM1717e.m1894e0();
                                AbstractC0853b.m2116c(parcelM1894e4, binderC0630b5);
                                parcelM1894e4.writeString("com.google.android.gms.cast.framework.dynamite");
                                parcelM1894e4.writeInt(1);
                                Parcel parcelM1893P8 = c0667hM1717e.m1893P(parcelM1894e4, 5);
                                i4 = parcelM1893P8.readInt();
                                parcelM1893P8.recycle();
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                BinderC0630b binderC0630b6 = new BinderC0630b(context);
                                Parcel parcelM1894e5 = c0667hM1717e.m1894e0();
                                AbstractC0853b.m2116c(parcelM1894e5, binderC0630b6);
                                parcelM1894e5.writeString("com.google.android.gms.cast.framework.dynamite");
                                parcelM1894e5.writeInt(1);
                                Parcel parcelM1893P9 = c0667hM1717e.m1893P(parcelM1894e5, 3);
                                i4 = parcelM1893P9.readInt();
                                parcelM1893P9.recycle();
                            }
                            iM1714b = i4;
                        }
                    }
                }
            }
            c0576h.f2075b = iM1714b;
            if (iM1714b != 0) {
                c0576h.f2076c = 1;
                return c0576h;
            }
            int i6 = 0;
            try {
                Class<?> clsLoadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors.com.google.android.gms.cast.framework.dynamite.ModuleDescriptor");
                Field declaredField2 = clsLoadClass.getDeclaredField("MODULE_ID");
                Field declaredField3 = clsLoadClass.getDeclaredField("MODULE_VERSION");
                if (AbstractC0491s.m1216h(declaredField2.get(null), "com.google.android.gms.cast.framework.dynamite")) {
                    i6 = declaredField3.getInt(null);
                } else {
                    Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField2.get(null)) + "' didn't match expected id 'com.google.android.gms.cast.framework.dynamite'");
                }
            } catch (ClassNotFoundException unused3) {
                Log.w("DynamiteModule", "Local module descriptor class for com.google.android.gms.cast.framework.dynamite not found.");
            } catch (Exception e7) {
                Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e7.getMessage())));
            }
            c0576h.f2074a = i6;
            if (i6 != 0) {
                c0576h.f2076c = -1;
            }
            return c0576h;
        } catch (Throwable th4) {
            try {
                AbstractC0491s.m1213e(context);
            } catch (Exception e8) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e8);
            }
            throw th4;
        }
    }

    @Override // p088d0.InterfaceC1390n, p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: a */
    public void mo972a() {
        int i3 = this.f1140c;
    }

    @Override // p088d0.InterfaceC1390n
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void mo973b() {
    }

    @Override // p039N0.InterfaceC0411g
    /* JADX INFO: renamed from: c */
    public long mo974c(C2237j c2237j) {
        return -1L;
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: d */
    public C1393q mo975d() {
        throw new IllegalStateException();
    }

    @Override // p045P0.InterfaceC0463i
    /* JADX INFO: renamed from: e */
    public InterfaceC0465k mo976e(C0583o c0583o) {
        InterfaceC0465k c0521h;
        switch (this.f1140c) {
            case 12:
                String str = c0583o.f2154n;
                if (str != null) {
                    List list = c0583o.f2157q;
                    switch (str) {
                        case "application/dvbsubs":
                            c0521h = new C0521h(list);
                            break;
                        case "application/pgs":
                            return new C0536b(0);
                        case "application/x-mp4-vtt":
                            return new C0688a(0);
                        case "text/vtt":
                            return new C0106b(15);
                        case "application/x-quicktime-tx3g":
                            c0521h = new C0659a(list);
                            break;
                        case "text/x-ssa":
                            c0521h = new C0596b(list);
                            break;
                        case "application/x-subrip":
                            return new C0609a();
                        case "application/ttml+xml":
                            return new C0626e();
                    }
                    return c0521h;
                }
                throw new IllegalArgumentException("Unsupported MIME type: " + str);
            default:
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
        }
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: f */
    public void mo977f(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // p045P0.InterfaceC0463i
    /* JADX INFO: renamed from: g */
    public int mo978g(C0583o c0583o) {
        switch (this.f1140c) {
            case 12:
                String str = c0583o.f2154n;
                if (str != null) {
                    switch (str) {
                        case "application/dvbsubs":
                        case "application/pgs":
                        case "application/x-mp4-vtt":
                        case "application/x-quicktime-tx3g":
                            return 2;
                        case "text/vtt":
                        case "text/x-ssa":
                        case "application/x-subrip":
                        case "application/ttml+xml":
                            return 1;
                    }
                }
                throw new IllegalArgumentException("Unsupported MIME type: " + str);
            default:
                return 1;
        }
    }

    @Override // p088d0.InterfaceC1390n
    /* JADX INFO: renamed from: h */
    public /* synthetic */ InterfaceC1389m mo979h(C1387k c1387k, C0583o c0583o) {
        return InterfaceC1389m.f6185a;
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: j */
    public C1392p mo981j(byte[] bArr, List list, int i3, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: k */
    public void mo982k(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void mo983l(byte[] bArr, C1071l c1071l) {
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: m */
    public Map mo984m(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: n */
    public int mo985n() {
        return 1;
    }

    @Override // p039N0.InterfaceC0411g
    /* JADX INFO: renamed from: p */
    public InterfaceC2252y mo987p() {
        return new C2244q(-9223372036854775807L);
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: q */
    public InterfaceC0766a mo988q(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: s */
    public boolean mo990s(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: t */
    public byte[] mo991t() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // p088d0.InterfaceC1390n
    /* JADX INFO: renamed from: v */
    public int mo993v(C0583o c0583o) {
        return c0583o.f2158r != null ? 1 : 0;
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: w */
    public byte[] mo994w(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // p088d0.InterfaceC1390n
    /* JADX INFO: renamed from: x */
    public InterfaceC1384h mo995x(C1387k c1387k, C0583o c0583o) {
        if (c0583o.f2158r == null) {
            return null;
        }
        return new C1391o(new C1383g(new C1400x(), 6001));
    }

    @Override // p045P0.InterfaceC0463i
    /* JADX INFO: renamed from: y */
    public boolean mo996y(C0583o c0583o) {
        switch (this.f1140c) {
            case 12:
                String str = c0583o.f2154n;
                return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
            default:
                return false;
        }
    }

    public C0352g(PlayerActivity playerActivity) {
        this.f1140c = 20;
        playerActivity.getApplicationContext();
    }

    /* JADX INFO: renamed from: I */
    private final void m964I() {
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: i */
    public void mo980i(C1379c c1379c) {
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: o */
    public void mo986o(byte[] bArr) {
    }

    @Override // p039N0.InterfaceC0411g
    /* JADX INFO: renamed from: r */
    public void mo989r(long j3) {
    }

    @Override // p088d0.InterfaceC1390n
    /* JADX INFO: renamed from: u */
    public void mo992u(Looper looper, C1071l c1071l) {
    }
}
