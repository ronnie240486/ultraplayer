package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0858A;
import p076a.C0787c;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0787c(2);

    /* JADX INFO: renamed from: g */
    public final String f3618g;

    /* JADX INFO: renamed from: h */
    public final CharSequence f3619h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f3620i;

    /* JADX INFO: renamed from: j */
    public final CharSequence f3621j;

    /* JADX INFO: renamed from: k */
    public final Bitmap f3622k;

    /* JADX INFO: renamed from: l */
    public final Uri f3623l;

    /* JADX INFO: renamed from: m */
    public final Bundle f3624m;

    /* JADX INFO: renamed from: n */
    public final Uri f3625n;

    /* JADX INFO: renamed from: o */
    public MediaDescription f3626o;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f3618g = str;
        this.f3619h = charSequence;
        this.f3620i = charSequence2;
        this.f3621j = charSequence3;
        this.f3622k = bitmap;
        this.f3623l = uri;
        this.f3624m = bundle;
        this.f3625n = uri2;
    }

    /* JADX INFO: renamed from: d */
    public static MediaDescriptionCompat m2117d(Object obj) {
        Bundle bundle;
        if (obj == null) {
            return null;
        }
        int i3 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescription = (MediaDescription) obj;
        String strM2125g = AbstractC0855a.m2125g(mediaDescription);
        CharSequence charSequenceM2127i = AbstractC0855a.m2127i(mediaDescription);
        CharSequence charSequenceM2126h = AbstractC0855a.m2126h(mediaDescription);
        CharSequence charSequenceM2121c = AbstractC0855a.m2121c(mediaDescription);
        Bitmap bitmapM2123e = AbstractC0855a.m2123e(mediaDescription);
        Uri uriM2124f = AbstractC0855a.m2124f(mediaDescription);
        Bundle bundleM2122d = AbstractC0855a.m2122d(mediaDescription);
        if (bundleM2122d != null) {
            bundleM2122d = C0858A.m2149Y(bundleM2122d);
        }
        Uri uriM2135a = bundleM2122d != null ? (Uri) bundleM2122d.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uriM2135a == null) {
            bundle = bundleM2122d;
        } else if (bundleM2122d.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundleM2122d.size() == 2) {
            bundle = null;
        } else {
            bundleM2122d.remove("android.support.v4.media.description.MEDIA_URI");
            bundleM2122d.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleM2122d;
        }
        if (uriM2135a == null) {
            uriM2135a = i3 >= 23 ? AbstractC0856b.m2135a(mediaDescription) : null;
        }
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(strM2125g, charSequenceM2127i, charSequenceM2126h, charSequenceM2121c, bitmapM2123e, uriM2124f, bundle, uriM2135a);
        mediaDescriptionCompat.f3626o = mediaDescription;
        return mediaDescriptionCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f3619h) + ", " + ((Object) this.f3620i) + ", " + ((Object) this.f3621j);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        Bundle bundle;
        int i4 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescriptionM2119a = this.f3626o;
        if (mediaDescriptionM2119a == null) {
            MediaDescription.Builder builderM2120b = AbstractC0855a.m2120b();
            AbstractC0855a.m2132n(builderM2120b, this.f3618g);
            AbstractC0855a.m2134p(builderM2120b, this.f3619h);
            AbstractC0855a.m2133o(builderM2120b, this.f3620i);
            AbstractC0855a.m2128j(builderM2120b, this.f3621j);
            AbstractC0855a.m2130l(builderM2120b, this.f3622k);
            AbstractC0855a.m2131m(builderM2120b, this.f3623l);
            Bundle bundle2 = this.f3624m;
            Uri uri = this.f3625n;
            if (i4 >= 23 || uri == null) {
                AbstractC0855a.m2129k(builderM2120b, bundle2);
            } else {
                if (bundle2 == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                } else {
                    bundle = new Bundle(bundle2);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
                AbstractC0855a.m2129k(builderM2120b, bundle);
            }
            if (i4 >= 23) {
                AbstractC0856b.m2136b(builderM2120b, uri);
            }
            mediaDescriptionM2119a = AbstractC0855a.m2119a(builderM2120b);
            this.f3626o = mediaDescriptionM2119a;
        }
        mediaDescriptionM2119a.writeToParcel(parcel, i3);
    }
}
