package p020H;

import android.os.Parcel;
import android.os.Parcelable;
import p104h1.C1630N;
import p113k.C1848b1;

/* JADX INFO: renamed from: H.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0251b implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f648a;

    public /* synthetic */ C0251b(int i3) {
        this.f648a = i3;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f648a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0252c.f649h;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C1630N(parcel, classLoader);
            default:
                return new C1848b1(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i3) {
        switch (this.f648a) {
            case 0:
                return new AbstractC0252c[i3];
            case 1:
                return new C1630N[i3];
            default:
                return new C1848b1[i3];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f648a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0252c.f649h;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C1630N(parcel, null);
            default:
                return new C1848b1(parcel, null);
        }
    }
}
