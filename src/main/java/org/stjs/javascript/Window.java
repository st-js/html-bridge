/**
 *  Copyright 2011 Alexandru Craciun, Eyal Kaspi
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.stjs.javascript;

import org.stjs.javascript.dom.DOMEvent;
import org.stjs.javascript.dom.Document;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.dom.EventTarget;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Function1;
import org.w3c.dom.events.Event;

public class Window implements EventTarget {
	public boolean closed;
	public String defaultStatus;
	public Document document;
	public Window[] frames;
	public History history;
	public int innerHeight;
	public int innerWidth;
	public int length;
	public Location location;
	public String name;
	public Navigator navigator;
	public Window opener;
	public int outerHeight;
	public int outerWidth;
	public int pageXOffset;
	public int pageYOffset;
	public Window parent;
	public Screen screen;
	public int screenLeft;
	public int screenTop;
	public int screenX;
	public int screenY;
	public Window self;
	public String status;
	public Window top;
	public Event event;// maybe has to be extended, TODO :: check the support

	public Function1<DOMEvent, String> onbeforeunload;
	public Callback1<DOMEvent> onload;
	public Callback1<DOMEvent> onunload;
	public Callback1<DOMEvent> onresize;
   
	/** https://developer.mozilla.org/en-US/docs/Web/API/Window/scrollY */
	public int scrollY;
    public int scrollX;

    public native void blur();

	public native void close();

	public native Window createPopup();

	public native void focus();

	public native void moveBy(int x, int y);

	public native void moveTo(int x, int y);

	public native Window open(String url);

	public native Window open(String url, String target);

	public native Window open(String url, String target, String specs, boolean replace);

	public native void print();

	public native void resizeBy(int w, int h);

	public native void resizeTo(int w, int h);

	public native void scrollBy(int x, int y);

	public native void scrollTo(int x, int y);

	public native String atob(String text);

	public native String btoa(String text);

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

	public native void cancelAnimationFrame(int animationRequestId);

	public native int requestAnimationFrame(Callback0 callback);

	public native CSSStyleDeclaration getComputedStyle(Element element, Element pseudoElt);

	public native String encodeURIComponent(String str);

    /**
     * https://developer.mozilla.org/en-US/docs/Web/API/Window/postMessage
     * 
     * @param data
     * @param origin
     */
    public native void postMessage(Object data, String origin);
}
