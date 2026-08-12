package p046P1;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1152a;
import p034L1.C0346a;
import p037M1.InterfaceC0394g;
import p045P0.AbstractC0462h;
import p075Z1.HandlerC0784e;

/* JADX INFO: renamed from: P1.t */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerC0492t extends HandlerC0784e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1152a f1640a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0492t(AbstractC1152a abstractC1152a, Looper looper) {
        super(looper, 1);
        this.f1640a = abstractC1152a;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0189  */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        if (this.f1640a.f5536w.get() != message.arg1) {
            int i3 = message.what;
            if (i3 == 2 || i3 == 1 || i3 == 7) {
                AbstractC0488p abstractC0488p = (AbstractC0488p) message.obj;
                abstractC0488p.getClass();
                abstractC0488p.m1207d();
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 != 1 && i4 != 7) {
            if (i4 == 4) {
                this.f1640a.getClass();
            } else if (i4 == 5) {
            }
            if (!this.f1640a.mo1066a()) {
                AbstractC0488p abstractC0488p2 = (AbstractC0488p) message.obj;
                abstractC0488p2.getClass();
                abstractC0488p2.m1207d();
                return;
            }
        } else if (!this.f1640a.mo1066a()) {
            AbstractC0488p abstractC0488p3 = (AbstractC0488p) message.obj;
            abstractC0488p3.getClass();
            abstractC0488p3.m1207d();
            return;
        }
        int i5 = message.what;
        if (i5 == 4) {
            AbstractC1152a abstractC1152a = this.f1640a;
            abstractC1152a.f5533t = new C0346a(message.arg2);
            if (!abstractC1152a.f5534u && !TextUtils.isEmpty(abstractC1152a.mo862s()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(abstractC1152a.mo862s());
                    AbstractC1152a abstractC1152a2 = this.f1640a;
                    if (!abstractC1152a2.f5534u) {
                        abstractC1152a2.m3089A(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            AbstractC1152a abstractC1152a3 = this.f1640a;
            C0346a c0346a = abstractC1152a3.f5533t;
            if (c0346a == null) {
                c0346a = new C0346a(8);
            }
            abstractC1152a3.f5523j.mo1149a(c0346a);
            this.f1640a.mo870v(c0346a);
            return;
        }
        if (i5 == 5) {
            AbstractC1152a abstractC1152a4 = this.f1640a;
            C0346a c0346a2 = abstractC1152a4.f5533t;
            if (c0346a2 == null) {
                c0346a2 = new C0346a(8);
            }
            abstractC1152a4.f5523j.mo1149a(c0346a2);
            this.f1640a.mo870v(c0346a2);
            return;
        }
        if (i5 == 3) {
            Object obj = message.obj;
            C0346a c0346a3 = new C0346a(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f1640a.f5523j.mo1149a(c0346a3);
            this.f1640a.mo870v(c0346a3);
            return;
        }
        if (i5 == 6) {
            this.f1640a.m3089A(5, null);
            C0480h c0480h = this.f1640a.f5528o;
            if (c0480h != null) {
                ((InterfaceC0394g) c0480h.f1607a).mo1080P(message.arg2);
            }
            this.f1640a.getClass();
            System.currentTimeMillis();
            AbstractC1152a.m3088z(this.f1640a, 5, 1, null);
            return;
        }
        if (i5 == 2 && !this.f1640a.mo1068c()) {
            AbstractC0488p abstractC0488p4 = (AbstractC0488p) message.obj;
            abstractC0488p4.getClass();
            abstractC0488p4.m1207d();
            return;
        }
        int i6 = message.what;
        if (i6 != 2 && i6 != 1 && i6 != 7) {
            Log.wtf("GmsClient", AbstractC0462h.m1165e(i6, "Don't know how to handle message: "), new Exception());
            return;
        }
        AbstractC0488p abstractC0488p5 = (AbstractC0488p) message.obj;
        synchronized (abstractC0488p5) {
            try {
                bool = abstractC0488p5.f1630a;
                if (abstractC0488p5.f1631b) {
                    Log.w("GmsClient", "Callback proxy " + abstractC0488p5.toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            AbstractC1152a abstractC1152a5 = abstractC0488p5.f1635f;
            int i7 = abstractC0488p5.f1633d;
            if (i7 != 0) {
                abstractC1152a5.m3089A(1, null);
                Bundle bundle = abstractC0488p5.f1634e;
                abstractC0488p5.mo1204a(new C0346a(i7, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
            } else if (!abstractC0488p5.mo1205b()) {
                abstractC1152a5.m3089A(1, null);
                abstractC0488p5.mo1204a(new C0346a(8, null));
            }
        }
        synchronized (abstractC0488p5) {
            abstractC0488p5.f1631b = true;
        }
        abstractC0488p5.m1207d();
    }
}
