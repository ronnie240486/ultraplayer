package p106i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.zuxoplayer.app.R;

/* JADX INFO: renamed from: i.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1735c extends ContextWrapper {

    /* JADX INFO: renamed from: f */
    public static Configuration f7726f;

    /* JADX INFO: renamed from: a */
    public int f7727a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f7728b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f7729c;

    /* JADX INFO: renamed from: d */
    public Configuration f7730d;

    /* JADX INFO: renamed from: e */
    public Resources f7731e;

    public C1735c(Context context, int i3) {
        super(context);
        this.f7727a = i3;
    }

    /* JADX INFO: renamed from: a */
    public final void m4187a(Configuration configuration) {
        if (this.f7731e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f7730d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f7730d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m4188b() {
        if (this.f7728b == null) {
            this.f7728b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f7728b.setTo(theme);
            }
        }
        this.f7728b.applyStyle(this.f7727a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f7731e == null) {
            Configuration configuration = this.f7730d;
            if (configuration == null) {
                this.f7731e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f7726f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f7726f = configuration2;
                    }
                    if (configuration.equals(f7726f)) {
                        this.f7731e = super.getResources();
                    }
                }
                this.f7731e = createConfigurationContext(this.f7730d).getResources();
            }
        }
        return this.f7731e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f7729c == null) {
            this.f7729c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f7729c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f7728b;
        if (theme != null) {
            return theme;
        }
        if (this.f7727a == 0) {
            this.f7727a = R.style.Theme_AppCompat_Light;
        }
        m4188b();
        return this.f7728b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i3) {
        if (this.f7727a != i3) {
            this.f7727a = i3;
            m4188b();
        }
    }
}
