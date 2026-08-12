package p063V1;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;
import p045P0.AbstractC0462h;
import p046P1.AbstractC0491s;
import p079a2.AbstractBinderC0852a;

/* JADX INFO: renamed from: V1.b */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0630b extends AbstractBinderC0852a implements InterfaceC0629a {

    /* JADX INFO: renamed from: c */
    public final Object f2453c;

    public BinderC0630b(Object obj) {
        super(0, "com.google.android.gms.dynamic.IObjectWrapper");
        this.f2453c = obj;
    }

    /* JADX INFO: renamed from: v0 */
    public static InterfaceC0629a m1558v0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0629a ? (InterfaceC0629a) iInterfaceQueryLocalInterface : new C0631c(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 1);
    }

    /* JADX INFO: renamed from: w0 */
    public static Object m1559w0(InterfaceC0629a interfaceC0629a) {
        if (interfaceC0629a instanceof BinderC0630b) {
            return ((BinderC0630b) interfaceC0629a).f2453c;
        }
        IBinder iBinderAsBinder = interfaceC0629a.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i3 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i3++;
                field = field2;
            }
        }
        if (i3 != 1) {
            throw new IllegalArgumentException(AbstractC0462h.m1165e(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
        AbstractC0491s.m1213e(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e3) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e3);
        } catch (NullPointerException e4) {
            throw new IllegalArgumentException("Binder object is null.", e4);
        }
    }
}
