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

	public native static String atob  (String text);

	public native static String btoa  (String text);

	public native static TimeoutHandler setTimeout  (String expr, int timeoutMillis);

	public native static TimeoutHandler setTimeout  (Callback0 expr, int timeoutMillis);

	public native static TimeoutHandler setInterval  (String expr, int timeoutMillis);

	public native static TimeoutHandler setInterval  (Callback0 expr, int timeoutMillis);

	public native static void clearTimeout  (TimeoutHandler handler);

	public native static void importScripts  (String... scripts);

	public native static void close  ();

	public static WorkerGlobalScope self;
}
