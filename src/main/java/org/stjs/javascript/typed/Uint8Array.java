package org.stjs.javascript.typed;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class Uint8Array extends TypedArray<Integer> {

    public Uint8Array(int length) {
        super(length);
    }

    public Uint8Array(TypedArray<? extends Number> typedArray) {
        super(typedArray);
    }

    public Uint8Array(Object object) {
        super(object);
    }

    public Uint8Array(ArrayBuffer buffer, int byteOffset, int length) {
        super(buffer, byteOffset, length);
    }

    public Uint8Array(ArrayBuffer buffer, int byteOffset) {
        super(buffer, byteOffset);
    }

    public Uint8Array(ArrayBuffer buffer) {
        super(buffer);
    }
}
