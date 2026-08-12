package p029K;

import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: K.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0323c {

    /* JADX INFO: renamed from: a */
    public final int f889a;

    /* JADX INFO: renamed from: b */
    public final int f890b;

    /* JADX INFO: renamed from: c */
    public final long f891c;

    /* JADX INFO: renamed from: d */
    public final byte[] f892d;

    public C0323c(byte[] bArr, int i3, int i4) {
        this(-1L, bArr, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public static C0323c m874a(long j3, ByteOrder byteOrder) {
        long[] jArr = {j3};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0327g.f901C[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C0323c(byteBufferWrap.array(), 4, 1);
    }

    /* JADX INFO: renamed from: b */
    public static C0323c m875b(C0325e c0325e, ByteOrder byteOrder) {
        C0325e[] c0325eArr = {c0325e};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0327g.f901C[5]]);
        byteBufferWrap.order(byteOrder);
        C0325e c0325e2 = c0325eArr[0];
        byteBufferWrap.putInt((int) c0325e2.f897a);
        byteBufferWrap.putInt((int) c0325e2.f898b);
        return new C0323c(byteBufferWrap.array(), 5, 1);
    }

    /* JADX INFO: renamed from: c */
    public static C0323c m876c(int i3, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0327g.f901C[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i3}[0]);
        return new C0323c(byteBufferWrap.array(), 3, 1);
    }

    /* JADX INFO: renamed from: d */
    public final double m877d(ByteOrder byteOrder) throws Throwable {
        Object objM880g = m880g(byteOrder);
        if (objM880g == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objM880g instanceof String) {
            return Double.parseDouble((String) objM880g);
        }
        if (objM880g instanceof long[]) {
            long[] jArr = (long[]) objM880g;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM880g instanceof int[]) {
            int[] iArr = (int[]) objM880g;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objM880g instanceof double[]) {
            double[] dArr = (double[]) objM880g;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM880g instanceof C0325e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C0325e[] c0325eArr = (C0325e[]) objM880g;
        if (c0325eArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C0325e c0325e = c0325eArr[0];
        return c0325e.f897a / c0325e.f898b;
    }

    /* JADX INFO: renamed from: e */
    public final int m878e(ByteOrder byteOrder) {
        Object objM880g = m880g(byteOrder);
        if (objM880g == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objM880g instanceof String) {
            return Integer.parseInt((String) objM880g);
        }
        if (objM880g instanceof long[]) {
            long[] jArr = (long[]) objM880g;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objM880g instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objM880g;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    /* JADX INFO: renamed from: f */
    public final String m879f(ByteOrder byteOrder) throws Throwable {
        Object objM880g = m880g(byteOrder);
        if (objM880g == null) {
            return null;
        }
        if (objM880g instanceof String) {
            return (String) objM880g;
        }
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        if (objM880g instanceof long[]) {
            long[] jArr = (long[]) objM880g;
            while (i3 < jArr.length) {
                sb.append(jArr[i3]);
                i3++;
                if (i3 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM880g instanceof int[]) {
            int[] iArr = (int[]) objM880g;
            while (i3 < iArr.length) {
                sb.append(iArr[i3]);
                i3++;
                if (i3 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objM880g instanceof double[]) {
            double[] dArr = (double[]) objM880g;
            while (i3 < dArr.length) {
                sb.append(dArr[i3]);
                i3++;
                if (i3 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objM880g instanceof C0325e[])) {
            return null;
        }
        C0325e[] c0325eArr = (C0325e[]) objM880g;
        while (i3 < c0325eArr.length) {
            sb.append(c0325eArr[i3].f897a);
            sb.append('/');
            sb.append(c0325eArr[i3].f898b);
            i3++;
            if (i3 != c0325eArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:153:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0033: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:52), block:B:16:0x0033 */
    /* JADX WARN: Type inference failed for: r15v22, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r15v24, types: [K.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v25, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [K.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /* JADX INFO: renamed from: g */
    public final Serializable m880g(ByteOrder byteOrder) throws Throwable {
        C0322b c0322b;
        InputStream inputStream;
        byte b3;
        String string;
        int length = 0;
        byte[] bArr = this.f892d;
        InputStream inputStream2 = null;
        try {
            try {
                try {
                    c0322b = new C0322b(bArr);
                    try {
                        c0322b.f886h = byteOrder;
                        int i3 = this.f889a;
                        int i4 = this.f890b;
                        switch (i3) {
                            case 1:
                            case 6:
                                if (bArr.length != 1 || (b3 = bArr[0]) < 0 || b3 > 1) {
                                    String str = new String(bArr, C0327g.f910L);
                                    try {
                                        c0322b.close();
                                        return str;
                                    } catch (IOException e3) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                        return str;
                                    }
                                }
                                String str2 = new String(new char[]{(char) (b3 + 48)});
                                try {
                                    c0322b.close();
                                    return str2;
                                } catch (IOException e4) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                    return str2;
                                }
                            case 2:
                            case 7:
                                if (i4 >= C0327g.f902D.length) {
                                    int i5 = 0;
                                    while (true) {
                                        byte[] bArr2 = C0327g.f902D;
                                        if (i5 >= bArr2.length) {
                                            length = bArr2.length;
                                        } else if (bArr[i5] == bArr2[i5]) {
                                            i5++;
                                        }
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                try {
                                    while (length < i4) {
                                        byte b4 = bArr[length];
                                        if (b4 == 0) {
                                            string = sb.toString();
                                            c0322b.close();
                                            return string;
                                        }
                                        if (b4 >= 32) {
                                            sb.append((char) b4);
                                        } else {
                                            sb.append('?');
                                        }
                                        length++;
                                    }
                                    c0322b.close();
                                    return string;
                                } catch (IOException e5) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                                    return string;
                                }
                                string = sb.toString();
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                ?? r15 = new int[i4];
                                while (length < i4) {
                                    r15[length] = c0322b.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    c0322b.close();
                                    return r15;
                                } catch (IOException e6) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                                    return r15;
                                }
                            case 4:
                                ?? r16 = new long[i4];
                                while (length < i4) {
                                    r16[length] = ((long) c0322b.readInt()) & 4294967295L;
                                    length++;
                                }
                                try {
                                    c0322b.close();
                                    return r16;
                                } catch (IOException e7) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                                    return r16;
                                }
                            case 5:
                                ?? r17 = new C0325e[i4];
                                while (length < i4) {
                                    r17[length] = new C0325e(((long) c0322b.readInt()) & 4294967295L, ((long) c0322b.readInt()) & 4294967295L);
                                    length++;
                                }
                                try {
                                    c0322b.close();
                                    return r17;
                                } catch (IOException e8) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                                    return r17;
                                }
                            case 8:
                                ?? r18 = new int[i4];
                                while (length < i4) {
                                    r18[length] = c0322b.readShort();
                                    length++;
                                }
                                try {
                                    c0322b.close();
                                    return r18;
                                } catch (IOException e9) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                                    return r18;
                                }
                            case 9:
                                ?? r19 = new int[i4];
                                while (length < i4) {
                                    r19[length] = c0322b.readInt();
                                    length++;
                                }
                                try {
                                    c0322b.close();
                                    return r19;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                    return r19;
                                }
                            case 10:
                                ?? r110 = new C0325e[i4];
                                while (length < i4) {
                                    r110[length] = new C0325e(c0322b.readInt(), c0322b.readInt());
                                    length++;
                                }
                                try {
                                    c0322b.close();
                                    return r110;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                    return r110;
                                }
                            case 11:
                                ?? r111 = new double[i4];
                                while (length < i4) {
                                    r111[length] = c0322b.readFloat();
                                    length++;
                                }
                                try {
                                    c0322b.close();
                                    return r111;
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                    return r111;
                                }
                            case 12:
                                ?? r112 = new double[i4];
                                while (length < i4) {
                                    r112[length] = c0322b.readDouble();
                                    length++;
                                }
                                try {
                                    c0322b.close();
                                    return r112;
                                } catch (IOException e13) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                    return r112;
                                }
                            default:
                                c0322b.close();
                                return null;
                        }
                    } catch (IOException e14) {
                        e = e14;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (c0322b != null) {
                            c0322b.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e15) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                        }
                    }
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                c0322b = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        } catch (IOException e17) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
        }
    }

    public final String toString() {
        return "(" + C0327g.f900B[this.f889a] + ", data length:" + this.f892d.length + ")";
    }

    public C0323c(long j3, byte[] bArr, int i3, int i4) {
        this.f889a = i3;
        this.f890b = i4;
        this.f891c = j3;
        this.f892d = bArr;
    }
}
