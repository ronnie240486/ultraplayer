package p163x2;

/* JADX INFO: renamed from: x2.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2365d {

    /* JADX INFO: renamed from: a */
    public static final C2366e f9921a;

    static {
        C2366e c2366e = null;
        try {
            c2366e = (C2366e) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (c2366e == null) {
            c2366e = new C2366e();
        }
        f9921a = c2366e;
    }
}
