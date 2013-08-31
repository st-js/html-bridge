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

abstract public class Document extends Node {
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

	public native HTMLList<Element> getElementsByName  (String arg0);

	public native Element getElementById  (String id);

	public native HTMLList<Element> getElementsByTagName  (String tagName);

	public native void writeln  (String arg0);

	public native void write  (String arg0);

	public native void close  ();

	public native void open  ();

	public native Element createElement  (String tagName);

	public native Text createTextNode  (String data);

	public native Attr createAttribute  (String name);
}
