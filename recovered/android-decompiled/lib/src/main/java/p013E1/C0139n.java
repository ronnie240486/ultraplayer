package p013E1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p028J1.AbstractC0295a;
import p046P1.AbstractC0491s;
import p049Q1.AbstractC0512a;

/* JADX INFO: renamed from: E1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0139n extends AbstractC0512a {
    public static final Parcelable.Creator<C0139n> CREATOR = new C0147v(13);

    /* JADX INFO: renamed from: g */
    public String f280g;

    /* JADX INFO: renamed from: h */
    public String f281h;

    /* JADX INFO: renamed from: i */
    public int f282i;

    /* JADX INFO: renamed from: j */
    public String f283j;

    /* JADX INFO: renamed from: k */
    public C0138m f284k;

    /* JADX INFO: renamed from: l */
    public int f285l;

    /* JADX INFO: renamed from: m */
    public ArrayList f286m;

    /* JADX INFO: renamed from: n */
    public int f287n;

    /* JADX INFO: renamed from: o */
    public long f288o;

    /* JADX INFO: renamed from: p */
    public boolean f289p;

    /* JADX INFO: renamed from: e */
    public final JSONObject m596e() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f280g)) {
                jSONObject.put("id", this.f280g);
            }
            if (!TextUtils.isEmpty(this.f281h)) {
                jSONObject.put("entity", this.f281h);
            }
            switch (this.f282i) {
                case 1:
                    jSONObject.put("queueType", "ALBUM");
                    break;
                case 2:
                    jSONObject.put("queueType", "PLAYLIST");
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    jSONObject.put("queueType", "AUDIOBOOK");
                    break;
                case 4:
                    jSONObject.put("queueType", "RADIO_STATION");
                    break;
                case 5:
                    jSONObject.put("queueType", "PODCAST_SERIES");
                    break;
                case 6:
                    jSONObject.put("queueType", "TV_SERIES");
                    break;
                case 7:
                    jSONObject.put("queueType", "VIDEO_PLAYLIST");
                    break;
                case 8:
                    jSONObject.put("queueType", "LIVE_TV");
                    break;
                case 9:
                    jSONObject.put("queueType", "MOVIE");
                    break;
            }
            if (!TextUtils.isEmpty(this.f283j)) {
                jSONObject.put("name", this.f283j);
            }
            C0138m c0138m = this.f284k;
            if (c0138m != null) {
                jSONObject.put("containerMetadata", c0138m.m595e());
            }
            String strM3307b0 = AbstractC1303m.m3307b0(Integer.valueOf(this.f285l));
            if (strM3307b0 != null) {
                jSONObject.put("repeatMode", strM3307b0);
            }
            ArrayList arrayList = this.f286m;
            if (arrayList != null && !arrayList.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                ArrayList arrayList2 = this.f286m;
                int size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList2.get(i3);
                    i3++;
                    jSONArray.put(((C0140o) obj).m598f());
                }
                jSONObject.put("items", jSONArray);
            }
            jSONObject.put("startIndex", this.f287n);
            long j3 = this.f288o;
            if (j3 != -1) {
                Pattern pattern = AbstractC0295a.f786a;
                jSONObject.put("startTime", j3 / 1000.0d);
            }
            jSONObject.put("shuffle", this.f289p);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0139n)) {
            return false;
        }
        C0139n c0139n = (C0139n) obj;
        return TextUtils.equals(this.f280g, c0139n.f280g) && TextUtils.equals(this.f281h, c0139n.f281h) && this.f282i == c0139n.f282i && TextUtils.equals(this.f283j, c0139n.f283j) && AbstractC0491s.m1216h(this.f284k, c0139n.f284k) && this.f285l == c0139n.f285l && AbstractC0491s.m1216h(this.f286m, c0139n.f286m) && this.f287n == c0139n.f287n && this.f288o == c0139n.f288o && this.f289p == c0139n.f289p;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f280g, this.f281h, Integer.valueOf(this.f282i), this.f283j, this.f284k, Integer.valueOf(this.f285l), this.f286m, Integer.valueOf(this.f287n), Long.valueOf(this.f288o), Boolean.valueOf(this.f289p)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3299V(parcel, 2, this.f280g);
        AbstractC1303m.m3299V(parcel, 3, this.f281h);
        int i4 = this.f282i;
        AbstractC1303m.m3311d0(parcel, 4, 4);
        parcel.writeInt(i4);
        AbstractC1303m.m3299V(parcel, 5, this.f283j);
        AbstractC1303m.m3298U(parcel, 6, this.f284k, i3);
        int i5 = this.f285l;
        AbstractC1303m.m3311d0(parcel, 7, 4);
        parcel.writeInt(i5);
        ArrayList arrayList = this.f286m;
        AbstractC1303m.m3302Y(parcel, 8, arrayList == null ? null : Collections.unmodifiableList(arrayList));
        int i6 = this.f287n;
        AbstractC1303m.m3311d0(parcel, 9, 4);
        parcel.writeInt(i6);
        long j3 = this.f288o;
        AbstractC1303m.m3311d0(parcel, 10, 8);
        parcel.writeLong(j3);
        boolean z3 = this.f289p;
        AbstractC1303m.m3311d0(parcel, 11, 4);
        parcel.writeInt(z3 ? 1 : 0);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
