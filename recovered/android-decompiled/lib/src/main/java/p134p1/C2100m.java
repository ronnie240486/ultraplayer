package p134p1;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: renamed from: p1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2100m {

    /* JADX INFO: renamed from: a */
    public final long f9130a;

    public C2100m(long j3) {
        this.f9130a = j3;
    }

    /* JADX INFO: renamed from: a */
    public static C2100m m4649a(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        C2100m c2100m = new C2100m(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return c2100m;
                    }
                    C2100m c2100m2 = new C2100m(jsonReader.nextLong());
                    jsonReader.close();
                    return c2100m2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2100m) {
            if (this.f9130a == ((C2100m) obj).f9130a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.f9130a;
        return ((int) (j3 ^ (j3 >>> 32))) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f9130a + "}";
    }
}
