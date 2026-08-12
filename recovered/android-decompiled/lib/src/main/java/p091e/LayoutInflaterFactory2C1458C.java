package p091e;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.media.session.C0858A;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.RunnableC0892b;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.EnumC1000m;
import androidx.lifecycle.InterfaceC1005r;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import p000A.AbstractC0005F;
import p000A.AbstractC0016Q;
import p000A.C0000A;
import p000A.C0026a0;
import p000A.InterfaceC0049m;
import p019G1.AbstractC0230e;
import p087d.AbstractC1376a;
import p106i.AbstractC1733a;
import p106i.C1735c;
import p106i.C1740h;
import p110j.C1767h;
import p110j.C1768i;
import p110j.C1774o;
import p110j.InterfaceC1770k;
import p110j.MenuC1772m;
import p113k.AbstractC1869i1;
import p113k.AbstractC1878l1;
import p113k.C1796C;
import p113k.C1798D;
import p113k.C1802F;
import p113k.C1824Q;
import p113k.C1840Y0;
import p113k.C1847b0;
import p113k.C1854d1;
import p113k.C1861g;
import p113k.C1865h0;
import p113k.C1873k;
import p113k.C1883o;
import p113k.C1885p;
import p113k.C1887q;
import p113k.C1889r;
import p113k.C1891s;
import p113k.C1895u;
import p113k.C1899w;
import p113k.C1901x;
import p113k.C1903y;
import p113k.InterfaceC1871j0;
import p113k.InterfaceC1874k0;
import p124n.C2022i;
import p136q.AbstractC2120c;
import p157w.C2312f;
import p157w.InterfaceC2314h;

