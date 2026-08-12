package p129o0;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.PlayerActivity;
import java.util.HashMap;
import java.util.Locale;
import p064W.AbstractC0632A;
import p064W.C0653u;
import p105h2.C1692X;

/* JADX INFO: renamed from: o0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2067g {

    /* JADX INFO: renamed from: a */
    public final Context f8971a;

    /* JADX INFO: renamed from: b */
    public final HashMap f8972b;

    /* JADX INFO: renamed from: c */
    public final int f8973c;

    /* JADX INFO: renamed from: d */
    public final C0653u f8974d;

    /* JADX INFO: renamed from: e */
    public final boolean f8975e;

    /* JADX WARN: Code duplicated, block: B:7:0x0032  */
    public C2067g(PlayerActivity playerActivity) {
        String strM3289L;
        int[] iArr;
        this.f8971a = playerActivity.getApplicationContext();
        int i3 = AbstractC0632A.f2454a;
        TelephonyManager telephonyManager = (TelephonyManager) playerActivity.getSystemService("phone");
        if (telephonyManager != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (TextUtils.isEmpty(networkCountryIso)) {
                strM3289L = AbstractC1303m.m3289L(Locale.getDefault().getCountry());
            } else {
                strM3289L = AbstractC1303m.m3289L(networkCountryIso);
            }
        } else {
            strM3289L = AbstractC1303m.m3289L(Locale.getDefault().getCountry());
        }
        C1692X c1692x = C2068h.f8976n;
        strM3289L.getClass();
        switch (strM3289L) {
            case "AD":
            case "AI":
            case "BB":
            case "BQ":
            case "CW":
            case "DM":
            case "KN":
            case "KY":
            case "SX":
            case "VC":
                iArr = new int[]{1, 2, 0, 0, 2, 2};
                break;
            case "AE":
                iArr = new int[]{1, 4, 2, 3, 4, 1};
                break;
            case "AF":
            case "SZ":
                iArr = new int[]{4, 4, 3, 4, 2, 2};
                break;
            case "AG":
            case "CI":
                iArr = new int[]{2, 4, 3, 4, 2, 2};
                break;
            case "AL":
                iArr = new int[]{1, 1, 1, 2, 2, 2};
                break;
            case "AM":
            case "PA":
                iArr = new int[]{2, 3, 2, 3, 2, 2};
                break;
            case "AO":
                iArr = new int[]{3, 4, 4, 3, 2, 2};
                break;
            case "AQ":
            case "ER":
            case "NU":
            case "SC":
            case "SH":
                iArr = new int[]{4, 2, 2, 2, 2, 2};
                break;
            case "AR":
                iArr = new int[]{2, 2, 2, 2, 1, 2};
                break;
            case "AS":
                iArr = new int[]{2, 2, 3, 3, 2, 2};
                break;
            case "AT":
            case "EE":
            case "HU":
            case "IS":
            case "LV":
            case "MT":
            case "SE":
                iArr = new int[]{0, 0, 0, 0, 0, 2};
                break;
            case "AU":
                iArr = new int[]{0, 3, 1, 1, 3, 0};
                break;
            case "AW":
                iArr = new int[]{2, 2, 3, 4, 2, 2};
                break;
            case "AX":
            case "CX":
            case "LI":
            case "MS":
            case "PM":
            case "SM":
            case "VA":
                iArr = new int[]{0, 2, 2, 2, 2, 2};
                break;
            case "AZ":
            case "DJ":
            case "LY":
            case "SL":
                iArr = new int[]{4, 2, 3, 3, 2, 2};
                break;
            case "BA":
            case "JO":
            case "TR":
                iArr = new int[]{1, 1, 1, 1, 2, 2};
                break;
            case "BD":
                iArr = new int[]{2, 1, 3, 2, 4, 2};
                break;
            case "BE":
                iArr = new int[]{0, 0, 1, 0, 1, 2};
                break;
            case "BF":
            case "SD":
            case "SY":
            case "TD":
                iArr = new int[]{4, 3, 4, 4, 2, 2};
                break;
            case "BG":
            case "PT":
            case "SI":
                iArr = new int[]{0, 0, 0, 0, 1, 2};
                break;
            case "BH":
                iArr = new int[]{1, 3, 1, 3, 4, 2};
                break;
            case "BI":
            case "GQ":
            case "HT":
            case "NE":
            case "VE":
            case "YE":
                iArr = new int[]{4, 4, 4, 4, 2, 2};
                break;
            case "BJ":
                iArr = new int[]{4, 4, 2, 3, 2, 2};
                break;
            case "BL":
            case "MP":
            case "PY":
                iArr = new int[]{1, 2, 2, 2, 2, 2};
                break;
            case "BM":
                iArr = new int[]{0, 2, 0, 0, 2, 2};
                break;
            case "BN":
                iArr = new int[]{3, 2, 0, 0, 2, 2};
                break;
            case "BO":
                iArr = new int[]{1, 2, 4, 4, 2, 2};
                break;
            case "BR":
                iArr = new int[]{1, 1, 1, 1, 2, 4};
                break;
            case "BS":
                iArr = new int[]{3, 2, 1, 1, 2, 2};
                break;
            case "BT":
                iArr = new int[]{3, 1, 2, 2, 3, 2};
                break;
            case "BW":
                iArr = new int[]{3, 2, 1, 0, 2, 2};
                break;
            case "BY":
                iArr = new int[]{1, 2, 3, 3, 2, 2};
                break;
            case "BZ":
            case "CK":
                iArr = new int[]{2, 2, 2, 1, 2, 2};
                break;
            case "CA":
            case "UA":
                iArr = new int[]{0, 2, 1, 2, 3, 3};
                break;
            case "CD":
            case "ML":
                iArr = new int[]{3, 3, 2, 2, 2, 2};
                break;
            case "CF":
                iArr = new int[]{4, 2, 4, 2, 2, 2};
                break;
            case "CG":
            case "EG":
            case "MG":
                iArr = new int[]{3, 4, 3, 3, 2, 2};
                break;
            case "CH":
                iArr = new int[]{0, 1, 0, 0, 0, 2};
                break;
            case "CL":
            case "TH":
                iArr = new int[]{0, 1, 2, 2, 2, 2};
                break;
            case "CM":
            case "MR":
                iArr = new int[]{4, 3, 3, 4, 2, 2};
                break;
            case "CN":
                iArr = new int[]{2, 0, 1, 1, 3, 1};
                break;
            case "CO":
                iArr = new int[]{2, 3, 3, 2, 2, 2};
                break;
            case "CR":
            case "NI":
                iArr = new int[]{2, 4, 4, 4, 2, 2};
                break;
            case "CU":
            case "KI":
            case "NR":
            case "TL":
                iArr = new int[]{4, 2, 4, 4, 2, 2};
                break;
            case "CV":
                iArr = new int[]{2, 3, 0, 1, 2, 2};
                break;
            case "CY":
                iArr = new int[]{1, 0, 1, 0, 0, 2};
                break;
            case "CZ":
                iArr = new int[]{0, 0, 2, 0, 1, 2};
                break;
            case "DE":
                iArr = new int[]{0, 1, 4, 2, 2, 1};
                break;
            case "DK":
                iArr = new int[]{0, 0, 2, 0, 0, 2};
                break;
            case "DO":
            case "LR":
                iArr = new int[]{3, 4, 4, 4, 2, 2};
                break;
            case "DZ":
            case "TJ":
                iArr = new int[]{3, 3, 4, 4, 2, 2};
                break;
            case "EC":
                iArr = new int[]{1, 3, 2, 1, 2, 2};
                break;
            case "ES":
                iArr = new int[]{0, 0, 0, 0, 1, 0};
                break;
            case "ET":
                iArr = new int[]{4, 3, 4, 4, 4, 2};
                break;
            case "FI":
                iArr = new int[]{0, 0, 0, 1, 0, 2};
                break;
            case "FJ":
                iArr = new int[]{3, 2, 2, 3, 2, 2};
                break;
            case "FK":
            case "NF":
            case "SJ":
                iArr = new int[]{3, 2, 2, 2, 2, 2};
                break;
            case "FM":
                iArr = new int[]{4, 2, 4, 0, 2, 2};
                break;
            case "FO":
                iArr = new int[]{0, 2, 2, 0, 2, 2};
                break;
            case "FR":
                iArr = new int[]{1, 1, 1, 1, 0, 2};
                break;
            case "GA":
                iArr = new int[]{3, 4, 0, 0, 2, 2};
                break;
            case "GB":
                iArr = new int[]{1, 1, 3, 2, 2, 2};
                break;
            case "GD":
                iArr = new int[]{2, 2, 0, 0, 2, 2};
                break;
            case "GE":
                iArr = new int[]{1, 1, 0, 2, 2, 2};
                break;
            case "GF":
                iArr = new int[]{3, 2, 3, 3, 2, 2};
                break;
            case "GG":
                iArr = new int[]{0, 2, 1, 1, 2, 2};
                break;
            case "GH":
                iArr = new int[]{3, 3, 3, 2, 2, 2};
                break;
            case "GI":
            case "IM":
            case "JE":
                iArr = new int[]{0, 2, 0, 1, 2, 2};
                break;
            case "GL":
            case "MC":
                iArr = new int[]{1, 2, 2, 0, 2, 2};
                break;
            case "GM":
            case "SS":
                iArr = new int[]{4, 3, 2, 4, 2, 2};
                break;
            case "GN":
                iArr = new int[]{3, 4, 4, 2, 2, 2};
                break;
            case "GP":
                iArr = new int[]{2, 1, 1, 3, 2, 2};
                break;
            case "GR":
                iArr = new int[]{1, 0, 0, 0, 1, 2};
                break;
            case "GT":
                iArr = new int[]{2, 1, 2, 1, 2, 2};
                break;
            case "GU":
                iArr = new int[]{2, 2, 4, 3, 3, 2};
                break;
            case "GW":
                iArr = new int[]{4, 4, 1, 2, 2, 2};
                break;
            case "GY":
                iArr = new int[]{3, 1, 1, 3, 2, 2};
                break;
            case "HK":
                iArr = new int[]{0, 1, 0, 1, 1, 0};
                break;
            case "HR":
            case "KW":
                iArr = new int[]{1, 0, 0, 0, 0, 2};
                break;
            case "ID":
                iArr = new int[]{3, 1, 3, 3, 2, 4};
                break;
            case "IE":
                iArr = new int[]{1, 1, 1, 1, 1, 2};
                break;
            case "IL":
                iArr = new int[]{1, 2, 2, 3, 4, 2};
                break;
            case "IN":
                iArr = new int[]{1, 1, 3, 2, 2, 3};
                break;
            case "IO":
                iArr = new int[]{3, 2, 2, 0, 2, 2};
                break;
            case "IQ":
                iArr = new int[]{3, 2, 3, 2, 2, 2};
                break;
            case "IR":
                iArr = new int[]{4, 2, 3, 3, 4, 3};
                break;
            case "IT":
                iArr = new int[]{0, 1, 1, 2, 1, 2};
                break;
            case "JM":
                iArr = new int[]{2, 4, 3, 1, 2, 2};
                break;
            case "JP":
                iArr = new int[]{0, 3, 2, 3, 4, 2};
                break;
            case "KE":
                iArr = new int[]{3, 2, 1, 1, 1, 2};
                break;
            case "KG":
                iArr = new int[]{2, 1, 1, 2, 2, 2};
                break;
            case "KH":
                iArr = new int[]{1, 0, 4, 2, 2, 2};
                break;
            case "KM":
            case "VU":
                iArr = new int[]{4, 3, 3, 2, 2, 2};
                break;
            case "KR":
                iArr = new int[]{0, 2, 2, 4, 4, 4};
                break;
            case "KZ":
                iArr = new int[]{2, 1, 2, 2, 3, 2};
                break;
            case "LA":
                iArr = new int[]{1, 2, 1, 3, 2, 2};
                break;
            case "LB":
                iArr = new int[]{3, 1, 1, 2, 2, 2};
                break;
            case "LC":
                iArr = new int[]{2, 2, 1, 1, 2, 2};
                break;
            case "LK":
            case "MM":
                iArr = new int[]{3, 2, 3, 3, 4, 2};
                break;
            case "LS":
            case "PG":
                iArr = new int[]{4, 3, 3, 3, 2, 2};
                break;
            case "LT":
                iArr = new int[]{0, 1, 0, 1, 0, 2};
                break;
            case "LU":
                iArr = new int[]{4, 0, 3, 2, 1, 3};
                break;
            case "MA":
                iArr = new int[]{3, 3, 1, 1, 2, 2};
                break;
            case "MD":
                iArr = new int[]{1, 0, 0, 0, 2, 2};
                break;
            case "ME":
                iArr = new int[]{2, 0, 0, 1, 3, 2};
                break;
            case "MF":
                iArr = new int[]{1, 2, 2, 3, 2, 2};
                break;
            case "MH":
            case "TM":
            case "TV":
            case "WF":
                iArr = new int[]{4, 2, 2, 4, 2, 2};
                break;
            case "MK":
                iArr = new int[]{1, 0, 0, 1, 3, 2};
                break;
            case "MN":
                iArr = new int[]{2, 0, 2, 2, 2, 2};
                break;
            case "MO":
                iArr = new int[]{0, 2, 4, 4, 3, 1};
                break;
            case "MQ":
                iArr = new int[]{2, 1, 2, 3, 2, 2};
                break;
            case "MU":
                iArr = new int[]{3, 1, 0, 2, 2, 2};
                break;
            case "MV":
                iArr = new int[]{3, 2, 1, 3, 4, 2};
                break;
            case "MW":
                iArr = new int[]{3, 2, 2, 1, 2, 2};
                break;
            case "MX":
                iArr = new int[]{2, 4, 4, 4, 3, 2};
                break;
            case "MY":
                iArr = new int[]{1, 0, 4, 1, 1, 0};
                break;
            case "MZ":
            case "WS":
                iArr = new int[]{3, 1, 2, 2, 2, 2};
                break;
            case "NA":
                iArr = new int[]{3, 4, 3, 2, 2, 2};
                break;
            case "NC":
            case "YT":
                iArr = new int[]{2, 3, 3, 4, 2, 2};
                break;
            case "NG":
                iArr = new int[]{3, 4, 2, 1, 2, 2};
                break;
            case "NL":
                iArr = new int[]{2, 1, 4, 3, 0, 4};
                break;
            case "NO":
                iArr = new int[]{0, 0, 3, 0, 0, 2};
                break;
            case "NP":
                iArr = new int[]{2, 2, 4, 3, 2, 2};
                break;
            case "NZ":
                iArr = new int[]{0, 0, 1, 2, 4, 2};
                break;
            case "OM":
                iArr = new int[]{2, 3, 1, 2, 4, 2};
                break;
            case "PE":
                iArr = new int[]{1, 2, 4, 4, 3, 2};
                break;
            case "PF":
                iArr = new int[]{2, 2, 3, 1, 2, 2};
                break;
            case "PH":
                iArr = new int[]{2, 1, 2, 3, 2, 1};
                break;
            case "PK":
                iArr = new int[]{3, 3, 3, 3, 2, 2};
                break;
            case "PL":
                iArr = new int[]{1, 0, 2, 2, 4, 4};
                break;
            case "PR":
                iArr = new int[]{2, 0, 2, 1, 2, 0};
                break;
            case "PS":
                iArr = new int[]{3, 4, 1, 3, 2, 2};
                break;
            case "PW":
                iArr = new int[]{2, 2, 4, 1, 2, 2};
                break;
            case "QA":
                iArr = new int[]{1, 4, 4, 4, 4, 2};
                break;
            case "RE":
                iArr = new int[]{0, 3, 2, 3, 1, 2};
                break;
            case "RO":
                iArr = new int[]{0, 0, 1, 1, 3, 2};
                break;
            case "RS":
                iArr = new int[]{1, 0, 0, 1, 2, 2};
                break;
            case "RU":
                iArr = new int[]{1, 0, 0, 1, 3, 3};
                break;
            case "RW":
                iArr = new int[]{3, 3, 2, 0, 2, 2};
                break;
            case "SA":
                iArr = new int[]{3, 1, 1, 2, 2, 0};
                break;
            case "SB":
            case "ZW":
                iArr = new int[]{4, 2, 4, 3, 2, 2};
                break;
            case "SG":
                iArr = new int[]{2, 3, 3, 3, 1, 1};
                break;
            case "SK":
                iArr = new int[]{0, 1, 1, 1, 2, 2};
                break;
            case "SN":
                iArr = new int[]{4, 4, 3, 2, 2, 2};
                break;
            case "SO":
                iArr = new int[]{2, 2, 3, 4, 4, 2};
                break;
            case "SR":
                iArr = new int[]{2, 4, 4, 1, 2, 2};
                break;
            case "ST":
                iArr = new int[]{2, 2, 1, 2, 2, 2};
                break;
            case "SV":
                iArr = new int[]{2, 3, 2, 1, 2, 2};
                break;
            case "TC":
                iArr = new int[]{3, 2, 1, 2, 2, 2};
                break;
            case "TG":
                iArr = new int[]{3, 4, 1, 0, 2, 2};
                break;
            case "TN":
                iArr = new int[]{3, 1, 1, 1, 2, 2};
                break;
            case "TO":
                iArr = new int[]{3, 2, 4, 3, 2, 2};
                break;
            case "TT":
                iArr = new int[]{2, 4, 1, 0, 2, 2};
                break;
            case "TW":
                iArr = new int[]{0, 0, 0, 0, 0, 0};
                break;
            case "TZ":
                iArr = new int[]{3, 4, 2, 1, 3, 2};
                break;
            case "UG":
                iArr = new int[]{3, 3, 2, 3, 4, 2};
                break;
            case "US":
                iArr = new int[]{2, 2, 4, 1, 3, 1};
                break;
            case "UY":
                iArr = new int[]{2, 1, 1, 2, 1, 2};
                break;
            case "UZ":
                iArr = new int[]{1, 2, 3, 4, 3, 2};
                break;
            case "VG":
                iArr = new int[]{2, 2, 1, 1, 2, 4};
                break;
            case "VI":
                iArr = new int[]{0, 2, 1, 2, 2, 2};
                break;
            case "VN":
                iArr = new int[]{0, 0, 1, 2, 2, 2};
                break;
            case "XK":
                iArr = new int[]{1, 2, 1, 1, 2, 2};
                break;
            case "ZA":
                iArr = new int[]{2, 4, 2, 1, 1, 2};
                break;
            case "ZM":
                iArr = new int[]{4, 4, 4, 3, 2, 2};
                break;
            default:
                iArr = new int[]{2, 2, 2, 2, 2, 2};
                break;
        }
        HashMap map = new HashMap(8);
        map.put(0, 1000000L);
        C1692X c1692x2 = C2068h.f8976n;
        map.put(2, (Long) c1692x2.get(iArr[0]));
        map.put(3, (Long) C2068h.f8977o.get(iArr[1]));
        map.put(4, (Long) C2068h.f8978p.get(iArr[2]));
        map.put(5, (Long) C2068h.f8979q.get(iArr[3]));
        map.put(10, (Long) C2068h.f8980r.get(iArr[4]));
        map.put(9, (Long) C2068h.f8981s.get(iArr[5]));
        map.put(7, (Long) c1692x2.get(iArr[0]));
        this.f8972b = map;
        this.f8973c = 2000;
        this.f8974d = C0653u.f2526a;
        this.f8975e = true;
    }
}
