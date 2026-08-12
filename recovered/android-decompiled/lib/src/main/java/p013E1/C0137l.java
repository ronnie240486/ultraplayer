package p013E1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0858A;
import android.text.TextUtils;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p028J1.AbstractC0295a;
import p031K1.AbstractC0336a;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: E1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0137l extends AbstractC0512a {

    /* JADX INFO: renamed from: k */
    public static final C0858A f271k;

    /* JADX INFO: renamed from: g */
    public final ArrayList f272g;

    /* JADX INFO: renamed from: h */
    public final Bundle f273h;

    /* JADX INFO: renamed from: i */
    public int f274i;

    /* JADX INFO: renamed from: j */
    public static final String[] f270j = {"none", "String", "int", "double", "ISO-8601 date String", "Time in milliseconds as long"};
    public static final Parcelable.Creator<C0137l> CREATOR = new C0147v(11);

    static {
        C0858A c0858a = new C0858A(6);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.CREATION_DATE", "creationDateTime", 4);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.RELEASE_DATE", "releaseDate", 4);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.BROADCAST_DATE", "originalAirdate", 4);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.TITLE", "title", 1);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.SUBTITLE", "subtitle", 1);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.ARTIST", "artist", 1);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.ALBUM_ARTIST", "albumArtist", 1);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.ALBUM_TITLE", "albumName", 1);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.COMPOSER", "composer", 1);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.DISC_NUMBER", "discNumber", 2);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.TRACK_NUMBER", "trackNumber", 2);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.SEASON_NUMBER", "season", 2);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.EPISODE_NUMBER", "episode", 2);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.SERIES_TITLE", "seriesTitle", 1);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.STUDIO", "studio", 1);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.WIDTH", "width", 2);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.HEIGHT", "height", 2);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.LOCATION_NAME", "location", 1);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "latitude", 3);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "longitude", 3);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.SECTION_DURATION", "sectionDuration", 5);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "sectionStartTimeInMedia", 5);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "sectionStartAbsoluteTime", 5);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "sectionStartTimeInContainer", 5);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.QUEUE_ITEM_ID", "queueItemId", 2);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.BOOK_TITLE", "bookTitle", 1);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "chapterNumber", 2);
        c0858a.m2176Z("com.google.android.gms.cast.metadata.CHAPTER_TITLE", "chapterTitle", 1);
        f271k = c0858a;
    }

    public C0137l(ArrayList arrayList, Bundle bundle, int i3) {
        this.f272g = arrayList;
        this.f273h = bundle;
        this.f274i = i3;
    }

    /* JADX INFO: renamed from: g */
    public static void m589g(int i3, String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("null and empty keys are not allowed");
        }
        Integer num = (Integer) ((HashMap) f271k.f3641j).get(str);
        int iIntValue = num != null ? num.intValue() : 0;
        if (iIntValue == i3 || iIntValue == 0) {
            return;
        }
        throw new IllegalArgumentException("Value for " + str + " must be a " + f270j[i3]);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m590j(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !m590j((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final String m591e(String str) {
        m589g(1, str);
        return this.f273h.getString(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0137l)) {
            return false;
        }
        C0137l c0137l = (C0137l) obj;
        return m590j(this.f273h, c0137l.f273h) && this.f272g.equals(c0137l.f272g);
    }

    /* JADX INFO: renamed from: f */
    public final void m592f(String str, String str2) {
        m589g(1, str);
        this.f273h.putString(str, str2);
    }

    /* JADX INFO: renamed from: h */
    public final JSONObject m593h() {
        ArrayList arrayList;
        int size;
        int i3;
        Bundle bundle;
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("metadataType", this.f274i);
                while (true) {
                    bundle = this.f273h;
                    if (i3 >= size) {
                        break;
                    }
                    Object obj = arrayList.get(i3);
                    i3++;
                    String str = (String) obj;
                    if (str != null && bundle.containsKey(str)) {
                        C0858A c0858a = f271k;
                        String str2 = (String) ((HashMap) c0858a.f3639h).get(str);
                        if (str2 != null) {
                            Integer num = (Integer) ((HashMap) c0858a.f3641j).get(str);
                            int iIntValue = num != null ? num.intValue() : 0;
                            if (iIntValue != 1) {
                                if (iIntValue == 2) {
                                    jSONObject.put(str2, bundle.getInt(str));
                                } else if (iIntValue == 3) {
                                    jSONObject.put(str2, bundle.getDouble(str));
                                } else if (iIntValue != 4) {
                                    if (iIntValue == 5) {
                                        long j3 = bundle.getLong(str);
                                        Pattern pattern = AbstractC0295a.f786a;
                                        jSONObject.put(str2, j3 / 1000.0d);
                                    }
                                }
                            }
                            jSONObject.put(str2, bundle.getString(str));
                        }
                    }
                }
            } catch (JSONException unused) {
            }
            size = arrayList.size();
            i3 = 0;
            for (String str3 : bundle.keySet()) {
                if (!str3.startsWith("com.google.")) {
                    Object obj2 = bundle.get(str3);
                    if (obj2 instanceof String) {
                        jSONObject.put(str3, obj2);
                    } else if (obj2 instanceof Integer) {
                        jSONObject.put(str3, obj2);
                    } else if (obj2 instanceof Double) {
                        jSONObject.put(str3, obj2);
                    }
                }
            }
        } catch (JSONException unused2) {
        }
        JSONArray jSONArrayM939b = AbstractC0336a.m939b(this.f272g);
        if (jSONArrayM939b.length() != 0) {
            try {
                jSONObject.put("images", jSONArrayM939b);
            } catch (JSONException unused3) {
            }
        }
        arrayList = new ArrayList();
        int i4 = this.f274i;
        if (i4 == 0) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i4 == 1) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i4 == 2) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i4 == 3) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i4 == 4) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i4 == 5) {
            Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        return jSONObject;
    }

    public final int hashCode() {
        int iHashCode = 17;
        Bundle bundle = this.f273h;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
            }
        }
        return this.f272g.hashCode() + (iHashCode * 31);
    }

    /* JADX INFO: renamed from: i */
    public final void m594i(JSONObject jSONObject) {
        HashSet hashSet;
        Bundle bundle = this.f273h;
        bundle.clear();
        ArrayList arrayList = this.f272g;
        arrayList.clear();
        this.f274i = 0;
        try {
            this.f274i = jSONObject.getInt("metadataType");
        } catch (JSONException unused) {
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            AbstractC0336a.m940c(arrayList, jSONArrayOptJSONArray);
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = this.f274i;
        if (i3 == 0) {
            Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i3 == 1) {
            Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i3 == 2) {
            Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE");
        } else if (i3 == 3) {
            Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE");
        } else if (i3 == 4) {
            Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE");
        } else if (i3 == 5) {
            Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.CHAPTER_TITLE", "com.google.android.gms.cast.metadata.CHAPTER_NUMBER", "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.BOOK_TITLE", "com.google.android.gms.cast.metadata.SUBTITLE");
        }
        Collections.addAll(arrayList2, "com.google.android.gms.cast.metadata.SECTION_DURATION", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_MEDIA", "com.google.android.gms.cast.metadata.SECTION_START_ABSOLUTE_TIME", "com.google.android.gms.cast.metadata.SECTION_START_TIME_IN_CONTAINER", "com.google.android.gms.cast.metadata.QUEUE_ITEM_ID");
        HashSet hashSet2 = new HashSet(arrayList2);
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && !"metadataType".equals(next)) {
                    C0858A c0858a = f271k;
                    String str = (String) ((HashMap) c0858a.f3640i).get(next);
                    if (str == null) {
                        hashSet = hashSet2;
                        Object obj = jSONObject.get(next);
                        if (obj instanceof String) {
                            bundle.putString(next, (String) obj);
                        } else if (obj instanceof Integer) {
                            bundle.putInt(next, ((Integer) obj).intValue());
                        } else if (obj instanceof Double) {
                            bundle.putDouble(next, ((Double) obj).doubleValue());
                        }
                    } else if (hashSet2.contains(str)) {
                        try {
                            Object obj2 = jSONObject.get(next);
                            if (obj2 != null) {
                                Integer num = (Integer) ((HashMap) c0858a.f3641j).get(str);
                                int iIntValue = num != null ? num.intValue() : 0;
                                if (iIntValue == 1) {
                                    hashSet = hashSet2;
                                    if (obj2 instanceof String) {
                                        bundle.putString(str, (String) obj2);
                                    }
                                } else if (iIntValue == 2) {
                                    hashSet = hashSet2;
                                    if (obj2 instanceof Integer) {
                                        bundle.putInt(str, ((Integer) obj2).intValue());
                                    }
                                } else if (iIntValue == 3) {
                                    hashSet = hashSet2;
                                    double dOptDouble = jSONObject.optDouble(next);
                                    if (!Double.isNaN(dOptDouble)) {
                                        bundle.putDouble(str, dOptDouble);
                                    }
                                } else if (iIntValue == 4) {
                                    hashSet = hashSet2;
                                    if (obj2 instanceof String) {
                                        String str2 = (String) obj2;
                                        if (AbstractC0336a.m938a(str2) != null) {
                                            bundle.putString(str, str2);
                                        }
                                    }
                                } else if (iIntValue == 5) {
                                    long jOptLong = jSONObject.optLong(next);
                                    Pattern pattern = AbstractC0295a.f786a;
                                    hashSet = hashSet2;
                                    try {
                                        bundle.putLong(str, jOptLong * 1000);
                                    } catch (JSONException unused2) {
                                    }
                                }
                            }
                        } catch (JSONException unused3) {
                            hashSet = hashSet2;
                        }
                    }
                    hashSet2 = hashSet;
                }
            }
        } catch (JSONException unused4) {
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3302Y(parcel, 2, this.f272g);
        AbstractC1303m.m3294Q(parcel, 3, this.f273h);
        int i4 = this.f274i;
        AbstractC1303m.m3311d0(parcel, 4, 4);
        parcel.writeInt(i4);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }

    public C0137l(int i3) {
        this(new ArrayList(), new Bundle(), i3);
    }
}
