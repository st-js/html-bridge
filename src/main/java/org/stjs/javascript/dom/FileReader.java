package org.stjs.javascript.dom;

import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Function1;
import org.w3c.dom.DOMError;

public class FileReader {
    public DOMError error;
    public String readyState;
    public String result;

    public native void readAsDataURL(File file);

    public Function1<DOMEvent, Boolean> onabort;
    public Function1<DOMEvent, Boolean> onerror;
    public Function1<DOMEvent, Boolean> onload;
    public Function1<DOMEvent, Boolean> onloadstart;
    public Callback1<DOMEvent> onloadend;
    public Function1<DOMEvent, Boolean> onprogress;
}
