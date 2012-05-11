package org.eclipse.articles.layouts;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class AbstractSampleImageBuilder {
	public static void takeSnapshot(String imageName, final Sample createWrapper) {
		final String fileName = imageName + ".jpg";
		Thread thread = new Thread() {
			public void run() {
				createWrapper.create();
			}
		};
		thread.start();
		final Display display = getDisplay(thread);
		display.syncExec(new Runnable() {
			public void run() {
				Shell shell = display.getActiveShell();
				createWrapper.shellOpen(shell);
				
				while (display.readAndDispatch());
	
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				while (display.readAndDispatch());
	
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				Rectangle bounds = shell.getBounds();
				bounds = shell.computeTrim(bounds.x-5, bounds.y-24, bounds.width+10, bounds.height+29);
				
				Image image = new Image(display, bounds.width, bounds.height);
				GC gc = new GC(display);
				gc.copyArea(image, bounds.x, bounds.y);
				
				ImageLoader loader = new ImageLoader();
				loader.data = new ImageData[] {image.getImageData()};
				loader.save(fileName, SWT.IMAGE_JPEG);
				
				gc.dispose();
				image.dispose();
				
				shell.close();
				display.dispose();
			}			
		});
	}

	private static Display getDisplay(Thread thread) {
		Display display = null;
		try {
			while ((display = Display.findDisplay(thread)) == null) 
				Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return display;
	}

	public AbstractSampleImageBuilder() {
		super();
	}
}

abstract class Sample {
	public void create() {
		Display display = new Display();
		create(display);
        while (!display.isDisposed()) {
            if (!display.readAndDispatch()) display.sleep();
        }
	}
	
	public void create(Display display) {}
	public void shellOpen(Shell shell) {}
}