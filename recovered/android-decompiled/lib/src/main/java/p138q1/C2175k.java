package p138q1;

import java.io.Closeable;
import p139q2.InterfaceC2180a;
import p150t1.C2277c;
import p166y1.C2383h;
import p166y1.InterfaceC2379d;

/* JADX INFO: renamed from: q1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2175k implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: g */
    public InterfaceC2180a f9394g;

    /* JADX INFO: renamed from: h */
    public C2277c f9395h;

    /* JADX INFO: renamed from: i */
    public InterfaceC2180a f9396i;

    /* JADX INFO: renamed from: j */
    public InterfaceC2180a f9397j;

    /* JADX INFO: renamed from: k */
    public InterfaceC2180a f9398k;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((C2383h) ((InterfaceC2379d) this.f9397j.get())).close();
    }
}
