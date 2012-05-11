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

import org.eclipse.articles.layouts.samples.RowDataExample;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;


public class RowLayoutSampleImageBuilder extends AbstractSampleImageBuilder {
	public static void main(String[] args) {
		RowLayoutSampleImageBuilder.buildImages();
	}

	public static void buildImages() {
		takeSnapshot("RowLayoutMargins", new Sample() {
			public void create(final Display display) {
				PaintListener lineDrawer = new PaintListener() {
					public void paintControl(PaintEvent event) {
						Label label = (Label)event.getSource();
						event.gc.setForeground(display.getSystemColor(SWT.COLOR_BLACK));
						int y = label.getBounds().height / 2;
						//event.gc.drawLine(0, 0, 100, 100);
						event.gc.drawLine(0, y, label.getBounds().width, y);
					}					
				};
				
				final Shell shell = new Shell(display);
				GridLayout gridLayout = new GridLayout(7, true);
				gridLayout.horizontalSpacing = 0;
				gridLayout.verticalSpacing = 0;
				gridLayout.marginTop = 0;
				gridLayout.marginLeft = 0;
				gridLayout.marginBottom = 0;
				gridLayout.marginRight = 0;
				gridLayout.marginHeight = 0;
				gridLayout.marginWidth = 0;
				shell.setLayout(gridLayout);

				GridData data;
				
				Label topLineLeft = new Label(shell, SWT.NONE);
				topLineLeft.addPaintListener(lineDrawer);
				data = new GridData();
				data.horizontalSpan = 3;
				data.horizontalAlignment = SWT.FILL;
				data.verticalAlignment = SWT.FILL;
				data.grabExcessHorizontalSpace = true;
				data.grabExcessVerticalSpace = true;
				topLineLeft.setLayoutData(data);
				
				Label top = new Label(shell, SWT.NONE);
				top.setText("marginTop");
				top.setAlignment(SWT.CENTER);
				data = new GridData();
				data.horizontalSpan = 1;
				data.horizontalAlignment = SWT.FILL;
				data.verticalAlignment = SWT.CENTER;
				data.grabExcessHorizontalSpace = true;
				data.grabExcessVerticalSpace = true;
				top.setLayoutData(data);

				Label topLineRight = new Label(shell, SWT.NONE);
				topLineRight.addPaintListener(lineDrawer);
				data = new GridData();
				data.horizontalSpan = 3;
				data.horizontalAlignment = SWT.FILL;
				data.verticalAlignment = SWT.FILL;
				data.grabExcessHorizontalSpace = true;
				data.grabExcessVerticalSpace = true;
				topLineRight.setLayoutData(data);
				
				Label left = new Label(shell, SWT.NONE);
				left.setText("marginLeft");
				left.setAlignment(SWT.CENTER);
				data = new GridData();
				data.horizontalAlignment = SWT.FILL;
				data.verticalAlignment = SWT.CENTER;
				data.grabExcessHorizontalSpace = true;
				data.grabExcessVerticalSpace = true;
				left.setLayoutData(data);

				Button button1 = new Button(shell, SWT.PUSH);
				button1.setText("Button 1");
				data = new GridData();
				data.horizontalAlignment = SWT.FILL;
				data.verticalAlignment = SWT.FILL;
				data.grabExcessHorizontalSpace = true;
				data.grabExcessVerticalSpace = true;
				button1.setLayoutData(data);
				
				Label spacing1 = new Label(shell, SWT.NONE);
				spacing1.setText("spacing");
				spacing1.setAlignment(SWT.CENTER);
				data = new GridData();
				data.horizontalAlignment = SWT.FILL;
				data.verticalAlignment = SWT.CENTER;
				data.grabExcessHorizontalSpace = true;
				data.grabExcessVerticalSpace = true;
				spacing1.setLayoutData(data);
				
				Button button2 = new Button(shell, SWT.PUSH);
				button2.setText("Button 2");
				data = new GridData();
				data.horizontalAlignment = SWT.FILL;
				data.verticalAlignment = SWT.FILL;
				data.grabExcessHorizontalSpace = true;
				data.grabExcessVerticalSpace = true;
				button2.setLayoutData(data);
				
				Label spacing2 = new Label(shell, SWT.NONE);
				spacing2.setText("spacing");
				spacing2.setAlignment(SWT.CENTER);
				data = new GridData();
				data.horizontalAlignment = SWT.FILL;
				data.verticalAlignment = SWT.CENTER;
				data.grabExcessHorizontalSpace = true;
				data.grabExcessVerticalSpace = true;
				spacing2.setLayoutData(data);
				
				Button button3 = new Button(shell, SWT.PUSH);
				button3.setText("Button 3");
				data = new GridData();
				data.horizontalAlignment = SWT.FILL;
				data.verticalAlignment = SWT.FILL;
				data.grabExcessHorizontalSpace = true;
				data.grabExcessVerticalSpace = true;
				button3.setLayoutData(data);
				
				Label right = new Label(shell, SWT.NONE);
				right.setText("marginRight");
				right.setAlignment(SWT.CENTER);
				data = new GridData();
				data.horizontalAlignment = SWT.FILL;
				data.verticalAlignment = SWT.CENTER;
				data.grabExcessHorizontalSpace = true;
				data.grabExcessVerticalSpace = true;
				right.setLayoutData(data);
								
				Label bottomLineLeft = new Label(shell, SWT.NONE);
				bottomLineLeft.addPaintListener(lineDrawer);
				data = new GridData();
				data.horizontalSpan = 3;
				data.horizontalAlignment = SWT.FILL;
				data.verticalAlignment = SWT.FILL;
				data.grabExcessHorizontalSpace = true;
				data.grabExcessVerticalSpace = true;
				bottomLineLeft.setLayoutData(data);
				
				Label bottom = new Label(shell, SWT.NONE);
				//bottom.setBackground(highlight);
				bottom.setText("marginTop");
				bottom.setAlignment(SWT.CENTER);
				data = new GridData();
				data.horizontalSpan = 1;
				data.horizontalAlignment = SWT.FILL;
				data.verticalAlignment = SWT.FILL;
				data.grabExcessHorizontalSpace = true;
				data.grabExcessVerticalSpace = true;
				bottom.setLayoutData(data);

				Label bottomLineRight = new Label(shell, SWT.NONE);
				bottomLineRight.addPaintListener(lineDrawer);
				data = new GridData();
				data.horizontalSpan = 3;
				data.horizontalAlignment = SWT.FILL;
				data.verticalAlignment = SWT.FILL;
				data.grabExcessHorizontalSpace = true;
				data.grabExcessVerticalSpace = true;
				bottomLineRight.setLayoutData(data);
				
				shell.pack();
				shell.open();
			}
		});
		
		takeSnapshot("RowLayoutSample01", new RowLayoutSample() {
			public void customize(RowLayout rowLayout) {
				rowLayout.wrap = true;
				rowLayout.pack = true;
				rowLayout.justify = false;
				rowLayout.type = SWT.HORIZONTAL;
			}
		});
		
		takeSnapshot("RowLayoutSample01Resized", new RowLayoutSample() {
			public void customize(RowLayout rowLayout) {
				rowLayout.wrap = true;
				rowLayout.pack = true;
				rowLayout.justify = false;
				rowLayout.type = SWT.HORIZONTAL;
			}
			
			public void shellOpen(Shell shell) {				
				shell.setBounds(10, 10, shell.getBounds().width * 3 / 2, shell.getBounds().height);
			}
		});

		takeSnapshot("RowLayoutSample01ResizedNarrower", new RowLayoutSample() {
			public void customize(RowLayout rowLayout) {
				rowLayout.wrap = true;
				rowLayout.pack = true;
				rowLayout.justify = false;
				rowLayout.type = SWT.HORIZONTAL;
			}
			
			public void shellOpen(Shell shell) {				
				shell.setBounds(10, 10, shell.getBounds().width * 3 / 4, shell.getBounds().height * 3 / 2);
			}
		});
		
		takeSnapshot("RowLayoutSample02", new RowLayoutSample() {
			public void customize(RowLayout rowLayout) {
				rowLayout.wrap = false;
			}
		});

		takeSnapshot("RowLayoutSample02Resized", new RowLayoutSample() {
			public void customize(RowLayout rowLayout) {
				rowLayout.wrap = false;
			}
			
			public void shellOpen(Shell shell) {
				shell.setBounds(10, 10, shell.getBounds().width * 3 / 4, shell.getBounds().height);
			}
		});
		
		takeSnapshot("RowLayoutSample03", new RowLayoutSample() {
			public void customize(RowLayout rowLayout) {
				rowLayout.pack = false;
			}
		});

		takeSnapshot("RowLayoutSample03Resized", new RowLayoutSample() {
			public void customize(RowLayout rowLayout) {
				rowLayout.pack = false;
			}
			
			public void shellOpen(Shell shell) {
				shell.setBounds(10, 10, shell.getBounds().width * 3 / 4, shell.getBounds().height * 2);
			}
		});

		takeSnapshot("RowLayoutSample04", new RowLayoutSample() {
			public void customize(RowLayout rowLayout) {
				rowLayout.justify = true;
			}
		});

		takeSnapshot("RowLayoutSample04Resized", new RowLayoutSample() {
			public void customize(RowLayout rowLayout) {
				rowLayout.justify = true;
			}
			
			public void shellOpen(Shell shell) {
				shell.setBounds(10, 10, shell.getBounds().width * 3 / 2, shell.getBounds().height);
			}
		});

		takeSnapshot("RowLayoutSample05", new RowLayoutSample() {
			public void customize(RowLayout rowLayout) {
				rowLayout.type = SWT.VERTICAL;
			}
		});

		takeSnapshot("RowLayoutSample05Resized", new RowLayoutSample() {
			public void customize(RowLayout rowLayout) {
				rowLayout.type = SWT.VERTICAL;
			}
			
			public void shellOpen(Shell shell) {
				shell.setBounds(10, 10, shell.getBounds().width * 3 / 2, shell.getBounds().height * 3 /2);
			}
		});
		takeSnapshot("RowDataExample", new Sample() {
			public void create() {
				RowDataExample.main(new String[0]);
			}
		});
	}
}

abstract class RowLayoutSample extends Sample {
	public void create(Display display) {
		Shell shell = new Shell(display);

		RowLayout rowLayout = new RowLayout();
		// Article snippet starts here
		customize(rowLayout);
		// Article snippet stops here
		shell.setLayout(rowLayout);
		new Button(shell, SWT.PUSH).setText("B1");
		new Button(shell, SWT.PUSH).setText("Wide Button 2");
		new Button(shell, SWT.PUSH).setText("Button 3");
		shell.pack();
		
		shell.open();
	}

	public abstract void customize(RowLayout rowLayout);
}