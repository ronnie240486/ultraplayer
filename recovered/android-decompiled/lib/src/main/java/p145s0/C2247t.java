package p145s0;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p018G0.C0215e;
import p018G0.C0221k;
import p055T.C0544G;
import p055T.InterfaceC0543F;
import p064W.AbstractC0632A;

/* JADX INFO: renamed from: s0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C2247t {

    /* JADX INFO: renamed from: c */
    public static final Pattern f9658c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a */
    public int f9659a = -1;

    /* JADX INFO: renamed from: b */
    public int f9660b = -1;

    /* JADX INFO: renamed from: a */
    public final boolean m4842a(String str) {
        Matcher matcher = f9658c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i3 = AbstractC0632A.f2454a;
            int i4 = Integer.parseInt(strGroup, 16);
            int i5 = Integer.parseInt(matcher.group(2), 16);
            if (i4 <= 0 && i5 <= 0) {
                return false;
            }
            this.f9659a = i4;
            this.f9660b = i5;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4843b(C0544G c0544g) {
        int i3 = 0;
        while (true) {
            InterfaceC0543F[] interfaceC0543FArr = c0544g.f1940g;
            if (i3 >= interfaceC0543FArr.length) {
                return;
            }
            InterfaceC0543F interfaceC0543F = interfaceC0543FArr[i3];
            if (interfaceC0543F instanceof C0215e) {
                C0215e c0215e = (C0215e) interfaceC0543F;
                if ("iTunSMPB".equals(c0215e.f498i) && m4842a(c0215e.f499j)) {
                    return;
                }
            } else if (interfaceC0543F instanceof C0221k) {
                C0221k c0221k = (C0221k) interfaceC0543F;
                if ("com.apple.iTunes".equals(c0221k.f511h) && "iTunSMPB".equals(c0221k.f512i) && m4842a(c0221k.f513j)) {
                    return;
                }
            } else {
                continue;
            }
            i3++;
        }
    }
}
