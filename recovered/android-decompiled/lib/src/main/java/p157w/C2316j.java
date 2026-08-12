package p157w;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: renamed from: w.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2316j implements InterfaceC2314h {

    /* JADX INFO: renamed from: a */
    public final LocaleList f9836a;

    public C2316j(Object obj) {
        this.f9836a = AbstractC2315i.m4939c(obj);
    }

    @Override // p157w.InterfaceC2314h
    /* JADX INFO: renamed from: a */
    public final Object mo4935a() {
        return this.f9836a;
    }

    @Override // p157w.InterfaceC2314h
    /* JADX INFO: renamed from: b */
    public final String mo4936b() {
        return this.f9836a.toLanguageTags();
    }

    public final boolean equals(Object obj) {
        return this.f9836a.equals(((InterfaceC2314h) obj).mo4935a());
    }

    @Override // p157w.InterfaceC2314h
    public final Locale get(int i3) {
        return this.f9836a.get(i3);
    }

    public final int hashCode() {
        return this.f9836a.hashCode();
    }

    @Override // p157w.InterfaceC2314h
    public final boolean isEmpty() {
        return this.f9836a.isEmpty();
    }

    @Override // p157w.InterfaceC2314h
    public final int size() {
        return this.f9836a.size();
    }

    public final String toString() {
        return this.f9836a.toString();
    }
}
