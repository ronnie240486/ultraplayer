package p011E;

import android.content.ClipData;
import android.content.ClipDescription;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0858A;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p000A.AbstractC0016Q;
import p000A.C0031d;
import p000A.C0035f;
import p000A.InterfaceC0033e;
import p019G1.AbstractC0230e;
import p045P0.AbstractC0462h;
import p045P0.C0455a;
import p053S0.C0536b;
import p055T.AbstractC0547J;
import p055T.C0539B;
import p055T.C0542E;
import p055T.C0544G;
import p055T.C0548K;
import p055T.C0559W;
import p055T.C0564a0;
import p055T.C0583o;
import p055T.InterfaceC0551N;
import p061V.C0615c;
import p064W.AbstractC0632A;
import p064W.C0651s;
import p064W.InterfaceC0636d;
import p064W.InterfaceC0642j;
import p067X.InterfaceC0686r;
import p077a0.C0829h;
import p077a0.SurfaceHolderCallbackC0850z;
import p082b0.C1060a;
import p082b0.C1063d;
import p082b0.C1069j;
import p089d1.C1427a0;
import p089d1.C1447t;
import p089d1.ServiceConnectionC1425Z;
import p099g0.C1577g;
import p103h0.AbstractC1616y;
import p103h0.C1606o;
import p103h0.InterfaceC1615x;
import p105h2.AbstractC1676G;
import p105h2.C1673D;
import p105h2.C1692X;
import p113k.C1895u;
import p114k0.C1911E;
import p114k0.C1958r;
import p114k0.C1963w;
import p123m2.C2008b;
import p125n0.C2030g;
import p125n0.C2033j;
import p125n0.InterfaceC2037n;
import p130o1.C2080b;
import p131o2.C2084d;
import p131o2.C2085e;
import p134p1.C2096i;
import p134p1.C2100m;
import p138q1.C2174j;
import p145s0.AbstractC2229b;
import p145s0.C2245r;
import p145s0.InterfaceC2226E;
import p145s0.InterfaceC2233f;
import p154u1.C2297a;
import p154u1.EnumC2299c;
import p162x1.C2360i;
import p162x1.C2361j;
import p166y1.C2383h;
import p166y1.InterfaceC2378c;
import p166y1.InterfaceC2379d;
import p169z1.InterfaceC2390b;

