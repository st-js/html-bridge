package org.stjs.javascript.typed;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class Float32Array extends TypedArray<Float> {

    public Float32Array(int length) {
        super(length);
    }

    public Float32Array(TypedArray<? extends Number> typedArray) {
        super(typedArray);
    }

    public Float32Array(Object object) {
        super(object);
    }

    public Float32Array(ArrayBuffer buffer, int byteOffset, int length) {
        super(buffer, byteOffset, length);
    }

    public Float32Array(ArrayBuffer buffer, int byteOffset) {
        super(buffer, byteOffset);
    }

    public Float32Array(ArrayBuffer buffer) {
        super(buffer);
    }
}
