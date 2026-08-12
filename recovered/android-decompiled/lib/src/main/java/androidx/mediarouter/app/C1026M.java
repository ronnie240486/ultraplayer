package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.cast.AbstractC1303m;
import com.zuxoplayer.app.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p089d1.AbstractC1446s;
import p089d1.C1402B;
import p089d1.C1403C;
import p089d1.C1405E;
import p089d1.C1445r;
import p089d1.C1447t;
import p104h1.AbstractC1635T;
import p104h1.AbstractC1667x;

/* JADX INFO: renamed from: androidx.mediarouter.app.M */
/* JADX INFO: loaded from: classes.dex */
public final class C1026M extends AbstractC1667x {

    /* JADX INFO: renamed from: c */
    public final ArrayList f4448c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final LayoutInflater f4449d;

    /* JADX INFO: renamed from: e */
    public final Drawable f4450e;

    /* JADX INFO: renamed from: f */
    public final Drawable f4451f;

    /* JADX INFO: renamed from: g */
    public final Drawable f4452g;

    /* JADX INFO: renamed from: h */
    public final Drawable f4453h;

    /* JADX INFO: renamed from: i */
    public C1024K f4454i;

    /* JADX INFO: renamed from: j */
    public final int f4455j;

    /* JADX INFO: renamed from: k */
    public final AccelerateDecelerateInterpolator f4456k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ DialogC1028O f4457l;

    public C1026M(DialogC1028O dialogC1028O) {
        this.f4457l = dialogC1028O;
        this.f4449d = LayoutInflater.from(dialogC1028O.f4504t);
        Context context = dialogC1028O.f4504t;
        this.f4450e = AbstractC1303m.m3323p(context, R.attr.mediaRouteDefaultIconDrawable);
        this.f4451f = AbstractC1303m.m3323p(context, R.attr.mediaRouteTvIconDrawable);
        this.f4452g = AbstractC1303m.m3323p(context, R.attr.mediaRouteSpeakerIconDrawable);
        this.f4453h = AbstractC1303m.m3323p(context, R.attr.mediaRouteSpeakerGroupIconDrawable);
        this.f4455j = context.getResources().getInteger(R.integer.mr_cast_volume_slider_layout_animation_duration_ms);
        this.f4456k = new AccelerateDecelerateInterpolator();
        m2617i();
    }

    @Override // p104h1.AbstractC1667x
    /* JADX INFO: renamed from: a */
    public final int mo2591a() {
        return this.f4448c.size() + 1;
    }

    @Override // p104h1.AbstractC1667x
    /* JADX INFO: renamed from: b */
    public final int mo2592b(int i3) {
        C1024K c1024k;
        if (i3 == 0) {
            c1024k = this.f4454i;
        } else {
            c1024k = (C1024K) this.f4448c.get(i3 - 1);
        }
        return c1024k.f4437b;
    }

