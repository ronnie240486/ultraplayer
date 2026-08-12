package p036M0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.google.android.gms.internal.cast.C1323r;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xmlpull.v1.XmlPullParserException;
import p019G1.AbstractC0230e;
import p055T.C0583o;
import p055T.C0587s;
import p064W.AbstractC0632A;
import p064W.C0651s;
import p064W.C0656x;
import p064W.InterfaceC0636d;
import p064W.RunnableC0647o;
import p082b0.C1063d;
import p089d1.C1447t;
import p101g2.C1582c;
import p101g2.C1586g;
import p103h0.InterfaceC1603l;
import p105h2.AbstractC1670A;
import p105h2.AbstractC1679J;
import p105h2.AbstractC1723q;
import p105h2.C1677H;
import p105h2.C1700c0;
import p114k0.C1907A;
import p114k0.C1909C;
import p114k0.C1910D;
import p114k0.C1912F;
import p114k0.C1958r;
import p114k0.C1963w;
import p132p.AbstractC2086a;
import p137q0.C2144e;
import p144s.AbstractC2208b;
import p144s.AbstractC2209c;
import p145s0.AbstractC2229b;
import p145s0.C2234g;
import p145s0.C2237j;
import p145s0.C2245r;
import p145s0.InterfaceC2235h;

