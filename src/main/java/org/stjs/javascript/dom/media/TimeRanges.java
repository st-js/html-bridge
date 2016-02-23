package org.stjs.javascript.dom.media;

abstract public class TimeRanges {
	public int length;

	public native double start  (int index);

	public native double end  (int index);
}
