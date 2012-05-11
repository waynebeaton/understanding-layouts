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
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class RowDataExample {
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new RowLayout());
		Button button1 = new Button(shell, SWT.PUSH);
		button1.setText("Button 1");
		button1.setLayoutData(new RowData(50, 40));
		Button button2 = new Button(shell, SWT.PUSH);
		button2.setText("Button 2");
		button2.setLayoutData(new RowData(50, 30));
		Button button3 = new Button(shell, SWT.PUSH);
		button3.setText("Button 3");
		button3.setLayoutData(new RowData(50, 20));
		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
	}
}