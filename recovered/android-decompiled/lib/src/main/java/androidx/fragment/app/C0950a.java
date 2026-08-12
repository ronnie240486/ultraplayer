package androidx.fragment.app;

import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p035M.AbstractC0363d;

/* JADX INFO: renamed from: androidx.fragment.app.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0950a implements InterfaceC0935A {

    /* JADX INFO: renamed from: a */
    public final ArrayList f4134a;

    /* JADX INFO: renamed from: b */
    public int f4135b;

    /* JADX INFO: renamed from: c */
    public int f4136c;

    /* JADX INFO: renamed from: d */
    public int f4137d;

    /* JADX INFO: renamed from: e */
    public int f4138e;

    /* JADX INFO: renamed from: f */
    public int f4139f;

    /* JADX INFO: renamed from: g */
    public boolean f4140g;

    /* JADX INFO: renamed from: h */
    public String f4141h;

    /* JADX INFO: renamed from: i */
    public int f4142i;

    /* JADX INFO: renamed from: j */
    public CharSequence f4143j;

    /* JADX INFO: renamed from: k */
    public int f4144k;

    /* JADX INFO: renamed from: l */
    public CharSequence f4145l;

    /* JADX INFO: renamed from: m */
    public ArrayList f4146m;

    /* JADX INFO: renamed from: n */
    public ArrayList f4147n;

    /* JADX INFO: renamed from: o */
    public boolean f4148o;

    /* JADX INFO: renamed from: p */
    public final AbstractC0937C f4149p;

    /* JADX INFO: renamed from: q */
    public boolean f4150q;

    /* JADX INFO: renamed from: r */
    public int f4151r;

    public C0950a(AbstractC0937C abstractC0937C) {
        abstractC0937C.m2437C();
        C0965p c0965p = abstractC0937C.f4083t;
        if (c0965p != null) {
            c0965p.f4249v.getClassLoader();
        }
        this.f4134a = new ArrayList();
        this.f4148o = false;
        this.f4151r = -1;
        this.f4149p = abstractC0937C;
    }

    @Override // androidx.fragment.app.InterfaceC0935A
    /* JADX INFO: renamed from: a */
    public final boolean mo2429a(ArrayList arrayList, ArrayList arrayList2) {
        if (AbstractC0937C.m2430F(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f4140g) {
            return true;
        }
        AbstractC0937C abstractC0937C = this.f4149p;
        if (abstractC0937C.f4067d == null) {
            abstractC0937C.f4067d = new ArrayList();
        }
        abstractC0937C.f4067d.add(this);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m2508b(C0944J c0944j) {
        this.f4134a.add(c0944j);
        c0944j.f4126d = this.f4135b;
        c0944j.f4127e = this.f4136c;
        c0944j.f4128f = this.f4137d;
        c0944j.f4129g = this.f4138e;
    }

    /* JADX INFO: renamed from: c */
    public final void m2509c(int i3) {
        if (this.f4140g) {
            if (AbstractC0937C.m2430F(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i3);
            }
            ArrayList arrayList = this.f4134a;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0944J c0944j = (C0944J) arrayList.get(i4);
                AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n = c0944j.f4124b;
                if (abstractComponentCallbacksC0963n != null) {
                    abstractComponentCallbacksC0963n.f4242w += i3;
                    if (AbstractC0937C.m2430F(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c0944j.f4124b + " to " + c0944j.f4124b.f4242w);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m2510d(boolean z3) {
        if (this.f4150q) {
            throw new IllegalStateException("commit already called");
        }
        if (AbstractC0937C.m2430F(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C0946L());
            m2512f("  ", printWriter, true);
            printWriter.close();
        }
        this.f4150q = true;
        boolean z4 = this.f4140g;
        AbstractC0937C abstractC0937C = this.f4149p;
        if (z4) {
            this.f4151r = abstractC0937C.f4072i.getAndIncrement();
        } else {
            this.f4151r = -1;
        }
        abstractC0937C.m2478v(this, z3);
        return this.f4151r;
    }

    /* JADX INFO: renamed from: e */
    public final void m2511e(int i3, AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963n, String str) {
        String str2 = abstractComponentCallbacksC0963n.f4219P;
        if (str2 != null) {
            AbstractC0363d.m1003c(abstractComponentCallbacksC0963n, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0963n.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0963n.f4207D;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0963n + ": was " + abstractComponentCallbacksC0963n.f4207D + " now " + str);
            }
            abstractComponentCallbacksC0963n.f4207D = str;
        }
        if (i3 != 0) {
            if (i3 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0963n + " with tag " + str + " to container view with no id");
            }
            int i4 = abstractComponentCallbacksC0963n.f4205B;
            if (i4 != 0 && i4 != i3) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0963n + ": was " + abstractComponentCallbacksC0963n.f4205B + " now " + i3);
            }
            abstractComponentCallbacksC0963n.f4205B = i3;
            abstractComponentCallbacksC0963n.f4206C = i3;
        }
        m2508b(new C0944J(1, abstractComponentCallbacksC0963n));
        abstractComponentCallbacksC0963n.f4243x = this.f4149p;
    }

    /* JADX INFO: renamed from: f */
    public final void m2512f(String str, PrintWriter printWriter, boolean z3) {
        String str2;
        if (z3) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f4141h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f4151r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f4150q);
            if (this.f4139f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f4139f));
            }
            if (this.f4135b != 0 || this.f4136c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4135b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4136c));
            }
            if (this.f4137d != 0 || this.f4138e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f4137d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f4138e));
            }
            if (this.f4142i != 0 || this.f4143j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4142i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f4143j);
            }
            if (this.f4144k != 0 || this.f4145l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f4144k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f4145l);
            }
        }
        ArrayList arrayList = this.f4134a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0944J c0944j = (C0944J) arrayList.get(i3);
            switch (c0944j.f4123a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c0944j.f4123a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i3);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0944j.f4124b);
            if (z3) {
                if (c0944j.f4126d != 0 || c0944j.f4127e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0944j.f4126d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0944j.f4127e));
                }
                if (c0944j.f4128f != 0 || c0944j.f4129g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0944j.f4128f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0944j.f4129g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f4151r >= 0) {
            sb.append(" #");
            sb.append(this.f4151r);
        }
        if (this.f4141h != null) {
            sb.append(" ");
            sb.append(this.f4141h);
        }
        sb.append("}");
        return sb.toString();
    }
}
