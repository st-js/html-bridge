package org.stjs.javascript.dom.media;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.dom.DOMEvent;
import org.stjs.javascript.dom.EventTarget;
import org.stjs.javascript.functions.Callback1;

@STJSBridge
public class MediaSource implements EventTarget {

    public SourceBufferList sourceBuffers;
    public double duration;
    /**
     * closed: The source is not currently attached to a media element.
     * 
     * open: The source is attached to a media element and ready to receive
     * SourceBuffer objects.
     * 
     * ended: The source is attached to a media element but the stream has been
     * ended via a call to MediaSource.endOfStream().
     */
    public String readyState;

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

    public native SourceBuffer addSourceBuffer(String string);

    public native void removeSourceBuffer(SourceBuffer sourceBuffer);

    public native void endOfStream();

    public native void endOfStream(String endOfStreamError);

}
