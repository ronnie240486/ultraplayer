package androidx.media;

import p122m1.AbstractC2004b;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC2004b abstractC2004b) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f4350a = abstractC2004b.m4558f(audioAttributesImplBase.f4350a, 1);
        audioAttributesImplBase.f4351b = abstractC2004b.m4558f(audioAttributesImplBase.f4351b, 2);
        audioAttributesImplBase.f4352c = abstractC2004b.m4558f(audioAttributesImplBase.f4352c, 3);
        audioAttributesImplBase.f4353d = abstractC2004b.m4558f(audioAttributesImplBase.f4353d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC2004b abstractC2004b) {
        abstractC2004b.getClass();
        abstractC2004b.m4562j(audioAttributesImplBase.f4350a, 1);
        abstractC2004b.m4562j(audioAttributesImplBase.f4351b, 2);
        abstractC2004b.m4562j(audioAttributesImplBase.f4352c, 3);
        abstractC2004b.m4562j(audioAttributesImplBase.f4353d, 4);
    }
}
