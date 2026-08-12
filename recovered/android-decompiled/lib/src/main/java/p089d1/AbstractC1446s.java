package p089d1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: d1.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1446s extends AbstractC1448u {

    /* JADX INFO: renamed from: a */
    public final Object f6400a = new Object();

    /* JADX INFO: renamed from: b */
    public Executor f6401b;

    /* JADX INFO: renamed from: c */
    public C1428b f6402c;

    /* JADX INFO: renamed from: d */
    public C1442o f6403d;

    /* JADX INFO: renamed from: e */
    public ArrayList f6404e;

    /* JADX INFO: renamed from: j */
    public String mo3555j() {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public String mo3556k() {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m3614l(C1442o c1442o, ArrayList arrayList) {
        if (c1442o == null) {
            throw new NullPointerException("groupRoute must not be null");
        }
        synchronized (this.f6400a) {
            try {
                try {
                    Executor executor = this.f6401b;
                    if (executor != null) {
                        executor.execute(new RunnableC1444q(this, this.f6402c, c1442o, arrayList, 1));
                    } else {
                        this.f6403d = c1442o;
                        this.f6404e = new ArrayList(arrayList);
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo3557m(String str);

    /* JADX INFO: renamed from: n */
    public abstract void mo3558n(String str);

    /* JADX INFO: renamed from: o */
    public abstract void mo3559o(List list);
}
