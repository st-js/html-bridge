package org.stjs.javascript.dom.events;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.DOMEvent;

@STJSBridge
public class CustomEvent extends DOMEvent {
    
    public Object detail;

    public CustomEvent(String type, Object customInit) {
        // TODO Auto-generated constructor stub
        throw new RuntimeException("TODO CustomEvent");
    }

}
