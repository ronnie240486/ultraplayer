package p000A;

import android.view.View;
import android.view.ViewGroup;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p138q1.C2173i;
import p143r2.C2204b;
import p143r2.C2206d;
import p151t2.EnumC2278a;
import p155u2.AbstractC2305b;
import p155u2.InterfaceC2304a;
import p163x2.AbstractC2364c;
import p163x2.AbstractC2365d;
import p170z2.C2392a;

/* JADX INFO: renamed from: A.X */
/* JADX INFO: loaded from: classes.dex */
public final class C0022X implements Serializable {

    /* JADX INFO: renamed from: g */
    public final C2392a f22g;

    /* JADX INFO: renamed from: h */
    public int f23h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ C2392a f24i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ View f25j;

    public C0022X(View view, C2392a c2392a) {
        this.f25j = view;
        this.f22g = c2392a;
    }

    /* JADX INFO: renamed from: a */
    public final Object m95a(Object obj) throws Throwable {
        Object obj2;
        EnumC2278a enumC2278a = EnumC2278a.f9747g;
        int i3 = this.f23h;
        View view = this.f25j;
        if (i3 == 0) {
            if (obj instanceof C2204b) {
                throw ((C2204b) obj).f9493g;
            }
            C2392a c2392a = this.f24i;
            this.f24i = c2392a;
            this.f23h = 1;
            c2392a.f9984h = view;
            c2392a.f9983g = 3;
            c2392a.f9986j = this;
            return enumC2278a;
        }
        C2206d c2206d = C2206d.f9498c;
        if (i3 == 1) {
            C2392a c2392a2 = this.f24i;
            if (obj instanceof C2204b) {
                throw ((C2204b) obj).f9493g;
            }
            if (view instanceof ViewGroup) {
                this.f24i = null;
                this.f23h = 2;
                c2392a2.getClass();
                C0062v c0062v = new C0062v(new C0021W((ViewGroup) view));
                if (c0062v.f85h.hasNext()) {
                    c2392a2.f9985i = c0062v;
                    c2392a2.f9983g = 2;
                    c2392a2.f9986j = this;
                    obj2 = enumC2278a;
                } else {
                    obj2 = c2206d;
                }
                if (obj2 != enumC2278a) {
                    obj2 = c2206d;
                }
                if (obj2 == enumC2278a) {
                    return enumC2278a;
                }
            }
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (obj instanceof C2204b) {
                throw ((C2204b) obj).f9493g;
            }
        }
        return c2206d;
    }

    /* JADX INFO: renamed from: b */
    public final String m96b() {
        int iIntValue;
        String strM4920c;
        StringBuilder sb = new StringBuilder("Continuation at ");
        InterfaceC2304a interfaceC2304a = (InterfaceC2304a) getClass().getAnnotation(InterfaceC2304a.class);
        Object name = null;
        str = null;
        str = null;
        str = null;
        String str = null;
        if (interfaceC2304a != null) {
            int iM4924v = interfaceC2304a.m4924v();
            if (iM4924v > 1) {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iM4924v + ". Please update the Kotlin standard library.").toString());
            }
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                iIntValue = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                iIntValue = -1;
            }
            int i3 = iIntValue >= 0 ? interfaceC2304a.m4922l()[iIntValue] : -1;
            C2173i c2173i = AbstractC2305b.f9827b;
            C2173i c2173i2 = AbstractC2305b.f9826a;
            if (c2173i == null) {
                try {
                    C2173i c2173i3 = new C2173i(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 3);
                    AbstractC2305b.f9827b = c2173i3;
                    c2173i = c2173i3;
                } catch (Exception unused2) {
                    AbstractC2305b.f9827b = c2173i2;
                    c2173i = c2173i2;
                }
            }
            if (c2173i != c2173i2) {
                Method method = (Method) c2173i.f9388h;
                Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
                if (objInvoke != null) {
                    Method method2 = (Method) c2173i.f9389i;
                    Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                    if (objInvoke2 != null) {
                        Method method3 = (Method) c2173i.f9390j;
                        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                        if (objInvoke3 instanceof String) {
                            str = (String) objInvoke3;
                        }
                    }
                }
            }
            if (str == null) {
                strM4920c = interfaceC2304a.m4920c();
            } else {
                strM4920c = str + '/' + interfaceC2304a.m4920c();
            }
            name = new StackTraceElement(strM4920c, interfaceC2304a.m4923m(), interfaceC2304a.m4921f(), i3);
        }
        if (name == null) {
            name = getClass().getName();
        }
        sb.append(name);
        return sb.toString();
    }

    public final String toString() {
        if (this.f22g != null) {
            return m96b();
        }
        AbstractC2365d.f9921a.getClass();
        String string = C0022X.class.getGenericInterfaces()[0].toString();
        if (string.startsWith("kotlin.jvm.functions.")) {
            string = string.substring(21);
        }
        AbstractC2364c.m4953d(string, "renderLambdaToString(this)");
        return string;
    }
}
