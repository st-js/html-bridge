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
package org.stjs.javascript.dom;

import org.stjs.javascript.Location;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.functions.Callback1;

abstract public class Document extends Node implements EventTarget {
	public String URL;
	public String documentURI;
	public HTMLCollection<Anchor> anchors;
	public Element body;
	public String cookie;
	public String domain;
	public HTMLCollection<Form> forms;
	public HTMLCollection<Image> images;
	public HTMLCollection<Link> links;
	public String referrer;
	public String title;
	public Element documentElement;
	public Location location;
	public String readyState;
	public boolean isFullscreen;
	public Callback0 cancelFullscreen;
	public Callback0 mozCancelFullScreen;
	public Callback0 webkitCancelFullScreen;
	public Boolean webkitIsFullScreen;
	public Boolean mozFullScreen;
	public Element fullscreenElement;
	
	public native HTMLList<Element> getElementsByName(String arg0);

	public native Element getElementById(String id);

	public native HTMLCollection<Element> getElementsByTagName(String tagName);

	public native void writeln(String arg0);

	public native void write(String arg0);

	public native void close();

	public native void open();

	public native Element createElement(String tagName);

	public native Text createTextNode(String data);

	public native Attr createAttribute(String name);

	@Override
	public native void addEventListener(String type, Callback1<DOMEvent> listener);

	@Override
	public native void addEventListener(String type, Callback1<DOMEvent> listener, boolean useCapture);

	@Override
	public native void removeEventListener(String type, Callback1<DOMEvent> listener);

	@Override
	public native void removeEventListener(String type, Callback1<DOMEvent> listener, boolean useCapture);

	@Override
	public native boolean dispatchEvent(DOMEvent event);

	public native Element querySelector(String selector);

	public native Element createComment(String comment);

	public native HTMLList<Element> querySelectorAll(String string);
}
