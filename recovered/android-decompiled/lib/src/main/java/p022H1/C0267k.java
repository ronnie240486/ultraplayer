package p022H1;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.AbstractC0859B;
import android.support.v4.media.session.AbstractC0861D;
import android.support.v4.media.session.C0858A;
import android.support.v4.media.session.C0862E;
import android.support.v4.media.session.C0872h;
import android.support.v4.media.session.C0885u;
import android.support.v4.media.session.InterfaceC0866b;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.internal.cast.AbstractC1153A;
import com.google.android.gms.internal.cast.BinderC1319q;
import com.zuxoplayer.app.R;
import java.util.ArrayList;
import p000A.C0031d;
import p009D0.C0106b;
import p013E1.C0137l;
import p013E1.C0140o;
import p013E1.C0142q;
import p014F.RunnableC0153b;
import p016F1.C0181G;
import p016F1.C0185b;
import p016F1.C0186c;
import p016F1.C0192i;
import p019G1.AbstractC0230e;
import p019G1.C0226a;
import p019G1.C0229d;
import p019G1.C0231f;
import p019G1.C0233h;
import p019G1.C0247v;
import p028J1.AbstractC0295a;
import p028J1.C0296b;
import p043O1.C0448a;
import p045P0.AbstractC0462h;
import p046P1.AbstractC0491s;
import p075Z1.HandlerC0784e;
import p124n.C2018e;

