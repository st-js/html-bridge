package org.stjs.javascript.typed;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class Int32Array extends TypedArray<Integer> {

    public Int32Array(int length) {
        super(length);
    }

    public Int32Array(TypedArray<? extends Number> typedArray) {
        super(typedArray);
    }

    public Int32Array(Object object) {
        super(object);
    }

    public Int32Array(ArrayBuffer buffer, int byteOffset, int length) {
        super(buffer, byteOffset, length);
    }

    public Int32Array(ArrayBuffer buffer, int byteOffset) {
        super(buffer, byteOffset);
    }

    public Int32Array(ArrayBuffer buffer) {
        super(buffer);
    }
}
