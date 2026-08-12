package p083b1;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.RunnableC0892b;
import androidx.mediarouter.app.ViewOnClickListenerC1034c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zuxoplayer.app.PlayerActivity;
import com.zuxoplayer.app.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p000A.C0031d;
import p038N.AbstractC0402b;
import p055T.AbstractC0540C;
import p055T.AbstractC0558V;
import p055T.C0548K;
import p055T.C0556T;
import p055T.C0557U;
import p055T.C0563a;
import p055T.C0564a0;
import p055T.C0565b;
import p055T.C0566b0;
import p055T.C0568c0;
import p055T.C0583o;
import p055T.InterfaceC0553P;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p104h1.AbstractC1667x;
import p105h2.AbstractC1670A;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1723q;
import p105h2.C1692X;
import p144s.AbstractC2220n;

/* JADX INFO: renamed from: b1.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1109s extends FrameLayout {

    /* JADX INFO: renamed from: G0 */
    public static final float[] f5061G0;

    /* JADX INFO: renamed from: A */
    public final ImageView f5062A;

    /* JADX INFO: renamed from: A0 */
    public long[] f5063A0;

    /* JADX INFO: renamed from: B */
    public final ImageView f5064B;

    /* JADX INFO: renamed from: B0 */
    public boolean[] f5065B0;

    /* JADX INFO: renamed from: C */
    public final ImageView f5066C;

    /* JADX INFO: renamed from: C0 */
    public final long[] f5067C0;

    /* JADX INFO: renamed from: D */
    public final ImageView f5068D;

    /* JADX INFO: renamed from: D0 */
    public final boolean[] f5069D0;

    /* JADX INFO: renamed from: E */
    public final ImageView f5070E;

    /* JADX INFO: renamed from: E0 */
    public long f5071E0;

    /* JADX INFO: renamed from: F */
    public final View f5072F;

    /* JADX INFO: renamed from: F0 */
    public boolean f5073F0;

    /* JADX INFO: renamed from: G */
    public final View f5074G;

    /* JADX INFO: renamed from: H */
    public final View f5075H;

    /* JADX INFO: renamed from: I */
    public final TextView f5076I;

    /* JADX INFO: renamed from: J */
    public final TextView f5077J;

    /* JADX INFO: renamed from: K */
    public final InterfaceC1084M f5078K;

    /* JADX INFO: renamed from: L */
    public final StringBuilder f5079L;

    /* JADX INFO: renamed from: M */
    public final Formatter f5080M;

    /* JADX INFO: renamed from: N */
    public final C0556T f5081N;

    /* JADX INFO: renamed from: O */
    public final C0557U f5082O;

    /* JADX INFO: renamed from: P */
    public final RunnableC0892b f5083P;

    /* JADX INFO: renamed from: Q */
    public final Drawable f5084Q;

    /* JADX INFO: renamed from: R */
    public final Drawable f5085R;

    /* JADX INFO: renamed from: S */
    public final Drawable f5086S;

    /* JADX INFO: renamed from: T */
    public final Drawable f5087T;

    /* JADX INFO: renamed from: U */
    public final Drawable f5088U;

    /* JADX INFO: renamed from: V */
    public final String f5089V;

    /* JADX INFO: renamed from: W */
    public final String f5090W;

    /* JADX INFO: renamed from: a0 */
    public final String f5091a0;

    /* JADX INFO: renamed from: b0 */
    public final Drawable f5092b0;

    /* JADX INFO: renamed from: c0 */
    public final Drawable f5093c0;

    /* JADX INFO: renamed from: d0 */
    public final float f5094d0;

    /* JADX INFO: renamed from: e0 */
    public final float f5095e0;

    /* JADX INFO: renamed from: f0 */
    public final String f5096f0;

    /* JADX INFO: renamed from: g */
    public final C1114x f5097g;

    /* JADX INFO: renamed from: g0 */
    public final String f5098g0;

    /* JADX INFO: renamed from: h */
    public final Resources f5099h;

    /* JADX INFO: renamed from: h0 */
    public final Drawable f5100h0;

    /* JADX INFO: renamed from: i */
    public final ViewOnClickListenerC1098h f5101i;

    /* JADX INFO: renamed from: i0 */
    public final Drawable f5102i0;

    /* JADX INFO: renamed from: j */
    public final CopyOnWriteArrayList f5103j;

    /* JADX INFO: renamed from: j0 */
    public final String f5104j0;

    /* JADX INFO: renamed from: k */
    public final RecyclerView f5105k;

    /* JADX INFO: renamed from: k0 */
    public final String f5106k0;

    /* JADX INFO: renamed from: l */
    public final C1104n f5107l;

    /* JADX INFO: renamed from: l0 */
    public final Drawable f5108l0;

    /* JADX INFO: renamed from: m */
    public final C1101k f5109m;

    /* JADX INFO: renamed from: m0 */
    public final Drawable f5110m0;

    /* JADX INFO: renamed from: n */
    public final C1097g f5111n;

    /* JADX INFO: renamed from: n0 */
    public final String f5112n0;

    /* JADX INFO: renamed from: o */
    public final C1097g f5113o;

    /* JADX INFO: renamed from: o0 */
    public final String f5114o0;

    /* JADX INFO: renamed from: p */
    public final C0031d f5115p;

    /* JADX INFO: renamed from: p0 */
    public InterfaceC0553P f5116p0;

    /* JADX INFO: renamed from: q */
    public final PopupWindow f5117q;

    /* JADX INFO: renamed from: q0 */
    public InterfaceC1099i f5118q0;

    /* JADX INFO: renamed from: r */
    public final int f5119r;

    /* JADX INFO: renamed from: r0 */
    public boolean f5120r0;

    /* JADX INFO: renamed from: s */
    public final ImageView f5121s;

    /* JADX INFO: renamed from: s0 */
    public boolean f5122s0;

    /* JADX INFO: renamed from: t */
    public final ImageView f5123t;

    /* JADX INFO: renamed from: t0 */
    public boolean f5124t0;

    /* JADX INFO: renamed from: u */
    public final ImageView f5125u;

    /* JADX INFO: renamed from: u0 */
    public boolean f5126u0;

    /* JADX INFO: renamed from: v */
    public final View f5127v;

    /* JADX INFO: renamed from: v0 */
    public boolean f5128v0;

    /* JADX INFO: renamed from: w */
    public final View f5129w;

    /* JADX INFO: renamed from: w0 */
    public boolean f5130w0;

    /* JADX INFO: renamed from: x */
    public final TextView f5131x;

    /* JADX INFO: renamed from: x0 */
    public int f5132x0;

    /* JADX INFO: renamed from: y */
    public final TextView f5133y;

    /* JADX INFO: renamed from: y0 */
    public int f5134y0;

    /* JADX INFO: renamed from: z */
    public final ImageView f5135z;

    /* JADX INFO: renamed from: z0 */
    public int f5136z0;

    static {
        AbstractC0540C.m1348a("media3.ui");
        f5061G0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1109s(PlayerActivity playerActivity) {
        super(playerActivity, null, 0);
        char c = 1;
        char c2 = 1;
        this.f5126u0 = true;
        this.f5132x0 = 5000;
        this.f5136z0 = 0;
        this.f5134y0 = 200;
        LayoutInflater.from(playerActivity).inflate(R.layout.exo_player_control_view, this);
        setDescendantFocusability(262144);
        ViewOnClickListenerC1098h viewOnClickListenerC1098h = new ViewOnClickListenerC1098h(this);
        this.f5101i = viewOnClickListenerC1098h;
        this.f5103j = new CopyOnWriteArrayList();
        this.f5081N = new C0556T();
        this.f5082O = new C0557U();
        StringBuilder sb = new StringBuilder();
        this.f5079L = sb;
        this.f5080M = new Formatter(sb, Locale.getDefault());
        this.f5063A0 = new long[0];
        this.f5065B0 = new boolean[0];
        this.f5067C0 = new long[0];
        this.f5069D0 = new boolean[0];
        this.f5083P = new RunnableC0892b(7, this);
        this.f5076I = (TextView) findViewById(R.id.exo_duration);
        this.f5077J = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.f5066C = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(viewOnClickListenerC1098h);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.f5068D = imageView2;
        ViewOnClickListenerC1034c viewOnClickListenerC1034c = new ViewOnClickListenerC1034c(c2 == true ? 1 : 0, this);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(viewOnClickListenerC1034c);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.f5070E = imageView3;
        ViewOnClickListenerC1034c viewOnClickListenerC1034c2 = new ViewOnClickListenerC1034c(c == true ? 1 : 0, this);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(viewOnClickListenerC1034c2);
        }
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.f5072F = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(viewOnClickListenerC1098h);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.f5074G = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC1098h);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.f5075H = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(viewOnClickListenerC1098h);
        }
        InterfaceC1084M interfaceC1084M = (InterfaceC1084M) findViewById(R.id.exo_progress);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (interfaceC1084M != null) {
            this.f5078K = interfaceC1084M;
        } else if (viewFindViewById4 != null) {
            C1095e c1095e = new C1095e(playerActivity, R.style.ExoStyledControls_TimeBar);
            c1095e.setId(R.id.exo_progress);
            c1095e.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(c1095e, iIndexOfChild);
            this.f5078K = c1095e;
        } else {
            this.f5078K = null;
        }
        InterfaceC1084M interfaceC1084M2 = this.f5078K;
        if (interfaceC1084M2 != null) {
            ((C1095e) interfaceC1084M2).f4993D.add(viewOnClickListenerC1098h);
        }
        Resources resources = playerActivity.getResources();
        this.f5099h = resources;
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_play_pause);
        this.f5125u = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(viewOnClickListenerC1098h);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_prev);
        this.f5121s = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_previous, playerActivity.getTheme()));
            imageView5.setOnClickListener(viewOnClickListenerC1098h);
        }
        ImageView imageView6 = (ImageView) findViewById(R.id.exo_next);
        this.f5123t = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_next, playerActivity.getTheme()));
            imageView6.setOnClickListener(viewOnClickListenerC1098h);
        }
        ThreadLocal threadLocal = AbstractC2220n.f9530a;
        Typeface typefaceM4802b = playerActivity.isRestricted() ? null : AbstractC2220n.m4802b(playerActivity, R.font.roboto_medium_numbers, new TypedValue(), 0, null, false);
        ImageView imageView7 = (ImageView) findViewById(R.id.exo_rew);
        TextView textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            imageView7.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_simple_rewind, playerActivity.getTheme()));
            this.f5129w = imageView7;
            this.f5133y = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceM4802b);
            this.f5133y = textView;
            this.f5129w = textView;
        } else {
            this.f5133y = null;
            this.f5129w = null;
        }
        View view = this.f5129w;
        if (view != null) {
            view.setOnClickListener(viewOnClickListenerC1098h);
        }
        ImageView imageView8 = (ImageView) findViewById(R.id.exo_ffwd);
        TextView textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_simple_fastforward, playerActivity.getTheme()));
            this.f5127v = imageView8;
            this.f5131x = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceM4802b);
            this.f5131x = textView2;
            this.f5127v = textView2;
        } else {
            this.f5131x = null;
            this.f5127v = null;
        }
        View view2 = this.f5127v;
        if (view2 != null) {
            view2.setOnClickListener(viewOnClickListenerC1098h);
        }
        ImageView imageView9 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.f5135z = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(viewOnClickListenerC1098h);
        }
        ImageView imageView10 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f5062A = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(viewOnClickListenerC1098h);
        }
        this.f5094d0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f5095e0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        ImageView imageView11 = (ImageView) findViewById(R.id.exo_vr);
        this.f5064B = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(resources.getDrawable(R.drawable.exo_styled_controls_vr, playerActivity.getTheme()));
            m2951j(imageView11, false);
        }
        C1114x c1114x = new C1114x(this);
        this.f5097g = c1114x;
        c1114x.f5148C = true;
        C1104n c1104n = new C1104n(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{resources.getDrawable(R.drawable.exo_styled_controls_speed, playerActivity.getTheme()), resources.getDrawable(R.drawable.exo_styled_controls_audiotrack, playerActivity.getTheme())});
        this.f5107l = c1104n;
        this.f5119r = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(playerActivity).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f5105k = recyclerView;
        recyclerView.setAdapter(c1104n);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f5117q = popupWindow;
        if (AbstractC0632A.f2454a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(viewOnClickListenerC1098h);
        this.f5073F0 = true;
        this.f5115p = new C0031d(getResources());
        this.f5100h0 = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_on, playerActivity.getTheme());
        this.f5102i0 = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_off, playerActivity.getTheme());
        this.f5104j0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.f5106k0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.f5111n = new C1097g(this, 1);
        this.f5113o = new C1097g(this, 0);
        this.f5109m = new C1101k(this, resources.getStringArray(R.array.exo_controls_playback_speeds), f5061G0);
        this.f5084Q = resources.getDrawable(R.drawable.exo_styled_controls_play, playerActivity.getTheme());
        this.f5085R = resources.getDrawable(R.drawable.exo_styled_controls_pause, playerActivity.getTheme());
        this.f5108l0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_exit, playerActivity.getTheme());
        this.f5110m0 = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_enter, playerActivity.getTheme());
        this.f5086S = resources.getDrawable(R.drawable.exo_styled_controls_repeat_off, playerActivity.getTheme());
        this.f5087T = resources.getDrawable(R.drawable.exo_styled_controls_repeat_one, playerActivity.getTheme());
        this.f5088U = resources.getDrawable(R.drawable.exo_styled_controls_repeat_all, playerActivity.getTheme());
        this.f5092b0 = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_on, playerActivity.getTheme());
        this.f5093c0 = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_off, playerActivity.getTheme());
        this.f5112n0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f5114o0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.f5089V = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f5090W = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f5091a0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f5096f0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f5098g0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        c1114x.m2970h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        c1114x.m2970h(this.f5127v, true);
        c1114x.m2970h(this.f5129w, true);
        c1114x.m2970h(imageView5, true);
        c1114x.m2970h(imageView6, true);
        int i3 = 0;
        c1114x.m2970h(imageView10, false);
        c1114x.m2970h(imageView, false);
        c1114x.m2970h(imageView11, false);
        c1114x.m2970h(imageView9, this.f5136z0 != 0);
        addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1096f(i3, this));
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2943b(InterfaceC0553P interfaceC0553P, C0557U c0557u) {
        AbstractC0558V abstractC0558VMo1324w;
        int iMo1333o;
        AbstractC0402b abstractC0402b = (AbstractC0402b) interfaceC0553P;
        if (!abstractC0402b.m1089U(17) || (iMo1333o = (abstractC0558VMo1324w = abstractC0402b.mo1324w()).mo1333o()) <= 1 || iMo1333o > 100) {
            return false;
        }
        for (int i3 = 0; i3 < iMo1333o; i3++) {
            if (abstractC0558VMo1324w.mo1332m(i3, c0557u, 0L).f1987m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        InterfaceC0553P interfaceC0553P = this.f5116p0;
        if (interfaceC0553P == null || !((AbstractC0402b) interfaceC0553P).m1089U(13)) {
            return;
        }
        InterfaceC0553P interfaceC0553P2 = this.f5116p0;
        interfaceC0553P2.mo1298d(new C0548K(f, interfaceC0553P2.mo1302f().f1950b));
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e9  */
    /* JADX INFO: renamed from: c */
    public final boolean m2944c(KeyEvent keyEvent) {
        AbstractC0402b abstractC0402b;
        int keyCode = keyEvent.getKeyCode();
        InterfaceC0553P interfaceC0553P = this.f5116p0;
        if (interfaceC0553P == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (interfaceC0553P.mo1304g() != 4) {
                    AbstractC0402b abstractC0402b2 = (AbstractC0402b) interfaceC0553P;
                    if (abstractC0402b2.m1089U(12)) {
                        long jMo1291M = abstractC0402b2.mo1291M() + abstractC0402b2.mo1312k();
                        long jMo1099u = abstractC0402b2.mo1099u();
                        if (jMo1099u != -9223372036854775807L) {
                            jMo1291M = Math.min(jMo1291M, jMo1099u);
                        }
                        abstractC0402b2.m1093Y(12, Math.max(jMo1291M, 0L));
                    }
                }
            } else if (keyCode == 89) {
                AbstractC0402b abstractC0402b3 = (AbstractC0402b) interfaceC0553P;
                if (abstractC0402b3.m1089U(11)) {
                    long jMo1291M2 = abstractC0402b3.mo1291M() + (-abstractC0402b3.mo1294P());
                    long jMo1099u2 = abstractC0402b3.mo1099u();
                    if (jMo1099u2 != -9223372036854775807L) {
                        jMo1291M2 = Math.min(jMo1291M2, jMo1099u2);
                    }
                    abstractC0402b3.m1093Y(11, Math.max(jMo1291M2, 0L));
                } else if (keyEvent.getRepeatCount() == 0) {
                    if (keyCode != 79 || keyCode == 85) {
                        if (AbstractC0632A.m1579T(interfaceC0553P, this.f5126u0)) {
                            AbstractC0632A.m1563D(interfaceC0553P);
                        } else {
                            abstractC0402b = (AbstractC0402b) interfaceC0553P;
                            if (abstractC0402b.m1089U(1)) {
                                abstractC0402b.mo1308i(false);
                            }
                        }
                    } else if (keyCode == 87) {
                        AbstractC0402b abstractC0402b4 = (AbstractC0402b) interfaceC0553P;
                        if (abstractC0402b4.m1089U(9)) {
                            abstractC0402b4.m1094Z();
                        }
                    } else if (keyCode == 88) {
                        AbstractC0402b abstractC0402b5 = (AbstractC0402b) interfaceC0553P;
                        if (abstractC0402b5.m1089U(7)) {
                            abstractC0402b5.m1096a0();
                        }
                    } else if (keyCode == 126) {
                        AbstractC0632A.m1563D(interfaceC0553P);
                    } else if (keyCode == 127) {
                        int i3 = AbstractC0632A.f2454a;
                        AbstractC0402b abstractC0402b6 = (AbstractC0402b) interfaceC0553P;
                        if (abstractC0402b6.m1089U(1)) {
                            abstractC0402b6.mo1308i(false);
                        }
                    }
                }
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode != 79) {
                    if (AbstractC0632A.m1579T(interfaceC0553P, this.f5126u0)) {
                        AbstractC0632A.m1563D(interfaceC0553P);
                    } else {
                        abstractC0402b = (AbstractC0402b) interfaceC0553P;
                        if (abstractC0402b.m1089U(1)) {
                            abstractC0402b.mo1308i(false);
                        }
                    }
                } else if (AbstractC0632A.m1579T(interfaceC0553P, this.f5126u0)) {
                    AbstractC0632A.m1563D(interfaceC0553P);
                } else {
                    abstractC0402b = (AbstractC0402b) interfaceC0553P;
                    if (abstractC0402b.m1089U(1)) {
                        abstractC0402b.mo1308i(false);
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final void m2945d(AbstractC1667x abstractC1667x, View view) {
        this.f5105k.setAdapter(abstractC1667x);
        m2958q();
        this.f5073F0 = false;
        PopupWindow popupWindow = this.f5117q;
        popupWindow.dismiss();
        this.f5073F0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i3 = this.f5119r;
        popupWindow.showAsDropDown(view, width - i3, (-popupWindow.getHeight()) - i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m2944c(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: renamed from: e */
    public final C1692X m2946e(C0568c0 c0568c0, int i3) {
        AbstractC1723q.m4153b(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        AbstractC1676G abstractC1676G = c0568c0.f2055a;
        int i4 = 0;
        for (int i5 = 0; i5 < abstractC1676G.size(); i5++) {
            C0566b0 c0566b0 = (C0566b0) abstractC1676G.get(i5);
            if (c0566b0.f2048b.f1994c == i3) {
                for (int i6 = 0; i6 < c0566b0.f2047a; i6++) {
                    if (c0566b0.m1432a(i6)) {
                        C0583o c0583o = c0566b0.f2048b.f1995d[i6];
                        if ((c0583o.f2145e & 2) == 0) {
                            C1106p c1106p = new C1106p(c0568c0, i5, i6, this.f5115p.m173u(c0583o));
                            int i7 = i4 + 1;
                            int iM4101e = AbstractC1670A.m4101e(objArrCopyOf.length, i7);
                            if (iM4101e > objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM4101e);
                            }
                            objArrCopyOf[i4] = c1106p;
                            i4 = i7;
                        }
                    }
                }
            }
        }
        return AbstractC1676G.m4115l(i4, objArrCopyOf);
    }

    /* JADX INFO: renamed from: f */
    public final void m2947f() {
        C1114x c1114x = this.f5097g;
        int i3 = c1114x.f5174z;
        if (i3 == 3 || i3 == 2) {
            return;
        }
        c1114x.m2968f();
        if (!c1114x.f5148C) {
            c1114x.m2971i(2);
        } else if (c1114x.f5174z == 1) {
            c1114x.f5161m.start();
        } else {
            c1114x.f5162n.start();
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m2948g() {
        C1114x c1114x = this.f5097g;
        return c1114x.f5174z == 0 && c1114x.f5149a.m2949h();
    }

    public InterfaceC0553P getPlayer() {
        return this.f5116p0;
    }

    public int getRepeatToggleModes() {
        return this.f5136z0;
    }

    public boolean getShowShuffleButton() {
        return this.f5097g.m2966b(this.f5062A);
    }

    public boolean getShowSubtitleButton() {
        return this.f5097g.m2966b(this.f5066C);
    }

    public int getShowTimeoutMs() {
        return this.f5132x0;
    }

    public boolean getShowVrButton() {
        return this.f5097g.m2966b(this.f5064B);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2949h() {
        return getVisibility() == 0;
    }

    /* JADX INFO: renamed from: i */
    public final void m2950i() {
        m2954m();
        m2953l();
        m2957p();
        m2959r();
        m2961t();
        m2955n();
        m2960s();
    }

    /* JADX INFO: renamed from: j */
    public final void m2951j(View view, boolean z3) {
        if (view == null) {
            return;
        }
        view.setEnabled(z3);
        view.setAlpha(z3 ? this.f5094d0 : this.f5095e0);
    }

    /* JADX INFO: renamed from: k */
    public final void m2952k(boolean z3) {
        if (this.f5120r0 == z3) {
            return;
        }
        this.f5120r0 = z3;
        String str = this.f5114o0;
        Drawable drawable = this.f5110m0;
        String str2 = this.f5112n0;
        Drawable drawable2 = this.f5108l0;
        ImageView imageView = this.f5068D;
        if (imageView != null) {
            if (z3) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = this.f5070E;
        if (imageView2 != null) {
            if (z3) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            } else {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            }
        }
        InterfaceC1099i interfaceC1099i = this.f5118q0;
        if (interfaceC1099i != null) {
            ((ViewOnClickListenerC1072A) interfaceC1099i).f4885i.getClass();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2953l() {
        boolean zM1089U;
        boolean zM1089U2;
        boolean zM1089U3;
        boolean zM1089U4;
        boolean zM1089U5;
        if (m2949h() && this.f5122s0) {
            InterfaceC0553P interfaceC0553P = this.f5116p0;
            if (interfaceC0553P != null) {
                zM1089U2 = (this.f5124t0 && m2943b(interfaceC0553P, this.f5082O)) ? ((AbstractC0402b) interfaceC0553P).m1089U(10) : ((AbstractC0402b) interfaceC0553P).m1089U(5);
                AbstractC0402b abstractC0402b = (AbstractC0402b) interfaceC0553P;
                zM1089U3 = abstractC0402b.m1089U(7);
                zM1089U4 = abstractC0402b.m1089U(11);
                zM1089U5 = abstractC0402b.m1089U(12);
                zM1089U = abstractC0402b.m1089U(9);
            } else {
                zM1089U = false;
                zM1089U2 = false;
                zM1089U3 = false;
                zM1089U4 = false;
                zM1089U5 = false;
            }
            Resources resources = this.f5099h;
            View view = this.f5129w;
            if (zM1089U4) {
                InterfaceC0553P interfaceC0553P2 = this.f5116p0;
                int iMo1294P = (int) ((interfaceC0553P2 != null ? interfaceC0553P2.mo1294P() : 5000L) / 1000);
                TextView textView = this.f5133y;
                if (textView != null) {
                    textView.setText(String.valueOf(iMo1294P));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, iMo1294P, Integer.valueOf(iMo1294P)));
                }
            }
            View view2 = this.f5127v;
            if (zM1089U5) {
                InterfaceC0553P interfaceC0553P3 = this.f5116p0;
                int iMo1312k = (int) ((interfaceC0553P3 != null ? interfaceC0553P3.mo1312k() : 15000L) / 1000);
                TextView textView2 = this.f5131x;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(iMo1312k));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, iMo1312k, Integer.valueOf(iMo1312k)));
                }
            }
            m2951j(this.f5121s, zM1089U3);
            m2951j(view, zM1089U4);
            m2951j(view2, zM1089U5);
            m2951j(this.f5123t, zM1089U);
            InterfaceC1084M interfaceC1084M = this.f5078K;
            if (interfaceC1084M != null) {
                ((C1095e) interfaceC1084M).setEnabled(zM1089U2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX INFO: renamed from: m */
    public final void m2954m() {
        ImageView imageView;
        boolean z3;
        if (m2949h() && this.f5122s0 && (imageView = this.f5125u) != null) {
            boolean zM1579T = AbstractC0632A.m1579T(this.f5116p0, this.f5126u0);
            Drawable drawable = zM1579T ? this.f5084Q : this.f5085R;
            int i3 = zM1579T ? R.string.exo_controls_play_description : R.string.exo_controls_pause_description;
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(this.f5099h.getString(i3));
            InterfaceC0553P interfaceC0553P = this.f5116p0;
            if (interfaceC0553P != null) {
                z3 = true;
                if (!((AbstractC0402b) interfaceC0553P).m1089U(1) || (((AbstractC0402b) this.f5116p0).m1089U(17) && this.f5116p0.mo1324w().m1415p())) {
                    z3 = false;
                }
            } else {
                z3 = false;
            }
            m2951j(imageView, z3);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2955n() {
        C1101k c1101k;
        InterfaceC0553P interfaceC0553P = this.f5116p0;
        if (interfaceC0553P == null) {
            return;
        }
        float f = interfaceC0553P.mo1302f().f1949a;
        float f3 = Float.MAX_VALUE;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            c1101k = this.f5109m;
            float[] fArr = c1101k.f5041d;
            if (i3 >= fArr.length) {
                break;
            }
            float fAbs = Math.abs(f - fArr[i3]);
            if (fAbs < f3) {
                i4 = i3;
                f3 = fAbs;
            }
            i3++;
        }
        c1101k.f5042e = i4;
        String str = c1101k.f5040c[i4];
        C1104n c1104n = this.f5107l;
        c1104n.f5049d[0] = str;
        m2951j(this.f5072F, c1104n.m2941f(1) || c1104n.m2941f(0));
    }

    /* JADX INFO: renamed from: o */
    public final void m2956o() {
        long jMo1097n;
        long jMo1083E;
        if (m2949h() && this.f5122s0) {
            InterfaceC0553P interfaceC0553P = this.f5116p0;
            if (interfaceC0553P == null || !((AbstractC0402b) interfaceC0553P).m1089U(16)) {
                jMo1097n = 0;
                jMo1083E = 0;
            } else {
                jMo1097n = interfaceC0553P.mo1097n() + this.f5071E0;
                jMo1083E = interfaceC0553P.mo1083E() + this.f5071E0;
            }
            TextView textView = this.f5077J;
            if (textView != null && !this.f5130w0) {
                textView.setText(AbstractC0632A.m1560A(this.f5079L, this.f5080M, jMo1097n));
            }
            InterfaceC1084M interfaceC1084M = this.f5078K;
            if (interfaceC1084M != null) {
                C1095e c1095e = (C1095e) interfaceC1084M;
                c1095e.setPosition(jMo1097n);
                c1095e.setBufferedPosition(jMo1083E);
            }
            RunnableC0892b runnableC0892b = this.f5083P;
            removeCallbacks(runnableC0892b);
            int iMo1304g = interfaceC0553P == null ? 1 : interfaceC0553P.mo1304g();
            if (interfaceC0553P != null && ((AbstractC0402b) interfaceC0553P).m1091W()) {
                long jMin = Math.min(interfaceC1084M != null ? ((C1095e) interfaceC1084M).getPreferredUpdateDelay() : 1000L, 1000 - (jMo1097n % 1000));
                float f = interfaceC0553P.mo1302f().f1949a;
                postDelayed(runnableC0892b, AbstractC0632A.m1591j(f > 0.0f ? (long) (jMin / f) : 1000L, this.f5134y0, 1000L));
            } else {
                if (iMo1304g == 4 || iMo1304g == 1) {
                    return;
                }
                postDelayed(runnableC0892b, 1000L);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1114x c1114x = this.f5097g;
        c1114x.f5149a.addOnLayoutChangeListener(c1114x.f5172x);
        this.f5122s0 = true;
        if (m2948g()) {
            c1114x.m2969g();
        }
        m2950i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1114x c1114x = this.f5097g;
        c1114x.f5149a.removeOnLayoutChangeListener(c1114x.f5172x);
        this.f5122s0 = false;
        removeCallbacks(this.f5083P);
        c1114x.m2968f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        View view = this.f5097g.f5150b;
        if (view != null) {
            view.layout(0, 0, i5 - i3, i6 - i4);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2957p() {
        ImageView imageView;
        if (m2949h() && this.f5122s0 && (imageView = this.f5135z) != null) {
            if (this.f5136z0 == 0) {
                m2951j(imageView, false);
                return;
            }
            InterfaceC0553P interfaceC0553P = this.f5116p0;
            String str = this.f5089V;
            Drawable drawable = this.f5086S;
            if (interfaceC0553P == null || !((AbstractC0402b) interfaceC0553P).m1089U(15)) {
                m2951j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m2951j(imageView, true);
            int iMo1300e = interfaceC0553P.mo1300e();
            if (iMo1300e == 0) {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            } else if (iMo1300e == 1) {
                imageView.setImageDrawable(this.f5087T);
                imageView.setContentDescription(this.f5090W);
            } else {
                if (iMo1300e != 2) {
                    return;
                }
                imageView.setImageDrawable(this.f5088U);
                imageView.setContentDescription(this.f5091a0);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2958q() {
        RecyclerView recyclerView = this.f5105k;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i3 = this.f5119r;
        int iMin = Math.min(recyclerView.getMeasuredWidth(), width - (i3 * 2));
        PopupWindow popupWindow = this.f5117q;
        popupWindow.setWidth(iMin);
        popupWindow.setHeight(Math.min(getHeight() - (i3 * 2), recyclerView.getMeasuredHeight()));
    }

    /* JADX INFO: renamed from: r */
    public final void m2959r() {
        ImageView imageView;
        if (m2949h() && this.f5122s0 && (imageView = this.f5062A) != null) {
            InterfaceC0553P interfaceC0553P = this.f5116p0;
            if (!this.f5097g.m2966b(imageView)) {
                m2951j(imageView, false);
                return;
            }
            String str = this.f5098g0;
            Drawable drawable = this.f5093c0;
            if (interfaceC0553P == null || !((AbstractC0402b) interfaceC0553P).m1089U(14)) {
                m2951j(imageView, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            m2951j(imageView, true);
            if (interfaceC0553P.mo1282B()) {
                drawable = this.f5092b0;
            }
            imageView.setImageDrawable(drawable);
            if (interfaceC0553P.mo1282B()) {
                str = this.f5096f0;
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0133  */
    /* JADX INFO: renamed from: s */
    public final void m2960s() {
        boolean z3;
        long jM1571L;
        int i3;
        boolean[] zArr;
        boolean z4;
        InterfaceC0553P interfaceC0553P = this.f5116p0;
        if (interfaceC0553P == null) {
            return;
        }
        boolean z5 = this.f5124t0;
        boolean z6 = false;
        boolean z7 = true;
        C0557U c0557u = this.f5082O;
        this.f5128v0 = z5 && m2943b(interfaceC0553P, c0557u);
        long j3 = 0;
        this.f5071E0 = 0L;
        AbstractC0402b abstractC0402b = (AbstractC0402b) interfaceC0553P;
        AbstractC0558V abstractC0558VMo1324w = abstractC0402b.m1089U(17) ? interfaceC0553P.mo1324w() : AbstractC0558V.f1991a;
        long j4 = -9223372036854775807L;
        if (abstractC0558VMo1324w.m1415p()) {
            z3 = true;
            if (abstractC0402b.m1089U(16)) {
                long jM1086R = abstractC0402b.m1086R();
                if (jM1086R != -9223372036854775807L) {
                    jM1571L = AbstractC0632A.m1571L(jM1086R);
                } else {
                    jM1571L = 0;
                }
            } else {
                jM1571L = 0;
            }
            i3 = 0;
        } else {
            int iMo1292N = interfaceC0553P.mo1292N();
            boolean z8 = this.f5128v0;
            int i4 = z8 ? 0 : iMo1292N;
            int iMo1333o = z8 ? abstractC0558VMo1324w.mo1333o() - 1 : iMo1292N;
            long j5 = 0;
            i3 = 0;
            while (i4 <= iMo1333o) {
                long j6 = j3;
                if (i4 == iMo1292N) {
                    this.f5071E0 = AbstractC0632A.m1581V(j5);
                }
                abstractC0558VMo1324w.m1414n(i4, c0557u);
                if (c0557u.f1987m == j4) {
                    AbstractC0646n.m1630h(this.f5128v0 ^ z7);
                    break;
                }
                int i5 = c0557u.f1988n;
                while (i5 <= c0557u.f1989o) {
                    C0556T c0556t = this.f5081N;
                    abstractC0558VMo1324w.mo1329f(i5, c0556t, z6);
                    long j7 = j4;
                    C0565b c0565b = c0556t.f1972g;
                    c0565b.getClass();
                    long j8 = j6;
                    int i6 = 0;
                    while (i6 < c0565b.f2045a) {
                        c0556t.m1399d(i6);
                        long j9 = c0556t.f1970e;
                        if (j9 >= j8) {
                            long[] jArr = this.f5063A0;
                            if (i3 == jArr.length) {
                                int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                this.f5063A0 = Arrays.copyOf(jArr, length);
                                this.f5065B0 = Arrays.copyOf(this.f5065B0, length);
                            }
                            this.f5063A0[i3] = AbstractC0632A.m1581V(j9 + j5);
                            boolean[] zArr2 = this.f5065B0;
                            C0563a c0563aM1430a = c0556t.f1972g.m1430a(i6);
                            int i7 = c0563aM1430a.f2018a;
                            if (i7 == -1) {
                                zArr = zArr2;
                            } else {
                                int i8 = 0;
                                while (true) {
                                    if (i8 < i7) {
                                        zArr = zArr2;
                                        int i9 = c0563aM1430a.f2022e[i8];
                                        if (i9 != 0) {
                                            C0563a c0563a = c0563aM1430a;
                                            if (i9 != 1) {
                                                i8++;
                                                zArr2 = zArr;
                                                c0563aM1430a = c0563a;
                                            }
                                        }
                                        z4 = true;
                                    } else {
                                        zArr = zArr2;
                                        z4 = false;
                                    }
                                    zArr[i3] = !z4;
                                    i3++;
                                }
                            }
                            z4 = true;
                            zArr[i3] = !z4;
                            i3++;
                        }
                        i6++;
                        iMo1292N = iMo1292N;
                    }
                    i5++;
                    j4 = j7;
                    j6 = j8;
                    z6 = false;
                }
                j5 += c0557u.f1987m;
                i4++;
                j3 = j6;
                z6 = false;
                z7 = true;
            }
            z3 = true;
            jM1571L = j5;
        }
        long jM1581V = AbstractC0632A.m1581V(jM1571L);
        TextView textView = this.f5076I;
        if (textView != null) {
            textView.setText(AbstractC0632A.m1560A(this.f5079L, this.f5080M, jM1581V));
        }
        InterfaceC1084M interfaceC1084M = this.f5078K;
        if (interfaceC1084M != null) {
            C1095e c1095e = (C1095e) interfaceC1084M;
            c1095e.setDuration(jM1581V);
            long[] jArr2 = this.f5067C0;
            int length2 = jArr2.length;
            int i10 = i3 + length2;
            long[] jArr3 = this.f5063A0;
            if (i10 > jArr3.length) {
                this.f5063A0 = Arrays.copyOf(jArr3, i10);
                this.f5065B0 = Arrays.copyOf(this.f5065B0, i10);
            }
            System.arraycopy(jArr2, 0, this.f5063A0, i3, length2);
            System.arraycopy(this.f5069D0, 0, this.f5065B0, i3, length2);
            long[] jArr4 = this.f5063A0;
            boolean[] zArr3 = this.f5065B0;
            if (i10 != 0 && (jArr4 == null || zArr3 == null)) {
                z3 = false;
            }
            AbstractC0646n.m1625c(z3);
            c1095e.f5008S = i10;
            c1095e.f5009T = jArr4;
            c1095e.f5010U = zArr3;
            c1095e.m2934e();
        }
        m2956o();
    }

    public void setAnimationEnabled(boolean z3) {
        this.f5097g.f5148C = z3;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(InterfaceC1099i interfaceC1099i) {
        this.f5118q0 = interfaceC1099i;
        boolean z3 = interfaceC1099i != null;
        ImageView imageView = this.f5068D;
        if (imageView != null) {
            if (z3) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        boolean z4 = interfaceC1099i != null;
        ImageView imageView2 = this.f5070E;
        if (imageView2 == null) {
            return;
        }
        if (z4) {
            imageView2.setVisibility(0);
        } else {
            imageView2.setVisibility(8);
        }
    }

    public void setPlayer(InterfaceC0553P interfaceC0553P) {
        AbstractC0646n.m1630h(Looper.myLooper() == Looper.getMainLooper());
        AbstractC0646n.m1625c(interfaceC0553P == null || interfaceC0553P.mo1326y() == Looper.getMainLooper());
        InterfaceC0553P interfaceC0553P2 = this.f5116p0;
        if (interfaceC0553P2 == interfaceC0553P) {
            return;
        }
        ViewOnClickListenerC1098h viewOnClickListenerC1098h = this.f5101i;
        if (interfaceC0553P2 != null) {
            interfaceC0553P2.mo1325x(viewOnClickListenerC1098h);
        }
        this.f5116p0 = interfaceC0553P;
        if (interfaceC0553P != null) {
            interfaceC0553P.mo1314l(viewOnClickListenerC1098h);
        }
        m2950i();
    }

    public void setRepeatToggleModes(int i3) {
        this.f5136z0 = i3;
        InterfaceC0553P interfaceC0553P = this.f5116p0;
        if (interfaceC0553P != null && ((AbstractC0402b) interfaceC0553P).m1089U(15)) {
            int iMo1300e = this.f5116p0.mo1300e();
            if (i3 == 0 && iMo1300e != 0) {
                this.f5116p0.mo1296c(0);
            } else if (i3 == 1 && iMo1300e == 2) {
                this.f5116p0.mo1296c(1);
            } else if (i3 == 2 && iMo1300e == 1) {
                this.f5116p0.mo1296c(2);
            }
        }
        this.f5097g.m2970h(this.f5135z, i3 != 0);
        m2957p();
    }

    public void setShowFastForwardButton(boolean z3) {
        this.f5097g.m2970h(this.f5127v, z3);
        m2953l();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z3) {
        this.f5124t0 = z3;
        m2960s();
    }

    public void setShowNextButton(boolean z3) {
        this.f5097g.m2970h(this.f5123t, z3);
        m2953l();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z3) {
        this.f5126u0 = z3;
        m2954m();
    }

    public void setShowPreviousButton(boolean z3) {
        this.f5097g.m2970h(this.f5121s, z3);
        m2953l();
    }

    public void setShowRewindButton(boolean z3) {
        this.f5097g.m2970h(this.f5129w, z3);
        m2953l();
    }

    public void setShowShuffleButton(boolean z3) {
        this.f5097g.m2970h(this.f5062A, z3);
        m2959r();
    }

    public void setShowSubtitleButton(boolean z3) {
        this.f5097g.m2970h(this.f5066C, z3);
    }

    public void setShowTimeoutMs(int i3) {
        this.f5132x0 = i3;
        if (m2948g()) {
            this.f5097g.m2969g();
        }
    }

    public void setShowVrButton(boolean z3) {
        this.f5097g.m2970h(this.f5064B, z3);
    }

    public void setTimeBarMinUpdateInterval(int i3) {
        this.f5134y0 = AbstractC0632A.m1590i(i3, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f5064B;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            m2951j(imageView, onClickListener != null);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2961t() {
        C1097g c1097g = this.f5111n;
        c1097g.getClass();
        List list = Collections.EMPTY_LIST;
        c1097g.f5033c = list;
        C1097g c1097g2 = this.f5113o;
        c1097g2.getClass();
        c1097g2.f5033c = list;
        InterfaceC0553P interfaceC0553P = this.f5116p0;
        ImageView imageView = this.f5066C;
        if (interfaceC0553P != null && ((AbstractC0402b) interfaceC0553P).m1089U(30) && ((AbstractC0402b) this.f5116p0).m1089U(29)) {
            C0568c0 c0568c0Mo1327z = this.f5116p0.mo1327z();
            C1692X c1692xM2946e = m2946e(c0568c0Mo1327z, 1);
            c1097g2.f5033c = c1692xM2946e;
            C1109s c1109s = c1097g2.f5036f;
            InterfaceC0553P interfaceC0553P2 = c1109s.f5116p0;
            interfaceC0553P2.getClass();
            C0564a0 c0564a0Mo1284D = interfaceC0553P2.mo1284D();
            boolean zIsEmpty = c1692xM2946e.isEmpty();
            C1104n c1104n = c1109s.f5107l;
            if (zIsEmpty) {
                c1104n.f5049d[1] = c1109s.getResources().getString(R.string.exo_track_selection_none);
            } else if (c1097g2.m2937f(c0564a0Mo1284D)) {
                for (int i3 = 0; i3 < c1692xM2946e.f7631j; i3++) {
                    C1106p c1106p = (C1106p) c1692xM2946e.get(i3);
                    if (c1106p.f5054a.f2051e[c1106p.f5055b]) {
                        c1104n.f5049d[1] = c1106p.f5056c;
                        break;
                    }
                }
            } else {
                c1104n.f5049d[1] = c1109s.getResources().getString(R.string.exo_track_selection_auto);
            }
            if (this.f5097g.m2966b(imageView)) {
                c1097g.m2938g(m2946e(c0568c0Mo1327z, 3));
            } else {
                c1097g.m2938g(C1692X.f7629k);
            }
        }
        m2951j(imageView, c1097g.mo2591a() > 0);
        C1104n c1104n2 = this.f5107l;
        m2951j(this.f5072F, c1104n2.m2941f(1) || c1104n2.m2941f(0));
    }

    public void setProgressUpdateListener(InterfaceC1102l interfaceC1102l) {
    }
}
