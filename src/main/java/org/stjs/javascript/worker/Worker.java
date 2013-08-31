package org.stjs.javascript.worker;

import org.stjs.javascript.functions.Callback1;

public final class Worker<T> {
	public Callback1<MessageEvent<T>> onmessage;
	public Callback1<ErrorEvent> onerror;

	public Worker(String s) {
		//
	}

	public void postMessage(T message) {
		throw new UnsupportedOperationException();
	}

	public void terminate() {
		throw new UnsupportedOperationException();
	}
}
