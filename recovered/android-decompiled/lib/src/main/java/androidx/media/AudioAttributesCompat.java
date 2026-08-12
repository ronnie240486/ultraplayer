package androidx.media;

import android.util.SparseIntArray;
import p122m1.InterfaceC2006d;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC2006d {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f4346b = 0;

    /* JADX INFO: renamed from: a */
    public AudioAttributesImpl f4347a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f4347a;
        if (audioAttributesImpl == null) {
            return audioAttributesCompat.f4347a == null;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f4347a);
    }

    public final int hashCode() {
        return this.f4347a.hashCode();
    }

    public final String toString() {
        return this.f4347a.toString();
    }
}
