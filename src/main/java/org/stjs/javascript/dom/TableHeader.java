package org.stjs.javascript.dom;

abstract public class TableHeader extends Element {
	public HTMLCollection<TableRow> rows;

	public native void deleteRow  (int arg0);

	public native Element insertRow  (int arg0);
}
