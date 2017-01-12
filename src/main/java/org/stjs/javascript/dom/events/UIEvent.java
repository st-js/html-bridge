package org.stjs.javascript.dom.events;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.DOMEvent;

/**
 * https://developer.mozilla.org/en-US/docs/Web/API/UIEvent
 * 
 * @author zhukov
 *
 */
@STJSBridge
public class UIEvent extends DOMEvent {
    /**
     * This feature is non-standard and is not on a standards track. Do not use
     * it on production sites facing the Web: it will not work for every user.
     * There may also be large incompatibilities between implementations and the
     * behavior may change in the future.
     * 
     * The UIEvent.layerX read-only property returns the horizontal coordinate
     * of the event relative to the current layer.
     * 
     * This property takes scrolling of the page into account, and returns a
     * value relative to the whole of the document, unless the event occurs
     * inside a positioned element, where the returned value is relative to the
     * top left of the positioned element.
     * 
     */
    public int layerX;
    public int layerY;
}
