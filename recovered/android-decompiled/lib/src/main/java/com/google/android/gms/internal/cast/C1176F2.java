package com.google.android.gms.internal.cast;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.F2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1176F2 {

    /* JADX INFO: renamed from: c */
    public static final C1176F2 f5618c = new C1176F2();

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f5620b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final C1342v2 f5619a = new C1342v2();

    /* JADX INFO: renamed from: a */
    public final InterfaceC1188I2 m3131a(Class cls) {
        InterfaceC1188I2 interfaceC1188I2M3098k;
        Class cls2;
        Charset charset = AbstractC1306m2.f5927a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f5620b;
        InterfaceC1188I2 interfaceC1188I2 = (InterfaceC1188I2) concurrentHashMap.get(cls);
        if (interfaceC1188I2 != null) {
            return interfaceC1188I2;
        }
        C1342v2 c1342v2 = this.f5619a;
        c1342v2.getClass();
        Class cls3 = AbstractC1192J2.f5645a;
        if (!AbstractC1282g2.class.isAssignableFrom(cls) && (cls2 = AbstractC1192J2.f5645a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        C1184H2 c1184h2Mo3247a = ((C1338u2) c1342v2.f5983g).mo3247a(cls);
        if ((c1184h2Mo3247a.f5638d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC1282g2.class.isAssignableFrom(cls);
            AbstractC1230T1 abstractC1230T1 = c1184h2Mo3247a.f5635a;
            if (zIsAssignableFrom) {
                interfaceC1188I2M3098k = new C1160B2(AbstractC1192J2.f5647c, AbstractC1266c2.f5823a, abstractC1230T1);
            } else {
                C1204M2 c1204m2 = AbstractC1192J2.f5646b;
                C1262b2 c1262b2 = AbstractC1266c2.f5824b;
                if (c1262b2 == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                interfaceC1188I2M3098k = new C1160B2(c1204m2, c1262b2, abstractC1230T1);
            }
        } else if (AbstractC1282g2.class.isAssignableFrom(cls)) {
            if (c1184h2Mo3247a.m3145a() - 1 != 1) {
                int i3 = AbstractC1168D2.f5604a;
                C1326r2 c1326r2 = AbstractC1330s2.f5965b;
                C1204M2 c1204m3 = AbstractC1192J2.f5647c;
                C1262b2 c1262b3 = AbstractC1266c2.f5823a;
                int i4 = AbstractC1350x2.f5990a;
                interfaceC1188I2M3098k = C1156A2.m3098k(c1184h2Mo3247a, c1326r2, c1204m3, c1262b3);
            } else {
                int i5 = AbstractC1168D2.f5604a;
                C1326r2 c1326r3 = AbstractC1330s2.f5965b;
                C1204M2 c1204m4 = AbstractC1192J2.f5647c;
                int i6 = AbstractC1350x2.f5990a;
                interfaceC1188I2M3098k = C1156A2.m3098k(c1184h2Mo3247a, c1326r3, c1204m4, null);
            }
        } else if (c1184h2Mo3247a.m3145a() - 1 != 1) {
            int i7 = AbstractC1168D2.f5604a;
            C1322q2 c1322q2 = AbstractC1330s2.f5964a;
            C1204M2 c1204m5 = AbstractC1192J2.f5646b;
            C1262b2 c1262b4 = AbstractC1266c2.f5824b;
            if (c1262b4 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            int i8 = AbstractC1350x2.f5990a;
            interfaceC1188I2M3098k = C1156A2.m3098k(c1184h2Mo3247a, c1322q2, c1204m5, c1262b4);
        } else {
            int i9 = AbstractC1168D2.f5604a;
            C1322q2 c1322q3 = AbstractC1330s2.f5964a;
            C1204M2 c1204m6 = AbstractC1192J2.f5646b;
            int i10 = AbstractC1350x2.f5990a;
            interfaceC1188I2M3098k = C1156A2.m3098k(c1184h2Mo3247a, c1322q3, c1204m6, null);
        }
        InterfaceC1188I2 interfaceC1188I3 = (InterfaceC1188I2) concurrentHashMap.putIfAbsent(cls, interfaceC1188I2M3098k);
        return interfaceC1188I3 == null ? interfaceC1188I2M3098k : interfaceC1188I3;
    }
}
