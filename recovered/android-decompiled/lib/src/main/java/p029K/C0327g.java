package p029K;

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import p045P0.AbstractC0462h;
import p066W1.AbstractC0664e;

/* JADX INFO: renamed from: K.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0327g {

    /* JADX INFO: renamed from: A */
    public static final byte[] f899A;

    /* JADX INFO: renamed from: B */
    public static final String[] f900B;

    /* JADX INFO: renamed from: C */
    public static final int[] f901C;

    /* JADX INFO: renamed from: D */
    public static final byte[] f902D;

    /* JADX INFO: renamed from: E */
    public static final C0324d f903E;

    /* JADX INFO: renamed from: F */
    public static final C0324d[][] f904F;

    /* JADX INFO: renamed from: G */
    public static final C0324d[] f905G;

    /* JADX INFO: renamed from: H */
    public static final HashMap[] f906H;

    /* JADX INFO: renamed from: I */
    public static final HashMap[] f907I;

    /* JADX INFO: renamed from: J */
    public static final HashSet f908J;

    /* JADX INFO: renamed from: K */
    public static final HashMap f909K;

    /* JADX INFO: renamed from: L */
    public static final Charset f910L;

    /* JADX INFO: renamed from: M */
    public static final byte[] f911M;

    /* JADX INFO: renamed from: N */
    public static final byte[] f912N;

    /* JADX INFO: renamed from: l */
    public static final boolean f913l = Log.isLoggable("ExifInterface", 3);

    /* JADX INFO: renamed from: m */
    public static final int[] f914m;

    /* JADX INFO: renamed from: n */
    public static final int[] f915n;

    /* JADX INFO: renamed from: o */
    public static final byte[] f916o;

    /* JADX INFO: renamed from: p */
    public static final byte[] f917p;

    /* JADX INFO: renamed from: q */
    public static final byte[] f918q;

    /* JADX INFO: renamed from: r */
    public static final byte[] f919r;

    /* JADX INFO: renamed from: s */
    public static final byte[] f920s;

    /* JADX INFO: renamed from: t */
    public static final byte[] f921t;

    /* JADX INFO: renamed from: u */
    public static final byte[] f922u;

    /* JADX INFO: renamed from: v */
    public static final byte[] f923v;

    /* JADX INFO: renamed from: w */
    public static final byte[] f924w;

    /* JADX INFO: renamed from: x */
    public static final byte[] f925x;

    /* JADX INFO: renamed from: y */
    public static final byte[] f926y;

    /* JADX INFO: renamed from: z */
    public static final byte[] f927z;

    /* JADX INFO: renamed from: a */
    public final FileDescriptor f928a;

    /* JADX INFO: renamed from: b */
    public final AssetManager.AssetInputStream f929b;

    /* JADX INFO: renamed from: c */
    public int f930c;

    /* JADX INFO: renamed from: d */
    public final HashMap[] f931d;

    /* JADX INFO: renamed from: e */
    public final HashSet f932e;

    /* JADX INFO: renamed from: f */
    public ByteOrder f933f;

    /* JADX INFO: renamed from: g */
    public boolean f934g;

    /* JADX INFO: renamed from: h */
    public int f935h;

    /* JADX INFO: renamed from: i */
    public int f936i;

    /* JADX INFO: renamed from: j */
    public int f937j;

    /* JADX INFO: renamed from: k */
    public int f938k;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        f914m = new int[]{8, 8, 8};
        f915n = new int[]{8};
        f916o = new byte[]{-1, -40, -1};
        f917p = new byte[]{102, 116, 121, 112};
        f918q = new byte[]{109, 105, 102, 49};
        f919r = new byte[]{104, 101, 105, 99};
        f920s = new byte[]{79, 76, 89, 77, 80, 0};
        f921t = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        f922u = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        f923v = new byte[]{101, 88, 73, 102};
        f924w = new byte[]{73, 72, 68, 82};
        f925x = new byte[]{73, 69, 78, 68};
        f926y = new byte[]{82, 73, 70, 70};
        f927z = new byte[]{87, 69, 66, 80};
        f899A = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        f900B = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f901C = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        f902D = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        C0324d[] c0324dArr = {new C0324d("NewSubfileType", 254, 4), new C0324d("SubfileType", 255, 4), new C0324d("ImageWidth", 256, 3, 4), new C0324d("ImageLength", 257, 3, 4), new C0324d("BitsPerSample", 258, 3), new C0324d("Compression", 259, 3), new C0324d("PhotometricInterpretation", 262, 3), new C0324d("ImageDescription", 270, 2), new C0324d("Make", 271, 2), new C0324d("Model", 272, 2), new C0324d("StripOffsets", 273, 3, 4), new C0324d("Orientation", 274, 3), new C0324d("SamplesPerPixel", 277, 3), new C0324d("RowsPerStrip", 278, 3, 4), new C0324d("StripByteCounts", 279, 3, 4), new C0324d("XResolution", 282, 5), new C0324d("YResolution", 283, 5), new C0324d("PlanarConfiguration", 284, 3), new C0324d("ResolutionUnit", 296, 3), new C0324d("TransferFunction", 301, 3), new C0324d("Software", 305, 2), new C0324d("DateTime", 306, 2), new C0324d("Artist", 315, 2), new C0324d("WhitePoint", 318, 5), new C0324d("PrimaryChromaticities", 319, 5), new C0324d("SubIFDPointer", 330, 4), new C0324d("JPEGInterchangeFormat", 513, 4), new C0324d("JPEGInterchangeFormatLength", 514, 4), new C0324d("YCbCrCoefficients", 529, 5), new C0324d("YCbCrSubSampling", 530, 3), new C0324d("YCbCrPositioning", 531, 3), new C0324d("ReferenceBlackWhite", 532, 5), new C0324d("Copyright", 33432, 2), new C0324d("ExifIFDPointer", 34665, 4), new C0324d("GPSInfoIFDPointer", 34853, 4), new C0324d("SensorTopBorder", 4, 4), new C0324d("SensorLeftBorder", 5, 4), new C0324d("SensorBottomBorder", 6, 4), new C0324d("SensorRightBorder", 7, 4), new C0324d("ISO", 23, 3), new C0324d("JpgFromRaw", 46, 7), new C0324d("Xmp", 700, 1)};
        C0324d[] c0324dArr2 = {new C0324d("ExposureTime", 33434, 5), new C0324d("FNumber", 33437, 5), new C0324d("ExposureProgram", 34850, 3), new C0324d("SpectralSensitivity", 34852, 2), new C0324d("PhotographicSensitivity", 34855, 3), new C0324d("OECF", 34856, 7), new C0324d("SensitivityType", 34864, 3), new C0324d("StandardOutputSensitivity", 34865, 4), new C0324d("RecommendedExposureIndex", 34866, 4), new C0324d("ISOSpeed", 34867, 4), new C0324d("ISOSpeedLatitudeyyy", 34868, 4), new C0324d("ISOSpeedLatitudezzz", 34869, 4), new C0324d("ExifVersion", 36864, 2), new C0324d("DateTimeOriginal", 36867, 2), new C0324d("DateTimeDigitized", 36868, 2), new C0324d("OffsetTime", 36880, 2), new C0324d("OffsetTimeOriginal", 36881, 2), new C0324d("OffsetTimeDigitized", 36882, 2), new C0324d("ComponentsConfiguration", 37121, 7), new C0324d("CompressedBitsPerPixel", 37122, 5), new C0324d("ShutterSpeedValue", 37377, 10), new C0324d("ApertureValue", 37378, 5), new C0324d("BrightnessValue", 37379, 10), new C0324d("ExposureBiasValue", 37380, 10), new C0324d("MaxApertureValue", 37381, 5), new C0324d("SubjectDistance", 37382, 5), new C0324d("MeteringMode", 37383, 3), new C0324d("LightSource", 37384, 3), new C0324d("Flash", 37385, 3), new C0324d("FocalLength", 37386, 5), new C0324d("SubjectArea", 37396, 3), new C0324d("MakerNote", 37500, 7), new C0324d("UserComment", 37510, 7), new C0324d("SubSecTime", 37520, 2), new C0324d("SubSecTimeOriginal", 37521, 2), new C0324d("SubSecTimeDigitized", 37522, 2), new C0324d("FlashpixVersion", 40960, 7), new C0324d("ColorSpace", 40961, 3), new C0324d("PixelXDimension", 40962, 3, 4), new C0324d("PixelYDimension", 40963, 3, 4), new C0324d("RelatedSoundFile", 40964, 2), new C0324d("InteroperabilityIFDPointer", 40965, 4), new C0324d("FlashEnergy", 41483, 5), new C0324d("SpatialFrequencyResponse", 41484, 7), new C0324d("FocalPlaneXResolution", 41486, 5), new C0324d("FocalPlaneYResolution", 41487, 5), new C0324d("FocalPlaneResolutionUnit", 41488, 3), new C0324d("SubjectLocation", 41492, 3), new C0324d("ExposureIndex", 41493, 5), new C0324d("SensingMethod", 41495, 3), new C0324d("FileSource", 41728, 7), new C0324d("SceneType", 41729, 7), new C0324d("CFAPattern", 41730, 7), new C0324d("CustomRendered", 41985, 3), new C0324d("ExposureMode", 41986, 3), new C0324d("WhiteBalance", 41987, 3), new C0324d("DigitalZoomRatio", 41988, 5), new C0324d("FocalLengthIn35mmFilm", 41989, 3), new C0324d("SceneCaptureType", 41990, 3), new C0324d("GainControl", 41991, 3), new C0324d("Contrast", 41992, 3), new C0324d("Saturation", 41993, 3), new C0324d("Sharpness", 41994, 3), new C0324d("DeviceSettingDescription", 41995, 7), new C0324d("SubjectDistanceRange", 41996, 3), new C0324d("ImageUniqueID", 42016, 2), new C0324d("CameraOwnerName", 42032, 2), new C0324d("BodySerialNumber", 42033, 2), new C0324d("LensSpecification", 42034, 5), new C0324d("LensMake", 42035, 2), new C0324d("LensModel", 42036, 2), new C0324d("Gamma", 42240, 5), new C0324d("DNGVersion", 50706, 1), new C0324d("DefaultCropSize", 50720, 3, 4)};
        C0324d[] c0324dArr3 = {new C0324d("GPSVersionID", 0, 1), new C0324d("GPSLatitudeRef", 1, 2), new C0324d("GPSLatitude", 2, 5, 10), new C0324d("GPSLongitudeRef", 3, 2), new C0324d("GPSLongitude", 4, 5, 10), new C0324d("GPSAltitudeRef", 5, 1), new C0324d("GPSAltitude", 6, 5), new C0324d("GPSTimeStamp", 7, 5), new C0324d("GPSSatellites", 8, 2), new C0324d("GPSStatus", 9, 2), new C0324d("GPSMeasureMode", 10, 2), new C0324d("GPSDOP", 11, 5), new C0324d("GPSSpeedRef", 12, 2), new C0324d("GPSSpeed", 13, 5), new C0324d("GPSTrackRef", 14, 2), new C0324d("GPSTrack", 15, 5), new C0324d("GPSImgDirectionRef", 16, 2), new C0324d("GPSImgDirection", 17, 5), new C0324d("GPSMapDatum", 18, 2), new C0324d("GPSDestLatitudeRef", 19, 2), new C0324d("GPSDestLatitude", 20, 5), new C0324d("GPSDestLongitudeRef", 21, 2), new C0324d("GPSDestLongitude", 22, 5), new C0324d("GPSDestBearingRef", 23, 2), new C0324d("GPSDestBearing", 24, 5), new C0324d("GPSDestDistanceRef", 25, 2), new C0324d("GPSDestDistance", 26, 5), new C0324d("GPSProcessingMethod", 27, 7), new C0324d("GPSAreaInformation", 28, 7), new C0324d("GPSDateStamp", 29, 2), new C0324d("GPSDifferential", 30, 3), new C0324d("GPSHPositioningError", 31, 5)};
        C0324d[] c0324dArr4 = {new C0324d("InteroperabilityIndex", 1, 2)};
        C0324d[] c0324dArr5 = {new C0324d("NewSubfileType", 254, 4), new C0324d("SubfileType", 255, 4), new C0324d("ThumbnailImageWidth", 256, 3, 4), new C0324d("ThumbnailImageLength", 257, 3, 4), new C0324d("BitsPerSample", 258, 3), new C0324d("Compression", 259, 3), new C0324d("PhotometricInterpretation", 262, 3), new C0324d("ImageDescription", 270, 2), new C0324d("Make", 271, 2), new C0324d("Model", 272, 2), new C0324d("StripOffsets", 273, 3, 4), new C0324d("ThumbnailOrientation", 274, 3), new C0324d("SamplesPerPixel", 277, 3), new C0324d("RowsPerStrip", 278, 3, 4), new C0324d("StripByteCounts", 279, 3, 4), new C0324d("XResolution", 282, 5), new C0324d("YResolution", 283, 5), new C0324d("PlanarConfiguration", 284, 3), new C0324d("ResolutionUnit", 296, 3), new C0324d("TransferFunction", 301, 3), new C0324d("Software", 305, 2), new C0324d("DateTime", 306, 2), new C0324d("Artist", 315, 2), new C0324d("WhitePoint", 318, 5), new C0324d("PrimaryChromaticities", 319, 5), new C0324d("SubIFDPointer", 330, 4), new C0324d("JPEGInterchangeFormat", 513, 4), new C0324d("JPEGInterchangeFormatLength", 514, 4), new C0324d("YCbCrCoefficients", 529, 5), new C0324d("YCbCrSubSampling", 530, 3), new C0324d("YCbCrPositioning", 531, 3), new C0324d("ReferenceBlackWhite", 532, 5), new C0324d("Copyright", 33432, 2), new C0324d("ExifIFDPointer", 34665, 4), new C0324d("GPSInfoIFDPointer", 34853, 4), new C0324d("DNGVersion", 50706, 1), new C0324d("DefaultCropSize", 50720, 3, 4)};
        f903E = new C0324d("StripOffsets", 273, 3);
        f904F = new C0324d[][]{c0324dArr, c0324dArr2, c0324dArr3, c0324dArr4, c0324dArr5, c0324dArr, new C0324d[]{new C0324d("ThumbnailImage", 256, 7), new C0324d("CameraSettingsIFDPointer", 8224, 4), new C0324d("ImageProcessingIFDPointer", 8256, 4)}, new C0324d[]{new C0324d("PreviewImageStart", 257, 4), new C0324d("PreviewImageLength", 258, 4)}, new C0324d[]{new C0324d("AspectFrame", 4371, 3)}, new C0324d[]{new C0324d("ColorSpace", 55, 3)}};
        f905G = new C0324d[]{new C0324d("SubIFDPointer", 330, 4), new C0324d("ExifIFDPointer", 34665, 4), new C0324d("GPSInfoIFDPointer", 34853, 4), new C0324d("InteroperabilityIFDPointer", 40965, 4), new C0324d("CameraSettingsIFDPointer", 8224, 1), new C0324d("ImageProcessingIFDPointer", 8256, 1)};
        f906H = new HashMap[10];
        f907I = new HashMap[10];
        f908J = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f909K = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f910L = charsetForName;
        f911M = "Exif\u0000\u0000".getBytes(charsetForName);
        f912N = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i3 = 0;
        while (true) {
            C0324d[][] c0324dArr6 = f904F;
            if (i3 >= c0324dArr6.length) {
                HashMap map = f909K;
                C0324d[] c0324dArr7 = f905G;
                map.put(Integer.valueOf(c0324dArr7[0].f893a), 5);
                map.put(Integer.valueOf(c0324dArr7[1].f893a), 1);
                map.put(Integer.valueOf(c0324dArr7[2].f893a), 2);
                map.put(Integer.valueOf(c0324dArr7[3].f893a), 3);
                map.put(Integer.valueOf(c0324dArr7[4].f893a), 7);
                map.put(Integer.valueOf(c0324dArr7[5].f893a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f906H[i3] = new HashMap();
            f907I[i3] = new HashMap();
            for (C0324d c0324d : c0324dArr6[i3]) {
                f906H[i3].put(Integer.valueOf(c0324d.f893a), c0324d);
                f907I[i3].put(c0324d.f894b, c0324d);
            }
            i3++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00aa A[Catch: all -> 0x0030, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0030, blocks: (B:3:0x0021, B:5:0x0024, B:12:0x0039, B:18:0x0056, B:20:0x0061, B:28:0x0077, B:23:0x0068, B:26:0x0070, B:27:0x0074, B:29:0x0081, B:31:0x008a, B:33:0x0090, B:35:0x0096, B:37:0x009c, B:42:0x00aa), top: B:52:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public C0327g(ByteArrayInputStream byteArrayInputStream) {
        C0324d[][] c0324dArr = f904F;
        this.f931d = new HashMap[c0324dArr.length];
        this.f932e = new HashSet(c0324dArr.length);
        this.f933f = ByteOrder.BIG_ENDIAN;
        boolean z3 = f913l;
        this.f929b = null;
        this.f928a = null;
        for (int i3 = 0; i3 < c0324dArr.length; i3++) {
            try {
                try {
                    this.f931d[i3] = new HashMap();
                } catch (Throwable th) {
                    m883a();
                    if (z3) {
                        m898p();
                    }
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
                if (z3) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m883a();
                if (!z3) {
                    return;
                }
            } catch (UnsupportedOperationException e4) {
                e = e4;
                if (z3) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                m883a();
                if (!z3) {
                    return;
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream, 5000);
        int iM888f = m888f(bufferedInputStream);
        this.f930c = iM888f;
        if (iM888f == 4 || iM888f == 9 || iM888f == 13 || iM888f == 14) {
            C0322b c0322b = new C0322b(bufferedInputStream);
            int i4 = this.f930c;
            if (i4 == 4) {
                m887e(c0322b, 0, 0);
            } else if (i4 == 13) {
                m890h(c0322b);
            } else if (i4 == 9) {
                m891i(c0322b);
            } else if (i4 == 14) {
                m894l(c0322b);
            }
        } else {
            C0326f c0326f = new C0326f(bufferedInputStream);
            int i5 = this.f930c;
            if (i5 == 12) {
                m886d(c0326f);
            } else if (i5 == 7) {
                m889g(c0326f);
            } else if (i5 == 10) {
                m893k(c0326f);
            } else {
                m892j(c0326f);
            }
            c0326f.m881b(this.f935h);
            m902u(c0326f);
        }
        m883a();
        if (!z3) {
            return;
        }
        m898p();
    }

    /* JADX INFO: renamed from: q */
    public static ByteOrder m882q(C0322b c0322b) throws IOException {
        short s3 = c0322b.readShort();
        boolean z3 = f913l;
        if (s3 == 18761) {
            if (z3) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s3 == 19789) {
            if (z3) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s3));
    }

    /* JADX INFO: renamed from: a */
    public final void m883a() {
        String strM884b = m884b("DateTimeOriginal");
        HashMap[] mapArr = this.f931d;
        if (strM884b != null && m884b("DateTime") == null) {
            HashMap map = mapArr[0];
            byte[] bytes = strM884b.concat("\u0000").getBytes(f910L);
            map.put("DateTime", new C0323c(bytes, 2, bytes.length));
        }
        if (m884b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", C0323c.m874a(0L, this.f933f));
        }
        if (m884b("ImageLength") == null) {
            mapArr[0].put("ImageLength", C0323c.m874a(0L, this.f933f));
        }
        if (m884b("Orientation") == null) {
            mapArr[0].put("Orientation", C0323c.m874a(0L, this.f933f));
        }
        if (m884b("LightSource") == null) {
            mapArr[1].put("LightSource", C0323c.m874a(0L, this.f933f));
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m884b(String str) {
        C0323c c0323cM885c = m885c(str);
        if (c0323cM885c != null) {
            if (!f908J.contains(str)) {
                return c0323cM885c.m879f(this.f933f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i3 = c0323cM885c.f889a;
                if (i3 != 5 && i3 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i3);
                    return null;
                }
                C0325e[] c0325eArr = (C0325e[]) c0323cM885c.m880g(this.f933f);
                if (c0325eArr == null || c0325eArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(c0325eArr));
                    return null;
                }
                C0325e c0325e = c0325eArr[0];
                Integer numValueOf = Integer.valueOf((int) (c0325e.f897a / c0325e.f898b));
                C0325e c0325e2 = c0325eArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c0325e2.f897a / c0325e2.f898b));
                C0325e c0325e3 = c0325eArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c0325e3.f897a / c0325e3.f898b)));
            }
            try {
                return Double.toString(c0323cM885c.m877d(this.f933f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final C0323c m885c(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (f913l) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i3 = 0; i3 < f904F.length; i3++) {
            C0323c c0323c = (C0323c) this.f931d[i3].get(str);
            if (c0323c != null) {
                return c0323c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m886d(C0326f c0326f) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                AbstractC0329i.m909a(mediaMetadataRetriever, new C0321a(c0326f));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f931d;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", C0323c.m876c(Integer.parseInt(strExtractMetadata), this.f933f));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", C0323c.m876c(Integer.parseInt(strExtractMetadata2), this.f933f));
                }
                if (strExtractMetadata3 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata3);
                    if (i4 == 90) {
                        i3 = 6;
                    } else if (i4 != 180) {
                        i3 = i4 != 270 ? 1 : 8;
                    } else {
                        i3 = 3;
                    }
                    mapArr[0].put("Orientation", C0323c.m876c(i3, this.f933f));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata4);
                    int i6 = Integer.parseInt(strExtractMetadata5);
                    if (i6 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c0326f.m881b(i5);
                    byte[] bArr = new byte[6];
                    if (c0326f.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i7 = i5 + 6;
                    int i8 = i6 - 6;
                    if (!Arrays.equals(bArr, f911M)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    if (c0326f.read(bArr2) != i8) {
                        throw new IOException("Can't read exif");
                    }
                    this.f935h = i7;
                    m899r(bArr2, 0);
                }
                if (f913l) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00ac A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x013f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0146 A[LOOP:2: B:69:0x013c->B:74:0x0146, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0158  */
    /* JADX WARN: Code duplicated, block: B:82:0x018e A[LOOP:0: B:10:0x0034->B:82:0x018e, LOOP_END] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1092)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    /* JADX INFO: renamed from: e */
    public final void m887e(p029K.C0322b r23, int r24, int r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p029K.C0327g.m887e(K.b, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:111:0x013f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:113:0x0142  */
    /* JADX WARN: Code duplicated, block: B:116:0x0148  */
    /* JADX WARN: Code duplicated, block: B:119:0x0150 A[LOOP:2: B:114:0x0143->B:119:0x0150, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:122:0x0156 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:124:0x0159  */
    /* JADX WARN: Code duplicated, block: B:127:0x015f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0167 A[LOOP:3: B:125:0x015a->B:130:0x0167, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:134:0x0170  */
    /* JADX WARN: Code duplicated, block: B:137:0x017a A[LOOP:4: B:132:0x016b->B:137:0x017a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:140:0x0180 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:142:0x0183 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:155:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0165 A[EDGE_INSN: B:171:0x0165->B:129:0x0165 BREAK  A[LOOP:3: B:125:0x015a->B:130:0x0167], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x016a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0165 A[EDGE_INSN: B:174:0x0165->B:129:0x0165 BREAK  A[LOOP:3: B:125:0x015a->B:130:0x0167], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x0109 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:95:0x0120  */
    /* JADX WARN: Code duplicated, block: B:96:0x0122  */
    /* JADX INFO: renamed from: f */
    public final int m888f(BufferedInputStream bufferedInputStream) throws Throwable {
        int i3;
        C0322b c0322b;
        C0322b c0322b2;
        boolean z3;
        boolean z4;
        int i4;
        byte[] bArr;
        boolean z5;
        int i5;
        byte[] bArr2;
        int i6;
        byte[] bArr3;
        boolean z6;
        C0322b c0322b3;
        short s3;
        long j3;
        bufferedInputStream.mark(5000);
        byte[] bArr4 = new byte[5000];
        bufferedInputStream.read(bArr4);
        bufferedInputStream.reset();
        int i7 = 0;
        while (true) {
            byte[] bArr5 = f916o;
            if (i7 >= bArr5.length) {
                return 4;
            }
            if (bArr4[i7] != bArr5[i7]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i8 = 0; i8 < bytes.length; i8++) {
                    if (bArr4[i8] != bytes[i8]) {
                        C0322b c0322b4 = null;
                        try {
                            try {
                                try {
                                    c0322b = new C0322b(bArr4);
                                    try {
                                        try {
                                            long j4 = c0322b.readInt();
                                            byte[] bArr6 = new byte[4];
                                            c0322b.read(bArr6);
                                            if (Arrays.equals(bArr6, f917p)) {
                                                if (j4 == 1) {
                                                    j4 = c0322b.readLong();
                                                    j3 = 16;
                                                    if (j4 < 16) {
                                                    }
                                                    c0322b2 = new C0322b(bArr4);
                                                    ByteOrder byteOrderM882q = m882q(c0322b2);
                                                    this.f933f = byteOrderM882q;
                                                    c0322b2.f886h = byteOrderM882q;
                                                    s3 = c0322b2.readShort();
                                                    if (s3 != 20306 || s3 == 21330) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    c0322b2.close();
                                                    if (z3) {
                                                        return 7;
                                                    }
                                                    try {
                                                        c0322b3 = new C0322b(bArr4);
                                                        try {
                                                            ByteOrder byteOrderM882q2 = m882q(c0322b3);
                                                            this.f933f = byteOrderM882q2;
                                                            c0322b3.f886h = byteOrderM882q2;
                                                            if (c0322b3.readShort() == 85) {
                                                                z4 = true;
                                                            } else {
                                                                z4 = false;
                                                            }
                                                            c0322b3.close();
                                                        } catch (Exception unused) {
                                                            c0322b4 = c0322b3;
                                                            if (c0322b4 != null) {
                                                                c0322b4.close();
                                                            }
                                                            z4 = false;
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            c0322b4 = c0322b3;
                                                            if (c0322b4 != null) {
                                                                c0322b4.close();
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (Exception unused2) {
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                    }
                                                    if (z4) {
                                                        return 10;
                                                    }
                                                    i4 = 0;
                                                    while (true) {
                                                        bArr = f922u;
                                                        if (i4 < bArr.length) {
                                                            z5 = true;
                                                            break;
                                                        }
                                                        if (bArr4[i4] != bArr[i4]) {
                                                            z5 = false;
                                                            break;
                                                        }
                                                        i4++;
                                                    }
                                                    if (z5) {
                                                        return 13;
                                                    }
                                                    i5 = 0;
                                                    while (true) {
                                                        bArr2 = f926y;
                                                        if (i5 < bArr2.length) {
                                                            i6 = 0;
                                                            while (true) {
                                                                bArr3 = f927z;
                                                                if (i6 < bArr3.length) {
                                                                    z6 = true;
                                                                    break;
                                                                }
                                                                if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                    break;
                                                                }
                                                                i6++;
                                                            }
                                                            if (z6) {
                                                                return 14;
                                                            }
                                                            return i3;
                                                        }
                                                        if (bArr4[i5] != bArr2[i5]) {
                                                            break;
                                                        }
                                                        i5++;
                                                    }
                                                    z6 = false;
                                                    if (z6) {
                                                        return 14;
                                                    }
                                                    return i3;
                                                }
                                                j3 = 8;
                                                i3 = 0;
                                                long j5 = 5000;
                                                if (j4 > j5) {
                                                    j4 = j5;
                                                }
                                                long j6 = j4 - j3;
                                                if (j6 >= 8) {
                                                    try {
                                                        byte[] bArr7 = new byte[4];
                                                        boolean z7 = false;
                                                        boolean z8 = false;
                                                        for (long j7 = 0; j7 < j6 / 4 && c0322b.read(bArr7) == 4; j7++) {
                                                            if (j7 != 1) {
                                                                if (Arrays.equals(bArr7, f918q)) {
                                                                    z7 = true;
                                                                } else if (Arrays.equals(bArr7, f919r)) {
                                                                    z8 = true;
                                                                }
                                                                if (z7 && z8) {
                                                                    c0322b.close();
                                                                    return 12;
                                                                }
                                                            }
                                                        }
                                                    } catch (Exception e3) {
                                                        e = e3;
                                                        if (f913l) {
                                                            Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                        }
                                                        if (c0322b != null) {
                                                        }
                                                        c0322b2 = new C0322b(bArr4);
                                                        ByteOrder byteOrderM882q3 = m882q(c0322b2);
                                                        this.f933f = byteOrderM882q3;
                                                        c0322b2.f886h = byteOrderM882q3;
                                                        s3 = c0322b2.readShort();
                                                        if (s3 != 20306) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = true;
                                                        }
                                                        c0322b2.close();
                                                        if (z3) {
                                                            return 7;
                                                        }
                                                        c0322b3 = new C0322b(bArr4);
                                                        ByteOrder byteOrderM882q4 = m882q(c0322b3);
                                                        this.f933f = byteOrderM882q4;
                                                        c0322b3.f886h = byteOrderM882q4;
                                                        if (c0322b3.readShort() == 85) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        c0322b3.close();
                                                        if (z4) {
                                                            return 10;
                                                        }
                                                        i4 = 0;
                                                        while (true) {
                                                            bArr = f922u;
                                                            if (i4 < bArr.length) {
                                                                z5 = true;
                                                                break;
                                                            }
                                                            if (bArr4[i4] != bArr[i4]) {
                                                                z5 = false;
                                                                break;
                                                            }
                                                            i4++;
                                                        }
                                                        if (z5) {
                                                            return 13;
                                                        }
                                                        i5 = 0;
                                                        while (true) {
                                                            bArr2 = f926y;
                                                            if (i5 < bArr2.length) {
                                                                i6 = 0;
                                                                while (true) {
                                                                    bArr3 = f927z;
                                                                    if (i6 < bArr3.length) {
                                                                        z6 = true;
                                                                        break;
                                                                    }
                                                                    if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    i6++;
                                                                }
                                                                if (z6) {
                                                                    return 14;
                                                                }
                                                                return i3;
                                                            }
                                                            if (bArr4[i5] != bArr2[i5]) {
                                                                break;
                                                                break;
                                                            }
                                                            i5++;
                                                        }
                                                        z6 = false;
                                                        if (z6) {
                                                            return 14;
                                                        }
                                                        return i3;
                                                    }
                                                }
                                                c0322b.close();
                                                c0322b2 = new C0322b(bArr4);
                                                ByteOrder byteOrderM882q5 = m882q(c0322b2);
                                                this.f933f = byteOrderM882q5;
                                                c0322b2.f886h = byteOrderM882q5;
                                                s3 = c0322b2.readShort();
                                                if (s3 != 20306) {
                                                    z3 = true;
                                                } else {
                                                    z3 = true;
                                                }
                                                c0322b2.close();
                                                if (z3) {
                                                    return 7;
                                                }
                                                c0322b3 = new C0322b(bArr4);
                                                ByteOrder byteOrderM882q6 = m882q(c0322b3);
                                                this.f933f = byteOrderM882q6;
                                                c0322b3.f886h = byteOrderM882q6;
                                                if (c0322b3.readShort() == 85) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                c0322b3.close();
                                                if (z4) {
                                                    return 10;
                                                }
                                                i4 = 0;
                                                while (true) {
                                                    bArr = f922u;
                                                    if (i4 < bArr.length) {
                                                        z5 = true;
                                                        break;
                                                    }
                                                    if (bArr4[i4] != bArr[i4]) {
                                                        z5 = false;
                                                        break;
                                                    }
                                                    i4++;
                                                }
                                                if (z5) {
                                                    return 13;
                                                }
                                                i5 = 0;
                                                while (true) {
                                                    bArr2 = f926y;
                                                    if (i5 < bArr2.length) {
                                                        i6 = 0;
                                                        while (true) {
                                                            bArr3 = f927z;
                                                            if (i6 < bArr3.length) {
                                                                z6 = true;
                                                                break;
                                                            }
                                                            if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                                                break;
                                                                break;
                                                            }
                                                            i6++;
                                                        }
                                                        if (z6) {
                                                            return 14;
                                                        }
                                                        return i3;
                                                    }
                                                    if (bArr4[i5] != bArr2[i5]) {
                                                        break;
                                                        break;
                                                    }
                                                    i5++;
                                                }
                                                z6 = false;
                                                if (z6) {
                                                    return 14;
                                                }
                                                return i3;
                                            }
                                            c0322b.close();
                                            i3 = 0;
                                        } catch (Exception e4) {
                                            e = e4;
                                            i3 = 0;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c0322b4 = c0322b;
                                        if (c0322b4 != null) {
                                            c0322b4.close();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    i3 = 0;
                                    c0322b = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                ByteOrder byteOrderM882q7 = m882q(c0322b2);
                                this.f933f = byteOrderM882q7;
                                c0322b2.f886h = byteOrderM882q7;
                                s3 = c0322b2.readShort();
                                if (s3 != 20306) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                c0322b2.close();
                            } catch (Exception unused3) {
                                if (c0322b2 != null) {
                                    c0322b2.close();
                                }
                                z3 = false;
                            } catch (Throwable th5) {
                                th = th5;
                                c0322b4 = c0322b2;
                                if (c0322b4 != null) {
                                    c0322b4.close();
                                }
                                throw th;
                            }
                            c0322b2 = new C0322b(bArr4);
                        } catch (Exception unused4) {
                            c0322b2 = null;
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        if (z3) {
                            return 7;
                        }
                        c0322b3 = new C0322b(bArr4);
                        ByteOrder byteOrderM882q8 = m882q(c0322b3);
                        this.f933f = byteOrderM882q8;
                        c0322b3.f886h = byteOrderM882q8;
                        if (c0322b3.readShort() == 85) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c0322b3.close();
                        if (z4) {
                            return 10;
                        }
                        i4 = 0;
                        while (true) {
                            bArr = f922u;
                            if (i4 < bArr.length) {
                                z5 = true;
                                break;
                            }
                            if (bArr4[i4] != bArr[i4]) {
                                z5 = false;
                                break;
                            }
                            i4++;
                        }
                        if (z5) {
                            return 13;
                        }
                        i5 = 0;
                        while (true) {
                            bArr2 = f926y;
                            if (i5 < bArr2.length) {
                                i6 = 0;
                                while (true) {
                                    bArr3 = f927z;
                                    if (i6 < bArr3.length) {
                                        z6 = true;
                                        break;
                                    }
                                    if (bArr4[bArr2.length + i6 + 4] != bArr3[i6]) {
                                        break;
                                        break;
                                    }
                                    i6++;
                                }
                                if (z6) {
                                    return 14;
                                }
                                return i3;
                            }
                            if (bArr4[i5] != bArr2[i5]) {
                                break;
                                break;
                            }
                            i5++;
                        }
                        z6 = false;
                        if (z6) {
                            return 14;
                        }
                        return i3;
                    }
                }
                return 9;
            }
            i7++;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m889g(C0326f c0326f) throws IOException {
        int i3;
        int i4;
        m892j(c0326f);
        HashMap[] mapArr = this.f931d;
        C0323c c0323c = (C0323c) mapArr[1].get("MakerNote");
        if (c0323c != null) {
            C0326f c0326f2 = new C0326f(c0323c.f892d);
            c0326f2.f886h = this.f933f;
            byte[] bArr = f920s;
            byte[] bArr2 = new byte[bArr.length];
            c0326f2.readFully(bArr2);
            c0326f2.m881b(0L);
            byte[] bArr3 = f921t;
            byte[] bArr4 = new byte[bArr3.length];
            c0326f2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c0326f2.m881b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c0326f2.m881b(12L);
            }
            m900s(c0326f2, 6);
            C0323c c0323c2 = (C0323c) mapArr[7].get("PreviewImageStart");
            C0323c c0323c3 = (C0323c) mapArr[7].get("PreviewImageLength");
            if (c0323c2 != null && c0323c3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", c0323c2);
                mapArr[5].put("JPEGInterchangeFormatLength", c0323c3);
            }
            C0323c c0323c4 = (C0323c) mapArr[8].get("AspectFrame");
            if (c0323c4 != null) {
                int[] iArr = (int[]) c0323c4.m880g(this.f933f);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i5 = iArr[2];
                int i6 = iArr[0];
                if (i5 <= i6 || (i3 = iArr[3]) <= (i4 = iArr[1])) {
                    return;
                }
                int i7 = (i5 - i6) + 1;
                int i8 = (i3 - i4) + 1;
                if (i7 < i8) {
                    int i9 = i7 + i8;
                    i8 = i9 - i8;
                    i7 = i9 - i8;
                }
                C0323c c0323cM876c = C0323c.m876c(i7, this.f933f);
                C0323c c0323cM876c2 = C0323c.m876c(i8, this.f933f);
                mapArr[0].put("ImageWidth", c0323cM876c);
                mapArr[0].put("ImageLength", c0323cM876c2);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m890h(C0322b c0322b) throws IOException {
        if (f913l) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c0322b);
        }
        c0322b.f886h = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f922u;
        c0322b.m873a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i3 = c0322b.readInt();
                byte[] bArr2 = new byte[4];
                if (c0322b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i4 = length + 8;
                if (i4 == 16 && !Arrays.equals(bArr2, f924w)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f925x)) {
                    return;
                }
                if (Arrays.equals(bArr2, f923v)) {
                    byte[] bArr3 = new byte[i3];
                    if (c0322b.read(bArr3) != i3) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC0664e.m1743c(bArr2));
                    }
                    int i5 = c0322b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i5) {
                        this.f935h = i4;
                        m899r(bArr3, 0);
                        m905x();
                        m902u(new C0322b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i5 + ", calculated CRC value: " + crc32.getValue());
                }
                int i6 = i3 + 4;
                c0322b.m873a(i6);
                length = i4 + i6;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m891i(C0322b c0322b) throws IOException {
        boolean z3 = f913l;
        if (z3) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c0322b);
        }
        c0322b.m873a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c0322b.read(bArr);
        c0322b.read(bArr2);
        c0322b.read(bArr3);
        int i3 = ByteBuffer.wrap(bArr).getInt();
        int i4 = ByteBuffer.wrap(bArr2).getInt();
        int i5 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i4];
        c0322b.m873a(i3 - c0322b.f887i);
        c0322b.read(bArr4);
        m887e(new C0322b(bArr4), i3, 5);
        c0322b.m873a(i5 - c0322b.f887i);
        c0322b.f886h = ByteOrder.BIG_ENDIAN;
        int i6 = c0322b.readInt();
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i6);
        }
        for (int i7 = 0; i7 < i6; i7++) {
            int unsignedShort = c0322b.readUnsignedShort();
            int unsignedShort2 = c0322b.readUnsignedShort();
            if (unsignedShort == f903E.f893a) {
                short s3 = c0322b.readShort();
                short s4 = c0322b.readShort();
                C0323c c0323cM876c = C0323c.m876c(s3, this.f933f);
                C0323c c0323cM876c2 = C0323c.m876c(s4, this.f933f);
                HashMap[] mapArr = this.f931d;
                mapArr[0].put("ImageLength", c0323cM876c);
                mapArr[0].put("ImageWidth", c0323cM876c2);
                if (z3) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s3) + ", width: " + ((int) s4));
                    return;
                }
                return;
            }
            c0322b.m873a(unsignedShort2);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m892j(C0326f c0326f) throws IOException {
        m897o(c0326f);
        m900s(c0326f, 0);
        m904w(c0326f, 0);
        m904w(c0326f, 5);
        m904w(c0326f, 4);
        m905x();
        if (this.f930c == 8) {
            HashMap[] mapArr = this.f931d;
            C0323c c0323c = (C0323c) mapArr[1].get("MakerNote");
            if (c0323c != null) {
                C0326f c0326f2 = new C0326f(c0323c.f892d);
                c0326f2.f886h = this.f933f;
                c0326f2.m873a(6);
                m900s(c0326f2, 9);
                C0323c c0323c2 = (C0323c) mapArr[9].get("ColorSpace");
                if (c0323c2 != null) {
                    mapArr[1].put("ColorSpace", c0323c2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m893k(C0326f c0326f) throws IOException {
        if (f913l) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c0326f);
        }
        m892j(c0326f);
        HashMap[] mapArr = this.f931d;
        C0323c c0323c = (C0323c) mapArr[0].get("JpgFromRaw");
        if (c0323c != null) {
            m887e(new C0322b(c0323c.f892d), (int) c0323c.f891c, 5);
        }
        C0323c c0323c2 = (C0323c) mapArr[0].get("ISO");
        C0323c c0323c3 = (C0323c) mapArr[1].get("PhotographicSensitivity");
        if (c0323c2 == null || c0323c3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", c0323c2);
    }

    /* JADX INFO: renamed from: l */
    public final void m894l(C0322b c0322b) throws IOException {
        if (f913l) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c0322b);
        }
        c0322b.f886h = ByteOrder.LITTLE_ENDIAN;
        c0322b.m873a(f926y.length);
        int i3 = c0322b.readInt() + 8;
        byte[] bArr = f927z;
        c0322b.m873a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c0322b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i4 = c0322b.readInt();
                int i5 = length + 8;
                if (Arrays.equals(f899A, bArr2)) {
                    byte[] bArr3 = new byte[i4];
                    if (c0322b.read(bArr3) == i4) {
                        this.f935h = i5;
                        m899r(bArr3, 0);
                        m902u(new C0322b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + AbstractC0664e.m1743c(bArr2));
                    }
                }
                if (i4 % 2 == 1) {
                    i4++;
                }
                length = i5 + i4;
                if (length == i3) {
                    return;
                }
                if (length > i3) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c0322b.m873a(i4);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m895m(C0322b c0322b, HashMap map) throws IOException {
        C0323c c0323c = (C0323c) map.get("JPEGInterchangeFormat");
        C0323c c0323c2 = (C0323c) map.get("JPEGInterchangeFormatLength");
        if (c0323c == null || c0323c2 == null) {
            return;
        }
        int iM878e = c0323c.m878e(this.f933f);
        int iM878e2 = c0323c2.m878e(this.f933f);
        if (this.f930c == 7) {
            iM878e += this.f936i;
        }
        if (iM878e > 0 && iM878e2 > 0 && this.f929b == null && this.f928a == null) {
            c0322b.skip(iM878e);
            c0322b.read(new byte[iM878e2]);
        }
        if (f913l) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iM878e + ", length: " + iM878e2);
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m896n(HashMap map) {
        C0323c c0323c = (C0323c) map.get("ImageLength");
        C0323c c0323c2 = (C0323c) map.get("ImageWidth");
        if (c0323c == null || c0323c2 == null) {
            return false;
        }
        return c0323c.m878e(this.f933f) <= 512 && c0323c2.m878e(this.f933f) <= 512;
    }

    /* JADX INFO: renamed from: o */
    public final void m897o(C0326f c0326f) throws IOException {
        ByteOrder byteOrderM882q = m882q(c0326f);
        this.f933f = byteOrderM882q;
        c0326f.f886h = byteOrderM882q;
        int unsignedShort = c0326f.readUnsignedShort();
        int i3 = this.f930c;
        if (i3 != 7 && i3 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i4 = c0326f.readInt();
        if (i4 < 8) {
            throw new IOException(AbstractC0462h.m1165e(i4, "Invalid first Ifd offset: "));
        }
        int i5 = i4 - 8;
        if (i5 > 0) {
            c0326f.m873a(i5);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m898p() {
        int i3 = 0;
        while (true) {
            HashMap[] mapArr = this.f931d;
            if (i3 >= mapArr.length) {
                return;
            }
            Log.d("ExifInterface", "The size of tag group[" + i3 + "]: " + mapArr[i3].size());
            for (Map.Entry entry : mapArr[i3].entrySet()) {
                C0323c c0323c = (C0323c) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + c0323c.toString() + ", tagValue: '" + c0323c.m879f(this.f933f) + "'");
            }
            i3++;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m899r(byte[] bArr, int i3) throws IOException {
        C0326f c0326f = new C0326f(bArr);
        m897o(c0326f);
        m900s(c0326f, i3);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0229  */
    /* JADX WARN: Code duplicated, block: B:108:0x023a  */
    /* JADX WARN: Code duplicated, block: B:109:0x023f  */
    /* JADX WARN: Code duplicated, block: B:110:0x024b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0252  */
    /* JADX WARN: Code duplicated, block: B:113:0x0269  */
    /* JADX WARN: Code duplicated, block: B:116:0x026e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0279  */
    /* JADX WARN: Code duplicated, block: B:120:0x0286 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:121:0x0288  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:125:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:127:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:141:0x032c  */
    /* JADX WARN: Code duplicated, block: B:168:0x032f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:68:0x014d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0163  */
    /* JADX WARN: Code duplicated, block: B:72:0x016e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0174  */
    /* JADX WARN: Code duplicated, block: B:76:0x017e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0192  */
    /* JADX WARN: Code duplicated, block: B:80:0x0199  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:93:0x0204  */
    /* JADX WARN: Code duplicated, block: B:95:0x021f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0222  */
    /* JADX WARN: Code duplicated, block: B:99:0x0225  */
    /* JADX WARN: Instruction removed from duplicated block: B:121:0x0288, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:123:0x02a9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x014d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x017e, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x0204, please report this as an issue */
    /* JADX INFO: renamed from: s */
    public final void m900s(C0326f c0326f, int i3) throws IOException {
        HashMap[] mapArr;
        int i4;
        long j3;
        boolean z3;
        int i5;
        boolean z4;
        Integer num;
        long j4;
        String str;
        int unsignedShort;
        long j5;
        int i6;
        Integer numValueOf = Integer.valueOf(c0326f.f887i);
        HashSet hashSet = this.f932e;
        hashSet.add(numValueOf);
        short s3 = c0326f.readShort();
        boolean z5 = f913l;
        if (z5) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s3));
        }
        if (s3 <= 0) {
            return;
        }
        short s4 = 0;
        while (true) {
            mapArr = this.f931d;
            if (s4 >= s3) {
                break;
            }
            int unsignedShort2 = c0326f.readUnsignedShort();
            int unsignedShort3 = c0326f.readUnsignedShort();
            int i7 = c0326f.readInt();
            long j6 = ((long) c0326f.f887i) + 4;
            C0324d c0324d = (C0324d) f906H[i3].get(Integer.valueOf(unsignedShort2));
            if (z5) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i3), Integer.valueOf(unsignedShort2), c0324d != null ? c0324d.f894b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i7)));
            }
            if (c0324d == null) {
                if (z5) {
                    Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
                }
                i4 = unsignedShort2;
            } else {
                if (unsignedShort3 > 0) {
                    int[] iArr = f901C;
                    if (unsignedShort3 >= iArr.length) {
                        i4 = unsignedShort2;
                        if (z5) {
                            Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                        }
                    } else {
                        int i8 = c0324d.f895c;
                        if (i8 == 7 || unsignedShort3 == 7 || i8 == unsignedShort3 || (i5 = c0324d.f896d) == unsignedShort3) {
                            i4 = unsignedShort2;
                        } else {
                            i4 = unsignedShort2;
                            if (((i8 != 4 && i5 != 4) || unsignedShort3 != 3) && (((i8 != 9 && i5 != 9) || unsignedShort3 != 8) && ((i8 != 12 && i5 != 12) || unsignedShort3 != 11))) {
                                if (z5) {
                                    Log.d("ExifInterface", "Skip the tag entry since data format (" + f900B[unsignedShort3] + ") is unexpected for tag: " + c0324d.f894b);
                                }
                            }
                        }
                        if (unsignedShort3 == 7) {
                            unsignedShort3 = i8;
                        }
                        j3 = ((long) iArr[unsignedShort3]) * ((long) i7);
                        if (j3 < 0 || j3 > 2147483647L) {
                            if (z5) {
                                Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i7);
                            }
                            j3 = j3;
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                    }
                } else {
                    i4 = unsignedShort2;
                    if (z5) {
                        Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                    }
                }
                if (z3) {
                    if (j3 > 4) {
                        z4 = z5;
                        i6 = c0326f.readInt();
                        if (z4) {
                            Log.d("ExifInterface", "seek to data offset: " + i6);
                        }
                        if (this.f930c != 7) {
                            if ("MakerNote".equals(c0324d.f894b)) {
                                this.f936i = i6;
                            } else if (i3 != 6 && "ThumbnailImage".equals(c0324d.f894b)) {
                                this.f937j = i6;
                                this.f938k = i7;
                                C0323c c0323cM876c = C0323c.m876c(6, this.f933f);
                                C0323c c0323cM874a = C0323c.m874a(this.f937j, this.f933f);
                                C0323c c0323cM874a2 = C0323c.m874a(this.f938k, this.f933f);
                                mapArr[4].put("Compression", c0323cM876c);
                                mapArr[4].put("JPEGInterchangeFormat", c0323cM874a);
                                mapArr[4].put("JPEGInterchangeFormatLength", c0323cM874a2);
                            }
                        }
                        c0326f.m881b(i6);
                    } else {
                        j6 = j6;
                        z4 = z5;
                        mapArr = mapArr;
                    }
                    num = (Integer) f909K.get(Integer.valueOf(i4));
                    if (z4) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j3);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 != 4) {
                                j5 = ((long) c0326f.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                unsignedShort = c0326f.readShort();
                            } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                unsignedShort = c0326f.readInt();
                            } else {
                                j5 = -1;
                            }
                            if (z4) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c0324d.f894b));
                            }
                            if (j5 > 0) {
                                if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                    c0326f.m881b(j5);
                                    m900s(c0326f, num.intValue());
                                } else if (z4) {
                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                }
                            } else if (z4) {
                                Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                            }
                            c0326f.m881b(j6);
                        } else {
                            unsignedShort = c0326f.readUnsignedShort();
                        }
                        j5 = unsignedShort;
                        if (z4) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c0324d.f894b));
                        }
                        if (j5 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                c0326f.m881b(j5);
                                m900s(c0326f, num.intValue());
                            } else if (z4) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                            }
                        } else if (z4) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                        }
                        c0326f.m881b(j6);
                    } else {
                        j4 = j6;
                        int i9 = c0326f.f887i + this.f935h;
                        byte[] bArr = new byte[(int) j3];
                        c0326f.readFully(bArr);
                        C0323c c0323c = new C0323c(i9, bArr, unsignedShort3, i7);
                        mapArr[i3].put(c0324d.f894b, c0323c);
                        str = c0324d.f894b;
                        if ("DNGVersion".equals(str)) {
                            this.f930c = 3;
                        }
                        if (((!"Make".equals(str) || "Model".equals(str)) && c0323c.m879f(this.f933f).contains("PENTAX")) || ("Compression".equals(str) && c0323c.m878e(this.f933f) == 65535)) {
                            this.f930c = 8;
                        }
                        if (c0326f.f887i != j4) {
                            c0326f.m881b(j4);
                        }
                    }
                } else {
                    c0326f.m881b(j6);
                    z4 = z5;
                    s4 = s4;
                }
                s4 = (short) (s4 + 1);
                s3 = s3;
                z5 = z4;
            }
            j3 = 0;
            z3 = false;
            if (z3) {
                c0326f.m881b(j6);
                z4 = z5;
                s4 = s4;
            } else {
                if (j3 > 4) {
                    z4 = z5;
                    i6 = c0326f.readInt();
                    if (z4) {
                        Log.d("ExifInterface", "seek to data offset: " + i6);
                    }
                    if (this.f930c != 7) {
                        if ("MakerNote".equals(c0324d.f894b)) {
                            this.f936i = i6;
                        } else if (i3 != 6) {
                        }
                    }
                    c0326f.m881b(i6);
                } else {
                    j6 = j6;
                    z4 = z5;
                    mapArr = mapArr;
                }
                num = (Integer) f909K.get(Integer.valueOf(i4));
                if (z4) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j3);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 != 4) {
                            j5 = ((long) c0326f.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = c0326f.readInt();
                        } else {
                            unsignedShort = c0326f.readShort();
                        }
                        if (z4) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c0324d.f894b));
                        }
                        if (j5 > 0) {
                            if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                c0326f.m881b(j5);
                                m900s(c0326f, num.intValue());
                            } else if (z4) {
                                Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                            }
                        } else if (z4) {
                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                        }
                        c0326f.m881b(j6);
                    } else {
                        unsignedShort = c0326f.readUnsignedShort();
                    }
                    j5 = unsignedShort;
                    if (z4) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), c0324d.f894b));
                    }
                    if (j5 > 0) {
                        if (!hashSet.contains(Integer.valueOf((int) j5))) {
                            c0326f.m881b(j5);
                            m900s(c0326f, num.intValue());
                        } else if (z4) {
                            Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                        }
                    } else if (z4) {
                        Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j5);
                    }
                    c0326f.m881b(j6);
                } else {
                    j4 = j6;
                    int i10 = c0326f.f887i + this.f935h;
                    byte[] bArr2 = new byte[(int) j3];
                    c0326f.readFully(bArr2);
                    C0323c c0323c2 = new C0323c(i10, bArr2, unsignedShort3, i7);
                    mapArr[i3].put(c0324d.f894b, c0323c2);
                    str = c0324d.f894b;
                    if ("DNGVersion".equals(str)) {
                        this.f930c = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.f930c = 8;
                    if (c0326f.f887i != j4) {
                        c0326f.m881b(j4);
                    }
                }
            }
            s4 = (short) (s4 + 1);
            s3 = s3;
            z5 = z4;
        }
        boolean z6 = z5;
        int i11 = c0326f.readInt();
        if (z6) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i11)));
        }
        long j7 = i11;
        if (j7 <= 0) {
            if (z6) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        if (hashSet.contains(Integer.valueOf(i11))) {
            if (z6) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        c0326f.m881b(j7);
        if (mapArr[4].isEmpty()) {
            m900s(c0326f, 4);
        } else if (mapArr[5].isEmpty()) {
            m900s(c0326f, 5);
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m901t(String str, String str2, int i3) {
        HashMap[] mapArr = this.f931d;
        if (mapArr[i3].isEmpty() || mapArr[i3].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i3];
        map.put(str2, map.get(str));
        mapArr[i3].remove(str);
    }

    /* JADX INFO: renamed from: u */
    public final void m902u(C0322b c0322b) throws IOException {
        C0323c c0323c;
        int iM878e;
        HashMap map = this.f931d[4];
        C0323c c0323c2 = (C0323c) map.get("Compression");
        if (c0323c2 == null) {
            m895m(c0322b, map);
            return;
        }
        int iM878e2 = c0323c2.m878e(this.f933f);
        int i3 = 1;
        if (iM878e2 != 1) {
            if (iM878e2 == 6) {
                m895m(c0322b, map);
                return;
            } else if (iM878e2 != 7) {
                return;
            }
        }
        C0323c c0323c3 = (C0323c) map.get("BitsPerSample");
        if (c0323c3 != null) {
            int[] iArr = (int[]) c0323c3.m880g(this.f933f);
            int[] iArr2 = f914m;
            if (Arrays.equals(iArr2, iArr) || (this.f930c == 3 && (c0323c = (C0323c) map.get("PhotometricInterpretation")) != null && (((iM878e = c0323c.m878e(this.f933f)) == 1 && Arrays.equals(iArr, f915n)) || (iM878e == 6 && Arrays.equals(iArr, iArr2))))) {
                C0323c c0323c4 = (C0323c) map.get("StripOffsets");
                C0323c c0323c5 = (C0323c) map.get("StripByteCounts");
                if (c0323c4 == null || c0323c5 == null) {
                    return;
                }
                long[] jArrM1749j = AbstractC0664e.m1749j(c0323c4.m880g(this.f933f));
                long[] jArrM1749j2 = AbstractC0664e.m1749j(c0323c5.m880g(this.f933f));
                if (jArrM1749j == null || jArrM1749j.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrM1749j2 == null || jArrM1749j2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrM1749j.length != jArrM1749j2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j3 = 0;
                for (long j4 : jArrM1749j2) {
                    j3 += j4;
                }
                byte[] bArr = new byte[(int) j3];
                this.f934g = true;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (i4 < jArrM1749j.length) {
                    int i7 = (int) jArrM1749j[i4];
                    int i8 = (int) jArrM1749j2[i4];
                    if (i4 < jArrM1749j.length - i3 && i7 + i8 != jArrM1749j[i4 + 1]) {
                        this.f934g = false;
                    }
                    int i9 = i7 - i5;
                    if (i9 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j5 = i9;
                    if (c0322b.skip(j5) != j5) {
                        Log.d("ExifInterface", "Failed to skip " + i9 + " bytes.");
                        return;
                    }
                    int i10 = i5 + i9;
                    byte[] bArr2 = new byte[i8];
                    if (c0322b.read(bArr2) != i8) {
                        Log.d("ExifInterface", "Failed to read " + i8 + " bytes.");
                        return;
                    }
                    i5 = i10 + i8;
                    System.arraycopy(bArr2, 0, bArr, i6, i8);
                    i6 += i8;
                    i4++;
                    i3 = 1;
                }
                if (this.f934g) {
                    long j6 = jArrM1749j[0];
                    return;
                }
                return;
            }
        }
        if (f913l) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m903v(int i3, int i4) {
        HashMap[] mapArr = this.f931d;
        boolean zIsEmpty = mapArr[i3].isEmpty();
        boolean z3 = f913l;
        if (zIsEmpty || mapArr[i4].isEmpty()) {
            if (z3) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        C0323c c0323c = (C0323c) mapArr[i3].get("ImageLength");
        C0323c c0323c2 = (C0323c) mapArr[i3].get("ImageWidth");
        C0323c c0323c3 = (C0323c) mapArr[i4].get("ImageLength");
        C0323c c0323c4 = (C0323c) mapArr[i4].get("ImageWidth");
        if (c0323c == null || c0323c2 == null) {
            if (z3) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (c0323c3 == null || c0323c4 == null) {
            if (z3) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iM878e = c0323c.m878e(this.f933f);
        int iM878e2 = c0323c2.m878e(this.f933f);
        int iM878e3 = c0323c3.m878e(this.f933f);
        int iM878e4 = c0323c4.m878e(this.f933f);
        if (iM878e >= iM878e3 || iM878e2 >= iM878e4) {
            return;
        }
        HashMap map = mapArr[i3];
        mapArr[i3] = mapArr[i4];
        mapArr[i4] = map;
    }

    /* JADX INFO: renamed from: w */
    public final void m904w(C0326f c0326f, int i3) throws IOException {
        C0323c c0323cM876c;
        C0323c c0323cM876c2;
        HashMap[] mapArr = this.f931d;
        C0323c c0323c = (C0323c) mapArr[i3].get("DefaultCropSize");
        C0323c c0323c2 = (C0323c) mapArr[i3].get("SensorTopBorder");
        C0323c c0323c3 = (C0323c) mapArr[i3].get("SensorLeftBorder");
        C0323c c0323c4 = (C0323c) mapArr[i3].get("SensorBottomBorder");
        C0323c c0323c5 = (C0323c) mapArr[i3].get("SensorRightBorder");
        if (c0323c != null) {
            if (c0323c.f889a == 5) {
                C0325e[] c0325eArr = (C0325e[]) c0323c.m880g(this.f933f);
                if (c0325eArr == null || c0325eArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(c0325eArr));
                    return;
                }
                c0323cM876c = C0323c.m875b(c0325eArr[0], this.f933f);
                c0323cM876c2 = C0323c.m875b(c0325eArr[1], this.f933f);
            } else {
                int[] iArr = (int[]) c0323c.m880g(this.f933f);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c0323cM876c = C0323c.m876c(iArr[0], this.f933f);
                c0323cM876c2 = C0323c.m876c(iArr[1], this.f933f);
            }
            mapArr[i3].put("ImageWidth", c0323cM876c);
            mapArr[i3].put("ImageLength", c0323cM876c2);
            return;
        }
        if (c0323c2 != null && c0323c3 != null && c0323c4 != null && c0323c5 != null) {
            int iM878e = c0323c2.m878e(this.f933f);
            int iM878e2 = c0323c4.m878e(this.f933f);
            int iM878e3 = c0323c5.m878e(this.f933f);
            int iM878e4 = c0323c3.m878e(this.f933f);
            if (iM878e2 <= iM878e || iM878e3 <= iM878e4) {
                return;
            }
            C0323c c0323cM876c3 = C0323c.m876c(iM878e2 - iM878e, this.f933f);
            C0323c c0323cM876c4 = C0323c.m876c(iM878e3 - iM878e4, this.f933f);
            mapArr[i3].put("ImageLength", c0323cM876c3);
            mapArr[i3].put("ImageWidth", c0323cM876c4);
            return;
        }
        C0323c c0323c6 = (C0323c) mapArr[i3].get("ImageLength");
        C0323c c0323c7 = (C0323c) mapArr[i3].get("ImageWidth");
        if (c0323c6 == null || c0323c7 == null) {
            C0323c c0323c8 = (C0323c) mapArr[i3].get("JPEGInterchangeFormat");
            C0323c c0323c9 = (C0323c) mapArr[i3].get("JPEGInterchangeFormatLength");
            if (c0323c8 == null || c0323c9 == null) {
                return;
            }
            int iM878e5 = c0323c8.m878e(this.f933f);
            int iM878e6 = c0323c8.m878e(this.f933f);
            c0326f.m881b(iM878e5);
            byte[] bArr = new byte[iM878e6];
            c0326f.read(bArr);
            m887e(new C0322b(bArr), iM878e5, i3);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m905x() {
        m903v(0, 5);
        m903v(0, 4);
        m903v(5, 4);
        HashMap[] mapArr = this.f931d;
        C0323c c0323c = (C0323c) mapArr[1].get("PixelXDimension");
        C0323c c0323c2 = (C0323c) mapArr[1].get("PixelYDimension");
        if (c0323c != null && c0323c2 != null) {
            mapArr[0].put("ImageWidth", c0323c);
            mapArr[0].put("ImageLength", c0323c2);
        }
        if (mapArr[4].isEmpty() && m896n(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!m896n(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m901t("ThumbnailOrientation", "Orientation", 0);
        m901t("ThumbnailImageLength", "ImageLength", 0);
        m901t("ThumbnailImageWidth", "ImageWidth", 0);
        m901t("ThumbnailOrientation", "Orientation", 5);
        m901t("ThumbnailImageLength", "ImageLength", 5);
        m901t("ThumbnailImageWidth", "ImageWidth", 5);
        m901t("Orientation", "ThumbnailOrientation", 4);
        m901t("ImageLength", "ThumbnailImageLength", 4);
        m901t("ImageWidth", "ThumbnailImageWidth", 4);
    }
}
