package org.stjs.javascript.dom.geo;

import org.stjs.javascript.functions.Callback1;

abstract public class Geolocation {
	public void getCurrentPosition(Callback1<Position> success) {
		throw new UnsupportedOperationException();
	}

	public void getCurrentPosition(Callback1<Position> success, Callback1<PositionError> error) {
		throw new UnsupportedOperationException();
	}

	public void getCurrentPosition(Callback1<Position> success, Callback1<PositionError> error, PositionOptions options) {
		throw new UnsupportedOperationException();
	}

	public WatchId watchCurrentPosition(Callback1<Position> success) {
		throw new UnsupportedOperationException();
	}

	public WatchId watchCurrentPosition(Callback1<Position> success, Callback1<PositionError> error) {
		throw new UnsupportedOperationException();
	}

	public WatchId watchCurrentPosition(Callback1<Position> success, Callback1<PositionError> error,
			PositionOptions options) {
		throw new UnsupportedOperationException();
	}

	public void clearWatch(WatchId id) {
		throw new UnsupportedOperationException();
	}
}
