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
package org.eclipse.articles.layouts;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class FillLayoutSampleImageBuilder extends AbstractSampleImageBuilder {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FillLayoutSampleImageBuilder.buildImages();
	}

	public static void buildImages() {
		takeSnapshot("FillLayoutSampleVertical", new FillLayoutSample() {
			public void customizeLayout(FillLayout fillLayout) {
				fillLayout.type = SWT.VERTICAL;
			}
		});

		takeSnapshot("FillLayoutSampleVerticalResized", new FillLayoutSample() {
			public void customizeLayout(FillLayout fillLayout) {
				fillLayout.type = SWT.VERTICAL;
			}
	
			public void shellOpen(Shell shell) {
				shell.setBounds(10, 10, shell.getBounds().width, shell.getBounds().height * 3 / 2);
			}
		});
		
		takeSnapshot("FillLayoutSampleHorizontal", new FillLayoutSample() {
			public void customizeLayout(FillLayout fillLayout) {
				fillLayout.type = SWT.HORIZONTAL;
			}
		});
		
		takeSnapshot("FillLayoutSampleHorizontalResized", new FillLayoutSample() {
			public void customizeLayout(FillLayout fillLayout) {
				fillLayout.type = SWT.HORIZONTAL;
			}

			public void shellOpen(Shell shell) {				
				shell.setBounds(10, 10, shell.getBounds().width * 3 / 2, shell.getBounds().height);
			}
		});
	}
}

/**
 * The {@link FillLayoutSample} class provides
 * a framework for building samples of a {@link FillLayout}.
 */
abstract class FillLayoutSample extends Sample {
	public void create(Display display) {
		Shell shell = new Shell(display);
		
		FillLayout fillLayout = new FillLayout();
		customizeLayout(fillLayout);
		shell.setLayout(fillLayout);
		new Button(shell, SWT.PUSH).setText("B1");
		new Button(shell, SWT.PUSH).setText("Wide Button 2");
		new Button(shell, SWT.PUSH).setText("Button 3");
		shell.pack();
		shell.open();
	}

	public abstract void customizeLayout(FillLayout fillLayout);
}