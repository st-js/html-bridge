package org.stjs.javascript;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.Template;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.functions.Function1;

@STJSBridge
//https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise
public class Promise<T> {
    @Native
    public Promise(Callback2<Callback1<T> /*resolve*/, Callback1 /*reject*/> executor) {
    }

    @Native
    @Template("prefix")
    public Promise<T> $catch(Callback1 reason) {
        return null;
    }

    @Native
    public <R> Promise<R> then(Function1<T, R> onFulfilled) {
        return null;
    }

    @Native
    public <R> Promise<R> then(Function1<T, R> onFulfilled, Callback1 onRejected) {
        return null;
    }
    
    @Native
    public static <T> Promise<T> resolve(T t) {
        return null;
    }
    
    @Native
    public static <T> Promise<T> reject(Object error) {
        return null;
    }
    
    @Native
    public static <T> Promise<T> race(Array<Promise<T>> iterable) {
        return null;
    }

    @Native
    public static <T> Promise<T> all(Array<Promise<T>> iterable) {
        return null;
    }

}
