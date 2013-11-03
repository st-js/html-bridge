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

import org.stjs.javascript.annotation.Adapter;
import org.stjs.javascript.annotation.Template;
import org.stjs.javascript.functions.Function1;

/**
 * here are the methods existent in Javascript for number objects and inexistent in the Java counterpart. The generator
 * should generate the correct code
 * 
 * @author acraciun
 */
@Adapter
public class JSStringAdapter extends JSStringAdapterBase {
	@Deprecated
	@Template("adapter")
	public native static String anchor  (String applyTo, String anchor);

	@Deprecated
	@Template("adapter")
	public native static String big  (String applyTo);

	@Deprecated
	@Template("adapter")
	public native static String blink  (String applyTo);

	@Deprecated
	@Template("adapter")
	public native static String bold  (String applyTo);

	@Deprecated
	@Template("adapter")
	public native static String fixed  (String applyTo);

	@Deprecated
	@Template("adapter")
	public native static String fontcolor  (String applyTo, String color);

	@Deprecated
	@Template("adapter")
	public native static String fontsize  (String applyTo, int size);

	@Deprecated
	@Template("adapter")
	public native static String italics  (String applyTo);

	@Deprecated
	@Template("adapter")
	public native static String link  (String applyTo, String url);

	@Deprecated
	@Template("adapter")
	public native static String small  (String applyTo);

	@Deprecated
	@Template("adapter")
	public native static String strike  (String applyTo);

	@Deprecated
	@Template("adapter")
	public native static String sub  (String applyTo);

	@Deprecated
	@Template("adapter")
	public native static String sup  (String applyTo);
}
