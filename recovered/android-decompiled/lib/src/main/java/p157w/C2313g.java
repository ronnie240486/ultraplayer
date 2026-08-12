package p157w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: renamed from: w.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2313g implements InterfaceC2314h {

    /* JADX INFO: renamed from: c */
    public static final Locale[] f9833c = new Locale[0];

    /* JADX INFO: renamed from: a */
    public final Locale[] f9834a;

    /* JADX INFO: renamed from: b */
    public final String f9835b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] strArrSplit = "en-Latn".split("-", -1);
        if (strArrSplit.length > 2) {
            new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
        } else if (strArrSplit.length > 1) {
            new Locale(strArrSplit[0], strArrSplit[1]);
        } else {
            if (strArrSplit.length != 1) {
                throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
            }
            new Locale(strArrSplit[0]);
        }
    }

    public C2313g(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f9834a = f9833c;
            this.f9835b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < localeArr.length; i3++) {
            Locale locale = localeArr[i3];
            if (locale == null) {
                throw new NullPointerException("list[" + i3 + "] is null");
            }
            if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                arrayList.add(locale2);
                sb.append(locale2.getLanguage());
                String country = locale2.getCountry();
                if (country != null && !country.isEmpty()) {
                    sb.append('-');
                    sb.append(locale2.getCountry());
                }
                if (i3 < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
            }
        }
        this.f9834a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f9835b = sb.toString();
    }

    @Override // p157w.InterfaceC2314h
    /* JADX INFO: renamed from: a */
    public final Object mo4935a() {
        return null;
    }

    @Override // p157w.InterfaceC2314h
    /* JADX INFO: renamed from: b */
    public final String mo4936b() {
        return this.f9835b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2313g)) {
            return false;
        }
        Locale[] localeArr = ((C2313g) obj).f9834a;
        Locale[] localeArr2 = this.f9834a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i3 = 0; i3 < localeArr2.length; i3++) {
            if (!localeArr2[i3].equals(localeArr[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // p157w.InterfaceC2314h
    public final Locale get(int i3) {
        if (i3 < 0) {
            return null;
        }
        Locale[] localeArr = this.f9834a;
        if (i3 < localeArr.length) {
            return localeArr[i3];
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f9834a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // p157w.InterfaceC2314h
    public final boolean isEmpty() {
        return this.f9834a.length == 0;
    }

    @Override // p157w.InterfaceC2314h
    public final int size() {
        return this.f9834a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i3 = 0;
        while (true) {
            Locale[] localeArr = this.f9834a;
            if (i3 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i3]);
            if (i3 < localeArr.length - 1) {
                sb.append(',');
            }
            i3++;
        }
    }
}
