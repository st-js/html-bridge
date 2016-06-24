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
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.dom.EventTarget;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.typed.ArrayBuffer;

public class XMLHttpRequest implements EventTarget {
	public String responseType;
	public ArrayBuffer response;

	public Callback0 onload;
	public Callback0 onreadystatechange;
	public Callback1<DOMEvent> onerror;
	public int readyState;
	public String responseText;
	// is in fact DOM Element, but they were mixed
	public Element responseXML;
	public int status;
	public String statusText;

	public native void abort();

	public native String getAllResponseHeaders();

	public native String getResponseHeader(String name);

	public native void open(String method, String url);

	public native void open(String method, String url, boolean async, String uname, String pswd);

	public native void open(String method, String url, boolean async);

	public native void send();

	public native void send(String data);

	public native void setRequestHeader(String name, Object value);

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
}