/* JADX INFO: renamed from: H1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0267k {

    /* JADX INFO: renamed from: v */
    public static final C0296b f703v = new C0296b("MediaSessionManager", null);

    /* JADX INFO: renamed from: a */
    public final Context f704a;

    /* JADX INFO: renamed from: b */
    public final C0186c f705b;

    /* JADX INFO: renamed from: c */
    public final BinderC1319q f706c;

    /* JADX INFO: renamed from: d */
    public final C0192i f707d;

    /* JADX INFO: renamed from: e */
    public final C0231f f708e;

    /* JADX INFO: renamed from: f */
    public final ComponentName f709f;

    /* JADX INFO: renamed from: g */
    public final ComponentName f710g;

    /* JADX INFO: renamed from: h */
    public final C0258b f711h;

    /* JADX INFO: renamed from: i */
    public final C0258b f712i;

    /* JADX INFO: renamed from: j */
    public final C0264h f713j;

    /* JADX INFO: renamed from: k */
    public final HandlerC0784e f714k;

    /* JADX INFO: renamed from: l */
    public final RunnableC0153b f715l;

    /* JADX INFO: renamed from: m */
    public final C0181G f716m;

    /* JADX INFO: renamed from: n */
    public C0233h f717n;

    /* JADX INFO: renamed from: o */
    public CastDevice f718o;

    /* JADX INFO: renamed from: p */
    public C0858A f719p;

    /* JADX INFO: renamed from: q */
    public boolean f720q;

    /* JADX INFO: renamed from: r */
    public PlaybackStateCompat.CustomAction f721r;

    /* JADX INFO: renamed from: s */
    public PlaybackStateCompat.CustomAction f722s;

    /* JADX INFO: renamed from: t */
    public PlaybackStateCompat.CustomAction f723t;

    /* JADX INFO: renamed from: u */
    public PlaybackStateCompat.CustomAction f724u;

    public C0267k(Context context, C0186c c0186c, BinderC1319q binderC1319q) {
        C0192i c0192i;
        C0231f c0231f;
        this.f704a = context;
        this.f705b = c0186c;
        this.f706c = binderC1319q;
        C0296b c0296b = C0185b.f423k;
        AbstractC0491s.m1210b();
        C0185b c0185b = C0185b.f425m;
        C0264h c0264h = null;
        if (c0185b != null) {
            AbstractC0491s.m1210b();
            c0192i = c0185b.f428c;
        } else {
            c0192i = null;
        }
        this.f707d = c0192i;
        C0226a c0226a = c0186c.f444l;
        this.f708e = c0226a == null ? null : c0226a.f529j;
        this.f716m = new C0181G(2, this);
        String str = c0226a == null ? null : c0226a.f527h;
        this.f709f = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        String str2 = c0226a == null ? null : c0226a.f526g;
        this.f710g = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : null;
        C0258b c0258b = new C0258b(context);
        this.f711h = c0258b;
        c0258b.f667l = new C0265i(this, 0);
        C0258b c0258b2 = new C0258b(context);
        this.f712i = c0258b2;
        c0258b2.f667l = new C0265i(this, 1);
        this.f714k = new HandlerC0784e(Looper.getMainLooper(), 3);
        C0296b c0296b2 = C0264h.f679u;
        C0226a c0226a2 = c0186c.f444l;
        if (c0226a2 != null && (c0231f = c0226a2.f529j) != null) {
            C0247v c0247v = c0231f.f578L;
            if (c0247v == null) {
                c0264h = new C0264h(context);
            } else {
                ArrayList arrayListM814a = AbstractC0268l.m814a(c0247v);
                int[] iArrM815b = AbstractC0268l.m815b(c0247v);
                int size = arrayListM814a == null ? 0 : arrayListM814a.size();
                C0296b c0296b3 = C0264h.f679u;
                if (arrayListM814a == null || arrayListM814a.isEmpty()) {
                    Log.e(c0296b3.f788a, c0296b3.m833d(AbstractC0230e.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                } else if (arrayListM814a.size() > 5) {
                    Log.e(c0296b3.f788a, c0296b3.m833d(AbstractC0230e.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                } else if (iArrM815b == null || (iArrM815b.length) == 0) {
                    Log.e(c0296b3.f788a, c0296b3.m833d(AbstractC0230e.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                } else {
                    for (int i3 : iArrM815b) {
                        if (i3 < 0 || i3 >= size) {
                            Log.e(c0296b3.f788a, c0296b3.m833d(AbstractC0230e.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                        }
                    }
                    c0264h = new C0264h(context);
                }
            }
        }
        this.f713j = c0264h;
        this.f715l = new RunnableC0153b(1, this);
    }

    /* JADX INFO: renamed from: a */
    public final void m804a(C0233h c0233h, CastDevice castDevice) {
        ComponentName componentName;
        C0186c c0186c = this.f705b;
        C0226a c0226a = c0186c == null ? null : c0186c.f444l;
        if (this.f720q || c0186c == null || c0226a == null || this.f708e == null || c0233h == null || castDevice == null || (componentName = this.f710g) == null) {
            f703v.m831b("skip attaching media session", new Object[0]);
            return;
        }
        this.f717n = c0233h;
        c0233h.m765o(this.f716m);
        this.f718o = castDevice;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        int i3 = AbstractC1153A.f5540a;
        Context context = this.f704a;
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, i3);
        if (c0226a.f531l) {
            C0858A c0858a = new C0858A(context, componentName, broadcast);
            this.f719p = c0858a;
            m813j(0, null);
            CastDevice castDevice2 = this.f718o;
            if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.f5422j)) {
                Bundle bundle = new Bundle();
                String string = context.getResources().getString(R.string.cast_casting_to_device, this.f718o.f5422j);
                C2018e c2018e = MediaMetadataCompat.f3627j;
                if (c2018e.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) c2018e.getOrDefault("android.media.metadata.ALBUM_ARTIST", null)).intValue() != 1) {
                    throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                }
                bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                c0858a.m2174W(new MediaMetadataCompat(bundle));
            }
            c0858a.m2173V(new C0266j(this), null);
            c0858a.m2172U(true);
            this.f706c.m3348v0(c0858a);
        }
        this.f720q = true;
        m805b();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0097  */
    /* JADX INFO: renamed from: b */
    public final void m805b() {
        MediaInfo mediaInfoM753c;
        C0137l c0137l;
        boolean z3;
        boolean z4;
        C0140o c0140oM752b;
        MediaInfo mediaInfo;
        C0233h c0233h = this.f717n;
        if (c0233h == null) {
            return;
        }
        int iM767q = c0233h.m767q();
        MediaInfo mediaInfoM753c2 = c0233h.m753c();
        if (c0233h.m760j() && (c0140oM752b = c0233h.m752b()) != null && (mediaInfo = c0140oM752b.f290g) != null) {
            mediaInfoM753c2 = mediaInfo;
        }
        m813j(iM767q, mediaInfoM753c2);
        if (!c0233h.m757g()) {
            m811h();
            m812i();
            return;
        }
        if (iM767q != 0) {
            C0264h c0264h = this.f713j;
            if (c0264h != null) {
                f703v.m831b("Update media notification.", new Object[0]);
                CastDevice castDevice = this.f718o;
                C0233h c0233h2 = this.f717n;
                C0858A c0858a = this.f719p;
                if (castDevice != null && c0233h2 != null && c0858a != null && (mediaInfoM753c = c0233h2.m753c()) != null && (c0137l = mediaInfoM753c.f5447j) != null) {
                    C0142q c0142qM754d = c0233h2.m754d();
                    if (c0142qM754d == null) {
                        z3 = false;
                        z4 = false;
                    } else {
                        int i3 = c0142qM754d.f319v;
                        if (i3 == 1 || i3 == 2 || i3 == 3) {
                            z3 = true;
                            z4 = true;
                        } else {
                            Integer num = (Integer) c0142qM754d.f303D.get(c0142qM754d.f306i);
                            if (num != null) {
                                boolean z5 = num.intValue() > 0;
                                if (num.intValue() < c0142qM754d.f320w.size() - 1) {
                                    z4 = z5;
                                    z3 = true;
                                } else {
                                    z4 = z5;
                                    z3 = false;
                                }
                            } else {
                                z3 = false;
                                z4 = false;
                            }
                        }
                    }
                    boolean z6 = c0233h2.m755e() == 2;
                    String strM591e = c0137l.m591e("com.google.android.gms.cast.metadata.TITLE");
                    MediaSessionCompat$Token mediaSessionCompat$Token = ((C0885u) c0858a.f3639h).f3704c;
                    int i4 = mediaInfoM753c.f5445h;
                    String str = castDevice.f5422j;
                    C0263g c0263g = new C0263g(z6, i4, strM591e, str, mediaSessionCompat$Token, z3, z4);
                    boolean z7 = z3;
                    boolean z8 = z4;
                    C0263g c0263g2 = c0264h.f690k;
                    if (c0263g2 == null || z6 != c0263g2.f673b || i4 != c0263g2.f674c || !AbstractC0295a.m828e(strM591e, c0263g2.f675d) || !AbstractC0295a.m828e(str, c0263g2.f676e) || z7 != c0263g2.f677f || z8 != c0263g2.f678g) {
                        c0264h.f690k = c0263g;
                        c0264h.m796b();
                    }
                    ArrayList arrayList = c0137l.f272g;
                    C0106b c0106b = new C0106b((arrayList == null || arrayList.isEmpty()) ? null : (C0448a) arrayList.get(0));
                    C0106b c0106b2 = c0264h.f691l;
                    Uri uri = (Uri) c0106b.f140h;
                    if (c0106b2 == null || !AbstractC0295a.m828e(uri, (Uri) c0106b2.f140h)) {
                        C0106b c0106b3 = new C0106b((Object) c0264h, (Object) c0106b, 2, false);
                        C0258b c0258b = c0264h.f688i;
                        c0258b.f667l = c0106b3;
                        c0258b.m790o(uri);
                    }
                }
            }
            if (c0233h.m760j()) {
                return;
            }
            m810g(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX INFO: renamed from: c */
    public final long m806c(String str, int i3, Bundle bundle) {
        byte b3;
        long j3;
        int iHashCode = str.hashCode();
        if (iHashCode != -945151566) {
            if (iHashCode != -945080078) {
                if (iHashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    b3 = 0;
                } else {
                    b3 = -1;
                }
            } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                b3 = 1;
            } else {
                b3 = -1;
            }
        } else if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
            b3 = 2;
        } else {
            b3 = -1;
        }
        if (b3 == 0) {
            if (i3 == 3) {
                j3 = 514;
                i3 = 3;
            } else {
                j3 = 512;
            }
            if (i3 != 2) {
                return j3;
            }
            return 516L;
        }
        if (b3 == 1) {
            C0233h c0233h = this.f717n;
            if (c0233h != null && c0233h.m757g()) {
                C0142q c0142qM754d = c0233h.m754d();
                AbstractC0491s.m1213e(c0142qM754d);
                if ((c0142qM754d.f311n & 128) != 0 || c0142qM754d.f319v != 0) {
                    return 16L;
                }
                Integer num = (Integer) c0142qM754d.f303D.get(c0142qM754d.f306i);
                if (num != null && num.intValue() > 0) {
                    return 16L;
                }
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            return 0L;
        }
        if (b3 != 2) {
            return 0L;
        }
        C0233h c0233h2 = this.f717n;
        if (c0233h2 != null && c0233h2.m757g()) {
            C0142q c0142qM754d2 = c0233h2.m754d();
            AbstractC0491s.m1213e(c0142qM754d2);
            if ((c0142qM754d2.f311n & 64) != 0 || c0142qM754d2.f319v != 0) {
                return 32L;
            }
            Integer num2 = (Integer) c0142qM754d2.f303D.get(c0142qM754d2.f306i);
            if (num2 != null && num2.intValue() < c0142qM754d2.f320w.size() - 1) {
                return 32L;
            }
        }
        bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public final Uri m807d(C0137l c0137l) {
        C0226a c0226a = this.f705b.f444l;
        if (c0226a != null) {
            c0226a.m715e();
        }
        ArrayList arrayList = c0137l.f272g;
        C0448a c0448a = arrayList != null && !arrayList.isEmpty() ? (C0448a) c0137l.f272g.get(0) : null;
        if (c0448a == null) {
            return null;
        }
        return c0448a.f1511h;
    }

    /* JADX INFO: renamed from: e */
    public final void m808e(Bitmap bitmap, int i3) {
        MediaMetadata metadata;
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
        C0858A c0858a = this.f719p;
        if (c0858a == null) {
            return;
        }
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        C0858A c0858a2 = this.f719p;
        if (c0858a2 == null || (metadata = ((C0872h) ((C0106b) c0858a2.f3640i).f140h).f3686a.getMetadata()) == null) {
            mediaMetadataCompatCreateFromParcel = null;
        } else {
            C2018e c2018e = MediaMetadataCompat.f3627j;
            Parcel parcelObtain = Parcel.obtain();
            metadata.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            mediaMetadataCompatCreateFromParcel.f3632h = metadata;
        }
        C0031d c0031d = mediaMetadataCompatCreateFromParcel == null ? new C0031d(21) : new C0031d(mediaMetadataCompatCreateFromParcel);
        String str = i3 == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART";
        C2018e c2018e2 = MediaMetadataCompat.f3627j;
        if (c2018e2.containsKey(str) && ((Integer) c2018e2.getOrDefault(str, null)).intValue() != 2) {
            throw new IllegalArgumentException(AbstractC0462h.m1166f("The ", str, " key cannot be used to put a Bitmap"));
        }
        Bundle bundle = (Bundle) c0031d.f38h;
        bundle.putParcelable(str, bitmap);
        c0858a.m2174W(new MediaMetadataCompat(bundle));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX INFO: renamed from: f */
    public final void m809f(C0862E c0862e, String str, C0229d c0229d) {
        byte b3;
        PlaybackStateCompat.CustomAction customAction;
        int i3;
        int i4;
        int i5;
        int i6;
        switch (str) {
            case "com.google.android.gms.cast.framework.action.REWIND":
                b3 = 1;
                break;
            case "com.google.android.gms.cast.framework.action.STOP_CASTING":
                b3 = 2;
                break;
            case "com.google.android.gms.cast.framework.action.DISCONNECT":
                b3 = 3;
                break;
            case "com.google.android.gms.cast.framework.action.FORWARD":
                b3 = 0;
                break;
            default:
                b3 = -1;
                break;
        }
        Context context = this.f704a;
        C0231f c0231f = this.f708e;
        if (b3 == 0) {
            if (this.f721r == null && c0231f != null) {
                C0296b c0296b = AbstractC0268l.f725a;
                long j3 = c0231f.f583i;
                if (j3 == 10000) {
                    i3 = c0231f.f572F;
                } else {
                    i3 = j3 != 30000 ? c0231f.f571E : c0231f.f573G;
                }
                if (j3 == 10000) {
                    i4 = c0231f.f592r;
                } else {
                    i4 = j3 != 30000 ? c0231f.f591q : c0231f.f593s;
                }
                String string = context.getResources().getString(i3);
                if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_FORWARD)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(string)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i4 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                this.f721r = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_FORWARD, string, i4, null);
            }
            customAction = this.f721r;
        } else if (b3 == 1) {
            if (this.f722s == null && c0231f != null) {
                C0296b c0296b2 = AbstractC0268l.f725a;
                long j4 = c0231f.f583i;
                if (j4 == 10000) {
                    i5 = c0231f.f575I;
                } else {
                    i5 = j4 != 30000 ? c0231f.f574H : c0231f.f576J;
                }
                if (j4 == 10000) {
                    i6 = c0231f.f595u;
                } else {
                    i6 = j4 != 30000 ? c0231f.f594t : c0231f.f596v;
                }
                String string2 = context.getResources().getString(i5);
                if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_REWIND)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(string2)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                if (i6 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                this.f722s = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_REWIND, string2, i6, null);
            }
            customAction = this.f722s;
        } else if (b3 == 2) {
            if (this.f723t == null && c0231f != null) {
                String string3 = context.getResources().getString(c0231f.f577K);
                if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(string3)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                int i7 = c0231f.f597w;
                if (i7 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                this.f723t = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_STOP_CASTING, string3, i7, null);
            }
            customAction = this.f723t;
        } else if (b3 == 3) {
            if (this.f724u == null && c0231f != null) {
                String string4 = context.getResources().getString(c0231f.f577K);
                if (TextUtils.isEmpty(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
                if (TextUtils.isEmpty(string4)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                }
                int i8 = c0231f.f597w;
                if (i8 == 0) {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                }
                this.f724u = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_DISCONNECT, string4, i8, null);
            }
            customAction = this.f724u;
        } else if (c0229d == null) {
            customAction = null;
        } else {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("You must specify an action to build a CustomAction");
            }
            String str2 = c0229d.f550i;
            if (TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("You must specify a name to build a CustomAction");
            }
            int i9 = c0229d.f549h;
            if (i9 == 0) {
                throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
            }
            customAction = new PlaybackStateCompat.CustomAction(str, str2, i9, null);
        }
        if (customAction != null) {
            c0862e.f3642a.add(customAction);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m810g(boolean z3) {
        if (this.f705b.f445m) {
            RunnableC0153b runnableC0153b = this.f715l;
            HandlerC0784e handlerC0784e = this.f714k;
            if (runnableC0153b != null) {
                handlerC0784e.removeCallbacks(runnableC0153b);
            }
            Context context = this.f704a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z3) {
                    handlerC0784e.postDelayed(runnableC0153b, 1000L);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m811h() {
        C0264h c0264h = this.f713j;
        if (c0264h != null) {
            f703v.m831b("Stopping media notification.", new Object[0]);
            C0258b c0258b = c0264h.f688i;
            c0258b.m791p();
            c0258b.f667l = null;
            NotificationManager notificationManager = c0264h.f681b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m812i() {
        if (this.f705b.f445m) {
            this.f714k.removeCallbacks(this.f715l);
            Context context = this.f704a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            context.stopService(intent);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m813j(int i3, MediaInfo mediaInfo) {
        PlaybackStateCompat playbackStateCompatM2213a;
        C0858A c0858a;
        C0137l c0137l;
        MediaMetadata metadata;
        MediaMetadataCompat mediaMetadataCompatCreateFromParcel;
        Bitmap bitmap;
        PendingIntent activity;
        C0858A c0858a2 = this.f719p;
        if (c0858a2 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        C0862E c0862e = new C0862E();
        C0233h c0233h = this.f717n;
        if (c0233h == null || this.f713j == null) {
            playbackStateCompatM2213a = c0862e.m2213a();
        } else {
            long jM751a = (c0233h.m767q() == 0 || c0233h.m759i()) ? 0L : c0233h.m751a();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c0862e.f3643b = i3;
            c0862e.f3644c = jM751a;
            c0862e.f3647f = jElapsedRealtime;
            c0862e.f3645d = 1.0f;
            if (i3 == 0) {
                playbackStateCompatM2213a = c0862e.m2213a();
            } else {
                C0231f c0231f = this.f708e;
                C0247v c0247v = c0231f != null ? c0231f.f578L : null;
                C0233h c0233h2 = this.f717n;
                long jM806c = (c0233h2 == null || c0233h2.m759i() || this.f717n.m763m()) ? 0L : 256L;
                if (c0247v != null) {
                    ArrayList arrayListM814a = AbstractC0268l.m814a(c0247v);
                    if (arrayListM814a != null) {
                        int size = arrayListM814a.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayListM814a.get(i4);
                            i4++;
                            C0229d c0229d = (C0229d) obj;
                            String str = c0229d.f548g;
                            if (TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                jM806c = m806c(str, i3, bundle) | jM806c;
                            } else {
                                m809f(c0862e, str, c0229d);
                            }
                        }
                    }
                } else {
                    C0231f c0231f2 = this.f708e;
                    if (c0231f2 != null) {
                        ArrayList arrayList = c0231f2.f581g;
                        int size2 = arrayList.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj2 = arrayList.get(i5);
                            i5++;
                            String str2 = (String) obj2;
                            if (TextUtils.equals(str2, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                jM806c |= m806c(str2, i3, bundle);
                            } else {
                                m809f(c0862e, str2, null);
                            }
                        }
                    }
                }
                c0862e.f3646e = jM806c;
                playbackStateCompatM2213a = c0862e.m2213a();
            }
        }
        C0885u c0885u = (C0885u) c0858a2.f3639h;
        c0885u.f3707f = playbackStateCompatM2213a;
        synchronized (c0885u.f3705d) {
            for (int iBeginBroadcast = c0885u.f3706e.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((InterfaceC0866b) c0885u.f3706e.getBroadcastItem(iBeginBroadcast)).mo2219k0(playbackStateCompatM2213a);
                } catch (RemoteException unused) {
                }
            }
            c0885u.f3706e.finishBroadcast();
        }
        MediaSession mediaSession = c0885u.f3702a;
        if (playbackStateCompatM2213a.f3673r == null) {
            PlaybackState.Builder builderM2188d = AbstractC0859B.m2188d();
            AbstractC0859B.m2208x(builderM2188d, playbackStateCompatM2213a.f3662g, playbackStateCompatM2213a.f3663h, playbackStateCompatM2213a.f3665j, playbackStateCompatM2213a.f3669n);
            AbstractC0859B.m2205u(builderM2188d, playbackStateCompatM2213a.f3664i);
            AbstractC0859B.m2203s(builderM2188d, playbackStateCompatM2213a.f3666k);
            AbstractC0859B.m2206v(builderM2188d, playbackStateCompatM2213a.f3668m);
            ArrayList arrayList2 = playbackStateCompatM2213a.f3670o;
            int size3 = arrayList2.size();
            int i6 = 0;
            while (i6 < size3) {
                Object obj3 = arrayList2.get(i6);
                i6++;
                PlaybackStateCompat.CustomAction customAction = (PlaybackStateCompat.CustomAction) obj3;
                PlaybackState.CustomAction customActionM2186b = customAction.f3678k;
                if (customActionM2186b == null) {
                    PlaybackState.CustomAction.Builder builderM2189e = AbstractC0859B.m2189e(customAction.f3674g, customAction.f3675h, customAction.f3676i);
                    AbstractC0859B.m2207w(builderM2189e, customAction.f3677j);
                    customActionM2186b = AbstractC0859B.m2186b(builderM2189e);
                }
                AbstractC0859B.m2185a(builderM2188d, customActionM2186b);
            }
            AbstractC0859B.m2204t(builderM2188d, playbackStateCompatM2213a.f3671p);
            if (Build.VERSION.SDK_INT >= 22) {
                AbstractC0861D.m2212b(builderM2188d, playbackStateCompatM2213a.f3672q);
            }
            playbackStateCompatM2213a.f3673r = AbstractC0859B.m2187c(builderM2188d);
        }
        mediaSession.setPlaybackState(playbackStateCompatM2213a.f3673r);
        C0231f c0231f3 = this.f708e;
        if (c0231f3 != null && c0231f3.f579M) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
        }
        C0231f c0231f4 = this.f708e;
        if (c0231f4 != null && c0231f4.f580N) {
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
        }
        if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
            ((C0885u) c0858a2.f3639h).f3702a.setExtras(bundle);
        }
        if (i3 == 0) {
            c0858a2.m2174W(new MediaMetadataCompat(new Bundle()));
            return;
        }
        if (this.f717n != null) {
            if (this.f709f == null) {
                activity = null;
            } else {
                Intent intent = new Intent();
                intent.setComponent(this.f709f);
                activity = PendingIntent.getActivity(this.f704a, 0, intent, AbstractC1153A.f5540a | 134217728);
            }
            if (activity != null) {
                ((C0885u) c0858a2.f3639h).f3702a.setSessionActivity(activity);
            }
        }
        C0233h c0233h3 = this.f717n;
        if (c0233h3 == null || (c0858a = this.f719p) == null || mediaInfo == null || (c0137l = mediaInfo.f5447j) == null) {
            return;
        }
        long j3 = c0233h3.m759i() ? 0L : mediaInfo.f5448k;
        String strM591e = c0137l.m591e("com.google.android.gms.cast.metadata.TITLE");
        String strM591e2 = c0137l.m591e("com.google.android.gms.cast.metadata.SUBTITLE");
        C0858A c0858a3 = this.f719p;
        if (c0858a3 == null || (metadata = ((C0872h) ((C0106b) c0858a3.f3640i).f140h).f3686a.getMetadata()) == null) {
            mediaMetadataCompatCreateFromParcel = null;
        } else {
            C2018e c2018e = MediaMetadataCompat.f3627j;
            Parcel parcelObtain = Parcel.obtain();
            metadata.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            mediaMetadataCompatCreateFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            mediaMetadataCompatCreateFromParcel.f3632h = metadata;
        }
        C0031d c0031d = mediaMetadataCompatCreateFromParcel == null ? new C0031d(21) : new C0031d(mediaMetadataCompatCreateFromParcel);
        C2018e c2018e2 = MediaMetadataCompat.f3627j;
        if (c2018e2.containsKey("android.media.metadata.DURATION") && ((Integer) c2018e2.getOrDefault("android.media.metadata.DURATION", null)).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        ((Bundle) c0031d.f38h).putLong("android.media.metadata.DURATION", j3);
        if (strM591e != null) {
            c0031d.m178z("android.media.metadata.TITLE", strM591e);
            c0031d.m178z("android.media.metadata.DISPLAY_TITLE", strM591e);
        }
        if (strM591e2 != null) {
            c0031d.m178z("android.media.metadata.DISPLAY_SUBTITLE", strM591e2);
        }
        c0858a.m2174W(new MediaMetadataCompat((Bundle) c0031d.f38h));
        Uri uriM807d = m807d(c0137l);
        if (uriM807d != null) {
            this.f711h.m790o(uriM807d);
            bitmap = null;
        } else {
            bitmap = null;
            m808e(null, 0);
        }
        Uri uriM807d2 = m807d(c0137l);
        if (uriM807d2 != null) {
            this.f712i.m790o(uriM807d2);
        } else {
            m808e(bitmap, 3);
        }
    }
}
