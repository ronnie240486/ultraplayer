package p091e;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.AbstractActivityC0900j;
import androidx.activity.C0894d;
import androidx.activity.C0895e;
import androidx.fragment.app.AbstractC0937C;
import androidx.fragment.app.AbstractComponentCallbacksC0963n;
import androidx.fragment.app.C0938D;
import androidx.fragment.app.C0965p;
import androidx.fragment.app.C0966q;
import androidx.lifecycle.AbstractC0981F;
import androidx.lifecycle.C1007t;
import androidx.lifecycle.EnumC0999l;
import androidx.lifecycle.EnumC1000m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import p000A.C0031d;
import p009D0.C0106b;
import p019G1.AbstractC0230e;
import p091e.AbstractActivityC1479j;
import p106i.C1735c;
import p106i.C1740h;
import p106i.C1742j;
import p108i1.C1751d;
import p113k.AbstractC1869i1;
import p113k.C1854d1;
import p113k.C1891s;
import p122m1.AbstractC2003a;
import p136q.AbstractC2120c;
import p144s.AbstractC2208b;
import p157w.C2312f;
import p163x2.AbstractC2364c;
import p168z.InterfaceC2387a;

/* JADX INFO: renamed from: e.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1479j extends AbstractActivityC0900j implements InterfaceC1480k {

    /* JADX INFO: renamed from: A */
    public boolean f6608A;

    /* JADX INFO: renamed from: C */
    public LayoutInflaterFactory2C1458C f6610C;

    /* JADX INFO: renamed from: z */
    public boolean f6613z;

    /* JADX INFO: renamed from: x */
    public final C0031d f6611x = new C0031d(23, new C0965p(this));

    /* JADX INFO: renamed from: y */
    public final C1007t f6612y = new C1007t(this);

    /* JADX INFO: renamed from: B */
    public boolean f6609B = true;

    public AbstractActivityC1479j() {
        ((C1751d) this.f3747k.f3429c).m4208e("android:support:lifecycle", new C0894d(1, this));
        final int i3 = 0;
        m2301g(new InterfaceC2387a(this) { // from class: androidx.fragment.app.o

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractActivityC1479j f4247b;

            {
                this.f4247b = this;
            }

            @Override // p168z.InterfaceC2387a
            /* JADX INFO: renamed from: b */
            public final void mo2543b(Object obj) {
                switch (i3) {
                    case 0:
                        this.f4247b.f6611x.m176x();
                        break;
                    default:
                        this.f4247b.f6611x.m176x();
                        break;
                }
            }
        });
        final int i4 = 1;
        this.f3755s.add(new InterfaceC2387a(this) { // from class: androidx.fragment.app.o

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ AbstractActivityC1479j f4247b;

            {
                this.f4247b = this;
            }

            @Override // p168z.InterfaceC2387a
            /* JADX INFO: renamed from: b */
            public final void mo2543b(Object obj) {
                switch (i4) {
                    case 0:
                        this.f4247b.f6611x.m176x();
                        break;
                    default:
                        this.f4247b.f6611x.m176x();
                        break;
                }
            }
        });
        m2302h(new C0895e(this, 1));
    }

    /* JADX INFO: renamed from: k */
    public static boolean m3705k(AbstractC0937C abstractC0937C) {
        boolean zM3705k = false;
        for (AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n : abstractC0937C.f4066c.m1340i()) {
            if (abstractComponentCallbacksC0963n != null) {
                C0965p c0965p = abstractComponentCallbacksC0963n.f4244y;
                if ((c0965p == null ? null : c0965p.f4252y) != null) {
                    zM3705k |= m3705k(abstractComponentCallbacksC0963n.m2533g());
                }
                if (abstractComponentCallbacksC0963n.f4221R.f4324c.compareTo(EnumC1000m.f4316j) >= 0) {
                    abstractComponentCallbacksC0963n.f4221R.m2571g();
                    zM3705k = true;
                }
            }
        }
        return zM3705k;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m3707j();
        LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = (LayoutInflaterFactory2C1458C) m3706i();
        layoutInflaterFactory2C1458C.m3670v();
        ((ViewGroup) layoutInflaterFactory2C1458C.f6453H.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C1458C.f6489s.m3729a(layoutInflaterFactory2C1458C.f6488r.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0183  */
    /* JADX WARN: Code duplicated, block: B:106:0x0191  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:112:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:115:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01df  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:131:0x020e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:68:0x0101  */
    /* JADX WARN: Code duplicated, block: B:69:0x0105  */
    /* JADX WARN: Code duplicated, block: B:71:0x010f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0119  */
    /* JADX WARN: Code duplicated, block: B:77:0x0121  */
    /* JADX WARN: Code duplicated, block: B:80:0x0129  */
    /* JADX WARN: Code duplicated, block: B:83:0x0131  */
    /* JADX WARN: Code duplicated, block: B:86:0x0139  */
    /* JADX WARN: Code duplicated, block: B:89:0x0141  */
    /* JADX WARN: Code duplicated, block: B:92:0x014d  */
    /* JADX WARN: Code duplicated, block: B:95:0x015c  */
    /* JADX WARN: Code duplicated, block: B:98:0x016b  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        C1735c c1735c;
        float f;
        float f3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = (LayoutInflaterFactory2C1458C) m3706i();
        layoutInflaterFactory2C1458C.f6467V = true;
        int i40 = layoutInflaterFactory2C1458C.f6471Z;
        if (i40 == -100) {
            i40 = AbstractC1486q.f6621h;
        }
        int iM3648C = layoutInflaterFactory2C1458C.m3648C(context, i40);
        if (AbstractC1486q.m3717c(context) && AbstractC1486q.m3717c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC1486q.f6628o) {
                    try {
                        C2312f c2312f = AbstractC1486q.f6622i;
                        if (c2312f == null) {
                            if (AbstractC1486q.f6623j == null) {
                                AbstractC1486q.f6623j = C2312f.m4934b(AbstractC2120c.m4660e(context));
                            }
                            if (!AbstractC1486q.f6623j.f9832a.isEmpty()) {
                                AbstractC1486q.f6622i = AbstractC1486q.f6623j;
                            }
                        } else if (!c2312f.equals(AbstractC1486q.f6623j)) {
                            C2312f c2312f2 = AbstractC1486q.f6622i;
                            AbstractC1486q.f6623j = c2312f2;
                            AbstractC2120c.m4659d(context, c2312f2.f9832a.mo4936b());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!AbstractC1486q.f6625l) {
                AbstractC1486q.f6620g.execute(new RunnableC1481l(context, 0));
            }
        }
        C2312f c2312fM3643o = LayoutInflaterFactory2C1458C.m3643o(context);
        Configuration configuration3 = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C1458C.m3644s(context, iM3648C, c2312fM3643o, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof C1735c) {
                    try {
                        ((C1735c) context).m4187a(LayoutInflaterFactory2C1458C.m3644s(context, iM3648C, c2312fM3643o, null, false));
                    } catch (IllegalStateException unused2) {
                        if (LayoutInflaterFactory2C1458C.f6445q0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (!configuration.equals(configuration2)) {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f = configuration.fontScale;
                                    f3 = configuration2.fontScale;
                                    if (f != f3) {
                                        configuration3.fontScale = f3;
                                    }
                                    i3 = configuration.mcc;
                                    i4 = configuration2.mcc;
                                    if (i3 != i4) {
                                        configuration3.mcc = i4;
                                    }
                                    i5 = configuration.mnc;
                                    i6 = configuration2.mnc;
                                    if (i5 != i6) {
                                        configuration3.mnc = i6;
                                    }
                                    i7 = Build.VERSION.SDK_INT;
                                    if (i7 >= 24) {
                                        AbstractC1491v.m3722a(configuration, configuration2, configuration3);
                                    } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                                        configuration3.locale = configuration2.locale;
                                    }
                                    i8 = configuration.touchscreen;
                                    i9 = configuration2.touchscreen;
                                    if (i8 != i9) {
                                        configuration3.touchscreen = i9;
                                    }
                                    i10 = configuration.keyboard;
                                    i11 = configuration2.keyboard;
                                    if (i10 != i11) {
                                        configuration3.keyboard = i11;
                                    }
                                    i12 = configuration.keyboardHidden;
                                    i13 = configuration2.keyboardHidden;
                                    if (i12 != i13) {
                                        configuration3.keyboardHidden = i13;
                                    }
                                    i14 = configuration.navigation;
                                    i15 = configuration2.navigation;
                                    if (i14 != i15) {
                                        configuration3.navigation = i15;
                                    }
                                    i16 = configuration.navigationHidden;
                                    i17 = configuration2.navigationHidden;
                                    if (i16 != i17) {
                                        configuration3.navigationHidden = i17;
                                    }
                                    i18 = configuration.orientation;
                                    i19 = configuration2.orientation;
                                    if (i18 != i19) {
                                        configuration3.orientation = i19;
                                    }
                                    i20 = configuration.screenLayout & 15;
                                    i21 = configuration2.screenLayout & 15;
                                    if (i20 != i21) {
                                        configuration3.screenLayout |= i21;
                                    }
                                    i22 = configuration.screenLayout & 192;
                                    i23 = configuration2.screenLayout & 192;
                                    if (i22 != i23) {
                                        configuration3.screenLayout |= i23;
                                    }
                                    i24 = configuration.screenLayout & 48;
                                    i25 = configuration2.screenLayout & 48;
                                    if (i24 != i25) {
                                        configuration3.screenLayout |= i25;
                                    }
                                    i26 = configuration.screenLayout & 768;
                                    i27 = configuration2.screenLayout & 768;
                                    if (i26 != i27) {
                                        configuration3.screenLayout |= i27;
                                    }
                                    if (i7 >= 26) {
                                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                            configuration3.colorMode |= configuration2.colorMode & 3;
                                        }
                                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                            configuration3.colorMode |= configuration2.colorMode & 12;
                                        }
                                    }
                                    i28 = configuration.uiMode & 15;
                                    i29 = configuration2.uiMode & 15;
                                    if (i28 != i29) {
                                        configuration3.uiMode |= i29;
                                    }
                                    i30 = configuration.uiMode & 48;
                                    i31 = configuration2.uiMode & 48;
                                    if (i30 != i31) {
                                        configuration3.uiMode |= i31;
                                    }
                                    i32 = configuration.screenWidthDp;
                                    i33 = configuration2.screenWidthDp;
                                    if (i32 != i33) {
                                        configuration3.screenWidthDp = i33;
                                    }
                                    i34 = configuration.screenHeightDp;
                                    i35 = configuration2.screenHeightDp;
                                    if (i34 != i35) {
                                        configuration3.screenHeightDp = i35;
                                    }
                                    i36 = configuration.smallestScreenWidthDp;
                                    i37 = configuration2.smallestScreenWidthDp;
                                    if (i36 != i37) {
                                        configuration3.smallestScreenWidthDp = i37;
                                    }
                                    i38 = configuration.densityDpi;
                                    i39 = configuration2.densityDpi;
                                    if (i38 != i39) {
                                        configuration3.densityDpi = i39;
                                    }
                                }
                            }
                            Configuration configurationM3644s = LayoutInflaterFactory2C1458C.m3644s(context, iM3648C, c2312fM3643o, configuration3, true);
                            c1735c = new C1735c(context, com.zuxoplayer.app.R.style.Theme_AppCompat_Empty);
                            c1735c.m4187a(configurationM3644s);
                            try {
                                if (context.getTheme() != null) {
                                    AbstractC2208b.m4790i(c1735c.getTheme());
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = c1735c;
                        }
                    }
                } else if (LayoutInflaterFactory2C1458C.f6445q0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f = configuration.fontScale;
                            f3 = configuration2.fontScale;
                            if (f != f3) {
                                configuration3.fontScale = f3;
                            }
                            i3 = configuration.mcc;
                            i4 = configuration2.mcc;
                            if (i3 != i4) {
                                configuration3.mcc = i4;
                            }
                            i5 = configuration.mnc;
                            i6 = configuration2.mnc;
                            if (i5 != i6) {
                                configuration3.mnc = i6;
                            }
                            i7 = Build.VERSION.SDK_INT;
                            if (i7 >= 24) {
                                AbstractC1491v.m3722a(configuration, configuration2, configuration3);
                            } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                                configuration3.locale = configuration2.locale;
                            }
                            i8 = configuration.touchscreen;
                            i9 = configuration2.touchscreen;
                            if (i8 != i9) {
                                configuration3.touchscreen = i9;
                            }
                            i10 = configuration.keyboard;
                            i11 = configuration2.keyboard;
                            if (i10 != i11) {
                                configuration3.keyboard = i11;
                            }
                            i12 = configuration.keyboardHidden;
                            i13 = configuration2.keyboardHidden;
                            if (i12 != i13) {
                                configuration3.keyboardHidden = i13;
                            }
                            i14 = configuration.navigation;
                            i15 = configuration2.navigation;
                            if (i14 != i15) {
                                configuration3.navigation = i15;
                            }
                            i16 = configuration.navigationHidden;
                            i17 = configuration2.navigationHidden;
                            if (i16 != i17) {
                                configuration3.navigationHidden = i17;
                            }
                            i18 = configuration.orientation;
                            i19 = configuration2.orientation;
                            if (i18 != i19) {
                                configuration3.orientation = i19;
                            }
                            i20 = configuration.screenLayout & 15;
                            i21 = configuration2.screenLayout & 15;
                            if (i20 != i21) {
                                configuration3.screenLayout |= i21;
                            }
                            i22 = configuration.screenLayout & 192;
                            i23 = configuration2.screenLayout & 192;
                            if (i22 != i23) {
                                configuration3.screenLayout |= i23;
                            }
                            i24 = configuration.screenLayout & 48;
                            i25 = configuration2.screenLayout & 48;
                            if (i24 != i25) {
                                configuration3.screenLayout |= i25;
                            }
                            i26 = configuration.screenLayout & 768;
                            i27 = configuration2.screenLayout & 768;
                            if (i26 != i27) {
                                configuration3.screenLayout |= i27;
                            }
                            if (i7 >= 26) {
                                if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                    configuration3.colorMode |= configuration2.colorMode & 3;
                                }
                                if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                    configuration3.colorMode |= configuration2.colorMode & 12;
                                }
                            }
                            i28 = configuration.uiMode & 15;
                            i29 = configuration2.uiMode & 15;
                            if (i28 != i29) {
                                configuration3.uiMode |= i29;
                            }
                            i30 = configuration.uiMode & 48;
                            i31 = configuration2.uiMode & 48;
                            if (i30 != i31) {
                                configuration3.uiMode |= i31;
                            }
                            i32 = configuration.screenWidthDp;
                            i33 = configuration2.screenWidthDp;
                            if (i32 != i33) {
                                configuration3.screenWidthDp = i33;
                            }
                            i34 = configuration.screenHeightDp;
                            i35 = configuration2.screenHeightDp;
                            if (i34 != i35) {
                                configuration3.screenHeightDp = i35;
                            }
                            i36 = configuration.smallestScreenWidthDp;
                            i37 = configuration2.smallestScreenWidthDp;
                            if (i36 != i37) {
                                configuration3.smallestScreenWidthDp = i37;
                            }
                            i38 = configuration.densityDpi;
                            i39 = configuration2.densityDpi;
                            if (i38 != i39) {
                                configuration3.densityDpi = i39;
                            }
                        }
                    }
                    Configuration configurationM3644s2 = LayoutInflaterFactory2C1458C.m3644s(context, iM3648C, c2312fM3643o, configuration3, true);
                    c1735c = new C1735c(context, com.zuxoplayer.app.R.style.Theme_AppCompat_Empty);
                    c1735c.m4187a(configurationM3644s2);
                    if (context.getTheme() != null) {
                        AbstractC2208b.m4790i(c1735c.getTheme());
                    }
                    context = c1735c;
                }
            }
        } else if (context instanceof C1735c) {
            ((C1735c) context).m4187a(LayoutInflaterFactory2C1458C.m3644s(context, iM3648C, c2312fM3643o, null, false));
        } else if (LayoutInflaterFactory2C1458C.f6445q0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (!configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f = configuration.fontScale;
                    f3 = configuration2.fontScale;
                    if (f != f3) {
                        configuration3.fontScale = f3;
                    }
                    i3 = configuration.mcc;
                    i4 = configuration2.mcc;
                    if (i3 != i4) {
                        configuration3.mcc = i4;
                    }
                    i5 = configuration.mnc;
                    i6 = configuration2.mnc;
                    if (i5 != i6) {
                        configuration3.mnc = i6;
                    }
                    i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 24) {
                        AbstractC1491v.m3722a(configuration, configuration2, configuration3);
                    } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                        configuration3.locale = configuration2.locale;
                    }
                    i8 = configuration.touchscreen;
                    i9 = configuration2.touchscreen;
                    if (i8 != i9) {
                        configuration3.touchscreen = i9;
                    }
                    i10 = configuration.keyboard;
                    i11 = configuration2.keyboard;
                    if (i10 != i11) {
                        configuration3.keyboard = i11;
                    }
                    i12 = configuration.keyboardHidden;
                    i13 = configuration2.keyboardHidden;
                    if (i12 != i13) {
                        configuration3.keyboardHidden = i13;
                    }
                    i14 = configuration.navigation;
                    i15 = configuration2.navigation;
                    if (i14 != i15) {
                        configuration3.navigation = i15;
                    }
                    i16 = configuration.navigationHidden;
                    i17 = configuration2.navigationHidden;
                    if (i16 != i17) {
                        configuration3.navigationHidden = i17;
                    }
                    i18 = configuration.orientation;
                    i19 = configuration2.orientation;
                    if (i18 != i19) {
                        configuration3.orientation = i19;
                    }
                    i20 = configuration.screenLayout & 15;
                    i21 = configuration2.screenLayout & 15;
                    if (i20 != i21) {
                        configuration3.screenLayout |= i21;
                    }
                    i22 = configuration.screenLayout & 192;
                    i23 = configuration2.screenLayout & 192;
                    if (i22 != i23) {
                        configuration3.screenLayout |= i23;
                    }
                    i24 = configuration.screenLayout & 48;
                    i25 = configuration2.screenLayout & 48;
                    if (i24 != i25) {
                        configuration3.screenLayout |= i25;
                    }
                    i26 = configuration.screenLayout & 768;
                    i27 = configuration2.screenLayout & 768;
                    if (i26 != i27) {
                        configuration3.screenLayout |= i27;
                    }
                    if (i7 >= 26) {
                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                            configuration3.colorMode |= configuration2.colorMode & 3;
                        }
                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                            configuration3.colorMode |= configuration2.colorMode & 12;
                        }
                    }
                    i28 = configuration.uiMode & 15;
                    i29 = configuration2.uiMode & 15;
                    if (i28 != i29) {
                        configuration3.uiMode |= i29;
                    }
                    i30 = configuration.uiMode & 48;
                    i31 = configuration2.uiMode & 48;
                    if (i30 != i31) {
                        configuration3.uiMode |= i31;
                    }
                    i32 = configuration.screenWidthDp;
                    i33 = configuration2.screenWidthDp;
                    if (i32 != i33) {
                        configuration3.screenWidthDp = i33;
                    }
                    i34 = configuration.screenHeightDp;
                    i35 = configuration2.screenHeightDp;
                    if (i34 != i35) {
                        configuration3.screenHeightDp = i35;
                    }
                    i36 = configuration.smallestScreenWidthDp;
                    i37 = configuration2.smallestScreenWidthDp;
                    if (i36 != i37) {
                        configuration3.smallestScreenWidthDp = i37;
                    }
                    i38 = configuration.densityDpi;
                    i39 = configuration2.densityDpi;
                    if (i38 != i39) {
                        configuration3.densityDpi = i39;
                    }
                }
            }
            Configuration configurationM3644s3 = LayoutInflaterFactory2C1458C.m3644s(context, iM3648C, c2312fM3643o, configuration3, true);
            c1735c = new C1735c(context, com.zuxoplayer.app.R.style.Theme_AppCompat_Empty);
            c1735c.m4187a(configurationM3644s3);
            if (context.getTheme() != null) {
                AbstractC2208b.m4790i(c1735c.getTheme());
            }
            context = c1735c;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((LayoutInflaterFactory2C1458C) m3706i()).m3646A();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // p136q.AbstractActivityC2123f, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((LayoutInflaterFactory2C1458C) m3706i()).m3646A();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                    }
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f6613z);
        printWriter.print(" mResumed=");
        printWriter.print(this.f6608A);
        printWriter.print(" mStopped=");
        printWriter.print(this.f6609B);
        if (getApplication() != null) {
            new C0106b(this, mo2299d()).m506D(str3, printWriter);
        }
        ((C0965p) this.f6611x.f38h).f4251x.m2477u(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i3) {
        LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = (LayoutInflaterFactory2C1458C) m3706i();
        layoutInflaterFactory2C1458C.m3670v();
        return layoutInflaterFactory2C1458C.f6488r.findViewById(i3);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = (LayoutInflaterFactory2C1458C) m3706i();
        if (layoutInflaterFactory2C1458C.f6492v == null) {
            layoutInflaterFactory2C1458C.m3646A();
            C1469N c1469n = layoutInflaterFactory2C1458C.f6491u;
            layoutInflaterFactory2C1458C.f6492v = new C1740h(c1469n != null ? c1469n.m3695f0() : layoutInflaterFactory2C1458C.f6487q);
        }
        return layoutInflaterFactory2C1458C.f6492v;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i3 = AbstractC1869i1.f8192a;
        return super.getResources();
    }

    /* JADX INFO: renamed from: i */
    public final AbstractC1486q m3706i() {
        if (this.f6610C == null) {
            ExecutorC1484o executorC1484o = AbstractC1486q.f6620g;
            this.f6610C = new LayoutInflaterFactory2C1458C(this, null, this, this);
        }
        return this.f6610C;
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = (LayoutInflaterFactory2C1458C) m3706i();
        if (layoutInflaterFactory2C1458C.f6491u != null) {
            layoutInflaterFactory2C1458C.m3646A();
            layoutInflaterFactory2C1458C.f6491u.getClass();
            layoutInflaterFactory2C1458C.m3647B(0);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m3707j() {
        AbstractC0981F.m2555b(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        AbstractC2364c.m4954e(decorView, "<this>");
        decorView.setTag(com.zuxoplayer.app.R.id.view_tree_view_model_store_owner, this);
        AbstractC0230e.m743w(getWindow().getDecorView(), this);
        AbstractC2003a.m4544q(getWindow().getDecorView(), this);
    }

    /* JADX INFO: renamed from: l */
    public final void m3708l() {
        super.onDestroy();
        ((C0965p) this.f6611x.f38h).f4251x.m2467k();
        this.f6612y.m2568d(EnumC0999l.ON_DESTROY);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m3709m(int i3, MenuItem menuItem) {
        if (super.onMenuItemSelected(i3, menuItem)) {
            return true;
        }
        if (i3 == 6) {
            return ((C0965p) this.f6611x.f38h).f4251x.m2465i();
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final void m3710n() {
        super.onPostResume();
        this.f6612y.m2568d(EnumC0999l.ON_RESUME);
        C0938D c0938d = ((C0965p) this.f6611x.f38h).f4251x;
        c0938d.f4055E = false;
        c0938d.f4056F = false;
        c0938d.f4062L.f4103h = false;
        c0938d.m2476t(7);
    }

    /* JADX INFO: renamed from: o */
    public final void m3711o() {
        C0031d c0031d = this.f6611x;
        c0031d.m176x();
        super.onStart();
        this.f6609B = false;
        boolean z3 = this.f6613z;
        C0965p c0965p = (C0965p) c0031d.f38h;
        if (!z3) {
            this.f6613z = true;
            C0938D c0938d = c0965p.f4251x;
            c0938d.f4055E = false;
            c0938d.f4056F = false;
            c0938d.f4062L.f4103h = false;
            c0938d.m2476t(4);
        }
        c0965p.f4251x.m2480x(true);
        this.f6612y.m2568d(EnumC0999l.ON_START);
        C0938D c0938d2 = c0965p.f4251x;
        c0938d2.f4055E = false;
        c0938d2.f4056F = false;
        c0938d2.f4062L.f4103h = false;
        c0938d2.m2476t(5);
    }

    @Override // androidx.activity.AbstractActivityC0900j, android.app.Activity
    public final void onActivityResult(int i3, int i4, Intent intent) {
        this.f6611x.m176x();
        super.onActivityResult(i3, i4, intent);
    }

    @Override // androidx.activity.AbstractActivityC0900j, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws IllegalAccessException {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = (LayoutInflaterFactory2C1458C) m3706i();
        if (layoutInflaterFactory2C1458C.f6458M && layoutInflaterFactory2C1458C.f6452G) {
            layoutInflaterFactory2C1458C.m3646A();
            C1469N c1469n = layoutInflaterFactory2C1458C.f6491u;
            if (c1469n != null) {
                c1469n.m3698i0(c1469n.f6534i.getResources().getBoolean(com.zuxoplayer.app.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C1891s c1891sM4407a = C1891s.m4407a();
        Context context = layoutInflaterFactory2C1458C.f6487q;
        synchronized (c1891sM4407a) {
            c1891sM4407a.f8264a.m4328l(context);
        }
        layoutInflaterFactory2C1458C.f6470Y = new Configuration(layoutInflaterFactory2C1458C.f6487q.getResources().getConfiguration());
        layoutInflaterFactory2C1458C.m3663m(false, false);
    }

    @Override // androidx.activity.AbstractActivityC0900j, p136q.AbstractActivityC2123f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f6612y.m2568d(EnumC0999l.ON_CREATE);
        C0938D c0938d = ((C0965p) this.f6611x.f38h).f4251x;
        c0938d.f4055E = false;
        c0938d.f4056F = false;
        c0938d.f4062L.f4103h = false;
        c0938d.m2476t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C0966q c0966q = (C0966q) ((C0965p) this.f6611x.f38h).f4251x.f4069f.onCreateView(view, str, context, attributeSet);
        return c0966q == null ? super.onCreateView(view, str, context, attributeSet) : c0966q;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        m3708l();
        m3706i().mo3657e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i3, keyEvent);
        }
        return true;
    }

    @Override // androidx.activity.AbstractActivityC0900j, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i3, MenuItem menuItem) {
        Intent intentM4657b;
        if (!m3709m(i3, menuItem)) {
            LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = (LayoutInflaterFactory2C1458C) m3706i();
            layoutInflaterFactory2C1458C.m3646A();
            C1469N c1469n = layoutInflaterFactory2C1458C.f6491u;
            if (menuItem.getItemId() != 16908332 || c1469n == null || (((C1854d1) c1469n.f6538m).f8136b & 4) == 0 || (intentM4657b = AbstractC2120c.m4657b(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentM4657b)) {
                navigateUpTo(intentM4657b);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentM4657b2 = AbstractC2120c.m4657b(this);
            if (intentM4657b2 == null) {
                intentM4657b2 = AbstractC2120c.m4657b(this);
            }
            if (intentM4657b2 != null) {
                ComponentName component = intentM4657b2.getComponent();
                if (component == null) {
                    component = intentM4657b2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentM4656a = AbstractC2120c.m4656a(this, component);
                    while (intentM4656a != null) {
                        arrayList.add(size, intentM4656a);
                        intentM4656a = AbstractC2120c.m4656a(this, intentM4656a.getComponent());
                    }
                    arrayList.add(intentM4657b2);
                } catch (PackageManager.NameNotFoundException e3) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e3);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f6608A = false;
        ((C0965p) this.f6611x.f38h).f4251x.m2476t(5);
        this.f6612y.m2568d(EnumC0999l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C1458C) m3706i()).m3670v();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        m3710n();
        LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = (LayoutInflaterFactory2C1458C) m3706i();
        layoutInflaterFactory2C1458C.m3646A();
        C1469N c1469n = layoutInflaterFactory2C1458C.f6491u;
        if (c1469n != null) {
            c1469n.f6529B = true;
        }
    }

    @Override // androidx.activity.AbstractActivityC0900j, android.app.Activity
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        this.f6611x.m176x();
        super.onRequestPermissionsResult(i3, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        C0031d c0031d = this.f6611x;
        c0031d.m176x();
        super.onResume();
        this.f6608A = true;
        ((C0965p) c0031d.f38h).f4251x.m2480x(true);
    }

    @Override // android.app.Activity
    public final void onStart() throws IllegalAccessException {
        m3711o();
        ((LayoutInflaterFactory2C1458C) m3706i()).m3663m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f6611x.m176x();
    }

    @Override // android.app.Activity
    public void onStop() {
        m3712p();
        LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C = (LayoutInflaterFactory2C1458C) m3706i();
        layoutInflaterFactory2C1458C.m3646A();
        C1469N c1469n = layoutInflaterFactory2C1458C.f6491u;
        if (c1469n != null) {
            c1469n.f6529B = false;
            C1742j c1742j = c1469n.f6528A;
            if (c1742j != null) {
                c1742j.m4193a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i3) {
        super.onTitleChanged(charSequence, i3);
        m3706i().mo3662l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((LayoutInflaterFactory2C1458C) m3706i()).m3646A();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m3712p() {
        C0031d c0031d;
        super.onStop();
        this.f6609B = true;
        do {
            c0031d = this.f6611x;
        } while (m3705k(((C0965p) c0031d.f38h).f4251x));
        C0938D c0938d = ((C0965p) c0031d.f38h).f4251x;
        c0938d.f4056F = true;
        c0938d.f4062L.f4103h = true;
        c0938d.m2476t(4);
        this.f6612y.m2568d(EnumC0999l.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i3) {
        m3707j();
        m3706i().mo3659i(i3);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i3) {
        super.setTheme(i3);
        ((LayoutInflaterFactory2C1458C) m3706i()).f6472a0 = i3;
    }

    @Override // androidx.activity.AbstractActivityC0900j, android.app.Activity
    public void setContentView(View view) {
        m3707j();
        m3706i().mo3660j(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m3707j();
        m3706i().mo3661k(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        C0966q c0966q = (C0966q) ((C0965p) this.f6611x.f38h).f4251x.f4069f.onCreateView(null, str, context, attributeSet);
        return c0966q == null ? super.onCreateView(str, context, attributeSet) : c0966q;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
