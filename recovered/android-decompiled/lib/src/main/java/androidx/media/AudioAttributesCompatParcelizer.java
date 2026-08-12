package androidx.media;

import p122m1.AbstractC2004b;
import p122m1.InterfaceC2006d;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC2004b abstractC2004b) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        InterfaceC2006d interfaceC2006dM4560h = audioAttributesCompat.f4347a;
        if (abstractC2004b.mo4557e(1)) {
            interfaceC2006dM4560h = abstractC2004b.m4560h();
        }
        audioAttributesCompat.f4347a = (AudioAttributesImpl) interfaceC2006dM4560h;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC2004b abstractC2004b) {
        abstractC2004b.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f4347a;
        abstractC2004b.mo4561i(1);
        abstractC2004b.m4564l(audioAttributesImpl);
    }
}
