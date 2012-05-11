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
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


public class DogShowRegistrationWindowPopulated extends DogShowRegistrationWindow {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new DogShowRegistrationWindowPopulated().createShell(display);
		
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
	}
	
	public Shell createShell(Display display) {
		Shell shell = super.createShell(display);
		dogName.setText("Bifford");
		dogBreed.select(4);
		dogImage = new Image(display, DogShowRegistrationWindowPopulated.class.getResourceAsStream("biff.jpg"));
		categories.select(new int[] {0, 2, 6, 7, 8});
		
		ownerName.setText("Mary Smith");
		ownerPhone.setText("123-4567");
		
		return shell;
	}
}
