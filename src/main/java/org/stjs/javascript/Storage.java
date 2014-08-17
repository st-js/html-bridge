package org.stjs.javascript;

public class Storage extends Map<String, Object> {
	public native <T> T getItem(String key);

	public native void setItem(String key, Object data);

	protected Storage() {
		super();
	}

	public void clear() {

		for (String key : this) {
			$delete(key);
		}
	}
}
