package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import p089d1.C1447t;
import p096f1.AbstractC1549d;
import p096f1.ExecutorC1547b;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        File codeCacheDir;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC1549d.m3867s(context, new ExecutorC1547b(0), new C1447t(7, this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                C1447t c1447t = new C1447t(7, this);
                try {
                    AbstractC1549d.m3853e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    c1447t.mo3623k(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e3) {
                    c1447t.mo3623k(7, e3);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            C1447t c1447t2 = new C1447t(7, this);
            if (Build.VERSION.SDK_INT < 24) {
                c1447t2.mo3623k(13, null);
                return;
            } else {
                Process.sendSignal(Process.myPid(), 10);
                c1447t2.mo3623k(12, null);
                return;
            }
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        C1447t c1447t3 = new C1447t(7, this);
        if (!"DROP_SHADER_CACHE".equals(string2)) {
            c1447t3.mo3623k(16, null);
            return;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            codeCacheDir = context.createDeviceProtectedStorageContext().getCodeCacheDir();
        } else {
            codeCacheDir = i3 >= 23 ? context.getCodeCacheDir() : context.getCacheDir();
        }
        if (AbstractC1549d.m3851c(codeCacheDir)) {
            c1447t3.mo3623k(14, null);
        } else {
            c1447t3.mo3623k(15, null);
        }
    }
}
