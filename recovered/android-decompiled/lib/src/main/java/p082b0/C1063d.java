package p082b0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.util.Base64;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import p005B1.AbstractC0099a;
import p019G1.AbstractC0230e;
import p045P0.C0455a;
import p055T.C0546I;
import p055T.C0559W;
import p064W.InterfaceC0636d;
import p064W.InterfaceC0642j;
import p088d0.C1387k;
import p088d0.InterfaceC1389m;
import p092e0.C1512q;
import p099g0.C1574d;
import p101g2.InterfaceC1583d;
import p105h2.AbstractC1676G;
import p105h2.AbstractC1723q;
import p114k0.C1928W;
import p114k0.InterfaceC1965y;
import p138q1.C2173i;
import p138q1.C2174j;
import p145s0.InterfaceC2240m;
import p166y1.InterfaceC2381f;

/* JADX INFO: renamed from: b0.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1063d implements InterfaceC0642j, InterfaceC0636d, InterfaceC1389m, InterfaceC1583d, InterfaceC2381f {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4825g;

    public /* synthetic */ C1063d(int i3) {
        this.f4825g = i3;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m2828c(byte[] bArr, int i3) throws C1574d {
        try {
            return AbstractC0230e.m735m(bArr, i3);
        } catch (C0546I e3) {
            throw new C1574d("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i3 + ")", e3);
        } catch (IOException e4) {
            throw new C1574d(e4);
        }
    }

    @Override // p088d0.InterfaceC1389m
    /* JADX INFO: renamed from: a */
    public void mo2829a() {
    }

    @Override // p101g2.InterfaceC1583d
    public Object apply(Object obj) {
        switch (this.f4825g) {
            case 10:
                C1512q c1512q = (C1512q) obj;
                c1512q.m3806v();
                return AbstractC1676G.m4117n(AbstractC1723q.m4168q(c1512q.f6781O.f8527b, new C1063d(16)));
            case 11:
            case 12:
            case 15:
            default:
                Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cursorRawQuery.moveToNext()) {
                        C2173i c2173iM4761a = C2174j.m4761a();
                        c2173iM4761a.m4760b(cursorRawQuery.getString(1));
                        c2173iM4761a.f9390j = AbstractC0099a.m496b(cursorRawQuery.getInt(2));
                        String string = cursorRawQuery.getString(3);
                        c2173iM4761a.f9389i = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(c2173iM4761a.m4759a());
                        break;
                    }
                    return arrayList;
                } finally {
                    cursorRawQuery.close();
                }
            case 13:
                return ((InterfaceC2240m) obj).mo327c().getClass().getSimpleName();
            case 14:
                return AbstractC1676G.m4117n(AbstractC1723q.m4168q(((InterfaceC1965y) obj).mo3762d().f8527b, new C1063d(16)));
            case 16:
                return Integer.valueOf(((C0559W) obj).f1994c);
            case 17:
                return Long.valueOf(((C0455a) obj).f1521b);
            case 18:
                return Long.valueOf(((C0455a) obj).f1522c);
        }
    }

    @Override // p064W.InterfaceC0636d
    /* JADX INFO: renamed from: b */
    public void mo545b(Object obj) {
        switch (this.f4825g) {
            case 7:
                ((C1387k) obj).m3483a();
                break;
            case 15:
                ((C1928W) obj).f8441b.mo2829a();
                break;
            default:
                ((ExecutorService) obj).shutdown();
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public Constructor m2830d() {
        switch (this.f4825g) {
            case 21:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC2240m.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC2240m.class).getConstructor(null);
        }
    }

    @Override // p064W.InterfaceC0642j
    /* JADX INFO: renamed from: g */
    public void mo214g(Object obj) {
        C1069j c1069j = (C1069j) obj;
        switch (this.f4825g) {
            case 0:
                c1069j.getClass();
                break;
            case 1:
                c1069j.getClass();
                break;
            case 2:
                c1069j.getClass();
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                c1069j.getClass();
                break;
            case 4:
                c1069j.getClass();
                break;
            case 5:
                c1069j.getClass();
                break;
            default:
                c1069j.getClass();
                break;
        }
    }
}
