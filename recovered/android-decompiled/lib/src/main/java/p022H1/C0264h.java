package p022H1;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1153A;
import com.google.android.gms.internal.cast.C1166D0;
import com.google.android.gms.internal.cast.EnumC1272e0;
import com.zuxoplayer.app.R;
import java.util.ArrayList;
import java.util.Arrays;
import p003B.AbstractC0084f;
import p009D0.C0106b;
import p016F1.C0185b;
import p016F1.C0186c;
import p019G1.C0226a;
import p019G1.C0227b;
import p019G1.C0229d;
import p019G1.C0231f;
import p019G1.C0247v;
import p028J1.C0296b;
import p046P1.AbstractC0491s;
import p047Q.C0501c;
import p066W1.AbstractC0664e;
import p136q.AbstractC2120c;
import p136q.AbstractC2139v;
import p136q.C2125h;
import p136q.C2127j;

/* JADX INFO: renamed from: H1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0264h {

    /* JADX INFO: renamed from: u */
    public static final C0296b f679u = new C0296b("MediaNotificationProxy", null);

    /* JADX INFO: renamed from: a */
    public final Context f680a;

    /* JADX INFO: renamed from: b */
    public final NotificationManager f681b;

    /* JADX INFO: renamed from: c */
    public final C0231f f682c;

    /* JADX INFO: renamed from: d */
    public final ComponentName f683d;

    /* JADX INFO: renamed from: e */
    public final ComponentName f684e;

    /* JADX INFO: renamed from: f */
    public ArrayList f685f = new ArrayList();

    /* JADX INFO: renamed from: g */
    public int[] f686g;

    /* JADX INFO: renamed from: h */
    public final long f687h;

    /* JADX INFO: renamed from: i */
    public final C0258b f688i;

    /* JADX INFO: renamed from: j */
    public final Resources f689j;

    /* JADX INFO: renamed from: k */
    public C0263g f690k;

    /* JADX INFO: renamed from: l */
    public C0106b f691l;

    /* JADX INFO: renamed from: m */
    public C2125h f692m;

    /* JADX INFO: renamed from: n */
    public C2125h f693n;

    /* JADX INFO: renamed from: o */
    public C2125h f694o;

    /* JADX INFO: renamed from: p */
    public C2125h f695p;

    /* JADX INFO: renamed from: q */
    public C2125h f696q;

    /* JADX INFO: renamed from: r */
    public C2125h f697r;

    /* JADX INFO: renamed from: s */
    public C2125h f698s;

    /* JADX INFO: renamed from: t */
    public C2125h f699t;

    public C0264h(Context context) {
        this.f680a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f681b = notificationManager;
        C0296b c0296b = C0185b.f423k;
        AbstractC0491s.m1210b();
        C0185b c0185b = C0185b.f425m;
        AbstractC0491s.m1213e(c0185b);
        AbstractC0491s.m1210b();
        C0186c c0186c = c0185b.f430e;
        AbstractC0491s.m1213e(c0186c);
        C0226a c0226a = c0186c.f444l;
        AbstractC0491s.m1213e(c0226a);
        C0231f c0231f = c0226a.f529j;
        AbstractC0491s.m1213e(c0231f);
        this.f682c = c0231f;
        c0226a.m715e();
        Resources resources = context.getResources();
        this.f689j = resources;
        this.f683d = new ComponentName(context.getApplicationContext(), c0226a.f526g);
        String str = c0231f.f584j;
        if (TextUtils.isEmpty(str)) {
            this.f684e = null;
        } else {
            this.f684e = new ComponentName(context.getApplicationContext(), str);
        }
        this.f687h = c0231f.f583i;
        int dimensionPixelSize = resources.getDimensionPixelSize(c0231f.f598x);
        this.f688i = new C0258b(context.getApplicationContext(), new C0227b(1, dimensionPixelSize, dimensionPixelSize));
        if (AbstractC0664e.m1720C() && notificationManager != null) {
            NotificationChannel notificationChannelM444d = AbstractC0084f.m444d(context.getResources().getString(R.string.media_notification_channel_name));
            notificationChannelM444d.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannelM444d);
        }
        C1166D0.m3123a(EnumC1272e0.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX INFO: renamed from: a */
    public final C2125h m795a(String str) {
        byte b3;
        int i3;
        int i4;
        PendingIntent broadcast;
        PendingIntent broadcast2;
        int i5;
        int i6;
        switch (str) {
            case "com.google.android.gms.cast.framework.action.REWIND":
                b3 = 4;
                break;
            case "com.google.android.gms.cast.framework.action.SKIP_NEXT":
                b3 = 1;
                break;
            case "com.google.android.gms.cast.framework.action.SKIP_PREV":
                b3 = 2;
                break;
            case "com.google.android.gms.cast.framework.action.STOP_CASTING":
                b3 = 5;
                break;
            case "com.google.android.gms.cast.framework.action.DISCONNECT":
                b3 = 6;
                break;
            case "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK":
                b3 = 0;
                break;
            case "com.google.android.gms.cast.framework.action.FORWARD":
                b3 = 3;
                break;
            default:
                b3 = -1;
                break;
        }
        long j3 = this.f687h;
        Resources resources = this.f689j;
        Context context = this.f680a;
        ComponentName componentName = this.f683d;
        C0231f c0231f = this.f682c;
        switch (b3) {
            case 0:
                C0263g c0263g = this.f690k;
                int i7 = c0263g.f674c;
                if (!c0263g.f673b) {
                    if (this.f692m == null) {
                        Intent intent = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent.setComponent(componentName);
                        PendingIntent broadcast3 = PendingIntent.getBroadcast(context, 0, intent, AbstractC1153A.f5540a);
                        int i8 = c0231f.f588n;
                        String string = resources.getString(c0231f.f568B);
                        IconCompat iconCompatM2362b = i8 == 0 ? null : IconCompat.m2362b(null, "", i8);
                        Bundle bundle = new Bundle();
                        CharSequence charSequenceM4668b = C2127j.m4668b(string);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        this.f692m = new C2125h(iconCompatM2362b, charSequenceM4668b, broadcast3, bundle, arrayList2.isEmpty() ? null : (AbstractC2139v[]) arrayList2.toArray(new AbstractC2139v[arrayList2.size()]), arrayList.isEmpty() ? null : (AbstractC2139v[]) arrayList.toArray(new AbstractC2139v[arrayList.size()]), true, true);
                    }
                    return this.f692m;
                }
                if (this.f693n == null) {
                    if (i7 == 2) {
                        i3 = c0231f.f586l;
                        i4 = c0231f.f600z;
                    } else {
                        i3 = c0231f.f587m;
                        i4 = c0231f.f567A;
                    }
                    Intent intent2 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                    intent2.setComponent(componentName);
                    PendingIntent broadcast4 = PendingIntent.getBroadcast(context, 0, intent2, AbstractC1153A.f5540a);
                    String string2 = resources.getString(i4);
                    IconCompat iconCompatM2362b2 = i3 == 0 ? null : IconCompat.m2362b(null, "", i3);
                    Bundle bundle2 = new Bundle();
                    CharSequence charSequenceM4668b2 = C2127j.m4668b(string2);
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    this.f693n = new C2125h(iconCompatM2362b2, charSequenceM4668b2, broadcast4, bundle2, arrayList4.isEmpty() ? null : (AbstractC2139v[]) arrayList4.toArray(new AbstractC2139v[arrayList4.size()]), arrayList3.isEmpty() ? null : (AbstractC2139v[]) arrayList3.toArray(new AbstractC2139v[arrayList3.size()]), true, true);
                }
                return this.f693n;
            case 1:
                boolean z3 = this.f690k.f677f;
                if (this.f694o == null) {
                    if (z3) {
                        Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                        intent3.setComponent(componentName);
                        broadcast = PendingIntent.getBroadcast(context, 0, intent3, AbstractC1153A.f5540a);
                    } else {
                        broadcast = null;
                    }
                    int i9 = c0231f.f589o;
                    String string3 = resources.getString(c0231f.f569C);
                    IconCompat iconCompatM2362b3 = i9 == 0 ? null : IconCompat.m2362b(null, "", i9);
                    Bundle bundle3 = new Bundle();
                    CharSequence charSequenceM4668b3 = C2127j.m4668b(string3);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    this.f694o = new C2125h(iconCompatM2362b3, charSequenceM4668b3, broadcast, bundle3, arrayList6.isEmpty() ? null : (AbstractC2139v[]) arrayList6.toArray(new AbstractC2139v[arrayList6.size()]), arrayList5.isEmpty() ? null : (AbstractC2139v[]) arrayList5.toArray(new AbstractC2139v[arrayList5.size()]), true, true);
                }
                return this.f694o;
            case 2:
                boolean z4 = this.f690k.f678g;
                if (this.f695p == null) {
                    if (z4) {
                        Intent intent4 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                        intent4.setComponent(componentName);
                        broadcast2 = PendingIntent.getBroadcast(context, 0, intent4, AbstractC1153A.f5540a);
                    } else {
                        broadcast2 = null;
                    }
                    int i10 = c0231f.f590p;
                    String string4 = resources.getString(c0231f.f570D);
                    IconCompat iconCompatM2362b4 = i10 == 0 ? null : IconCompat.m2362b(null, "", i10);
                    Bundle bundle4 = new Bundle();
                    CharSequence charSequenceM4668b4 = C2127j.m4668b(string4);
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    this.f695p = new C2125h(iconCompatM2362b4, charSequenceM4668b4, broadcast2, bundle4, arrayList8.isEmpty() ? null : (AbstractC2139v[]) arrayList8.toArray(new AbstractC2139v[arrayList8.size()]), arrayList7.isEmpty() ? null : (AbstractC2139v[]) arrayList7.toArray(new AbstractC2139v[arrayList7.size()]), true, true);
                }
                return this.f695p;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                if (this.f696q == null) {
                    Intent intent5 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                    intent5.setComponent(componentName);
                    intent5.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j3);
                    PendingIntent broadcast5 = PendingIntent.getBroadcast(context, 0, intent5, AbstractC1153A.f5540a | 134217728);
                    C0296b c0296b = AbstractC0268l.f725a;
                    int i11 = c0231f.f591q;
                    if (j3 == 10000) {
                        i11 = c0231f.f592r;
                    } else if (j3 == 30000) {
                        i11 = c0231f.f593s;
                    }
                    if (j3 == 10000) {
                        i5 = c0231f.f572F;
                    } else {
                        i5 = j3 != 30000 ? c0231f.f571E : c0231f.f573G;
                    }
                    String string5 = resources.getString(i5);
                    IconCompat iconCompatM2362b5 = i11 == 0 ? null : IconCompat.m2362b(null, "", i11);
                    Bundle bundle5 = new Bundle();
                    CharSequence charSequenceM4668b5 = C2127j.m4668b(string5);
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    this.f696q = new C2125h(iconCompatM2362b5, charSequenceM4668b5, broadcast5, bundle5, arrayList10.isEmpty() ? null : (AbstractC2139v[]) arrayList10.toArray(new AbstractC2139v[arrayList10.size()]), arrayList9.isEmpty() ? null : (AbstractC2139v[]) arrayList9.toArray(new AbstractC2139v[arrayList9.size()]), true, true);
                }
                return this.f696q;
            case 4:
                if (this.f697r == null) {
                    Intent intent6 = new Intent(MediaIntentReceiver.ACTION_REWIND);
                    intent6.setComponent(componentName);
                    intent6.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j3);
                    PendingIntent broadcast6 = PendingIntent.getBroadcast(context, 0, intent6, AbstractC1153A.f5540a | 134217728);
                    C0296b c0296b2 = AbstractC0268l.f725a;
                    int i12 = c0231f.f594t;
                    if (j3 == 10000) {
                        i12 = c0231f.f595u;
                    } else if (j3 == 30000) {
                        i12 = c0231f.f596v;
                    }
                    if (j3 == 10000) {
                        i6 = c0231f.f575I;
                    } else {
                        i6 = j3 != 30000 ? c0231f.f574H : c0231f.f576J;
                    }
                    String string6 = resources.getString(i6);
                    IconCompat iconCompatM2362b6 = i12 == 0 ? null : IconCompat.m2362b(null, "", i12);
                    Bundle bundle6 = new Bundle();
                    CharSequence charSequenceM4668b6 = C2127j.m4668b(string6);
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    this.f697r = new C2125h(iconCompatM2362b6, charSequenceM4668b6, broadcast6, bundle6, arrayList12.isEmpty() ? null : (AbstractC2139v[]) arrayList12.toArray(new AbstractC2139v[arrayList12.size()]), arrayList11.isEmpty() ? null : (AbstractC2139v[]) arrayList11.toArray(new AbstractC2139v[arrayList11.size()]), true, true);
                }
                return this.f697r;
            case 5:
                if (this.f699t == null) {
                    Intent intent7 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                    intent7.setComponent(componentName);
                    PendingIntent broadcast7 = PendingIntent.getBroadcast(context, 0, intent7, AbstractC1153A.f5540a);
                    int i13 = c0231f.f597w;
                    String string7 = resources.getString(c0231f.f577K);
                    IconCompat iconCompatM2362b7 = i13 == 0 ? null : IconCompat.m2362b(null, "", i13);
                    Bundle bundle7 = new Bundle();
                    CharSequence charSequenceM4668b7 = C2127j.m4668b(string7);
                    ArrayList arrayList13 = new ArrayList();
                    ArrayList arrayList14 = new ArrayList();
                    this.f699t = new C2125h(iconCompatM2362b7, charSequenceM4668b7, broadcast7, bundle7, arrayList14.isEmpty() ? null : (AbstractC2139v[]) arrayList14.toArray(new AbstractC2139v[arrayList14.size()]), arrayList13.isEmpty() ? null : (AbstractC2139v[]) arrayList13.toArray(new AbstractC2139v[arrayList13.size()]), true, true);
                }
                return this.f699t;
            case 6:
                if (this.f698s == null) {
                    Intent intent8 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                    intent8.setComponent(componentName);
                    PendingIntent broadcast8 = PendingIntent.getBroadcast(context, 0, intent8, AbstractC1153A.f5540a);
                    int i14 = c0231f.f597w;
                    String string8 = resources.getString(c0231f.f577K, "");
                    IconCompat iconCompatM2362b8 = i14 == 0 ? null : IconCompat.m2362b(null, "", i14);
                    Bundle bundle8 = new Bundle();
                    CharSequence charSequenceM4668b8 = C2127j.m4668b(string8);
                    ArrayList arrayList15 = new ArrayList();
                    ArrayList arrayList16 = new ArrayList();
                    this.f698s = new C2125h(iconCompatM2362b8, charSequenceM4668b8, broadcast8, bundle8, arrayList16.isEmpty() ? null : (AbstractC2139v[]) arrayList16.toArray(new AbstractC2139v[arrayList16.size()]), arrayList15.isEmpty() ? null : (AbstractC2139v[]) arrayList15.toArray(new AbstractC2139v[arrayList15.size()]), true, true);
                }
                return this.f698s;
            default:
                C0296b c0296b3 = f679u;
                Log.e(c0296b3.f788a, c0296b3.m833d("Action: %s is not a pre-defined action.", str));
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m796b() {
        IconCompat iconCompat;
        PendingIntent activities;
        C2125h c2125hM795a;
        int i3 = 0;
        NotificationManager notificationManager = this.f681b;
        if (notificationManager == null || this.f690k == null) {
            return;
        }
        C0106b c0106b = this.f691l;
        Bitmap bitmapCreateScaledBitmap = c0106b == null ? null : (Bitmap) c0106b.f141i;
        Context context = this.f680a;
        C2127j c2127j = new C2127j(context, "cast_media_notification");
        Notification notification = c2127j.f9200q;
        if (bitmapCreateScaledBitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = c2127j.f9184a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmapCreateScaledBitmap.getWidth() > dimensionPixelSize || bitmapCreateScaledBitmap.getHeight() > dimensionPixelSize2) {
                    double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmapCreateScaledBitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmapCreateScaledBitmap.getHeight())));
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, (int) Math.ceil(((double) bitmapCreateScaledBitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmapCreateScaledBitmap.getHeight()) * dMin), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f3951k;
            bitmapCreateScaledBitmap.getClass();
            iconCompat = new IconCompat(1);
            iconCompat.f3953b = bitmapCreateScaledBitmap;
        }
        c2127j.f9191h = iconCompat;
        C0231f c0231f = this.f682c;
        notification.icon = c0231f.f585k;
        c2127j.f9188e = C2127j.m4668b(this.f690k.f675d);
        c2127j.f9189f = C2127j.m4668b(this.f689j.getString(c0231f.f599y, this.f690k.f676e));
        notification.flags |= 2;
        c2127j.f9193j = false;
        c2127j.f9197n = 1;
        ComponentName componentName = this.f684e;
        if (componentName == null) {
            activities = null;
        } else {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", componentName);
            intent.setAction(componentName.flattenToString());
            intent.setComponent(componentName);
            ArrayList arrayList = new ArrayList();
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(context.getPackageManager());
            }
            if (component != null) {
                int size = arrayList.size();
                try {
                    for (Intent intentM4656a = AbstractC2120c.m4656a(context, component); intentM4656a != null; intentM4656a = AbstractC2120c.m4656a(context, intentM4656a.getComponent())) {
                        arrayList.add(size, intentM4656a);
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e3);
                }
            }
            arrayList.add(intent);
            int i4 = AbstractC1153A.f5540a | 134217728;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            activities = PendingIntent.getActivities(context, 1, intentArr, i4, null);
        }
        if (activities != null) {
            c2127j.f9190g = activities;
        }
        C0247v c0247v = c0231f.f578L;
        C0296b c0296b = f679u;
        if (c0247v != null) {
            c0296b.m831b("actionsProvider != null", new Object[0]);
            int[] iArrM815b = AbstractC0268l.m815b(c0247v);
            this.f686g = iArrM815b == null ? null : (int[]) iArrM815b.clone();
            ArrayList arrayListM814a = AbstractC0268l.m814a(c0247v);
            this.f685f = new ArrayList();
            if (arrayListM814a != null) {
                int size2 = arrayListM814a.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj = arrayListM814a.get(i5);
                    i5++;
                    C0229d c0229d = (C0229d) obj;
                    String str = c0229d.f548g;
                    boolean zEquals = str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                    String str2 = c0229d.f548g;
                    if (zEquals || str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || str.equals(MediaIntentReceiver.ACTION_FORWARD) || str.equals(MediaIntentReceiver.ACTION_REWIND) || str.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        c2125hM795a = m795a(str2);
                    } else {
                        Intent intent2 = new Intent(str2);
                        intent2.setComponent(this.f683d);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent2, AbstractC1153A.f5540a);
                        int i6 = c0229d.f549h;
                        IconCompat iconCompatM2362b = i6 == 0 ? null : IconCompat.m2362b(null, "", i6);
                        Bundle bundle = new Bundle();
                        CharSequence charSequenceM4668b = C2127j.m4668b(c0229d.f550i);
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        c2125hM795a = new C2125h(iconCompatM2362b, charSequenceM4668b, broadcast, bundle, arrayList3.isEmpty() ? null : (AbstractC2139v[]) arrayList3.toArray(new AbstractC2139v[arrayList3.size()]), arrayList2.isEmpty() ? null : (AbstractC2139v[]) arrayList2.toArray(new AbstractC2139v[arrayList2.size()]), true, true);
                    }
                    if (c2125hM795a != null) {
                        this.f685f.add(c2125hM795a);
                    }
                }
            }
        } else {
            c0296b.m831b("actionsProvider == null", new Object[0]);
            this.f685f = new ArrayList();
            ArrayList arrayList4 = c0231f.f581g;
            int size3 = arrayList4.size();
            int i7 = 0;
            while (i7 < size3) {
                Object obj2 = arrayList4.get(i7);
                i7++;
                C2125h c2125hM795a2 = m795a((String) obj2);
                if (c2125hM795a2 != null) {
                    this.f685f.add(c2125hM795a2);
                }
            }
            int[] iArr = c0231f.f582h;
            this.f686g = (int[]) Arrays.copyOf(iArr, iArr.length).clone();
        }
        ArrayList arrayList5 = this.f685f;
        int size4 = arrayList5.size();
        while (i3 < size4) {
            Object obj3 = arrayList5.get(i3);
            i3++;
            C2125h c2125h = (C2125h) obj3;
            if (c2125h != null) {
                c2127j.f9185b.add(c2125h);
            }
        }
        C0501c c0501c = new C0501c();
        c0501c.f1656b = null;
        int[] iArr2 = this.f686g;
        if (iArr2 != null) {
            c0501c.f1656b = iArr2;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = this.f690k.f672a;
        if (mediaSessionCompat$Token != null) {
            c0501c.f1657c = mediaSessionCompat$Token;
        }
        c2127j.m4670c(c0501c);
        notificationManager.notify("castMediaNotification", 1, c2127j.m4669a());
    }
}
