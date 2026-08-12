package androidx.mediarouter.app;

import android.util.Log;
import android.view.View;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p089d1.AbstractC1446s;
import p089d1.C1403C;
import p089d1.C1405E;
import p089d1.C1433f;
import p089d1.C1445r;
import p089d1.C1447t;
import p104h1.AbstractC1635T;

/* JADX INFO: renamed from: androidx.mediarouter.app.E */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1018E implements View.OnClickListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4417g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f4418h;

    public /* synthetic */ ViewOnClickListenerC1018E(int i3, Object obj) {
        this.f4417g = i3;
        this.f4418h = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int iMax;
        C1445r c1445r;
        C1445r c1445r2;
        C1445r c1445r3;
        switch (this.f4417g) {
            case 0:
                AbstractC1019F abstractC1019F = (AbstractC1019F) this.f4418h;
                DialogC1028O dialogC1028O = abstractC1019F.f4422w;
                if (dialogC1028O.f4473C != null) {
                    dialogC1028O.f4508x.removeMessages(2);
                }
                DialogC1028O dialogC1028O2 = abstractC1019F.f4422w;
                dialogC1028O2.f4473C = abstractC1019F.f4419t;
                boolean zIsActivated = view.isActivated();
                boolean z3 = !zIsActivated;
                if (zIsActivated) {
                    Integer num = (Integer) dialogC1028O2.f4474D.get(abstractC1019F.f4419t.f6218c);
                    iMax = num == null ? 1 : Math.max(1, num.intValue());
                } else {
                    iMax = 0;
                }
                abstractC1019F.m2600q(z3);
                abstractC1019F.f4421v.setProgress(iMax);
                abstractC1019F.f4419t.m3500j(iMax);
                dialogC1028O2.f4508x.sendEmptyMessageDelayed(2, 500L);
                return;
            case 1:
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) this.f4418h;
                boolean z4 = mediaRouteExpandCollapseButton.f4462n;
                mediaRouteExpandCollapseButton.f4462n = !z4;
                if (z4) {
                    mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f4459k);
                    mediaRouteExpandCollapseButton.f4459k.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.f4460l);
                } else {
                    mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f4458j);
                    mediaRouteExpandCollapseButton.f4458j.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.f4461m);
                }
                View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.f4463o;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 2:
                ((DialogC1015B) this.f4418h).dismiss();
                return;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                C1021H c1021h = (C1021H) this.f4418h;
                DialogC1028O dialogC1028O3 = c1021h.f4431z.f4457l;
                C1403C c1403c = c1021h.f4430y;
                dialogC1028O3.f4496l.getClass();
                if (c1403c == null) {
                    throw new NullPointerException("route must not be null");
                }
                C1405E.m3510b();
                C1433f c1433fM3511c = C1405E.m3511c();
                if (!(c1433fM3511c.f6334e instanceof AbstractC1446s)) {
                    throw new IllegalStateException("There is no currently selected dynamic group route.");
                }
                C1447t c1447tM3492b = c1433fM3511c.f6333d.m3492b(c1403c);
                if (c1447tM3492b == null || (c1445r = (C1445r) c1447tM3492b.f6406h) == null || !c1445r.f6399e) {
                    Log.w("GlobalMediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                } else {
                    ((AbstractC1446s) c1433fM3511c.f6334e).mo3559o(Collections.singletonList(c1403c.f6217b));
                }
                c1021h.f4426u.setVisibility(4);
                c1021h.f4427v.setVisibility(0);
                return;
            default:
                C1025L c1025l = (C1025L) this.f4418h;
                boolean zM2611r = c1025l.m2611r(c1025l.f4419t);
                boolean z5 = !zM2611r;
                boolean zM3495e = c1025l.f4419t.m3495e();
                C1026M c1026m = c1025l.f4444G;
                if (zM2611r) {
                    DialogC1028O dialogC1028O4 = c1026m.f4457l;
                    C1403C c1403c2 = c1025l.f4419t;
                    dialogC1028O4.f4496l.getClass();
                    if (c1403c2 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    C1405E.m3510b();
                    C1433f c1433fM3511c2 = C1405E.m3511c();
                    if (!(c1433fM3511c2.f6334e instanceof AbstractC1446s)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    C1447t c1447tM3492b2 = c1433fM3511c2.f6333d.m3492b(c1403c2);
                    if (!Collections.unmodifiableList(c1433fM3511c2.f6333d.f6237v).contains(c1403c2) || c1447tM3492b2 == null || ((c1445r2 = (C1445r) c1447tM3492b2.f6406h) != null && !c1445r2.f6397c)) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + c1403c2);
                    } else if (Collections.unmodifiableList(c1433fM3511c2.f6333d.f6237v).size() <= 1) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove the last member route.");
                    } else {
                        ((AbstractC1446s) c1433fM3511c2.f6334e).mo3558n(c1403c2.f6217b);
                    }
                } else {
                    DialogC1028O dialogC1028O5 = c1026m.f4457l;
                    C1403C c1403c3 = c1025l.f4419t;
                    dialogC1028O5.f4496l.getClass();
                    if (c1403c3 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    C1405E.m3510b();
                    C1433f c1433fM3511c3 = C1405E.m3511c();
                    if (!(c1433fM3511c3.f6334e instanceof AbstractC1446s)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    C1447t c1447tM3492b3 = c1433fM3511c3.f6333d.m3492b(c1403c3);
                    if (Collections.unmodifiableList(c1433fM3511c3.f6333d.f6237v).contains(c1403c3) || c1447tM3492b3 == null || (c1445r3 = (C1445r) c1447tM3492b3.f6406h) == null || !c1445r3.f6398d) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + c1403c3);
                    } else {
                        ((AbstractC1446s) c1433fM3511c3.f6334e).mo3557m(c1403c3.f6217b);
                    }
                }
                c1025l.m2612s(z5, !zM3495e);
                if (zM3495e) {
                    List listUnmodifiableList = Collections.unmodifiableList(c1026m.f4457l.f4499o.f6237v);
                    for (C1403C c1403c4 : Collections.unmodifiableList(c1025l.f4419t.f6237v)) {
                        if (listUnmodifiableList.contains(c1403c4) != z5) {
                            AbstractC1019F abstractC1019F2 = (AbstractC1019F) c1026m.f4457l.f4472B.get(c1403c4.f6218c);
                            if (abstractC1019F2 instanceof C1025L) {
                                ((C1025L) abstractC1019F2).m2612s(z5, true);
                            }
                        }
                    }
                }
                C1403C c1403c5 = c1025l.f4419t;
                DialogC1028O dialogC1028O6 = c1026m.f4457l;
                List listUnmodifiableList2 = Collections.unmodifiableList(dialogC1028O6.f4499o.f6237v);
                int iMax2 = Math.max(1, listUnmodifiableList2.size());
                if (c1403c5.m3495e()) {
                    Iterator it = Collections.unmodifiableList(c1403c5.f6237v).iterator();
                    while (it.hasNext()) {
                        if (listUnmodifiableList2.contains((C1403C) it.next()) != z5) {
                            iMax2 += !zM2611r ? 1 : -1;
                        }
                    }
                } else {
                    iMax2 += zM2611r ? -1 : 1;
                }
                DialogC1028O dialogC1028O7 = c1026m.f4457l;
                boolean z6 = dialogC1028O7.f4495Y && Collections.unmodifiableList(dialogC1028O7.f4499o.f6237v).size() > 1;
                boolean z7 = dialogC1028O6.f4495Y && iMax2 >= 2;
                if (z6 != z7) {
                    AbstractC1635T abstractC1635TM2749C = dialogC1028O6.f4509y.m2749C(0);
                    if (abstractC1635TM2749C instanceof C1022I) {
                        C1022I c1022i = (C1022I) abstractC1635TM2749C;
                        c1026m.m2614f(c1022i.f7406a, z7 ? c1022i.f4433y : 0);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
