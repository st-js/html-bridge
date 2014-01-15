package org.stjs.javascript.dom;

import org.stjs.javascript.functions.Callback1;

public interface EventTarget {
	public void addEventListener(String type, Callback1<DOMEvent> listener);

	public void addEventListener(String type, Callback1<DOMEvent> listener, boolean useCapture);

	public void removeEventListener(String type, Callback1<DOMEvent> listener);

	public void removeEventListener(String type, Callback1<DOMEvent> listener, boolean useCapture);

	public boolean dispatchEvent(DOMEvent event);
}
