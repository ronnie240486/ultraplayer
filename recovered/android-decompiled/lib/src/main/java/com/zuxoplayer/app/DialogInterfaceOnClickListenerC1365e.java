package com.zuxoplayer.app;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.zuxoplayer.app.e */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1365e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ MainActivity f6076g;

    public DialogInterfaceOnClickListenerC1365e(MainActivity mainActivity) {
        this.f6076g = mainActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        this.f6076g.finish();
    }
}
