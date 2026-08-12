package p091e;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import p110j.DialogInterfaceOnKeyListenerC1773n;

/* JADX INFO: renamed from: e.f */
/* JADX INFO: loaded from: classes.dex */
public class C1475f {

    /* JADX INFO: renamed from: a */
    public final C1472c f6602a;

    /* JADX INFO: renamed from: b */
    public final int f6603b;

    public C1475f(Context context) {
        this(context, DialogInterfaceC1476g.m3704h(context, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.widget.ListAdapter] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    public DialogInterfaceC1476g create() {
        C1472c c1472c = this.f6602a;
        DialogInterfaceC1476g dialogInterfaceC1476g = new DialogInterfaceC1476g(c1472c.f6556a, this.f6603b);
        View view = c1472c.f6560e;
        C1474e c1474e = dialogInterfaceC1476g.f6604l;
        if (view != null) {
            c1474e.f6597v = view;
        } else {
            CharSequence charSequence = c1472c.f6559d;
            if (charSequence != null) {
                c1474e.f6579d = charSequence;
                TextView textView = c1474e.f6595t;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c1472c.f6558c;
            if (drawable != null) {
                c1474e.f6593r = drawable;
                ImageView imageView = c1474e.f6594s;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c1474e.f6594s.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = c1472c.f6561f;
        if (charSequence2 != null) {
            c1474e.m3703d(-1, charSequence2, c1472c.f6562g);
        }
        CharSequence charSequence3 = c1472c.f6563h;
        if (charSequence3 != null) {
            c1474e.m3703d(-2, charSequence3, c1472c.f6564i);
        }
        if (c1472c.f6566k != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c1472c.f6557b.inflate(c1474e.f6601z, (ViewGroup) null);
            int i3 = c1472c.f6569n ? c1474e.f6571A : c1474e.f6572B;
            Object obj = c1472c.f6566k;
            ?? c1473d = obj;
            if (obj == null) {
                c1473d = new C1473d(c1472c.f6556a, i3, R.id.text1, null);
            }
            c1474e.f6598w = c1473d;
            c1474e.f6599x = c1472c.f6570o;
            if (c1472c.f6567l != null) {
                alertController$RecycleListView.setOnItemClickListener(new C1471b(c1472c, c1474e));
            }
            if (c1472c.f6569n) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c1474e.f6580e = alertController$RecycleListView;
        }
        View view2 = c1472c.f6568m;
        if (view2 != null) {
            c1474e.f6581f = view2;
            c1474e.f6582g = false;
        }
        dialogInterfaceC1476g.setCancelable(true);
        dialogInterfaceC1476g.setCanceledOnTouchOutside(true);
        dialogInterfaceC1476g.setOnCancelListener(null);
        dialogInterfaceC1476g.setOnDismissListener(null);
        DialogInterfaceOnKeyListenerC1773n dialogInterfaceOnKeyListenerC1773n = c1472c.f6565j;
        if (dialogInterfaceOnKeyListenerC1773n != null) {
            dialogInterfaceC1476g.setOnKeyListener(dialogInterfaceOnKeyListenerC1773n);
        }
        return dialogInterfaceC1476g;
    }

    public Context getContext() {
        return this.f6602a.f6556a;
    }

    public C1475f setNegativeButton(int i3, DialogInterface.OnClickListener onClickListener) {
        C1472c c1472c = this.f6602a;
        c1472c.f6563h = c1472c.f6556a.getText(i3);
        c1472c.f6564i = onClickListener;
        return this;
    }

    public C1475f setPositiveButton(int i3, DialogInterface.OnClickListener onClickListener) {
        C1472c c1472c = this.f6602a;
        c1472c.f6561f = c1472c.f6556a.getText(i3);
        c1472c.f6562g = onClickListener;
        return this;
    }

    public C1475f setTitle(CharSequence charSequence) {
        this.f6602a.f6559d = charSequence;
        return this;
    }

    public C1475f setView(View view) {
        this.f6602a.f6568m = view;
        return this;
    }

    public C1475f(Context context, int i3) {
        this.f6602a = new C1472c(new ContextThemeWrapper(context, DialogInterfaceC1476g.m3704h(context, i3)));
        this.f6603b = i3;
    }
}
