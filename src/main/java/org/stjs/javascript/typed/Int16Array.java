package org.stjs.javascript.typed;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class Int16Array extends TypedArray<Short> {

    public Int16Array(int length) {
        super(length);
    }

    public Int16Array(TypedArray<? extends Number> typedArray) {
        super(typedArray);
    }

    public Int16Array(Object object) {
        super(object);
    }

    public Int16Array(ArrayBuffer buffer, int byteOffset, int length) {
        super(buffer, byteOffset, length);
    }

    public Int16Array(ArrayBuffer buffer, int byteOffset) {
        super(buffer, byteOffset);
    }

    public Int16Array(ArrayBuffer buffer) {
        super(buffer);
    }
}
