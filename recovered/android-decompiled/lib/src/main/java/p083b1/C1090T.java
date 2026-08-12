package p083b1;

import android.content.Context;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Base64;
import android.util.SparseArray;
import android.widget.FrameLayout;
import androidx.emoji2.text.C0924n;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import p019G1.AbstractC0230e;
import p045P0.AbstractC0462h;
import p060U1.AbstractC0610a;
import p061V.C0614b;
import p061V.C0617e;
import p061V.C0619g;
import p061V.C0620h;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: b1.T */
/* JADX INFO: loaded from: classes.dex */
public final class C1090T extends FrameLayout implements InterfaceC1082K {

    /* JADX INFO: renamed from: g */
    public final C1093c f4970g;

    /* JADX INFO: renamed from: h */
    public final C1088Q f4971h;

    /* JADX INFO: renamed from: i */
    public List f4972i;

    /* JADX INFO: renamed from: j */
    public C1094d f4973j;

    /* JADX INFO: renamed from: k */
    public float f4974k;

    /* JADX INFO: renamed from: l */
    public float f4975l;

    public C1090T(Context context) {
        super(context, null);
        this.f4972i = Collections.EMPTY_LIST;
        this.f4973j = C1094d.f4983g;
        this.f4974k = 0.0533f;
        this.f4975l = 0.08f;
        C1093c c1093c = new C1093c(context);
        this.f4970g = c1093c;
        C1088Q c1088q = new C1088Q(context, null);
        this.f4971h = c1088q;
        c1088q.setBackgroundColor(0);
        addView(c1093c);
        addView(c1088q);
    }

