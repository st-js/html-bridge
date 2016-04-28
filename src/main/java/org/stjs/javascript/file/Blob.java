package org.stjs.javascript.file;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.Native;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.typed.TypedArray;

@STJSBridge
/**
 * https://developer.mozilla.org/en-US/docs/Web/API/Blob
 *
 * A Blob object represents a file-like object of immutable, raw data. Blobs
 * represent data that isn't necessarily in a JavaScript-native format. The File
 * interface is based on Blob, inheriting blob functionality and expanding it to
 * support files on the user's system.
 *
 * To construct a Blob from other non-blob objects and data, use the Blob()
 * constructor. To create a blob that contains a subset of another blob's data,
 * use the slice() method. To obtain a Blob object for a file on the user's file
 * system, see the File documentation.
 *
 * The APIs accepting Blob objects are also listed on the File documentation.
 *
 */
public class Blob {

    @Native
    public Blob(TypedArray<? extends Number> intArray, Map<String, Object> options) {
    }

    @Native
    public Blob(Array<?> parts, Map<String, Object> options) {
    }

    public boolean isClosed;

    public long size;

    public String type;


    public native void close();

    public native Blob slice(long start, long end, String contentType);
}
