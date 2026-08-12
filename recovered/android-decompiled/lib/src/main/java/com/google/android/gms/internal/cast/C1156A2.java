package com.google.android.gms.internal.cast;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import p045P0.AbstractC0462h;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.A2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1156A2 implements InterfaceC1188I2 {

    /* JADX INFO: renamed from: h */
    public static final int[] f5545h = new int[0];

    /* JADX INFO: renamed from: i */
    public static final Unsafe f5546i = AbstractC1235U2.m3202h();

    /* JADX INFO: renamed from: a */
    public final int[] f5547a;

    /* JADX INFO: renamed from: b */
    public final Object[] f5548b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1230T1 f5549c;

    /* JADX INFO: renamed from: d */
    public final int[] f5550d;

    /* JADX INFO: renamed from: e */
    public final int f5551e;

    /* JADX INFO: renamed from: f */
    public final AbstractC1330s2 f5552f;

    /* JADX INFO: renamed from: g */
    public final C1204M2 f5553g;

    public C1156A2(int[] iArr, Object[] objArr, AbstractC1230T1 abstractC1230T1, int[] iArr2, int i3, AbstractC1330s2 abstractC1330s2, C1204M2 c1204m2, C1262b2 c1262b2) {
        this.f5547a = iArr;
        this.f5548b = objArr;
        this.f5550d = iArr2;
        this.f5551e = i3;
        this.f5552f = abstractC1330s2;
        this.f5553g = c1204m2;
        this.f5549c = abstractC1230T1;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m3097i(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC1282g2) {
            return ((AbstractC1282g2) obj).m3263g();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0239  */
    /* JADX WARN: Code duplicated, block: B:125:0x023c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0253  */
    /* JADX WARN: Code duplicated, block: B:129:0x0256  */
    /* JADX WARN: Code duplicated, block: B:169:0x0323  */
    /* JADX WARN: Code duplicated, block: B:183:0x0374  */
    /* JADX WARN: Code duplicated, block: B:186:0x0380  */
    /* JADX INFO: renamed from: k */
    public static C1156A2 m3098k(C1184H2 c1184h2, AbstractC1330s2 abstractC1330s2, C1204M2 c1204m2, C1262b2 c1262b2) {
        int i3;
        int iCharAt;
        int iCharAt2;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char cCharAt;
        int i8;
        char cCharAt2;
        int i9;
        char cCharAt3;
        int i10;
        char cCharAt4;
        int i11;
        int i12;
        int i13;
        char cCharAt5;
        int i14;
        char cCharAt6;
        int i15;
        int i16;
        Object[] objArr;
        int i17;
        int iObjectFieldOffset;
        int iObjectFieldOffset2;
        int i18;
        int i19;
        int i20;
        Field fieldM3102q;
        int i21;
        char cCharAt7;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj;
        Field fieldM3102q2;
        int i27;
        Object obj2;
        Field fieldM3102q3;
        int i28;
        char cCharAt8;
        int i29;
        char cCharAt9;
        int i30;
        char cCharAt10;
        int i31;
        char cCharAt11;
        if (!(c1184h2 instanceof C1184H2)) {
            c1184h2.getClass();
            throw new ClassCastException();
        }
        String str = c1184h2.f5636b;
        int length = str.length();
        char c = 55296;
        if (str.charAt(0) >= 55296) {
            int i32 = 1;
            while (true) {
                i3 = i32 + 1;
                if (str.charAt(i32) < 55296) {
                    break;
                }
                i32 = i3;
            }
        } else {
            i3 = 1;
        }
        int i33 = i3 + 1;
        int iCharAt3 = str.charAt(i3);
        if (iCharAt3 >= 55296) {
            int i34 = iCharAt3 & 8191;
            int i35 = 13;
            while (true) {
                i31 = i33 + 1;
                cCharAt11 = str.charAt(i33);
                if (cCharAt11 < 55296) {
                    break;
                }
                i34 |= (cCharAt11 & 8191) << i35;
                i35 += 13;
                i33 = i31;
            }
            iCharAt3 = i34 | (cCharAt11 << i35);
            i33 = i31;
        }
        if (iCharAt3 == 0) {
            iArr = f5545h;
            i5 = 0;
            iCharAt = 0;
            iCharAt2 = 0;
            i4 = 0;
            i6 = 0;
        } else {
            int i36 = i33 + 1;
            int iCharAt4 = str.charAt(i33);
            if (iCharAt4 >= 55296) {
                int i37 = iCharAt4 & 8191;
                int i38 = 13;
                while (true) {
                    i14 = i36 + 1;
                    cCharAt6 = str.charAt(i36);
                    if (cCharAt6 < 55296) {
                        break;
                    }
                    i37 |= (cCharAt6 & 8191) << i38;
                    i38 += 13;
                    i36 = i14;
                }
                iCharAt4 = i37 | (cCharAt6 << i38);
                i36 = i14;
            }
            int i39 = i36 + 1;
            int iCharAt5 = str.charAt(i36);
            if (iCharAt5 >= 55296) {
                int i40 = iCharAt5 & 8191;
                int i41 = 13;
                while (true) {
                    i13 = i39 + 1;
                    cCharAt5 = str.charAt(i39);
                    if (cCharAt5 < 55296) {
                        break;
                    }
                    i40 |= (cCharAt5 & 8191) << i41;
                    i41 += 13;
                    i39 = i13;
                }
                iCharAt5 = i40 | (cCharAt5 << i41);
                i39 = i13;
            }
            int i42 = i39 + 1;
            if (str.charAt(i39) >= 55296) {
                while (true) {
                    i12 = i42 + 1;
                    if (str.charAt(i42) < 55296) {
                        break;
                    }
                    i42 = i12;
                }
                i42 = i12;
            }
            int i43 = i42 + 1;
            if (str.charAt(i42) >= 55296) {
                while (true) {
                    i11 = i43 + 1;
                    if (str.charAt(i43) < 55296) {
                        break;
                    }
                    i43 = i11;
                }
                i43 = i11;
            }
            int i44 = i43 + 1;
            iCharAt = str.charAt(i43);
            if (iCharAt >= 55296) {
                int i45 = iCharAt & 8191;
                int i46 = 13;
                while (true) {
                    i10 = i44 + 1;
                    cCharAt4 = str.charAt(i44);
                    if (cCharAt4 < 55296) {
                        break;
                    }
                    i45 |= (cCharAt4 & 8191) << i46;
                    i46 += 13;
                    i44 = i10;
                }
                iCharAt = i45 | (cCharAt4 << i46);
                i44 = i10;
            }
            int i47 = i44 + 1;
            iCharAt2 = str.charAt(i44);
            if (iCharAt2 >= 55296) {
                int i48 = iCharAt2 & 8191;
                int i49 = 13;
                while (true) {
                    i9 = i47 + 1;
                    cCharAt3 = str.charAt(i47);
                    if (cCharAt3 < 55296) {
                        break;
                    }
                    i48 |= (cCharAt3 & 8191) << i49;
                    i49 += 13;
                    i47 = i9;
                }
                iCharAt2 = i48 | (cCharAt3 << i49);
                i47 = i9;
            }
            int i50 = i47 + 1;
            int iCharAt6 = str.charAt(i47);
            if (iCharAt6 >= 55296) {
                int i51 = iCharAt6 & 8191;
                int i52 = 13;
                while (true) {
                    i8 = i50 + 1;
                    cCharAt2 = str.charAt(i50);
                    if (cCharAt2 < 55296) {
                        break;
                    }
                    i51 |= (cCharAt2 & 8191) << i52;
                    i52 += 13;
                    i50 = i8;
                }
                iCharAt6 = i51 | (cCharAt2 << i52);
                i50 = i8;
            }
            int i53 = i50 + 1;
            int iCharAt7 = str.charAt(i50);
            if (iCharAt7 >= 55296) {
                int i54 = iCharAt7 & 8191;
                int i55 = 13;
                while (true) {
                    i7 = i53 + 1;
                    cCharAt = str.charAt(i53);
                    if (cCharAt < 55296) {
                        break;
                    }
                    i54 |= (cCharAt & 8191) << i55;
                    i55 += 13;
                    i53 = i7;
                }
                iCharAt7 = i54 | (cCharAt << i55);
                i53 = i7;
            }
            int i56 = iCharAt7 + iCharAt2 + iCharAt6;
            i4 = iCharAt4 + iCharAt4 + iCharAt5;
            i5 = iCharAt4;
            i33 = i53;
            iArr = new int[i56];
            i6 = iCharAt7;
        }
        Unsafe unsafe = f5546i;
        Class<?> cls = c1184h2.f5635a.getClass();
        int i57 = iCharAt2 + i6;
        int i58 = iCharAt + iCharAt;
        int[] iArr2 = new int[iCharAt * 3];
        Object[] objArr2 = new Object[i58];
        int i59 = i6;
        int i60 = 0;
        int i61 = 0;
        while (i33 < length) {
            int i62 = i33 + 1;
            int iCharAt8 = str.charAt(i33);
            if (iCharAt8 >= c) {
                int i63 = iCharAt8 & 8191;
                int i64 = i62;
                int i65 = 13;
                while (true) {
                    i30 = i64 + 1;
                    cCharAt10 = str.charAt(i64);
                    if (cCharAt10 < c) {
                        break;
                    }
                    i63 |= (cCharAt10 & 8191) << i65;
                    i65 += 13;
                    i64 = i30;
                }
                iCharAt8 = i63 | (cCharAt10 << i65);
                i15 = i30;
            } else {
                i15 = i62;
            }
            int i66 = i15 + 1;
            int iCharAt9 = str.charAt(i15);
            if (iCharAt9 >= c) {
                int i67 = iCharAt9 & 8191;
                int i68 = i66;
                int i69 = 13;
                while (true) {
                    i29 = i68 + 1;
                    cCharAt9 = str.charAt(i68);
                    if (cCharAt9 < c) {
                        break;
                    }
                    i67 |= (cCharAt9 & 8191) << i69;
                    i69 += 13;
                    i68 = i29;
                }
                iCharAt9 = i67 | (cCharAt9 << i69);
                i16 = i29;
            } else {
                i16 = i66;
            }
            if ((iCharAt9 & 1024) != 0) {
                iArr[i60] = i61;
                i60++;
            }
            int i70 = iCharAt9 & 255;
            int i71 = length;
            int i72 = iCharAt9 & 2048;
            Object[] objArr3 = c1184h2.f5637c;
            if (i70 >= 51) {
                int i73 = i16 + 1;
                int iCharAt10 = str.charAt(i16);
                char c2 = 55296;
                if (iCharAt10 >= 55296) {
                    int i74 = iCharAt10 & 8191;
                    int i75 = i73;
                    int i76 = 13;
                    while (true) {
                        i28 = i75 + 1;
                        cCharAt8 = str.charAt(i75);
                        if (cCharAt8 < c2) {
                            break;
                        }
                        i74 |= (cCharAt8 & 8191) << i76;
                        i76 += 13;
                        i75 = i28;
                        c2 = 55296;
                    }
                    iCharAt10 = i74 | (cCharAt8 << i76);
                    i23 = i28;
                } else {
                    i23 = i73;
                }
                int i77 = i23;
                int i78 = i70 - 51;
                objArr = objArr2;
                if (i78 == 9 || i78 == 17) {
                    i24 = i4 + 1;
                    int i79 = i61 / 3;
                    objArr[i79 + i79 + 1] = objArr3[i4];
                } else {
                    if (i78 != 12) {
                        i25 = i72;
                    } else if (c1184h2.m3145a() == 1 || i72 != 0) {
                        i24 = i4 + 1;
                        int i80 = i61 / 3;
                        objArr[i80 + i80 + 1] = objArr3[i4];
                    } else {
                        i25 = 0;
                    }
                    i26 = iCharAt10 + iCharAt10;
                    obj = objArr3[i26];
                    int i81 = i25;
                    if (obj instanceof Field) {
                        fieldM3102q2 = (Field) obj;
                    } else {
                        fieldM3102q2 = m3102q(cls, (String) obj);
                        objArr3[i26] = fieldM3102q2;
                    }
                    int iObjectFieldOffset3 = (int) unsafe.objectFieldOffset(fieldM3102q2);
                    i27 = i26 + 1;
                    obj2 = objArr3[i27];
                    if (obj2 instanceof Field) {
                        fieldM3102q3 = (Field) obj2;
                    } else {
                        fieldM3102q3 = m3102q(cls, (String) obj2);
                        objArr3[i27] = fieldM3102q3;
                    }
                    str = str;
                    iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM3102q3);
                    i20 = i81;
                    i18 = i77;
                    iObjectFieldOffset = iObjectFieldOffset3;
                    iCharAt8 = iCharAt8;
                    i19 = 0;
                }
                i4 = i24;
                i25 = i72;
                i26 = iCharAt10 + iCharAt10;
                obj = objArr3[i26];
                int i82 = i25;
                if (obj instanceof Field) {
                    fieldM3102q2 = (Field) obj;
                } else {
                    fieldM3102q2 = m3102q(cls, (String) obj);
                    objArr3[i26] = fieldM3102q2;
                }
                int iObjectFieldOffset4 = (int) unsafe.objectFieldOffset(fieldM3102q2);
                i27 = i26 + 1;
                obj2 = objArr3[i27];
                if (obj2 instanceof Field) {
                    fieldM3102q3 = (Field) obj2;
                } else {
                    fieldM3102q3 = m3102q(cls, (String) obj2);
                    objArr3[i27] = fieldM3102q3;
                }
                str = str;
                iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM3102q3);
                i20 = i82;
                i18 = i77;
                iObjectFieldOffset = iObjectFieldOffset4;
                iCharAt8 = iCharAt8;
                i19 = 0;
            } else {
                objArr = objArr2;
                int i83 = i4 + 1;
                Field fieldM3102q4 = m3102q(cls, (String) objArr3[i4]);
                if (i70 == 9 || i70 == 17) {
                    int i84 = i61 / 3;
                    objArr[i84 + i84 + 1] = fieldM3102q4.getType();
                } else {
                    if (i70 != 27) {
                        if (i70 == 49) {
                            i4 += 2;
                            i22 = 1;
                        } else if (i70 == 12 || i70 == 30 || i70 == 44) {
                            iCharAt8 = iCharAt8;
                            if (c1184h2.m3145a() == 1 || i72 != 0) {
                                i4 += 2;
                                int i85 = i61 / 3;
                                objArr[i85 + i85 + 1] = objArr3[i83];
                                i16 = i16;
                                i17 = i72;
                            } else {
                                i16 = i16;
                                i4 = i83;
                                i17 = 0;
                            }
                        } else if (i70 == 50) {
                            int i86 = i4 + 2;
                            i59++;
                            iArr[i59] = i61;
                            int i87 = i61 / 3;
                            int i88 = i87 + i87;
                            objArr[i88] = objArr3[i83];
                            if (i72 != 0) {
                                i4 += 3;
                                objArr[i88 + 1] = objArr3[i86];
                                i17 = i72;
                            } else {
                                i4 = i86;
                                i17 = 0;
                            }
                            iCharAt8 = iCharAt8;
                        }
                        iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM3102q4);
                        iObjectFieldOffset2 = 1048575;
                        if ((iCharAt9 & 4096) != 0 || i70 > 17) {
                            i18 = i16;
                            i19 = 0;
                        } else {
                            int i89 = i16 + 1;
                            int iCharAt11 = str.charAt(i16);
                            if (iCharAt11 >= 55296) {
                                int i90 = iCharAt11 & 8191;
                                int i91 = 13;
                                while (true) {
                                    i21 = i89 + 1;
                                    cCharAt7 = str.charAt(i89);
                                    if (cCharAt7 < 55296) {
                                        break;
                                    }
                                    i90 |= (cCharAt7 & 8191) << i91;
                                    i91 += 13;
                                    i89 = i21;
                                }
                                iCharAt11 = i90 | (cCharAt7 << i91);
                                i89 = i21;
                            }
                            int i92 = (iCharAt11 / 32) + i5 + i5;
                            Object obj3 = objArr3[i92];
                            if (obj3 instanceof Field) {
                                fieldM3102q = (Field) obj3;
                            } else {
                                fieldM3102q = m3102q(cls, (String) obj3);
                                objArr3[i92] = fieldM3102q;
                            }
                            i19 = iCharAt11 % 32;
                            i18 = i89;
                            iObjectFieldOffset2 = (int) unsafe.objectFieldOffset(fieldM3102q);
                        }
                        if (i70 >= 18 && i70 <= 49) {
                            iArr[i57] = iObjectFieldOffset;
                            i57++;
                        }
                        i20 = i17;
                    } else {
                        i22 = 1;
                        i4 += 2;
                    }
                    int i93 = i61 / 3;
                    objArr[i93 + i93 + i22] = objArr3[i83];
                    i16 = i16;
                    i17 = i72;
                    iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM3102q4);
                    iObjectFieldOffset2 = 1048575;
                    if ((iCharAt9 & 4096) != 0) {
                        i18 = i16;
                        i19 = 0;
                    } else {
                        i18 = i16;
                        i19 = 0;
                    }
                    if (i70 >= 18) {
                        iArr[i57] = iObjectFieldOffset;
                        i57++;
                    }
                    i20 = i17;
                }
                i16 = i16;
                i17 = i72;
                i4 = i83;
                iObjectFieldOffset = (int) unsafe.objectFieldOffset(fieldM3102q4);
                iObjectFieldOffset2 = 1048575;
                if ((iCharAt9 & 4096) != 0) {
                    i18 = i16;
                    i19 = 0;
                } else {
                    i18 = i16;
                    i19 = 0;
                }
                if (i70 >= 18) {
                    iArr[i57] = iObjectFieldOffset;
                    i57++;
                }
                i20 = i17;
            }
            int i94 = i61 + 1;
            iArr2[i61] = iCharAt8;
            int i95 = i61 + 2;
            int i96 = i18;
            iArr2[i94] = ((iCharAt9 & 512) != 0 ? 536870912 : 0) | ((iCharAt9 & 256) != 0 ? 268435456 : 0) | (i20 != 0 ? Integer.MIN_VALUE : 0) | (i70 << 20) | iObjectFieldOffset;
            i61 += 3;
            iArr2[i95] = (i19 << 20) | iObjectFieldOffset2;
            length = i71;
            i33 = i96;
            str = str;
            objArr2 = objArr;
            c = 55296;
        }
        return new C1156A2(iArr2, objArr2, c1184h2.f5635a, iArr, i6, abstractC1330s2, c1204m2, c1262b2);
    }

    /* JADX INFO: renamed from: l */
    public static int m3099l(long j3, Object obj) {
        return ((Integer) AbstractC1235U2.m3201g(j3, obj)).intValue();
    }

    /* JADX INFO: renamed from: m */
    public static int m3100m(int i3) {
        return (i3 >>> 20) & 255;
    }

    /* JADX INFO: renamed from: o */
    public static long m3101o(long j3, Object obj) {
        return ((Long) AbstractC1235U2.m3201g(j3, obj)).longValue();
    }

    /* JADX INFO: renamed from: q */
    public static Field m3102q(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1188I2
    /* JADX INFO: renamed from: a */
    public final boolean mo3103a(Object obj) {
        int i3;
        int i4;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i7 < this.f5551e) {
            int i8 = this.f5550d[i7];
            int[] iArr = this.f5547a;
            int i9 = iArr[i8];
            int iM3112n = m3112n(i8);
            int i10 = iArr[i8 + 2];
            int i11 = i10 & 1048575;
            int i12 = 1 << (i10 >>> 20);
            if (i11 != i5) {
                if (i11 != 1048575) {
                    i6 = f5546i.getInt(obj, i11);
                }
                i4 = i6;
                i3 = i11;
            } else {
                int i13 = i6;
                i3 = i5;
                i4 = i13;
            }
            if ((268435456 & iM3112n) == 0 || m3119w(obj, i8, i3, i4, i12)) {
                int iM3100m = m3100m(iM3112n);
                if (iM3100m != 9 && iM3100m != 17) {
                    if (iM3100m != 27) {
                        if (iM3100m == 60 || iM3100m == 68) {
                            if (!m3111j(i9, i8, obj) || m3113p(i8).mo3103a(AbstractC1235U2.m3201g(iM3112n & 1048575, obj))) {
                            }
                        } else if (iM3100m != 49) {
                            if (iM3100m == 50) {
                                AbstractC1235U2.m3201g(iM3112n & 1048575, obj).getClass();
                                throw new ClassCastException();
                            }
                        }
                        i7++;
                        i5 = i3;
                        i6 = i4;
                    }
                    List list = (List) AbstractC1235U2.m3201g(iM3112n & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC1188I2 interfaceC1188I2M3113p = m3113p(i8);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            if (interfaceC1188I2M3113p.mo3103a(list.get(i14))) {
                            }
                        }
                    }
                    i7++;
                    i5 = i3;
                    i6 = i4;
                } else if (!m3119w(obj, i8, i3, i4, i12) || m3113p(i8).mo3103a(AbstractC1235U2.m3201g(iM3112n & 1048575, obj))) {
                    i7++;
                    i5 = i3;
                    i6 = i4;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // com.google.android.gms.internal.cast.InterfaceC1188I2
    /* JADX INFO: renamed from: b */
    public final void mo3104b(Object obj, Object obj2) {
        Object obj3;
        if (!m3097i(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
        obj2.getClass();
        int i3 = 0;
        while (true) {
            int[] iArr = this.f5547a;
            if (i3 >= iArr.length) {
                AbstractC1192J2.m3164o(this.f5553g, obj, obj2);
                return;
            }
            int iM3112n = m3112n(i3);
            int i4 = iM3112n & 1048575;
            int iM3100m = m3100m(iM3112n);
            int i5 = iArr[i3];
            long j3 = i4;
            switch (iM3100m) {
                case 0:
                    if (m3118v(i3, obj2)) {
                        AbstractC1231T2 abstractC1231T2 = AbstractC1235U2.f5716c;
                        obj3 = obj;
                        abstractC1231T2.mo3189e(obj3, j3, abstractC1231T2.mo3185a(j3, obj2));
                        m3116t(i3, obj3);
                    } else {
                        obj3 = obj;
                    }
                    i3 += 3;
                    obj = obj3;
                    break;
                case 1:
                    if (m3118v(i3, obj2)) {
                        AbstractC1231T2 abstractC1231T3 = AbstractC1235U2.f5716c;
                        abstractC1231T3.mo3190f(obj, j3, abstractC1231T3.mo3186b(j3, obj2));
                        m3116t(i3, obj);
                    }
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 2:
                    if (m3118v(i3, obj2)) {
                        AbstractC1235U2.m3204j(obj, j3, AbstractC1235U2.m3199e(j3, obj2));
                        m3116t(i3, obj);
                    }
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    if (m3118v(i3, obj2)) {
                        AbstractC1235U2.m3204j(obj, j3, AbstractC1235U2.m3199e(j3, obj2));
                        m3116t(i3, obj);
                    }
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 4:
                    if (m3118v(i3, obj2)) {
                        AbstractC1235U2.m3203i(AbstractC1235U2.m3198d(j3, obj2), j3, obj);
                        m3116t(i3, obj);
                    }
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 5:
                    if (m3118v(i3, obj2)) {
                        AbstractC1235U2.m3204j(obj, j3, AbstractC1235U2.m3199e(j3, obj2));
                        m3116t(i3, obj);
                    }
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 6:
                    if (m3118v(i3, obj2)) {
                        AbstractC1235U2.m3203i(AbstractC1235U2.m3198d(j3, obj2), j3, obj);
                        m3116t(i3, obj);
                    }
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 7:
                    if (m3118v(i3, obj2)) {
                        AbstractC1231T2 abstractC1231T4 = AbstractC1235U2.f5716c;
                        abstractC1231T4.mo3187c(obj, j3, abstractC1231T4.mo3191g(j3, obj2));
                        m3116t(i3, obj);
                    }
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 8:
                    if (m3118v(i3, obj2)) {
                        AbstractC1235U2.m3205k(j3, obj, AbstractC1235U2.m3201g(j3, obj2));
                        m3116t(i3, obj);
                    }
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 9:
                    m3114r(obj, i3, obj2);
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 10:
                    if (m3118v(i3, obj2)) {
                        AbstractC1235U2.m3205k(j3, obj, AbstractC1235U2.m3201g(j3, obj2));
                        m3116t(i3, obj);
                    }
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 11:
                    if (m3118v(i3, obj2)) {
                        AbstractC1235U2.m3203i(AbstractC1235U2.m3198d(j3, obj2), j3, obj);
                        m3116t(i3, obj);
                    }
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 12:
                    if (m3118v(i3, obj2)) {
                        AbstractC1235U2.m3203i(AbstractC1235U2.m3198d(j3, obj2), j3, obj);
                        m3116t(i3, obj);
                    }
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 13:
                    if (m3118v(i3, obj2)) {
                        AbstractC1235U2.m3203i(AbstractC1235U2.m3198d(j3, obj2), j3, obj);
                        m3116t(i3, obj);
                    }
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 14:
                    if (m3118v(i3, obj2)) {
                        AbstractC1235U2.m3204j(obj, j3, AbstractC1235U2.m3199e(j3, obj2));
                        m3116t(i3, obj);
                    }
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 15:
                    if (m3118v(i3, obj2)) {
                        AbstractC1235U2.m3203i(AbstractC1235U2.m3198d(j3, obj2), j3, obj);
                        m3116t(i3, obj);
                    }
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 16:
                    if (m3118v(i3, obj2)) {
                        AbstractC1235U2.m3204j(obj, j3, AbstractC1235U2.m3199e(j3, obj2));
                        m3116t(i3, obj);
                    }
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 17:
                    m3114r(obj, i3, obj2);
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f5552f.mo3352b(j3, obj, obj2);
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 50:
                    Class cls = AbstractC1192J2.f5645a;
                    Object objM3201g = AbstractC1235U2.m3201g(j3, obj);
                    Object objM3201g2 = AbstractC1235U2.m3201g(j3, obj2);
                    if (objM3201g != null) {
                        throw new ClassCastException();
                    }
                    objM3201g2.getClass();
                    throw new ClassCastException();
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (m3111j(i5, i3, obj2)) {
                        AbstractC1235U2.m3205k(j3, obj, AbstractC1235U2.m3201g(j3, obj2));
                        AbstractC1235U2.m3203i(i5, iArr[i3 + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 60:
                    m3115s(obj, i3, obj2);
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m3111j(i5, i3, obj2)) {
                        AbstractC1235U2.m3205k(j3, obj, AbstractC1235U2.m3201g(j3, obj2));
                        AbstractC1235U2.m3203i(i5, iArr[i3 + 2] & 1048575, obj);
                    }
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                case 68:
                    m3115s(obj, i3, obj2);
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
                default:
                    obj3 = obj;
                    i3 += 3;
                    obj = obj3;
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
      0x00db: PHI (r1v35 int) = (r1v11 int), (r1v36 int) binds: [B:85:0x01eb, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.cast.InterfaceC1188I2
    /* JADX INFO: renamed from: c */
    public final int mo3105c(AbstractC1282g2 abstractC1282g2) {
        int i3;
        long jDoubleToLongBits;
        int i4;
        int iFloatToIntBits;
        int i5;
        int i6;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.f5547a;
            if (i7 >= iArr.length) {
                this.f5553g.getClass();
                abstractC1282g2.zzc.getClass();
                return (i8 * 53) + 506991;
            }
            int iM3112n = m3112n(i7);
            int i9 = 1048575 & iM3112n;
            int iM3100m = m3100m(iM3112n);
            int i10 = iArr[i7];
            long j3 = i9;
            int i11 = 1237;
            int iHashCode = 37;
            switch (iM3100m) {
                case 0:
                    i3 = i8 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(AbstractC1235U2.f5716c.mo3185a(j3, abstractC1282g2));
                    Charset charset = AbstractC1306m2.f5927a;
                    i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i4 = i8 * 53;
                    iFloatToIntBits = Float.floatToIntBits(AbstractC1235U2.f5716c.mo3186b(j3, abstractC1282g2));
                    i8 = iFloatToIntBits + i4;
                    break;
                case 2:
                    i3 = i8 * 53;
                    jDoubleToLongBits = AbstractC1235U2.m3199e(j3, abstractC1282g2);
                    Charset charset2 = AbstractC1306m2.f5927a;
                    i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    i3 = i8 * 53;
                    jDoubleToLongBits = AbstractC1235U2.m3199e(j3, abstractC1282g2);
                    Charset charset3 = AbstractC1306m2.f5927a;
                    i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i4 = i8 * 53;
                    iFloatToIntBits = AbstractC1235U2.m3198d(j3, abstractC1282g2);
                    i8 = iFloatToIntBits + i4;
                    break;
                case 5:
                    i3 = i8 * 53;
                    jDoubleToLongBits = AbstractC1235U2.m3199e(j3, abstractC1282g2);
                    Charset charset4 = AbstractC1306m2.f5927a;
                    i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i4 = i8 * 53;
                    iFloatToIntBits = AbstractC1235U2.m3198d(j3, abstractC1282g2);
                    i8 = iFloatToIntBits + i4;
                    break;
                case 7:
                    i5 = i8 * 53;
                    boolean zMo3191g = AbstractC1235U2.f5716c.mo3191g(j3, abstractC1282g2);
                    Charset charset5 = AbstractC1306m2.f5927a;
                    if (zMo3191g) {
                        i11 = 1231;
                    }
                    i8 = i11 + i5;
                    break;
                case 8:
                    i4 = i8 * 53;
                    iFloatToIntBits = ((String) AbstractC1235U2.m3201g(j3, abstractC1282g2)).hashCode();
                    i8 = iFloatToIntBits + i4;
                    break;
                case 9:
                    i6 = i8 * 53;
                    Object objM3201g = AbstractC1235U2.m3201g(j3, abstractC1282g2);
                    if (objM3201g != null) {
                        iHashCode = objM3201g.hashCode();
                    }
                    i8 = i6 + iHashCode;
                    break;
                case 10:
                    i4 = i8 * 53;
                    iFloatToIntBits = AbstractC1235U2.m3201g(j3, abstractC1282g2).hashCode();
                    i8 = iFloatToIntBits + i4;
                    break;
                case 11:
                    i4 = i8 * 53;
                    iFloatToIntBits = AbstractC1235U2.m3198d(j3, abstractC1282g2);
                    i8 = iFloatToIntBits + i4;
                    break;
                case 12:
                    i4 = i8 * 53;
                    iFloatToIntBits = AbstractC1235U2.m3198d(j3, abstractC1282g2);
                    i8 = iFloatToIntBits + i4;
                    break;
                case 13:
                    i4 = i8 * 53;
                    iFloatToIntBits = AbstractC1235U2.m3198d(j3, abstractC1282g2);
                    i8 = iFloatToIntBits + i4;
                    break;
                case 14:
                    i3 = i8 * 53;
                    jDoubleToLongBits = AbstractC1235U2.m3199e(j3, abstractC1282g2);
                    Charset charset6 = AbstractC1306m2.f5927a;
                    i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i4 = i8 * 53;
                    iFloatToIntBits = AbstractC1235U2.m3198d(j3, abstractC1282g2);
                    i8 = iFloatToIntBits + i4;
                    break;
                case 16:
                    i3 = i8 * 53;
                    jDoubleToLongBits = AbstractC1235U2.m3199e(j3, abstractC1282g2);
                    Charset charset7 = AbstractC1306m2.f5927a;
                    i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i6 = i8 * 53;
                    Object objM3201g2 = AbstractC1235U2.m3201g(j3, abstractC1282g2);
                    if (objM3201g2 != null) {
                        iHashCode = objM3201g2.hashCode();
                    }
                    i8 = i6 + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i4 = i8 * 53;
                    iFloatToIntBits = AbstractC1235U2.m3201g(j3, abstractC1282g2).hashCode();
                    i8 = iFloatToIntBits + i4;
                    break;
                case 50:
                    i4 = i8 * 53;
                    iFloatToIntBits = AbstractC1235U2.m3201g(j3, abstractC1282g2).hashCode();
                    i8 = iFloatToIntBits + i4;
                    break;
                case 51:
                    if (m3111j(i10, i7, abstractC1282g2)) {
                        i3 = i8 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) AbstractC1235U2.m3201g(j3, abstractC1282g2)).doubleValue());
                        Charset charset8 = AbstractC1306m2.f5927a;
                        i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (m3111j(i10, i7, abstractC1282g2)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) AbstractC1235U2.m3201g(j3, abstractC1282g2)).floatValue());
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 53:
                    if (m3111j(i10, i7, abstractC1282g2)) {
                        i3 = i8 * 53;
                        jDoubleToLongBits = m3101o(j3, abstractC1282g2);
                        Charset charset9 = AbstractC1306m2.f5927a;
                        i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (m3111j(i10, i7, abstractC1282g2)) {
                        i3 = i8 * 53;
                        jDoubleToLongBits = m3101o(j3, abstractC1282g2);
                        Charset charset10 = AbstractC1306m2.f5927a;
                        i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (m3111j(i10, i7, abstractC1282g2)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = m3099l(j3, abstractC1282g2);
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 56:
                    if (m3111j(i10, i7, abstractC1282g2)) {
                        i3 = i8 * 53;
                        jDoubleToLongBits = m3101o(j3, abstractC1282g2);
                        Charset charset11 = AbstractC1306m2.f5927a;
                        i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (m3111j(i10, i7, abstractC1282g2)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = m3099l(j3, abstractC1282g2);
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 58:
                    if (m3111j(i10, i7, abstractC1282g2)) {
                        i5 = i8 * 53;
                        boolean zBooleanValue = ((Boolean) AbstractC1235U2.m3201g(j3, abstractC1282g2)).booleanValue();
                        Charset charset12 = AbstractC1306m2.f5927a;
                        if (zBooleanValue) {
                            i11 = 1231;
                        }
                        i8 = i11 + i5;
                    }
                    break;
                case 59:
                    if (m3111j(i10, i7, abstractC1282g2)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = ((String) AbstractC1235U2.m3201g(j3, abstractC1282g2)).hashCode();
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 60:
                    if (m3111j(i10, i7, abstractC1282g2)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = AbstractC1235U2.m3201g(j3, abstractC1282g2).hashCode();
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 61:
                    if (m3111j(i10, i7, abstractC1282g2)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = AbstractC1235U2.m3201g(j3, abstractC1282g2).hashCode();
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 62:
                    if (m3111j(i10, i7, abstractC1282g2)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = m3099l(j3, abstractC1282g2);
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 63:
                    if (m3111j(i10, i7, abstractC1282g2)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = m3099l(j3, abstractC1282g2);
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 64:
                    if (m3111j(i10, i7, abstractC1282g2)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = m3099l(j3, abstractC1282g2);
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 65:
                    if (m3111j(i10, i7, abstractC1282g2)) {
                        i3 = i8 * 53;
                        jDoubleToLongBits = m3101o(j3, abstractC1282g2);
                        Charset charset13 = AbstractC1306m2.f5927a;
                        i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (m3111j(i10, i7, abstractC1282g2)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = m3099l(j3, abstractC1282g2);
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
                case 67:
                    if (m3111j(i10, i7, abstractC1282g2)) {
                        i3 = i8 * 53;
                        jDoubleToLongBits = m3101o(j3, abstractC1282g2);
                        Charset charset14 = AbstractC1306m2.f5927a;
                        i8 = i3 + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (m3111j(i10, i7, abstractC1282g2)) {
                        i4 = i8 * 53;
                        iFloatToIntBits = AbstractC1235U2.m3201g(j3, abstractC1282g2).hashCode();
                        i8 = iFloatToIntBits + i4;
                    }
                    break;
            }
            i7 += 3;
        }
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1188I2
    /* JADX INFO: renamed from: d */
    public final boolean mo3106d(AbstractC1282g2 abstractC1282g2, AbstractC1282g2 abstractC1282g3) {
        boolean zM3154e;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f5547a;
            if (i3 < iArr.length) {
                int iM3112n = m3112n(i3);
                long j3 = iM3112n & 1048575;
                switch (m3100m(iM3112n)) {
                    case 0:
                        if (m3117u(abstractC1282g2, abstractC1282g3, i3)) {
                            AbstractC1231T2 abstractC1231T2 = AbstractC1235U2.f5716c;
                            if (Double.doubleToLongBits(abstractC1231T2.mo3185a(j3, abstractC1282g2)) == Double.doubleToLongBits(abstractC1231T2.mo3185a(j3, abstractC1282g3))) {
                                continue;
                                i3 += 3;
                            }
                        }
                        break;
                    case 1:
                        if (m3117u(abstractC1282g2, abstractC1282g3, i3)) {
                            AbstractC1231T2 abstractC1231T3 = AbstractC1235U2.f5716c;
                            if (Float.floatToIntBits(abstractC1231T3.mo3186b(j3, abstractC1282g2)) == Float.floatToIntBits(abstractC1231T3.mo3186b(j3, abstractC1282g3))) {
                                continue;
                                i3 += 3;
                            }
                        }
                        break;
                    case 2:
                        if (m3117u(abstractC1282g2, abstractC1282g3, i3) && AbstractC1235U2.m3199e(j3, abstractC1282g2) == AbstractC1235U2.m3199e(j3, abstractC1282g3)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case ModuleDescriptor.MODULE_VERSION /* 3 */:
                        if (m3117u(abstractC1282g2, abstractC1282g3, i3) && AbstractC1235U2.m3199e(j3, abstractC1282g2) == AbstractC1235U2.m3199e(j3, abstractC1282g3)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 4:
                        if (m3117u(abstractC1282g2, abstractC1282g3, i3) && AbstractC1235U2.m3198d(j3, abstractC1282g2) == AbstractC1235U2.m3198d(j3, abstractC1282g3)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 5:
                        if (m3117u(abstractC1282g2, abstractC1282g3, i3) && AbstractC1235U2.m3199e(j3, abstractC1282g2) == AbstractC1235U2.m3199e(j3, abstractC1282g3)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 6:
                        if (m3117u(abstractC1282g2, abstractC1282g3, i3) && AbstractC1235U2.m3198d(j3, abstractC1282g2) == AbstractC1235U2.m3198d(j3, abstractC1282g3)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 7:
                        if (m3117u(abstractC1282g2, abstractC1282g3, i3)) {
                            AbstractC1231T2 abstractC1231T4 = AbstractC1235U2.f5716c;
                            if (abstractC1231T4.mo3191g(j3, abstractC1282g2) == abstractC1231T4.mo3191g(j3, abstractC1282g3)) {
                                continue;
                                i3 += 3;
                            }
                        }
                        break;
                    case 8:
                        if (m3117u(abstractC1282g2, abstractC1282g3, i3) && AbstractC1192J2.m3154e(AbstractC1235U2.m3201g(j3, abstractC1282g2), AbstractC1235U2.m3201g(j3, abstractC1282g3))) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 9:
                        if (m3117u(abstractC1282g2, abstractC1282g3, i3) && AbstractC1192J2.m3154e(AbstractC1235U2.m3201g(j3, abstractC1282g2), AbstractC1235U2.m3201g(j3, abstractC1282g3))) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 10:
                        if (m3117u(abstractC1282g2, abstractC1282g3, i3) && AbstractC1192J2.m3154e(AbstractC1235U2.m3201g(j3, abstractC1282g2), AbstractC1235U2.m3201g(j3, abstractC1282g3))) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 11:
                        if (m3117u(abstractC1282g2, abstractC1282g3, i3) && AbstractC1235U2.m3198d(j3, abstractC1282g2) == AbstractC1235U2.m3198d(j3, abstractC1282g3)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 12:
                        if (m3117u(abstractC1282g2, abstractC1282g3, i3) && AbstractC1235U2.m3198d(j3, abstractC1282g2) == AbstractC1235U2.m3198d(j3, abstractC1282g3)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 13:
                        if (m3117u(abstractC1282g2, abstractC1282g3, i3) && AbstractC1235U2.m3198d(j3, abstractC1282g2) == AbstractC1235U2.m3198d(j3, abstractC1282g3)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 14:
                        if (m3117u(abstractC1282g2, abstractC1282g3, i3) && AbstractC1235U2.m3199e(j3, abstractC1282g2) == AbstractC1235U2.m3199e(j3, abstractC1282g3)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 15:
                        if (m3117u(abstractC1282g2, abstractC1282g3, i3) && AbstractC1235U2.m3198d(j3, abstractC1282g2) == AbstractC1235U2.m3198d(j3, abstractC1282g3)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 16:
                        if (m3117u(abstractC1282g2, abstractC1282g3, i3) && AbstractC1235U2.m3199e(j3, abstractC1282g2) == AbstractC1235U2.m3199e(j3, abstractC1282g3)) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 17:
                        if (m3117u(abstractC1282g2, abstractC1282g3, i3) && AbstractC1192J2.m3154e(AbstractC1235U2.m3201g(j3, abstractC1282g2), AbstractC1235U2.m3201g(j3, abstractC1282g3))) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zM3154e = AbstractC1192J2.m3154e(AbstractC1235U2.m3201g(j3, abstractC1282g2), AbstractC1235U2.m3201g(j3, abstractC1282g3));
                        break;
                    case 50:
                        zM3154e = AbstractC1192J2.m3154e(AbstractC1235U2.m3201g(j3, abstractC1282g2), AbstractC1235U2.m3201g(j3, abstractC1282g3));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j4 = iArr[i3 + 2] & 1048575;
                        if (AbstractC1235U2.m3198d(j4, abstractC1282g2) == AbstractC1235U2.m3198d(j4, abstractC1282g3) && AbstractC1192J2.m3154e(AbstractC1235U2.m3201g(j3, abstractC1282g2), AbstractC1235U2.m3201g(j3, abstractC1282g3))) {
                            continue;
                            i3 += 3;
                        }
                        break;
                    default:
                        continue;
                        i3 += 3;
                        break;
                }
                if (zM3154e) {
                    i3 += 3;
                }
            } else {
                this.f5553g.getClass();
                if (abstractC1282g2.zzc.equals(abstractC1282g3.zzc)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:192:0x04f7  */
    @Override // com.google.android.gms.internal.cast.InterfaceC1188I2
    /* JADX INFO: renamed from: e */
    public final int mo3107e(AbstractC1282g2 abstractC1282g2) {
        int i3;
        int i4;
        int iMo3193a;
        int iM3222M;
        int iM3157h;
        int iM3222M2;
        int size;
        int iM3163n;
        int iM3222M3;
        int iM3222M4;
        int iM3222M5;
        int iM3222M6;
        int iM3222M7;
        int iM3223N;
        int i5;
        C1156A2 c1156a2 = this;
        AbstractC1282g2 abstractC1282g3 = abstractC1282g2;
        Unsafe unsafe = f5546i;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 1048575;
        int i9 = 0;
        int iM1164d = 0;
        while (true) {
            int[] iArr = c1156a2.f5547a;
            if (i7 >= iArr.length) {
                c1156a2.f5553g.getClass();
                C1200L2 c1200l2 = abstractC1282g3.zzc;
                int i10 = c1200l2.f5657c;
                if (i10 == -1) {
                    c1200l2.f5657c = 0;
                    i3 = 0;
                } else {
                    i3 = i10;
                }
                return i3 + iM1164d;
            }
            int iM3112n = c1156a2.m3112n(i7);
            int iM3100m = m3100m(iM3112n);
            int i11 = iArr[i7];
            int i12 = iArr[i7 + 2];
            int i13 = i12 & i6;
            if (iM3100m <= 17) {
                if (i13 != i8) {
                    i9 = i13 == i6 ? 0 : unsafe.getInt(abstractC1282g3, i13);
                    i8 = i13;
                }
                i4 = 1 << (i12 >>> 20);
            } else {
                i4 = 0;
            }
            int i14 = iM3112n & i6;
            if (iM3100m >= EnumC1270d2.f5831h.f5835g) {
                EnumC1270d2.f5832i.getClass();
            }
            long j3 = i14;
            switch (iM3100m) {
                case 0:
                    if (c1156a2.m3119w(abstractC1282g3, i7, i8, i9, i4)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, 8, iM1164d);
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 1:
                    if (c1156a2.m3119w(abstractC1282g3, i7, i8, i9, i4)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, 4, iM1164d);
                    }
                    c1156a2 = this;
                    abstractC1282g3 = abstractC1282g2;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 2:
                    if (c1156a2.m3119w(abstractC1282g3, i7, i8, i9, i4)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, C1254Z1.m3223N(unsafe.getLong(abstractC1282g3, j3)), iM1164d);
                    }
                    c1156a2 = this;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    if (c1156a2.m3119w(abstractC1282g3, i7, i8, i9, i4)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, C1254Z1.m3223N(unsafe.getLong(abstractC1282g3, j3)), iM1164d);
                    }
                    c1156a2 = this;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 4:
                    if (c1156a2.m3119w(abstractC1282g3, i7, i8, i9, i4)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, C1254Z1.m3220K(unsafe.getInt(abstractC1282g3, j3)), iM1164d);
                    }
                    c1156a2 = this;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 5:
                    if (c1156a2.m3119w(abstractC1282g3, i7, i8, i9, i4)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, 8, iM1164d);
                    }
                    c1156a2 = this;
                    abstractC1282g3 = abstractC1282g2;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 6:
                    if (c1156a2.m3119w(abstractC1282g3, i7, i8, i9, i4)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, 4, iM1164d);
                    }
                    c1156a2 = this;
                    abstractC1282g3 = abstractC1282g2;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 7:
                    if (c1156a2.m3119w(abstractC1282g3, i7, i8, i9, i4)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, 1, iM1164d);
                    }
                    c1156a2 = this;
                    abstractC1282g3 = abstractC1282g2;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 8:
                    if (c1156a2.m3119w(abstractC1282g3, i7, i8, i9, i4)) {
                        int i15 = i11 << 3;
                        Object object = unsafe.getObject(abstractC1282g3, j3);
                        if (object instanceof C1250Y1) {
                            Logger logger = C1254Z1.f5753j;
                            int iMo3215h = ((C1250Y1) object).mo3215h();
                            iM1164d = AbstractC0462h.m1164d(i15, C1254Z1.m3222M(iMo3215h) + iMo3215h, iM1164d);
                        } else {
                            iM1164d = AbstractC0462h.m1164d(i15, C1254Z1.m3221L((String) object), iM1164d);
                        }
                    }
                    c1156a2 = this;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 9:
                    if (c1156a2.m3119w(abstractC1282g3, i7, i8, i9, i4)) {
                        Object object2 = unsafe.getObject(abstractC1282g3, j3);
                        InterfaceC1188I2 interfaceC1188I2M3113p = c1156a2.m3113p(i7);
                        Class cls = AbstractC1192J2.f5645a;
                        Logger logger2 = C1254Z1.f5753j;
                        int iMo3193a2 = ((AbstractC1230T1) object2).mo3193a(interfaceC1188I2M3113p);
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, C1254Z1.m3222M(iMo3193a2) + iMo3193a2, iM1164d);
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 10:
                    if (c1156a2.m3119w(abstractC1282g3, i7, i8, i9, i4)) {
                        C1250Y1 c1250y1 = (C1250Y1) unsafe.getObject(abstractC1282g3, j3);
                        Logger logger3 = C1254Z1.f5753j;
                        int iMo3215h2 = c1250y1.mo3215h();
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, C1254Z1.m3222M(iMo3215h2) + iMo3215h2, iM1164d);
                    }
                    c1156a2 = this;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 11:
                    if (c1156a2.m3119w(abstractC1282g3, i7, i8, i9, i4)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, C1254Z1.m3222M(unsafe.getInt(abstractC1282g3, j3)), iM1164d);
                    }
                    c1156a2 = this;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 12:
                    if (c1156a2.m3119w(abstractC1282g3, i7, i8, i9, i4)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, C1254Z1.m3220K(unsafe.getInt(abstractC1282g3, j3)), iM1164d);
                    }
                    c1156a2 = this;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 13:
                    if (c1156a2.m3119w(abstractC1282g3, i7, i8, i9, i4)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, 4, iM1164d);
                    }
                    c1156a2 = this;
                    abstractC1282g3 = abstractC1282g2;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 14:
                    if (c1156a2.m3119w(abstractC1282g3, i7, i8, i9, i4)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, 8, iM1164d);
                    }
                    c1156a2 = this;
                    abstractC1282g3 = abstractC1282g2;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 15:
                    if (c1156a2.m3119w(abstractC1282g3, i7, i8, i9, i4)) {
                        int i16 = unsafe.getInt(abstractC1282g3, j3);
                        iM1164d = AbstractC0462h.m1164d((i16 >> 31) ^ (i16 + i16), C1254Z1.m3222M(i11 << 3), iM1164d);
                    }
                    c1156a2 = this;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 16:
                    if (c1156a2.m3119w(abstractC1282g3, i7, i8, i9, i4)) {
                        long j4 = unsafe.getLong(abstractC1282g3, j3);
                        iM1164d += C1254Z1.m3223N((j4 >> 63) ^ (j4 + j4)) + C1254Z1.m3222M(i11 << 3);
                    }
                    c1156a2 = this;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 17:
                    if (c1156a2.m3119w(abstractC1282g3, i7, i8, i9, i4)) {
                        AbstractC1230T1 abstractC1230T1 = (AbstractC1230T1) unsafe.getObject(abstractC1282g3, j3);
                        InterfaceC1188I2 interfaceC1188I2M3113p2 = c1156a2.m3113p(i7);
                        Logger logger4 = C1254Z1.f5753j;
                        iMo3193a = abstractC1230T1.mo3193a(interfaceC1188I2M3113p2);
                        iM3222M = C1254Z1.m3222M(i11 << 3);
                        iM3223N = iM3222M + iM3222M;
                        iM1164d += iM3223N + iMo3193a;
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 18:
                    iM3157h = AbstractC1192J2.m3157h(i11, (List) unsafe.getObject(abstractC1282g3, j3));
                    iM1164d += iM3157h;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 19:
                    iM3157h = AbstractC1192J2.m3156g(i11, (List) unsafe.getObject(abstractC1282g3, j3));
                    iM1164d += iM3157h;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC1282g3, j3);
                    Class cls2 = AbstractC1192J2.f5645a;
                    if (list.size() == 0) {
                        iM3222M2 = 0;
                    } else {
                        iM3222M2 = (C1254Z1.m3222M(i11 << 3) * list.size()) + AbstractC1192J2.m3159j(list);
                    }
                    iM1164d += iM3222M2;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC1282g3, j3);
                    Class cls3 = AbstractC1192J2.f5645a;
                    size = list2.size();
                    if (size == 0) {
                        iM3222M4 = 0;
                    } else {
                        iM3163n = AbstractC1192J2.m3163n(list2);
                        iM3222M3 = C1254Z1.m3222M(i11 << 3);
                        iM3222M4 = (iM3222M3 * size) + iM3163n;
                    }
                    iM1164d += iM3222M4;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC1282g3, j3);
                    Class cls4 = AbstractC1192J2.f5645a;
                    size = list3.size();
                    if (size == 0) {
                        iM3222M4 = 0;
                    } else {
                        iM3163n = AbstractC1192J2.m3158i(list3);
                        iM3222M3 = C1254Z1.m3222M(i11 << 3);
                        iM3222M4 = (iM3222M3 * size) + iM3163n;
                    }
                    iM1164d += iM3222M4;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 23:
                    iM3157h = AbstractC1192J2.m3157h(i11, (List) unsafe.getObject(abstractC1282g3, j3));
                    iM1164d += iM3157h;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 24:
                    iM3157h = AbstractC1192J2.m3156g(i11, (List) unsafe.getObject(abstractC1282g3, j3));
                    iM1164d += iM3157h;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC1282g3, j3);
                    Class cls5 = AbstractC1192J2.f5645a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iM3222M2 = 0;
                    } else {
                        iM3222M2 = (C1254Z1.m3222M(i11 << 3) + 1) * size2;
                    }
                    iM1164d += iM3222M2;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC1282g3, j3);
                    Class cls6 = AbstractC1192J2.f5645a;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iM3222M4 = 0;
                    } else {
                        boolean z3 = list5 instanceof InterfaceC1318p2;
                        iM3222M4 = C1254Z1.m3222M(i11 << 3) * size3;
                        if (z3) {
                            InterfaceC1318p2 interfaceC1318p2 = (InterfaceC1318p2) list5;
                            for (int i17 = 0; i17 < size3; i17++) {
                                Object objMo3183d = interfaceC1318p2.mo3183d(i17);
                                if (objMo3183d instanceof C1250Y1) {
                                    int iMo3215h3 = ((C1250Y1) objMo3183d).mo3215h();
                                    iM3222M4 = AbstractC0462h.m1164d(iMo3215h3, iMo3215h3, iM3222M4);
                                } else {
                                    iM3222M4 = C1254Z1.m3221L((String) objMo3183d) + iM3222M4;
                                }
                            }
                        } else {
                            for (int i18 = 0; i18 < size3; i18++) {
                                Object obj = list5.get(i18);
                                if (obj instanceof C1250Y1) {
                                    int iMo3215h4 = ((C1250Y1) obj).mo3215h();
                                    iM3222M4 = AbstractC0462h.m1164d(iMo3215h4, iMo3215h4, iM3222M4);
                                } else {
                                    iM3222M4 = C1254Z1.m3221L((String) obj) + iM3222M4;
                                }
                            }
                        }
                    }
                    iM1164d += iM3222M4;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC1282g3, j3);
                    InterfaceC1188I2 interfaceC1188I2M3113p3 = c1156a2.m3113p(i7);
                    Class cls7 = AbstractC1192J2.f5645a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        iM3222M5 = 0;
                    } else {
                        iM3222M5 = C1254Z1.m3222M(i11 << 3) * size4;
                        for (int i19 = 0; i19 < size4; i19++) {
                            int iMo3193a3 = ((AbstractC1230T1) list6.get(i19)).mo3193a(interfaceC1188I2M3113p3);
                            iM3222M5 = AbstractC0462h.m1164d(iMo3193a3, iMo3193a3, iM3222M5);
                        }
                    }
                    iM1164d += iM3222M5;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC1282g3, j3);
                    Class cls8 = AbstractC1192J2.f5645a;
                    int size5 = list7.size();
                    if (size5 == 0) {
                        iM3222M4 = 0;
                    } else {
                        iM3222M4 = C1254Z1.m3222M(i11 << 3) * size5;
                        for (int i20 = 0; i20 < list7.size(); i20++) {
                            int iMo3215h5 = ((C1250Y1) list7.get(i20)).mo3215h();
                            iM3222M4 = AbstractC0462h.m1164d(iMo3215h5, iMo3215h5, iM3222M4);
                        }
                    }
                    iM1164d += iM3222M4;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC1282g3, j3);
                    Class cls9 = AbstractC1192J2.f5645a;
                    size = list8.size();
                    if (size == 0) {
                        iM3222M4 = 0;
                    } else {
                        iM3163n = AbstractC1192J2.m3162m(list8);
                        iM3222M3 = C1254Z1.m3222M(i11 << 3);
                        iM3222M4 = (iM3222M3 * size) + iM3163n;
                    }
                    iM1164d += iM3222M4;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC1282g3, j3);
                    Class cls10 = AbstractC1192J2.f5645a;
                    size = list9.size();
                    if (size == 0) {
                        iM3222M4 = 0;
                    } else {
                        iM3163n = AbstractC1192J2.m3155f(list9);
                        iM3222M3 = C1254Z1.m3222M(i11 << 3);
                        iM3222M4 = (iM3222M3 * size) + iM3163n;
                    }
                    iM1164d += iM3222M4;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 31:
                    iM3157h = AbstractC1192J2.m3156g(i11, (List) unsafe.getObject(abstractC1282g3, j3));
                    iM1164d += iM3157h;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 32:
                    iM3157h = AbstractC1192J2.m3157h(i11, (List) unsafe.getObject(abstractC1282g3, j3));
                    iM1164d += iM3157h;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC1282g3, j3);
                    Class cls11 = AbstractC1192J2.f5645a;
                    size = list10.size();
                    if (size == 0) {
                        iM3222M4 = 0;
                    } else {
                        iM3163n = AbstractC1192J2.m3160k(list10);
                        iM3222M3 = C1254Z1.m3222M(i11 << 3);
                        iM3222M4 = (iM3222M3 * size) + iM3163n;
                    }
                    iM1164d += iM3222M4;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC1282g3, j3);
                    Class cls12 = AbstractC1192J2.f5645a;
                    size = list11.size();
                    if (size == 0) {
                        iM3222M4 = 0;
                    } else {
                        iM3163n = AbstractC1192J2.m3161l(list11);
                        iM3222M3 = C1254Z1.m3222M(i11 << 3);
                        iM3222M4 = (iM3222M3 * size) + iM3163n;
                    }
                    iM1164d += iM3222M4;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC1282g3, j3);
                    Class cls13 = AbstractC1192J2.f5645a;
                    iMo3193a = list12.size() * 8;
                    if (iMo3193a > 0) {
                        iM3222M6 = C1254Z1.m3222M(iMo3193a);
                        iM3222M7 = C1254Z1.m3222M(i11 << 3);
                        iM3223N = iM3222M7 + iM3222M6;
                        iM1164d += iM3223N + iMo3193a;
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(abstractC1282g3, j3);
                    Class cls14 = AbstractC1192J2.f5645a;
                    iMo3193a = list13.size() * 4;
                    if (iMo3193a > 0) {
                        iM3222M6 = C1254Z1.m3222M(iMo3193a);
                        iM3222M7 = C1254Z1.m3222M(i11 << 3);
                        iM3223N = iM3222M7 + iM3222M6;
                        iM1164d += iM3223N + iMo3193a;
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 37:
                    iMo3193a = AbstractC1192J2.m3159j((List) unsafe.getObject(abstractC1282g3, j3));
                    if (iMo3193a > 0) {
                        iM3222M6 = C1254Z1.m3222M(iMo3193a);
                        iM3222M7 = C1254Z1.m3222M(i11 << 3);
                        iM3223N = iM3222M7 + iM3222M6;
                        iM1164d += iM3223N + iMo3193a;
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 38:
                    iMo3193a = AbstractC1192J2.m3163n((List) unsafe.getObject(abstractC1282g3, j3));
                    if (iMo3193a > 0) {
                        iM3222M6 = C1254Z1.m3222M(iMo3193a);
                        iM3222M7 = C1254Z1.m3222M(i11 << 3);
                        iM3223N = iM3222M7 + iM3222M6;
                        iM1164d += iM3223N + iMo3193a;
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 39:
                    iMo3193a = AbstractC1192J2.m3158i((List) unsafe.getObject(abstractC1282g3, j3));
                    if (iMo3193a > 0) {
                        iM3222M6 = C1254Z1.m3222M(iMo3193a);
                        iM3222M7 = C1254Z1.m3222M(i11 << 3);
                        iM3223N = iM3222M7 + iM3222M6;
                        iM1164d += iM3223N + iMo3193a;
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(abstractC1282g3, j3);
                    Class cls15 = AbstractC1192J2.f5645a;
                    iMo3193a = list14.size() * 8;
                    if (iMo3193a > 0) {
                        iM3222M6 = C1254Z1.m3222M(iMo3193a);
                        iM3222M7 = C1254Z1.m3222M(i11 << 3);
                        iM3223N = iM3222M7 + iM3222M6;
                        iM1164d += iM3223N + iMo3193a;
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC1282g3, j3);
                    Class cls16 = AbstractC1192J2.f5645a;
                    iMo3193a = list15.size() * 4;
                    if (iMo3193a > 0) {
                        iM3222M6 = C1254Z1.m3222M(iMo3193a);
                        iM3222M7 = C1254Z1.m3222M(i11 << 3);
                        iM3223N = iM3222M7 + iM3222M6;
                        iM1164d += iM3223N + iMo3193a;
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC1282g3, j3);
                    Class cls17 = AbstractC1192J2.f5645a;
                    iMo3193a = list16.size();
                    if (iMo3193a > 0) {
                        iM3222M6 = C1254Z1.m3222M(iMo3193a);
                        iM3222M7 = C1254Z1.m3222M(i11 << 3);
                        iM3223N = iM3222M7 + iM3222M6;
                        iM1164d += iM3223N + iMo3193a;
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 43:
                    iMo3193a = AbstractC1192J2.m3162m((List) unsafe.getObject(abstractC1282g3, j3));
                    if (iMo3193a > 0) {
                        iM3222M6 = C1254Z1.m3222M(iMo3193a);
                        iM3222M7 = C1254Z1.m3222M(i11 << 3);
                        iM3223N = iM3222M7 + iM3222M6;
                        iM1164d += iM3223N + iMo3193a;
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 44:
                    iMo3193a = AbstractC1192J2.m3155f((List) unsafe.getObject(abstractC1282g3, j3));
                    if (iMo3193a > 0) {
                        iM3222M6 = C1254Z1.m3222M(iMo3193a);
                        iM3222M7 = C1254Z1.m3222M(i11 << 3);
                        iM3223N = iM3222M7 + iM3222M6;
                        iM1164d += iM3223N + iMo3193a;
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(abstractC1282g3, j3);
                    Class cls18 = AbstractC1192J2.f5645a;
                    iMo3193a = list17.size() * 4;
                    if (iMo3193a > 0) {
                        iM3222M6 = C1254Z1.m3222M(iMo3193a);
                        iM3222M7 = C1254Z1.m3222M(i11 << 3);
                        iM3223N = iM3222M7 + iM3222M6;
                        iM1164d += iM3223N + iMo3193a;
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC1282g3, j3);
                    Class cls19 = AbstractC1192J2.f5645a;
                    iMo3193a = list18.size() * 8;
                    if (iMo3193a > 0) {
                        iM3222M6 = C1254Z1.m3222M(iMo3193a);
                        iM3222M7 = C1254Z1.m3222M(i11 << 3);
                        iM3223N = iM3222M7 + iM3222M6;
                        iM1164d += iM3223N + iMo3193a;
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 47:
                    iMo3193a = AbstractC1192J2.m3160k((List) unsafe.getObject(abstractC1282g3, j3));
                    if (iMo3193a > 0) {
                        iM3222M6 = C1254Z1.m3222M(iMo3193a);
                        iM3222M7 = C1254Z1.m3222M(i11 << 3);
                        iM3223N = iM3222M7 + iM3222M6;
                        iM1164d += iM3223N + iMo3193a;
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 48:
                    iMo3193a = AbstractC1192J2.m3161l((List) unsafe.getObject(abstractC1282g3, j3));
                    if (iMo3193a > 0) {
                        iM3222M6 = C1254Z1.m3222M(iMo3193a);
                        iM3222M7 = C1254Z1.m3222M(i11 << 3);
                        iM3223N = iM3222M7 + iM3222M6;
                        iM1164d += iM3223N + iMo3193a;
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC1282g3, j3);
                    InterfaceC1188I2 interfaceC1188I2M3113p4 = c1156a2.m3113p(i7);
                    Class cls20 = AbstractC1192J2.f5645a;
                    int size6 = list19.size();
                    if (size6 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i21 = 0; i21 < size6; i21++) {
                            AbstractC1230T1 abstractC1230T2 = (AbstractC1230T1) list19.get(i21);
                            Logger logger5 = C1254Z1.f5753j;
                            int iMo3193a4 = abstractC1230T2.mo3193a(interfaceC1188I2M3113p4);
                            int iM3222M8 = C1254Z1.m3222M(i11 << 3);
                            i5 = iM3222M8 + iM3222M8 + iMo3193a4 + i5;
                        }
                    }
                    iM1164d += i5;
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 50:
                    Object object3 = unsafe.getObject(abstractC1282g3, j3);
                    int i22 = i7 / 3;
                    Object obj2 = c1156a2.f5548b[i22 + i22];
                    if (object3 != null) {
                        throw new ClassCastException();
                    }
                    obj2.getClass();
                    throw new ClassCastException();
                case 51:
                    if (c1156a2.m3111j(i11, i7, abstractC1282g3)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, 8, iM1164d);
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 52:
                    if (c1156a2.m3111j(i11, i7, abstractC1282g3)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, 4, iM1164d);
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 53:
                    if (c1156a2.m3111j(i11, i7, abstractC1282g3)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, C1254Z1.m3223N(m3101o(j3, abstractC1282g3)), iM1164d);
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 54:
                    if (c1156a2.m3111j(i11, i7, abstractC1282g3)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, C1254Z1.m3223N(m3101o(j3, abstractC1282g3)), iM1164d);
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 55:
                    if (c1156a2.m3111j(i11, i7, abstractC1282g3)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, C1254Z1.m3220K(m3099l(j3, abstractC1282g3)), iM1164d);
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 56:
                    if (c1156a2.m3111j(i11, i7, abstractC1282g3)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, 8, iM1164d);
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 57:
                    if (c1156a2.m3111j(i11, i7, abstractC1282g3)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, 4, iM1164d);
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 58:
                    if (c1156a2.m3111j(i11, i7, abstractC1282g3)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, 1, iM1164d);
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 59:
                    if (c1156a2.m3111j(i11, i7, abstractC1282g3)) {
                        int i23 = i11 << 3;
                        Object object4 = unsafe.getObject(abstractC1282g3, j3);
                        if (object4 instanceof C1250Y1) {
                            Logger logger6 = C1254Z1.f5753j;
                            int iMo3215h6 = ((C1250Y1) object4).mo3215h();
                            iM1164d = AbstractC0462h.m1164d(i23, C1254Z1.m3222M(iMo3215h6) + iMo3215h6, iM1164d);
                        } else {
                            iM1164d = AbstractC0462h.m1164d(i23, C1254Z1.m3221L((String) object4), iM1164d);
                        }
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 60:
                    if (c1156a2.m3111j(i11, i7, abstractC1282g3)) {
                        Object object5 = unsafe.getObject(abstractC1282g3, j3);
                        InterfaceC1188I2 interfaceC1188I2M3113p5 = c1156a2.m3113p(i7);
                        Class cls21 = AbstractC1192J2.f5645a;
                        Logger logger7 = C1254Z1.f5753j;
                        int iMo3193a5 = ((AbstractC1230T1) object5).mo3193a(interfaceC1188I2M3113p5);
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, C1254Z1.m3222M(iMo3193a5) + iMo3193a5, iM1164d);
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 61:
                    if (c1156a2.m3111j(i11, i7, abstractC1282g3)) {
                        C1250Y1 c1250y2 = (C1250Y1) unsafe.getObject(abstractC1282g3, j3);
                        Logger logger8 = C1254Z1.f5753j;
                        int iMo3215h7 = c1250y2.mo3215h();
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, C1254Z1.m3222M(iMo3215h7) + iMo3215h7, iM1164d);
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 62:
                    if (c1156a2.m3111j(i11, i7, abstractC1282g3)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, C1254Z1.m3222M(m3099l(j3, abstractC1282g3)), iM1164d);
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 63:
                    if (c1156a2.m3111j(i11, i7, abstractC1282g3)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, C1254Z1.m3220K(m3099l(j3, abstractC1282g3)), iM1164d);
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 64:
                    if (c1156a2.m3111j(i11, i7, abstractC1282g3)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, 4, iM1164d);
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 65:
                    if (c1156a2.m3111j(i11, i7, abstractC1282g3)) {
                        iM1164d = AbstractC0462h.m1164d(i11 << 3, 8, iM1164d);
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 66:
                    if (c1156a2.m3111j(i11, i7, abstractC1282g3)) {
                        int iM3099l = m3099l(j3, abstractC1282g3);
                        iM1164d = AbstractC0462h.m1164d((iM3099l >> 31) ^ (iM3099l + iM3099l), C1254Z1.m3222M(i11 << 3), iM1164d);
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 67:
                    if (c1156a2.m3111j(i11, i7, abstractC1282g3)) {
                        long jM3101o = m3101o(j3, abstractC1282g3);
                        iMo3193a = C1254Z1.m3222M(i11 << 3);
                        iM3223N = C1254Z1.m3223N((jM3101o >> 63) ^ (jM3101o + jM3101o));
                        iM1164d += iM3223N + iMo3193a;
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                case 68:
                    if (c1156a2.m3111j(i11, i7, abstractC1282g3)) {
                        AbstractC1230T1 abstractC1230T3 = (AbstractC1230T1) unsafe.getObject(abstractC1282g3, j3);
                        InterfaceC1188I2 interfaceC1188I2M3113p6 = c1156a2.m3113p(i7);
                        Logger logger9 = C1254Z1.f5753j;
                        iMo3193a = abstractC1230T3.mo3193a(interfaceC1188I2M3113p6);
                        iM3222M = C1254Z1.m3222M(i11 << 3);
                        iM3223N = iM3222M + iM3222M;
                        iM1164d += iM3223N + iMo3193a;
                    }
                    i7 += 3;
                    i6 = 1048575;
                    break;
                default:
                    i7 += 3;
                    i6 = 1048575;
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.cast.InterfaceC1188I2
    /* JADX INFO: renamed from: f */
    public final void mo3108f(Object obj, C1342v2 c1342v2) throws C1258a2 {
        int i3;
        C1156A2 c1156a2 = this;
        Unsafe unsafe = f5546i;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 1048575;
        int i7 = 0;
        while (true) {
            int[] iArr = c1156a2.f5547a;
            if (i5 >= iArr.length) {
                c1156a2.f5553g.getClass();
                C1200L2 c1200l2 = ((AbstractC1282g2) obj).zzc;
                return;
            }
            int iM3112n = c1156a2.m3112n(i5);
            int iM3100m = m3100m(iM3112n);
            int i8 = iArr[i5];
            if (iM3100m <= 17) {
                int i9 = iArr[i5 + 2];
                int i10 = i9 & i4;
                if (i10 != i6) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i6 = i10;
                }
                i3 = 1 << (i9 >>> 20);
            } else {
                i3 = 0;
            }
            long j3 = iM3112n & i4;
            switch (iM3100m) {
                case 0:
                    if (c1156a2.m3119w(obj, i5, i6, i7, i3)) {
                        ((C1254Z1) c1342v2.f5983g).m3227D(i8, Double.doubleToRawLongBits(AbstractC1235U2.f5716c.mo3185a(j3, obj)));
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 1:
                    if (c1156a2.m3119w(obj, i5, i6, i7, i3)) {
                        ((C1254Z1) c1342v2.f5983g).m3225B(i8, Float.floatToRawIntBits(AbstractC1235U2.f5716c.mo3186b(j3, obj)));
                    }
                    c1156a2 = this;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 2:
                    if (c1156a2.m3119w(obj, i5, i6, i7, i3)) {
                        ((C1254Z1) c1342v2.f5983g).m3232I(i8, unsafe.getLong(obj, j3));
                    }
                    c1156a2 = this;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    if (c1156a2.m3119w(obj, i5, i6, i7, i3)) {
                        ((C1254Z1) c1342v2.f5983g).m3232I(i8, unsafe.getLong(obj, j3));
                    }
                    c1156a2 = this;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 4:
                    if (c1156a2.m3119w(obj, i5, i6, i7, i3)) {
                        int i11 = unsafe.getInt(obj, j3);
                        C1254Z1 c1254z1 = (C1254Z1) c1342v2.f5983g;
                        c1254z1.m3231H(i8 << 3);
                        if (i11 >= 0) {
                            c1254z1.m3231H(i11);
                        } else {
                            c1254z1.m3233J(i11);
                        }
                    }
                    c1156a2 = this;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 5:
                    if (c1156a2.m3119w(obj, i5, i6, i7, i3)) {
                        ((C1254Z1) c1342v2.f5983g).m3227D(i8, unsafe.getLong(obj, j3));
                    }
                    c1156a2 = this;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 6:
                    if (c1156a2.m3119w(obj, i5, i6, i7, i3)) {
                        ((C1254Z1) c1342v2.f5983g).m3225B(i8, unsafe.getInt(obj, j3));
                    }
                    c1156a2 = this;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 7:
                    if (c1156a2.m3119w(obj, i5, i6, i7, i3)) {
                        boolean zMo3191g = AbstractC1235U2.f5716c.mo3191g(j3, obj);
                        C1254Z1 c1254z2 = (C1254Z1) c1342v2.f5983g;
                        c1254z2.m3231H(i8 << 3);
                        c1254z2.m3234y(zMo3191g ? (byte) 1 : (byte) 0);
                    }
                    c1156a2 = this;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 8:
                    if (c1156a2.m3119w(obj, i5, i6, i7, i3)) {
                        Object object = unsafe.getObject(obj, j3);
                        if (object instanceof String) {
                            ((C1254Z1) c1342v2.f5983g).m3229F(i8, (String) object);
                        } else {
                            ((C1254Z1) c1342v2.f5983g).m3224A(i8, (C1250Y1) object);
                        }
                    }
                    c1156a2 = this;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 9:
                    if (c1156a2.m3119w(obj, i5, i6, i7, i3)) {
                        c1342v2.m3424k(i8, unsafe.getObject(obj, j3), c1156a2.m3113p(i5));
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 10:
                    if (c1156a2.m3119w(obj, i5, i6, i7, i3)) {
                        ((C1254Z1) c1342v2.f5983g).m3224A(i8, (C1250Y1) unsafe.getObject(obj, j3));
                    }
                    c1156a2 = this;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 11:
                    if (c1156a2.m3119w(obj, i5, i6, i7, i3)) {
                        int i12 = unsafe.getInt(obj, j3);
                        C1254Z1 c1254z3 = (C1254Z1) c1342v2.f5983g;
                        c1254z3.m3231H(i8 << 3);
                        c1254z3.m3231H(i12);
                    }
                    c1156a2 = this;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 12:
                    if (c1156a2.m3119w(obj, i5, i6, i7, i3)) {
                        int i13 = unsafe.getInt(obj, j3);
                        C1254Z1 c1254z4 = (C1254Z1) c1342v2.f5983g;
                        c1254z4.m3231H(i8 << 3);
                        if (i13 >= 0) {
                            c1254z4.m3231H(i13);
                        } else {
                            c1254z4.m3233J(i13);
                        }
                    }
                    c1156a2 = this;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 13:
                    if (c1156a2.m3119w(obj, i5, i6, i7, i3)) {
                        ((C1254Z1) c1342v2.f5983g).m3225B(i8, unsafe.getInt(obj, j3));
                    }
                    c1156a2 = this;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 14:
                    if (c1156a2.m3119w(obj, i5, i6, i7, i3)) {
                        ((C1254Z1) c1342v2.f5983g).m3227D(i8, unsafe.getLong(obj, j3));
                    }
                    c1156a2 = this;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 15:
                    if (c1156a2.m3119w(obj, i5, i6, i7, i3)) {
                        int i14 = unsafe.getInt(obj, j3);
                        C1254Z1 c1254z5 = (C1254Z1) c1342v2.f5983g;
                        c1254z5.m3231H(i8 << 3);
                        c1254z5.m3231H((i14 >> 31) ^ (i14 + i14));
                    }
                    c1156a2 = this;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 16:
                    if (c1156a2.m3119w(obj, i5, i6, i7, i3)) {
                        long j4 = unsafe.getLong(obj, j3);
                        ((C1254Z1) c1342v2.f5983g).m3232I(i8, (j4 + j4) ^ (j4 >> 63));
                    }
                    c1156a2 = this;
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 17:
                    if (c1156a2.m3119w(obj, i5, i6, i7, i3)) {
                        c1342v2.m3423j(i8, unsafe.getObject(obj, j3), c1156a2.m3113p(i5));
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 18:
                    AbstractC1192J2.m3166q(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, false);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 19:
                    AbstractC1192J2.m3170u(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, false);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 20:
                    AbstractC1192J2.m3172w(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, false);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 21:
                    AbstractC1192J2.m3153d(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, false);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 22:
                    AbstractC1192J2.m3171v(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, false);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 23:
                    AbstractC1192J2.m3169t(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, false);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 24:
                    AbstractC1192J2.m3168s(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, false);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 25:
                    AbstractC1192J2.m3165p(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, false);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 26:
                    int i15 = iArr[i5];
                    List list = (List) unsafe.getObject(obj, j3);
                    Class cls = AbstractC1192J2.f5645a;
                    if (list != null && !list.isEmpty()) {
                        c1342v2.getClass();
                        boolean z3 = list instanceof InterfaceC1318p2;
                        C1254Z1 c1254z6 = (C1254Z1) c1342v2.f5983g;
                        if (z3) {
                            InterfaceC1318p2 interfaceC1318p2 = (InterfaceC1318p2) list;
                            for (int i16 = 0; i16 < list.size(); i16++) {
                                Object objMo3183d = interfaceC1318p2.mo3183d(i16);
                                if (objMo3183d instanceof String) {
                                    c1254z6.m3229F(i15, (String) objMo3183d);
                                } else {
                                    c1254z6.m3224A(i15, (C1250Y1) objMo3183d);
                                }
                            }
                        } else {
                            for (int i17 = 0; i17 < list.size(); i17++) {
                                c1254z6.m3229F(i15, (String) list.get(i17));
                            }
                        }
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 27:
                    int i18 = iArr[i5];
                    List list2 = (List) unsafe.getObject(obj, j3);
                    InterfaceC1188I2 interfaceC1188I2M3113p = c1156a2.m3113p(i5);
                    Class cls2 = AbstractC1192J2.f5645a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i19 = 0; i19 < list2.size(); i19++) {
                            c1342v2.m3424k(i18, list2.get(i19), interfaceC1188I2M3113p);
                        }
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 28:
                    int i20 = iArr[i5];
                    List list3 = (List) unsafe.getObject(obj, j3);
                    Class cls3 = AbstractC1192J2.f5645a;
                    if (list3 != null && !list3.isEmpty()) {
                        c1342v2.getClass();
                        for (int i21 = 0; i21 < list3.size(); i21++) {
                            ((C1254Z1) c1342v2.f5983g).m3224A(i20, (C1250Y1) list3.get(i21));
                        }
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 29:
                    AbstractC1192J2.m3152c(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, false);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 30:
                    AbstractC1192J2.m3167r(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, false);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 31:
                    AbstractC1192J2.m3173x(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, false);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 32:
                    AbstractC1192J2.m3174y(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, false);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 33:
                    AbstractC1192J2.m3150a(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, false);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 34:
                    AbstractC1192J2.m3151b(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, false);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 35:
                    AbstractC1192J2.m3166q(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, true);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 36:
                    AbstractC1192J2.m3170u(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, true);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 37:
                    AbstractC1192J2.m3172w(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, true);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 38:
                    AbstractC1192J2.m3153d(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, true);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 39:
                    AbstractC1192J2.m3171v(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, true);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 40:
                    AbstractC1192J2.m3169t(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, true);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 41:
                    AbstractC1192J2.m3168s(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, true);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 42:
                    AbstractC1192J2.m3165p(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, true);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 43:
                    AbstractC1192J2.m3152c(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, true);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 44:
                    AbstractC1192J2.m3167r(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, true);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 45:
                    AbstractC1192J2.m3173x(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, true);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 46:
                    AbstractC1192J2.m3174y(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, true);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 47:
                    AbstractC1192J2.m3150a(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, true);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 48:
                    AbstractC1192J2.m3151b(iArr[i5], (List) unsafe.getObject(obj, j3), c1342v2, true);
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 49:
                    int i22 = iArr[i5];
                    List list4 = (List) unsafe.getObject(obj, j3);
                    InterfaceC1188I2 interfaceC1188I2M3113p2 = c1156a2.m3113p(i5);
                    Class cls4 = AbstractC1192J2.f5645a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i23 = 0; i23 < list4.size(); i23++) {
                            c1342v2.m3423j(i22, list4.get(i23), interfaceC1188I2M3113p2);
                        }
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j3) != null) {
                        int i24 = i5 / 3;
                        c1156a2.f5548b[i24 + i24].getClass();
                        throw new ClassCastException();
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 51:
                    if (c1156a2.m3111j(i8, i5, obj)) {
                        ((C1254Z1) c1342v2.f5983g).m3227D(i8, Double.doubleToRawLongBits(((Double) AbstractC1235U2.m3201g(j3, obj)).doubleValue()));
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 52:
                    if (c1156a2.m3111j(i8, i5, obj)) {
                        ((C1254Z1) c1342v2.f5983g).m3225B(i8, Float.floatToRawIntBits(((Float) AbstractC1235U2.m3201g(j3, obj)).floatValue()));
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 53:
                    if (c1156a2.m3111j(i8, i5, obj)) {
                        ((C1254Z1) c1342v2.f5983g).m3232I(i8, m3101o(j3, obj));
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 54:
                    if (c1156a2.m3111j(i8, i5, obj)) {
                        ((C1254Z1) c1342v2.f5983g).m3232I(i8, m3101o(j3, obj));
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 55:
                    if (c1156a2.m3111j(i8, i5, obj)) {
                        int iM3099l = m3099l(j3, obj);
                        C1254Z1 c1254z7 = (C1254Z1) c1342v2.f5983g;
                        c1254z7.m3231H(i8 << 3);
                        if (iM3099l >= 0) {
                            c1254z7.m3231H(iM3099l);
                        } else {
                            c1254z7.m3233J(iM3099l);
                        }
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 56:
                    if (c1156a2.m3111j(i8, i5, obj)) {
                        ((C1254Z1) c1342v2.f5983g).m3227D(i8, m3101o(j3, obj));
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 57:
                    if (c1156a2.m3111j(i8, i5, obj)) {
                        ((C1254Z1) c1342v2.f5983g).m3225B(i8, m3099l(j3, obj));
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 58:
                    if (c1156a2.m3111j(i8, i5, obj)) {
                        boolean zBooleanValue = ((Boolean) AbstractC1235U2.m3201g(j3, obj)).booleanValue();
                        C1254Z1 c1254z8 = (C1254Z1) c1342v2.f5983g;
                        c1254z8.m3231H(i8 << 3);
                        c1254z8.m3234y(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 59:
                    if (c1156a2.m3111j(i8, i5, obj)) {
                        Object object2 = unsafe.getObject(obj, j3);
                        if (object2 instanceof String) {
                            ((C1254Z1) c1342v2.f5983g).m3229F(i8, (String) object2);
                        } else {
                            ((C1254Z1) c1342v2.f5983g).m3224A(i8, (C1250Y1) object2);
                        }
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 60:
                    if (c1156a2.m3111j(i8, i5, obj)) {
                        c1342v2.m3424k(i8, unsafe.getObject(obj, j3), c1156a2.m3113p(i5));
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 61:
                    if (c1156a2.m3111j(i8, i5, obj)) {
                        ((C1254Z1) c1342v2.f5983g).m3224A(i8, (C1250Y1) unsafe.getObject(obj, j3));
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 62:
                    if (c1156a2.m3111j(i8, i5, obj)) {
                        int iM3099l2 = m3099l(j3, obj);
                        C1254Z1 c1254z9 = (C1254Z1) c1342v2.f5983g;
                        c1254z9.m3231H(i8 << 3);
                        c1254z9.m3231H(iM3099l2);
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 63:
                    if (c1156a2.m3111j(i8, i5, obj)) {
                        int iM3099l3 = m3099l(j3, obj);
                        C1254Z1 c1254z10 = (C1254Z1) c1342v2.f5983g;
                        c1254z10.m3231H(i8 << 3);
                        if (iM3099l3 >= 0) {
                            c1254z10.m3231H(iM3099l3);
                        } else {
                            c1254z10.m3233J(iM3099l3);
                        }
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 64:
                    if (c1156a2.m3111j(i8, i5, obj)) {
                        ((C1254Z1) c1342v2.f5983g).m3225B(i8, m3099l(j3, obj));
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 65:
                    if (c1156a2.m3111j(i8, i5, obj)) {
                        ((C1254Z1) c1342v2.f5983g).m3227D(i8, m3101o(j3, obj));
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 66:
                    if (c1156a2.m3111j(i8, i5, obj)) {
                        int iM3099l4 = m3099l(j3, obj);
                        C1254Z1 c1254z11 = (C1254Z1) c1342v2.f5983g;
                        c1254z11.m3231H(i8 << 3);
                        c1254z11.m3231H((iM3099l4 >> 31) ^ (iM3099l4 + iM3099l4));
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 67:
                    if (c1156a2.m3111j(i8, i5, obj)) {
                        long jM3101o = m3101o(j3, obj);
                        ((C1254Z1) c1342v2.f5983g).m3232I(i8, (jM3101o + jM3101o) ^ (jM3101o >> 63));
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                case 68:
                    if (c1156a2.m3111j(i8, i5, obj)) {
                        c1342v2.m3423j(i8, unsafe.getObject(obj, j3), c1156a2.m3113p(i5));
                    }
                    i5 += 3;
                    i4 = 1048575;
                    break;
                default:
                    i5 += 3;
                    i4 = 1048575;
                    break;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.InterfaceC1188I2
    /* JADX INFO: renamed from: g */
    public final AbstractC1282g2 mo3109g() {
        return (AbstractC1282g2) ((AbstractC1282g2) this.f5549c).mo3096h(4, null);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX WARN: Code duplicated, block: B:30:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.cast.InterfaceC1188I2
    /* JADX INFO: renamed from: h */
    public final void mo3110h(Object obj) {
        if (!m3097i(obj)) {
            return;
        }
        if (obj instanceof AbstractC1282g2) {
            AbstractC1282g2 abstractC1282g2 = (AbstractC1282g2) obj;
            abstractC1282g2.m3262f();
            abstractC1282g2.zza = 0;
            abstractC1282g2.m3261d();
        }
        int i3 = 0;
        while (true) {
            int[] iArr = this.f5547a;
            if (i3 >= iArr.length) {
                this.f5553g.getClass();
                C1200L2 c1200l2 = ((AbstractC1282g2) obj).zzc;
                if (c1200l2.f5658d) {
                    c1200l2.f5658d = false;
                    return;
                }
                return;
            }
            int iM3112n = m3112n(i3);
            int i4 = 1048575 & iM3112n;
            int iM3100m = m3100m(iM3112n);
            long j3 = i4;
            if (iM3100m != 9) {
                if (iM3100m != 60 && iM3100m != 68) {
                    switch (iM3100m) {
                        case 17:
                            if (m3118v(i3, obj)) {
                                m3113p(i3).mo3110h(f5546i.getObject(obj, j3));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f5552f.mo3351a(j3, obj);
                            break;
                        case 50:
                            if (f5546i.getObject(obj, j3) != null) {
                                throw new ClassCastException();
                            }
                            break;
                            break;
                    }
                } else if (m3111j(iArr[i3], i3, obj)) {
                    m3113p(i3).mo3110h(f5546i.getObject(obj, j3));
                }
            } else if (m3118v(i3, obj)) {
                m3113p(i3).mo3110h(f5546i.getObject(obj, j3));
            }
            i3 += 3;
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m3111j(int i3, int i4, Object obj) {
        return AbstractC1235U2.m3198d((long) (this.f5547a[i4 + 2] & 1048575), obj) == i3;
    }

    /* JADX INFO: renamed from: n */
    public final int m3112n(int i3) {
        return this.f5547a[i3 + 1];
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC1188I2 m3113p(int i3) {
        int i4 = i3 / 3;
        int i5 = i4 + i4;
        Object[] objArr = this.f5548b;
        InterfaceC1188I2 interfaceC1188I2 = (InterfaceC1188I2) objArr[i5];
        if (interfaceC1188I2 != null) {
            return interfaceC1188I2;
        }
        InterfaceC1188I2 interfaceC1188I2M3131a = C1176F2.f5618c.m3131a((Class) objArr[i5 + 1]);
        objArr[i5] = interfaceC1188I2M3131a;
        return interfaceC1188I2M3131a;
    }

    /* JADX INFO: renamed from: r */
    public final void m3114r(Object obj, int i3, Object obj2) {
        if (m3118v(i3, obj2)) {
            int iM3112n = m3112n(i3) & 1048575;
            Unsafe unsafe = f5546i;
            long j3 = iM3112n;
            Object object = unsafe.getObject(obj2, j3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f5547a[i3] + " is present but null: " + obj2.toString());
            }
            InterfaceC1188I2 interfaceC1188I2M3113p = m3113p(i3);
            if (!m3118v(i3, obj)) {
                if (m3097i(object)) {
                    AbstractC1282g2 abstractC1282g2Mo3109g = interfaceC1188I2M3113p.mo3109g();
                    interfaceC1188I2M3113p.mo3104b(abstractC1282g2Mo3109g, object);
                    unsafe.putObject(obj, j3, abstractC1282g2Mo3109g);
                } else {
                    unsafe.putObject(obj, j3, object);
                }
                m3116t(i3, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!m3097i(object2)) {
                AbstractC1282g2 abstractC1282g2Mo3109g2 = interfaceC1188I2M3113p.mo3109g();
                interfaceC1188I2M3113p.mo3104b(abstractC1282g2Mo3109g2, object2);
                unsafe.putObject(obj, j3, abstractC1282g2Mo3109g2);
                object2 = abstractC1282g2Mo3109g2;
            }
            interfaceC1188I2M3113p.mo3104b(object2, object);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m3115s(Object obj, int i3, Object obj2) {
        int[] iArr = this.f5547a;
        int i4 = iArr[i3];
        if (m3111j(i4, i3, obj2)) {
            int iM3112n = m3112n(i3) & 1048575;
            Unsafe unsafe = f5546i;
            long j3 = iM3112n;
            Object object = unsafe.getObject(obj2, j3);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i3] + " is present but null: " + obj2.toString());
            }
            InterfaceC1188I2 interfaceC1188I2M3113p = m3113p(i3);
            if (!m3111j(i4, i3, obj)) {
                if (m3097i(object)) {
                    AbstractC1282g2 abstractC1282g2Mo3109g = interfaceC1188I2M3113p.mo3109g();
                    interfaceC1188I2M3113p.mo3104b(abstractC1282g2Mo3109g, object);
                    unsafe.putObject(obj, j3, abstractC1282g2Mo3109g);
                } else {
                    unsafe.putObject(obj, j3, object);
                }
                AbstractC1235U2.m3203i(i4, iArr[i3 + 2] & 1048575, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j3);
            if (!m3097i(object2)) {
                AbstractC1282g2 abstractC1282g2Mo3109g2 = interfaceC1188I2M3113p.mo3109g();
                interfaceC1188I2M3113p.mo3104b(abstractC1282g2Mo3109g2, object2);
                unsafe.putObject(obj, j3, abstractC1282g2Mo3109g2);
                object2 = abstractC1282g2Mo3109g2;
            }
            interfaceC1188I2M3113p.mo3104b(object2, object);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m3116t(int i3, Object obj) {
        int i4 = this.f5547a[i3 + 2];
        long j3 = 1048575 & i4;
        if (j3 == 1048575) {
            return;
        }
        AbstractC1235U2.m3203i((1 << (i4 >>> 20)) | AbstractC1235U2.m3198d(j3, obj), j3, obj);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m3117u(AbstractC1282g2 abstractC1282g2, AbstractC1282g2 abstractC1282g3, int i3) {
        return m3118v(i3, abstractC1282g2) == m3118v(i3, abstractC1282g3);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m3118v(int i3, Object obj) {
        int i4 = this.f5547a[i3 + 2];
        long j3 = i4 & 1048575;
        if (j3 == 1048575) {
            int iM3112n = m3112n(i3);
            long j4 = iM3112n & 1048575;
            switch (m3100m(iM3112n)) {
                case 0:
                    if (Double.doubleToRawLongBits(AbstractC1235U2.f5716c.mo3185a(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(AbstractC1235U2.f5716c.mo3186b(j4, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (AbstractC1235U2.m3199e(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    if (AbstractC1235U2.m3199e(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (AbstractC1235U2.m3198d(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (AbstractC1235U2.m3199e(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (AbstractC1235U2.m3198d(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return AbstractC1235U2.f5716c.mo3191g(j4, obj);
                case 8:
                    Object objM3201g = AbstractC1235U2.m3201g(j4, obj);
                    if (objM3201g instanceof String) {
                        if (((String) objM3201g).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(objM3201g instanceof C1250Y1)) {
                            throw new IllegalArgumentException();
                        }
                        if (C1250Y1.f5743i.equals(objM3201g)) {
                            return false;
                        }
                    }
                case 9:
                    if (AbstractC1235U2.m3201g(j4, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (C1250Y1.f5743i.equals(AbstractC1235U2.m3201g(j4, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (AbstractC1235U2.m3198d(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (AbstractC1235U2.m3198d(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (AbstractC1235U2.m3198d(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (AbstractC1235U2.m3199e(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (AbstractC1235U2.m3198d(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (AbstractC1235U2.m3199e(j4, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (AbstractC1235U2.m3201g(j4, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i4 >>> 20)) & AbstractC1235U2.m3198d(j3, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m3119w(Object obj, int i3, int i4, int i5, int i6) {
        if (i4 == 1048575) {
            return m3118v(i3, obj);
        }
        return (i5 & i6) != 0;
    }
}
