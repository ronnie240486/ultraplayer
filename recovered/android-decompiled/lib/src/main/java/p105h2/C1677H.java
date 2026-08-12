package p105h2;

/* JADX INFO: renamed from: h2.H */
/* JADX INFO: loaded from: classes.dex */
public final class C1677H {

    /* JADX INFO: renamed from: a */
    public final Object f7602a;

    /* JADX INFO: renamed from: b */
    public final Object f7603b;

    /* JADX INFO: renamed from: c */
    public final Object f7604c;

    public C1677H(Object obj, Object obj2, Object obj3) {
        this.f7602a = obj;
        this.f7603b = obj2;
        this.f7604c = obj3;
    }

    /* JADX INFO: renamed from: a */
    public final IllegalArgumentException m4124a() {
        StringBuilder sb = new StringBuilder("Multiple entries with same key: ");
        Object obj = this.f7602a;
        sb.append(obj);
        sb.append("=");
        sb.append(this.f7603b);
        sb.append(" and ");
        sb.append(obj);
        sb.append("=");
        sb.append(this.f7604c);
        return new IllegalArgumentException(sb.toString());
    }
}
