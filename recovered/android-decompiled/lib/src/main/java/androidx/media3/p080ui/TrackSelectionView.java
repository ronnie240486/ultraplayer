package androidx.media3.p080ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000A.C0031d;
import p055T.C0559W;
import p055T.C0560X;
import p055T.C0566b0;
import p083b1.C1087P;
import p083b1.InterfaceC1085N;
import p083b1.ViewOnClickListenerC1086O;

/* JADX INFO: loaded from: classes.dex */
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: g */
    public final int f4380g;

    /* JADX INFO: renamed from: h */
    public final LayoutInflater f4381h;

    /* JADX INFO: renamed from: i */
    public final CheckedTextView f4382i;

    /* JADX INFO: renamed from: j */
    public final CheckedTextView f4383j;

    /* JADX INFO: renamed from: k */
    public final ViewOnClickListenerC1086O f4384k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f4385l;

    /* JADX INFO: renamed from: m */
    public final HashMap f4386m;

    /* JADX INFO: renamed from: n */
    public boolean f4387n;

    /* JADX INFO: renamed from: o */
    public boolean f4388o;

    /* JADX INFO: renamed from: p */
    public InterfaceC1085N f4389p;

    /* JADX INFO: renamed from: q */
    public CheckedTextView[][] f4390q;

    /* JADX INFO: renamed from: r */
    public boolean f4391r;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f4380g = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f4381h = layoutInflaterFrom;
        ViewOnClickListenerC1086O viewOnClickListenerC1086O = new ViewOnClickListenerC1086O(0, this);
        this.f4384k = viewOnClickListenerC1086O;
        this.f4389p = new C0031d(getResources());
        this.f4385l = new ArrayList();
        this.f4386m = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f4382i = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.zuxoplayer.app.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(viewOnClickListenerC1086O);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(com.zuxoplayer.app.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f4383j = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.zuxoplayer.app.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(viewOnClickListenerC1086O);
        addView(checkedTextView2);
    }

    /* JADX INFO: renamed from: a */
    public final void m2589a() {
        this.f4382i.setChecked(this.f4391r);
        boolean z3 = this.f4391r;
        HashMap map = this.f4386m;
        this.f4383j.setChecked(!z3 && map.size() == 0);
        for (int i3 = 0; i3 < this.f4390q.length; i3++) {
            C0560X c0560x = (C0560X) map.get(((C0566b0) this.f4385l.get(i3)).f2048b);
            int i4 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f4390q[i3];
                if (i4 < checkedTextViewArr.length) {
                    if (c0560x != null) {
                        Object tag = checkedTextViewArr[i4].getTag();
                        tag.getClass();
                        this.f4390q[i3][i4].setChecked(c0560x.f1998b.contains(Integer.valueOf(((C1087P) tag).f4968b)));
                    } else {
                        checkedTextViewArr[i4].setChecked(false);
                    }
                    i4++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2590b() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.f4385l;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.f4383j;
        CheckedTextView checkedTextView2 = this.f4382i;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.f4390q = new CheckedTextView[arrayList.size()][];
        boolean z3 = this.f4388o && arrayList.size() > 1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0566b0 c0566b0 = (C0566b0) arrayList.get(i3);
            boolean z4 = this.f4387n && c0566b0.f2049c;
            CheckedTextView[][] checkedTextViewArr = this.f4390q;
            int i4 = c0566b0.f2047a;
            checkedTextViewArr[i3] = new CheckedTextView[i4];
            C1087P[] c1087pArr = new C1087P[i4];
            for (int i5 = 0; i5 < c0566b0.f2047a; i5++) {
                c1087pArr[i5] = new C1087P(c0566b0, i5);
            }
            for (int i6 = 0; i6 < i4; i6++) {
                LayoutInflater layoutInflater = this.f4381h;
                if (i6 == 0) {
                    addView(layoutInflater.inflate(com.zuxoplayer.app.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z4 || z3) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.f4380g);
                InterfaceC1085N interfaceC1085N = this.f4389p;
                C1087P c1087p = c1087pArr[i6];
                checkedTextView3.setText(((C0031d) interfaceC1085N).m173u(c1087p.f4967a.f2048b.f1995d[c1087p.f4968b]));
                checkedTextView3.setTag(c1087pArr[i6]);
                if (c0566b0.m1432a(i6)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.f4384k);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.f4390q[i3][i6] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        m2589a();
    }

    public boolean getIsDisabled() {
        return this.f4391r;
    }

    public Map<C0559W, C0560X> getOverrides() {
        return this.f4386m;
    }

    public void setAllowAdaptiveSelections(boolean z3) {
        if (this.f4387n != z3) {
            this.f4387n = z3;
            m2590b();
        }
    }

    public void setAllowMultipleOverrides(boolean z3) {
        if (this.f4388o != z3) {
            this.f4388o = z3;
            if (!z3) {
                HashMap map = this.f4386m;
                if (map.size() > 1) {
                    ArrayList arrayList = this.f4385l;
                    HashMap map2 = new HashMap();
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        C0560X c0560x = (C0560X) map.get(((C0566b0) arrayList.get(i3)).f2048b);
                        if (c0560x != null && map2.isEmpty()) {
                            map2.put(c0560x.f1997a, c0560x);
                        }
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            m2590b();
        }
    }

    public void setShowDisableOption(boolean z3) {
        this.f4382i.setVisibility(z3 ? 0 : 8);
    }

    public void setTrackNameProvider(InterfaceC1085N interfaceC1085N) {
        interfaceC1085N.getClass();
        this.f4389p = interfaceC1085N;
        m2590b();
    }
}
