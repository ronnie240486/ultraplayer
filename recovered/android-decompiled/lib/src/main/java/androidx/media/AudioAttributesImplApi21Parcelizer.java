package androidx.media;

import android.media.AudioAttributes;
import p122m1.AbstractC2004b;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC2004b abstractC2004b) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f4348a = (AudioAttributes) abstractC2004b.m4559g(audioAttributesImplApi21.f4348a, 1);
        audioAttributesImplApi21.f4349b = abstractC2004b.m4558f(audioAttributesImplApi21.f4349b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC2004b abstractC2004b) {
        abstractC2004b.getClass();
        abstractC2004b.m4563k(audioAttributesImplApi21.f4348a, 1);
        abstractC2004b.m4562j(audioAttributesImplApi21.f4349b, 2);
    }
}
