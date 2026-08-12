package androidx.media;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.Arrays;
import p045P0.AbstractC0462h;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public int f4350a = 0;

    /* JADX INFO: renamed from: b */
    public int f4351b = 0;

    /* JADX INFO: renamed from: c */
    public int f4352c = 0;

    /* JADX INFO: renamed from: d */
    public int f4353d = -1;

    public final boolean equals(Object obj) {
        int i3;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f4351b == audioAttributesImplBase.f4351b) {
            int i4 = this.f4352c;
            int i5 = audioAttributesImplBase.f4352c;
            int i6 = audioAttributesImplBase.f4353d;
            if (i6 == -1) {
                int i7 = audioAttributesImplBase.f4350a;
                int i8 = AudioAttributesCompat.f4346b;
                if ((i5 & 1) != 1) {
                    if ((i5 & 4) != 4) {
                        switch (i7) {
                            case 2:
                                i3 = 0;
                                break;
                            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                                i3 = 8;
                                break;
                            case 4:
                                i3 = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i3 = 5;
                                break;
                            case 6:
                                i3 = 2;
                                break;
                            case 11:
                                i3 = 10;
                                break;
                            case 12:
                            default:
                                i3 = 3;
                                break;
                            case 13:
                                i3 = 1;
                                break;
                        }
                    } else {
                        i3 = 6;
                    }
                } else {
                    i3 = 7;
                }
            } else {
                i3 = i6;
            }
            if (i3 == 6) {
                i5 |= 4;
            } else if (i3 == 7) {
                i5 |= 1;
            }
            if (i4 == (i5 & 273) && this.f4350a == audioAttributesImplBase.f4350a && this.f4353d == i6) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4351b), Integer.valueOf(this.f4352c), Integer.valueOf(this.f4350a), Integer.valueOf(this.f4353d)});
    }

    public final String toString() {
        String strM1165e;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f4353d != -1) {
            sb.append(" stream=");
            sb.append(this.f4353d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i3 = this.f4350a;
        int i4 = AudioAttributesCompat.f4346b;
        switch (i3) {
            case 0:
                strM1165e = "USAGE_UNKNOWN";
                break;
            case 1:
                strM1165e = "USAGE_MEDIA";
                break;
            case 2:
                strM1165e = "USAGE_VOICE_COMMUNICATION";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                strM1165e = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strM1165e = "USAGE_ALARM";
                break;
            case 5:
                strM1165e = "USAGE_NOTIFICATION";
                break;
            case 6:
                strM1165e = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strM1165e = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strM1165e = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strM1165e = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strM1165e = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strM1165e = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strM1165e = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strM1165e = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strM1165e = "USAGE_GAME";
                break;
            case 15:
            default:
                strM1165e = AbstractC0462h.m1165e(i3, "unknown usage ");
                break;
            case 16:
                strM1165e = "USAGE_ASSISTANT";
                break;
        }
        sb.append(strM1165e);
        sb.append(" content=");
        sb.append(this.f4351b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f4352c).toUpperCase());
        return sb.toString();
    }
}
