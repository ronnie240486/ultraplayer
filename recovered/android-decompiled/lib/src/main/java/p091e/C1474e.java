package p091e;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.zuxoplayer.app.R;
import java.lang.ref.WeakReference;
import p083b1.ViewOnClickListenerC1086O;
import p087d.AbstractC1376a;
import p089d1.HandlerC1421V;

/* JADX INFO: renamed from: e.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1474e {

    /* JADX INFO: renamed from: A */
    public final int f6571A;

    /* JADX INFO: renamed from: B */
    public final int f6572B;

    /* JADX INFO: renamed from: C */
    public final boolean f6573C;

    /* JADX INFO: renamed from: D */
    public final HandlerC1421V f6574D;

    /* JADX INFO: renamed from: a */
    public final Context f6576a;

    /* JADX INFO: renamed from: b */
    public final DialogInterfaceC1476g f6577b;

    /* JADX INFO: renamed from: c */
    public final Window f6578c;

    /* JADX INFO: renamed from: d */
    public CharSequence f6579d;

    /* JADX INFO: renamed from: e */
    public AlertController$RecycleListView f6580e;

    /* JADX INFO: renamed from: f */
    public View f6581f;

    /* JADX INFO: renamed from: h */
    public Button f6583h;

    /* JADX INFO: renamed from: i */
    public CharSequence f6584i;

    /* JADX INFO: renamed from: j */
    public Message f6585j;

    /* JADX INFO: renamed from: k */
    public Button f6586k;

    /* JADX INFO: renamed from: l */
    public CharSequence f6587l;

    /* JADX INFO: renamed from: m */
    public Message f6588m;

    /* JADX INFO: renamed from: n */
    public Button f6589n;

    /* JADX INFO: renamed from: o */
    public CharSequence f6590o;

    /* JADX INFO: renamed from: p */
    public Message f6591p;

    /* JADX INFO: renamed from: q */
    public NestedScrollView f6592q;

    /* JADX INFO: renamed from: r */
    public Drawable f6593r;

    /* JADX INFO: renamed from: s */
    public ImageView f6594s;

    /* JADX INFO: renamed from: t */
    public TextView f6595t;

    /* JADX INFO: renamed from: u */
    public TextView f6596u;

    /* JADX INFO: renamed from: v */
    public View f6597v;

    /* JADX INFO: renamed from: w */
    public ListAdapter f6598w;

    /* JADX INFO: renamed from: y */
    public final int f6600y;

    /* JADX INFO: renamed from: z */
    public final int f6601z;

    /* JADX INFO: renamed from: g */
    public boolean f6582g = false;

    /* JADX INFO: renamed from: x */
    public int f6599x = -1;

    /* JADX INFO: renamed from: E */
    public final ViewOnClickListenerC1086O f6575E = new ViewOnClickListenerC1086O(1, this);

    public C1474e(Context context, DialogInterfaceC1476g dialogInterfaceC1476g, Window window) {
        this.f6576a = context;
        this.f6577b = dialogInterfaceC1476g;
        this.f6578c = window;
        HandlerC1421V handlerC1421V = new HandlerC1421V();
        handlerC1421V.f6280b = new WeakReference(dialogInterfaceC1476g);
        this.f6574D = handlerC1421V;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1376a.f6099e, R.attr.alertDialogStyle, 0);
        this.f6600y = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.f6601z = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f6571A = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f6572B = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f6573C = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        dialogInterfaceC1476g.m3674d().mo3658h(1);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3700a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m3700a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static void m3701b(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    /* JADX INFO: renamed from: c */
    public static ViewGroup m3702c(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* JADX INFO: renamed from: d */
    public final void m3703d(int i3, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.f6574D.obtainMessage(i3, onClickListener) : null;
        if (i3 == -3) {
            this.f6590o = charSequence;
            this.f6591p = messageObtainMessage;
        } else if (i3 == -2) {
            this.f6587l = charSequence;
            this.f6588m = messageObtainMessage;
        } else {
            if (i3 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f6584i = charSequence;
            this.f6585j = messageObtainMessage;
        }
    }
}
