/**
 *  Copyright 2011 Alexandru Craciun, Eyal Kaspi
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"){throw new UnsupportedOperationException();}
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

import org.stjs.javascript.StyleSheet;
import org.stjs.javascript.Window;
import org.stjs.javascript.functions.Function1;

abstract public class Element extends Node {
	public String className;
	public String dir;
	public String id;
	public String lang;
	public String title;
	public String tagName;
	public String innerHTML;

	// TODO :: check the support
	// @BrowserCompatibility({ @Compatibility(browser = org.stjs.javascript.annotation.Compatibility.Browser.MSIE, from
	// = 6.0, to = 8.0) })
	public StyleSheet sheet;

	// TODO :: check the support
	public Window contentWindow;

	// TODO :: check the support
	public Document document;

	// TODO :: check the support
	public StyleSheet styleSheet;

	public int clientHeight;
	public int clientWidth;
	public int height;
	public int offsetHeight;
	public int offsetLeft;
	public Element offsetParent;
	public int offsetTop;
	public int offsetWidth;
	public int scrollHeight;
	public int scrollLeft;
	public int scrollTop;
	public int scrollWidth;
	public int width;
	public int tabIndex;

	public boolean contentEditable;
	public boolean contextMenu;
	public boolean draggable;
	public boolean dropZone;
	public boolean hidden;
	public boolean spellCheck;
	public boolean translate;

	// events
	public Function1<DOMEvent, Boolean> onblur;
	public Function1<DOMEvent, Boolean> onchange;
	public Function1<DOMEvent, Boolean> onclick;
	public Function1<DOMEvent, Boolean> ondblclick;
	public Function1<DOMEvent, Boolean> onerror;
	public Function1<DOMEvent, Boolean> onfocus;
	public Function1<DOMEvent, Boolean> onkeydown;
	public Function1<DOMEvent, Boolean> onkeypress;
	public Function1<DOMEvent, Boolean> onkeyup;
	public Function1<DOMEvent, Boolean> onmousedown;
	public Function1<DOMEvent, Boolean> onmousemove;
	public Function1<DOMEvent, Boolean> onmouseout;
	public Function1<DOMEvent, Boolean> onmouseover;
	public Function1<DOMEvent, Boolean> onmouseup;
	public Function1<DOMEvent, Boolean> onselect;

	public Function1<DOMEvent, Boolean> oncontextmenu;
	public Function1<DOMEvent, Boolean> onformchange;
	public Function1<DOMEvent, Boolean> onforminput;
	public Function1<DOMEvent, Boolean> oninput;
	public Function1<DOMEvent, Boolean> oninvalid;

	// drag & drop
	public Function1<DOMEvent, Boolean> ondrag;
	public Function1<DOMEvent, Boolean> ondragend;
	public Function1<DOMEvent, Boolean> ondragenter;
	public Function1<DOMEvent, Boolean> ondragleave;
	public Function1<DOMEvent, Boolean> ondragover;
	public Function1<DOMEvent, Boolean> ondragstart;
	public Function1<DOMEvent, Boolean> ondrop;
	// new mouse
	public Function1<DOMEvent, Boolean> onmousewheel;
	public Function1<DOMEvent, Boolean> onscroll;

	// media
	public Function1<DOMEvent, Boolean> oncanplay;
	public Function1<DOMEvent, Boolean> oncanplaythrough;
	public Function1<DOMEvent, Boolean> ondurationchange;
	public Function1<DOMEvent, Boolean> onemptied;
	public Function1<DOMEvent, Boolean> onended;
	public Function1<DOMEvent, Boolean> onloadeddata;
	public Function1<DOMEvent, Boolean> onloadedmetadata;
	public Function1<DOMEvent, Boolean> onloadstart;
	public Function1<DOMEvent, Boolean> onpause;
	public Function1<DOMEvent, Boolean> onplay;
	public Function1<DOMEvent, Boolean> onplaying;
	public Function1<DOMEvent, Boolean> onprogress;
	public Function1<DOMEvent, Boolean> onratechange;
	public Function1<DOMEvent, Boolean> onreadystatechange;
	public Function1<DOMEvent, Boolean> onseeked;
	public Function1<DOMEvent, Boolean> onseeking;
	public Function1<DOMEvent, Boolean> onstalled;
	public Function1<DOMEvent, Boolean> onsuspend;
	public Function1<DOMEvent, Boolean> ontimeupdate;
	public Function1<DOMEvent, Boolean> onvolumechange;
	public Function1<DOMEvent, Boolean> onwaiting;

	public String getAttribute(String name) {
		throw new UnsupportedOperationException();
	}

	public Attr getAttributeNode(String name) {
		throw new UnsupportedOperationException();
	}

	// public getAttributeNodeNS(String, String)
	// public getAttributeNS(String, String)
	public HTMLList<Element> getElementsByTagName(String tag) {
		throw new UnsupportedOperationException();
	}

	// public getElementsByTagNameNS(String, String)
	// public getSchemaTypeInfo()

	public boolean hasAttribute(String name) {
		throw new UnsupportedOperationException();
	}

	// public hasAttributeNS(String, String)
	public void removeAttribute(String name) {
		throw new UnsupportedOperationException();
	}

	public void removeAttributeNode(Attr att) {
		throw new UnsupportedOperationException();
	}

	// public removeAttributeNS(String, String)
	public void setAttribute(String name, String value) {
		throw new UnsupportedOperationException();
	}

	public void setAttributeNode(Attr name) {
		throw new UnsupportedOperationException();
	}

	// public setAttributeNodeNS(Attr)
	// public setAttributeNS(String, String, String)
	public void setIdAttribute(String name, boolean id) {
		throw new UnsupportedOperationException();
	}

	public void setIdAttributeNode(Attr attr, boolean id) {
		throw new UnsupportedOperationException();
	}

	// public setIdAttributeNS(String, String, boolean)

}
