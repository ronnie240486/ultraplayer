package com.zuxoplayer.app;

import android.app.UiModeManager;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.Rational;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.RunnableC0892b;
import androidx.mediarouter.app.C1033b;
import com.google.android.gms.internal.cast.AbstractC1339v;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import p000A.C0041i;
import p003B.AbstractC0084f;
import p009D0.C0106b;
import p016F1.AbstractC0184a;
import p016F1.BinderC0177C;
import p016F1.C0175A;
import p016F1.C0185b;
import p016F1.C0192i;
import p038N.AbstractC0402b;
import p039N0.C0409e;
import p040N1.C0437r;
import p046P1.AbstractC0491s;
import p052S.C0531g;
import p052S.C0532h;
import p055T.AbstractC0540C;
import p055T.C0539B;
import p055T.C0541D;
import p055T.C0542E;
import p055T.C0567c;
import p055T.C0587s;
import p055T.C0589u;
import p055T.C0590v;
import p055T.C0591w;
import p055T.C0592x;
import p055T.C0593y;
import p055T.C0594z;
import p055T.InterfaceC0553P;
import p061V.C0615c;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0645m;
import p064W.C0655w;
import p064W.RunnableC0647o;
import p077a0.C0792C;
import p077a0.C0818b0;
import p077a0.C0825f;
import p077a0.C0840p;
import p077a0.C0842r;
import p082b0.C1064e;
import p083b1.C1076E;
import p083b1.C1095e;
import p091e.AbstractActivityC1479j;
import p091e.C1477h;
import p091e.C1478i;
import p105h2.AbstractC1676G;
import p105h2.C1692X;
import p108i1.C1751d;
import p114k0.C1955o;
import p129o0.C2063c;
import p129o0.C2068h;
import p129o0.InterfaceC2064d;
import p145s0.C2238k;

/* JADX INFO: loaded from: classes.dex */
public class PlayerActivity extends AbstractActivityC1479j {

    /* JADX INFO: renamed from: C0 */
    public static final /* synthetic */ int f6018C0 = 0;

    /* JADX INFO: renamed from: A0 */
    public final RunnableC1373m f6019A0;

    /* JADX INFO: renamed from: B0 */
    public final RunnableC1373m f6020B0;

    /* JADX INFO: renamed from: D */
    public InterfaceC0553P f6021D;

    /* JADX INFO: renamed from: E */
    public C0792C f6022E;

    /* JADX INFO: renamed from: F */
    public C0532h f6023F;

    /* JADX INFO: renamed from: G */
    public C0185b f6024G;

    /* JADX INFO: renamed from: H */
    public C1033b f6025H;

    /* JADX INFO: renamed from: I */
    public TextView f6026I;

    /* JADX INFO: renamed from: J */
    public C0539B f6027J;

    /* JADX INFO: renamed from: K */
    public C0539B f6028K;

    /* JADX INFO: renamed from: L */
    public C1076E f6029L;

    /* JADX INFO: renamed from: M */
    public LinearLayout f6030M;

    /* JADX INFO: renamed from: N */
    public TextView f6031N;

    /* JADX INFO: renamed from: O */
    public String f6032O;

    /* JADX INFO: renamed from: P */
    public String f6033P;

    /* JADX INFO: renamed from: Q */
    public JSONArray f6034Q;

    /* JADX INFO: renamed from: R */
    public int f6035R;

    /* JADX INFO: renamed from: S */
    public String f6036S;

    /* JADX INFO: renamed from: T */
    public TextView f6037T;

    /* JADX INFO: renamed from: U */
    public String f6038U;

    /* JADX INFO: renamed from: V */
    public String f6039V;

    /* JADX INFO: renamed from: W */
    public String f6040W;

    /* JADX INFO: renamed from: X */
    public String f6041X;

    /* JADX INFO: renamed from: Y */
    public String f6042Y;

    /* JADX INFO: renamed from: Z */
    public JSONObject f6043Z;

    /* JADX INFO: renamed from: a0 */
    public long f6044a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f6045b0;

    /* JADX INFO: renamed from: c0 */
    public final Handler f6046c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f6047d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f6048e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f6049f0;

    /* JADX INFO: renamed from: g0 */
    public long f6050g0;

    /* JADX INFO: renamed from: h0 */
    public long f6051h0;

    /* JADX INFO: renamed from: i0 */
    public TextView f6052i0;

    /* JADX INFO: renamed from: j0 */
    public final RunnableC1373m f6053j0;

    /* JADX INFO: renamed from: k0 */
    public int f6054k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f6055l0;

    /* JADX INFO: renamed from: m0 */
    public String f6056m0;

    /* JADX INFO: renamed from: n0 */
    public TextView f6057n0;

    /* JADX INFO: renamed from: o0 */
    public final RunnableC1373m f6058o0;

    /* JADX INFO: renamed from: p0 */
    public final RunnableC1373m f6059p0;

    /* JADX INFO: renamed from: q0 */
    public LinearLayout f6060q0;

    /* JADX INFO: renamed from: r0 */
    public ImageView f6061r0;

    /* JADX INFO: renamed from: s0 */
    public TextView f6062s0;

    /* JADX INFO: renamed from: t0 */
    public TextView f6063t0;

    /* JADX INFO: renamed from: u0 */
    public C1095e f6064u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f6065v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f6066w0;

    /* JADX INFO: renamed from: x0 */
    public final RunnableC1373m f6067x0;

    /* JADX INFO: renamed from: y0 */
    public final RunnableC1373m f6068y0;

    /* JADX INFO: renamed from: z0 */
    public final C1374n f6069z0;

