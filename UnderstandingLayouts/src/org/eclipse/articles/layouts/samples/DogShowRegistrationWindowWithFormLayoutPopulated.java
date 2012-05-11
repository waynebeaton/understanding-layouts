package org.eclipse.articles.layouts.samples;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class DogShowRegistrationWindowWithFormLayoutPopulated extends DogShowRegistrationWindow {

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new DogShowRegistrationWindowWithFormLayoutPopulated().createShell(display);
		
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
		dogImage = new Image(display, DogShowRegistrationWindowWithFormLayoutPopulated.class.getResourceAsStream("biff.jpg"));
		categories.select(new int[] {0, 2, 6, 7, 8});
		
		ownerName.setText("Mary Smith");
		ownerPhone.setText("123-4567");
		
		return shell;
	}
}
