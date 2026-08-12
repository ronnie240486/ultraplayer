package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p032L.AbstractC0337a;
import p035M.AbstractC0363d;
import p035M.C0360a;
import p035M.C0362c;
import p045P0.AbstractC0462h;
import p091e.AbstractActivityC1479j;

/* JADX INFO: renamed from: androidx.fragment.app.r */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C0967r implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: g */
    public final AbstractC0937C f4257g;

    public LayoutInflaterFactory2C0967r(AbstractC0937C abstractC0937C) {
        this.f4257g = abstractC0937C;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C0943I c0943iM2462f;
        boolean zEquals = C0966q.class.getName().equals(str);
        AbstractC0937C abstractC0937C = this.f4257g;
        if (zEquals) {
            return new C0966q(context, attributeSet, abstractC0937C);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0337a.f1071a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = AbstractComponentCallbacksC0963n.class.isAssignableFrom(C0972w.m2546b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0963n abstractComponentCallbacksC0963nM2482z = resourceId != -1 ? abstractC0937C.m2482z(resourceId) : null;
                    if (abstractComponentCallbacksC0963nM2482z == null && string != null) {
                        abstractComponentCallbacksC0963nM2482z = abstractC0937C.m2435A(string);
                    }
                    if (abstractComponentCallbacksC0963nM2482z == null && id != -1) {
                        abstractComponentCallbacksC0963nM2482z = abstractC0937C.m2482z(id);
                    }
                    if (abstractComponentCallbacksC0963nM2482z == null) {
                        C0972w c0972wM2437C = abstractC0937C.m2437C();
                        context.getClassLoader();
                        abstractComponentCallbacksC0963nM2482z = c0972wM2437C.m2548a(attributeValue);
                        abstractComponentCallbacksC0963nM2482z.f4238s = true;
                        abstractComponentCallbacksC0963nM2482z.f4205B = resourceId != 0 ? resourceId : id;
                        abstractComponentCallbacksC0963nM2482z.f4206C = id;
                        abstractComponentCallbacksC0963nM2482z.f4207D = string;
                        abstractComponentCallbacksC0963nM2482z.f4239t = true;
                        abstractComponentCallbacksC0963nM2482z.f4243x = abstractC0937C;
                        C0965p c0965p = abstractC0937C.f4083t;
                        abstractComponentCallbacksC0963nM2482z.f4244y = c0965p;
                        AbstractActivityC1479j abstractActivityC1479j = c0965p.f4249v;
                        abstractComponentCallbacksC0963nM2482z.f4212I = true;
                        if ((c0965p != null ? c0965p.f4248u : null) != null) {
                            abstractComponentCallbacksC0963nM2482z.f4212I = true;
                        }
                        c0943iM2462f = abstractC0937C.m2456a(abstractComponentCallbacksC0963nM2482z);
                        if (AbstractC0937C.m2430F(2)) {
                            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0963nM2482z + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (abstractComponentCallbacksC0963nM2482z.f4239t) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        abstractComponentCallbacksC0963nM2482z.f4239t = true;
                        abstractComponentCallbacksC0963nM2482z.f4243x = abstractC0937C;
                        C0965p c0965p2 = abstractC0937C.f4083t;
                        abstractComponentCallbacksC0963nM2482z.f4244y = c0965p2;
                        AbstractActivityC1479j abstractActivityC1479j2 = c0965p2.f4249v;
                        abstractComponentCallbacksC0963nM2482z.f4212I = true;
                        if ((c0965p2 != null ? c0965p2.f4248u : null) != null) {
                            abstractComponentCallbacksC0963nM2482z.f4212I = true;
                        }
                        c0943iM2462f = abstractC0937C.m2462f(abstractComponentCallbacksC0963nM2482z);
                        if (AbstractC0937C.m2430F(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC0963nM2482z + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C0362c c0362c = AbstractC0363d.f1161a;
                    AbstractC0363d.m1002b(new C0360a(abstractComponentCallbacksC0963nM2482z, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC0963nM2482z + " to container " + viewGroup));
                    AbstractC0363d.m1001a(abstractComponentCallbacksC0963nM2482z).getClass();
                    abstractComponentCallbacksC0963nM2482z.f4213J = viewGroup;
                    c0943iM2462f.m2496j();
                    c0943iM2462f.m2495i();
                    throw new IllegalStateException(AbstractC0462h.m1166f("Fragment ", attributeValue, " did not create a view."));
                }
            }
        }
        return null;
    }
}
