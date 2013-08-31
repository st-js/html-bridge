package org.stjs.javascript.dom.geo;

import org.stjs.javascript.functions.Callback1;

abstract public class Geolocation {
	public native void getCurrentPosition(Callback1<Position> success);

	public native void getCurrentPosition(Callback1<Position> success, Callback1<PositionError> error);

	public native void getCurrentPosition(Callback1<Position> success, Callback1<PositionError> error,
			PositionOptions options);

	public native WatchId watchCurrentPosition(Callback1<Position> success);

	public native WatchId watchCurrentPosition(Callback1<Position> success, Callback1<PositionError> error);

	public native WatchId watchCurrentPosition(Callback1<Position> success, Callback1<PositionError> error,
			PositionOptions options);

	public native void clearWatch(WatchId id);
}
