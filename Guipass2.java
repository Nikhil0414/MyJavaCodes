package GUI;
 
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Guipass2 {
 
    protected Shell shlLogin;
    private Text userNameTxt;
    private Text passwordTxt;
 
    private String userName = null;
    private String password = null;
 
    /**
     * Launch the application.
     * 
     * @param args
     */
    public static void main(String[] args) {
        try {
            Guipass2 window = new Guipass2();
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
        shlLogin.open();
        shlLogin.layout();
        while (!shlLogin.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
    }
 
    /**
     * Create contents of the window.
     */
    protected void createContents() {
        shlLogin = new Shell(SWT.CLOSE | SWT.TITLE | SWT.MIN);
        shlLogin.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
        shlLogin.setSize(909, 614);
        shlLogin.setText("Login");
 
        Label lblUsername = new Label(shlLogin, SWT.NONE);
        lblUsername.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
        lblUsername.setBounds(96, 257, 263, 63);
        lblUsername.setText("Username");
 
        Label lblPassword = new Label(shlLogin, SWT.NONE);
        lblPassword.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
        lblPassword.setBounds(96, 326, 263, 63);
        lblPassword.setText("Password");
 
        userNameTxt = new Text(shlLogin, SWT.BORDER);
        userNameTxt.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
        userNameTxt.setBounds(383, 254, 208, 63);
 
        passwordTxt = new Text(shlLogin, SWT.BORDER | SWT.PASSWORD);
        passwordTxt.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
        passwordTxt.setBounds(383, 323, 208, 63);
 
        Button btnLogin = new Button(shlLogin, SWT.NONE);
        btnLogin.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.BOLD));
        btnLogin.addSelectionListener(new SelectionAdapter() {
        	@Override
        	public void widgetSelected(SelectionEvent e) 
        	{
        		
        	}
        });
        btnLogin.setBounds(422, 411, 138, 72);
        btnLogin.setText("Login");
        
        CLabel lblNewLabel = new CLabel(shlLogin, SWT.NONE);
        lblNewLabel.setImage(SWTResourceManager.getImage(Guipass2.class, "/resources1/kali wallpaper.png"));
        lblNewLabel.setBounds(84, 10, 738, 216);
        lblNewLabel.setText("");
 
        btnLogin.addListener(SWT.Selection, new Listener() {
            public void handleEvent(Event event) {
 
                userName = userNameTxt.getText();
                password = passwordTxt.getText();
 
                if (userName == null || userName.isEmpty() || password == null || password.isEmpty()) {
                    String errorMsg = null;
                    MessageBox messageBox = new MessageBox(shlLogin, SWT.OK | SWT.ICON_ERROR);
 
                    messageBox.setText("Alert");
                    if (userName == null || userName.isEmpty()) {
                        errorMsg = "Please enter username";
                    } else if (password == null || password.isEmpty()) {
                        errorMsg = "Please enter password";
                    }
                    if (errorMsg != null) {
                        messageBox.setMessage(errorMsg);
                        messageBox.open();
                    }
                } else {
                    MessageBox messageBox = new MessageBox(shlLogin, SWT.OK | SWT.ICON_WORKING);
                    messageBox.setText("Info");
                    messageBox.setMessage("Valid");
                    messageBox.open();
                }
            }
        });
 
    }
}