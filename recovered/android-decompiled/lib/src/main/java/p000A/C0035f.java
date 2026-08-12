package p000A;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: renamed from: A.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0035f implements InterfaceC0033e, InterfaceC0037g {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f45g = 0;

    /* JADX INFO: renamed from: h */
    public ClipData f46h;

    /* JADX INFO: renamed from: i */
    public int f47i;

    /* JADX INFO: renamed from: j */
    public int f48j;

    /* JADX INFO: renamed from: k */
    public Uri f49k;

    /* JADX INFO: renamed from: l */
    public Bundle f50l;

    public /* synthetic */ C0035f() {
    }

    @Override // p000A.InterfaceC0037g
    /* JADX INFO: renamed from: a */
    public int mo153a() {
        return this.f48j;
    }

    @Override // p000A.InterfaceC0037g
    /* JADX INFO: renamed from: c */
    public ClipData mo155c() {
        return this.f46h;
    }

    @Override // p000A.InterfaceC0033e
    /* JADX INFO: renamed from: e */
    public C0039h mo157e() {
        return new C0039h(new C0035f(this));
    }

    @Override // p000A.InterfaceC0037g
    /* JADX INFO: renamed from: f */
    public ContentInfo mo158f() {
        return null;
    }

    @Override // p000A.InterfaceC0033e
    /* JADX INFO: renamed from: h */
    public void mo160h(Bundle bundle) {
        this.f50l = bundle;
    }

    @Override // p000A.InterfaceC0033e
    /* JADX INFO: renamed from: i */
    public void mo161i(Uri uri) {
        this.f49k = uri;
    }

    @Override // p000A.InterfaceC0037g
    /* JADX INFO: renamed from: j */
    public int mo162j() {
        return this.f47i;
    }

    @Override // p000A.InterfaceC0033e
    /* JADX INFO: renamed from: o */
    public void mo167o(int i3) {
        this.f48j = i3;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f45g) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f46h.getDescription());
                sb.append(", source=");
                int i3 = this.f47i;
                if (i3 == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i3 == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i3 == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i3 == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i3 != 4) {
                    strValueOf = i3 != 5 ? String.valueOf(i3) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i4 = this.f48j;
                sb.append((i4 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i4));
                Uri uri = this.f49k;
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                sb.append(this.f50l != null ? ", hasExtras" : "");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0035f(C0035f c0035f) {
        ClipData clipData = c0035f.f46h;
        clipData.getClass();
        this.f46h = clipData;
        int i3 = c0035f.f47i;
        if (i3 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i3 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f47i = i3;
        int i4 = c0035f.f48j;
        if ((i4 & 1) == i4) {
            this.f48j = i4;
            this.f49k = c0035f.f49k;
            this.f50l = c0035f.f50l;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i4) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
