package p046P1;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: renamed from: P1.m */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0485m implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1618g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Intent f1619h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1620i;

    public /* synthetic */ DialogInterfaceOnClickListenerC0485m(Intent intent, Object obj, int i3) {
        this.f1618g = i3;
        this.f1619h = intent;
        this.f1620i = obj;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [N1.g, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final void m1203a() {
        switch (this.f1618g) {
            case 0:
                Intent intent = this.f1619h;
                if (intent != null) {
                    ((GoogleApiActivity) this.f1620i).startActivityForResult(intent, 2);
                }
                break;
            default:
                Intent intent2 = this.f1619h;
                if (intent2 != null) {
                    this.f1620i.m1130a(2, intent2);
                }
                break;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        try {
            try {
                m1203a();
            } catch (ActivityNotFoundException e3) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e3);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