/* JADX INFO: renamed from: E.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0111d implements InterfaceC0636d, InterfaceC0642j, InterfaceC0686r, InterfaceC1615x, InterfaceC2037n, InterfaceC2233f, InterfaceC2390b {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f147g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f148h;

    public /* synthetic */ C0111d(int i3, Object obj) {
        this.f147g = i3;
        this.f148h = obj;
    }

    @Override // p103h0.InterfaceC1615x
    /* JADX INFO: renamed from: a */
    public int mo544a(Object obj) {
        C1606o c1606o = (C1606o) obj;
        c1606o.getClass();
        C0583o c0583o = (C0583o) this.f148h;
        String str = c0583o.f2154n;
        String str2 = c1606o.f7253b;
        return ((str2.equals(str) || str2.equals(AbstractC1616y.m3982b(c0583o))) && c1606o.m3939c(c0583o, false)) ? 1 : 0;
    }

    @Override // p064W.InterfaceC0636d
    /* JADX INFO: renamed from: b */
    public void mo545b(Object obj) {
        ((C1673D) this.f148h).m4102a((C0455a) obj);
    }

    @Override // p067X.InterfaceC0686r
    /* JADX INFO: renamed from: c */
    public void mo546c(long j3, C0651s c0651s) {
        AbstractC2229b.m4809d(j3, c0651s, (InterfaceC2226E[]) ((C0858A) this.f148h).f3640i);
    }

    @Override // p145s0.InterfaceC2233f
    /* JADX INFO: renamed from: d */
    public long mo547d(long j3) {
        C2245r c2245r = (C2245r) this.f148h;
        return AbstractC0632A.m1591j((j3 * ((long) c2245r.f9649e)) / 1000000, 0L, c2245r.f9654j - 1);
    }

    @Override // p169z1.InterfaceC2390b
    /* JADX INFO: renamed from: e */
    public Object mo548e() {
        Object obj = this.f148h;
        switch (this.f147g) {
            case 24:
                C2383h c2383h = (C2383h) ((InterfaceC2378c) obj);
                c2383h.getClass();
                int i3 = C2297a.f9802e;
                C0536b c0536b = new C0536b();
                c0536b.f1867g = null;
                c0536b.f1868h = new ArrayList();
                c0536b.f1869i = null;
                c0536b.f1870j = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseM4970a = c2383h.m4970a();
                sQLiteDatabaseM4970a.beginTransaction();
                try {
                    C2297a c2297a = (C2297a) C2383h.m4969g(sQLiteDatabaseM4970a.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C1911E(c2383h, map, c0536b, 4));
                    sQLiteDatabaseM4970a.setTransactionSuccessful();
                    return c2297a;
                } finally {
                    sQLiteDatabaseM4970a.endTransaction();
                }
            case 25:
                C2383h c2383h2 = (C2383h) ((InterfaceC2379d) obj);
                long jM969D = c2383h2.f9971h.m969D() - c2383h2.f9973j.f9960d;
                SQLiteDatabase sQLiteDatabaseM4970a2 = c2383h2.m4970a();
                sQLiteDatabaseM4970a2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jM969D)};
                    Cursor cursorRawQuery = sQLiteDatabaseM4970a2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            c2383h2.m4972d(cursorRawQuery.getInt(0), EnumC2299c.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseM4970a2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseM4970a2.setTransactionSuccessful();
                    sQLiteDatabaseM4970a2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseM4970a2.endTransaction();
                    throw th2;
                }
            case 26:
                C2383h c2383h3 = (C2383h) ((C2360i) obj).f9914i;
                SQLiteDatabase sQLiteDatabaseM4970a3 = c2383h3.m4970a();
                sQLiteDatabaseM4970a3.beginTransaction();
                try {
                    sQLiteDatabaseM4970a3.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseM4970a3.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c2383h3.f9971h.m969D()).execute();
                    sQLiteDatabaseM4970a3.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseM4970a3.endTransaction();
                }
            default:
                C2361j c2361j = (C2361j) obj;
                Iterator it = ((Iterable) ((C2383h) c2361j.f9916b).m4971c(new C1063d(23))).iterator();
                while (it.hasNext()) {
                    c2361j.f9917c.m4948a((C2174j) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // p125n0.InterfaceC2037n
    /* JADX INFO: renamed from: f */
    public C1692X mo549f(int i3, C0559W c0559w, int[] iArr) {
        C1673D c1673dM4116m = AbstractC1676G.m4116m();
        int i4 = 0;
        while (i4 < c0559w.f1992a) {
            int i5 = i3;
            C0559W c0559w2 = c0559w;
            c1673dM4116m.m4102a(new C2030g(i5, c0559w2, i4, (C2033j) this.f148h, iArr[i4]));
            i4++;
            i3 = i5;
            c0559w = c0559w2;
        }
        return c1673dM4116m.m4112f();
    }

    @Override // p064W.InterfaceC0642j
    /* JADX INFO: renamed from: g */
    public void mo214g(Object obj) {
        switch (this.f147g) {
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                ((InterfaceC0551N) obj).mo1391r((C0548K) this.f148h);
                break;
            case 4:
                ((InterfaceC0551N) obj).mo1393u((C0539B) this.f148h, 2);
                break;
            case 5:
            case 12:
            default:
                ((C1069j) obj).getClass();
                break;
            case 6:
                ((InterfaceC0551N) obj).mo1383f((C0542E) this.f148h);
                break;
            case 7:
                ((InterfaceC0551N) obj).mo1385i((C0564a0) this.f148h);
                break;
            case 8:
                ((InterfaceC0551N) obj).mo1384h((C0615c) this.f148h);
                break;
            case 9:
                ((InterfaceC0551N) obj).mo1383f(((SurfaceHolderCallbackC0850z) this.f148h).f3610g.f3219M);
                break;
            case 10:
                ((InterfaceC0551N) obj).mo1373E((C0544G) this.f148h);
                break;
            case 11:
                ((InterfaceC0551N) obj).mo1374F((List) this.f148h);
                break;
            case 13:
                ((C1069j) obj).f4865n = (AbstractC0547J) this.f148h;
                break;
            case 14:
                C1069j c1069j = (C1069j) obj;
                int i3 = c1069j.f4875x;
                C0829h c0829h = (C0829h) this.f148h;
                c1069j.f4875x = i3 + c0829h.f3510g;
                c1069j.f4876y += c0829h.f3508e;
                break;
            case 15:
                C1069j c1069j2 = (C1069j) obj;
                c1069j2.getClass();
                c1069j2.f4873v = ((C1963w) this.f148h).f8584a;
                break;
        }
    }

    /* JADX INFO: renamed from: h */
    public C1577g m550h(C0858A c0858a) throws IOException {
        C2080b c2080b = (C2080b) this.f148h;
        URL url = (URL) c0858a.f3639h;
        AbstractC0230e.m734l("CctTransportBackend", "Making request to: %s", url);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(c2080b.f9041g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.3 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) c0858a.f3641j;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    C1447t c1447t = c2080b.f9035a;
                    C2096i c2096i = (C2096i) c0858a.f3640i;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    C2084d c2084d = (C2084d) c1447t.f6406h;
                    C2085e c2085e = new C2085e(bufferedWriter, c2084d.f9049a, c2084d.f9050b, c2084d.f9051c, c2084d.f9052d);
                    c2085e.m4646e(c2096i);
                    c2085e.m4648g();
                    c2085e.f9054b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Log.i("TransportRuntime.".concat("CctTransportBackend"), AbstractC0462h.m1165e(responseCode, "Status Code: "));
                    Log.i("TransportRuntime.".concat("CctTransportBackend"), "Content-Type: " + httpURLConnection.getHeaderField("Content-Type"));
                    Log.i("TransportRuntime.".concat("CctTransportBackend"), "Content-Encoding: " + httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new C1577g(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new C1577g(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            C1577g c1577g = new C1577g(responseCode, null, C2100m.m4649a(new BufferedReader(new InputStreamReader(gZIPInputStream))).f9130a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return c1577g;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (ConnectException e3) {
            e = e3;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't open connection, returning with 500", e);
            return new C1577g(500, null, 0L);
        } catch (UnknownHostException e4) {
            e = e4;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't open connection, returning with 500", e);
            return new C1577g(500, null, 0L);
        } catch (IOException e5) {
            e = e5;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't encode request, returning with 400", e);
            return new C1577g(400, null, 0L);
        } catch (C2008b e6) {
            e = e6;
            Log.e("TransportRuntime.".concat("CctTransportBackend"), "Couldn't encode request, returning with 400", e);
            return new C1577g(400, null, 0L);
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m551i(C0031d c0031d, int i3, Bundle bundle) {
        InterfaceC0033e c0031d2;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 25 && (i3 & 1) != 0) {
            try {
                ((InterfaceC0115h) c0031d.f38h).mo552e();
                Parcelable parcelable = (Parcelable) ((InterfaceC0115h) c0031d.f38h).mo555i();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e3) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e3);
                return false;
            }
        }
        ClipDescription clipDescriptionMo554h = ((InterfaceC0115h) c0031d.f38h).mo554h();
        InterfaceC0115h interfaceC0115h = (InterfaceC0115h) c0031d.f38h;
        ClipData clipData = new ClipData(clipDescriptionMo554h, new ClipData.Item(interfaceC0115h.mo556j()));
        if (i4 >= 31) {
            c0031d2 = new C0031d(clipData, 2);
        } else {
            C0035f c0035f = new C0035f();
            c0035f.f46h = clipData;
            c0035f.f47i = 2;
            c0031d2 = c0035f;
        }
        c0031d2.mo161i(interfaceC0115h.mo553f());
        c0031d2.mo160h(bundle);
        return AbstractC0016Q.m84f((C1895u) this.f148h, c0031d2.mo157e()) == null;
    }

    public /* synthetic */ C0111d(C1060a c1060a, Object obj, int i3) {
        this.f147g = i3;
        this.f148h = obj;
    }

    public /* synthetic */ C0111d(C1060a c1060a, Object obj, long j3) {
        this.f147g = 16;
        this.f148h = obj;
    }

    public /* synthetic */ C0111d(C1060a c1060a, C1958r c1958r, C1963w c1963w, IOException iOException, boolean z3) {
        this.f147g = 15;
        this.f148h = c1963w;
    }

    public /* synthetic */ C0111d(C1427a0 c1427a0, ServiceConnectionC1425Z serviceConnectionC1425Z) {
        this.f147g = 18;
        this.f148h = c1427a0;
    }
}