    @Override // p083b1.InterfaceC1082K
    /* JADX INFO: renamed from: a */
    public final void mo2924a(List list, C1094d c1094d, float f, float f3) {
        this.f4973j = c1094d;
        this.f4974k = f;
        this.f4975l = f3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            C0614b c0614b = (C0614b) list.get(i3);
            if (c0614b.f2358d != null) {
                arrayList.add(c0614b);
            } else {
                arrayList2.add(c0614b);
            }
        }
        if (!this.f4972i.isEmpty() || !arrayList2.isEmpty()) {
            this.f4972i = arrayList2;
            m2929c();
        }
        this.f4970g.mo2924a(arrayList, c1094d, f, f3);
        invalidate();
    }

    /* JADX INFO: renamed from: b */
    public final String m2928b(int i3, float f) {
        float fM1495G = AbstractC0610a.m1495G(i3, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (fM1495G == -3.4028235E38f) {
            return "unset";
        }
        Object[] objArr = {Float.valueOf(fM1495G / getContext().getResources().getDisplayMetrics().density)};
        int i4 = AbstractC0632A.f2454a;
        return String.format(Locale.US, "%.2fpx", objArr);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0283 A[LOOP:2: B:100:0x0281->B:101:0x0283, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:105:0x02a8 A[LOOP:3: B:103:0x02a2->B:105:0x02a8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x0308  */
    /* JADX WARN: Code duplicated, block: B:110:0x0314  */
    /* JADX WARN: Code duplicated, block: B:113:0x0326  */
    /* JADX WARN: Code duplicated, block: B:115:0x032c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0344  */
    /* JADX WARN: Code duplicated, block: B:118:0x034a  */
    /* JADX WARN: Code duplicated, block: B:119:0x036b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0371  */
    /* JADX WARN: Code duplicated, block: B:122:0x0374  */
    /* JADX WARN: Code duplicated, block: B:124:0x0378  */
    /* JADX WARN: Code duplicated, block: B:126:0x0381  */
    /* JADX WARN: Code duplicated, block: B:127:0x0387  */
    /* JADX WARN: Code duplicated, block: B:129:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:131:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:132:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:134:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:136:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:137:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:138:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:140:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:142:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:144:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:147:0x0401  */
    /* JADX WARN: Code duplicated, block: B:148:0x0405  */
    /* JADX WARN: Code duplicated, block: B:149:0x0409  */
    /* JADX WARN: Code duplicated, block: B:150:0x040d  */
    /* JADX WARN: Code duplicated, block: B:152:0x0411  */
    /* JADX WARN: Code duplicated, block: B:154:0x0419  */
    /* JADX WARN: Code duplicated, block: B:156:0x041c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0420  */
    /* JADX WARN: Code duplicated, block: B:160:0x0424  */
    /* JADX WARN: Code duplicated, block: B:161:0x0428  */
    /* JADX WARN: Code duplicated, block: B:162:0x042c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0430  */
    /* JADX WARN: Code duplicated, block: B:165:0x0434  */
    /* JADX WARN: Code duplicated, block: B:167:0x0438  */
    /* JADX WARN: Code duplicated, block: B:169:0x044b  */
    /* JADX WARN: Code duplicated, block: B:172:0x044f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0455  */
    /* JADX WARN: Code duplicated, block: B:175:0x045d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0460 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:178:0x0462  */
    /* JADX WARN: Code duplicated, block: B:180:0x0465  */
    /* JADX WARN: Code duplicated, block: B:181:0x0469  */
    /* JADX WARN: Code duplicated, block: B:182:0x046f  */
    /* JADX WARN: Code duplicated, block: B:183:0x0475  */
    /* JADX WARN: Code duplicated, block: B:184:0x047b  */
    /* JADX WARN: Code duplicated, block: B:187:0x0489  */
    /* JADX WARN: Code duplicated, block: B:188:0x048c  */
    /* JADX WARN: Code duplicated, block: B:191:0x04a4  */
    /* JADX WARN: Code duplicated, block: B:208:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:230:0x051f  */
    /* JADX WARN: Code duplicated, block: B:232:0x052f  */
    /* JADX WARN: Code duplicated, block: B:235:0x0544  */
    /* JADX WARN: Code duplicated, block: B:241:0x0578  */
    /* JADX WARN: Code duplicated, block: B:243:0x059f A[LOOP:6: B:242:0x059d->B:243:0x059f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:246:0x05c3 A[LOOP:7: B:245:0x05c1->B:246:0x05c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:252:0x0602  */
    /* JADX WARN: Code duplicated, block: B:254:0x0616  */
    /* JADX WARN: Code duplicated, block: B:258:0x0623  */
    /* JADX WARN: Code duplicated, block: B:262:0x063e  */
    /* JADX WARN: Code duplicated, block: B:264:0x0642 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:267:0x0648  */
    /* JADX WARN: Code duplicated, block: B:271:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:273:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:275:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:276:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:277:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:279:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:297:0x0551 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0178  */
    /* JADX WARN: Code duplicated, block: B:52:0x018b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0199  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x01af  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:71:0x01da  */
    /* JADX WARN: Code duplicated, block: B:72:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x0200  */
    /* JADX WARN: Code duplicated, block: B:84:0x0203 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0215  */
    /* JADX WARN: Code duplicated, block: B:94:0x0239  */
    /* JADX WARN: Code duplicated, block: B:96:0x024f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0255  */
    /* JADX WARN: Code duplicated, block: B:99:0x0265  */
    /* JADX WARN: Instruction removed from duplicated block: B:105:0x02a8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:118:0x034a, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public final void m2929c() {
        String strConcat;
        char c;
        String str;
        boolean z3;
        float f;
        String str2;
        Layout.Alignment alignment;
        int i3;
        String str3;
        int i4;
        Object obj;
        String str4;
        int i5;
        String str5;
        String str6;
        String str7;
        float f3;
        String str8;
        CharSequence charSequence;
        String str9;
        Spanned spanned;
        HashSet hashSet;
        BackgroundColorSpan[] backgroundColorSpanArr;
        int length;
        int i6;
        HashMap map;
        Iterator it;
        SparseArray sparseArray;
        Object[] spans;
        int length2;
        int i7;
        String str10;
        float f4;
        StringBuilder sb;
        int i8;
        int i9;
        C0924n c0924n;
        ArrayList arrayList;
        int size;
        int i10;
        ArrayList arrayList2;
        int size2;
        int i11;
        Object obj2;
        boolean z4;
        boolean z5;
        int i12;
        C0620h c0620h;
        int i13;
        StringBuilder sb2;
        int i14;
        int i15;
        String str11;
        String strM1166f;
        int i16;
        int style;
        String family;
        AbsoluteSizeSpan absoluteSizeSpan;
        float size3;
        String str12;
        int spanStart;
        int spanEnd;
        C1079H c1079h;
        C1079H c1079h2;
        float f5;
        String str13;
        Layout.Alignment alignment2;
        int i17;
        String str14;
        String str15;
        String str16;
        boolean z6;
        int i18 = 2;
        int i19 = 1;
        StringBuilder sb3 = new StringBuilder();
        String strM745y = AbstractC0230e.m745y(this.f4973j.f4984a);
        String strM2928b = m2928b(0, this.f4974k);
        Float fValueOf = Float.valueOf(1.2f);
        C1094d c1094d = this.f4973j;
        int i20 = c1094d.f4987d;
        int i21 = c1094d.f4988e;
        if (i20 == 1) {
            Object[] objArr = {AbstractC0230e.m745y(i21)};
            int i22 = AbstractC0632A.f2454a;
            strConcat = String.format(Locale.US, "1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", objArr);
        } else if (i20 == 2) {
            String strM745y2 = AbstractC0230e.m745y(i21);
            int i23 = AbstractC0632A.f2454a;
            Locale locale = Locale.US;
            strConcat = "0.1em 0.12em 0.15em ".concat(strM745y2);
        } else if (i20 == 3) {
            String strM745y3 = AbstractC0230e.m745y(i21);
            int i24 = AbstractC0632A.f2454a;
            Locale locale2 = Locale.US;
            strConcat = "0.06em 0.08em 0.15em ".concat(strM745y3);
        } else if (i20 != 4) {
            strConcat = "unset";
        } else {
            String strM745y4 = AbstractC0230e.m745y(i21);
            int i25 = AbstractC0632A.f2454a;
            Locale locale3 = Locale.US;
            strConcat = "-0.05em -0.05em 0.15em ".concat(strM745y4);
        }
        Object[] objArr2 = {strM745y, strM2928b, fValueOf, strConcat};
        int i26 = AbstractC0632A.f2454a;
        sb3.append(String.format(Locale.US, "<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", objArr2));
        HashMap map2 = new HashMap();
        String strM745y5 = AbstractC0230e.m745y(this.f4973j.f4985b);
        String str17 = "background-color:";
        StringBuilder sb4 = new StringBuilder("background-color:");
        sb4.append(strM745y5);
        String str18 = ";";
        sb4.append(";");
        map2.put(".default_bg,.default_bg *", sb4.toString());
        int i27 = 0;
        while (i27 < this.f4972i.size()) {
            C0614b c0614b = (C0614b) this.f4972i.get(i27);
            float f6 = c0614b.f2362h;
            float f7 = f6 != -3.4028235E38f ? f6 * 100.0f : 50.0f;
            int i28 = -100;
            int i29 = c0614b.f2363i;
            int i30 = i29 != i19 ? i29 != i18 ? 0 : -100 : -50;
            int i31 = c0614b.f2370p;
            float f8 = c0614b.f2359e;
            if (f8 != -3.4028235E38f) {
                c = 0;
                if (c0614b.f2360f != i19) {
                    Object[] objArr3 = new Object[i19];
                    objArr3[0] = Float.valueOf(f8 * 100.0f);
                    str = String.format(Locale.US, "%.2f%%", objArr3);
                    int i32 = c0614b.f2361g;
                    if (i31 == i19) {
                        i28 = -(i32 != i19 ? i32 != i18 ? 0 : -100 : -50);
                    } else {
                        i28 = i32 != i19 ? i32 != i18 ? 0 : -100 : -50;
                    }
                } else {
                    if (f8 >= 0.0f) {
                        Object[] objArr4 = new Object[i19];
                        objArr4[0] = Float.valueOf(f8 * 1.2f);
                        str = String.format(Locale.US, "%.2fem", objArr4);
                        z3 = false;
                    } else {
                        Object[] objArr5 = new Object[i19];
                        objArr5[0] = Float.valueOf(((-f8) - 1.0f) * 1.2f);
                        str = String.format(Locale.US, "%.2fem", objArr5);
                        z3 = true;
                    }
                    i28 = 0;
                }
                f = c0614b.f2364j;
                if (f != -3.4028235E38f) {
                    Object[] objArr6 = new Object[i19];
                    objArr6[c] = Float.valueOf(f * 100.0f);
                    str2 = String.format(Locale.US, "%.2f%%", objArr6);
                } else {
                    str2 = "fit-content";
                }
                alignment = c0614b.f2356b;
                if (alignment == null) {
                    str3 = str2;
                    obj = "center";
                    i4 = 2;
                } else {
                    i3 = AbstractC1089S.f4969a[alignment.ordinal()];
                    str3 = str2;
                    if (i3 != 1) {
                        i4 = 2;
                        if (i3 != 2) {
                            obj = "center";
                        } else {
                            obj = "end";
                        }
                    } else {
                        i4 = 2;
                        obj = "start";
                    }
                }
                if (i31 != 1) {
                    str4 = "vertical-rl";
                } else if (i31 != i4) {
                    str4 = "horizontal-tb";
                } else {
                    str4 = "vertical-lr";
                }
                String str19 = str4;
                String strM2928b2 = m2928b(c0614b.f2368n, c0614b.f2369o);
                if (c0614b.f2366l) {
                    i5 = c0614b.f2367m;
                } else {
                    i5 = this.f4973j.f4986c;
                }
                String strM745y6 = AbstractC0230e.m745y(i5);
                str5 = "right";
                str6 = "top";
                if (i31 != 1) {
                    if (i31 != 2) {
                        str5 = z3 ? "bottom" : "top";
                        str6 = "left";
                    } else if (!z3) {
                        str5 = "left";
                    }
                } else if (z3) {
                    str5 = "left";
                }
                if (i31 != 2 || i31 == 1) {
                    str7 = "height";
                } else {
                    str7 = "width";
                    i30 = i28;
                    i28 = i30;
                }
                f3 = getContext().getResources().getDisplayMetrics().density;
                Pattern pattern = AbstractC1080I.f4928a;
                String str20 = str7;
                str8 = "";
                Object obj3 = obj;
                charSequence = c0614b.f2355a;
                if (charSequence == null) {
                    str9 = "start";
                    c0924n = new C0924n("", false);
                } else {
                    str9 = "start";
                    if (charSequence instanceof Spanned) {
                        str8 = "";
                        spanned = (Spanned) charSequence;
                        hashSet = new HashSet();
                        backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                        i6 = 0;
                        for (length = backgroundColorSpanArr.length; i6 < length; length = length) {
                            hashSet.add(Integer.valueOf(backgroundColorSpanArr[i6].getBackgroundColor()));
                            i6++;
                        }
                        map = new HashMap();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            int iIntValue = ((Integer) it.next()).intValue();
                            String strM1165e = AbstractC0462h.m1165e(iIntValue, "bg_");
                            Iterator it2 = it;
                            String str21 = "." + strM1165e + ",." + strM1165e + " *";
                            String strM745y7 = AbstractC0230e.m745y(iIntValue);
                            int i33 = AbstractC0632A.f2454a;
                            Locale locale4 = Locale.US;
                            map.put(str21, str17 + strM745y7 + str18);
                            it = it2;
                        }
                        sparseArray = new SparseArray();
                        spans = spanned.getSpans(0, spanned.length(), Object.class);
                        length2 = spans.length;
                        i7 = 0;
                        while (i7 < length2) {
                            String str22 = str18;
                            obj2 = spans[i7];
                            Object[] objArr7 = spans;
                            z4 = obj2 instanceof StrikethroughSpan;
                            String str23 = null;
                            if (z4) {
                                z5 = z4;
                                strM1166f = "<span style='text-decoration:line-through;'>";
                            } else {
                                z5 = z4;
                                if (obj2 instanceof ForegroundColorSpan) {
                                    String strM745y8 = AbstractC0230e.m745y(((ForegroundColorSpan) obj2).getForegroundColor());
                                    int i34 = AbstractC0632A.f2454a;
                                    Locale locale5 = Locale.US;
                                    strM1166f = AbstractC0462h.m1166f("<span style='color:", strM745y8, ";'>");
                                } else {
                                    length2 = length2;
                                    if (obj2 instanceof BackgroundColorSpan) {
                                        int backgroundColor = ((BackgroundColorSpan) obj2).getBackgroundColor();
                                        int i35 = AbstractC0632A.f2454a;
                                        Locale locale6 = Locale.US;
                                        i12 = i7;
                                        strM1166f = "<span class='bg_" + backgroundColor + "'>";
                                    } else {
                                        i12 = i7;
                                        if (obj2 instanceof C0617e) {
                                            strM1166f = "<span style='text-combine-upright:all;'>";
                                        } else if (obj2 instanceof AbsoluteSizeSpan) {
                                            absoluteSizeSpan = (AbsoluteSizeSpan) obj2;
                                            if (absoluteSizeSpan.getDip()) {
                                                size3 = absoluteSizeSpan.getSize();
                                            } else {
                                                size3 = absoluteSizeSpan.getSize() / f3;
                                            }
                                            Object[] objArr8 = {Float.valueOf(size3)};
                                            int i36 = AbstractC0632A.f2454a;
                                            strM1166f = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr8);
                                        } else if (obj2 instanceof RelativeSizeSpan) {
                                            Object[] objArr9 = {Float.valueOf(((RelativeSizeSpan) obj2).getSizeChange() * 100.0f)};
                                            int i37 = AbstractC0632A.f2454a;
                                            strM1166f = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr9);
                                        } else if (obj2 instanceof TypefaceSpan) {
                                            family = ((TypefaceSpan) obj2).getFamily();
                                            if (family != null) {
                                                int i38 = AbstractC0632A.f2454a;
                                                Locale locale7 = Locale.US;
                                                strM1166f = AbstractC0462h.m1166f("<span style='font-family:\"", family, "\";'>");
                                            } else {
                                                strM1166f = null;
                                            }
                                        } else if (obj2 instanceof StyleSpan) {
                                            style = ((StyleSpan) obj2).getStyle();
                                            if (style != 1) {
                                                strM1166f = "<b>";
                                            } else if (style != 2) {
                                                strM1166f = "<i>";
                                            } else if (style != 3) {
                                                strM1166f = null;
                                            } else {
                                                strM1166f = "<b><i>";
                                            }
                                        } else if (obj2 instanceof C0619g) {
                                            i16 = ((C0619g) obj2).f2382b;
                                            if (i16 != -1) {
                                                strM1166f = "<ruby style='ruby-position:unset;'>";
                                            } else if (i16 != 1) {
                                                strM1166f = "<ruby style='ruby-position:over;'>";
                                            } else if (i16 != 2) {
                                                strM1166f = null;
                                            } else {
                                                strM1166f = "<ruby style='ruby-position:under;'>";
                                            }
                                        } else if (obj2 instanceof UnderlineSpan) {
                                            strM1166f = "<u>";
                                        } else if (obj2 instanceof C0620h) {
                                            c0620h = (C0620h) obj2;
                                            i13 = c0620h.f2386a;
                                            sb2 = new StringBuilder();
                                            i14 = c0620h.f2387b;
                                            if (i14 != 1) {
                                                i15 = 2;
                                                if (i14 == 2) {
                                                    sb2.append("open ");
                                                }
                                            } else {
                                                i15 = 2;
                                                sb2.append("filled ");
                                            }
                                            if (i13 != 0) {
                                                sb2.append("none");
                                            } else if (i13 != 1) {
                                                sb2.append("circle");
                                            } else if (i13 != i15) {
                                                sb2.append("dot");
                                            } else if (i13 != 3) {
                                                sb2.append("unset");
                                            } else {
                                                sb2.append("sesame");
                                            }
                                            String string = sb2.toString();
                                            if (c0620h.f2388c != 2) {
                                                str11 = "over right";
                                            } else {
                                                str11 = "under left";
                                            }
                                            Object[] objArr10 = {string, str11};
                                            int i39 = AbstractC0632A.f2454a;
                                            strM1166f = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr10);
                                        } else {
                                            strM1166f = null;
                                        }
                                    }
                                }
                                if (!z5 || (obj2 instanceof ForegroundColorSpan) || (obj2 instanceof BackgroundColorSpan) || (obj2 instanceof C0617e) || (obj2 instanceof AbsoluteSizeSpan) || (obj2 instanceof RelativeSizeSpan) || (obj2 instanceof C0620h)) {
                                    str12 = "</span>";
                                } else {
                                    if (obj2 instanceof TypefaceSpan) {
                                        if (((TypefaceSpan) obj2).getFamily() != null) {
                                            str12 = "</span>";
                                        }
                                    } else if (obj2 instanceof StyleSpan) {
                                        int style2 = ((StyleSpan) obj2).getStyle();
                                        if (style2 == 1) {
                                            str23 = "</b>";
                                        } else if (style2 == 2) {
                                            str23 = "</i>";
                                        } else if (style2 == 3) {
                                            str23 = "</i></b>";
                                        }
                                    } else if (obj2 instanceof C0619g) {
                                        str23 = "<rt>" + AbstractC1080I.m2922a(((C0619g) obj2).f2381a) + "</rt></ruby>";
                                    } else if (obj2 instanceof UnderlineSpan) {
                                        str23 = "</u>";
                                    }
                                    str12 = str23;
                                }
                                spanStart = spanned.getSpanStart(obj2);
                                spanEnd = spanned.getSpanEnd(obj2);
                                if (strM1166f != null) {
                                    str12.getClass();
                                    C1078G c1078g = new C1078G(spanStart, spanEnd, strM1166f, str12);
                                    c1079h = (C1079H) sparseArray.get(spanStart);
                                    if (c1079h == null) {
                                        c1079h = new C1079H();
                                        sparseArray.put(spanStart, c1079h);
                                    }
                                    c1079h.f4926a.add(c1078g);
                                    c1079h2 = (C1079H) sparseArray.get(spanEnd);
                                    if (c1079h2 == null) {
                                        c1079h2 = new C1079H();
                                        sparseArray.put(spanEnd, c1079h2);
                                    }
                                    c1079h2.f4927b.add(c1078g);
                                }
                                i7 = i12 + 1;
                                str18 = str22;
                                spans = objArr7;
                                length2 = length2;
                                str17 = str17;
                                f7 = f7;
                            }
                            i12 = i7;
                            if (z5) {
                                str12 = "</span>";
                            } else {
                                str12 = "</span>";
                            }
                            spanStart = spanned.getSpanStart(obj2);
                            spanEnd = spanned.getSpanEnd(obj2);
                            if (strM1166f != null) {
                                str12.getClass();
                                C1078G c1078g2 = new C1078G(spanStart, spanEnd, strM1166f, str12);
                                c1079h = (C1079H) sparseArray.get(spanStart);
                                if (c1079h == null) {
                                    c1079h = new C1079H();
                                    sparseArray.put(spanStart, c1079h);
                                }
                                c1079h.f4926a.add(c1078g2);
                                c1079h2 = (C1079H) sparseArray.get(spanEnd);
                                if (c1079h2 == null) {
                                    c1079h2 = new C1079H();
                                    sparseArray.put(spanEnd, c1079h2);
                                }
                                c1079h2.f4927b.add(c1078g2);
                            }
                            i7 = i12 + 1;
                            str18 = str22;
                            spans = objArr7;
                            length2 = length2;
                            str17 = str17;
                            f7 = f7;
                        }
                        str18 = str18;
                        str10 = str17;
                        f4 = f7;
                        sb = new StringBuilder(spanned.length());
                        i8 = 0;
                        i9 = 0;
                        while (i8 < sparseArray.size()) {
                            int iKeyAt = sparseArray.keyAt(i8);
                            sb.append(AbstractC1080I.m2922a(spanned.subSequence(i9, iKeyAt)));
                            C1079H c1079h3 = (C1079H) sparseArray.get(iKeyAt);
                            Collections.sort(c1079h3.f4927b, C1078G.f4921f);
                            arrayList = c1079h3.f4927b;
                            size = arrayList.size();
                            SparseArray sparseArray2 = sparseArray;
                            for (i10 = 0; i10 < size; i10++) {
                                sb.append(((C1078G) arrayList.get(i10)).f4925d);
                            }
                            arrayList2 = c1079h3.f4926a;
                            Collections.sort(arrayList2, C1078G.f4920e);
                            size2 = arrayList2.size();
                            i11 = 0;
                            while (i11 < size2) {
                                Object obj4 = arrayList2.get(i11);
                                i11++;
                                sb.append(((C1078G) obj4).f4924c);
                            }
                            i8++;
                            i9 = iKeyAt;
                            sparseArray = sparseArray2;
                        }
                        sb.append(AbstractC1080I.m2922a(spanned.subSequence(i9, spanned.length())));
                        c0924n = new C0924n(sb.toString(), false);
                    } else {
                        c0924n = new C0924n(AbstractC1080I.m2922a(charSequence), false);
                    }
                    for (String str24 : map2.keySet()) {
                        str16 = (String) map2.put(str24, (String) map2.get(str24));
                        if (str16 != null || str16.equals(map2.get(str24))) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        AbstractC0646n.m1630h(z6);
                    }
                    Integer numValueOf = Integer.valueOf(i27);
                    Float fValueOf2 = Float.valueOf(f4);
                    Integer numValueOf2 = Integer.valueOf(i28);
                    Integer numValueOf3 = Integer.valueOf(i30);
                    f5 = c0614b.f2371q;
                    if (f5 != 0.0f) {
                        if (i31 != 2 || i31 == 1) {
                            str15 = "skewY";
                        } else {
                            str15 = "skewX";
                        }
                        Object[] objArr11 = {str15, Float.valueOf(f5)};
                        int i40 = AbstractC0632A.f2454a;
                        str8 = String.format(Locale.US, "%s(%.2fdeg)", objArr11);
                    }
                    sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf, str6, fValueOf2, str5, str, str20, str3, obj3, str19, strM2928b2, strM745y6, numValueOf2, numValueOf3, str8));
                    sb3.append("<span class='default_bg'>");
                    str13 = c0924n.f4016g;
                    alignment2 = c0614b.f2357c;
                    if (alignment2 != null) {
                        i17 = AbstractC1089S.f4969a[alignment2.ordinal()];
                        if (i17 != 1) {
                            str14 = str9;
                        } else if (i17 != 2) {
                            str14 = "center";
                        } else {
                            str14 = "end";
                        }
                        sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                        sb3.append(str13);
                        sb3.append("</span>");
                    } else {
                        sb3.append(str13);
                    }
                    sb3.append("</span></div>");
                    i27++;
                    str18 = str18;
                    str17 = str10;
                    i18 = 2;
                    i19 = 1;
                }
                str10 = str17;
                f4 = f7;
                while (r3.hasNext()) {
                    str16 = (String) map2.put(str24, (String) map2.get(str24));
                    if (str16 != null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    AbstractC0646n.m1630h(z6);
                }
                Integer numValueOf4 = Integer.valueOf(i27);
                Float fValueOf3 = Float.valueOf(f4);
                Integer numValueOf5 = Integer.valueOf(i28);
                Integer numValueOf6 = Integer.valueOf(i30);
                f5 = c0614b.f2371q;
                if (f5 != 0.0f) {
                    if (i31 != 2) {
                        str15 = "skewY";
                    } else {
                        str15 = "skewY";
                    }
                    Object[] objArr12 = {str15, Float.valueOf(f5)};
                    int i41 = AbstractC0632A.f2454a;
                    str8 = String.format(Locale.US, "%s(%.2fdeg)", objArr12);
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf4, str6, fValueOf3, str5, str, str20, str3, obj3, str19, strM2928b2, strM745y6, numValueOf5, numValueOf6, str8));
                sb3.append("<span class='default_bg'>");
                str13 = c0924n.f4016g;
                alignment2 = c0614b.f2357c;
                if (alignment2 != null) {
                    i17 = AbstractC1089S.f4969a[alignment2.ordinal()];
                    if (i17 != 1) {
                        str14 = str9;
                    } else if (i17 != 2) {
                        str14 = "center";
                    } else {
                        str14 = "end";
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                    sb3.append(str13);
                    sb3.append("</span>");
                } else {
                    sb3.append(str13);
                }
                sb3.append("</span></div>");
                i27++;
                str18 = str18;
                str17 = str10;
                i18 = 2;
                i19 = 1;
            } else {
                c = 0;
                Object[] objArr13 = new Object[i19];
                objArr13[0] = Float.valueOf((1.0f - this.f4975l) * 100.0f);
                str = String.format(Locale.US, "%.2f%%", objArr13);
            }
            z3 = false;
            f = c0614b.f2364j;
            if (f != -3.4028235E38f) {
                Object[] objArr14 = new Object[i19];
                objArr14[c] = Float.valueOf(f * 100.0f);
                str2 = String.format(Locale.US, "%.2f%%", objArr14);
            } else {
                str2 = "fit-content";
            }
            alignment = c0614b.f2356b;
            if (alignment == null) {
                str3 = str2;
                obj = "center";
                i4 = 2;
            } else {
                i3 = AbstractC1089S.f4969a[alignment.ordinal()];
                str3 = str2;
                if (i3 != 1) {
                    i4 = 2;
                    if (i3 != 2) {
                        obj = "center";
                    } else {
                        obj = "end";
                    }
                } else {
                    i4 = 2;
                    obj = "start";
                }
            }
            if (i31 != 1) {
                str4 = "vertical-rl";
            } else if (i31 != i4) {
                str4 = "horizontal-tb";
            } else {
                str4 = "vertical-lr";
            }
            String str110 = str4;
            String strM2928b3 = m2928b(c0614b.f2368n, c0614b.f2369o);
            if (c0614b.f2366l) {
                i5 = c0614b.f2367m;
            } else {
                i5 = this.f4973j.f4986c;
            }
            String strM745y9 = AbstractC0230e.m745y(i5);
            str5 = "right";
            str6 = "top";
            if (i31 != 1) {
                if (i31 != 2) {
                    str5 = z3 ? "bottom" : "top";
                    str6 = "left";
                } else if (!z3) {
                    str5 = "left";
                }
            } else if (z3) {
                str5 = "left";
            }
            if (i31 != 2) {
                str7 = "height";
            } else {
                str7 = "height";
            }
            f3 = getContext().getResources().getDisplayMetrics().density;
            Pattern pattern2 = AbstractC1080I.f4928a;
            String str25 = str7;
            str8 = "";
            Object obj5 = obj;
            charSequence = c0614b.f2355a;
            if (charSequence == null) {
                str9 = "start";
                c0924n = new C0924n("", false);
            } else {
                str9 = "start";
                if (charSequence instanceof Spanned) {
                    c0924n = new C0924n(AbstractC1080I.m2922a(charSequence), false);
                } else {
                    str8 = "";
                    spanned = (Spanned) charSequence;
                    hashSet = new HashSet();
                    backgroundColorSpanArr = (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class);
                    i6 = 0;
                    while (i6 < length) {
                        hashSet.add(Integer.valueOf(backgroundColorSpanArr[i6].getBackgroundColor()));
                        i6++;
                    }
                    map = new HashMap();
                    it = hashSet.iterator();
                    while (it.hasNext()) {
                        int iIntValue2 = ((Integer) it.next()).intValue();
                        String strM1165e2 = AbstractC0462h.m1165e(iIntValue2, "bg_");
                        Iterator it3 = it;
                        String str26 = "." + strM1165e2 + ",." + strM1165e2 + " *";
                        String strM745y10 = AbstractC0230e.m745y(iIntValue2);
                        int i310 = AbstractC0632A.f2454a;
                        Locale locale8 = Locale.US;
                        map.put(str26, str17 + strM745y10 + str18);
                        it = it3;
                    }
                    sparseArray = new SparseArray();
                    spans = spanned.getSpans(0, spanned.length(), Object.class);
                    length2 = spans.length;
                    i7 = 0;
                    while (i7 < length2) {
                        String str27 = str18;
                        obj2 = spans[i7];
                        Object[] objArr15 = spans;
                        z4 = obj2 instanceof StrikethroughSpan;
                        String str28 = null;
                        if (z4) {
                            z5 = z4;
                            strM1166f = "<span style='text-decoration:line-through;'>";
                        } else {
                            z5 = z4;
                            if (obj2 instanceof ForegroundColorSpan) {
                                String strM745y11 = AbstractC0230e.m745y(((ForegroundColorSpan) obj2).getForegroundColor());
                                int i311 = AbstractC0632A.f2454a;
                                Locale locale9 = Locale.US;
                                strM1166f = AbstractC0462h.m1166f("<span style='color:", strM745y11, ";'>");
                            } else {
                                length2 = length2;
                                if (obj2 instanceof BackgroundColorSpan) {
                                    int backgroundColor2 = ((BackgroundColorSpan) obj2).getBackgroundColor();
                                    int i312 = AbstractC0632A.f2454a;
                                    Locale locale10 = Locale.US;
                                    i12 = i7;
                                    strM1166f = "<span class='bg_" + backgroundColor2 + "'>";
                                } else {
                                    i12 = i7;
                                    if (obj2 instanceof C0617e) {
                                        strM1166f = "<span style='text-combine-upright:all;'>";
                                    } else if (obj2 instanceof AbsoluteSizeSpan) {
                                        absoluteSizeSpan = (AbsoluteSizeSpan) obj2;
                                        if (absoluteSizeSpan.getDip()) {
                                            size3 = absoluteSizeSpan.getSize();
                                        } else {
                                            size3 = absoluteSizeSpan.getSize() / f3;
                                        }
                                        Object[] objArr16 = {Float.valueOf(size3)};
                                        int i313 = AbstractC0632A.f2454a;
                                        strM1166f = String.format(Locale.US, "<span style='font-size:%.2fpx;'>", objArr16);
                                    } else if (obj2 instanceof RelativeSizeSpan) {
                                        Object[] objArr17 = {Float.valueOf(((RelativeSizeSpan) obj2).getSizeChange() * 100.0f)};
                                        int i314 = AbstractC0632A.f2454a;
                                        strM1166f = String.format(Locale.US, "<span style='font-size:%.2f%%;'>", objArr17);
                                    } else if (obj2 instanceof TypefaceSpan) {
                                        family = ((TypefaceSpan) obj2).getFamily();
                                        if (family != null) {
                                            int i315 = AbstractC0632A.f2454a;
                                            Locale locale11 = Locale.US;
                                            strM1166f = AbstractC0462h.m1166f("<span style='font-family:\"", family, "\";'>");
                                        } else {
                                            strM1166f = null;
                                        }
                                    } else if (obj2 instanceof StyleSpan) {
                                        style = ((StyleSpan) obj2).getStyle();
                                        if (style != 1) {
                                            strM1166f = "<b>";
                                        } else if (style != 2) {
                                            strM1166f = "<i>";
                                        } else if (style != 3) {
                                            strM1166f = null;
                                        } else {
                                            strM1166f = "<b><i>";
                                        }
                                    } else if (obj2 instanceof C0619g) {
                                        i16 = ((C0619g) obj2).f2382b;
                                        if (i16 != -1) {
                                            strM1166f = "<ruby style='ruby-position:unset;'>";
                                        } else if (i16 != 1) {
                                            strM1166f = "<ruby style='ruby-position:over;'>";
                                        } else if (i16 != 2) {
                                            strM1166f = null;
                                        } else {
                                            strM1166f = "<ruby style='ruby-position:under;'>";
                                        }
                                    } else if (obj2 instanceof UnderlineSpan) {
                                        strM1166f = "<u>";
                                    } else if (obj2 instanceof C0620h) {
                                        c0620h = (C0620h) obj2;
                                        i13 = c0620h.f2386a;
                                        sb2 = new StringBuilder();
                                        i14 = c0620h.f2387b;
                                        if (i14 != 1) {
                                            i15 = 2;
                                            if (i14 == 2) {
                                                sb2.append("open ");
                                            }
                                        } else {
                                            i15 = 2;
                                            sb2.append("filled ");
                                        }
                                        if (i13 != 0) {
                                            sb2.append("none");
                                        } else if (i13 != 1) {
                                            sb2.append("circle");
                                        } else if (i13 != i15) {
                                            sb2.append("dot");
                                        } else if (i13 != 3) {
                                            sb2.append("unset");
                                        } else {
                                            sb2.append("sesame");
                                        }
                                        String string2 = sb2.toString();
                                        if (c0620h.f2388c != 2) {
                                            str11 = "over right";
                                        } else {
                                            str11 = "under left";
                                        }
                                        Object[] objArr18 = {string2, str11};
                                        int i316 = AbstractC0632A.f2454a;
                                        strM1166f = String.format(Locale.US, "<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", objArr18);
                                    } else {
                                        strM1166f = null;
                                    }
                                }
                            }
                            if (z5) {
                                str12 = "</span>";
                            } else {
                                str12 = "</span>";
                            }
                            spanStart = spanned.getSpanStart(obj2);
                            spanEnd = spanned.getSpanEnd(obj2);
                            if (strM1166f != null) {
                                str12.getClass();
                                C1078G c1078g3 = new C1078G(spanStart, spanEnd, strM1166f, str12);
                                c1079h = (C1079H) sparseArray.get(spanStart);
                                if (c1079h == null) {
                                    c1079h = new C1079H();
                                    sparseArray.put(spanStart, c1079h);
                                }
                                c1079h.f4926a.add(c1078g3);
                                c1079h2 = (C1079H) sparseArray.get(spanEnd);
                                if (c1079h2 == null) {
                                    c1079h2 = new C1079H();
                                    sparseArray.put(spanEnd, c1079h2);
                                }
                                c1079h2.f4927b.add(c1078g3);
                            }
                            i7 = i12 + 1;
                            str18 = str27;
                            spans = objArr15;
                            length2 = length2;
                            str17 = str17;
                            f7 = f7;
                        }
                        i12 = i7;
                        if (z5) {
                            str12 = "</span>";
                        } else {
                            str12 = "</span>";
                        }
                        spanStart = spanned.getSpanStart(obj2);
                        spanEnd = spanned.getSpanEnd(obj2);
                        if (strM1166f != null) {
                            str12.getClass();
                            C1078G c1078g4 = new C1078G(spanStart, spanEnd, strM1166f, str12);
                            c1079h = (C1079H) sparseArray.get(spanStart);
                            if (c1079h == null) {
                                c1079h = new C1079H();
                                sparseArray.put(spanStart, c1079h);
                            }
                            c1079h.f4926a.add(c1078g4);
                            c1079h2 = (C1079H) sparseArray.get(spanEnd);
                            if (c1079h2 == null) {
                                c1079h2 = new C1079H();
                                sparseArray.put(spanEnd, c1079h2);
                            }
                            c1079h2.f4927b.add(c1078g4);
                        }
                        i7 = i12 + 1;
                        str18 = str27;
                        spans = objArr15;
                        length2 = length2;
                        str17 = str17;
                        f7 = f7;
                    }
                    str18 = str18;
                    str10 = str17;
                    f4 = f7;
                    sb = new StringBuilder(spanned.length());
                    i8 = 0;
                    i9 = 0;
                    while (i8 < sparseArray.size()) {
                        int iKeyAt2 = sparseArray.keyAt(i8);
                        sb.append(AbstractC1080I.m2922a(spanned.subSequence(i9, iKeyAt2)));
                        C1079H c1079h4 = (C1079H) sparseArray.get(iKeyAt2);
                        Collections.sort(c1079h4.f4927b, C1078G.f4921f);
                        arrayList = c1079h4.f4927b;
                        size = arrayList.size();
                        SparseArray sparseArray3 = sparseArray;
                        while (i10 < size) {
                            sb.append(((C1078G) arrayList.get(i10)).f4925d);
                        }
                        arrayList2 = c1079h4.f4926a;
                        Collections.sort(arrayList2, C1078G.f4920e);
                        size2 = arrayList2.size();
                        i11 = 0;
                        while (i11 < size2) {
                            Object obj6 = arrayList2.get(i11);
                            i11++;
                            sb.append(((C1078G) obj6).f4924c);
                        }
                        i8++;
                        i9 = iKeyAt2;
                        sparseArray = sparseArray3;
                    }
                    sb.append(AbstractC1080I.m2922a(spanned.subSequence(i9, spanned.length())));
                    c0924n = new C0924n(sb.toString(), false);
                }
                while (r3.hasNext()) {
                    str16 = (String) map2.put(str24, (String) map2.get(str24));
                    if (str16 != null) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    AbstractC0646n.m1630h(z6);
                }
                Integer numValueOf7 = Integer.valueOf(i27);
                Float fValueOf4 = Float.valueOf(f4);
                Integer numValueOf8 = Integer.valueOf(i28);
                Integer numValueOf9 = Integer.valueOf(i30);
                f5 = c0614b.f2371q;
                if (f5 != 0.0f) {
                    if (i31 != 2) {
                        str15 = "skewY";
                    } else {
                        str15 = "skewY";
                    }
                    Object[] objArr19 = {str15, Float.valueOf(f5)};
                    int i42 = AbstractC0632A.f2454a;
                    str8 = String.format(Locale.US, "%s(%.2fdeg)", objArr19);
                }
                sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf7, str6, fValueOf4, str5, str, str25, str3, obj5, str110, strM2928b3, strM745y9, numValueOf8, numValueOf9, str8));
                sb3.append("<span class='default_bg'>");
                str13 = c0924n.f4016g;
                alignment2 = c0614b.f2357c;
                if (alignment2 != null) {
                    i17 = AbstractC1089S.f4969a[alignment2.ordinal()];
                    if (i17 != 1) {
                        str14 = str9;
                    } else if (i17 != 2) {
                        str14 = "center";
                    } else {
                        str14 = "end";
                    }
                    sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                    sb3.append(str13);
                    sb3.append("</span>");
                } else {
                    sb3.append(str13);
                }
                sb3.append("</span></div>");
                i27++;
                str18 = str18;
                str17 = str10;
                i18 = 2;
                i19 = 1;
            }
            str10 = str17;
            f4 = f7;
            while (r3.hasNext()) {
                str16 = (String) map2.put(str24, (String) map2.get(str24));
                if (str16 != null) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                AbstractC0646n.m1630h(z6);
            }
            Integer numValueOf10 = Integer.valueOf(i27);
            Float fValueOf5 = Float.valueOf(f4);
            Integer numValueOf11 = Integer.valueOf(i28);
            Integer numValueOf12 = Integer.valueOf(i30);
            f5 = c0614b.f2371q;
            if (f5 != 0.0f) {
                if (i31 != 2) {
                    str15 = "skewY";
                } else {
                    str15 = "skewY";
                }
                Object[] objArr110 = {str15, Float.valueOf(f5)};
                int i43 = AbstractC0632A.f2454a;
                str8 = String.format(Locale.US, "%s(%.2fdeg)", objArr110);
            }
            sb3.append(String.format(Locale.US, "<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", numValueOf10, str6, fValueOf5, str5, str, str25, str3, obj5, str110, strM2928b3, strM745y9, numValueOf11, numValueOf12, str8));
            sb3.append("<span class='default_bg'>");
            str13 = c0924n.f4016g;
            alignment2 = c0614b.f2357c;
            if (alignment2 != null) {
                i17 = AbstractC1089S.f4969a[alignment2.ordinal()];
                if (i17 != 1) {
                    str14 = str9;
                } else if (i17 != 2) {
                    str14 = "center";
                } else {
                    str14 = "end";
                }
                sb3.append("<span style='display:inline-block; text-align:" + str14 + ";'>");
                sb3.append(str13);
                sb3.append("</span>");
            } else {
                sb3.append(str13);
            }
            sb3.append("</span></div>");
            i27++;
            str18 = str18;
            str17 = str10;
            i18 = 2;
            i19 = 1;
        }
        sb3.append("</div></body></html>");
        StringBuilder sb5 = new StringBuilder("<html><head><style>");
        for (String str29 : map2.keySet()) {
            sb5.append(str29);
            sb5.append("{");
            sb5.append((String) map2.get(str29));
            sb5.append("}");
        }
        sb5.append("</style></head>");
        sb3.insert(0, sb5.toString());
        this.f4971h.loadData(Base64.encodeToString(sb3.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        if (!z3 || this.f4972i.isEmpty()) {
            return;
        }
        m2929c();
    }
}
