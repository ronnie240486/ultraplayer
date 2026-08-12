package p066W1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import p034L1.C0350e;
import p034L1.C0352g;
import p040N1.C0419D;
import p055T.C0576h;
import p063V1.BinderC0630b;
import p063V1.InterfaceC0629a;

/* JADX INFO: renamed from: W1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0662c {

    /* JADX INFO: renamed from: c */
    public static Boolean f2544c = null;

    /* JADX INFO: renamed from: d */
    public static String f2545d = null;

    /* JADX INFO: renamed from: e */
    public static boolean f2546e = false;

    /* JADX INFO: renamed from: f */
    public static int f2547f = -1;

    /* JADX INFO: renamed from: g */
    public static Boolean f2548g;

    /* JADX INFO: renamed from: k */
    public static C0667h f2552k;

    /* JADX INFO: renamed from: l */
    public static C0668i f2553l;

    /* JADX INFO: renamed from: a */
    public final Context f2554a;

    /* JADX INFO: renamed from: h */
    public static final ThreadLocal f2549h = new ThreadLocal();

    /* JADX INFO: renamed from: i */
    public static final C0419D f2550i = new C0419D(1);

    /* JADX INFO: renamed from: j */
    public static final C0352g f2551j = new C0352g(17);

    /* JADX INFO: renamed from: b */
    public static final C0352g f2543b = new C0352g(18);

    public C0662c(Context context) {
        this.f2554a = context;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01e1 A[Catch: all -> 0x01df, TRY_ENTER, TryCatch #9 {, blocks: (B:30:0x0099, B:32:0x009f, B:33:0x00a1, B:101:0x01e1, B:102:0x01e8), top: B:160:0x0099, outer: #9 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0243  */
    /* JADX WARN: Code duplicated, block: B:123:0x0249  */
    /* JADX WARN: Code duplicated, block: B:126:0x0252  */
    /* JADX WARN: Code duplicated, block: B:131:0x0263 A[Catch: all -> 0x0071, TryCatch #0 {all -> 0x0071, blocks: (B:9:0x004d, B:13:0x006b, B:20:0x0077, B:23:0x007d, B:27:0x0094, B:105:0x01eb, B:106:0x01f2, B:109:0x01f5, B:110:0x01f6, B:111:0x01fd, B:112:0x01fe, B:114:0x021c, B:116:0x0227, B:117:0x0229, B:119:0x022d, B:129:0x025b, B:130:0x0262, B:131:0x0263, B:132:0x0274, B:133:0x0275, B:134:0x0297), top: B:150:0x004d, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x00bf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x007d A[Catch: all -> 0x0071, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:9:0x004d, B:13:0x006b, B:20:0x0077, B:23:0x007d, B:27:0x0094, B:105:0x01eb, B:106:0x01f2, B:109:0x01f5, B:110:0x01f6, B:111:0x01fd, B:112:0x01fe, B:114:0x021c, B:116:0x0227, B:117:0x0229, B:119:0x022d, B:129:0x025b, B:130:0x0262, B:131:0x0263, B:132:0x0274, B:133:0x0275, B:134:0x0297), top: B:150:0x004d, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x009f A[Catch: all -> 0x01df, TryCatch #9 {, blocks: (B:30:0x0099, B:32:0x009f, B:33:0x00a1, B:101:0x01e1, B:102:0x01e8), top: B:160:0x0099, outer: #9 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4 A[Catch: all -> 0x00fe, b -> 0x0101, RemoteException -> 0x0104, TRY_ENTER, TryCatch #9 {b -> 0x0101, RemoteException -> 0x0104, all -> 0x00fe, blocks: (B:29:0x0098, B:35:0x00a4, B:37:0x00ab, B:38:0x00be, B:42:0x00c4, B:44:0x00cc, B:46:0x00d0, B:47:0x00de, B:54:0x00e8, B:62:0x011c, B:64:0x0124, B:66:0x012c, B:67:0x0133, B:61:0x0107, B:70:0x0136, B:71:0x0137, B:72:0x013e, B:73:0x013f, B:74:0x0146, B:77:0x0149, B:78:0x014a, B:80:0x0161, B:82:0x0174, B:84:0x017c, B:90:0x01b8, B:92:0x01be, B:93:0x01c7, B:94:0x01ce, B:85:0x018d, B:86:0x0194, B:88:0x0197, B:89:0x01a8, B:95:0x01cf, B:96:0x01d6, B:97:0x01d7, B:98:0x01de, B:104:0x01ea, B:48:0x00df, B:52:0x00e5, B:39:0x00bf, B:40:0x00c1, B:30:0x0099, B:32:0x009f, B:33:0x00a1, B:101:0x01e1, B:102:0x01e8), top: B:161:0x0098, inners: #1, #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab A[Catch: all -> 0x00fe, b -> 0x0101, RemoteException -> 0x0104, TryCatch #9 {b -> 0x0101, RemoteException -> 0x0104, all -> 0x00fe, blocks: (B:29:0x0098, B:35:0x00a4, B:37:0x00ab, B:38:0x00be, B:42:0x00c4, B:44:0x00cc, B:46:0x00d0, B:47:0x00de, B:54:0x00e8, B:62:0x011c, B:64:0x0124, B:66:0x012c, B:67:0x0133, B:61:0x0107, B:70:0x0136, B:71:0x0137, B:72:0x013e, B:73:0x013f, B:74:0x0146, B:77:0x0149, B:78:0x014a, B:80:0x0161, B:82:0x0174, B:84:0x017c, B:90:0x01b8, B:92:0x01be, B:93:0x01c7, B:94:0x01ce, B:85:0x018d, B:86:0x0194, B:88:0x0197, B:89:0x01a8, B:95:0x01cf, B:96:0x01d6, B:97:0x01d7, B:98:0x01de, B:104:0x01ea, B:48:0x00df, B:52:0x00e5, B:39:0x00bf, B:40:0x00c1, B:30:0x0099, B:32:0x009f, B:33:0x00a1, B:101:0x01e1, B:102:0x01e8), top: B:161:0x0098, inners: #1, #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4 A[Catch: all -> 0x00fe, b -> 0x0101, RemoteException -> 0x0104, TRY_ENTER, TryCatch #9 {b -> 0x0101, RemoteException -> 0x0104, all -> 0x00fe, blocks: (B:29:0x0098, B:35:0x00a4, B:37:0x00ab, B:38:0x00be, B:42:0x00c4, B:44:0x00cc, B:46:0x00d0, B:47:0x00de, B:54:0x00e8, B:62:0x011c, B:64:0x0124, B:66:0x012c, B:67:0x0133, B:61:0x0107, B:70:0x0136, B:71:0x0137, B:72:0x013e, B:73:0x013f, B:74:0x0146, B:77:0x0149, B:78:0x014a, B:80:0x0161, B:82:0x0174, B:84:0x017c, B:90:0x01b8, B:92:0x01be, B:93:0x01c7, B:94:0x01ce, B:85:0x018d, B:86:0x0194, B:88:0x0197, B:89:0x01a8, B:95:0x01cf, B:96:0x01d6, B:97:0x01d7, B:98:0x01de, B:104:0x01ea, B:48:0x00df, B:52:0x00e5, B:39:0x00bf, B:40:0x00c1, B:30:0x0099, B:32:0x009f, B:33:0x00a1, B:101:0x01e1, B:102:0x01e8), top: B:161:0x0098, inners: #1, #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x013f A[Catch: all -> 0x00fe, b -> 0x0101, RemoteException -> 0x0104, TryCatch #9 {b -> 0x0101, RemoteException -> 0x0104, all -> 0x00fe, blocks: (B:29:0x0098, B:35:0x00a4, B:37:0x00ab, B:38:0x00be, B:42:0x00c4, B:44:0x00cc, B:46:0x00d0, B:47:0x00de, B:54:0x00e8, B:62:0x011c, B:64:0x0124, B:66:0x012c, B:67:0x0133, B:61:0x0107, B:70:0x0136, B:71:0x0137, B:72:0x013e, B:73:0x013f, B:74:0x0146, B:77:0x0149, B:78:0x014a, B:80:0x0161, B:82:0x0174, B:84:0x017c, B:90:0x01b8, B:92:0x01be, B:93:0x01c7, B:94:0x01ce, B:85:0x018d, B:86:0x0194, B:88:0x0197, B:89:0x01a8, B:95:0x01cf, B:96:0x01d6, B:97:0x01d7, B:98:0x01de, B:104:0x01ea, B:48:0x00df, B:52:0x00e5, B:39:0x00bf, B:40:0x00c1, B:30:0x0099, B:32:0x009f, B:33:0x00a1, B:101:0x01e1, B:102:0x01e8), top: B:161:0x0098, inners: #1, #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x014a A[Catch: all -> 0x00fe, b -> 0x0101, RemoteException -> 0x0104, TryCatch #9 {b -> 0x0101, RemoteException -> 0x0104, all -> 0x00fe, blocks: (B:29:0x0098, B:35:0x00a4, B:37:0x00ab, B:38:0x00be, B:42:0x00c4, B:44:0x00cc, B:46:0x00d0, B:47:0x00de, B:54:0x00e8, B:62:0x011c, B:64:0x0124, B:66:0x012c, B:67:0x0133, B:61:0x0107, B:70:0x0136, B:71:0x0137, B:72:0x013e, B:73:0x013f, B:74:0x0146, B:77:0x0149, B:78:0x014a, B:80:0x0161, B:82:0x0174, B:84:0x017c, B:90:0x01b8, B:92:0x01be, B:93:0x01c7, B:94:0x01ce, B:85:0x018d, B:86:0x0194, B:88:0x0197, B:89:0x01a8, B:95:0x01cf, B:96:0x01d6, B:97:0x01d7, B:98:0x01de, B:104:0x01ea, B:48:0x00df, B:52:0x00e5, B:39:0x00bf, B:40:0x00c1, B:30:0x0099, B:32:0x009f, B:33:0x00a1, B:101:0x01e1, B:102:0x01e8), top: B:161:0x0098, inners: #1, #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0161 A[Catch: all -> 0x00fe, b -> 0x0101, RemoteException -> 0x0104, TryCatch #9 {b -> 0x0101, RemoteException -> 0x0104, all -> 0x00fe, blocks: (B:29:0x0098, B:35:0x00a4, B:37:0x00ab, B:38:0x00be, B:42:0x00c4, B:44:0x00cc, B:46:0x00d0, B:47:0x00de, B:54:0x00e8, B:62:0x011c, B:64:0x0124, B:66:0x012c, B:67:0x0133, B:61:0x0107, B:70:0x0136, B:71:0x0137, B:72:0x013e, B:73:0x013f, B:74:0x0146, B:77:0x0149, B:78:0x014a, B:80:0x0161, B:82:0x0174, B:84:0x017c, B:90:0x01b8, B:92:0x01be, B:93:0x01c7, B:94:0x01ce, B:85:0x018d, B:86:0x0194, B:88:0x0197, B:89:0x01a8, B:95:0x01cf, B:96:0x01d6, B:97:0x01d7, B:98:0x01de, B:104:0x01ea, B:48:0x00df, B:52:0x00e5, B:39:0x00bf, B:40:0x00c1, B:30:0x0099, B:32:0x009f, B:33:0x00a1, B:101:0x01e1, B:102:0x01e8), top: B:161:0x0098, inners: #1, #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0174 A[Catch: all -> 0x00fe, b -> 0x0101, RemoteException -> 0x0104, TryCatch #9 {b -> 0x0101, RemoteException -> 0x0104, all -> 0x00fe, blocks: (B:29:0x0098, B:35:0x00a4, B:37:0x00ab, B:38:0x00be, B:42:0x00c4, B:44:0x00cc, B:46:0x00d0, B:47:0x00de, B:54:0x00e8, B:62:0x011c, B:64:0x0124, B:66:0x012c, B:67:0x0133, B:61:0x0107, B:70:0x0136, B:71:0x0137, B:72:0x013e, B:73:0x013f, B:74:0x0146, B:77:0x0149, B:78:0x014a, B:80:0x0161, B:82:0x0174, B:84:0x017c, B:90:0x01b8, B:92:0x01be, B:93:0x01c7, B:94:0x01ce, B:85:0x018d, B:86:0x0194, B:88:0x0197, B:89:0x01a8, B:95:0x01cf, B:96:0x01d6, B:97:0x01d7, B:98:0x01de, B:104:0x01ea, B:48:0x00df, B:52:0x00e5, B:39:0x00bf, B:40:0x00c1, B:30:0x0099, B:32:0x009f, B:33:0x00a1, B:101:0x01e1, B:102:0x01e8), top: B:161:0x0098, inners: #1, #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x017c A[Catch: all -> 0x00fe, b -> 0x0101, RemoteException -> 0x0104, TryCatch #9 {b -> 0x0101, RemoteException -> 0x0104, all -> 0x00fe, blocks: (B:29:0x0098, B:35:0x00a4, B:37:0x00ab, B:38:0x00be, B:42:0x00c4, B:44:0x00cc, B:46:0x00d0, B:47:0x00de, B:54:0x00e8, B:62:0x011c, B:64:0x0124, B:66:0x012c, B:67:0x0133, B:61:0x0107, B:70:0x0136, B:71:0x0137, B:72:0x013e, B:73:0x013f, B:74:0x0146, B:77:0x0149, B:78:0x014a, B:80:0x0161, B:82:0x0174, B:84:0x017c, B:90:0x01b8, B:92:0x01be, B:93:0x01c7, B:94:0x01ce, B:85:0x018d, B:86:0x0194, B:88:0x0197, B:89:0x01a8, B:95:0x01cf, B:96:0x01d6, B:97:0x01d7, B:98:0x01de, B:104:0x01ea, B:48:0x00df, B:52:0x00e5, B:39:0x00bf, B:40:0x00c1, B:30:0x0099, B:32:0x009f, B:33:0x00a1, B:101:0x01e1, B:102:0x01e8), top: B:161:0x0098, inners: #1, #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x018d A[Catch: all -> 0x00fe, b -> 0x0101, RemoteException -> 0x0104, TryCatch #9 {b -> 0x0101, RemoteException -> 0x0104, all -> 0x00fe, blocks: (B:29:0x0098, B:35:0x00a4, B:37:0x00ab, B:38:0x00be, B:42:0x00c4, B:44:0x00cc, B:46:0x00d0, B:47:0x00de, B:54:0x00e8, B:62:0x011c, B:64:0x0124, B:66:0x012c, B:67:0x0133, B:61:0x0107, B:70:0x0136, B:71:0x0137, B:72:0x013e, B:73:0x013f, B:74:0x0146, B:77:0x0149, B:78:0x014a, B:80:0x0161, B:82:0x0174, B:84:0x017c, B:90:0x01b8, B:92:0x01be, B:93:0x01c7, B:94:0x01ce, B:85:0x018d, B:86:0x0194, B:88:0x0197, B:89:0x01a8, B:95:0x01cf, B:96:0x01d6, B:97:0x01d7, B:98:0x01de, B:104:0x01ea, B:48:0x00df, B:52:0x00e5, B:39:0x00bf, B:40:0x00c1, B:30:0x0099, B:32:0x009f, B:33:0x00a1, B:101:0x01e1, B:102:0x01e8), top: B:161:0x0098, inners: #1, #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x0197 A[Catch: all -> 0x00fe, b -> 0x0101, RemoteException -> 0x0104, TryCatch #9 {b -> 0x0101, RemoteException -> 0x0104, all -> 0x00fe, blocks: (B:29:0x0098, B:35:0x00a4, B:37:0x00ab, B:38:0x00be, B:42:0x00c4, B:44:0x00cc, B:46:0x00d0, B:47:0x00de, B:54:0x00e8, B:62:0x011c, B:64:0x0124, B:66:0x012c, B:67:0x0133, B:61:0x0107, B:70:0x0136, B:71:0x0137, B:72:0x013e, B:73:0x013f, B:74:0x0146, B:77:0x0149, B:78:0x014a, B:80:0x0161, B:82:0x0174, B:84:0x017c, B:90:0x01b8, B:92:0x01be, B:93:0x01c7, B:94:0x01ce, B:85:0x018d, B:86:0x0194, B:88:0x0197, B:89:0x01a8, B:95:0x01cf, B:96:0x01d6, B:97:0x01d7, B:98:0x01de, B:104:0x01ea, B:48:0x00df, B:52:0x00e5, B:39:0x00bf, B:40:0x00c1, B:30:0x0099, B:32:0x009f, B:33:0x00a1, B:101:0x01e1, B:102:0x01e8), top: B:161:0x0098, inners: #1, #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01a8 A[Catch: all -> 0x00fe, b -> 0x0101, RemoteException -> 0x0104, TryCatch #9 {b -> 0x0101, RemoteException -> 0x0104, all -> 0x00fe, blocks: (B:29:0x0098, B:35:0x00a4, B:37:0x00ab, B:38:0x00be, B:42:0x00c4, B:44:0x00cc, B:46:0x00d0, B:47:0x00de, B:54:0x00e8, B:62:0x011c, B:64:0x0124, B:66:0x012c, B:67:0x0133, B:61:0x0107, B:70:0x0136, B:71:0x0137, B:72:0x013e, B:73:0x013f, B:74:0x0146, B:77:0x0149, B:78:0x014a, B:80:0x0161, B:82:0x0174, B:84:0x017c, B:90:0x01b8, B:92:0x01be, B:93:0x01c7, B:94:0x01ce, B:85:0x018d, B:86:0x0194, B:88:0x0197, B:89:0x01a8, B:95:0x01cf, B:96:0x01d6, B:97:0x01d7, B:98:0x01de, B:104:0x01ea, B:48:0x00df, B:52:0x00e5, B:39:0x00bf, B:40:0x00c1, B:30:0x0099, B:32:0x009f, B:33:0x00a1, B:101:0x01e1, B:102:0x01e8), top: B:161:0x0098, inners: #1, #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01be A[Catch: all -> 0x00fe, b -> 0x0101, RemoteException -> 0x0104, TryCatch #9 {b -> 0x0101, RemoteException -> 0x0104, all -> 0x00fe, blocks: (B:29:0x0098, B:35:0x00a4, B:37:0x00ab, B:38:0x00be, B:42:0x00c4, B:44:0x00cc, B:46:0x00d0, B:47:0x00de, B:54:0x00e8, B:62:0x011c, B:64:0x0124, B:66:0x012c, B:67:0x0133, B:61:0x0107, B:70:0x0136, B:71:0x0137, B:72:0x013e, B:73:0x013f, B:74:0x0146, B:77:0x0149, B:78:0x014a, B:80:0x0161, B:82:0x0174, B:84:0x017c, B:90:0x01b8, B:92:0x01be, B:93:0x01c7, B:94:0x01ce, B:85:0x018d, B:86:0x0194, B:88:0x0197, B:89:0x01a8, B:95:0x01cf, B:96:0x01d6, B:97:0x01d7, B:98:0x01de, B:104:0x01ea, B:48:0x00df, B:52:0x00e5, B:39:0x00bf, B:40:0x00c1, B:30:0x0099, B:32:0x009f, B:33:0x00a1, B:101:0x01e1, B:102:0x01e8), top: B:161:0x0098, inners: #1, #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01c7 A[Catch: all -> 0x00fe, b -> 0x0101, RemoteException -> 0x0104, TryCatch #9 {b -> 0x0101, RemoteException -> 0x0104, all -> 0x00fe, blocks: (B:29:0x0098, B:35:0x00a4, B:37:0x00ab, B:38:0x00be, B:42:0x00c4, B:44:0x00cc, B:46:0x00d0, B:47:0x00de, B:54:0x00e8, B:62:0x011c, B:64:0x0124, B:66:0x012c, B:67:0x0133, B:61:0x0107, B:70:0x0136, B:71:0x0137, B:72:0x013e, B:73:0x013f, B:74:0x0146, B:77:0x0149, B:78:0x014a, B:80:0x0161, B:82:0x0174, B:84:0x017c, B:90:0x01b8, B:92:0x01be, B:93:0x01c7, B:94:0x01ce, B:85:0x018d, B:86:0x0194, B:88:0x0197, B:89:0x01a8, B:95:0x01cf, B:96:0x01d6, B:97:0x01d7, B:98:0x01de, B:104:0x01ea, B:48:0x00df, B:52:0x00e5, B:39:0x00bf, B:40:0x00c1, B:30:0x0099, B:32:0x009f, B:33:0x00a1, B:101:0x01e1, B:102:0x01e8), top: B:161:0x0098, inners: #1, #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01cf A[Catch: all -> 0x00fe, b -> 0x0101, RemoteException -> 0x0104, TryCatch #9 {b -> 0x0101, RemoteException -> 0x0104, all -> 0x00fe, blocks: (B:29:0x0098, B:35:0x00a4, B:37:0x00ab, B:38:0x00be, B:42:0x00c4, B:44:0x00cc, B:46:0x00d0, B:47:0x00de, B:54:0x00e8, B:62:0x011c, B:64:0x0124, B:66:0x012c, B:67:0x0133, B:61:0x0107, B:70:0x0136, B:71:0x0137, B:72:0x013e, B:73:0x013f, B:74:0x0146, B:77:0x0149, B:78:0x014a, B:80:0x0161, B:82:0x0174, B:84:0x017c, B:90:0x01b8, B:92:0x01be, B:93:0x01c7, B:94:0x01ce, B:85:0x018d, B:86:0x0194, B:88:0x0197, B:89:0x01a8, B:95:0x01cf, B:96:0x01d6, B:97:0x01d7, B:98:0x01de, B:104:0x01ea, B:48:0x00df, B:52:0x00e5, B:39:0x00bf, B:40:0x00c1, B:30:0x0099, B:32:0x009f, B:33:0x00a1, B:101:0x01e1, B:102:0x01e8), top: B:161:0x0098, inners: #1, #4, #9 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01d7 A[Catch: all -> 0x00fe, b -> 0x0101, RemoteException -> 0x0104, TryCatch #9 {b -> 0x0101, RemoteException -> 0x0104, all -> 0x00fe, blocks: (B:29:0x0098, B:35:0x00a4, B:37:0x00ab, B:38:0x00be, B:42:0x00c4, B:44:0x00cc, B:46:0x00d0, B:47:0x00de, B:54:0x00e8, B:62:0x011c, B:64:0x0124, B:66:0x012c, B:67:0x0133, B:61:0x0107, B:70:0x0136, B:71:0x0137, B:72:0x013e, B:73:0x013f, B:74:0x0146, B:77:0x0149, B:78:0x014a, B:80:0x0161, B:82:0x0174, B:84:0x017c, B:90:0x01b8, B:92:0x01be, B:93:0x01c7, B:94:0x01ce, B:85:0x018d, B:86:0x0194, B:88:0x0197, B:89:0x01a8, B:95:0x01cf, B:96:0x01d6, B:97:0x01d7, B:98:0x01de, B:104:0x01ea, B:48:0x00df, B:52:0x00e5, B:39:0x00bf, B:40:0x00c1, B:30:0x0099, B:32:0x009f, B:33:0x00a1, B:101:0x01e1, B:102:0x01e8), top: B:161:0x0098, inners: #1, #4, #9 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:131:0x0263, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x00ab, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:78:0x014a, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static C0662c m1713a(Context context, C0352g c0352g) throws Throwable {
        long j3;
        long j4;
        C0662c c0662c;
        int i3;
        Boolean bool;
        C0667h c0667hM1717e;
        int i4;
        InterfaceC0629a interfaceC0629aM1775w0;
        Object objM1559w0;
        C0662c c0662c2;
        C0666g c0666g;
        C0668i c0668i;
        C0666g c0666g2;
        InterfaceC0629a interfaceC0629aM1779w0;
        Cursor cursor;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new C0661b("null application Context");
        }
        ThreadLocal threadLocal = f2549h;
        C0666g c0666g3 = (C0666g) threadLocal.get();
        C0666g c0666g4 = new C0666g();
        threadLocal.set(c0666g4);
        C0419D c0419d = f2550i;
        Long l3 = (Long) c0419d.get();
        long jLongValue = l3.longValue();
        try {
            j4 = 0;
            try {
                c0419d.set(Long.valueOf(SystemClock.elapsedRealtime()));
                C0576h c0576hM971J = c0352g.m971J(context, f2551j);
                int i5 = c0576hM971J.f2074a;
                j3 = jLongValue;
                try {
                    Log.i("DynamiteModule", "Considering local module com.google.android.gms.cast.framework.dynamite:" + i5 + " and remote module com.google.android.gms.cast.framework.dynamite:" + c0576hM971J.f2075b);
                    int i6 = c0576hM971J.f2076c;
                    if (i6 != 0) {
                        if (i6 != -1) {
                            boolean z3 = true;
                            if (i6 == 1 || c0576hM971J.f2075b != 0) {
                                if (i6 == -1) {
                                    Log.i("DynamiteModule", "Selected local version of ".concat("com.google.android.gms.cast.framework.dynamite"));
                                    c0662c = new C0662c(applicationContext);
                                } else {
                                    if (i6 == 1) {
                                        throw new C0661b("VersionPolicy returned invalid code:" + i6);
                                    }
                                    try {
                                        i3 = c0576hM971J.f2075b;
                                        try {
                                            synchronized (C0662c.class) {
                                                if (m1716d(context)) {
                                                    throw new C0661b("Remote loading disabled");
                                                }
                                                bool = f2544c;
                                            }
                                            if (bool != null) {
                                                throw new C0661b("Failed to determine which loading route to use.");
                                            }
                                            if (bool.booleanValue()) {
                                                Log.i("DynamiteModule", "Selected remote version of com.google.android.gms.cast.framework.dynamite, version >= " + i3);
                                                synchronized (C0662c.class) {
                                                    c0668i = f2553l;
                                                }
                                                if (c0668i != null) {
                                                    throw new C0661b("DynamiteLoaderV2 was not cached.");
                                                }
                                                c0666g2 = (C0666g) threadLocal.get();
                                                if (c0666g2 != null || c0666g2.f2563a == null) {
                                                    throw new C0661b("No result cursor");
                                                }
                                                Context applicationContext2 = context.getApplicationContext();
                                                Cursor cursor2 = c0666g2.f2563a;
                                                new BinderC0630b(null);
                                                synchronized (C0662c.class) {
                                                    if (f2547f < 2) {
                                                        z3 = false;
                                                    }
                                                }
                                                if (z3) {
                                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                    interfaceC0629aM1779w0 = c0668i.m1780x0(new BinderC0630b(applicationContext2), i3, new BinderC0630b(cursor2));
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                    interfaceC0629aM1779w0 = c0668i.m1779w0(new BinderC0630b(applicationContext2), i3, new BinderC0630b(cursor2));
                                                }
                                                Context context2 = (Context) BinderC0630b.m1559w0(interfaceC0629aM1779w0);
                                                if (context2 == null) {
                                                    throw new C0661b("Failed to get module context");
                                                }
                                                c0662c2 = new C0662c(context2);
                                            } else {
                                                Log.i("DynamiteModule", "Selected remote version of com.google.android.gms.cast.framework.dynamite, version >= " + i3);
                                                c0667hM1717e = m1717e(context);
                                                if (c0667hM1717e != null) {
                                                    throw new C0661b("Failed to create IDynamiteLoader.");
                                                }
                                                Parcel parcelM1893P = c0667hM1717e.m1893P(c0667hM1717e.m1894e0(), 6);
                                                i4 = parcelM1893P.readInt();
                                                parcelM1893P.recycle();
                                                if (i4 >= 3) {
                                                    c0666g = (C0666g) threadLocal.get();
                                                    if (c0666g != null) {
                                                        throw new C0661b("No cached result cursor holder");
                                                    }
                                                    interfaceC0629aM1775w0 = c0667hM1717e.m1776x0(new BinderC0630b(context), i3, new BinderC0630b(c0666g.f2563a));
                                                } else if (i4 == 2) {
                                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                    interfaceC0629aM1775w0 = c0667hM1717e.m1777y0(new BinderC0630b(context), i3);
                                                } else {
                                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                    interfaceC0629aM1775w0 = c0667hM1717e.m1775w0(new BinderC0630b(context), i3);
                                                }
                                                objM1559w0 = BinderC0630b.m1559w0(interfaceC0629aM1775w0);
                                                if (objM1559w0 != null) {
                                                    throw new C0661b("Failed to load remote module.");
                                                }
                                                c0662c2 = new C0662c((Context) objM1559w0);
                                            }
                                            c0662c = c0662c2;
                                        } catch (C0661b e3) {
                                            throw e3;
                                        } catch (RemoteException e4) {
                                            throw new C0661b("Failed to load remote module.", e4);
                                        } catch (Throwable th) {
                                            throw new C0661b("Failed to load remote module.", th);
                                        }
                                    } catch (C0661b e5) {
                                        Log.w("DynamiteModule", "Failed to load remote module: " + e5.getMessage());
                                        int i7 = c0576hM971J.f2074a;
                                        if (i7 != 0) {
                                            C0576h c0576h = new C0576h();
                                            c0576h.f2075b = 0;
                                            c0576h.f2074a = i7;
                                            if (i7 != 0) {
                                                c0576h.f2076c = -1;
                                            }
                                            if (c0576h.f2076c == -1) {
                                                Log.i("DynamiteModule", "Selected local version of ".concat("com.google.android.gms.cast.framework.dynamite"));
                                                c0662c = new C0662c(applicationContext);
                                            }
                                        }
                                        throw new C0661b("Remote load failed. No local fallback found.", e5);
                                    }
                                }
                                if (j3 == 0) {
                                    f2550i.remove();
                                } else {
                                    f2550i.set(l3);
                                }
                                cursor = c0666g4.f2563a;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                f2549h.set(c0666g3);
                                return c0662c;
                            }
                        } else if (c0576hM971J.f2074a != 0) {
                            i6 = -1;
                            boolean z4 = true;
                            if (i6 == 1) {
                            }
                            if (i6 == -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat("com.google.android.gms.cast.framework.dynamite"));
                                c0662c = new C0662c(applicationContext);
                            } else {
                                if (i6 == 1) {
                                    throw new C0661b("VersionPolicy returned invalid code:" + i6);
                                }
                                i3 = c0576hM971J.f2075b;
                                synchronized (C0662c.class) {
                                    if (m1716d(context)) {
                                        throw new C0661b("Remote loading disabled");
                                    }
                                    bool = f2544c;
                                    if (bool != null) {
                                        throw new C0661b("Failed to determine which loading route to use.");
                                    }
                                    if (bool.booleanValue()) {
                                        Log.i("DynamiteModule", "Selected remote version of com.google.android.gms.cast.framework.dynamite, version >= " + i3);
                                        synchronized (C0662c.class) {
                                            c0668i = f2553l;
                                            if (c0668i != null) {
                                                throw new C0661b("DynamiteLoaderV2 was not cached.");
                                            }
                                            c0666g2 = (C0666g) threadLocal.get();
                                            if (c0666g2 != null) {
                                            }
                                            throw new C0661b("No result cursor");
                                        }
                                    }
                                    Log.i("DynamiteModule", "Selected remote version of com.google.android.gms.cast.framework.dynamite, version >= " + i3);
                                    c0667hM1717e = m1717e(context);
                                    if (c0667hM1717e != null) {
                                        throw new C0661b("Failed to create IDynamiteLoader.");
                                    }
                                    Parcel parcelM1893P2 = c0667hM1717e.m1893P(c0667hM1717e.m1894e0(), 6);
                                    i4 = parcelM1893P2.readInt();
                                    parcelM1893P2.recycle();
                                    if (i4 >= 3) {
                                        c0666g = (C0666g) threadLocal.get();
                                        if (c0666g != null) {
                                            throw new C0661b("No cached result cursor holder");
                                        }
                                        interfaceC0629aM1775w0 = c0667hM1717e.m1776x0(new BinderC0630b(context), i3, new BinderC0630b(c0666g.f2563a));
                                    } else if (i4 == 2) {
                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                        interfaceC0629aM1775w0 = c0667hM1717e.m1777y0(new BinderC0630b(context), i3);
                                    } else {
                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                        interfaceC0629aM1775w0 = c0667hM1717e.m1775w0(new BinderC0630b(context), i3);
                                    }
                                    objM1559w0 = BinderC0630b.m1559w0(interfaceC0629aM1775w0);
                                    if (objM1559w0 != null) {
                                        throw new C0661b("Failed to load remote module.");
                                    }
                                    c0662c2 = new C0662c((Context) objM1559w0);
                                    c0662c = c0662c2;
                                }
                            }
                            if (j3 == 0) {
                                f2550i.remove();
                            } else {
                                f2550i.set(l3);
                            }
                            cursor = c0666g4.f2563a;
                            if (cursor != null) {
                                cursor.close();
                            }
                            f2549h.set(c0666g3);
                            return c0662c;
                        }
                    }
                    throw new C0661b("No acceptable module com.google.android.gms.cast.framework.dynamite found. Local version is " + c0576hM971J.f2074a + " and remote version is " + c0576hM971J.f2075b + ".");
                } catch (Throwable th2) {
                    th = th2;
                    if (j3 == j4) {
                        f2550i.remove();
                    } else {
                        f2550i.set(l3);
                    }
                    Cursor cursor3 = c0666g4.f2563a;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    f2549h.set(c0666g3);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                j3 = jLongValue;
            }
        } catch (Throwable th4) {
            th = th4;
            j3 = jLongValue;
            j4 = 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m1714b(Context context, boolean z3, boolean z4) throws Throwable {
        Throwable th;
        Exception exc;
        boolean z5;
        Cursor cursor = null;
        try {
            try {
                boolean z6 = true;
                Cursor cursorQuery = context.getContentResolver().query(new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z3 ? "api" : "api_force_staging").appendPath("com.google.android.gms.cast.framework.dynamite").appendQueryParameter("requestStartTime", String.valueOf(((Long) f2550i.get()).longValue())).build(), null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            boolean z7 = false;
                            int i3 = cursorQuery.getInt(0);
                            if (i3 > 0) {
                                synchronized (C0662c.class) {
                                    try {
                                        f2545d = cursorQuery.getString(2);
                                        int columnIndex = cursorQuery.getColumnIndex("loaderVersion");
                                        if (columnIndex >= 0) {
                                            f2547f = cursorQuery.getInt(columnIndex);
                                        }
                                        int columnIndex2 = cursorQuery.getColumnIndex("disableStandaloneDynamiteLoader2");
                                        if (columnIndex2 >= 0) {
                                            z5 = cursorQuery.getInt(columnIndex2) != 0;
                                            f2546e = z5;
                                        } else {
                                            z5 = false;
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                C0666g c0666g = (C0666g) f2549h.get();
                                if (c0666g == null || c0666g.f2563a != null) {
                                    z6 = false;
                                } else {
                                    c0666g.f2563a = cursorQuery;
                                }
                                cursor = z6 ? null : cursorQuery;
                                z7 = z5;
                            } else {
                                cursor = cursorQuery;
                            }
                            if (z4 && z7) {
                                throw new C0661b("forcing fallback to container DynamiteLoader impl");
                            }
                            if (cursor != null) {
                                cursor.close();
                            }
                            return i3;
                            if (exc instanceof C0661b) {
                                throw exc;
                            }
                            throw new C0661b("V2 version check failed: " + exc.getMessage(), exc);
                        }
                    } catch (Exception e3) {
                        exc = e3;
                    } catch (Throwable th3) {
                        cursor = cursorQuery;
                        th = th3;
                        if (cursor == null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                }
                Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                throw new C0661b("Failed to connect to dynamite module ContentResolver.");
            } catch (Exception e4) {
                exc = e4;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1715c(ClassLoader classLoader) throws C0661b {
        try {
            C0668i c0668i = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (iInterfaceQueryLocalInterface instanceof C0668i) {
                    c0668i = (C0668i) iInterfaceQueryLocalInterface;
                } else {
                    try {
                        c0668i = new C0668i(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 1);
                    } catch (IllegalAccessException e3) {
                        e = e3;
                        throw new C0661b("Failed to instantiate dynamite loader", e);
                    } catch (InstantiationException e4) {
                        e = e4;
                        throw new C0661b("Failed to instantiate dynamite loader", e);
                    } catch (NoSuchMethodException e5) {
                        e = e5;
                        throw new C0661b("Failed to instantiate dynamite loader", e);
                    } catch (InvocationTargetException e6) {
                        e = e6;
                        throw new C0661b("Failed to instantiate dynamite loader", e);
                    }
                }
            }
            f2553l = c0668i;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e7) {
            e = e7;
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m1716d(Context context) {
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(f2548g)) {
            return true;
        }
        boolean z3 = false;
        if (f2548g == null) {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", 0);
            if (C0350e.f1134b.m958b(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z3 = true;
            }
            f2548g = Boolean.valueOf(z3);
            if (z3 && (applicationInfo = providerInfoResolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f2546e = true;
            }
        }
        if (!z3) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z3;
    }

    /* JADX INFO: renamed from: e */
    public static C0667h m1717e(Context context) {
        C0667h c0667h;
        synchronized (C0662c.class) {
            C0667h c0667h2 = f2552k;
            if (c0667h2 != null) {
                return c0667h2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    c0667h = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    c0667h = iInterfaceQueryLocalInterface instanceof C0667h ? (C0667h) iInterfaceQueryLocalInterface : new C0667h(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 1);
                }
                if (c0667h != null) {
                    f2552k = c0667h;
                    return c0667h;
                }
            } catch (Exception e3) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e3.getMessage());
            }
            return null;
        }
    }
}
