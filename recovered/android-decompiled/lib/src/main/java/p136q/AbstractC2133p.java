package p136q;

import android.app.Notification;
import android.app.Person;

/* JADX INFO: renamed from: q.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2133p {
    /* JADX INFO: renamed from: a */
    public static Notification.Builder m4702a(Notification.Builder builder, Person person) {
        return builder.addPerson(person);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.Action.Builder m4703b(Notification.Action.Builder builder, int i3) {
        return builder.setSemanticAction(i3);
    }
}
