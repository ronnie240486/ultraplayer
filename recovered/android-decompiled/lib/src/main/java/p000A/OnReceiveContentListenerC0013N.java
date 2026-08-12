package p000A;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;
import p014F.C0170s;

/* JADX INFO: renamed from: A.N */
/* JADX INFO: loaded from: classes.dex */
public final class OnReceiveContentListenerC0013N implements OnReceiveContentListener {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0060t f9a;

    public OnReceiveContentListenerC0013N(InterfaceC0060t interfaceC0060t) {
        this.f9a = interfaceC0060t;
    }

    @Override // android.view.OnReceiveContentListener
    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0039h c0039h = new C0039h(new C0031d(contentInfo));
        C0039h c0039hM646a = ((C0170s) this.f9a).m646a(view, c0039h);
        if (c0039hM646a == null) {
            return null;
        }
        if (c0039hM646a == c0039h) {
            return contentInfo;
        }
        ContentInfo contentInfoMo158f = c0039hM646a.f52a.mo158f();
        Objects.requireNonNull(contentInfoMo158f);
        return AbstractC0029c.m137m(contentInfoMo158f);
    }
}
