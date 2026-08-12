package p091e;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: e.F */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC1461F implements View.OnClickListener {

    /* JADX INFO: renamed from: g */
    public final View f6500g;

    /* JADX INFO: renamed from: h */
    public final String f6501h;

    /* JADX INFO: renamed from: i */
    public Method f6502i;

    /* JADX INFO: renamed from: j */
    public Context f6503j;

    public ViewOnClickListenerC1461F(View view, String str) {
        this.f6500g = view;
        this.f6501h = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f6502i != null) {
            break;
        }
        View view2 = this.f6500g;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f6501h;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f6502i = method;
                    this.f6503j = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f6502i.invoke(this.f6503j, view);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException("Could not execute method for android:onClick", e4);
        }
    }
}