/* JADX INFO: renamed from: e.C */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C1458C extends AbstractC1486q implements InterfaceC1770k, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: o0 */
    public static final C2022i f6443o0 = new C2022i();

    /* JADX INFO: renamed from: p0 */
    public static final int[] f6444p0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: q0 */
    public static final boolean f6445q0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: A */
    public AbstractC1733a f6446A;

    /* JADX INFO: renamed from: B */
    public ActionBarContextView f6447B;

    /* JADX INFO: renamed from: C */
    public PopupWindow f6448C;

    /* JADX INFO: renamed from: D */
    public RunnableC1487r f6449D;

    /* JADX INFO: renamed from: G */
    public boolean f6452G;

    /* JADX INFO: renamed from: H */
    public ViewGroup f6453H;

    /* JADX INFO: renamed from: I */
    public TextView f6454I;

    /* JADX INFO: renamed from: J */
    public View f6455J;

    /* JADX INFO: renamed from: K */
    public boolean f6456K;

    /* JADX INFO: renamed from: L */
    public boolean f6457L;

    /* JADX INFO: renamed from: M */
    public boolean f6458M;

    /* JADX INFO: renamed from: N */
    public boolean f6459N;

    /* JADX INFO: renamed from: O */
    public boolean f6460O;

    /* JADX INFO: renamed from: P */
    public boolean f6461P;

    /* JADX INFO: renamed from: Q */
    public boolean f6462Q;

    /* JADX INFO: renamed from: R */
    public boolean f6463R;

    /* JADX INFO: renamed from: S */
    public C1457B[] f6464S;

    /* JADX INFO: renamed from: T */
    public C1457B f6465T;

    /* JADX INFO: renamed from: U */
    public boolean f6466U;

    /* JADX INFO: renamed from: V */
    public boolean f6467V;

    /* JADX INFO: renamed from: W */
    public boolean f6468W;

    /* JADX INFO: renamed from: X */
    public boolean f6469X;

    /* JADX INFO: renamed from: Y */
    public Configuration f6470Y;

    /* JADX INFO: renamed from: Z */
    public final int f6471Z;

    /* JADX INFO: renamed from: a0 */
    public int f6472a0;

    /* JADX INFO: renamed from: b0 */
    public int f6473b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f6474c0;

    /* JADX INFO: renamed from: d0 */
    public C1494y f6475d0;

    /* JADX INFO: renamed from: e0 */
    public C1494y f6476e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f6477f0;

    /* JADX INFO: renamed from: g0 */
    public int f6478g0;

    /* JADX INFO: renamed from: i0 */
    public boolean f6480i0;

    /* JADX INFO: renamed from: j0 */
    public Rect f6481j0;

    /* JADX INFO: renamed from: k0 */
    public Rect f6482k0;

    /* JADX INFO: renamed from: l0 */
    public C1462G f6483l0;

    /* JADX INFO: renamed from: m0 */
    public OnBackInvokedDispatcher f6484m0;

    /* JADX INFO: renamed from: n0 */
    public OnBackInvokedCallback f6485n0;

    /* JADX INFO: renamed from: p */
    public final Object f6486p;

    /* JADX INFO: renamed from: q */
    public final Context f6487q;

    /* JADX INFO: renamed from: r */
    public Window f6488r;

    /* JADX INFO: renamed from: s */
    public WindowCallbackC1493x f6489s;

    /* JADX INFO: renamed from: t */
    public final Object f6490t;

    /* JADX INFO: renamed from: u */
    public C1469N f6491u;

    /* JADX INFO: renamed from: v */
    public C1740h f6492v;

    /* JADX INFO: renamed from: w */
    public CharSequence f6493w;

    /* JADX INFO: renamed from: x */
    public InterfaceC1871j0 f6494x;

    /* JADX INFO: renamed from: y */
    public C1488s f6495y;

    /* JADX INFO: renamed from: z */
    public C1488s f6496z;

    /* JADX INFO: renamed from: E */
    public C0026a0 f6450E = null;

    /* JADX INFO: renamed from: F */
    public final boolean f6451F = true;

    /* JADX INFO: renamed from: h0 */
    public final RunnableC1487r f6479h0 = new RunnableC1487r(this, 0);

    public LayoutInflaterFactory2C1458C(Context context, Window window, InterfaceC1480k interfaceC1480k, Object obj) {
        AbstractActivityC1479j abstractActivityC1479j;
        this.f6471Z = -100;
        this.f6487q = context;
        this.f6490t = interfaceC1480k;
        this.f6486p = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof AbstractActivityC1479j) {
                        abstractActivityC1479j = (AbstractActivityC1479j) context;
                        break;
                    } else if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                abstractActivityC1479j = null;
                break;
            }
            if (abstractActivityC1479j != null) {
                this.f6471Z = ((LayoutInflaterFactory2C1458C) abstractActivityC1479j.m3706i()).f6471Z;
            }
        }
        if (this.f6471Z == -100) {
            C2022i c2022i = f6443o0;
            Integer num = (Integer) c2022i.getOrDefault(this.f6486p.getClass().getName(), null);
            if (num != null) {
                this.f6471Z = num.intValue();
                c2022i.remove(this.f6486p.getClass().getName());
            }
        }
        if (window != null) {
            m3664n(window);
        }
        C1891s.m4408c();
    }

    /* JADX INFO: renamed from: o */
    public static C2312f m3643o(Context context) {
        C2312f c2312f;
        C2312f c2312fM4934b;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33 || (c2312f = AbstractC1486q.f6622i) == null) {
            return null;
        }
        C2312f c2312fM3645y = m3645y(context.getApplicationContext().getResources().getConfiguration());
        InterfaceC2314h interfaceC2314h = c2312f.f9832a;
        int i4 = 0;
        if (i3 < 24) {
            c2312fM4934b = interfaceC2314h.isEmpty() ? C2312f.f9831b : C2312f.m4934b(AbstractC1490u.m3721b(interfaceC2314h.get(0)));
        } else if (interfaceC2314h.isEmpty()) {
            c2312fM4934b = C2312f.f9831b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i4 < c2312fM3645y.f9832a.size() + interfaceC2314h.size()) {
                Locale locale = i4 < interfaceC2314h.size() ? interfaceC2314h.get(i4) : c2312fM3645y.f9832a.get(i4 - interfaceC2314h.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i4++;
            }
            c2312fM4934b = C2312f.m4933a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return c2312fM4934b.f9832a.isEmpty() ? c2312fM3645y : c2312fM4934b;
    }

    /* JADX INFO: renamed from: s */
    public static Configuration m3644s(Context context, int i3, C2312f c2312f, Configuration configuration, boolean z3) {
        int i4;
        if (i3 == 1) {
            i4 = 16;
        } else if (i3 != 2) {
            i4 = z3 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i4 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i4 | (configuration2.uiMode & (-49));
        if (c2312f != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC1491v.m3725d(configuration2, c2312f);
                return configuration2;
            }
            InterfaceC2314h interfaceC2314h = c2312f.f9832a;
            configuration2.setLocale(interfaceC2314h.get(0));
            configuration2.setLayoutDirection(interfaceC2314h.get(0));
        }
        return configuration2;
    }

    /* JADX INFO: renamed from: y */
    public static C2312f m3645y(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? AbstractC1491v.m3723b(configuration) : C2312f.m4934b(AbstractC1490u.m3721b(configuration.locale));
    }

    /* JADX INFO: renamed from: A */
    public final void m3646A() {
        m3670v();
        if (this.f6458M && this.f6491u == null) {
            Object obj = this.f6486p;
            if (obj instanceof Activity) {
                this.f6491u = new C1469N((Activity) obj, this.f6459N);
            } else if (obj instanceof Dialog) {
                this.f6491u = new C1469N((Dialog) obj);
            }
            C1469N c1469n = this.f6491u;
            if (c1469n != null) {
                c1469n.m3697h0(this.f6480i0);
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m3647B(int i3) {
        this.f6478g0 = (1 << i3) | this.f6478g0;
        if (this.f6477f0) {
            return;
        }
        View decorView = this.f6488r.getDecorView();
        RunnableC1487r runnableC1487r = this.f6479h0;
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        decorView.postOnAnimation(runnableC1487r);
        this.f6477f0 = true;
    }

    /* JADX INFO: renamed from: C */
    public final int m3648C(Context context, int i3) {
        if (i3 != -100) {
            if (i3 != -1) {
                if (i3 != 0) {
                    if (i3 != 1 && i3 != 2) {
                        if (i3 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f6476e0 == null) {
                            this.f6476e0 = new C1494y(this, context);
                        }
                        return this.f6476e0.mo3735e();
                    }
                } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m3672x(context).mo3735e();
                }
            }
            return i3;
        }
        return -1;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m3649D() {
        InterfaceC1874k0 interfaceC1874k0;
        C1840Y0 c1840y0;
        boolean z3 = this.f6466U;
        this.f6466U = false;
        C1457B c1457bM3673z = m3673z(0);
        if (!c1457bM3673z.f6439m) {
            AbstractC1733a abstractC1733a = this.f6446A;
            if (abstractC1733a != null) {
                abstractC1733a.mo3680a();
                return true;
            }
            m3646A();
            C1469N c1469n = this.f6491u;
            if (c1469n == null || (interfaceC1874k0 = c1469n.f6538m) == null || (c1840y0 = ((C1854d1) interfaceC1874k0).f8135a.f3915R) == null || c1840y0.f8112h == null) {
                return false;
            }
            C1840Y0 c1840y1 = ((C1854d1) interfaceC1874k0).f8135a.f3915R;
            C1774o c1774o = c1840y1 == null ? null : c1840y1.f8112h;
            if (c1774o != null) {
                c1774o.collapseActionView();
            }
        } else if (!z3) {
            m3667r(c1457bM3673z, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        if (r3.f7887l.getCount() > 0) goto L88;
     */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3650E(C1457B c1457b, KeyEvent keyEvent) {
        int i3;
        ViewGroup.LayoutParams layoutParams;
        if (c1457b.f6439m || this.f6469X) {
            return;
        }
        int i4 = c1457b.f6427a;
        Context context = this.f6487q;
        if (i4 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f6488r.getCallback();
        if (callback != null && !callback.onMenuOpened(i4, c1457b.f6434h)) {
            m3667r(c1457b, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && m3652G(c1457b, keyEvent)) {
            C1456A c1456a = c1457b.f6431e;
            if (c1456a != null && !c1457b.f6440n) {
                View view = c1457b.f6433g;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i3 = -1;
                }
                c1457b.f6438l = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i3, -2, 0, 0, 1002, 8519680, -3);
                layoutParams2.gravity = c1457b.f6429c;
                layoutParams2.windowAnimations = c1457b.f6430d;
                windowManager.addView(c1457b.f6431e, layoutParams2);
                c1457b.f6439m = true;
                if (i4 == 0) {
                    m3654I();
                }
            }
            if (c1456a == null) {
                m3646A();
                C1469N c1469n = this.f6491u;
                Context contextM3695f0 = c1469n != null ? c1469n.m3695f0() : null;
                if (contextM3695f0 != null) {
                    context = contextM3695f0;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(context.getTheme());
                themeNewTheme.resolveAttribute(com.zuxoplayer.app.R.attr.actionBarPopupTheme, typedValue, true);
                int i5 = typedValue.resourceId;
                if (i5 != 0) {
                    themeNewTheme.applyStyle(i5, true);
                }
                themeNewTheme.resolveAttribute(com.zuxoplayer.app.R.attr.panelMenuListTheme, typedValue, true);
                int i6 = typedValue.resourceId;
                if (i6 != 0) {
                    themeNewTheme.applyStyle(i6, true);
                } else {
                    themeNewTheme.applyStyle(com.zuxoplayer.app.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C1735c c1735c = new C1735c(context, 0);
                c1735c.getTheme().setTo(themeNewTheme);
                c1457b.f6436j = c1735c;
                TypedArray typedArrayObtainStyledAttributes = c1735c.obtainStyledAttributes(AbstractC1376a.f6104j);
                c1457b.f6428b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                c1457b.f6430d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                c1457b.f6431e = new C1456A(this, c1457b.f6436j);
                c1457b.f6429c = 81;
            } else if (c1457b.f6440n && c1456a.getChildCount() > 0) {
                c1457b.f6431e.removeAllViews();
            }
            View view2 = c1457b.f6433g;
            if (view2 == null) {
                if (c1457b.f6434h != null) {
                    if (this.f6496z == null) {
                        this.f6496z = new C1488s(this, 3);
                    }
                    C1488s c1488s = this.f6496z;
                    if (c1457b.f6435i == null) {
                        C1768i c1768i = new C1768i(c1457b.f6436j);
                        c1457b.f6435i = c1768i;
                        c1768i.f7886k = c1488s;
                        MenuC1772m menuC1772m = c1457b.f6434h;
                        menuC1772m.m4252b(c1768i, menuC1772m.f7895a);
                    }
                    C1768i c1768i2 = c1457b.f6435i;
                    C1456A c1456a2 = c1457b.f6431e;
                    if (c1768i2.f7885j == null) {
                        c1768i2.f7885j = (ExpandedMenuView) c1768i2.f7883h.inflate(com.zuxoplayer.app.R.layout.abc_expanded_menu_layout, (ViewGroup) c1456a2, false);
                        if (c1768i2.f7887l == null) {
                            c1768i2.f7887l = new C1767h(c1768i2);
                        }
                        c1768i2.f7885j.setAdapter((ListAdapter) c1768i2.f7887l);
                        c1768i2.f7885j.setOnItemClickListener(c1768i2);
                    }
                    ExpandedMenuView expandedMenuView = c1768i2.f7885j;
                    c1457b.f6432f = expandedMenuView;
                    if (expandedMenuView != null) {
                    }
                }
                c1457b.f6440n = true;
                return;
            }
            c1457b.f6432f = view2;
            if (c1457b.f6432f != null) {
                if (c1457b.f6433g == null) {
                    C1768i c1768i3 = c1457b.f6435i;
                    if (c1768i3.f7887l == null) {
                        c1768i3.f7887l = new C1767h(c1768i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams3 = c1457b.f6432f.getLayoutParams();
                if (layoutParams3 == null) {
                    layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
                }
                c1457b.f6431e.setBackgroundResource(c1457b.f6428b);
                ViewParent parent = c1457b.f6432f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c1457b.f6432f);
                }
                c1457b.f6431e.addView(c1457b.f6432f, layoutParams3);
                if (!c1457b.f6432f.hasFocus()) {
                    c1457b.f6432f.requestFocus();
                }
            }
            c1457b.f6440n = true;
            return;
            i3 = -2;
            c1457b.f6438l = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i3, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = c1457b.f6429c;
            layoutParams4.windowAnimations = c1457b.f6430d;
            windowManager.addView(c1457b.f6431e, layoutParams4);
            c1457b.f6439m = true;
            if (i4 == 0) {
                m3654I();
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final boolean m3651F(C1457B c1457b, int i3, KeyEvent keyEvent) {
        MenuC1772m menuC1772m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c1457b.f6437k || m3652G(c1457b, keyEvent)) && (menuC1772m = c1457b.f6434h) != null) {
            return menuC1772m.performShortcut(i3, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:79:0x0114  */
    /* JADX INFO: renamed from: G */
    public final boolean m3652G(C1457B c1457b, KeyEvent keyEvent) {
        MenuC1772m menuC1772m;
        InterfaceC1871j0 interfaceC1871j0;
        InterfaceC1871j0 interfaceC1871j1;
        Resources.Theme themeNewTheme;
        InterfaceC1871j0 interfaceC1871j2;
        InterfaceC1871j0 interfaceC1871j3;
        if (!this.f6469X) {
            if (c1457b.f6437k) {
                return true;
            }
            C1457B c1457b2 = this.f6465T;
            if (c1457b2 != null && c1457b2 != c1457b) {
                m3667r(c1457b2, false);
            }
            Window.Callback callback = this.f6488r.getCallback();
            int i3 = c1457b.f6427a;
            if (callback != null) {
                c1457b.f6433g = callback.onCreatePanelView(i3);
            }
            boolean z3 = i3 == 0 || i3 == 108;
            if (z3 && (interfaceC1871j3 = this.f6494x) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1871j3;
                actionBarOverlayLayout.m2331k();
                ((C1854d1) actionBarOverlayLayout.f3856k).f8146l = true;
            }
            if (c1457b.f6433g == null) {
                MenuC1772m menuC1772m2 = c1457b.f6434h;
                if (menuC1772m2 == null || c1457b.f6441o) {
                    if (menuC1772m2 == null) {
                        Context context = this.f6487q;
                        if ((i3 == 0 || i3 == 108) && this.f6494x != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.zuxoplayer.app.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.zuxoplayer.app.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.zuxoplayer.app.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                C1735c c1735c = new C1735c(context, 0);
                                c1735c.getTheme().setTo(themeNewTheme);
                                context = c1735c;
                            }
                        }
                        MenuC1772m menuC1772m3 = new MenuC1772m(context);
                        menuC1772m3.f7899e = this;
                        MenuC1772m menuC1772m4 = c1457b.f6434h;
                        if (menuC1772m3 != menuC1772m4) {
                            if (menuC1772m4 != null) {
                                menuC1772m4.m4260r(c1457b.f6435i);
                            }
                            c1457b.f6434h = menuC1772m3;
                            C1768i c1768i = c1457b.f6435i;
                            if (c1768i != null) {
                                menuC1772m3.m4252b(c1768i, menuC1772m3.f7895a);
                            }
                        }
                        if (c1457b.f6434h != null) {
                            if (z3 && (interfaceC1871j1 = this.f6494x) != null) {
                                if (this.f6495y == null) {
                                    this.f6495y = new C1488s(this, 2);
                                }
                                ((ActionBarOverlayLayout) interfaceC1871j1).m2332l(c1457b.f6434h, this.f6495y);
                            }
                            c1457b.f6434h.m4265w();
                            if (callback.onCreatePanelMenu(i3, c1457b.f6434h)) {
                                c1457b.f6441o = false;
                            } else {
                                menuC1772m = c1457b.f6434h;
                                if (menuC1772m != null) {
                                    if (menuC1772m != null) {
                                        menuC1772m.m4260r(c1457b.f6435i);
                                    }
                                    c1457b.f6434h = null;
                                }
                                if (z3 && (interfaceC1871j0 = this.f6494x) != null) {
                                    ((ActionBarOverlayLayout) interfaceC1871j0).m2332l(null, this.f6495y);
                                }
                            }
                        }
                    } else {
                        if (z3) {
                            if (this.f6495y == null) {
                                this.f6495y = new C1488s(this, 2);
                            }
                            ((ActionBarOverlayLayout) interfaceC1871j1).m2332l(c1457b.f6434h, this.f6495y);
                        }
                        c1457b.f6434h.m4265w();
                        if (callback.onCreatePanelMenu(i3, c1457b.f6434h)) {
                            menuC1772m = c1457b.f6434h;
                            if (menuC1772m != null) {
                                if (menuC1772m != null) {
                                    menuC1772m.m4260r(c1457b.f6435i);
                                }
                                c1457b.f6434h = null;
                            }
                            if (z3) {
                                ((ActionBarOverlayLayout) interfaceC1871j0).m2332l(null, this.f6495y);
                            }
                        } else {
                            c1457b.f6441o = false;
                        }
                    }
                }
                c1457b.f6434h.m4265w();
                Bundle bundle = c1457b.f6442p;
                if (bundle != null) {
                    c1457b.f6434h.m4261s(bundle);
                    c1457b.f6442p = null;
                }
                if (!callback.onPreparePanel(0, c1457b.f6433g, c1457b.f6434h)) {
                    if (z3 && (interfaceC1871j2 = this.f6494x) != null) {
                        ((ActionBarOverlayLayout) interfaceC1871j2).m2332l(null, this.f6495y);
                    }
                    c1457b.f6434h.m4264v();
                    return false;
                }
                c1457b.f6434h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c1457b.f6434h.m4264v();
            }
            c1457b.f6437k = true;
            c1457b.f6438l = false;
            this.f6465T = c1457b;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public final void m3653H() {
        if (this.f6452G) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m3654I() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z3 = false;
            if (this.f6484m0 != null && (m3673z(0).f6439m || this.f6446A != null)) {
                z3 = true;
            }
            if (z3 && this.f6485n0 == null) {
                this.f6485n0 = AbstractC1492w.m3727b(this.f6484m0, this);
            } else {
                if (z3 || (onBackInvokedCallback = this.f6485n0) == null) {
                    return;
                }
                AbstractC1492w.m3728c(this.f6484m0, onBackInvokedCallback);
                this.f6485n0 = null;
            }
        }
    }

    @Override // p091e.AbstractC1486q
    /* JADX INFO: renamed from: a */
    public final void mo3655a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f6487q);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C1458C) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.m4393j() != false) goto L20;
     */
    @Override // p110j.InterfaceC1770k
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3616b(MenuC1772m menuC1772m) {
        ActionMenuView actionMenuView;
        C1873k c1873k;
        C1873k c1873k2;
        C1873k c1873k3;
        InterfaceC1871j0 interfaceC1871j0 = this.f6494x;
        if (interfaceC1871j0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1871j0;
            actionBarOverlayLayout.m2331k();
            Toolbar toolbar = ((C1854d1) actionBarOverlayLayout.f3856k).f8135a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f3921g) != null && actionMenuView.f3881y) {
                if (ViewConfiguration.get(this.f6487q).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f6494x;
                    actionBarOverlayLayout2.m2331k();
                    ActionMenuView actionMenuView2 = ((C1854d1) actionBarOverlayLayout2.f3856k).f8135a.f3921g;
                    if (actionMenuView2 != null) {
                        C1873k c1873k4 = actionMenuView2.f3882z;
                        if (c1873k4 != null) {
                            if (c1873k4.f8194A == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f6488r.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f6494x;
                actionBarOverlayLayout3.m2331k();
                ActionMenuView actionMenuView3 = ((C1854d1) actionBarOverlayLayout3.f3856k).f8135a.f3921g;
                if ((actionMenuView3 == null || (c1873k3 = actionMenuView3.f3882z) == null || !c1873k3.m4393j()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f6494x;
                    actionBarOverlayLayout4.m2331k();
                    ActionMenuView actionMenuView4 = ((C1854d1) actionBarOverlayLayout4.f3856k).f8135a.f3921g;
                    if (actionMenuView4 != null && (c1873k2 = actionMenuView4.f3882z) != null) {
                        c1873k2.m4392f();
                    }
                    if (this.f6469X) {
                        return;
                    }
                    callback.onPanelClosed(108, m3673z(0).f6434h);
                    return;
                }
                if (callback == null || this.f6469X) {
                    return;
                }
                if (this.f6477f0 && (1 & this.f6478g0) != 0) {
                    View decorView = this.f6488r.getDecorView();
                    RunnableC1487r runnableC1487r = this.f6479h0;
                    decorView.removeCallbacks(runnableC1487r);
                    runnableC1487r.run();
                }
                C1457B c1457bM3673z = m3673z(0);
                MenuC1772m menuC1772m2 = c1457bM3673z.f6434h;
                if (menuC1772m2 == null || c1457bM3673z.f6441o || !callback.onPreparePanel(0, c1457bM3673z.f6433g, menuC1772m2)) {
                    return;
                }
                callback.onMenuOpened(108, c1457bM3673z.f6434h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f6494x;
                actionBarOverlayLayout5.m2331k();
                ActionMenuView actionMenuView5 = ((C1854d1) actionBarOverlayLayout5.f3856k).f8135a.f3921g;
                if (actionMenuView5 == null || (c1873k = actionMenuView5.f3882z) == null) {
                    return;
                }
                c1873k.m4394l();
                return;
            }
        }
        C1457B c1457bM3673z2 = m3673z(0);
        c1457bM3673z2.f6440n = true;
        m3667r(c1457bM3673z2, false);
        m3650E(c1457bM3673z2, null);
    }

    @Override // p091e.AbstractC1486q
    /* JADX INFO: renamed from: d */
    public final void mo3656d() throws IllegalAccessException {
        String strM4658c;
        this.f6467V = true;
        m3663m(false, true);
        m3671w();
        Object obj = this.f6486p;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strM4658c = AbstractC2120c.m4658c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e3) {
                    throw new IllegalArgumentException(e3);
                }
            } catch (IllegalArgumentException unused) {
                strM4658c = null;
            }
            if (strM4658c != null) {
                C1469N c1469n = this.f6491u;
                if (c1469n == null) {
                    this.f6480i0 = true;
                } else {
                    c1469n.m3697h0(true);
                }
            }
            synchronized (AbstractC1486q.f6627n) {
                AbstractC1486q.m3718g(this);
                AbstractC1486q.f6626m.add(new WeakReference(this));
            }
        }
        this.f6470Y = new Configuration(this.f6487q.getResources().getConfiguration());
        this.f6468W = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // p091e.AbstractC1486q
    /* JADX INFO: renamed from: e */
    public final void mo3657e() {
        if (this.f6486p instanceof Activity) {
            synchronized (AbstractC1486q.f6627n) {
                AbstractC1486q.m3718g(this);
            }
        }
        if (this.f6477f0) {
            this.f6488r.getDecorView().removeCallbacks(this.f6479h0);
        }
        this.f6469X = true;
        if (this.f6471Z != -100) {
            Object obj = this.f6486p;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f6443o0.put(this.f6486p.getClass().getName(), Integer.valueOf(this.f6471Z));
            } else {
                f6443o0.remove(this.f6486p.getClass().getName());
            }
        } else {
            f6443o0.remove(this.f6486p.getClass().getName());
        }
        C1494y c1494y = this.f6475d0;
        if (c1494y != null) {
            c1494y.m3737c();
        }
        C1494y c1494y2 = this.f6476e0;
        if (c1494y2 != null) {
            c1494y2.m3737c();
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // p110j.InterfaceC1770k
    /* JADX INFO: renamed from: f */
    public final boolean mo3619f(MenuC1772m menuC1772m, MenuItem menuItem) {
        C1457B c1457b;
        Window.Callback callback = this.f6488r.getCallback();
        if (callback != null && !this.f6469X) {
            MenuC1772m menuC1772mMo4231k = menuC1772m.mo4231k();
            C1457B[] c1457bArr = this.f6464S;
            int length = c1457bArr != null ? c1457bArr.length : 0;
            for (int i3 = 0; i3 < length; i3++) {
                c1457b = c1457bArr[i3];
                if (c1457b != null && c1457b.f6434h == menuC1772mMo4231k) {
                    if (c1457b != null) {
                        return callback.onMenuItemSelected(c1457b.f6427a, menuItem);
                    }
                }
            }
            c1457b = null;
            if (c1457b != null) {
                return callback.onMenuItemSelected(c1457b.f6427a, menuItem);
            }
        }
        return false;
    }

    @Override // p091e.AbstractC1486q
    /* JADX INFO: renamed from: h */
    public final boolean mo3658h(int i3) {
        if (i3 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i3 = 108;
        } else if (i3 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i3 = 109;
        }
        if (this.f6462Q && i3 == 108) {
            return false;
        }
        if (this.f6458M && i3 == 1) {
            this.f6458M = false;
        }
        if (i3 == 1) {
            m3653H();
            this.f6462Q = true;
            return true;
        }
        if (i3 == 2) {
            m3653H();
            this.f6456K = true;
            return true;
        }
        if (i3 == 5) {
            m3653H();
            this.f6457L = true;
            return true;
        }
        if (i3 == 10) {
            m3653H();
            this.f6460O = true;
            return true;
        }
        if (i3 == 108) {
            m3653H();
            this.f6458M = true;
            return true;
        }
        if (i3 != 109) {
            return this.f6488r.requestFeature(i3);
        }
        m3653H();
        this.f6459N = true;
        return true;
    }

    @Override // p091e.AbstractC1486q
    /* JADX INFO: renamed from: i */
    public final void mo3659i(int i3) {
        m3670v();
        ViewGroup viewGroup = (ViewGroup) this.f6453H.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f6487q).inflate(i3, viewGroup);
        this.f6489s.m3729a(this.f6488r.getCallback());
    }

    @Override // p091e.AbstractC1486q
    /* JADX INFO: renamed from: j */
    public final void mo3660j(View view) {
        m3670v();
        ViewGroup viewGroup = (ViewGroup) this.f6453H.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f6489s.m3729a(this.f6488r.getCallback());
    }

    @Override // p091e.AbstractC1486q
    /* JADX INFO: renamed from: k */
    public final void mo3661k(View view, ViewGroup.LayoutParams layoutParams) {
        m3670v();
        ViewGroup viewGroup = (ViewGroup) this.f6453H.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f6489s.m3729a(this.f6488r.getCallback());
    }

    @Override // p091e.AbstractC1486q
    /* JADX INFO: renamed from: l */
    public final void mo3662l(CharSequence charSequence) {
        this.f6493w = charSequence;
        InterfaceC1871j0 interfaceC1871j0 = this.f6494x;
        if (interfaceC1871j0 != null) {
            interfaceC1871j0.setWindowTitle(charSequence);
            return;
        }
        C1469N c1469n = this.f6491u;
        if (c1469n == null) {
            TextView textView = this.f6454I;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        C1854d1 c1854d1 = (C1854d1) c1469n.f6538m;
        if (c1854d1.f8141g) {
            return;
        }
        c1854d1.f8142h = charSequence;
        if ((c1854d1.f8136b & 8) != 0) {
            Toolbar toolbar = c1854d1.f8135a;
            toolbar.setTitle(charSequence);
            if (c1854d1.f8141g) {
                AbstractC0016Q.m87i(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0233  */
    /* JADX WARN: Code duplicated, block: B:72:0x0103  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final boolean m3663m(boolean z3, boolean z4) throws IllegalAccessException {
        int i3;
        boolean z5;
        boolean z6;
        boolean z7;
        Map map;
        boolean z8;
        Object obj;
        Object obj2;
        Object obj3;
        int i4;
        if (this.f6469X) {
            return false;
        }
        int i5 = this.f6471Z;
        if (i5 == -100) {
            i5 = AbstractC1486q.f6621h;
        }
        int i6 = i5;
        Context context = this.f6487q;
        int iM3648C = m3648C(context, i6);
        int i7 = Build.VERSION.SDK_INT;
        C2312f c2312fM3643o = i7 < 33 ? m3643o(context) : null;
        if (!z4 && c2312fM3643o != null) {
            c2312fM3643o = m3645y(context.getResources().getConfiguration());
        }
        Configuration configurationM3644s = m3644s(context, iM3648C, c2312fM3643o, null, false);
        boolean z9 = this.f6474c0;
        Object obj4 = this.f6486p;
        if (z9 || !(obj4 instanceof Activity)) {
            this.f6474c0 = true;
            i3 = this.f6473b0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i3 = 0;
            } else {
                if (i7 >= 29) {
                    i4 = 269221888;
                } else {
                    i4 = i7 >= 24 ? 786432 : 0;
                }
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj4.getClass()), i4);
                    if (activityInfo != null) {
                        this.f6473b0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e3);
                    this.f6473b0 = 0;
                }
                this.f6474c0 = true;
                i3 = this.f6473b0;
            }
        }
        Configuration configuration = this.f6470Y;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i8 = configuration.uiMode & 48;
        int i9 = configurationM3644s.uiMode & 48;
        C2312f c2312fM3645y = m3645y(configuration);
        C2312f c2312fM3645y2 = c2312fM3643o == null ? null : m3645y(configurationM3644s);
        int i10 = i8 != i9 ? 512 : 0;
        if (c2312fM3645y2 != null && !c2312fM3645y.equals(c2312fM3645y2)) {
            i10 |= 8196;
        }
        if (((~i3) & i10) != 0 && z3 && this.f6467V && ((f6445q0 || this.f6468W) && (obj4 instanceof Activity))) {
            Activity activity = (Activity) obj4;
            if (activity.isChild()) {
                z5 = false;
            } else {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 31 && (i10 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationM3644s.getLayoutDirection());
                }
                if (i11 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new RunnableC0892b(18, activity));
                }
                z5 = true;
            }
        } else {
            z5 = false;
        }
        if (z5 || i10 == 0) {
            z6 = z5;
        } else {
            boolean z10 = (i3 & i10) == i10;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i9;
            if (c2312fM3645y2 != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    AbstractC1491v.m3725d(configuration2, c2312fM3645y2);
                } else {
                    InterfaceC2314h interfaceC2314h = c2312fM3645y2.f9832a;
                    configuration2.setLocale(interfaceC2314h.get(0));
                    configuration2.setLayoutDirection(interfaceC2314h.get(0));
                }
            }
            resources.updateConfiguration(configuration2, null);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 < 26 && i12 < 28) {
                if (i12 >= 24) {
                    if (!AbstractC0230e.f564t) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            AbstractC0230e.f563s = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e4) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e4);
                        }
                        AbstractC0230e.f564t = true;
                    }
                    Field field = AbstractC0230e.f563s;
                    if (field != null) {
                        try {
                            obj2 = field.get(resources);
                        } catch (IllegalAccessException e5) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e5);
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!AbstractC0230e.f558n) {
                                try {
                                    Field declaredField2 = obj2.getClass().getDeclaredField("mDrawableCache");
                                    AbstractC0230e.f557m = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e6) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e6);
                                }
                                AbstractC0230e.f558n = true;
                            }
                            Field field2 = AbstractC0230e.f557m;
                            if (field2 != null) {
                                try {
                                    obj3 = field2.get(obj2);
                                } catch (IllegalAccessException e7) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e7);
                                    obj3 = null;
                                }
                            } else {
                                obj3 = null;
                            }
                            if (obj3 != null) {
                                AbstractC0230e.m738p(obj3);
                            }
                        }
                    }
                } else if (i12 >= 23) {
                    if (!AbstractC0230e.f558n) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            AbstractC0230e.f557m = declaredField3;
                            z8 = true;
                            try {
                                declaredField3.setAccessible(true);
                            } catch (NoSuchFieldException e8) {
                                e = e8;
                                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
                            }
                        } catch (NoSuchFieldException e9) {
                            e = e9;
                            z8 = true;
                        }
                        AbstractC0230e.f558n = z8;
                    }
                    Field field3 = AbstractC0230e.f557m;
                    if (field3 != null) {
                        try {
                            obj = field3.get(resources);
                        } catch (IllegalAccessException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e10);
                            obj = null;
                        }
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        AbstractC0230e.m738p(obj);
                    }
                } else {
                    if (!AbstractC0230e.f558n) {
                        try {
                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                            AbstractC0230e.f557m = declaredField4;
                            z7 = true;
                            try {
                                declaredField4.setAccessible(true);
                            } catch (NoSuchFieldException e11) {
                                e = e11;
                                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e);
                            }
                        } catch (NoSuchFieldException e12) {
                            e = e12;
                            z7 = true;
                        }
                        AbstractC0230e.f558n = z7;
                    }
                    Field field4 = AbstractC0230e.f557m;
                    if (field4 != null) {
                        try {
                            map = (Map) field4.get(resources);
                        } catch (IllegalAccessException e13) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e13);
                            map = null;
                        }
                        if (map != null) {
                            map.clear();
                        }
                    }
                }
            }
            int i13 = this.f6472a0;
            if (i13 != 0) {
                context.setTheme(i13);
                if (Build.VERSION.SDK_INT >= 23) {
                    context.getTheme().applyStyle(this.f6472a0, true);
                }
            }
            if (z10 && (obj4 instanceof Activity)) {
                Activity activity2 = (Activity) obj4;
                if (activity2 instanceof InterfaceC1005r) {
                    if (((InterfaceC1005r) activity2).mo2300e().f4324c.compareTo(EnumC1000m.f4315i) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f6468W && !this.f6469X) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
            z6 = true;
        }
        if (z6 && (obj4 instanceof AbstractActivityC1479j)) {
            if ((i10 & 512) != 0) {
            }
            if ((i10 & 4) != 0) {
            }
        }
        if (c2312fM3645y2 != null) {
            C2312f c2312fM3645y3 = m3645y(context.getResources().getConfiguration());
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC1491v.m3724c(c2312fM3645y3);
            } else {
                Locale.setDefault(c2312fM3645y3.f9832a.get(0));
            }
        }
        if (i6 == 0) {
            m3672x(context).m3739h();
        } else {
            C1494y c1494y = this.f6475d0;
            if (c1494y != null) {
                c1494y.m3737c();
            }
        }
        if (i6 == 3) {
            if (this.f6476e0 == null) {
                this.f6476e0 = new C1494y(this, context);
            }
            this.f6476e0.m3739h();
        } else {
            C1494y c1494y2 = this.f6476e0;
            if (c1494y2 != null) {
                c1494y2.m3737c();
            }
        }
        return z6;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    /* JADX INFO: renamed from: n */
    public final void m3664n(Window window) {
        Drawable drawableM4325g;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f6488r != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof WindowCallbackC1493x) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        WindowCallbackC1493x windowCallbackC1493x = new WindowCallbackC1493x(this, callback);
        this.f6489s = windowCallbackC1493x;
        window.setCallback(windowCallbackC1493x);
        int[] iArr = f6444p0;
        Context context = this.f6487q;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableM4325g = null;
        } else {
            C1891s c1891sM4407a = C1891s.m4407a();
            synchronized (c1891sM4407a) {
                drawableM4325g = c1891sM4407a.f8264a.m4325g(context, resourceId, true);
            }
        }
        if (drawableM4325g != null) {
            window.setBackgroundDrawable(drawableM4325g);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f6488r = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f6484m0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f6485n0) != null) {
            AbstractC1492w.m3728c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f6485n0 = null;
        }
        Object obj = this.f6486p;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f6484m0 = AbstractC1492w.m3726a(activity);
            } else {
                this.f6484m0 = null;
            }
        } else {
            this.f6484m0 = null;
        }
        m3654I();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c1798d;
        String attributeValue = str;
        byte b3 = 4;
        View view2 = null;
        if (this.f6483l0 == null) {
            int[] iArr = AbstractC1376a.f6104j;
            Context context2 = this.f6487q;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f6483l0 = new C1462G();
            } else {
                try {
                    this.f6483l0 = (C1462G) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f6483l0 = new C1462G();
                }
            }
        }
        C1462G c1462g = this.f6483l0;
        int i3 = AbstractC1869i1.f8192a;
        c1462g.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1376a.f6118x, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context c1735c = (resourceId == 0 || ((context instanceof C1735c) && ((C1735c) context).f7727a == resourceId)) ? context : new C1735c(context, resourceId);
        attributeValue.getClass();
        switch (attributeValue.hashCode()) {
            case -1946472170:
                if (!attributeValue.equals("RatingBar")) {
                    b3 = -1;
                } else {
                    b3 = 0;
                }
                break;
            case -1455429095:
                if (!attributeValue.equals("CheckedTextView")) {
                    b3 = -1;
                } else {
                    b3 = 1;
                }
                break;
            case -1346021293:
                if (!attributeValue.equals("MultiAutoCompleteTextView")) {
                    b3 = -1;
                } else {
                    b3 = 2;
                }
                break;
            case -938935918:
                if (!attributeValue.equals("TextView")) {
                    b3 = -1;
                } else {
                    b3 = 3;
                }
                break;
            case -937446323:
                if (!attributeValue.equals("ImageButton")) {
                    b3 = -1;
                }
                break;
            case -658531749:
                if (!attributeValue.equals("SeekBar")) {
                    b3 = -1;
                } else {
                    b3 = 5;
                }
                break;
            case -339785223:
                if (!attributeValue.equals("Spinner")) {
                    b3 = -1;
                } else {
                    b3 = 6;
                }
                break;
            case 776382189:
                if (!attributeValue.equals("RadioButton")) {
                    b3 = -1;
                } else {
                    b3 = 7;
                }
                break;
            case 799298502:
                if (!attributeValue.equals("ToggleButton")) {
                    b3 = -1;
                } else {
                    b3 = 8;
                }
                break;
            case 1125864064:
                if (!attributeValue.equals("ImageView")) {
                    b3 = -1;
                } else {
                    b3 = 9;
                }
                break;
            case 1413872058:
                if (!attributeValue.equals("AutoCompleteTextView")) {
                    b3 = -1;
                } else {
                    b3 = 10;
                }
                break;
            case 1601505219:
                if (!attributeValue.equals("CheckBox")) {
                    b3 = -1;
                } else {
                    b3 = 11;
                }
                break;
            case 1666676343:
                if (!attributeValue.equals("EditText")) {
                    b3 = -1;
                } else {
                    b3 = 12;
                }
                break;
            case 2001146706:
                if (!attributeValue.equals("Button")) {
                    b3 = -1;
                } else {
                    b3 = 13;
                }
                break;
            default:
                b3 = -1;
                break;
        }
        switch (b3) {
            case 0:
                c1798d = new C1798D(c1735c, attributeSet);
                break;
            case 1:
                c1798d = new C1889r(c1735c, attributeSet);
                break;
            case 2:
                c1798d = new C1903y(c1735c, attributeSet);
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                c1798d = new C1847b0(c1735c, attributeSet);
                break;
            case 4:
                c1798d = new C1899w(c1735c, attributeSet, com.zuxoplayer.app.R.attr.imageButtonStyle);
                break;
            case 5:
                c1798d = new C1802F(c1735c, attributeSet);
                break;
            case 6:
                c1798d = new C1824Q(c1735c, attributeSet);
                break;
            case 7:
                c1798d = new C1796C(c1735c, attributeSet);
                break;
            case 8:
                c1798d = new C1865h0(c1735c, attributeSet);
                break;
            case 9:
                c1798d = new C1901x(c1735c, attributeSet, 0);
                break;
            case 10:
                c1798d = new C1883o(c1735c, attributeSet);
                break;
            case 11:
                c1798d = new C1887q(c1735c, attributeSet);
                break;
            case 12:
                c1798d = new C1895u(c1735c, attributeSet);
                break;
            case 13:
                c1798d = new C1885p(c1735c, attributeSet);
                break;
            default:
                c1798d = null;
                break;
        }
        if (c1798d == null && context != c1735c) {
            Object[] objArr = c1462g.f6511a;
            if (attributeValue.equals("view")) {
                attributeValue = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c1735c;
                objArr[1] = attributeSet;
                if (-1 == attributeValue.indexOf(46)) {
                    int i4 = 0;
                    while (true) {
                        String[] strArr = C1462G.f6509g;
                        if (i4 < 3) {
                            View viewM3677a = c1462g.m3677a(c1735c, attributeValue, strArr[i4]);
                            if (viewM3677a != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewM3677a;
                            } else {
                                i4++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewM3677a2 = c1462g.m3677a(c1735c, attributeValue, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewM3677a2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            c1798d = view2;
        }
        if (c1798d != null) {
            Context context3 = c1798d.getContext();
            if ((context3 instanceof ContextWrapper) && c1798d.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C1462G.f6505c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c1798d.setOnClickListener(new ViewOnClickListenerC1461F(c1798d, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = c1735c.obtainStyledAttributes(attributeSet, C1462G.f6506d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z3 = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                    new C0000A(com.zuxoplayer.app.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).m4d(c1798d, Boolean.valueOf(z3));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = c1735c.obtainStyledAttributes(attributeSet, C1462G.f6507e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    AbstractC0016Q.m87i(c1798d, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = c1735c.obtainStyledAttributes(attributeSet, C1462G.f6508f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z4 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = AbstractC0016Q.f14a;
                    new C0000A(com.zuxoplayer.app.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).m4d(c1798d, Boolean.valueOf(z4));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return c1798d;
    }

    /* JADX INFO: renamed from: p */
    public final void m3665p(int i3, C1457B c1457b, MenuC1772m menuC1772m) {
        if (menuC1772m == null) {
            if (c1457b == null && i3 >= 0) {
                C1457B[] c1457bArr = this.f6464S;
                if (i3 < c1457bArr.length) {
                    c1457b = c1457bArr[i3];
                }
            }
            if (c1457b != null) {
                menuC1772m = c1457b.f6434h;
            }
        }
        if ((c1457b == null || c1457b.f6439m) && !this.f6469X) {
            WindowCallbackC1493x windowCallbackC1493x = this.f6489s;
            Window.Callback callback = this.f6488r.getCallback();
            windowCallbackC1493x.getClass();
            try {
                windowCallbackC1493x.f6638j = true;
                callback.onPanelClosed(i3, menuC1772m);
            } finally {
                windowCallbackC1493x.f6638j = false;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m3666q(MenuC1772m menuC1772m) {
        C1873k c1873k;
        if (this.f6463R) {
            return;
        }
        this.f6463R = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f6494x;
        actionBarOverlayLayout.m2331k();
        ActionMenuView actionMenuView = ((C1854d1) actionBarOverlayLayout.f3856k).f8135a.f3921g;
        if (actionMenuView != null && (c1873k = actionMenuView.f3882z) != null) {
            c1873k.m4392f();
            C1861g c1861g = c1873k.f8216z;
            if (c1861g != null && c1861g.m4273b()) {
                c1861g.f7971i.dismiss();
            }
        }
        Window.Callback callback = this.f6488r.getCallback();
        if (callback != null && !this.f6469X) {
            callback.onPanelClosed(108, menuC1772m);
        }
        this.f6463R = false;
    }

    /* JADX INFO: renamed from: r */
    public final void m3667r(C1457B c1457b, boolean z3) {
        C1456A c1456a;
        InterfaceC1871j0 interfaceC1871j0;
        C1873k c1873k;
        if (z3 && c1457b.f6427a == 0 && (interfaceC1871j0 = this.f6494x) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1871j0;
            actionBarOverlayLayout.m2331k();
            ActionMenuView actionMenuView = ((C1854d1) actionBarOverlayLayout.f3856k).f8135a.f3921g;
            if (actionMenuView != null && (c1873k = actionMenuView.f3882z) != null && c1873k.m4393j()) {
                m3666q(c1457b.f6434h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f6487q.getSystemService("window");
        if (windowManager != null && c1457b.f6439m && (c1456a = c1457b.f6431e) != null) {
            windowManager.removeView(c1456a);
            if (z3) {
                m3665p(c1457b.f6427a, c1457b, null);
            }
        }
        c1457b.f6437k = false;
        c1457b.f6438l = false;
        c1457b.f6439m = false;
        c1457b.f6432f = null;
        c1457b.f6440n = true;
        if (this.f6465T == c1457b) {
            this.f6465T = null;
        }
        if (c1457b.f6427a == 0) {
            m3654I();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:104:0x014e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:78:0x0105  */
    /* JADX WARN: Code duplicated, block: B:80:0x0109  */
    /* JADX WARN: Code duplicated, block: B:91:0x0123  */
    /* JADX WARN: Code duplicated, block: B:95:0x012d  */
    /* JADX WARN: Code duplicated, block: B:97:0x013b  */
    /* JADX WARN: Code duplicated, block: B:99:0x013f  */
    /* JADX INFO: renamed from: t */
    public final boolean m3668t(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        C1457B c1457bM3673z;
        InterfaceC1871j0 interfaceC1871j0;
        Context context;
        boolean z3;
        boolean z4;
        boolean zM3652G;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        C1873k c1873k;
        C1873k c1873k2;
        C1873k c1873k3;
        C1457B c1457bM3673z2;
        Object obj = this.f6486p;
        if ((!(obj instanceof InterfaceC0049m) && !(obj instanceof AbstractDialogC1460E)) || (decorView = this.f6488r.getDecorView()) == null || !AbstractC0230e.m736n(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                WindowCallbackC1493x windowCallbackC1493x = this.f6489s;
                Window.Callback callback = this.f6488r.getCallback();
                windowCallbackC1493x.getClass();
                try {
                    windowCallbackC1493x.f6637i = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    windowCallbackC1493x.f6637i = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.f6466U = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    c1457bM3673z2 = m3673z(0);
                                    if (!c1457bM3673z2.f6439m) {
                                        m3652G(c1457bM3673z2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.f6446A == null) {
                                    c1457bM3673z = m3673z(0);
                                    interfaceC1871j0 = this.f6494x;
                                    context = this.f6487q;
                                    if (interfaceC1871j0 != null) {
                                        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1871j0;
                                        actionBarOverlayLayout.m2331k();
                                        toolbar = ((C1854d1) actionBarOverlayLayout.f3856k).f8135a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f3921g) == null || !actionMenuView.f3881y || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z3 = c1457bM3673z.f6439m;
                                            if (!z3 || c1457bM3673z.f6438l) {
                                                m3667r(c1457bM3673z, true);
                                                z4 = z3;
                                            } else {
                                                if (c1457bM3673z.f6437k) {
                                                    if (c1457bM3673z.f6441o) {
                                                        c1457bM3673z.f6437k = false;
                                                        zM3652G = m3652G(c1457bM3673z, keyEvent);
                                                    } else {
                                                        zM3652G = true;
                                                    }
                                                    if (zM3652G) {
                                                        m3650E(c1457bM3673z, keyEvent);
                                                        z4 = true;
                                                    }
                                                }
                                                z4 = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f6494x;
                                            actionBarOverlayLayout2.m2331k();
                                            ActionMenuView actionMenuView2 = ((C1854d1) actionBarOverlayLayout2.f3856k).f8135a.f3921g;
                                            if (actionMenuView2 == null || (c1873k2 = actionMenuView2.f3882z) == null || !c1873k2.m4393j()) {
                                                if (!this.f6469X && m3652G(c1457bM3673z, keyEvent)) {
                                                    ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f6494x;
                                                    actionBarOverlayLayout3.m2331k();
                                                    ActionMenuView actionMenuView3 = ((C1854d1) actionBarOverlayLayout3.f3856k).f8135a.f3921g;
                                                    if (actionMenuView3 != null && (c1873k = actionMenuView3.f3882z) != null && c1873k.m4394l()) {
                                                        z4 = true;
                                                    }
                                                }
                                                z4 = false;
                                            } else {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f6494x;
                                                actionBarOverlayLayout4.m2331k();
                                                ActionMenuView actionMenuView4 = ((C1854d1) actionBarOverlayLayout4.f3856k).f8135a.f3921g;
                                                if (actionMenuView4 == null || (c1873k3 = actionMenuView4.f3882z) == null || !c1873k3.m4392f()) {
                                                    z4 = false;
                                                } else {
                                                    z4 = true;
                                                }
                                            }
                                        }
                                    } else {
                                        z3 = c1457bM3673z.f6439m;
                                        if (z3) {
                                        }
                                        m3667r(c1457bM3673z, true);
                                        z4 = z3;
                                    }
                                    if (z4) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (m3649D()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    windowCallbackC1493x.f6637i = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.f6466U = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            c1457bM3673z2 = m3673z(0);
                            if (!c1457bM3673z2.f6439m) {
                                m3652G(c1457bM3673z2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.f6446A == null) {
                            c1457bM3673z = m3673z(0);
                            interfaceC1871j0 = this.f6494x;
                            context = this.f6487q;
                            if (interfaceC1871j0 != null) {
                                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) interfaceC1871j0;
                                actionBarOverlayLayout5.m2331k();
                                toolbar = ((C1854d1) actionBarOverlayLayout5.f3856k).f8135a;
                                if (toolbar.getVisibility() == 0) {
                                    z3 = c1457bM3673z.f6439m;
                                    if (z3) {
                                    }
                                    m3667r(c1457bM3673z, true);
                                    z4 = z3;
                                } else {
                                    z3 = c1457bM3673z.f6439m;
                                    if (z3) {
                                    }
                                    m3667r(c1457bM3673z, true);
                                    z4 = z3;
                                }
                            } else {
                                z3 = c1457bM3673z.f6439m;
                                if (z3) {
                                }
                                m3667r(c1457bM3673z, true);
                                z4 = z3;
                            }
                            if (z4) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (m3649D()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final void m3669u(int i3) {
        C1457B c1457bM3673z = m3673z(i3);
        if (c1457bM3673z.f6434h != null) {
            Bundle bundle = new Bundle();
            c1457bM3673z.f6434h.m4262t(bundle);
            if (bundle.size() > 0) {
                c1457bM3673z.f6442p = bundle;
            }
            c1457bM3673z.f6434h.m4265w();
            c1457bM3673z.f6434h.clear();
        }
        c1457bM3673z.f6441o = true;
        c1457bM3673z.f6440n = true;
        if ((i3 == 108 || i3 == 0) && this.f6494x != null) {
            C1457B c1457bM3673z2 = m3673z(0);
            c1457bM3673z2.f6437k = false;
            m3652G(c1457bM3673z2, null);
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m3670v() {
        ViewGroup viewGroup;
        int i3 = 1;
        int i4 = 0;
        if (this.f6452G) {
            return;
        }
        int[] iArr = AbstractC1376a.f6104j;
        Context context = this.f6487q;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo3658h(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo3658h(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo3658h(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo3658h(10);
        }
        this.f6461P = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m3671w();
        this.f6488r.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f6462Q) {
            viewGroup = this.f6460O ? (ViewGroup) layoutInflaterFrom.inflate(com.zuxoplayer.app.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.zuxoplayer.app.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f6461P) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.zuxoplayer.app.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f6459N = false;
            this.f6458M = false;
        } else if (this.f6458M) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.zuxoplayer.app.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C1735c(context, typedValue.resourceId) : context).inflate(com.zuxoplayer.app.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC1871j0 interfaceC1871j0 = (InterfaceC1871j0) viewGroup.findViewById(com.zuxoplayer.app.R.id.decor_content_parent);
            this.f6494x = interfaceC1871j0;
            interfaceC1871j0.setWindowCallback(this.f6488r.getCallback());
            if (this.f6459N) {
                ((ActionBarOverlayLayout) this.f6494x).m2330j(109);
            }
            if (this.f6456K) {
                ((ActionBarOverlayLayout) this.f6494x).m2330j(2);
            }
            if (this.f6457L) {
                ((ActionBarOverlayLayout) this.f6494x).m2330j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f6458M + ", windowActionBarOverlay: " + this.f6459N + ", android:windowIsFloating: " + this.f6461P + ", windowActionModeOverlay: " + this.f6460O + ", windowNoTitle: " + this.f6462Q + " }");
        }
        C1488s c1488s = new C1488s(this, i4);
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        AbstractC0005F.m28u(viewGroup, c1488s);
        if (this.f6494x == null) {
            this.f6454I = (TextView) viewGroup.findViewById(com.zuxoplayer.app.R.id.title);
        }
        boolean z3 = AbstractC1878l1.f8219a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e4) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e4);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.zuxoplayer.app.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f6488r.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f6488r.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C1488s(this, i3));
        this.f6453H = viewGroup;
        Object obj = this.f6486p;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f6493w;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC1871j0 interfaceC1871j1 = this.f6494x;
            if (interfaceC1871j1 != null) {
                interfaceC1871j1.setWindowTitle(title);
            } else {
                C1469N c1469n = this.f6491u;
                if (c1469n != null) {
                    C1854d1 c1854d1 = (C1854d1) c1469n.f6538m;
                    if (!c1854d1.f8141g) {
                        c1854d1.f8142h = title;
                        if ((c1854d1.f8136b & 8) != 0) {
                            Toolbar toolbar = c1854d1.f8135a;
                            toolbar.setTitle(title);
                            if (c1854d1.f8141g) {
                                AbstractC0016Q.m87i(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f6454I;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f6453H.findViewById(R.id.content);
        View decorView = this.f6488r.getDecorView();
        contentFrameLayout2.f3893m.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f6452G = true;
        C1457B c1457bM3673z = m3673z(0);
        if (this.f6469X || c1457bM3673z.f6434h != null) {
            return;
        }
        m3647B(108);
    }

    /* JADX INFO: renamed from: w */
    public final void m3671w() {
        if (this.f6488r == null) {
            Object obj = this.f6486p;
            if (obj instanceof Activity) {
                m3664n(((Activity) obj).getWindow());
            }
        }
        if (this.f6488r == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX INFO: renamed from: x */
    public final AbstractC1495z m3672x(Context context) {
        if (this.f6475d0 == null) {
            if (C0858A.f3637l == null) {
                Context applicationContext = context.getApplicationContext();
                C0858A.f3637l = new C0858A(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f6475d0 = new C1494y(this, C0858A.f3637l);
        }
        return this.f6475d0;
    }

    /* JADX INFO: renamed from: z */
    public final C1457B m3673z(int i3) {
        C1457B[] c1457bArr = this.f6464S;
        if (c1457bArr == null || c1457bArr.length <= i3) {
            C1457B[] c1457bArr2 = new C1457B[i3 + 1];
            if (c1457bArr != null) {
                System.arraycopy(c1457bArr, 0, c1457bArr2, 0, c1457bArr.length);
            }
            this.f6464S = c1457bArr2;
            c1457bArr = c1457bArr2;
        }
        C1457B c1457b = c1457bArr[i3];
        if (c1457b != null) {
            return c1457b;
        }
        C1457B c1457b2 = new C1457B();
        c1457b2.f6427a = i3;
        c1457b2.f6440n = false;
        c1457bArr[i3] = c1457b2;
        return c1457b2;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
