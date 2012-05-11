package org.eclipse.articles.layouts;

import org.eclipse.articles.layouts.samples.ColumnLayoutTest;
import org.eclipse.articles.layouts.samples.DogShowRegistrationWindowPopulated;
import org.eclipse.articles.layouts.samples.DogShowRegistrationWindowWithFormLayoutPopulated;
import org.eclipse.articles.layouts.samples.LayoutExample;
import org.eclipse.articles.layouts.samples.SampleGrabExcess;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


public class BuildImages extends AbstractSampleImageBuilder {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		createLayoutExamples();
		FillLayoutSampleImageBuilder.buildImages();
		RowLayoutSampleImageBuilder.buildImages();
		createGridLayoutSamples();
		createDogShowSamples();
		createFormLayoutSamples();
		createDogShowSamplesWithFormLayout();
		createCustomLayoutSamples();
	}

	private static void createLayoutExamples() {
		takeSnapshot("LayoutExample", new Sample() {
			public void create() {
				LayoutExample.main(new String[0]);
			}
		});
		
		takeSnapshot("LayoutExampleResized", new Sample() {
			public void create() {
				LayoutExample.main(new String[0]);
			}
			
			public void shellOpen(Shell shell) {
				shell.setBounds(10, 10, shell.getBounds().width * 3 /4, shell.getBounds().height * 3 /2);
			}
		});
	}
	
	private static void createGridLayoutSamples() {
		takeSnapshot("GridLayoutSampleNumColumns1", new GridLayoutSample() {
			public void customizeLayout(GridLayout gridLayout) {
				gridLayout.numColumns = 1;
			}
		});
		
		takeSnapshot("GridLayoutSampleNumColumns2", new GridLayoutSample() {
			public void customizeLayout(GridLayout gridLayout) {
				gridLayout.numColumns = 2;
			}
		});
		
		takeSnapshot("GridLayoutSampleNumColumns3", new GridLayoutSample() {
			public void customizeLayout(GridLayout gridLayout) {
				gridLayout.numColumns = 3;
			}
		});

		takeSnapshot("GridLayoutSampleEqualWidth", new GridLayoutSample() {
			public void customizeLayout(GridLayout gridLayout) {
				gridLayout.numColumns = 3;
				gridLayout.makeColumnsEqualWidth = true;
			}
		});

		takeSnapshot("GridDataSampleHorizontalFill", new GridLayoutSample() {
			public void customizeButtons(Button button1, Button button2,
					Button button3, Button button4, Button button5) {
				GridData gridData = new GridData();
				gridData.horizontalAlignment = GridData.FILL;
				gridData.grabExcessHorizontalSpace = true;
				button1.setLayoutData(gridData);
			}
		});
		
		takeSnapshot("GridDataSampleBeginning", new GridLayoutSample() {
			public void customizeButtons(Button button1, Button button2,
					Button button3, Button button4, Button button5) {
				GridData gridData = new GridData();
				gridData.horizontalAlignment = GridData.BEGINNING;
				button5.setLayoutData(gridData);
			}
		});
		
		takeSnapshot("GridDataSampleCenter", new GridLayoutSample() {
			public void customizeButtons(Button button1, Button button2,
					Button button3, Button button4, Button button5) {
				GridData gridData = new GridData();
				gridData.horizontalAlignment = GridData.CENTER;
				button5.setLayoutData(gridData);
			}
		});
		
		takeSnapshot("GridDataSampleEnd", new GridLayoutSample() {
			public void customizeButtons(Button button1, Button button2,
					Button button3, Button button4, Button button5) {
				GridData gridData = new GridData();
				gridData.horizontalAlignment = GridData.END;
				button5.setLayoutData(gridData);
			}
		});
		
		takeSnapshot("GridDataSampleFill", new GridLayoutSample() {
			public void customizeButtons(Button button1, Button button2,
					Button button3, Button button4, Button button5) {
				GridData gridData = new GridData();
				gridData.horizontalAlignment = GridData.FILL;
				button5.setLayoutData(gridData);
			}
		});
		
		takeSnapshot("GridDataSampleIndent", new GridLayoutSample() {
			public void customizeButtons(Button button1, Button button2,
					Button button3, Button button4, Button button5) {
				GridData gridData = new GridData();
				gridData.horizontalIndent = 4;
				button5.setLayoutData(gridData);
			}
		});
		
		takeSnapshot("GridDataSampleSpan01", new GridLayoutSample() {
			public void customizeButtons(Button button1, Button button2,
					Button button3, Button button4, Button button5) {
				GridData gridData = new GridData();
				gridData.horizontalAlignment = GridData.FILL;
				gridData.horizontalSpan = 2;
				button5.setLayoutData(gridData);
			}
		});
		
		takeSnapshot("GridDataSampleSpan02", new GridLayoutSample() {
			public void customizeButtons(Button button1, Button button2,
					Button button3, Button button4, Button button5) {
				GridData gridData = new GridData();
				gridData.horizontalAlignment = GridData.FILL;
				gridData.horizontalSpan = 2;
				button2.setLayoutData(gridData);
			}
		});
		
		takeSnapshot("GridDataSampleSpan03", new GridLayoutSample() {
			public void customizeButtons(Button button1, Button button2,
					Button button3, Button button4, Button button5) {
				GridData gridData = new GridData();
				gridData.verticalAlignment = GridData.FILL;
				gridData.verticalSpan = 2;
				button3.setLayoutData(gridData);
			}
		});
		
		takeSnapshot("GridDataSampleSpan03Resized", new GridLayoutSample() {
			public void customizeButtons(Button button1, Button button2,
					Button button3, Button button4, Button button5) {
				GridData gridData = new GridData();
				gridData.verticalAlignment = GridData.FILL;
				gridData.verticalSpan = 2;
				button3.setLayoutData(gridData);
			}
			public void shellOpen(Shell shell) {
				shell.setBounds(10, 10, shell.getBounds().width * 3 / 2, shell.getBounds().height * 3 / 2);
			}
		});
		
		takeSnapshot("GridDataSampleGrab01", new GridLayoutSample() {
			public void customizeButtons(Button button1, Button button2,
					Button button3, Button button4, Button button5) {
				GridData gridData = new GridData();
				gridData.verticalAlignment = GridData.FILL;
				button1.setLayoutData(gridData);
				gridData = new GridData();
				gridData.verticalAlignment = GridData.FILL;
				gridData.verticalSpan = 2;
				gridData.grabExcessVerticalSpace = true;
				gridData.horizontalAlignment = GridData.FILL;
				gridData.grabExcessHorizontalSpace = true;
				button3.setLayoutData(gridData);
				gridData = new GridData();
				gridData.verticalAlignment = GridData.FILL;
				button4.setLayoutData(gridData);
			}
		
			public void shellOpen(Shell shell) {
				shell.setBounds(10, 10, shell.getBounds().width * 3 / 2, shell.getBounds().height * 3 / 2);
			}
		});
		
		takeSnapshot("GridLayoutGrabExcess", new Sample() {
			public void create() {
				SampleGrabExcess.main(new String[0]);
			}
		});		

		takeSnapshot("GridLayoutGrabExcessResized", new Sample() {
			public void create() {
				SampleGrabExcess.main(new String[0]);
			}
			
			public void shellOpen(Shell shell) {
				shell.setBounds(10, 10, shell.getBounds().width * 3 / 2, shell.getBounds().height * 3 / 2);
			}
		});
		
		takeSnapshot("GridDataSampleSpan04", new GridLayoutSample() {
			public void customizeButtons(Button button1, Button button2,
					Button button3, Button button4, Button button5) {
				GridData gridData = new GridData();
				gridData.widthHint = 70;
				gridData.heightHint = 40;
				button5.setLayoutData(gridData);
			}
		});
	}

	private static void createDogShowSamples() {		
		takeSnapshot("DogShowBiff", new Sample() {
			public void create() {
				DogShowRegistrationWindowPopulated.main(new String[0]);
			}
		});	

		takeSnapshot("DogShowBiffResized", new Sample() {
			public void create() {
				DogShowRegistrationWindowPopulated.main(new String[0]);
			}
			
			public void shellOpen(Shell shell) {
				shell.setBounds(10, 10, shell.getBounds().width * 3 / 2, shell.getBounds().height * 3 / 2);
			}
		});	
	}
	

	private static void createFormLayoutSamples() {
		takeSnapshot("FormLayoutSample01", new FormLayoutSample1Button() {
			public void customize(FormLayout formLayout, Button button1) {
				FormData formData = new FormData();
				formData.top = new FormAttachment(0,60);
				formData.bottom = new FormAttachment(100,-5);
				formData.left = new FormAttachment(20,0);
				formData.right = new FormAttachment(100,-3);
				button1.setLayoutData(formData);
			}
		});

		takeSnapshot("FormLayoutSamplePosition50", new FormLayoutSample1Button() {
			public void customize(FormLayout formLayout, Button button1) {
				FormData formData = new FormData();
				formData.top = new FormAttachment(50,0);
				button1.setLayoutData(formData);
			}
		});

		takeSnapshot("FormLayoutSamplePosition50Resized", new FormLayoutSample1Button() {
			public void customize(FormLayout formLayout, Button button1) {
				FormData formData = new FormData();
				formData.top = new FormAttachment(50,0);
				button1.setLayoutData(formData);
			}
			public void shellOpen(Shell shell) {
				shell.setBounds(10, 10, shell.getBounds().width * 3 / 2, shell.getBounds().height * 3 / 2);
			}
		});
				
				
		takeSnapshot("FormLayoutSampleParent100", new FormLayoutSample1Button() {
			public void customize(FormLayout formLayout, Button button1) {
				FormData formData = new FormData();
				formData.right = new FormAttachment(100,-5);
				button1.setLayoutData(formData);
			}
		});
		
		takeSnapshot("FormLayoutSampleParent100Resized", new FormLayoutSample1Button() {
			public void customize(FormLayout formLayout, Button button1) {
				FormData formData = new FormData();
				formData.right = new FormAttachment(100,-5);
				button1.setLayoutData(formData);
			}
			
			public void shellOpen(Shell shell) {
				shell.setBounds(10, 10, shell.getBounds().width * 3 / 2, shell.getBounds().height * 3 / 2);
			}
		});
		
		takeSnapshot("FormLayoutSampleAttachWidget01", new FormLayoutSample2Buttons() {
			public void customize(FormLayout formLayout, Button button1, Button button2) {
				FormData formData = new FormData();
				formData.top = new FormAttachment(20,0);
				button1.setLayoutData(formData);

				FormData formData2 = new FormData();
				formData2.top = new FormAttachment(button1,10);
				button2.setLayoutData(formData2);
			}
		});
		
		takeSnapshot("FormLayoutSampleAttachWidget01Resized", new FormLayoutSample2Buttons() {
			public void customize(FormLayout formLayout, Button button1, Button button2) {
				FormData formData = new FormData();
				formData.top = new FormAttachment(20,0);
				button1.setLayoutData(formData);

				FormData formData2 = new FormData();
				formData2.top = new FormAttachment(button1,10);
				button2.setLayoutData(formData2);
			}
			
			public void shellOpen(Shell shell) {
				shell.setBounds(10, 10, shell.getBounds().width * 3 / 2, shell.getBounds().height * 3 / 2);
			}
		});	
		
		takeSnapshot("FormLayoutSampleAttachWidget02", new FormLayoutSample2Buttons() {
			public void customize(FormLayout formLayout, Button button1, Button button2) {
				FormData formData = new FormData(50,50);
				formData.top = new FormAttachment(20,0);
				button1.setLayoutData(formData);

				FormData formData2 = new FormData();
				formData2.left = new FormAttachment(button1,5);
				formData2.top = new FormAttachment(button1,0,SWT.TOP); 
				button2.setLayoutData(formData2);
			}
		});
		
		takeSnapshot("FormLayoutSampleAttachWidget03", new FormLayoutSample2Buttons() {
			public void customize(FormLayout formLayout, Button button1, Button button2) {
				FormData formData1 = new FormData (50,50);
				button1.setLayoutData(formData1);

				FormData formData2 = new FormData ();
				formData2.left = new FormAttachment (button1,5);
				formData2.top = new FormAttachment (button1,0,SWT.CENTER);
				button2.setLayoutData(formData2);
			}
		});
		
		takeSnapshot("FormLayoutSample5Buttons01Resized", new FormLayoutSample5Buttons() {
			public void customize(FormLayout formLayout, Button button1, Button button2, Button button3, Button button4, Button button5) {
				FormData data1 = new FormData();
				data1.left = new FormAttachment(0,5);
				data1.right = new FormAttachment(25,0);
				button1.setLayoutData(data1);

				FormData data2 = new FormData();
				data2.left = new FormAttachment(button1,5);
				data2.right = new FormAttachment(100,-5);
				button2.setLayoutData(data2);

				FormData data3 = new FormData(60,60);
				data3.top = new FormAttachment(button1,5);
				data3.left = new FormAttachment(50,-30);
				data3.right = new FormAttachment(50,30);
				button3.setLayoutData(data3);

				FormData data4 = new FormData();
				data4.top = new FormAttachment(button3,5);
				data4.bottom = new FormAttachment(100,-5);
				data4.left = new FormAttachment(25,0);
				button4.setLayoutData(data4);

				FormData data5 = new FormData();
				data5.bottom = new FormAttachment(100,-5);
				data5.left = new FormAttachment(button4,5);
				button5.setLayoutData(data5);
			}
			
			public void shellOpen(Shell shell) {
				shell.setBounds(10, 10, shell.getBounds().width * 3 / 2, shell.getBounds().height * 3 / 2);
			}
		});
		
		takeSnapshot("FormLayoutSample5Buttons01", new FormLayoutSample5Buttons() {
			public void customize(FormLayout formLayout, Button button1, Button button2, Button button3, Button button4, Button button5) {
				FormData data1 = new FormData();
				data1.left = new FormAttachment(0,5);
				data1.right = new FormAttachment(25,0);
				button1.setLayoutData(data1);

				FormData data2 = new FormData();
				data2.left = new FormAttachment(button1,5);
				data2.right = new FormAttachment(100,-5);
				button2.setLayoutData(data2);

				FormData data3 = new FormData(60,60);
				data3.top = new FormAttachment(button1,5);
				data3.left = new FormAttachment(50,-30);
				data3.right = new FormAttachment(50,30);
				button3.setLayoutData(data3);

				FormData data4 = new FormData();
				data4.top = new FormAttachment(button3,5);
				data4.bottom = new FormAttachment(100,-5);
				data4.left = new FormAttachment(25,0);
				button4.setLayoutData(data4);

				FormData data5 = new FormData();
				data5.bottom = new FormAttachment(100,-5);
				data5.left = new FormAttachment(button4,5);
				button5.setLayoutData(data5);
			}
		});
	}
	
	private static void createDogShowSamplesWithFormLayout() {		
		takeSnapshot("DogShowBiffWithFormLayout", new Sample() {
			public void create() {
				DogShowRegistrationWindowWithFormLayoutPopulated.main(new String[0]);
			}
		});	

		takeSnapshot("DogShowBiffWithFormLayoutResized", new Sample() {
			public void create() {
				DogShowRegistrationWindowWithFormLayoutPopulated.main(new String[0]);
			}
			
			public void shellOpen(Shell shell) {
				shell.setBounds(10, 10, shell.getBounds().width * 3 / 2, shell.getBounds().height * 3 / 2);
			}
		});	
	}

	private static void createCustomLayoutSamples() {
		takeSnapshot("CustomLayout", new Sample() {
			public void create() {
				ColumnLayoutTest.main(new String[0]);
			}
		});	

		takeSnapshot("CustomLayoutResized", new Sample() {
			public void create() {
				ColumnLayoutTest.main(new String[0]);
			}
			
			public void shellOpen(Shell shell) {
				((Button)shell.getChildren()[2]).setText("Extreemely Wide Button 3");
				shell.layout();
				shell.pack();
			}
		});	
	}
}