    @Override // p104h1.AbstractC1667x
    /* JADX INFO: renamed from: c */
    public final void mo2593c(AbstractC1635T abstractC1635T, int i3) {
        C1447t c1447tM3492b;
        C1445r c1445r;
        ArrayList arrayList = this.f4448c;
        int i4 = (i3 == 0 ? this.f4454i : (C1024K) arrayList.get(i3 - 1)).f4437b;
        boolean z3 = true;
        C1024K c1024k = i3 == 0 ? this.f4454i : (C1024K) arrayList.get(i3 - 1);
        DialogC1028O dialogC1028O = this.f4457l;
        int i5 = 0;
        if (i4 == 1) {
            dialogC1028O.f4472B.put(((C1403C) c1024k.f4436a).f6218c, (AbstractC1019F) abstractC1635T);
            C1022I c1022i = (C1022I) abstractC1635T;
            DialogC1028O dialogC1028O2 = c1022i.f4434z.f4457l;
            if (dialogC1028O2.f4495Y && Collections.unmodifiableList(dialogC1028O2.f4499o.f6237v).size() > 1) {
                i5 = c1022i.f4433y;
            }
            View view = c1022i.f7406a;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i5;
            view.setLayoutParams(layoutParams);
            C1403C c1403c = (C1403C) c1024k.f4436a;
            c1022i.m2599p(c1403c);
            c1022i.f4432x.setText(c1403c.f6219d);
            return;
        }
        if (i4 == 2) {
            ((C1023J) abstractC1635T).f4435t.setText(c1024k.f4436a.toString());
            return;
        }
        float f = 1.0f;
        if (i4 != 3) {
            if (i4 != 4) {
                throw new IllegalStateException();
            }
            C1021H c1021h = (C1021H) abstractC1635T;
            C1403C c1403c2 = (C1403C) c1024k.f4436a;
            c1021h.f4430y = c1403c2;
            ImageView imageView = c1021h.f4426u;
            imageView.setVisibility(0);
            c1021h.f4427v.setVisibility(4);
            C1026M c1026m = c1021h.f4431z;
            List listUnmodifiableList = Collections.unmodifiableList(c1026m.f4457l.f4499o.f6237v);
            if (listUnmodifiableList.size() == 1 && listUnmodifiableList.get(0) == c1403c2) {
                f = c1021h.f4429x;
            }
            View view2 = c1021h.f4425t;
            view2.setAlpha(f);
            view2.setOnClickListener(new ViewOnClickListenerC1018E(3, c1021h));
            imageView.setImageDrawable(c1026m.m2615g(c1403c2));
            c1021h.f4428w.setText(c1403c2.f6219d);
            return;
        }
        dialogC1028O.f4472B.put(((C1403C) c1024k.f4436a).f6218c, (AbstractC1019F) abstractC1635T);
        C1025L c1025l = (C1025L) abstractC1635T;
        C1403C c1403c3 = (C1403C) c1024k.f4436a;
        C1026M c1026m2 = c1025l.f4444G;
        DialogC1028O dialogC1028O3 = c1026m2.f4457l;
        if (c1403c3 == dialogC1028O3.f4499o && Collections.unmodifiableList(c1403c3.f6237v).size() > 0) {
            for (C1403C c1403c4 : Collections.unmodifiableList(c1403c3.f6237v)) {
                if (!dialogC1028O3.f4501q.contains(c1403c4)) {
                    c1403c3 = c1403c4;
                    break;
                }
            }
        }
        c1025l.m2599p(c1403c3);
        Drawable drawableM2615g = c1026m2.m2615g(c1403c3);
        ImageView imageView2 = c1025l.f4446y;
        imageView2.setImageDrawable(drawableM2615g);
        c1025l.f4438A.setText(c1403c3.f6219d);
        CheckBox checkBox = c1025l.f4440C;
        checkBox.setVisibility(0);
        boolean zM2611r = c1025l.m2611r(c1403c3);
        boolean z4 = !dialogC1028O3.f4503s.contains(c1403c3) && (!c1025l.m2611r(c1403c3) || Collections.unmodifiableList(dialogC1028O3.f4499o.f6237v).size() >= 2) && (!c1025l.m2611r(c1403c3) || ((c1447tM3492b = dialogC1028O3.f4499o.m3492b(c1403c3)) != null && ((c1445r = (C1445r) c1447tM3492b.f6406h) == null || c1445r.f6397c)));
        checkBox.setChecked(zM2611r);
        c1025l.f4447z.setVisibility(4);
        imageView2.setVisibility(0);
        View view3 = c1025l.f4445x;
        view3.setEnabled(z4);
        checkBox.setEnabled(z4);
        c1025l.f4420u.setEnabled(z4 || zM2611r);
        if (!z4 && !zM2611r) {
            z3 = false;
        }
        c1025l.f4421v.setEnabled(z3);
        ViewOnClickListenerC1018E viewOnClickListenerC1018E = c1025l.f4443F;
        view3.setOnClickListener(viewOnClickListenerC1018E);
        checkBox.setOnClickListener(viewOnClickListenerC1018E);
        if (zM2611r && !c1025l.f4419t.m3495e()) {
            i5 = c1025l.f4442E;
        }
        RelativeLayout relativeLayout = c1025l.f4439B;
        ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
        layoutParams2.height = i5;
        relativeLayout.setLayoutParams(layoutParams2);
        float f3 = c1025l.f4441D;
        view3.setAlpha((z4 || zM2611r) ? 1.0f : f3);
        if (!z4 && zM2611r) {
            f = f3;
        }
        checkBox.setAlpha(f);
    }

    @Override // p104h1.AbstractC1667x
    /* JADX INFO: renamed from: d */
    public final AbstractC1635T mo2594d(ViewGroup viewGroup, int i3) {
        LayoutInflater layoutInflater = this.f4449d;
        if (i3 == 1) {
            return new C1022I(this, layoutInflater.inflate(R.layout.mr_cast_group_volume_item, viewGroup, false));
        }
        if (i3 == 2) {
            return new C1023J(layoutInflater.inflate(R.layout.mr_cast_header_item, viewGroup, false));
        }
        if (i3 == 3) {
            return new C1025L(this, layoutInflater.inflate(R.layout.mr_cast_route_item, viewGroup, false));
        }
        if (i3 == 4) {
            return new C1021H(this, layoutInflater.inflate(R.layout.mr_cast_group_item, viewGroup, false));
        }
        throw new IllegalStateException();
    }

    @Override // p104h1.AbstractC1667x
    /* JADX INFO: renamed from: e */
    public final void mo2613e(AbstractC1635T abstractC1635T) {
        this.f4457l.f4472B.values().remove(abstractC1635T);
    }

