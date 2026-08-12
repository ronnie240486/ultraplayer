package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import p122m1.InterfaceC2006d;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new C0890z(2);

    /* JADX INFO: renamed from: h */
    public final Object f3654h;

    /* JADX INFO: renamed from: i */
    public InterfaceC0868d f3655i;

    /* JADX INFO: renamed from: g */
    public final Object f3653g = new Object();

    /* JADX INFO: renamed from: j */
    public InterfaceC2006d f3656j = null;

    public MediaSessionCompat$Token(Object obj, BinderC0884t binderC0884t) {
        this.f3654h = obj;
        this.f3655i = binderC0884t;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0868d m2214d() {
        InterfaceC0868d interfaceC0868d;
        synchronized (this.f3653g) {
            interfaceC0868d = this.f3655i;
        }
        return interfaceC0868d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m2215e(InterfaceC0868d interfaceC0868d) {
        synchronized (this.f3653g) {
            this.f3655i = interfaceC0868d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
        Object obj2 = this.f3654h;
        if (obj2 == null) {
            return mediaSessionCompat$Token.f3654h == null;
        }
        Object obj3 = mediaSessionCompat$Token.f3654h;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    /* JADX INFO: renamed from: f */
    public final void m2216f(InterfaceC2006d interfaceC2006d) {
        synchronized (this.f3653g) {
            this.f3656j = interfaceC2006d;
        }
    }

    public final int hashCode() {
        Object obj = this.f3654h;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeParcelable((Parcelable) this.f3654h, i3);
    }
}