abstract class GridLayoutSample extends Sample {
	public void create(Display display) {
		Shell shell = new Shell(display);
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		customizeLayout(gridLayout);
		
		shell.setLayout(gridLayout);
		
		Button button1 = new Button(shell, SWT.PUSH);
		button1.setText("B1");
		
		Button button2 = new Button(shell, SWT.PUSH);
		button2.setText("Wide Button 2");

		Button button3 = new Button(shell, SWT.PUSH);
		button3.setText("Button 3");
		
		Button button4 = new Button(shell, SWT.PUSH);
		button4.setText("B4");
		
		Button button5 = new Button(shell, SWT.PUSH);
		button5.setText("Button 5");
		
		customizeButtons(button1, button2, button3, button4, button5);
		
		shell.pack();
		shell.open();
	}

	public void customizeLayout(GridLayout gridLayout) {}

	public void customizeButtons(Button button1, Button button2,
			Button button3, Button button4, Button button5) {}
}

abstract class FormLayoutSample1Button extends Sample {
	public void create(Display display) {
		Shell shell = new Shell (display);
		FormLayout layout= new FormLayout ();
		layout.marginHeight = 5;
		layout.marginWidth = 5;
		shell.setLayout(layout);
		
		Button button1 = new Button(shell, SWT.PUSH);
		button1.setText("B1");
		button1.setLayoutData(new FormData());
		
		customize(layout, button1);
		
		shell.pack();
		shell.open();
	}

