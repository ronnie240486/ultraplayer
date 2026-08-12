package p085c0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p000A.C0031d;
import p003B.AbstractC0081c;
import p036M0.C0380q;
import p055T.AbstractC0545H;
import p055T.C0567c;
import p055T.C0583o;
import p064W.AbstractC0632A;
import p082b0.AbstractC1068i;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1679J;
import p105h2.AbstractC1718l0;
import p105h2.AbstractC1723q;
import p105h2.C1673D;
import p105h2.C1678I;
import p105h2.C1692X;
import p105h2.C1696a0;
import p105h2.C1698b0;
import p105h2.C1700c0;

/* JADX INFO: renamed from: c0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1126b {

    /* JADX INFO: renamed from: c */
    public static final C1126b f5224c = new C1126b(AbstractC1676G.m4120r(C1125a.f5220d));

    /* JADX INFO: renamed from: d */
    public static final C1692X f5225d;

    /* JADX INFO: renamed from: e */
    public static final C1700c0 f5226e;

    /* JADX INFO: renamed from: a */
    public final SparseArray f5227a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public final int f5228b;

    static {
        Object[] objArr = {2, 5, 6};
        AbstractC1723q.m4152a(3, objArr);
        f5225d = AbstractC1676G.m4115l(3, objArr);
        C0380q c0380q = new C0380q(4, 5);
        c0380q.m1051n(5, 6);
        c0380q.m1051n(17, 6);
        c0380q.m1051n(7, 6);
        c0380q.m1051n(30, 10);
        c0380q.m1051n(18, 6);
        c0380q.m1051n(6, 8);
        c0380q.m1051n(8, 8);
        c0380q.m1051n(14, 8);
        f5226e = c0380q.m1042a();
    }

    public C1126b(C1692X c1692x) {
        for (int i3 = 0; i3 < c1692x.f7631j; i3++) {
            C1125a c1125a = (C1125a) c1692x.get(i3);
            this.f5227a.put(c1125a.f5221a, c1125a);
        }
        int iMax = 0;
        for (int i4 = 0; i4 < this.f5227a.size(); i4++) {
            iMax = Math.max(iMax, ((C1125a) this.f5227a.valueAt(i4)).f5222b);
        }
        this.f5228b = iMax;
    }

    /* JADX INFO: renamed from: a */
    public static C1692X m3004a(int[] iArr, int i3) {
        C1673D c1673dM4116m = AbstractC1676G.m4116m();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i4 : iArr) {
            c1673dM4116m.m4102a(new C1125a(i4, i3));
        }
        return c1673dM4116m.m4112f();
    }

    /* JADX INFO: renamed from: b */
    public static C1126b m3005b(Context context, C0567c c0567c, C0031d c0031d) {
        return m3006c(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), c0567c, c0031d);
    }

    /* JADX WARN: Code duplicated, block: B:90:0x0280  */
    /* JADX WARN: Code duplicated, block: B:92:0x0289  */
    /* JADX INFO: renamed from: c */
    public static C1126b m3006c(Context context, Intent intent, C0567c c0567c, C0031d c0031d) {
        C0031d c0031d2;
        Object systemService = context.getSystemService("audio");
        systemService.getClass();
        AudioManager audioManager = (AudioManager) systemService;
        if (c0031d != null) {
            c0031d2 = c0031d;
        } else {
            c0031d2 = null;
            if (AbstractC0632A.f2454a >= 33) {
                try {
                    List audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes((AudioAttributes) c0567c.m1433a().f38h);
                    if (!audioDevicesForAttributes.isEmpty()) {
                        c0031d2 = new C0031d(27, AbstractC0081c.m399g(audioDevicesForAttributes.get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
        }
        int i3 = AbstractC0632A.f2454a;
        C1700c0 c1700c0 = f5226e;
        if (i3 >= 33 && (AbstractC0632A.m1570K(context) || (i3 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            List directProfilesForAttributes = audioManager.getDirectProfilesForAttributes((AudioAttributes) c0567c.m1433a().f38h);
            HashMap map = new HashMap();
            map.put(2, new HashSet(AbstractC1303m.m3308c(12)));
            for (int i4 = 0; i4 < directProfilesForAttributes.size(); i4++) {
                AudioProfile audioProfileM2879c = AbstractC1068i.m2879c(directProfilesForAttributes.get(i4));
                if (audioProfileM2879c.getEncapsulationType() != 1) {
                    int format = audioProfileM2879c.getFormat();
                    if (AbstractC0632A.m1567H(format) || c1700c0.containsKey(Integer.valueOf(format))) {
                        if (map.containsKey(Integer.valueOf(format))) {
                            Set set = (Set) map.get(Integer.valueOf(format));
                            set.getClass();
                            set.addAll(AbstractC1303m.m3308c(audioProfileM2879c.getChannelMasks()));
                        } else {
                            map.put(Integer.valueOf(format), new HashSet(AbstractC1303m.m3308c(audioProfileM2879c.getChannelMasks())));
                        }
                    }
                }
            }
            C1673D c1673dM4116m = AbstractC1676G.m4116m();
            for (Map.Entry entry : map.entrySet()) {
                c1673dM4116m.m4102a(new C1125a(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new C1126b(c1673dM4116m.m4112f());
        }
        if (i3 >= 23) {
            AudioDeviceInfo[] devices = c0031d2 == null ? audioManager.getDevices(2) : new AudioDeviceInfo[]{(AudioDeviceInfo) c0031d2.f38h};
            C1678I c1678i = new C1678I(4);
            Integer[] numArr = {8, 7};
            AbstractC1723q.m4152a(2, numArr);
            c1678i.m4105d(2);
            System.arraycopy(numArr, 0, c1678i.f7589a, c1678i.f7590b, 2);
            c1678i.f7590b += 2;
            if (i3 >= 31) {
                Integer[] numArr2 = {26, 27};
                AbstractC1723q.m4152a(2, numArr2);
                c1678i.m4105d(2);
                System.arraycopy(numArr2, 0, c1678i.f7589a, c1678i.f7590b, 2);
                c1678i.f7590b += 2;
            }
            if (i3 >= 33) {
                c1678i.m4102a(30);
            }
            AbstractC1679J abstractC1679JM4125f = c1678i.m4125f();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (abstractC1679JM4125f.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return f5224c;
                }
            }
        }
        C1678I c1678i2 = new C1678I(4);
        c1678i2.m4102a(2);
        int i5 = AbstractC0632A.f2454a;
        if (i5 >= 29 && (AbstractC0632A.m1570K(context) || (i5 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            C1673D c1673dM4116m2 = AbstractC1676G.m4116m();
            C1696a0 c1696a0 = c1700c0.f7653h;
            if (c1696a0 == null) {
                C1696a0 c1696a1 = new C1696a0(c1700c0, new C1698b0(c1700c0.f7656k, 0, c1700c0.f7657l));
                c1700c0.f7653h = c1696a1;
                c1696a0 = c1696a1;
            }
            AbstractC1718l0 it = c1696a0.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (AbstractC0632A.f2454a >= AbstractC0632A.m1596o(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), (AudioAttributes) c0567c.m1433a().f38h)) {
                    c1673dM4116m2.m4102a(num);
                }
            }
            c1673dM4116m2.m4102a(2);
            C1692X c1692xM4112f = c1673dM4116m2.m4112f();
            c1692xM4112f.getClass();
            c1678i2.m4104c(c1692xM4112f);
            return new C1126b(m3004a(AbstractC1303m.m3287J(c1678i2.m4125f()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z3 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if (!z3) {
            String str = AbstractC0632A.f2456c;
            if ("Amazon".equals(str) || "Xiaomi".equals(str)) {
                if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
                    C1692X c1692x = f5225d;
                    c1692x.getClass();
                    c1678i2.m4104c(c1692x);
                }
            }
        } else if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            C1692X c1692x2 = f5225d;
            c1692x2.getClass();
            c1678i2.m4104c(c1692x2);
        }
        if (intent == null || z3 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new C1126b(m3004a(AbstractC1303m.m3287J(c1678i2.m4125f()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            List listM3308c = AbstractC1303m.m3308c(intArrayExtra);
            listM3308c.getClass();
            c1678i2.m4104c(listM3308c);
        }
        return new C1126b(m3004a(AbstractC1303m.m3287J(c1678i2.m4125f()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0100  */
    /* JADX INFO: renamed from: d */
    public final Pair m3007d(C0567c c0567c, C0583o c0583o) {
        String str = c0583o.f2154n;
        str.getClass();
        int iM1354b = AbstractC0545H.m1354b(str, c0583o.f2151k);
        Integer numValueOf = Integer.valueOf(iM1354b);
        C1700c0 c1700c0 = f5226e;
        if (!c1700c0.containsKey(numValueOf)) {
            return null;
        }
        int i3 = 6;
        i3 = 6;
        i3 = 6;
        if (iM1354b == 18 && !m3008e(18)) {
            iM1354b = 6;
        } else if ((iM1354b == 8 && !m3008e(8)) || (iM1354b == 30 && !m3008e(30))) {
            iM1354b = 7;
        }
        if (!m3008e(iM1354b)) {
            return null;
        }
        C1125a c1125a = (C1125a) this.f5227a.get(iM1354b);
        c1125a.getClass();
        int iIntValue = 0;
        zContains = false;
        boolean zContains = false;
        int i4 = c1125a.f5222b;
        AbstractC1679J abstractC1679J = c1125a.f5223c;
        int i5 = c0583o.f2130C;
        if (i5 == -1 || iM1354b == 18) {
            int i6 = c0583o.f2131D;
            if (i6 == -1) {
                i6 = 48000;
            }
            if (abstractC1679J != null) {
                iIntValue = i4;
            } else {
                int i7 = AbstractC0632A.f2454a;
                int i8 = c1125a.f5221a;
                if (i7 >= 29) {
                    for (int i9 = 10; i9 > 0; i9--) {
                        int iM1598q = AbstractC0632A.m1598q(i9);
                        if (iM1598q != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i8).setSampleRate(i6).setChannelMask(iM1598q).build(), (AudioAttributes) c0567c.m1433a().f38h)) {
                            iIntValue = i9;
                            break;
                        }
                    }
                } else {
                    Object obj = c1700c0.get(Integer.valueOf(i8));
                    iIntValue = ((Integer) (obj != null ? obj : 0)).intValue();
                }
            }
            i5 = iIntValue;
        } else if (!c0583o.f2154n.equals("audio/vnd.dts.uhd;profile=p2") || AbstractC0632A.f2454a >= 33) {
            if (abstractC1679J != null) {
                int iM1598q2 = AbstractC0632A.m1598q(i5);
                if (iM1598q2 != 0) {
                    zContains = abstractC1679J.contains(Integer.valueOf(iM1598q2));
                }
            } else if (i5 <= i4) {
                zContains = true;
            }
            if (!zContains) {
                return null;
            }
        } else if (i5 > 10) {
            return null;
        }
        int i10 = AbstractC0632A.f2454a;
        if (i10 > 28) {
            i3 = i5;
        } else if (i5 == 7) {
            i3 = 8;
        } else if (i5 != 3 && i5 != 4 && i5 != 5) {
            i3 = i5;
        }
        if (i10 <= 26 && "fugu".equals(AbstractC0632A.f2455b) && i3 == 1) {
            i3 = 2;
        }
        int iM1598q3 = AbstractC0632A.m1598q(i3);
        if (iM1598q3 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iM1354b), Integer.valueOf(iM1598q3));
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3008e(int i3) {
        SparseArray sparseArray = this.f5227a;
        int i4 = AbstractC0632A.f2454a;
        return sparseArray.indexOfKey(i3) >= 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    public final boolean equals(Object obj) {
        boolean zContentEquals;
        if (this != obj) {
            if (obj instanceof C1126b) {
                C1126b c1126b = (C1126b) obj;
                SparseArray sparseArray = this.f5227a;
                SparseArray sparseArray2 = c1126b.f5227a;
                int i3 = AbstractC0632A.f2454a;
                if (sparseArray == null) {
                    if (sparseArray2 == null) {
                        zContentEquals = true;
                    } else {
                        zContentEquals = false;
                    }
                } else if (sparseArray2 == null) {
                    zContentEquals = false;
                } else if (AbstractC0632A.f2454a >= 31) {
                    zContentEquals = sparseArray.contentEquals(sparseArray2);
                } else {
                    int size = sparseArray.size();
                    if (size == sparseArray2.size()) {
                        int i4 = 0;
                        while (true) {
                            if (i4 < size) {
                                if (Objects.equals(sparseArray.valueAt(i4), sparseArray2.get(sparseArray.keyAt(i4)))) {
                                    i4++;
                                }
                            } else {
                                zContentEquals = true;
                            }
                        }
                    }
                    zContentEquals = false;
                }
                if (!zContentEquals || this.f5228b != c1126b.f5228b) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iContentHashCode;
        SparseArray sparseArray = this.f5227a;
        if (AbstractC0632A.f2454a >= 31) {
            iContentHashCode = sparseArray.contentHashCode();
        } else {
            int iHashCode = 17;
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                iHashCode = Objects.hashCode(sparseArray.valueAt(i3)) + ((sparseArray.keyAt(i3) + (iHashCode * 31)) * 31);
            }
            iContentHashCode = iHashCode;
        }
        return (iContentHashCode * 31) + this.f5228b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f5228b + ", audioProfiles=" + this.f5227a + "]";
    }
}
