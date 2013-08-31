package org.stjs.javascript.worker;

import org.stjs.javascript.functions.Callback1;

public final class Worker<T> {
	public Callback1<MessageEvent<T>> onmessage;
	public Callback1<ErrorEvent> onerror;

	public Worker(String s) {
		//
	}

	public native void postMessage  (T message);

	public native void terminate  ();
}
