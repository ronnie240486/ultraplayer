package p069X1;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: X1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0698a implements InterfaceC0700c, IInterface {

    /* JADX INFO: renamed from: b */
    public final IBinder f2691b;

    public C0698a(IBinder iBinder) {
        this.f2691b = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2691b;
    }
}