    public PlayerActivity() {
        ((C1751d) this.f3747k.f3429c).m4208e("androidx:appcompat", new C1477h(this));
        m2302h(new C1478i(this));
        this.f6032O = "vod";
        this.f6033P = "";
        this.f6034Q = null;
        this.f6035R = -1;
        this.f6036S = null;
        this.f6038U = "";
        this.f6039V = "";
        this.f6040W = "";
        this.f6041X = "";
        this.f6042Y = "";
        this.f6043Z = null;
        this.f6044a0 = 0L;
        this.f6045b0 = false;
        this.f6046c0 = new Handler(Looper.getMainLooper());
        this.f6047d0 = false;
        this.f6048e0 = false;
        this.f6049f0 = false;
        this.f6050g0 = -1L;
        this.f6051h0 = 0L;
        this.f6053j0 = new RunnableC1373m(this, 1);
        this.f6054k0 = 0;
        this.f6055l0 = false;
        this.f6056m0 = "";
        this.f6058o0 = new RunnableC1373m(this, 2);
        this.f6059p0 = new RunnableC1373m(this, 3);
        this.f6065v0 = false;
        this.f6066w0 = false;
        this.f6067x0 = new RunnableC1373m(this, 4);
        this.f6068y0 = new RunnableC1373m(this, 5);
        this.f6069z0 = new C1374n(this);
        this.f6019A0 = new RunnableC1373m(this, 6);
        this.f6020B0 = new RunnableC1373m(this, 7);
    }

    /* JADX INFO: renamed from: q */
    public static void m3450q(PlayerActivity playerActivity) {
        String str;
        if (playerActivity.f6055l0 || playerActivity.f6021D == null) {
            return;
        }
        int i3 = playerActivity.f6054k0 + 1;
        playerActivity.f6054k0 = i3;
        if (i3 <= 6) {
            playerActivity.m3457x("Conectando… (" + playerActivity.f6054k0 + "/6)");
            playerActivity.f6046c0.removeCallbacks(playerActivity.f6058o0);
            playerActivity.f6046c0.postDelayed(playerActivity.f6058o0, 1300L);
            return;
        }
        playerActivity.f6055l0 = true;
        if ("live".equals(playerActivity.f6032O) || (str = playerActivity.f6042Y) == null || str.isEmpty()) {
            playerActivity.m3457x("Não foi possível conectar.\nO canal pode estar fora do ar.");
            playerActivity.f6046c0.postDelayed(playerActivity.f6059p0, 3000L);
        } else {
            Toast.makeText(playerActivity, "Abrindo no player alternativo…", 0).show();
            MainActivity.f6006q = playerActivity.f6042Y;
            playerActivity.finish();
        }
    }

