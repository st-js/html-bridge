package org.stjs.javascript.dom.media;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class URL {

    public native static String createObjectURL(MediaSource mediaSource);

}
