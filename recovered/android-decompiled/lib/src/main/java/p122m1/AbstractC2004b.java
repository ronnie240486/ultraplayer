package p122m1;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p124n.C2018e;

/* JADX INFO: renamed from: m1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2004b {

    /* JADX INFO: renamed from: a */
    public final C2018e f8742a;

    /* JADX INFO: renamed from: b */
    public final C2018e f8743b;

    /* JADX INFO: renamed from: c */
    public final C2018e f8744c;

    public AbstractC2004b(C2018e c2018e, C2018e c2018e2, C2018e c2018e3) {
        this.f8742a = c2018e;
        this.f8743b = c2018e2;
        this.f8744c = c2018e3;
    }

    /* JADX INFO: renamed from: a */
    public abstract C2005c mo4553a();

    /* JADX INFO: renamed from: b */
    public final Class m4554b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C2018e c2018e = this.f8744c;
        Class cls2 = (Class) c2018e.getOrDefault(name, null);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c2018e.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: c */
    public final Method m4555c(String str) throws NoSuchMethodException {
        C2018e c2018e = this.f8742a;
        Method method = (Method) c2018e.getOrDefault(str, null);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC2004b.class.getClassLoader()).getDeclaredMethod("read", AbstractC2004b.class);
        c2018e.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final Method m4556d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        C2018e c2018e = this.f8743b;
        Method method = (Method) c2018e.getOrDefault(name, null);
        if (method != null) {
            return method;
        }
        Class clsM4554b = m4554b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM4554b.getDeclaredMethod("write", cls, AbstractC2004b.class);
        c2018e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public abstract boolean mo4557e(int i3);

    /* JADX INFO: renamed from: f */
    public final int m4558f(int i3, int i4) {
        return !mo4557e(i4) ? i3 : ((C2005c) this).f8746e.readInt();
    }

    /* JADX INFO: renamed from: g */
    public final Parcelable m4559g(Parcelable parcelable, int i3) {
        if (!mo4557e(i3)) {
            return parcelable;
        }
        return ((C2005c) this).f8746e.readParcelable(C2005c.class.getClassLoader());
    }

    /* JADX INFO: renamed from: h */
    public final InterfaceC2006d m4560h() {
        String string = ((C2005c) this).f8746e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (InterfaceC2006d) m4555c(string).invoke(null, mo4553a());
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
        } catch (NoSuchMethodException e5) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
        } catch (InvocationTargetException e6) {
            if (e6.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e6.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo4561i(int i3);

    /* JADX INFO: renamed from: j */
    public final void m4562j(int i3, int i4) {
        mo4561i(i4);
        ((C2005c) this).f8746e.writeInt(i3);
    }

    /* JADX INFO: renamed from: k */
    public final void m4563k(Parcelable parcelable, int i3) {
        mo4561i(i3);
        ((C2005c) this).f8746e.writeParcelable(parcelable, 0);
    }

    /* JADX INFO: renamed from: l */
    public final void m4564l(InterfaceC2006d interfaceC2006d) {
        if (interfaceC2006d == null) {
            ((C2005c) this).f8746e.writeString(null);
            return;
        }
        try {
            ((C2005c) this).f8746e.writeString(m4554b(interfaceC2006d.getClass()).getName());
            C2005c c2005cMo4553a = mo4553a();
            try {
                m4556d(interfaceC2006d.getClass()).invoke(null, interfaceC2006d, c2005cMo4553a);
                int i3 = c2005cMo4553a.f8750i;
                if (i3 >= 0) {
                    int i4 = c2005cMo4553a.f8745d.get(i3);
                    Parcel parcel = c2005cMo4553a.f8746e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i4);
                    parcel.writeInt(iDataPosition - i4);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e3);
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
            } catch (NoSuchMethodException e5) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e5);
            } catch (InvocationTargetException e6) {
                if (!(e6.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e6);
                }
                throw ((RuntimeException) e6.getCause());
            }
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException(interfaceC2006d.getClass().getSimpleName().concat(" does not have a Parcelizer"), e7);
        }
    }
}
