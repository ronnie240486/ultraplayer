package p013E1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000A.C0031d;
import p028J1.AbstractC0295a;
import p028J1.C0296b;
import p031K1.AbstractC0336a;
import p046P1.AbstractC0491s;
import p049Q1.AbstractC0512a;
import p057T1.AbstractC0600a;

/* JADX INFO: renamed from: E1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0142q extends AbstractC0512a {
    public static final Parcelable.Creator<C0142q> CREATOR;

    /* JADX INFO: renamed from: A */
    public C0135j f300A;

    /* JADX INFO: renamed from: B */
    public C0139n f301B;

    /* JADX INFO: renamed from: C */
    public boolean f302C;

    /* JADX INFO: renamed from: g */
    public MediaInfo f304g;

    /* JADX INFO: renamed from: h */
    public long f305h;

    /* JADX INFO: renamed from: i */
    public int f306i;

    /* JADX INFO: renamed from: j */
    public double f307j;

    /* JADX INFO: renamed from: k */
    public int f308k;

    /* JADX INFO: renamed from: l */
    public int f309l;

    /* JADX INFO: renamed from: m */
    public long f310m;

    /* JADX INFO: renamed from: n */
    public long f311n;

    /* JADX INFO: renamed from: o */
    public double f312o;

    /* JADX INFO: renamed from: p */
    public boolean f313p;

    /* JADX INFO: renamed from: q */
    public long[] f314q;

    /* JADX INFO: renamed from: r */
    public int f315r;

    /* JADX INFO: renamed from: s */
    public int f316s;

    /* JADX INFO: renamed from: t */
    public String f317t;

    /* JADX INFO: renamed from: u */
    public JSONObject f318u;

    /* JADX INFO: renamed from: v */
    public int f319v;

    /* JADX INFO: renamed from: x */
    public boolean f321x;

    /* JADX INFO: renamed from: y */
    public C0128c f322y;

    /* JADX INFO: renamed from: z */
    public C0146u f323z;

    /* JADX INFO: renamed from: w */
    public final ArrayList f320w = new ArrayList();

    /* JADX INFO: renamed from: D */
    public final SparseArray f303D = new SparseArray();

    static {
        AbstractC0491s.m1212d("MediaStatus", "The log tag cannot be null or empty.");
        TextUtils.isEmpty(null);
        CREATOR = new C0147v(15);
    }

    public C0142q(MediaInfo mediaInfo, long j3, int i3, double d3, int i4, int i5, long j4, long j5, double d4, boolean z3, long[] jArr, int i6, int i7, String str, int i8, ArrayList arrayList, boolean z4, C0128c c0128c, C0146u c0146u, C0135j c0135j, C0139n c0139n) {
        this.f304g = mediaInfo;
        this.f305h = j3;
        this.f306i = i3;
        this.f307j = d3;
        this.f308k = i4;
        this.f309l = i5;
        this.f310m = j4;
        this.f311n = j5;
        this.f312o = d4;
        this.f313p = z3;
        this.f314q = jArr;
        this.f315r = i6;
        this.f316s = i7;
        this.f317t = str;
        if (str != null) {
            try {
                this.f318u = new JSONObject(this.f317t);
            } catch (JSONException unused) {
                this.f318u = null;
                this.f317t = null;
            }
        } else {
            this.f318u = null;
        }
        this.f319v = i8;
        if (arrayList != null && !arrayList.isEmpty()) {
            m601g(arrayList);
        }
        this.f321x = z4;
        this.f322y = c0128c;
        this.f323z = c0146u;
        this.f300A = c0135j;
        this.f301B = c0139n;
        boolean z5 = false;
        if (c0139n != null && c0139n.f289p) {
            z5 = true;
        }
        this.f302C = z5;
    }

    /* JADX INFO: renamed from: e */
    public final C0140o m599e(int i3) {
        Integer num = (Integer) this.f303D.get(i3);
        if (num == null) {
            return null;
        }
        return (C0140o) this.f320w.get(num.intValue());
    }

    public final boolean equals(Object obj) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (this != obj) {
            if (obj instanceof C0142q) {
                C0142q c0142q = (C0142q) obj;
                if ((this.f318u == null) == (c0142q.f318u == null) && this.f305h == c0142q.f305h && this.f306i == c0142q.f306i && this.f307j == c0142q.f307j && this.f308k == c0142q.f308k && this.f309l == c0142q.f309l && this.f310m == c0142q.f310m && this.f312o == c0142q.f312o && this.f313p == c0142q.f313p && this.f315r == c0142q.f315r && this.f316s == c0142q.f316s && this.f319v == c0142q.f319v && Arrays.equals(this.f314q, c0142q.f314q) && AbstractC0295a.m828e(Long.valueOf(this.f311n), Long.valueOf(c0142q.f311n)) && AbstractC0295a.m828e(this.f320w, c0142q.f320w) && AbstractC0295a.m828e(this.f304g, c0142q.f304g) && (((jSONObject = this.f318u) == null || (jSONObject2 = c0142q.f318u) == null || AbstractC0600a.m1464a(jSONObject, jSONObject2)) && this.f321x == c0142q.f321x && AbstractC0295a.m828e(this.f322y, c0142q.f322y) && AbstractC0295a.m828e(this.f323z, c0142q.f323z) && AbstractC0295a.m828e(this.f300A, c0142q.f300A) && AbstractC0491s.m1216h(this.f301B, c0142q.f301B) && this.f302C == c0142q.f302C)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x01af A[EDGE_INSN: B:111:0x01af->B:112:0x01b2 BREAK  A[LOOP:0: B:104:0x019c->B:108:0x01a9]] */
    /* JADX WARN: Code duplicated, block: B:142:0x0228  */
    /* JADX WARN: Code duplicated, block: B:149:0x0235 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x0261  */
    /* JADX WARN: Code duplicated, block: B:248:0x0401  */
    /* JADX WARN: Code duplicated, block: B:315:0x0500  */
    /* JADX WARN: Code duplicated, block: B:342:0x055a  */
    /* JADX WARN: Code duplicated, block: B:393:0x0666  */
    /* JADX WARN: Code duplicated, block: B:395:0x0672  */
    /* JADX WARN: Code duplicated, block: B:405:0x06c4  */
    /* JADX WARN: Code duplicated, block: B:407:0x06c8  */
    /* JADX INFO: renamed from: f */
    public final int m600f(JSONObject jSONObject, int i3) throws JSONException {
        JSONObject jSONObject2;
        int i4;
        int i5;
        long[] jArr;
        boolean z3;
        C0128c c0128c;
        C0146u c0146u;
        byte b3;
        int i6;
        int i7;
        JSONObject jSONObjectOptJSONObject;
        C0135j c0135j;
        String strM825b;
        String str;
        C0138m c0138m;
        int iIntValue;
        ArrayList arrayList;
        int iOptInt;
        long jOptDouble;
        ArrayList arrayList2;
        String str2;
        String str3;
        boolean zOptBoolean;
        C0138m c0138m2;
        int i8;
        byte b4;
        ArrayList arrayList3;
        ArrayList arrayList4;
        MediaInfo mediaInfo;
        boolean zM597e;
        MediaInfo mediaInfo2;
        int i9;
        int i10;
        int i11;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("extendedStatus");
        if (jSONObjectOptJSONObject2 != null) {
            try {
                ArrayList arrayList5 = new ArrayList();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    arrayList5.add(itKeys.next());
                }
                jSONObject2 = new JSONObject(jSONObject, (String[]) arrayList5.toArray(new String[0]));
                Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                while (itKeys2.hasNext()) {
                    String next = itKeys2.next();
                    jSONObject2.put(next, jSONObjectOptJSONObject2.get(next));
                }
                jSONObject2.remove("extendedStatus");
            } catch (JSONException unused) {
                jSONObject2 = jSONObject;
            }
        } else {
            jSONObject2 = jSONObject;
        }
        long j3 = jSONObject2.getLong("mediaSessionId");
        if (j3 != this.f305h) {
            this.f305h = j3;
            i4 = 1;
        } else {
            i4 = 0;
        }
        if (jSONObject2.has("playerState")) {
            String string = jSONObject2.getString("playerState");
            if (string.equals("IDLE")) {
                i10 = 1;
            } else if (string.equals("PLAYING")) {
                i10 = 2;
            } else if (string.equals("PAUSED")) {
                i10 = 3;
            } else if (string.equals("BUFFERING")) {
                i10 = 4;
            } else {
                i10 = string.equals("LOADING") ? 5 : 0;
            }
            if (i10 != this.f308k) {
                this.f308k = i10;
                i4 |= 2;
            }
            if (i10 == 1 && jSONObject2.has("idleReason")) {
                String string2 = jSONObject2.getString("idleReason");
                if (string2.equals("CANCELLED")) {
                    i11 = 2;
                } else if (string2.equals("INTERRUPTED")) {
                    i11 = 3;
                } else if (string2.equals("FINISHED")) {
                    i11 = 1;
                } else {
                    i11 = string2.equals("ERROR") ? 4 : 0;
                }
                if (i11 != this.f309l) {
                    this.f309l = i11;
                    i4 |= 2;
                }
            }
        }
        if (jSONObject2.has("playbackRate")) {
            double d3 = jSONObject2.getDouble("playbackRate");
            if (this.f307j != d3) {
                this.f307j = d3;
                i4 |= 2;
            }
        }
        double d4 = 1000.0d;
        if (jSONObject2.has("currentTime")) {
            double d5 = jSONObject2.getDouble("currentTime");
            Pattern pattern = AbstractC0295a.f786a;
            long j4 = (long) (d5 * 1000.0d);
            if (j4 != this.f310m) {
                this.f310m = j4;
                i4 |= 2;
            }
            i4 |= 128;
        }
        if (jSONObject2.has("supportedMediaCommands")) {
            long j5 = jSONObject2.getLong("supportedMediaCommands");
            if (j5 != this.f311n) {
                this.f311n = j5;
                i4 |= 2;
            }
        }
        if (jSONObject2.has("volume") && i3 == 0) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("volume");
            double d6 = jSONObject3.getDouble("level");
            i5 = 4;
            if (d6 != this.f312o) {
                this.f312o = d6;
                i4 |= 2;
            }
            boolean z4 = jSONObject3.getBoolean("muted");
            if (z4 != this.f313p) {
                this.f313p = z4;
                i4 |= 2;
            }
        } else {
            i5 = 4;
        }
        JSONArray jSONArray = jSONObject2.has("activeTrackIds") ? jSONObject2.getJSONArray("activeTrackIds") : null;
        Pattern pattern2 = AbstractC0295a.f786a;
        if (jSONArray == null) {
            jArr = null;
        } else {
            jArr = new long[jSONArray.length()];
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                jArr[i12] = jSONArray.getLong(i12);
            }
        }
        if (jArr != null) {
            long[] jArr2 = this.f314q;
            if (jArr2 == null || jArr2.length != jArr.length) {
                this.f314q = jArr;
                i4 |= 2;
                break;
            }
            for (int i13 = 0; i13 < jArr.length; i13++) {
                if (this.f314q[i13] != jArr[i13]) {
                    this.f314q = jArr;
                    i4 |= 2;
                    break;
                }
            }
        } else if (this.f314q != null) {
            this.f314q = jArr;
            i4 |= 2;
            break;
        }
        if (jSONObject2.has("customData")) {
            this.f318u = jSONObject2.getJSONObject("customData");
            this.f317t = null;
            i4 |= 2;
        }
        if (jSONObject2.has("media")) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject("media");
            MediaInfo mediaInfo3 = new MediaInfo(jSONObject4);
            MediaInfo mediaInfo4 = this.f304g;
            if (mediaInfo4 == null || !mediaInfo4.equals(mediaInfo3)) {
                this.f304g = mediaInfo3;
                i4 |= 2;
            }
            if (jSONObject4.has("metadata")) {
                i4 |= i5;
            }
        }
        if (jSONObject2.has("currentItemId") && this.f306i != (i9 = jSONObject2.getInt("currentItemId"))) {
            this.f306i = i9;
            i4 |= 2;
        }
        int iOptInt2 = jSONObject2.optInt("preloadedItemId", 0);
        if (this.f316s != iOptInt2) {
            this.f316s = iOptInt2;
            i4 |= 16;
        }
        int iOptInt3 = jSONObject2.optInt("loadingItemId", 0);
        if (this.f315r != iOptInt3) {
            this.f315r = iOptInt3;
            i4 |= 2;
        }
        MediaInfo mediaInfo5 = this.f304g;
        int i14 = mediaInfo5 == null ? -1 : mediaInfo5.f5445h;
        int i15 = this.f308k;
        int i16 = this.f309l;
        int i17 = this.f315r;
        if (i15 != 1) {
            z3 = false;
        } else if (i16 != 1) {
            if (i16 != 2) {
                if (i16 == 3) {
                    if (i17 != 0) {
                        z3 = false;
                    }
                }
            } else if (i14 == 2) {
                z3 = false;
            }
            z3 = true;
        } else if (i17 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        ArrayList arrayList6 = this.f320w;
        SparseArray sparseArray = this.f303D;
        if (z3) {
            d4 = 1000.0d;
            this.f306i = 0;
            this.f315r = 0;
            this.f316s = 0;
            if (!arrayList6.isEmpty()) {
                i4 |= 8;
                this.f319v = 0;
                arrayList6.clear();
                sparseArray.clear();
            }
        } else {
            if (jSONObject2.has("repeatMode")) {
                Integer numM3331x = AbstractC1303m.m3331x(jSONObject2.getString("repeatMode"));
                int iIntValue2 = numM3331x == null ? this.f319v : numM3331x.intValue();
                if (this.f319v != iIntValue2) {
                    this.f319v = iIntValue2;
                    zM597e = true;
                } else {
                    zM597e = false;
                }
            } else {
                zM597e = false;
            }
            if (jSONObject2.has("items")) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("items");
                int length = jSONArray2.length();
                SparseArray sparseArray2 = new SparseArray();
                for (int i18 = 0; i18 < length; i18++) {
                    sparseArray2.put(i18, Integer.valueOf(jSONArray2.getJSONObject(i18).getInt("itemId")));
                }
                ArrayList arrayList7 = new ArrayList();
                for (int i19 = 0; i19 < length; i19++) {
                    Integer num = (Integer) sparseArray2.get(i19);
                    JSONObject jSONObject5 = jSONArray2.getJSONObject(i19);
                    C0140o c0140oM599e = m599e(num.intValue());
                    if (c0140oM599e != null) {
                        zM597e |= c0140oM599e.m597e(jSONObject5);
                        arrayList7.add(c0140oM599e);
                        if (i19 != ((Integer) sparseArray.get(num.intValue())).intValue()) {
                        }
                    } else if (num.intValue() != this.f306i || (mediaInfo2 = this.f304g) == null) {
                        arrayList7.add(new C0140o(jSONObject5));
                    } else {
                        C0140o c0140oM170r = new C0031d(mediaInfo2).m170r();
                        c0140oM170r.m597e(jSONObject5);
                        arrayList7.add(c0140oM170r);
                    }
                    zM597e = true;
                }
                zM597e |= !(arrayList6.size() == length);
                m601g(arrayList7);
            }
            if (zM597e) {
                i4 |= 8;
            }
        }
        int i20 = i4;
        JSONObject jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("breakStatus");
        Parcelable.Creator<C0128c> creator = C0128c.CREATOR;
        if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.has("currentBreakTime") && jSONObjectOptJSONObject3.has("currentBreakClipTime")) {
            try {
                long j6 = jSONObjectOptJSONObject3.getLong("currentBreakTime");
                Pattern pattern3 = AbstractC0295a.f786a;
                long j7 = j6 * 1000;
                long j8 = jSONObjectOptJSONObject3.getLong("currentBreakClipTime") * 1000;
                String strM825b2 = AbstractC0295a.m825b(jSONObjectOptJSONObject3, "breakId");
                String strM825b3 = AbstractC0295a.m825b(jSONObjectOptJSONObject3, "breakClipId");
                long jOptLong = jSONObjectOptJSONObject3.optLong("whenSkippable", -1L);
                if (jOptLong != -1) {
                    jOptLong *= 1000;
                }
                c0128c = new C0128c(j7, j8, strM825b2, strM825b3, jOptLong);
            } catch (JSONException e3) {
                C0296b c0296b = C0128c.f225l;
                Log.e(c0296b.f788a, c0296b.m833d("Error while creating an AdBreakClipInfo from JSON", new Object[0]), e3);
                c0128c = null;
            }
        } else {
            c0128c = null;
        }
        C0128c c0128c2 = this.f322y;
        if ((c0128c2 == null && c0128c != null) || (c0128c2 != null && !c0128c2.equals(c0128c))) {
            this.f321x = (c0128c == null || (c0128c.f228i == null && c0128c.f229j == null)) ? false : true;
            this.f322y = c0128c;
            i20 |= 32;
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject2.optJSONObject("videoInfo");
        C0296b c0296b2 = C0146u.f342j;
        if (jSONObjectOptJSONObject4 == null) {
            c0146u = null;
        } else {
            try {
                String string3 = jSONObjectOptJSONObject4.getString("hdrType");
                int iHashCode = string3.hashCode();
                if (iHashCode != 3218) {
                    if (iHashCode != 103158) {
                        if (iHashCode != 113729) {
                            if (iHashCode == 99136405 && string3.equals("hdr10")) {
                                b3 = 1;
                            } else {
                                b3 = -1;
                            }
                        } else if (string3.equals("sdr")) {
                            b3 = 3;
                        } else {
                            b3 = -1;
                        }
                    } else if (string3.equals("hdr")) {
                        b3 = 2;
                    } else {
                        b3 = -1;
                    }
                } else if (string3.equals("dv")) {
                    b3 = 0;
                } else {
                    b3 = -1;
                }
                if (b3 == 0) {
                    i6 = 3;
                } else if (b3 == 1) {
                    i6 = 2;
                } else if (b3 == 2) {
                    i6 = 4;
                } else if (b3 != 3) {
                    try {
                        c0296b2.m831b("Unknown HDR type: %s", string3);
                        i6 = 0;
                    } catch (JSONException e4) {
                        e = e4;
                        c0296b2.m830a(e, "Error while creating a VideoInfo instance from JSON", new Object[0]);
                        c0146u = null;
                    }
                } else {
                    i6 = 1;
                }
                c0146u = new C0146u(jSONObjectOptJSONObject4.getInt("width"), jSONObjectOptJSONObject4.getInt("height"), i6);
            } catch (JSONException e5) {
                e = e5;
            }
        }
        C0146u c0146u2 = this.f323z;
        if ((c0146u2 == null && c0146u != null) || (c0146u2 != null && !c0146u2.equals(c0146u))) {
            this.f323z = c0146u;
            i20 |= 64;
        }
        if (jSONObject2.has("breakInfo") && (mediaInfo = this.f304g) != null) {
            mediaInfo.m3075f(jSONObject2.getJSONObject("breakInfo"));
            i20 |= 2;
        }
        if (jSONObject2.has("queueData")) {
            JSONObject jSONObject6 = jSONObject2.getJSONObject("queueData");
            if (jSONObject6 == null) {
                i20 = i20;
                jOptDouble = -1;
                c0138m2 = null;
                i8 = 0;
                iIntValue = 0;
                iOptInt = 0;
                zOptBoolean = false;
                str3 = null;
                arrayList2 = null;
                str2 = null;
                strM825b = null;
            } else {
                String strM825b4 = AbstractC0295a.m825b(jSONObject6, "id");
                strM825b = AbstractC0295a.m825b(jSONObject6, "entity");
                int i21 = 7;
                switch (jSONObject6.optString("queueType")) {
                    case "ALBUM":
                        i21 = 1;
                        break;
                    case "PLAYLIST":
                        i21 = 2;
                        break;
                    case "AUDIOBOOK":
                        i21 = 3;
                        break;
                    case "RADIO_STATION":
                        i21 = 4;
                        break;
                    case "PODCAST_SERIES":
                        i21 = 5;
                        break;
                    case "TV_SERIES":
                        i21 = 6;
                        break;
                    case "VIDEO_PLAYLIST":
                        break;
                    case "LIVE_TV":
                        i21 = 8;
                        break;
                    case "MOVIE":
                        i21 = 9;
                        break;
                    default:
                        i21 = 0;
                        break;
                }
                String strM825b5 = AbstractC0295a.m825b(jSONObject6, "name");
                JSONObject jSONObjectOptJSONObject5 = jSONObject6.has("containerMetadata") ? jSONObject6.optJSONObject("containerMetadata") : null;
                if (jSONObjectOptJSONObject5 != null) {
                    String strOptString = jSONObjectOptJSONObject5.optString("containerType", "");
                    int iHashCode2 = strOptString.hashCode();
                    if (iHashCode2 != 6924225) {
                        if (iHashCode2 == 828666841 && strOptString.equals("GENERIC_CONTAINER")) {
                            b4 = 0;
                        } else {
                            b4 = -1;
                        }
                    } else if (strOptString.equals("AUDIOBOOK_CONTAINER")) {
                        b4 = 1;
                    } else {
                        b4 = -1;
                    }
                    int i22 = (b4 == 0 || b4 != 1) ? 0 : 1;
                    String strM825b6 = AbstractC0295a.m825b(jSONObjectOptJSONObject5, "title");
                    JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject5.optJSONArray("sections");
                    if (jSONArrayOptJSONArray != null) {
                        arrayList3 = new ArrayList();
                        int i23 = 0;
                        while (i23 < jSONArrayOptJSONArray.length()) {
                            JSONObject jSONObjectOptJSONObject6 = jSONArrayOptJSONArray.optJSONObject(i23);
                            int i24 = i23;
                            if (jSONObjectOptJSONObject6 != null) {
                                C0137l c0137l = new C0137l(0);
                                c0137l.m594i(jSONObjectOptJSONObject6);
                                arrayList3.add(c0137l);
                            }
                            i23 = i24 + 1;
                            strM825b4 = strM825b4;
                        }
                    } else {
                        arrayList3 = null;
                    }
                    str = strM825b4;
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject5.optJSONArray("containerImages");
                    if (jSONArrayOptJSONArray2 != null) {
                        arrayList4 = new ArrayList();
                        AbstractC0336a.m940c(arrayList4, jSONArrayOptJSONArray2);
                    } else {
                        arrayList4 = null;
                    }
                    double dOptDouble = jSONObjectOptJSONObject5.optDouble("containerDuration", 0.0d);
                    c0138m = new C0138m();
                    c0138m.f275g = i22;
                    c0138m.f276h = strM825b6;
                    c0138m.f277i = arrayList3;
                    c0138m.f278j = arrayList4;
                    c0138m.f279k = dOptDouble;
                } else {
                    i20 = i20;
                    str = strM825b4;
                    c0138m = null;
                }
                Integer numM3331x2 = AbstractC1303m.m3331x(jSONObject6.optString("repeatMode"));
                iIntValue = numM3331x2 != null ? numM3331x2.intValue() : 0;
                JSONArray jSONArrayOptJSONArray3 = jSONObject6.optJSONArray("items");
                if (jSONArrayOptJSONArray3 != null) {
                    arrayList = new ArrayList();
                    for (int i25 = 0; i25 < jSONArrayOptJSONArray3.length(); i25++) {
                        JSONObject jSONObjectOptJSONObject7 = jSONArrayOptJSONArray3.optJSONObject(i25);
                        if (jSONObjectOptJSONObject7 != null) {
                            try {
                                arrayList.add(new C0140o(jSONObjectOptJSONObject7));
                            } catch (JSONException unused2) {
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                iOptInt = jSONObject6.optInt("startIndex", 0);
                jOptDouble = jSONObject6.has("startTime") ? (long) (jSONObject6.optDouble("startTime", -1L) * d4) : -1L;
                arrayList2 = arrayList;
                str2 = strM825b5;
                str3 = str;
                zOptBoolean = jSONObject6.optBoolean("shuffle");
                c0138m2 = c0138m;
                i8 = i21;
            }
            C0139n c0139n = new C0139n();
            c0139n.f280g = str3;
            c0139n.f281h = strM825b;
            c0139n.f282i = i8;
            c0139n.f283j = str2;
            c0139n.f284k = c0138m2;
            c0139n.f285l = iIntValue;
            c0139n.f286m = arrayList2;
            c0139n.f287n = iOptInt;
            c0139n.f288o = jOptDouble;
            c0139n.f289p = zOptBoolean;
            this.f301B = c0139n;
            if (this.f302C != zOptBoolean) {
                this.f302C = zOptBoolean;
                i7 = i20 | 8;
            }
            if (jSONObject2.has("liveSeekableRange")) {
                i7 |= 2;
                jSONObjectOptJSONObject = jSONObject2.optJSONObject("liveSeekableRange");
                Parcelable.Creator<C0135j> creator2 = C0135j.CREATOR;
                if (jSONObjectOptJSONObject == null && jSONObjectOptJSONObject.has("start") && jSONObjectOptJSONObject.has("end")) {
                    try {
                        double d7 = jSONObjectOptJSONObject.getDouble("start");
                        Pattern pattern4 = AbstractC0295a.f786a;
                        c0135j = new C0135j((long) (d7 * d4), (long) (jSONObjectOptJSONObject.getDouble("end") * d4), jSONObjectOptJSONObject.optBoolean("isMovingWindow"), jSONObjectOptJSONObject.optBoolean("isLiveDone"));
                    } catch (JSONException unused3) {
                        C0296b c0296b3 = C0135j.f251k;
                        Log.e(c0296b3.f788a, c0296b3.m833d("Ignoring Malformed MediaLiveSeekableRange: ".concat(jSONObjectOptJSONObject.toString()), new Object[0]));
                        c0135j = null;
                    }
                } else {
                    c0135j = null;
                }
                this.f300A = c0135j;
            } else {
                if (this.f300A != null) {
                    i7 |= 2;
                }
                this.f300A = null;
            }
            return i7;
        }
        i20 = i20;
        i7 = i20;
        if (jSONObject2.has("liveSeekableRange")) {
            i7 |= 2;
            jSONObjectOptJSONObject = jSONObject2.optJSONObject("liveSeekableRange");
            Parcelable.Creator<C0135j> creator3 = C0135j.CREATOR;
            if (jSONObjectOptJSONObject == null) {
                c0135j = null;
            } else {
                double d8 = jSONObjectOptJSONObject.getDouble("start");
                Pattern pattern5 = AbstractC0295a.f786a;
                c0135j = new C0135j((long) (d8 * d4), (long) (jSONObjectOptJSONObject.getDouble("end") * d4), jSONObjectOptJSONObject.optBoolean("isMovingWindow"), jSONObjectOptJSONObject.optBoolean("isLiveDone"));
            }
            this.f300A = c0135j;
        } else {
            if (this.f300A != null) {
                i7 |= 2;
            }
            this.f300A = null;
        }
        return i7;
    }

    /* JADX INFO: renamed from: g */
    public final void m601g(ArrayList arrayList) {
        ArrayList arrayList2 = this.f320w;
        arrayList2.clear();
        SparseArray sparseArray = this.f303D;
        sparseArray.clear();
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                C0140o c0140o = (C0140o) arrayList.get(i3);
                arrayList2.add(c0140o);
                sparseArray.put(c0140o.f291h, Integer.valueOf(i3));
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f304g, Long.valueOf(this.f305h), Integer.valueOf(this.f306i), Double.valueOf(this.f307j), Integer.valueOf(this.f308k), Integer.valueOf(this.f309l), Long.valueOf(this.f310m), Long.valueOf(this.f311n), Double.valueOf(this.f312o), Boolean.valueOf(this.f313p), Integer.valueOf(Arrays.hashCode(this.f314q)), Integer.valueOf(this.f315r), Integer.valueOf(this.f316s), String.valueOf(this.f318u), Integer.valueOf(this.f319v), this.f320w, Boolean.valueOf(this.f321x), this.f322y, this.f323z, this.f300A, this.f301B});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        JSONObject jSONObject = this.f318u;
        this.f317t = jSONObject == null ? null : jSONObject.toString();
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3298U(parcel, 2, this.f304g, i3);
        long j3 = this.f305h;
        AbstractC1303m.m3311d0(parcel, 3, 8);
        parcel.writeLong(j3);
        int i4 = this.f306i;
        AbstractC1303m.m3311d0(parcel, 4, 4);
        parcel.writeInt(i4);
        double d3 = this.f307j;
        AbstractC1303m.m3311d0(parcel, 5, 8);
        parcel.writeDouble(d3);
        int i5 = this.f308k;
        AbstractC1303m.m3311d0(parcel, 6, 4);
        parcel.writeInt(i5);
        int i6 = this.f309l;
        AbstractC1303m.m3311d0(parcel, 7, 4);
        parcel.writeInt(i6);
        long j4 = this.f310m;
        AbstractC1303m.m3311d0(parcel, 8, 8);
        parcel.writeLong(j4);
        long j5 = this.f311n;
        AbstractC1303m.m3311d0(parcel, 9, 8);
        parcel.writeLong(j5);
        double d4 = this.f312o;
        AbstractC1303m.m3311d0(parcel, 10, 8);
        parcel.writeDouble(d4);
        boolean z3 = this.f313p;
        AbstractC1303m.m3311d0(parcel, 11, 4);
        parcel.writeInt(z3 ? 1 : 0);
        AbstractC1303m.m3297T(parcel, 12, this.f314q);
        int i7 = this.f315r;
        AbstractC1303m.m3311d0(parcel, 13, 4);
        parcel.writeInt(i7);
        int i8 = this.f316s;
        AbstractC1303m.m3311d0(parcel, 14, 4);
        parcel.writeInt(i8);
        AbstractC1303m.m3299V(parcel, 15, this.f317t);
        int i9 = this.f319v;
        AbstractC1303m.m3311d0(parcel, 16, 4);
        parcel.writeInt(i9);
        AbstractC1303m.m3302Y(parcel, 17, this.f320w);
        boolean z4 = this.f321x;
        AbstractC1303m.m3311d0(parcel, 18, 4);
        parcel.writeInt(z4 ? 1 : 0);
        AbstractC1303m.m3298U(parcel, 19, this.f322y, i3);
        AbstractC1303m.m3298U(parcel, 20, this.f323z, i3);
        AbstractC1303m.m3298U(parcel, 21, this.f300A, i3);
        AbstractC1303m.m3298U(parcel, 22, this.f301B, i3);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