	public void customize(FormLayout formLayout, Button button1) {}
}

abstract class FormLayoutSample2Buttons extends Sample {
	public void create(Display display) {
		Shell shell = new Shell (display);
		FormLayout layout= new FormLayout ();
		layout.marginHeight = 5;
		layout.marginWidth = 5;
		shell.setLayout(layout);
		
		Button button1 = new Button(shell, SWT.PUSH);
		button1.setText("B1");
		button1.setLayoutData(new FormData());

		Button button2 = new Button(shell, SWT.PUSH);
		button2.setText("Wide Button 2");
		button2.setLayoutData(new FormData());
		
		customize(layout, button1, button2);
		
		shell.pack();
		shell.open();
	}

	public void customize(FormLayout formLayout, Button button1, Button button2) {}
}

abstract class FormLayoutSample5Buttons extends Sample {
	public void create(Display display) {
		Shell shell = new Shell (display);
		FormLayout layout= new FormLayout ();
		layout.marginHeight = 5;
		layout.marginWidth = 5;
		shell.setLayout(layout);
		
		Button button1 = new Button(shell, SWT.PUSH);
		button1.setText("B1");
		button1.setLayoutData(new FormData());

		Button button2 = new Button(shell, SWT.PUSH);
		button2.setText("Wide Button 2");
		button2.setLayoutData(new FormData());
		
		Button button3 = new Button(shell, SWT.PUSH);
		button3.setText("Button 3");
		button3.setLayoutData(new FormData());

		Button button4 = new Button(shell, SWT.PUSH);
		button4.setText("B4");
		button4.setLayoutData(new FormData());

		Button button5 = new Button(shell, SWT.PUSH);
		button5.setText("Button 5");
		button5.setLayoutData(new FormData());
		
		customize(layout, button1, button2, button3, button4, button5);
		
		shell.pack();
		shell.open();
	}

	public void customize(FormLayout formLayout, Button button1, Button button2, Button button3, Button button4, Button button5) {}
}