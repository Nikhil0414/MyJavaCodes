package GUI;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.custom.CLabel;

import javax.swing.JOptionPane;

import org.eclipse.swt.SWT;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.widgets.Button;

public class Gui3 {

	protected Shell shell;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Gui3 window = new Gui3();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		shell.setSize(1046, 639);
		shell.setText("JAVA TERMINAL");
		
		text = new Text(shell, SWT.BORDER);
		text.addControlListener(new ControlAdapter() {
			
		});
		text.setBounds(40, 137, 760, 38);
		
		Label lblNewLabel_1 = new Label(shell, SWT.NONE);
		lblNewLabel_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_BLACK));
		lblNewLabel_1.setBounds(40, 85, 206, 31);
		lblNewLabel_1.setText(" ENTER THE COMMAND :");
		
		Button btnRun = new Button(shell, SWT.NONE);
		btnRun.addControlListener(new ControlAdapter() {
			@Override
			public void controlMoved(ControlEvent e) 
			{
				MessageBox messageBox = new MessageBox(shell, SWT.OK | SWT.ICON_WORKING);
                messageBox.setText("Info");
                messageBox.setMessage("Valid");
                messageBox.open();
			}
		});
		btnRun.setBounds(40, 196, 103, 33);
		btnRun.setText("RUN");

	}
}
