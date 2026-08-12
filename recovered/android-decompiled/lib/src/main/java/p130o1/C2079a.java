package p130o1;

import com.google.android.gms.internal.cast.AbstractC1303m;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import p126n1.C2047b;

/* JADX INFO: renamed from: o1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2079a {

    /* JADX INFO: renamed from: c */
    public static final String f9030c;

    /* JADX INFO: renamed from: d */
    public static final Set f9031d;

    /* JADX INFO: renamed from: e */
    public static final C2079a f9032e;

    /* JADX INFO: renamed from: a */
    public final String f9033a;

    /* JADX INFO: renamed from: b */
    public final String f9034b;

    static {
        String strM3332y = AbstractC1303m.m3332y("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f9030c = strM3332y;
        AbstractC1303m.m3332y("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        AbstractC1303m.m3332y("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f9031d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new C2047b("proto"), new C2047b("json"))));
        f9032e = new C2079a(strM3332y, null);
    }

    public C2079a(String str, String str2) {
        this.f9033a = str;
        this.f9034b = str2;
    }

    /* JADX INFO: renamed from: a */
    public static C2079a m4642a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new C2079a(str2, str3);
    }
}
