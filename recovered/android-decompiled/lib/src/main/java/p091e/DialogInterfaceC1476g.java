package p091e;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.zuxoplayer.app.R;
import java.util.WeakHashMap;
import p000A.AbstractC0006G;
import p000A.AbstractC0016Q;
import p013E1.RunnableC0123F;
import p083b1.ViewOnClickListenerC1086O;
import p113k.C1898v0;

/* JADX INFO: renamed from: e.g */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceC1476g extends AbstractDialogC1460E implements DialogInterface {

    /* JADX INFO: renamed from: l */
    public final C1474e f6604l;

    public DialogInterfaceC1476g(ContextThemeWrapper contextThemeWrapper, int i3) {
        super(contextThemeWrapper, m3704h(contextThemeWrapper, i3));
        this.f6604l = new C1474e(getContext(), this, getWindow());
    }

    /* JADX INFO: renamed from: h */
    public static int m3704h(Context context, int i3) {
        if (((i3 >>> 24) & 255) >= 1) {
            return i3;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p091e.AbstractDialogC1460E, androidx.activity.DialogC0901k, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i3;
        ListAdapter listAdapter;
        View viewFindViewById;
        super.onCreate(bundle);
        C1474e c1474e = this.f6604l;
        c1474e.f6577b.setContentView(c1474e.f6600y);
        Window window = c1474e.f6578c;
        View viewFindViewById2 = window.findViewById(R.id.parentPanel);
        View viewFindViewById3 = viewFindViewById2.findViewById(R.id.topPanel);
        View viewFindViewById4 = viewFindViewById2.findViewById(R.id.contentPanel);
        View viewFindViewById5 = viewFindViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById2.findViewById(R.id.customPanel);
        View view = c1474e.f6581f;
        if (view == null) {
            view = null;
        }
        boolean z3 = view != null;
        if (!z3 || !C1474e.m3700a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z3) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (c1474e.f6582g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c1474e.f6580e != null) {
                ((LinearLayout.LayoutParams) ((C1898v0) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View viewFindViewById6 = viewGroup.findViewById(R.id.topPanel);
        View viewFindViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View viewFindViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup viewGroupM3702c = C1474e.m3702c(viewFindViewById6, viewFindViewById3);
        ViewGroup viewGroupM3702c2 = C1474e.m3702c(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupM3702c3 = C1474e.m3702c(viewFindViewById8, viewFindViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c1474e.f6592q = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c1474e.f6592q.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroupM3702c2.findViewById(android.R.id.message);
        c1474e.f6596u = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c1474e.f6592q.removeView(c1474e.f6596u);
            if (c1474e.f6580e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c1474e.f6592q.getParent();
                int iIndexOfChild = viewGroup2.indexOfChild(c1474e.f6592q);
                viewGroup2.removeViewAt(iIndexOfChild);
                viewGroup2.addView(c1474e.f6580e, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                viewGroupM3702c2.setVisibility(8);
            }
        }
        Button button = (Button) viewGroupM3702c3.findViewById(android.R.id.button1);
        c1474e.f6583h = button;
        ViewOnClickListenerC1086O viewOnClickListenerC1086O = c1474e.f6575E;
        button.setOnClickListener(viewOnClickListenerC1086O);
        if (TextUtils.isEmpty(c1474e.f6584i)) {
            c1474e.f6583h.setVisibility(8);
            i3 = 0;
        } else {
            c1474e.f6583h.setText(c1474e.f6584i);
            c1474e.f6583h.setVisibility(0);
            i3 = 1;
        }
        Button button2 = (Button) viewGroupM3702c3.findViewById(android.R.id.button2);
        c1474e.f6586k = button2;
        button2.setOnClickListener(viewOnClickListenerC1086O);
        if (TextUtils.isEmpty(c1474e.f6587l)) {
            c1474e.f6586k.setVisibility(8);
        } else {
            c1474e.f6586k.setText(c1474e.f6587l);
            c1474e.f6586k.setVisibility(0);
            i3 |= 2;
        }
        Button button3 = (Button) viewGroupM3702c3.findViewById(android.R.id.button3);
        c1474e.f6589n = button3;
        button3.setOnClickListener(viewOnClickListenerC1086O);
        if (TextUtils.isEmpty(c1474e.f6590o)) {
            c1474e.f6589n.setVisibility(8);
        } else {
            c1474e.f6589n.setText(c1474e.f6590o);
            c1474e.f6589n.setVisibility(0);
            i3 |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c1474e.f6576a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i3 == 1) {
                Button button4 = c1474e.f6583h;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i3 == 2) {
                Button button5 = c1474e.f6586k;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i3 == 4) {
                Button button6 = c1474e.f6589n;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i3 == 0) {
            viewGroupM3702c3.setVisibility(8);
        }
        if (c1474e.f6597v != null) {
            viewGroupM3702c.addView(c1474e.f6597v, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c1474e.f6594s = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c1474e.f6579d) || !c1474e.f6573C) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c1474e.f6594s.setVisibility(8);
                viewGroupM3702c.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c1474e.f6595t = textView2;
                textView2.setText(c1474e.f6579d);
                Drawable drawable = c1474e.f6593r;
                if (drawable != null) {
                    c1474e.f6594s.setImageDrawable(drawable);
                } else {
                    c1474e.f6595t.setPadding(c1474e.f6594s.getPaddingLeft(), c1474e.f6594s.getPaddingTop(), c1474e.f6594s.getPaddingRight(), c1474e.f6594s.getPaddingBottom());
                    c1474e.f6594s.setVisibility(8);
                }
            }
        }
        boolean z4 = viewGroup.getVisibility() != 8;
        int i4 = (viewGroupM3702c == null || viewGroupM3702c.getVisibility() == 8) ? 0 : 1;
        boolean z5 = viewGroupM3702c3.getVisibility() != 8;
        if (!z5 && (viewFindViewById = viewGroupM3702c2.findViewById(R.id.textSpacerNoButtons)) != null) {
            viewFindViewById.setVisibility(0);
        }
        if (i4 != 0) {
            NestedScrollView nestedScrollView2 = c1474e.f6592q;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View viewFindViewById9 = c1474e.f6580e != null ? viewGroupM3702c.findViewById(R.id.titleDividerNoCustom) : null;
            if (viewFindViewById9 != null) {
                viewFindViewById9.setVisibility(0);
            }
        } else {
            View viewFindViewById10 = viewGroupM3702c2.findViewById(R.id.textSpacerNoTitle);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c1474e.f6580e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z5 || i4 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i4 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f3780g, alertController$RecycleListView.getPaddingRight(), z5 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f3781h);
            }
        }
        if (!z4) {
            View view2 = c1474e.f6580e;
            if (view2 == null) {
                view2 = c1474e.f6592q;
            }
            if (view2 != null) {
                int i5 = i4 | (z5 ? 2 : 0);
                View viewFindViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View viewFindViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 23) {
                    WeakHashMap weakHashMap = AbstractC0016Q.f14a;
                    if (i6 >= 23) {
                        AbstractC0006G.m37d(view2, i5, 3);
                    }
                    if (viewFindViewById11 != null) {
                        viewGroupM3702c2.removeView(viewFindViewById11);
                    }
                    if (viewFindViewById12 != null) {
                        viewGroupM3702c2.removeView(viewFindViewById12);
                    }
                } else {
                    if (viewFindViewById11 != null && (i5 & 1) == 0) {
                        viewGroupM3702c2.removeView(viewFindViewById11);
                        viewFindViewById11 = null;
                    }
                    if (viewFindViewById12 != null && (i5 & 2) == 0) {
                        viewGroupM3702c2.removeView(viewFindViewById12);
                        viewFindViewById12 = null;
                    }
                    if (viewFindViewById11 != null || viewFindViewById12 != null) {
                        AlertController$RecycleListView alertController$RecycleListView2 = c1474e.f6580e;
                        if (alertController$RecycleListView2 != null) {
                            alertController$RecycleListView2.setOnScrollListener(new C1470a(viewFindViewById11, viewFindViewById12));
                            c1474e.f6580e.post(new RunnableC0123F(c1474e, viewFindViewById11, viewFindViewById12));
                        } else {
                            if (viewFindViewById11 != null) {
                                viewGroupM3702c2.removeView(viewFindViewById11);
                            }
                            if (viewFindViewById12 != null) {
                                viewGroupM3702c2.removeView(viewFindViewById12);
                            }
                        }
                    }
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView3 = c1474e.f6580e;
        if (alertController$RecycleListView3 == null || (listAdapter = c1474e.f6598w) == null) {
            return;
        }
        alertController$RecycleListView3.setAdapter(listAdapter);
        int i7 = c1474e.f6599x;
        if (i7 > -1) {
            alertController$RecycleListView3.setItemChecked(i7, true);
            alertController$RecycleListView3.setSelection(i7);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i3, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6604l.f6592q;
        if (nestedScrollView == null || !nestedScrollView.m2369i(keyEvent)) {
            return super.onKeyDown(i3, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i3, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f6604l.f6592q;
        if (nestedScrollView == null || !nestedScrollView.m2369i(keyEvent)) {
            return super.onKeyUp(i3, keyEvent);
        }
        return true;
    }

    @Override // p091e.AbstractDialogC1460E, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C1474e c1474e = this.f6604l;
        c1474e.f6579d = charSequence;
        TextView textView = c1474e.f6595t;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
