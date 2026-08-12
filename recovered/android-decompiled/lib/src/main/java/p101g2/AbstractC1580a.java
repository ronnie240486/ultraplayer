package p101g2;

/* JADX INFO: renamed from: g2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1580a implements InterfaceC1584e {
    /* JADX INFO: renamed from: a */
    public abstract boolean mo3915a(char c);

    @Override // p101g2.InterfaceC1584e
    public final boolean apply(Object obj) {
        return mo3915a(((Character) obj).charValue());
    }
}
