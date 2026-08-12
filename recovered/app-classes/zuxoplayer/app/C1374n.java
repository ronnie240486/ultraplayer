package com.zuxoplayer.app;

import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;
import p055T.AbstractC0547J;
import p055T.C0539B;
import p055T.C0542E;
import p055T.C0544G;
import p055T.C0548K;
import p055T.C0549L;
import p055T.C0550M;
import p055T.C0552O;
import p055T.C0564a0;
import p055T.C0568c0;
import p055T.C0574f0;
import p055T.InterfaceC0551N;
import p061V.C0615c;

/* JADX INFO: renamed from: com.zuxoplayer.app.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1374n implements InterfaceC0551N {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ PlayerActivity f6093g;

    public C1374n(PlayerActivity playerActivity) {
        this.f6093g = playerActivity;
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void mo1369A(boolean z3) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void mo1370B() {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: C */
    public final void mo1371C(AbstractC0547J abstractC0547J) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Player erro: ");
        int i3 = abstractC0547J.f1946g;
        if (i3 == -100) {
            str = "ERROR_CODE_DISCONNECTED";
        } else if (i3 == -6) {
            str = "ERROR_CODE_NOT_SUPPORTED";
        } else if (i3 == -4) {
            str = "ERROR_CODE_PERMISSION_DENIED";
        } else if (i3 == -3) {
            str = "ERROR_CODE_BAD_VALUE";
        } else if (i3 == -2) {
            str = "ERROR_CODE_INVALID_STATE";
        } else if (i3 == 7000) {
            str = "ERROR_CODE_VIDEO_FRAME_PROCESSOR_INIT_FAILED";
        } else if (i3 != 7001) {
            switch (i3) {
                case -110:
                    str = "ERROR_CODE_CONTENT_ALREADY_PLAYING";
                    break;
                case -109:
                    str = "ERROR_CODE_END_OF_PLAYLIST";
                    break;
                case -108:
                    str = "ERROR_CODE_SETUP_REQUIRED";
                    break;
                case -107:
                    str = "ERROR_CODE_SKIP_LIMIT_REACHED";
                    break;
                case -106:
                    str = "ERROR_CODE_NOT_AVAILABLE_IN_REGION";
                    break;
                case -105:
                    str = "ERROR_CODE_PARENTAL_CONTROL_RESTRICTED";
                    break;
                case -104:
                    str = "ERROR_CODE_CONCURRENT_STREAM_LIMIT";
                    break;
                case -103:
                    str = "ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED";
                    break;
                case -102:
                    str = "ERROR_CODE_AUTHENTICATION_EXPIRED";
                    break;
                default:
                    switch (i3) {
                        case 1000:
                            str = "ERROR_CODE_UNSPECIFIED";
                            break;
                        case 1001:
                            str = "ERROR_CODE_REMOTE_ERROR";
                            break;
                        case 1002:
                            str = "ERROR_CODE_BEHIND_LIVE_WINDOW";
                            break;
                        case 1003:
                            str = "ERROR_CODE_TIMEOUT";
                            break;
                        case 1004:
                            str = "ERROR_CODE_FAILED_RUNTIME_CHECK";
                            break;
                        default:
                            switch (i3) {
                                case 2000:
                                    str = "ERROR_CODE_IO_UNSPECIFIED";
                                    break;
                                case 2001:
                                    str = "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                                    break;
                                case 2002:
                                    str = "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                                    break;
                                case 2003:
                                    str = "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                                    break;
                                case 2004:
                                    str = "ERROR_CODE_IO_BAD_HTTP_STATUS";
                                    break;
                                case 2005:
                                    str = "ERROR_CODE_IO_FILE_NOT_FOUND";
                                    break;
                                case 2006:
                                    str = "ERROR_CODE_IO_NO_PERMISSION";
                                    break;
                                case 2007:
                                    str = "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                                    break;
                                case 2008:
                                    str = "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                                    break;
                                default:
                                    switch (i3) {
                                        case 3001:
                                            str = "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                            break;
                                        case 3002:
                                            str = "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                            break;
                                        case 3003:
                                            str = "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                            break;
                                        case 3004:
                                            str = "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                            break;
                                        default:
                                            switch (i3) {
                                                case 4001:
                                                    str = "ERROR_CODE_DECODER_INIT_FAILED";
                                                    break;
                                                case 4002:
                                                    str = "ERROR_CODE_DECODER_QUERY_FAILED";
                                                    break;
                                                case 4003:
                                                    str = "ERROR_CODE_DECODING_FAILED";
                                                    break;
                                                case 4004:
                                                    str = "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                                    break;
                                                case 4005:
                                                    str = "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                                    break;
                                                case 4006:
                                                    str = "ERROR_CODE_DECODING_RESOURCES_RECLAIMED";
                                                    break;
                                                default:
                                                    switch (i3) {
                                                        case 5001:
                                                            str = "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
                                                            break;
                                                        case 5002:
                                                            str = "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
                                                            break;
                                                        case 5003:
                                                            str = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_WRITE_FAILED";
                                                            break;
                                                        case 5004:
                                                            str = "ERROR_CODE_AUDIO_TRACK_OFFLOAD_INIT_FAILED";
                                                            break;
                                                        default:
                                                            switch (i3) {
                                                                case 6000:
                                                                    str = "ERROR_CODE_DRM_UNSPECIFIED";
                                                                    break;
                                                                case 6001:
                                                                    str = "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                                    break;
                                                                case 6002:
                                                                    str = "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                                    break;
                                                                case 6003:
                                                                    str = "ERROR_CODE_DRM_CONTENT_ERROR";
                                                                    break;
                                                                case 6004:
                                                                    str = "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                                    break;
                                                                case 6005:
                                                                    str = "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                                    break;
                                                                case 6006:
                                                                    str = "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                                    break;
                                                                case 6007:
                                                                    str = "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                                    break;
                                                                case 6008:
                                                                    str = "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                                    break;
                                                                default:
                                                                    str = i3 < 1000000 ? "invalid error code" : "custom error code";
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            str = "ERROR_CODE_VIDEO_FRAME_PROCESSING_FAILED";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(abstractC0547J.getMessage());
        Log.e("HDXNativePlayer", sb.toString());
        int i4 = abstractC0547J.f1946g;
        boolean z3 = i4 >= 2000 && i4 <= 2999;
        if ("live".equals(this.f6093g.f6032O) || z3 || (str2 = this.f6093g.f6042Y) == null || str2.isEmpty()) {
            PlayerActivity.m3450q(this.f6093g);
            return;
        }
        Toast.makeText(this.f6093g, "Abrindo no player alternativo…", 0).show();
        MainActivity.f6006q = this.f6093g.f6042Y;
        this.f6093g.finish();
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void mo1372D(boolean z3) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void mo1373E(C0544G c0544g) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void mo1374F(List list) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void mo1375H(int i3, boolean z3) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void mo1376I(int i3, boolean z3) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void mo1377J(C0549L c0549l) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void mo1378K(boolean z3) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo1379a(int i3) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo1380b(int i3, C0552O c0552o, C0552O c0552o2) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: c */
    public final void mo1381c(int i3) {
        if (i3 == 3) {
            PlayerActivity playerActivity = this.f6093g;
            playerActivity.f6054k0 = 0;
            playerActivity.f6055l0 = false;
            playerActivity.f6046c0.removeCallbacks(playerActivity.f6059p0);
            TextView textView = this.f6093g.f6057n0;
            if (textView != null) {
                textView.setVisibility(8);
                return;
            }
            return;
        }
        if (i3 == 4) {
            PlayerActivity playerActivity2 = this.f6093g;
            if (playerActivity2.f6047d0) {
                return;
            }
            if ("live".equals(playerActivity2.f6032O)) {
                PlayerActivity.m3450q(this.f6093g);
                return;
            }
            PlayerActivity playerActivity3 = this.f6093g;
            playerActivity3.f6047d0 = true;
            playerActivity3.m3454u(true);
            String str = this.f6093g.f6041X;
            if (str != null && !str.isEmpty()) {
                MainActivity.f6006q = this.f6093g.f6041X;
            }
            this.f6093g.finish();
        }
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void mo1382e(int i3) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void mo1383f(C0542E c0542e) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void mo1384h(C0615c c0615c) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void mo1385i(C0564a0 c0564a0) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void mo1386j(C0550M c0550m) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void mo1387k(AbstractC0547J abstractC0547J) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void mo1388m(C0574f0 c0574f0) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void mo1389o(C0568c0 c0568c0) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void mo1390q(boolean z3) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void mo1391r(C0548K c0548k) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void mo1392t() {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void mo1393u(C0539B c0539b, int i3) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void mo1394v(int i3, int i4) {
    }

    @Override // p055T.InterfaceC0551N
    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void mo1395w(int i3) {
    }
}
