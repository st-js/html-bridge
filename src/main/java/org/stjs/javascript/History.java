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

abstract public class History {
	/**
	 * Returns the number of entries in the joint session history.
	 */
	public int length;

	/**
	 * Goes back one step in the joint session history. If there is no previous
	 * page, does nothing.
	 */
	public native void back();

	/**
	 * Goes forward one step in the joint session history. If there is no next page, does nothing.
	 */
	public native void forward();

	/**
	 * Goes back or forward the specified number of steps in the joint session
	 * history. A zero delta will reload the current page. If the delta is out
	 * of range, does nothing.
	 * 
	 * @param positions
	 */
	public native void go(int positions);

	public native void go(String url);

	/**
	 * Pushes the given data onto the session history, with the given title, and
	 * the given URL.
	 * 
	 * @param state
	 * @param title
	 * @param url
	 */
	public native void pushState(Object state, String title, String url);

	/**
	 * Pushes the given data onto the session history, with the given title
	 * 
	 * @param state
	 * @param title
	 */
	public native void pushState(Object state, String title);

	/**
	 * Updates the current entry in the session history to have the given data,
	 * title and URL.
	 * 
	 * @param state
	 * @param title
	 * @param url
	 */
	public native void replaceState(Object state, String title, String url);

	/**
	 * Pushes the given data onto the session history, with the given title
	 * 
	 * @param state
	 * @param title
	 */
	public native void replaceState(Object state, String title);
}
