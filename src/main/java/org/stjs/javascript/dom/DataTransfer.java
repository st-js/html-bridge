package org.stjs.javascript.dom;

import org.stjs.javascript.Array;

abstract public class DataTransfer {
	public String dropEffect;
	public String effectAllowed;
	public HTMLList<File> files;
	public Array<String> types;

	public void clearData(String type) {
		throw new UnsupportedOperationException();
	}

	public String getData(String type) {
		throw new UnsupportedOperationException();
	}

	public void setData(String type, String data) {
		throw new UnsupportedOperationException();
	}
}
