package org.stjs.javascript.dom.media;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.Template;

@STJSBridge
public class SourceBufferList {
    @Template("get")
    public native SourceBuffer $get(int index);

    public int length;

}
