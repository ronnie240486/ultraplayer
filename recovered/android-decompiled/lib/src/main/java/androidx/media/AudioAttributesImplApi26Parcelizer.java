package androidx.media;

import android.media.AudioAttributes;
import p122m1.AbstractC2004b;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC2004b abstractC2004b) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f4348a = (AudioAttributes) abstractC2004b.m4559g(audioAttributesImplApi26.f4348a, 1);
        audioAttributesImplApi26.f4349b = abstractC2004b.m4558f(audioAttributesImplApi26.f4349b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC2004b abstractC2004b) {
        abstractC2004b.getClass();
        abstractC2004b.m4563k(audioAttributesImplApi26.f4348a, 1);
        abstractC2004b.m4562j(audioAttributesImplApi26.f4349b, 2);
    }
}
