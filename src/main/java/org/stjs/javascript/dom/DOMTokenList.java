package org.stjs.javascript.dom;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public abstract class DOMTokenList {
    public int length;

    /**
     * Returns an item in the list by its index (or undefined if the number is
     * greater than or equal to the length of the list, prior to Gecko 7.0
     * returned null)
     */
    public native void item();

    /** Returns true if the underlying string contains token, otherwise false */
    public native boolean contains(String cls);

    /** Adds token to the underlying string 
     * @return */
    public native Object add(String... cls);

    /** Removes token from the underlying string */
    public native Object remove(String... cls);

    /**
     * Removes token from string and returns false. If token doesn't exist it's
     * added and the function returns true
     */
    public native boolean toggle(String cls);
}
