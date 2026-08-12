package p000A;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: renamed from: A.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0053o {

    /* JADX INFO: renamed from: a */
    public ViewParent f73a;

    /* JADX INFO: renamed from: b */
    public ViewParent f74b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f75c;

    /* JADX INFO: renamed from: d */
    public boolean f76d;

    /* JADX INFO: renamed from: e */
    public int[] f77e;

    public C0053o(ViewGroup viewGroup) {
        this.f75c = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m302a(float f, float f3, boolean z3) {
        ViewParent viewParentM306e;
        if (this.f76d && (viewParentM306e = m306e(0)) != null) {
            try {
                return AbstractC0023Y.m97a(viewParentM306e, this.f75c, f, f3, z3);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM306e + " does not implement interface method onNestedFling", e3);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m303b(float f, float f3) {
        ViewParent viewParentM306e;
        if (this.f76d && (viewParentM306e = m306e(0)) != null) {
            try {
                return AbstractC0023Y.m98b(viewParentM306e, this.f75c, f, f3);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM306e + " does not implement interface method onNestedPreFling", e3);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m304c(int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        ViewParent viewParentM306e;
        int i6;
        int i7;
        if (!this.f76d || (viewParentM306e = m306e(i5)) == null) {
            return false;
        }
        if (i3 == 0 && i4 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f75c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i6 = iArr2[0];
            i7 = iArr2[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr == null) {
            if (this.f77e == null) {
                this.f77e = new int[2];
            }
            iArr = this.f77e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (viewParentM306e instanceof InterfaceC0055p) {
            ((InterfaceC0055p) viewParentM306e).mo313e(i3, i4, i5, iArr);
        } else if (i5 == 0) {
            try {
                AbstractC0023Y.m99c(viewParentM306e, viewGroup, i3, i4, iArr);
            } catch (AbstractMethodError e3) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM306e + " does not implement interface method onNestedPreScroll", e3);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i6;
            iArr2[1] = iArr2[1] - i7;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m305d(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        ViewParent viewParentM306e;
        int i8;
        int i9;
        int[] iArr3;
        if (this.f76d && (viewParentM306e = m306e(i7)) != null) {
            if (i3 != 0 || i4 != 0 || i5 != 0 || i6 != 0) {
                ViewGroup viewGroup = this.f75c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i8 = iArr[0];
                    i9 = iArr[1];
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                if (iArr2 == null) {
                    if (this.f77e == null) {
                        this.f77e = new int[2];
                    }
                    int[] iArr4 = this.f77e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM306e instanceof InterfaceC0057q) {
                    ((InterfaceC0057q) viewParentM306e).mo318d(viewGroup, i3, i4, i5, i6, i7, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i5;
                    iArr3[1] = iArr3[1] + i6;
                    if (viewParentM306e instanceof InterfaceC0055p) {
                        ((InterfaceC0055p) viewParentM306e).mo311b(viewGroup, i3, i4, i5, i6, i7);
                    } else if (i7 == 0) {
                        try {
                            AbstractC0023Y.m100d(viewParentM306e, viewGroup, i3, i4, i5, i6);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentM306e + " does not implement interface method onNestedScroll", e3);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i8;
                    iArr[1] = iArr[1] - i9;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final ViewParent m306e(int i3) {
        if (i3 == 0) {
            return this.f73a;
        }
        if (i3 != 1) {
            return null;
        }
        return this.f74b;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m307f(int i3) {
        return m306e(i3) != null;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m308g(int i3, int i4) {
        boolean zM102f;
        if (!m307f(i4)) {
            if (this.f76d) {
                ViewGroup viewGroup = this.f75c;
                View view = viewGroup;
                for (ViewParent parent = viewGroup.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z3 = parent instanceof InterfaceC0055p;
                    if (z3) {
                        zM102f = ((InterfaceC0055p) parent).mo314f(view, viewGroup, i3, i4);
                    } else if (i4 == 0) {
                        try {
                            zM102f = AbstractC0023Y.m102f(parent, view, viewGroup, i3);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e3);
                            zM102f = false;
                        }
                    } else {
                        zM102f = false;
                    }
                    if (zM102f) {
                        if (i4 == 0) {
                            this.f73a = parent;
                        } else if (i4 == 1) {
                            this.f74b = parent;
                        }
                        if (z3) {
                            ((InterfaceC0055p) parent).mo310a(view, viewGroup, i3, i4);
                        } else if (i4 == 0) {
                            try {
                                AbstractC0023Y.m101e(parent, view, viewGroup, i3);
                            } catch (AbstractMethodError e4) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e4);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m309h(int i3) {
        ViewParent viewParentM306e = m306e(i3);
        if (viewParentM306e != null) {
            boolean z3 = viewParentM306e instanceof InterfaceC0055p;
            ViewGroup viewGroup = this.f75c;
            if (z3) {
                ((InterfaceC0055p) viewParentM306e).mo312c(viewGroup, i3);
            } else if (i3 == 0) {
                try {
                    AbstractC0023Y.m103g(viewParentM306e, viewGroup);
                } catch (AbstractMethodError e3) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM306e + " does not implement interface method onStopNestedScroll", e3);
                }
            }
            if (i3 == 0) {
                this.f73a = null;
            } else {
                if (i3 != 1) {
                    return;
                }
                this.f74b = null;
            }
        }
    }
}
