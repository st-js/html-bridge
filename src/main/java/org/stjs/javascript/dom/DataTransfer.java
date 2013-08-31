package org.stjs.javascript.dom;

import org.stjs.javascript.Array;

abstract public class DataTransfer {
	public String dropEffect;
	public String effectAllowed;
	public HTMLList<File> files;
	public Array<String> types;

	public native void clearData  (String type);

	public native String getData  (String type);

	public native void setData  (String type, String data);
}
