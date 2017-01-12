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

/**
 * This is the bridge to the browser console object
 *
 * @author acraciun
 *
 */
abstract public class Console {
	public native void log(Object msg, Object... otherParams);

	public native void warn(Object msg, Object... otherParams);

	public native void error(Object msg, Object... otherParams);

	public native void debug(Object msg, Object... otherParams);

	public native void trace(Object msg, Object... otherParams);

	public native void info(Object msg, Object... otherParams);

	public native void dir(Object msg);

	public native void time(Object msg);

	public native void timeEnd(Object msg);

	public native void profile(Object msg);

	public native void profileEnd(Object msg);

    public native void groupCollapsed(String s);

    public native void groupEnd();
}
