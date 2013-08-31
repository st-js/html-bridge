package org.stjs.javascript;

abstract public class Storage implements Map<String, Object> {
	public <T> T getItem(String key) {
		throw new UnsupportedOperationException();
	}

	public void setItem(String key, Object data) {
		throw new UnsupportedOperationException();
	}
}
