package p029K;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: K.b */
/* JADX INFO: loaded from: classes.dex */
public class C0322b extends InputStream implements DataInput {

    /* JADX INFO: renamed from: k */
    public static final ByteOrder f883k = ByteOrder.LITTLE_ENDIAN;

    /* JADX INFO: renamed from: l */
    public static final ByteOrder f884l = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: g */
    public final DataInputStream f885g;

    /* JADX INFO: renamed from: h */
    public ByteOrder f886h;

    /* JADX INFO: renamed from: i */
    public int f887i;

    /* JADX INFO: renamed from: j */
    public byte[] f888j;

    public C0322b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
    }

    /* JADX INFO: renamed from: a */
    public final void m873a(int i3) throws IOException {
        int i4 = 0;
        while (i4 < i3) {
            DataInputStream dataInputStream = this.f885g;
            int i5 = i3 - i4;
            int iSkip = (int) dataInputStream.skip(i5);
            if (iSkip <= 0) {
                if (this.f888j == null) {
                    this.f888j = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f888j, 0, Math.min(8192, i5));
                if (iSkip == -1) {
                    throw new EOFException("Reached EOF while skipping " + i3 + " bytes.");
                }
            }
            i4 += iSkip;
        }
        this.f887i += i4;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f885g.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i3) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f887i++;
        return this.f885g.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f887i++;
        return this.f885g.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f887i++;
        int i3 = this.f885g.read();
        if (i3 >= 0) {
            return (byte) i3;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f887i += 2;
        return this.f885g.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i3, int i4) throws IOException {
        this.f887i += i4;
        this.f885g.readFully(bArr, i3, i4);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f887i += 4;
        DataInputStream dataInputStream = this.f885g;
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        if ((i3 | i4 | i5 | i6) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f886h;
        if (byteOrder == f883k) {
            return (i6 << 24) + (i5 << 16) + (i4 << 8) + i3;
        }
        if (byteOrder == f884l) {
            return (i3 << 24) + (i4 << 16) + (i5 << 8) + i6;
        }
        throw new IOException("Invalid byte order: " + this.f886h);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j3;
        long j4;
        this.f887i += 8;
        DataInputStream dataInputStream = this.f885g;
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        int i9 = dataInputStream.read();
        int i10 = dataInputStream.read();
        if ((i3 | i4 | i5 | i6 | i7 | i8 | i9 | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f886h;
        if (byteOrder == f883k) {
            j3 = (((long) i10) << 56) + (((long) i9) << 48) + (((long) i8) << 40) + (((long) i7) << 32) + (((long) i6) << 24) + (((long) i5) << 16) + (((long) i4) << 8);
            j4 = i3;
        } else {
            if (byteOrder != f884l) {
                throw new IOException("Invalid byte order: " + this.f886h);
            }
            j3 = (((long) i3) << 56) + (((long) i4) << 48) + (((long) i5) << 40) + (((long) i6) << 32) + (((long) i7) << 24) + (((long) i8) << 16) + (((long) i9) << 8);
            j4 = i10;
        }
        return j3 + j4;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f887i += 2;
        DataInputStream dataInputStream = this.f885g;
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i3 | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f886h;
        if (byteOrder == f883k) {
            return (short) ((i4 << 8) + i3);
        }
        if (byteOrder == f884l) {
            return (short) ((i3 << 8) + i4);
        }
        throw new IOException("Invalid byte order: " + this.f886h);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f887i += 2;
        return this.f885g.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f887i++;
        return this.f885g.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f887i += 2;
        DataInputStream dataInputStream = this.f885g;
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i3 | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f886h;
        if (byteOrder == f883k) {
            return (i4 << 8) + i3;
        }
        if (byteOrder == f884l) {
            return (i3 << 8) + i4;
        }
        throw new IOException("Invalid byte order: " + this.f886h);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i3) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0322b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public C0322b(InputStream inputStream, int i3) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f886h = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f885g = dataInputStream;
        dataInputStream.mark(0);
        this.f887i = 0;
        this.f886h = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i4) throws IOException {
        int i5 = this.f885g.read(bArr, i3, i4);
        this.f887i += i5;
        return i5;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f887i += bArr.length;
        this.f885g.readFully(bArr);
    }
}
