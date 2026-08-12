package androidx.mediarouter.app;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.session.HandlerC0881q;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p060U1.AbstractC0610a;
import p064W.C0649q;
import p066W1.AbstractC0664e;
import p089d1.C1403C;
import p089d1.C1405E;
import p089d1.C1451x;
import p091e.AbstractDialogC1460E;

/* JADX INFO: renamed from: androidx.mediarouter.app.f */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1037f extends AbstractDialogC1460E {

    /* JADX INFO: renamed from: A */
    public boolean f4556A;

    /* JADX INFO: renamed from: B */
    public long f4557B;

    /* JADX INFO: renamed from: C */
    public final HandlerC0881q f4558C;

    /* JADX INFO: renamed from: l */
    public final C1405E f4559l;

    /* JADX INFO: renamed from: m */
    public final C1020G f4560m;

    /* JADX INFO: renamed from: n */
    public C1451x f4561n;

    /* JADX INFO: renamed from: o */
    public ArrayList f4562o;

    /* JADX INFO: renamed from: p */
    public TextView f4563p;

    /* JADX INFO: renamed from: q */
    public TextView f4564q;

    /* JADX INFO: renamed from: r */
    public RelativeLayout f4565r;

    /* JADX INFO: renamed from: s */
    public TextView f4566s;

    /* JADX INFO: renamed from: t */
    public TextView f4567t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f4568u;

    /* JADX INFO: renamed from: v */
    public Button f4569v;

    /* JADX INFO: renamed from: w */
    public ProgressBar f4570w;

    /* JADX INFO: renamed from: x */
    public ListView f4571x;

    /* JADX INFO: renamed from: y */
    public C1035d f4572y;

    /* JADX INFO: renamed from: z */
    public final C0649q f4573z;

    /* JADX WARN: Illegal instructions before constructor call */
    public DialogC1037f(Context context) {
        ContextThemeWrapper contextThemeWrapperM3316i = AbstractC1303m.m3316i(context, false);
        int iM3328u = AbstractC1303m.m3328u(contextThemeWrapperM3316i, R.attr.mediaRouteTheme);
        super(contextThemeWrapperM3316i, iM3328u == 0 ? AbstractC1303m.m3324q(contextThemeWrapperM3316i) : iM3328u);
        this.f4561n = C1451x.f6416c;
        this.f4558C = new HandlerC0881q(1, this);
        this.f4559l = C1405E.m3512d(getContext());
        this.f4560m = new C1020G(this, 2);
        this.f4573z = new C0649q(1, this);
    }

    @Override // p091e.AbstractDialogC1460E, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            getContext().unregisterReceiver(this.f4573z);
        } catch (IllegalArgumentException unused) {
        }
        super.dismiss();
    }

    /* JADX INFO: renamed from: h */
    public final void m2635h(List list) {
        this.f4557B = SystemClock.uptimeMillis();
        this.f4562o.clear();
        this.f4562o.addAll(list);
        this.f4572y.notifyDataSetChanged();
        HandlerC0881q handlerC0881q = this.f4558C;
        handlerC0881q.removeMessages(3);
        handlerC0881q.removeMessages(2);
        if (!list.isEmpty()) {
            m2638k(1);
        } else {
            m2638k(0);
            handlerC0881q.sendMessageDelayed(handlerC0881q.obtainMessage(2), 5000L);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2636i() {
        if (this.f4556A) {
            this.f4559l.getClass();
            C1405E.m3510b();
            ArrayList arrayList = new ArrayList(C1405E.m3511c().f6339j);
            int size = arrayList.size();
            while (true) {
                int i3 = size - 1;
                if (size <= 0) {
                    break;
                }
                C1403C c1403c = (C1403C) arrayList.get(i3);
                if (c1403c.m3494d() || !c1403c.f6222g || !c1403c.m3498h(this.f4561n)) {
                    arrayList.remove(i3);
                }
                size = i3;
            }
            Collections.sort(arrayList, C1036e.f4552h);
            if (SystemClock.uptimeMillis() - this.f4557B >= 300) {
                m2635h(arrayList);
                return;
            }
            HandlerC0881q handlerC0881q = this.f4558C;
            handlerC0881q.removeMessages(1);
            handlerC0881q.sendMessageAtTime(handlerC0881q.obtainMessage(1, arrayList), this.f4557B + 300);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2637j(C1451x c1451x) {
        if (c1451x == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f4561n.equals(c1451x)) {
            return;
        }
        this.f4561n = c1451x;
        if (this.f4556A) {
            C1405E c1405e = this.f4559l;
            C1020G c1020g = this.f4560m;
            c1405e.m3518h(c1020g);
            c1405e.m3517a(c1451x, c1020g, 1);
        }
        m2636i();
    }

    /* JADX INFO: renamed from: k */
    public final void m2638k(int i3) {
        if (i3 == 0) {
            setTitle(R.string.mr_chooser_title);
            this.f4571x.setVisibility(8);
            this.f4564q.setVisibility(0);
            this.f4570w.setVisibility(0);
            this.f4568u.setVisibility(8);
            this.f4569v.setVisibility(8);
            this.f4567t.setVisibility(8);
            this.f4565r.setVisibility(8);
            return;
        }
        if (i3 == 1) {
            setTitle(R.string.mr_chooser_title);
            this.f4571x.setVisibility(0);
            this.f4564q.setVisibility(8);
            this.f4570w.setVisibility(8);
            this.f4568u.setVisibility(8);
            this.f4569v.setVisibility(8);
            this.f4567t.setVisibility(8);
            this.f4565r.setVisibility(8);
            return;
        }
        if (i3 == 2) {
            setTitle(R.string.mr_chooser_title);
            this.f4571x.setVisibility(8);
            this.f4564q.setVisibility(8);
            this.f4570w.setVisibility(0);
            this.f4568u.setVisibility(8);
            this.f4569v.setVisibility(8);
            this.f4567t.setVisibility(4);
            this.f4565r.setVisibility(0);
            return;
        }
        if (i3 != 3) {
            return;
        }
        setTitle(R.string.mr_chooser_zero_routes_found_title);
        this.f4571x.setVisibility(8);
        this.f4564q.setVisibility(8);
        this.f4570w.setVisibility(8);
        this.f4568u.setVisibility(0);
        this.f4569v.setVisibility(0);
        this.f4567t.setVisibility(0);
        this.f4565r.setVisibility(0);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4556A = true;
        this.f4559l.m3517a(this.f4561n, this.f4560m, 1);
        m2636i();
        HandlerC0881q handlerC0881q = this.f4558C;
        handlerC0881q.removeMessages(2);
        handlerC0881q.removeMessages(3);
        handlerC0881q.removeMessages(1);
        handlerC0881q.sendMessageDelayed(handlerC0881q.obtainMessage(2), 5000L);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x0149  */
    @Override // p091e.AbstractDialogC1460E, androidx.activity.DialogC0901k, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String string;
        boolean z3;
        super.onCreate(bundle);
        setContentView(R.layout.mr_chooser_dialog);
        this.f4562o = new ArrayList();
        this.f4572y = new C1035d(getContext(), this.f4562o);
        this.f4563p = (TextView) findViewById(R.id.mr_chooser_title);
        this.f4564q = (TextView) findViewById(R.id.mr_chooser_searching);
        this.f4565r = (RelativeLayout) findViewById(R.id.mr_chooser_wifi_warning_container);
        this.f4566s = (TextView) findViewById(R.id.mr_chooser_wifi_warning_description);
        this.f4567t = (TextView) findViewById(R.id.mr_chooser_wifi_learn_more);
        this.f4568u = (LinearLayout) findViewById(R.id.mr_chooser_ok_button_container);
        this.f4569v = (Button) findViewById(R.id.mr_chooser_ok_button);
        this.f4570w = (ProgressBar) findViewById(R.id.mr_chooser_search_progress_bar);
        Context context = getContext();
        boolean z4 = false;
        if (AbstractC0610a.f2309g == null) {
            if (AbstractC0610a.m1520w(context)) {
                z3 = false;
            } else {
                PackageManager packageManager = context.getPackageManager();
                if (AbstractC0610a.f2313k == null) {
                    AbstractC0610a.f2313k = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                }
                if (AbstractC0610a.f2313k.booleanValue() || AbstractC0610a.m1515r(context) || AbstractC0610a.m1521x(context)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
            }
            AbstractC0610a.f2309g = Boolean.valueOf(z3);
        }
        if (AbstractC0610a.f2309g.booleanValue()) {
            string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
        } else {
            if (AbstractC0610a.f2311i == null) {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (Build.VERSION.SDK_INT >= 30 && sensorManager != null && sensorManager.getDefaultSensor(36) != null) {
                    z4 = true;
                }
                AbstractC0610a.f2311i = Boolean.valueOf(z4);
            }
            if (AbstractC0610a.f2311i.booleanValue()) {
                string = context.getString(R.string.mr_chooser_wifi_warning_description_phone);
            } else if (AbstractC0610a.m1520w(context) || AbstractC0610a.m1519v(context.getResources())) {
                string = context.getString(R.string.mr_chooser_wifi_warning_description_tablet);
            } else if (AbstractC0610a.m1521x(context)) {
                string = context.getString(R.string.mr_chooser_wifi_warning_description_tv);
            } else {
                PackageManager packageManager2 = context.getPackageManager();
                if (AbstractC0610a.f2313k == null) {
                    AbstractC0610a.f2313k = Boolean.valueOf(packageManager2.hasSystemFeature("android.hardware.type.watch"));
                }
                if (AbstractC0610a.f2313k.booleanValue()) {
                    string = context.getString(R.string.mr_chooser_wifi_warning_description_watch);
                } else {
                    string = AbstractC0610a.m1515r(context) ? context.getString(R.string.mr_chooser_wifi_warning_description_car) : context.getString(R.string.mr_chooser_wifi_warning_description_unknown);
                }
            }
        }
        this.f4566s.setText(string);
        this.f4567t.setMovementMethod(LinkMovementMethod.getInstance());
        this.f4569v.setOnClickListener(new ViewOnClickListenerC1034c(0, this));
        ListView listView = (ListView) findViewById(R.id.mr_chooser_list);
        this.f4571x = listView;
        listView.setAdapter((ListAdapter) this.f4572y);
        this.f4571x.setOnItemClickListener(this.f4572y);
        this.f4571x.setEmptyView(findViewById(android.R.id.empty));
        getWindow().setLayout(AbstractC0664e.m1760z(getContext()), -2);
        getContext().registerReceiver(this.f4573z, new IntentFilter("android.intent.action.SCREEN_OFF"));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f4556A = false;
        this.f4559l.m3518h(this.f4560m);
        HandlerC0881q handlerC0881q = this.f4558C;
        handlerC0881q.removeMessages(1);
        handlerC0881q.removeMessages(2);
        handlerC0881q.removeMessages(3);
        super.onDetachedFromWindow();
    }

    @Override // p091e.AbstractDialogC1460E, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.f4563p.setText(charSequence);
    }

    @Override // p091e.AbstractDialogC1460E, android.app.Dialog
    public final void setTitle(int i3) {
        this.f4563p.setText(i3);
    }
}
