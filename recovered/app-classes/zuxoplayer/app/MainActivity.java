package com.zuxoplayer.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.UiModeManager;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.RunnableC0892b;
import androidx.fragment.app.DialogInterfaceOnDismissListenerC0957h;
import com.google.android.gms.internal.cast.C1351y;
import p013E1.RunnableC0121D;

/* JADX INFO: loaded from: classes.dex */
public class MainActivity extends Activity {

    /* JADX INFO: renamed from: q */
    public static volatile String f6006q;

    /* JADX INFO: renamed from: r */
    public static volatile String f6007r;

    /* JADX INFO: renamed from: g */
    public WebView f6008g;

    /* JADX INFO: renamed from: i */
    public ConnectivityManager f6010i;

    /* JADX INFO: renamed from: j */
    public C1351y f6011j;

    /* JADX INFO: renamed from: l */
    public FrameLayout f6013l;

    /* JADX INFO: renamed from: h */
    public boolean f6009h = false;

    /* JADX INFO: renamed from: k */
    public boolean f6012k = false;

    /* JADX INFO: renamed from: m */
    public boolean f6014m = false;

    /* JADX INFO: renamed from: n */
    public long f6015n = 0;

    /* JADX INFO: renamed from: o */
    public final Handler f6016o = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: p */
    public boolean f6017p = false;

    public class WebBridge {
        public WebBridge() {
        }

        @JavascriptInterface
        public String deviceId() {
            try {
                String string = Settings.Secure.getString(MainActivity.this.getContentResolver(), "android_id");
                return string == null ? "" : string;
            } catch (Throwable unused) {
                return "";
            }
        }

        @JavascriptInterface
        public boolean isTv() {
            return MainActivity.this.f6012k;
        }

        @JavascriptInterface
        public void play(String str) {
            MainActivity.this.runOnUiThread(new RunnableC1368h(this, str));
        }

