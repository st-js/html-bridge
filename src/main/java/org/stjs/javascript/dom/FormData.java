package org.stjs.javascript.dom;

public class FormData {

    public native void append(String key, File value);
    public native void append(String key, String value);
    public native void delete();
    public native void entries();
    public native void get();
    public native void getAll();
    public native void has();
    public native void keys();
    public native void set();
    public native void values();

}
