package p000A;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: A.A */
/* JADX INFO: loaded from: classes.dex */
public final class C0000A extends AbstractC0002C {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f0e;

    public C0000A(int i3, Class cls, int i4, int i5, int i6) {
        this.f0e = i6;
        this.f2a = i3;
        this.f5d = cls;
        this.f4c = i4;
        this.f3b = i5;
    }

    @Override // p000A.AbstractC0002C
    /* JADX INFO: renamed from: b */
    public final Object mo0b(View view) {
        switch (this.f0e) {
            case 0:
                return Boolean.valueOf(AbstractC0009J.m57d(view));
            case 1:
                return AbstractC0009J.m55b(view);
            default:
                return Boolean.valueOf(AbstractC0009J.m56c(view));
        }
    }

    @Override // p000A.AbstractC0002C
    /* JADX INFO: renamed from: c */
    public final void mo1c(View view, Object obj) {
        switch (this.f0e) {
            case 0:
                AbstractC0009J.m63j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC0009J.m61h(view, (CharSequence) obj);
                break;
            default:
                AbstractC0009J.m60g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p000A.AbstractC0002C
    /* JADX INFO: renamed from: e */
    public final boolean mo2e(Object obj, Object obj2) {
        switch (this.f0e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
