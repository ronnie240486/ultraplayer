package p083b1;

import android.os.Message;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.p080ui.TrackSelectionView;
import java.util.ArrayList;
import java.util.HashMap;
import p055T.C0559W;
import p055T.C0560X;
import p055T.C0566b0;
import p091e.C1474e;
import p105h2.AbstractC1676G;
import p106i.AbstractC1733a;
import p110j.C1774o;
import p113k.C1840Y0;

/* JADX INFO: renamed from: b1.O */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1086O implements View.OnClickListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4965g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f4966h;

    public /* synthetic */ ViewOnClickListenerC1086O(int i3, Object obj) {
        this.f4965g = i3;
        this.f4966h = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message messageObtain;
        Message message;
        Message message2;
        Message message3;
        switch (this.f4965g) {
            case 0:
                TrackSelectionView trackSelectionView = (TrackSelectionView) this.f4966h;
                HashMap map = trackSelectionView.f4386m;
                boolean z3 = true;
                if (view == trackSelectionView.f4382i) {
                    trackSelectionView.f4391r = true;
                    map.clear();
                } else if (view == trackSelectionView.f4383j) {
                    trackSelectionView.f4391r = false;
                    map.clear();
                } else {
                    trackSelectionView.f4391r = false;
                    Object tag = view.getTag();
                    tag.getClass();
                    C1087P c1087p = (C1087P) tag;
                    C0566b0 c0566b0 = c1087p.f4967a;
                    C0559W c0559w = c0566b0.f2048b;
                    C0560X c0560x = (C0560X) map.get(c0559w);
                    int i3 = c1087p.f4968b;
                    if (c0560x == null) {
                        if (!trackSelectionView.f4388o && map.size() > 0) {
                            map.clear();
                        }
                        map.put(c0559w, new C0560X(c0559w, AbstractC1676G.m4120r(Integer.valueOf(i3))));
                    } else {
                        ArrayList arrayList = new ArrayList(c0560x.f1998b);
                        boolean zIsChecked = ((CheckedTextView) view).isChecked();
                        boolean z4 = trackSelectionView.f4387n && c0566b0.f2049c;
                        if (!z4 && (!trackSelectionView.f4388o || trackSelectionView.f4385l.size() <= 1)) {
                            z3 = false;
                        }
                        if (zIsChecked && z3) {
                            arrayList.remove(Integer.valueOf(i3));
                            if (arrayList.isEmpty()) {
                                map.remove(c0559w);
                            } else {
                                map.put(c0559w, new C0560X(c0559w, arrayList));
                            }
                        } else if (!zIsChecked) {
                            if (z4) {
                                arrayList.add(Integer.valueOf(i3));
                                map.put(c0559w, new C0560X(c0559w, arrayList));
                            } else {
                                map.put(c0559w, new C0560X(c0559w, AbstractC1676G.m4120r(Integer.valueOf(i3))));
                            }
                        }
                    }
                }
                trackSelectionView.m2589a();
                break;
            case 1:
                C1474e c1474e = (C1474e) this.f4966h;
                if (view == c1474e.f6583h && (message3 = c1474e.f6585j) != null) {
                    messageObtain = Message.obtain(message3);
                } else if (view != c1474e.f6586k || (message2 = c1474e.f6588m) == null) {
                    messageObtain = (view != c1474e.f6589n || (message = c1474e.f6591p) == null) ? null : Message.obtain(message);
                } else {
                    messageObtain = Message.obtain(message2);
                }
                if (messageObtain != null) {
                    messageObtain.sendToTarget();
                }
                c1474e.f6574D.obtainMessage(1, c1474e.f6577b).sendToTarget();
                break;
            case 2:
                ((AbstractC1733a) this.f4966h).mo3680a();
                break;
            default:
                C1840Y0 c1840y0 = ((Toolbar) this.f4966h).f3915R;
                C1774o c1774o = c1840y0 == null ? null : c1840y0.f8112h;
                if (c1774o != null) {
                    c1774o.collapseActionView();
                }
                break;
        }
    }
}
