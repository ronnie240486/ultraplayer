package android.support.v4.media.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.ref.WeakReference;
import p122m1.AbstractC2003a;
import p122m1.InterfaceC2006d;

/* JADX INFO: renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
/* JADX INFO: loaded from: classes.dex */
class ResultReceiverC0864x50fd9e4a extends ResultReceiver {

    /* JADX INFO: renamed from: g */
    public WeakReference f3649g;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i3, Bundle bundle) {
        InterfaceC0868d interfaceC0868d;
        C0872h c0872h = (C0872h) this.f3649g.get();
        if (c0872h == null || bundle == null) {
            return;
        }
        synchronized (c0872h.f3687b) {
            MediaSessionCompat$Token mediaSessionCompat$Token = c0872h.f3690e;
            IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
            int i4 = BinderC0884t.f3700c;
            InterfaceC2006d interfaceC2006d = null;
            if (binder == null) {
                interfaceC0868d = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0868d)) {
                    C0867c c0867c = new C0867c();
                    c0867c.f3680b = binder;
                    interfaceC0868d = c0867c;
                } else {
                    interfaceC0868d = (InterfaceC0868d) iInterfaceQueryLocalInterface;
                }
            }
            mediaSessionCompat$Token.m2215e(interfaceC0868d);
            MediaSessionCompat$Token mediaSessionCompat$Token2 = c0872h.f3690e;
            try {
                Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                if (bundle2 != null) {
                    bundle2.setClassLoader(AbstractC2003a.class.getClassLoader());
                    Parcelable parcelable = bundle2.getParcelable("a");
                    if (!(parcelable instanceof ParcelImpl)) {
                        throw new IllegalArgumentException("Invalid parcel");
                    }
                    interfaceC2006d = ((ParcelImpl) parcelable).f4807g;
                }
            } catch (RuntimeException unused) {
            }
            mediaSessionCompat$Token2.m2216f(interfaceC2006d);
            c0872h.m2272a();
        }
    }
}
