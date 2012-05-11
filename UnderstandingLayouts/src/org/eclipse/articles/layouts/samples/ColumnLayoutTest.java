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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ColumnLayoutTest {
	static Shell shell;
	static Button button3;

	public static void main(String[] args) {
		Display display = new Display();
		shell = new Shell(display);
		shell.setLayout(new ColumnLayout());
		new Button(shell, SWT.PUSH).setText("B1");
		new Button(shell, SWT.PUSH).setText("Very Wide Button 2");
		(button3 = new Button(shell, SWT.PUSH)).setText("Button 3");
		Button grow = new Button(shell, SWT.PUSH);
		grow.setText("Grow Button 3");
		grow.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				button3.setText("Extreemely Wide Button 3");
				shell.layout();
				shell.pack();
			}
		});
		Button shrink = new Button(shell, SWT.PUSH);
		shrink.setText("Shrink Button 3");
		shrink.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				button3.setText("Button 3");
				shell.layout();
				shell.pack();
			}
		});
		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
	}
}