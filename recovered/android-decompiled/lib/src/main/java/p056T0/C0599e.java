package p056T0;

import android.graphics.Color;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1303m;
import p045P0.AbstractC0462h;
import p064W.AbstractC0646n;

/* JADX INFO: renamed from: T0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0599e {

    /* JADX INFO: renamed from: a */
    public final String f2233a;

    /* JADX INFO: renamed from: b */
    public final int f2234b;

    /* JADX INFO: renamed from: c */
    public final Integer f2235c;

    /* JADX INFO: renamed from: d */
    public final Integer f2236d;

    /* JADX INFO: renamed from: e */
    public final float f2237e;

    /* JADX INFO: renamed from: f */
    public final boolean f2238f;

    /* JADX INFO: renamed from: g */
    public final boolean f2239g;

    /* JADX INFO: renamed from: h */
    public final boolean f2240h;

    /* JADX INFO: renamed from: i */
    public final boolean f2241i;

    /* JADX INFO: renamed from: j */
    public final int f2242j;

    public C0599e(String str, int i3, Integer num, Integer num2, float f, boolean z3, boolean z4, boolean z5, boolean z6, int i4) {
        this.f2233a = str;
        this.f2234b = i3;
        this.f2235c = num;
        this.f2236d = num2;
        this.f2237e = f;
        this.f2238f = z3;
        this.f2239g = z4;
        this.f2240h = z5;
        this.f2241i = z6;
        this.f2242j = i4;
    }

    /* JADX INFO: renamed from: a */
    public static int m1461a(String str) {
        boolean z3;
        try {
            int i3 = Integer.parseInt(str.trim());
            switch (i3) {
                case 1:
                case 2:
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z3 = true;
                    break;
                default:
                    z3 = false;
                    break;
            }
            if (z3) {
                return i3;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC0462h.m1171k("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1462b(String str) {
        try {
            int i3 = Integer.parseInt(str);
            return i3 == 1 || i3 == -1;
        } catch (NumberFormatException e3) {
            AbstractC0646n.m1648z("SsaStyle", "Failed to parse boolean value: '" + str + "'", e3);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Integer m1463c(String str) {
        try {
            long j3 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC0646n.m1625c(j3 <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC1303m.m3312e(((j3 >> 24) & 255) ^ 255), AbstractC1303m.m3312e(j3 & 255), AbstractC1303m.m3312e((j3 >> 8) & 255), AbstractC1303m.m3312e((j3 >> 16) & 255)));
        } catch (IllegalArgumentException e3) {
            AbstractC0646n.m1648z("SsaStyle", "Failed to parse color expression: '" + str + "'", e3);
            return null;
        }
    }
}
