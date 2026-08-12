package p015F0;

import com.google.android.gms.internal.cast.AbstractC1303m;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p004B0.C0098a;
import p055T.C0544G;
import p122m1.AbstractC2003a;

/* JADX INFO: renamed from: F0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0172a extends AbstractC2003a {

    /* JADX INFO: renamed from: h */
    public static final Pattern f396h = Pattern.compile("(.+?)='(.*?)';", 32);

    /* JADX INFO: renamed from: f */
    public final CharsetDecoder f397f = StandardCharsets.UTF_8.newDecoder();

    /* JADX INFO: renamed from: g */
    public final CharsetDecoder f398g = StandardCharsets.ISO_8859_1.newDecoder();

    @Override // p122m1.AbstractC2003a
    /* JADX INFO: renamed from: i */
    public final C0544G mo501i(C0098a c0098a, ByteBuffer byteBuffer) {
        String string;
        CharsetDecoder charsetDecoder = this.f398g;
        CharsetDecoder charsetDecoder2 = this.f397f;
        String str = null;
        try {
            string = charsetDecoder2.decode(byteBuffer).toString();
            charsetDecoder2.reset();
            byteBuffer.rewind();
        } catch (CharacterCodingException unused) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            try {
                String string2 = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = string2;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                string = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } catch (Throwable th2) {
            charsetDecoder2.reset();
            byteBuffer.rewind();
            throw th2;
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (string == null) {
            return new C0544G(new C0174c(null, null, bArr));
        }
        Matcher matcher = f396h.matcher(string);
        String str2 = null;
        for (int iEnd = 0; matcher.find(iEnd); iEnd = matcher.end()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            if (strGroup != null) {
                String strM3288K = AbstractC1303m.m3288K(strGroup);
                strM3288K.getClass();
                if (strM3288K.equals("streamurl")) {
                    str2 = strGroup2;
                } else if (strM3288K.equals("streamtitle")) {
                    str = strGroup2;
                }
            }
        }
        return new C0544G(new C0174c(str, str2, bArr));
    }
}
