package org.stjs.javascript.typed;

import org.stjs.javascript.Array;
import org.stjs.javascript.SortFunction;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.Template;
import org.stjs.javascript.functions.Callback3;
import org.stjs.javascript.functions.Function3;
import org.stjs.javascript.functions.Function4;

@STJSBridge
public abstract class TypedArray<T extends Number> {
    public ArrayBuffer buffer;
    public int byteLength;
    public int byteOffset;
    public int length;

    public TypedArray(int length) {
    }

    public TypedArray(TypedArray<? extends Number> typedArray) {
    }

    public TypedArray(Object object) {
    }

    public TypedArray(ArrayBuffer buffer, int byteOffset, int length) {
    }

    public TypedArray(ArrayBuffer buffer, int byteOffset) {
    }

    public TypedArray(ArrayBuffer buffer) {
    }

    @Template("get")
    public native T $get(int index);

    @Template("set")
    public native void $set(int index, T value);

    /**
     * Copies a sequence of array elements within the array. See also
     * Array.prototype.copyWithin().
     */
    public native void copyWithin(int target, int start, int end);

    public native void copyWithin(int target, int start);

    /**
     * Returns a new Array Iterator object that contains the key/value pairs for
     * each index in the array. See also Array.prototype.entries().
     */
    public native void entries();

    /**
     * Tests whether all elements in the array pass the test provided by a
     * function. See also Array.prototype.every().
     */
    public native boolean every(Function3<T, Integer, TypedArray<T>, Boolean> callback);

    /**
     * Fills all the elements of an array from a start index to an end index
     * with a static value. See also Array.prototype.fill().
     */
    public native void fill(T value, int start, int end);

    public native void fill(T value, int start);

    public native void fill(T value);

    /**
     * Creates a new array with all of the elements of this array for which the
     * provided filtering function returns true. See also
     * Array.prototype.filter().
     */
    public native TypedArray<T> filter(Function3<T, Integer, TypedArray<T>, Boolean> callback);

    /**
     * Returns the found value in the array, if an element in the array
     * satisfies the provided testing function or undefined if not found. See
     * also Array.prototype.find().
     */
    public native T find(Function3<T, Integer, TypedArray<T>, Boolean> callback);

    /**
     * Returns the found index in the array, if an element in the array
     * satisfies the provided testing function or -1 if not found. See also
     * Array.prototype.findIndex().
     */
    public native int findIndex(Function3<T, Integer, TypedArray<T>, Boolean> callback);

    /**
     * Calls a function for each element in the array. See also
     * Array.prototype.forEach().
     */
    public native void forEach(Callback3<T, Integer, TypedArray<T>> callback);

    /**
     * Determines whether a typed array includes a certain element, returning
     * true or false as appropriate. See also Array.prototype.includes().
     */
    public native void includes();

    /**
     * Returns the first (least) index of an element within the array equal to
     * the specified value, or -1 if none is found. See also
     * Array.prototype.indexOf().
     */
    public native int indexOf(T n);

    /**
     * Joins all elements of an array into a string. See also
     * Array.prototype.join().
     */
    public native String join();

    public native String join(String separator);

    /**
     * Returns a new Array Iterator that contains the keys for each index in the
     * array. See also Array.prototype.keys().
     */
    public native void keys();

    /**
     * Returns the last (greatest) index of an element within the array equal to
     * the specified value, or -1 if none is found. See also
     * Array.prototype.lastIndexOf().
     */
    public native int lastIndexOf(T n);

    /**
     * Creates a new array with the results of calling a provided function on
     * every element in this array. See also Array.prototype.map().
     */
    public native TypedArray<T> map(Function3<T, Integer, TypedArray<T>, T> callback);

    /** Former non-standard version of public native void copyWithin(). */
    @Deprecated
    public native void move();

    /**
     * Apply a function against an accumulator and each value of the array (from
     * left-to-right) as to reduce it to a single value. See also
     * Array.prototype.reduce().
     */
    public native T reduce(Function4<T, T, Integer, TypedArray<T>, T> callback);

    /**
     * Apply a function against an accumulator and each value of the array (from
     * right-to-left) as to reduce it to a single value. See also
     * Array.prototype.reduceRight().
     */
    public native T reduceRight(Function4<T, T, Integer, TypedArray<T>, T> callback);

    /**
     * Reverses the order of the elements of an array — the first becomes the
     * last, and the last becomes the first. See also Array.prototype.reverse().
     */
    public native void reverse();

    /**
     * Stores multiple values in the typed array, reading input values from a
     * specified array.
     */
    public native void set(Array<T> array, int offset);

    public native void set(TypedArray<T> array, int offset);

    /**
     * Extracts a section of an array and returns a new array. See also
     * Array.prototype.slice().
     */
    public native TypedArray<T> slice();

    public native TypedArray<T> slice(int begin, int end);

    public native TypedArray<T> slice(int begin);

    /**
     * Returns true if at least one element in this array satisfies the provided
     * testing function. See also Array.prototype.some().
     */
    public native boolean some(Function3<T, Integer, TypedArray<T>, Boolean> callback);

    /**
     * Sorts the elements of an array in place and returns the array. See also
     * Array.prototype.sort().
     */
    public native void sort();

    public native void sort(SortFunction<T> compareFunction);

    /** Returns a new TypedArray<T> from the given start and end element index. */
    public native TypedArray<T> subarray();

    public native TypedArray<T> subarray(int begin, int end);

    public native TypedArray<T> subarray(int begin);

    /**
     * Returns a new Array Iterator object that contains the values for each
     * index in the array. See also Array.prototype.values().
     */
    public native void values();

    /**
     * Returns a localized string representing the array and its elements. See
     * also Array.prototype.toLocaleString().
     */
    public native void toLocaleString();

    /**
     * Returns a string representing the array and its elements. See also
     * Array.prototype.toString().
     */
    public native String toString();
    //    TypedArray<T>.prototype[@@iterator]()
    //    Returns a new Array Iterator object that contains the values for each index in the array.

}
