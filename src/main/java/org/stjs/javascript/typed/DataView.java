package org.stjs.javascript.typed;

import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class DataView {
    public ArrayBuffer buffer;
    public int byteOffset;
    public int byteLength;

    @Native
    public DataView(ArrayBuffer buffer, int byteOffset, int byteLength) {
    }

    @Native
    public DataView(ArrayBuffer buffer, int byteOffset) {
    }

    @Native
    public DataView(ArrayBuffer buffer) {
    }

    /**
     * Gets a signed 8-bit integer (byte) at the specified byte offset from the
     * start of the view.
     */
    public native byte getInt8(int byteOffset);

    /**
     * Gets an unsigned 8-bit integer (unsigned byte) at the specified byte
     * offset from the start of the view.
     */
    public native int getUint8(int byteOffset);

    /**
     * Gets a signed 16-bit integer (short) at the specified byte offset from
     * the start of the view.
     */
    public native short getInt16(int byteOffset);

    /**
     * Gets an unsigned 16-bit integer (unsigned short) at the specified byte
     * offset from the start of the view.
     */
    public native int getUint16(int byteOffset);

    /**
     * Gets a signed 32-bit integer (long) at the specified byte offset from the
     * start of the view.
     */
    public native int getInt32(int byteOffset);

    /**
     * Gets an unsigned 32-bit integer (unsigned long) at the specified byte
     * offset from the start of the view.
     */
    public native long getUint32(int byteOffset);

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
