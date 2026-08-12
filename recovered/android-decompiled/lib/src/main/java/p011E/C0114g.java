package p011E;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: E.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0114g implements InterfaceC0115h {

    /* JADX INFO: renamed from: g */
    public final InputContentInfo f151g;

    public C0114g(Object obj) {
        this.f151g = (InputContentInfo) obj;
    }

    @Override // p011E.InterfaceC0115h
    /* JADX INFO: renamed from: e */
    public final void mo552e() {
        this.f151g.requestPermission();
    }

    @Override // p011E.InterfaceC0115h
    /* JADX INFO: renamed from: f */
    public final Uri mo553f() {
        return this.f151g.getLinkUri();
    }

    @Override // p011E.InterfaceC0115h
    /* JADX INFO: renamed from: h */
    public final ClipDescription mo554h() {
        return this.f151g.getDescription();
    }

    @Override // p011E.InterfaceC0115h
    /* JADX INFO: renamed from: i */
    public final Object mo555i() {
        return this.f151g;
    }

    @Override // p011E.InterfaceC0115h
    /* JADX INFO: renamed from: j */
    public final Uri mo556j() {
        return this.f151g.getContentUri();
    }

    public C0114g(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f151g = new InputContentInfo(uri, clipDescription, uri2);
    }
}
