package p071Y0;

import android.view.View;
import androidx.emoji2.text.AbstractC0916f;
import java.util.Arrays;
import p064W.AbstractC0646n;
import p077a0.C0818b0;

/* JADX INFO: renamed from: Y0.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0760w {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3096a = 2;

    /* JADX INFO: renamed from: b */
    public boolean f3097b;

    /* JADX INFO: renamed from: c */
    public int f3098c;

    /* JADX INFO: renamed from: d */
    public boolean f3099d;

    /* JADX INFO: renamed from: e */
    public int f3100e;

    /* JADX INFO: renamed from: f */
    public Object f3101f;

    public C0760w(int i3) {
        this.f3098c = i3;
        byte[] bArr = new byte[131];
        this.f3101f = bArr;
        bArr[2] = 1;
    }

    /* JADX INFO: renamed from: a */
    public void m1867a(byte[] bArr, int i3, int i4) {
        if (this.f3097b) {
            int i5 = i4 - i3;
            byte[] bArr2 = (byte[]) this.f3101f;
            int length = bArr2.length;
            int i6 = this.f3100e;
            if (length < i6 + i5) {
                this.f3101f = Arrays.copyOf(bArr2, (i6 + i5) * 2);
            }
            System.arraycopy(bArr, i3, (byte[]) this.f3101f, this.f3100e, i5);
            this.f3100e += i5;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1868b() {
        this.f3100e = this.f3097b ? ((AbstractC0916f) this.f3101f).mo2395g() : ((AbstractC0916f) this.f3101f).mo2399k();
    }

    /* JADX INFO: renamed from: c */
    public void m1869c(View view, int i3) {
        if (this.f3097b) {
            int iMo2390b = ((AbstractC0916f) this.f3101f).mo2390b(view);
            AbstractC0916f abstractC0916f = (AbstractC0916f) this.f3101f;
            this.f3100e = (Integer.MIN_VALUE == abstractC0916f.f4000a ? 0 : abstractC0916f.mo2400l() - abstractC0916f.f4000a) + iMo2390b;
        } else {
            this.f3100e = ((AbstractC0916f) this.f3101f).mo2393e(view);
        }
        this.f3098c = i3;
    }

    /* JADX INFO: renamed from: d */
    public void m1870d(View view, int i3) {
        AbstractC0916f abstractC0916f = (AbstractC0916f) this.f3101f;
        int iMo2400l = Integer.MIN_VALUE == abstractC0916f.f4000a ? 0 : abstractC0916f.mo2400l() - abstractC0916f.f4000a;
        if (iMo2400l >= 0) {
            m1869c(view, i3);
            return;
        }
        this.f3098c = i3;
        if (!this.f3097b) {
            int iMo2393e = ((AbstractC0916f) this.f3101f).mo2393e(view);
            int iMo2399k = iMo2393e - ((AbstractC0916f) this.f3101f).mo2399k();
            this.f3100e = iMo2393e;
            if (iMo2399k > 0) {
                int iMo2395g = (((AbstractC0916f) this.f3101f).mo2395g() - Math.min(0, (((AbstractC0916f) this.f3101f).mo2395g() - iMo2400l) - ((AbstractC0916f) this.f3101f).mo2390b(view))) - (((AbstractC0916f) this.f3101f).mo2391c(view) + iMo2393e);
                if (iMo2395g < 0) {
                    this.f3100e -= Math.min(iMo2399k, -iMo2395g);
                    return;
                }
                return;
            }
            return;
        }
        int iMo2395g2 = (((AbstractC0916f) this.f3101f).mo2395g() - iMo2400l) - ((AbstractC0916f) this.f3101f).mo2390b(view);
        this.f3100e = ((AbstractC0916f) this.f3101f).mo2395g() - iMo2395g2;
        if (iMo2395g2 > 0) {
            int iMo2391c = this.f3100e - ((AbstractC0916f) this.f3101f).mo2391c(view);
            int iMo2399k2 = ((AbstractC0916f) this.f3101f).mo2399k();
            int iMin = iMo2391c - (Math.min(((AbstractC0916f) this.f3101f).mo2393e(view) - iMo2399k2, 0) + iMo2399k2);
            if (iMin < 0) {
                this.f3100e = Math.min(iMo2395g2, -iMin) + this.f3100e;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m1871e(int i3) {
        if (!this.f3097b) {
            return false;
        }
        this.f3100e -= i3;
        this.f3097b = false;
        this.f3099d = true;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m1872f(int i3) {
        this.f3097b |= i3 > 0;
        this.f3098c += i3;
    }

    /* JADX INFO: renamed from: g */
    public void m1873g() {
        switch (this.f3096a) {
            case 0:
                this.f3097b = false;
                this.f3099d = false;
                break;
            default:
                this.f3098c = -1;
                this.f3100e = Integer.MIN_VALUE;
                this.f3097b = false;
                this.f3099d = false;
                break;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m1874h(int i3) {
        AbstractC0646n.m1630h(!this.f3097b);
        boolean z3 = i3 == this.f3098c;
        this.f3097b = z3;
        if (z3) {
            this.f3100e = 3;
            this.f3099d = false;
        }
    }

    public String toString() {
        switch (this.f3096a) {
            case 2:
                return "AnchorInfo{mPosition=" + this.f3098c + ", mCoordinate=" + this.f3100e + ", mLayoutFromEnd=" + this.f3097b + ", mValid=" + this.f3099d + '}';
            default:
                return super.toString();
        }
    }

    public C0760w(C0818b0 c0818b0) {
        this.f3101f = c0818b0;
    }

    public C0760w() {
        m1873g();
    }
}
