package org.stjs.javascript.dom;

import java.lang.Object;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public interface DOMImplementation {
    Document createDocument(String namespaceURI, String qualifiedNameStr, Object documentType);
}
