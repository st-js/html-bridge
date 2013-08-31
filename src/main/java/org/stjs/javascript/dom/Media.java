package org.stjs.javascript.dom;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.dom.media.TimeRanges;

/**
 * common parent class for audio and video
 * 
 * @author acraciun
 * 
 */
@SyntheticType
abstract public class Media extends Element {
	// audioTracks
	public boolean autoplay;
	public TimeRanges buffered;
	// controller
	public boolean controls;
	public boolean loop;
	public boolean muted;
	public String poster;
	public String preload;
	public String src;

	// crossOrigin
	public String currentSrc;
	public int currentTime;
	public boolean defaultMuted;
	public double defaultPlaybackRate;
	public int duration;
	public boolean ended;
	// error
	public String mediaGroup;
	public int networkState;
	public boolean paused;
	public double playbackRate;
	public TimeRanges played;
	public int readyState;
	public TimeRanges seekable;
	public boolean seeking;
	// startDate
	// textTracks
	// videoTracks
	public double volume;

	// addTextTrack()
	public native String canPlayType  (String type);

	public native void load  ();

	public native void play  ();

	public native void pause  ();
}
