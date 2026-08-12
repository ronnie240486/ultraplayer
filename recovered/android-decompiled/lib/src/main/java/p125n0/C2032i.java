package p125n0;

import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Display;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import com.zuxoplayer.app.PlayerActivity;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p055T.C0560X;
import p055T.C0562Z;
import p055T.C0564a0;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p105h2.AbstractC1676G;

/* JADX INFO: renamed from: n0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2032i extends C0562Z {

    /* JADX INFO: renamed from: A */
    public final SparseBooleanArray f8848A;

    /* JADX INFO: renamed from: s */
    public boolean f8849s;

    /* JADX INFO: renamed from: t */
    public boolean f8850t;

    /* JADX INFO: renamed from: u */
    public boolean f8851u;

    /* JADX INFO: renamed from: v */
    public boolean f8852v;

    /* JADX INFO: renamed from: w */
    public boolean f8853w;

    /* JADX INFO: renamed from: x */
    public boolean f8854x;

    /* JADX INFO: renamed from: y */
    public boolean f8855y;

    /* JADX INFO: renamed from: z */
    public final SparseArray f8856z;

    /* JADX WARN: Code duplicated, block: B:47:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f6  */
    public C2032i(PlayerActivity playerActivity) {
        CaptioningManager captioningManager;
        Point point;
        Point point2;
        int i3 = AbstractC0632A.f2454a;
        if ((i3 >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) playerActivity.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f2014o = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f2013n = AbstractC1676G.m4120r(locale.toLanguageTag());
            }
        }
        DisplayManager displayManager = (DisplayManager) playerActivity.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) playerActivity.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && AbstractC0632A.m1570K(playerActivity)) {
            String strM1561B = i3 < 28 ? AbstractC0632A.m1561B("sys.display-size") : AbstractC0632A.m1561B("vendor.display-size");
            if (!TextUtils.isEmpty(strM1561B)) {
                try {
                    String[] strArrSplit = strM1561B.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i4 = Integer.parseInt(strArrSplit[0]);
                        int i5 = Integer.parseInt(strArrSplit[1]);
                        if (i4 > 0 && i5 > 0) {
                            point2 = new Point(i4, i5);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                AbstractC0646n.m1635m("Util", "Invalid display size: " + strM1561B);
            }
            if ("Sony".equals(AbstractC0632A.f2456c) && AbstractC0632A.f2457d.startsWith("BRAVIA") && playerActivity.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                point = new Point(3840, 2160);
            } else {
                point = new Point();
                if (i3 >= 23) {
                    Display.Mode mode = display.getMode();
                    point.x = mode.getPhysicalWidth();
                    point.y = mode.getPhysicalHeight();
                } else {
                    display.getRealSize(point);
                }
            }
            point2 = point;
        } else {
            point = new Point();
            if (i3 >= 23) {
                Display.Mode mode2 = display.getMode();
                point.x = mode2.getPhysicalWidth();
                point.y = mode2.getPhysicalHeight();
            } else {
                display.getRealSize(point);
            }
            point2 = point;
        }
        mo1427j(point2.x, point2.y);
        this.f8856z = new SparseArray();
        this.f8848A = new SparseBooleanArray();
        m4603k();
    }

    @Override // p055T.C0562Z
    /* JADX INFO: renamed from: a */
    public final C0564a0 mo1418a() {
        return new C2033j(this);
    }

    @Override // p055T.C0562Z
    /* JADX INFO: renamed from: b */
    public final C0562Z mo1419b(int i3) {
        super.mo1419b(i3);
        return this;
    }

    @Override // p055T.C0562Z
    /* JADX INFO: renamed from: d */
    public final C0562Z mo1421d() {
        this.f2015p = -3;
        return this;
    }

    @Override // p055T.C0562Z
    /* JADX INFO: renamed from: e */
    public final C0562Z mo1422e(C0560X c0560x) {
        super.mo1422e(c0560x);
        return this;
    }

    @Override // p055T.C0562Z
    /* JADX INFO: renamed from: f */
    public final C0562Z mo1423f() {
        super.mo1423f();
        return this;
    }

    @Override // p055T.C0562Z
    /* JADX INFO: renamed from: g */
    public final C0562Z mo1424g(String[] strArr) {
        super.mo1424g(strArr);
        return this;
    }

    @Override // p055T.C0562Z
    /* JADX INFO: renamed from: h */
    public final C0562Z mo1425h() {
        this.f2014o = 0;
        return this;
    }

    @Override // p055T.C0562Z
    /* JADX INFO: renamed from: i */
    public final C0562Z mo1426i(int i3) {
        super.mo1426i(i3);
        return this;
    }

    @Override // p055T.C0562Z
    /* JADX INFO: renamed from: j */
    public final C0562Z mo1427j(int i3, int i4) {
        super.mo1427j(i3, i4);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final void m4603k() {
        this.f8849s = true;
        this.f8850t = true;
        this.f8851u = true;
        this.f8852v = true;
        this.f8853w = true;
        this.f8854x = true;
        this.f8855y = true;
    }

    public C2032i(C2033j c2033j) {
        m1420c(c2033j);
        this.f8849s = c2033j.f8860t;
        this.f8850t = c2033j.f8861u;
        this.f8851u = c2033j.f8862v;
        this.f8852v = c2033j.f8863w;
        this.f8853w = c2033j.f8864x;
        this.f8854x = c2033j.f8865y;
        this.f8855y = c2033j.f8866z;
        SparseArray sparseArray = new SparseArray();
        int i3 = 0;
        while (true) {
            SparseArray sparseArray2 = c2033j.f8858A;
            if (i3 < sparseArray2.size()) {
                sparseArray.put(sparseArray2.keyAt(i3), new HashMap((Map) sparseArray2.valueAt(i3)));
                i3++;
            } else {
                this.f8856z = sparseArray;
                this.f8848A = c2033j.f8859B.clone();
                return;
            }
        }
    }

    public C2032i() {
        this.f8856z = new SparseArray();
        this.f8848A = new SparseBooleanArray();
        m4603k();
    }
}
