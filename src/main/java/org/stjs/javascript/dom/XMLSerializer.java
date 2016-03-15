package org.stjs.javascript.dom;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class XMLSerializer {
    public native String serializeToString(Document doc);
}
