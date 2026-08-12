package com.google.android.gms.internal.cast;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p019G1.AbstractC0230e;

/* JADX INFO: renamed from: com.google.android.gms.internal.cast.z2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1358z2 {

    /* JADX INFO: renamed from: a */
    public static final char[] f6005a;

    static {
        char[] cArr = new char[80];
        f6005a = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* JADX INFO: renamed from: a */
    public static void m3443a(StringBuilder sb, int i3, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m3443a(sb, i3, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m3443a(sb, i3, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m3444b(i3, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i4 = 1; i4 < str.length(); i4++) {
                char cCharAt = str.charAt(i4);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(AbstractC0230e.m725B(new C1250Y1(((String) obj).getBytes(AbstractC1306m2.f5927a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof C1250Y1) {
            sb.append(": \"");
            sb.append(AbstractC0230e.m725B((C1250Y1) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC1282g2) {
            sb.append(" {");
            m3445c((AbstractC1282g2) obj, sb, i3 + 2);
            sb.append("\n");
            m3444b(i3, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i5 = i3 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        m3443a(sb, i5, "key", entry.getKey());
        m3443a(sb, i5, "value", entry.getValue());
        sb.append("\n");
        m3444b(i3, sb);
        sb.append("}");
    }

    /* JADX INFO: renamed from: b */
    public static void m3444b(int i3, StringBuilder sb) {
        while (i3 > 0) {
            int i4 = 80;
            if (i3 <= 80) {
                i4 = i3;
            }
            sb.append(f6005a, 0, i4);
            i3 -= i4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0200  */
    /* JADX INFO: renamed from: c */
    public static void m3445c(AbstractC1282g2 abstractC1282g2, StringBuilder sb, int i3) {
        int i4;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = abstractC1282g2.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i5 = 0;
        while (true) {
            i4 = 3;
            if (i5 >= length) {
                break;
            }
            Method method3 = declaredMethods[i5];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i5++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i4);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                m3443a(sb, i3, strSubstring.substring(0, strSubstring.length() - 4), AbstractC1282g2.m3258c(method2, abstractC1282g2, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                m3443a(sb, i3, strSubstring.substring(0, strSubstring.length() - 3), AbstractC1282g2.m3258c(method, abstractC1282g2, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objM3258c = AbstractC1282g2.m3258c(method4, abstractC1282g2, new Object[0]);
                    if (method5 == null) {
                        if (objM3258c instanceof Boolean) {
                            if (((Boolean) objM3258c).booleanValue()) {
                                m3443a(sb, i3, strSubstring, objM3258c);
                            }
                        } else if (objM3258c instanceof Integer) {
                            if (((Integer) objM3258c).intValue() != 0) {
                                m3443a(sb, i3, strSubstring, objM3258c);
                            }
                        } else if (objM3258c instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objM3258c).floatValue()) != 0) {
                                m3443a(sb, i3, strSubstring, objM3258c);
                            }
                        } else if (!(objM3258c instanceof Double)) {
                            if (objM3258c instanceof String) {
                                zEquals = objM3258c.equals("");
                            } else if (objM3258c instanceof C1250Y1) {
                                zEquals = objM3258c.equals(C1250Y1.f5743i);
                            } else if (objM3258c instanceof AbstractC1230T1) {
                                if (objM3258c != ((AbstractC1282g2) ((AbstractC1282g2) ((AbstractC1230T1) objM3258c)).mo3096h(6, null))) {
                                    m3443a(sb, i3, strSubstring, objM3258c);
                                }
                            } else if (!(objM3258c instanceof Enum) || ((Enum) objM3258c).ordinal() != 0) {
                                m3443a(sb, i3, strSubstring, objM3258c);
                            }
                            if (!zEquals) {
                                m3443a(sb, i3, strSubstring, objM3258c);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objM3258c).doubleValue()) != 0) {
                            m3443a(sb, i3, strSubstring, objM3258c);
                        }
                    } else if (((Boolean) AbstractC1282g2.m3258c(method5, abstractC1282g2, new Object[0])).booleanValue()) {
                        m3443a(sb, i3, strSubstring, objM3258c);
                    }
                }
            }
            i4 = 3;
        }
    }
}
