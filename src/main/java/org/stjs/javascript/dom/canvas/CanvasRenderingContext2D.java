package org.stjs.javascript.dom.canvas;

import org.stjs.javascript.Array;
import org.stjs.javascript.dom.Canvas;

public final class CanvasRenderingContext2D {

	public Canvas canvas;

	public Object fillStyle;

	public String font;

	public double globalAlpha;

	public String globalCompositeOperation;

	public String lineCap;

	public int lineDashOffset;

	public String lineJoin;

	public int lineWidth;

	public double miterLimit;

	public String msFillRule;

	// public boolean msImageSmoothingEnabled;

	public double shadowBlur;

	public String shadowColor;

	public int shadowOffsetX;

	public int shadowOffsetY;

	public Object strokeStyle;

	public String textAlign;

	public String textBaseline;

	public void arc(int x, int y, double radius, double startAngle, double endAngle, boolean anticlockwise) {
		throw new UnsupportedOperationException();
	}

	public void arcTo(int x1, int y1, int x2, int y2, double radius) {
		throw new UnsupportedOperationException();
	}

	public void beginPath() {
		throw new UnsupportedOperationException();
	}

	public void bezierCurveTo(int cp1x, int cp1y, int cp2x, int cp2y, int x, int y) {
		throw new UnsupportedOperationException();
	}

	public void clearRect(int x, int y, int w, int h) {
		throw new UnsupportedOperationException();
	}

	public void clip() {
		throw new UnsupportedOperationException();
	}

	public void clip(String fillRule) {
		throw new UnsupportedOperationException();
	}

	public void closePath() {
		throw new UnsupportedOperationException();
	}

	public CanvasImageData createImageData(int width, int height) {
		throw new UnsupportedOperationException();
	}

	public CanvasGradient createLinearGradient(int x0, int y0, int x1, int y1) {
		throw new UnsupportedOperationException();
	}

	public CanvasPattern createPattern(Object image, String repetition) {
		throw new UnsupportedOperationException();
	}

	public CanvasGradient createRadialGradient(int x0, int y0, double r0, int x1, int y1, double r1) {
		throw new UnsupportedOperationException();
	}

	public void drawImage(Object image, int dx, int dy) {
		throw new UnsupportedOperationException();
	}

	public void drawImage(Object image, int sx, int sy, int dx, int dy) {
		throw new UnsupportedOperationException();
	}

	public void drawImage(Object image, int sx, int sy, int sw, int sh, int dx, int dy, int dw, int dh) {
		throw new UnsupportedOperationException();
	}

	public void fill() {
		throw new UnsupportedOperationException();
	}

	public void fill(String fillRule) {
		throw new UnsupportedOperationException();
	}

	public void fillRect(int x, int y, int w, int h) {
		throw new UnsupportedOperationException();
	}

	public void fillText(String text, int x, int y, int maxWidth) {
		throw new UnsupportedOperationException();
	}

	public CanvasImageData getImageData(int sx, int sy, int sw, int sh) {
		throw new UnsupportedOperationException();
	}

	public void getLineDash(Array<Integer> dashList) {
		throw new UnsupportedOperationException();
	}

	public boolean isPointInPath(int x, int y, String fillRule) {
		throw new UnsupportedOperationException();
	}

	public boolean isPointInPath(int x, int y) {
		throw new UnsupportedOperationException();
	}

	public void lineTo(int x, int y) {
		throw new UnsupportedOperationException();
	}

	public CanvasTextMetrics measureText(String text) {
		throw new UnsupportedOperationException();
	}

	public void moveTo(int x, int y) {
		throw new UnsupportedOperationException();
	}

	public void putImageData(CanvasImageData imagedata, int dx, int dy, int dirtyX, int dirtyY, int dirtyWidth,
			int dirtyHeight) {
		throw new UnsupportedOperationException();
	}

	public void putImageData(CanvasImageData imagedata, int dx, int dy) {
		throw new UnsupportedOperationException();
	}

	public void quadraticCurveTo(int cp1x, int cp1y, int x, int y) {
		throw new UnsupportedOperationException();
	}

	public void rect(int x, int y, int w, int h) {
		throw new UnsupportedOperationException();
	}

	public void restore() {
		throw new UnsupportedOperationException();
	}

	public void rotate(double angle) {
		throw new UnsupportedOperationException();
	}

	public void save() {
		throw new UnsupportedOperationException();
	}

	public void scale(double x, double y) {
		throw new UnsupportedOperationException();
	}

	public void setLineDash(Array<Integer> dashList) {
		throw new UnsupportedOperationException();
	}

	public void setTransform(double m11, double m12, double m21, double m22, double dx, double dy) {
		throw new UnsupportedOperationException();
	}

	public void stroke() {
		throw new UnsupportedOperationException();
	}

	public void strokeRect(int x, int y, int w, int h) {
		throw new UnsupportedOperationException();
	}

	public void strokeText(String text, int x, int y, int maxWidth) {
		throw new UnsupportedOperationException();
	}

	public void transform(double m11, double m12, double m21, double m22, double dx, double dy) {
		throw new UnsupportedOperationException();
	}

	public void translate(int x, int y) {
		throw new UnsupportedOperationException();
	}
}
