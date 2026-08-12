package com.google.android.gms.internal.cast;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: com.google.android.gms.internal.cast.d2 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1270d2 {

    /* JADX INFO: renamed from: h */
    public static final EnumC1270d2 f5831h;

    /* JADX INFO: renamed from: i */
    public static final EnumC1270d2 f5832i;

    /* JADX INFO: renamed from: j */
    public static final EnumC1270d2[] f5833j;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ EnumC1270d2[] f5834k;

    /* JADX INFO: renamed from: g */
    public final int f5835g;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1270d2 EF0;

    static {
        EnumC1310n2 enumC1310n2 = EnumC1310n2.DOUBLE;
        EnumC1270d2 enumC1270d2 = new EnumC1270d2("DOUBLE", 0, 0, 1, enumC1310n2);
        EnumC1310n2 enumC1310n3 = EnumC1310n2.FLOAT;
        EnumC1270d2 enumC1270d3 = new EnumC1270d2("FLOAT", 1, 1, 1, enumC1310n3);
        EnumC1310n2 enumC1310n4 = EnumC1310n2.LONG;
        EnumC1270d2 enumC1270d4 = new EnumC1270d2("INT64", 2, 2, 1, enumC1310n4);
        EnumC1270d2 enumC1270d5 = new EnumC1270d2("UINT64", 3, 3, 1, enumC1310n4);
        EnumC1310n2 enumC1310n5 = EnumC1310n2.INT;
        EnumC1270d2 enumC1270d6 = new EnumC1270d2("INT32", 4, 4, 1, enumC1310n5);
        EnumC1270d2 enumC1270d7 = new EnumC1270d2("FIXED64", 5, 5, 1, enumC1310n4);
        EnumC1270d2 enumC1270d8 = new EnumC1270d2("FIXED32", 6, 6, 1, enumC1310n5);
        EnumC1310n2 enumC1310n6 = EnumC1310n2.BOOLEAN;
        EnumC1270d2 enumC1270d9 = new EnumC1270d2("BOOL", 7, 7, 1, enumC1310n6);
        EnumC1310n2 enumC1310n7 = EnumC1310n2.STRING;
        EnumC1270d2 enumC1270d10 = new EnumC1270d2("STRING", 8, 8, 1, enumC1310n7);
        EnumC1310n2 enumC1310n8 = EnumC1310n2.MESSAGE;
        EnumC1270d2 enumC1270d11 = new EnumC1270d2("MESSAGE", 9, 9, 1, enumC1310n8);
        EnumC1310n2 enumC1310n9 = EnumC1310n2.BYTE_STRING;
        EnumC1270d2 enumC1270d12 = new EnumC1270d2("BYTES", 10, 10, 1, enumC1310n9);
        EnumC1270d2 enumC1270d13 = new EnumC1270d2("UINT32", 11, 11, 1, enumC1310n5);
        EnumC1310n2 enumC1310n10 = EnumC1310n2.ENUM;
        EnumC1270d2 enumC1270d14 = new EnumC1270d2("ENUM", 12, 12, 1, enumC1310n10);
        EnumC1270d2 enumC1270d15 = new EnumC1270d2("SFIXED32", 13, 13, 1, enumC1310n5);
        EnumC1270d2 enumC1270d16 = new EnumC1270d2("SFIXED64", 14, 14, 1, enumC1310n4);
        EnumC1270d2 enumC1270d17 = new EnumC1270d2("SINT32", 15, 15, 1, enumC1310n5);
        EnumC1270d2 enumC1270d18 = new EnumC1270d2("SINT64", 16, 16, 1, enumC1310n4);
        EnumC1270d2 enumC1270d19 = new EnumC1270d2("GROUP", 17, 17, 1, enumC1310n8);
        EnumC1270d2 enumC1270d20 = new EnumC1270d2("DOUBLE_LIST", 18, 18, 2, enumC1310n2);
        EnumC1270d2 enumC1270d21 = new EnumC1270d2("FLOAT_LIST", 19, 19, 2, enumC1310n3);
        EnumC1270d2 enumC1270d22 = new EnumC1270d2("INT64_LIST", 20, 20, 2, enumC1310n4);
        EnumC1270d2 enumC1270d23 = new EnumC1270d2("UINT64_LIST", 21, 21, 2, enumC1310n4);
        EnumC1270d2 enumC1270d24 = new EnumC1270d2("INT32_LIST", 22, 22, 2, enumC1310n5);
        EnumC1270d2 enumC1270d25 = new EnumC1270d2("FIXED64_LIST", 23, 23, 2, enumC1310n4);
        EnumC1270d2 enumC1270d26 = new EnumC1270d2("FIXED32_LIST", 24, 24, 2, enumC1310n5);
        EnumC1270d2 enumC1270d27 = new EnumC1270d2("BOOL_LIST", 25, 25, 2, enumC1310n6);
        EnumC1270d2 enumC1270d28 = new EnumC1270d2("STRING_LIST", 26, 26, 2, enumC1310n7);
        EnumC1270d2 enumC1270d29 = new EnumC1270d2("MESSAGE_LIST", 27, 27, 2, enumC1310n8);
        EnumC1270d2 enumC1270d30 = new EnumC1270d2("BYTES_LIST", 28, 28, 2, enumC1310n9);
        EnumC1270d2 enumC1270d31 = new EnumC1270d2("UINT32_LIST", 29, 29, 2, enumC1310n5);
        EnumC1270d2 enumC1270d32 = new EnumC1270d2("ENUM_LIST", 30, 30, 2, enumC1310n10);
        EnumC1270d2 enumC1270d33 = new EnumC1270d2("SFIXED32_LIST", 31, 31, 2, enumC1310n5);
        EnumC1270d2 enumC1270d34 = new EnumC1270d2("SFIXED64_LIST", 32, 32, 2, enumC1310n4);
        EnumC1270d2 enumC1270d35 = new EnumC1270d2("SINT32_LIST", 33, 33, 2, enumC1310n5);
        EnumC1270d2 enumC1270d36 = new EnumC1270d2("SINT64_LIST", 34, 34, 2, enumC1310n4);
        EnumC1270d2 enumC1270d37 = new EnumC1270d2("DOUBLE_LIST_PACKED", 35, 35, 3, enumC1310n2);
        f5831h = enumC1270d37;
        EnumC1270d2 enumC1270d38 = new EnumC1270d2("FLOAT_LIST_PACKED", 36, 36, 3, enumC1310n3);
        EnumC1270d2 enumC1270d39 = new EnumC1270d2("INT64_LIST_PACKED", 37, 37, 3, enumC1310n4);
        EnumC1270d2 enumC1270d40 = new EnumC1270d2("UINT64_LIST_PACKED", 38, 38, 3, enumC1310n4);
        EnumC1270d2 enumC1270d41 = new EnumC1270d2("INT32_LIST_PACKED", 39, 39, 3, enumC1310n5);
        EnumC1270d2 enumC1270d42 = new EnumC1270d2("FIXED64_LIST_PACKED", 40, 40, 3, enumC1310n4);
        EnumC1270d2 enumC1270d43 = new EnumC1270d2("FIXED32_LIST_PACKED", 41, 41, 3, enumC1310n5);
        EnumC1270d2 enumC1270d44 = new EnumC1270d2("BOOL_LIST_PACKED", 42, 42, 3, enumC1310n6);
        EnumC1270d2 enumC1270d45 = new EnumC1270d2("UINT32_LIST_PACKED", 43, 43, 3, enumC1310n5);
        EnumC1270d2 enumC1270d46 = new EnumC1270d2("ENUM_LIST_PACKED", 44, 44, 3, enumC1310n10);
        EnumC1270d2 enumC1270d47 = new EnumC1270d2("SFIXED32_LIST_PACKED", 45, 45, 3, enumC1310n5);
        EnumC1270d2 enumC1270d48 = new EnumC1270d2("SFIXED64_LIST_PACKED", 46, 46, 3, enumC1310n4);
        EnumC1270d2 enumC1270d49 = new EnumC1270d2("SINT32_LIST_PACKED", 47, 47, 3, enumC1310n5);
        EnumC1270d2 enumC1270d50 = new EnumC1270d2("SINT64_LIST_PACKED", 48, 48, 3, enumC1310n4);
        f5832i = enumC1270d50;
        f5834k = new EnumC1270d2[]{enumC1270d2, enumC1270d3, enumC1270d4, enumC1270d5, enumC1270d6, enumC1270d7, enumC1270d8, enumC1270d9, enumC1270d10, enumC1270d11, enumC1270d12, enumC1270d13, enumC1270d14, enumC1270d15, enumC1270d16, enumC1270d17, enumC1270d18, enumC1270d19, enumC1270d20, enumC1270d21, enumC1270d22, enumC1270d23, enumC1270d24, enumC1270d25, enumC1270d26, enumC1270d27, enumC1270d28, enumC1270d29, enumC1270d30, enumC1270d31, enumC1270d32, enumC1270d33, enumC1270d34, enumC1270d35, enumC1270d36, enumC1270d37, enumC1270d38, enumC1270d39, enumC1270d40, enumC1270d41, enumC1270d42, enumC1270d43, enumC1270d44, enumC1270d45, enumC1270d46, enumC1270d47, enumC1270d48, enumC1270d49, enumC1270d50, new EnumC1270d2("GROUP_LIST", 49, 49, 2, enumC1310n8), new EnumC1270d2("MAP", 50, 50, 4, EnumC1310n2.VOID)};
        EnumC1270d2[] enumC1270d2ArrValues = values();
        f5833j = new EnumC1270d2[enumC1270d2ArrValues.length];
        for (EnumC1270d2 enumC1270d51 : enumC1270d2ArrValues) {
            f5833j[enumC1270d51.f5835g] = enumC1270d51;
        }
    }

    public EnumC1270d2(String str, int i3, int i4, int i5, EnumC1310n2 enumC1310n2) {
        super(str, i3);
        this.f5835g = i4;
        int i6 = i5 - 1;
        if (i6 == 1 || i6 == 3) {
            enumC1310n2.getClass();
        }
        if (i5 == 1) {
            EnumC1310n2 enumC1310n3 = EnumC1310n2.VOID;
            enumC1310n2.ordinal();
        }
    }

    public static EnumC1270d2[] values() {
        return (EnumC1270d2[]) f5834k.clone();
    }
}
