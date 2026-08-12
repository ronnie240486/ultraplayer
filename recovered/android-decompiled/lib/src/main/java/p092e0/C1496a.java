package p092e0;

import android.net.Uri;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p070Y.C0713j;
import p070Y.C0715l;
import p070Y.InterfaceC0701A;
import p070Y.InterfaceC0711h;

/* JADX INFO: renamed from: e0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1496a implements InterfaceC0711h {

    /* JADX INFO: renamed from: g */
    public final InterfaceC0711h f6645g;

    /* JADX INFO: renamed from: h */
    public final byte[] f6646h;

    /* JADX INFO: renamed from: i */
    public final byte[] f6647i;

    /* JADX INFO: renamed from: j */
    public CipherInputStream f6648j;

    public C1496a(InterfaceC0711h interfaceC0711h, byte[] bArr, byte[] bArr2) {
        this.f6645g = interfaceC0711h;
        this.f6646h = bArr;
        this.f6647i = bArr2;
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: a */
    public final long mo1827a(C0715l c0715l) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f6646h, "AES"), new IvParameterSpec(this.f6647i));
                C0713j c0713j = new C0713j(this.f6645g, c0715l);
                this.f6648j = new CipherInputStream(c0713j, cipher);
                c0713j.m1835a();
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e3) {
                throw new RuntimeException(e3);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // p070Y.InterfaceC0711h
    public final void close() {
        if (this.f6648j != null) {
            this.f6648j = null;
            this.f6645g.close();
        }
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: e */
    public final void mo1830e(InterfaceC0701A interfaceC0701A) {
        interfaceC0701A.getClass();
        this.f6645g.mo1830e(interfaceC0701A);
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: h */
    public final Uri mo1828h() {
        return this.f6645g.mo1828h();
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: m */
    public final Map mo1833m() {
        return this.f6645g.mo1833m();
    }

    @Override // p055T.InterfaceC0575g
    /* JADX INFO: renamed from: q */
    public final int mo345q(byte[] bArr, int i3, int i4) throws IOException {
        this.f6648j.getClass();
        int i5 = this.f6648j.read(bArr, i3, i4);
        if (i5 < 0) {
            return -1;
        }
        return i5;
    }
}
