package p069X1;

import android.os.IBinder;
import android.os.IInterface;
import p084b2.AbstractBinderC1117a;

/* JADX INFO: renamed from: X1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC0699b extends AbstractBinderC1117a implements InterfaceC0700c {
    public static InterfaceC0700c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0700c ? (InterfaceC0700c) iInterfaceQueryLocalInterface : new C0698a(iBinder);
    }
}
