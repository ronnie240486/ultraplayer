package p141r0;

import android.opengl.GLES20;
import android.util.Log;
import p036M0.C0368e;
import p039N0.C0414j;
import p064W.C0639g;

/* JADX INFO: renamed from: r0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2190g {

    /* JADX INFO: renamed from: i */
    public static final float[] f9424i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: j */
    public static final float[] f9425j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final float[] f9426k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a */
    public int f9427a;

    /* JADX INFO: renamed from: b */
    public C0368e f9428b;

    /* JADX INFO: renamed from: c */
    public C0414j f9429c;

    /* JADX INFO: renamed from: d */
    public int f9430d;

    /* JADX INFO: renamed from: e */
    public int f9431e;

    /* JADX INFO: renamed from: f */
    public int f9432f;

    /* JADX INFO: renamed from: g */
    public int f9433g;

    /* JADX INFO: renamed from: h */
    public int f9434h;

    /* JADX INFO: renamed from: b */
    public static boolean m4772b(C2189f c2189f) {
        C0368e[] c0368eArr = c2189f.f9420a.f9419a;
        if (c0368eArr.length == 1 && c0368eArr[0].f1178a == 0) {
            C0368e[] c0368eArr2 = c2189f.f9421b.f9419a;
            if (c0368eArr2.length == 1 && c0368eArr2[0].f1178a == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final void m4773a() {
        try {
            C0414j c0414j = new C0414j("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f9429c = c0414j;
            this.f9430d = GLES20.glGetUniformLocation(c0414j.f1407g, "uMvpMatrix");
            this.f9431e = GLES20.glGetUniformLocation(this.f9429c.f1407g, "uTexMatrix");
            this.f9432f = this.f9429c.m1111d("aPosition");
            this.f9433g = this.f9429c.m1111d("aTexCoords");
            this.f9434h = GLES20.glGetUniformLocation(this.f9429c.f1407g, "uTexture");
        } catch (C0639g e3) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e3);
        }
    }
}
