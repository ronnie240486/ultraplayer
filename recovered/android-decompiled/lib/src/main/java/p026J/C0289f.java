package p026J;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import p060U1.AbstractC0610a;

/* JADX INFO: renamed from: J.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0289f extends AbstractC0610a {

    /* JADX INFO: renamed from: n */
    public final TextView f777n;

    /* JADX INFO: renamed from: o */
    public final C0287d f778o;

    /* JADX INFO: renamed from: p */
    public boolean f779p = true;

    public C0289f(TextView textView) {
        this.f777n = textView;
        this.f778o = new C0287d(textView);
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: H */
    public final void mo819H(boolean z3) {
        if (z3) {
            m821V();
        }
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: I */
    public final void mo820I(boolean z3) {
        this.f779p = z3;
        m821V();
        TextView textView = this.f777n;
        textView.setFilters(mo822o(textView.getFilters()));
    }

    /* JADX INFO: renamed from: V */
    public final void m821V() {
        TextView textView = this.f777n;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f779p) {
            if (!(transformationMethod instanceof C0293j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new C0293j(transformationMethod);
            }
        } else if (transformationMethod instanceof C0293j) {
            transformationMethod = ((C0293j) transformationMethod).f785a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // p060U1.AbstractC0610a
    /* JADX INFO: renamed from: o */
    public final InputFilter[] mo822o(InputFilter[] inputFilterArr) {
        if (!this.f779p) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i3 = 0; i3 < inputFilterArr.length; i3++) {
                InputFilter inputFilter = inputFilterArr[i3];
                if (inputFilter instanceof C0287d) {
                    sparseArray.put(i3, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                if (sparseArray.indexOfKey(i5) < 0) {
                    inputFilterArr2[i4] = inputFilterArr[i5];
                    i4++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i6 = 0;
        while (true) {
            C0287d c0287d = this.f778o;
            if (i6 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0287d;
                return inputFilterArr3;
            }
            if (inputFilterArr[i6] == c0287d) {
                return inputFilterArr;
            }
            i6++;
        }
    }
}
