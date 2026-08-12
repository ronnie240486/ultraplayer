package p088d0;

import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.support.v4.media.session.HandlerC0881q;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p036M0.AbstractC0383t;
import p036M0.C0380q;
import p055T.AbstractC0571e;
import p055T.C0578j;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p064W.C0651s;
import p073Z.InterfaceC0766a;
import p082b0.AbstractC1068i;
import p082b0.C1063d;
import p082b0.C1070k;
import p082b0.C1071l;

/* JADX INFO: renamed from: d0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1397u implements InterfaceC1394r {

    /* JADX INFO: renamed from: f */
    public static final C1063d f6197f = new C1063d(9);

    /* JADX INFO: renamed from: c */
    public final UUID f6198c;

    /* JADX INFO: renamed from: d */
    public final MediaDrm f6199d;

    /* JADX INFO: renamed from: e */
    public int f6200e;

    public C1397u(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = AbstractC0571e.f2058b;
        AbstractC0646n.m1624b("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f6198c = uuid;
        MediaDrm mediaDrm = new MediaDrm((AbstractC0632A.f2454a >= 27 || !AbstractC0571e.f2059c.equals(uuid)) ? uuid : uuid2);
        this.f6199d = mediaDrm;
        this.f6200e = 1;
        if (AbstractC0571e.f2060d.equals(uuid) && "ASUS_Z00AD".equals(AbstractC0632A.f2457d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: a */
    public final synchronized void mo972a() {
        int i3 = this.f6200e - 1;
        this.f6200e = i3;
        if (i3 == 0) {
            this.f6199d.release();
        }
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: d */
    public final C1393q mo975d() {
        MediaDrm.ProvisionRequest provisionRequest = this.f6199d.getProvisionRequest();
        return new C1393q(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: f */
    public final void mo977f(byte[] bArr) throws DeniedByServerException {
        this.f6199d.provideProvisionResponse(bArr);
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: i */
    public final void mo980i(final C1379c c1379c) {
        this.f6199d.setOnEventListener(new MediaDrm.OnEventListener() { // from class: d0.t
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i3, int i4, byte[] bArr2) {
                C1397u c1397u = this.f6195a;
                C1379c c1379c2 = c1379c;
                c1397u.getClass();
                HandlerC0881q handlerC0881q = c1379c2.f6149a.f6175x;
                handlerC0881q.getClass();
                handlerC0881q.obtainMessage(i3, bArr).sendToTarget();
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:127:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x0198  */
    /* JADX WARN: Code duplicated, block: B:79:0x019e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0209  */
    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: j */
    public final C1392p mo981j(byte[] bArr, List list, int i3, HashMap map) throws NotProvisionedException {
        C0578j c0578j;
        byte[] bArr2;
        String str;
        int i4;
        C0380q c0380qM1061i;
        int i5;
        int i6;
        byte[] bArrM1062j;
        UUID uuid = this.f6198c;
        if (list != null) {
            if (!AbstractC0571e.f2060d.equals(uuid)) {
                c0578j = (C0578j) list.get(0);
            } else if (AbstractC0632A.f2454a < 28 || list.size() <= 1) {
                i4 = 0;
                while (true) {
                    if (i4 < list.size()) {
                        c0578j = (C0578j) list.get(0);
                        break;
                    }
                    C0578j c0578j2 = (C0578j) list.get(i4);
                    byte[] bArr3 = c0578j2.f2085k;
                    bArr3.getClass();
                    c0380qM1061i = AbstractC0383t.m1061i(bArr3);
                    if (c0380qM1061i == null) {
                        i5 = -1;
                    } else {
                        i5 = c0380qM1061i.f1291h;
                    }
                    i6 = AbstractC0632A.f2454a;
                    if ((i6 >= 23 && i5 == 0) || (i6 >= 23 && i5 == 1)) {
                        c0578j = c0578j2;
                        break;
                    }
                }
            } else {
                C0578j c0578j3 = (C0578j) list.get(0);
                int i7 = 0;
                int length = 0;
                while (true) {
                    if (i7 < list.size()) {
                        C0578j c0578j4 = (C0578j) list.get(i7);
                        byte[] bArr4 = c0578j4.f2085k;
                        bArr4.getClass();
                        if (!Objects.equals(c0578j4.f2084j, c0578j3.f2084j) || !Objects.equals(c0578j4.f2083i, c0578j3.f2083i) || AbstractC0383t.m1061i(bArr4) == null) {
                            i4 = 0;
                            while (true) {
                                if (i4 < list.size()) {
                                    c0578j = (C0578j) list.get(0);
                                    break;
                                }
                                C0578j c0578j5 = (C0578j) list.get(i4);
                                byte[] bArr5 = c0578j5.f2085k;
                                bArr5.getClass();
                                c0380qM1061i = AbstractC0383t.m1061i(bArr5);
                                if (c0380qM1061i == null) {
                                    i5 = -1;
                                } else {
                                    i5 = c0380qM1061i.f1291h;
                                }
                                i6 = AbstractC0632A.f2454a;
                                i4 = i6 >= 23 ? i4 + 1 : i4 + 1;
                                c0578j = c0578j5;
                                break;
                            }
                        }
                        length += bArr4.length;
                        i7++;
                    } else {
                        byte[] bArr6 = new byte[length];
                        int i8 = 0;
                        for (int i9 = 0; i9 < list.size(); i9++) {
                            byte[] bArr7 = ((C0578j) list.get(i9)).f2085k;
                            bArr7.getClass();
                            int length2 = bArr7.length;
                            System.arraycopy(bArr7, 0, bArr6, i8, length2);
                            i8 += length2;
                        }
                        c0578j = new C0578j(c0578j3.f2082h, c0578j3.f2083i, c0578j3.f2084j, bArr6);
                    }
                }
            }
            byte[] bArrM1053a = c0578j.f2085k;
            bArrM1053a.getClass();
            UUID uuid2 = AbstractC0571e.f2061e;
            if (uuid2.equals(uuid)) {
                byte[] bArrM1062j2 = AbstractC0383t.m1062j(uuid, bArrM1053a);
                if (bArrM1062j2 != null) {
                    bArrM1053a = bArrM1062j2;
                }
                C0651s c0651s = new C0651s(bArrM1053a);
                int iM1675i = c0651s.m1675i();
                short sM1677k = c0651s.m1677k();
                short sM1677k2 = c0651s.m1677k();
                if (sM1677k == 1 && sM1677k2 == 1) {
                    short sM1677k3 = c0651s.m1677k();
                    Charset charset = StandardCharsets.UTF_16LE;
                    String strM1685s = c0651s.m1685s(sM1677k3, charset);
                    if (!strM1685s.contains("<LA_URL>")) {
                        int iIndexOf = strM1685s.indexOf("</DATA>");
                        if (iIndexOf == -1) {
                            AbstractC0646n.m1647y("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
                        }
                        String str2 = strM1685s.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strM1685s.substring(iIndexOf);
                        int i10 = iM1675i + 52;
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
                        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
                        byteBufferAllocate.putInt(i10);
                        byteBufferAllocate.putShort(sM1677k);
                        byteBufferAllocate.putShort(sM1677k2);
                        byteBufferAllocate.putShort((short) (str2.length() * 2));
                        byteBufferAllocate.put(str2.getBytes(charset));
                        bArrM1053a = byteBufferAllocate.array();
                    }
                } else {
                    AbstractC0646n.m1639q("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
                }
                bArrM1053a = AbstractC0383t.m1053a(uuid2, bArrM1053a);
            }
            int i11 = AbstractC0632A.f2454a;
            if (i11 < 23 && AbstractC0571e.f2060d.equals(uuid)) {
                bArrM1062j = AbstractC0383t.m1062j(uuid, bArrM1053a);
                if (bArrM1062j != null) {
                    bArrM1053a = bArrM1062j;
                }
            } else if (uuid2.equals(uuid) && "Amazon".equals(AbstractC0632A.f2456c)) {
                String str3 = AbstractC0632A.f2457d;
                if ("AFTB".equals(str3) || "AFTS".equals(str3) || "AFTM".equals(str3) || "AFTT".equals(str3)) {
                    bArrM1062j = AbstractC0383t.m1062j(uuid, bArrM1053a);
                    if (bArrM1062j != null) {
                        bArrM1053a = bArrM1062j;
                    }
                }
            }
            str = c0578j.f2084j;
            if (i11 < 26 && AbstractC0571e.f2059c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) {
                str = "cenc";
            }
            bArr2 = bArrM1053a;
        } else {
            c0578j = null;
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f6199d.getKeyRequest(bArr, bArr2, str, i3, map);
        byte[] data = keyRequest.getData();
        if (AbstractC0571e.f2059c.equals(uuid) && AbstractC0632A.f2454a < 27) {
            data = AbstractC0632A.m1595n(data).replace('+', '-').replace('/', '_').getBytes(StandardCharsets.UTF_8);
        }
        String defaultUrl = keyRequest.getDefaultUrl();
        if ("<LA_URL>https://x</LA_URL>".equals(defaultUrl)) {
            defaultUrl = "";
        } else if (AbstractC0632A.f2454a >= 33 && "https://default.url".equals(defaultUrl)) {
            String propertyString = this.f6199d.getPropertyString("version");
            if (Objects.equals(propertyString, "1.2") || Objects.equals(propertyString, "aidl-1")) {
                defaultUrl = "";
            }
        }
        if (TextUtils.isEmpty(defaultUrl) && c0578j != null) {
            String str4 = c0578j.f2083i;
            if (!TextUtils.isEmpty(str4)) {
                defaultUrl = str4;
            }
        }
        if (AbstractC0632A.f2454a >= 23) {
            keyRequest.getRequestType();
        }
        return new C1392p(defaultUrl, data);
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: k */
    public final void mo982k(byte[] bArr, byte[] bArr2) {
        this.f6199d.restoreKeys(bArr, bArr2);
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: l */
    public final void mo983l(byte[] bArr, C1071l c1071l) {
        if (AbstractC0632A.f2454a >= 31) {
            try {
                MediaDrm mediaDrm = this.f6199d;
                C1070k c1070k = c1071l.f4881b;
                c1070k.getClass();
                LogSessionId logSessionId = c1070k.f4879a;
                LogSessionId unused = LogSessionId.LOG_SESSION_ID_NONE;
                if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                    return;
                }
                MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
                playbackComponent.getClass();
                AbstractC1068i.m2881e(playbackComponent).setLogSessionId(logSessionId);
            } catch (UnsupportedOperationException unused2) {
                AbstractC0646n.m1647y("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: m */
    public final Map mo984m(byte[] bArr) {
        return this.f6199d.queryKeyStatus(bArr);
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: n */
    public final int mo985n() {
        return 2;
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: o */
    public final void mo986o(byte[] bArr) {
        this.f6199d.closeSession(bArr);
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: q */
    public final InterfaceC0766a mo988q(byte[] bArr) {
        int i3 = AbstractC0632A.f2454a;
        UUID uuid = this.f6198c;
        if (i3 < 27 && AbstractC0571e.f2059c.equals(uuid)) {
            uuid = AbstractC0571e.f2058b;
        }
        return new C1395s(uuid, bArr);
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: s */
    public final boolean mo990s(String str, byte[] bArr) throws Throwable {
        boolean zEquals;
        int i3 = AbstractC0632A.f2454a;
        UUID uuid = this.f6198c;
        if (i3 >= 31) {
            boolean zEquals2 = uuid.equals(AbstractC0571e.f2060d);
            MediaDrm mediaDrm = this.f6199d;
            if (zEquals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                zEquals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                zEquals = uuid.equals(AbstractC0571e.f2059c);
            }
            if (zEquals) {
                return mediaDrm.requiresSecureDecoder(str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto = null;
        try {
            MediaCrypto mediaCrypto2 = new MediaCrypto(uuid, bArr);
            try {
                boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                mediaCrypto2.release();
                return zRequiresSecureDecoderComponent;
            } catch (MediaCryptoException unused) {
                mediaCrypto = mediaCrypto2;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
                return true;
            } catch (Throwable th) {
                th = th;
                mediaCrypto = mediaCrypto2;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
                throw th;
            }
        } catch (MediaCryptoException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: t */
    public final byte[] mo991t() {
        return this.f6199d.openSession();
    }

    @Override // p088d0.InterfaceC1394r
    /* JADX INFO: renamed from: w */
    public final byte[] mo994w(byte[] bArr, byte[] bArr2) {
        if (AbstractC0571e.f2059c.equals(this.f6198c) && AbstractC0632A.f2454a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(AbstractC0632A.m1595n(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    if (i3 != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i3);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e3) {
                AbstractC0646n.m1636n("ClearKeyUtil", "Failed to adjust response data: ".concat(AbstractC0632A.m1595n(bArr2)), e3);
            }
        }
        return this.f6199d.provideKeyResponse(bArr, bArr2);
    }
}
