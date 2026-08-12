package p040N1;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.cast.AbstractC1303m;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p010D1.C0107a;
import p013E1.C0120C;
import p013E1.RunnableC0121D;
import p034L1.C0346a;
import p037M1.InterfaceC0394g;
import p037M1.InterfaceC0395h;
import p046P1.AbstractC0491s;
import p046P1.C0475c;
import p046P1.C0486n;
import p075Z1.AbstractC0781b;
import p075Z1.HandlerC0784e;
import p079a2.AbstractBinderC0852a;
import p090d2.AbstractC1455b;
import p094e2.C1523a;
import p094e2.C1525c;
import p094e2.C1527e;

/* JADX INFO: renamed from: N1.A */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0416A extends AbstractBinderC0852a implements InterfaceC0394g, InterfaceC0395h {

    /* JADX INFO: renamed from: j */
    public static final C0120C f1417j = AbstractC1455b.f6425a;

    /* JADX INFO: renamed from: c */
    public final Context f1418c;

    /* JADX INFO: renamed from: d */
    public final HandlerC0784e f1419d;

    /* JADX INFO: renamed from: e */
    public final C0120C f1420e;

    /* JADX INFO: renamed from: f */
    public final Set f1421f;

    /* JADX INFO: renamed from: g */
    public final C0475c f1422g;

    /* JADX INFO: renamed from: h */
    public C1523a f1423h;

    /* JADX INFO: renamed from: i */
    public C0437r f1424i;

    public BinderC0416A(Context context, HandlerC0784e handlerC0784e, C0475c c0475c) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f1418c = context;
        this.f1419d = handlerC0784e;
        this.f1422g = c0475c;
        this.f1421f = (Set) c0475c.f1568a;
        this.f1420e = f1417j;
    }

    @Override // p037M1.InterfaceC0394g
    /* JADX INFO: renamed from: P */
    public final void mo1080P(int i3) {
        C0437r c0437r = this.f1424i;
        C0435p c0435p = (C0435p) ((C0424e) c0437r.f1488f).f1454p.get((C0421b) c0437r.f1485c);
        if (c0435p != null) {
            if (c0435p.f1476j) {
                c0435p.m1147n(new C0346a(17));
            } else {
                c0435p.mo1080P(i3);
            }
        }
    }

    @Override // p037M1.InterfaceC0394g
    /* JADX INFO: renamed from: e0 */
    public final void mo1081e0() {
        GoogleSignInAccount googleSignInAccountM3069e;
        boolean z3 = false;
        C1523a c1523a = this.f1423h;
        c1523a.getClass();
        try {
            c1523a.f6876A.getClass();
            Account account = new Account("<<default account>>", "com.google");
            if ("<<default account>>".equals(account.name)) {
                Context context = c1523a.f5516c;
                ReentrantLock reentrantLock = C0107a.f142c;
                AbstractC0491s.m1213e(context);
                ReentrantLock reentrantLock2 = C0107a.f142c;
                reentrantLock2.lock();
                try {
                    if (C0107a.f143d == null) {
                        C0107a.f143d = new C0107a(context.getApplicationContext());
                    }
                    C0107a c0107a = C0107a.f143d;
                    reentrantLock2.unlock();
                    String strM539a = c0107a.m539a("defaultGoogleSignInAccount");
                    if (!TextUtils.isEmpty(strM539a)) {
                        String strM539a2 = c0107a.m539a("googleSignInAccount:" + strM539a);
                        if (strM539a2 != null) {
                            try {
                                googleSignInAccountM3069e = GoogleSignInAccount.m3069e(strM539a2);
                            } catch (JSONException unused) {
                                googleSignInAccountM3069e = null;
                            }
                        }
                    }
                    googleSignInAccountM3069e = null;
                } catch (Throwable th) {
                    reentrantLock2.unlock();
                    throw th;
                }
            } else {
                googleSignInAccountM3069e = null;
            }
            Integer num = c1523a.f6878C;
            AbstractC0491s.m1213e(num);
            C0486n c0486n = new C0486n(2, account, num.intValue(), googleSignInAccountM3069e);
            C1525c c1525c = (C1525c) c1523a.m3090r();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(c1525c.f3190d);
            int i3 = AbstractC0781b.f3191a;
            parcelObtain.writeInt(1);
            int iM3305a0 = AbstractC1303m.m3305a0(parcelObtain, 20293);
            AbstractC1303m.m3311d0(parcelObtain, 1, 4);
            parcelObtain.writeInt(1);
            AbstractC1303m.m3298U(parcelObtain, 2, c0486n, 0);
            AbstractC1303m.m3309c0(parcelObtain, iM3305a0);
            parcelObtain.writeStrongBinder(this);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                c1525c.f3189c.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e3) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f1419d.post(new RunnableC0121D(this, new C1527e(1, new C0346a(8, null), null), 5, z3));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e3);
            }
        }
    }

    @Override // p037M1.InterfaceC0395h
    /* JADX INFO: renamed from: q0 */
    public final void mo1082q0(C0346a c0346a) {
        this.f1424i.m1151c(c0346a);
    }
}
