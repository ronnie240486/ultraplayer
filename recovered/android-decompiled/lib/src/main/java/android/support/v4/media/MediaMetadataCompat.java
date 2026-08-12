package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0858A;
import android.text.TextUtils;
import android.util.Log;
import p076a.C0787c;
import p124n.C2018e;

/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* JADX INFO: renamed from: j */
    public static final C2018e f3627j;

    /* JADX INFO: renamed from: k */
    public static final String[] f3628k;

    /* JADX INFO: renamed from: l */
    public static final String[] f3629l;

    /* JADX INFO: renamed from: m */
    public static final String[] f3630m;

    /* JADX INFO: renamed from: g */
    public final Bundle f3631g;

    /* JADX INFO: renamed from: h */
    public MediaMetadata f3632h;

    /* JADX INFO: renamed from: i */
    public MediaDescriptionCompat f3633i;

    static {
        C2018e c2018e = new C2018e();
        f3627j = c2018e;
        c2018e.put("android.media.metadata.TITLE", 1);
        c2018e.put("android.media.metadata.ARTIST", 1);
        c2018e.put("android.media.metadata.DURATION", 0);
        c2018e.put("android.media.metadata.ALBUM", 1);
        c2018e.put("android.media.metadata.AUTHOR", 1);
        c2018e.put("android.media.metadata.WRITER", 1);
        c2018e.put("android.media.metadata.COMPOSER", 1);
        c2018e.put("android.media.metadata.COMPILATION", 1);
        c2018e.put("android.media.metadata.DATE", 1);
        c2018e.put("android.media.metadata.YEAR", 0);
        c2018e.put("android.media.metadata.GENRE", 1);
        c2018e.put("android.media.metadata.TRACK_NUMBER", 0);
        c2018e.put("android.media.metadata.NUM_TRACKS", 0);
        c2018e.put("android.media.metadata.DISC_NUMBER", 0);
        c2018e.put("android.media.metadata.ALBUM_ARTIST", 1);
        c2018e.put("android.media.metadata.ART", 2);
        c2018e.put("android.media.metadata.ART_URI", 1);
        c2018e.put("android.media.metadata.ALBUM_ART", 2);
        c2018e.put("android.media.metadata.ALBUM_ART_URI", 1);
        c2018e.put("android.media.metadata.USER_RATING", 3);
        c2018e.put("android.media.metadata.RATING", 3);
        c2018e.put("android.media.metadata.DISPLAY_TITLE", 1);
        c2018e.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        c2018e.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        c2018e.put("android.media.metadata.DISPLAY_ICON", 2);
        c2018e.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        c2018e.put("android.media.metadata.MEDIA_ID", 1);
        c2018e.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        c2018e.put("android.media.metadata.MEDIA_URI", 1);
        c2018e.put("android.media.metadata.ADVERTISEMENT", 0);
        c2018e.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f3628k = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f3629l = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f3630m = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new C0787c(3);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f3631g = bundle2;
        C0858A.m2152x(bundle2);
    }

    /* JADX INFO: renamed from: d */
    public final MediaDescriptionCompat m2118d() {
        Bitmap bitmap;
        Uri uri;
        MediaDescriptionCompat mediaDescriptionCompat = this.f3633i;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        Bundle bundle = this.f3631g;
        CharSequence charSequence = bundle.getCharSequence("android.media.metadata.MEDIA_ID");
        String string = charSequence != null ? charSequence.toString() : null;
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence charSequence2 = bundle.getCharSequence("android.media.metadata.DISPLAY_TITLE");
        if (TextUtils.isEmpty(charSequence2)) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < 3) {
                String[] strArr = f3628k;
                if (i4 >= strArr.length) {
                    break;
                }
                int i5 = i4 + 1;
                CharSequence charSequence3 = bundle.getCharSequence(strArr[i4]);
                if (!TextUtils.isEmpty(charSequence3)) {
                    charSequenceArr[i3] = charSequence3;
                    i3++;
                }
                i4 = i5;
            }
        } else {
            charSequenceArr[0] = charSequence2;
            charSequenceArr[1] = bundle.getCharSequence("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = bundle.getCharSequence("android.media.metadata.DISPLAY_DESCRIPTION");
        }
        int i6 = 0;
        while (true) {
            String[] strArr2 = f3629l;
            if (i6 >= strArr2.length) {
                bitmap = null;
                break;
            }
            try {
                bitmap = (Bitmap) bundle.getParcelable(strArr2[i6]);
            } catch (Exception e3) {
                Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e3);
                bitmap = null;
            }
            if (bitmap != null) {
                break;
            }
            i6++;
        }
        int i7 = 0;
        while (true) {
            String[] strArr3 = f3630m;
            if (i7 >= strArr3.length) {
                uri = null;
                break;
            }
            CharSequence charSequence4 = bundle.getCharSequence(strArr3[i7]);
            String string2 = charSequence4 != null ? charSequence4.toString() : null;
            if (!TextUtils.isEmpty(string2)) {
                uri = Uri.parse(string2);
                break;
            }
            i7++;
        }
        CharSequence charSequence5 = bundle.getCharSequence("android.media.metadata.MEDIA_URI");
        String string3 = charSequence5 != null ? charSequence5.toString() : null;
        Uri uri2 = !TextUtils.isEmpty(string3) ? Uri.parse(string3) : null;
        CharSequence charSequence6 = charSequenceArr[0];
        CharSequence charSequence7 = charSequenceArr[1];
        CharSequence charSequence8 = charSequenceArr[2];
        Bundle bundle2 = new Bundle();
        if (bundle.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle2.putLong("android.media.extra.BT_FOLDER_TYPE", bundle.getLong("android.media.metadata.BT_FOLDER_TYPE", 0L));
        }
        if (bundle.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle2.putLong("android.media.extra.DOWNLOAD_STATUS", bundle.getLong("android.media.metadata.DOWNLOAD_STATUS", 0L));
        }
        MediaDescriptionCompat mediaDescriptionCompat2 = new MediaDescriptionCompat(string, charSequence6, charSequence7, charSequence8, bitmap, uri, !bundle2.isEmpty() ? bundle2 : null, uri2);
        this.f3633i = mediaDescriptionCompat2;
        return mediaDescriptionCompat2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeBundle(this.f3631g);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f3631g = parcel.readBundle(C0858A.class.getClassLoader());
    }
}
