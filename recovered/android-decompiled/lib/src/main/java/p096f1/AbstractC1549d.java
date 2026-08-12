package p096f1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p045P0.AbstractC0462h;
import p089d1.C1427a0;
import p095f0.C1528a;

/* JADX INFO: renamed from: f1.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1549d {

    /* JADX INFO: renamed from: a */
    public static final C1528a f7044a = new C1528a(1);

    /* JADX INFO: renamed from: b */
    public static final byte[] f7045b = {112, 114, 111, 0};

    /* JADX INFO: renamed from: c */
    public static final byte[] f7046c = {112, 114, 109, 0};

    /* JADX INFO: renamed from: d */
    public static final byte[] f7047d = {48, 49, 53, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f7048e = {48, 49, 48, 0};

    /* JADX INFO: renamed from: f */
    public static final byte[] f7049f = {48, 48, 57, 0};

    /* JADX INFO: renamed from: g */
    public static final byte[] f7050g = {48, 48, 53, 0};

    /* JADX INFO: renamed from: h */
    public static final byte[] f7051h = {48, 48, 49, 0};

    /* JADX INFO: renamed from: i */
    public static final byte[] f7052i = {48, 48, 49, 0};

    /* JADX INFO: renamed from: j */
    public static final byte[] f7053j = {48, 48, 50, 0};

    /* JADX INFO: renamed from: a */
    public static byte[] m3849a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m3850b(C1546a[] c1546aArr, byte[] bArr) throws IOException {
        int length = 0;
        for (C1546a c1546a : c1546aArr) {
            length += ((((c1546a.f7040g * 2) + 7) & (-8)) / 8) + (c1546a.f7038e * 2) + m3852d(c1546a.f7034a, c1546a.f7035b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c1546a.f7039f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, f7049f)) {
            for (C1546a c1546a2 : c1546aArr) {
                m3864p(byteArrayOutputStream, c1546a2, m3852d(c1546a2.f7034a, c1546a2.f7035b, bArr));
                m3866r(byteArrayOutputStream, c1546a2);
                int[] iArr = c1546a2.f7041h;
                int length2 = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i3 < length2) {
                    int i5 = iArr[i3];
                    m3869u(byteArrayOutputStream, i5 - i4);
                    i3++;
                    i4 = i5;
                }
                m3865q(byteArrayOutputStream, c1546a2);
            }
        } else {
            for (C1546a c1546a3 : c1546aArr) {
                m3864p(byteArrayOutputStream, c1546a3, m3852d(c1546a3.f7034a, c1546a3.f7035b, bArr));
            }
            for (C1546a c1546a4 : c1546aArr) {
                m3866r(byteArrayOutputStream, c1546a4);
                int[] iArr2 = c1546a4.f7041h;
                int length3 = iArr2.length;
                int i6 = 0;
                int i7 = 0;
                while (i6 < length3) {
                    int i8 = iArr2[i6];
                    m3869u(byteArrayOutputStream, i8 - i7);
                    i6++;
                    i7 = i8;
                }
                m3865q(byteArrayOutputStream, c1546a4);
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3851c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z3 = true;
        for (File file2 : fileArrListFiles) {
            z3 = m3851c(file2) && z3;
        }
        return z3;
    }

    /* JADX INFO: renamed from: d */
    public static String m3852d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f7051h;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f7050g;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append((Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: e */
    public static void m3853e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m3854f(InputStream inputStream, int i3) throws IOException {
        byte[] bArr = new byte[i3];
        int i4 = 0;
        while (i4 < i3) {
            int i5 = inputStream.read(bArr, i4, i3 - i4);
            if (i5 < 0) {
                throw new IllegalStateException(AbstractC0462h.m1165e(i3, "Not enough bytes to read: "));
            }
            i4 += i5;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: g */
    public static int[] m3855g(ByteArrayInputStream byteArrayInputStream, int i3) {
        int[] iArr = new int[i3];
        int iM3861m = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            iM3861m += (int) m3861m(byteArrayInputStream, 2);
            iArr[i4] = iM3861m;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m3856h(FileInputStream fileInputStream, int i3, int i4) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i4];
            byte[] bArr2 = new byte[2048];
            int i5 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i5 < i3) {
                int i6 = fileInputStream.read(bArr2);
                if (i6 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i3 + " bytes");
                }
                inflater.setInput(bArr2, 0, i6);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i4 - iInflate);
                    i5 += i6;
                } catch (DataFormatException e3) {
                    throw new IllegalStateException(e3.getMessage());
                }
            }
            if (i5 == i3) {
                if (!inflater.finished()) {
                    throw new IllegalStateException("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i3 + " actual=" + i5);
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public static C1546a[] m3857i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C1546a[] c1546aArr) throws IOException {
        byte[] bArr3 = f7052i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f7053j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM3861m = (int) m3861m(fileInputStream, 2);
            byte[] bArrM3856h = m3856h(fileInputStream, (int) m3861m(fileInputStream, 4), (int) m3861m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM3856h);
            try {
                C1546a[] c1546aArrM3859k = m3859k(byteArrayInputStream, bArr2, iM3861m, c1546aArr);
                byteArrayInputStream.close();
                return c1546aArrM3859k;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f7047d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM3861m2 = (int) m3861m(fileInputStream, 1);
        byte[] bArrM3856h2 = m3856h(fileInputStream, (int) m3861m(fileInputStream, 4), (int) m3861m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM3856h2);
        try {
            C1546a[] c1546aArrM3858j = m3858j(byteArrayInputStream2, iM3861m2, c1546aArr);
            byteArrayInputStream2.close();
            return c1546aArrM3858j;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: j */
    public static C1546a[] m3858j(ByteArrayInputStream byteArrayInputStream, int i3, C1546a[] c1546aArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C1546a[0];
        }
        if (i3 != c1546aArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i3];
        int[] iArr = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int iM3861m = (int) m3861m(byteArrayInputStream, 2);
            iArr[i4] = (int) m3861m(byteArrayInputStream, 2);
            strArr[i4] = new String(m3854f(byteArrayInputStream, iM3861m), StandardCharsets.UTF_8);
        }
        for (int i5 = 0; i5 < i3; i5++) {
            C1546a c1546a = c1546aArr[i5];
            if (!c1546a.f7035b.equals(strArr[i5])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i6 = iArr[i5];
            c1546a.f7038e = i6;
            c1546a.f7041h = m3855g(byteArrayInputStream, i6);
        }
        return c1546aArr;
    }

    /* JADX INFO: renamed from: k */
    public static C1546a[] m3859k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i3, C1546a[] c1546aArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C1546a[0];
        }
        if (i3 != c1546aArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i4 = 0; i4 < i3; i4++) {
            m3861m(byteArrayInputStream, 2);
            String str = new String(m3854f(byteArrayInputStream, (int) m3861m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM3861m = m3861m(byteArrayInputStream, 4);
            int iM3861m = (int) m3861m(byteArrayInputStream, 2);
            C1546a c1546a = null;
            if (c1546aArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i5 = 0; i5 < c1546aArr.length; i5++) {
                    if (c1546aArr[i5].f7035b.equals(strSubstring)) {
                        c1546a = c1546aArr[i5];
                        break;
                    }
                }
            }
            if (c1546a == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c1546a.f7037d = jM3861m;
            int[] iArrM3855g = m3855g(byteArrayInputStream, iM3861m);
            if (Arrays.equals(bArr, f7051h)) {
                c1546a.f7038e = iM3861m;
                c1546a.f7041h = iArrM3855g;
            }
        }
        return c1546aArr;
    }

    /* JADX INFO: renamed from: l */
    public static C1546a[] m3860l(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, f7048e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iM3861m = (int) m3861m(fileInputStream, 1);
        byte[] bArrM3856h = m3856h(fileInputStream, (int) m3861m(fileInputStream, 4), (int) m3861m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM3856h);
        try {
            C1546a[] c1546aArrM3862n = m3862n(byteArrayInputStream, str, iM3861m);
            byteArrayInputStream.close();
            return c1546aArrM3862n;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public static long m3861m(InputStream inputStream, int i3) throws IOException {
        byte[] bArrM3854f = m3854f(inputStream, i3);
        long j3 = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            j3 += ((long) (bArrM3854f[i4] & 255)) << (i4 * 8);
        }
        return j3;
    }

    /* JADX INFO: renamed from: n */
    public static C1546a[] m3862n(ByteArrayInputStream byteArrayInputStream, String str, int i3) throws IOException {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C1546a[0];
        }
        C1546a[] c1546aArr = new C1546a[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int iM3861m = (int) m3861m(byteArrayInputStream, 2);
            int iM3861m2 = (int) m3861m(byteArrayInputStream, 2);
            c1546aArr[i4] = new C1546a(str, new String(m3854f(byteArrayInputStream, iM3861m), StandardCharsets.UTF_8), m3861m(byteArrayInputStream, 4), iM3861m2, (int) m3861m(byteArrayInputStream, 4), (int) m3861m(byteArrayInputStream, 4), new int[iM3861m2], new TreeMap());
        }
        for (int i5 = 0; i5 < i3; i5++) {
            C1546a c1546a = c1546aArr[i5];
            int iAvailable = byteArrayInputStream.available() - c1546a.f7039f;
            int iM3861m3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = c1546a.f7042i;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iM3861m3 += (int) m3861m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iM3861m3), 1);
                for (int iM3861m4 = (int) m3861m(byteArrayInputStream, 2); iM3861m4 > 0; iM3861m4--) {
                    m3861m(byteArrayInputStream, 2);
                    int iM3861m5 = (int) m3861m(byteArrayInputStream, 1);
                    if (iM3861m5 != 6 && iM3861m5 != 7) {
                        while (iM3861m5 > 0) {
                            m3861m(byteArrayInputStream, 1);
                            for (int iM3861m6 = (int) m3861m(byteArrayInputStream, 1); iM3861m6 > 0; iM3861m6--) {
                                m3861m(byteArrayInputStream, 2);
                            }
                            iM3861m5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c1546a.f7041h = m3855g(byteArrayInputStream, c1546a.f7038e);
            int i6 = c1546a.f7040g;
            BitSet bitSetValueOf = BitSet.valueOf(m3854f(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i7 = 0; i7 < i6; i7++) {
                int i8 = bitSetValueOf.get(i7) ? 2 : 0;
                if (bitSetValueOf.get(i7 + i6)) {
                    i8 |= 4;
                }
                if (i8 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i7));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i7), Integer.valueOf(i8 | num.intValue()));
                }
            }
        }
        return c1546aArr;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m3863o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C1546a[] c1546aArr) throws IOException {
        long j3;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f7047d;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f7048e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM3850b = m3850b(c1546aArr, bArr3);
                m3868t(byteArrayOutputStream, c1546aArr.length, 1);
                m3868t(byteArrayOutputStream, bArrM3850b.length, 4);
                byte[] bArrM3849a = m3849a(bArrM3850b);
                m3868t(byteArrayOutputStream, bArrM3849a.length, 4);
                byteArrayOutputStream.write(bArrM3849a);
                return true;
            }
            byte[] bArr4 = f7050g;
            if (Arrays.equals(bArr, bArr4)) {
                m3868t(byteArrayOutputStream, c1546aArr.length, 1);
                for (C1546a c1546a : c1546aArr) {
                    int size = c1546a.f7042i.size() * 4;
                    String strM3852d = m3852d(c1546a.f7034a, c1546a.f7035b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    m3869u(byteArrayOutputStream, strM3852d.getBytes(charset).length);
                    m3869u(byteArrayOutputStream, c1546a.f7041h.length);
                    m3868t(byteArrayOutputStream, size, 4);
                    m3868t(byteArrayOutputStream, c1546a.f7036c, 4);
                    byteArrayOutputStream.write(strM3852d.getBytes(charset));
                    Iterator it = c1546a.f7042i.keySet().iterator();
                    while (it.hasNext()) {
                        m3869u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        m3869u(byteArrayOutputStream, 0);
                    }
                    for (int i3 : c1546a.f7041h) {
                        m3869u(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = f7049f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM3850b2 = m3850b(c1546aArr, bArr5);
                m3868t(byteArrayOutputStream, c1546aArr.length, 1);
                m3868t(byteArrayOutputStream, bArrM3850b2.length, 4);
                byte[] bArrM3849a2 = m3849a(bArrM3850b2);
                m3868t(byteArrayOutputStream, bArrM3849a2.length, 4);
                byteArrayOutputStream.write(bArrM3849a2);
                return true;
            }
            byte[] bArr6 = f7051h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            m3869u(byteArrayOutputStream, c1546aArr.length);
            for (C1546a c1546a2 : c1546aArr) {
                String strM3852d2 = m3852d(c1546a2.f7034a, c1546a2.f7035b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                m3869u(byteArrayOutputStream, strM3852d2.getBytes(charset2).length);
                TreeMap treeMap = c1546a2.f7042i;
                m3869u(byteArrayOutputStream, treeMap.size());
                m3869u(byteArrayOutputStream, c1546a2.f7041h.length);
                m3868t(byteArrayOutputStream, c1546a2.f7036c, 4);
                byteArrayOutputStream.write(strM3852d2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    m3869u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : c1546a2.f7041h) {
                    m3869u(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            m3869u(byteArrayOutputStream2, c1546aArr.length);
            int i5 = 2;
            for (C1546a c1546a3 : c1546aArr) {
                m3868t(byteArrayOutputStream2, c1546a3.f7036c, 4);
                m3868t(byteArrayOutputStream2, c1546a3.f7037d, 4);
                m3868t(byteArrayOutputStream2, c1546a3.f7040g, 4);
                String strM3852d3 = m3852d(c1546a3.f7034a, c1546a3.f7035b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM3852d3.getBytes(charset3).length;
                m3869u(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strM3852d3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            C1556k c1556k = new C1556k(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(c1556k);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            for (int i7 = 0; i7 < c1546aArr.length; i7++) {
                try {
                    C1546a c1546a4 = c1546aArr[i7];
                    m3869u(byteArrayOutputStream3, i7);
                    m3869u(byteArrayOutputStream3, c1546a4.f7038e);
                    i6 = i6 + 4 + (c1546a4.f7038e * 2);
                    int[] iArr = c1546a4.f7041h;
                    int length3 = iArr.length;
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < length3) {
                        int i10 = iArr[i8];
                        m3869u(byteArrayOutputStream3, i10 - i9);
                        i8++;
                        i9 = i10;
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i6 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray2.length);
            }
            C1556k c1556k2 = new C1556k(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(c1556k2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < c1546aArr.length) {
                try {
                    C1546a c1546a5 = c1546aArr[i11];
                    Iterator it3 = c1546a5.f7042i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        m3865q(byteArrayOutputStream5, c1546a5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            m3866r(byteArrayOutputStream6, c1546a5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            m3869u(byteArrayOutputStream4, i11);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i13 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            m3868t(byteArrayOutputStream4, length4, 4);
                            m3869u(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i12 = i13 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            C1556k c1556k3 = new C1556k(4, true, byteArray5);
            byteArrayOutputStream4.close();
            arrayList2.add(c1556k3);
            long j4 = 4;
            long size2 = j4 + j4 + 4 + ((long) (arrayList2.size() * 16));
            m3868t(byteArrayOutputStream, arrayList2.size(), 4);
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                C1556k c1556k4 = (C1556k) arrayList2.get(i14);
                int i15 = c1556k4.f7062a;
                if (i15 == 1) {
                    j3 = 0;
                } else if (i15 == 2) {
                    j3 = 1;
                } else if (i15 == 3) {
                    j3 = 2;
                } else if (i15 == 4) {
                    j3 = 3;
                } else {
                    if (i15 != 5) {
                        throw null;
                    }
                    j3 = 4;
                }
                m3868t(byteArrayOutputStream, j3, 4);
                m3868t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = c1556k4.f7063b;
                if (c1556k4.f7064c) {
                    long length5 = bArr7.length;
                    byte[] bArrM3849a3 = m3849a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM3849a3);
                    m3868t(byteArrayOutputStream, bArrM3849a3.length, 4);
                    m3868t(byteArrayOutputStream, length5, 4);
                    length = bArrM3849a3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    m3868t(byteArrayOutputStream, bArr7.length, 4);
                    m3868t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i14++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i16));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m3864p(ByteArrayOutputStream byteArrayOutputStream, C1546a c1546a, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        m3869u(byteArrayOutputStream, str.getBytes(charset).length);
        m3869u(byteArrayOutputStream, c1546a.f7038e);
        m3868t(byteArrayOutputStream, c1546a.f7039f, 4);
        m3868t(byteArrayOutputStream, c1546a.f7036c, 4);
        m3868t(byteArrayOutputStream, c1546a.f7040g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: q */
    public static void m3865q(ByteArrayOutputStream byteArrayOutputStream, C1546a c1546a) throws IOException {
        byte[] bArr = new byte[(((c1546a.f7040g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c1546a.f7042i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i3 = iIntValue / 8;
                bArr[i3] = (byte) (bArr[i3] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i4 = iIntValue + c1546a.f7040g;
                int i5 = i4 / 8;
                bArr[i5] = (byte) ((1 << (i4 % 8)) | bArr[i5]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: r */
    public static void m3866r(ByteArrayOutputStream byteArrayOutputStream, C1546a c1546a) throws IOException {
        int i3 = 0;
        for (Map.Entry entry : c1546a.f7042i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m3869u(byteArrayOutputStream, iIntValue - i3);
                m3869u(byteArrayOutputStream, 0);
                i3 = iIntValue;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0194 A[Catch: all -> 0x0191, TRY_ENTER, TryCatch #23 {all -> 0x0191, blocks: (B:94:0x016f, B:96:0x017b, B:107:0x0194, B:108:0x0199), top: B:249:0x016f }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x01a5 A[Catch: IllegalStateException -> 0x018a, IOException -> 0x018c, FileNotFoundException -> 0x018f, TRY_LEAVE, TryCatch #28 {FileNotFoundException -> 0x018f, IOException -> 0x018c, IllegalStateException -> 0x018a, blocks: (B:92:0x0167, B:97:0x0185, B:115:0x01a5, B:113:0x01a2, B:112:0x019f), top: B:262:0x0167 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e5 A[Catch: all -> 0x01f4, TRY_LEAVE, TryCatch #13 {all -> 0x01f4, blocks: (B:131:0x01d9, B:133:0x01e5, B:142:0x01f7), top: B:239:0x01d9, outer: #33 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x01f7 A[Catch: all -> 0x01f4, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x01f4, blocks: (B:131:0x01d9, B:133:0x01e5, B:142:0x01f7), top: B:239:0x01d9, outer: #33 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0214  */
    /* JADX WARN: Code duplicated, block: B:157:0x0220  */
    /* JADX WARN: Code duplicated, block: B:158:0x0224  */
    /* JADX WARN: Code duplicated, block: B:166:0x0240 A[Catch: all -> 0x0263, TRY_LEAVE, TryCatch #2 {all -> 0x0263, blocks: (B:163:0x0238, B:164:0x023a, B:166:0x0240), top: B:226:0x0238 }] */
    /* JADX WARN: Code duplicated, block: B:207:0x0290  */
    /* JADX WARN: Code duplicated, block: B:211:0x029a  */
    /* JADX WARN: Code duplicated, block: B:216:0x02a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:218:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:249:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x01d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:260:0x0228 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0245 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x017b A[Catch: all -> 0x0191, TRY_LEAVE, TryCatch #23 {all -> 0x0191, blocks: (B:94:0x016f, B:96:0x017b, B:107:0x0194, B:108:0x0199), top: B:249:0x016f }] */
    /* JADX INFO: renamed from: s */
    public static void m3867s(Context context, Executor executor, InterfaceC1548c interfaceC1548c, boolean z3) {
        byte[] bArr;
        FileInputStream fileInputStreamM3567a;
        C1546a[] c1546aArrM3860l;
        InterfaceC1548c interfaceC1548c2;
        C1546a[] c1546aArr;
        byte[] bArr2;
        boolean z4;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th;
        byte[] bArr3;
        int i3;
        boolean z5;
        byte[] bArr4;
        ByteArrayOutputStream byteArrayOutputStream;
        int i4;
        C1427a0 c1427a0;
        FileInputStream fileInputStreamM3567a2;
        boolean z6;
        boolean z7;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z3) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j3 = dataInputStream.readLong();
                            dataInputStream.close();
                            z7 = j3 == packageInfo.lastUpdateTime;
                            if (z7) {
                                interfaceC1548c.mo3623k(2, null);
                            }
                        } catch (Throwable th2) {
                            try {
                                dataInputStream.close();
                                throw th2;
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                                throw th2;
                            }
                        }
                    } catch (IOException unused) {
                        z7 = false;
                    }
                } else {
                    z7 = false;
                }
                if (z7) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    AbstractC1555j.m3877c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i5 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C1427a0 c1427a1 = new C1427a0(assets, executor, interfaceC1548c, name, file2);
            byte[] bArr5 = (byte[]) c1427a1.f6311d;
            if (bArr5 == null) {
                c1427a1.m3568b(3, Integer.valueOf(i5));
            } else {
                try {
                    try {
                        try {
                            if (file2.exists()) {
                                if (!file2.canWrite()) {
                                    c1427a1.m3568b(4, null);
                                }
                                if (z5 || !z3) {
                                    z6 = false;
                                } else {
                                    z6 = true;
                                }
                                AbstractC1555j.m3877c(context, z6);
                            }
                            try {
                                file2.createNewFile();
                            } catch (IOException unused2) {
                                c1427a1.m3568b(4, null);
                                z5 = false;
                            }
                            fileInputStreamM3567a = c1427a1.m3567a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e3) {
                            interfaceC1548c.mo3623k(6, e3);
                            fileInputStreamM3567a = null;
                        } catch (IOException e4) {
                            interfaceC1548c.mo3623k(7, e4);
                            fileInputStreamM3567a = null;
                        }
                        if (fileInputStreamM3567a != null) {
                            try {
                                try {
                                    if (!Arrays.equals(bArr, m3854f(fileInputStreamM3567a, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    c1546aArrM3860l = m3860l(fileInputStreamM3567a, m3854f(fileInputStreamM3567a, 4), (String) c1427a1.f6313f);
                                    try {
                                        fileInputStreamM3567a.close();
                                    } catch (IOException e5) {
                                        interfaceC1548c.mo3623k(7, e5);
                                    }
                                    c1427a1.f6314g = c1546aArrM3860l;
                                } catch (IllegalStateException e6) {
                                    interfaceC1548c.mo3623k(8, e6);
                                    fileInputStreamM3567a.close();
                                    c1546aArrM3860l = null;
                                }
                            } catch (IOException e7) {
                                interfaceC1548c.mo3623k(7, e7);
                                fileInputStreamM3567a.close();
                                c1546aArrM3860l = null;
                            }
                        }
                    } catch (IOException e8) {
                        interfaceC1548c.mo3623k(7, e8);
                    }
                    C1546a[] c1546aArr2 = (C1546a[]) c1427a1.f6314g;
                    if (c1546aArr2 != null && (i4 = Build.VERSION.SDK_INT) >= 24 && i4 <= 34) {
                        if (i4 == 24 || i4 == 25) {
                            try {
                                fileInputStreamM3567a2 = c1427a1.m3567a(assets, "dexopt/baseline.profm");
                                if (fileInputStreamM3567a2 == null) {
                                    try {
                                        if (Arrays.equals(f7046c, m3854f(fileInputStreamM3567a2, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        c1427a1.f6314g = m3857i(fileInputStreamM3567a2, m3854f(fileInputStreamM3567a2, 4), bArr5, c1546aArr2);
                                        fileInputStreamM3567a2.close();
                                        c1427a0 = c1427a1;
                                    } catch (Throwable th4) {
                                        try {
                                            fileInputStreamM3567a2.close();
                                            throw th4;
                                        } catch (Throwable th5) {
                                            th4.addSuppressed(th5);
                                            throw th4;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamM3567a2 != null) {
                                        fileInputStreamM3567a2.close();
                                    }
                                    c1427a0 = null;
                                }
                            } catch (FileNotFoundException e9) {
                                interfaceC1548c.mo3623k(9, e9);
                            } catch (IOException e10) {
                                interfaceC1548c.mo3623k(7, e10);
                            } catch (IllegalStateException e11) {
                                c1427a1.f6314g = null;
                                interfaceC1548c.mo3623k(8, e11);
                            }
                            if (c1427a0 != null) {
                                c1427a1 = c1427a0;
                            }
                        } else {
                            switch (i4) {
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                    fileInputStreamM3567a2 = c1427a1.m3567a(assets, "dexopt/baseline.profm");
                                    if (fileInputStreamM3567a2 == null) {
                                        if (fileInputStreamM3567a2 != null) {
                                            fileInputStreamM3567a2.close();
                                        }
                                        c1427a0 = null;
                                    } else {
                                        if (Arrays.equals(f7046c, m3854f(fileInputStreamM3567a2, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        c1427a1.f6314g = m3857i(fileInputStreamM3567a2, m3854f(fileInputStreamM3567a2, 4), bArr5, c1546aArr2);
                                        fileInputStreamM3567a2.close();
                                        c1427a0 = c1427a1;
                                    }
                                    if (c1427a0 != null) {
                                        c1427a1 = c1427a0;
                                        break;
                                    }
                                default:
                                    interfaceC1548c2 = (InterfaceC1548c) c1427a1.f6310c;
                                    c1546aArr = (C1546a[]) c1427a1.f6314g;
                                    if (c1546aArr != null && (bArr4 = (byte[]) c1427a1.f6311d) != null) {
                                        if (c1427a1.f6308a) {
                                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                        }
                                        try {
                                            byteArrayOutputStream = new ByteArrayOutputStream();
                                            try {
                                                byteArrayOutputStream.write(bArr);
                                                byteArrayOutputStream.write(bArr4);
                                                if (m3863o(byteArrayOutputStream, bArr4, c1546aArr)) {
                                                    c1427a1.f6315h = byteArrayOutputStream.toByteArray();
                                                    byteArrayOutputStream.close();
                                                    c1427a1.f6314g = null;
                                                } else {
                                                    interfaceC1548c2.mo3623k(5, null);
                                                    c1427a1.f6314g = null;
                                                    byteArrayOutputStream.close();
                                                }
                                            } catch (Throwable th6) {
                                                try {
                                                    byteArrayOutputStream.close();
                                                    throw th6;
                                                } catch (Throwable th7) {
                                                    th6.addSuppressed(th7);
                                                    throw th6;
                                                }
                                            }
                                        } catch (IOException e12) {
                                            interfaceC1548c2.mo3623k(7, e12);
                                        } catch (IllegalStateException e13) {
                                            interfaceC1548c2.mo3623k(8, e13);
                                        }
                                    }
                                    bArr2 = (byte[]) c1427a1.f6315h;
                                    if (bArr2 != null) {
                                        z4 = false;
                                    } else {
                                        try {
                                            if (c1427a1.f6308a) {
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            try {
                                                try {
                                                    byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                                    try {
                                                        fileOutputStream = new FileOutputStream((File) c1427a1.f6312e);
                                                        try {
                                                            try {
                                                                bArr3 = new byte[512];
                                                                while (true) {
                                                                    i3 = byteArrayInputStream.read(bArr3);
                                                                    if (i3 > 0) {
                                                                        fileOutputStream.write(bArr3, 0, i3);
                                                                    } else {
                                                                        try {
                                                                            c1427a1.m3568b(1, null);
                                                                            fileOutputStream.close();
                                                                            byteArrayInputStream.close();
                                                                            c1427a1.f6315h = null;
                                                                            c1427a1.f6314g = null;
                                                                            z4 = true;
                                                                        } catch (Throwable th8) {
                                                                            th = th8;
                                                                        }
                                                                    }
                                                                    th = th;
                                                                    try {
                                                                        fileOutputStream.close();
                                                                        throw th;
                                                                    } catch (Throwable th9) {
                                                                        th.addSuppressed(th9);
                                                                        throw th;
                                                                    }
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                            }
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                            Throwable th12 = th;
                                                            try {
                                                                byteArrayInputStream.close();
                                                                throw th12;
                                                            } catch (Throwable th13) {
                                                                th12.addSuppressed(th13);
                                                                throw th12;
                                                            }
                                                        }
                                                    } catch (Throwable th14) {
                                                        th = th14;
                                                    }
                                                } catch (FileNotFoundException e14) {
                                                    e = e14;
                                                    c1427a1.m3568b(6, e);
                                                    c1427a1.f6315h = null;
                                                    c1427a1.f6314g = null;
                                                    z4 = false;
                                                } catch (IOException e15) {
                                                    e = e15;
                                                    c1427a1.m3568b(7, e);
                                                    c1427a1.f6315h = null;
                                                    c1427a1.f6314g = null;
                                                    z4 = false;
                                                }
                                            } catch (FileNotFoundException e16) {
                                                e = e16;
                                                c1427a1.m3568b(6, e);
                                                c1427a1.f6315h = null;
                                                c1427a1.f6314g = null;
                                                z4 = false;
                                            } catch (IOException e17) {
                                                e = e17;
                                                c1427a1.m3568b(7, e);
                                                c1427a1.f6315h = null;
                                                c1427a1.f6314g = null;
                                                z4 = false;
                                            }
                                        } catch (Throwable th15) {
                                            c1427a1.f6315h = null;
                                            c1427a1.f6314g = null;
                                            throw th15;
                                        }
                                    }
                                    if (z4) {
                                        m3853e(packageInfo, filesDir);
                                    }
                                    z5 = z4;
                                    if (z5) {
                                        z6 = false;
                                    } else {
                                        z6 = false;
                                    }
                                    AbstractC1555j.m3877c(context, z6);
                            }
                        }
                    }
                    interfaceC1548c2 = (InterfaceC1548c) c1427a1.f6310c;
                    c1546aArr = (C1546a[]) c1427a1.f6314g;
                    if (c1546aArr != null) {
                        if (c1427a1.f6308a) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        byteArrayOutputStream.write(bArr);
                        byteArrayOutputStream.write(bArr4);
                        if (m3863o(byteArrayOutputStream, bArr4, c1546aArr)) {
                            interfaceC1548c2.mo3623k(5, null);
                            c1427a1.f6314g = null;
                            byteArrayOutputStream.close();
                        } else {
                            c1427a1.f6315h = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            c1427a1.f6314g = null;
                        }
                    }
                    bArr2 = (byte[]) c1427a1.f6315h;
                    if (bArr2 != null) {
                        if (c1427a1.f6308a) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                        fileOutputStream = new FileOutputStream((File) c1427a1.f6312e);
                        bArr3 = new byte[512];
                        while (true) {
                            i3 = byteArrayInputStream.read(bArr3);
                            if (i3 > 0) {
                                fileOutputStream.write(bArr3, 0, i3);
                            } else {
                                c1427a1.m3568b(1, null);
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                c1427a1.f6315h = null;
                                c1427a1.f6314g = null;
                                z4 = true;
                            }
                            th = th;
                            fileOutputStream.close();
                            throw th;
                        }
                    }
                    z4 = false;
                    if (z4) {
                        m3853e(packageInfo, filesDir);
                    }
                    z5 = z4;
                    if (z5) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    AbstractC1555j.m3877c(context, z6);
                } catch (Throwable th16) {
                    try {
                        fileInputStreamM3567a.close();
                        throw th16;
                    } catch (IOException e18) {
                        interfaceC1548c.mo3623k(7, e18);
                        throw th16;
                    }
                }
                c1427a1.f6308a = true;
                bArr = f7045b;
            }
            z5 = false;
            if (z5) {
                z6 = false;
            } else {
                z6 = false;
            }
            AbstractC1555j.m3877c(context, z6);
        } catch (PackageManager.NameNotFoundException e19) {
            interfaceC1548c.mo3623k(7, e19);
            AbstractC1555j.m3877c(context, false);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m3868t(ByteArrayOutputStream byteArrayOutputStream, long j3, int i3) throws IOException {
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = (byte) ((j3 >> (i4 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: u */
    public static void m3869u(ByteArrayOutputStream byteArrayOutputStream, int i3) throws IOException {
        m3868t(byteArrayOutputStream, i3, 2);
    }
}
