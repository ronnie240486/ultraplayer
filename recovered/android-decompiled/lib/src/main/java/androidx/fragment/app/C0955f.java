package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import com.zuxoplayer.app.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000A.AbstractC0016Q;
import p034L1.C0352g;

/* JADX INFO: renamed from: androidx.fragment.app.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0955f {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f4168a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f4169b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f4170c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public boolean f4171d = false;

    /* JADX INFO: renamed from: e */
    public boolean f4172e = false;

    public C0955f(ViewGroup viewGroup) {
        this.f4168a = viewGroup;
    }

    /* JADX INFO: renamed from: d */
    public static C0955f m2513d(ViewGroup viewGroup, C0352g c0352g) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0955f) {
            return (C0955f) tag;
        }
        c0352g.getClass();
        C0955f c0955f = new C0955f(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0955f);
        return c0955f;
    }

    /* JADX INFO: renamed from: a */
    public final void m2514a(ArrayList arrayList, boolean z3) {
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            ((AbstractC0947M) it.next()).getClass();
            throw null;
        }
        if (AbstractC0937C.m2430F(2)) {
            Log.v("FragmentManager", "Executing operations from null to null");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(arrayList);
        ((AbstractC0947M) arrayList.get(arrayList.size() - 1)).getClass();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            ((AbstractC0947M) it2.next()).getClass();
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            ((AbstractC0947M) it3.next()).m2505b();
            throw null;
        }
        HashMap map = new HashMap();
        if (arrayList3.size() > 0) {
            ((AbstractC0954e) arrayList3.get(0)).getClass();
            throw null;
        }
        if (arrayList3.size() > 0) {
            ((AbstractC0954e) arrayList3.get(0)).getClass();
            map.put(null, Boolean.FALSE);
            throw null;
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        this.f4168a.getContext();
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        if (it4.hasNext()) {
            ((AbstractC0953d) it4.next()).getClass();
            throw null;
        }
        if (arrayList5.size() > 0) {
            ((AbstractC0953d) arrayList5.get(0)).getClass();
            if (!zContainsValue || !AbstractC0937C.m2430F(2)) {
                throw null;
            }
            Log.v("FragmentManager", "Ignoring Animation set on null as Animations cannot run alongside Transitions.");
            throw null;
        }
        if (arrayList4.size() > 0) {
            ((AbstractC0947M) arrayList4.get(0)).getClass();
            throw null;
        }
        arrayList4.clear();
        if (AbstractC0937C.m2430F(2)) {
            Log.v("FragmentManager", "Completed executing operations from null to null");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2515b() {
        if (this.f4172e) {
            return;
        }
        ViewGroup viewGroup = this.f4168a;
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        if (!viewGroup.isAttachedToWindow()) {
            m2516c();
            this.f4171d = false;
            return;
        }
        synchronized (this.f4169b) {
            try {
                if (!this.f4169b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f4170c);
                    this.f4170c.clear();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        AbstractC0947M abstractC0947M = (AbstractC0947M) obj;
                        if (AbstractC0937C.m2430F(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + abstractC0947M);
                        }
                        abstractC0947M.m2504a();
                        this.f4170c.add(abstractC0947M);
                    }
                    m2517e();
                    ArrayList arrayList2 = new ArrayList(this.f4169b);
                    this.f4169b.clear();
                    this.f4170c.addAll(arrayList2);
                    if (AbstractC0937C.m2430F(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj2 = arrayList2.get(i4);
                        i4++;
                        ((AbstractC0947M) obj2).m2505b();
                    }
                    m2514a(arrayList2, this.f4171d);
                    this.f4171d = false;
                    if (AbstractC0937C.m2430F(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2516c() {
        String str;
        String str2;
        if (AbstractC0937C.m2430F(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f4168a;
        WeakHashMap weakHashMap = AbstractC0016Q.f14a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f4169b) {
            try {
                m2517e();
                ArrayList arrayList = this.f4169b;
                int size = arrayList.size();
                int i3 = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((AbstractC0947M) obj).m2505b();
                }
                ArrayList arrayList2 = new ArrayList(this.f4170c);
                int size2 = arrayList2.size();
                int i5 = 0;
                while (i5 < size2) {
                    Object obj2 = arrayList2.get(i5);
                    i5++;
                    AbstractC0947M abstractC0947M = (AbstractC0947M) obj2;
                    if (AbstractC0937C.m2430F(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f4168a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(abstractC0947M);
                        Log.v("FragmentManager", sb.toString());
                    }
                    abstractC0947M.m2504a();
                }
                ArrayList arrayList3 = new ArrayList(this.f4169b);
                int size3 = arrayList3.size();
                while (i3 < size3) {
                    Object obj3 = arrayList3.get(i3);
                    i3++;
                    AbstractC0947M abstractC0947M2 = (AbstractC0947M) obj3;
                    if (AbstractC0937C.m2430F(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f4168a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(abstractC0947M2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    abstractC0947M2.m2504a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2517e() {
        ArrayList arrayList = this.f4169b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((AbstractC0947M) obj).getClass();
        }
    }
}
