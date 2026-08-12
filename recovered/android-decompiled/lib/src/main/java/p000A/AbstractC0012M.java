package p000A;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* JADX INFO: renamed from: A.M */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0012M {
    /* JADX INFO: renamed from: a */
    public static String[] m75a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: b */
    public static C0039h m76b(View view, C0039h c0039h) {
        ContentInfo contentInfoMo158f = c0039h.f52a.mo158f();
        Objects.requireNonNull(contentInfoMo158f);
        ContentInfo contentInfoM137m = AbstractC0029c.m137m(contentInfoMo158f);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM137m);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoM137m ? c0039h : new C0039h(new C0031d(contentInfoPerformReceiveContent));
    }

    /* JADX INFO: renamed from: c */
    public static void m77c(View view, String[] strArr, InterfaceC0060t interfaceC0060t) {
        if (interfaceC0060t == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC0013N(interfaceC0060t));
        }
    }
}
