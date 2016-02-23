package org.stjs.javascript.typed;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class Uint32Array extends TypedArray<Long> {

    public Uint32Array(int length) {
        super(length);
    }

    public Uint32Array(TypedArray<? extends Number> typedArray) {
        super(typedArray);
    }

    public Uint32Array(Object object) {
        super(object);
    }

    public Uint32Array(ArrayBuffer buffer, int byteOffset, int length) {
        super(buffer, byteOffset, length);
    }

    public Uint32Array(ArrayBuffer buffer, int byteOffset) {
        super(buffer, byteOffset);
    }

    public Uint32Array(ArrayBuffer buffer) {
        super(buffer);
    }
}
