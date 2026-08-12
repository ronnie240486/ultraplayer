package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007C0.C0101a;
import p046P1.AbstractC0491s;
import p049Q1.AbstractC0512a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractC0512a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C0101a(1);

    /* JADX INFO: renamed from: g */
    public final int f5406g;

    /* JADX INFO: renamed from: h */
    public final String f5407h;

    /* JADX INFO: renamed from: i */
    public final String f5408i;

    /* JADX INFO: renamed from: j */
    public final String f5409j;

    /* JADX INFO: renamed from: k */
    public final String f5410k;

    /* JADX INFO: renamed from: l */
    public final Uri f5411l;

    /* JADX INFO: renamed from: m */
    public String f5412m;

    /* JADX INFO: renamed from: n */
    public final long f5413n;

    /* JADX INFO: renamed from: o */
    public final String f5414o;

    /* JADX INFO: renamed from: p */
    public final ArrayList f5415p;

    /* JADX INFO: renamed from: q */
    public final String f5416q;

    /* JADX INFO: renamed from: r */
    public final String f5417r;

    /* JADX INFO: renamed from: s */
    public final HashSet f5418s = new HashSet();

    public GoogleSignInAccount(int i3, String str, String str2, String str3, String str4, Uri uri, String str5, long j3, String str6, ArrayList arrayList, String str7, String str8) {
        this.f5406g = i3;
        this.f5407h = str;
        this.f5408i = str2;
        this.f5409j = str3;
        this.f5410k = str4;
        this.f5411l = uri;
        this.f5412m = str5;
        this.f5413n = j3;
        this.f5414o = str6;
        this.f5415p = arrayList;
        this.f5416q = str7;
        this.f5417r = str8;
    }

    /* JADX INFO: renamed from: e */
    public static GoogleSignInAccount m3069e(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j3 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i3 = 0; i3 < length; i3++) {
            hashSet.add(new Scope(1, jSONArray.getString(i3)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        AbstractC0491s.m1211c(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j3, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f5412m = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f5414o.equals(this.f5414o)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f5415p);
        hashSet.addAll(googleSignInAccount.f5418s);
        HashSet hashSet2 = new HashSet(this.f5415p);
        hashSet2.addAll(this.f5418s);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.f5414o.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f5415p);
        hashSet.addAll(this.f5418s);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int iM3305a0 = AbstractC1303m.m3305a0(parcel, 20293);
        AbstractC1303m.m3311d0(parcel, 1, 4);
        parcel.writeInt(this.f5406g);
        AbstractC1303m.m3299V(parcel, 2, this.f5407h);
        AbstractC1303m.m3299V(parcel, 3, this.f5408i);
        AbstractC1303m.m3299V(parcel, 4, this.f5409j);
        AbstractC1303m.m3299V(parcel, 5, this.f5410k);
        AbstractC1303m.m3298U(parcel, 6, this.f5411l, i3);
        AbstractC1303m.m3299V(parcel, 7, this.f5412m);
        AbstractC1303m.m3311d0(parcel, 8, 8);
        parcel.writeLong(this.f5413n);
        AbstractC1303m.m3299V(parcel, 9, this.f5414o);
        AbstractC1303m.m3302Y(parcel, 10, this.f5415p);
        AbstractC1303m.m3299V(parcel, 11, this.f5416q);
        AbstractC1303m.m3299V(parcel, 12, this.f5417r);
        AbstractC1303m.m3309c0(parcel, iM3305a0);
    }
}
