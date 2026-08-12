package p113k;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: renamed from: k.d1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1854d1 implements InterfaceC1874k0 {

    /* JADX INFO: renamed from: a */
    public Toolbar f8135a;

    /* JADX INFO: renamed from: b */
    public int f8136b;

    /* JADX INFO: renamed from: c */
    public View f8137c;

    /* JADX INFO: renamed from: d */
    public Drawable f8138d;

    /* JADX INFO: renamed from: e */
    public Drawable f8139e;

    /* JADX INFO: renamed from: f */
    public Drawable f8140f;

    /* JADX INFO: renamed from: g */
    public boolean f8141g;

    /* JADX INFO: renamed from: h */
    public CharSequence f8142h;

    /* JADX INFO: renamed from: i */
    public CharSequence f8143i;

    /* JADX INFO: renamed from: j */
    public CharSequence f8144j;

    /* JADX INFO: renamed from: k */
    public Window.Callback f8145k;

    /* JADX INFO: renamed from: l */
    public boolean f8146l;

    /* JADX INFO: renamed from: m */
    public C1873k f8147m;

    /* JADX INFO: renamed from: n */
    public int f8148n;

    /* JADX INFO: renamed from: o */
    public Drawable f8149o;

    /* JADX INFO: renamed from: a */
    public final void m4372a(int i3) {
        View view;
        int i4 = this.f8136b ^ i3;
        this.f8136b = i3;
        if (i4 != 0) {
            if ((i4 & 4) != 0) {
                if ((i3 & 4) != 0) {
                    m4373b();
                }
                int i5 = this.f8136b & 4;
                Toolbar toolbar = this.f8135a;
                if (i5 != 0) {
                    Drawable drawable = this.f8140f;
                    if (drawable == null) {
                        drawable = this.f8149o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i4 & 3) != 0) {
                m4374c();
            }
            int i6 = i4 & 8;
            Toolbar toolbar2 = this.f8135a;
            if (i6 != 0) {
                if ((i3 & 8) != 0) {
                    toolbar2.setTitle(this.f8142h);
                    toolbar2.setSubtitle(this.f8143i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i4 & 16) == 0 || (view = this.f8137c) == null) {
                return;
            }
            if ((i3 & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4373b() {
        if ((this.f8136b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.f8144j);
            Toolbar toolbar = this.f8135a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.f8148n);
            } else {
                toolbar.setNavigationContentDescription(this.f8144j);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4374c() {
        Drawable drawable;
        int i3 = this.f8136b;
        if ((i3 & 2) == 0) {
            drawable = null;
        } else if ((i3 & 1) == 0 || (drawable = this.f8139e) == null) {
            drawable = this.f8138d;
        }
        this.f8135a.setLogo(drawable);
    }
}
