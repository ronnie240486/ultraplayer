package p089d1;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: renamed from: d1.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1442o {

    /* JADX INFO: renamed from: a */
    public final Bundle f6387a;

    public C1442o(Bundle bundle) {
        this.f6387a = bundle;
    }

    /* JADX INFO: renamed from: a */
    public final HashSet m3607a() {
        Bundle bundle = this.f6387a;
        return !bundle.containsKey("allowedPackages") ? new HashSet() : new HashSet(bundle.getStringArrayList("allowedPackages"));
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m3608b() {
        Bundle bundle = this.f6387a;
        return !bundle.containsKey("controlFilters") ? new ArrayList() : new ArrayList(bundle.getParcelableArrayList("controlFilters"));
    }

    /* JADX INFO: renamed from: c */
    public final ArrayList m3609c() {
        Bundle bundle = this.f6387a;
        return !bundle.containsKey("groupMemberIds") ? new ArrayList() : new ArrayList(bundle.getStringArrayList("groupMemberIds"));
    }

    /* JADX INFO: renamed from: d */
    public final String m3610d() {
        return this.f6387a.getString("id");
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3611e() {
        return (TextUtils.isEmpty(m3610d()) || TextUtils.isEmpty(this.f6387a.getString("name")) || m3608b().contains(null)) ? false : true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouteDescriptor{ id=");
        sb.append(m3610d());
        sb.append(", groupMemberIds=");
        sb.append(m3609c());
        sb.append(", name=");
        Bundle bundle = this.f6387a;
        sb.append(bundle.getString("name"));
        sb.append(", description=");
        sb.append(bundle.getString("status"));
        sb.append(", iconUri=");
        String string = bundle.getString("iconUri");
        sb.append(string == null ? null : Uri.parse(string));
        sb.append(", isEnabled=");
        sb.append(bundle.getBoolean("enabled", true));
        sb.append(", isSystemRoute=");
        sb.append(bundle.getBoolean("isSystemRoute", false));
        sb.append(", connectionState=");
        sb.append(bundle.getInt("connectionState", 0));
        sb.append(", controlFilters=");
        sb.append(Arrays.toString(m3608b().toArray()));
        sb.append(", playbackType=");
        sb.append(bundle.getInt("playbackType", 1));
        sb.append(", playbackStream=");
        sb.append(bundle.getInt("playbackStream", -1));
        sb.append(", deviceType=");
        sb.append(bundle.getInt("deviceType"));
        sb.append(", volume=");
        sb.append(bundle.getInt("volume"));
        sb.append(", volumeMax=");
        sb.append(bundle.getInt("volumeMax"));
        sb.append(", volumeHandling=");
        sb.append(bundle.getInt("volumeHandling", 0));
        sb.append(", presentationDisplayId=");
        sb.append(bundle.getInt("presentationDisplayId", -1));
        sb.append(", extras=");
        sb.append(bundle.getBundle("extras"));
        sb.append(", isValid=");
        sb.append(m3611e());
        sb.append(", minClientVersion=");
        sb.append(bundle.getInt("minClientVersion", 1));
        sb.append(", maxClientVersion=");
        sb.append(bundle.getInt("maxClientVersion", Integer.MAX_VALUE));
        sb.append(", isVisibilityPublic=");
        sb.append(bundle.getBoolean("isVisibilityPublic", true));
        sb.append(", allowedPackages=");
        sb.append(Arrays.toString(m3607a().toArray()));
        sb.append(" }");
        return sb.toString();
    }
}
