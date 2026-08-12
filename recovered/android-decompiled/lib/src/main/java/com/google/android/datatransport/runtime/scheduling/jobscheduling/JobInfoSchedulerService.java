package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import p005B1.AbstractC0099a;
import p064W.RunnableC0647o;
import p138q1.C2173i;
import p138q1.C2174j;
import p138q1.C2179o;
import p162x1.C2360i;
import p162x1.RunnableC2356e;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f5405g = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i3 = jobParameters.getExtras().getInt("priority");
        int i4 = jobParameters.getExtras().getInt("attemptNumber");
        C2179o.m4763b(getApplicationContext());
        C2173i c2173iM4761a = C2174j.m4761a();
        c2173iM4761a.m4760b(string);
        c2173iM4761a.f9390j = AbstractC0099a.m496b(i3);
        if (string2 != null) {
            c2173iM4761a.f9389i = Base64.decode(string2, 0);
        }
        C2360i c2360i = C2179o.m4762a().f9407d;
        C2174j c2174jM4759a = c2173iM4761a.m4759a();
        RunnableC0647o runnableC0647o = new RunnableC0647o(this, 18, jobParameters);
        c2360i.getClass();
        c2360i.f9910e.execute(new RunnableC2356e(c2360i, c2174jM4759a, i4, runnableC0647o));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
