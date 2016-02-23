package org.stjs.javascript.typed;

import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class ArrayBuffer {
    public long byteLength;
    
    @Native
    public static boolean isView(Object o) {
        return false;
    }

    public native ArrayBuffer slice(int begin);

    public native ArrayBuffer slice(int begin, int end);
}
