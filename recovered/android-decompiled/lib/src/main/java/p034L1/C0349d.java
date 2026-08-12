package p034L1;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import androidx.fragment.app.C0938D;
import androidx.fragment.app.C0950a;
import androidx.fragment.app.C0965p;
import com.google.android.gms.common.api.GoogleApiActivity;
import p003B.AbstractC0084f;
import p040N1.InterfaceC0426g;
import p045P0.AbstractC0462h;
import p046P1.AbstractC0484l;
import p046P1.AbstractC0491s;
import p046P1.DialogInterfaceOnClickListenerC0485m;
import p060U1.AbstractC0610a;
import p066W1.AbstractC0664e;
import p091e.AbstractActivityC1479j;
import p136q.C2125h;
import p136q.C2126i;
import p136q.C2127j;

/* JADX INFO: renamed from: L1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0349d extends C0350e {

    /* JADX INFO: renamed from: c */
    public static final Object f1131c = new Object();

    /* JADX INFO: renamed from: d */
    public static final C0349d f1132d = new C0349d();

    /* JADX INFO: renamed from: d */
    public static AlertDialog m952d(Activity activity, int i3, DialogInterfaceOnClickListenerC0485m dialogInterfaceOnClickListenerC0485m, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i3 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(AbstractC0484l.m1199b(activity, i3));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i3 == 1) {
            string = resources.getString(com.zuxoplayer.app.R.string.common_google_play_services_install_button);
        } else if (i3 != 2) {
            string = i3 != 3 ? resources.getString(R.string.ok) : resources.getString(com.zuxoplayer.app.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(com.zuxoplayer.app.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, dialogInterfaceOnClickListenerC0485m);
        }
        String strM1200c = AbstractC0484l.m1200c(activity, i3);
        if (strM1200c != null) {
            builder.setTitle(strM1200c);
        }
        Log.w("GoogleApiAvailability", AbstractC0462h.m1165e(i3, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX INFO: renamed from: e */
    public static void m953e(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof AbstractActivityC1479j) {
                C0965p c0965p = (C0965p) ((AbstractActivityC1479j) activity).f6611x.f38h;
                C0353h c0353h = new C0353h();
                AbstractC0491s.m1214f(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                c0353h.f1141l0 = alertDialog;
                if (onCancelListener != null) {
                    c0353h.f1142m0 = onCancelListener;
                }
                c0353h.f4189i0 = false;
                c0353h.f4190j0 = true;
                C0938D c0938d = c0965p.f4251x;
                c0938d.getClass();
                C0950a c0950a = new C0950a(c0938d);
                c0950a.f4148o = true;
                c0950a.m2511e(0, c0353h, str);
                c0950a.m2510d(false);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        DialogFragmentC0347b dialogFragmentC0347b = new DialogFragmentC0347b();
        AbstractC0491s.m1214f(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragmentC0347b.f1125g = alertDialog;
        if (onCancelListener != null) {
            dialogFragmentC0347b.f1126h = onCancelListener;
        }
        dialogFragmentC0347b.show(fragmentManager, str);
    }

    /* JADX INFO: renamed from: c */
    public final void m954c(GoogleApiActivity googleApiActivity, int i3, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogM952d = m952d(googleApiActivity, i3, new DialogInterfaceOnClickListenerC0485m(super.m957a(i3, googleApiActivity, "d"), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogM952d == null) {
            return;
        }
        m953e(googleApiActivity, alertDialogM952d, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    /* JADX INFO: renamed from: f */
    public final void m955f(Context context, int i3, PendingIntent pendingIntent) {
        int i4;
        Log.w("GoogleApiAvailability", "GMS core API Availability. ConnectionResult=" + i3 + ", tag=null", new IllegalArgumentException());
        if (i3 == 18) {
            new HandlerC0354i(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i3 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strM1202e = i3 == 6 ? AbstractC0484l.m1202e(context, "common_google_play_services_resolution_required_title") : AbstractC0484l.m1200c(context, i3);
        if (strM1202e == null) {
            strM1202e = context.getResources().getString(com.zuxoplayer.app.R.string.common_google_play_services_notification_ticker);
        }
        String strM1201d = (i3 == 6 || i3 == 19) ? AbstractC0484l.m1201d(context, "common_google_play_services_resolution_required_text", AbstractC0484l.m1198a(context)) : AbstractC0484l.m1199b(context, i3);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        AbstractC0491s.m1213e(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        C2127j c2127j = new C2127j(context, null);
        c2127j.f9195l = true;
        c2127j.f9200q.flags |= 16;
        c2127j.f9188e = C2127j.m4668b(strM1202e);
        C2126i c2126i = new C2126i();
        c2126i.f9183b = C2127j.m4668b(strM1201d);
        c2127j.m4670c(c2126i);
        PackageManager packageManager = context.getPackageManager();
        if (AbstractC0610a.f2305c == null) {
            AbstractC0610a.f2305c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (AbstractC0610a.f2305c.booleanValue()) {
            c2127j.f9200q.icon = context.getApplicationInfo().icon;
            c2127j.f9192i = 2;
            if (AbstractC0610a.m1522y(context)) {
                c2127j.f9185b.add(new C2125h(IconCompat.m2362b(null, "", 2131230863), resources.getString(com.zuxoplayer.app.R.string.common_open_on_phone), pendingIntent, new Bundle(), null, null, true, true));
            } else {
                c2127j.f9190g = pendingIntent;
            }
        } else {
            c2127j.f9200q.icon = R.drawable.stat_sys_warning;
            c2127j.f9200q.tickerText = C2127j.m4668b(resources.getString(com.zuxoplayer.app.R.string.common_google_play_services_notification_ticker));
            c2127j.f9200q.when = System.currentTimeMillis();
            c2127j.f9190g = pendingIntent;
            c2127j.f9189f = C2127j.m4668b(strM1201d);
        }
        if (AbstractC0664e.m1720C()) {
            if (!AbstractC0664e.m1720C()) {
                throw new IllegalStateException();
            }
            synchronized (f1131c) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(com.zuxoplayer.app.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(AbstractC0084f.m439A(string));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            c2127j.f9198o = "com.google.android.gms.availability";
        }
        Notification notificationM4669a = c2127j.m4669a();
        if (i3 == 1 || i3 == 2 || i3 == 3) {
            AbstractC0351f.f1135a.set(false);
            i4 = 10436;
        } else {
            i4 = 39789;
        }
        notificationManager.notify(i4, notificationM4669a);
    }

    /* JADX INFO: renamed from: g */
    public final void m956g(Activity activity, InterfaceC0426g interfaceC0426g, int i3, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogM952d = m952d(activity, i3, new DialogInterfaceOnClickListenerC0485m(super.m957a(i3, activity, "d"), interfaceC0426g, 1), onCancelListener);
        if (alertDialogM952d == null) {
            return;
        }
        m953e(activity, alertDialogM952d, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}