/* JADX INFO: renamed from: M0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0380q implements InterfaceC2235h {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1290g;

    /* JADX INFO: renamed from: h */
    public int f1291h;

    /* JADX INFO: renamed from: i */
    public Object f1292i;

    /* JADX INFO: renamed from: j */
    public Object f1293j;

    public C0380q(int i3, int i4) {
        this.f1290g = i4;
        switch (i4) {
            case 5:
                this.f1292i = new Object[i3 * 2];
                this.f1291h = 0;
                break;
            default:
                this.f1291h = i3;
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C0380q m1040b(Resources resources, int i3, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f;
        float f3;
        Shader.TileMode tileMode;
        Shader radialGradient;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i3);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListM4794b = AbstractC2209c.m4794b(resources, xml, attributeSetAsAttributeSet, theme);
                return new C0380q((Shader) null, colorStateListM4794b, colorStateListM4794b.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM4787f = AbstractC2208b.m4787f(resources, theme, attributeSetAsAttributeSet, AbstractC2086a.f9062d);
        float f4 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) ? 0.0f : typedArrayM4787f.getFloat(8, 0.0f);
        float f5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null ? typedArrayM4787f.getFloat(9, 0.0f) : 0.0f;
        float f6 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null ? typedArrayM4787f.getFloat(10, 0.0f) : 0.0f;
        float f7 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null ? typedArrayM4787f.getFloat(11, 0.0f) : 0.0f;
        float f8 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) ? 0.0f : typedArrayM4787f.getFloat(3, 0.0f);
        float f9 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null ? typedArrayM4787f.getFloat(4, 0.0f) : 0.0f;
        int i4 = !(xml.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) ? 0 : typedArrayM4787f.getInt(2, 0);
        int color = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null ? typedArrayM4787f.getColor(0, 0) : 0;
        boolean z3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int color2 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null ? typedArrayM4787f.getColor(7, 0) : 0;
        int color3 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null ? typedArrayM4787f.getColor(1, 0) : 0;
        int i5 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null ? typedArrayM4787f.getInt(6, 0) : 0;
        float f10 = xml.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null ? typedArrayM4787f.getFloat(5, 0.0f) : 0.0f;
        typedArrayM4787f.recycle();
        int depth = xml.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        float f11 = f10;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f = f5;
            if (next2 == 1) {
                f3 = f6;
                break;
            }
            int depth2 = xml.getDepth();
            f3 = f6;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayM4787f2 = AbstractC2208b.m4787f(resources, theme, attributeSetAsAttributeSet, AbstractC2086a.f9063e);
                boolean zHasValue = typedArrayM4787f2.hasValue(0);
                boolean zHasValue2 = typedArrayM4787f2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayM4787f2.getColor(0, 0);
                float f12 = typedArrayM4787f2.getFloat(1, 0.0f);
                typedArrayM4787f2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f12));
            }
            f5 = f;
            f6 = f3;
        }
        C1323r c1323r = arrayList2.size() > 0 ? new C1323r(arrayList2, arrayList) : null;
        if (c1323r == null) {
            c1323r = z3 ? new C1323r(color, color2, color3) : new C1323r(color, color3);
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i5 != 1) {
                    tileMode2 = i5 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
                } else {
                    tileMode2 = Shader.TileMode.REPEAT;
                }
                radialGradient = new LinearGradient(f4, f, f3, f7, (int[]) c1323r.f5961h, (float[]) c1323r.f5962i, tileMode2);
            } else {
                radialGradient = new SweepGradient(f8, f9, (int[]) c1323r.f5961h, (float[]) c1323r.f5962i);
            }
        } else {
            if (f11 <= 0.0f) {
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            if (i5 != 1) {
                tileMode = i5 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode = Shader.TileMode.REPEAT;
            }
            radialGradient = new RadialGradient(f8, f9, f11, (int[]) c1323r.f5961h, (float[]) c1323r.f5962i, tileMode);
        }
        return new C0380q(radialGradient, (ColorStateList) null, 0);
    }

    /* JADX INFO: renamed from: m */
    private final /* synthetic */ void m1041m() {
    }

    /* JADX WARN: Code duplicated, block: B:74:0x019b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX INFO: renamed from: a */
    public C1700c0 m1042a() {
        char c;
        char c2;
        char c3;
        ?? r4;
        short[] sArr;
        boolean z3;
        ?? r5;
        C1700c0 c1700c0;
        C1677H c1677h = (C1677H) this.f1293j;
        if (c1677h != null) {
            throw c1677h.m4124a();
        }
        int i3 = this.f1291h;
        Object[] objArrCopyOf = (Object[]) this.f1292i;
        if (i3 == 0) {
            c1700c0 = C1700c0.f7651m;
        } else {
            int i4 = 1;
            C1677H c1677h2 = null;
            ?? r6 = 0;
            C1677H c1677h3 = null;
            C1677H c1677h4 = null;
            if (i3 == 1) {
                Objects.requireNonNull(objArrCopyOf[0]);
                Objects.requireNonNull(objArrCopyOf[1]);
                c1700c0 = new C1700c0(null, objArrCopyOf, 1);
            } else {
                AbstractC0230e.m731i(i3, objArrCopyOf.length >> 1);
                int iM4126l = AbstractC1679J.m4126l(i3);
                if (i3 == 1) {
                    Objects.requireNonNull(objArrCopyOf[0]);
                    Objects.requireNonNull(objArrCopyOf[1]);
                    c = 1;
                    c2 = 0;
                } else {
                    int i5 = iM4126l - 1;
                    if (iM4126l <= 128) {
                        byte[] bArr = new byte[iM4126l];
                        Arrays.fill(bArr, (byte) -1);
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < i3) {
                            int i8 = i6 * 2;
                            int i9 = i7 * 2;
                            Object obj = objArrCopyOf[i8];
                            Objects.requireNonNull(obj);
                            Object obj2 = objArrCopyOf[i8 ^ i4];
                            Objects.requireNonNull(obj2);
                            int iM4164m = AbstractC1723q.m4164m(obj.hashCode());
                            while (true) {
                                int i10 = iM4164m & i5;
                                int i11 = bArr[i10] & 255;
                                if (i11 == 255) {
                                    bArr[i10] = (byte) i9;
                                    if (i7 < i6) {
                                        objArrCopyOf[i9] = obj;
                                        objArrCopyOf[i9 ^ 1] = obj2;
                                    }
                                    i7++;
                                    break;
                                }
                                if (obj.equals(objArrCopyOf[i11 == true ? 1 : 0])) {
                                    int i12 = ~i11;
                                    Object obj3 = objArrCopyOf[i12 == true ? 1 : 0];
                                    Objects.requireNonNull(obj3);
                                    c1677h3 = new C1677H(obj, obj2, obj3);
                                    objArrCopyOf[i12 == true ? 1 : 0] = obj2;
                                    break;
                                }
                                iM4164m = i10 + 1;
                            }
                            i6++;
                            i4 = 1;
                        }
                        c = 1;
                        c2 = 0;
                        if (i7 == i3) {
                            r6 = bArr;
                        } else {
                            sArr = new Object[]{bArr, Integer.valueOf(i7), c1677h3};
                        }
                    } else {
                        c = 1;
                        c2 = 0;
                        if (iM4126l <= 32768) {
                            sArr = new short[iM4126l];
                            Arrays.fill(sArr, (short) -1);
                            int i13 = 0;
                            for (int i14 = 0; i14 < i3; i14++) {
                                int i15 = i14 * 2;
                                int i16 = i13 * 2;
                                Object obj4 = objArrCopyOf[i15];
                                Objects.requireNonNull(obj4);
                                Object obj5 = objArrCopyOf[i15 ^ 1];
                                Objects.requireNonNull(obj5);
                                int iM4164m2 = AbstractC1723q.m4164m(obj4.hashCode());
                                while (true) {
                                    int i17 = iM4164m2 & i5;
                                    int i18 = sArr[i17] & 65535;
                                    if (i18 == 65535) {
                                        sArr[i17] = (short) i16;
                                        if (i13 < i14) {
                                            objArrCopyOf[i16] = obj4;
                                            objArrCopyOf[i16 ^ 1] = obj5;
                                        }
                                        i13++;
                                        break;
                                    }
                                    if (obj4.equals(objArrCopyOf[i18 == true ? 1 : 0])) {
                                        int i19 = ~i18;
                                        Object obj6 = objArrCopyOf[i19 == true ? 1 : 0];
                                        Objects.requireNonNull(obj6);
                                        c1677h4 = new C1677H(obj4, obj5, obj6);
                                        objArrCopyOf[i19 == true ? 1 : 0] = obj5;
                                        break;
                                    }
                                    iM4164m2 = i17 + 1;
                                }
                            }
                            r6 = i13 == i3 ? sArr : new Object[]{sArr, Integer.valueOf(i13), c1677h4};
                        } else {
                            int[] iArr = new int[iM4126l];
                            Arrays.fill(iArr, -1);
                            int i20 = 0;
                            for (int i21 = 0; i21 < i3; i21++) {
                                int i22 = i21 * 2;
                                int i23 = i20 * 2;
                                Object obj7 = objArrCopyOf[i22];
                                Objects.requireNonNull(obj7);
                                Object obj8 = objArrCopyOf[i22 ^ 1];
                                Objects.requireNonNull(obj8);
                                int iM4164m3 = AbstractC1723q.m4164m(obj7.hashCode());
                                while (true) {
                                    int i24 = iM4164m3 & i5;
                                    int i25 = iArr[i24];
                                    if (i25 == -1) {
                                        iArr[i24] = i23;
                                        if (i20 < i21) {
                                            objArrCopyOf[i23] = obj7;
                                            objArrCopyOf[i23 ^ 1] = obj8;
                                        }
                                        i20++;
                                        break;
                                    }
                                    if (obj7.equals(objArrCopyOf[i25])) {
                                        int i26 = i25 ^ 1;
                                        Object obj9 = objArrCopyOf[i26];
                                        Objects.requireNonNull(obj9);
                                        c1677h2 = new C1677H(obj7, obj8, obj9);
                                        objArrCopyOf[i26] = obj8;
                                        break;
                                    }
                                    iM4164m3 = i24 + 1;
                                }
                            }
                            c3 = 2;
                            r4 = i20 == i3 ? iArr : new Object[]{iArr, Integer.valueOf(i20), c1677h2};
                        }
                    }
                    z3 = r4 instanceof Object[];
                    r5 = r4;
                    if (z3) {
                        Object[] objArr = (Object[]) r4;
                        this.f1293j = (C1677H) objArr[c3];
                        Object obj10 = objArr[c2];
                        int iIntValue = ((Integer) objArr[c]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                        r5 = obj10;
                        i3 = iIntValue;
                    }
                    c1700c0 = new C1700c0(r5, objArrCopyOf, i3);
                }
                c3 = 2;
                r4 = r6;
                z3 = r4 instanceof Object[];
                r5 = r4;
                if (z3) {
                    Object[] objArr2 = (Object[]) r4;
                    this.f1293j = (C1677H) objArr2[c3];
                    Object obj11 = objArr2[c2];
                    int iIntValue2 = ((Integer) objArr2[c]).intValue();
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 * 2);
                    r5 = obj11;
                    i3 = iIntValue2;
                }
                c1700c0 = new C1700c0(r5, objArrCopyOf, i3);
            }
        }
        C1677H c1677h5 = (C1677H) this.f1293j;
        if (c1677h5 == null) {
            return c1700c0;
        }
        throw c1677h5.m4124a();
    }

    /* JADX INFO: renamed from: c */
    public void m1043c(InterfaceC0636d interfaceC0636d) {
        for (C1912F c1912f : (CopyOnWriteArrayList) this.f1293j) {
            AbstractC0632A.m1574O(c1912f.f8329a, new RunnableC0647o(interfaceC0636d, 12, c1912f.f8330b));
        }
    }

    /* JADX INFO: renamed from: d */
    public long m1044d(C2237j c2237j) throws EOFException, InterruptedIOException {
        long j3;
        long j4;
        C0587s c0587s;
        C2245r c2245r;
        boolean zM4807b;
        int iM4833l;
        while (true) {
            long jMo339j = c2237j.mo339j();
            j3 = c2237j.f9628i;
            j4 = 6;
            long j5 = j3 - 6;
            c0587s = (C0587s) this.f1293j;
            c2245r = (C2245r) this.f1292i;
            if (jMo339j >= j5) {
                j4 = 6;
                break;
            }
            long jMo339j2 = c2237j.mo339j();
            byte[] bArr = new byte[2];
            c2237j.mo338i(bArr, 0, 2, false);
            int i3 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i4 = this.f1291h;
            if (i3 != i4) {
                c2237j.f9631l = 0;
                c2237j.m4831b((int) (jMo339j2 - c2237j.f9629j), false);
                zM4807b = false;
            } else {
                C0651s c0651s = new C0651s(16);
                System.arraycopy(bArr, 0, c0651s.f2520a, 0, 2);
                byte[] bArr2 = c0651s.f2520a;
                int i5 = 0;
                for (int i6 = 2; i5 < 14 && (iM4833l = c2237j.m4833l(bArr2, i6 + i5, 14 - i5)) != -1; i6 = 2) {
                    i5 += iM4833l;
                }
                c0651s.m1664F(i5);
                c2237j.f9631l = 0;
                c2237j.m4831b((int) (jMo339j2 - c2237j.f9629j), false);
                zM4807b = AbstractC2229b.m4807b(c0651s, c2245r, i4, c0587s);
            }
            if (zM4807b) {
                break;
            }
            c2237j.m4831b(1, false);
        }
        if (c2237j.mo339j() < j3 - j4) {
            return c0587s.f2181a;
        }
        c2237j.m4831b((int) (j3 - c2237j.mo339j()), false);
        return c2245r.f9654j;
    }

    @Override // p145s0.InterfaceC2235h
    /* JADX INFO: renamed from: e */
    public C2234g mo517e(C2237j c2237j, long j3) throws EOFException, InterruptedIOException {
        long j4;
        C2234g c2234g;
        switch (this.f1290g) {
            case 1:
                long j5 = c2237j.f9629j;
                int iMin = (int) Math.min(112800, c2237j.f9628i - j5);
                C0651s c0651s = (C0651s) this.f1293j;
                c0651s.m1662D(iMin);
                c2237j.mo338i(c0651s.f2520a, 0, iMin, false);
                int i3 = c0651s.f2522c;
                long j6 = -1;
                long j7 = -1;
                long j8 = -9223372036854775807L;
                while (true) {
                    if (c0651s.m1667a() >= 188) {
                        byte[] bArr = c0651s.f2520a;
                        int i4 = c0651s.f2521b;
                        while (true) {
                            if (i4 < i3) {
                                j4 = -9223372036854775807L;
                                if (bArr[i4] != 71) {
                                    i4++;
                                }
                            } else {
                                j4 = -9223372036854775807L;
                            }
                        }
                        int i5 = i4 + 188;
                        if (i5 <= i3) {
                            long jM3280C = AbstractC1303m.m3280C(c0651s, i4, this.f1291h);
                            if (jM3280C != j4) {
                                long jM1702b = ((C0656x) this.f1292i).m1702b(jM3280C);
                                if (jM1702b > j3) {
                                    if (j8 == j4) {
                                        return new C2234g(-1, jM1702b, j5);
                                    }
                                    c2234g = new C2234g(0, -9223372036854775807L, j5 + j7);
                                } else {
                                    if (100000 + jM1702b > j3) {
                                        return new C2234g(0, -9223372036854775807L, j5 + ((long) i4));
                                    }
                                    j8 = jM1702b;
                                    j7 = i4;
                                }
                            }
                            c0651s.m1665G(i5);
                            j6 = i5;
                        }
                        return c2234g;
                    }
                    j4 = -9223372036854775807L;
                }
                if (j8 == j4) {
                    return C2234g.f9616d;
                }
                c2234g = new C2234g(-2, j8, j5 + j6);
                return c2234g;
            default:
                long j9 = c2237j.f9629j;
                long jM1044d = m1044d(c2237j);
                long jMo339j = c2237j.mo339j();
                c2237j.m4831b(Math.max(6, ((C2245r) this.f1292i).f9647c), false);
                long jM1044d2 = m1044d(c2237j);
                long jMo339j2 = c2237j.mo339j();
                if (jM1044d > j3 || jM1044d2 <= j3) {
                    return jM1044d2 <= j3 ? new C2234g(-2, jM1044d2, jMo339j2) : new C2234g(-1, jM1044d, j9);
                }
                return new C2234g(0, -9223372036854775807L, jMo339j);
        }
    }

    /* JADX INFO: renamed from: f */
    public Object m1045f(int i3) {
        SparseArray sparseArray;
        if (this.f1291h == -1) {
            this.f1291h = 0;
        }
        while (true) {
            int i4 = this.f1291h;
            sparseArray = (SparseArray) this.f1292i;
            if (i4 <= 0 || i3 >= sparseArray.keyAt(i4)) {
                break;
            }
            this.f1291h--;
        }
        while (this.f1291h < sparseArray.size() - 1 && i3 >= sparseArray.keyAt(this.f1291h + 1)) {
            this.f1291h++;
        }
        return sparseArray.valueAt(this.f1291h);
    }

    /* JADX INFO: renamed from: g */
    public boolean m1046g() {
        ColorStateList colorStateList;
        return ((Shader) this.f1292i) == null && (colorStateList = (ColorStateList) this.f1293j) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: h */
    public void m1047h(C1958r c1958r, int i3, int i4, C0583o c0583o, int i5, Object obj, long j3, long j4) {
        m1043c(new C1909C(this, c1958r, new C1963w(i3, i4, c0583o, i5, obj, AbstractC0632A.m1581V(j3), AbstractC0632A.m1581V(j4)), 2));
    }

    /* JADX INFO: renamed from: i */
    public void m1048i(C1958r c1958r, int i3, int i4, C0583o c0583o, int i5, Object obj, long j3, long j4) {
        m1043c(new C1909C(this, c1958r, new C1963w(i3, i4, c0583o, i5, obj, AbstractC0632A.m1581V(j3), AbstractC0632A.m1581V(j4)), 1));
    }

    @Override // p145s0.InterfaceC2235h
    /* JADX INFO: renamed from: j */
    public void mo522j() {
        switch (this.f1290g) {
            case 1:
                byte[] bArr = AbstractC0632A.f2459f;
                C0651s c0651s = (C0651s) this.f1293j;
                c0651s.getClass();
                c0651s.m1663E(bArr, bArr.length);
                break;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m1049k(C1958r c1958r, int i3, int i4, C0583o c0583o, int i5, Object obj, long j3, long j4, IOException iOException, boolean z3) {
        m1043c(new C1910D(this, c1958r, new C1963w(i3, i4, c0583o, i5, obj, AbstractC0632A.m1581V(j3), AbstractC0632A.m1581V(j4)), iOException, z3));
    }

    /* JADX INFO: renamed from: l */
    public void m1050l(C1958r c1958r, int i3, int i4, C0583o c0583o, int i5, Object obj, long j3, long j4) {
        m1043c(new C1909C(this, c1958r, new C1963w(i3, i4, c0583o, i5, obj, AbstractC0632A.m1581V(j3), AbstractC0632A.m1581V(j4)), 0));
    }

    /* JADX INFO: renamed from: n */
    public void m1051n(Object obj, Object obj2) {
        int i3 = (this.f1291h + 1) * 2;
        Object[] objArr = (Object[]) this.f1292i;
        if (i3 > objArr.length) {
            this.f1292i = Arrays.copyOf(objArr, AbstractC1670A.m4101e(objArr.length, i3));
        }
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 == null) {
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        Object[] objArr2 = (Object[]) this.f1292i;
        int i4 = this.f1291h;
        int i5 = i4 * 2;
        objArr2[i5] = obj;
        objArr2[i5 + 1] = obj2;
        this.f1291h = i4 + 1;
    }

    /* JADX INFO: renamed from: o */
    public List m1052o(CharSequence charSequence) {
        charSequence.getClass();
        C1447t c1447t = (C1447t) this.f1293j;
        c1447t.getClass();
        C1586g c1586g = new C1586g(c1447t, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (c1586g.hasNext()) {
            arrayList.add((String) c1586g.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ C0380q(Object obj, int i3, Serializable serializable, int i4) {
        this.f1290g = i4;
        this.f1292i = obj;
        this.f1291h = i3;
        this.f1293j = serializable;
    }

    public C0380q(C1063d c1063d) {
        this.f1290g = 7;
        this.f1292i = new SparseArray();
        this.f1293j = c1063d;
        this.f1291h = -1;
    }

    public C0380q(Shader shader, ColorStateList colorStateList, int i3) {
        this.f1290g = 9;
        this.f1292i = shader;
        this.f1293j = colorStateList;
        this.f1291h = i3;
    }

    public C0380q(C2245r c2245r, int i3) {
        this.f1290g = 10;
        this.f1292i = c2245r;
        this.f1291h = i3;
        this.f1293j = new C0587s();
    }

    public C0380q(int i3, C0656x c0656x) {
        this.f1290g = 1;
        this.f1291h = i3;
        this.f1292i = c0656x;
        this.f1293j = new C0651s();
    }

    public C0380q(C1447t c1447t) {
        this.f1290g = 4;
        this.f1293j = c1447t;
        this.f1292i = C1582c.f7186g;
        this.f1291h = Integer.MAX_VALUE;
    }

    public C0380q(CopyOnWriteArrayList copyOnWriteArrayList, int i3, C1907A c1907a) {
        this.f1290g = 6;
        this.f1293j = copyOnWriteArrayList;
        this.f1291h = i3;
        this.f1292i = c1907a;
    }

    public C0380q(C2144e c2144e, InterfaceC1603l interfaceC1603l, int i3, long j3) {
        this.f1290g = 8;
        this.f1293j = c2144e;
        this.f1292i = interfaceC1603l;
        this.f1291h = i3;
    }
}
