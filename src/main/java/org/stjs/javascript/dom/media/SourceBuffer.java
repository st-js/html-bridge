package org.stjs.javascript.dom.media;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.DOMEvent;
import org.stjs.javascript.dom.EventTarget;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.typed.ArrayBuffer;
import org.stjs.javascript.typed.ArrayBufferView;

@STJSBridge
public class SourceBuffer implements EventTarget {

    public boolean updating;
    public TimeRanges buffered;
    public double appendWindowStart;
    public double appendWindowEnd;
    public double timestampOffset;

    @Override
    public native void addEventListener(String type, Callback1<? extends DOMEvent> listener);

    @Override
    public native void addEventListener(String type, Callback1<? extends DOMEvent> listener, boolean useCapture);

    @Override
    public native void removeEventListener(String type, Callback1<? extends DOMEvent> listener);

    @Override
    public native void removeEventListener(String type, Callback1<? extends DOMEvent> listener, boolean useCapture);

    @Override
    public native boolean dispatchEvent(DOMEvent event);

    public native void appendBuffer(ArrayBuffer data);

    public native void appendBuffer(ArrayBufferView data);

    public native void abort();

    public native void remove(double start, double end);

}