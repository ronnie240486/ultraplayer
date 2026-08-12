package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public AudioAttributes f4348a;

    /* JADX INFO: renamed from: b */
    public int f4349b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f4348a.equals(((AudioAttributesImplApi21) obj).f4348a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4348a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f4348a;
    }
}
