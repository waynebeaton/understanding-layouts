/*******************************************************************************
 * Copyright (c) 2008, 2012 The Eclipse Foundation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * 	Wayne Beaton - initial API and implementation
 *******************************************************************************/
package org.eclipse.articles.layouts.samples;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Layout;

public class ColumnLayout extends Layout {
	// fixed margin and spacing
	public static final int MARGIN = 4;
	public static final int SPACING = 2;
	// cache
	Point[] sizes;
	int maxWidth, totalHeight;

	protected Point computeSize(Composite composite, int wHint, int hHint,
			boolean flushCache) {
		Control children[] = composite.getChildren();
		if (flushCache || sizes == null || sizes.length != children.length) {
			initialize(children);
		}
		int width = wHint, height = hHint;
		if (wHint == SWT.DEFAULT)
			width = maxWidth;
		if (hHint == SWT.DEFAULT)
			height = totalHeight;
		return new Point(width + 2 * MARGIN, height + 2 * MARGIN);
	}

	protected void layout(Composite composite, boolean flushCache) {
		Control children[] = composite.getChildren();
		if (flushCache || sizes == null || sizes.length != children.length) {
			initialize(children);
		}
		Rectangle rect = composite.getClientArea();
		int x = MARGIN, y = MARGIN;
		int width = Math.max(rect.width - 2 * MARGIN, maxWidth);
		for (int i = 0; i < children.length; i++) {
			int height = sizes[i].y;
			children[i].setBounds(x, y, width, height);
			y += height + SPACING;
		}
	}

	void initialize(Control children[]) {
		maxWidth = 0;
		totalHeight = 0;
		sizes = new Point[children.length];
		for (int i = 0; i < children.length; i++) {
			sizes[i] = children[i].computeSize(SWT.DEFAULT, SWT.DEFAULT, true);
			maxWidth = Math.max(maxWidth, sizes[i].x);
			totalHeight += sizes[i].y;
		}
		totalHeight += (children.length - 1) * SPACING;
	}
}