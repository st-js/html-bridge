package org.stjs.javascript.typed;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class Float64Array extends TypedArray<Double> {

    public Float64Array(int length) {
        super(length);
    }

    public Float64Array(TypedArray<? extends Number> typedArray) {
        super(typedArray);
    }

    public Float64Array(Object object) {
        super(object);
    }

    public Float64Array(ArrayBuffer buffer, int byteOffset, int length) {
        super(buffer, byteOffset, length);
    }

    public Float64Array(ArrayBuffer buffer, int byteOffset) {
        super(buffer, byteOffset);
    }

    public Float64Array(ArrayBuffer buffer) {
        super(buffer);
    }
}
