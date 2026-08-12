package p016F1;

import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.gms.internal.cast.AbstractC1339v;
import p063V1.BinderC0630b;
import p063V1.InterfaceC0629a;
import p079a2.AbstractBinderC0852a;

/* JADX INFO: renamed from: F1.C */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0177C extends AbstractBinderC0852a {

    /* JADX INFO: renamed from: c */
    public final InterfaceC0193j f410c;

    /* JADX INFO: renamed from: d */
    public final Class f411d;

    public BinderC0177C(InterfaceC0193j interfaceC0193j) {
        super(1, "com.google.android.gms.cast.framework.ISessionManagerListener");
        this.f410c = interfaceC0193j;
        this.f411d = C0187d.class;
    }

    @Override // p079a2.AbstractBinderC0852a
    /* JADX INFO: renamed from: u0 */
    public final boolean mo648u0(int i3, Parcel parcel, Parcel parcel2) {
        Class cls = this.f411d;
        InterfaceC0193j interfaceC0193j = this.f410c;
        switch (i3) {
            case 1:
                BinderC0630b binderC0630b = new BinderC0630b(interfaceC0193j);
                parcel2.writeNoException();
                AbstractC1339v.m3422d(parcel2, binderC0630b);
                return true;
            case 2:
                InterfaceC0629a interfaceC0629aM1558v0 = BinderC0630b.m1558v0(parcel.readStrongBinder());
                AbstractC1339v.m3420b(parcel);
                AbstractC0191h abstractC0191h = (AbstractC0191h) BinderC0630b.m1559w0(interfaceC0629aM1558v0);
                if (cls.isInstance(abstractC0191h) && interfaceC0193j != null) {
                    interfaceC0193j.mo688h((AbstractC0191h) cls.cast(abstractC0191h));
                }
                parcel2.writeNoException();
                return true;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                InterfaceC0629a interfaceC0629aM1558v1 = BinderC0630b.m1558v0(parcel.readStrongBinder());
                String string = parcel.readString();
                AbstractC1339v.m3420b(parcel);
                AbstractC0191h abstractC0191h2 = (AbstractC0191h) BinderC0630b.m1559w0(interfaceC0629aM1558v1);
                if (cls.isInstance(abstractC0191h2) && interfaceC0193j != null) {
                    interfaceC0193j.mo685e((AbstractC0191h) cls.cast(abstractC0191h2), string);
                }
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC0629a interfaceC0629aM1558v2 = BinderC0630b.m1558v0(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                AbstractC1339v.m3420b(parcel);
                AbstractC0191h abstractC0191h3 = (AbstractC0191h) BinderC0630b.m1559w0(interfaceC0629aM1558v2);
                if (cls.isInstance(abstractC0191h3) && interfaceC0193j != null) {
                    interfaceC0193j.mo682b((AbstractC0191h) cls.cast(abstractC0191h3), i4);
                }
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC0629a interfaceC0629aM1558v3 = BinderC0630b.m1558v0(parcel.readStrongBinder());
                AbstractC1339v.m3420b(parcel);
                AbstractC0191h abstractC0191h4 = (AbstractC0191h) BinderC0630b.m1559w0(interfaceC0629aM1558v3);
                if (cls.isInstance(abstractC0191h4) && interfaceC0193j != null) {
                    interfaceC0193j.mo689i((AbstractC0191h) cls.cast(abstractC0191h4));
                }
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC0629a interfaceC0629aM1558v4 = BinderC0630b.m1558v0(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                AbstractC1339v.m3420b(parcel);
                AbstractC0191h abstractC0191h5 = (AbstractC0191h) BinderC0630b.m1559w0(interfaceC0629aM1558v4);
                if (cls.isInstance(abstractC0191h5) && interfaceC0193j != null) {
                    interfaceC0193j.mo687g((AbstractC0191h) cls.cast(abstractC0191h5), i5);
                }
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC0629a interfaceC0629aM1558v5 = BinderC0630b.m1558v0(parcel.readStrongBinder());
                String string2 = parcel.readString();
                AbstractC1339v.m3420b(parcel);
                AbstractC0191h abstractC0191h6 = (AbstractC0191h) BinderC0630b.m1559w0(interfaceC0629aM1558v5);
                if (cls.isInstance(abstractC0191h6) && interfaceC0193j != null) {
                    interfaceC0193j.mo684d((AbstractC0191h) cls.cast(abstractC0191h6), string2);
                }
                parcel2.writeNoException();
                return true;
            case 8:
                InterfaceC0629a interfaceC0629aM1558v6 = BinderC0630b.m1558v0(parcel.readStrongBinder());
                int i6 = AbstractC1339v.f5981a;
                boolean z3 = parcel.readInt() != 0;
                AbstractC1339v.m3420b(parcel);
                AbstractC0191h abstractC0191h7 = (AbstractC0191h) BinderC0630b.m1559w0(interfaceC0629aM1558v6);
                if (cls.isInstance(abstractC0191h7) && interfaceC0193j != null) {
                    interfaceC0193j.mo686f((AbstractC0191h) cls.cast(abstractC0191h7), z3);
                }
                parcel2.writeNoException();
                return true;
            case 9:
                InterfaceC0629a interfaceC0629aM1558v7 = BinderC0630b.m1558v0(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                AbstractC1339v.m3420b(parcel);
                AbstractC0191h abstractC0191h8 = (AbstractC0191h) BinderC0630b.m1559w0(interfaceC0629aM1558v7);
                if (cls.isInstance(abstractC0191h8) && interfaceC0193j != null) {
                    interfaceC0193j.mo683c((AbstractC0191h) cls.cast(abstractC0191h8), i7);
                }
                parcel2.writeNoException();
                return true;
            case 10:
                InterfaceC0629a interfaceC0629aM1558v8 = BinderC0630b.m1558v0(parcel.readStrongBinder());
                int i8 = parcel.readInt();
                AbstractC1339v.m3420b(parcel);
                AbstractC0191h abstractC0191h9 = (AbstractC0191h) BinderC0630b.m1559w0(interfaceC0629aM1558v8);
                if (cls.isInstance(abstractC0191h9) && interfaceC0193j != null) {
                    interfaceC0193j.mo681a((AbstractC0191h) cls.cast(abstractC0191h9), i8);
                }
                parcel2.writeNoException();
                return true;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            default:
                return false;
        }
    }
}