    /* JADX INFO: renamed from: s */
    public static String m3451s(long j3) {
        if (j3 < 0) {
            j3 = 0;
        }
        long j4 = j3 / 3600;
        long j5 = (j3 % 3600) / 60;
        long j6 = j3 % 60;
        return j4 > 0 ? String.format(Locale.US, "%d:%02d:%02d", Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6)) : String.format(Locale.US, "%d:%02d", Long.valueOf(j5), Long.valueOf(j6));
    }

    @Override // p091e.AbstractActivityC1479j, p136q.AbstractActivityC2123f, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        JSONArray jSONArray;
        C0593y c0593y;
        InterfaceC0553P interfaceC0553P;
        long j3;
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        TextView textView = this.f6031N;
        boolean z3 = textView != null && textView.getVisibility() == 0;
        InterfaceC0553P interfaceC0553P2 = this.f6021D;
        Handler handler = this.f6046c0;
        int i3 = -1;
        if (interfaceC0553P2 != null && !"live".equals(this.f6032O) && !z3 && (keyCode == 21 || keyCode == 22 || keyCode == 90 || keyCode == 89)) {
            i3 = (keyCode == 22 || keyCode == 90) ? 1 : -1;
            RunnableC1373m runnableC1373m = this.f6053j0;
            if (action == 0) {
                int repeatCount = keyEvent.getRepeatCount();
                InterfaceC0553P interfaceC0553P3 = this.f6021D;
                if (interfaceC0553P3 != null) {
                    long jMo1099u = interfaceC0553P3.mo1099u();
                    boolean z4 = jMo1099u != -9223372036854775807L && jMo1099u > 0;
                    if (!this.f6049f0) {
                        this.f6049f0 = true;
                        long jMo1291M = this.f6021D.mo1291M();
                        this.f6051h0 = jMo1291M;
                        this.f6050g0 = jMo1291M;
                    }
                    long jMin = (((long) i3) * Math.min(120000L, (((long) repeatCount) * 5000) + 10000)) + this.f6050g0;
                    this.f6050g0 = jMin;
                    if (jMin < 0) {
                        this.f6050g0 = 0L;
                    }
                    if (z4) {
                        j3 = 1000;
                        long j4 = jMo1099u - 1000;
                        if (this.f6050g0 > j4) {
                            this.f6050g0 = j4;
                        }
                    } else {
                        j3 = 1000;
                    }
                    if (!z4) {
                        jMo1099u = 0;
                    }
                    if (this.f6052i0 == null) {
                        return true;
                    }
                    long j5 = this.f6050g0;
                    long j6 = (j5 - this.f6051h0) / j3;
                    String strConcat = (i3 > 0 ? ">> " : "<< ").concat(m3451s(j5 / j3));
                    if (jMo1099u > 0) {
                        strConcat = strConcat + " / " + m3451s(jMo1099u / j3);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(strConcat);
                    sb.append("   (");
                    sb.append(j6 >= 0 ? "+" : "-");
                    sb.append(m3451s(Math.abs(j6)));
                    sb.append(")");
                    this.f6052i0.setText(sb.toString());
                    this.f6052i0.setVisibility(0);
                    handler.removeCallbacks(runnableC1373m);
                    return true;
                }
            } else if (action == 1) {
                if (!this.f6049f0 || (interfaceC0553P = this.f6021D) == null) {
                    this.f6049f0 = false;
                    this.f6050g0 = -1L;
                    return true;
                }
                long j7 = this.f6050g0;
                this.f6049f0 = false;
                this.f6050g0 = -1L;
                ((AbstractC0402b) interfaceC0553P).m1093Y(5, j7);
                handler.removeCallbacks(runnableC1373m);
                handler.postDelayed(runnableC1373m, 650L);
                return true;
            }
        } else {
            if (action == 0 && !z3 && (keyCode == 23 || keyCode == 66 || keyCode == 85)) {
                m3458y();
                m3455v(true);
                return true;
            }
            if (!"live".equals(this.f6032O) || (jSONArray = this.f6034Q) == null || action != 0 || (keyCode != 19 && keyCode != 166 && keyCode != 20 && keyCode != 167)) {
                if (action != 0 || z3 || (keyCode != 19 && keyCode != 20)) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                m3455v(true);
                return true;
            }
            if (keyCode != 19 && keyCode != 166) {
                i3 = 1;
            }
            if (this.f6021D != null) {
                int i4 = this.f6035R + i3;
                if (i4 < 0 || i4 >= jSONArray.length()) {
                    m3457x(i3 < 0 ? "Início da lista" : "Fim da lista");
                    handler.postDelayed(new RunnableC1373m(this, 0), 1200L);
                    return true;
                }
                JSONObject jSONObjectOptJSONObject = this.f6034Q.optJSONObject(i4);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("u", "");
                    if (!strOptString.isEmpty()) {
                        this.f6035R = i4;
                        String strOptString2 = jSONObjectOptJSONObject.optString("t", "Canal");
                        this.f6036S = jSONObjectOptJSONObject.optString("i", "");
                        this.f6056m0 = strOptString;
                        this.f6033P = strOptString2;
                        TextView textView2 = this.f6037T;
                        if (textView2 != null) {
                            textView2.setText(strOptString2);
                        }
                        this.f6047d0 = false;
                        this.f6054k0 = 0;
                        this.f6055l0 = false;
                        handler.removeCallbacks(this.f6058o0);
                        handler.removeCallbacks(this.f6059p0);
                        this.f6027J = C0539B.m1347a(strOptString);
                        C0587s c0587s = new C0587s();
                        C0437r c0437r = new C0437r();
                        List list = Collections.EMPTY_LIST;
                        C1692X c1692x = C1692X.f7629k;
                        C0591w c0591w = new C0591w();
                        C0594z c0594z = C0594z.f2205a;
                        Uri uri = Uri.parse(strOptString);
                        String strM3453t = m3453t(strOptString);
                        C0541D c0541d = new C0541D();
                        c0541d.f1884a = strOptString2;
                        C0542E c0542e = new C0542E(c0541d);
                        AbstractC0646n.m1630h(((Uri) c0437r.f1485c) == null || ((UUID) c0437r.f1484b) != null);
                        if (uri != null) {
                            c0593y = new C0593y(uri, strM3453t, ((UUID) c0437r.f1484b) != null ? new C0590v(c0437r) : null, list, c1692x, -9223372036854775807L);
                        } else {
                            c0593y = null;
                        }
                        this.f6028K = new C0539B("", new C0589u(c0587s), c0593y, new C0592x(c0591w), c0542e, c0594z);
                        m3457x(strOptString2);
                        InterfaceC0553P interfaceC0553P4 = this.f6021D;
                        C0539B c0539b = interfaceC0553P4 == this.f6023F ? this.f6028K : this.f6027J;
                        AbstractC0402b abstractC0402b = (AbstractC0402b) interfaceC0553P4;
                        abstractC0402b.getClass();
                        abstractC0402b.mo1290L(AbstractC1676G.m4120r(c0539b));
                        this.f6021D.mo1295b();
                        ((AbstractC0402b) this.f6021D).mo1308i(true);
                        return true;
                    }
                }
            }
        }
        return true;
    }

    @Override // p091e.AbstractActivityC1479j, androidx.activity.AbstractActivityC0900j, p136q.AbstractActivityC2123f, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String strOptString;
        int i3;
        C0593y c0593y;
        final int i4 = 2;
        final int i5 = 0;
        final int i6 = 1;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("payload");
        try {
            if (stringExtra == null) {
                stringExtra = "{}";
            }
            JSONObject jSONObject = new JSONObject(stringExtra);
            strOptString = jSONObject.optString("url", "");
            try {
                this.f6032O = jSONObject.optString("kind", "vod");
                this.f6033P = jSONObject.optString("title", "");
                this.f6038U = jSONObject.optString("csrf", "");
                this.f6039V = jSONObject.optString("progress_url", "");
                this.f6040W = jSONObject.optString("complete_url", "");
                this.f6041X = jSONObject.optString("next_url", "");
                this.f6042Y = jSONObject.optString("web_url", "");
                this.f6044a0 = jSONObject.optLong("resume", 0L);
                this.f6045b0 = jSONObject.optBoolean("has_next", false);
                this.f6043Z = jSONObject.optJSONObject("progress");
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("zap");
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 1) {
                    this.f6034Q = jSONArrayOptJSONArray;
                    this.f6035R = jSONObject.optInt("zap_index", 0);
                }
            } catch (Throwable th) {
                th = th;
                Log.e("HDXNativePlayer", "payload ruim: " + th);
            }
        } catch (Throwable th2) {
            th = th2;
            strOptString = null;
        }
        if (strOptString == null || strOptString.isEmpty()) {
            finish();
            return;
        }
        this.f6056m0 = strOptString;
        UiModeManager uiModeManager = (UiModeManager) getSystemService("uimode");
        this.f6048e0 = uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
        try {
            this.f6024G = C0185b.m670a(getApplicationContext());
        } catch (Throwable th3) {
            this.f6024G = null;
            Log.w("HDXNativePlayer", "Chromecast indisponível: " + th3);
        }
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(-16777216);
        C1076E c1076e = new C1076E(this);
        this.f6029L = c1076e;
        c1076e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f6029L.setShowBuffering(2);
        this.f6029L.setKeepScreenOn(true);
        this.f6029L.setUseController(false);
        this.f6029L.setClickable(true);
        this.f6029L.setOnClickListener(new View.OnClickListener(this) { // from class: com.zuxoplayer.app.j

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ PlayerActivity f6088h;

            {
                this.f6088h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerActivity playerActivity = this.f6088h;
                switch (i6) {
                    case 0:
                        int i7 = PlayerActivity.f6018C0;
                        playerActivity.m3458y();
                        playerActivity.m3455v(true);
                        break;
                    case 1:
                        playerActivity.m3455v(true ^ playerActivity.f6065v0);
                        break;
                    case 2:
                        int i8 = PlayerActivity.f6018C0;
                        playerActivity.finish();
                        break;
                    default:
                        playerActivity.f6047d0 = true;
                        playerActivity.finish();
                        break;
                }
            }
        });
        frameLayout.addView(this.f6029L);
        TextView textView = new TextView(this);
        this.f6026I = textView;
        textView.setText("Transmitindo na TV");
        this.f6026I.setTextColor(-1);
        this.f6026I.setTextSize(this.f6048e0 ? 22.0f : 18.0f);
        this.f6026I.setGravity(17);
        this.f6026I.setVisibility(8);
        this.f6026I.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.addView(this.f6026I);
        LinearLayout linearLayout = new LinearLayout(this);
        this.f6030M = linearLayout;
        linearLayout.setOrientation(0);
        this.f6030M.setGravity(16);
        this.f6030M.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-872415232, 0}));
        this.f6030M.setPadding(m3452r(12.0f), m3452r(10.0f), m3452r(16.0f), m3452r(22.0f));
        final TextView textView2 = new TextView(this);
        textView2.setText("←");
        textView2.setTextColor(-1);
        textView2.setTextSize(26.0f);
        textView2.setPadding(m3452r(10.0f), m3452r(2.0f), m3452r(18.0f), m3452r(2.0f));
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: com.zuxoplayer.app.j

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ PlayerActivity f6088h;

            {
                this.f6088h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerActivity playerActivity = this.f6088h;
                switch (i4) {
                    case 0:
                        int i7 = PlayerActivity.f6018C0;
                        playerActivity.m3458y();
                        playerActivity.m3455v(true);
                        break;
                    case 1:
                        playerActivity.m3455v(true ^ playerActivity.f6065v0);
                        break;
                    case 2:
                        int i8 = PlayerActivity.f6018C0;
                        playerActivity.finish();
                        break;
                    default:
                        playerActivity.f6047d0 = true;
                        playerActivity.finish();
                        break;
                }
            }
        });
        textView2.setFocusable(true);
        textView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.zuxoplayer.app.i
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                int i7 = PlayerActivity.f6018C0;
                PlayerActivity playerActivity = this.f6085a;
                playerActivity.getClass();
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(z3 ? -870704614 : -1728053248);
                gradientDrawable.setCornerRadius(playerActivity.m3452r(20.0f));
                if (z3) {
                    gradientDrawable.setStroke(playerActivity.m3452r(2.0f), -54723);
                }
                textView2.setBackground(gradientDrawable);
            }
        });
        this.f6030M.addView(textView2);
        TextView textView3 = new TextView(this);
        this.f6037T = textView3;
        textView3.setText(this.f6033P);
        this.f6037T.setTextColor(-1);
        this.f6037T.setTextSize(17.0f);
        this.f6037T.setSingleLine(true);
        this.f6037T.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        this.f6030M.addView(this.f6037T);
        if (this.f6024G != null) {
            this.f6025H = new C1033b(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(m3452r(42.0f), m3452r(42.0f));
            layoutParams.leftMargin = m3452r(4.0f);
            layoutParams.rightMargin = m3452r(4.0f);
            this.f6025H.setLayoutParams(layoutParams);
            try {
                AbstractC0184a.m669a(getApplicationContext(), this.f6025H);
            } catch (Throwable unused) {
            }
            this.f6030M.addView(this.f6025H);
        }
        if ("live".equals(this.f6032O)) {
            TextView textView4 = new TextView(this);
            textView4.setText("● AO VIVO");
            textView4.setTextColor(-54723);
            textView4.setTextSize(13.0f);
            textView4.setPadding(m3452r(12.0f), 0, 0, 0);
            this.f6030M.addView(textView4);
        }
        this.f6030M.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 48));
        frameLayout.addView(this.f6030M);
        LinearLayout linearLayout2 = new LinearLayout(this);
        this.f6060q0 = linearLayout2;
        linearLayout2.setOrientation(0);
        this.f6060q0.setGravity(16);
        this.f6060q0.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-671088640, 0}));
        this.f6060q0.setPadding(m3452r(18.0f), m3452r(30.0f), m3452r(22.0f), m3452r(this.f6048e0 ? 26.0f : 18.0f));
        ImageView imageView = new ImageView(this);
        this.f6061r0 = imageView;
        imageView.setImageResource(android.R.drawable.ic_media_pause);
        this.f6061r0.setColorFilter(-1);
        int iM3452r = m3452r(this.f6048e0 ? 38.0f : 32.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iM3452r, iM3452r);
        layoutParams2.rightMargin = m3452r(16.0f);
        this.f6061r0.setLayoutParams(layoutParams2);
        this.f6061r0.setOnClickListener(new View.OnClickListener(this) { // from class: com.zuxoplayer.app.j

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ PlayerActivity f6088h;

            {
                this.f6088h = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlayerActivity playerActivity = this.f6088h;
                switch (i5) {
                    case 0:
                        int i7 = PlayerActivity.f6018C0;
                        playerActivity.m3458y();
                        playerActivity.m3455v(true);
                        break;
                    case 1:
                        playerActivity.m3455v(true ^ playerActivity.f6065v0);
                        break;
                    case 2:
                        int i8 = PlayerActivity.f6018C0;
                        playerActivity.finish();
                        break;
                    default:
                        playerActivity.f6047d0 = true;
                        playerActivity.finish();
                        break;
                }
            }
        });
        this.f6060q0.addView(this.f6061r0);
        TextView textView5 = new TextView(this);
        this.f6062s0 = textView5;
        textView5.setTextColor(-1);
        this.f6062s0.setTextSize(this.f6048e0 ? 16.0f : 13.0f);
        this.f6062s0.setText("0:00");
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.rightMargin = m3452r(12.0f);
        this.f6062s0.setLayoutParams(layoutParams3);
        this.f6060q0.addView(this.f6062s0);
        if ("live".equals(this.f6032O)) {
            TextView textView6 = new TextView(this);
            textView6.setText("● AO VIVO");
            textView6.setTextColor(-54723);
            textView6.setTextSize(this.f6048e0 ? 16.0f : 13.0f);
            i3 = -2;
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams4.leftMargin = m3452r(8.0f);
            textView6.setLayoutParams(layoutParams4);
            this.f6060q0.addView(textView6);
        } else {
            C1095e c1095e = new C1095e(this, 0);
            this.f6064u0 = c1095e;
            c1095e.setPlayedColor(-15681151);
            this.f6064u0.setScrubberColor(-15681151);
            this.f6064u0.setBufferedColor(1728053247);
            this.f6064u0.setUnplayedColor(1090519039);
            this.f6064u0.setFocusable(false);
            this.f6064u0.setLayoutParams(new LinearLayout.LayoutParams(0, m3452r(26.0f), 1.0f));
            C1095e c1095e2 = this.f6064u0;
            C1372l c1372l = new C1372l(this);
            c1095e2.getClass();
            c1095e2.f4993D.add(c1372l);
            this.f6060q0.addView(this.f6064u0);
            TextView textView7 = new TextView(this);
            this.f6063t0 = textView7;
            textView7.setTextColor(-1);
            this.f6063t0.setTextSize(this.f6048e0 ? 16.0f : 13.0f);
            this.f6063t0.setText("0:00");
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams5.leftMargin = m3452r(12.0f);
            this.f6063t0.setLayoutParams(layoutParams5);
            this.f6060q0.addView(this.f6063t0);
            i3 = -2;
        }
        this.f6060q0.setLayoutParams(new FrameLayout.LayoutParams(-1, i3, 80));
        this.f6060q0.setVisibility(8);
        frameLayout.addView(this.f6060q0);
        this.f6030M.setVisibility(8);
        if (!"live".equals(this.f6032O) && this.f6045b0) {
            TextView textView8 = new TextView(this);
            this.f6031N = textView8;
            textView8.setText("Próximo episódio  ▶");
            this.f6031N.setTextColor(-1);
            this.f6031N.setTextSize(this.f6048e0 ? 18.0f : 15.0f);
            this.f6031N.setTypeface(null, 1);
            this.f6031N.setPadding(m3452r(22.0f), m3452r(13.0f), m3452r(22.0f), m3452r(13.0f));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(-15681151);
            gradientDrawable.setCornerRadius(m3452r(8.0f));
            this.f6031N.setBackground(gradientDrawable);
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2, 8388693);
            layoutParams6.rightMargin = m3452r(this.f6048e0 ? 48.0f : 24.0f);
            layoutParams6.bottomMargin = m3452r(this.f6048e0 ? 70.0f : 56.0f);
            this.f6031N.setLayoutParams(layoutParams6);
            this.f6031N.setVisibility(8);
            final int i7 = 3;
            this.f6031N.setOnClickListener(new View.OnClickListener(this) { // from class: com.zuxoplayer.app.j

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ PlayerActivity f6088h;

                {
                    this.f6088h = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PlayerActivity playerActivity = this.f6088h;
                    switch (i7) {
                        case 0:
                            int i8 = PlayerActivity.f6018C0;
                            playerActivity.m3458y();
                            playerActivity.m3455v(true);
                            break;
                        case 1:
                            playerActivity.m3455v(true ^ playerActivity.f6065v0);
                            break;
                        case 2:
                            int i9 = PlayerActivity.f6018C0;
                            playerActivity.finish();
                            break;
                        default:
                            playerActivity.f6047d0 = true;
                            playerActivity.finish();
                            break;
                    }
                }
            });
            this.f6031N.setFocusable(true);
            this.f6031N.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.zuxoplayer.app.k
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z3) {
                    int i8 = PlayerActivity.f6018C0;
                    PlayerActivity playerActivity = this.f6089a;
                    playerActivity.getClass();
                    GradientDrawable gradientDrawable2 = new GradientDrawable();
                    gradientDrawable2.setColor(-15681151);
                    gradientDrawable2.setCornerRadius(playerActivity.m3452r(8.0f));
                    if (z3) {
                        gradientDrawable2.setStroke(playerActivity.m3452r(3.0f), -1);
                    }
                    playerActivity.f6031N.setBackground(gradientDrawable2);
                }
            });
            frameLayout.addView(this.f6031N);
        }
        if (!"live".equals(this.f6032O)) {
            TextView textView9 = new TextView(this);
            this.f6052i0 = textView9;
            textView9.setTextColor(-1);
            this.f6052i0.setTextSize(this.f6048e0 ? 30.0f : 22.0f);
            this.f6052i0.setTypeface(null, 1);
            this.f6052i0.setPadding(m3452r(28.0f), m3452r(15.0f), m3452r(28.0f), m3452r(15.0f));
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(-671088640);
            gradientDrawable2.setCornerRadius(m3452r(14.0f));
            this.f6052i0.setBackground(gradientDrawable2);
            this.f6052i0.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
            this.f6052i0.setVisibility(8);
            frameLayout.addView(this.f6052i0);
        }
        TextView textView10 = new TextView(this);
        this.f6057n0 = textView10;
        textView10.setTextColor(-1);
        this.f6057n0.setTextSize(this.f6048e0 ? 19.0f : 15.0f);
        this.f6057n0.setGravity(17);
        this.f6057n0.setPadding(m3452r(22.0f), m3452r(13.0f), m3452r(22.0f), m3452r(13.0f));
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setColor(-671088640);
        gradientDrawable3.setCornerRadius(m3452r(12.0f));
        this.f6057n0.setBackground(gradientDrawable3);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2, 81);
        layoutParams7.bottomMargin = m3452r(this.f6048e0 ? 92.0f : 70.0f);
        this.f6057n0.setLayoutParams(layoutParams7);
        this.f6057n0.setVisibility(8);
        frameLayout.addView(this.f6057n0);
        setContentView(frameLayout);
        getWindow().getDecorView().setSystemUiVisibility(5894);
        C0409e c0409e = new C0409e(1);
        c0409e.f1383k = "ZuxoPlayer/2.7";
        c0409e.f1381i = true;
        C0106b c0106b = new C0106b(this, c0409e);
        C0842r c0842r = new C0842r(this);
        C1955o c1955o = new C1955o(c0106b, new C2238k());
        AbstractC0646n.m1630h(!c0842r.f3594t);
        c0842r.f3578d = new C0840p(0, c1955o);
        AbstractC0646n.m1630h(!c0842r.f3594t);
        c0842r.f3588n = 10000L;
        AbstractC0646n.m1630h(!c0842r.f3594t);
        c0842r.f3587m = 10000L;
        AbstractC0646n.m1630h(!c0842r.f3594t);
        c0842r.f3594t = true;
        int i8 = AbstractC0632A.f2454a;
        C0792C c0792c = new C0792C(c0842r);
        this.f6022E = c0792c;
        C0567c c0567c = C0567c.f2052b;
        c0792c.m1931z0();
        if (!c0792c.f3237c0) {
            boolean zEquals = Objects.equals(c0792c.f3228V, c0567c);
            C0645m c0645m = c0792c.f3251l;
            if (!zEquals) {
                c0792c.f3228V = c0567c;
                c0792c.m1922q0(1, 3, c0567c);
                c0645m.m1618c(20, new C0041i(12));
            }
            C0825f c0825f = c0792c.f3208B;
            c0825f.m2075b(c0567c);
            c0792c.f3246h.mo4613b(c0567c);
            boolean zMo1322t = c0792c.mo1322t();
            int iM2077d = c0825f.m2077d(c0792c.mo1304g(), zMo1322t);
            c0792c.m1928w0(iM2077d, iM2077d == -1 ? 2 : 1, zMo1322t);
            c0645m.m1617b();
        }
        C0792C c0792c2 = this.f6022E;
        this.f6021D = c0792c2;
        this.f6029L.setPlayer(c0792c2);
        this.f6027J = C0539B.m1347a(strOptString);
        C0587s c0587s = new C0587s();
        C0437r c0437r = new C0437r();
        List list = Collections.EMPTY_LIST;
        C1692X c1692x = C1692X.f7629k;
        C0591w c0591w = new C0591w();
        C0594z c0594z = C0594z.f2205a;
        Uri uri = Uri.parse(strOptString);
        String strM3453t = m3453t(strOptString);
        C0541D c0541d = new C0541D();
        c0541d.f1884a = this.f6033P;
        C0542E c0542e = new C0542E(c0541d);
        AbstractC0646n.m1630h(((Uri) c0437r.f1485c) == null || ((UUID) c0437r.f1484b) != null);
        if (uri != null) {
            c0593y = new C0593y(uri, strM3453t, ((UUID) c0437r.f1484b) != null ? new C0590v(c0437r) : null, list, c1692x, -9223372036854775807L);
        } else {
            c0593y = null;
        }
        this.f6028K = new C0539B("", new C0589u(c0587s), c0593y, new C0592x(c0591w), c0542e, c0594z);
        long j3 = this.f6044a0;
        if (j3 > 30) {
            InterfaceC0553P interfaceC0553P = this.f6021D;
            C0539B c0539b = this.f6027J;
            AbstractC0402b abstractC0402b = (AbstractC0402b) interfaceC0553P;
            abstractC0402b.getClass();
            abstractC0402b.mo1293O(AbstractC1676G.m4120r(c0539b), 0, j3 * 1000);
        } else {
            InterfaceC0553P interfaceC0553P2 = this.f6021D;
            C0539B c0539b2 = this.f6027J;
            AbstractC0402b abstractC0402b2 = (AbstractC0402b) interfaceC0553P2;
            abstractC0402b2.getClass();
            abstractC0402b2.mo1290L(AbstractC1676G.m4120r(c0539b2));
        }
        this.f6021D.mo1314l(this.f6069z0);
        this.f6021D.mo1295b();
        ((AbstractC0402b) this.f6021D).mo1308i(true);
        if (this.f6024G != null) {
            try {
                C0532h c0532h = new C0532h(this.f6024G);
                this.f6023F = c0532h;
                c0532h.f1830l = new C1375o(this);
                if (c0532h.f1834p != null) {
                    m3456w(c0532h);
                }
            } catch (Throwable th4) {
                this.f6023F = null;
                Log.w("HDXNativePlayer", "CastPlayer falhou: " + th4);
            }
        }
        Handler handler = this.f6046c0;
        handler.postDelayed(this.f6019A0, 10000L);
        handler.post(this.f6068y0);
        if ("live".equals(this.f6032O) || !this.f6045b0) {
            return;
        }
        handler.postDelayed(this.f6020B0, 1000L);
    }

    @Override // p091e.AbstractActivityC1479j, android.app.Activity
    public final void onDestroy() {
        String str;
        this.f6046c0.removeCallbacksAndMessages(null);
        if (this.f6021D != null && !this.f6047d0) {
            m3454u(false);
        }
        C0532h c0532h = this.f6023F;
        if (c0532h != null) {
            c0532h.f1830l = null;
            int i3 = AbstractC0632A.f2454a;
            C0185b c0185b = c0532h.f1820b;
            c0185b.getClass();
            AbstractC0491s.m1210b();
            C0192i c0192i = c0185b.f428c;
            c0192i.getClass();
            AbstractC0491s.m1210b();
            C0531g c0531g = c0532h.f1827i;
            if (c0531g != null) {
                try {
                    C0175A c0175a = c0192i.f470a;
                    BinderC0177C binderC0177C = new BinderC0177C(c0531g);
                    Parcel parcelM1894e0 = c0175a.m1894e0();
                    AbstractC1339v.m3422d(parcelM1894e0, binderC0177C);
                    c0175a.m1896u0(parcelM1894e0, 3);
                } catch (RemoteException e3) {
                    C0192i.f469c.m830a(e3, "Unable to call %s on %s.", "removeSessionManagerListener", C0175A.class.getSimpleName());
                }
            }
            c0192i.m679b(false);
            this.f6023F = null;
        }
        C0792C c0792c = this.f6022E;
        if (c0792c != null) {
            StringBuilder sb = new StringBuilder("Release ");
            sb.append(Integer.toHexString(System.identityHashCode(c0792c)));
            sb.append(" [AndroidXMedia3/1.5.1] [");
            sb.append(AbstractC0632A.f2458e);
            sb.append("] [");
            HashSet hashSet = AbstractC0540C.f1880a;
            synchronized (AbstractC0540C.class) {
                str = AbstractC0540C.f1881b;
            }
            sb.append(str);
            sb.append("]");
            AbstractC0646n.m1639q("ExoPlayerImpl", sb.toString());
            c0792c.m1931z0();
            c0792c.f3207A.m2057d();
            c0792c.f3209C.getClass();
            c0792c.f3210D.getClass();
            C0825f c0825f = c0792c.f3208B;
            c0825f.f3469c = null;
            c0825f.m2074a();
            c0825f.m2076c(0);
            if (!c0792c.f3250k.m1939B()) {
                c0792c.f3251l.m1621f(10, new C0041i(11));
            }
            c0792c.f3251l.m1619d();
            c0792c.f3248i.f2529a.removeCallbacksAndMessages(null);
            InterfaceC2064d interfaceC2064d = c0792c.f3259t;
            C1064e c1064e = c0792c.f3257r;
            CopyOnWriteArrayList<C2063c> copyOnWriteArrayList = (CopyOnWriteArrayList) ((C2068h) interfaceC2064d).f8984b.f6406h;
            for (C2063c c2063c : copyOnWriteArrayList) {
                if (c2063c.f8962b == c1064e) {
                    c2063c.f8963c = true;
                    copyOnWriteArrayList.remove(c2063c);
                }
            }
            C0818b0 c0818b0 = c0792c.f3243f0;
            if (c0818b0.f3446p) {
                c0792c.f3243f0 = c0818b0.m2061a();
            }
            C0818b0 c0818b0M2067g = c0792c.f3243f0.m2067g(1);
            c0792c.f3243f0 = c0818b0M2067g;
            C0818b0 c0818b0M2062b = c0818b0M2067g.m2062b(c0818b0M2067g.f3432b);
            c0792c.f3243f0 = c0818b0M2062b;
            c0818b0M2062b.f3447q = c0818b0M2062b.f3449s;
            c0792c.f3243f0.f3448r = 0L;
            C1064e c1064e2 = c0792c.f3257r;
            C0655w c0655w = c1064e2.f4833n;
            AbstractC0646n.m1631i(c0655w);
            c0655w.m1698c(new RunnableC0892b(5, c1064e2));
            c0792c.f3246h.mo4612a();
            c0792c.m1921p0();
            Surface surface = c0792c.f3221O;
            if (surface != null) {
                surface.release();
                c0792c.f3221O = null;
            }
            c0792c.f3231Y = C0615c.f2372b;
            c0792c.f3237c0 = true;
            this.f6022E = null;
        }
        this.f6021D = null;
        super.onDestroy();
    }

    @Override // p091e.AbstractActivityC1479j, android.app.Activity
    public final void onPause() {
        super.onPause();
        InterfaceC0553P interfaceC0553P = this.f6021D;
        if (interfaceC0553P != null) {
            try {
                long jMo1291M = interfaceC0553P.mo1291M() / 1000;
                long jMo1099u = this.f6021D.mo1099u() == -9223372036854775807L ? 0L : this.f6021D.mo1099u() / 1000;
                String str = this.f6036S;
                String str2 = "";
                if (str != null && !str.isEmpty()) {
                    str2 = "if(window.__zxZapTrack)window.__zxZapTrack('" + this.f6036S.replaceAll("[^0-9]", "") + "');";
                }
                MainActivity.f6007r = "if(window.__zxNativeDone)window.__zxNativeDone(" + jMo1291M + "," + jMo1099u + "," + (this.f6047d0 ? 1 : 0) + ");" + str2;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // androidx.activity.AbstractActivityC0900j, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z3, Configuration configuration) {
        super.onPictureInPictureModeChanged(z3, configuration);
        if (z3) {
            m3455v(false);
        }
    }

    @Override // p091e.AbstractActivityC1479j, android.app.Activity
    public final void onStop() {
        super.onStop();
        if ((Build.VERSION.SDK_INT < 24 || !isInPictureInPictureMode()) && this.f6021D != null) {
            m3454u(false);
            InterfaceC0553P interfaceC0553P = this.f6021D;
            if (interfaceC0553P == this.f6022E) {
                ((AbstractC0402b) interfaceC0553P).mo1308i(false);
            }
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        InterfaceC0553P interfaceC0553P;
        super.onUserLeaveHint();
        if (!this.f6048e0 && Build.VERSION.SDK_INT >= 26 && (interfaceC0553P = this.f6021D) != null && ((AbstractC0402b) interfaceC0553P).m1091W()) {
            try {
                AbstractC0084f.m440B();
                enterPictureInPictureMode(AbstractC0084f.m445e().setAspectRatio(new Rational(16, 9)).build());
            } catch (Throwable unused) {
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (z3) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
    }

    /* JADX INFO: renamed from: r */
    public final int m3452r(float f) {
        return (int) TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: t */
    public final String m3453t(String str) {
        String lowerCase = str.toLowerCase(Locale.US);
        int iIndexOf = lowerCase.indexOf(63);
        if (iIndexOf >= 0) {
            lowerCase = lowerCase.substring(0, iIndexOf);
        }
        if (lowerCase.endsWith(".m3u8")) {
            return "application/x-mpegURL";
        }
        if (lowerCase.endsWith(".mpd")) {
            return "application/dash+xml";
        }
        if (lowerCase.endsWith(".mp4") || lowerCase.endsWith(".m4v")) {
            return "video/mp4";
        }
        if (lowerCase.endsWith(".mkv")) {
            return "video/x-matroska";
        }
        if (lowerCase.endsWith(".webm")) {
            return "video/webm";
        }
        if (lowerCase.endsWith(".ts")) {
            return "video/mp2t";
        }
        if (lowerCase.endsWith(".mov")) {
            return "video/quicktime";
        }
        return "live".equals(this.f6032O) ? "application/x-mpegURL" : "video/mp4";
    }

    /* JADX INFO: renamed from: u */
    public final void m3454u(boolean z3) {
        if (this.f6021D == null || this.f6043Z == null) {
            return;
        }
        String str = z3 ? this.f6040W : this.f6039V;
        if (str == null || str.isEmpty()) {
            return;
        }
        long jMo1291M = this.f6021D.mo1291M() / 1000;
        long jMo1099u = this.f6021D.mo1099u() == -9223372036854775807L ? 0L : this.f6021D.mo1099u() / 1000;
        if (jMo1291M >= 5 || z3) {
            StringBuilder sb = new StringBuilder();
            try {
                sb.append("_csrf=");
                sb.append(URLEncoder.encode(this.f6038U, "UTF-8"));
                sb.append("&position=");
                sb.append(jMo1291M);
                sb.append("&duration=");
                sb.append(jMo1099u);
                Iterator<String> itKeys = this.f6043Z.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    sb.append('&');
                    sb.append(URLEncoder.encode(next, "UTF-8"));
                    sb.append('=');
                    sb.append(URLEncoder.encode(this.f6043Z.optString(next, ""), "UTF-8"));
                }
                new Thread(new RunnableC0647o(str, 6, sb.toString())).start();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m3455v(boolean z3) {
        this.f6065v0 = z3;
        int i3 = z3 ? 0 : 8;
        LinearLayout linearLayout = this.f6030M;
        if (linearLayout != null) {
            linearLayout.setVisibility(i3);
        }
        LinearLayout linearLayout2 = this.f6060q0;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(i3);
        }
        Handler handler = this.f6046c0;
        RunnableC1373m runnableC1373m = this.f6067x0;
        handler.removeCallbacks(runnableC1373m);
        if (z3) {
            handler.postDelayed(runnableC1373m, 4000L);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m3456w(InterfaceC0553P interfaceC0553P) {
        InterfaceC0553P interfaceC0553P2;
        boolean zMo1322t;
        long jMo1291M;
        if (interfaceC0553P == null || interfaceC0553P == (interfaceC0553P2 = this.f6021D)) {
            return;
        }
        C1374n c1374n = this.f6069z0;
        if (interfaceC0553P2 != null) {
            jMo1291M = interfaceC0553P2.mo1291M();
            zMo1322t = this.f6021D.mo1322t();
            this.f6021D.mo1325x(c1374n);
            this.f6021D.stop();
            ((AbstractC0402b) this.f6021D).mo1283C();
        } else {
            zMo1322t = true;
            jMo1291M = 0;
        }
        this.f6021D = interfaceC0553P;
        C1076E c1076e = this.f6029L;
        if (c1076e != null) {
            c1076e.setPlayer(interfaceC0553P);
        }
        interfaceC0553P.mo1314l(c1374n);
        C0539B c0539bM1347a = interfaceC0553P == this.f6023F ? this.f6028K : this.f6027J;
        if (c0539bM1347a == null) {
            c0539bM1347a = C0539B.m1347a(this.f6056m0);
        }
        if ("live".equals(this.f6032O)) {
            ((AbstractC0402b) interfaceC0553P).mo1290L(AbstractC1676G.m4120r(c0539bM1347a));
        } else {
            ((AbstractC0402b) interfaceC0553P).mo1293O(AbstractC1676G.m4120r(c0539bM1347a), 0, Math.max(0L, jMo1291M));
        }
        interfaceC0553P.mo1308i(zMo1322t);
        interfaceC0553P.mo1295b();
        TextView textView = this.f6026I;
        if (textView != null) {
            textView.setVisibility(interfaceC0553P != this.f6023F ? 8 : 0);
        }
        m3459z();
    }

    /* JADX INFO: renamed from: x */
    public final void m3457x(String str) {
        TextView textView = this.f6057n0;
        if (textView == null) {
            return;
        }
        textView.setText(str);
        this.f6057n0.setVisibility(0);
    }

    /* JADX INFO: renamed from: y */
    public final void m3458y() {
        InterfaceC0553P interfaceC0553P = this.f6021D;
        if (interfaceC0553P == null) {
            return;
        }
        if (((AbstractC0402b) interfaceC0553P).m1091W()) {
            ((AbstractC0402b) this.f6021D).mo1308i(false);
        } else {
            ((AbstractC0402b) this.f6021D).mo1308i(true);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m3459z() {
        InterfaceC0553P interfaceC0553P;
        if (this.f6061r0 == null || (interfaceC0553P = this.f6021D) == null) {
            return;
        }
        this.f6061r0.setImageResource(interfaceC0553P.mo1322t() && this.f6021D.mo1304g() != 4 ? android.R.drawable.ic_media_pause : android.R.drawable.ic_media_play);
        this.f6061r0.setColorFilter(-1);
    }
}
