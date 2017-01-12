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

import org.stjs.javascript.Array;

abstract public class Input extends Element {
	public String accept;
	public String accessKey;
	public String alt;
	public String autoComplete;
	public boolean autofocus;
	public String formAction;
	public String formEnctype;
	public String formMethod;
	public boolean formNoValidate;
	public String formTarget;
	public int height;
	public Datalist list;
	public Object min;
	public Object max;
	public boolean multiple;
	public String pattern;
	public String placeholder;
	public boolean required;
	public int step;
	public int width;
	public boolean checked;
	public boolean defaultChecked;
	public String defaultValue;
	public boolean disabled;
	public Form form;
	public int maxLength;
	public String name;
	public boolean readOnly;
	public String size;
	public String src;
	public int tabIndex;
	public String type;
	public String useMap;
	public String value;
	public int selectionStart;
	public int selectionEnd;
	public Array<File> files;

	public native void blur  ();

	public native void focus  ();

	public native void select  ();

	public native void click  ();
	
    /**
     * Returns false if the element is a candidate for constraint validation,
     * and it does not satisfy its constraints. In this case, it also fires an
     * invalid event at the element. It returns true if the element is not a
     * candidate for constraint validation, or if it satisfies its constraints.
     * 
     * @return
     */
    public native boolean checkValidity();
}
