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

import org.stjs.javascript.annotation.GlobalScope;
import org.stjs.javascript.annotation.Template;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.stjs.STJS;

@GlobalScope
public class Global {
	public static Number Infinity;
	public static Number NaN;

	public static Object undefined;

	public static Window window;

	public static Console console;

	public static STJS stjs;

	public static JSON JSON;

	public static Storage localStorage;
	public static Storage sessionStorage;

	// do not add this one too
	// public static Window self;

	public native static <T> T eval  (String expr);

	public native static void alert  (Object expr);

	public native static boolean confirm  (String expr);

	public native static String prompt  (String expr);

	public native static String prompt  (String expr, String defaultText);

	public native static double parseFloat  (Object expr);

	public native static int parseInt  (Object expr);

	public native static int parseInt  (Object expr, int radix);

	@Template("typeOf")
	public native static String typeof  (Object obj);

	/**
	 * this is the equivalent of x || y || z in javascript
	 * 
	 * @return
	 */
	@Template("or")
	public native static <T> T $or  (T value, T... otherValues);

	public native static TimeoutHandler setTimeout  (String expr, int timeoutMillis);

	public native static TimeoutHandler setTimeout  (Callback0 expr, int timeoutMillis);

	public native static TimeoutHandler setInterval  (String expr, int timeoutMillis);

	public native static TimeoutHandler setInterval  (Callback0 expr, int timeoutMillis);

	public native static void clearTimeout  (TimeoutHandler handler);

	public native static void clearInterval  (TimeoutHandler handler);

	public native static String decodeURI  (String uri);

	public native static String decodeURIComponent  (String uri);

	public native static String encodeURI  (String uri);

	public native static String encodeURIComponent  (String uri);

	public native static String escape  (String uri);

	public native static boolean isFinite  (Object value);

	public native static boolean isNaN  (Object value);

	public native static String unescape  (String uri);

	/**
	 * defined in stjs.js
	 * 
	 * @param exception
	 * @return
	 */
	public native static RuntimeException exception  (Object exception);

	/**
	 * defined in stjs.js
	 * 
	 * @param obj
	 * @return
	 */
	public native static boolean isEnum  (Object obj);

}
