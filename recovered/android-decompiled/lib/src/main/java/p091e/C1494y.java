package p091e;

import android.content.Context;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.os.PowerManager;
import android.support.v4.media.session.C0858A;
import android.util.Log;
import java.util.Calendar;
import p060U1.AbstractC0610a;

/* JADX INFO: renamed from: e.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1494y extends AbstractC1495z {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f6640c = 0;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LayoutInflaterFactory2C1458C f6641d;

    /* JADX INFO: renamed from: e */
    public final Object f6642e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1494y(LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C, C0858A c0858a) {
        super(layoutInflaterFactory2C1458C);
        this.f6641d = layoutInflaterFactory2C1458C;
        this.f6642e = c0858a;
    }

    @Override // p091e.AbstractC1495z
    /* JADX INFO: renamed from: d */
    public final IntentFilter mo3734d() {
        switch (this.f6640c) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    @Override // p091e.AbstractC1495z
    /* JADX INFO: renamed from: e */
    public final int mo3735e() {
        Location location;
        boolean z3;
        long j3;
        Location lastKnownLocation;
        switch (this.f6640c) {
            case 0:
                return AbstractC1490u.m3720a((PowerManager) this.f6642e) ? 2 : 1;
            default:
                C0858A c0858a = (C0858A) this.f6642e;
                C1466K c1466k = (C1466K) c0858a.f3641j;
                if (c1466k.f6518b <= System.currentTimeMillis()) {
                    Context context = (Context) c0858a.f3639h;
                    int iM1503e = AbstractC0610a.m1503e(context, "android.permission.ACCESS_COARSE_LOCATION");
                    Location lastKnownLocation2 = null;
                    LocationManager locationManager = (LocationManager) c0858a.f3640i;
                    if (iM1503e == 0) {
                        try {
                            lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                        } catch (Exception e3) {
                            Log.d("TwilightManager", "Failed to get last known location", e3);
                        }
                        location = lastKnownLocation;
                    } else {
                        location = null;
                    }
                    if (AbstractC0610a.m1503e(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        try {
                            if (locationManager.isProviderEnabled("gps")) {
                                lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                            }
                        } catch (Exception e4) {
                            Log.d("TwilightManager", "Failed to get last known location", e4);
                        }
                    }
                    if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                        location = lastKnownLocation2;
                    }
                    z3 = false;
                    if (location != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (C1465J.f6513d == null) {
                            C1465J.f6513d = new C1465J();
                        }
                        C1465J c1465j = C1465J.f6513d;
                        c1465j.m3679a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
                        c1465j.m3679a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        z3 = c1465j.f6516c == 1;
                        long j4 = c1465j.f6515b;
                        long j5 = c1465j.f6514a;
                        c1465j.m3679a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
                        long j6 = c1465j.f6515b;
                        if (j4 == -1 || j5 == -1) {
                            j3 = jCurrentTimeMillis + 43200000;
                        } else {
                            if (jCurrentTimeMillis <= j5) {
                                j6 = jCurrentTimeMillis > j4 ? j5 : j4;
                            }
                            j3 = j6 + 60000;
                        }
                        c1466k.f6517a = z3;
                        c1466k.f6518b = j3;
                    } else {
                        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                        int i3 = Calendar.getInstance().get(11);
                        if (i3 < 6 || i3 >= 22) {
                            z3 = true;
                        }
                    }
                    break;
                } else {
                    z3 = c1466k.f6517a;
                }
                return z3 ? 2 : 1;
        }
    }

    @Override // p091e.AbstractC1495z
    /* JADX INFO: renamed from: g */
    public final void mo3736g() throws IllegalAccessException {
        switch (this.f6640c) {
            case 0:
                this.f6641d.m3663m(true, true);
                break;
            default:
                this.f6641d.m3663m(true, true);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1494y(LayoutInflaterFactory2C1458C layoutInflaterFactory2C1458C, Context context) {
        super(layoutInflaterFactory2C1458C);
        this.f6641d = layoutInflaterFactory2C1458C;
        this.f6642e = (PowerManager) context.getApplicationContext().getSystemService("power");
    }
}
