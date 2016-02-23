package org.stjs.javascript.typed;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class Int8Array extends TypedArray<Byte> {

    public Int8Array(int length) {
        super(length);
    }

    public Int8Array(TypedArray<? extends Number> typedArray) {
        super(typedArray);
    }

    public Int8Array(Object object) {
        super(object);
    }

    public Int8Array(ArrayBuffer buffer, int byteOffset, int length) {
        super(buffer, byteOffset, length);
    }

    public Int8Array(ArrayBuffer buffer, int byteOffset) {
        super(buffer, byteOffset);
    }

    public Int8Array(ArrayBuffer buffer) {
        super(buffer);
    }
}
