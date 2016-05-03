package org.stjs.javascript.typed;

import java.nio.ByteBuffer;

import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.ServerSide;

@STJSBridge
public class ArrayBuffer {
    public long byteLength;
    ByteBuffer buf;

    @ServerSide
    private ArrayBuffer(ByteBuffer buf) {
        this.buf = buf;
        this.byteLength = buf.remaining();
    }

    @Native
    public ArrayBuffer(int length) {
        this(ByteBuffer.allocate(length));
    }

    @Native
    public ArrayBuffer() {
        this(0);
    }

    @Native
    public static boolean isView(Object o) {
        return o instanceof ArrayBufferView;
    }

    @Native
    public ArrayBuffer slice(int begin) {
        throw new RuntimeException("TODO ArrayBuffer.slice begin");
    }

    @Native
    public ArrayBuffer slice(int begin, int end) {
        throw new RuntimeException("TODO ArrayBuffer.slice begin end");
    }

    @ServerSide
    public static ArrayBuffer wrap(ByteBuffer buf) {
        return new ArrayBuffer(buf.slice());
    }

}
