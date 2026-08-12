package p070Y;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import p009D0.C0106b;
import p045P0.AbstractC0462h;
import p064W.AbstractC0632A;
import p064W.AbstractC0646n;
import p105h2.C1700c0;
import p109i2.AbstractC1754b;

/* JADX INFO: renamed from: Y.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0719p extends AbstractC0706c {

    /* JADX INFO: renamed from: k */
    public final boolean f2755k;

    /* JADX INFO: renamed from: l */
    public final int f2756l;

    /* JADX INFO: renamed from: m */
    public final int f2757m;

    /* JADX INFO: renamed from: n */
    public final String f2758n;

    /* JADX INFO: renamed from: o */
    public final C0106b f2759o;

    /* JADX INFO: renamed from: p */
    public final C0106b f2760p;

    /* JADX INFO: renamed from: q */
    public C0715l f2761q;

    /* JADX INFO: renamed from: r */
    public HttpURLConnection f2762r;

    /* JADX INFO: renamed from: s */
    public InputStream f2763s;

    /* JADX INFO: renamed from: t */
    public boolean f2764t;

    /* JADX INFO: renamed from: u */
    public int f2765u;

    /* JADX INFO: renamed from: v */
    public long f2766v;

    /* JADX INFO: renamed from: w */
    public long f2767w;

    public C0719p(String str, int i3, int i4, boolean z3, C0106b c0106b) {
        super(true);
        this.f2758n = str;
        this.f2756l = i3;
        this.f2757m = i4;
        this.f2755k = z3;
        this.f2759o = c0106b;
        this.f2760p = new C0106b(17);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x010a  */
    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: a */
    public final long mo1827a(C0715l c0715l) throws C0723t {
        HttpURLConnection httpURLConnection;
        boolean z3;
        long j3;
        HttpURLConnection httpURLConnection2;
        this.f2761q = c0715l;
        this.f2767w = 0L;
        this.f2766v = 0L;
        m1832l();
        try {
            HttpURLConnection httpURLConnectionM1841u = m1841u(c0715l);
            this.f2762r = httpURLConnectionM1841u;
            this.f2765u = httpURLConnectionM1841u.getResponseCode();
            httpURLConnectionM1841u.getResponseMessage();
            int i3 = this.f2765u;
            long jMax = -1;
            long j4 = c0715l.f2739e;
            long j5 = c0715l.f2740f;
            if (i3 < 200 || i3 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionM1841u.getHeaderFields();
                if (this.f2765u == 416) {
                    httpURLConnection = httpURLConnectionM1841u;
                    String headerField = httpURLConnection.getHeaderField("Content-Range");
                    Pattern pattern = AbstractC0726w.f2775a;
                    if (TextUtils.isEmpty(headerField)) {
                        j3 = -1;
                        z3 = true;
                    } else {
                        Matcher matcher = AbstractC0726w.f2776b.matcher(headerField);
                        z3 = true;
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            j3 = Long.parseLong(strGroup);
                        } else {
                            j3 = -1;
                        }
                    }
                    if (j4 == j3) {
                        this.f2764t = z3;
                        m1834p(c0715l);
                        if (j5 != -1) {
                            return j5;
                        }
                        return 0L;
                    }
                } else {
                    httpURLConnection = httpURLConnectionM1841u;
                }
                InputStream errorStream = httpURLConnection.getErrorStream();
                try {
                    if (errorStream != null) {
                        AbstractC1754b.m4210b(errorStream);
                    } else {
                        int i4 = AbstractC0632A.f2454a;
                    }
                } catch (IOException unused) {
                    int i5 = AbstractC0632A.f2454a;
                }
                m1839s();
                throw new C0725v(this.f2765u, this.f2765u == 416 ? new C0712i(2008) : null, headerFields);
            }
            httpURLConnectionM1841u.getContentType();
            if (this.f2765u != 200 || j4 == 0) {
                j4 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionM1841u.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase) {
                httpURLConnection2 = httpURLConnectionM1841u;
                this.f2766v = j5;
            } else if (j5 != -1) {
                this.f2766v = j5;
                httpURLConnection2 = httpURLConnectionM1841u;
            } else {
                String headerField2 = httpURLConnectionM1841u.getHeaderField("Content-Length");
                String headerField3 = httpURLConnectionM1841u.getHeaderField("Content-Range");
                Pattern pattern2 = AbstractC0726w.f2775a;
                if (!TextUtils.isEmpty(headerField2)) {
                    try {
                        jMax = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        AbstractC0646n.m1635m("HttpUtil", "Unexpected Content-Length [" + headerField2 + "]");
                    }
                }
                if (TextUtils.isEmpty(headerField3)) {
                    httpURLConnection2 = httpURLConnectionM1841u;
                } else {
                    Matcher matcher2 = AbstractC0726w.f2775a.matcher(headerField3);
                    if (matcher2.matches()) {
                        try {
                            String strGroup2 = matcher2.group(2);
                            strGroup2.getClass();
                            long j6 = Long.parseLong(strGroup2);
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            httpURLConnection2 = httpURLConnectionM1841u;
                            long j7 = (j6 - Long.parseLong(strGroup3)) + 1;
                            if (jMax < 0) {
                                jMax = j7;
                            } else if (jMax != j7) {
                                try {
                                    AbstractC0646n.m1647y("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                    jMax = Math.max(jMax, j7);
                                } catch (NumberFormatException unused3) {
                                    AbstractC0646n.m1635m("HttpUtil", "Unexpected Content-Range [" + headerField3 + "]");
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            httpURLConnection2 = httpURLConnectionM1841u;
                        }
                    } else {
                        httpURLConnection2 = httpURLConnectionM1841u;
                    }
                }
                this.f2766v = jMax != jMax ? jMax - j4 : -1L;
            }
            try {
                this.f2763s = httpURLConnection2.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f2763s = new GZIPInputStream(this.f2763s);
                }
                this.f2764t = true;
                m1834p(c0715l);
                try {
                    m1843w(j4);
                    return this.f2766v;
                } catch (IOException e3) {
                    m1839s();
                    if (e3 instanceof C0723t) {
                        throw ((C0723t) e3);
                    }
                    throw new C0723t(e3, 2000, 1);
                }
            } catch (IOException e4) {
                m1839s();
                throw new C0723t(e4, 2000, 1);
            }
        } catch (IOException e5) {
            m1839s();
            throw C0723t.m1844a(e5, 1);
        }
    }

    @Override // p070Y.InterfaceC0711h
    public final void close() {
        try {
            InputStream inputStream = this.f2763s;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    int i3 = AbstractC0632A.f2454a;
                    throw new C0723t(e3, 2000, 3);
                }
            }
            this.f2763s = null;
            m1839s();
            if (this.f2764t) {
                this.f2764t = false;
                m1831k();
            }
            this.f2762r = null;
            this.f2761q = null;
        } catch (Throwable th) {
            this.f2763s = null;
            m1839s();
            if (this.f2764t) {
                this.f2764t = false;
                m1831k();
            }
            this.f2762r = null;
            this.f2761q = null;
            throw th;
        }
    }

    @Override // p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: h */
    public final Uri mo1828h() {
        HttpURLConnection httpURLConnection = this.f2762r;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C0715l c0715l = this.f2761q;
        if (c0715l != null) {
            return c0715l.f2735a;
        }
        return null;
    }

    @Override // p070Y.AbstractC0706c, p070Y.InterfaceC0711h
    /* JADX INFO: renamed from: m */
    public final Map mo1833m() {
        HttpURLConnection httpURLConnection = this.f2762r;
        return httpURLConnection == null ? C1700c0.f7651m : new C0718o(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // p055T.InterfaceC0575g
    /* JADX INFO: renamed from: q */
    public final int mo345q(byte[] bArr, int i3, int i4) throws C0723t {
        int i5;
        if (i4 == 0) {
            return 0;
        }
        try {
            long j3 = this.f2766v;
            if (j3 != -1) {
                long j4 = j3 - this.f2767w;
                if (j4 != 0) {
                    i4 = (int) Math.min(i4, j4);
                    InputStream inputStream = this.f2763s;
                    int i6 = AbstractC0632A.f2454a;
                    i5 = inputStream.read(bArr, i3, i4);
                    if (i5 != -1) {
                        this.f2767w += (long) i5;
                        m1829b(i5);
                        return i5;
                    }
                }
            } else {
                InputStream inputStream2 = this.f2763s;
                int i7 = AbstractC0632A.f2454a;
                i5 = inputStream2.read(bArr, i3, i4);
                if (i5 != -1) {
                    this.f2767w += (long) i5;
                    m1829b(i5);
                    return i5;
                }
            }
            return -1;
        } catch (IOException e3) {
            int i8 = AbstractC0632A.f2454a;
            throw C0723t.m1844a(e3, 2);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1839s() {
        HttpURLConnection httpURLConnection = this.f2762r;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e3) {
                AbstractC0646n.m1636n("DefaultHttpDataSource", "Unexpected error while disconnecting", e3);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final URL m1840t(URL url, String str) throws C0723t {
        if (str == null) {
            throw new C0723t(2001, "Null location redirect");
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new C0723t(2001, "Unsupported protocol redirect: " + protocol);
            }
            if (this.f2755k || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new C0723t(2001, "Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")");
        } catch (MalformedURLException e3) {
            throw new C0723t(e3, 2001, 1);
        }
    }

    /* JADX INFO: renamed from: u */
    public final HttpURLConnection m1841u(C0715l c0715l) throws IOException {
        int i3;
        byte[] bArr;
        URL url = new URL(c0715l.f2735a.toString());
        int i4 = 1;
        boolean z3 = (c0715l.f2741g & 1) == 1;
        boolean z4 = this.f2755k;
        int i5 = c0715l.f2736b;
        byte[] bArr2 = c0715l.f2737c;
        long j3 = c0715l.f2739e;
        long j4 = c0715l.f2740f;
        if (!z4) {
            return m1842v(url, i5, bArr2, j3, j4, z3, true, c0715l.f2738d);
        }
        byte[] bArr3 = bArr2;
        int i6 = 0;
        while (true) {
            int i7 = i6 + 1;
            if (i6 > 20) {
                throw new C0723t(new NoRouteToHostException(AbstractC0462h.m1165e(i7, "Too many redirects: ")), 2001, 1);
            }
            byte[] bArr4 = bArr3;
            HttpURLConnection httpURLConnectionM1842v = m1842v(url, i5, bArr4, j3, j4, z3, false, c0715l.f2738d);
            int responseCode = httpURLConnectionM1842v.getResponseCode();
            String headerField = httpURLConnectionM1842v.getHeaderField("Location");
            if ((i5 == i4 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionM1842v.disconnect();
                url = m1840t(url, headerField);
                i3 = i5;
                bArr = bArr4;
            } else {
                if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionM1842v;
                }
                httpURLConnectionM1842v.disconnect();
                url = m1840t(url, headerField);
                bArr = null;
                i3 = 1;
            }
            bArr3 = bArr;
            i5 = i3;
            i6 = i7;
            i4 = 1;
        }
    }

    /* JADX INFO: renamed from: v */
    public final HttpURLConnection m1842v(URL url, int i3, byte[] bArr, long j3, long j4, boolean z3, boolean z4, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f2756l);
        httpURLConnection.setReadTimeout(this.f2757m);
        HashMap map2 = new HashMap();
        C0106b c0106b = this.f2759o;
        if (c0106b != null) {
            map2.putAll(c0106b.m507E());
        }
        map2.putAll(this.f2760p.m507E());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = AbstractC0726w.f2775a;
        if (j3 == 0 && j4 == -1) {
            string = null;
        } else {
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(j3);
            sb.append("-");
            if (j4 != -1) {
                sb.append((j3 + j4) - 1);
            }
            string = sb.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str2 = this.f2758n;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z3 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z4);
        httpURLConnection.setDoOutput(bArr != null);
        int i4 = C0715l.f2734h;
        if (i3 == 1) {
            str = "GET";
        } else if (i3 == 2) {
            str = "POST";
        } else {
            if (i3 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: w */
    public final void m1843w(long j3) throws IOException {
        if (j3 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j3 > 0) {
            int iMin = (int) Math.min(j3, 4096);
            InputStream inputStream = this.f2763s;
            int i3 = AbstractC0632A.f2454a;
            int i4 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new C0723t(new InterruptedIOException(), 2000, 1);
            }
            if (i4 == -1) {
                throw new C0723t();
            }
            j3 -= (long) i4;
            m1829b(i4);
        }
    }
}
