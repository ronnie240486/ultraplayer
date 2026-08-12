package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.C0872h;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import p009D0.C0106b;
import p066W1.AbstractC0664e;
import p089d1.C1403C;
import p089d1.C1405E;
import p089d1.C1451x;
import p091e.DialogInterfaceC1476g;
import p124n.C2018e;
import p148t.AbstractC2262a;

/* JADX INFO: renamed from: androidx.mediarouter.app.t */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1051t extends DialogInterfaceC1476g {

    /* JADX INFO: renamed from: v0 */
    public static final int f4607v0;

    /* JADX INFO: renamed from: A */
    public ImageView f4608A;

    /* JADX INFO: renamed from: B */
    public TextView f4609B;

    /* JADX INFO: renamed from: C */
    public TextView f4610C;

    /* JADX INFO: renamed from: D */
    public TextView f4611D;

    /* JADX INFO: renamed from: E */
    public final boolean f4612E;

    /* JADX INFO: renamed from: F */
    public final boolean f4613F;

    /* JADX INFO: renamed from: G */
    public LinearLayout f4614G;

    /* JADX INFO: renamed from: H */
    public RelativeLayout f4615H;

    /* JADX INFO: renamed from: I */
    public LinearLayout f4616I;

    /* JADX INFO: renamed from: J */
    public View f4617J;

    /* JADX INFO: renamed from: K */
    public OverlayListView f4618K;

    /* JADX INFO: renamed from: L */
    public C1050s f4619L;

    /* JADX INFO: renamed from: M */
    public ArrayList f4620M;

    /* JADX INFO: renamed from: N */
    public HashSet f4621N;

    /* JADX INFO: renamed from: O */
    public HashSet f4622O;

    /* JADX INFO: renamed from: P */
    public HashSet f4623P;

    /* JADX INFO: renamed from: Q */
    public SeekBar f4624Q;

    /* JADX INFO: renamed from: R */
    public C1049r f4625R;

    /* JADX INFO: renamed from: S */
    public C1403C f4626S;

    /* JADX INFO: renamed from: T */
    public int f4627T;

    /* JADX INFO: renamed from: U */
    public int f4628U;

    /* JADX INFO: renamed from: V */
    public int f4629V;

    /* JADX INFO: renamed from: W */
    public final int f4630W;

    /* JADX INFO: renamed from: X */
    public HashMap f4631X;

    /* JADX INFO: renamed from: Y */
    public C0106b f4632Y;

    /* JADX INFO: renamed from: Z */
    public final C1048q f4633Z;

    /* JADX INFO: renamed from: a0 */
    public PlaybackStateCompat f4634a0;

    /* JADX INFO: renamed from: b0 */
    public MediaDescriptionCompat f4635b0;

    /* JADX INFO: renamed from: c0 */
    public AsyncTaskC1047p f4636c0;

    /* JADX INFO: renamed from: d0 */
    public Bitmap f4637d0;

    /* JADX INFO: renamed from: e0 */
    public Uri f4638e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f4639f0;

    /* JADX INFO: renamed from: g0 */
    public Bitmap f4640g0;

    /* JADX INFO: renamed from: h0 */
    public int f4641h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f4642i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f4643j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f4644k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f4645l0;

    /* JADX INFO: renamed from: m */
    public final C1405E f4646m;

    /* JADX INFO: renamed from: m0 */
    public boolean f4647m0;

    /* JADX INFO: renamed from: n */
    public final C1020G f4648n;

    /* JADX INFO: renamed from: n0 */
    public int f4649n0;

    /* JADX INFO: renamed from: o */
    public final C1403C f4650o;

    /* JADX INFO: renamed from: o0 */
    public int f4651o0;

    /* JADX INFO: renamed from: p */
    public final Context f4652p;

    /* JADX INFO: renamed from: p0 */
    public int f4653p0;

    /* JADX INFO: renamed from: q */
    public boolean f4654q;

    /* JADX INFO: renamed from: q0 */
    public Interpolator f4655q0;

    /* JADX INFO: renamed from: r */
    public boolean f4656r;

    /* JADX INFO: renamed from: r0 */
    public final Interpolator f4657r0;

    /* JADX INFO: renamed from: s */
    public int f4658s;

    /* JADX INFO: renamed from: s0 */
    public final Interpolator f4659s0;

    /* JADX INFO: renamed from: t */
    public Button f4660t;

    /* JADX INFO: renamed from: t0 */
    public final AccessibilityManager f4661t0;

    /* JADX INFO: renamed from: u */
    public Button f4662u;

    /* JADX INFO: renamed from: u0 */
    public final RunnableC1040i f4663u0;

    /* JADX INFO: renamed from: v */
    public ImageButton f4664v;

    /* JADX INFO: renamed from: w */
    public MediaRouteExpandCollapseButton f4665w;

    /* JADX INFO: renamed from: x */
    public FrameLayout f4666x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f4667y;

    /* JADX INFO: renamed from: z */
    public FrameLayout f4668z;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
        f4607v0 = (int) TimeUnit.SECONDS.toMillis(30L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public DialogC1051t(Context context) {
        ContextThemeWrapper contextThemeWrapperM3316i = AbstractC1303m.m3316i(context, true);
        int iM3328u = AbstractC1303m.m3328u(contextThemeWrapperM3316i, R.attr.mediaRouteTheme);
        super(contextThemeWrapperM3316i, iM3328u == 0 ? AbstractC1303m.m3324q(contextThemeWrapperM3316i) : iM3328u);
        this.f4612E = true;
        this.f4663u0 = new RunnableC1040i(0, this);
        Context context2 = getContext();
        this.f4652p = context2;
        this.f4633Z = new C1048q(this, 0);
        this.f4646m = C1405E.m3512d(context2);
        this.f4613F = C1405E.m3515g();
        this.f4648n = new C1020G(this, 3);
        this.f4650o = C1405E.m3514f();
        m2660q(C1405E.m3513e());
        this.f4630W = context2.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
        this.f4661t0 = (AccessibilityManager) context2.getSystemService("accessibility");
        this.f4657r0 = AnimationUtils.loadInterpolator(contextThemeWrapperM3316i, R.interpolator.mr_linear_out_slow_in);
        this.f4659s0 = AnimationUtils.loadInterpolator(contextThemeWrapperM3316i, R.interpolator.mr_fast_out_slow_in);
        new AccelerateDecelerateInterpolator();
    }

    /* JADX INFO: renamed from: p */
    public static void m2652p(View view, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i3;
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: i */
    public final void m2653i(View view, int i3) {
        C1043l c1043l = new C1043l(view.getLayoutParams().height, i3, view, 0);
        c1043l.setDuration(this.f4649n0);
        c1043l.setInterpolator(this.f4655q0);
        view.startAnimation(c1043l);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2654j() {
        return (this.f4635b0 == null && this.f4634a0 == null) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public final void m2655k(boolean z3) {
        HashSet hashSet;
        int firstVisiblePosition = this.f4618K.getFirstVisiblePosition();
        for (int i3 = 0; i3 < this.f4618K.getChildCount(); i3++) {
            View childAt = this.f4618K.getChildAt(i3);
            C1403C c1403c = (C1403C) this.f4619L.getItem(firstVisiblePosition + i3);
            if (!z3 || (hashSet = this.f4621N) == null || !hashSet.contains(c1403c)) {
                ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
        }
        ArrayList arrayList = this.f4618K.f4511g;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C1029P c1029p = (C1029P) obj;
            c1029p.f4521j = true;
            c1029p.f4522k = true;
            C0106b c0106b = c1029p.f4523l;
            if (c0106b != null) {
                DialogC1051t dialogC1051t = (DialogC1051t) c0106b.f141i;
                dialogC1051t.f4623P.remove((C1403C) c0106b.f140h);
                dialogC1051t.f4619L.notifyDataSetChanged();
            }
        }
        if (z3) {
            return;
        }
        m2656l(false);
    }

    /* JADX INFO: renamed from: l */
    public final void m2656l(boolean z3) {
        this.f4621N = null;
        this.f4622O = null;
        this.f4645l0 = false;
        if (this.f4647m0) {
            this.f4647m0 = false;
            m2664u(z3);
        }
        this.f4618K.setEnabled(true);
    }

    /* JADX INFO: renamed from: m */
    public final int m2657m(int i3, int i4) {
        return i3 >= i4 ? (int) (((this.f4658s * i4) / i3) + 0.5f) : (int) (((this.f4658s * 9.0f) / 16.0f) + 0.5f);
    }

    /* JADX INFO: renamed from: n */
    public final int m2658n(boolean z3) {
        if (!z3 && this.f4616I.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.f4614G.getPaddingBottom() + this.f4614G.getPaddingTop();
        if (z3) {
            paddingBottom += this.f4615H.getMeasuredHeight();
        }
        if (this.f4616I.getVisibility() == 0) {
            paddingBottom += this.f4616I.getMeasuredHeight();
        }
        return (z3 && this.f4616I.getVisibility() == 0) ? this.f4617J.getMeasuredHeight() + paddingBottom : paddingBottom;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2659o() {
        C1403C c1403c = this.f4650o;
        return c1403c.m3495e() && Collections.unmodifiableList(c1403c.f6237v).size() > 1;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4656r = true;
        this.f4646m.m3517a(C1451x.f6416c, this.f4648n, 2);
        m2660q(C1405E.m3513e());
    }

    @Override // p091e.DialogInterfaceC1476g, p091e.AbstractDialogC1460E, androidx.activity.DialogC0901k, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(android.R.id.button3).setVisibility(8);
        ViewOnClickListenerC1046o viewOnClickListenerC1046o = new ViewOnClickListenerC1046o(this, 0);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.f4666x = frameLayout;
        frameLayout.setOnClickListener(new ViewOnClickListenerC1046o(this, 2));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.f4667y = linearLayout;
        linearLayout.setOnClickListener(new ViewOnClickListenerC1041j());
        Context context = this.f4652p;
        int iM3327t = AbstractC1303m.m3327t(context, R.attr.colorPrimary);
        if (AbstractC2262a.m4855c(iM3327t, AbstractC1303m.m3327t(context, android.R.attr.colorBackground)) < 3.0d) {
            iM3327t = AbstractC1303m.m3327t(context, R.attr.colorAccent);
        }
        Button button = (Button) findViewById(android.R.id.button2);
        this.f4660t = button;
        button.setText(R.string.mr_controller_disconnect);
        this.f4660t.setTextColor(iM3327t);
        this.f4660t.setOnClickListener(viewOnClickListenerC1046o);
        Button button2 = (Button) findViewById(android.R.id.button1);
        this.f4662u = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.f4662u.setTextColor(iM3327t);
        this.f4662u.setOnClickListener(viewOnClickListenerC1046o);
        this.f4611D = (TextView) findViewById(R.id.mr_name);
        ((ImageButton) findViewById(R.id.mr_close)).setOnClickListener(viewOnClickListenerC1046o);
        this.f4668z = (FrameLayout) findViewById(R.id.mr_default_control);
        ViewOnClickListenerC1046o viewOnClickListenerC1046o2 = new ViewOnClickListenerC1046o(this, 3);
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.f4608A = imageView;
        imageView.setOnClickListener(viewOnClickListenerC1046o2);
        findViewById(R.id.mr_control_title_container).setOnClickListener(viewOnClickListenerC1046o2);
        this.f4614G = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.f4617J = findViewById(R.id.mr_control_divider);
        this.f4615H = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.f4609B = (TextView) findViewById(R.id.mr_control_title);
        this.f4610C = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.f4664v = imageButton;
        imageButton.setOnClickListener(viewOnClickListenerC1046o);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.f4616I = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.f4624Q = seekBar;
        C1403C c1403c = this.f4650o;
        seekBar.setTag(c1403c);
        C1049r c1049r = new C1049r(this);
        this.f4625R = c1049r;
        this.f4624Q.setOnSeekBarChangeListener(c1049r);
        this.f4618K = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.f4620M = new ArrayList();
        C1050s c1050s = new C1050s(this, this.f4618K.getContext(), this.f4620M);
        this.f4619L = c1050s;
        this.f4618K.setAdapter((ListAdapter) c1050s);
        this.f4623P = new HashSet();
        LinearLayout linearLayout3 = this.f4614G;
        OverlayListView overlayListView = this.f4618K;
        boolean zM2659o = m2659o();
        int iM3327t2 = AbstractC1303m.m3327t(context, R.attr.colorPrimary);
        int iM3327t3 = AbstractC1303m.m3327t(context, R.attr.colorPrimaryDark);
        if (zM2659o && AbstractC1303m.m3321n(context) == -570425344) {
            iM3327t3 = iM3327t2;
            iM3327t2 = -1;
        }
        linearLayout3.setBackgroundColor(iM3327t2);
        overlayListView.setBackgroundColor(iM3327t3);
        linearLayout3.setTag(Integer.valueOf(iM3327t2));
        overlayListView.setTag(Integer.valueOf(iM3327t3));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.f4624Q;
        LinearLayout linearLayout4 = this.f4614G;
        int iM3321n = AbstractC1303m.m3321n(context);
        if (Color.alpha(iM3321n) != 255) {
            iM3321n = AbstractC2262a.m4858f(iM3321n, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.m2618a(iM3321n, iM3321n);
        HashMap map = new HashMap();
        this.f4631X = map;
        map.put(c1403c, this.f4624Q);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.f4665w = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.f4463o = new ViewOnClickListenerC1046o(this, 1);
        this.f4655q0 = this.f4644k0 ? this.f4657r0 : this.f4659s0;
        this.f4649n0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.f4651o0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.f4653p0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.f4654q = true;
        m2663t();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f4646m.m3518h(this.f4648n);
        m2660q(null);
        this.f4656r = false;
        super.onDetachedFromWindow();
    }

    @Override // p091e.DialogInterfaceC1476g, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        if (i3 != 25 && i3 != 24) {
            return super.onKeyDown(i3, keyEvent);
        }
        if (this.f4613F || !this.f4644k0) {
            this.f4650o.m3501k(i3 == 25 ? -1 : 1);
        }
        return true;
    }

    @Override // p091e.DialogInterfaceC1476g, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i3, KeyEvent keyEvent) {
        if (i3 == 25 || i3 == 24) {
            return true;
        }
        return super.onKeyUp(i3, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX INFO: renamed from: q */
    public final void m2660q(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
        PlaybackStateCompat playbackStateCompatMo2226g;
        C0106b c0106b = this.f4632Y;
        C1048q c1048q = this.f4633Z;
        if (c0106b != null) {
            c0106b.m510H(c1048q);
            this.f4632Y = null;
        }
        if (mediaSessionCompat$Token != null && this.f4656r) {
            C0106b c0106b2 = new C0106b(this.f4652p, mediaSessionCompat$Token);
            this.f4632Y = c0106b2;
            c0106b2.m509G(c1048q);
            MediaMetadata metadata = ((C0872h) this.f4632Y.f140h).f3686a.getMetadata();
            if (metadata != null) {
                C2018e c2018e = MediaMetadataCompat.f3627j;
                Parcel parcelObtain = Parcel.obtain();
                metadata.writeToParcel(parcelObtain, 0);
                parcelObtain.setDataPosition(0);
                mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
                parcelObtain.recycle();
                mediaMetadataCompatCreateFromParcel.f3632h = metadata;
            } else {
                mediaMetadataCompatCreateFromParcel = null;
            }
            this.f4635b0 = mediaMetadataCompatCreateFromParcel == null ? null : mediaMetadataCompatCreateFromParcel.m2118d();
            C0872h c0872h = (C0872h) this.f4632Y.f140h;
            MediaSessionCompat$Token mediaSessionCompat$Token2 = c0872h.f3690e;
            if (mediaSessionCompat$Token2.m2214d() != null) {
                try {
                    playbackStateCompatMo2226g = mediaSessionCompat$Token2.m2214d().mo2226g();
                } catch (RemoteException e3) {
                    Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e3);
                    PlaybackState playbackState = c0872h.f3686a.getPlaybackState();
                    playbackStateCompatMo2226g = playbackState != null ? PlaybackStateCompat.m2217d(playbackState) : null;
                }
            } else {
                PlaybackState playbackState2 = c0872h.f3686a.getPlaybackState();
                playbackStateCompatMo2226g = playbackState2 != null ? PlaybackStateCompat.m2217d(playbackState2) : null;
            }
            this.f4634a0 = playbackStateCompatMo2226g;
            m2662s();
            m2661r(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x016b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0188 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x018a  */
    /* JADX WARN: Code duplicated, block: B:111:0x019c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x019e  */
    /* JADX WARN: Code duplicated, block: B:115:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:119:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:122:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:87:0x014a  */
    /* JADX WARN: Code duplicated, block: B:88:0x014c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0155  */
    /* JADX WARN: Code duplicated, block: B:92:0x0157  */
    /* JADX WARN: Code duplicated, block: B:95:0x0160  */
    /* JADX INFO: renamed from: r */
    public final void m2661r(boolean z3) {
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        PlaybackStateCompat playbackStateCompat;
        int i5;
        boolean z6;
        Context context;
        int i6;
        int i7;
        boolean z7 = true;
        if (this.f4626S != null) {
            this.f4642i0 = true;
            this.f4643j0 = z3 | this.f4643j0;
            return;
        }
        this.f4642i0 = false;
        this.f4643j0 = false;
        C1403C c1403c = this.f4650o;
        if (!c1403c.m3497g() || c1403c.m3494d()) {
            dismiss();
            return;
        }
        if (this.f4654q) {
            this.f4611D.setText(c1403c.f6219d);
            this.f4660t.setVisibility(c1403c.f6225j ? 0 : 8);
            if (this.f4639f0) {
                Bitmap bitmap = this.f4640g0;
                if (bitmap == null || !bitmap.isRecycled()) {
                    this.f4608A.setImageBitmap(this.f4640g0);
                    this.f4608A.setBackgroundColor(this.f4641h0);
                } else {
                    Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.f4640g0);
                }
                this.f4639f0 = false;
                this.f4640g0 = null;
                this.f4641h0 = 0;
            }
            boolean z8 = this.f4613F;
            if (!z8 && m2659o()) {
                this.f4616I.setVisibility(8);
                this.f4644k0 = true;
                this.f4618K.setVisibility(0);
                this.f4655q0 = this.f4644k0 ? this.f4657r0 : this.f4659s0;
                m2664u(false);
            } else if ((!this.f4644k0 || z8) && this.f4612E) {
                if (((!c1403c.m3495e() || C1405E.m3515g()) ? c1403c.f6230o : 0) != 1) {
                    this.f4616I.setVisibility(8);
                } else if (this.f4616I.getVisibility() == 8) {
                    this.f4616I.setVisibility(0);
                    this.f4624Q.setMax(c1403c.f6232q);
                    this.f4624Q.setProgress(c1403c.f6231p);
                    this.f4665w.setVisibility(m2659o() ? 0 : 8);
                }
            } else {
                this.f4616I.setVisibility(8);
            }
            if (m2654j()) {
                MediaDescriptionCompat mediaDescriptionCompat = this.f4635b0;
                CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.f3619h;
                boolean zIsEmpty = TextUtils.isEmpty(charSequence);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.f4635b0;
                CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f3620i : null;
                boolean zIsEmpty2 = TextUtils.isEmpty(charSequence2);
                if (c1403c.f6233r != -1) {
                    this.f4609B.setText(R.string.mr_controller_casting_screen);
                } else {
                    PlaybackStateCompat playbackStateCompat2 = this.f4634a0;
                    if (playbackStateCompat2 == null || playbackStateCompat2.f3662g == 0) {
                        this.f4609B.setText(R.string.mr_controller_no_media_selected);
                    } else {
                        if (zIsEmpty && zIsEmpty2) {
                            this.f4609B.setText(R.string.mr_controller_no_info_available);
                        } else {
                            if (zIsEmpty) {
                                z4 = false;
                            } else {
                                this.f4609B.setText(charSequence);
                                z4 = true;
                            }
                            if (zIsEmpty2) {
                                z5 = false;
                            } else {
                                this.f4610C.setText(charSequence2);
                                z5 = true;
                            }
                        }
                        TextView textView = this.f4609B;
                        if (z4) {
                            i3 = 0;
                        } else {
                            i3 = 8;
                        }
                        textView.setVisibility(i3);
                        TextView textView2 = this.f4610C;
                        if (z5) {
                            i4 = 0;
                        } else {
                            i4 = 8;
                        }
                        textView2.setVisibility(i4);
                        playbackStateCompat = this.f4634a0;
                        if (playbackStateCompat != null) {
                            i5 = playbackStateCompat.f3662g;
                            if (i5 != 6 || i5 == 3) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            context = this.f4664v.getContext();
                            if (!z6 && (this.f4634a0.f3666k & 514) != 0) {
                                i6 = R.attr.mediaRoutePauseDrawable;
                                i7 = R.string.mr_controller_pause;
                            } else if (!z6 && (this.f4634a0.f3666k & 1) != 0) {
                                i6 = R.attr.mediaRouteStopDrawable;
                                i7 = R.string.mr_controller_stop;
                            } else if (!z6 || (this.f4634a0.f3666k & 516) == 0) {
                                z7 = false;
                                i6 = 0;
                                i7 = 0;
                            } else {
                                i6 = R.attr.mediaRoutePlayDrawable;
                                i7 = R.string.mr_controller_play;
                            }
                            this.f4664v.setVisibility(z7 ? 0 : 8);
                            if (z7) {
                                this.f4664v.setImageResource(AbstractC1303m.m3328u(context, i6));
                                this.f4664v.setContentDescription(context.getResources().getText(i7));
                            }
                        }
                    }
                }
                z4 = true;
                z5 = false;
                TextView textView3 = this.f4609B;
                if (z4) {
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                textView3.setVisibility(i3);
                TextView textView4 = this.f4610C;
                if (z5) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                textView4.setVisibility(i4);
                playbackStateCompat = this.f4634a0;
                if (playbackStateCompat != null) {
                    i5 = playbackStateCompat.f3662g;
                    if (i5 != 6) {
                        z6 = true;
                    } else {
                        z6 = true;
                    }
                    context = this.f4664v.getContext();
                    if (!z6) {
                        if (!z6) {
                            if (z6) {
                                z7 = false;
                                i6 = 0;
                                i7 = 0;
                            } else {
                                z7 = false;
                                i6 = 0;
                                i7 = 0;
                            }
                        } else if (z6) {
                            z7 = false;
                            i6 = 0;
                            i7 = 0;
                        } else {
                            z7 = false;
                            i6 = 0;
                            i7 = 0;
                        }
                    } else if (!z6) {
                        if (z6) {
                            z7 = false;
                            i6 = 0;
                            i7 = 0;
                        } else {
                            z7 = false;
                            i6 = 0;
                            i7 = 0;
                        }
                    } else if (z6) {
                        z7 = false;
                        i6 = 0;
                        i7 = 0;
                    } else {
                        z7 = false;
                        i6 = 0;
                        i7 = 0;
                    }
                    this.f4664v.setVisibility(z7 ? 0 : 8);
                    if (z7) {
                        this.f4664v.setImageResource(AbstractC1303m.m3328u(context, i6));
                        this.f4664v.setContentDescription(context.getResources().getText(i7));
                    }
                }
            }
            m2664u(z3);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2662s() {
        MediaDescriptionCompat mediaDescriptionCompat = this.f4635b0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.f3622k;
        Uri uri = mediaDescriptionCompat != null ? mediaDescriptionCompat.f3623l : null;
        AsyncTaskC1047p asyncTaskC1047p = this.f4636c0;
        Bitmap bitmap2 = asyncTaskC1047p == null ? this.f4637d0 : asyncTaskC1047p.f4593a;
        Uri uri2 = asyncTaskC1047p == null ? this.f4638e0 : asyncTaskC1047p.f4594b;
        if (bitmap2 == bitmap) {
            if (bitmap2 != null) {
                return;
            }
            if (uri2 != null && uri2.equals(uri)) {
                return;
            }
            if (uri2 == null && uri == null) {
                return;
            }
        }
        if (!m2659o() || this.f4613F) {
            AsyncTaskC1047p asyncTaskC1047p2 = this.f4636c0;
            if (asyncTaskC1047p2 != null) {
                asyncTaskC1047p2.cancel(true);
            }
            AsyncTaskC1047p asyncTaskC1047p3 = new AsyncTaskC1047p(this);
            this.f4636c0 = asyncTaskC1047p3;
            asyncTaskC1047p3.execute(new Void[0]);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2663t() {
        Context context = this.f4652p;
        int iM1760z = AbstractC0664e.m1760z(context);
        getWindow().setLayout(iM1760z, -2);
        View decorView = getWindow().getDecorView();
        this.f4658s = (iM1760z - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.f4627T = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.f4628U = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.f4629V = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.f4637d0 = null;
        this.f4638e0 = null;
        m2662s();
        m2661r(false);
    }

    /* JADX INFO: renamed from: u */
    public final void m2664u(boolean z3) {
        this.f4668z.requestLayout();
        this.f4668z.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1042k(this, z3));
    }

    /* JADX INFO: renamed from: v */
    public final void m2665v(boolean z3) {
        int i3 = 0;
        this.f4617J.setVisibility((this.f4616I.getVisibility() == 0 && z3) ? 0 : 8);
        LinearLayout linearLayout = this.f4614G;
        if (this.f4616I.getVisibility() == 8 && !z3) {
            i3 = 8;
        }
        linearLayout.setVisibility(i3);
    }
}
