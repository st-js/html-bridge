package org.stjs.javascript.typed;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class Uint16Array extends TypedArray<Integer> {

    public Uint16Array(int length) {
        super(length);
    }

    public Uint16Array(TypedArray<? extends Number> typedArray) {
        super(typedArray);
    }

    public Uint16Array(Object object) {
        super(object);
    }

    public Uint16Array(ArrayBuffer buffer, int byteOffset, int length) {
        super(buffer, byteOffset, length);
    }

    public Uint16Array(ArrayBuffer buffer, int byteOffset) {
        super(buffer, byteOffset);
    }

    public Uint16Array(ArrayBuffer buffer) {
        super(buffer);
    }
}
