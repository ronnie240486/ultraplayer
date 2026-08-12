package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.AbstractC1181H;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.google.android.gms.internal.cast.C1197L;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p013E1.C0126a;
import p013E1.C0127b;
import p013E1.C0137l;
import p013E1.C0144s;
import p013E1.C0145t;
import p013E1.C0147v;
import p019G1.AbstractC0230e;
import p028J1.AbstractC0295a;
import p049Q1.AbstractC0512a;
import p057T1.AbstractC0600a;

/* JADX INFO: loaded from: classes.dex */
public class MediaInfo extends AbstractC0512a implements ReflectedParcelable {
    public static final Parcelable.Creator<MediaInfo> CREATOR;

    /* JADX INFO: renamed from: g */
    public final String f5444g;

    /* JADX INFO: renamed from: h */
    public final int f5445h;

    /* JADX INFO: renamed from: i */
    public final String f5446i;

    /* JADX INFO: renamed from: j */
    public final C0137l f5447j;

    /* JADX INFO: renamed from: k */
    public final long f5448k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f5449l;

    /* JADX INFO: renamed from: m */
    public final C0144s f5450m;

    /* JADX INFO: renamed from: n */
    public String f5451n;

    /* JADX INFO: renamed from: o */
    public ArrayList f5452o;

    /* JADX INFO: renamed from: p */
    public ArrayList f5453p;

    /* JADX INFO: renamed from: q */
    public final String f5454q;

    /* JADX INFO: renamed from: r */
    public final C0145t f5455r;

    /* JADX INFO: renamed from: s */
    public final long f5456s;

    /* JADX INFO: renamed from: t */
    public final String f5457t;

    /* JADX INFO: renamed from: u */
    public final String f5458u;

    /* JADX INFO: renamed from: v */
    public final String f5459v;

    /* JADX INFO: renamed from: w */
    public final String f5460w;

    /* JADX INFO: renamed from: x */
    public final JSONObject f5461x;

    static {
        Pattern pattern = AbstractC0295a.f786a;
        CREATOR = new C0147v(7);
    }

    public MediaInfo(String str, int i3, String str2, C0137l c0137l, long j3, ArrayList arrayList, C0144s c0144s, String str3, ArrayList arrayList2, ArrayList arrayList3, String str4, C0145t c0145t, long j4, String str5, String str6, String str7, String str8) {
        this.f5444g = str;
        this.f5445h = i3;
        this.f5446i = str2;
        this.f5447j = c0137l;
        this.f5448k = j3;
        this.f5449l = arrayList;
        this.f5450m = c0144s;
        this.f5451n = str3;
        if (str3 != null) {
            try {
                this.f5461x = new JSONObject(this.f5451n);
            } catch (JSONException unused) {
                this.f5461x = null;
                this.f5451n = null;
            }
        } else {
            this.f5461x = null;
        }
        this.f5452o = arrayList2;
        this.f5453p = arrayList3;
        this.f5454q = str4;
        this.f5455r = c0145t;
        this.f5456s = j4;
        this.f5457t = str5;
        this.f5458u = str6;
        this.f5459v = str7;
        this.f5460w = str8;
        if (this.f5444g == null && str6 == null && str4 == null) {
            throw new IllegalArgumentException("Either contentID or contentUrl or entity should be set");
        }
    }

