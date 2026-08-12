package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p005B1.AbstractC0099a;
import p083b1.RunnableC1075D;
import p138q1.C2173i;
import p138q1.C2174j;
import p138q1.C2179o;
import p162x1.C2360i;
import p162x1.RunnableC2356e;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f5404a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i3 = intent.getExtras().getInt("attemptNumber");
        C2179o.m4763b(context);
        C2173i c2173iM4761a = C2174j.m4761a();
        c2173iM4761a.m4760b(queryParameter);
        c2173iM4761a.f9390j = AbstractC0099a.m496b(iIntValue);
        if (queryParameter2 != null) {
            c2173iM4761a.f9389i = Base64.decode(queryParameter2, 0);
        }
        C2360i c2360i = C2179o.m4762a().f9407d;
        C2174j c2174jM4759a = c2173iM4761a.m4759a();
        RunnableC1075D runnableC1075D = new RunnableC1075D(1);
        c2360i.getClass();
        c2360i.f9910e.execute(new RunnableC2356e(c2360i, c2174jM4759a, i3, runnableC1075D));
    }
}