        @JavascriptInterface
        public void retry() {
            MainActivity.this.runOnUiThread(new RunnableC1367g(this));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3446a() {
        if (this.f6017p) {
            return;
        }
        this.f6017p = true;
        try {
            new AlertDialog.Builder(this, android.R.style.Theme.DeviceDefault.Dialog.Alert).setTitle("Sair do Zuxo Player?").setMessage("Deseja fechar o aplicativo?").setNegativeButton("Cancelar", (DialogInterface.OnClickListener) null).setPositiveButton("Sair", new DialogInterfaceOnClickListenerC1365e(this)).setOnDismissListener(new DialogInterfaceOnDismissListenerC0957h(1, this)).show();
        } catch (Throwable unused) {
            finish();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3447b() {
        FrameLayout frameLayout = this.f6013l;
        if (frameLayout == null) {
            return;
        }
        this.f6013l = null;
        frameLayout.animate().alpha(0.0f).setDuration(380L).withEndAction(new RunnableC0892b(10, frameLayout)).start();
    }

    /* JADX INFO: renamed from: c */
    public final void m3448c() {
        if (this.f6013l == null || !this.f6014m) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f6015n;
        if (jUptimeMillis < 1400) {
            this.f6016o.postDelayed(new RunnableC1361a(this, 0), 1430 - jUptimeMillis);
        } else {
            m3447b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m3449d(boolean z3) {
        WebView webView;
        if (this.f6014m || (webView = this.f6008g) == null || this.f6013l == null) {
            return;
        }
        if (!z3 && webView.getProgress() >= 60) {
            this.f6016o.postDelayed(new RunnableC1361a(this, 3), 8000L);
            return;
        }
        Log.e("HDXWeb", "watchdog: pagina nao carregou (progresso " + this.f6008g.getProgress() + "%) -> offline");
        this.f6009h = true;
        this.f6008g.loadUrl("file:///android_asset/offline.html");
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        WebView webView = this.f6008g;
        if (webView == null || this.f6009h) {
            m3446a();
        } else {
            webView.evaluateJavascript("(window.__zxBackAction?window.__zxBackAction():'na')", new C1364d(this));
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView.setWebContentsDebuggingEnabled(true);
        try {
            UiModeManager uiModeManager = (UiModeManager) getSystemService("uimode");
            boolean z3 = uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
            boolean z4 = getPackageManager().hasSystemFeature("android.software.leanback") || getPackageManager().hasSystemFeature("android.hardware.type.television");
            this.f6012k = z3 || z4;
            Log.d("HDXWeb", "isTvDevice=" + this.f6012k + " (modeTv=" + z3 + " leanback=" + z4 + ")");
        } catch (Throwable unused) {
            this.f6012k = false;
        }
        WebView webView = new WebView(this);
        this.f6008g = webView;
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WebSettings settings = this.f6008g.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setMixedContentMode(0);
        settings.setAllowUniversalAccessFromFileURLs(true);
        settings.setAllowFileAccessFromFileURLs(true);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        settings.setCacheMode(-1);
        settings.setUserAgentString("ZuxoPlayer/2.7");
        this.f6008g.addJavascriptInterface(new WebBridge(), "Android");
        this.f6008g.addJavascriptInterface(new WebBridge(), "HdxNative");
        this.f6008g.setWebViewClient(new C1362b(this));
        this.f6008g.setWebChromeClient(new C1363c());
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(-16777216);
        frameLayout.addView(this.f6008g);
        FrameLayout frameLayout2 = new FrameLayout(this);
        frameLayout2.setBackgroundColor(-16777216);
        frameLayout2.setClickable(true);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.splash_logo);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams((int) (getResources().getDisplayMetrics().widthPixels * 0.34f), -2);
        imageView.setAdjustViewBounds(true);
        imageView.setLayoutParams(layoutParams);
        linearLayout.addView(imageView);
        View c1366f = new C1366f(this);
        float f = getResources().getDisplayMetrics().density;
        int i3 = (int) (30.0f * f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i3, i3);
        layoutParams2.topMargin = (int) (f * 24.0f);
        c1366f.setLayoutParams(layoutParams2);
        linearLayout.addView(c1366f);
        frameLayout2.addView(linearLayout, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f6013l = frameLayout2;
        frameLayout.addView(frameLayout2);
        setContentView(frameLayout);
        this.f6015n = SystemClock.uptimeMillis();
        Handler handler = this.f6016o;
        handler.postDelayed(new RunnableC1361a(this, 0), 1450L);
        handler.postDelayed(new RunnableC1361a(this, 1), 10000L);
        handler.postDelayed(new RunnableC1361a(this, 2), 20000L);
        getWindow().getDecorView().setSystemUiVisibility(5894);
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
            this.f6010i = connectivityManager;
            if (connectivityManager != null) {
                C1351y c1351y = new C1351y(1, this);
                this.f6011j = c1351y;
                this.f6010i.registerDefaultNetworkCallback(c1351y);
            }
        } catch (Throwable th) {
            Log.e("HDXWeb", "registerNetworkWatcher falhou: " + th.getMessage());
        }
        if (bundle != null) {
            this.f6008g.restoreState(bundle);
        } else {
            this.f6008g.loadUrl("file:///android_asset/webui/index.html");
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C1351y c1351y;
        try {
            ConnectivityManager connectivityManager = this.f6010i;
            if (connectivityManager != null && (c1351y = this.f6011j) != null) {
                connectivityManager.unregisterNetworkCallback(c1351y);
            }
        } catch (Throwable unused) {
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i3, KeyEvent keyEvent) {
        WebView webView;
        if (i3 != 4) {
            if (i3 != 82 || (webView = this.f6008g) == null || this.f6009h) {
                return super.onKeyDown(i3, keyEvent);
            }
            webView.evaluateJavascript("try{document.dispatchEvent(new KeyboardEvent('keydown',{key:'ContextMenu',bubbles:true,cancelable:true}))}catch(e){}", null);
            return true;
        }
        WebView webView2 = this.f6008g;
        if (webView2 == null || this.f6009h) {
            m3446a();
            return true;
        }
        webView2.evaluateJavascript("(window.__zxBackAction?window.__zxBackAction():'na')", new C1364d(this));
        return true;
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        if (f6006q != null && this.f6008g != null) {
            String str = f6006q;
            f6006q = null;
            this.f6008g.loadUrl(str);
        }
        if (f6007r == null || this.f6008g == null) {
            return;
        }
        String str2 = f6007r;
        f6007r = null;
        this.f6008g.post(new RunnableC0121D(this, str2, 7, false));
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f6008g.saveState(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (z3) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
    }
}
