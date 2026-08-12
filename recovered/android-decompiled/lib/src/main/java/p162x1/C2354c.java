package p162x1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import p005B1.AbstractC0099a;
import p019G1.AbstractC0230e;
import p126n1.EnumC2048c;
import p138q1.C2174j;
import p166y1.C2383h;
import p166y1.InterfaceC2379d;

/* JADX INFO: renamed from: x1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2354c {

    /* JADX INFO: renamed from: a */
    public final Context f9885a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2379d f9886b;

    /* JADX INFO: renamed from: c */
    public final C2352a f9887c;

    public C2354c(Context context, InterfaceC2379d interfaceC2379d, C2352a c2352a) {
        this.f9885a = context;
        this.f9886b = interfaceC2379d;
        this.f9887c = c2352a;
    }

    /* JADX INFO: renamed from: a */
    public final void m4948a(C2174j c2174j, int i3, boolean z3) {
        char c;
        boolean z4;
        Context context = this.f9885a;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(c2174j.f9391a.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        EnumC2048c enumC2048c = c2174j.f9393c;
        adler32.update(byteBufferAllocate.putInt(AbstractC0099a.m495a(enumC2048c)).array());
        byte[] bArr = c2174j.f9392b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z3) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    c = 4;
                    break;
                }
                JobInfo next = it.next();
                c = 4;
                int i4 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i4 < i3) {
                        break;
                    }
                    AbstractC0230e.m734l("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", c2174j);
                    return;
                }
            }
        } else {
            c = 4;
            break;
        }
        SQLiteDatabase sQLiteDatabaseM4970a = ((C2383h) this.f9886b).m4970a();
        String strValueOf = String.valueOf(AbstractC0099a.m495a(enumC2048c));
        String str = c2174j.f9391a;
        Cursor cursorRawQuery = sQLiteDatabaseM4970a.rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, strValueOf});
        try {
            long jValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            Long l3 = jValueOf;
            long jLongValue = l3.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            C2352a c2352a = this.f9887c;
            builder.setMinimumLatency(c2352a.m4947a(enumC2048c, jLongValue, i3));
            Set set = ((C2353b) c2352a.f9881b.get(enumC2048c)).f9884c;
            if (set.contains(EnumC2355d.f9888g)) {
                builder.setRequiredNetworkType(2);
                z4 = true;
            } else {
                z4 = true;
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(EnumC2355d.f9890i)) {
                builder.setRequiresCharging(z4);
            }
            if (set.contains(EnumC2355d.f9889h)) {
                builder.setRequiresDeviceIdle(z4);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i3);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", AbstractC0099a.m495a(enumC2048c));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Integer numValueOf = Integer.valueOf(value);
            Long lValueOf = Long.valueOf(c2352a.m4947a(enumC2048c, jLongValue, i3));
            Integer numValueOf2 = Integer.valueOf(i3);
            Object[] objArr = new Object[5];
            objArr[0] = c2174j;
            objArr[1] = numValueOf;
            objArr[2] = lValueOf;
            objArr[3] = l3;
            objArr[c] = numValueOf2;
            Log.d("TransportRuntime.".concat("JobInfoScheduler"), String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }
}
