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

import org.stjs.javascript.functions.Function1;

abstract public class Body extends Element {
	public Function1<DOMEvent, Boolean> onbeforeunload;
	public Function1<DOMEvent, Boolean> onerror;
	public Function1<DOMEvent, Boolean> onhaschange;
	public Function1<DOMEvent, Boolean> onload;
	public Function1<DOMEvent, Boolean> onmessage;
	public Function1<DOMEvent, Boolean> onoffline;
	public Function1<DOMEvent, Boolean> ononline;
	public Function1<DOMEvent, Boolean> onpagehide;
	public Function1<DOMEvent, Boolean> onpageshow;
	public Function1<DOMEvent, Boolean> onpopstate;
	public Function1<DOMEvent, Boolean> onredo;
	public Function1<DOMEvent, Boolean> onresize;
	public Function1<DOMEvent, Boolean> onstorage;
	public Function1<DOMEvent, Boolean> onundo;
	public Function1<DOMEvent, Boolean> onunload;
}
