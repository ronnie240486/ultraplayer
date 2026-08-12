package p083b1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.p080ui.AspectRatioFrameLayout;
import androidx.media3.p080ui.SubtitleView;
import com.zuxoplayer.app.PlayerActivity;
import com.zuxoplayer.app.R;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000A.C0031d;
import p038N.AbstractC0402b;
import p055T.C0566b0;
import p055T.C0568c0;
import p055T.C0574f0;
import p055T.InterfaceC0553P;
import p055T.InterfaceC0580l;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.RunnableC0647o;
import p105h2.AbstractC1676G;

/* JADX INFO: renamed from: b1.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1076E extends FrameLayout {

    /* JADX INFO: renamed from: A */
    public InterfaceC1108r f4887A;

    /* JADX INFO: renamed from: B */
    public int f4888B;

    /* JADX INFO: renamed from: C */
    public int f4889C;

    /* JADX INFO: renamed from: D */
    public Drawable f4890D;

    /* JADX INFO: renamed from: E */
    public int f4891E;

    /* JADX INFO: renamed from: F */
    public boolean f4892F;

    /* JADX INFO: renamed from: G */
    public CharSequence f4893G;

    /* JADX INFO: renamed from: H */
    public int f4894H;

    /* JADX INFO: renamed from: I */
    public boolean f4895I;

    /* JADX INFO: renamed from: J */
    public boolean f4896J;

    /* JADX INFO: renamed from: K */
    public boolean f4897K;

    /* JADX INFO: renamed from: L */
    public boolean f4898L;

    /* JADX INFO: renamed from: g */
    public final ViewOnClickListenerC1072A f4899g;

    /* JADX INFO: renamed from: h */
    public final AspectRatioFrameLayout f4900h;

    /* JADX INFO: renamed from: i */
    public final View f4901i;

    /* JADX INFO: renamed from: j */
    public final View f4902j;

    /* JADX INFO: renamed from: k */
    public final boolean f4903k;

    /* JADX INFO: renamed from: l */
    public final C0031d f4904l;

    /* JADX INFO: renamed from: m */
    public final ImageView f4905m;

    /* JADX INFO: renamed from: n */
    public final ImageView f4906n;

    /* JADX INFO: renamed from: o */
    public final SubtitleView f4907o;

    /* JADX INFO: renamed from: p */
    public final View f4908p;

    /* JADX INFO: renamed from: q */
    public final TextView f4909q;

    /* JADX INFO: renamed from: r */
    public final C1109s f4910r;

    /* JADX INFO: renamed from: s */
    public final FrameLayout f4911s;

    /* JADX INFO: renamed from: t */
    public final FrameLayout f4912t;

    /* JADX INFO: renamed from: u */
    public final Handler f4913u;

    /* JADX INFO: renamed from: v */
    public final Class f4914v;

    /* JADX INFO: renamed from: w */
    public final Method f4915w;

    /* JADX INFO: renamed from: x */
    public final Object f4916x;

    /* JADX INFO: renamed from: y */
    public InterfaceC0553P f4917y;

    /* JADX INFO: renamed from: z */
    public boolean f4918z;

    public C1076E(PlayerActivity playerActivity) {
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        super(playerActivity, null, 0);
        ViewOnClickListenerC1072A viewOnClickListenerC1072A = new ViewOnClickListenerC1072A(this);
        this.f4899g = viewOnClickListenerC1072A;
        this.f4913u = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f4900h = null;
            this.f4901i = null;
            this.f4902j = null;
            this.f4903k = false;
            this.f4904l = null;
            this.f4905m = null;
            this.f4906n = null;
            this.f4907o = null;
            this.f4908p = null;
            this.f4909q = null;
            this.f4910r = null;
            this.f4911s = null;
            this.f4912t = null;
            this.f4914v = null;
            this.f4915w = null;
            this.f4916x = null;
            ImageView imageView = new ImageView(playerActivity);
            if (AbstractC0632A.f2454a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(2131230882, playerActivity.getTheme()));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(2131230882, playerActivity.getTheme()));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        LayoutInflater.from(playerActivity).inflate(R.layout.exo_player_view, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f4900h = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(0);
        }
        this.f4901i = findViewById(R.id.exo_shutter);
        if (aspectRatioFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            SurfaceView surfaceView = new SurfaceView(playerActivity);
            if (AbstractC0632A.f2454a >= 34) {
                surfaceView.setSurfaceLifecycle(2);
            }
            this.f4902j = surfaceView;
            surfaceView.setLayoutParams(layoutParams);
            surfaceView.setOnClickListener(viewOnClickListenerC1072A);
            surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(surfaceView, 0);
        } else {
            this.f4902j = null;
        }
        this.f4903k = false;
        this.f4904l = AbstractC0632A.f2454a == 34 ? new C0031d(26) : null;
        this.f4911s = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.f4912t = (FrameLayout) findViewById(R.id.exo_overlay);
        this.f4905m = (ImageView) findViewById(R.id.exo_image);
        this.f4889C = 0;
        try {
            cls = ExoPlayer.class;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: b1.y
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    C1076E c1076e = this.f5175a;
                    c1076e.getClass();
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    c1076e.f4913u.post(new RunnableC0647o(c1076e, 3, (Bitmap) objArr[1]));
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f4914v = cls;
        this.f4915w = method;
        this.f4916x = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f4906n = imageView2;
        this.f4888B = imageView2 != null ? 1 : 0;
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f4907o = subtitleView;
        if (subtitleView != null) {
            subtitleView.m2586a();
            subtitleView.m2587b();
        }
        View viewFindViewById = findViewById(R.id.exo_buffering);
        this.f4908p = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        this.f4891E = 0;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.f4909q = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        C1109s c1109s = (C1109s) findViewById(R.id.exo_controller);
        View viewFindViewById2 = findViewById(R.id.exo_controller_placeholder);
        if (c1109s != null) {
            this.f4910r = c1109s;
        } else if (viewFindViewById2 != null) {
            C1109s c1109s2 = new C1109s(playerActivity);
            this.f4910r = c1109s2;
            c1109s2.setId(R.id.exo_controller);
            c1109s2.setLayoutParams(viewFindViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById2);
            viewGroup.removeView(viewFindViewById2);
            viewGroup.addView(c1109s2, iIndexOfChild);
        } else {
            this.f4910r = null;
        }
        C1109s c1109s3 = this.f4910r;
        this.f4894H = c1109s3 != null ? 5000 : 0;
        this.f4897K = true;
        this.f4895I = true;
        this.f4896J = true;
        this.f4918z = c1109s3 != null;
        if (c1109s3 != null) {
            C1114x c1114x = c1109s3.f5097g;
            int i3 = c1114x.f5174z;
            if (i3 != 3 && i3 != 2) {
                c1114x.m2968f();
                c1114x.m2971i(2);
            }
            C1109s c1109s4 = this.f4910r;
            ViewOnClickListenerC1072A viewOnClickListenerC1072A2 = this.f4899g;
            c1109s4.getClass();
            viewOnClickListenerC1072A2.getClass();
            c1109s4.f5103j.add(viewOnClickListenerC1072A2);
        }
        setClickable(true);
        m2917l();
    }

    /* JADX INFO: renamed from: a */
    public static void m2906a(C1076E c1076e, Bitmap bitmap) {
        c1076e.getClass();
        c1076e.setImage(new BitmapDrawable(c1076e.getResources(), bitmap));
        InterfaceC0553P interfaceC0553P = c1076e.f4917y;
        if (interfaceC0553P != null && ((AbstractC0402b) interfaceC0553P).m1089U(30) && interfaceC0553P.mo1327z().m1434a(2)) {
            return;
        }
        ImageView imageView = c1076e.f4905m;
        if (imageView != null) {
            imageView.setVisibility(0);
            c1076e.m2920o();
        }
        View view = c1076e.f4901i;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f4905m;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        m2920o();
    }

    private void setImageOutput(InterfaceC0553P interfaceC0553P) {
        Class cls = this.f4914v;
        if (cls == null || !cls.isAssignableFrom(interfaceC0553P.getClass())) {
            return;
        }
        try {
            Method method = this.f4915w;
            method.getClass();
            Object obj = this.f4916x;
            obj.getClass();
            method.invoke(interfaceC0553P, obj);
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2907b() {
        InterfaceC0553P interfaceC0553P = this.f4917y;
        return interfaceC0553P != null && this.f4916x != null && ((AbstractC0402b) interfaceC0553P).m1089U(30) && interfaceC0553P.mo1327z().m1434a(4);
    }

    /* JADX INFO: renamed from: c */
    public final void m2908c() {
        ImageView imageView = this.f4905m;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2909d() {
        InterfaceC0553P interfaceC0553P = this.f4917y;
        return interfaceC0553P != null && ((AbstractC0402b) interfaceC0553P).m1089U(16) && this.f4917y.mo1310j() && this.f4917y.mo1322t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C0031d c0031d;
        SurfaceSyncGroup surfaceSyncGroup;
        super.dispatchDraw(canvas);
        if (AbstractC0632A.f2454a != 34 || (c0031d = this.f4904l) == null || !this.f4898L || (surfaceSyncGroup = (SurfaceSyncGroup) c0031d.f38h) == null) {
            return;
        }
        surfaceSyncGroup.markSyncReady();
        c0031d.f38h = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        InterfaceC0553P interfaceC0553P = this.f4917y;
        if (interfaceC0553P != null && ((AbstractC0402b) interfaceC0553P).m1089U(16) && this.f4917y.mo1310j()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z3 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        C1109s c1109s = this.f4910r;
        if (z3 && m2921p() && !c1109s.m2948g()) {
            m2910e(true);
            return true;
        }
        if ((m2921p() && c1109s.m2944c(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            m2910e(true);
            return true;
        }
        if (z3 && m2921p()) {
            m2910e(true);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m2910e(boolean z3) {
        if (!(m2909d() && this.f4896J) && m2921p()) {
            C1109s c1109s = this.f4910r;
            boolean z4 = c1109s.m2948g() && c1109s.getShowTimeoutMs() <= 0;
            boolean zM2912g = m2912g();
            if (z3 || z4 || zM2912g) {
                m2913h(zM2912g);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2911f(Drawable drawable) {
        ImageView imageView = this.f4906n;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f4888B == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f4900h;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2912g() {
        InterfaceC0553P interfaceC0553P = this.f4917y;
        if (interfaceC0553P == null) {
            return true;
        }
        int iMo1304g = interfaceC0553P.mo1304g();
        if (!this.f4895I) {
            return false;
        }
        if (((AbstractC0402b) this.f4917y).m1089U(17) && this.f4917y.mo1324w().m1415p()) {
            return false;
        }
        if (iMo1304g != 1 && iMo1304g != 4) {
            InterfaceC0553P interfaceC0553P2 = this.f4917y;
            interfaceC0553P2.getClass();
            if (interfaceC0553P2.mo1322t()) {
                return false;
            }
        }
        return true;
    }

    public List<C0031d> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f4912t;
        if (frameLayout != null) {
            arrayList.add(new C0031d(18, frameLayout));
        }
        C1109s c1109s = this.f4910r;
        if (c1109s != null) {
            arrayList.add(new C0031d(18, c1109s));
        }
        return AbstractC1676G.m4117n(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.f4911s;
        AbstractC0646n.m1632j(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public int getArtworkDisplayMode() {
        return this.f4888B;
    }

    public boolean getControllerAutoShow() {
        return this.f4895I;
    }

    public boolean getControllerHideOnTouch() {
        return this.f4897K;
    }

    public int getControllerShowTimeoutMs() {
        return this.f4894H;
    }

    public Drawable getDefaultArtwork() {
        return this.f4890D;
    }

    public int getImageDisplayMode() {
        return this.f4889C;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f4912t;
    }

    public InterfaceC0553P getPlayer() {
        return this.f4917y;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f4900h;
        AbstractC0646n.m1631i(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f4907o;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f4888B != 0;
    }

    public boolean getUseController() {
        return this.f4918z;
    }

    public View getVideoSurfaceView() {
        return this.f4902j;
    }

    /* JADX INFO: renamed from: h */
    public final void m2913h(boolean z3) {
        if (m2921p()) {
            int i3 = z3 ? 0 : this.f4894H;
            C1109s c1109s = this.f4910r;
            c1109s.setShowTimeoutMs(i3);
            C1114x c1114x = c1109s.f5097g;
            C1109s c1109s2 = c1114x.f5149a;
            if (!c1109s2.m2949h()) {
                c1109s2.setVisibility(0);
                c1109s2.m2950i();
                ImageView imageView = c1109s2.f5125u;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            c1114x.m2972k();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2914i() {
        if (!m2921p() || this.f4917y == null) {
            return;
        }
        C1109s c1109s = this.f4910r;
        if (!c1109s.m2948g()) {
            m2910e(true);
        } else if (this.f4897K) {
            c1109s.m2947f();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2915j() {
        InterfaceC0553P interfaceC0553P = this.f4917y;
        C0574f0 c0574f0Mo1288J = interfaceC0553P != null ? interfaceC0553P.mo1288J() : C0574f0.f2070d;
        int i3 = c0574f0Mo1288J.f2071a;
        int i4 = c0574f0Mo1288J.f2072b;
        float f = this.f4903k ? 0.0f : (i4 == 0 || i3 == 0) ? 0.0f : (i3 * c0574f0Mo1288J.f2073c) / i4;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f4900h;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    /* JADX INFO: renamed from: k */
    public final void m2916k() {
        boolean z3;
        View view = this.f4908p;
        if (view != null) {
            InterfaceC0553P interfaceC0553P = this.f4917y;
            if (interfaceC0553P == null || interfaceC0553P.mo1304g() != 2) {
                z3 = false;
            } else {
                int i3 = this.f4891E;
                z3 = true;
                if (i3 != 2 && (i3 != 1 || !this.f4917y.mo1322t())) {
                    z3 = false;
                }
            }
            view.setVisibility(z3 ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2917l() {
        C1109s c1109s = this.f4910r;
        if (c1109s == null || !this.f4918z) {
            setContentDescription(null);
        } else if (c1109s.m2948g()) {
            setContentDescription(this.f4897K ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m2918m() {
        TextView textView = this.f4909q;
        if (textView != null) {
            CharSequence charSequence = this.f4893G;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
            } else {
                InterfaceC0553P interfaceC0553P = this.f4917y;
                if (interfaceC0553P != null) {
                    interfaceC0553P.mo1306h();
                }
                textView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2919n(boolean z3) {
        byte[] bArr;
        Drawable drawable;
        InterfaceC0553P interfaceC0553P = this.f4917y;
        boolean zM2911f = false;
        boolean z4 = (interfaceC0553P == null || !((AbstractC0402b) interfaceC0553P).m1089U(30) || interfaceC0553P.mo1327z().f2055a.isEmpty()) ? false : true;
        boolean z5 = this.f4892F;
        ImageView imageView = this.f4906n;
        View view = this.f4901i;
        if (!z5 && (!z4 || z3)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            m2908c();
        }
        if (z4) {
            InterfaceC0553P interfaceC0553P2 = this.f4917y;
            boolean z6 = interfaceC0553P2 != null && ((AbstractC0402b) interfaceC0553P2).m1089U(30) && interfaceC0553P2.mo1327z().m1434a(2);
            boolean zM2907b = m2907b();
            if (!z6 && !zM2907b) {
                if (view != null) {
                    view.setVisibility(0);
                }
                m2908c();
            }
            ImageView imageView2 = this.f4905m;
            boolean z7 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zM2907b && !z6 && z7) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    m2920o();
                }
            } else if (z6 && !zM2907b && z7) {
                m2908c();
            }
            if (!z6 && !zM2907b && this.f4888B != 0) {
                AbstractC0646n.m1631i(imageView);
                if (interfaceC0553P != null && ((AbstractC0402b) interfaceC0553P).m1089U(18) && (bArr = interfaceC0553P.mo1289K().f1920g) != null) {
                    zM2911f = m2911f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zM2911f || m2911f(this.f4890D)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m2920o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.f4905m;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f4889C == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.f4900h) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!m2921p() || this.f4917y == null) {
            return false;
        }
        m2910e(true);
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2921p() {
        if (!this.f4918z) {
            return false;
        }
        AbstractC0646n.m1631i(this.f4910r);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        m2914i();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i3) {
        AbstractC0646n.m1630h(i3 == 0 || this.f4906n != null);
        if (this.f4888B != i3) {
            this.f4888B = i3;
            m2919n(false);
        }
    }

    public void setAspectRatioListener(InterfaceC1091a interfaceC1091a) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f4900h;
        AbstractC0646n.m1631i(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(interfaceC1091a);
    }

    public void setControllerAnimationEnabled(boolean z3) {
        C1109s c1109s = this.f4910r;
        AbstractC0646n.m1631i(c1109s);
        c1109s.setAnimationEnabled(z3);
    }

    public void setControllerAutoShow(boolean z3) {
        this.f4895I = z3;
    }

    public void setControllerHideDuringAds(boolean z3) {
        this.f4896J = z3;
    }

    public void setControllerHideOnTouch(boolean z3) {
        AbstractC0646n.m1631i(this.f4910r);
        this.f4897K = z3;
        m2917l();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(InterfaceC1099i interfaceC1099i) {
        C1109s c1109s = this.f4910r;
        AbstractC0646n.m1631i(c1109s);
        c1109s.setOnFullScreenModeChangedListener(interfaceC1099i);
    }

    public void setControllerShowTimeoutMs(int i3) {
        C1109s c1109s = this.f4910r;
        AbstractC0646n.m1631i(c1109s);
        this.f4894H = i3;
        if (c1109s.m2948g()) {
            m2913h(m2912g());
        }
    }

    public void setControllerVisibilityListener(InterfaceC1073B interfaceC1073B) {
        if (interfaceC1073B != null) {
            setControllerVisibilityListener((InterfaceC1108r) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        AbstractC0646n.m1630h(this.f4909q != null);
        this.f4893G = charSequence;
        m2918m();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f4890D != drawable) {
            this.f4890D = drawable;
            m2919n(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z3) {
        this.f4898L = z3;
    }

    public void setErrorMessageProvider(InterfaceC0580l interfaceC0580l) {
        if (interfaceC0580l != null) {
            m2918m();
        }
    }

    public void setFullscreenButtonClickListener(InterfaceC1074C interfaceC1074C) {
        C1109s c1109s = this.f4910r;
        AbstractC0646n.m1631i(c1109s);
        c1109s.setOnFullScreenModeChangedListener(this.f4899g);
    }

    public void setFullscreenButtonState(boolean z3) {
        C1109s c1109s = this.f4910r;
        AbstractC0646n.m1631i(c1109s);
        c1109s.m2952k(z3);
    }

    public void setImageDisplayMode(int i3) {
        AbstractC0646n.m1630h(this.f4905m != null);
        if (this.f4889C != i3) {
            this.f4889C = i3;
            m2920o();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z3) {
        if (this.f4892F != z3) {
            this.f4892F = z3;
            m2919n(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00f0  */
    public void setPlayer(InterfaceC0553P interfaceC0553P) {
        boolean z3 = true;
        AbstractC0646n.m1630h(Looper.myLooper() == Looper.getMainLooper());
        AbstractC0646n.m1625c(interfaceC0553P == null || interfaceC0553P.mo1326y() == Looper.getMainLooper());
        InterfaceC0553P interfaceC0553P2 = this.f4917y;
        if (interfaceC0553P2 == interfaceC0553P) {
            return;
        }
        View view = this.f4902j;
        ViewOnClickListenerC1072A viewOnClickListenerC1072A = this.f4899g;
        if (interfaceC0553P2 != null) {
            interfaceC0553P2.mo1325x(viewOnClickListenerC1072A);
            if (((AbstractC0402b) interfaceC0553P2).m1089U(27)) {
                if (view instanceof TextureView) {
                    interfaceC0553P2.mo1287I((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    interfaceC0553P2.mo1319p((SurfaceView) view);
                }
            }
            Class cls = this.f4914v;
            if (cls != null && cls.isAssignableFrom(interfaceC0553P2.getClass())) {
                try {
                    Method method = this.f4915w;
                    method.getClass();
                    method.invoke(interfaceC0553P2, null);
                } catch (IllegalAccessException | InvocationTargetException e3) {
                    throw new RuntimeException(e3);
                }
            }
        }
        SubtitleView subtitleView = this.f4907o;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f4917y = interfaceC0553P;
        boolean zM2921p = m2921p();
        C1109s c1109s = this.f4910r;
        if (zM2921p) {
            c1109s.setPlayer(interfaceC0553P);
        }
        m2916k();
        m2918m();
        m2919n(true);
        if (interfaceC0553P == null) {
            if (c1109s != null) {
                c1109s.m2947f();
                return;
            }
            return;
        }
        AbstractC0402b abstractC0402b = (AbstractC0402b) interfaceC0553P;
        if (abstractC0402b.m1089U(27)) {
            if (view instanceof TextureView) {
                interfaceC0553P.mo1286H((TextureView) view);
            } else if (view instanceof SurfaceView) {
                interfaceC0553P.mo1318o((SurfaceView) view);
            }
            if (abstractC0402b.m1089U(30)) {
                C0568c0 c0568c0Mo1327z = interfaceC0553P.mo1327z();
                int i3 = 0;
                loop0: while (true) {
                    AbstractC1676G abstractC1676G = c0568c0Mo1327z.f2055a;
                    if (i3 >= abstractC1676G.size()) {
                        z3 = false;
                        break;
                    }
                    if (((C0566b0) abstractC1676G.get(i3)).f2048b.f1994c == 2) {
                        C0566b0 c0566b0 = (C0566b0) abstractC1676G.get(i3);
                        for (int i4 = 0; i4 < c0566b0.f2050d.length; i4++) {
                            if (c0566b0.m1432a(i4)) {
                                break loop0;
                            }
                        }
                    }
                    i3++;
                }
                if (z3) {
                    m2915j();
                }
            } else {
                m2915j();
            }
        }
        if (subtitleView != null && abstractC0402b.m1089U(28)) {
            subtitleView.setCues(interfaceC0553P.mo1285G().f2373a);
        }
        interfaceC0553P.mo1314l(viewOnClickListenerC1072A);
        setImageOutput(interfaceC0553P);
        m2910e(false);
    }

    public void setRepeatToggleModes(int i3) {
        C1109s c1109s = this.f4910r;
        AbstractC0646n.m1631i(c1109s);
        c1109s.setRepeatToggleModes(i3);
    }

    public void setResizeMode(int i3) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f4900h;
        AbstractC0646n.m1631i(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i3);
    }

    public void setShowBuffering(int i3) {
        if (this.f4891E != i3) {
            this.f4891E = i3;
            m2916k();
        }
    }

    public void setShowFastForwardButton(boolean z3) {
        C1109s c1109s = this.f4910r;
        AbstractC0646n.m1631i(c1109s);
        c1109s.setShowFastForwardButton(z3);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z3) {
        C1109s c1109s = this.f4910r;
        AbstractC0646n.m1631i(c1109s);
        c1109s.setShowMultiWindowTimeBar(z3);
    }

    public void setShowNextButton(boolean z3) {
        C1109s c1109s = this.f4910r;
        AbstractC0646n.m1631i(c1109s);
        c1109s.setShowNextButton(z3);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z3) {
        C1109s c1109s = this.f4910r;
        AbstractC0646n.m1631i(c1109s);
        c1109s.setShowPlayButtonIfPlaybackIsSuppressed(z3);
    }

    public void setShowPreviousButton(boolean z3) {
        C1109s c1109s = this.f4910r;
        AbstractC0646n.m1631i(c1109s);
        c1109s.setShowPreviousButton(z3);
    }

    public void setShowRewindButton(boolean z3) {
        C1109s c1109s = this.f4910r;
        AbstractC0646n.m1631i(c1109s);
        c1109s.setShowRewindButton(z3);
    }

    public void setShowShuffleButton(boolean z3) {
        C1109s c1109s = this.f4910r;
        AbstractC0646n.m1631i(c1109s);
        c1109s.setShowShuffleButton(z3);
    }

    public void setShowSubtitleButton(boolean z3) {
        C1109s c1109s = this.f4910r;
        AbstractC0646n.m1631i(c1109s);
        c1109s.setShowSubtitleButton(z3);
    }

    public void setShowVrButton(boolean z3) {
        C1109s c1109s = this.f4910r;
        AbstractC0646n.m1631i(c1109s);
        c1109s.setShowVrButton(z3);
    }

    public void setShutterBackgroundColor(int i3) {
        View view = this.f4901i;
        if (view != null) {
            view.setBackgroundColor(i3);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z3) {
        setArtworkDisplayMode(!z3 ? 1 : 0);
    }

    public void setUseController(boolean z3) {
        boolean z4 = true;
        C1109s c1109s = this.f4910r;
        AbstractC0646n.m1630h((z3 && c1109s == null) ? false : true);
        if (!z3 && !hasOnClickListeners()) {
            z4 = false;
        }
        setClickable(z4);
        if (this.f4918z == z3) {
            return;
        }
        this.f4918z = z3;
        if (m2921p()) {
            c1109s.setPlayer(this.f4917y);
        } else if (c1109s != null) {
            c1109s.m2947f();
            c1109s.setPlayer(null);
        }
        m2917l();
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        View view = this.f4902j;
        if (view instanceof SurfaceView) {
            view.setVisibility(i3);
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(InterfaceC1108r interfaceC1108r) {
        C1109s c1109s = this.f4910r;
        AbstractC0646n.m1631i(c1109s);
        InterfaceC1108r interfaceC1108r2 = this.f4887A;
        if (interfaceC1108r2 == interfaceC1108r) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = c1109s.f5103j;
        if (interfaceC1108r2 != null) {
            copyOnWriteArrayList.remove(interfaceC1108r2);
        }
        this.f4887A = interfaceC1108r;
        if (interfaceC1108r != null) {
            copyOnWriteArrayList.add(interfaceC1108r);
            setControllerVisibilityListener((InterfaceC1073B) null);
        }
    }
}
