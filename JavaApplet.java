import java.applet.*;
import java.awt.*;

public class JavaApplet extends Applet 
{
	public void init()
	{
		setBackground(Color.green);
	}
	public void paint(Graphics g)
	{
		g.drawString("Hello", 100, 100);
		g.drawRect(150, 150, 150, 50);
	}
}