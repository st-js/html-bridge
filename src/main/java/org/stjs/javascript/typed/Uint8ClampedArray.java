package org.stjs.javascript.typed;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class Uint8ClampedArray extends TypedArray<Integer> {

    public Uint8ClampedArray(int length) {
        super(length);
    }

    public Uint8ClampedArray(TypedArray<? extends Number> typedArray) {
        super(typedArray);
    }

    public Uint8ClampedArray(Object object) {
        super(object);
    }

    public Uint8ClampedArray(ArrayBuffer buffer, int byteOffset, int length) {
        super(buffer, byteOffset, length);
    }

    public Uint8ClampedArray(ArrayBuffer buffer, int byteOffset) {
        super(buffer, byteOffset);
    }

    public Uint8ClampedArray(ArrayBuffer buffer) {
        super(buffer);
    }
}
