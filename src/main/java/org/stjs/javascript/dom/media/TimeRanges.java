package org.stjs.javascript.dom.media;

abstract public class TimeRanges {
	public int length;

	public native int start  (int index);

	public native int end  (int index);
}
