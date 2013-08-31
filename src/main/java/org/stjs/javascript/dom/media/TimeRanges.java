package org.stjs.javascript.dom.media;

abstract public class TimeRanges {
	public int length;

	public int start(int index) {
		throw new UnsupportedOperationException();
	}

	public int end(int index) {
		throw new UnsupportedOperationException();
	}
}
