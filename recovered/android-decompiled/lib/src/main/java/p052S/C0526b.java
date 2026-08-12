package p052S;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import p055T.C0550M;
import p055T.C0581m;
import p055T.InterfaceC0551N;
import p064W.InterfaceC0642j;
import p064W.InterfaceC0643k;

/* JADX INFO: renamed from: S.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0526b implements InterfaceC0642j, InterfaceC0643k {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1805g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0532h f1806h;

    public /* synthetic */ C0526b(C0532h c0532h, int i3) {
        this.f1805g = i3;
        this.f1806h = c0532h;
    }

    @Override // p064W.InterfaceC0643k
    /* JADX INFO: renamed from: a */
    public void mo1279a(Object obj, C0581m c0581m) {
        this.f1806h.getClass();
        ((InterfaceC0551N) obj).mo1386j(new C0550M(c0581m));
    }

    @Override // p064W.InterfaceC0642j
    /* JADX INFO: renamed from: g */
    public void mo214g(Object obj) {
        InterfaceC0551N interfaceC0551N = (InterfaceC0551N) obj;
        switch (this.f1805g) {
            case 0:
                interfaceC0551N.mo1393u(this.f1806h.m1087S(), 3);
                break;
            case 1:
                interfaceC0551N.mo1377J(this.f1806h.f1837s);
                break;
            case 2:
                interfaceC0551N.mo1393u(this.f1806h.m1087S(), 1);
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                interfaceC0551N.mo1389o(this.f1806h.f1836r);
                break;
            case 4:
                interfaceC0551N.mo1383f(this.f1806h.f1819A);
                break;
            default:
                interfaceC0551N.mo1383f(this.f1806h.f1819A);
                break;
        }
    }
}
