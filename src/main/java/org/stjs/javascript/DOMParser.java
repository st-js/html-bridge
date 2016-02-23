package org.stjs.javascript;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.Document;

@STJSBridge
public class DOMParser {
    public native Document parseFromString(String str, String type);

}
