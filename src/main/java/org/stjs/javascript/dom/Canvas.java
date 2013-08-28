package org.stjs.javascript.dom;

import org.stjs.javascript.dom.canvas.CanvasRenderingContext2D;

abstract public class Canvas extends Element {
	public int height;
	public int width;

	public CanvasRenderingContext2D getContext(String type) {
		throw new UnsupportedOperationException();
	}
}
