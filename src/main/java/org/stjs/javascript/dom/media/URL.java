package org.stjs.javascript.dom.media;

import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.file.Blob;

@STJSBridge
public class URL {

    public native static String createObjectURL(MediaSource mediaSource);

    @Native
    public static String createObjectURL(Blob blob) {
        return null;
    }

}
