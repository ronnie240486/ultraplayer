package androidx.mediarouter.app;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.media.session.HandlerC0881q;
import android.view.ContextThemeWrapper;
import android.widget.ImageButton;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.R;
import java.util.ArrayList;
import java.util.Collections;
import p019G1.AbstractC0230e;
import p066W1.AbstractC0664e;
import p089d1.C1403C;
import p089d1.C1405E;
import p089d1.C1451x;
import p091e.AbstractDialogC1460E;

/* JADX INFO: renamed from: androidx.mediarouter.app.B */
/* JADX INFO: loaded from: classes.dex */
public final class DialogC1015B extends AbstractDialogC1460E {

    /* JADX INFO: renamed from: l */
    public final C1405E f4399l;

    /* JADX INFO: renamed from: m */
    public final C1020G f4400m;

    /* JADX INFO: renamed from: n */
    public final Context f4401n;

    /* JADX INFO: renamed from: o */
    public C1451x f4402o;

    /* JADX INFO: renamed from: p */
    public ArrayList f4403p;

    /* JADX INFO: renamed from: q */
    public C1014A f4404q;

    /* JADX INFO: renamed from: r */
    public RecyclerView f4405r;

    /* JADX INFO: renamed from: s */
    public boolean f4406s;

    /* JADX INFO: renamed from: t */
    public C1403C f4407t;

    /* JADX INFO: renamed from: u */
    public final long f4408u;

    /* JADX INFO: renamed from: v */
    public long f4409v;

    /* JADX INFO: renamed from: w */
    public final HandlerC0881q f4410w;

    /* JADX WARN: Illegal instructions before constructor call */
    public DialogC1015B(Context context) {
        ContextThemeWrapper contextThemeWrapperM3316i = AbstractC1303m.m3316i(context, false);
        int iM3328u = AbstractC1303m.m3328u(contextThemeWrapperM3316i, R.attr.mediaRouteTheme);
        super(contextThemeWrapperM3316i, iM3328u == 0 ? AbstractC1303m.m3324q(contextThemeWrapperM3316i) : iM3328u);
        this.f4402o = C1451x.f6416c;
        this.f4410w = new HandlerC0881q(2, this);
        Context context2 = getContext();
        this.f4399l = C1405E.m3512d(context2);
        this.f4400m = new C1020G(this, 4);
        this.f4401n = context2;
        this.f4408u = context2.getResources().getInteger(R.integer.mr_update_routes_delay_ms);
    }

    /* JADX INFO: renamed from: h */
    public final void m2596h() {
        if (this.f4407t == null && this.f4406s) {
            this.f4399l.getClass();
            C1405E.m3510b();
            ArrayList arrayList = new ArrayList(C1405E.m3511c().f6339j);
            int size = arrayList.size();
            while (true) {
                int i3 = size - 1;
                if (size <= 0) {
                    break;
                }
                C1403C c1403c = (C1403C) arrayList.get(i3);
                if (c1403c.m3494d() || !c1403c.f6222g || !c1403c.m3498h(this.f4402o)) {
                    arrayList.remove(i3);
                }
                size = i3;
            }
            Collections.sort(arrayList, C1036e.f4553i);
            long jUptimeMillis = SystemClock.uptimeMillis() - this.f4409v;
            long j3 = this.f4408u;
            if (jUptimeMillis < j3) {
                HandlerC0881q handlerC0881q = this.f4410w;
                handlerC0881q.removeMessages(1);
                handlerC0881q.sendMessageAtTime(handlerC0881q.obtainMessage(1, arrayList), this.f4409v + j3);
            } else {
                this.f4409v = SystemClock.uptimeMillis();
                this.f4403p.clear();
                this.f4403p.addAll(arrayList);
                this.f4404q.m2595f();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2597i(C1451x c1451x) {
        if (c1451x == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (this.f4402o.equals(c1451x)) {
            return;
        }
        this.f4402o = c1451x;
        if (this.f4406s) {
            C1405E c1405e = this.f4399l;
            C1020G c1020g = this.f4400m;
            c1405e.m3518h(c1020g);
            c1405e.m3517a(c1451x, c1020g, 1);
        }
        m2596h();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4406s = true;
        this.f4399l.m3517a(this.f4402o, this.f4400m, 1);
        m2596h();
    }

    @Override // p091e.AbstractDialogC1460E, androidx.activity.DialogC0901k, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_picker_dialog);
        Context context = this.f4401n;
        getWindow().getDecorView().setBackgroundColor(AbstractC0230e.m739q(context, AbstractC1303m.m3330w(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        this.f4403p = new ArrayList();
        ((ImageButton) findViewById(R.id.mr_picker_close_button)).setOnClickListener(new ViewOnClickListenerC1018E(2, this));
        this.f4404q = new C1014A(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_picker_list);
        this.f4405r = recyclerView;
        recyclerView.setAdapter(this.f4404q);
        this.f4405r.setLayoutManager(new LinearLayoutManager());
        Context context2 = this.f4401n;
        getWindow().setLayout(!context2.getResources().getBoolean(R.bool.is_tablet) ? -1 : AbstractC0664e.m1760z(context2), context2.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4406s = false;
        this.f4399l.m3518h(this.f4400m);
        this.f4410w.removeMessages(1);
    }
}
