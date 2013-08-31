package org.stjs.javascript.worker;

import org.stjs.javascript.TimeoutHandler;
import org.stjs.javascript.annotation.GlobalScope;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Callback0;

@SyntheticType
@GlobalScope
public class WorkerGlobalScope {
	private WorkerGlobalScope() {
		//
	}

	public static String atob(String text) {
		throw new UnsupportedOperationException();
	}

	public static String btoa(String text) {
		throw new UnsupportedOperationException();
	}

	public static TimeoutHandler setTimeout(String expr, int timeoutMillis) {
		throw new UnsupportedOperationException();
	}

	public static TimeoutHandler setTimeout(Callback0 expr, int timeoutMillis) {
		throw new UnsupportedOperationException();
	}

	public static TimeoutHandler setInterval(String expr, int timeoutMillis) {
		throw new UnsupportedOperationException();
	}

	public static TimeoutHandler setInterval(Callback0 expr, int timeoutMillis) {
		throw new UnsupportedOperationException();
	}

	public static void clearTimeout(TimeoutHandler handler) {
		throw new UnsupportedOperationException();
	}

	public static void importScripts(String... scripts) {
		throw new UnsupportedOperationException();
	}

	public static void close() {
		throw new UnsupportedOperationException();
	}

	public static WorkerGlobalScope self;
}
