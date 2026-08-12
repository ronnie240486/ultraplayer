package p101g2;

/* JADX INFO: renamed from: g2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1581b extends AbstractC1580a {

    /* JADX INFO: renamed from: g */
    public final char f7185g;

    public C1581b(char c) {
        this.f7185g = c;
    }

    @Override // p101g2.AbstractC1580a
    /* JADX INFO: renamed from: a */
    public final boolean mo3915a(char c) {
        return c == this.f7185g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c = this.f7185g;
        for (int i3 = 0; i3 < 4; i3++) {
            cArr[5 - i3] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
