package p070Y;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: Y.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0703C extends AbstractC0706c {

    /* JADX INFO: renamed from: k */
    public final int f2692k;

    /* JADX INFO: renamed from: l */
    public final byte[] f2693l;

    /* JADX INFO: renamed from: m */
    public final DatagramPacket f2694m;

    /* JADX INFO: renamed from: n */
    public Uri f2695n;

    /* JADX INFO: renamed from: o */
    public DatagramSocket f2696o;

    /* JADX INFO: renamed from: p */
    public MulticastSocket f2697p;

    /* JADX INFO: renamed from: q */
    public InetAddress f2698q;

    /* JADX INFO: renamed from: r */
    public boolean f2699r;

    /* JADX INFO: renamed from: s */
    public int f2700s;

    public C0703C() {
        super(true);
        this.f2692k = 8000;
        byte[] bArr = new byte[2000];
        this.f2693l = bArr;
        this.f2694m = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: a */
    public final long mo1827a(C0715l c0715l) throws C0702B {
        Uri uri = c0715l.f2735a;
        this.f2695n = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f2695n.getPort();
        m1832l();
        try {
            this.f2698q = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f2698q, port);
            if (this.f2698q.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f2697p = multicastSocket;
                multicastSocket.joinGroup(this.f2698q);
                this.f2696o = this.f2697p;
            } else {
                this.f2696o = new DatagramSocket(inetSocketAddress);
            }
            this.f2696o.setSoTimeout(this.f2692k);
            this.f2699r = true;
            m1834p(c0715l);
            return -1L;
        } catch (IOException e3) {
            throw new C0702B(e3, 2001);
        } catch (SecurityException e4) {
            throw new C0702B(e4, 2006);
        }
    }

    @Override // p070Y.InterfaceC0711h
    public final void close() {
        this.f2695n = null;
        MulticastSocket multicastSocket = this.f2697p;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f2698q;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f2697p = null;
        }
        DatagramSocket datagramSocket = this.f2696o;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f2696o = null;
        }
        this.f2698q = null;
        this.f2700s = 0;
        if (this.f2699r) {
            this.f2699r = false;
            m1831k();
        }
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: h */
    public final Uri mo1828h() {
        return this.f2695n;
    }

    @Override // p055T.InterfaceC0575g
    /* JADX INFO: renamed from: q */
    public final int mo345q(byte[] bArr, int i3, int i4) throws C0702B {
        if (i4 == 0) {
            return 0;
        }
        int i5 = this.f2700s;
        DatagramPacket datagramPacket = this.f2694m;
        if (i5 == 0) {
            try {
                DatagramSocket datagramSocket = this.f2696o;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f2700s = length;
                m1829b(length);
            } catch (SocketTimeoutException e3) {
                throw new C0702B(e3, 2002);
            } catch (IOException e4) {
                throw new C0702B(e4, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i6 = this.f2700s;
        int iMin = Math.min(i6, i4);
        System.arraycopy(this.f2693l, length2 - i6, bArr, i3, iMin);
        this.f2700s -= iMin;
        return iMin;
    }
}
