package org.stjs.javascript.typed;

import java.nio.ByteBuffer;

import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.ServerSide;

@STJSBridge
public class DataView implements ArrayBufferView {
    public ArrayBuffer buffer;
    public int byteOffset;
    public int byteLength;
    private ByteBuffer buf;

    @ServerSide
    public static DataView wrap(ByteBuffer buf) {
        return new DataView(ArrayBuffer.wrap(buf));
    }

    @Native
    public DataView(ArrayBuffer buffer, int byteOffset, int byteLength) {
        this.buffer = buffer;
        this.buf = buffer.buf;
        this.byteOffset = byteOffset;
        this.byteLength = byteLength;
    }

    @Native
    public DataView(ArrayBuffer buffer, int byteOffset) {
        this(buffer, byteOffset, (int) (buffer.byteLength - byteOffset));
    }

    @Native
    public DataView(ArrayBuffer buffer) {
        this(buffer, 0, (int) buffer.byteLength);
    }

    /**
     * Gets a signed 8-bit integer (byte) at the specified byte offset from the
     * start of the view.
     */
    @Native
    public byte getInt8(int byteOffset) {
        return buf.get(this.byteOffset + byteOffset);
    }

    /**
     * Gets an unsigned 8-bit integer (unsigned byte) at the specified byte
     * offset from the start of the view.
     */
    @Native
    public int getUint8(int byteOffset) {
        return buf.get(this.byteOffset + byteOffset) & 0xff;
    }

    /**
     * Gets a signed 16-bit integer (short) at the specified byte offset from
     * the start of the view.
     */
    public short getInt16(int byteOffset) {
        return buf.getShort(this.byteOffset + byteOffset);
    }

    /**
     * Gets an unsigned 16-bit integer (unsigned short) at the specified byte
     * offset from the start of the view.
     */
    @Native
    public int getUint16(int byteOffset) {
        return buf.getShort(this.byteOffset + byteOffset) & 0xffff;
    }

    @Native
    public int getUint16(int byteOffset, boolean littleEndian) {
        int val = getUint16(byteOffset);
        if (littleEndian) {
            int hi = (val >> 8) & 0xff;
            int lo = (val & 0xff);
            return (lo << 8) | hi;
        }
        return val;
    }

    /**
     * Gets a signed 32-bit integer (long) at the specified byte offset from the
     * start of the view.
     */
    public native int getInt32(int byteOffset);

    public native int getInt32(int byteOffset, boolean littleEndian);

    /**
     * Gets an unsigned 32-bit integer (unsigned long) at the specified byte
     * offset from the start of the view.
     */
    public native long getUint32(int byteOffset);

    public native long getUint32(int byteOffset, boolean littleEndian);

    /**
     * Gets a signed 32-bit float (float) at the specified byte offset from the
     * start of the view.
     */
    public native float getFloat32(int byteOffset);

    /**
     * Gets a signed 64-bit float (double) at the specified byte offset from the
     * start of the view.
     */
    public native double getFloat64(int byteOffset);

    /**
     * Stores a signed 8-bit integer (byte) value at the specified byte offset
     * from the start of the view.
     */
    public native void setInt8(int byteOffset, byte value);

    /**
     * Stores an unsigned 8-bit integer (unsigned byte) value at the specified
     * byte offset from the start of the view.
     */
    public native void setUint8(int byteOffset, int value);

    /**
     * Stores a signed 16-bit integer (short) value at the specified byte offset
     * from the start of the view.
     */
    public native void setInt16(int byteOffset, short value);

    /**
     * Stores an unsigned 16-bit integer (unsigned short) value at the specified
     * byte offset from the start of the view.
     */
    public native void setUint16(int byteOffset, int value);

    /**
     * Stores a signed 32-bit integer (long) value at the specified byte offset
     * from the start of the view.
     */
    public native void setInt32(int byteOffset, int value);

    /**
     * Stores an unsigned 32-bit integer (unsigned long) value at the specified
     * byte offset from the start of the view.
     */
    public native void setUint32(int byteOffset, long value);

    public native void setUint32(int byteOffset, long value, boolean littleEndian);

    /**
     * Stores a signed 32-bit float (float) value at the specified byte offset
     * from the start of the view.
     */
    public native void setFloat32(int byteOffset, float value);

    /**
     * Stores a signed 64-bit float (double) value at the specified byte offset
     * from the start of the view.
     */
    public native void setFloat64(int byteOffset, double value);

}
