package org.stjs.javascript.dom;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class DOMRect {
    public float bottom; //Y-coordinate, relative to the viewport origin, of the bottom of the rectangle box. Read only.
    public float height; //Height of the rectangle box (This is identical to bottom minus top). Read only.
    public float left;//X-coordinate, relative to the viewport origin, of the left of the rectangle box. Read only.
    public float right;//X-coordinate, relative to the viewport origin, of the right of the rectangle box. Read only.
    public float top; //Y-coordinate, relative to the viewport origin, of the top of the rectangle box. Read only.
    public float width; //Width of the rectangle box (This is identical to right minus left). Read only.
}