    /* JADX INFO: renamed from: e */
    public final JSONObject m3074e() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("contentId", this.f5444g);
            jSONObject.putOpt("contentUrl", this.f5458u);
            int i3 = this.f5445h;
            if (i3 != 1) {
                str = i3 != 2 ? "NONE" : "LIVE";
            } else {
                str = "BUFFERED";
            }
            jSONObject.put("streamType", str);
            String str2 = this.f5446i;
            if (str2 != null) {
                jSONObject.put("contentType", str2);
            }
            C0137l c0137l = this.f5447j;
            if (c0137l != null) {
                jSONObject.put("metadata", c0137l.m593h());
            }
            long j3 = this.f5448k;
            if (j3 <= -1) {
                jSONObject.put("duration", JSONObject.NULL);
            } else {
                Pattern pattern = AbstractC0295a.f786a;
                jSONObject.put("duration", j3 / 1000.0d);
            }
            ArrayList arrayList = this.f5449l;
            int i4 = 0;
            if (arrayList != null) {
                JSONArray jSONArray = new JSONArray();
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    jSONArray.put(((MediaTrack) obj).m3076e());
                }
                jSONObject.put("tracks", jSONArray);
            }
            C0144s c0144s = this.f5450m;
            if (c0144s != null) {
                jSONObject.put("textTrackStyle", c0144s.m604e());
            }
            JSONObject jSONObject2 = this.f5461x;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
            String str3 = this.f5454q;
            if (str3 != null) {
                jSONObject.put("entity", str3);
            }
            if (this.f5452o != null) {
                JSONArray jSONArray2 = new JSONArray();
                ArrayList arrayList2 = this.f5452o;
                int size2 = arrayList2.size();
                int i6 = 0;
                while (i6 < size2) {
                    Object obj2 = arrayList2.get(i6);
                    i6++;
                    jSONArray2.put(((C0127b) obj2).m588e());
                }
                jSONObject.put("breaks", jSONArray2);
            }
            if (this.f5453p != null) {
                JSONArray jSONArray3 = new JSONArray();
                ArrayList arrayList3 = this.f5453p;
                int size3 = arrayList3.size();
                while (i4 < size3) {
                    Object obj3 = arrayList3.get(i4);
                    i4++;
                    jSONArray3.put(((C0126a) obj3).m587e());
                }
                jSONObject.put("breakClips", jSONArray3);
            }
            C0145t c0145t = this.f5455r;
            if (c0145t != null) {
                jSONObject.put("vmapAdsRequest", c0145t.m605e());
            }
            long j4 = this.f5456s;
            if (j4 != -1) {
                Pattern pattern2 = AbstractC0295a.f786a;
                jSONObject.put("startAbsoluteTime", j4 / 1000.0d);
            }
            jSONObject.putOpt("atvEntity", this.f5457t);
            String str4 = this.f5459v;
            if (str4 != null) {
                jSONObject.put("hlsSegmentFormat", str4);
            }
            String str5 = this.f5460w;
            if (str5 != null) {
                jSONObject.put("hlsVideoSegmentFormat", str5);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MediaInfo) {
                MediaInfo mediaInfo = (MediaInfo) obj;
                JSONObject jSONObject = this.f5461x;
                boolean z3 = jSONObject == null;
                JSONObject jSONObject2 = mediaInfo.f5461x;
                if (z3 == (jSONObject2 == null) && ((jSONObject == null || jSONObject2 == null || AbstractC0600a.m1464a(jSONObject, jSONObject2)) && AbstractC0295a.m828e(this.f5444g, mediaInfo.f5444g) && this.f5445h == mediaInfo.f5445h && AbstractC0295a.m828e(this.f5446i, mediaInfo.f5446i) && AbstractC0295a.m828e(this.f5447j, mediaInfo.f5447j) && this.f5448k == mediaInfo.f5448k && AbstractC0295a.m828e(this.f5449l, mediaInfo.f5449l) && AbstractC0295a.m828e(this.f5450m, mediaInfo.f5450m) && AbstractC0295a.m828e(this.f5452o, mediaInfo.f5452o) && AbstractC0295a.m828e(this.f5453p, mediaInfo.f5453p) && AbstractC0295a.m828e(this.f5454q, mediaInfo.f5454q) && AbstractC0295a.m828e(this.f5455r, mediaInfo.f5455r) && this.f5456s == mediaInfo.f5456s && AbstractC0295a.m828e(this.f5457t, mediaInfo.f5457t) && AbstractC0295a.m828e(this.f5458u, mediaInfo.f5458u) && AbstractC0295a.m828e(this.f5459v, mediaInfo.f5459v) && AbstractC0295a.m828e(this.f5460w, mediaInfo.f5460w))) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b9 A[LOOP:0: B:5:0x0024->B:33:0x00b9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x00c2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: f */
    public final void m3075f(JSONObject jSONObject) throws JSONException {
        long j3;
        C0126a c0126a;
        C0127b c0127b;
        long j4 = 1000;
        if (jSONObject.has("breaks")) {
            JSONArray jSONArray = jSONObject.getJSONArray("breaks");
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int i3 = 0;
            while (true) {
                if (i3 >= jSONArray.length()) {
                    j3 = j4;
                    break;
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                if (jSONObject2 != null && jSONObject2.has("id") && jSONObject2.has("position")) {
                    try {
                        String string = jSONObject2.getString("id");
                        long j5 = jSONObject2.getLong("position");
                        Pattern pattern = AbstractC0295a.f786a;
                        long j6 = j5 * j4;
                        boolean zOptBoolean = jSONObject2.optBoolean("isWatched");
                        long jOptLong = jSONObject2.optLong("duration") * j4;
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("breakClipIds");
                        String[] strArr = new String[0];
                        if (jSONArrayOptJSONArray != null) {
                            strArr = new String[jSONArrayOptJSONArray.length()];
                            j3 = j4;
                            for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                                try {
                                    strArr[i4] = jSONArrayOptJSONArray.getString(i4);
                                } catch (JSONException e3) {
                                    e = e3;
                                    String message = e.getMessage();
                                    Locale locale = Locale.ROOT;
                                    Log.d("AdBreakInfo", "Error while creating an AdBreakInfo from JSON: " + message);
                                    c0127b = null;
                                }
                            }
                        } else {
                            j3 = j4;
                        }
                        c0127b = new C0127b(j6, string, jOptLong, zOptBoolean, strArr, jSONObject2.optBoolean("isEmbedded"), jSONObject2.optBoolean("expanded"));
                    } catch (JSONException e4) {
                        e = e4;
                        j3 = j4;
                    }
                    if (c0127b != null) {
                        arrayList.clear();
                        break;
                    } else {
                        arrayList.add(c0127b);
                        i3++;
                        j4 = j3;
                    }
                } else {
                    j3 = j4;
                }
                c0127b = null;
                if (c0127b != null) {
                    arrayList.clear();
                    break;
                } else {
                    arrayList.add(c0127b);
                    i3++;
                    j4 = j3;
                }
            }
            this.f5452o = new ArrayList(arrayList);
        } else {
            j3 = 1000;
        }
        if (jSONObject.has("breakClips")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("breakClips");
            ArrayList arrayList2 = new ArrayList(jSONArray2.length());
            for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                JSONObject jSONObject3 = jSONArray2.getJSONObject(i5);
                if (jSONObject3 != null && jSONObject3.has("id")) {
                    try {
                        String string2 = jSONObject3.getString("id");
                        long jOptLong2 = jSONObject3.optLong("duration") * j3;
                        String strM825b = AbstractC0295a.m825b(jSONObject3, "clickThroughUrl");
                        String strM825b2 = AbstractC0295a.m825b(jSONObject3, "contentUrl");
                        String strM825b3 = AbstractC0295a.m825b(jSONObject3, "mimeType");
                        if (strM825b3 == null) {
                            strM825b3 = AbstractC0295a.m825b(jSONObject3, "contentType");
                        }
                        String str = strM825b3;
                        String strM825b4 = AbstractC0295a.m825b(jSONObject3, "title");
                        JSONObject jSONObjectOptJSONObject = jSONObject3.optJSONObject("customData");
                        String strM825b5 = AbstractC0295a.m825b(jSONObject3, "contentId");
                        String strM825b6 = AbstractC0295a.m825b(jSONObject3, "posterUrl");
                        long jIntValue = jSONObject3.has("whenSkippable") ? ((long) ((Integer) jSONObject3.get("whenSkippable")).intValue()) * j3 : -1L;
                        String strM825b7 = AbstractC0295a.m825b(jSONObject3, "hlsSegmentFormat");
                        JSONObject jSONObjectOptJSONObject2 = jSONObject3.optJSONObject("vastAdsRequest");
                        c0126a = new C0126a(string2, strM825b4, jOptLong2, strM825b2, str, strM825b, (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() == 0) ? null : jSONObjectOptJSONObject.toString(), strM825b5, strM825b6, jIntValue, strM825b7, jSONObjectOptJSONObject2 == null ? null : new C0145t(AbstractC0295a.m825b(jSONObjectOptJSONObject2, "adTagUrl"), AbstractC0295a.m825b(jSONObjectOptJSONObject2, "adsResponse")));
                    } catch (JSONException e5) {
                        String message2 = e5.getMessage();
                        Locale locale2 = Locale.ROOT;
                        Log.d("AdBreakClipInfo", "Error while creating an AdBreakClipInfo from JSON: " + message2);
                        c0126a = null;
                    }
                } else {
                    c0126a = null;
                }
                if (c0126a == null) {
                    arrayList2.clear();
                    break;
                }
                arrayList2.add(c0126a);
            }
            this.f5453p = new ArrayList(arrayList2);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5444g, Integer.valueOf(this.f5445h), this.f5446i, this.f5447j, Long.valueOf(this.f5448k), String.valueOf(this.f5461x), this.f5449l, this.f5450m, this.f5452o, this.f5453p, this.f5454q, this.f5455r, Long.valueOf(this.f5456s), this.f5457t, this.f5459v, this.f5460w});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        JSONObject jSONObject = this.f5461x;
        this.f5451n = jSONObject == null ? null : jSONObject.toString();
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        String str = this.f5444g;
        if (str == null) {
            str = "";
        }
        AbstractC1303m.m3299V(parcel, 2, str);
        AbstractC1303m.m3311d0(parcel, 3, 4);
        parcel.writeInt(this.f5445h);
        AbstractC1303m.m3299V(parcel, 4, this.f5446i);
        AbstractC1303m.m3298U(parcel, 5, this.f5447j, i3);
        AbstractC1303m.m3311d0(parcel, 6, 8);
        parcel.writeLong(this.f5448k);
        AbstractC1303m.m3302Y(parcel, 7, this.f5449l);
        AbstractC1303m.m3298U(parcel, 8, this.f5450m, i3);
        AbstractC1303m.m3299V(parcel, 9, this.f5451n);
        ArrayList arrayList = this.f5452o;
        AbstractC1303m.m3302Y(parcel, 10, arrayList == null ? null : Collections.unmodifiableList(arrayList));
        ArrayList arrayList2 = this.f5453p;
        AbstractC1303m.m3302Y(parcel, 11, arrayList2 != null ? Collections.unmodifiableList(arrayList2) : null);
        AbstractC1303m.m3299V(parcel, 12, this.f5454q);
        AbstractC1303m.m3298U(parcel, 13, this.f5455r, i3);
        AbstractC1303m.m3311d0(parcel, 14, 8);
        parcel.writeLong(this.f5456s);
        AbstractC1303m.m3299V(parcel, 15, this.f5457t);
        AbstractC1303m.m3299V(parcel, 16, this.f5458u);
        AbstractC1303m.m3299V(parcel, 17, this.f5459v);
        AbstractC1303m.m3299V(parcel, 18, this.f5460w);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }

    public MediaInfo(JSONObject jSONObject) throws JSONException {
        int i3;
        int i4;
        int i5;
        C1197L c1197lM3142k;
        this(jSONObject.optString("contentId"), -1, null, null, -1L, null, null, null, null, null, null, null, -1L, null, null, null, null);
        String strOptString = jSONObject.optString("streamType", "NONE");
        if ("NONE".equals(strOptString)) {
            this.f5445h = 0;
        } else if ("BUFFERED".equals(strOptString)) {
            this.f5445h = 1;
        } else if ("LIVE".equals(strOptString)) {
            this.f5445h = 2;
        } else {
            this.f5445h = -1;
        }
        this.f5446i = AbstractC0295a.m825b(jSONObject, "contentType");
        if (jSONObject.has("metadata")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            C0137l c0137l = new C0137l(jSONObject2.getInt("metadataType"));
            this.f5447j = c0137l;
            c0137l.m594i(jSONObject2);
        }
        this.f5448k = -1L;
        if (this.f5445h != 2 && jSONObject.has("duration") && !jSONObject.isNull("duration")) {
            double dOptDouble = jSONObject.optDouble("duration", 0.0d);
            if (!Double.isNaN(dOptDouble) && !Double.isInfinite(dOptDouble) && dOptDouble >= 0.0d) {
                this.f5448k = (long) (dOptDouble * 1000.0d);
            }
        }
        int i6 = 4;
        if (jSONObject.has("tracks")) {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.getJSONArray("tracks");
            int i7 = 0;
            while (i7 < jSONArray.length()) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i7);
                long j3 = jSONObject3.getLong("trackId");
                String strOptString2 = jSONObject3.optString("type");
                if ("TEXT".equals(strOptString2)) {
                    i4 = 1;
                } else if ("AUDIO".equals(strOptString2)) {
                    i4 = 2;
                } else {
                    i4 = "VIDEO".equals(strOptString2) ? 3 : 0;
                }
                String strM825b = AbstractC0295a.m825b(jSONObject3, "trackContentId");
                String strM825b2 = AbstractC0295a.m825b(jSONObject3, "trackContentType");
                String strM825b3 = AbstractC0295a.m825b(jSONObject3, "name");
                String strM825b4 = AbstractC0295a.m825b(jSONObject3, "language");
                if (jSONObject3.has("subtype")) {
                    String string = jSONObject3.getString("subtype");
                    if ("SUBTITLES".equals(string)) {
                        i5 = 1;
                    } else if ("CAPTIONS".equals(string)) {
                        i5 = 2;
                    } else if ("DESCRIPTIONS".equals(string)) {
                        i5 = 3;
                    } else if ("CHAPTERS".equals(string)) {
                        i5 = 4;
                    } else {
                        i5 = "METADATA".equals(string) ? 5 : -1;
                    }
                } else {
                    i5 = 0;
                }
                if (jSONObject3.has("roles")) {
                    Object[] objArrCopyOf = new Object[i6];
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roles");
                    int i8 = 0;
                    int i9 = 0;
                    while (i8 < jSONArray2.length()) {
                        String strOptString3 = jSONArray2.optString(i8);
                        strOptString3.getClass();
                        int i10 = i9 + 1;
                        int length = objArrCopyOf.length;
                        if (length < i10) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, AbstractC0230e.m746z(length, i10));
                        }
                        objArrCopyOf[i9] = strOptString3;
                        i8++;
                        i9 = i10;
                    }
                    c1197lM3142k = AbstractC1181H.m3142k(i9, objArrCopyOf);
                } else {
                    c1197lM3142k = null;
                }
                arrayList.add(new MediaTrack(j3, i4, strM825b, strM825b2, strM825b3, strM825b4, i5, c1197lM3142k, jSONObject3.optJSONObject("customData")));
                i7++;
                i6 = 4;
            }
            this.f5449l = new ArrayList(arrayList);
        } else {
            this.f5449l = null;
        }
        if (jSONObject.has("textTrackStyle")) {
            JSONObject jSONObject4 = jSONObject.getJSONObject("textTrackStyle");
            C0144s c0144s = new C0144s(1.0f, 0, 0, -1, 0, -1, 0, 0, null, -1, -1, null);
            c0144s.f327g = (float) jSONObject4.optDouble("fontScale", 1.0d);
            c0144s.f328h = C0144s.m602f(jSONObject4.optString("foregroundColor"));
            c0144s.f329i = C0144s.m602f(jSONObject4.optString("backgroundColor"));
            if (jSONObject4.has("edgeType")) {
                String string2 = jSONObject4.getString("edgeType");
                if ("NONE".equals(string2)) {
                    c0144s.f330j = 0;
                } else if ("OUTLINE".equals(string2)) {
                    c0144s.f330j = 1;
                } else if ("DROP_SHADOW".equals(string2)) {
                    c0144s.f330j = 2;
                } else if ("RAISED".equals(string2)) {
                    c0144s.f330j = 3;
                } else if ("DEPRESSED".equals(string2)) {
                    c0144s.f330j = 4;
                }
            }
            c0144s.f331k = C0144s.m602f(jSONObject4.optString("edgeColor"));
            if (jSONObject4.has("windowType")) {
                String string3 = jSONObject4.getString("windowType");
                if ("NONE".equals(string3)) {
                    c0144s.f332l = 0;
                } else if ("NORMAL".equals(string3)) {
                    c0144s.f332l = 1;
                } else if ("ROUNDED_CORNERS".equals(string3)) {
                    i3 = 2;
                    c0144s.f332l = 2;
                }
                i3 = 2;
            } else {
                i3 = 2;
            }
            c0144s.f333m = C0144s.m602f(jSONObject4.optString("windowColor"));
            if (c0144s.f332l == i3) {
                c0144s.f334n = jSONObject4.optInt("windowRoundedCornerRadius", 0);
            }
            c0144s.f335o = AbstractC0295a.m825b(jSONObject4, "fontFamily");
            if (jSONObject4.has("fontGenericFamily")) {
                String string4 = jSONObject4.getString("fontGenericFamily");
                if ("SANS_SERIF".equals(string4)) {
                    c0144s.f336p = 0;
                } else if ("MONOSPACED_SANS_SERIF".equals(string4)) {
                    c0144s.f336p = 1;
                } else if ("SERIF".equals(string4)) {
                    c0144s.f336p = 2;
                } else if ("MONOSPACED_SERIF".equals(string4)) {
                    c0144s.f336p = 3;
                } else if ("CASUAL".equals(string4)) {
                    c0144s.f336p = 4;
                } else if ("CURSIVE".equals(string4)) {
                    c0144s.f336p = 5;
                } else if ("SMALL_CAPITALS".equals(string4)) {
                    c0144s.f336p = 6;
                }
            }
            if (jSONObject4.has("fontStyle")) {
                String string5 = jSONObject4.getString("fontStyle");
                if ("NORMAL".equals(string5)) {
                    c0144s.f337q = 0;
                } else if ("BOLD".equals(string5)) {
                    c0144s.f337q = 1;
                } else if ("ITALIC".equals(string5)) {
                    c0144s.f337q = 2;
                } else if ("BOLD_ITALIC".equals(string5)) {
                    c0144s.f337q = 3;
                }
            }
            c0144s.f339s = jSONObject4.optJSONObject("customData");
            this.f5450m = c0144s;
        } else {
            this.f5450m = null;
        }
        m3075f(jSONObject);
        this.f5461x = jSONObject.optJSONObject("customData");
        this.f5454q = AbstractC0295a.m825b(jSONObject, "entity");
        this.f5457t = AbstractC0295a.m825b(jSONObject, "atvEntity");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("vmapAdsRequest");
        this.f5455r = jSONObjectOptJSONObject != null ? new C0145t(AbstractC0295a.m825b(jSONObjectOptJSONObject, "adTagUrl"), AbstractC0295a.m825b(jSONObjectOptJSONObject, "adsResponse")) : null;
        if (jSONObject.has("startAbsoluteTime") && !jSONObject.isNull("startAbsoluteTime")) {
            double dOptDouble2 = jSONObject.optDouble("startAbsoluteTime");
            if (!Double.isNaN(dOptDouble2) && !Double.isInfinite(dOptDouble2) && dOptDouble2 >= 0) {
                this.f5456s = (long) (dOptDouble2 * 1000.0d);
            }
        }
        if (jSONObject.has("contentUrl")) {
            this.f5458u = jSONObject.optString("contentUrl");
        }
        this.f5459v = AbstractC0295a.m825b(jSONObject, "hlsSegmentFormat");
        this.f5460w = AbstractC0295a.m825b(jSONObject, "hlsVideoSegmentFormat");
    }
}
