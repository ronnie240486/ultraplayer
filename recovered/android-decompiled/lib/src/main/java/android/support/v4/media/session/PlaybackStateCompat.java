package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C0890z(4);

    /* JADX INFO: renamed from: g */
    public final int f3662g;

    /* JADX INFO: renamed from: h */
    public final long f3663h;

    /* JADX INFO: renamed from: i */
    public final long f3664i;

    /* JADX INFO: renamed from: j */
    public final float f3665j;

    /* JADX INFO: renamed from: k */
    public final long f3666k;

    /* JADX INFO: renamed from: l */
    public final int f3667l;

    /* JADX INFO: renamed from: m */
    public final CharSequence f3668m;

    /* JADX INFO: renamed from: n */
    public final long f3669n;

    /* JADX INFO: renamed from: o */
    public final ArrayList f3670o;

    /* JADX INFO: renamed from: p */
    public final long f3671p;

    /* JADX INFO: renamed from: q */
    public final Bundle f3672q;

    /* JADX INFO: renamed from: r */
    public PlaybackState f3673r;

    public PlaybackStateCompat(int i3, long j3, long j4, float f, long j5, int i4, CharSequence charSequence, long j6, ArrayList arrayList, long j7, Bundle bundle) {
        this.f3662g = i3;
        this.f3663h = j3;
        this.f3664i = j4;
        this.f3665j = f;
        this.f3666k = j5;
        this.f3667l = i4;
        this.f3668m = charSequence;
        this.f3669n = j6;
        this.f3670o = new ArrayList(arrayList);
        this.f3671p = j7;
        this.f3672q = bundle;
    }

    /* JADX INFO: renamed from: d */
    public static PlaybackStateCompat m2217d(PlaybackState playbackState) {
        ArrayList arrayList;
        CustomAction customAction;
        Bundle bundleM2211a = null;
        if (playbackState == null) {
            return null;
        }
        List<PlaybackState.CustomAction> listM2194j = AbstractC0859B.m2194j(playbackState);
        if (listM2194j != null) {
            ArrayList arrayList2 = new ArrayList(listM2194j.size());
            for (PlaybackState.CustomAction customAction2 : listM2194j) {
                if (customAction2 != null) {
                    PlaybackState.CustomAction customAction3 = customAction2;
                    Bundle bundleM2196l = AbstractC0859B.m2196l(customAction3);
                    C0858A.m2152x(bundleM2196l);
                    customAction = new CustomAction(AbstractC0859B.m2190f(customAction3), AbstractC0859B.m2199o(customAction3), AbstractC0859B.m2197m(customAction3), bundleM2196l);
                    customAction.f3678k = customAction3;
                } else {
                    customAction = null;
                }
                arrayList2.add(customAction);
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundleM2211a = AbstractC0861D.m2211a(playbackState);
            C0858A.m2152x(bundleM2211a);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(AbstractC0859B.m2202r(playbackState), AbstractC0859B.m2201q(playbackState), AbstractC0859B.m2193i(playbackState), AbstractC0859B.m2200p(playbackState), AbstractC0859B.m2191g(playbackState), 0, AbstractC0859B.m2195k(playbackState), AbstractC0859B.m2198n(playbackState), arrayList, AbstractC0859B.m2192h(playbackState), bundleM2211a);
        playbackStateCompat.f3673r = playbackState;
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f3662g + ", position=" + this.f3663h + ", buffered position=" + this.f3664i + ", speed=" + this.f3665j + ", updated=" + this.f3669n + ", actions=" + this.f3666k + ", error code=" + this.f3667l + ", error message=" + this.f3668m + ", custom actions=" + this.f3670o + ", active item id=" + this.f3671p + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f3662g);
        parcel.writeLong(this.f3663h);
        parcel.writeFloat(this.f3665j);
        parcel.writeLong(this.f3669n);
        parcel.writeLong(this.f3664i);
        parcel.writeLong(this.f3666k);
        TextUtils.writeToParcel(this.f3668m, parcel, i3);
        parcel.writeTypedList(this.f3670o);
        parcel.writeLong(this.f3671p);
        parcel.writeBundle(this.f3672q);
        parcel.writeInt(this.f3667l);
    }

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0863F();

        /* JADX INFO: renamed from: g */
        public final String f3674g;

        /* JADX INFO: renamed from: h */
        public final CharSequence f3675h;

        /* JADX INFO: renamed from: i */
        public final int f3676i;

        /* JADX INFO: renamed from: j */
        public final Bundle f3677j;

        /* JADX INFO: renamed from: k */
        public PlaybackState.CustomAction f3678k;

        public CustomAction(String str, CharSequence charSequence, int i3, Bundle bundle) {
            this.f3674g = str;
            this.f3675h = charSequence;
            this.f3676i = i3;
            this.f3677j = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f3675h) + ", mIcon=" + this.f3676i + ", mExtras=" + this.f3677j;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i3) {
            parcel.writeString(this.f3674g);
            TextUtils.writeToParcel(this.f3675h, parcel, i3);
            parcel.writeInt(this.f3676i);
            parcel.writeBundle(this.f3677j);
        }

        public CustomAction(Parcel parcel) {
            this.f3674g = parcel.readString();
            this.f3675h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f3676i = parcel.readInt();
            this.f3677j = parcel.readBundle(C0858A.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f3662g = parcel.readInt();
        this.f3663h = parcel.readLong();
        this.f3665j = parcel.readFloat();
        this.f3669n = parcel.readLong();
        this.f3664i = parcel.readLong();
        this.f3666k = parcel.readLong();
        this.f3668m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3670o = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f3671p = parcel.readLong();
        this.f3672q = parcel.readBundle(C0858A.class.getClassLoader());
        this.f3667l = parcel.readInt();
    }
}
