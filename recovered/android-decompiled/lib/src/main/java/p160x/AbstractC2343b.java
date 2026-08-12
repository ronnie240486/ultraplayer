package p160x;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p022H1.C0258b;
import p030K0.C0334e;
import p048Q0.C0505d;
import p144s.AbstractC2208b;

/* JADX INFO: renamed from: x.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2343b {

    /* JADX INFO: renamed from: a */
    public static final C0505d f9846a = new C0505d(15);

    /* JADX WARN: Code duplicated, block: B:60:0x0169  */
    /* JADX WARN: Code duplicated, block: B:62:0x016c A[Catch: all -> 0x0173, TryCatch #1 {all -> 0x0173, blocks: (B:35:0x00e0, B:36:0x00fc, B:37:0x00ff, B:41:0x010a, B:44:0x0110, B:55:0x0134, B:57:0x013a, B:58:0x0163, B:62:0x016c, B:67:0x017c, B:46:0x0119, B:50:0x0124, B:53:0x012a), top: B:102:0x00e0, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0178  */
    /* JADX WARN: Code duplicated, block: B:67:0x017c A[Catch: all -> 0x0173, TRY_LEAVE, TryCatch #1 {all -> 0x0173, blocks: (B:35:0x00e0, B:36:0x00fc, B:37:0x00ff, B:41:0x010a, B:44:0x0110, B:55:0x0134, B:57:0x013a, B:58:0x0163, B:62:0x016c, B:67:0x017c, B:46:0x0119, B:50:0x0124, B:53:0x012a), top: B:102:0x00e0, inners: #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0182  */
    /* JADX WARN: Code duplicated, block: B:71:0x0185  */
    /* JADX WARN: Code duplicated, block: B:76:0x0193 A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:72:0x0187, B:78:0x01a0, B:81:0x01ad, B:85:0x01b8, B:76:0x0193), top: B:100:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01a0 A[Catch: all -> 0x0191, TryCatch #0 {all -> 0x0191, blocks: (B:72:0x0187, B:78:0x01a0, B:81:0x01ad, B:85:0x01b8, B:76:0x0193), top: B:100:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c8  */
    /* JADX INFO: renamed from: a */
    public static C0334e m4945a(Context context, C0258b c0258b) {
        Cursor cursor;
        C2342a c2342a;
        Cursor cursorQuery;
        int columnIndex;
        int columnIndex2;
        int columnIndex3;
        int columnIndex4;
        int columnIndex5;
        int columnIndex6;
        int i3;
        int i4;
        Uri uriWithAppendedId;
        int i5;
        boolean z3;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) c0258b.f663h;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
        }
        String str2 = providerInfoResolveContentProvider.packageName;
        String str3 = (String) c0258b.f664i;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        C0505d c0505d = f9846a;
        Collections.sort(arrayList, c0505d);
        List listM4789h = (List) c0258b.f666k;
        if (listM4789h == null) {
            listM4789h = AbstractC2208b.m4789h(resources, 0);
        }
        int i6 = 0;
        loop1: while (true) {
            cursor = null;
            if (i6 >= listM4789h.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listM4789h.get(i6));
            Collections.sort(arrayList2, c0505d);
            if (arrayList.size() == arrayList2.size()) {
                int i7 = 0;
                while (true) {
                    if (i7 >= arrayList.size()) {
                        break loop1;
                    }
                    if (!Arrays.equals((byte[]) arrayList.get(i7), (byte[]) arrayList2.get(i7))) {
                        break;
                    }
                    i7++;
                }
            }
            i6++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new C0334e(1, (Object) null);
        }
        String str4 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str4).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
        C2342a c2342a2 = Build.VERSION.SDK_INT < 24 ? new C2342a(context, uriBuild, 0) : new C2342a(context, uriBuild, 1);
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            String[] strArr2 = {(String) c0258b.f665j};
            switch (c2342a2.f9844a) {
                case 0:
                    cursorQuery = null;
                    ContentProviderClient contentProviderClient = c2342a2.f9845b;
                    if (contentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e3) {
                            Log.w("FontsProvider", "Unable to query the content provider", e3);
                        }
                        break;
                    }
                    cursor = cursorQuery;
                    if (cursor != null && cursor.getCount() > 0) {
                        columnIndex = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        columnIndex2 = cursor.getColumnIndex("_id");
                        columnIndex3 = cursor.getColumnIndex("file_id");
                        columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        columnIndex5 = cursor.getColumnIndex("font_weight");
                        columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            if (columnIndex != -1) {
                                i3 = cursor.getInt(columnIndex);
                            } else {
                                i3 = 0;
                            }
                            if (columnIndex4 != -1) {
                                i4 = cursor.getInt(columnIndex4);
                            } else {
                                i4 = 0;
                            }
                            if (columnIndex3 == -1) {
                                c2342a = c2342a2;
                                try {
                                    uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursor.getLong(columnIndex2));
                                } catch (Throwable th) {
                                    th = th;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    c2342a.m4944a();
                                    throw th;
                                }
                            } else {
                                c2342a = c2342a2;
                                uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursor.getLong(columnIndex3));
                            }
                            Uri uri = uriWithAppendedId;
                            if (columnIndex5 != -1) {
                                i5 = cursor.getInt(columnIndex5);
                            } else {
                                i5 = 400;
                            }
                            if (columnIndex6 == -1 && cursor.getInt(columnIndex6) == 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            arrayList3.add(new C2348g(uri, i4, i5, z3, i3));
                            c2342a2 = c2342a;
                            break;
                        }
                    }
                    C2342a c2342a3 = c2342a2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    c2342a3.m4944a();
                    return new C0334e(0, (C2348g[]) arrayList3.toArray(new C2348g[0]));
                default:
                    cursorQuery = null;
                    ContentProviderClient contentProviderClient2 = c2342a2.f9845b;
                    if (contentProviderClient2 != null) {
                        try {
                            cursorQuery = contentProviderClient2.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e4) {
                            Log.w("FontsProvider", "Unable to query the content provider", e4);
                        }
                        break;
                    }
                    cursor = cursorQuery;
                    if (cursor != null) {
                        columnIndex = cursor.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        columnIndex2 = cursor.getColumnIndex("_id");
                        columnIndex3 = cursor.getColumnIndex("file_id");
                        columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                        columnIndex5 = cursor.getColumnIndex("font_weight");
                        columnIndex6 = cursor.getColumnIndex("font_italic");
                        while (cursor.moveToNext()) {
                            if (columnIndex != -1) {
                                i3 = cursor.getInt(columnIndex);
                            } else {
                                i3 = 0;
                            }
                            if (columnIndex4 != -1) {
                                i4 = cursor.getInt(columnIndex4);
                            } else {
                                i4 = 0;
                            }
                            if (columnIndex3 == -1) {
                                c2342a = c2342a2;
                                uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursor.getLong(columnIndex2));
                            } else {
                                c2342a = c2342a2;
                                uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursor.getLong(columnIndex3));
                            }
                            Uri uri2 = uriWithAppendedId;
                            if (columnIndex5 != -1) {
                                i5 = cursor.getInt(columnIndex5);
                            } else {
                                i5 = 400;
                            }
                            if (columnIndex6 == -1) {
                                z3 = false;
                            } else {
                                z3 = false;
                            }
                            arrayList3.add(new C2348g(uri2, i4, i5, z3, i3));
                            c2342a2 = c2342a;
                            break;
                        }
                    }
                    C2342a c2342a4 = c2342a2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    c2342a4.m4944a();
                    return new C0334e(0, (C2348g[]) arrayList3.toArray(new C2348g[0]));
            }
        } catch (Throwable th2) {
            th = th2;
            c2342a = c2342a2;
        }
    }
}
