package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.R;
import java.io.IOException;
import java.util.ArrayList;
import p089d1.C1403C;
import p104h1.AbstractC1635T;
import p104h1.AbstractC1667x;

/* JADX INFO: renamed from: androidx.mediarouter.app.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1014A extends AbstractC1667x {

    /* JADX INFO: renamed from: c */
    public final ArrayList f4392c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final LayoutInflater f4393d;

    /* JADX INFO: renamed from: e */
    public final Drawable f4394e;

    /* JADX INFO: renamed from: f */
    public final Drawable f4395f;

    /* JADX INFO: renamed from: g */
    public final Drawable f4396g;

    /* JADX INFO: renamed from: h */
    public final Drawable f4397h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ DialogC1015B f4398i;

    public C1014A(DialogC1015B dialogC1015B) {
        this.f4398i = dialogC1015B;
        this.f4393d = LayoutInflater.from(dialogC1015B.f4401n);
        Context context = dialogC1015B.f4401n;
        this.f4394e = AbstractC1303m.m3323p(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f4395f = AbstractC1303m.m3323p(context, R.attr.mediaRouteTvIconDrawable);
        this.f4396g = AbstractC1303m.m3323p(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.f4397h = AbstractC1303m.m3323p(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        m2595f();
    }

    @Override // p104h1.AbstractC1667x
    /* JADX INFO: renamed from: a */
    public final int mo2591a() {
        return this.f4392c.size();
    }

    @Override // p104h1.AbstractC1667x
    /* JADX INFO: renamed from: b */
    public final int mo2592b(int i3) {
        return ((C1055x) this.f4392c.get(i3)).f4675b;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006a  */
    /* JADX WARN: Code duplicated, block: B:17:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    /* JADX WARN: Code duplicated, block: B:22:0x007a  */
    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    @Override // p104h1.AbstractC1667x
    /* JADX INFO: renamed from: c */
    public final void mo2593c(AbstractC1635T abstractC1635T, int i3) {
        Drawable drawableCreateFromStream;
        int i4;
        Drawable drawable;
        int iMo2592b = mo2592b(i3);
        C1055x c1055x = (C1055x) this.f4392c.get(i3);
        if (iMo2592b == 1) {
            ((C1054w) abstractC1635T).f4673t.setText(c1055x.f4674a.toString());
            return;
        }
        if (iMo2592b != 2) {
            Log.w("RecyclerAdapter", "Cannot bind item to ViewHolder because of wrong view type");
            return;
        }
        C1057z c1057z = (C1057z) abstractC1635T;
        C1403C c1403c = (C1403C) c1055x.f4674a;
        View view = c1057z.f4678t;
        view.setVisibility(0);
        c1057z.f4680v.setVisibility(4);
        view.setOnClickListener(new ViewOnClickListenerC1056y(c1057z, c1403c));
        c1057z.f4681w.setText(c1403c.f6219d);
        C1014A c1014a = c1057z.f4682x;
        c1014a.getClass();
        Uri uri = c1403c.f6221f;
        if (uri != null) {
            try {
                drawableCreateFromStream = Drawable.createFromStream(c1014a.f4398i.f4401n.getContentResolver().openInputStream(uri), null);
                if (drawableCreateFromStream == null) {
                    i4 = c1403c.f6229n;
                    if (i4 != 1) {
                        drawable = c1014a.f4395f;
                    } else if (i4 != 2) {
                        drawable = c1014a.f4396g;
                    } else if (c1403c.m3495e()) {
                        drawable = c1014a.f4397h;
                    } else {
                        drawable = c1014a.f4394e;
                    }
                    drawableCreateFromStream = drawable;
                }
            } catch (IOException e3) {
                Log.w("RecyclerAdapter", "Failed to load " + uri, e3);
            }
        } else {
            i4 = c1403c.f6229n;
            if (i4 != 1) {
                drawable = c1014a.f4395f;
            } else if (i4 != 2) {
                drawable = c1014a.f4396g;
            } else if (c1403c.m3495e()) {
                drawable = c1014a.f4397h;
            } else {
                drawable = c1014a.f4394e;
            }
            drawableCreateFromStream = drawable;
        }
        c1057z.f4679u.setImageDrawable(drawableCreateFromStream);
    }

    @Override // p104h1.AbstractC1667x
    /* JADX INFO: renamed from: d */
    public final AbstractC1635T mo2594d(ViewGroup viewGroup, int i3) {
        LayoutInflater layoutInflater = this.f4393d;
        if (i3 != 1) {
            if (i3 == 2) {
                return new C1057z(this, layoutInflater.inflate(R.layout.mr_picker_route_item, viewGroup, false));
            }
            throw new IllegalStateException();
        }
        View viewInflate = layoutInflater.inflate(R.layout.mr_picker_header_item, viewGroup, false);
        C1054w c1054w = new C1054w(viewInflate);
        c1054w.f4673t = (TextView) viewInflate.findViewById(R.id.mr_picker_header_name);
        return c1054w;
    }

    /* JADX INFO: renamed from: f */
    public final void m2595f() {
        ArrayList arrayList = this.f4392c;
        arrayList.clear();
        DialogC1015B dialogC1015B = this.f4398i;
        arrayList.add(new C1055x(dialogC1015B.f4401n.getString(R.string.mr_chooser_title)));
        ArrayList arrayList2 = dialogC1015B.f4403p;
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            arrayList.add(new C1055x((C1403C) obj));
        }
        this.f7587a.m4100a();
    }
}
