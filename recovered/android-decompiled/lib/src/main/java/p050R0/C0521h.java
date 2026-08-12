package p050R0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import p036M0.C0369f;
import p045P0.AbstractC0462h;
import p045P0.C0455a;
import p045P0.C0464j;
import p045P0.InterfaceC0458d;
import p045P0.InterfaceC0465k;
import p048Q0.C0508g;
import p061V.C0614b;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p064W.InterfaceC0636d;
import p105h2.AbstractC1676G;
import p105h2.C1674E;
import p105h2.C1692X;

/* JADX INFO: renamed from: R0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0521h implements InterfaceC0465k {

    /* JADX INFO: renamed from: n */
    public static final byte[] f1790n = {0, 7, 8, 15};

    /* JADX INFO: renamed from: o */
    public static final byte[] f1791o = {0, 119, -120, -1};

    /* JADX INFO: renamed from: p */
    public static final byte[] f1792p = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: g */
    public final Paint f1793g;

    /* JADX INFO: renamed from: h */
    public final Paint f1794h;

    /* JADX INFO: renamed from: i */
    public final Canvas f1795i;

    /* JADX INFO: renamed from: j */
    public final C0515b f1796j;

    /* JADX INFO: renamed from: k */
    public final C0514a f1797k;

    /* JADX INFO: renamed from: l */
    public final C0520g f1798l;

    /* JADX INFO: renamed from: m */
    public Bitmap f1799m;

    public C0521h(List list) {
        C0651s c0651s = new C0651s((byte[]) list.get(0));
        int iM1659A = c0651s.m1659A();
        int iM1659A2 = c0651s.m1659A();
        Paint paint = new Paint();
        this.f1793g = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f1794h = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f1795i = new Canvas();
        this.f1796j = new C0515b(719, 575, 0, 719, 0, 575);
        this.f1797k = new C0514a(0, new int[]{0, -1, -16777216, -8421505}, m1272c(), m1273d());
        this.f1798l = new C0520g(iM1659A, iM1659A2);
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m1271a(int i3, int i4, C0508g c0508g) {
        byte[] bArr = new byte[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            bArr[i5] = (byte) c0508g.m1252i(i4);
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public static int[] m1272c() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i3 = 1; i3 < 16; i3++) {
            if (i3 < 8) {
                iArr[i3] = m1274e(255, (i3 & 1) != 0 ? 255 : 0, (i3 & 2) != 0 ? 255 : 0, (i3 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i3] = m1274e(255, (i3 & 1) != 0 ? 127 : 0, (i3 & 2) != 0 ? 127 : 0, (i3 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: d */
    public static int[] m1273d() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            if (i3 < 8) {
                iArr[i3] = m1274e(63, (i3 & 1) != 0 ? 255 : 0, (i3 & 2) != 0 ? 255 : 0, (i3 & 4) == 0 ? 0 : 255);
            } else {
                int i4 = i3 & 136;
                if (i4 == 0) {
                    iArr[i3] = m1274e(255, ((i3 & 1) != 0 ? 85 : 0) + ((i3 & 16) != 0 ? 170 : 0), ((i3 & 2) != 0 ? 85 : 0) + ((i3 & 32) != 0 ? 170 : 0), ((i3 & 4) == 0 ? 0 : 85) + ((i3 & 64) == 0 ? 0 : 170));
                } else if (i4 == 8) {
                    iArr[i3] = m1274e(127, ((i3 & 1) != 0 ? 85 : 0) + ((i3 & 16) != 0 ? 170 : 0), ((i3 & 2) != 0 ? 85 : 0) + ((i3 & 32) != 0 ? 170 : 0), ((i3 & 4) == 0 ? 0 : 85) + ((i3 & 64) == 0 ? 0 : 170));
                } else if (i4 == 128) {
                    iArr[i3] = m1274e(255, ((i3 & 1) != 0 ? 43 : 0) + 127 + ((i3 & 16) != 0 ? 85 : 0), ((i3 & 2) != 0 ? 43 : 0) + 127 + ((i3 & 32) != 0 ? 85 : 0), ((i3 & 4) == 0 ? 0 : 43) + 127 + ((i3 & 64) == 0 ? 0 : 85));
                } else if (i4 == 136) {
                    iArr[i3] = m1274e(255, ((i3 & 1) != 0 ? 43 : 0) + ((i3 & 16) != 0 ? 85 : 0), ((i3 & 2) != 0 ? 43 : 0) + ((i3 & 32) != 0 ? 85 : 0), ((i3 & 4) == 0 ? 0 : 43) + ((i3 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: e */
    public static int m1274e(int i3, int i4, int i5, int i6) {
        return (i3 << 24) | (i4 << 16) | (i5 << 8) | i6;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x0194 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0196  */
    /* JADX WARN: Code duplicated, block: B:104:0x019d  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:117:0x01f0 A[LOOP:3: B:86:0x015d->B:117:0x01f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0133  */
    /* JADX WARN: Code duplicated, block: B:73:0x013f A[LOOP:2: B:39:0x00a6->B:73:0x013f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0163  */
    /* JADX WARN: Code duplicated, block: B:90:0x016a  */
    /* JADX WARN: Code duplicated, block: B:92:0x0170  */
    /* JADX WARN: Code duplicated, block: B:94:0x017f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0185  */
    /* JADX WARN: Code duplicated, block: B:97:0x018a  */
    /* JADX WARN: Code duplicated, block: B:99:0x0190 A[DONT_INVERT] */
    /* JADX INFO: renamed from: f */
    public static void m1275f(byte[] bArr, int[] iArr, int i3, int i4, int i5, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        boolean z3;
        int iM1252i;
        int iM1252i2;
        int iM1252i3;
        int iM1252i4;
        int iM1252i5;
        int i6;
        int iM1252i6;
        int iM1252i7;
        boolean z4;
        int iM1252i8;
        C0508g c0508g = new C0508g(bArr, bArr.length);
        int i7 = i4;
        int i8 = i5;
        byte[] bArrM1271a = null;
        byte[] bArrM1271a2 = null;
        byte[] bArrM1271a3 = null;
        while (c0508g.m1245b() != 0) {
            int iM1252i9 = c0508g.m1252i(8);
            if (iM1252i9 != 240) {
                int i9 = 3;
                int i10 = 4;
                switch (iM1252i9) {
                    case 16:
                        if (i3 == 3) {
                            bArr3 = bArrM1271a == null ? f1791o : bArrM1271a;
                        } else {
                            if (i3 == 2) {
                                bArr3 = bArrM1271a3 == null ? f1790n : bArrM1271a3;
                            } else {
                                bArr2 = null;
                            }
                            z3 = false;
                            while (true) {
                                iM1252i = c0508g.m1252i(2);
                                if (iM1252i != 0) {
                                    iM1252i3 = iM1252i;
                                } else {
                                    if (c0508g.m1251h()) {
                                        iM1252i5 = c0508g.m1252i(3) + 3;
                                        iM1252i3 = c0508g.m1252i(2);
                                    } else {
                                        if (c0508g.m1251h()) {
                                            iM1252i3 = 0;
                                        } else {
                                            iM1252i2 = c0508g.m1252i(2);
                                            if (iM1252i2 != 0) {
                                                iM1252i3 = 0;
                                                z3 = true;
                                            } else if (iM1252i2 != 1) {
                                                z3 = z3;
                                                iM1252i3 = 0;
                                                iM1252i4 = 2;
                                            } else if (iM1252i2 != 2) {
                                                z3 = z3;
                                                iM1252i4 = c0508g.m1252i(4) + 12;
                                                iM1252i3 = c0508g.m1252i(2);
                                            } else if (iM1252i2 != 3) {
                                                z3 = z3;
                                                iM1252i3 = 0;
                                            } else {
                                                iM1252i5 = c0508g.m1252i(8) + 29;
                                                iM1252i3 = c0508g.m1252i(2);
                                            }
                                            iM1252i4 = 0;
                                        }
                                        if (iM1252i4 == 0 && paint != null) {
                                            if (bArr2 != 0) {
                                                iM1252i3 = bArr2[iM1252i3];
                                            }
                                            paint.setColor(iArr[iM1252i3]);
                                            canvas.drawRect(i7, i8, i7 + iM1252i4, i8 + 1, paint);
                                        }
                                        i7 += iM1252i4;
                                        if (z3) {
                                            c0508g.m1246c();
                                        } else {
                                            paint = paint;
                                            z3 = z3;
                                        }
                                    }
                                    z3 = z3;
                                    iM1252i4 = iM1252i5;
                                    if (iM1252i4 == 0) {
                                    }
                                    i7 += iM1252i4;
                                    if (z3) {
                                        c0508g.m1246c();
                                    } else {
                                        paint = paint;
                                        z3 = z3;
                                    }
                                }
                                iM1252i4 = 1;
                                if (iM1252i4 == 0) {
                                }
                                i7 += iM1252i4;
                                if (z3) {
                                    c0508g.m1246c();
                                } else {
                                    paint = paint;
                                    z3 = z3;
                                }
                            }
                        }
                        bArr2 = bArr3;
                        z3 = false;
                        while (true) {
                            iM1252i = c0508g.m1252i(2);
                            if (iM1252i != 0) {
                                iM1252i3 = iM1252i;
                            } else {
                                if (c0508g.m1251h()) {
                                    iM1252i5 = c0508g.m1252i(3) + 3;
                                    iM1252i3 = c0508g.m1252i(2);
                                } else {
                                    if (c0508g.m1251h()) {
                                        iM1252i3 = 0;
                                    } else {
                                        iM1252i2 = c0508g.m1252i(2);
                                        if (iM1252i2 != 0) {
                                            iM1252i3 = 0;
                                            z3 = true;
                                        } else if (iM1252i2 != 1) {
                                            z3 = z3;
                                            iM1252i3 = 0;
                                            iM1252i4 = 2;
                                        } else if (iM1252i2 != 2) {
                                            z3 = z3;
                                            iM1252i4 = c0508g.m1252i(4) + 12;
                                            iM1252i3 = c0508g.m1252i(2);
                                        } else if (iM1252i2 != 3) {
                                            z3 = z3;
                                            iM1252i3 = 0;
                                        } else {
                                            iM1252i5 = c0508g.m1252i(8) + 29;
                                            iM1252i3 = c0508g.m1252i(2);
                                        }
                                        iM1252i4 = 0;
                                    }
                                    if (iM1252i4 == 0) {
                                    }
                                    i7 += iM1252i4;
                                    if (z3) {
                                        c0508g.m1246c();
                                    } else {
                                        paint = paint;
                                        z3 = z3;
                                    }
                                }
                                z3 = z3;
                                iM1252i4 = iM1252i5;
                                if (iM1252i4 == 0) {
                                }
                                i7 += iM1252i4;
                                if (z3) {
                                    c0508g.m1246c();
                                } else {
                                    paint = paint;
                                    z3 = z3;
                                }
                            }
                            iM1252i4 = 1;
                            if (iM1252i4 == 0) {
                            }
                            i7 += iM1252i4;
                            if (z3) {
                                c0508g.m1246c();
                            } else {
                                paint = paint;
                                z3 = z3;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i3 == 3 ? bArrM1271a2 == null ? f1792p : bArrM1271a2 : null;
                        boolean z5 = false;
                        while (true) {
                            int iM1252i10 = c0508g.m1252i(i10);
                            if (iM1252i10 == 0) {
                                if (c0508g.m1251h()) {
                                    if (c0508g.m1251h()) {
                                        int iM1252i11 = c0508g.m1252i(2);
                                        if (iM1252i11 == 0) {
                                            iM1252i10 = 0;
                                        } else if (iM1252i11 == 1) {
                                            z5 = z5;
                                            iM1252i10 = 0;
                                            i6 = 2;
                                        } else if (iM1252i11 == 2) {
                                            iM1252i6 = c0508g.m1252i(i10) + 9;
                                            iM1252i7 = c0508g.m1252i(i10);
                                        } else if (iM1252i11 != i9) {
                                            z5 = z5;
                                            iM1252i10 = 0;
                                            i6 = 0;
                                        } else {
                                            iM1252i6 = c0508g.m1252i(8) + 25;
                                            iM1252i7 = c0508g.m1252i(i10);
                                        }
                                    } else {
                                        iM1252i6 = c0508g.m1252i(2) + i10;
                                        iM1252i7 = c0508g.m1252i(i10);
                                    }
                                    i6 = iM1252i6;
                                    iM1252i10 = iM1252i7;
                                    z5 = z5;
                                } else {
                                    int iM1252i12 = c0508g.m1252i(i9);
                                    if (iM1252i12 != 0) {
                                        z5 = z5;
                                        i6 = iM1252i12 + 2;
                                        iM1252i10 = 0;
                                    } else {
                                        iM1252i10 = 0;
                                        z5 = true;
                                        i6 = 0;
                                    }
                                }
                                if (i6 == 0 && paint != 0) {
                                    if (bArr4 != 0) {
                                        iM1252i10 = bArr4[iM1252i10];
                                    }
                                    paint.setColor(iArr[iM1252i10]);
                                    canvas.drawRect(i7, i8, i7 + i6, i8 + 1, paint);
                                }
                                i7 += i6;
                                if (z5) {
                                    c0508g.m1246c();
                                } else {
                                    z5 = z5;
                                    i9 = 3;
                                    i10 = 4;
                                }
                                break;
                            }
                            i6 = 1;
                            if (i6 == 0) {
                            }
                            i7 += i6;
                            if (z5) {
                                c0508g.m1246c();
                            } else {
                                z5 = z5;
                                i9 = 3;
                                i10 = 4;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i11 = i7;
                        boolean z6 = false;
                        while (true) {
                            int iM1252i13 = c0508g.m1252i(8);
                            if (iM1252i13 != 0) {
                                z4 = z6;
                                iM1252i8 = 1;
                            } else if (c0508g.m1251h()) {
                                z4 = z6;
                                iM1252i8 = c0508g.m1252i(7);
                                iM1252i13 = c0508g.m1252i(8);
                            } else {
                                int iM1252i14 = c0508g.m1252i(7);
                                if (iM1252i14 != 0) {
                                    z4 = z6;
                                    iM1252i8 = iM1252i14;
                                    iM1252i13 = 0;
                                } else {
                                    iM1252i13 = 0;
                                    z4 = true;
                                    iM1252i8 = 0;
                                }
                            }
                            if (iM1252i8 != 0 && paint != 0) {
                                paint.setColor(iArr[iM1252i13]);
                                canvas.drawRect(i11, i8, i11 + iM1252i8, i8 + 1, paint);
                            }
                            i11 += iM1252i8;
                            if (z4) {
                                i7 = i11;
                            } else {
                                z6 = z4;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iM1252i9) {
                            case 32:
                                bArrM1271a3 = m1271a(4, 4, c0508g);
                                break;
                            case 33:
                                bArrM1271a = m1271a(4, 8, c0508g);
                                break;
                            case 34:
                                bArrM1271a2 = m1271a(16, 8, c0508g);
                                break;
                        }
                        break;
                }
            } else {
                i8 += 2;
                i7 = i4;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static C0514a m1276g(C0508g c0508g, int i3) {
        int[] iArr;
        int iM1252i;
        int i4;
        int iM1252i2;
        int iM1252i3;
        int iM1252i4;
        int i5 = 8;
        int iM1252i5 = c0508g.m1252i(8);
        c0508g.m1263t(8);
        int i6 = 2;
        int i7 = i3 - 2;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrM1272c = m1272c();
        int[] iArrM1273d = m1273d();
        while (i7 > 0) {
            int iM1252i6 = c0508g.m1252i(i5);
            int iM1252i7 = c0508g.m1252i(i5);
            if ((iM1252i7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iM1252i7 & 64) != 0 ? iArrM1272c : iArrM1273d;
            }
            if ((iM1252i7 & 1) != 0) {
                iM1252i3 = c0508g.m1252i(i5);
                iM1252i4 = c0508g.m1252i(i5);
                iM1252i = c0508g.m1252i(i5);
                iM1252i2 = c0508g.m1252i(i5);
                i4 = i7 - 6;
            } else {
                int iM1252i8 = c0508g.m1252i(6) << i6;
                int iM1252i9 = c0508g.m1252i(4) << 4;
                iM1252i = c0508g.m1252i(4) << 4;
                i4 = i7 - 4;
                iM1252i2 = c0508g.m1252i(i6) << 6;
                iM1252i3 = iM1252i8;
                iM1252i4 = iM1252i9;
            }
            if (iM1252i3 == 0) {
                iM1252i4 = 0;
                iM1252i = 0;
                iM1252i2 = 255;
            }
            double d3 = iM1252i3;
            double d4 = iM1252i4 - 128;
            double d5 = iM1252i - 128;
            iArr[iM1252i6] = m1274e((byte) (255 - (iM1252i2 & 255)), AbstractC0632A.m1590i((int) ((1.402d * d4) + d3), 0, 255), AbstractC0632A.m1590i((int) ((d3 - (0.34414d * d5)) - (d4 * 0.71414d)), 0, 255), AbstractC0632A.m1590i((int) ((d5 * 1.772d) + d3), 0, 255));
            i7 = i4;
            iM1252i5 = iM1252i5;
            iArrM1273d = iArrM1273d;
            i5 = 8;
            i6 = 2;
        }
        return new C0514a(iM1252i5, iArr2, iArrM1272c, iArrM1273d);
    }

    /* JADX INFO: renamed from: i */
    public static C0516c m1277i(C0508g c0508g) {
        byte[] bArr;
        int iM1252i = c0508g.m1252i(16);
        c0508g.m1263t(4);
        int iM1252i2 = c0508g.m1252i(2);
        boolean zM1251h = c0508g.m1251h();
        c0508g.m1263t(1);
        byte[] bArr2 = AbstractC0632A.f2459f;
        if (iM1252i2 != 1) {
            if (iM1252i2 == 0) {
                int iM1252i3 = c0508g.m1252i(16);
                int iM1252i4 = c0508g.m1252i(16);
                if (iM1252i3 > 0) {
                    bArr2 = new byte[iM1252i3];
                    c0508g.m1255l(bArr2, iM1252i3);
                }
                if (iM1252i4 > 0) {
                    bArr = new byte[iM1252i4];
                    c0508g.m1255l(bArr, iM1252i4);
                }
            }
            return new C0516c(iM1252i, zM1251h, bArr2, bArr);
        }
        c0508g.m1263t(c0508g.m1252i(8) * 16);
        bArr = bArr2;
        return new C0516c(iM1252i, zM1251h, bArr2, bArr);
    }

    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: b */
    public final void mo514b() {
        C0520g c0520g = this.f1798l;
        c0520g.f1783c.clear();
        c0520g.f1784d.clear();
        c0520g.f1785e.clear();
        c0520g.f1786f.clear();
        c0520g.f1787g.clear();
        c0520g.f1788h = null;
        c0520g.f1789i = null;
    }

    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: h */
    public final void mo520h(byte[] bArr, int i3, int i4, C0464j c0464j, InterfaceC0636d interfaceC0636d) {
        C0520g c0520g;
        C0455a c0455a;
        Canvas canvas;
        int i5;
        C0518e c0518e;
        int i6;
        int iM1252i;
        int i7;
        int i8;
        int i9 = 8;
        C0508g c0508g = new C0508g(bArr, i3 + i4);
        c0508g.m1260q(i3);
        while (true) {
            int iM1245b = c0508g.m1245b();
            c0520g = this.f1798l;
            if (iM1245b >= 48 && c0508g.m1252i(i9) == 15) {
                int iM1252i2 = c0508g.m1252i(i9);
                int iM1252i3 = c0508g.m1252i(16);
                int iM1252i4 = c0508g.m1252i(16);
                int iM1249f = c0508g.m1249f() + iM1252i4;
                if (iM1252i4 * 8 > c0508g.m1245b()) {
                    AbstractC0646n.m1647y("DvbParser", "Data field length exceeds limit");
                    c0508g.m1263t(c0508g.m1245b());
                } else {
                    switch (iM1252i2) {
                        case 16:
                            if (iM1252i3 == c0520g.f1781a) {
                                C0369f c0369f = c0520g.f1789i;
                                c0508g.m1252i(i9);
                                int iM1252i5 = c0508g.m1252i(4);
                                int iM1252i6 = c0508g.m1252i(2);
                                c0508g.m1263t(2);
                                int i10 = iM1252i4 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i10 > 0) {
                                    int iM1252i7 = c0508g.m1252i(i9);
                                    c0508g.m1263t(i9);
                                    i10 -= 6;
                                    sparseArray.put(iM1252i7, new C0517d(c0508g.m1252i(16), c0508g.m1252i(16)));
                                    i9 = 8;
                                }
                                C0369f c0369f2 = new C0369f(iM1252i5, iM1252i6, sparseArray);
                                if (iM1252i6 != 0) {
                                    c0520g.f1789i = c0369f2;
                                    c0520g.f1783c.clear();
                                    c0520g.f1784d.clear();
                                    c0520g.f1785e.clear();
                                } else if (c0369f != null && c0369f.f1182a != iM1252i5) {
                                    c0520g.f1789i = c0369f2;
                                }
                            }
                            break;
                        case 17:
                            C0369f c0369f3 = c0520g.f1789i;
                            if (iM1252i3 == c0520g.f1781a && c0369f3 != null) {
                                int iM1252i8 = c0508g.m1252i(i9);
                                c0508g.m1263t(4);
                                boolean zM1251h = c0508g.m1251h();
                                c0508g.m1263t(3);
                                int iM1252i9 = c0508g.m1252i(16);
                                int iM1252i10 = c0508g.m1252i(16);
                                c0508g.m1252i(3);
                                int iM1252i11 = c0508g.m1252i(3);
                                c0508g.m1263t(2);
                                int iM1252i12 = c0508g.m1252i(i9);
                                int iM1252i13 = c0508g.m1252i(i9);
                                int iM1252i14 = c0508g.m1252i(4);
                                int iM1252i15 = c0508g.m1252i(2);
                                c0508g.m1263t(2);
                                int i11 = iM1252i4 - 10;
                                SparseArray sparseArray2 = new SparseArray();
                                while (i11 > 0) {
                                    int iM1252i16 = c0508g.m1252i(16);
                                    int iM1252i17 = c0508g.m1252i(2);
                                    c0508g.m1252i(2);
                                    int iM1252i18 = c0508g.m1252i(12);
                                    c0508g.m1263t(4);
                                    int iM1252i19 = c0508g.m1252i(12);
                                    int i12 = i11 - 6;
                                    if (iM1252i17 == 1 || iM1252i17 == 2) {
                                        c0508g.m1252i(i9);
                                        c0508g.m1252i(i9);
                                        i11 -= 8;
                                    } else {
                                        i11 = i12;
                                    }
                                    sparseArray2.put(iM1252i16, new C0519f(iM1252i18, iM1252i19));
                                }
                                C0518e c0518e2 = new C0518e(iM1252i8, zM1251h, iM1252i9, iM1252i10, iM1252i11, iM1252i12, iM1252i13, iM1252i14, iM1252i15, sparseArray2);
                                SparseArray sparseArray3 = c0520g.f1783c;
                                if (c0369f3.f1183b == 0 && (c0518e = (C0518e) sparseArray3.get(iM1252i8)) != null) {
                                    int i13 = 0;
                                    while (true) {
                                        SparseArray sparseArray4 = c0518e.f1778j;
                                        if (i13 < sparseArray4.size()) {
                                            c0518e2.f1778j.put(sparseArray4.keyAt(i13), (C0519f) sparseArray4.valueAt(i13));
                                            i13++;
                                        }
                                    }
                                }
                                sparseArray3.put(c0518e2.f1769a, c0518e2);
                            }
                            break;
                        case 18:
                            if (iM1252i3 == c0520g.f1781a) {
                                C0514a c0514aM1276g = m1276g(c0508g, iM1252i4);
                                c0520g.f1784d.put(c0514aM1276g.f1753a, c0514aM1276g);
                            } else if (iM1252i3 == c0520g.f1782b) {
                                C0514a c0514aM1276g2 = m1276g(c0508g, iM1252i4);
                                c0520g.f1786f.put(c0514aM1276g2.f1753a, c0514aM1276g2);
                            }
                            break;
                        case 19:
                            if (iM1252i3 == c0520g.f1781a) {
                                C0516c c0516cM1277i = m1277i(c0508g);
                                c0520g.f1785e.put(c0516cM1277i.f1763a, c0516cM1277i);
                            } else if (iM1252i3 == c0520g.f1782b) {
                                C0516c c0516cM1277i2 = m1277i(c0508g);
                                c0520g.f1787g.put(c0516cM1277i2.f1763a, c0516cM1277i2);
                            }
                            break;
                        case 20:
                            if (iM1252i3 == c0520g.f1781a) {
                                c0508g.m1263t(4);
                                boolean zM1251h2 = c0508g.m1251h();
                                c0508g.m1263t(3);
                                int iM1252i20 = c0508g.m1252i(16);
                                int iM1252i21 = c0508g.m1252i(16);
                                if (zM1251h2) {
                                    int iM1252i22 = c0508g.m1252i(16);
                                    int iM1252i23 = c0508g.m1252i(16);
                                    int iM1252i24 = c0508g.m1252i(16);
                                    i6 = iM1252i23;
                                    iM1252i = c0508g.m1252i(16);
                                    i8 = iM1252i24;
                                    i7 = iM1252i22;
                                } else {
                                    i6 = iM1252i20;
                                    iM1252i = iM1252i21;
                                    i7 = 0;
                                    i8 = 0;
                                }
                                c0520g.f1788h = new C0515b(iM1252i20, iM1252i21, i7, i6, i8, iM1252i);
                            }
                            break;
                    }
                    c0508g.m1264u(iM1249f - c0508g.m1249f());
                }
                i9 = 8;
            }
        }
        C0369f c0369f4 = c0520g.f1789i;
        if (c0369f4 == null) {
            C1674E c1674e = AbstractC1676G.f7601h;
            c0455a = new C0455a(C1692X.f7629k, -9223372036854775807L, -9223372036854775807L);
        } else {
            C0515b c0515b = c0520g.f1788h;
            if (c0515b == null) {
                c0515b = this.f1796j;
            }
            Bitmap bitmap = this.f1799m;
            Canvas canvas2 = this.f1795i;
            if (bitmap == null || c0515b.f1757a + 1 != bitmap.getWidth() || c0515b.f1758b + 1 != this.f1799m.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c0515b.f1757a + 1, c0515b.f1758b + 1, Bitmap.Config.ARGB_8888);
                this.f1799m = bitmapCreateBitmap;
                canvas2.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            int i14 = 0;
            while (true) {
                SparseArray sparseArray5 = (SparseArray) c0369f4.f1184c;
                if (i14 < sparseArray5.size()) {
                    canvas2.save();
                    C0517d c0517d = (C0517d) sparseArray5.valueAt(i14);
                    C0518e c0518e3 = (C0518e) c0520g.f1783c.get(sparseArray5.keyAt(i14));
                    int i15 = c0517d.f1767a + c0515b.f1759c;
                    int i16 = c0517d.f1768b + c0515b.f1761e;
                    int iMin = Math.min(c0518e3.f1771c + i15, c0515b.f1760d);
                    int i17 = c0518e3.f1772d;
                    int i18 = i16 + i17;
                    canvas2.clipRect(i15, i16, iMin, Math.min(i18, c0515b.f1762f));
                    SparseArray sparseArray6 = c0520g.f1784d;
                    int i19 = c0518e3.f1774f;
                    C0514a c0514a = (C0514a) sparseArray6.get(i19);
                    if (c0514a == null && (c0514a = (C0514a) c0520g.f1786f.get(i19)) == null) {
                        c0514a = this.f1797k;
                    }
                    int i20 = 0;
                    while (true) {
                        SparseArray sparseArray7 = c0518e3.f1778j;
                        if (i20 < sparseArray7.size()) {
                            int iKeyAt = sparseArray7.keyAt(i20);
                            C0519f c0519f = (C0519f) sparseArray7.valueAt(i20);
                            C0369f c0369f5 = c0369f4;
                            C0516c c0516c = (C0516c) c0520g.f1785e.get(iKeyAt);
                            if (c0516c == null) {
                                c0516c = (C0516c) c0520g.f1787g.get(iKeyAt);
                            }
                            if (c0516c != null) {
                                Paint paint = c0516c.f1764b ? null : this.f1793g;
                                int i21 = c0519f.f1779a + i15;
                                int i22 = c0519f.f1780b + i16;
                                int i23 = i15;
                                int i24 = c0518e3.f1773e;
                                canvas = canvas2;
                                int[] iArr = i24 == 3 ? c0514a.f1756d : i24 == 2 ? c0514a.f1755c : c0514a.f1754b;
                                i5 = i23;
                                Paint paint2 = paint;
                                m1275f(c0516c.f1765c, iArr, i24, i21, i22, paint2, canvas);
                                m1275f(c0516c.f1766d, iArr, i24, i21, i22 + 1, paint2, canvas);
                            } else {
                                canvas = canvas2;
                                i5 = i15;
                            }
                            i20++;
                            i15 = i5;
                            i16 = i16;
                            i17 = i17;
                            i18 = i18;
                            canvas2 = canvas;
                            c0369f4 = c0369f5;
                            i14 = i14;
                            c0520g = c0520g;
                        } else {
                            C0369f c0369f6 = c0369f4;
                            int i25 = i14;
                            C0520g c0520g2 = c0520g;
                            Canvas canvas3 = canvas2;
                            int i26 = i16;
                            int i27 = i15;
                            int i28 = i17;
                            int i29 = i18;
                            boolean z3 = c0518e3.f1770b;
                            int i30 = c0518e3.f1771c;
                            if (z3) {
                                int i31 = c0518e3.f1773e;
                                int i32 = i31 == 3 ? c0514a.f1756d[c0518e3.f1775g] : i31 == 2 ? c0514a.f1755c[c0518e3.f1776h] : c0514a.f1754b[c0518e3.f1777i];
                                Paint paint3 = this.f1794h;
                                paint3.setColor(i32);
                                canvas2 = canvas3;
                                canvas2.drawRect(i27, i26, i27 + i30, i29, paint3);
                            } else {
                                canvas2 = canvas3;
                            }
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f1799m, i27, i26, i30, i28);
                            float f = c0515b.f1757a;
                            float f3 = i27 / f;
                            float f4 = i26;
                            float f5 = c0515b.f1758b;
                            arrayList.add(new C0614b(null, null, null, bitmapCreateBitmap2, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, i30 / f, i28 / f5, false, -16777216, Integer.MIN_VALUE, 0.0f));
                            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                            canvas2.restore();
                            i14 = i25 + 1;
                            c0369f4 = c0369f6;
                            c0520g = c0520g2;
                        }
                    }
                } else {
                    c0455a = new C0455a(arrayList, -9223372036854775807L, -9223372036854775807L);
                }
            }
        }
        interfaceC0636d.mo545b(c0455a);
    }

    @Override // p045P0.InterfaceC0465k
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC0458d mo523k(byte[] bArr, int i3, int i4) {
        return AbstractC0462h.m1161a(this, bArr, i4);
    }
}
