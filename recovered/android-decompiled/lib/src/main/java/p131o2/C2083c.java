package p131o2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import p123m2.InterfaceC2012f;
import p123m2.InterfaceC2013g;

/* JADX INFO: renamed from: o2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2083c implements InterfaceC2012f {

    /* JADX INFO: renamed from: a */
    public static final SimpleDateFormat f9044a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f9044a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    @Override // p123m2.InterfaceC2007a
    /* JADX INFO: renamed from: a */
    public final void mo4565a(Object obj, Object obj2) {
        ((InterfaceC2013g) obj2).mo4569a(f9044a.format((Date) obj));
    }
}
