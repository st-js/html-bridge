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

abstract public class Node {
	public HTMLCollection<Attr> attributes;

	public native void appendChild  (Node node);

	public native Node cloneNode  (boolean deep);

	public native short compareDocumentPosition  (Node n);

	public String baseURI;
	public HTMLList<Node> childNodes;

	public native String getFeature  (String feature, String version);

	public Node firstChild;
	public Node lastChild;
	public String localName;
	public String namespaceURI;
	public Node nextSibling;
	public String nodeName;
	public short nodeType;
	public String nodeValue;
	public Document ownerDocument;
	public Node parentNode;
	public String prefix;
	public Node previousSibling;
	public String textContent;

	public native String getUserData  (String s);

	public boolean hasAttributes;
	public boolean hasChildNodes;

	public native void insertBefore  (Node n1, Node n2);

	public native boolean isDefaultNamespace  (String s);

	public native boolean isEqualNode  (Node n);

	public native boolean isSameNode  (Node n);

	public native boolean isSupported  (String feature, String version);

	public native String lookupNamespaceURI  (String s);

	public native String lookupPrefix  (String s);

	public native void normalize  ();

	public native void removeChild  (Node n);

	public native void replaceChild  (Node n1, Node n2);
	// setUserData(String, Object, UserDataHandler)
}