    /* JADX INFO: renamed from: f */
    public final void m2614f(View view, int i3) {
        C1043l c1043l = new C1043l(i3, view.getLayoutParams().height, view, 1);
        c1043l.setAnimationListener(new AnimationAnimationListenerC1045n(2, this));
        c1043l.setDuration(this.f4455j);
        c1043l.setInterpolator(this.f4456k);
        view.startAnimation(c1043l);
    }

    /* JADX INFO: renamed from: g */
    public final Drawable m2615g(C1403C c1403c) {
        Uri uri = c1403c.f6221f;
        if (uri != null) {
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(this.f4457l.f4504t.getContentResolver().openInputStream(uri), null);
                if (drawableCreateFromStream != null) {
                    return drawableCreateFromStream;
                }
            } catch (IOException e3) {
                Log.w("MediaRouteCtrlDialog", "Failed to load " + uri, e3);
            }
        }
        int i3 = c1403c.f6229n;
        if (i3 == 1) {
            return this.f4451f;
        }
        if (i3 != 2) {
            return c1403c.m3495e() ? this.f4453h : this.f4450e;
        }
        return this.f4452g;
    }

    /* JADX INFO: renamed from: h */
    public final void m2616h() {
        C1445r c1445r;
        DialogC1028O dialogC1028O = this.f4457l;
        ArrayList arrayList = dialogC1028O.f4503s;
        arrayList.clear();
        ArrayList arrayList2 = dialogC1028O.f4501q;
        ArrayList arrayList3 = new ArrayList();
        C1402B c1402b = dialogC1028O.f4499o.f6216a;
        c1402b.getClass();
        C1405E.m3510b();
        for (C1403C c1403c : Collections.unmodifiableList(c1402b.f6212b)) {
            C1447t c1447tM3492b = dialogC1028O.f4499o.m3492b(c1403c);
            if (c1447tM3492b != null && (c1445r = (C1445r) c1447tM3492b.f6406h) != null && c1445r.f6398d) {
                arrayList3.add(c1403c);
            }
        }
        HashSet hashSet = new HashSet(arrayList2);
        hashSet.removeAll(arrayList3);
        arrayList.addAll(hashSet);
        this.f7587a.m4100a();
    }

    /* JADX INFO: renamed from: i */
    public final void m2617i() {
        ArrayList arrayList = this.f4448c;
        arrayList.clear();
        DialogC1028O dialogC1028O = this.f4457l;
        this.f4454i = new C1024K(1, dialogC1028O.f4499o);
        ArrayList arrayList2 = dialogC1028O.f4500p;
        boolean z3 = false;
        if (arrayList2.isEmpty()) {
            arrayList.add(new C1024K(3, dialogC1028O.f4499o));
        } else {
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                arrayList.add(new C1024K(3, (C1403C) obj));
            }
        }
        ArrayList arrayList3 = dialogC1028O.f4501q;
        if (!arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            boolean z4 = false;
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                C1403C c1403c = (C1403C) obj2;
                if (!arrayList2.contains(c1403c)) {
                    if (!z4) {
                        dialogC1028O.f4499o.getClass();
                        AbstractC1446s abstractC1446sM3491a = C1403C.m3491a();
                        String strMo3555j = abstractC1446sM3491a != null ? abstractC1446sM3491a.mo3555j() : null;
                        if (TextUtils.isEmpty(strMo3555j)) {
                            strMo3555j = dialogC1028O.f4504t.getString(R.string.mr_dialog_groupable_header);
                        }
                        arrayList.add(new C1024K(2, strMo3555j));
                        z4 = true;
                    }
                    arrayList.add(new C1024K(3, c1403c));
                }
            }
        }
        ArrayList arrayList4 = dialogC1028O.f4502r;
        if (!arrayList4.isEmpty()) {
            int size3 = arrayList4.size();
            int i5 = 0;
            while (i5 < size3) {
                Object obj3 = arrayList4.get(i5);
                i5++;
                C1403C c1403c2 = (C1403C) obj3;
                C1403C c1403c3 = dialogC1028O.f4499o;
                if (c1403c3 != c1403c2) {
                    if (!z3) {
                        c1403c3.getClass();
                        AbstractC1446s abstractC1446sM3491a2 = C1403C.m3491a();
                        String strMo3556k = abstractC1446sM3491a2 != null ? abstractC1446sM3491a2.mo3556k() : null;
                        if (TextUtils.isEmpty(strMo3556k)) {
                            strMo3556k = dialogC1028O.f4504t.getString(R.string.mr_dialog_transferable_header);
                        }
                        arrayList.add(new C1024K(2, strMo3556k));
                        z3 = true;
                    }
                    arrayList.add(new C1024K(4, c1403c2));
                }
            }
        }
        m2616h();
    }
}
